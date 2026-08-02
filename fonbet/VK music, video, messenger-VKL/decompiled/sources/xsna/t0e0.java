package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: ProfileUtilsImpl.kt */
/* loaded from: classes4.dex */
public final class t0e0 implements s0e0 {
    public final b25 a;

    public t0e0(b25 b25Var) {
        this.a = b25Var;
    }

    @Override // xsna.s0e0
    public final boolean a(UserId userId) {
        b25 b25Var = this.a;
        return b25Var.b() && b25Var.a(userId);
    }

    @Override // xsna.s0e0
    public final UserId b() {
        return this.a.c();
    }

    @Override // xsna.s0e0
    public final boolean d() {
        return this.a.d();
    }
}
