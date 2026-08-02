package xsna;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannedString;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.auth.entername.EnterProfilePresenter;
import com.vk.auth.main.AuthStatSender;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockGroupFilter;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.market.UIBlockMarketGroupInfoItem;
import com.vk.catalog2.common.dto.ui.market.UIBlockMarketItem;
import com.vk.catalog2.common.ui.mvp.holder.group.GroupHorizontalListItemVh;
import com.vk.clips.favorites.impl.ui.folders.picker.ClipsFavoritesFoldersPickerFragment;
import com.vk.clips.sdk.shared.api.recom.ShortVideoMyTargetMapperTracker;
import com.vk.clips.viewer.impl.grid.lists.fragments.AbstractClipsGridListFragment;
import com.vk.common.links.LaunchContext;
import com.vk.core.tips.Tooltip;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.dialogsscreen.impl.DialogsScreenFragment;
import com.vk.dto.common.Peer;
import com.vk.dto.group.Group;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.video.VideoNotificationsStatus;
import com.vk.ecomm.cart.impl.cart.ui.emptycart.EmptyCartRootViewHolder;
import com.vk.ecomm.cart.impl.common.models.geo.Coordinates;
import com.vk.ecomm.cart.impl.courier_map.ui.fragment.CourierMapFragment;
import com.vk.ecomm.market.goodpreview.presentation.GoodPreviewFragment;
import com.vk.games.presentation.catalog.GamesCatalogFragment;
import com.vk.home.HomeFragment2;
import com.vk.im.design.view.listitem.infobar.FriendsBirthdayInfoBarView;
import com.vk.im.engine.models.dialogs.TransitionData;
import com.vk.im.ui.components.contacts.SortOrder;
import com.vk.im.ui.components.contacts.b;
import com.vk.libvideo.bottomsheet.notifications.SubscriptionAction;
import com.vk.music.bottomsheets.audiobook.AudioBookBottomSheetLaunchPoint;
import com.vk.music.bottomsheets.audiobook.AudioBookPersonBottomSheetLaunchPoint;
import com.vk.music.playlist.display.audiobook.presentation.fragment.DisplayAudioBookChaptersFragment;
import com.vk.superapp.vkhealth.permissions.api.SelectedDataSource;
import com.vk.uxpolls.presentation.view.PollsWebView;
import com.vk.video.profile.presentation.VideoProfileFragmentOld;
import com.vk.video.profile.presentation.a;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.a5e;
import xsna.e3m;
import xsna.g0v;
import xsna.gfq;
import xsna.idn;
import xsna.ikv0;
import xsna.k840;
import xsna.kzj;
import xsna.o2j;
import xsna.o9t;
import xsna.q1x;
import xsna.tlo0;
import xsna.wlg;
import xsna.xl40;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class u4e implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u4e(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:203:0x0531, code lost:
    
        if (r2 == null) goto L204;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:238:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0661  */
    /* JADX WARN: Type inference failed for: r1v70, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v90, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v89, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        String str;
        Object[] objArr;
        ArrayList arrayList;
        String obj2;
        List singletonList;
        TransitionData transitionData;
        View findViewById;
        View findViewById2;
        int i;
        int i2 = this.b;
        str = "";
        int i3 = 4;
        int i4 = 6;
        int i5 = 8;
        int i6 = 2;
        Object obj3 = this.c;
        switch (i2) {
            case 0:
                ClipsFavoritesFoldersPickerFragment clipsFavoritesFoldersPickerFragment = (ClipsFavoritesFoldersPickerFragment) obj3;
                a5e a5eVar = (a5e) obj;
                if (!(a5eVar instanceof a5e.a)) {
                    ClipsFavoritesFoldersPickerFragment.a aVar = ClipsFavoritesFoldersPickerFragment.V;
                    throw new NoWhenBranchMatchedException();
                }
                p4e p4eVar = clipsFavoritesFoldersPickerFragment.T;
                p4e p4eVar2 = p4eVar != null ? p4eVar : null;
                i5 i5Var = new i5(i4, clipsFavoritesFoldersPickerFragment, a5eVar);
                if (p4eVar2.k != null) {
                    i5Var.invoke();
                } else {
                    p4eVar2.m = new i4(i3, p4eVar2, i5Var);
                }
                return s3q0.a;
            case 1:
                s7e.this.setRefreshing(((Boolean) obj).booleanValue());
                return s3q0.a;
            case 2:
                xde xdeVar = (xde) obj3;
                Pair pair = (Pair) obj;
                boolean booleanValue = ((Boolean) pair.d()).booleanValue();
                List<? extends nmv> list = (List) pair.g();
                if (xdeVar.b && list.isEmpty() && !booleanValue) {
                    xdeVar.c.b(v2u0.a);
                } else {
                    AbstractClipsGridListFragment abstractClipsGridListFragment = xdeVar.e;
                    if (abstractClipsGridListFragment != null) {
                        abstractClipsGridListFragment.po(list, true);
                    }
                }
                return s3q0.a;
            case 3:
                ShortVideoMyTargetMapperTracker shortVideoMyTargetMapperTracker = (ShortVideoMyTargetMapperTracker) obj3;
                Throwable th = (Throwable) obj;
                com.vk.metrics.eventtracking.b.a.a(th);
                if (shortVideoMyTargetMapperTracker != null) {
                    shortVideoMyTargetMapperTracker.a(ShortVideoMyTargetMapperTracker.MyTargetType.VIDEO_AD, th);
                }
                return s3q0.a;
            case 4:
                ((mdg) obj3).z7((Throwable) obj);
                return s3q0.a;
            case 5:
                VideoProfileFragmentOld.d dVar = ((wlg) obj3).c;
                switch (wlg.a.$EnumSwitchMapping$1[((SubscriptionAction) obj).ordinal()]) {
                    case 1:
                        dVar.invoke(new a.d(VideoNotificationsStatus.ALL));
                        break;
                    case 2:
                        dVar.invoke(new a.d(VideoNotificationsStatus.PREFERRED));
                        break;
                    case 3:
                        dVar.invoke(new a.d(VideoNotificationsStatus.NONE));
                        break;
                    case 4:
                        dVar.invoke(a.k0.b);
                        break;
                    case 5:
                        dVar.invoke(a.x.b);
                        break;
                    case 6:
                        dVar.invoke(a.m.b);
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return s3q0.a;
            case 6:
                ((a2j) obj3).T(new o2j.q(false));
                return s3q0.a;
            case 7:
                com.vk.im.ui.components.contacts.a aVar2 = (com.vk.im.ui.components.contacts.a) obj3;
                b.a aVar3 = (b.a) obj;
                boolean z = aVar3.a;
                List<hfz> list2 = aVar3.c;
                if (z) {
                    List<hfz> list3 = list2;
                    if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                        Iterator<T> it = list3.iterator();
                        while (it.hasNext()) {
                            if (((hfz) it.next()) instanceof m270) {
                                objArr = true;
                                arrayList = new ArrayList();
                                for (Object obj4 : list3) {
                                    if (obj4 instanceof t8j) {
                                        arrayList.add(obj4);
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    Iterator it2 = arrayList.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            if (((t8j) it2.next()).c != 1) {
                                                r7 = false;
                                            }
                                        }
                                    }
                                }
                                if (!list2.isEmpty() || objArr != false || r7) {
                                    return s3q0.a;
                                }
                            }
                        }
                    }
                    objArr = false;
                    arrayList = new ArrayList();
                    while (r2.hasNext()) {
                    }
                    if (!arrayList.isEmpty()) {
                    }
                    if (!list2.isEmpty()) {
                    }
                    return s3q0.a;
                }
                String str2 = aVar2.b1().d().f;
                aVar2.c1().c(list2, (str2 == null || str2.length() == 0 || aVar2.t != 2) ? aVar3.b : SortOrder.BY_ONLINE, aVar3.d);
                return s3q0.a;
            case 8:
                CourierMapFragment courierMapFragment = (CourierMapFragment) obj3;
                kzj kzjVar = (kzj) obj;
                lzj lzjVar = courierMapFragment.R;
                lzjVar.getClass();
                Context requireContext = courierMapFragment.requireContext();
                if (kzjVar instanceof kzj.a) {
                    courierMapFragment.kn().onBackPressed();
                } else if (kzjVar instanceof kzj.b) {
                    int i7 = q1x.f1;
                    qqe qqeVar = new qqe(lzjVar, i4);
                    dnh dnhVar = new dnh(lzjVar, i5);
                    String str3 = ((kzj.b) kzjVar).a;
                    q1x.b.a(qqeVar, dnhVar, str3 != null ? str3 : "", requireContext);
                } else if (kzjVar instanceof kzj.d) {
                    ikv0.a aVar4 = new ikv0.a(requireContext);
                    CharSequence a = tlo0.b.a(((kzj.d) kzjVar).a, requireContext);
                    if (a != null && (obj2 = a.toString()) != null) {
                        str = obj2;
                    }
                    aVar4.u = new ikv0.d(str, (String) null, (ikv0.d.a) null, 6);
                    aVar4.e = 2000L;
                    aVar4.n();
                } else if (kzjVar instanceof kzj.c) {
                    kzj.c cVar = (kzj.c) kzjVar;
                    nmh0 nmh0Var = (nmh0) lzjVar.b.getValue();
                    String str4 = cVar.a;
                    Coordinates coordinates = cVar.b;
                    nmh0Var.getClass();
                    nmh0.a(courierMapFragment, 528, str4, coordinates, true);
                }
                return s3q0.a;
            case 9:
                Peer peer = (Peer) obj3;
                com.vk.im.engine.models.dialogs.b bVar = (com.vk.im.engine.models.dialogs.b) obj;
                TransitionData transitionData2 = bVar.a0;
                if (transitionData2 == null) {
                    transitionData = new TransitionData((List<Long>) Collections.singletonList(Long.valueOf(peer.d)), (String) null);
                } else {
                    List<Long> list4 = transitionData2.b;
                    if (list4 != null) {
                        Set R0 = j5g.R0(list4);
                        R0.add(Long.valueOf(peer.d));
                        singletonList = j5g.O0(R0);
                        break;
                    }
                    singletonList = Collections.singletonList(Long.valueOf(peer.d));
                    transitionData = new TransitionData((List<Long>) singletonList, transitionData2.c);
                }
                return com.vk.im.engine.models.dialogs.b.a(bVar, null, null, null, 0, 0, 0, 0, 0, 0, false, null, null, null, null, null, false, null, false, null, null, null, false, null, null, null, null, 0, false, false, null, null, 0, transitionData, 0, -1, 1572863);
            case 10:
                DialogsScreenFragment dialogsScreenFragment = (DialogsScreenFragment) obj3;
                dialogsScreenFragment.n0 = ((Integer) obj).intValue();
                View view = dialogsScreenFragment.getView();
                View findViewById3 = view != null ? view.findViewById(R.id.vkim_fab) : null;
                if (findViewById3 != null) {
                    f4m.q(e3m.a(R.dimen.vkim_fab_bottom_margin, findViewById3.getContext()) + dialogsScreenFragment.n0 + dialogsScreenFragment.m0, findViewById3);
                }
                View view2 = dialogsScreenFragment.getView();
                if (view2 != null && (findViewById2 = view2.findViewById(R.id.audio_msg_player_container)) != null) {
                    f4m.q(dialogsScreenFragment.m0, findViewById2);
                }
                View view3 = dialogsScreenFragment.getView();
                if (view3 != null && (findViewById = view3.findViewById(R.id.vkim_transtion_max_banner_stub)) != null) {
                    f4m.q(dialogsScreenFragment.m0, findViewById);
                }
                return s3q0.a;
            case 11:
                DisplayAudioBookChaptersFragment displayAudioBookChaptersFragment = (DisplayAudioBookChaptersFragment) obj3;
                idn idnVar = (idn) obj;
                int i8 = DisplayAudioBookChaptersFragment.b0;
                if (idnVar.equals(idn.a.a)) {
                    h3p0.b(displayAudioBookChaptersFragment);
                } else {
                    int i9 = 3;
                    if (idnVar.equals(idn.n.a)) {
                        kmu0 kmu0Var = new kmu0(displayAudioBookChaptersFragment.requireContext(), tzp0.a(null, 3));
                        kmu0Var.U0(new jai(-1916481277, new jd4(displayAudioBookChaptersFragment, i5), true));
                        displayAudioBookChaptersFragment.R = kmu0Var.I0("AudioBookFreeBottomSheet");
                    } else if (idnVar.equals(idn.r.a)) {
                        displayAudioBookChaptersFragment.ho();
                    } else if (idnVar instanceof idn.m) {
                        com.vk.music.notifications.restriction.a aVar5 = k840.a.d;
                        if (aVar5 == null) {
                            aVar5 = null;
                        }
                        aVar5.a(((idn.m) idnVar).a, null);
                    } else if (idnVar instanceof idn.q) {
                        qd4.t(displayAudioBookChaptersFragment.go().Le().w(), displayAudioBookChaptersFragment.kn(), AudioBookPersonBottomSheetLaunchPoint.AudioBookScreen.b, ((idn.q) idnVar).a, null, displayAudioBookChaptersFragment.fo(), 8);
                    } else if (idnVar instanceof idn.h) {
                        displayAudioBookChaptersFragment.go().Le().G(displayAudioBookChaptersFragment.kn(), ((idn.h) idnVar).a, displayAudioBookChaptersFragment.fo());
                    } else if (idnVar instanceof idn.f) {
                        AudioBook audioBook = ((idn.f) idnVar).a;
                        if (audioBook != null && (i = audioBook.b) != 0) {
                            displayAudioBookChaptersFragment.go().Le().w().o(displayAudioBookChaptersFragment.kn(), audioBook, new AudioBookBottomSheetLaunchPoint.AudioBookScreen(i, audioBook.r, audioBook.t), displayAudioBookChaptersFragment.fo(), false);
                        }
                    } else if (idnVar instanceof idn.l) {
                        r1m r1mVar = ((idn.l) idnVar).a;
                        kmu0 kmu0Var2 = new kmu0(displayAudioBookChaptersFragment.requireContext(), tzp0.a(null, 3));
                        kmu0Var2.U0(new jai(-1291616411, new iq8(i9, r1mVar, displayAudioBookChaptersFragment), true));
                        displayAudioBookChaptersFragment.S = kmu0Var2.I0("AudioBookDescriptionBottomSheet");
                    } else if (idnVar.equals(idn.j.a)) {
                        w7k0.d((w7k0) displayAudioBookChaptersFragment.X.getValue(), displayAudioBookChaptersFragment.requireContext(), R.string.music_audio_book_kids_added_label);
                    } else if (idnVar instanceof idn.g) {
                        maz.c(displayAudioBookChaptersFragment.go().p().e(), displayAudioBookChaptersFragment.requireContext(), ((idn.g) idnVar).a, LaunchContext.A, null, null, 24);
                    } else if (idnVar.equals(idn.e.a)) {
                        bpn0 bpn0Var = lyd.d;
                        ((fl4) (bpn0Var != null ? bpn0Var : null).getValue()).N(displayAudioBookChaptersFragment.kn());
                    } else if (idnVar instanceof idn.o) {
                        i0q0.f(new i3r(displayAudioBookChaptersFragment.kn(), 2));
                    } else if (idnVar instanceof idn.k) {
                        displayAudioBookChaptersFragment.go().Le().w().u(displayAudioBookChaptersFragment.kn(), ((idn.k) idnVar).a);
                    } else if (idnVar instanceof idn.c) {
                        if (((Boolean) displayAudioBookChaptersFragment.a0.getValue()).booleanValue()) {
                            i0q0.f(new hv00(displayAudioBookChaptersFragment.kn(), R.string.music_snack_download_book_unavailable_message, i6));
                        } else {
                            i0q0.f(new hv00(displayAudioBookChaptersFragment.kn(), R.string.music_snack_download_tmp_unavailable_message, i6));
                        }
                    } else if (idnVar instanceof idn.d) {
                        idn.d dVar2 = (idn.d) idnVar;
                        ((lq40) displayAudioBookChaptersFragment.Z.getValue()).C(displayAudioBookChaptersFragment.requireContext(), dVar2.a, dVar2.b);
                    } else {
                        if (!idnVar.equals(idn.b.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        xl40 xl40Var = (xl40) displayAudioBookChaptersFragment.W.getValue();
                        Context requireContext2 = displayAudioBookChaptersFragment.requireContext();
                        xl40.a aVar6 = xl40.a;
                        xl40Var.a(requireContext2);
                    }
                }
                return s3q0.a;
            case 12:
                sdz sdzVar = ((com.vk.music.playlist.display.domain.f) obj3).d;
                String str5 = ((yfn) obj).c.j;
                return SpannedString.valueOf(sdzVar.m(str5 != null ? str5 : ""));
            case 13:
                EmptyCartRootViewHolder emptyCartRootViewHolder = (EmptyCartRootViewHolder) obj3;
                ArrayList<UIBlock> arrayList2 = ((UIBlockList) obj).y;
                if (arrayList2 == null || !arrayList2.isEmpty()) {
                    for (UIBlock uIBlock : arrayList2) {
                        emptyCartRootViewHolder.getClass();
                        if (!(uIBlock instanceof UIBlockMarketItem) && !(uIBlock instanceof UIBlockMarketGroupInfoItem)) {
                        }
                        return Boolean.valueOf(r7);
                        break;
                    }
                }
                r7 = false;
                return Boolean.valueOf(r7);
            case 14:
                VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) obj;
                cop copVar = (cop) ((vop) obj3).a;
                if (copVar != null) {
                    copVar.wa(vKApiExecutionException.t(), null, null);
                }
                return s3q0.a;
            case 15:
                ((EnterProfilePresenter) obj3).e.d(AuthStatSender.Screen.NAME);
                return s3q0.a;
            case 16:
                Handler handler = (Handler) obj3;
                Runnable runnable = (Runnable) obj;
                if (epx.f(Looper.myLooper(), handler.getLooper())) {
                    runnable.run();
                } else {
                    handler.post(runnable);
                }
                return s3q0.a;
            case 17:
                kfq kfqVar = (kfq) obj3;
                View view4 = kfqVar.c;
                View view5 = kfqVar.b;
                PollsWebView pollsWebView = kfqVar.d;
                gfq.b bVar2 = (gfq.b) obj;
                if (bVar2 instanceof gfq.b.a) {
                    zmp0.b(kfqVar);
                    pollsWebView.setVisibility(4);
                    view5.setVisibility(0);
                    view4.setVisibility(8);
                } else if (bVar2 instanceof gfq.b.d) {
                    zmp0.b(kfqVar);
                    biq biqVar = new biq();
                    biqVar.setDuration(250L);
                    zmp0.a(kfqVar, biqVar);
                    pollsWebView.setVisibility(4);
                    view5.setVisibility(0);
                    view4.setVisibility(8);
                } else if (bVar2 instanceof gfq.b.e) {
                    zmp0.b(kfqVar);
                    biq biqVar2 = new biq();
                    biqVar2.setDuration(250L);
                    zmp0.a(kfqVar, biqVar2);
                    pollsWebView.setVisibility(0);
                    view5.setVisibility(8);
                    view4.setVisibility(8);
                } else if (bVar2 instanceof gfq.b.C2941b) {
                    zmp0.b(kfqVar);
                    biq biqVar3 = new biq();
                    biqVar3.setDuration(250L);
                    zmp0.a(kfqVar, biqVar3);
                    pollsWebView.setVisibility(0);
                    view5.setVisibility(8);
                    view4.setVisibility(8);
                    gzs<s3q0> gzsVar = kfqVar.h;
                    if (gzsVar != null) {
                        gzsVar.invoke();
                    }
                } else {
                    if (!(bVar2 instanceof gfq.b.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zmp0.b(kfqVar);
                    biq biqVar4 = new biq();
                    biqVar4.setDuration(250L);
                    zmp0.a(kfqVar, biqVar4);
                    pollsWebView.setVisibility(4);
                    view5.setVisibility(8);
                    view4.setVisibility(0);
                }
                return s3q0.a;
            case 18:
                ((jtq) obj3).d = (List) obj;
                return s3q0.a;
            case 19:
                return ((oxq) obj3).f.b().d((List) obj);
            case 20:
                return v0r.p((v0r) obj3, (Context) obj, "Иван", "Гениально!😀😄😁", true, 32);
            case 21:
                int i10 = FriendsBirthdayInfoBarView.B;
                ((com.vk.newsfeed.common.recycler.holders.attachments.a) obj3).invoke();
                return s3q0.a;
            case 22:
                GamesCatalogFragment gamesCatalogFragment = (GamesCatalogFragment) obj3;
                int i11 = GamesCatalogFragment.i0;
                o9t.i iVar = new o9t.i((String) obj);
                gamesCatalogFragment.getClass();
                xn50.a.c(gamesCatalogFragment, iVar);
                return s3q0.a;
            case 23:
                dvt dvtVar = (dvt) obj3;
                g0v g0vVar = ((iyu0) obj).f;
                if (epx.f(g0vVar, g0v.b.a)) {
                    dvtVar.k(dvtVar.i, dvtVar.j, SelectedDataSource.HEALTH_CONNECT);
                } else {
                    if (!(g0vVar instanceof g0v.c) && !(g0vVar instanceof g0v.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dvtVar.j();
                }
                return s3q0.a;
            case 24:
                int i12 = GoodPreviewFragment.X;
                ((GoodPreviewFragment) obj3).getFeature().k.b((f6u) obj);
                return s3q0.a;
            case 25:
                jcu jcuVar = (jcu) obj3;
                y8g y8gVar = ((jzp0) obj).a;
                RecyclerView recyclerView = jcuVar.r;
                Iterator<jzp0> it3 = jcuVar.f.getCurrentList().iterator();
                int i13 = 0;
                while (true) {
                    if (!it3.hasNext()) {
                        i13 = -1;
                    } else if (!epx.f(y8gVar, it3.next().a)) {
                        i13++;
                    }
                }
                lkf0.d(recyclerView, i13 + 1);
                jcuVar.d.invoke(new pbu(y8gVar.a(), false));
                return s3q0.a;
            case 26:
                return Boolean.valueOf(dd80.f((UIBlockList) obj, new pwk((UIBlockGroupFilter) obj3, 19)) != null);
            case 27:
                VkAvatar vkAvatar = (VkAvatar) obj;
                String invoke = ((GroupHorizontalListItemVh.b) obj3).a.invoke(Integer.valueOf(vkAvatar.getWidth()));
                if (invoke != null) {
                    vkAvatar.o0(invoke, null);
                }
                return s3q0.a;
            case 28:
                Group group = (Group) obj3;
                e4h h0 = xwk.e().h0();
                Context context = e43.a;
                h0.h(0, context != null ? context : null, fkq0.e(group.c));
                return s3q0.a;
            default:
                FragmentActivity fragmentActivity = (FragmentActivity) obj3;
                int i14 = HomeFragment2.x0;
                e3m.a aVar7 = e3m.a;
                return new Tooltip.f(fragmentActivity.getColor(R.color.vk_tip_background), Integer.valueOf(fragmentActivity.getColor(R.color.vk_white)), null, 80, null, 0, 33554297);
        }
    }
}
