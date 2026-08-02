package defpackage;

import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.ViewParent;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.semantics.f;
import com.yandex.go.agreement.trackable.mvp.TrackableAcceptanceModalView;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.masstransit.sdk.camera.view.MtQRCameraPreview;
import com.yandex.go.masstransit.sdk.order.impl.activation.b;
import com.yandex.go.superapp.orders.card.header.leads.TrackingCardImageWithOverlayImageView;
import com.yandex.go.superapp.orders.card.header.trails.TrackingCardTextWithIconView;
import com.yandex.go.taxi.order.domain.repositories.e0;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.net.dto.objects.Tips;
import com.yandex.go.taxi.order.models.api.objects.TipsType;
import com.yandex.go.taxi.order.view.tips.TipsInputModalView;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.TopupFragment;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.core.transfer.utils.TransferScenario;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.transactions.impl.ui.screens.feed.TransactionsFeedFragment;
import com.ybsdk.feature.transfer.version2.api.TransferMainScreenArguments;
import com.ybsdk.feature.transfer.version2.api.TransferPrerequisites;
import com.ybsdk.feature.transfer.version2.api.TransferSkeletonType;
import com.ybsdk.feature.transfer.version2.internal.entities.ControlState;
import com.ybsdk.feature.transfer.version2.internal.entities.ResultStatus;
import com.ybsdk.feature.transfer.version2.internal.screens.main.presentation.BottomSheetState$SelectAccount$Type;
import com.ybsdk.screens.notice.presentation.TopupNoticeDeprecatedFragment;
import com.ybsdk.screens.notice.presentation.TopupNoticeFragment;
import com.ybsdk.widgets.common.StadiumButtonView;
import com.ybsdk.widgets.common.o;
import defpackage.a2z0;
import defpackage.a60;
import defpackage.bc01;
import defpackage.f1z0;
import defpackage.h1z0;
import defpackage.j1z0;
import defpackage.jhu0;
import defpackage.jl40;
import defpackage.k1z0;
import defpackage.kc01;
import defpackage.l1z0;
import defpackage.m1z0;
import defpackage.n1z0;
import defpackage.o1z0;
import defpackage.o370;
import defpackage.q3z0;
import defpackage.qb30;
import defpackage.qu;
import defpackage.t1z0;
import defpackage.tje;
import defpackage.tse;
import defpackage.u1z0;
import defpackage.v1z0;
import defpackage.w511;
import defpackage.wpy0;
import defpackage.xby;
import defpackage.y50;
import defpackage.z2z0;
import defpackage.zy11;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.text.Regex;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.communications.api.dto.BannerWidgets;
import ru.yandex.taxi.communications.api.dto.TypedContentWidget;
import ru.yandex.taxi.communications.api.dto.ticket.TicketTopAsset;
import ru.yandex.taxi.logistics.sdk.tracking.domain.impl.h;
import ru.yandex.taxi.logistics.sdk.tracking.impl.domain.l;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.preorder.tollroad.TollRoadModalView;

