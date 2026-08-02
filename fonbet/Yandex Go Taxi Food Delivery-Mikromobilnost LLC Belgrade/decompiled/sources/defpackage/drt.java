package defpackage;

import com.yandex.go.flex.common.api.actions.GoReloadLabeledSectionsAction;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.b;

/* loaded from: classes.dex */
public final class drt implements dw {
    public static final drt b = new drt(0);
    public static final drt c = new drt(1);
    public static final drt w = new drt(2);
    public final /* synthetic */ int a;

    public /* synthetic */ drt(int i) {
        this.a = i;
    }

    @Override // defpackage.dw
    public final void handle(kr krVar, n6u n6uVar) {
        switch (this.a) {
            case 0:
                GoReloadLabeledSectionsAction goReloadLabeledSectionsAction = (GoReloadLabeledSectionsAction) krVar;
                t1q0 t1q0Var = (t1q0) n6uVar.b.a.b(qoi0.a(t1q0.class));
                if (t1q0Var != null) {
                    List b2 = t1q0Var.b(goReloadLabeledSectionsAction.a);
                    if (!b2.isEmpty()) {
                        txl txlVar = n6uVar.d;
                        Map map = goReloadLabeledSectionsAction.b;
                        if (map == null) {
                            map = b.f();
                        }
                        txlVar.a(new r5q0(b2, map));
                        break;
                    }
                }
                break;
            case 1:
                Iterator it = ((gqy) krVar).a.iterator();
                while (it.hasNext()) {
                    try {
                        n6uVar.c.b((kr) it.next(), n6uVar.b, n6uVar.e);
                    } catch (Throwable unused) {
                    }
                }
                break;
            default:
                qr10 qr10Var = (qr10) krVar;
                n6uVar.d.a(new q5q0(qr10Var.a, qr10Var.c, qr10Var.b));
                break;
        }
    }
}
