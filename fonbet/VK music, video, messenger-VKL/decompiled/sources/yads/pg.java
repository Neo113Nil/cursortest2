package yads;

import android.content.Context;

/* loaded from: classes10.dex */
public final class pg {
    public static final pg a = new pg();
    public static volatile fh b;

    public static final fh a(Context context) {
        fh fhVar;
        fh fhVar2 = b;
        if (fhVar2 != null) {
            return fhVar2;
        }
        synchronized (a) {
            Context a2 = uz.a(context);
            fhVar = b;
            if (fhVar == null) {
                fhVar = new fh(new zg(a2));
                b = fhVar;
            }
        }
        return fhVar;
    }
}
