package xsna;

import android.os.Build;
import androidx.work.NetworkType;

/* compiled from: ContraintControllers.kt */
/* loaded from: classes.dex */
public final class c660 extends zb6<l560> {
    @Override // xsna.v5j
    public final boolean a(fxx0 fxx0Var) {
        NetworkType networkType = fxx0Var.j.a;
        if (networkType != NetworkType.UNMETERED) {
            return Build.VERSION.SDK_INT >= 30 && networkType == NetworkType.TEMPORARILY_UNMETERED;
        }
        return true;
    }

    @Override // xsna.zb6
    public final int d() {
        return 7;
    }

    @Override // xsna.zb6
    public final boolean e(l560 l560Var) {
        l560 l560Var2 = l560Var;
        return !l560Var2.a || l560Var2.c;
    }
}
