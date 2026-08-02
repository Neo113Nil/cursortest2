package xsna;

import java.lang.ref.SoftReference;

/* compiled from: SignatureImpl.java */
/* loaded from: classes8.dex */
public abstract class kmj0 {
    public static boolean f = true;
    public int a;
    public String b;
    public String c;
    public Class d;
    public a e;

    /* compiled from: SignatureImpl.java */
    public static final class a {
        public SoftReference a;
    }

    public abstract String a();

    public final String b() {
        hqm0 hqm0Var = hqm0.e;
        String str = null;
        if (f) {
            a aVar = this.e;
            if (aVar == null) {
                try {
                    a aVar2 = new a();
                    aVar2.a = new SoftReference(new String[3]);
                    this.e = aVar2;
                } catch (Throwable unused) {
                    f = false;
                }
            } else {
                String[] strArr = (String[]) aVar.a.get();
                if (strArr != null) {
                    str = strArr[0];
                }
            }
        }
        if (str == null) {
            str = a();
        }
        if (f) {
            a aVar3 = this.e;
            String[] strArr2 = (String[]) aVar3.a.get();
            if (strArr2 == null) {
                strArr2 = new String[3];
                aVar3.a = new SoftReference(strArr2);
            }
            strArr2[0] = str;
        }
        return str;
    }

    public final String toString() {
        hqm0 hqm0Var = hqm0.e;
        return b();
    }
}
