package xsna;

import android.view.ViewGroup;
import com.vk.dto.common.VideoFile;
import java.util.concurrent.TimeUnit;

/* compiled from: InlineLiveEventsDelegate.kt */
/* loaded from: classes3.dex */
public final class l0x implements fjz {
    public final ViewGroup a;
    public final wjk0 b;
    public final boolean c;
    public final emz d;
    public io.reactivex.rxjava3.disposables.c e = new io.reactivex.rxjava3.disposables.f(io.reactivex.rxjava3.internal.functions.a.b);
    public ljz f;
    public VideoFile g;

    public l0x(ViewGroup viewGroup, wjk0 wjk0Var, boolean z, emz emzVar) {
        this.a = viewGroup;
        this.b = wjk0Var;
        this.c = z;
        this.d = emzVar;
    }

    @Override // xsna.fjz
    public final void a() {
        this.e.dispose();
        ljz ljzVar = this.f;
        if (ljzVar != null) {
            ljzVar.release();
            this.a.removeView(ljzVar);
            this.f = null;
        }
    }

    @Override // xsna.fjz
    public final void b(boolean z, gzs gzsVar) {
        if (this.f != null || this.g == null) {
            return;
        }
        this.e.dispose();
        io.reactivex.rxjava3.internal.operators.observable.w2 B0 = io.reactivex.rxjava3.core.q.B0(300L, TimeUnit.MILLISECONDS);
        asu0 asu0Var = asu0.a;
        this.e = B0.r0(asu0Var.c()).a0(asu0Var.d()).subscribe(new gn0(new lmu(this, gzsVar, z), 27));
    }

    @Override // xsna.fjz
    public final void c(VideoFile videoFile) {
        this.g = videoFile;
    }

    @Override // xsna.fjz
    public final void pause() {
        ljz ljzVar = this.f;
        if (ljzVar != null) {
            ljzVar.pause();
        }
    }

    @Override // xsna.fjz
    public final void resume() {
        ljz ljzVar = this.f;
        if (ljzVar != null) {
            ljzVar.resume();
        }
    }
}
