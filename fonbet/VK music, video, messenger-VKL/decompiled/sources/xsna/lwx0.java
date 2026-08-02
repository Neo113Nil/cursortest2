package xsna;

import androidx.annotation.NonNull;

/* compiled from: WorkNameDao_Impl.java */
/* loaded from: classes.dex */
public final class lwx0 extends upp<jwx0> {
    @Override // xsna.s140
    @NonNull
    public final String c() {
        return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
    }

    @Override // xsna.upp
    public final void i(@NonNull zin0 zin0Var, @NonNull jwx0 jwx0Var) {
        jwx0 jwx0Var2 = jwx0Var;
        zin0Var.bindString(1, jwx0Var2.a);
        zin0Var.bindString(2, jwx0Var2.b);
    }
}
