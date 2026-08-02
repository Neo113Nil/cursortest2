package xsna;

import java.util.logging.Logger;

/* compiled from: Logger.java */
/* loaded from: classes13.dex */
public abstract class q100 {
    public static q100 a(Class cls) {
        if (System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik")) {
            String simpleName = cls.getSimpleName();
            sa2 sa2Var = new sa2();
            sa2Var.a = simpleName;
            return sa2Var;
        }
        String simpleName2 = cls.getSimpleName();
        rby rbyVar = new rby();
        rbyVar.a = Logger.getLogger(simpleName2);
        return rbyVar;
    }

    public abstract void b(String str);

    public abstract void c(String str);

    public abstract void d(String str);
}
