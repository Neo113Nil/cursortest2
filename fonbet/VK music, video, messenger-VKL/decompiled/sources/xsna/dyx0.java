package xsna;

import androidx.annotation.NonNull;

/* compiled from: WorkTagDao_Impl.java */
/* loaded from: classes.dex */
public final class dyx0 extends upp<byx0> {
    @Override // xsna.s140
    @NonNull
    public final String c() {
        return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
    }

    @Override // xsna.upp
    public final void i(@NonNull zin0 zin0Var, @NonNull byx0 byx0Var) {
        byx0 byx0Var2 = byx0Var;
        zin0Var.bindString(1, byx0Var2.a);
        zin0Var.bindString(2, byx0Var2.b);
    }
}
