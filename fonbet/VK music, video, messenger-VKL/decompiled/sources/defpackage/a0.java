package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.search.ModernSearchView;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsImStat$TypeImConversationsBannerItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.acw0;
import xsna.aeg0;
import xsna.ba7;
import xsna.bez;
import xsna.bi20;
import xsna.c5g;
import xsna.ca7;
import xsna.dlv0;
import xsna.drm0;
import xsna.dw20;
import xsna.dw30;
import xsna.e3m;
import xsna.g22;
import xsna.g5g;
import xsna.ga7;
import xsna.gw30;
import xsna.gzs;
import xsna.iid0;
import xsna.ij20;
import xsna.izs;
import xsna.j5g;
import xsna.l7r0;
import xsna.loh0;
import xsna.m8t0;
import xsna.mtk0;
import xsna.oa70;
import xsna.q7j0;
import xsna.s3q0;
import xsna.us6;
import xsna.vtk0;
import xsna.xh70;
import xsna.xwv0;
import xsna.yls;
import xsna.zak0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class a0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a0(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                String str = (String) obj2;
                q7j0 q7j0Var = (q7j0) obj;
                xwv0 xwv0Var = ((l0) obj3).d;
                if (xwv0Var != null) {
                    if (drm0.N(str)) {
                        str = xwv0Var.e();
                    }
                    xwv0Var.getView().kk(str, q7j0Var);
                }
                return s3q0.a;
            case 1:
                us6 us6Var = (us6) obj2;
                acw0 acw0Var = (acw0) obj;
                int i2 = us6.p1;
                Activity h = e3m.h(((ModernSearchView) obj3).getContext());
                if (h instanceof aeg0) {
                    us6Var.l1.dispose();
                    us6Var.l1 = vtk0.d().e(h, acw0Var, 10);
                }
                return s3q0.a;
            case 2:
                bi20 bi20Var = (bi20) obj2;
                return Boolean.valueOf(((ArrayList) obj3).add(bez.b(bi20Var, (List) obj, EmptyList.b, null, null, bi20Var.c, null, false, null, false, null, 524216)));
            case 3:
                g22 g22Var = (g22) obj3;
                yls ylsVar = (yls) obj;
                MobileOfficialAppsImStat$TypeImConversationsBannerItem.EventType eventType = MobileOfficialAppsImStat$TypeImConversationsBannerItem.EventType.CLICK_GIFTS_FOR_ALL;
                iid0 iid0Var = new iid0();
                MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                SchemeStat$TypeAction b = SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsImStat$TypeImConversationsBannerItem("friends_birthdays_modal", eventType, null), 3);
                iid0Var.f = c;
                iid0Var.g = b;
                iid0Var.q();
                List<ga7> list = ((ca7) obj2).d;
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    g5g.y(((ga7) it.next()).b, arrayList);
                }
                List R = j5g.R(arrayList);
                ArrayList arrayList2 = new ArrayList(c5g.u(R, 10));
                Iterator it2 = R.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((ba7) it2.next()).a);
                }
                g22Var.invoke(arrayList2);
                dw20 dw20Var = ylsVar.b;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
            case 4:
                return (dw30.a.C2765a) ((l7r0) obj3).d((ij20) obj2, (gw30) obj);
            case 5:
                ((dlv0) obj3).a();
                ((izs) obj2).invoke(new oa70.c(((xh70.a) ((xh70) obj)).a));
                return s3q0.a;
            case 6:
                izs izsVar = (izs) obj2;
                loh0.f fVar = (loh0.f) obj;
                if (((Boolean) ((mtk0) obj3).getValue()).booleanValue()) {
                    izsVar.invoke(fVar.a);
                }
                return s3q0.a;
            case 7:
                m8t0 m8t0Var = (m8t0) obj3;
                ((zak0) m8t0Var.b).setValue(Boolean.FALSE);
                ((ViewGroup) obj2).removeView((ComposeView) obj);
                m8t0Var.a.d.invoke();
                return s3q0.a;
            default:
                View view = (View) obj3;
                return "Can not apply ratio\nparams = " + view.getLayoutParams() + ", width = " + ((Integer) obj2) + ", height = " + ((Integer) obj) + ", view = " + view;
        }
    }
}
