package xsna;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.core.voip.VoipCallSource;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.SocialButtonType;
import com.vk.im.engine.models.search.SearchEntrypoint;
import com.vk.im.ui.components.contacts.SortOrder;
import com.vk.log.L;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.voip.ui.calls.presentation.feature.handler.VoipCallServiceBannerHandler;
import com.vk.voip.ui.calls.presentation.model.list.FriendItem;
import com.vk.voip.ui.prodstat.analytics.base.common.VoipCallTypeAnalytics;
import com.vk.voip.ui.prodstat.analytics.call.click.VoipStartCallClickAnalytics;
import com.vk.voip.ui.prodstat.analytics.contact.action.VoipContactsActionAnalytics;
import com.vk.voip.ui.prodstat.analytics.search.click.VoipSearchClickAnalytics;
import com.vk.voip.ui.prodstat.analytics.share.click.VoipShareLinkClickAnalytics;
import com.vungle.ads.internal.protos.Sdk;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.a7f0;
import xsna.ajw0;
import xsna.g1e0;
import xsna.giw0;
import xsna.itw0;
import xsna.rhw0;
import xsna.shw0;
import xsna.vhw0;
import xsna.whg;
import xsna.yiw0;
import xsna.ymw0;

/* compiled from: VoipCallServiceFeature.kt */
/* loaded from: classes7.dex */
public final class zhw0 extends wk50<bjw0, yiw0, rhw0, giw0> {
    public final a1w f;
    public final rw0 g;
    public final kdw0<mdw0> h;
    public final cjw0 i;
    public final VoipCallServiceBannerHandler j;
    public final f4z<x49> k;
    public final f4z<ajw0> l;

