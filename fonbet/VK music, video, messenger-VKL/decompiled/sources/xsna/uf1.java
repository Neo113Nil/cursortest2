package xsna;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.shortVideo.dto.ShortVideoPlaylistFullDto;
import com.vk.catalog2.common.dto.ui.UIBlockGroup;
import com.vk.catalog2.common.ui.mvp.holder.group.GroupRedesignCardWithBottomBtnVh;
import com.vk.comments.core.BoardComment;
import com.vk.community.design.view.components.catalog.CommunityCardView;
import com.vk.contacts.AndroidContact;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.dto.attaches.AttachGift;
import com.vk.dto.attaches.AttachWithImage;
import com.vk.dto.common.GroupsSuggestions;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.hints.HintId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.photo.Photo;
import com.vk.dto.user.RequestUserProfile;
import com.vk.ecomm.reviews.impl.allreviews.presentation.c;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.home.HomeFragment2;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.DialogMember;
import com.vk.im.external.AudioTrack;
import com.vk.im.ui.components.attaches_history.attaches.model.audio.AudioAttachListItem;
import com.vk.im.ui.components.attaches_history.attaches.model.audio.AudioAttachesState;
import com.vk.im.ui.components.common.MemberAction;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.log.L;
import com.vk.mediapicker.impl.presentation.mvi.MediaPickerMviState;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.notifications.core.item.NotificationImage;
import com.vk.notifications.core.item.a;
import com.vk.photos.root.albumdetails.presentation.i;
import com.vk.photos.root.albumdetails.presentation.k;
import com.vk.photos.root.albumdetails.presentation.views.AlbumDetailsRecyclerPaginatedView;
import com.vk.profile.core.tabs.ui.clips.Clips;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import com.vkontakte.android.data.groups.FullSourceJoinApi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.a3p0;
import xsna.azb;
import xsna.cu5;
import xsna.cwb0;
import xsna.eqe;
import xsna.gte;
import xsna.ic4;
import xsna.jc4;
import xsna.kqe;
import xsna.lru;
import xsna.p9k;
import xsna.pmx;
import xsna.rfb;
import xsna.wgb;
import xsna.xro0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class uf1 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ uf1(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:86:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0254  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        String str;
        Context context;
        String string;
        String a;
        MobileOfficialAppsCoreNavStat$EventScreen a2;
        int i = this.b;
        int i2 = 6;
        int i3 = 3;
        Throwable th = null;
        r5 = false;
        r5 = false;
        boolean z = false;
        int i4 = 1;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                gg1 gg1Var = (gg1) obj3;
                gg1Var.p.b(i.e.a);
                gg1Var.X((Photo) obj2);
                return s3q0.a;
            case 1:
                com.vk.photos.root.albumdetails.presentation.c cVar = (com.vk.photos.root.albumdetails.presentation.c) obj3;
                RecyclerView recyclerView = cVar.j;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj2;
                k.c cVar2 = (k.c) obj;
                k.c.a aVar = cVar2.e;
                List<k.c.C1491c> list = cVar2.b;
                cVar.E = cVar2;
                ef1 ef1Var = cVar.o;
                mg1 mg1Var = cVar.t;
                gf1 gf1Var = cVar.p;
                ph1 ph1Var = cVar.q;
                AlbumDetailsRecyclerPaginatedView albumDetailsRecyclerPaginatedView = cVar.g;
                Throwable th2 = cVar2.d;
                albumDetailsRecyclerPaginatedView.setSwipeRefreshEnabled(th2 == null);
                if (th2 != null) {
                    recyclerView.setItemAnimator(null);
                    EmptyList emptyList = EmptyList.b;
                    ph1Var.submitList(emptyList);
                    mg1Var.submitList(emptyList);
                    ef1Var.submitList(emptyList);
                    cVar.r.submitList(emptyList);
                    gf1Var.submitList(Collections.singletonList(new pmx.b(th2)), new gh1(new q(cVar, i4), 0));
                    return s3q0.a;
                }
                if (list.isEmpty()) {
                    recyclerView.setItemAnimator(null);
                    gf1Var.submitList(Collections.singletonList(pmx.a.a));
                } else {
                    if (recyclerView.getItemAnimator() == null) {
                        recyclerView.setItemAnimator(cVar.F);
                    }
                    gf1Var.submitList(EmptyList.b);
                }
                albumDetailsRecyclerPaginatedView.x();
                if (ref$BooleanRef.element) {
                    d920 d920Var = cVar.u;
                    int indexOf = d920Var.c.indexOf(ph1Var);
                    int i5 = 0;
                    int i6 = 0;
                    while (i5 < indexOf) {
                        i6 = d920Var.c.get(i5).getItemCount() + i6;
                        i5++;
                        th = th;
                    }
                    Throwable th3 = th;
                    int i7 = 0;
                    for (Object obj4 : list) {
                        int i8 = i7 + 1;
                        if (i7 < 0) {
                            e43.t();
                            throw th3;
                        }
                        cVar.G.y(i7 + i6, epx.f(((k.c.C1491c) obj4).b, Boolean.TRUE));
                        i7 = i8;
                        i4 = i4;
                    }
                }
                ph1Var.submitList(list);
                k.c.b bVar = cVar2.c;
                if (bVar instanceof k.c.b.a) {
                    albumDetailsRecyclerPaginatedView.Fe();
                } else if (epx.f(bVar, k.c.b.C1490b.a)) {
                    albumDetailsRecyclerPaginatedView.lb();
                } else {
                    if (bVar != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    albumDetailsRecyclerPaginatedView.j();
                }
                s3q0 s3q0Var = s3q0.a;
                if (cVar2.a) {
                    albumDetailsRecyclerPaginatedView.K9();
                } else {
                    albumDetailsRecyclerPaginatedView.Mk();
                }
                Collection singletonList = aVar != null ? Collections.singletonList(aVar) : EmptyList.b;
                cVar.D = !singletonList.isEmpty();
                ef1Var.submitList(singletonList);
                Context context2 = cVar.b;
                HashSet hashSet = iah0.a;
                int size = (((fnj.c(context2) || iah0.s(context2)) ? 3 : 6) - (list.size() % ((fnj.c(context2) || iah0.s(context2)) ? 3 : 6))) % ((fnj.c(context2) || iah0.s(context2)) ? 3 : 6);
                ArrayList arrayList = new ArrayList(size);
                for (int i9 = 0; i9 < size; i9++) {
                    arrayList.add(s3q0.a);
                }
                cVar.s.submitList(arrayList);
                Integer num = cVar2.f;
                mg1Var.submitList(num == null ? EmptyList.b : Collections.singletonList(new e6s(num.intValue())));
                cVar.b(aVar, recyclerView);
                return s3q0.a;
            case 2:
                w4p0 w4p0Var = (w4p0) obj3;
                r820 r820Var = (r820) obj2;
                tny tnyVar = (tny) obj;
                if (w4p0Var == null) {
                    return s3q0.a;
                }
                HintId hintId = w4p0Var.a;
                if (hintId == HintId.ECOMM_STOREFRONT_VIEWED_PRODUCTS_USER || hintId == HintId.ECOMM_STOREFRONT_VIEWED_PRODUCTS_ADMIN) {
                    r820Var.invoke(jgz.p(tnyVar).z(tnyVar, true));
                }
                return s3q0.a;
            case 3:
                op20 op20Var = (op20) obj2;
                String str2 = (String) obj;
                if (((WebApiApplication) obj3).B) {
                    throw new IllegalArgumentException("Internal VK UI not supported right now");
                }
                op20Var.c.a = str2;
                return bis.d(op20Var);
            case 4:
                nj3 nj3Var = (nj3) obj3;
                Ref$BooleanRef ref$BooleanRef2 = (Ref$BooleanRef) obj2;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (!booleanValue) {
                    nj3Var.k.d(false);
                } else if (!nj3Var.k.y) {
                    ref$BooleanRef2.element = true;
                }
                nj3Var.k.y = booleanValue;
                nj3Var.l.a = !booleanValue;
                return s3q0.a;
            case 5:
                AudioAttachListItem audioAttachListItem = (AudioAttachListItem) obj2;
                jc4 jc4Var = (jc4) ((ic4.a) obj3).l.a;
                js4 js4Var = jc4Var.u;
                int i10 = jc4.a.$EnumSwitchMapping$0[audioAttachListItem.e.ordinal()];
                if (i10 == 1) {
                    List<AudioAttachListItem> list2 = ((AudioAttachesState) jc4Var.w.b.P0()).f;
                    ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new AudioTrack(((AudioAttachListItem) it.next()).b));
                    }
                    js4Var.f(arrayList2, new AudioTrack(audioAttachListItem.b), Long.valueOf(jc4Var.n.b));
                    js4Var.play();
                } else if (i10 == 2) {
                    js4Var.pause();
                } else {
                    if (i10 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    js4Var.play();
                }
                return s3q0.a;
            case 6:
                i600 i600Var = (i600) obj;
                ((eq4) obj3).c = i600Var;
                ((fh1) obj2).invoke(i600Var);
                return s3q0.a;
            case 7:
                ((yt4) obj3).b.h((hyg0) obj, (ut4) obj2);
                return s3q0.a;
            case 8:
                cu5.a aVar2 = (cu5.a) obj3;
                cu5 cu5Var = (cu5) obj2;
                xro0.a aVar3 = aVar2.p;
                if (aVar3 != null) {
                    aVar3.b();
                }
                aVar2.p = null;
                o7i o7iVar = cu5Var.b;
                if (o7iVar != null) {
                    o7iVar.i0(s3q0.a);
                }
                cu5Var.b = null;
                return s3q0.a;
            case 9:
                return z9a.s((z9a) obj3, (String) obj2, (List) obj, null, null, 28);
            case 10:
                wgb wgbVar = (wgb) obj3;
                io.reactivex.rxjava3.subjects.d<io.reactivex.rxjava3.functions.a> dVar = wgbVar.r;
                rfb.a.b bVar2 = (rfb.a.b) obj2;
                wgb.b bVar3 = (wgb.b) obj;
                gz9 gz9Var = wgbVar.b;
                gz9Var.a(new i4(i3, wgbVar, bVar2));
                sfb a3 = wgbVar.f.a(bVar2);
                gz9Var.a(new hj3(wgbVar, bVar2, a3, i4));
                qfb qfbVar = bVar3.a;
                qfb a4 = yyv.a(qfbVar, a3.a, bVar2.a);
                ProfilesInfo profilesInfo = bVar3.b;
                profilesInfo.Hb(a3.b);
                boolean m = a4.m();
                boolean Gb = profilesInfo.Gb();
                if (m) {
                    gz9Var.a(new yg(wgbVar, 13));
                    if (epx.f(a4.d(), qfbVar.d())) {
                        a4.d().clear();
                    } else {
                        dVar.onNext(new ugb(r5 ? 1 : 0, wgbVar, a4));
                    }
                } else if (Gb) {
                    gz9Var.a(new zg(wgbVar, 17));
                    dVar.onNext(new tgb(r5 ? 1 : 0, wgbVar, profilesInfo.Ab()));
                }
                wgbVar.e(wgb.b.a(bVar3, a4, profilesInfo, null, 0, false, m || Gb, false, 188));
                gz9Var.a(new ah(wgbVar, 12));
                return s3q0.a;
            case 11:
                int intValue = ((Integer) obj).intValue();
                ChatFragment.d dVar2 = ChatFragment.w1;
                int xb = ((AttachWithImage) ((List) obj3).get(intValue)).xb();
                com.vk.im.ui.components.msg_list.a aVar4 = ((ChatFragment) obj2).H0;
                return (aVar4 != null ? aVar4 : null).m1(xb);
            case 12:
                ((izs) obj3).invoke(((List) obj2).get(((ModalActionSheetListItem) obj).a));
                return s3q0.a;
            case 13:
                azb azbVar = (azb) obj3;
                DialogMember dialogMember = (DialogMember) obj2;
                switch (azb.b.$EnumSwitchMapping$1[((MemberAction) obj).ordinal()]) {
                    case 1:
                    case 2:
                        boolean z2 = dialogMember.h;
                        Peer peer = dialogMember.b;
                        if (z2) {
                            tsu tsuVar = azbVar.k;
                            if (tsuVar != null) {
                                xyb xybVar = (xyb) tsuVar.b;
                                if (xybVar.q.f) {
                                    xybVar.x.g(peer);
                                    break;
                                }
                            }
                        } else {
                            tsu tsuVar2 = azbVar.k;
                            if (tsuVar2 != null) {
                                xyb xybVar2 = (xyb) tsuVar2.b;
                                if (xybVar2.q.f) {
                                    xybVar2.x.f(peer);
                                    break;
                                }
                            }
                        }
                        break;
                    case 3:
                        bzb0.d(azbVar.a(), cwb0.f0.l, new j4(i2, azbVar, dialogMember), null, null, 28);
                        break;
                    case 4:
                        bzb0.d(azbVar.a(), cwb0.z0.l, new hc1(5, azbVar, dialogMember), null, null, 28);
                        break;
                    case 5:
                        azbVar.a().b(new cwb0.i(0), new gb(7, azbVar, dialogMember), null);
                        break;
                    case 6:
                        tsu tsuVar3 = azbVar.k;
                        if (tsuVar3 != null) {
                            xyb xybVar3 = (xyb) tsuVar3.b;
                            if (xybVar3.q.f) {
                                xybVar3.x.c(dialogMember.b);
                                break;
                            }
                        }
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return s3q0.a;
            case 14:
                ((afe) obj3).a.V1(((a3p0.a.C2519a) obj2).e);
                return s3q0.a;
            case 15:
                yse yseVar = (yse) obj3;
                gte gteVar = (gte) obj2;
                yseVar.T(new bte((ShortVideoPlaylistFullDto) obj));
                UserId userId = yseVar.g;
                wjs0.a(new twr0(userId));
                iqe.a.onNext(new kqe.a(userId));
                hqe hqeVar = yseVar.j;
                if (hqeVar != null) {
                    hqeVar.b(new eqe.d(yseVar.i, ((gte.a) gteVar).b.a.c));
                }
                return s3q0.a;
            case 16:
                xeg xegVar = (xeg) obj3;
                qhi0 qhi0Var = (qhi0) obj2;
                sd9 sd9Var = xegVar.f;
                int intValue2 = ((Integer) obj).intValue();
                io.reactivex.rxjava3.subjects.d<rag> dVar3 = xegVar.k;
                n4g0 n4g0Var = dVar3.P0().a;
                if (n4g0Var != null) {
                    long j = n4g0Var.b.b;
                    if (j > 0) {
                        string = n4g0Var.d;
                    } else if (j < 0 && (context = xegVar.d) != null) {
                        string = context.getString(R.string.comment_to_community);
                    }
                    str = string;
                    n4g0 n4g0Var2 = dVar3.P0().a;
                    Integer valueOf = n4g0Var2 != null ? Integer.valueOf(n4g0Var2.a) : null;
                    sd9Var.getClass();
                    UserId userId2 = qhi0Var.a;
                    ArrayList arrayList3 = qhi0Var.d;
                    String str3 = qhi0Var.c;
                    Boolean bool = qhi0Var.e;
                    return BoardComment.zb(intValue2, str3, arrayList3, valueOf != null ? valueOf.intValue() : 0, userId2, bool == null ? bool.booleanValue() : false, str);
                }
                str = null;
                n4g0 n4g0Var22 = dVar3.P0().a;
                if (n4g0Var22 != null) {
                }
                sd9Var.getClass();
                UserId userId22 = qhi0Var.a;
                ArrayList arrayList32 = qhi0Var.d;
                String str32 = qhi0Var.c;
                Boolean bool2 = qhi0Var.e;
                return BoardComment.zb(intValue2, str32, arrayList32, valueOf != null ? valueOf.intValue() : 0, userId22, bool2 == null ? bool2.booleanValue() : false, str);
            case 17:
                ((dgh) obj3).z((Clips) obj2);
                return s3q0.a;
            case 18:
                p9k p9kVar = (p9k) obj3;
                io.reactivex.rxjava3.internal.operators.single.c cVar3 = (io.reactivex.rxjava3.internal.operators.single.c) obj2;
                it80 it80Var = (it80) obj;
                if (!it80Var.a()) {
                    return io.reactivex.rxjava3.core.x.k(p9k.b.a.a);
                }
                AndroidContact androidContact = (AndroidContact) it80Var.a;
                return p9kVar.a.C(cVar3, new r8j(androidContact, false)).l(new l7(new n6f(androidContact, 9), 15));
            case 19:
                GroupRedesignCardWithBottomBtnVh groupRedesignCardWithBottomBtnVh = (GroupRedesignCardWithBottomBtnVh) obj3;
                Context context3 = ((CommunityCardView) obj2).getContext();
                UIBlockGroup uIBlockGroup = groupRedesignCardWithBottomBtnVh.e;
                Group group = uIBlockGroup != null ? uIBlockGroup.y : null;
                FullSourceJoinApi.EntryServiceType entryServiceType = FullSourceJoinApi.EntryServiceType.COMMUNITY;
                String h = FullSourceJoinApi.SourceType.COMPILATION_CAROUSEL_FOR_U.h();
                dha dhaVar = groupRedesignCardWithBottomBtnVh.h;
                if (dhaVar == null || (a2 = dhaVar.a()) == null || (a = a2.name()) == null) {
                    a = com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.GROUPS_LIST);
                }
                groupRedesignCardWithBottomBtnVh.h(context3, group, entryServiceType, h, a);
                return s3q0.a;
            case 20:
                com.vk.lists.c cVar4 = (com.vk.lists.c) obj3;
                lru.a aVar5 = (lru.a) obj2;
                kru kruVar = (kru) obj;
                String s1 = kruVar.s1();
                cVar4.s(s1);
                if (s1 != null && s1.length() != 0 && !kruVar.getItems().isEmpty()) {
                    z = true;
                }
                cVar4.r(z);
                GroupsSuggestions groupsSuggestions = ((lru) aVar5.m).g;
                groupsSuggestions.k = s1;
                groupsSuggestions.l.addAll(kruVar.getItems());
                aVar5.q.setItems(lru.a.q6((lru) aVar5.m));
                return s3q0.a;
            case 21:
                int i11 = HomeFragment2.x0;
                ((HomeFragment2) obj3).po((List) obj2, (ArrayList) obj);
                return s3q0.a;
            case 22:
                eqx eqxVar = (eqx) obj3;
                dqx dqxVar = (dqx) obj2;
                if (eqxVar.h6(dqxVar)) {
                    dqxVar.c = !dqxVar.c;
                    eqxVar.j6(dqxVar);
                    eqxVar.l.invoke(eqxVar.i6(dqxVar));
                }
                return s3q0.a;
            case 23:
                ft00 ft00Var = (ft00) obj3;
                com.vk.ecomm.reviews.impl.allreviews.presentation.b bVar4 = (com.vk.ecomm.reviews.impl.allreviews.presentation.b) obj2;
                List<a610> list3 = ft00Var.e;
                int size2 = list3.size();
                for (int i12 = ft00Var.d + 1; i12 < size2; i12++) {
                    if (!list3.get(i12).g) {
                        bVar4.T(new c.d.b(i12));
                        return s3q0.a;
                    }
                }
                return s3q0.a;
            case 24:
                ((com.vk.newsfeed.posting.market_picker.presentation.base.view.f) obj3).i.add(Integer.valueOf(((Photo) obj2).c));
                return s3q0.a;
            case 25:
                MediaPickerMviState mediaPickerMviState = (MediaPickerMviState) ((com.vk.mediapicker.impl.presentation.mvi.b) obj3).b.getCurrentState();
                ArrayList arrayList4 = new ArrayList(((MediaPickerMviState) obj).f);
                arrayList4.add((MediaStoreEntry) obj2);
                s3q0 s3q0Var2 = s3q0.a;
                return MediaPickerMviState.a(mediaPickerMviState, 0, null, false, arrayList4, null, 47);
            case 26:
                AttachGift attachGift = (AttachGift) obj2;
                pk30 pk30Var = ((wq30) obj3).u;
                if (pk30Var != null) {
                    pk30Var.k(attachGift);
                }
                return s3q0.a;
            case 27:
                L.i((Throwable) obj);
                ((mw50) obj3).c((RequestUserProfile) obj2);
                return s3q0.a;
            case 28:
                a.c cVar5 = (a.c) obj3;
                List<NotificationImage> list4 = cVar5.a;
                ((nvy) obj).e(list4.size(), null, new vr3(new gz30(4), list4), new jai(802480018, new wr3(list4, cVar5, (izs) obj2), true));
                return s3q0.a;
            default:
                List list5 = (List) obj;
                com.vk.music.offline.api.domain.download.a aVar6 = ((dn80) obj3).f;
                ArrayList arrayList5 = new ArrayList();
                for (Object obj5 : (ArrayList) obj2) {
                    if (list5.contains(((MusicTrack) obj5).Fb())) {
                        arrayList5.add(obj5);
                    }
                }
                aVar6.f(arrayList5);
                return s3q0.a;
        }
    }
}
