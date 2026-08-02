package xsna;

import android.content.Context;
import com.vk.catalog2.common.ui.holders.group.GroupSubscriptionState;
import com.vk.dto.common.data.VKList;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupSuggestion;
import com.vk.lists.ListDataSet;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.profile.user.impl.ui.b;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import xsna.cvd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class fkj implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ fkj(com.vk.lists.c cVar, boolean z, pru pruVar) {
        this.b = 2;
        this.d = cVar;
        this.c = z;
        this.e = pruVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [com.vk.catalog2.common.ui.holders.group.BaseGroupVh, com.vk.catalog2.common.ui.holders.group.a$a] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                gkj gkjVar = (gkj) this.d;
                hpd0 hpd0Var = (hpd0) this.e;
                mkj mkjVar = (mkj) obj;
                List<hpd0> list = mkjVar.c;
                Context context = gkjVar.c;
                boolean z = this.c;
                break;
            case 1:
                Group group = (Group) this.d;
                com.vk.catalog2.common.ui.holders.group.a aVar = (com.vk.catalog2.common.ui.holders.group.a) this.e;
                if ((this.c || !group.n()) && !group.C()) {
                    aVar.b.c();
                } else {
                    cvk.u(R.string.community_send_request_toast, false);
                }
                aVar.f = (group.j || group.C == 4) ? GroupSubscriptionState.RecentlySubscribed : GroupSubscriptionState.NotSubscribed;
                aVar.f();
                break;
            case 2:
                com.vk.lists.c cVar = (com.vk.lists.c) this.d;
                pru pruVar = (pru) this.e;
                ListDataSet<GroupSuggestion> listDataSet = pruVar.g;
                kru kruVar = (kru) obj;
                String s1 = kruVar.s1();
                cVar.s(s1);
                cVar.r((s1 == null || s1.length() == 0 || kruVar.getItems().isEmpty()) ? false : true);
                if (this.c) {
                    String r = kruVar.r();
                    pruVar.d = (r == null || r.length() == 0) ? pruVar.d : kruVar.r();
                    String title = kruVar.getTitle();
                    if (title != null && title.length() != 0) {
                        pruVar.f = kruVar.getTitle();
                        pruVar.b.m(kruVar.getTitle());
                    }
                    listDataSet.setItems(kruVar.getItems());
                } else {
                    listDataSet.n0(kruVar.getItems());
                }
                break;
            default:
                onq0 onq0Var = (onq0) this.d;
                iea0 iea0Var = (iea0) this.e;
                Pair pair = (Pair) obj;
                it80 it80Var = (it80) pair.i();
                it80 it80Var2 = (it80) pair.j();
                VKList vKList = (VKList) it80Var.a;
                Pair pair2 = (Pair) it80Var2.a;
                VKList vKList2 = pair2 != null ? (VKList) pair2.i() : null;
                boolean z2 = !(pair2 != null ? ((Boolean) pair2.j()).booleanValue() : false);
                boolean z3 = this.c;
                if (z3 && ((vKList == null || vKList.isEmpty()) && (vKList2 == null || vKList2.isEmpty()))) {
                    wmq0.B(onq0Var, iea0Var, CommunityProfileContentItem.State.EMPTY, null, 4);
                } else {
                    VKList vKList3 = vKList2;
                    iea0 i = iea0.i(iea0Var, null, null, null, null, false, false, null, null, null, 16383);
                    if (vKList != null) {
                        ArrayList arrayList = new ArrayList();
                        cvd0.d dVar = i.j;
                        if (dVar != null) {
                            arrayList.addAll(dVar.a);
                        }
                        arrayList.addAll(vKList);
                        i = iea0.i(i, new cvd0.d(arrayList, EmptySet.b, vKList.i()), null, null, null, myc0.f(vKList.j()), false, vKList.j(), z3 ? CommunityProfileContentItem.State.LOADED : i.s, z3 ? i.u : CommunityProfileContentItem.State.LOADED, 13742);
                    }
                    if (vKList3 != null) {
                        ArrayList arrayList2 = new ArrayList();
                        cvd0.c cVar2 = i.k;
                        if (cVar2 != null) {
                            arrayList2.addAll(cVar2.a);
                        }
                        arrayList2.addAll(vKList3);
                        if (i.l.h()) {
                            i = iea0.i(i, null, new cvd0.c(arrayList2), null, String.valueOf(arrayList2.size()), z2, false, null, z3 ? CommunityProfileContentItem.State.LOADED : i.s, z3 ? i.u : CommunityProfileContentItem.State.LOADED, 13797);
                        } else {
                            i = iea0.i(i, null, new cvd0.c(arrayList2), null, null, false, z2, null, null, null, 16349);
                        }
                    }
                    if (z3) {
                        CommunityProfileContentItem.ContentType contentType = i.l;
                        cvd0.c cVar3 = i.k;
                        cvd0.d dVar2 = i.j;
                        if (contentType.l()) {
                            ArrayList arrayList3 = dVar2 != null ? dVar2.a : null;
                            if (arrayList3 == null || arrayList3.isEmpty()) {
                                i = iea0.i(i, null, null, CommunityProfileContentItem.ContentType.ALBUMS, null, false, false, null, null, null, 16379);
                            }
                        }
                        if (contentType.l()) {
                            ArrayList arrayList4 = cVar3 != null ? cVar3.a : null;
                            if (arrayList4 == null || arrayList4.isEmpty()) {
                                i = iea0.i(i, null, null, CommunityProfileContentItem.ContentType.ITEMS, null, false, false, null, null, null, 16379);
                            }
                        }
                        if (contentType.h()) {
                            ArrayList arrayList5 = dVar2 != null ? dVar2.a : null;
                            if (arrayList5 != null && !arrayList5.isEmpty()) {
                                i = iea0.i(i, null, null, CommunityProfileContentItem.ContentType.MIXED, null, false, false, null, null, null, 16379);
                            }
                        }
                        if (contentType.j()) {
                            ArrayList arrayList6 = cVar3 != null ? cVar3.a : null;
                            if (arrayList6 != null && !arrayList6.isEmpty()) {
                                i = iea0.i(i, null, null, CommunityProfileContentItem.ContentType.MIXED, null, false, false, null, null, null, 16379);
                            }
                        }
                    }
                    izs<? super com.vk.profile.user.impl.ui.b, s3q0> izsVar = onq0Var.h;
                    (izsVar != null ? izsVar : null).invoke(new b.c(i));
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ fkj(Object obj, Object obj2, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = z;
    }

    public /* synthetic */ fkj(boolean z, Group group, com.vk.catalog2.common.ui.holders.group.a aVar) {
        this.b = 1;
        this.c = z;
        this.d = group;
        this.e = aVar;
    }
}
