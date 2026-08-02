package xsna;

import com.vk.superapp.api.dto.app.catalog.CustomItem;
import com.vk.superapp.api.dto.app.catalog.section.AppsPaginatedSection;
import com.vk.superapp.api.dto.widgets.actions.WebActionOpenNativeApp;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.u8r0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class s8r0 implements izs {
    public final /* synthetic */ u8r0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ s8r0(u8r0 u8r0Var, boolean z) {
        this.b = u8r0Var;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        u8r0 u8r0Var = this.b;
        boolean z = this.c;
        u8r0.a aVar = (u8r0.a) obj;
        if (aVar instanceof u8r0.a.b.C3793b) {
            u8r0.a.b.C3793b c3793b = (u8r0.a.b.C3793b) aVar;
            u8r0Var.e.putAll(c3793b.a.b);
            u8r0Var.f = c3793b.a.c;
            if (z) {
                u8r0Var.g.clear();
                u8r0Var.i = false;
                com.vk.lists.c cVar = u8r0Var.d;
                if (cVar == null) {
                    cVar = null;
                }
                cVar.r(true);
            }
            ArrayList arrayList = c3793b.a.a;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (obj2 instanceof AppsPaginatedSection) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                List<CustomItem> list = ((AppsPaginatedSection) it.next()).k;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : list) {
                    if (((CustomItem) obj3).j instanceof WebActionOpenNativeApp) {
                        arrayList3.add(obj3);
                    }
                }
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    CustomItem customItem = (CustomItem) it2.next();
                    SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                    if (superappUiRouterBridge == null) {
                        superappUiRouterBridge = null;
                    }
                    superappUiRouterBridge.z(((WebActionOpenNativeApp) customItem.j).d);
                }
            }
        }
        return s3q0.a;
    }
}
