package xsna;

import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.data.VKList;
import com.vk.dto.stories.entities.StoryUserProfile;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.stories.design.view.stats.tabs.viewers.mvi.a;
import com.vk.superapp.api.dto.app.catalog.SectionAppItem;
import com.vk.superapp.api.dto.app.catalog.section.AppsHorizontalListSection;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.x7a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class dim0 implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ dim0(com.vk.lists.c cVar, eim0 eim0Var, boolean z) {
        this.d = cVar;
        this.e = eim0Var;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                com.vk.lists.c cVar = (com.vk.lists.c) this.d;
                eim0 eim0Var = (eim0) this.e;
                tnm0 tnm0Var = (tnm0) obj;
                VKList<StoryUserProfile> vKList = tnm0Var.a;
                String j = vKList.j();
                boolean z = (j == null || j.length() == 0 || epx.f(vKList.j(), "0")) ? false : true;
                cVar.s(vKList.j());
                cVar.r(z);
                eim0Var.c.invoke(new a.d.b(tnm0Var.c, vKList, this.c));
                break;
            case 1:
                d9r0 d9r0Var = (d9r0) this.e;
                com.vk.lists.c cVar2 = (com.vk.lists.c) this.d;
                List list = (List) obj;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        b9r0 b9r0Var = d9r0Var.a;
                        w1i0 w1i0Var = b9r0Var.g;
                        if (this.c) {
                            ArrayList arrayList2 = w1i0Var.d;
                            arrayList2.clear();
                            arrayList2.addAll(arrayList);
                            w1i0Var.notifyDataSetChanged();
                            VkTopBar vkTopBar = b9r0Var.d;
                            if (vkTopBar == null) {
                                vkTopBar = null;
                            }
                            awt0.q(vkTopBar);
                        } else {
                            ArrayList arrayList3 = w1i0Var.d;
                            int size = arrayList3.size();
                            arrayList3.addAll(arrayList);
                            w1i0Var.notifyItemRangeInserted(size, arrayList.size());
                        }
                        AppsHorizontalListSection appsHorizontalListSection = (AppsHorizontalListSection) j5g.k0(list);
                        String str = appsHorizontalListSection != null ? appsHorizontalListSection.k : null;
                        if (str != null) {
                            cVar2.s(str.toString());
                        } else {
                            cVar2.s(null);
                        }
                        break;
                    } else {
                        AppsHorizontalListSection appsHorizontalListSection2 = (AppsHorizontalListSection) it.next();
                        SectionAppItem sectionAppItem = (SectionAppItem) j5g.a0(appsHorizontalListSection2.j);
                        x7a.d.e eVar = sectionAppItem != null ? new x7a.d.e(sectionAppItem, appsHorizontalListSection2.h) : null;
                        if (eVar != null) {
                            arrayList.add(eVar);
                        }
                    }
                }
            default:
                kfr0 kfr0Var = (kfr0) this.d;
                hii0 hii0Var = (hii0) this.e;
                tdr0 tdr0Var = kfr0Var.d;
                boolean z2 = this.c;
                tdr0Var.g.b(Boolean.valueOf(z2));
                WebApiApplication v = kfr0Var.a.v();
                if (v != null) {
                    v.S = Boolean.valueOf(z2);
                }
                int i = z2 ? R.string.vk_recommend_toast_message : R.string.vk_unrecommend_toast_message;
                if (hii0Var.c) {
                    SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                    if (superappUiRouterBridge == null) {
                        superappUiRouterBridge = null;
                    }
                    superappUiRouterBridge.j(((ggu0) kfr0Var.f.c).b.getString(i));
                }
                gzs<s3q0> gzsVar = hii0Var.a;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ dim0(d9r0 d9r0Var, boolean z, com.vk.lists.c cVar) {
        this.e = d9r0Var;
        this.c = z;
        this.d = cVar;
    }

    public /* synthetic */ dim0(kfr0 kfr0Var, boolean z, hii0 hii0Var) {
        this.d = kfr0Var;
        this.c = z;
        this.e = hii0Var;
    }
}
