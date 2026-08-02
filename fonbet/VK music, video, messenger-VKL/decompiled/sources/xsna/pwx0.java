package xsna;

import androidx.annotation.NonNull;
import androidx.work.Data;

/* compiled from: WorkProgressDao_Impl.java */
/* loaded from: classes.dex */
public final class pwx0 extends upp<nwx0> {
    @Override // xsna.s140
    @NonNull
    public final String c() {
        return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
    }

    @Override // xsna.upp
    public final void i(@NonNull zin0 zin0Var, @NonNull nwx0 nwx0Var) {
        nwx0 nwx0Var2 = nwx0Var;
        zin0Var.bindString(1, nwx0Var2.b());
        Data a = nwx0Var2.a();
        Data data = Data.b;
        zin0Var.bindBlob(2, Data.b.b(a));
    }
}
