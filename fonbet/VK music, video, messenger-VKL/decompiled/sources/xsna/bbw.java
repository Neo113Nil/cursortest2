package xsna;

import android.provider.Settings;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.vk.api.generated.users.dto.UsersUserCountersDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.content.design.view.photo.flow.PhotoFlowToolbarView;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vk.core.view.components.group.header.f;
import com.vk.core.view.components.tabs.VkTabs;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.ecomm.products_selection.api.model.SelectionProductId;
import com.vk.im.reactions.impl.models.AnimationID;
import com.vk.im.ui.views.settings.SwitchSettingsView;
import com.vk.lists.ListDataSet;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.managed_groups.impl.list.ManagedGroupsListFragment;
import com.vk.music.offline.ui.presentation.MusicDownloadsSettingsFragment;
import com.vk.music.view.player.holders.tracklist.MusicBigPlayerTrackListHolder;
import com.vk.newsfeed.impl.postmodal.reactions.donut.ModalPostDonutFragment;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageText;
import com.vk.superapp.pip.impl.overlay.MiniAppPiPOverlayService;
import com.vk.video.ui.discovery.minimizable.player.orientation.OrientationManagerImpl;
import com.vk.video.ui.upload.impl.settings.presentation.feature.entity.SettingsState;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.fragments.friends.FriendsFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.gm50;
import xsna.htd0;
import xsna.jda0;
import xsna.kr20;
import xsna.nn20;
import xsna.q0j0;
import xsna.txo;
import xsna.wr20;
import xsna.wst;
import xsna.zrz;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class bbw implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bbw(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        VkGroupHeader.Size size;
        VkTabs.c f;
        int i = 2;
        switch (this.b) {
            case 0:
                cbw cbwVar = (cbw) this.c;
                wst wstVar = (wst) obj;
                Iterable iterable = wstVar.c;
                if (iterable == null) {
                    iterable = wstVar.b;
                }
                Iterable<wst.a> iterable2 = iterable;
                ArrayList arrayList = new ArrayList(c5g.u(iterable2, 10));
                for (wst.a aVar : iterable2) {
                    arrayList.add(cbw.k(aVar.a, aVar.b));
                }
                wst.a.C3957a c3957a = wstVar.e;
                cbwVar.j = c3957a != null ? cbw.k(AnimationID.COIN.h(), c3957a) : null;
                int i2 = cbwVar.g;
                int i3 = wstVar.a;
                r3 = i2 == i3 ? 0 : 1;
                cbwVar.q(i3, wstVar.d);
                cbwVar.i = cbwVar.l();
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"Reaction assets list fetched. version=" + wstVar.a + " ids=" + wstVar.d});
                }
                if (r3 != 0) {
                    yaw yawVar = cbwVar.j;
                    if (yawVar != null) {
                        arrayList = j5g.v0(yawVar, arrayList);
                    }
                    cbwVar.o(arrayList);
                } else {
                    yaw yawVar2 = cbwVar.j;
                    if (yawVar2 != null) {
                        arrayList = j5g.v0(yawVar2, arrayList);
                    }
                    a0f0 a0f0Var = cbwVar.e;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : arrayList) {
                        int i4 = ((yaw) obj2).a;
                        if (a0f0Var.a().get(lhg.a(i4, "static_")) == null || a0f0Var.a().get(lhg.a(i4, "animation_big_")) == null || a0f0Var.a().get(lhg.a(i4, "animation_")) == null) {
                            arrayList2.add(obj2);
                        }
                    }
                    cbwVar.o(arrayList2);
                }
                cbwVar.c.a();
                return s3q0.a;
            case 1:
                androidx.compose.foundation.lazy.layout.b invoke = ((puy) this.c).p.invoke();
                int itemCount = invoke.getItemCount();
                while (true) {
                    if (r4 >= itemCount) {
                        r4 = -1;
                    } else if (!invoke.h(r4).equals(obj)) {
                        r4++;
                    }
                }
                return Integer.valueOf(r4);
            case 2:
                zrz zrzVar = (zrz) this.c;
                izs izsVar = (izs) obj;
                zrz.a aVar2 = (zrz.a) zrzVar.o.P0();
                if (aVar2 == null) {
                    Object invoke2 = zrzVar.g.invoke();
                    zrz.b.a aVar3 = zrz.b.a.a;
                    aVar2 = new zrz.a(invoke2, aVar3, aVar3, true, false, false);
                }
                return (zrz.a) izsVar.invoke(aVar2);
            case 3:
                ci00 ci00Var = (ci00) this.c;
                int i5 = ManagedGroupsListFragment.X;
                ci00Var.setItems(((si00) obj).b);
                return s3q0.a;
            case 4:
                f910 f910Var = (f910) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                la10 a = f910Var.a();
                if (a != null) {
                    a.L0(0, booleanValue);
                }
                return s3q0.a;
            case 5:
                yp80 yp80Var = (yp80) this.c;
                Throwable th = (Throwable) obj;
                if (yp80Var != null) {
                    yp80Var.onError(th);
                }
                return s3q0.a;
            case 6:
                Pair pair = (Pair) this.c;
                k720 k720Var = k720.a;
                String u = brm0.u((byte[]) obj);
                if (drm0.D(u, "error", false)) {
                    u = "";
                }
                CharSequence charSequence = (CharSequence) pair.j();
                if (charSequence == null || charSequence.length() == 0 || epx.f(pair.j(), pair.i())) {
                    return io.reactivex.rxjava3.core.x.k(new Pair(u, u));
                }
                wex0 wex0Var = e370.n;
                int i6 = 29;
                return new io.reactivex.rxjava3.internal.operators.single.e0((wex0Var != null ? wex0Var : null).a((String) pair.j()).K().l(new tt0(new i020(u, r3), i6)), new bl(new j020(u, r3), i6));
            case 7:
                ((sf20) this.c).d.e(((fhp0) obj).a);
                return s3q0.a;
            case 8:
                nn20.a aVar4 = (nn20.a) this.c;
                com.vk.core.view.components.group.header.f fVar = (com.vk.core.view.components.group.header.f) obj;
                fVar.setTitle(epx.f(aVar4.c(), "none") ? null : new f.c(0));
                fVar.setSubtitle(epx.f(aVar4.b(), "none") ? null : new f.b(0));
                fVar.setLeft(epx.f((String) ((zak0) aVar4.c).getValue(), "icon") ? new f.a.b() : null);
                String a2 = aVar4.a();
                switch (a2.hashCode()) {
                    case -1078030475:
                        if (a2.equals("medium")) {
                            size = VkGroupHeader.Size.Medium;
                            break;
                        }
                        size = VkGroupHeader.Size.Medium;
                        break;
                    case -102295765:
                        if (a2.equals("extra large")) {
                            size = VkGroupHeader.Size.ExtraLarge;
                            break;
                        }
                        size = VkGroupHeader.Size.Medium;
                        break;
                    case 102742843:
                        if (a2.equals("large")) {
                            size = VkGroupHeader.Size.Large;
                            break;
                        }
                        size = VkGroupHeader.Size.Medium;
                        break;
                    case 109548807:
                        if (a2.equals("small")) {
                            size = VkGroupHeader.Size.Small;
                            break;
                        }
                        size = VkGroupHeader.Size.Medium;
                        break;
                    default:
                        size = VkGroupHeader.Size.Medium;
                        break;
                }
                fVar.setSize(size);
                return s3q0.a;
            case 9:
                gvw0 gvw0Var = ((MiniAppPiPOverlayService) this.c).c;
                return Boolean.valueOf(Settings.canDrawOverlays((gvw0Var != null ? gvw0Var : null).a));
            case 10:
                pr20 pr20Var = (pr20) this.c;
                wr20.a.AbstractC3952a abstractC3952a = (wr20.a.AbstractC3952a) obj;
                if (abstractC3952a instanceof wr20.a.AbstractC3952a.C3953a) {
                    wr20.a.AbstractC3952a.C3953a c3953a = (wr20.a.AbstractC3952a.C3953a) abstractC3952a;
                    boolean z = c3953a.a;
                    boolean z2 = c3953a.c;
                    boolean z3 = c3953a.d;
                    ArrayList arrayList3 = c3953a.b;
                    if (!z3) {
                        View view = pr20Var.m;
                        if (view == null) {
                            view = null;
                        }
                        f4m.j(view);
                        SwitchSettingsView switchSettingsView = pr20Var.k;
                        if (switchSettingsView == null) {
                            switchSettingsView = null;
                        }
                        switchSettingsView.setSwitchEnabled(true);
                    }
                    if (z2 || z3) {
                        SwitchSettingsView switchSettingsView2 = pr20Var.k;
                        if (switchSettingsView2 == null) {
                            switchSettingsView2 = null;
                        }
                        r4 = switchSettingsView2.getChecked() != z ? 1 : 0;
                        SwitchSettingsView switchSettingsView3 = pr20Var.k;
                        if (switchSettingsView3 == null) {
                            switchSettingsView3 = null;
                        }
                        switchSettingsView3.setChecked(z);
                        if (r4 != 0) {
                            SwitchSettingsView switchSettingsView4 = pr20Var.k;
                            if (switchSettingsView4 == null) {
                                switchSettingsView4 = null;
                            }
                            switchSettingsView4.jumpDrawablesToCurrentState();
                        }
                        ScrollView scrollView = pr20Var.l;
                        if (scrollView == null) {
                            scrollView = null;
                        }
                        awt0.v(scrollView, !z);
                        RecyclerView recyclerView = pr20Var.n;
                        if (recyclerView == null) {
                            recyclerView = null;
                        }
                        awt0.v(recyclerView, z);
                        kr20 kr20Var = pr20Var.o;
                        kr20 kr20Var2 = kr20Var != null ? kr20Var : null;
                        ArrayList arrayList4 = kr20Var2.d;
                        m.d a3 = androidx.recyclerview.widget.m.a(new kr20.a(arrayList4, arrayList3), true);
                        arrayList4.clear();
                        arrayList4.addAll(arrayList3);
                        a3.b(kr20Var2);
                    }
                } else {
                    if (!(abstractC3952a instanceof wr20.a.AbstractC3952a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ArrayList arrayList5 = ((wr20.a.AbstractC3952a.b) abstractC3952a).a;
                    SwitchSettingsView switchSettingsView5 = pr20Var.k;
                    if (switchSettingsView5 == null) {
                        switchSettingsView5 = null;
                    }
                    switchSettingsView5.setChecked(true);
                    SwitchSettingsView switchSettingsView6 = pr20Var.k;
                    if (switchSettingsView6 == null) {
                        switchSettingsView6 = null;
                    }
                    switchSettingsView6.setSwitchEnabled(false);
                    SwitchSettingsView switchSettingsView7 = pr20Var.k;
                    if (switchSettingsView7 == null) {
                        switchSettingsView7 = null;
                    }
                    switchSettingsView7.jumpDrawablesToCurrentState();
                    kr20 kr20Var3 = pr20Var.o;
                    if (kr20Var3 == null) {
                        kr20Var3 = null;
                    }
                    ArrayList arrayList6 = kr20Var3.d;
                    m.d a4 = androidx.recyclerview.widget.m.a(new kr20.a(arrayList6, arrayList5), true);
                    arrayList6.clear();
                    arrayList6.addAll(arrayList5);
                    a4.b(kr20Var3);
                    RecyclerView recyclerView2 = pr20Var.n;
                    (recyclerView2 != null ? recyclerView2 : null).postDelayed(new ryc(pr20Var, 7), 100L);
                }
                return s3q0.a;
            case 11:
                ModalPostDonutFragment modalPostDonutFragment = (ModalPostDonutFragment) this.c;
                if (((Boolean) obj).booleanValue()) {
                    TextView textView = modalPostDonutFragment.S;
                    if (textView != null) {
                        textView.setVisibility(4);
                    }
                } else {
                    int i7 = ModalPostDonutFragment.W;
                }
                return s3q0.a;
            case 12:
                ck30 ck30Var = (ck30) this.c;
                List singletonList = Collections.singletonList((yj30) obj);
                ck30Var.getClass();
                if (!singletonList.isEmpty()) {
                    ck30Var.b.b().h(new bk30(singletonList, r4));
                }
                return s3q0.a;
            case 13:
                bz40 bz40Var = ((MusicBigPlayerTrackListHolder) this.c).u;
                MusicBigPlayerTrackListHolder.a aVar5 = new MusicBigPlayerTrackListHolder.a(1, (List) obj, List.class, "contains", "contains(Ljava/lang/Object;)Z", 0);
                ListDataSet listDataSet = (ListDataSet) bz40Var.c;
                ListDataSet.ArrayListImpl<T> arrayListImpl = listDataSet.d;
                while (r4 < arrayListImpl.size()) {
                    if (aVar5.invoke(arrayListImpl.get(r4)).booleanValue()) {
                        listDataSet.h(r4);
                        arrayListImpl.set(r4, (whp0) arrayListImpl.get(r4));
                        listDataSet.d(r4);
                    }
                    r4++;
                }
                return s3q0.a;
            case 14:
                MusicDownloadsSettingsFragment musicDownloadsSettingsFragment = (MusicDownloadsSettingsFragment) this.c;
                g47 g47Var = (g47) obj;
                qcy<Object>[] qcyVarArr = MusicDownloadsSettingsFragment.P;
                u1h0 u1h0Var = musicDownloadsSettingsFragment.O;
                qcy<Object>[] qcyVarArr2 = MusicDownloadsSettingsFragment.P;
                qcy<Object> qcyVar = qcyVarArr2[0];
                g47Var.e(tci.l((bn50) u1h0Var.getValue()), new fj40());
                qcy<Object> qcyVar2 = qcyVarArr2[0];
                g47Var.a(tci.k((bn50) u1h0Var.getValue()));
                qcy<Object> qcyVar3 = qcyVarArr2[0];
                g47Var.d(new yi40((bn50) u1h0Var.getValue()));
                return s3q0.a;
            case 15:
                ((txo.b) this.c).invoke((kj50) obj);
                return s3q0.a;
            case 16:
                jd80 jd80Var = (jd80) this.c;
                jd80Var.d = (etv0) obj;
                jd80Var.a.q();
                return s3q0.a;
            case 17:
                op80 op80Var = (op80) this.c;
                UsersUserFullDto usersUserFullDto = (UsersUserFullDto) j5g.b0(0, (List) obj);
                UsersUserCountersDto R = usersUserFullDto != null ? usersUserFullDto.R() : null;
                if (R != null) {
                    aus ausVar = op80Var.c;
                    Integer j = R.j();
                    ausVar.a = j != null ? j.intValue() : 0;
                    Integer k = R.k();
                    ausVar.c = k != null ? k.intValue() : 0;
                    Integer l2 = R.l();
                    ausVar.b = l2 != null ? l2.intValue() : 0;
                    FriendsFragment friendsFragment = op80Var.b;
                    HashSet<uts> hashSet = friendsFragment.e0;
                    ArrayList arrayList7 = new ArrayList();
                    Iterator<uts> it = hashSet.iterator();
                    while (it.hasNext()) {
                        uts next = it.next();
                        if (next.c() != 2) {
                            arrayList7.add(next);
                        }
                    }
                    Iterator it2 = arrayList7.iterator();
                    while (it2.hasNext()) {
                        ((uts) it2.next()).d(ausVar);
                    }
                    uts b = friendsFragment.m0.b();
                    if (b != null) {
                        b.g = ausVar.a();
                    }
                    FragmentActivity activity = friendsFragment.getActivity();
                    if (activity != null) {
                        Iterator<uts> it3 = friendsFragment.f0.iterator();
                        while (it3.hasNext()) {
                            uts next2 = it3.next();
                            int i8 = r4 + 1;
                            if (r4 < 0) {
                                e43.t();
                                throw null;
                            }
                            uts utsVar = next2;
                            VkTabs vkTabs = friendsFragment.Q;
                            if (vkTabs != null && (f = vkTabs.f(r4)) != null) {
                                VkTabs.c.a(f, utsVar.b(activity));
                            }
                            r4 = i8;
                        }
                    }
                }
                return s3q0.a;
            case 18:
                ks80 ks80Var = (ks80) this.c;
                String str = (String) obj;
                ohk0 f2 = ks80Var.f().f(str);
                if (f2 != null) {
                    f2.c("onFirstFrameRendered");
                }
                ks80Var.b.put(str, Boolean.TRUE);
                return s3q0.a;
            case 19:
                ((OrientationManagerImpl) this.c).d = null;
                return s3q0.a;
            case 20:
                PhotoFlowToolbarView.d dVar = ((PhotoFlowToolbarView) this.c).x;
                if (dVar != null) {
                    dVar.onClick();
                }
                return s3q0.a;
            case 21:
                ida0 ida0Var = (ida0) this.c;
                gm50.a.a(ida0Var, ((jda0.a) obj).a, new fv90(ida0Var, i));
                return s3q0.a;
            case 22:
                ((o2c0) this.c).a.e(o2c0.e(new PostingUserMessageText.ResText(R.string.posting_common_network_error)));
                return s3q0.a;
            case 23:
                ((com.vk.newsfeed.impl.presenters.b) this.c).i0().V4();
                return s3q0.a;
            case 24:
                xwk.d().e().a(((cbc0) this.c).b.getContext(), (String) obj);
                return s3q0.a;
            case 25:
                ktd0 ktd0Var = (ktd0) this.c;
                hy00 hy00Var = (hy00) obj;
                long j2 = hy00Var.a;
                UserId userId = hy00Var.b;
                if (userId == null) {
                    userId = UserId.d;
                }
                ktd0Var.C(new htd0.j(new SelectionProductId(j2, userId), hy00Var.c));
                return s3q0.a;
            case 26:
                return Boolean.valueOf(((Collection) this.c).contains((zwm0) obj));
            case 27:
                return new Pair((Map) this.c, (Map) obj);
            case 28:
                return SettingsState.a((SettingsState) obj, null, false, null, null, Boolean.valueOf(((q0j0.e) this.c).b), null, null, null, null, 495);
            default:
                Photo photo = ((PhotoAttachment) this.c).l;
                photo.x = (List) obj;
                photo.m = true;
                return s3q0.a;
        }
    }
}
