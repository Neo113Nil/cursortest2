package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Thumb;
import com.vk.music.snippet.ui.presentation.base.view.SnippetTrackItemView$Companion$ButtonAddAction;
import com.vk.music.view.MusicRoundPlayView;
import com.vk.music.view.ThumbsImageView;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.e3m;

/* compiled from: SnippetTrackItemView.kt */
/* loaded from: classes3.dex */
public final class zck0 extends ConstraintLayout {
    public final ImageView A;
    public final Object B;
    public final ThumbsImageView t;
    public final MusicRoundPlayView u;
    public final TextView v;
    public final TextView w;
    public final ImageView x;
    public final ImageView y;
    public final ConstraintLayout z;

    /* compiled from: SnippetTrackItemView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SnippetTrackItemView$Companion$ButtonAddAction.values().length];
            try {
                iArr[SnippetTrackItemView$Companion$ButtonAddAction.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SnippetTrackItemView$Companion$ButtonAddAction.REMOVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public zck0(Context context) {
        super(context, null);
        this.B = msy.a(LazyThreadSafetyMode.NONE, new x1c0(7));
        LayoutInflater.from(context).inflate(R.layout.music_snippet_playlist_track_item, (ViewGroup) this, true);
        this.t = (ThumbsImageView) findViewById(R.id.snippet_track_thumb);
        this.u = (MusicRoundPlayView) findViewById(R.id.play_view);
        this.v = (TextView) findViewById(R.id.track_name);
        this.w = (TextView) findViewById(R.id.track_artist);
        this.y = (ImageView) findViewById(R.id.track_arrow);
        this.z = (ConstraintLayout) findViewById(R.id.track_area);
        this.x = (ImageView) findViewById(R.id.add_track);
        this.A = (ImageView) findViewById(R.id.image_explicit);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final a630 getTrackModel() {
        return (a630) this.B.getValue();
    }

    private final void setAddButtonAction(SnippetTrackItemView$Companion$ButtonAddAction snippetTrackItemView$Companion$ButtonAddAction) {
        int i = a.$EnumSwitchMapping$0[snippetTrackItemView$Companion$ButtonAddAction.ordinal()];
        ImageView imageView = this.x;
        if (i == 1) {
            imageView.setContentDescription(getContext().getString(R.string.music_talkback_add_to_my_music));
            imageView.setImageResource(R.drawable.vk_icon_add_16);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            imageView.setContentDescription(getContext().getString(R.string.music_remove_from_my_music));
            imageView.setImageResource(R.drawable.vk_icon_done_16);
        }
    }

    public final void P4(MusicTrack musicTrack, ku1 ku1Var) {
        SnippetTrackItemView$Companion$ButtonAddAction snippetTrackItemView$Companion$ButtonAddAction = getTrackModel().i(musicTrack) ? SnippetTrackItemView$Companion$ButtonAddAction.ADD : getTrackModel().i0(musicTrack) ? SnippetTrackItemView$Companion$ButtonAddAction.REMOVE : SnippetTrackItemView$Companion$ButtonAddAction.ADD;
        setAddButtonAction(snippetTrackItemView$Companion$ButtonAddAction);
        bwt0.i0(this.x, new a5(22, ku1Var, snippetTrackItemView$Companion$ButtonAddAction));
    }

    public final void setActionsAlpha(float f) {
        this.u.setAlpha(f);
        this.x.setAlpha(f);
        this.v.setAlpha(f);
        this.w.setAlpha(0.72f * f);
        this.y.setAlpha(f * 0.48f);
    }

    public final void setPlayViewState(boolean z) {
        MusicRoundPlayView musicRoundPlayView = this.u;
        if (z) {
            musicRoundPlayView.b(MusicRoundPlayView.State.PLAY);
        } else {
            musicRoundPlayView.b(MusicRoundPlayView.State.PAUSE);
        }
    }

    public final void setTogglePlayPauseListener(gzs<s3q0> gzsVar) {
        bwt0.i0(this.u, new whg0(gzsVar, 6));
    }

    public final void setTrackClickListener(gzs<s3q0> gzsVar) {
        bwt0.i0(this.z, new n660(1, gzsVar));
    }

    public final void setTrackInfo(MusicTrack musicTrack) {
        this.v.setText(musicTrack.d);
        this.w.setText(ob50.a(musicTrack));
        Thumb Jb = musicTrack.Jb();
        ThumbsImageView thumbsImageView = this.t;
        thumbsImageView.setThumb(Jb);
        Context context = thumbsImageView.getContext();
        e3m.a aVar = e3m.a;
        thumbsImageView.setOverlayImage(m33.a(R.drawable.player_ad_gradient_16dp, context));
        Context context2 = getContext();
        e3m.a aVar2 = e3m.a;
        Drawable a2 = m33.a(R.drawable.vk_icon_error_circle_fill_overlay_12, context2);
        ImageView imageView = this.A;
        imageView.setImageDrawable(a2);
        imageView.setImageTintList(null);
        imageView.setAlpha(1.0f);
        bwt0.p0(imageView, musicTrack.s);
    }
}
