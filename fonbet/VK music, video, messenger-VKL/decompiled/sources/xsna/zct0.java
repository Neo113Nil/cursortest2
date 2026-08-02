package xsna;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.vk.libvideo.design.view.play.PlayButton;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: VideoReplayCompleteView.kt */
/* loaded from: classes2.dex */
public final class zct0 extends qqy<a> {
    public final Object c;

    /* compiled from: VideoReplayCompleteView.kt */
    @vby
    public static final class a {
        public final View.OnClickListener a;

        public /* synthetic */ a(View.OnClickListener onClickListener) {
            this.a = onClickListener;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return epx.f(this.a, ((a) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Data(listener=" + this.a + ')';
        }
    }

    public zct0(Context context) {
        super(context);
        this.c = msy.a(LazyThreadSafetyMode.NONE, new yei0(this, 23));
        this.b.getClass();
        if (vsy.d()) {
            b();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final PlayButton getVideoReplayView() {
        return (PlayButton) this.c.getValue();
    }

    @Override // xsna.qqy
    public final void b() {
        PlayButton playButton = new PlayButton(getContext());
        playButton.setId(R.id.video_replay);
        float f = 72;
        playButton.setLayoutParams(new FrameLayout.LayoutParams(iah0.a(f), iah0.a(f), 17));
        playButton.setContentDescription(playButton.getContext().getString(R.string.video_accessibility_replay));
        playButton.setScaleType(ImageView.ScaleType.CENTER);
        playButton.b = R.drawable.highlight_video_play;
        playButton.c = R.drawable.vk_icon_replay_36;
        playButton.d = R.color.vk_white;
        playButton.setVisibility(0);
        addView(playButton);
    }

    @Override // xsna.qqy
    public final void c(a aVar) {
        getVideoReplayView().setOnClickListener(aVar.a);
    }
}
