package xsna;

import android.animation.AnimatorSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.play.core.review.ReviewInfo;
import com.vk.catalog.mvi.section.ui.entity.CatalogSectionState;
import com.vk.channels.api.Channel;
import com.vk.core.preference.Preference;
import com.vk.core.view.FutureDateTimePickerView;
import com.vk.dto.common.Peer;
import com.vk.dto.common.data.CallProducerButton;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Playlist;
import com.vk.dto.stickers.MsgFooterBannerConfig;
import com.vk.ecomm.cart.impl.points_map.ui.fragment.DeliveryPointsMapFragment;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.MsgReadAsLastData;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.im.engine.models.stories.ImStoryState;
import com.vk.im.itemlist.impl.presentation.fragment.ImItemListFragment;
import com.vk.instantjobs.InstantJob;
import com.vk.photo.editor.ivm.EditorMessage;
import com.vk.photo.editor.ivm.EditorState;
import com.vk.search.params.api.VkGroupsSearchParams;
import com.vk.search.params.api.domain.model.SearchLocation;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchGroupsCatalogRootVh;
import com.vk.superapp.api.dto.menu.SuperAppAnimationConfig;
import com.vk.toggle.features.SmbFeatures;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import xsna.bfz;
import xsna.by40;
import xsna.em20;
import xsna.f3t.d;
import xsna.i340;
import xsna.jsm;
import xsna.kbl0;
import xsna.kr20;
import xsna.lr20;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class wik implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wik(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v41, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean z;
        EmptyList emptyList;
        RecyclerView recyclerView;
        CallProducerButton callProducerButton;
        CallProducerButton callProducerButton2;
        Peer peer;
        Map<b5w, Msg> map;
        i8w i8wVar;
        ProfilesInfo profilesInfo;
        boolean z2;
        boolean z3;
        ProfilesSimpleInfo profilesSimpleInfo;
        MsgReadAsLastData msgReadAsLastData;
        int i = this.b;
        int i2 = 29;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                zik zikVar = (zik) obj2;
                gzs gzsVar = (gzs) obj;
                AnimatorSet animatorSet = zikVar.e;
                if (animatorSet != null && !zikVar.f) {
                    gzsVar.invoke();
                    return s3q0.a;
                }
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                zikVar.f = false;
                zikVar.a(false);
                AnimatorSet animatorSet2 = new AnimatorSet();
                zikVar.e = animatorSet2;
                we2.a(animatorSet2, new xik(0, gzsVar));
                AnimatorSet animatorSet3 = zikVar.e;
                if (animatorSet3 != null) {
                    zikVar.c(animatorSet3);
                }
                return s3q0.a;
            case 1:
                ((DeliveryPointsMapFragment) obj2).R = ((Boolean) obj).booleanValue();
                return s3q0.a;
            case 2:
                return ((alm) obj2).h.P0().b;
            case 3:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((izs) ((zak0) ((gwo) obj2).c).getValue()).invoke(bool);
                return s3q0.a;
            case 4:
                EditorState editorState = (EditorState) obj;
                b8f0 b8f0Var = (b8f0) ((com.vk.photo.editor.ivm.b) obj2).b;
                if (((EditorState) b8f0Var.b.getValue()).b() <= 0) {
                    return editorState;
                }
                ttk0 ttk0Var = b8f0Var.b;
                EditorState.b bVar = ((EditorState) ttk0Var.getValue()).c;
                EditorState.b bVar2 = ((EditorState) ttk0Var.getValue()).d.get(((EditorState) ttk0Var.getValue()).b() - 1);
                return EditorState.a(editorState, bVar2.a, pn00.t(bVar2.c), bVar2, null, EditorMessage.Source.History, new EditorState.a(true, bVar, bVar2), null, 200);
            case 5:
                CharSequence charSequence = (CharSequence) obj;
                Object obj3 = ((wmp) obj2).o;
                ((ump) (obj3 != null ? obj3 : null)).t(charSequence.toString());
                return s3q0.a;
            case 6:
                ((bq60) obj2).a(yo60.e.a.a);
                return s3q0.a;
            case 7:
                iui iuiVar = (iui) obj;
                iuiVar.a = new opq(iuiVar.a(new smf0(((cqq) obj2).f, new rr60())), iuiVar.a(new bqq()), iuiVar.a(new dqq()), 0);
                return s3q0.a;
            case 8:
                Dialog dialog = (Dialog) obj;
                List<b0s> list = (List) obj2;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (b0s b0sVar : list) {
                        long Mb = dialog.Mb();
                        cum0 cum0Var = b0sVar.d;
                        if ((Mb & cum0Var.a) == cum0Var.b) {
                            z = true;
                            return Boolean.valueOf(z);
                        }
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 9:
                return FutureDateTimePickerView.a((FutureDateTimePickerView) obj2, (Long) obj);
            case 10:
                return ((f3t) obj2).new d((ViewGroup) obj);
            case 11:
                GlobalSearchGroupsCatalogRootVh globalSearchGroupsCatalogRootVh = (GlobalSearchGroupsCatalogRootVh) obj2;
                VkGroupsSearchParams vkGroupsSearchParams = globalSearchGroupsCatalogRootVh.w;
                vkGroupsSearchParams.f = (SearchLocation) obj;
                vkGroupsSearchParams.h5(vkGroupsSearchParams);
                globalSearchGroupsCatalogRootVh.v.h(vkGroupsSearchParams);
                return s3q0.a;
            case 12:
                return new z5u((ViewGroup) obj, (sop) obj2);
            case 13:
                i7u i7uVar = (i7u) obj2;
                e6u e6uVar = (e6u) obj;
                mzp0 mzp0Var = i7uVar.d;
                n5u n5uVar = i7uVar.k;
                if (mzp0Var != null) {
                    mzp0Var.d(i7uVar.f);
                }
                if (e6uVar != null) {
                    i7uVar.g.setContent(new jai(-396095249, new hz7(2, e6uVar.h, new lbe(i7uVar, i2)), true));
                    n5uVar.i = new r41(e6uVar, 28);
                }
                if (e6uVar != null) {
                    boolean z4 = e6uVar.e;
                    k7u k7uVar = e6uVar.a;
                    List<k7u> list2 = e6uVar.c;
                    o5u o5uVar = e6uVar.b;
                    ?? arrayList = new ArrayList();
                    arrayList.add(new o6u(k7uVar));
                    SmbFeatures smbFeatures = SmbFeatures.PRODUCT_BUTTONS_REFACH;
                    smbFeatures.getClass();
                    if (com.vk.toggle.b.A.a(smbFeatures)) {
                        arrayList.add(new q5u(k7uVar, new r3d0((o5uVar == null || (callProducerButton2 = o5uVar.c) == null) ? null : new oad0(callProducerButton2.c), (o5uVar == null || (callProducerButton = o5uVar.d) == null) ? null : new a1i0(callProducerButton.c), (o5uVar == null || o5uVar.e == null) ? null : new qx9(z4), k7uVar.a.J)));
                    } else {
                        arrayList.add(new p5u(k7uVar, o5uVar != null ? o5uVar.a : true, z4, o5uVar != null ? o5uVar.b : null));
                    }
                    List<k7u> list3 = list2;
                    if (list3 != null && !list3.isEmpty()) {
                        arrayList.add(new t6u(0));
                        List<k7u> list4 = list2;
                        ArrayList arrayList2 = new ArrayList(c5g.u(list4, 10));
                        Iterator it = list4.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(new v6u((k7u) it.next()));
                        }
                        arrayList.addAll(arrayList2);
                    }
                    emptyList = arrayList;
                    if (e6uVar.f) {
                        arrayList.add(new r6u(0));
                        emptyList = arrayList;
                    }
                } else {
                    emptyList = EmptyList.b;
                }
                n5uVar.setItems(emptyList);
                if (e6uVar != null && e6uVar.f && (recyclerView = i7uVar.h) != null) {
                    recyclerView.smoothScrollToPosition(n5uVar.getItemCount() - 1);
                }
                return s3q0.a;
            case 14:
                wnu wnuVar = (wnu) obj;
                ec70 ec70Var = (ec70) ((tnu) obj2).d.getValue();
                List<kb70> list5 = wnuVar.i;
                int i3 = wnuVar.d;
                ec70Var.getClass();
                List a = ec70.a(i3, list5);
                HashSet hashSet = new HashSet();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : a) {
                    if (hashSet.add(((kb70) obj4).getKey())) {
                        arrayList3.add(obj4);
                    }
                }
                return arrayList3;
            case 15:
                ((Boolean) obj).getClass();
                ((gzs) ((zak0) ((jrv) obj2).d).getValue()).invoke();
                return s3q0.a;
            case 16:
                r7w r7wVar = (r7w) obj2;
                o6w o6wVar = (o6w) obj;
                qcy<Object>[] qcyVarArr = ImItemListFragment.S;
                f8w f8wVar = o6wVar.e;
                ArrayList arrayList4 = new ArrayList();
                Peer peer2 = o6wVar.b;
                n5w n5wVar = o6wVar.c;
                i8w i8wVar2 = o6wVar.d;
                p8w p8wVar = o6wVar.f;
                ProfilesInfo profilesInfo2 = n5wVar.c;
                ProfilesSimpleInfo Ob = profilesInfo2.Ob();
                d5w d5wVar = n5wVar.b;
                List<a5w> list6 = d5wVar.a;
                boolean z5 = d5wVar.f;
                boolean z6 = d5wVar.g;
                Map<b5w, Msg> map2 = d5wVar.b;
                for (a5w a5wVar : list6) {
                    if (a5wVar instanceof Dialog) {
                        peer = peer2;
                        rum rumVar = r7wVar.b;
                        Dialog dialog2 = (Dialog) a5wVar;
                        Msg msg = map2.get(dialog2.t3());
                        List<vh30> list7 = i8wVar2.a.get(dialog2.Zb());
                        if (list7 == null) {
                            list7 = EmptyList.b;
                        }
                        boolean contains = i8wVar2.b.contains(dialog2.Zb());
                        boolean contains2 = i8wVar2.c.contains(dialog2.Zb());
                        ImStoryState imStoryState = p8wVar.a.get(dialog2.Zb());
                        if (imStoryState == null) {
                            imStoryState = ImStoryState.NONE;
                        }
                        ImStoryState imStoryState2 = imStoryState;
                        if (dialog2.Gb()) {
                            cew cewVar = cew.b;
                            long longValue = dialog2.Sb().longValue();
                            cewVar.getClass();
                            msgReadAsLastData = cew.f(longValue);
                        } else {
                            msgReadAsLastData = null;
                        }
                        List<vh30> list8 = list7;
                        z2 = z5;
                        map = map2;
                        i8wVar = i8wVar2;
                        profilesInfo = profilesInfo2;
                        z3 = z6;
                        arrayList4.add(rumVar.b(dialog2, profilesInfo, msg, list8, contains, contains2, imStoryState2, msgReadAsLastData, true, peer));
                    } else {
                        peer = peer2;
                        map = map2;
                        i8wVar = i8wVar2;
                        profilesInfo = profilesInfo2;
                        z2 = z5;
                        z3 = z6;
                        if (a5wVar instanceof Channel) {
                            ngb ngbVar = r7wVar.a;
                            Channel channel = (Channel) a5wVar;
                            Msg msg2 = map.get(channel.R);
                            profilesSimpleInfo = Ob;
                            arrayList4.add(ngbVar.a(channel, msg2 instanceof MsgFromChannel ? (MsgFromChannel) msg2 : null, profilesSimpleInfo, p8wVar.a, true));
                            z5 = z2;
                            z6 = z3;
                            map2 = map;
                            profilesInfo2 = profilesInfo;
                            Ob = profilesSimpleInfo;
                            peer2 = peer;
                            i8wVar2 = i8wVar;
                        }
                    }
                    profilesSimpleInfo = Ob;
                    z5 = z2;
                    z6 = z3;
                    map2 = map;
                    profilesInfo2 = profilesInfo;
                    Ob = profilesSimpleInfo;
                    peer2 = peer;
                    i8wVar2 = i8wVar;
                }
                boolean z7 = z5;
                boolean z8 = z6;
                Iterator it2 = arrayList4.iterator();
                int i4 = 0;
                while (true) {
                    if (it2.hasNext()) {
                        hfz hfzVar = (hfz) it2.next();
                        if (!(hfzVar instanceof zfm)) {
                            if ((hfzVar instanceof j0b) && !((j0b) hfzVar).l) {
                            }
                            i4++;
                        } else if (((zfm) hfzVar).j.Q()) {
                            i4++;
                        }
                    } else {
                        i4 = -1;
                    }
                }
                if (1 <= i4 && i4 < e43.h(arrayList4)) {
                    arrayList4.add(i4, wrn.b);
                }
                bfz.a aVar = f8wVar.a;
                if (!(aVar instanceof bfz.a.b)) {
                    arrayList4.add(0, rum.a(aVar));
                }
                if (z8 || z7) {
                    arrayList4.add(new s990(arrayList4.isEmpty()));
                }
                jsm.a aVar2 = r7wVar.c;
                if (!z8 && !z7 && arrayList4.size() <= 2) {
                    bfz.a aVar3 = f8wVar.a;
                    bfz.a.g gVar = aVar3 instanceof bfz.a.g ? (bfz.a.g) aVar3 : null;
                    if (gVar == null ? false : epx.f(gVar.b.b, "dialogs_list_info_bar_connect_edu_chats")) {
                        arrayList4.add(em20.b.c);
                    } else if (aVar2.a() || !aVar2.c()) {
                        arrayList4.add(em20.c.c);
                    } else {
                        arrayList4.add(em20.a.c);
                    }
                }
                return new q7w(arrayList4);
            case 17:
                r100.a(((mrw) obj2).g, "Request review flow success, review info = " + ((ReviewInfo) obj));
                return s3q0.a;
            case 18:
                return CatalogSectionState.a((CatalogSectionState) obj, null, false, false, null, (Throwable) obj2, false, null, null, null, null, 8063);
            case 19:
                j03.l((Throwable) obj);
                dw20 dw20Var = ((com.vk.ecomm.catalog.impl.catalog.simple.a) obj2).l;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
            case 20:
                ((jz00) obj2).h.invoke((UserId) obj);
                return s3q0.a;
            case 21:
                jd10 jd10Var = (jd10) obj2;
                io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) obj;
                io.reactivex.rxjava3.disposables.c cVar2 = jd10Var.p;
                if (cVar2 != null) {
                    cVar2.dispose();
                }
                jd10Var.p = cVar;
                return s3q0.a;
            case 22:
                SuperAppAnimationConfig superAppAnimationConfig = (SuperAppAnimationConfig) obj2;
                k720 k720Var = k720.a;
                k720.Z(superAppAnimationConfig, (Triple) obj);
                return superAppAnimationConfig;
            case 23:
                kr20.c cVar3 = (kr20.c) obj2;
                Object obj5 = cVar3.l;
                if (obj5 == null) {
                    obj5 = null;
                }
                lr20.a aVar4 = obj5 instanceof lr20.a ? (lr20.a) obj5 : null;
                String str = aVar4 != null ? aVar4.e : null;
                if (str == null) {
                    str = "";
                }
                cVar3.m.invoke(str);
                return s3q0.a;
            case 24:
                return rsg0.w0(yfb.x(((o430) obj2).b.b.a(null))).l(new ai3(new tuq(12), i2));
            case 25:
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                ((xi30) obj2).getClass();
                HashMap<UserId, kbl0> hashMap = kbl0.b;
                kbl0 b = kbl0.a.b();
                MsgFooterBannerConfig msgFooterBannerConfig = new MsgFooterBannerConfig(null, null, null, null, null, 31, null);
                b.getClass();
                String jSONObject = msgFooterBannerConfig.e5().toString();
                String str2 = b.a;
                String Db = msgFooterBannerConfig.Db();
                Preference.H(str2, (Db.length() <= 0 || drm0.N(Db)) ? "stickers_msg_footer_banner_config" : "stickers_msg_footer_banner_config_".concat(Db), jSONObject);
                return s3q0.a;
            case 26:
                InstantJob instantJob = (InstantJob) obj;
                return Boolean.valueOf((instantJob instanceof si30) && ((si30) instantJob).c == ((Msg) obj2).b);
            case 27:
                i340.d dVar = (i340.d) obj2;
                dVar.b.clear();
                dVar.b.addAll((List) obj);
                dVar.c.set(true);
                return s3q0.a;
            case 28:
                return Boolean.valueOf(((vh40) obj2).b.B(o25.a().c(), (Playlist) obj) == 0);
            default:
                rw40 rw40Var = (rw40) obj2;
                lt3 lt3Var = (lt3) obj;
                if (lt3Var == null) {
                    rw40Var.H = false;
                    rw40Var.T(new by40.g0(null));
                    return s3q0.a;
                }
                rw40Var.T(by40.d.b);
                if (rw40Var.G) {
                    rw40Var.X(lt3Var);
                } else {
                    rw40Var.H = true;
                }
                return s3q0.a;
        }
    }
}
