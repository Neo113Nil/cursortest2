package xsna;

import android.view.View;
import androidx.compose.runtime.a;
import com.vk.catalog2.common.ui.core.video.view.FirstPinnedTabLayout;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.newsfeed.common.PostActions;
import com.vk.newsfeed.common.util.a;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.me70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class hz7 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hz7(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                vz7.a(ne7.I(1), (androidx.compose.runtime.a) obj, (List) obj4, (izs) obj3);
                break;
            case 1:
                int i2 = FirstPinnedTabLayout.h;
                break;
            case 2:
                f7u f7uVar = (f7u) obj4;
                lbe lbeVar = (lbe) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-396095249, intValue, -1, "com.vk.ecomm.market.goodpreview.presentation.view.GoodPreviewView.bindTopBar.<anonymous> (GoodPreviewView.kt:149)");
                    }
                    if (f7uVar == null) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        break;
                    } else {
                        rrv0.d(null, null, null, null, kai.c(1767274986, new ys0(3, f7uVar, lbeVar), aVar), aVar, 24576, 15);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    }
                } else {
                    aVar.h();
                }
                break;
            case 3:
                ((xp40) obj4).A0().c((String) obj);
                ((kea) obj3).o();
                break;
            case 4:
                final pq50 pq50Var = (pq50) obj4;
                final jr50 jr50Var = (jr50) obj3;
                View view = (View) obj;
                final List list = (List) obj2;
                com.vk.newsfeed.common.util.b bVar = new com.vk.newsfeed.common.util.b(jr50Var.c(), null);
                List<ajx> list2 = list;
                ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                for (ajx ajxVar : list2) {
                    arrayList.add(new b520(ajxVar.getTitle(), 0, ajxVar.getType(), ajxVar.b()));
                }
                bVar.i = arrayList;
                bVar.b = new z960() { // from class: xsna.oq50
                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
                    @Override // xsna.z960
                    public final void g(VkContextMenu vkContextMenu, int i3) {
                        Object obj5;
                        ?? r0 = pq50.L;
                        boolean contains = r0.keySet().contains(Integer.valueOf(i3));
                        pq50 pq50Var2 = pq50.this;
                        if (contains) {
                            String str = (String) r0.get(Integer.valueOf(i3));
                            if (str != null) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj5 = it.next();
                                        if (epx.f(((ajx) obj5).b(), str)) {
                                            break;
                                        }
                                    } else {
                                        obj5 = null;
                                        break;
                                    }
                                }
                                ajx ajxVar2 = (ajx) obj5;
                                if (ajxVar2 != null) {
                                    cjx cjxVar = pq50Var2.E;
                                    (cjxVar != null ? cjxVar : null).b(ajxVar2);
                                }
                            }
                        } else {
                            PostActions postActions = PostActions.ACTION_HIDE_AD_MY_TARGET_NATIVE_AD;
                            int h = postActions.h();
                            jr50 jr50Var2 = jr50Var;
                            if (i3 == h) {
                                if (vkContextMenu != null) {
                                    vkContextMenu.e(null);
                                }
                                pq50Var2.D.sa(new NewsfeedExternalAction.d.a(jr50Var2.c(), pq50Var2.t6(), postActions.h(), pq50Var2.getAbsoluteAdapterPosition()));
                            } else if (i3 == PostActions.ACTION_REPORT.h()) {
                                egz0 c = jr50Var2.d().c();
                                Iterable iterable = c != null ? c.b : null;
                                if (iterable == null) {
                                    iterable = EmptyList.b;
                                }
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj6 : iterable) {
                                    if (epx.f(((ajx) obj6).getType(), "complain")) {
                                        arrayList2.add(obj6);
                                    }
                                }
                                ArrayList arrayList3 = new ArrayList();
                                Iterator it2 = arrayList2.iterator();
                                while (it2.hasNext()) {
                                    String title = ((ajx) it2.next()).getTitle();
                                    if (title != null) {
                                        arrayList3.add(title);
                                    }
                                }
                                ((NewsfeedRouter) pq50Var2.F.getValue()).U(pq50Var2.itemView.getContext(), jr50Var2.c(), (String[]) arrayList3.toArray(new String[0]));
                            }
                        }
                        if (vkContextMenu != null) {
                            vkContextMenu.b();
                        }
                    }
                };
                bVar.a(view.getContext(), new a.AbstractC1374a.b(view)).g();
                break;
            case 5:
                ((Integer) obj2).getClass();
                ue70.b((me70.d) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 6:
                com.vk.messagetemplates.impl.keyboard.b bVar2 = (com.vk.messagetemplates.impl.keyboard.b) obj4;
                ck3 ck3Var = (ck3) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-226710512, intValue2, -1, "com.vk.messagetemplates.impl.keyboard.TemplatesKeyboardFactoryImpl.createView.<anonymous> (TemplatesKeyboardFactoryImpl.kt:56)");
                    }
                    bVar2.b(ck3Var, aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            default:
                d0l d0lVar = (d0l) obj4;
                com.vk.core.compose.component.datetime.d dVar = (com.vk.core.compose.component.datetime.d) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-108426078, intValue3, -1, "com.vk.core.compose.component.datetime.VkDatePickerDialog.<anonymous>.<anonymous> (VkDatePicker.kt:76)");
                    }
                    boolean z = d0lVar.f() != null;
                    boolean J = aVar3.J(d0lVar) | aVar3.J(dVar);
                    Object x = aVar3.x();
                    if (J || x == a.C0011a.a) {
                        x = new xg2(17, d0lVar, dVar);
                        aVar3.R(x);
                    }
                    bqv0.d(0, 0, aVar3, (gzs) x, z);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ hz7(Object obj, izs izsVar, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = izsVar;
    }
}
