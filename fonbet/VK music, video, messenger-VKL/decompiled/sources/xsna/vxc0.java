package xsna;

import androidx.annotation.NonNull;

/* compiled from: PreferenceDao_Impl.java */
/* loaded from: classes.dex */
public final class vxc0 extends upp<txc0> {
    @Override // xsna.s140
    @NonNull
    public final String c() {
        return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
    }

    @Override // xsna.upp
    public final void i(@NonNull zin0 zin0Var, @NonNull txc0 txc0Var) {
        txc0 txc0Var2 = txc0Var;
        zin0Var.bindString(1, txc0Var2.a);
        zin0Var.bindLong(2, txc0Var2.b.longValue());
    }
}
