package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.Handler;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.x0;
import com.google.android.material.button.MaterialButton;
import com.yandex.go.lottery.domain.c;
import com.yandex.go.payments.shared.SharedPaymentAnalytics$Button;
import com.yandex.go.payments.shared.SharedPaymentAnalytics$CloseReason;
import com.yandex.go.payments.shared.a;
import com.yandex.go.payments.shared.data.model.Member;
import com.yandex.go.payments.shared.data.model.SetCommonLimitRequest;
import com.yandex.go.payments.shared.members.list.MemberListMode;
import com.yandex.go.payments.shared.v;
import com.yandex.go.payments.shared.y;
import com.yandex.go.sharedpayments.api.analytics.SharedPaymentsOpenReason;
import com.yandex.messaging.core.net.entities.proto.OnlyTimestampsChatHistoryResponse;
import com.yandex.messaging.core.net.entities.proto.OnlyTimestampsHistoryResponse;
import com.yandex.messaging.internal.LocalMessageRef;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.view.timeline.g0;
import com.ybsdk.core.design.widget.ModalView;
import com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.providers.presentation.MobileProvidersListFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.selectcontact.presentation.MobilePaymentSelectContactFragment;
import defpackage.lb30;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.text.Regex;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.gopayments.dto.MemberRole;
import ru.yandex.taxi.gopayments.dto.SharedAccountType;
import ru.yandex.taxi.maas.api.analytics.MultiTransportChooseStationCardAnalytics$OpenReasonV2;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.settings.main.MainMenuProcessor$MenuEntry;
import ru.yandex.taxi.settings.main.f;
import ru.yandex.taxi.web.UiWebViewConfig;
import ru.yandex.taxi.web.b;

