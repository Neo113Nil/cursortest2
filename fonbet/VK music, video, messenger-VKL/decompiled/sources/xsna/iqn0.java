package xsna;

import androidx.annotation.NonNull;

/* compiled from: SystemIdInfoDao_Impl.java */
/* loaded from: classes.dex */
public final class iqn0 extends upp<gqn0> {
    @Override // xsna.s140
    @NonNull
    public final String c() {
        return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
    }

    @Override // xsna.upp
    public final void i(@NonNull zin0 zin0Var, @NonNull gqn0 gqn0Var) {
        zin0Var.bindString(1, gqn0Var.a);
        zin0Var.bindLong(2, r5.b);
        zin0Var.bindLong(3, r5.c);
    }
}
