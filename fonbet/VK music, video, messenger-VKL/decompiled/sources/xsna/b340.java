package xsna;

import com.vk.core.fragments.FragmentEntry;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.log.L;
import com.vk.menu.presentation.entity.TabMenuItemUiData;
import com.vk.toggle.internal.ToggleManager;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import xsna.i340;
import xsna.nx50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class b340 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b340(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object obj2;
        int i = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((i340) obj3).d.onNext(((i340.e) obj).c());
                break;
            case 1:
                nx50 nx50Var = (nx50) obj3;
                if (j5g.O0(b68.b.g()).contains(Integer.valueOf(R.id.tab_managed_group))) {
                    LinkedHashMap linkedHashMap = nx50.Q0;
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        if (((Number) entry.getValue()).intValue() == TabMenuItemUiData.MANAGED_GROUP.h()) {
                            linkedHashMap2.put(entry.getKey(), entry.getValue());
                        }
                    }
                    Class cls = (Class) j5g.X(linkedHashMap2.keySet());
                    Iterator it = nx50.a.a(nx50Var.E0()).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (epx.f(((FragmentEntry) obj2).b, cls)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    FragmentEntry fragmentEntry = (FragmentEntry) obj2;
                    if (fragmentEntry != null) {
                        nx50Var.y0().n(nx50.a.a(nx50Var.E0()), fragmentEntry);
                        TabMenuItemUiData.a aVar = TabMenuItemUiData.Companion;
                        TabMenuItemUiData tabMenuItemUiData = TabMenuItemUiData.MANAGED_GROUP;
                        int h = tabMenuItemUiData.h();
                        aVar.getClass();
                        TabMenuItemUiData a = TabMenuItemUiData.a.a(h);
                        Integer num = nx50Var.E;
                        int h2 = tabMenuItemUiData.h();
                        if (num != null && num.intValue() == h2 && a != null) {
                            Class<? extends FragmentImpl> a2 = m820.a(a.h(), nx50Var.E0().e("community_id_arg"));
                            if (a2 != null) {
                                String i2 = a.i();
                                if (tabMenuItemUiData.h() == tabMenuItemUiData.h()) {
                                    nx50Var.G0().f();
                                }
                                if (!nx50Var.y0().A(a2)) {
                                    nx50.Q0 = b68.f();
                                    nx50Var.y0().t(nx50.a.a(nx50Var.E0()), true);
                                }
                                m820.g(-1, i2);
                                nx50Var.T0(a);
                                UiTracker uiTracker = UiTracker.a;
                                UiTracker.i.d = true;
                                nx50Var.y0().k(new FragmentEntry(a2, nx50Var.t0(a2, false)), false);
                            }
                        }
                    }
                }
                break;
            default:
                L.j((Throwable) obj, "toggles: can't get toggles result");
                ((ToggleManager) obj3).e();
                break;
        }
        return s3q0.a;
    }
}