/* loaded from: classes14.dex */
public final /* synthetic */ class pxy0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pxy0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String str;
        TicketTopAsset ticketTopAsset;
        f4z0 f4z0Var;
        yfd yfdVar;
        u2z0 u2z0Var;
        List list;
        u2z0 u2z0Var2;
        u2z0 u2z0Var3;
        int i;
        BannerWidgets.a aVar;
        w3z0 t3z0Var;
        String str2;
        wp2 wp2Var;
        long j;
        w3z0 w3z0Var;
        zy11 insetsType$lambda$0;
        zy11 roadOptionsAdapter$lambda$0;
        zy11 onViewCreated$lambda$4;
        zy11 viewBinding$lambda$5$lambda$4$lambda$2;
        zy11 initBottomSheet$lambda$3$lambda$2;
        zy11 linkMovementMethod_delegate$lambda$0$0;
        zy11 render$lambda$0;
        zy11 render$lambda$0$0;
        long j2;
        zy11 onViewCreated$lambda$9$lambda$5;
        TransferSkeletonType transferSkeletonType;
        int i2 = this.a;
        int i3 = 0;
        Object obj2 = this.b;
        switch (i2) {
            case 0:
                Themes themes = (Themes) obj2;
                x4c.g("Error parsing colors", null, "light=" + themes.getLight() + " dark=" + themes.getDark(), null, 10);
                return zy11.a;
            case 1:
                final b bVar = (b) obj2;
                yfd yfdVar2 = (yfd) obj;
                ((agd) yfdVar2).e = new tls() { // from class: com.yandex.go.masstransit.sdk.order.impl.activation.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj3) {
                        Object value;
                        o1z0 o1z0Var = (o1z0) obj3;
                        b bVar2 = b.this;
                        wpy0 wpy0Var = bVar2.I;
                        d dVar = bVar2.H;
                        tse o = bVar2.o();
                        jhu0 jhu0Var = bVar2.M;
                        wpy0Var.getClass();
                        if (jl40.l(o1z0Var, j1z0.a)) {
                            ((b) jhu0Var.a).r(new qu(9));
                        } else if (jl40.l(o1z0Var, m1z0.a)) {
                            dVar.getClass();
                            xby.d.getClass();
                            dVar.e();
                            r0 r0Var = dVar.c;
                            r0Var.getClass();
                            r0Var.m(null, u1z0.a);
                            tje.N(o, null, null, new TicketActivationScanUiStateInteractor$switchToNfcMode$1(dVar, o, null), 3);
                        } else if (jl40.l(o1z0Var, n1z0.a)) {
                            dVar.getClass();
                            xby.d.getClass();
                            dVar.e();
                            dVar.d(o);
                        } else if (jl40.l(o1z0Var, k1z0.a)) {
                            ((a60) ((y50) ((o370) wpy0Var.b).a)).d();
                        } else {
                            if (!(o1z0Var instanceof l1z0)) {
                                w511.b();
                                return null;
                            }
                            l1z0 l1z0Var = (l1z0) o1z0Var;
                            Uri uri = l1z0Var.a;
                            Rect rect = l1z0Var.b;
                            n0 n0Var = dVar.e;
                            r0 r0Var2 = dVar.c;
                            v1z0 v1z0Var = (v1z0) r0Var2.getValue();
                            if (v1z0Var instanceof t1z0) {
                                t1z0 t1z0Var = (t1z0) v1z0Var;
                                if (t1z0Var.a == null && t1z0Var.b) {
                                    do {
                                        value = r0Var2.getValue();
                                    } while (!r0Var2.k(value, new t1z0(rect, false)));
                                    String uri2 = uri.toString();
                                    Regex regex = qb30.a;
                                    byte[] bytes = uri2.getBytes(StandardCharsets.UTF_8);
                                    if ((bytes.length == 48 && bytes[10] == 48 && bytes[21] == 48 && bytes[32] == 48 && bytes[43] == 48) || qb30.a.h(uri2) || qb30.b.h(uri2)) {
                                        n0Var.g(new h1z0(uri2));
                                    } else {
                                        xby.d.getClass();
                                        n0Var.g(new f1z0(dVar.g));
                                    }
                                }
                            }
                        }
                        return zy11.a;
                    }
                };
                ((agd) yfdVar2).g = new a(1441693732, new alb0(29, bVar), true);
                return zy11.a;
            case 2:
                return (MtQRCameraPreview) obj2;
            case 3:
                final a2z0 a2z0Var = (a2z0) obj2;
                yfd yfdVar3 = (yfd) obj;
                rm5 rm5Var = a2z0Var.d0;
                b4z0 b4z0Var = a2z0Var.G;
                ru.yandex.taxi.communications.api.dto.ticket.a aVar2 = ((o2z0) ((agd) yfdVar3).a).a;
                b4z0Var.getClass();
                TypedContentWidget typedContentWidget = aVar2.j;
                List list2 = aVar2.r;
                String str3 = typedContentWidget.a;
                yp2 yp2Var = b4z0Var.a;
                String str4 = typedContentWidget.b;
                AppColor$Palette appColor$Palette = AppColor$Palette.Text;
                u2z0 u2z0Var4 = new u2z0(str3, yp2Var.a(str4, appColor$Palette));
                TypedContentWidget typedContentWidget2 = aVar2.k;
                u2z0 u2z0Var5 = new u2z0(typedContentWidget2.a, yp2Var.a(typedContentWidget2.b, appColor$Palette));
                TypedContentWidget typedContentWidget3 = aVar2.l;
                u2z0 u2z0Var6 = new u2z0(typedContentWidget3.a, yp2Var.a(typedContentWidget3.b, AppColor$Palette.TextMinor));
                TicketTopAsset ticketTopAsset2 = aVar2.m;
                z2z0 z2z0Var = aVar2.n;
                if (z2z0Var != null) {
                    wp2 a = yp2Var.a(z2z0Var.b, appColor$Palette);
                    Calendar calendar = z2z0Var.a;
                    wp2 a2 = yp2Var.a(z2z0Var.d, AppColor$Palette.BgMinor);
                    z2z0.a aVar3 = z2z0Var.e;
                    str = "";
                    ticketTopAsset = ticketTopAsset2;
                    f4z0Var = new f4z0(calendar, a, yp2Var.a(z2z0Var.c, a), a2, new u2z0(aVar3.a, yp2Var.a(aVar3.b, AppColor$Palette.Error)));
                } else {
                    str = "";
                    ticketTopAsset = ticketTopAsset2;
                    f4z0Var = null;
                }
                boolean z = aVar2.o;
                wp2 a3 = yp2Var.a(aVar2.p, AppColor$Palette.BgFloating);
                Set set = aVar2.q;
                ArrayList arrayList = new ArrayList();
                Iterator it = list2.iterator();
                int i4 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        scc.m();
                        throw null;
                    }
                    BannerWidgets.b bVar2 = (BannerWidgets.b) next;
                    boolean z2 = z;
                    boolean z3 = i4 == scc.f(list2);
                    BannerWidgets.a aVar4 = bVar2.g;
                    boolean z4 = z3;
                    boolean z5 = bVar2.i;
                    Set set2 = set;
                    List list3 = bVar2.h;
                    Iterator it2 = it;
                    String str5 = bVar2.f;
                    String str6 = bVar2.c;
                    String str7 = bVar2.e;
                    if (aVar4 == null) {
                        u2z0Var = u2z0Var6;
                        list = list2;
                        u2z0Var2 = u2z0Var5;
                        u2z0Var3 = u2z0Var4;
                        yfdVar = yfdVar3;
                        i = i5;
                        aVar = new BannerWidgets.a(BannerWidgets.ActionType.DEEPLINK, new BannerWidgets.c(null, false, 1023));
                    } else {
                        yfdVar = yfdVar3;
                        u2z0Var = u2z0Var6;
                        list = list2;
                        u2z0Var2 = u2z0Var5;
                        u2z0Var3 = u2z0Var4;
                        i = i5;
                        aVar = aVar4;
                    }
                    BannerWidgets.c cVar = aVar.b;
                    if (cVar == null) {
                        t3z0Var = null;
                    } else {
                        String str8 = cVar.i;
                        AppColor$Palette appColor$Palette2 = z4 ? AppColor$Palette.Control : AppColor$Palette.ControlMinor;
                        AppColor$Palette appColor$Palette3 = z4 ? AppColor$Palette.TextOnControl : AppColor$Palette.TextOnControlMinor;
                        BannerWidgets.ActionType actionType = aVar.a;
                        int i6 = actionType == null ? -1 : a4z0.a[actionType.ordinal()];
                        if (i6 != 1) {
                            if (i6 == 2) {
                                String str9 = cVar.h;
                                if (str9 == null) {
                                    str9 = str;
                                }
                                u2z0 u2z0Var7 = new u2z0(str9, yp2Var.a(str5, AppColor$Palette.Text));
                                String str10 = cVar.g;
                                if (str10 == null) {
                                    str10 = str;
                                }
                                if (str7 != null) {
                                    if (u9b1.d(rzo.d(Color.parseColor(str7)))) {
                                        str2 = str8;
                                        j = iq2.g;
                                    } else {
                                        str2 = str8;
                                        j = iq2.b;
                                    }
                                    wp2Var = new up2(tje.c(0.5f, j));
                                } else {
                                    str2 = str8;
                                    wp2Var = AppColor$Palette.TextMinor;
                                }
                                u2z0 u2z0Var8 = new u2z0(str10, wp2Var);
                                String str11 = str2 == null ? str : str2;
                                String str12 = cVar.c;
                                w3z0Var = new r3z0(u2z0Var7, u2z0Var8, str11, str12 == null ? str : str12, yp2Var.a(str7, AppColor$Palette.ControlMinor), bVar2.h);
                            } else if (i6 == 3) {
                                t3z0Var = new u3z0(str6 == null ? str : str6, z5, cVar.j, list3);
                            } else if (i6 == 4) {
                                t3z0Var = new s3z0(new u2z0(str6 == null ? str : str6, yp2Var.a(str5, appColor$Palette3)), list3, z5, yp2Var.a(str7, appColor$Palette2));
                            } else if (i6 != 5) {
                                t3z0Var = null;
                            } else {
                                w3z0Var = new v3z0(new u2z0(str6 == null ? str : str6, yp2Var.a(str5, z4 ? AppColor$Palette.TextOnControl : new up2(iq2.g))), str8 == null ? str : str8, cVar.e, cVar.d, yp2Var.a(str7, z4 ? AppColor$Palette.Control : new up2(cq2.c)), false, true);
                            }
                            t3z0Var = w3z0Var;
                        } else {
                            t3z0Var = new t3z0(new u2z0(str6 == null ? str : str6, yp2Var.a(str5, AppColor$Palette.TextOnControl)), yp2Var.a(str7, AppColor$Palette.Control), bVar2.i, cVar.a, bVar2.h);
                        }
                    }
                    if (t3z0Var != null) {
                        arrayList.add(t3z0Var);
                    }
                    it = it2;
                    z = z2;
                    set = set2;
                    u2z0Var6 = u2z0Var;
                    list2 = list;
                    u2z0Var5 = u2z0Var2;
                    u2z0Var4 = u2z0Var3;
                    i4 = i;
                    yfdVar3 = yfdVar;
                }
                final yfd yfdVar4 = yfdVar3;
                x3z0 x3z0Var = new x3z0(u2z0Var4, u2z0Var5, u2z0Var6, ticketTopAsset, f4z0Var, z, a3, set, arrayList, aVar2.s, aVar2.d, aVar2.t, aVar2.i, null);
                r0 r0Var = ((c4z0) rm5Var.b).a;
                r0Var.getClass();
                r0Var.m(null, x3z0Var);
                agd agdVar = (agd) yfdVar4;
                final ru.yandex.taxi.communications.ticket.router.b bVar3 = new ru.yandex.taxi.communications.ticket.router.b(a2z0Var, ((o2z0) agdVar.a).b);
                agdVar.e = new tls() { // from class: ru.yandex.taxi.communications.ticket.router.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj3) {
                        a2z0 a2z0Var2 = a2z0.this;
                        tje.N(a2z0Var2.o(), null, null, new TicketComposeRouter$content$1$1$1(a2z0Var2, (q3z0) obj3, bVar3, yfdVar4, null), 3);
                        return zy11.a;
                    }
                };
                fpb1.e(yfdVar4, new i5y0(15, yfdVar4, bVar3));
                hed.a.getClass();
                agdVar.g = hed.b;
                return zy11.a;
            case 4:
                mnq0 mnq0Var = (mnq0) obj;
                f.p(mnq0Var, 0);
                f.l(mnq0Var, ((s37) obj2).a.toString());
                return zy11.a;
            case 5:
                insetsType$lambda$0 = TipsInputModalView.insetsType$lambda$0((TipsInputModalView) obj2, (t1w) obj);
                return insetsType$lambda$0;
            case 6:
                int intValue = ((Integer) obj).intValue();
                uio0 uio0Var = ((bgz0) obj2).j;
                String valueOf = String.valueOf(intValue);
                TaxiOrder v = ((e0) ((p2y0) uio0Var.a)).v();
                if (v == null) {
                    ((com.yandex.go.taxi.order.tipssuggest.domain.a) uio0Var.d).g(new Tips(valueOf, TipsType.PERCENT));
                } else {
                    TipsType tipsType = TipsType.PERCENT;
                    v.U(valueOf, tipsType);
                    ((ysg) uio0Var.c).g(v);
                    ((com.yandex.go.taxi.order.tipssuggest.domain.a) uio0Var.d).f(v.a, new Tips(valueOf, tipsType));
                    String str13 = v.a;
                    isq isqVar = new isq(str13, ((com.yandex.go.taxi.order.feedback.domain.b) ((dm21) uio0Var.f)).b(str13));
                    isqVar.h = valueOf;
                    isqVar.g = tipsType;
                    isqVar.i = true;
                    DriveState driveState = v.h.b;
                    DriveState driveState2 = DriveState.COMPLETE;
                    dm21 dm21Var = (dm21) uio0Var.f;
                    if (driveState == driveState2) {
                        ((com.yandex.go.taxi.order.feedback.domain.b) dm21Var).d(str13, new ksq(isqVar));
                    } else {
                        ((com.yandex.go.taxi.order.feedback.domain.b) dm21Var).c(new ksq(isqVar), true);
                    }
                }
                return zy11.a;
            case 7:
                roadOptionsAdapter$lambda$0 = TollRoadModalView.roadOptionsAdapter$lambda$0((TollRoadModalView) obj2, (ntk0) obj);
                return roadOptionsAdapter$lambda$0;
            case 8:
                mnq0 mnq0Var2 = (mnq0) obj;
                String str14 = ((msz0) obj2).c;
                f.l(mnq0Var2, str14 != null ? str14 : "");
                return zy11.a;
            case 9:
                mnq0 mnq0Var3 = (mnq0) obj;
                f.p(mnq0Var3, 0);
                f.l(mnq0Var3, ((osz0) obj2).b);
                return zy11.a;
            case 10:
                onViewCreated$lambda$4 = TopupFragment.onViewCreated$lambda$4((TopupFragment) obj2, (mx60) obj);
                return onViewCreated$lambda$4;
            case 11:
                viewBinding$lambda$5$lambda$4$lambda$2 = TopupNoticeDeprecatedFragment.getViewBinding$lambda$5$lambda$4$lambda$2((TopupNoticeDeprecatedFragment) obj2, ((Boolean) obj).booleanValue());
                return viewBinding$lambda$5$lambda$4$lambda$2;
            case 12:
                initBottomSheet$lambda$3$lambda$2 = TopupNoticeFragment.initBottomSheet$lambda$3$lambda$2((TopupNoticeFragment) obj2, ((Boolean) obj).booleanValue());
                return initBottomSheet$lambda$3$lambda$2;
            case 13:
                linkMovementMethod_delegate$lambda$0$0 = TrackableAcceptanceModalView.linkMovementMethod_delegate$lambda$0$0((TrackableAcceptanceModalView) obj2, (String) obj);
                return linkMovementMethod_delegate$lambda$0$0;
            case 14:
                zv7 zv7Var = (zv7) obj;
                ((l) obj2).f(new un(zv7Var.a, zv7Var.b, zv7Var.c, null));
                return zy11.a;
            case 15:
                render$lambda$0 = TrackingCardImageWithOverlayImageView.render$lambda$0((TrackingCardImageWithOverlayImageView) obj2, (Drawable) obj);
                return render$lambda$0;
            case 16:
                render$lambda$0$0 = TrackingCardTextWithIconView.render$lambda$0$0((TrackingCardTextWithIconView) obj2, (Drawable) obj);
                return render$lambda$0$0;
            case 17:
                ViewParent viewParent = (ViewParent) obj2;
                ViewParent parent = ((ViewParent) obj).getParent();
                if (parent == null || parent.equals(viewParent)) {
                    return null;
                }
                return parent;
            case 18:
                h hVar = ((ru.yandex.taxi.logistics.sdk.tracking.domain.impl.data.f) obj2).c;
                Long l = ((fo2) obj).a;
                hVar.getClass();
                if (l != null) {
                    Long l2 = l.longValue() > 0 ? l : null;
                    if (l2 != null) {
                        j2 = l2.longValue();
                        hVar.b = j2;
                        return zy11.a;
                    }
                }
                j2 = 60000;
                hVar.b = j2;
                return zy11.a;
            case 19:
                final kc01 kc01Var = (kc01) obj2;
                yfd yfdVar5 = (yfd) obj;
                ((agd) yfdVar5).c = kc01Var.H.d;
                agd agdVar2 = (agd) yfdVar5;
                agdVar2.e = new tls() { // from class: ru.yandex.taxi.masstransit.trains.search.c
                    @Override // defpackage.tls
                    public final Object invoke(Object obj3) {
                        kc01 kc01Var2 = kc01.this;
                        tje.N(kc01Var2.o(), null, null, new TrainStationSearchModalRouter$content$1$1$1(kc01Var2, (bc01) obj3, null), 3);
                        return zy11.a;
                    }
                };
                agdVar2.g = new a(176641941, new ic01(i3, kc01Var), true);
                return zy11.a;
            case 20:
                uv6 uv6Var = (uv6) obj2;
                yfd yfdVar6 = (yfd) obj;
                ((agd) yfdVar6).e = new rmy0(23, uv6Var, new wpy0(9, uv6Var));
                red.a.getClass();
                ((agd) yfdVar6).g = red.b;
                return zy11.a;
            case 21:
                onViewCreated$lambda$9$lambda$5 = TransactionsFeedFragment.onViewCreated$lambda$9$lambda$5((TransactionsFeedFragment) obj2, (tb6) obj);
                return onViewCreated$lambda$9$lambda$5;
            case 22:
                ((tj01) obj2).invoke((px11) obj);
                return zy11.a;
            case 23:
                ((tj01) obj2).invoke((StadiumButtonView.ClickedPart) obj);
                return zy11.a;
            case 24:
                ((tj01) obj2).invoke((t451) obj);
                return zy11.a;
            case 25:
                ((tj01) obj2).invoke((o) obj);
                return zy11.a;
            case 26:
                nh01 nh01Var = (nh01) obj2;
                kk01 kk01Var = (kk01) obj;
                ResultStatus resultStatus = ResultStatus.PROCESSING;
                String str15 = nh01Var.b;
                Text.Constant i7 = str15 != null ? g8e.i(Text.Companion, str15) : null;
                String str16 = nh01Var.c;
                return kk01.a(kk01Var, null, resultStatus, null, null, i7, str16 != null ? g8e.i(Text.Companion, str16) : null, null, null, null, null, null, 8091);
            case 27:
                ControlState controlState = (ControlState) obj2;
                wk01 wk01Var = (wk01) obj;
                vm01 vm01Var = wk01Var.C;
                return wk01.b(wk01Var, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, false, null, false, vm01Var != null ? new vm01(vm01Var.a, vm01Var.b, vm01Var.c, controlState, vm01Var.e, vm01Var.f, vm01Var.g, vm01Var.h, vm01Var.i) : null, null, null, null, null, null, null, -268435457, 15);
            case 28:
                wk01 wk01Var2 = (wk01) obj2;
                ak1 ak1Var = wk01Var2.g;
                return wk01.b(wk01Var2, null, null, null, null, null, new tg6(new sl(ak1Var.a, ak1Var.c, ak1Var.g, com.ybsdk.feature.transfer.version2.api.mappers.a.j(ak1Var.e), null, ak1Var.l, ak1Var.m), wk01Var2.n, null, null, BottomSheetState$SelectAccount$Type.MAIN), null, null, null, null, null, null, null, false, false, null, null, false, null, false, null, null, null, null, null, null, null, -129, 15);
            default:
                xk01 xk01Var = (xk01) obj;
                TransferMainScreenArguments transferMainScreenArguments = ((com.ybsdk.feature.transfer.version2.internal.screens.main.presentation.a) obj2).O;
                TransferSkeletonType skeletonType = transferMainScreenArguments.getSkeletonType();
                if (skeletonType == null) {
                    TransferScenario scenario = transferMainScreenArguments.getScenario();
                    switch (scenario == null ? -1 : yk01.b[scenario.ordinal()]) {
                        case -1:
                        case 12:
                            int i8 = yk01.a[transferMainScreenArguments.getDirection().ordinal()];
                            if (i8 == 1) {
                                transferSkeletonType = TransferSkeletonType.ACTION_BUTTONS;
                                break;
                            } else {
                                if (i8 != 2) {
                                    w511.b();
                                    return null;
                                }
                                transferSkeletonType = TransferSkeletonType.SUGGESTS;
                                break;
                            }
                        case 0:
                        default:
                            w511.b();
                            return null;
                        case 1:
                            transferSkeletonType = TransferSkeletonType.SCENARIO;
                            break;
                        case 2:
                            transferSkeletonType = TransferSkeletonType.SCENARIO;
                            break;
                        case 3:
                            transferSkeletonType = TransferSkeletonType.ACTION_BUTTONS;
                            break;
                        case 4:
                            if (!(transferMainScreenArguments.getPrerequisites() instanceof TransferPrerequisites.Phone)) {
                                transferSkeletonType = TransferSkeletonType.SCENARIO;
                                break;
                            } else {
                                transferSkeletonType = TransferSkeletonType.ACTION_BUTTONS;
                                break;
                            }
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                            transferSkeletonType = TransferSkeletonType.SUGGESTS;
                            break;
                        case 13:
                            ny61.f("TODO CREDITPRODUCT-384");
                            return null;
                    }
                    skeletonType = transferSkeletonType;
                }
                return new vk01(skeletonType, xk01Var.a());
        }
    }
}
