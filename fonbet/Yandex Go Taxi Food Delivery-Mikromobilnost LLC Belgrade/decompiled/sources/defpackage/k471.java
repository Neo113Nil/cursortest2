package defpackage;

import android.content.Context;
import java.util.Map;
import kotlin.collections.b;
import yads.ff;

/* loaded from: classes7.dex */
public final class k471 {
    public static k471 d;
    public static final Object e = new Object();
    public final c171 a;
    public final Map b;
    public final fp71 c;

    public k471(Context context) {
        Object obj;
        c171 c171Var = new c171();
        b671 b671Var = ea71.a;
        ff ffVar = new ff(context);
        Object obj2 = b671Var.a;
        if (obj2 == null) {
            synchronized (b671Var.b) {
                fp71 fp71Var = b671Var.a;
                if (fp71Var == null) {
                    obj = ffVar.invoke();
                    b671Var.a = (fp71) obj;
                } else {
                    obj = fp71Var;
                }
            }
            obj2 = obj;
        }
        this.a = c171Var;
        this.b = b.f();
        this.c = (fp71) obj2;
    }
}
