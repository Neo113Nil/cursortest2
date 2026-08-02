package xsna;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.bridges.di.BridgeComponent;
import com.vk.common.links.LaunchContext;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.dto.common.Peer;
import com.vk.dto.common.data.VKList;
import com.vk.dto.polls.Poll;
import com.vk.ecomm.checklist.impl.presentation.CommunityCheckListFragment;
import com.vk.ecomm.reviews.impl.allreviews.presentation.c;
import com.vk.friends.impl.cleanup.presentation.fragment.FriendsCleanupFragment;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.ui.components.contacts.b;
import com.vk.im.ui.components.contacts.vc.ContactsViews;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.money.MoneyWebViewFragment;
import com.vk.money.createtransfer.chat.CreateChatTransferFragment;
import com.vk.profile.community.impl.ui.events.CommunityEventsFragment;
import com.vk.stickers.bottomsheets.LegoStickersBottomSheetDialog;
import com.vk.update.core.a;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import xsna.as30;
import xsna.cwb0;
import xsna.drz;
import xsna.hgh;
import xsna.jw00;
import xsna.mvg;
import xsna.nbu;
import xsna.qn60;
import xsna.swa;
import xsna.tlo0;
import xsna.vzx;
import xsna.xn50;
import xsna.y6u;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class dwg implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dwg(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02fd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02c6 A[LOOP:3: B:97:0x02c0->B:99:0x02c6, LOOP_END] */
    /* JADX WARN: Type inference failed for: r12v20, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v120, types: [java.lang.Object, xsna.drx] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.vk.core.view.components.placeholder.main.VkPlaceholder$b$c] */
    /* JADX WARN: Type inference failed for: r5v39, types: [xsna.tlo0] */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v7, types: [kotlin.collections.builders.ListBuilder] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.util.List] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        ?? r9;
        boolean z;
        Iterator it;
        List<hfz> list;
        Iterator it2;
        int i = 19;
        ?? r5 = 0;
        r7 = false;
        boolean z2 = false;
        switch (this.b) {
            case 0:
                CommunityCheckListFragment communityCheckListFragment = (CommunityCheckListFragment) this.c;
                int i2 = CommunityCheckListFragment.Y;
                mvg.i iVar = new mvg.i(((vwg) obj).b);
                communityCheckListFragment.getClass();
                xn50.a.c(communityCheckListFragment, iVar);
                return s3q0.a;
            case 1:
                CommunityEventsFragment communityEventsFragment = (CommunityEventsFragment) this.c;
                qcy<Object>[] qcyVarArr = CommunityEventsFragment.P;
                communityEventsFragment.eo().b((com.vk.profile.community.impl.ui.events.a) obj);
                return s3q0.a;
            case 2:
                ((hgh.b) this.c).n.invoke();
                return s3q0.a;
            case 3:
                n2i n2iVar = (n2i) this.c;
                int i3 = n2i.j1;
                maz.c(((BridgeComponent) m7m.d(n2iVar).a(fpf0.a(BridgeComponent.class))).p().e(), n2iVar.requireContext(), (String) obj, LaunchContext.A, null, null, 24);
                n2iVar.dismiss();
                return s3q0.a;
            case 4:
                bwt0.p0(((b6i) this.c).I, false);
                return s3q0.a;
            case 5:
                ((com.vk.im.ui.components.contacts.a) this.c).m.b((q2a0) obj);
                return s3q0.a;
            case 6:
                com.vk.im.ui.components.contacts.b bVar = (com.vk.im.ui.components.contacts.b) this.c;
                boolean z3 = bVar.j;
                gdj gdjVar = (gdj) obj;
                String str = gdjVar.f;
                sbj sbjVar = gdjVar.e;
                List<qtd0> list2 = gdjVar.a;
                if (str != null) {
                    Collection collection = (Collection) bVar.r;
                    HashMap hashMap = new HashMap(collection.size());
                    for (Object obj2 : collection) {
                        hashMap.put(Long.valueOf(((qtd0) obj2).G3()), obj2);
                    }
                    Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                    r9 = new ArrayList(list2.size());
                    p4g.a(new hei0(bVar.d, bVar.r, z3 && bVar.d().k.b, z3 && bVar.d().k.a), r9, bVar.f(ContactsViews.SELECTION_PREVIEW) && bVar.c);
                    ArrayList k = bVar.k(gdjVar.g, unmodifiableMap, new sc(bVar, 18));
                    int size = k.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        Object obj3 = k.get(i4);
                        if (bVar.g((t8j) obj3)) {
                            r9.add(obj3);
                        }
                    }
                    ArrayList k2 = bVar.k(sbjVar.i, unmodifiableMap, new tc(i));
                    int size2 = k2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        Object obj4 = k2.get(i5);
                        if (bVar.g((t8j) obj4)) {
                            r9.add(obj4);
                        }
                    }
                    if (!r9.isEmpty()) {
                        Iterator it3 = r9.iterator();
                        while (it3.hasNext()) {
                            if (((hfz) it3.next()) instanceof t8j) {
                            }
                        }
                    }
                    r9.clear();
                    if (bVar.l) {
                        r9.add(b770.b);
                    } else {
                        r9.add(a770.b);
                    }
                } else {
                    int i6 = 12;
                    if (bVar.i) {
                        Collection collection2 = (Collection) bVar.r;
                        HashMap hashMap2 = new HashMap(collection2.size());
                        for (Object obj5 : collection2) {
                            hashMap2.put(Long.valueOf(((qtd0) obj5).G3()), obj5);
                        }
                        Map unmodifiableMap2 = Collections.unmodifiableMap(hashMap2);
                        ArrayList arrayList = new ArrayList(list2.size());
                        List<k2i0> list3 = sbjVar.j;
                        List<? extends qtd0> list4 = sbjVar.h;
                        new vs6(1, unmodifiableMap2, Map.class, "containsKey", "containsKey(Ljava/lang/Object;)Z", 0, 2);
                        List<k2i0> list5 = list3;
                        ArrayList arrayList2 = new ArrayList(c5g.u(list5, 10));
                        Iterator it4 = list5.iterator();
                        if (it4.hasNext()) {
                            ((k2i0) it4.next()).getClass();
                            new ArrayList(c5g.u(null, 10));
                            throw null;
                        }
                        ArrayList v = c5g.v(arrayList2);
                        int size3 = v.size();
                        for (int i7 = 0; i7 < size3; i7++) {
                            Object obj6 = v.get(i7);
                            if (bVar.g((t8j) obj6)) {
                                arrayList.add(obj6);
                            }
                        }
                        ArrayList arrayList3 = new ArrayList(list4.size());
                        ArrayList k3 = bVar.k(list4, unmodifiableMap2, new vd1(i6));
                        int size4 = k3.size();
                        for (int i8 = 0; i8 < size4; i8++) {
                            Object obj7 = k3.get(i8);
                            if (bVar.g((t8j) obj7)) {
                                arrayList3.add(obj7);
                            }
                        }
                        ArrayList a = bVar.a(gdjVar, arrayList.isEmpty());
                        ListBuilder listBuilder = new ListBuilder(list2.size());
                        listBuilder.addAll(a);
                        listBuilder.addAll(arrayList3);
                        listBuilder.addAll(arrayList);
                        r9 = listBuilder.g();
                    } else {
                        Collection collection3 = (Collection) bVar.r;
                        HashMap hashMap3 = new HashMap(collection3.size());
                        for (Object obj8 : collection3) {
                            hashMap3.put(Long.valueOf(((qtd0) obj8).G3()), obj8);
                        }
                        Map unmodifiableMap3 = Collections.unmodifiableMap(hashMap3);
                        jgq jgqVar = gdjVar.k;
                        ArrayList arrayList4 = new ArrayList(list2.size());
                        ArrayList arrayList5 = new ArrayList(list2.size());
                        ArrayList k4 = bVar.k(list2, unmodifiableMap3, new tr0(bVar, 13));
                        int size5 = k4.size();
                        for (int i9 = 0; i9 < size5; i9++) {
                            Object obj9 = k4.get(i9);
                            if (bVar.g((t8j) obj9)) {
                                arrayList5.add(obj9);
                            }
                        }
                        arrayList4.addAll(bVar.a(gdjVar, arrayList5.isEmpty()));
                        boolean z4 = jgqVar.a;
                        int i10 = bVar.s + bVar.t;
                        p4g.a(new swa.a(z4, i10), arrayList4, z3 && i10 > 0);
                        boolean z5 = jgqVar.b;
                        int i11 = bVar.s;
                        p4g.a(new swa.b(z5, i11), arrayList4, z3 && i11 > 0);
                        ArrayList k5 = bVar.k(sbjVar.g, unmodifiableMap3, new xr0(23));
                        int size6 = k5.size();
                        for (int i12 = 0; i12 < size6; i12++) {
                            Object obj10 = k5.get(i12);
                            if (bVar.g((t8j) obj10)) {
                                arrayList4.add(obj10);
                            }
                        }
                        ArrayList k6 = bVar.k(sbjVar.e, unmodifiableMap3, new d40(24));
                        int size7 = k6.size();
                        for (int i13 = 0; i13 < size7; i13++) {
                            Object obj11 = k6.get(i13);
                            if (bVar.g((t8j) obj11)) {
                                arrayList4.add(obj11);
                            }
                        }
                        ArrayList k7 = bVar.k(sbjVar.h, unmodifiableMap3, new vd1(i6));
                        int size8 = k7.size();
                        for (int i14 = 0; i14 < size8; i14++) {
                            Object obj12 = k7.get(i14);
                            if (bVar.g((t8j) obj12)) {
                                arrayList4.add(obj12);
                            }
                        }
                        ArrayList k8 = bVar.k(sbjVar.d, unmodifiableMap3, new ur0(20));
                        int size9 = k8.size();
                        for (int i15 = 0; i15 < size9; i15++) {
                            Object obj13 = k8.get(i15);
                            if (bVar.g((t8j) obj13)) {
                                arrayList4.add(obj13);
                            }
                        }
                        arrayList4.addAll(arrayList5);
                        r9 = arrayList4;
                    }
                }
                return new b.a(gdjVar.i, sbjVar.p, r9, null);
            case 7:
                CreateChatTransferFragment createChatTransferFragment = (CreateChatTransferFragment) this.c;
                int i16 = CreateChatTransferFragment.F0;
                MoneyWebViewFragment.wo(createChatTransferFragment, (String) obj);
                dw20 dw20Var = createChatTransferFragment.B0;
                if (dw20Var != null) {
                    dw20Var.hide();
                }
                return s3q0.a;
            case 8:
                InfoBar infoBar = (InfoBar) obj;
                qkr0 qkr0Var = ((zam) this.c).h;
                if (qkr0Var != null) {
                    xam xamVar = qkr0Var.a;
                    xamVar.Z0(infoBar, CampaignEx.JSON_NATIVE_VIDEO_CLOSE);
                    xamVar.l.r().a(infoBar);
                }
                return s3q0.a;
            case 9:
                hpm hpmVar = (hpm) this.c;
                com.vk.im.engine.models.dialogs.b bVar2 = (com.vk.im.engine.models.dialogs.b) obj;
                vjm vjmVar = bVar2.d;
                String valueOf = String.valueOf(vjmVar.a());
                long j = bVar2.b;
                String[] strArr = {valueOf, String.valueOf(j)};
                tgl0 tgl0Var = hpmVar.b;
                tgl0Var.b().execSQL("UPDATE dialogs SET sort_id_server = ? WHERE id = ?", strArr);
                tgl0Var.b().execSQL("UPDATE dialog_weight SET x_sort_id_server = ? WHERE x_dialog_id = ? AND x_folder_id = ?", new Object[]{Long.valueOf(vjmVar.a()), Long.valueOf(j), -1});
                tgl0Var.b().execSQL("UPDATE dialog_weight SET x_sort_id_server = ? WHERE x_dialog_id = ? AND x_folder_id != ?", new Object[]{Integer.valueOf(vjmVar.c), Long.valueOf(j), -1});
                return s3q0.a;
            case 10:
                io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) obj;
                vtm f = ((com.vk.im.ui.components.dialogs_list.c) this.c).f();
                if (f != null) {
                    f.G.c(cwb0.r0.e, new r5i(cVar, 6));
                }
                return s3q0.a;
            case 11:
                hdo hdoVar = (hdo) this.c;
                Long l = (Long) obj;
                L l2 = L.a;
                l2.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l2, L.LogType.d, new Object[]{"Draft saved, draftId:" + l});
                }
                if (l.longValue() > 0) {
                    xe8 xe8Var = hdoVar.c;
                    xe8Var.getClass();
                    cuz.a((Context) xe8Var.b).c(new Intent("draft").putExtra("type", "draftAdded"));
                }
                return s3q0.a;
            case 12:
                u1c0 u1c0Var = (u1c0) this.c;
                u1c0 u1c0Var2 = (u1c0) obj;
                u1c0Var.d = u1c0Var2.d;
                u1c0Var.k = u1c0Var2.k;
                u1c0Var.l = u1c0Var2.l;
                u1c0Var.m = u1c0Var2.m;
                u1c0Var.n = u1c0Var2.n;
                return u1c0Var;
            case 13:
                ExtendedCommunityProfile extendedCommunityProfile = (ExtendedCommunityProfile) this.c;
                ptk ptkVar = (ptk) obj;
                if (extendedCommunityProfile != null) {
                    ((ExtendedCommunityProfile) ptkVar.a).D2 = extendedCommunityProfile.D2;
                }
                return new ptk(ptkVar.a, ptkVar.b);
            case 14:
                gtm gtmVar = (gtm) this.c;
                vzr vzrVar = (vzr) obj;
                Iterable h = vzrVar.e.isEmpty() ? gtmVar.a.Nb().h() : gtmVar.b;
                ArrayList arrayList6 = new ArrayList(c5g.u(h, 10));
                Iterator it5 = h.iterator();
                while (it5.hasNext()) {
                    arrayList6.add(Long.valueOf(((Peer) it5.next()).b));
                }
                Set S0 = j5g.S0(arrayList6);
                vzr a2 = vzr.a(vzrVar, null, null, null, null, gtmVar.a, false, null, null, null, null, 8175);
                Collection<wt90> values = vzrVar.a.values();
                ArrayList arrayList7 = new ArrayList(c5g.u(values, 10));
                Iterator it6 = values.iterator();
                while (it6.hasNext()) {
                    arrayList7.add(((wt90) it6.next()).c);
                }
                LinkedHashMap A = pzr.A(a2, arrayList7, S0);
                List<hfz> list6 = vzrVar.b;
                if (!(list6 instanceof Collection) || !list6.isEmpty()) {
                    Iterator it7 = list6.iterator();
                    while (it7.hasNext()) {
                        if (((hfz) it7.next()) instanceof gtz) {
                            z = true;
                            ArrayList u = pzr.u(A, z, false);
                            Collection<wt90> values2 = vzrVar.c.values();
                            ArrayList arrayList8 = new ArrayList(c5g.u(values2, 10));
                            it = values2.iterator();
                            while (it.hasNext()) {
                                arrayList8.add(((wt90) it.next()).c);
                            }
                            LinkedHashMap z6 = pzr.z(arrayList8, a2);
                            list = vzrVar.d;
                            if ((list instanceof Collection) || !list.isEmpty()) {
                                it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (((hfz) it2.next()) instanceof gtz) {
                                            z2 = true;
                                        }
                                    }
                                }
                            }
                            return vzr.a(a2, A, u, z6, pzr.u(z6, z2, true), null, false, null, null, null, null, 8176);
                        }
                    }
                }
                z = false;
                ArrayList u2 = pzr.u(A, z, false);
                Collection<wt90> values22 = vzrVar.c.values();
                ArrayList arrayList82 = new ArrayList(c5g.u(values22, 10));
                it = values22.iterator();
                while (it.hasNext()) {
                }
                LinkedHashMap z62 = pzr.z(arrayList82, a2);
                list = vzrVar.d;
                if (list instanceof Collection) {
                }
                it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                    }
                }
                return vzr.a(a2, A, u2, z62, pzr.u(z62, z2, true), null, false, null, null, null, null, 8176);
            case 15:
                FriendsCleanupFragment friendsCleanupFragment = (FriendsCleanupFragment) this.c;
                int i17 = FriendsCleanupFragment.W;
                VkPlaceholder vkPlaceholder = friendsCleanupFragment.fo().c;
                tlo0.a aVar = tlo0.Companion;
                String g = j03.g(friendsCleanupFragment.mo2getContext(), (Throwable) obj, R.string.error);
                aVar.getClass();
                vkPlaceholder.setMiddle(new VkPlaceholder.b(r5, new VkPlaceholder.b.C0859b(14, new tlo0.h(g)), true ? 1 : 0));
                return s3q0.a;
            case 16:
                VKList vKList = (VKList) this.c;
                qn60.c cVar2 = (qn60.c) obj;
                return new wmt(cVar2.a, cVar2.b, vKList, vKList.j());
            case 17:
                xnt xntVar = (xnt) this.c;
                vnt vntVar = xntVar.b;
                List list7 = (List) obj;
                if (list7.isEmpty()) {
                    vntVar.Zn(vntVar.i1, vntVar.j1, vntVar.k1);
                    RecyclerView recyclerView = vntVar.i1;
                    if (recyclerView != null) {
                        recyclerView.setVisibility(4);
                    }
                    View view = vntVar.j1;
                    if (view != null) {
                        view.setVisibility(0);
                    }
                    View view2 = vntVar.k1;
                    if (view2 != null) {
                        f4m.j(view2);
                    }
                    vntVar.l1.setItems(EmptyList.b);
                } else {
                    ArrayList arrayList9 = new ArrayList(list7.size() + 1);
                    Iterator it8 = list7.iterator();
                    while (it8.hasNext()) {
                        arrayList9.add(new uwz((qwz) it8.next()));
                    }
                    String str2 = xntVar.i;
                    if (str2 == null || drm0.N(str2)) {
                        arrayList9.add(twz.a);
                    }
                    vntVar.Zn(vntVar.i1, vntVar.j1, vntVar.k1);
                    RecyclerView recyclerView2 = vntVar.i1;
                    if (recyclerView2 != null) {
                        recyclerView2.setVisibility(0);
                    }
                    View view3 = vntVar.j1;
                    if (view3 != null) {
                        f4m.j(view3);
                    }
                    View view4 = vntVar.k1;
                    if (view4 != null) {
                        f4m.j(view4);
                    }
                    vntVar.l1.setItems(arrayList9);
                }
                return s3q0.a;
            case 18:
                k6u k6uVar = (k6u) this.c;
                y6u.d.c cVar3 = (y6u.d.c) obj;
                mzp0 mzp0Var = k6uVar.i;
                if (mzp0Var != null) {
                    mzp0Var.c(false);
                }
                k6uVar.T(cVar3);
                k6uVar.h.a("good_preview_counters", new jw00.d[]{jw00.a.c, jw00.c.c}, new fgh(k6uVar, i));
                return s3q0.a;
            case 19:
                ((jcu) this.c).d.invoke(nbu.b.b);
                return s3q0.a;
            case 20:
                ((eqv) this.c).d(null);
                return s3q0.a;
            case 21:
                ((e7w) this.c).b = (n5w) ((drz.a) obj).a;
                return s3q0.a;
            case 22:
                return new a.C1935a((wrw) obj, (vrw) this.c);
            case 23:
                ((as30.a) this.c).b();
                return s3q0.a;
            case 24:
                com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.c cVar4 = (com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.c) this.c;
                cVar4.c.a();
                com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.d dVar = cVar4.c;
                dVar.f(false);
                dVar.d((Poll) obj, true);
                return s3q0.a;
            case 25:
                ?? r1 = (drx) this.c;
                String message = ((Throwable) obj).getMessage();
                if (message != null) {
                    r1.getClass();
                    r5 = oq.d(tlo0.Companion, message);
                }
                r1.Y(r5);
                return s3q0.a;
            case 26:
                ((kzx) this.c).o.b(new vzx.a((Throwable) obj));
                return s3q0.a;
            case 27:
                LegoStickersBottomSheetDialog legoStickersBottomSheetDialog = (LegoStickersBottomSheetDialog) this.c;
                int i18 = LegoStickersBottomSheetDialog.d0;
                legoStickersBottomSheetDialog.getClass();
                return s3q0.a;
            case 28:
                mzz mzzVar = (mzz) this.c;
                jxz jxzVar = mzzVar.l;
                if (jxzVar != null) {
                    uxz uxzVar = mzzVar.n;
                    jxzVar.d(uxzVar != null ? uxzVar : null, mzzVar.itemView);
                }
                return Boolean.TRUE;
            default:
                ((com.vk.ecomm.reviews.impl.allreviews.presentation.b) this.c).T((c.e) obj);
                return s3q0.a;
        }
    }

    public /* synthetic */ dwg(gtm gtmVar, pzr pzrVar) {
        this.b = 14;
        this.c = gtmVar;
    }
}
