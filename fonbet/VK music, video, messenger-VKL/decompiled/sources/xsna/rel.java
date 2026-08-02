package xsna;

import kotlin.coroutines.d;

/* compiled from: DefaultExecutor.kt */
/* loaded from: classes11.dex */
public final class rel {
    public static final osl a;

    static {
        String str;
        osl oslVar;
        int i = crn0.a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null ? Boolean.parseBoolean(str) : false) {
            bdn bdnVar = bdn.a;
            d.b bVar = ie00.a;
            bVar.getClass();
            oslVar = !(bVar instanceof osl) ? qel.j : (osl) bVar;
        } else {
            oslVar = qel.j;
        }
        a = oslVar;
    }
}