/* loaded from: classes13.dex */
public final /* synthetic */ class p500 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p500(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f fVar;
        f fVar2;
        f fVar3;
        rsx rsxVar;
        int i = this.a;
        int i2 = 0;
        String str = null;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                f fVar4 = (f) obj2;
                tmr0 tmr0Var = (tmr0) obj;
                a aVar = (a) fVar4.a0.get();
                aVar.getClass();
                if (tmr0Var.a() == SharedAccountType.BUSINESS) {
                    aVar.a.e(SharedPaymentsOpenReason.MENU, false);
                }
                vnr0 vnr0Var = fVar4.K;
                String str2 = tmr0Var.a;
                cug cugVar = vnr0Var.p;
                cugVar.getClass();
                HashMap hashMap = new HashMap();
                if (str2 != null) {
                    hashMap.put("type_group", str2);
                }
                cugVar.a.a("SettingsDidSelectCreateGroup", hashMap, 1, new HashMap());
                snr0 j = ((v) fVar4.M.get()).j(tmr0Var);
                u500 u500Var = fVar4.D;
                if (j != null) {
                    u500Var.getClass();
                    u500Var.d(MainMenuProcessor$MenuEntry.SHARED_PAYMENT_EXISTS_DIALOG, new mmr0(j, tmr0Var));
                    break;
                } else {
                    SharedPaymentsOpenReason sharedPaymentsOpenReason = SharedPaymentsOpenReason.MENU;
                    u500Var.getClass();
                    u500Var.d(MainMenuProcessor$MenuEntry.CREATE_SHARED_PAYMENT_GROUP, new umr0(tmr0Var, sharedPaymentsOpenReason, null));
                    break;
                }
            case 1:
                ((i700) obj2).bh(new k200(3, (pot0) obj));
                break;
            case 2:
                i700 i700Var = (i700) obj2;
                xrz xrzVar = (xrz) obj;
                if (!i700Var.s0 && !i700Var.t0 && (fVar = i700Var.r0) != null) {
                    i700Var.s0 = true;
                    String str3 = xrzVar.c;
                    c cVar = (c) fVar.W.get();
                    ((j) cVar.b.a).n("SuperAppMain.LotteryButtonMenu.Tapped");
                    ((a60) cVar.a).c(str3, v770.q);
                    break;
                }
                break;
            case 3:
                i700 i700Var2 = (i700) obj2;
                ListItemComponent listItemComponent = (ListItemComponent) obj;
                if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                    i700Var2.s0 = true;
                    jj10 jj10Var = fVar2.A.d;
                    jj10Var.getClass();
                    jj10Var.a.a("Menu.MultiTransportTapped", new HashMap(), 1, new HashMap());
                    u500 u500Var2 = fVar2.D;
                    MultiTransportChooseStationCardAnalytics$OpenReasonV2 multiTransportChooseStationCardAnalytics$OpenReasonV2 = MultiTransportChooseStationCardAnalytics$OpenReasonV2.Menu;
                    u500Var2.getClass();
                    u500Var2.c(MainMenuProcessor$MenuEntry.MAAS, multiTransportChooseStationCardAnalytics$OpenReasonV2);
                    break;
                }
                break;
            case 4:
                i700 i700Var3 = (i700) obj2;
                lc4 lc4Var = (lc4) obj;
                if (!i700Var3.s0 && !i700Var3.t0 && (fVar3 = i700Var3.r0) != null) {
                    i700Var3.s0 = true;
                    u500 u500Var3 = fVar3.D;
                    String str4 = lc4Var.b;
                    String b = ((g) u500Var3.b.get()).b();
                    UiWebViewConfig.Companion.getClass();
                    u500Var3.d(MainMenuProcessor$MenuEntry.WEB_VIEW_ACTIVITY, b.a(str4, null, b, true, false));
                    break;
                }
                break;
            case 5:
                ((gh00) ((ah00) obj2)).u((b01) obj);
                break;
            case 6:
                ((sls) obj2).invoke();
                ((xq00) obj).c().removeAllListeners();
                break;
            case 7:
                Iterator it = (Iterator) obj2;
                itj0 itj0Var = (itj0) obj;
                while (it.hasNext()) {
                    mbv0 mbv0Var = ((qbv0) it.next()).a.M;
                    mbv0Var.getClass();
                    RoutePointType routePointType = itj0Var.b;
                    String str5 = itj0Var.a;
                    if (!mbv0Var.g.z(mbv0.i(mbv0Var, str5, 1), mbv0Var.l, mbv0Var.j, routePointType != null ? routePointType.getType() : str)) {
                        pj pjVar = mbv0Var.h;
                        String str6 = mbv0Var.n;
                        long currentTimeMillis = System.currentTimeMillis();
                        String str7 = mbv0Var.l;
                        int i3 = mbv0Var.j;
                        String str8 = mbv0Var.i;
                        String str9 = mbv0Var.m;
                        if (str9 == null || str9.length() == 0) {
                            str9 = str;
                        }
                        String a = mbv0Var.f.a();
                        String type = routePointType != null ? routePointType.getType() : str;
                        pjVar.getClass();
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("event_context", str6);
                        if (str8 != null) {
                            hashMap2.put("address_search", str8);
                        }
                        if (str9 != null) {
                            hashMap2.put("suggest_serpid", str9);
                        }
                        hashMap2.put("event_milli_timestamp", Long.valueOf(currentTimeMillis));
                        hashMap2.put("client_reqid", str5);
                        if (a != null) {
                            hashMap2.put("MainScreenVersion", a);
                        }
                        hashMap2.put("part", str7);
                        if (type != null) {
                            hashMap2.put("search_type", type);
                        }
                        HashMap n = x4e.n(i3, hashMap2, "editOpCount");
                        Regex regex = sho.a;
                        pjVar.a.a(sb2.q("${event_context}.SuggestSearchRendered", hashMap2), hashMap2, 1, n);
                    }
                    str = null;
                }
                break;
            case 8:
                wv00 wv00Var = (wv00) obj2;
                wv00Var.n((androidx.lifecycle.v) obj, new hs7(4, new k200(11, wv00Var)));
                break;
            case 9:
                h610 h610Var = (h610) obj2;
                String str10 = (String) obj;
                h610Var.f.a.a = true;
                h610Var.e.a.a.q(new Date().getTime(), "ru.yandex.taxi.utils.PreferenceUtils.FIELD_MASTERCARD_LAST_SHOWN_TIMESTAMP");
                h610Var.a();
                if (str10 != null && str10.length() != 0) {
                    ru.yandex.taxi.banners.c.l(h610Var.b, str10, "mastercard_cashback", null, null, null, 28);
                    break;
                }
                break;
            case 10:
                ((MaterialButton) obj2).lambda$maybeRunAfterWidthAnimation$0((Runnable) obj);
                break;
            case 11:
                ((ue10) obj2).d.reportTrackChangeEvent((TrackChangeEvent) obj);
                break;
            case 12:
                ((ue10) obj2).d.reportNetworkEvent((NetworkEvent) obj);
                break;
            case 13:
                ((ue10) obj2).d.reportPlaybackErrorEvent((PlaybackErrorEvent) obj);
                break;
            case 14:
                ((ue10) obj2).d.reportPlaybackMetrics((PlaybackMetrics) obj);
                break;
            case 15:
                ((ue10) obj2).d.reportPlaybackStateEvent((PlaybackStateEvent) obj);
                break;
            case 16:
                ((c9e) obj2).accept((yf10) obj);
                break;
            case 17:
                com.yandex.go.payments.shared.members.list.b bVar = (com.yandex.go.payments.shared.members.list.b) obj2;
                Member member = (Member) obj;
                ai10 ai10Var = bVar.x;
                if (!bVar.J && member.b != MemberRole.OWNER) {
                    MemberListMode memberListMode = ai10Var.a;
                    MemberListMode memberListMode2 = MemberListMode.LIMITS;
                    vnr0 vnr0Var2 = bVar.B;
                    if (memberListMode == memberListMode2) {
                        vnr0Var2.t(bVar.Lg(), SharedPaymentAnalytics$Button.USER_SELECTED, bVar.Mg().d.size());
                    } else {
                        vnr0Var2.p(bVar.Mg().a, bVar.Kg(), SharedPaymentAnalytics$Button.PARTICIPANT_SELECTED, bVar.J, ai10Var.a, bVar.Mg().d.size());
                        bVar.B.o(bVar.Mg().a, bVar.Kg(), SharedPaymentAnalytics$CloseReason.PARTICIPANT_SELECTED, bVar.J, ai10Var.a, bVar.Mg().d.size());
                        ((zh10) bVar.Dg()).S4(bVar.E);
                    }
                    hwo0 hwo0Var = bVar.G;
                    String str11 = member.a;
                    SharedPaymentsOpenReason sharedPaymentsOpenReason2 = ai10Var.a == memberListMode2 ? SharedPaymentsOpenReason.LIMITS_CARD : SharedPaymentsOpenReason.PARTICIPANTS_LIST_CARD;
                    y yVar = (y) hwo0Var.c;
                    qor0 a2 = yVar.c.a();
                    il ilVar = (il) hwo0Var.w;
                    ynr0 ynr0Var = (ynr0) hwo0Var.x;
                    a2.c(new vln(str11, ilVar, new vor0(yVar, ynr0Var), sharedPaymentsOpenReason2, ynr0Var.i));
                    break;
                }
                break;
            case 18:
                com.yandex.go.payments.shared.members.list.b bVar2 = (com.yandex.go.payments.shared.members.list.b) obj2;
                vnr0 vnr0Var3 = bVar2.B;
                vnr0Var3.s(SharedPaymentAnalytics$Button.YES);
                bVar2.Qg(new SetCommonLimitRequest((Long) obj, true));
                vnr0Var3.r(SharedPaymentAnalytics$CloseReason.DONE_BUTTON);
                break;
            case 19:
                ((hba0) ((jm10) obj2).U).p6(((hm10) obj).b);
                break;
            case 20:
                ((c0x) ((nrh) obj2)).a(new ServerMessageRef[]{(ServerMessageRef) obj});
                break;
            case 21:
                g0 g0Var = ((ps10) obj2).e;
                LocalMessageRef.Companion.getClass();
                LocalMessageRef b2 = t3z.b((String) obj);
                g0Var.getClass();
                tje.e();
                g0Var.a.b(g0Var.b, b2);
                break;
            case 22:
                oy10 oy10Var = (oy10) obj2;
                Handler handler = oy10Var.c;
                OnlyTimestampsChatHistoryResponse[] onlyTimestampsChatHistoryResponseArr = ((OnlyTimestampsHistoryResponse) obj).chats;
                if (onlyTimestampsChatHistoryResponseArr != null) {
                    py10 py10Var = oy10Var.d;
                    for (OnlyTimestampsChatHistoryResponse onlyTimestampsChatHistoryResponse : j73.A(onlyTimestampsChatHistoryResponseArr)) {
                        s020 e = py10Var.c.e(onlyTimestampsChatHistoryResponse.chatId);
                        if (e != null && (rsxVar = (rsx) ((m8g) e).r0.get()) != null) {
                            rsxVar.a(onlyTimestampsChatHistoryResponse.lastMessageTimestamp, onlyTimestampsChatHistoryResponse.minMessageTimestamp, new uhx(13, oy10Var));
                        }
                    }
                }
                handler.removeCallbacksAndMessages(null);
                handler.postDelayed(new my10(oy10Var, i2), 60000L);
                break;
            case 23:
                ((odv) obj).r((c920) obj2);
                break;
            case 24:
                ((th20) obj2).a.evaluateJavascript((String) obj, null);
                break;
            case 25:
                MobilePaymentSelectContactFragment.setAdapterElements$lambda$18((qt20) obj2, (MobilePaymentSelectContactFragment) obj);
                break;
            case 26:
                MobileProvidersListFragment.setAdapterElements$lambda$15((mu20) obj2, (MobileProvidersListFragment) obj);
                break;
            case 27:
                ((ModalView) obj2).lambda$dismissInternal$4((Runnable) obj);
                break;
            case 28:
                ((com.yandex.go.taxi.main.f) obj2).R((rre0) obj);
                break;
            default:
                ArrayList arrayList = (ArrayList) obj2;
                final lb30 lb30Var = (lb30) obj;
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    final x0 x0Var = (x0) it2.next();
                    View view = x0Var.a;
                    final ViewPropertyAnimator animate = view.animate();
                    lb30Var.w.add(x0Var);
                    view.setTranslationX(lb30.z(view));
                    animate.translationX(0.0f).setDuration(lb30Var.e).setListener(new AnimatorListenerAdapter() { // from class: ru.yandex.taxi.widget.anim.MoveAwayItemAnimatorV2$animateAddImpl$1
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            animate.setListener(null);
                            lb30.this.s(x0Var);
                            lb30.this.w.remove(x0Var);
                            lb30 lb30Var2 = lb30.this;
                            if (lb30Var2.m()) {
                                return;
                            }
                            lb30Var2.i();
                        }

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationStart(Animator animator) {
                            lb30.this.getClass();
                        }
                    }).start();
                }
                arrayList.clear();
                lb30Var.v.remove(arrayList);
                break;
        }
    }
}
