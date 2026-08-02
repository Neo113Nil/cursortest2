package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionClearSection;
import com.vk.channels.api.ChannelHistoryOpenMode;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.Peer;
import com.vk.dto.music.MusicTrack;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.itemlist.impl.presentation.fragment.ImItemListFragment;
import com.vk.im.ui.components.contacts.ContactsListFactory;
import com.vk.im.ui.components.dialogs_list.InfoModalBottomSheet;
import com.vk.im.ui.components.msg_list.MsgListOpenAtUnreadMode;
import com.vk.im.ui.fragments.ContactsListFragmentRedesign;
import com.vk.instantjobs.InstantJob;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsImStat$TypeImConversationsBannerItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.webapp.fragments.ReportFragment;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.cfb;
import xsna.epb;
import xsna.jpb;
import xsna.l6w;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class bfb implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ bfb(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (cfb.b) ((l7r0) this.c).d((ij20) this.d, (cfb.a) this.e);
            case 1:
                gpb gpbVar = (gpb) this.c;
                DialogExt dialogExt = (DialogExt) this.d;
                epb epbVar = (epb) this.e;
                DialogExt dialogExt2 = gpbVar.i;
                if (dialogExt2 == null) {
                    gpbVar.i = dialogExt;
                } else {
                    ProfilesInfo profilesInfo = dialogExt2.b;
                    if (profilesInfo != null) {
                        profilesInfo.Hb(dialogExt.b);
                    }
                }
                DialogExt dialogExt3 = gpbVar.i;
                if (dialogExt3 != null) {
                    dialogExt = dialogExt3;
                }
                epb.b bVar = (epb.b) epbVar;
                gpbVar.T(new jpb.a(dialogExt, bVar.b, bVar.c));
                return s3q0.a;
            case 2:
                l6w l6wVar = (l6w) this.c;
                f7w f7wVar = (f7w) this.d;
                ImItemListFragment imItemListFragment = (ImItemListFragment) this.e;
                qcy<Object>[] qcyVarArr = ImItemListFragment.S;
                if (l6wVar instanceof l6w.a) {
                    L l = L.a;
                    l.getClass();
                    LoggerOutputTarget loggerOutputTarget = LoggerOutputTarget.NONE;
                    if (!L.m(loggerOutputTarget)) {
                        L.u(l, L.LogType.d, new Object[]{"ImItemList.Debug Binder: delivering Navigation event to router: " + l6wVar + ", fragmentLifecycle=" + imItemListFragment.getLifecycle().getCurrentState()});
                    }
                    l6w.a aVar = (l6w.a) l6wVar;
                    ImItemListFragment imItemListFragment2 = f7wVar.a;
                    if (!L.m(loggerOutputTarget)) {
                        L.u(l, L.LogType.d, new Object[]{"ImItemList.Debug Router: onNavigationEvent received: " + aVar});
                    }
                    if (aVar instanceof l6w.a.g) {
                        o0w b = g2v.c().b();
                        Context requireContext = imItemListFragment2.requireContext();
                        l6w.a.g gVar = (l6w.a.g) aVar;
                        Peer peer = gVar.a;
                        b.k(requireContext, peer.b, null, new DialogExt(peer.b, gVar.b, gVar.c), MsgListOpenAtUnreadMode.b, gVar.d);
                    } else if (aVar instanceof l6w.a.h) {
                        g2v.c().b().t(imItemListFragment2.requireContext(), ((l6w.a.h) aVar).a.b, null, "list_all", null);
                    } else if (aVar instanceof l6w.a.b) {
                        g2v.c().a().c(imItemListFragment2.requireContext(), ((l6w.a.b) aVar).a, ChannelHistoryOpenMode.OpenAtUnread.b, null);
                    } else if (aVar instanceof l6w.a.d) {
                        g2v.c().getClass();
                        Context requireContext2 = imItemListFragment2.requireContext();
                        long j = ((l6w.a.d) aVar).a;
                        int i = ReportFragment.a0;
                        ReportFragment.a a = ReportFragment.b.a();
                        a.K("community_channel");
                        a.m = a.m.buildUpon().appendQueryParameter("channel_id", String.valueOf(j)).build();
                        a.N();
                        a.s(true);
                        a.k(requireContext2);
                    } else if (aVar instanceof l6w.a.m) {
                        l6w.a.m mVar = (l6w.a.m) aVar;
                        View view = mVar.c.get();
                        if (view != null) {
                            g2v.c().g().a(view, mVar.a, mVar.b, MobileOfficialAppsConStoriesStat$ViewEntryPoint.IM_DIALOGS, MobileOfficialAppsCoreNavStat$EventScreen.IM_CHAT, new l9(14));
                        }
                    } else if (aVar instanceof l6w.a.k) {
                        g2v.c().k().b(imItemListFragment2.requireContext(), ((l6w.a.k) aVar).a);
                    } else if (aVar instanceof l6w.a.l) {
                        y9w.b(2, imItemListFragment2.requireContext(), new b1j(f7wVar, 26));
                    } else if (aVar.equals(l6w.a.C3236a.a)) {
                        g2v.c().i().c(imItemListFragment2.requireContext());
                    } else if (aVar instanceof l6w.a.j) {
                        int i2 = InfoModalBottomSheet.g1;
                        InfoModalBottomSheet.b.a(imItemListFragment2.requireContext(), ((l6w.a.j) aVar).a);
                    } else if (aVar instanceof l6w.a.i) {
                        InfoBar.Payload.GiftsBirthdays giftsBirthdays = (InfoBar.Payload.GiftsBirthdays) ((l6w.a.i) aVar).a.m;
                        g2v.c().getClass();
                        fnv0.a.c(imItemListFragment2.requireContext(), giftsBirthdays);
                    } else if (aVar instanceof l6w.a.f) {
                        g2v.c().getClass();
                        bc6 L = xa4.L(imItemListFragment2.requireContext());
                        ContactsListFragmentRedesign.a aVar2 = new ContactsListFragmentRedesign.a();
                        ContactsListFactory contactsListFactory = ContactsListFactory.CONTACTS_LIST_VKAPP;
                        Bundle bundle = aVar2.j;
                        bundle.putSerializable("factory", contactsListFactory);
                        aVar2.s(true);
                        aVar2.y(R.attr.im_ic_back_toolbar);
                        bundle.putString("force_entry_point_for_new", null);
                        bundle.putString("force_entry_point_for_create_contact", "contact_list_vk_create_contact");
                        aVar2.m(L);
                    } else if (aVar instanceof l6w.a.c) {
                        l6w.a.c cVar = (l6w.a.c) aVar;
                        Peer peer2 = cVar.a;
                        peer2.getClass();
                        if (peer2.Ab(Peer.Type.GROUP)) {
                            o0w.P(g2v.c().b(), xa4.L(imItemListFragment2.requireContext()), null, null, cVar.a, 14);
                        } else {
                            g2v.c().b().m(xa4.L(imItemListFragment2.requireContext()), false, false);
                        }
                    } else {
                        if (!aVar.equals(l6w.a.e.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        iid0 iid0Var = new iid0();
                        UiTracker uiTracker = UiTracker.a;
                        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                        SchemeStat$TypeAction b2 = SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsImStat$TypeImConversationsBannerItem("edu_joining_ejd_chats", MobileOfficialAppsImStat$TypeImConversationsBannerItem.EventType.CLICK, null, 4, null), 3);
                        iid0Var.f = c;
                        iid0Var.g = b2;
                        iid0Var.q();
                        g2v.c().k();
                        imItemListFragment2.requireContext();
                    }
                } else {
                    L l2 = L.a;
                    l2.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l2, L.LogType.d, new Object[]{"ImItemList.Debug Binder: skipping non-Navigation event: " + fpf0.a(l6wVar.getClass()).l()});
                    }
                }
                return s3q0.a;
            case 3:
                c7x c7xVar = (c7x) this.c;
                Throwable th = (Throwable) this.d;
                InstantJob instantJob = (InstantJob) this.e;
                c7xVar.f(th);
                r6x e = c7xVar.e(th);
                synchronized (e) {
                    e.b();
                    Integer num = instantJob.b;
                    if (num != null) {
                        int intValue = num.intValue();
                        ny90 ny90Var = new ny90();
                        e.b.b(instantJob, ny90Var);
                        e.c.b(intValue, ny90Var.a.toString());
                    }
                }
                return s3q0.a;
            case 4:
                ((vh40) this.c).l((Context) this.d, (MusicTrack) this.e);
                return s3q0.a;
            case 5:
                ((rw40) this.c).A.L((hg40) this.d, ((gb50) this.e).c);
                return s3q0.a;
            default:
                k3p0 k3p0Var = (k3p0) this.c;
                String str = (String) this.d;
                UIBlockList uIBlockList = (UIBlockList) this.e;
                k3p0Var.d(false);
                UIBlockActionClearSection uIBlockActionClearSection = uIBlockList.E;
                k3p0Var.c(new v1i0(str, uIBlockActionClearSection != null ? uIBlockActionClearSection.z : null));
                return s3q0.a;
        }
    }
}
