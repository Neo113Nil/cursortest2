package xsna;

import android.os.Handler;
import android.os.Looper;
import com.vk.dto.common.id.UserId;
import com.vk.pending.PendingVideoAttachment;
import xsna.hg1;

/* compiled from: DefaultAttachUploader.kt */
/* loaded from: classes7.dex */
public final class ual extends pc {
    public final Handler c;
    public io.reactivex.rxjava3.disposables.c d;
    public boolean e;
    public UserId f;

    public ual(itz0 itz0Var) {
        super(itz0Var);
        this.c = new Handler(Looper.getMainLooper());
        this.f = UserId.d;
    }

    @Override // xsna.pc, xsna.o34
    public final void b(UserId userId, boolean z) {
        this.e = z;
        this.f = userId;
    }

    @Override // xsna.o34
    public final void c() {
        io.reactivex.rxjava3.subjects.f<Object> fVar = ysg0.b.a;
        hg1.a1 a1Var = new hg1.a1();
        fVar.getClass();
        this.d = new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, a1Var).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new hz(this, 23));
    }

    @Override // xsna.pc, xsna.o34
    public final void d(ju90<?> ju90Var) {
        if (ju90Var instanceof PendingVideoAttachment) {
            this.c.postDelayed(new g0((PendingVideoAttachment) ju90Var, 11), 300L);
        } else {
            ju90Var.O3(com.vk.upload.impl.a.d.getAndIncrement());
            e(ju90Var);
        }
    }

    @Override // xsna.o34
    public final void e(ju90<?> ju90Var) {
        this.c.postDelayed(new f0(3, ju90Var, this), 300L);
    }

    @Override // xsna.o34
    public final void f(ju90<?> ju90Var) {
        com.vk.upload.impl.a.b(ju90Var.S(), null);
    }

    @Override // xsna.o34
    public final void g() {
        io.reactivex.rxjava3.disposables.c cVar = this.d;
        if (cVar != null) {
            cVar.dispose();
        }
    }
}
