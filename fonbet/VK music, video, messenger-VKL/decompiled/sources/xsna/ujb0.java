package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.music.Episode;
import com.vk.dto.music.MusicTrack;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlaySource;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vk.music.view.ThumbsImageView;
import com.vkontakte.android.R;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import xsna.tlo0;

/* compiled from: PodcastViewHolder.kt */
/* loaded from: classes3.dex */
public final class ujb0 extends se50<MusicTrack> {
    public final boolean n;
    public final u2b0 o;
    public final String p;
    public final VkCell q;
    public final Object r;
    public final Object s;
    public int t;
    public String u;
    public final bpn0 v;

    /* compiled from: PodcastViewHolder.kt */
    public static final class a implements VkCell.f {
    }

    public ujb0(ViewGroup viewGroup, boolean z, u2b0 u2b0Var, String str) {
        super(tf3.b(viewGroup, R.layout.podcast_item_playlist, viewGroup, false));
        ThumbsImageView thumbsImageView;
        this.n = z;
        this.o = u2b0Var;
        this.p = str;
        VkCell vkCell = (VkCell) this.itemView;
        this.q = vkCell;
        su80 su80Var = new su80(this, 6);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Lazy a2 = msy.a(lazyThreadSafetyMode, su80Var);
        this.r = a2;
        this.s = msy.a(lazyThreadSafetyMode, new wm80(this, 5));
        this.t = R.string.podcasts_item_action_listen;
        this.u = "";
        this.v = new bpn0(new c950(this, 14));
        vkCell.c(new pey(16), new yx5(11));
        vkCell.setRightExtraViewController(new b());
        vkCell.setLeft(VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.e(new a(), new Size(cn70.b(72), cn70.b(72)))));
        vkCell.setRight(VkCell.Right.c.a(VkCell.Right.Companion, null, new VkCell.Right.e.d(new a(), new Size(cn70.b(38), cn70.b(48))), null, null, 29));
        Drawable a3 = dhr0.t.a(R.drawable.podcast_placeholder_72);
        if (a3 == null || (thumbsImageView = (ThumbsImageView) a2.getValue()) == null) {
            return;
        }
        thumbsImageView.setEmptyPlaceholder(a3);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006c  */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.se50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b6(MusicTrack musicTrack) {
        long j;
        long j2;
        boolean y0;
        int i;
        ThumbsImageView thumbsImageView;
        ThumbsImageView thumbsImageView2;
        View view;
        MusicTrack musicTrack2 = musicTrack;
        boolean Qb = musicTrack2.Qb();
        u2b0 u2b0Var = this.o;
        if (Qb) {
            com.vk.music.player.f H = u2b0Var.H();
            if (epx.f(H != null ? H.f() : null, musicTrack2)) {
                if (musicTrack2.f == 0) {
                    com.vk.music.player.f H2 = u2b0Var.H();
                    musicTrack2.f = H2 != null ? H2.e() / 1000 : 0;
                }
                j = musicTrack2.f * 1000;
                com.vk.music.player.f H3 = u2b0Var.H();
                if (H3 != null) {
                    j2 = H3.h();
                    this.u = j2 <= 0 ? pq3.c(this.itemView.getContext(), j, j2).toString().toLowerCase(Locale.getDefault()) : f870.q(j / 1000);
                    y0 = u2b0Var.y0(musicTrack2);
                    i = R.string.podcasts_item_action_listen;
                    if (y0 && u2b0Var.h()) {
                        i = R.string.podcasts_item_state_playing;
                    }
                    this.t = i;
                    ?? r0 = this.r;
                    thumbsImageView = (ThumbsImageView) r0.getValue();
                    if (thumbsImageView != null) {
                        thumbsImageView.setThumb(musicTrack2.Jb());
                    }
                    thumbsImageView2 = (ThumbsImageView) r0.getValue();
                    if (thumbsImageView2 != null) {
                        thumbsImageView2.setAlpha(!musicTrack2.B() ? 1.0f : 0.64f);
                    }
                    view = (View) this.s.getValue();
                    if (view != null) {
                        view.setContentDescription(this.itemView.getContext().getString(R.string.music_talkback_more));
                    }
                    l6(musicTrack2);
                }
                j2 = 0;
                this.u = j2 <= 0 ? pq3.c(this.itemView.getContext(), j, j2).toString().toLowerCase(Locale.getDefault()) : f870.q(j / 1000);
                y0 = u2b0Var.y0(musicTrack2);
                i = R.string.podcasts_item_action_listen;
                if (y0) {
                    i = R.string.podcasts_item_state_playing;
                }
                this.t = i;
                ?? r02 = this.r;
                thumbsImageView = (ThumbsImageView) r02.getValue();
                if (thumbsImageView != null) {
                }
                thumbsImageView2 = (ThumbsImageView) r02.getValue();
                if (thumbsImageView2 != null) {
                }
                view = (View) this.s.getValue();
                if (view != null) {
                }
                l6(musicTrack2);
            }
        }
        j = musicTrack2.f * 1000;
        Episode episode = musicTrack2.w;
        if (episode != null) {
            j2 = episode.d;
            this.u = j2 <= 0 ? pq3.c(this.itemView.getContext(), j, j2).toString().toLowerCase(Locale.getDefault()) : f870.q(j / 1000);
            y0 = u2b0Var.y0(musicTrack2);
            i = R.string.podcasts_item_action_listen;
            if (y0) {
            }
            this.t = i;
            ?? r022 = this.r;
            thumbsImageView = (ThumbsImageView) r022.getValue();
            if (thumbsImageView != null) {
            }
            thumbsImageView2 = (ThumbsImageView) r022.getValue();
            if (thumbsImageView2 != null) {
            }
            view = (View) this.s.getValue();
            if (view != null) {
            }
            l6(musicTrack2);
        }
        j2 = 0;
        this.u = j2 <= 0 ? pq3.c(this.itemView.getContext(), j, j2).toString().toLowerCase(Locale.getDefault()) : f870.q(j / 1000);
        y0 = u2b0Var.y0(musicTrack2);
        i = R.string.podcasts_item_action_listen;
        if (y0) {
        }
        this.t = i;
        ?? r0222 = this.r;
        thumbsImageView = (ThumbsImageView) r0222.getValue();
        if (thumbsImageView != null) {
        }
        thumbsImageView2 = (ThumbsImageView) r0222.getValue();
        if (thumbsImageView2 != null) {
        }
        view = (View) this.s.getValue();
        if (view != null) {
        }
        l6(musicTrack2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.se50
    public final void i6() {
        MusicTrack musicTrack = (MusicTrack) this.l;
        if (musicTrack == null) {
            return;
        }
        u2b0 u2b0Var = this.o;
        boolean y0 = u2b0Var.y0(musicTrack);
        int i = R.string.podcasts_item_action_listen;
        if (y0 && u2b0Var.h()) {
            i = R.string.podcasts_item_state_playing;
        }
        this.t = i;
        l6(musicTrack);
    }

    public final void l6(MusicTrack musicTrack) {
        Pair pair;
        if (this.n) {
            String str = musicTrack.h;
            if (str == null) {
                str = "";
            }
            tlo0.a aVar = tlo0.Companion;
            if (str.length() > 0 && this.u.length() > 0) {
                StringBuilder b2 = ho8.b(str, " · ");
                b2.append((Object) this.u);
                str = b2.toString();
            } else if (str.length() <= 0) {
                str = this.u;
            }
            pair = new Pair(new VkCell.Middle.d(oq.d(aVar, str), new xk(25, this, musicTrack), 1, TextUtils.TruncateAt.END, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 48), null);
        } else {
            pair = new Pair(this.u.length() > 0 ? new VkCell.Middle.d(oq.d(tlo0.Companion, this.u), (gzs) null, 1, TextUtils.TruncateAt.END, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 50) : null, new VkCell.Middle.c(tq.h(tlo0.Companion, this.t), new kg(20, this, musicTrack), 0, 12));
        }
        VkCell.Middle.d dVar = (VkCell.Middle.d) pair.d();
        VkCell.Middle.c cVar = (VkCell.Middle.c) pair.g();
        VkCell.Middle.a aVar2 = VkCell.Middle.Companion;
        tlo0.a aVar3 = tlo0.Companion;
        String str2 = musicTrack.d;
        VkCell.Middle.b a2 = VkCell.Middle.a.a(aVar2, new VkCell.Middle.e(oq.d(aVar3, str2 != null ? str2 : ""), 2, TextUtils.TruncateAt.END, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50), dVar, cVar, 8);
        VkCell vkCell = this.q;
        vkCell.setMiddle(a2);
        vkCell.setAlpha(!musicTrack.B() ? 1.0f : 0.64f);
        AppCompatTextView appCompatTextView = (AppCompatTextView) vkCell.findViewById(R.id.ds_internal_cell_middle_extra_subtitle);
        if (appCompatTextView != null) {
            jno0.c(appCompatTextView, R.attr.vk_ui_text_accent);
        }
    }

    public final void m6(MusicTrack musicTrack) {
        int i;
        ShuffleMode shuffleMode = ShuffleMode.SHUFFLE_OFF;
        MusicPlaybackLaunchContext Cb = ((MusicPlaybackLaunchContext) this.v.getValue()).Cb(jnj.a(musicTrack.V));
        Episode episode = musicTrack.w;
        int i2 = 0;
        if (episode != null && (i = (int) episode.d) >= 0) {
            i2 = i;
        }
        this.o.N0(new lqk0((StartPlaySource) null, musicTrack, (List) null, Cb, i2, shuffleMode, PlayRequestTrigger.FAST_PLAY_TRACK_LIST, (AdsAudioPixelsContainer) null, 0L, 789));
    }

    /* compiled from: PodcastViewHolder.kt */
    public static final class b implements VkCell.e {
        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new a(context);
        }

        /* compiled from: PodcastViewHolder.kt */
        public static final class a implements VkCell.d {
            public final LinearLayout a;

            public a(Context context) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setGravity(16);
                ImageView imageView = new ImageView(context);
                imageView.setId(R.id.audio_menu);
                imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                imageView.setImageResource(R.drawable.vk_icon_more_vertical_16);
                gpo0.f(imageView, Integer.valueOf(R.attr.vk_ui_icon_secondary));
                linearLayout.addView(imageView, new LinearLayout.LayoutParams(cn70.b(32), cn70.b(44)));
                this.a = linearLayout;
            }

            @Override // com.vk.core.view.components.cell.VkCell.d
            public final View getView() {
                return this.a;
            }

            @Override // com.vk.core.view.components.cell.VkCell.d
            public final void a(VkCell.f fVar) {
            }
        }
    }
}
