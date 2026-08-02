package yads;

import android.content.Context;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class e31 implements f31 {
    public static final Object h = new Object();
    public final fh a;
    public final yg b;
    public final wg c;
    public final Context d;
    public tg e;
    public final g31 f = g31.b;
    public final String g;

    public e31(Context context, fh fhVar, yg ygVar, wg wgVar, ck1 ck1Var) {
        this.a = fhVar;
        this.b = ygVar;
        this.c = wgVar;
        this.d = context.getApplicationContext();
        this.g = ck1Var.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003a, code lost:
    
        r6.e = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(tg tgVar) {
        boolean z;
        boolean z2;
        synchronized (h) {
            try {
                this.b.getClass();
                String str = tgVar.a;
                String str2 = tgVar.b;
                String str3 = tgVar.c;
                boolean z3 = true;
                if (str3 != null && str3.length() != 0) {
                    z = false;
                    if (!z) {
                        if (str != null && str.length() != 0) {
                            z2 = false;
                            if (!z2) {
                                if (str2 != null && str2.length() != 0) {
                                    z3 = false;
                                }
                            }
                        }
                        z2 = true;
                        if (!z2) {
                        }
                    }
                    s3q0 s3q0Var = s3q0.a;
                }
                z = true;
                if (!z) {
                }
                s3q0 s3q0Var2 = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        wg wgVar = this.c;
        Context context = this.d;
        ug ugVar = wgVar.a;
        synchronized (ugVar.a) {
            ugVar.b.add(this);
        }
        try {
            wgVar.a(context);
        } catch (Throwable unused) {
            wgVar.c();
        }
    }
}
