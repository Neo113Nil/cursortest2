package xsna;

import androidx.annotation.NonNull;

/* compiled from: DependencyDao_Impl.java */
/* loaded from: classes.dex */
public final class jzl extends upp<fzl> {
    @Override // xsna.s140
    @NonNull
    public final String c() {
        return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
    }

    @Override // xsna.upp
    public final void i(@NonNull zin0 zin0Var, @NonNull fzl fzlVar) {
        fzl fzlVar2 = fzlVar;
        zin0Var.bindString(1, fzlVar2.b());
        zin0Var.bindString(2, fzlVar2.a());
    }
}
