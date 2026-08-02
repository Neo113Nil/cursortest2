package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public final class dp81 {
    public static final AtomicBoolean f = new AtomicBoolean(false);
    public final Context a;
    public final v981 b;
    public final a081 c;
    public final ge71 d;
    public final hn71 e;

    public dp81(Context context, v981 v981Var) {
        a081 a081Var;
        a081 a081Var2 = a081.g;
        if (a081Var2 == null) {
            synchronized (a081.f) {
                a081Var = a081.g;
                if (a081Var == null) {
                    a081Var = new a081();
                    a081.g = a081Var;
                }
            }
            a081Var2 = a081Var;
        }
        Context context2 = ((n291) v981Var).a;
        ge71 c = wha1.c(context2, context2);
        hn71 b = wp81.b(context);
        this.a = context;
        this.b = v981Var;
        this.c = a081Var2;
        this.d = c;
        this.e = b;
    }
}
