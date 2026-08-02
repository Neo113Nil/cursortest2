package defpackage;

/* loaded from: classes14.dex */
public final class k3r0 implements x2r0 {
    public final as21 a;

    public k3r0(as21 as21Var) {
        this.a = as21Var;
    }

    @Override // defpackage.x2r0
    public final boolean update(boolean z) {
        as21 as21Var = this.a;
        if (as21Var.a("FIELD_INAPP_ONLY_CALLS", false) == z) {
            return false;
        }
        as21Var.e("FIELD_INAPP_ONLY_CALLS", z);
        return true;
    }
}
