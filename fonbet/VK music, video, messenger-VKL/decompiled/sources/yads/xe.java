package yads;

import android.content.Context;

/* loaded from: classes10.dex */
public abstract class xe {
    public static volatile ve a;

    public static final dg a(Context context) {
        ve veVar;
        ve veVar2 = a;
        if (veVar2 != null) {
            return veVar2;
        }
        synchronized (ve.c) {
            Context a2 = uz.a(context);
            veVar = a;
            if (veVar == null) {
                veVar = new ve(new te(a2), oh1.a().a());
                a = veVar;
            }
        }
        return veVar;
    }
}
