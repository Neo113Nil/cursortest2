package defpackage;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class g32 implements vj6, w32, moh {
    public final /* synthetic */ h32 a;

    public /* synthetic */ g32(h32 h32Var) {
        this.a = h32Var;
    }

    @Override // defpackage.vj6
    public void a(u2f u2fVar) {
        h32 h32Var = this.a;
        synchronized (h32Var) {
            try {
                if (((vj6) h32Var.c) instanceof unj) {
                    ((ArrayList) h32Var.b).add(u2fVar);
                }
                ((vj6) h32Var.c).a(u2fVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.w32
    public void c(Bundle bundle) {
        ((w32) this.a.a).c(bundle);
    }

    @Override // defpackage.moh
    public void f(zvf0 zvf0Var) {
        h32 h32Var = this.a;
        Log.isLoggable("FirebaseCrashlytics", 3);
        c32 c32Var = (c32) zvf0Var.get();
        cot cotVar = new cot(16, c32Var);
        lb7 lb7Var = new lb7(21);
        d32 d32Var = (d32) c32Var;
        ngd0 b = d32Var.b("clx", lb7Var);
        if (b == null) {
            Log.isLoggable("FirebaseCrashlytics", 3);
            b = d32Var.b("crash", lb7Var);
        }
        if (b != null) {
            Log.isLoggable("FirebaseCrashlytics", 3);
            uj6 uj6Var = new uj6();
            am2 am2Var = new am2();
            am2Var.b = new Object();
            am2Var.a = cotVar;
            synchronized (h32Var) {
                try {
                    Iterator it = ((ArrayList) h32Var.b).iterator();
                    while (it.hasNext()) {
                        uj6Var.a((u2f) it.next());
                    }
                    lb7Var.c = uj6Var;
                    lb7Var.b = am2Var;
                    h32Var.c = uj6Var;
                    h32Var.a = am2Var;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
