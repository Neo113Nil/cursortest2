package yads;

import android.os.Handler;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class m63 {
    public static final ArrayList b = new ArrayList(50);
    public final Handler a;

    public m63(Handler handler) {
        this.a = handler;
    }

    public final l63 a(int i, Object obj) {
        l63 a = a();
        a.a = this.a.obtainMessage(i, obj);
        return a;
    }

    public static l63 a() {
        l63 l63Var;
        ArrayList arrayList = b;
        synchronized (arrayList) {
            try {
                if (arrayList.isEmpty()) {
                    l63Var = new l63();
                } else {
                    l63Var = (l63) arrayList.remove(arrayList.size() - 1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return l63Var;
    }
}