    /* compiled from: VoipCallServiceFeature.kt */
    public static final class a {
        public final List<qtd0> a;
        public final List<qtd0> b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends qtd0> list, List<? extends qtd0> list2) {
            this.a = list;
            this.b = list2;
        }
    }

    /* compiled from: VoipCallServiceFeature.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SocialButtonType.values().length];
            try {
                iArr[SocialButtonType.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SocialButtonType.FOLLOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: VoipCallServiceFeature.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    /* compiled from: VoipCallServiceFeature.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements wzs<a, VoipCallServiceBannerHandler.a, giw0> {
        @Override // xsna.wzs
        public final giw0 invoke(a aVar, VoipCallServiceBannerHandler.a aVar2) {
            return zhw0.U((zhw0) this.receiver, aVar, aVar2);
        }
    }

    /* compiled from: VoipCallServiceFeature.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements wzs<a, VoipCallServiceBannerHandler.a, giw0> {
        @Override // xsna.wzs
        public final giw0 invoke(a aVar, VoipCallServiceBannerHandler.a aVar2) {
            return zhw0.U((zhw0) this.receiver, aVar, aVar2);
        }
    }

    public zhw0(a1w a1wVar, rw0 rw0Var, kdw0 kdw0Var) {
        super(rhw0.j.b, new viw0());
        this.f = a1wVar;
        this.g = rw0Var;
        this.h = kdw0Var;
        this.i = new cjw0();
        this.j = new VoipCallServiceBannerHandler(a1wVar, new cim0(this, 14));
        this.k = new f4z<>();
        this.l = new f4z<>();
    }

    public static final giw0 U(zhw0 zhw0Var, a aVar, VoipCallServiceBannerHandler.a aVar2) {
        cjw0 cjw0Var = zhw0Var.i;
        List<qtd0> list = aVar.b;
        return list.isEmpty() ? new giw0.a(epx.f(aVar2, VoipCallServiceBannerHandler.a.c.a)) : new giw0.c.a(aVar2, cjw0Var.c(aVar.a), cjw0Var.c(list), list.size());
    }

    public static String W(UserId userId, boolean z, yiw0 yiw0Var) {
        FriendItem friendItem;
        Object obj;
        low0 low0Var;
        List<low0> list;
        Object obj2;
        if (yiw0Var instanceof yiw0.e) {
            if (z) {
                yiw0.e.b bVar = ((yiw0.e) yiw0Var).c;
                yiw0.e.b.C4104b c4104b = bVar instanceof yiw0.e.b.C4104b ? (yiw0.e.b.C4104b) bVar : null;
                if (c4104b == null || (list = c4104b.c) == null) {
                    low0Var = null;
                } else {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (epx.f(((low0) obj2).b, userId)) {
                            break;
                        }
                    }
                    low0Var = (low0) obj2;
                }
                if (low0Var != null) {
                    return low0Var.m;
                }
            } else {
                yiw0.e.a aVar = ((yiw0.e) yiw0Var).b;
                yiw0.e.a.b bVar2 = aVar instanceof yiw0.e.a.b ? (yiw0.e.a.b) aVar : null;
                if (bVar2 != null) {
                    Iterator it2 = bVar2.a.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        if (com.vk.dto.common.a.b(((FriendItem) obj).b).equals(userId)) {
                            break;
                        }
                    }
                    friendItem = (FriendItem) obj;
                } else {
                    friendItem = null;
                }
                if (friendItem != null) {
                    return friendItem.i;
                }
            }
        }
        return null;
    }

    @Override // xsna.wk50
    public final void N(yiw0 yiw0Var, rhw0 rhw0Var) {
        String str;
        String str2;
        yiw0 yiw0Var2 = yiw0Var;
        rhw0 rhw0Var2 = rhw0Var;
        if (rhw0Var2.equals(rhw0.j.b)) {
            if (yiw0Var2 instanceof yiw0.d) {
                return;
            }
            T(giw0.d.b);
            b0(false);
            return;
        }
        if (rhw0Var2 instanceof rhw0.r) {
            V((rhw0.r) rhw0Var2);
            return;
        }
        if (rhw0Var2.equals(rhw0.q.b)) {
            if (yiw0Var2 instanceof yiw0.b) {
                String str3 = ((yiw0.b) yiw0Var2).b;
                if (str3 != null && !drm0.N(str3)) {
                    V(new rhw0.r.a(str3));
                    return;
                } else {
                    if (yiw0Var2 instanceof yiw0.d) {
                        return;
                    }
                    T(giw0.d.b);
                    b0(false);
                    return;
                }
            }
            return;
        }
        boolean equals = rhw0Var2.equals(rhw0.v.b);
        f4z<x49> f4zVar = this.k;
        if (equals) {
            f4zVar.b(whg.h.a);
            return;
        }
        boolean equals2 = rhw0Var2.equals(rhw0.l.b);
        kdw0<mdw0> kdw0Var = this.h;
        if (equals2) {
            kdw0Var.b(itw0.b.a.c.a);
            return;
        }
        if (rhw0Var2.equals(rhw0.y.b)) {
            f4zVar.b(whg.a.a);
            return;
        }
        if (rhw0Var2.equals(rhw0.u.b)) {
            f4zVar.b(whg.c.a);
            return;
        }
        if (rhw0Var2.equals(rhw0.x.b)) {
            f4zVar.b(whg.c0.a);
            return;
        }
        if (rhw0Var2.equals(rhw0.e.b)) {
            kdw0Var.b(itw0.b.a.C3082b.a);
            return;
        }
        if (rhw0Var2 instanceof rhw0.i) {
            shw0 shw0Var = ((rhw0.i) rhw0Var2).b;
            VoipStartCallClickAnalytics.Event.OutgoingCall.Type type = VoipStartCallClickAnalytics.Event.OutgoingCall.Type.AUDIO;
            shw0.b bVar = shw0.b.a;
            kdw0Var.b(new VoipStartCallClickAnalytics.Event.OutgoingCall(type, epx.f(shw0Var, bVar) ? VoipStartCallClickAnalytics.Source.CALLS_SERVICES_EMPTY_SEARCH : VoipStartCallClickAnalytics.Source.CALLS_SERVICES, VoipCallTypeAnalytics.GROUP));
            f4zVar.b(new whg.s(new VoipCallSource(epx.f(shw0Var, bVar) ? MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.CALLS_SERVICES_EMPTY_SEARCH : MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.CALLS_SERVICES, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL_CREATE_BY_LINK)));
            return;
        }
        if (rhw0Var2.equals(rhw0.s.b)) {
            f4zVar.b(fiw0.a);
            return;
        }
        if (rhw0Var2 instanceof rhw0.k) {
            Peer.Member member = ((rhw0.k) rhw0Var2).b;
            kdw0Var.b(new VoipStartCallClickAnalytics.Event.OutgoingCall(VoipStartCallClickAnalytics.Event.OutgoingCall.Type.AUDIO_MAIN, VoipStartCallClickAnalytics.Source.CALLS_SERVICES, gjw0.b(member.c)));
            String W = W(com.vk.dto.common.a.b(member), false, yiw0Var2);
            if (W != null) {
                kdw0Var.b(new VoipSearchClickAnalytics.Event.ServiceCallScreen.Friends(VoipSearchClickAnalytics.Event.ServiceCallScreen.Friends.Type.CALL, W));
            }
            if (member.Ab(Peer.Type.CONTACT)) {
                a7f0.a.f(this, Z(member).l(new iub0(new ev60(24))).l(new u1j0(new vhs0(this, 11), 10)), new zyl0(this, 25), new fvq0(this, 18), 1);
                return;
            } else {
                f4zVar.b(new whg.p(new VoipCallSource(MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.CALLS_SERVICES, MobileOfficialAppsCoreNavStat$EventScreen.CALLS), com.vk.dto.common.a.b(member), false));
                return;
            }
        }
        if (rhw0Var2 instanceof rhw0.w) {
            Peer.Member member2 = ((rhw0.w) rhw0Var2).b;
            kdw0Var.b(new itw0.b.a.d(gjw0.b(member2.c)));
            a7f0.a.f(this, Z(member2), new svk0(this, 20), new hfv0(this, 4), 1);
            return;
        }
        if (rhw0Var2 instanceof rhw0.t) {
            Peer.Member member3 = ((rhw0.t) rhw0Var2).b;
            kdw0Var.b(new VoipShareLinkClickAnalytics.b.a(VoipShareLinkClickAnalytics.Source.CALLS_SERVICES));
            String W2 = W(com.vk.dto.common.a.b(member3), false, yiw0Var2);
            if (W2 != null) {
                kdw0Var.b(new VoipSearchClickAnalytics.Event.ServiceCallScreen.Friends(VoipSearchClickAnalytics.Event.ServiceCallScreen.Friends.Type.SHARE_LINK, W2));
            }
            f4zVar.b(new diw0(member3));
            return;
        }
        boolean z = rhw0Var2 instanceof rhw0.a0;
        VoipCallServiceBannerHandler voipCallServiceBannerHandler = this.j;
        if (z) {
            a7f0.a.f(this, voipCallServiceBannerHandler.b(), new lbt0(this, 5), new gl6(L.a, 12), 1);
            return;
        }
        if (rhw0Var2 instanceof rhw0.b) {
            if (!((rhw0.b) rhw0Var2).b.equals(vhw0.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            voipCallServiceBannerHandler.a(VoipCallServiceBannerHandler.a.C2038a.a, false);
            return;
        }
        if (rhw0Var2 instanceof rhw0.c) {
            if (!((rhw0.c) rhw0Var2).b.equals(vhw0.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            voipCallServiceBannerHandler.a(VoipCallServiceBannerHandler.a.C2038a.a, true);
            return;
        }
        if (rhw0Var2 instanceof rhw0.z) {
            shw0 shw0Var2 = ((rhw0.z) rhw0Var2).b;
            if (shw0Var2 instanceof shw0.a) {
                kdw0Var.b(ymw0.b.a.a);
            }
            this.l.b(new ajw0.b(shw0Var2));
            return;
        }
        if (rhw0Var2.equals(rhw0.f.b)) {
            X(CampaignEx.JSON_NATIVE_VIDEO_CLOSE, shw0.a.a);
            return;
        }
        if (rhw0Var2 instanceof rhw0.h) {
            shw0 shw0Var3 = ((rhw0.h) rhw0Var2).b;
            if (shw0Var3 instanceof shw0.a) {
                kdw0Var.b(new VoipContactsActionAnalytics.Event.ImportContacts(VoipContactsActionAnalytics.Event.ImportContacts.Type.GRANTED));
            }
            X("action", shw0Var3);
            return;
        }
        if (rhw0Var2 instanceof rhw0.g) {
            if (((rhw0.g) rhw0Var2).b instanceof shw0.a) {
                kdw0Var.b(new VoipContactsActionAnalytics.Event.ImportContacts(VoipContactsActionAnalytics.Event.ImportContacts.Type.DENIED));
                return;
            }
            return;
        }
        if (rhw0Var2.equals(rhw0.b0.b)) {
            a7f0.a.d(this, new io.reactivex.rxjava3.internal.operators.completable.m(new isg0(1)), null, new wg1(L.a, 19), new ufu0(this, 7), 1);
            return;
        }
        if (rhw0Var2.equals(rhw0.d.b)) {
            kdw0Var.b(new VoipStartCallClickAnalytics.Event.OutgoingCall(VoipStartCallClickAnalytics.Event.OutgoingCall.Type.BY_PHONE_AUDIO, VoipStartCallClickAnalytics.Source.CALLS_SERVICES, VoipCallTypeAnalytics.CONTACT));
            f4zVar.b(whg.e.a);
            return;
        }
        if (rhw0Var2 instanceof rhw0.n) {
            UserId userId = ((rhw0.n) rhw0Var2).b;
            String W3 = W(userId, true, yiw0Var2);
            if (W3 != null) {
                kdw0Var.b(new VoipSearchClickAnalytics.Event.ServiceCallScreen.Global(VoipSearchClickAnalytics.Event.ServiceCallScreen.Global.Type.OPEN_PROFILE, W3));
            }
            f4zVar.b(new ciw0(userId, W3));
            return;
        }
        boolean z2 = rhw0Var2 instanceof rhw0.a;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        rw0 rw0Var = this.g;
        if (z2) {
            UserId userId2 = ((rhw0.a) rhw0Var2).b;
            String W4 = W(userId2, true, yiw0Var2);
            if (W4 != null) {
                kdw0Var.b(new VoipSearchClickAnalytics.Event.ServiceCallScreen.Global(VoipSearchClickAnalytics.Event.ServiceCallScreen.Global.Type.ADD_FRIEND, W4));
            }
            a7f0.a.d(this, new io.reactivex.rxjava3.internal.operators.completable.w(rsg0.Z(yfb.x(nts.d((ots) ((lec) rw0Var.c).b, userId2, null, null, null, null, null, null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE))), new yhw0(new zu1(this, userId2, yiw0Var2, 7), 0), lVar, kVar, kVar, kVar, kVar), null, new mx4(L.a, 8), new j6k(this, userId2, yiw0Var2, 7), 1);
            return;
        }
        if (rhw0Var2 instanceof rhw0.p) {
            UserId userId3 = ((rhw0.p) rhw0Var2).b;
            a7f0.a.d(this, new io.reactivex.rxjava3.internal.operators.completable.w(rsg0.Z(yfb.x(nts.g((ots) ((lec) rw0Var.c).b, userId3, null, null, null, null, 30))), new xhw0(new ed5(this, userId3, yiw0Var2), 0), lVar, kVar, kVar, kVar, kVar), null, new cv1(this, userId3, yiw0Var2, 7), new defpackage.c0(this, userId3, yiw0Var2, 7), 1);
            return;
        }
        if (!(rhw0Var2 instanceof rhw0.o)) {
            if (!(rhw0Var2 instanceof rhw0.m)) {
                throw new NoWhenBranchMatchedException();
            }
            f4zVar.b(new whg.v(new UserId(((rhw0.m) rhw0Var2).b.b)));
        } else if (yiw0Var2 instanceof yiw0.e) {
            yiw0.e.b bVar2 = ((yiw0.e) yiw0Var2).c;
            if (bVar2 instanceof yiw0.e.b.C4104b) {
                yiw0.e.b.C4104b c4104b = (yiw0.e.b.C4104b) bVar2;
                if (c4104b.d || (str = c4104b.a) == null || (str2 = c4104b.b) == null) {
                    return;
                }
                a7f0.a.f(this, new io.reactivex.rxjava3.internal.operators.single.n(rsg0.w0(yfb.x(wga.d((xga) ((yxu) rw0Var.a).b, str, null, str2, null, null, null, 32762))).l(new mrc0(new qjm0(rw0Var, 12), 13)), new uwv0(new xau0(this, 5), 2)), new fgm0(6, c4104b, this), new wql0(16), 1);
            }
        }
    }

    public final void V(rhw0.r rVar) {
        if (!(rVar instanceof rhw0.r.a)) {
            throw new NoWhenBranchMatchedException();
        }
        String str = ((rhw0.r.a) rVar).b;
        if (str.length() == 0) {
            b0(true);
            return;
        }
        ycj ycjVar = new ycj(str, Source.ACTUAL, false, false, false, null, SearchEntrypoint.CALLS, 60);
        a1w a1wVar = this.f;
        a7f0.a.f(this, new io.reactivex.rxjava3.internal.operators.single.n(io.reactivex.rxjava3.core.x.B(a1wVar.C(this, ycjVar).l(new pi40(new jyq0(9), 21)), a1wVar.C(this, new rkw0()), new qu50(new xa2(this, 15), 21)), new k5j0(new whw0(this, 0), 22)), new ksg0(this, 29), new yu1(28, this, str), 1);
        rw0 rw0Var = this.g;
        a7f0.a.f(this, new io.reactivex.rxjava3.internal.operators.single.n(rsg0.w0(yfb.x(wga.c((xga) ((yxu) rw0Var.a).b, str, null, null, null, null, null, null, null, null, null, null, null, null, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.CALLS), null, 2147483646, 7))).l(new tj60(new q3s0(rw0Var, 6), 22)), new jgs0(new mdm0(this, 27), 5)), new aer0(this, 9), new wx30(22), 1);
    }

    public final void X(String str, shw0 shw0Var) {
        a7f0.a.f(this, this.f.C(this, new skw0(str)), new lq5(this, shw0Var, str, 6), new c(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 1);
    }

    public final io.reactivex.rxjava3.internal.operators.single.y Y(boolean z) {
        return this.f.C(this, new rbj(!z, z ? Source.CACHE : Source.NETWORK, SortOrder.BY_NAME, null, false, null, 464)).l(new je40(new uqv0(1), 21));
    }

    public final io.reactivex.rxjava3.internal.operators.single.y Z(Peer.Member member) {
        g1e0.a aVar = new g1e0.a();
        aVar.a.c(member);
        return this.f.C(this, new d1e0(new g1e0(aVar))).l(new mh40(new kvm0(member, 17), 25));
    }

    public final void b0(boolean z) {
        if (z) {
            a7f0.a.f(this, io.reactivex.rxjava3.core.x.B(Y(true), this.j.b(), new s1j0(new d(2, this, zhw0.class, "patchContactsList", "patchContactsList(Lcom/vk/voip/ui/calls/presentation/feature/VoipCallServiceFeature$ContactsWithHints;Lcom/vk/voip/ui/calls/presentation/feature/handler/VoipCallServiceBannerHandler$Banner;)Lcom/vk/voip/ui/calls/presentation/model/state/VoipCallServicePatch;", 0), 12)), new ubt0(this, 5), new gfv0(this, 4), 1);
        } else {
            a7f0.a.f(this, this.f.C(this, new rbj(false, null, null, null, false, null, 477)).l(new adz(new fyo0(9), 20)), new mvl0(this, 18), new wgm0(this, 20), 1);
        }
    }

    public final void c0(UserId userId, yiw0 yiw0Var, izs<? super low0, low0> izsVar) {
        if (yiw0Var instanceof yiw0.e) {
            yiw0.e.b bVar = ((yiw0.e) yiw0Var).c;
            yiw0.e.b.C4104b c4104b = bVar instanceof yiw0.e.b.C4104b ? (yiw0.e.b.C4104b) bVar : null;
            if (c4104b == null) {
                return;
            }
            List<low0> list = c4104b.c;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            for (low0 low0Var : list) {
                if (epx.f(low0Var.b, userId)) {
                    low0Var = izsVar.invoke(low0Var);
                }
                arrayList.add(low0Var);
            }
            T(new kiw0(c4104b.a, c4104b.b, arrayList));
        }
    }

    @Override // xsna.wk50, xsna.g4z
    public final void onDestroy() {
        super.onDestroy();
        VoipCallServiceBannerHandler voipCallServiceBannerHandler = this.j;
        voipCallServiceBannerHandler.a.r().f.b(voipCallServiceBannerHandler.d);
        voipCallServiceBannerHandler.c.dispose();
    }
}
