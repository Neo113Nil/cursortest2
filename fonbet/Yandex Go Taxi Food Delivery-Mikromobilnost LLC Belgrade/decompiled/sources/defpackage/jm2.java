package defpackage;

import android.content.Context;
import android.os.Looper;

/* loaded from: classes.dex */
public abstract class jm2 extends nm2 {
    public om2 b(Context context, Looper looper, y2c y2cVar, Object obj, t4e t4eVar, yx60 yx60Var) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    public om2 c(Context context, Looper looper, y2c y2cVar, Object obj, wst wstVar, xst xstVar) {
        return b(context, looper, y2cVar, obj, wstVar, xstVar);
    }
}
