package xsna;

import com.vk.dto.common.id.UserId;
import xsna.it80;

/* compiled from: VideoProfileMetaBridgeImpl.kt */
/* loaded from: classes6.dex */
public final class j8t0 implements i8t0 {
    public final io.reactivex.rxjava3.subjects.d<it80<h8t0>> a;
    public final io.reactivex.rxjava3.subjects.d<it80<UserId>> b;

    public j8t0() {
        it80.b.getClass();
        this.a = io.reactivex.rxjava3.subjects.d.O0(it80.a.a());
        this.b = io.reactivex.rxjava3.subjects.d.O0(it80.a.a());
    }

    @Override // xsna.k8t0
    public final void a(h8t0 h8t0Var) {
        it80.b.getClass();
        this.a.onNext(new it80<>(h8t0Var));
        if (h8t0Var == null || !h8t0Var.c) {
            return;
        }
        this.b.onNext(new it80<>(h8t0Var.a));
        o25.a().getClass();
    }

    @Override // xsna.i8t0
    public final h8t0 getValue() {
        it80<h8t0> P0 = this.a.P0();
        if (P0 != null) {
            return P0.a;
        }
        return null;
    }
}
