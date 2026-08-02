package defpackage;

import com.yandex.go.superapp.discovery.map.impl.data.entities.network.actions.OpenServiceFlexAction;
import com.yandex.go.superapp.discovery.map.impl.domain.entities.main.SuperAppOpenServiceActionType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.EmptySet;

/* loaded from: classes14.dex */
public final class d870 implements dw {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ d870(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.dw
    public final void handle(kr krVar, n6u n6uVar) {
        Object obj;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                OpenServiceFlexAction openServiceFlexAction = (OpenServiceFlexAction) krVar;
                tuv0 tuv0Var = (tuv0) obj2;
                String str = openServiceFlexAction.a;
                if (str == null || str.length() == 0) {
                    tuv0Var.k();
                    return;
                }
                f5w0 f5w0Var = (f5w0) this.c;
                String str2 = openServiceFlexAction.a;
                f5w0Var.getClass();
                SuperAppOpenServiceActionType a = f5w0.a(str2);
                switch (a == null ? -1 : c870.a[a.ordinal()]) {
                    case -1:
                        return;
                    case 0:
                    default:
                        w511.b();
                        return;
                    case 1:
                        tuv0Var.g();
                        return;
                    case 2:
                        tuv0Var.j();
                        return;
                    case 3:
                        tuv0Var.f();
                        return;
                    case 4:
                        tuv0Var.h();
                        return;
                    case 5:
                        tuv0Var.i();
                        return;
                    case 6:
                        tuv0Var.l(t6c0.a);
                        return;
                }
            default:
                wgp0 wgp0Var = (wgp0) krVar;
                ArrayList arrayList = new ArrayList();
                ((k6x) obj2).d(new lxo0(3, this, wgp0Var, arrayList));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    g5x g5xVar = (g5x) it.next();
                    if (g5xVar.a.equals("dispatch-effect")) {
                        try {
                            String str3 = (String) g5xVar.b;
                            Map map = wgp0Var.b;
                            kr krVar2 = map != null ? (kr) map.get(str3) : null;
                            if (krVar2 == null) {
                                Map map2 = wgp0Var.b;
                                if (map2 == null || (obj = map2.keySet()) == null) {
                                    obj = EmptySet.a;
                                }
                                throw new IllegalArgumentException(("Effect '" + str3 + "' is missing. Existing effects: [" + obj + "]").toString());
                                break;
                            } else {
                                n6uVar.c.b(krVar2, n6uVar.b, n6uVar.e);
                            }
                        } catch (Exception e) {
                            h5z0.a.f(e, oyr.p("Failed dispatching of effect after script '", wgp0Var.a.a, "'"), new Object[0]);
                        }
                    }
                }
                return;
        }
    }
}
