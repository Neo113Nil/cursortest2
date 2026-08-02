package defpackage;

import android.content.Context;

/* loaded from: classes7.dex */
public final class d671 {
    public final mf71 a(Context context) {
        mf71 mf71Var;
        mf71 mf71Var2 = mf71.e;
        if (mf71Var2 != null) {
            return mf71Var2;
        }
        synchronized (this) {
            mf71Var = mf71.e;
            if (mf71Var == null) {
                mf71Var = new mf71(context);
                mf71.e = mf71Var;
            }
        }
        return mf71Var;
    }
}
