package defpackage;

import java.util.Iterator;
import ru.CryptoPro.JCP.tools.ClassConfig;
import ru.CryptoPro.JCSP.KeyStore.KeyStoreConfigBase;

/* loaded from: classes4.dex */
public abstract class gq61 extends ClassConfig {
    public gq61() {
        super(gq61.class, "CPContQuestion", "", KeyStoreConfigBase.EXC_INVALID_CONFIG);
    }

    public static gq61 b() {
        gq61 bt61Var = new bt61();
        Iterator it = bt61Var.convert(bt61Var.getCurrent()).iterator();
        while (it.hasNext()) {
            bt61Var = (gq61) it.next();
        }
        return bt61Var;
    }

    public abstract boolean c(String[] strArr);

    @Override // ru.CryptoPro.JCP.tools.ClassConfig
    public final boolean isValid(Class cls) {
        return gq61.class.isAssignableFrom(cls);
    }
}
