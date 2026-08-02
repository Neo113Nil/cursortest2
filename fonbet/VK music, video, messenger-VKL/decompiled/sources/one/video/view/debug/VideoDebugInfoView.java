package one.video.view.debug;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;
import one.video.player.error.OneVideoPlaybackException;
import one.video.player.f;
import one.video.player.tracks.c;
import xsna.drm0;
import xsna.epx;
import xsna.hod;
import xsna.sht0;
import xsna.x5r0;

/* compiled from: VideoDebugInfoView.kt */
/* loaded from: classes8.dex */
public final class VideoDebugInfoView extends AppCompatTextView {
    public static final /* synthetic */ int i = 0;
    public String b;
    public boolean c;
    public final hod d;
    public long e;
    public OneVideoPlayer f;
    public final b g;
    public final a h;

    /* compiled from: VideoDebugInfoView.kt */
    public static final class a implements f {
        public a() {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void e(BaseVideoPlayer baseVideoPlayer, c cVar) {
            int i = VideoDebugInfoView.i;
            VideoDebugInfoView.this.f(baseVideoPlayer);
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void f(OneVideoPlayer oneVideoPlayer) {
            int i = VideoDebugInfoView.i;
            VideoDebugInfoView.this.f(oneVideoPlayer);
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void h(OneVideoPlayer oneVideoPlayer) {
            VideoDebugInfoView.this.setFixedText("VIDEO FINISH");
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void q(OneVideoPlaybackException oneVideoPlaybackException, sht0 sht0Var, OneVideoPlayer oneVideoPlayer) {
            VideoDebugInfoView.this.setFixedText("ERROR: " + oneVideoPlaybackException);
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void s(OneVideoPlayer oneVideoPlayer) {
            int i = VideoDebugInfoView.i;
            VideoDebugInfoView.this.f(oneVideoPlayer);
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void v(OneVideoPlayer oneVideoPlayer) {
            int i = VideoDebugInfoView.i;
            VideoDebugInfoView.this.f(oneVideoPlayer);
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void x(OneVideoPlayer oneVideoPlayer) {
            int i = VideoDebugInfoView.i;
            VideoDebugInfoView.this.f(oneVideoPlayer);
        }
    }

    /* compiled from: VideoDebugInfoView.kt */
    public static final class b implements OneVideoPlayer.d {
        public b() {
        }

        @Override // one.video.player.OneVideoPlayer.d
        public final void C(BaseVideoPlayer baseVideoPlayer, long j) {
            int i = VideoDebugInfoView.i;
            VideoDebugInfoView.this.f(baseVideoPlayer);
        }
    }

    public VideoDebugInfoView(Context context) {
        this(context, null, 0, 14, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setFixedText(String str) {
        this.c = true;
        setText(str);
    }

    public final void e() {
        long j = this.e;
        if (j <= 0 || this.c) {
            return;
        }
        postDelayed(this.d, j);
    }

    public final void f(OneVideoPlayer oneVideoPlayer) {
        if (this.c) {
            this.c = false;
            removeCallbacks(this.d);
            e();
        }
        i(oneVideoPlayer);
    }

    public final String getExtraLogInfo() {
        return this.b;
    }

    public final OneVideoPlayer getPlayer() {
        return this.f;
    }

    public final long getUpdatePeriodMillis() {
        return this.e;
    }

    public final void i(OneVideoPlayer oneVideoPlayer) {
        if (this.c) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(oneVideoPlayer.i0());
        String str = this.b;
        if (str != null) {
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null) {
                if (sb.length() > 0 && !drm0.F(sb, "\n")) {
                    sb.append("\n");
                }
                sb.append(str);
                sb.append('\n');
            }
        }
        setText(sb.toString());
    }

    public final void setExtraLogInfo(String str) {
        this.b = str;
    }

    public final void setPlayer(OneVideoPlayer oneVideoPlayer) {
        OneVideoPlayer oneVideoPlayer2 = this.f;
        if (epx.f(oneVideoPlayer, oneVideoPlayer2)) {
            return;
        }
        this.f = oneVideoPlayer;
        a aVar = this.h;
        if (oneVideoPlayer2 != null) {
            oneVideoPlayer2.c0(aVar);
        }
        b bVar = this.g;
        if (oneVideoPlayer2 != null) {
            oneVideoPlayer2.T(bVar);
        }
        if (oneVideoPlayer == null) {
            setFixedText("NO PLAYER");
            removeCallbacks(this.d);
        } else {
            oneVideoPlayer.d0(aVar);
            oneVideoPlayer.s(bVar);
            f(oneVideoPlayer);
            e();
        }
    }

    public final void setUpdatePeriodMillis(long j) {
        if (j != this.e) {
            removeCallbacks(this.d);
            if (j < 500) {
                j = j > 0 ? 500L : 0L;
            }
            this.e = j;
            e();
        }
    }

    public VideoDebugInfoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public VideoDebugInfoView(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 8, 0);
    }

    public /* synthetic */ VideoDebugInfoView(Context context, AttributeSet attributeSet, int i2, int i3, int i4) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2, 0);
    }

    public VideoDebugInfoView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2);
        this.d = new hod(this, 19);
        this.e = 1000L;
        setTextSize(x5r0.a(4, 2));
        setTextColor(-1);
        setBackgroundColor(Color.parseColor("#88000000"));
        int a2 = (int) x5r0.a(16, 1);
        setPadding(a2, a2, a2, a2);
        setFixedText("NO PLAYER");
        this.g = new b();
        this.h = new a();
    }
}
