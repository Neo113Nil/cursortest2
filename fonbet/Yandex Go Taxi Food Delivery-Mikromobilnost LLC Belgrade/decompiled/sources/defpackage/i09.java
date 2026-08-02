package defpackage;

import java.util.ArrayList;

/* loaded from: classes14.dex */
public final /* synthetic */ class i09 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ an8 b;
    public final /* synthetic */ k09 c;

    public /* synthetic */ i09(an8 an8Var, k09 k09Var, int i) {
        this.a = i;
        this.b = an8Var;
        this.c = k09Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        k09 k09Var = this.c;
        an8 an8Var = this.b;
        switch (i) {
            case 0:
                unr0.C(new Object[]{(q09) an8Var.x, (k09) an8Var.b}, 2, "Transition from %s to %s has ended", jst.e);
                k09 k09Var2 = (k09) an8Var.b;
                if (k09Var2 != null) {
                    an8Var.x = k09Var2;
                }
                an8Var.b = null;
                k09Var.c = null;
                k09Var.d = null;
                e09 e09Var = (e09) an8Var.c;
                q09 q09Var = (q09) an8Var.x;
                f09 f09Var = e09Var.a;
                if (q09Var instanceof l09) {
                    u08 u08Var = f09Var.x;
                    if (u08Var != null) {
                        u08Var.invoke();
                    }
                    f09Var.x = null;
                } else if (q09Var instanceof m09) {
                    f09Var.x = null;
                }
                an8Var.p();
                break;
            default:
                unr0.C(new Object[]{(q09) an8Var.x, (k09) an8Var.b}, 2, "Transition from %s to %s has canceled", jst.e);
                an8Var.b = null;
                k09Var.c = null;
                k09Var.d = null;
                ArrayList arrayList = (ArrayList) an8Var.w;
                if (!arrayList.isEmpty()) {
                    while (!((q09) an8Var.x).c((q09) arrayList.get(0))) {
                        arrayList.remove(0);
                        if (arrayList.isEmpty()) {
                        }
                    }
                }
                an8Var.p();
                break;
        }
    }
}
