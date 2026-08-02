package yads;

import android.content.Context;
import android.graphics.Typeface;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes10.dex */
public final class ix0 {
    public final iw0 a;

    public /* synthetic */ ix0(Context context) {
        this(new iw0(context.getApplicationContext()));
    }

    public final Typeface a(tw0 tw0Var) {
        ConcurrentHashMap concurrentHashMap = fx0.a;
        Typeface typeface = (Typeface) concurrentHashMap.get(tw0Var);
        if (typeface != null) {
            return typeface;
        }
        Typeface a = this.a.a(tw0Var);
        if (a == null) {
            return null;
        }
        concurrentHashMap.put(tw0Var, a);
        return a;
    }

    public ix0(iw0 iw0Var) {
        this.a = iw0Var;
    }
}
