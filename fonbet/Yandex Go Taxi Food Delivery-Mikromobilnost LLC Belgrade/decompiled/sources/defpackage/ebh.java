package defpackage;

/* loaded from: classes9.dex */
public abstract class ebh {
    public static final fph a;

    static {
        String str;
        fph fphVar;
        int i = t3x0.a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null ? Boolean.parseBoolean(str) : false) {
            sjh sjhVar = uyj.a;
            fphVar = o400.a;
            fphVar.getClass();
        } else {
            fphVar = dbh.D;
        }
        a = fphVar;
    }
}
