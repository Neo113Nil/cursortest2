package defpackage;

import android.content.Context;
import ru.yandex.taxi.payment_options.model.pci_dss.CardType;

/* loaded from: classes6.dex */
public abstract class hfb1 {
    public static lvt0 a(Context context) {
        i971 i971Var;
        synchronized (rsb1.class) {
            try {
                if (rsb1.a == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    rsb1.a = new i971(new me0(context, (byte) 0));
                }
                i971Var = rsb1.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return (lvt0) ((id91) i971Var.b).zza();
    }

    public static mb8 b(dt5 dt5Var, sf8 sf8Var) {
        CardType b;
        String str = sf8Var.b;
        if (evu0.J(str)) {
            mp8 mp8Var = CardType.Companion;
            String str2 = dt5Var.a;
            mp8Var.getClass();
            b = mp8.a(str2);
        } else {
            CardType.Companion.getClass();
            b = mp8.b(str);
        }
        boolean z = !sf8Var.c;
        return new mb8(dt5Var, z, z, b);
    }

    public abstract int c();
}
