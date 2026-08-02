package xsna;

import java.util.concurrent.TimeUnit;

/* compiled from: VkReefWatcher.kt */
/* loaded from: classes5.dex */
public final class rfv0 {
    public final xof0 a;
    public final io.reactivex.rxjava3.subjects.f<ufv0> b;

    public rfv0(xof0 xof0Var) {
        tfv0 tfv0Var = new tfv0();
        asu0.a.getClass();
        io.reactivex.rxjava3.core.w p = asu0.p();
        this.a = xof0Var;
        io.reactivex.rxjava3.subjects.f<ufv0> fVar = new io.reactivex.rxjava3.subjects.f<>();
        long j = xof0Var.a;
        if (j > 0) {
            new io.reactivex.rxjava3.internal.operators.observable.i0(fVar.z(j, TimeUnit.SECONDS, p), new uq80(new i9u0(this, 3), 11)).subscribe(new e7q0(new hy0(1, tfv0Var, sfv0.class, "onEvent", "onEvent(Lcom/vk/reef/watcher/VkReefWatcherEvent;)V", 0, 13), 8));
        } else {
            new io.reactivex.rxjava3.internal.operators.observable.i0(fVar.a0(p), new osk0(new r9c0(this, 24), 15)).subscribe(new tk40(new cu4(1, tfv0Var, sfv0.class, "onEvent", "onEvent(Lcom/vk/reef/watcher/VkReefWatcherEvent;)V", 0, 10), 26));
        }
        this.b = fVar;
    }
}
