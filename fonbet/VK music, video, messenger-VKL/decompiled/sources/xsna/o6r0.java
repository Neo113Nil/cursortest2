package xsna;

import com.vk.dto.common.Image;
import com.vk.dto.user.ImageStatus;
import com.vk.dto.user.ObsceneTextFilter;

/* compiled from: VKAccountEditorImpl.kt */
/* loaded from: classes15.dex */
public final class o6r0 implements n6r0 {
    public final m6r0 a;

    public o6r0(m6r0 m6r0Var) {
        this.a = new m6r0(m6r0Var);
    }

    @Override // xsna.n6r0
    public final n6r0 a(Boolean bool) {
        this.a.f(m6r0.t1, bool);
        return this;
    }

    @Override // xsna.n6r0
    public final n6r0 b(Image image, boolean z) {
        l7r l7rVar = m6r0.D0;
        m6r0 m6r0Var = this.a;
        m6r0Var.f(l7rVar, image);
        m6r0Var.f(m6r0.s1, Boolean.valueOf(z));
        return this;
    }

    @Override // xsna.n6r0
    public final n6r0 c(String str) {
        this.a.f(m6r0.l, str);
        return this;
    }

    @Override // xsna.n6r0
    public final boolean commit() {
        return q6r0.k(this.a, false);
    }

    @Override // xsna.n6r0
    public final n6r0 d(String str, boolean z) {
        n7r n7rVar = m6r0.k;
        m6r0 m6r0Var = this.a;
        m6r0Var.f(n7rVar, str);
        m6r0Var.f(m6r0.s1, Boolean.valueOf(z));
        return this;
    }

    @Override // xsna.n6r0
    public final n6r0 e(boolean z) {
        ObsceneTextFilter.a aVar = ObsceneTextFilter.Companion;
        Boolean valueOf = Boolean.valueOf(z);
        aVar.getClass();
        ObsceneTextFilter a = ObsceneTextFilter.a.a(valueOf);
        m6r0 m6r0Var = this.a;
        m6r0Var.getClass();
        d7r d7rVar = m6r0.q1;
        int i = ObsceneTextFilter.b.$EnumSwitchMapping$0[a.ordinal()];
        m6r0Var.f(d7rVar, i != 1 ? i != 2 ? null : Boolean.FALSE : Boolean.TRUE);
        return this;
    }

    public final void f() {
        q6r0.f().i(this.a);
        ver0.a(itg0.m(new io.reactivex.rxjava3.internal.operators.observable.s0(new qxd(this, 1)).r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b())));
    }

    public final n6r0 g(String str) {
        this.a.C(str);
        return this;
    }

    public final n6r0 h(int i) {
        this.a.D(i);
        return this;
    }

    public final n6r0 i(boolean z) {
        this.a.f(m6r0.x, Boolean.valueOf(z));
        return this;
    }

    public final n6r0 j(com.vk.dto.hints.a aVar) {
        this.a.f(m6r0.q0, aVar);
        return this;
    }

    public final n6r0 k(ImageStatus imageStatus) {
        this.a.f(m6r0.E0, imageStatus);
        return this;
    }

    public final n6r0 l(boolean z) {
        this.a.f(m6r0.C0, Boolean.valueOf(z));
        return this;
    }

    public final n6r0 m(or00 or00Var) {
        this.a.f(m6r0.r1, or00Var);
        return this;
    }

    public final n6r0 n(long j) {
        this.a.f(m6r0.y, Long.valueOf(j));
        return this;
    }

    public final n6r0 o(com.vk.dto.menu.a aVar) {
        this.a.f(m6r0.p1, aVar);
        return this;
    }

    public final n6r0 p(String str) {
        this.a.E(str);
        return this;
    }

    public final n6r0 q(long j) {
        this.a.F(j);
        return this;
    }
}
