package defpackage;

import android.content.Context;

/* loaded from: classes7.dex */
public final class ps71 {
    public final vv71 a(Context context) {
        vv71 vv71Var;
        vv71 vv71Var2 = vv71.d;
        if (vv71Var2 != null) {
            return vv71Var2;
        }
        synchronized (this) {
            vv71Var = vv71.d;
            if (vv71Var == null) {
                vv71Var = new vv71(context);
                vv71.d = vv71Var;
            }
        }
        return vv71Var;
    }
}
