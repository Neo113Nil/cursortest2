package one.video.player;

import android.view.Surface;
import kotlin.jvm.internal.FunctionReferenceImpl;
import one.video.player.l;
import xsna.epx;
import xsna.g0t;
import xsna.vw3;
import xsna.xzs;

/* compiled from: BaseVideoPlayer.kt */
/* loaded from: classes8.dex */
public final /* synthetic */ class b implements l.a, g0t {
    public final /* synthetic */ BaseVideoPlayer b;

    public b(BaseVideoPlayer baseVideoPlayer) {
        this.b = baseVideoPlayer;
    }

    @Override // one.video.player.l.a
    public final void a(Surface surface) {
        vw3 vw3Var = BaseVideoPlayer.H;
        BaseVideoPlayer baseVideoPlayer = this.b;
        if (surface != null) {
            baseVideoPlayer.setVideoSurface(surface);
        } else {
            baseVideoPlayer.clearVideoSurface();
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof l.a) && (obj instanceof g0t)) {
            return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // xsna.g0t
    public final xzs<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.b, BaseVideoPlayer.class, "setupSurface", "setupSurface(Landroid/view/Surface;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
