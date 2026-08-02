package defpackage;

import java.lang.ref.WeakReference;

/* loaded from: classes10.dex */
public final /* synthetic */ class d8v implements z9s {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d8v(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.z9s
    public final void a(aas aasVar) {
        z9s z9sVar;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                f8v f8vVar = (f8v) ((WeakReference) ((e8v) obj).x).get();
                if (f8vVar != null) {
                    f8vVar.O.execute(new ejp(27, f8vVar));
                    return;
                }
                return;
            default:
                mdl0 mdl0Var = (mdl0) obj;
                synchronized (mdl0Var.c) {
                    try {
                        int i2 = mdl0Var.a - 1;
                        mdl0Var.a = i2;
                        if (mdl0Var.b && i2 == 0) {
                            mdl0Var.close();
                        }
                        z9sVar = (z9s) mdl0Var.y;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z9sVar != null) {
                    z9sVar.a(aasVar);
                    return;
                }
                return;
        }
    }
}
