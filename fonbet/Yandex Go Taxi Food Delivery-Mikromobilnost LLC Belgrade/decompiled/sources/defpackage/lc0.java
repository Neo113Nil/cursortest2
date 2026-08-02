package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.animation.core.c;
import androidx.compose.animation.core.e;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.g;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.semantics.f;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.OneShotPreDrawListener;
import com.adjust.sdk.Constants;
import com.airbnb.lottie.LottieAnimationView;
import com.yandex.div.core.view2.Div2View;
import com.yandex.go.intercity.flex.dashboard.analytics.IntercityCheckoutAnalytics$PointType;
import com.yandex.go.intercity.flex.dashboard.flex.sdk.descriptors.action.serializer.IntercityOpenShuttleClarifyPointAction;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.i0;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.dashboard.IntercityDashboardResponseDto;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import com.yandex.xplat.payment.sdk.SbpPollingStrategy;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.dashboard.internal.ui.dashboard3.view.DashboardCardView;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;
import core.divkit.view.DivViewLayout;
import defpackage.aig;
import defpackage.aq8;
import defpackage.big;
import defpackage.cig;
import defpackage.gob1;
import defpackage.hig;
import defpackage.k5;
import defpackage.kp50;
import defpackage.li91;
import defpackage.m810;
import defpackage.n70;
import defpackage.rbv;
import defpackage.sms0;
import defpackage.t661;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.u661;
import defpackage.v4b1;
import defpackage.xty0;
import defpackage.yp8;
import defpackage.zhg;
import defpackage.zo31;
import defpackage.zp8;
import defpackage.zy11;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.logistics.sdk.dashboard.core.SectionStyle;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final /* synthetic */ class lc0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ lc0(rsf rsfVar, sls slsVar, tls tlsVar, tls tlsVar2) {
        this.a = 13;
        this.b = tlsVar;
        this.x = rsfVar;
        this.w = tlsVar2;
        this.c = slsVar;
    }

    private final Object b(Object obj) {
        m3u0 m3u0Var = (m3u0) this.x;
        m3u0 m3u0Var2 = (m3u0) this.b;
        ohy ohyVar = (ohy) this.w;
        m3u0 m3u0Var3 = (m3u0) this.c;
        c1y c1yVar = (c1y) obj;
        c1yVar.a();
        float w0 = c1yVar.w0(((y7m) m3u0Var.getValue()).a);
        float floatValue = (((Number) m3u0Var2.getValue()).floatValue() * w0) + Float.intBitsToFloat((int) (c1yVar.a.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        LayoutDirection layoutDirection = c1yVar.getLayoutDirection();
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        c1yVar.h(((ldc) m3u0Var3.getValue()).a, (Float.floatToRawIntBits(c1yVar.w0(layoutDirection == layoutDirection2 ? ohyVar.a : ohyVar.b)) << 32) | (Float.floatToRawIntBits(floatValue) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (r15.c() >> 32)) - c1yVar.w0(c1yVar.getLayoutDirection() == layoutDirection2 ? ohyVar.b : ohyVar.a)) << 32) | (Float.floatToRawIntBits(floatValue) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), w0, (r21 & 16) != 0 ? 0 : 0, (r21 & 32) != 0 ? null : null);
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:271:0x078c  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x07ad  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x021f  */
    /* JADX WARN: Type inference failed for: r1v117, types: [T, hbv] */
    /* JADX WARN: Type inference failed for: r1v24, types: [T, java.lang.Object, xpy0] */
    @Override // defpackage.tls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int i;
        qor qorVar;
        String format;
        PaymentMethod$Type c;
        PaymentMethod$Type c2;
        zh4 zh4Var;
        g3q0 g3q0Var;
        boolean z;
        qgg qggVar;
        zy11 zy11Var;
        Pair pair;
        IntercityCheckoutAnalytics$PointType intercityCheckoutAnalytics$PointType;
        int i2;
        String str;
        Object obj2;
        IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity intercityDashboardSectionDto$TariffSelectorSectionDtoIntercity;
        xfw xfwVar;
        Object obj3;
        Object obj4;
        pex0 pex0Var;
        Integer num;
        int i3 = this.a;
        int i4 = 13;
        int i5 = 12;
        int i6 = 8;
        zy11 zy11Var2 = zy11.a;
        Object obj5 = this.c;
        Object obj6 = this.w;
        Object obj7 = this.b;
        Object obj8 = this.x;
        switch (i3) {
            case 0:
                yb0 yb0Var = (yb0) obj8;
                tls tlsVar = (tls) obj7;
                pa90 pa90Var = (pa90) obj5;
                tls tlsVar2 = (tls) obj6;
                u6y u6yVar = (u6y) obj;
                List list = yb0Var.e;
                List list2 = yb0Var.f;
                if (!list.isEmpty()) {
                    Set set = yb0Var.i;
                    b2d.a.getClass();
                    u6y.b(u6yVar, null, b2d.c, 3);
                    int i7 = 2;
                    ((m6y) u6yVar).f(list.size(), new tj(i7, new zbd(7), list), new qc0(list, i7), new a(2039820996, new zc0(list, list, set, tlsVar, pa90Var), true));
                }
                b2d.a.getClass();
                u6y.b(u6yVar, null, b2d.b, 3);
                if (!list2.isEmpty()) {
                    Set set2 = yb0Var.j;
                    u6y.b(u6yVar, null, b2d.d, 3);
                    ((m6y) u6yVar).f(list2.size(), new qc0(list2, 1, new p0(i4)), new rc0(list2, 1, xc0.a), new a(802480018, new yc0(0, list2, set2, tlsVar2), true));
                }
                return zy11Var2;
            case 1:
                List list3 = (List) obj8;
                ((m6y) ((u6y) obj)).f(list3.size(), new qc0(list3, 0, new p0(i5)), new rc0(list3, 0, pc0.a), new a(802480018, new sc0(list3, (tls) obj7, (pa90) obj5, (tls) obj6), true));
                return zy11Var2;
            case 2:
                androidx.compose.animation.core.a aVar = (androidx.compose.animation.core.a) obj8;
                kj2 kj2Var = (kj2) obj6;
                tls tlsVar3 = (tls) obj7;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj5;
                xi2 xi2Var = (xi2) obj;
                e.i(xi2Var, aVar.d);
                oz40 oz40Var = xi2Var.e;
                Object a = androidx.compose.animation.core.a.a(aVar, oz40Var.getValue());
                if (!jl40.l(a, oz40Var.getValue())) {
                    aVar.d.k(a);
                    kj2Var.k(a);
                    if (tlsVar3 != null) {
                        tlsVar3.invoke(aVar);
                    }
                    xi2Var.a();
                    ref$BooleanRef.element = true;
                } else if (tlsVar3 != null) {
                    tlsVar3.invoke(aVar);
                }
                return zy11Var2;
            case 3:
                ArrayList arrayList = (ArrayList) obj8;
                qor qorVar2 = (qor) obj7;
                qor qorVar3 = (qor) obj6;
                qor qorVar4 = (qor) obj5;
                o.a aVar2 = (o.a) obj;
                int size = arrayList.size();
                int i8 = 0;
                while (i8 < size) {
                    o oVar = (o) arrayList.get(i8);
                    if (oVar != null) {
                        if (i8 != 0) {
                            i = 1;
                            qorVar = i8 != 1 ? qorVar4 : qorVar3;
                        } else {
                            i = 1;
                            qorVar = qorVar2;
                        }
                        o.a.x(aVar2, oVar, 0, 0, new yo1(qorVar.getFloatValue(), i), 4);
                    }
                    i8++;
                }
                return zy11Var2;
            case 4:
                Consumer consumer = (Consumer) obj6;
                ((LottieAnimationView) obj8).setVisibility(8);
                ((ImageView) obj7).setVisibility(0);
                Long l = (Long) tsf0.b.get((String) obj5);
                consumer.accept(Long.valueOf(l != null ? SystemClock.elapsedRealtime() - l.longValue() : 0L));
                return zy11Var2;
            case 5:
                RobotoTextView robotoTextView = (RobotoTextView) obj8;
                Context context = (Context) obj7;
                f611 f611Var = (f611) obj6;
                auy0 auy0Var = (auy0) obj5;
                if (robotoTextView.isAttachedToWindow()) {
                    robotoTextView.setText(q5b1.j(context, f611Var, auy0Var));
                } else {
                    OneShotPreDrawListener.add(robotoTextView, new kz(robotoTextView, context, f611Var, auy0Var, 3));
                }
                return robotoTextView;
            case 6:
                final bt5 bt5Var = (bt5) obj8;
                String str2 = (String) obj7;
                final aq80 aq80Var = (aq80) obj6;
                final oy80 oy80Var = (oy80) obj5;
                final rka0 rka0Var = (rka0) obj;
                String str3 = rka0Var.a;
                if (bt5Var.p) {
                    final int i9 = 0;
                    return bt5Var.e.b(new xu20(str3, str2, 0)).g(new tls() { // from class: us5
                        @Override // defpackage.tls
                        public final Object invoke(Object obj9) {
                            int i10 = i9;
                            oy80 oy80Var2 = oy80Var;
                            aq80 aq80Var2 = aq80Var;
                            rka0 rka0Var2 = rka0Var;
                            bt5 bt5Var2 = bt5Var;
                            switch (i10) {
                                case 0:
                                    break;
                                default:
                                    break;
                            }
                            return bt5Var2.e(rka0Var2.a, SbpPollingStrategy.resolveOnSuccess, aq80Var2, oy80Var2);
                        }
                    });
                }
                aiw0 aiw0Var = new aiw0(bt5Var.a.b, str3, rka0Var.b, 0);
                nhj nhjVar = bt5Var.d;
                md51 a2 = hg91.a("supply_new_sbp_pay", nhjVar.b, new bmh(20, nhjVar, aiw0Var));
                final int i10 = 1;
                return a2.g(new tls() { // from class: us5
                    @Override // defpackage.tls
                    public final Object invoke(Object obj9) {
                        int i102 = i10;
                        oy80 oy80Var2 = oy80Var;
                        aq80 aq80Var2 = aq80Var;
                        rka0 rka0Var2 = rka0Var;
                        bt5 bt5Var2 = bt5Var;
                        switch (i102) {
                            case 0:
                                break;
                            default:
                                break;
                        }
                        return bt5Var2.e(rka0Var2.a, SbpPollingStrategy.resolveOnSuccess, aq80Var2, oy80Var2);
                    }
                });
            case 7:
                n70 n70Var = (n70) obj8;
                Locale locale = (Locale) obj5;
                tls tlsVar4 = (tls) obj7;
                Object Z = n70Var.Z();
                Context context2 = n70Var.P;
                pf7 pf7Var = ((jf7) Z).a;
                boolean booleanValue = ((Boolean) ((sls) obj6).invoke()).booleanValue();
                TextView textView = ((f261) n70Var.N).b;
                if (booleanValue) {
                    format = "";
                } else {
                    kb61 kb61Var = pf7Var.a;
                    format = new SimpleDateFormat(kb61Var.a == Calendar.getInstance().get(1) ? "LLLL" : "LLLL, yyyy", locale).format(kb61Var.b().getTime());
                    if (format.length() > 0) {
                        format = ((Object) String.valueOf(format.charAt(0)).toUpperCase(Locale.ROOT)) + format.substring(1);
                    }
                }
                textView.setText(format);
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = booleanValue ? kp50.r(95) : -2;
                    textView.setLayoutParams(layoutParams);
                    if (booleanValue) {
                        textView.setOnClickListener(null);
                    } else {
                        textView.setOnClickListener(new k5(i5, tlsVar4, pf7Var));
                    }
                    int i11 = qf7.a[((jf7) n70Var.Z()).a.b.ordinal()];
                    if (i11 == 1) {
                        textView.setTextColor(rje.a(context2, ung0.ybColor_textIcon_primary));
                        textView.setBackgroundResource(nyg0.ybsdk_pfm_calendar_month_bg);
                    } else if (i11 == 2) {
                        textView.setTextColor(rje.a(context2, ung0.ybColor_textIcon_primaryInverted));
                        textView.setBackgroundResource(nyg0.ybsdk_pfm_calendar_month_selected_bg);
                    } else {
                        w511.b();
                    }
                    return zy11Var2;
                }
                ny61.t("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                return null;
            case 8:
                boj0 boj0Var = (boj0) obj7;
                ir9 ir9Var = (ir9) obj6;
                ov9 ov9Var = (ov9) obj5;
                lea0 lea0Var = (lea0) obj;
                if (kotlin.collections.a.G((List) obj8, (lea0Var == null || (c = lea0Var.c()) == null) ? null : c.getCode())) {
                    if (ir9Var == null) {
                        ir9Var = ov9Var.c;
                    }
                    boj0Var.b(ir9Var, true);
                }
                return zy11Var2;
            case 9:
                boj0 boj0Var2 = (boj0) obj7;
                gs9 gs9Var = (gs9) obj6;
                c29 c29Var = (c29) obj5;
                lea0 lea0Var2 = (lea0) obj;
                if (kotlin.collections.a.G((List) obj8, (lea0Var2 == null || (c2 = lea0Var2.c()) == null) ? null : c2.getCode())) {
                    boj0Var2.b(((nr9) ((es9) gs9Var).a).a, true);
                    lv9 lv9Var = (lv9) c29Var.b;
                    r0 r0Var = lv9Var.J.j.a;
                    r0Var.l(null);
                    lv9Var.r(new qu(9));
                }
                return zy11Var2;
            case 10:
                o oVar2 = (o) obj8;
                o oVar3 = (o) obj7;
                qor qorVar5 = (qor) obj6;
                rbn rbnVar = (rbn) obj5;
                o.a aVar3 = (o.a) obj;
                if (oVar2.b > oVar3.b) {
                    aVar3.g(oVar2, 0, 0, 0.0f);
                }
                if (qorVar5.getFloatValue() > 0.0f) {
                    aVar3.v(oVar3, 0, 0, 1.0f, new a7b(24, rbnVar, qorVar5));
                }
                return zy11Var2;
            case 11:
                oay oayVar = (oay) obj8;
                vpy0 vpy0Var = (vpy0) obj7;
                hoy0 hoy0Var = (hoy0) obj6;
                eiv eivVar = (eiv) obj5;
                if (oayVar.b()) {
                    jnn jnnVar = oayVar.d;
                    cre creVar = oayVar.v;
                    cre creVar2 = oayVar.w;
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    zjy0 zjy0Var = new zjy0(1, jnnVar, creVar, ref$ObjectRef);
                    gwc0 gwc0Var = vpy0Var.a;
                    gwc0Var.c(hoy0Var, eivVar, zjy0Var, creVar2);
                    ?? xpy0Var = new xpy0(vpy0Var, gwc0Var);
                    vpy0Var.b.set(xpy0Var);
                    ref$ObjectRef.element = xpy0Var;
                    oayVar.e = xpy0Var;
                }
                return new hre();
            case 12:
                wls wlsVar = (wls) obj7;
                qkg qkgVar = (qkg) obj6;
                tgg tggVar = (tgg) obj5;
                c2q0 c2q0Var = (c2q0) obj;
                Iterator it = ((ArrayList) obj8).iterator();
                while (it.hasNext()) {
                    g2q0 g2q0Var = (g2q0) it.next();
                    boolean z2 = g2q0Var.g == SectionStyle.DARK;
                    String str4 = g2q0Var.b;
                    zh4 zh4Var2 = g2q0Var.h;
                    if (zh4Var2 == null) {
                        if (z2) {
                            zh4Var2 = new zh4(Collections.singletonList(new ug4(new ldc(dl51.b))));
                        } else {
                            zh4Var = null;
                            boolean z3 = g2q0Var.i;
                            g3q0Var = g2q0Var.j;
                            if (g3q0Var == null) {
                                ldc ldcVar = g3q0Var.b;
                                z = true;
                                qggVar = new qgg(ldcVar != null ? ldcVar.a : dl51.E, new a(-32166996, new mjf(2, tggVar, g3q0Var), true), 4);
                            } else {
                                z = true;
                                qggVar = null;
                            }
                            c2q0.a(c2q0Var, str4, zh4Var, z3, qggVar, new a(461237502, new mr1(z2, tggVar, g2q0Var, i6), z), 16);
                            wlsVar.invoke(g2q0Var.f, g2q0Var.c);
                        }
                    }
                    zh4Var = zh4Var2;
                    boolean z32 = g2q0Var.i;
                    g3q0Var = g2q0Var.j;
                    if (g3q0Var == null) {
                    }
                    c2q0.a(c2q0Var, str4, zh4Var, z32, qggVar, new a(461237502, new mr1(z2, tggVar, g2q0Var, i6), z), 16);
                    wlsVar.invoke(g2q0Var.f, g2q0Var.c);
                }
                wlsVar.invoke(qkgVar.d, qkgVar.c);
                return zy11Var2;
            case 13:
                final tls tlsVar5 = (tls) obj7;
                final rsf rsfVar = (rsf) obj8;
                final tls tlsVar6 = (tls) obj6;
                final sls slsVar = (sls) obj5;
                final n70 n70Var2 = (n70) obj;
                n70Var2.W(new tls() { // from class: com.ybsdk.feature.dashboard.internal.ui.dashboard3.adapter.b
                    @Override // defpackage.tls
                    public final Object invoke(Object obj9) {
                        n70 n70Var3;
                        aig aigVar;
                        n70 n70Var4 = n70.this;
                        Object Z2 = n70Var4.Z();
                        zo31 zo31Var = n70Var4.N;
                        yp8 yp8Var = Z2 instanceof yp8 ? (yp8) Z2 : null;
                        hig higVar = yp8Var != null ? yp8Var.c : null;
                        u661 u661Var = (u661) zo31Var;
                        DashboardCardView dashboardCardView = u661Var.g;
                        YbDivView ybDivView = u661Var.i;
                        View view = u661Var.c;
                        dashboardCardView.setVisibility(higVar != null ? 0 : 8);
                        if (higVar != null) {
                            cig cigVar = higVar.p;
                            li91.j(dashboardCardView, higVar.o);
                            tls tlsVar7 = tlsVar5;
                            dashboardCardView.onDivAction(tlsVar7);
                            dashboardCardView.render(higVar, rsfVar);
                            sms0 sms0Var = higVar.q;
                            if (sms0Var != null) {
                                rbv rbvVar = sms0Var.a;
                                v4b1.k(rbvVar, u661Var.e, null, null, 6);
                                v4b1.k(rbvVar, u661Var.f, null, null, 6);
                                dashboardCardView.setOnTouchListener(new CardTranslationTouchEventListener(u661Var, sms0Var.b, slsVar));
                            }
                            big bigVar = cigVar instanceof big ? (big) cigVar : null;
                            boolean z4 = bigVar != null;
                            ImageView imageView = u661Var.l;
                            ImageView imageView2 = u661Var.k;
                            TextView textView2 = u661Var.m;
                            TextView textView3 = u661Var.b;
                            LinearLayout linearLayout = u661Var.d;
                            view.setVisibility(z4 ? 0 : 8);
                            linearLayout.setVisibility(z4 ? 0 : 8);
                            ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
                            layoutParams2.height = (bigVar != null ? bigVar.g : null) != null ? zhg.a : zhg.b;
                            linearLayout.setLayoutParams(layoutParams2);
                            if (bigVar != null) {
                                rbv rbvVar2 = bigVar.g;
                                rbv rbvVar3 = bigVar.f;
                                Text.Constant constant = bigVar.b;
                                n70Var3 = n70Var4;
                                gob1.b(view, bigVar.a);
                                textView3.setVisibility(!d.d(constant) ? 0 : 8);
                                xty0.d(textView3, constant);
                                xty0.e(textView3, bigVar.c);
                                xty0.d(textView2, bigVar.d);
                                xty0.e(textView2, bigVar.e);
                                imageView2.setVisibility(rbvVar3 != null ? 0 : 8);
                                imageView.setVisibility(rbvVar2 != null ? 0 : 8);
                                aigVar = null;
                                if (rbvVar3 != null) {
                                    v4b1.k(rbvVar3, imageView2, null, null, 6);
                                }
                                if (rbvVar2 != null) {
                                    v4b1.k(rbvVar2, imageView, null, null, 6);
                                }
                                String str5 = bigVar.h;
                                if (str5 != null) {
                                    linearLayout.setOnClickListener(new k5(26, tlsVar6, str5));
                                }
                            } else {
                                n70Var3 = n70Var4;
                                aigVar = null;
                            }
                            aig aigVar2 = cigVar instanceof aig ? (aig) cigVar : aigVar;
                            boolean z5 = aigVar2 != null;
                            Space space = u661Var.j;
                            ybDivView.setVisibility(z5 ? 0 : 8);
                            space.setVisibility(z5 ? 0 : 8);
                            ybDivView.setActionHandler(tlsVar7);
                            if (aigVar2 != null) {
                                YbDivView.setData$default(ybDivView, aigVar2.b, null, null, false, 14, null);
                                ViewGroup.LayoutParams layoutParams3 = space.getLayoutParams();
                                layoutParams3.height = m810.b(kp50.s((float) aigVar2.a));
                                space.setLayoutParams(layoutParams3);
                            }
                        } else {
                            n70Var3 = n70Var4;
                        }
                        aq8 aq8Var = (aq8) n70Var3.Z();
                        t661 t661Var = u661Var.h;
                        boolean z6 = aq8Var instanceof zp8;
                        t661Var.b.setVisibility((z6 || aq8Var.c()) ? 0 : 8);
                        t661Var.d.setVisibility(z6 ? 0 : 8);
                        t661Var.c.setVisibility(aq8Var.c() ? 0 : 8);
                        return zy11.a;
                    }
                });
                return zy11Var2;
            case 14:
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) obj8;
                g gVar = (g) obj5;
                xi2 xi2Var2 = (xi2) obj;
                float floatValue = ((Number) xi2Var2.e.getValue()).floatValue() - ref$FloatRef.element;
                float a3 = ((iip0) obj7).a(floatValue);
                ref$FloatRef.element = ((Number) xi2Var2.e.getValue()).floatValue();
                ((Ref$FloatRef) obj6).element = ((Number) xi2Var2.f()).floatValue();
                if (Math.abs(floatValue - a3) > 0.5f) {
                    xi2Var2.a();
                }
                gVar.getClass();
                return zy11Var2;
            case 15:
                AtomicReference atomicReference = (AtomicReference) obj7;
                ru.yandex.taxi.experiments.storage.a aVar4 = (ru.yandex.taxi.experiments.storage.a) obj6;
                CountDownLatch countDownLatch = (CountDownLatch) obj5;
                Throwable th = (Throwable) obj;
                if (!((AtomicBoolean) obj8).get()) {
                    Throwable th2 = (Throwable) aVar4.b.get();
                    if (th2 != null) {
                        th = th2;
                    } else if (th == null) {
                        th = new IllegalStateException("Persistence worker stopped");
                    }
                    while (!atomicReference.compareAndSet(null, th) && atomicReference.get() == null) {
                    }
                    countDownLatch.countDown();
                }
                return zy11Var2;
            case 16:
                String str5 = (String) obj8;
                String str6 = (String) obj7;
                lg80 lg80Var = (lg80) obj6;
                kw kwVar = (kw) obj5;
                w3j0 w3j0Var = (w3j0) obj;
                if (str5 != null) {
                    w3j0Var.a.put(LaunchBrowserActivity.KEY_URI, str5);
                }
                if (str6 != null) {
                    w3j0Var.a.put("oid", str6);
                }
                w3j0Var.d("mode", lg80Var.b());
                MapBuilder mapBuilder = new MapBuilder();
                mapBuilder.put("type", kwVar.a);
                mapBuilder.put(Constants.DEEPLINK, kwVar.b);
                mapBuilder.put("oid", null);
                mapBuilder.put("url", kwVar.c);
                mapBuilder.put("auth_type", kwVar.d);
                w3j0Var.f("action", mapBuilder.j());
                return zy11Var2;
            case 17:
                ftl ftlVar = (ftl) obj7;
                Div2View divView = ((DivViewLayout) ((qnh) obj8).a).getDivView();
                pxl pxlVar = new pxl((cnr0) obj5);
                Map map = ((etl) obj6).b;
                if (map == null) {
                    map = b.f();
                }
                divView.setActionHandler(new zrl(new jb7(i5, map, pxlVar, ftlVar.w), ftlVar.c));
                return zy11Var2;
            case 18:
                gon gonVar = (gon) obj7;
                vu0 vu0Var = (vu0) obj6;
                n351 n351Var = (n351) obj5;
                g8l0 g8l0Var = (g8l0) kotlin.collections.a.S(((Integer) obj).intValue(), (ArrayList) obj8);
                if (g8l0Var != null) {
                    int i12 = g8l0Var.a;
                    if (vu0Var instanceof su0) {
                        gonVar.c.a(i12);
                    } else {
                        int i13 = g8l0Var.b;
                        if (i12 <= i13) {
                            int i14 = i12;
                            while (true) {
                                if (i14 != 0) {
                                    gonVar.b.g(i12 - 1);
                                }
                                if (i14 != i13) {
                                    i14++;
                                }
                            }
                        }
                    }
                    String str7 = ((con) n351Var).f;
                    if (str7 != null) {
                        u1n.m(gonVar.d, new x2s(str7.concat(".DeleteButton"), null));
                    }
                }
                return zy11Var2;
            case 19:
                n70 n70Var3 = (n70) obj8;
                String str8 = (String) obj7;
                String str9 = (String) obj6;
                xty0.d(((u161) n70Var3.N).a, ((ags) n70Var3.Z()).d);
                u161 u161Var = (u161) n70Var3.N;
                u161Var.a.setOnClickListener(new vsn(i6, (dx3) obj5, n70Var3));
                AppCompatTextView appCompatTextView = u161Var.a;
                boolean z4 = ((ags) n70Var3.Z()).e;
                Context context3 = n70Var3.P;
                appCompatTextView.setBackground(z4 ? vng.t(xxg0.ybsdk_autotopup_regular_frequency_selected_background, context3) : vng.t(xxg0.ybsdk_autotopup_regular_frequency_base_background, context3));
                appCompatTextView.setContentDescription(((Object) d.a(context3, ((ags) n70Var3.Z()).d)) + (((ags) n70Var3.Z()).e ? Extension.FIX_SPACE.concat(str8) : Extension.FIX_SPACE.concat(str9)));
                return zy11Var2;
            case 20:
                f.t((mnq0) obj, new kk2(oyr.t(oyr.w((String) obj8, " ", (String) obj7, " ", (String) obj6), " ", (String) obj5)));
                return zy11Var2;
            case 21:
                final tse tseVar = (tse) obj7;
                final androidx.compose.foundation.lazy.b bVar = (androidx.compose.foundation.lazy.b) obj6;
                final sls slsVar2 = (sls) obj5;
                mnq0 mnq0Var = (mnq0) obj;
                f.j(mnq0Var, new hcc(((bpl0) obj8).a.size(), 1));
                f.i(mnq0Var, new wls() { // from class: com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.ui.a
                    @Override // defpackage.wls
                    public final Object invoke(Object obj9, Object obj10) {
                        ((Float) obj9).getClass();
                        tje.N(tse.this, null, null, new HubItemsListKt$HubItemsList$10$4$1$1$1(bVar, ((Float) obj10).floatValue(), slsVar2, null), 3);
                        return Boolean.TRUE;
                    }
                });
                return zy11Var2;
            case 22:
                bpl0 bpl0Var = (bpl0) obj8;
                List list4 = bpl0Var.a;
                ((m6y) ((u6y) obj)).f(list4.size(), new tj(14, new bns(10, bpl0Var), list4), new qc0(list4, 16), new a(2039820996, new zc0(list4, bpl0Var, (yur) obj6, (f530) obj5, (tls) obj7), true));
                return zy11Var2;
            case 23:
                c cVar = (c) obj7;
                Ref$FloatRef ref$FloatRef2 = (Ref$FloatRef) obj6;
                tse tseVar2 = (tse) obj5;
                long longValue = ((Long) obj).longValue();
                m3u0 m3u0Var = (m3u0) ((oz40) obj8).getValue();
                long longValue2 = m3u0Var != null ? ((Number) m3u0Var.getValue()).longValue() : longValue;
                long j = cVar.d;
                wz40 wz40Var = cVar.b;
                if (j == Long.MIN_VALUE || ref$FloatRef2.element != e.h(tseVar2.getCoroutineContext())) {
                    cVar.d = longValue;
                    Object[] objArr = wz40Var.a;
                    int i15 = wz40Var.c;
                    for (int i16 = 0; i16 < i15; i16++) {
                        ((osv) objArr[i16]).A = true;
                    }
                    ref$FloatRef2.element = e.h(tseVar2.getCoroutineContext());
                }
                float f = ref$FloatRef2.element;
                if (f == 0.0f) {
                    Object[] objArr2 = wz40Var.a;
                    int i17 = wz40Var.c;
                    for (int i18 = 0; i18 < i17; i18++) {
                        osv osvVar = (osv) objArr2[i18];
                        osvVar.w.setValue(osvVar.y.c);
                        osvVar.A = true;
                    }
                } else {
                    long j2 = (long) ((longValue2 - cVar.d) / f);
                    Object[] objArr3 = wz40Var.a;
                    int i19 = wz40Var.c;
                    boolean z5 = true;
                    for (int i20 = 0; i20 < i19; i20++) {
                        osv osvVar2 = (osv) objArr3[i20];
                        if (!osvVar2.z) {
                            osvVar2.C.c.setValue(Boolean.FALSE);
                            if (osvVar2.A) {
                                osvVar2.A = false;
                                osvVar2.B = j2;
                            }
                            long j3 = j2 - osvVar2.B;
                            osvVar2.w.setValue(osvVar2.y.f(j3));
                            osvVar2.z = osvVar2.y.c(j3);
                        }
                        if (!osvVar2.z) {
                            z5 = false;
                        }
                    }
                    cVar.e.setValue(Boolean.valueOf(!z5));
                }
                return zy11Var2;
            case 24:
                com.yandex.go.intercity.flex.dashboard.router.a aVar5 = (com.yandex.go.intercity.flex.dashboard.router.a) obj8;
                anw anwVar = (anw) obj7;
                IntercityOpenShuttleClarifyPointAction intercityOpenShuttleClarifyPointAction = (IntercityOpenShuttleClarifyPointAction) obj6;
                IntercityOpenShuttleClarifyPointAction.FlexPointType flexPointType = (IntercityOpenShuttleClarifyPointAction.FlexPointType) obj5;
                ymw ymwVar = (ymw) obj;
                Iterator it2 = ((olw) aVar5.y).b.iterator();
                while (it2.hasNext()) {
                    llw llwVar = (llw) it2.next();
                    cma1.J(llwVar.itemView());
                    llwVar.onResume();
                }
                ymw ymwVar2 = anwVar.c;
                IntercityOpenShuttleClarifyPointAction.FlexPointType flexPointType2 = anwVar.a;
                String str10 = ymwVar2.a;
                String str11 = ymwVar.a;
                String str12 = ymwVar.c;
                Double[] dArr = ymwVar.b;
                String str13 = ymwVar.e;
                if (jl40.l(str10, str11)) {
                    zy11Var = zy11Var2;
                } else {
                    kdw kdwVar = aVar5.B;
                    kdwVar.getClass();
                    IntercityOpenShuttleClarifyPointAction.TripInfo tripInfo = intercityOpenShuttleClarifyPointAction.i;
                    int[] iArr = jdw.b;
                    int i21 = iArr[flexPointType2.ordinal()];
                    if (i21 == 1) {
                        pair = new Pair(new IntercityOpenShuttleClarifyPointAction.TripInfoPoint(str13, tripInfo.a.b, dArr, str12), tripInfo.b);
                    } else {
                        if (i21 != 2) {
                            w511.b();
                            return null;
                        }
                        pair = new Pair(new IntercityOpenShuttleClarifyPointAction.TripInfoPoint(str13, tripInfo.b.b, dArr, str12), tripInfo.a);
                    }
                    IntercityOpenShuttleClarifyPointAction.TripInfoPoint tripInfoPoint = (IntercityOpenShuttleClarifyPointAction.TripInfoPoint) pair.getFirst();
                    IntercityOpenShuttleClarifyPointAction.TripInfoPoint tripInfoPoint2 = (IntercityOpenShuttleClarifyPointAction.TripInfoPoint) pair.getSecond();
                    IntercityOpenShuttleClarifyPointAction.TripInfoPoint tripInfoPoint3 = tripInfo.a;
                    IntercityOpenShuttleClarifyPointAction.TripInfoPoint tripInfoPoint4 = tripInfo.b;
                    o61 o61Var = kdwVar.b;
                    String str14 = intercityOpenShuttleClarifyPointAction.a;
                    int i22 = iArr[flexPointType2.ordinal()];
                    if (i22 == 1) {
                        intercityCheckoutAnalytics$PointType = IntercityCheckoutAnalytics$PointType.Source;
                    } else {
                        if (i22 != 2) {
                            w511.b();
                            return null;
                        }
                        intercityCheckoutAnalytics$PointType = IntercityCheckoutAnalytics$PointType.Destination;
                    }
                    String str15 = tripInfoPoint.a;
                    String str16 = tripInfoPoint2.a;
                    String str17 = tripInfoPoint.b;
                    String str18 = tripInfoPoint2.b;
                    v8w a4 = kdw.a(tripInfoPoint.c);
                    IntercityCheckoutAnalytics$PointType intercityCheckoutAnalytics$PointType2 = intercityCheckoutAnalytics$PointType;
                    v8w a5 = kdw.a(tripInfoPoint2.c);
                    String str19 = tripInfoPoint.d;
                    String str20 = tripInfoPoint2.d;
                    zy11Var = zy11Var2;
                    v8w a6 = kdw.a(tripInfoPoint3.c);
                    v8w a7 = kdw.a(tripInfoPoint4.c);
                    String str21 = tripInfoPoint3.d;
                    String str22 = tripInfoPoint4.d;
                    o61Var.getClass();
                    HashMap hashMap = new HashMap();
                    hashMap.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, str14);
                    hashMap.put("point_type", intercityCheckoutAnalytics$PointType2.getEventValue());
                    hashMap.put("start_time", str15);
                    hashMap.put("predicted_end_time", str16);
                    hashMap.put("source_geo_zone", str17);
                    hashMap.put("destination_geo_zone", str18);
                    hashMap.put("source_coordinate", a4.c);
                    hashMap.put("destination_coordinate", a5.c);
                    hashMap.put("source_localized_name", str19);
                    hashMap.put("destination_localized_name", str20);
                    hashMap.put("prev_source_coordinate", a6.c);
                    hashMap.put("prev_destination_coordinate", a7.c);
                    o61Var.a.a("IntercityCheckout.ClarifyPoint.PointChanged", hashMap, 1, x4e.q(hashMap, "prev_source_localized_name", str21, "prev_destination_localized_name", str22));
                    hnw hnwVar = aVar5.z;
                    hnwVar.getClass();
                    int i23 = gnw.a[flexPointType.ordinal()];
                    if (i23 != 1) {
                        i2 = 2;
                        if (i23 != 2) {
                            w511.b();
                            return null;
                        }
                        str = "shuttle_point_b_id";
                    } else {
                        i2 = 2;
                        str = "shuttle_point_a_id";
                    }
                    String[] strArr = {"intercity_state", str};
                    ArrayList arrayList2 = new ArrayList(i2);
                    int i24 = 0;
                    while (i24 < i2) {
                        arrayList2.add(new q5x(strArr[i24]));
                        i24++;
                        i2 = 2;
                    }
                    r5x r5xVar = new r5x(arrayList2);
                    j5x M = jx81.M(ymwVar.a);
                    k6x k6xVar = hnwVar.a;
                    if (k6xVar.a()) {
                        d6x d = jason.statham.tools.a.d(k6xVar.b(), r5xVar, M, hnw.c);
                        if (!d.equals(k6xVar.b())) {
                            k6xVar.e(d);
                        }
                    }
                    ((dir) hnwVar.b).a.g(air.a);
                }
                return zy11Var;
            case 25:
                com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.g gVar2 = (com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.g) obj8;
                IntercityDashboardResponseDto intercityDashboardResponseDto = (IntercityDashboardResponseDto) obj7;
                ugw ugwVar = (ugw) obj6;
                Calendar calendar = (Calendar) obj5;
                yfw yfwVar = (yfw) obj;
                gVar2.getClass();
                if (intercityDashboardResponseDto == null) {
                    intercityDashboardSectionDto$TariffSelectorSectionDtoIntercity = null;
                } else {
                    Iterator it3 = intercityDashboardResponseDto.d.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj2 = it3.next();
                            if (((i0) obj2) instanceof IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    if (!(obj2 instanceof IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity)) {
                        obj2 = null;
                    }
                    intercityDashboardSectionDto$TariffSelectorSectionDtoIntercity = (IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity) obj2;
                }
                if (intercityDashboardSectionDto$TariffSelectorSectionDtoIntercity != null) {
                    List list5 = intercityDashboardSectionDto$TariffSelectorSectionDtoIntercity.a;
                    xfwVar = yfwVar.a;
                    if (xfwVar == null) {
                        fnx0 n = ((k) gVar2.f.g).n();
                        String str23 = (n == null || (pex0Var = n.c) == null) ? null : pex0Var.b;
                        List list6 = list5;
                        Iterator it4 = list6.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                obj3 = it4.next();
                                if (jl40.l(((IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity.SelectorItemDto) obj3).b, str23)) {
                                }
                            } else {
                                obj3 = null;
                            }
                        }
                        IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity.SelectorItemDto selectorItemDto = (IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity.SelectorItemDto) obj3;
                        xfwVar = selectorItemDto == null ? null : new xfw(selectorItemDto.a, selectorItemDto.b);
                        if (xfwVar == null) {
                            String str24 = intercityDashboardSectionDto$TariffSelectorSectionDtoIntercity.b;
                            Iterator it5 = list6.iterator();
                            while (true) {
                                if (it5.hasNext()) {
                                    obj4 = it5.next();
                                    if (jl40.l(((IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity.SelectorItemDto) obj4).a, str24)) {
                                    }
                                } else {
                                    obj4 = null;
                                }
                            }
                            IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity.SelectorItemDto selectorItemDto2 = (IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity.SelectorItemDto) obj4;
                            if (selectorItemDto2 != null) {
                                xfwVar = new xfw(selectorItemDto2.a, selectorItemDto2.b);
                            }
                        }
                    }
                    String str25 = xfwVar != null ? xfwVar.a : null;
                    num = yfwVar.j;
                    if (num == null) {
                        num = gVar2.e.a(intercityDashboardResponseDto, str25);
                    }
                    return new yfw(xfwVar, num, intercityDashboardResponseDto, ugwVar, calendar, gVar2.g.g(), 32);
                }
                xfwVar = null;
                if (xfwVar != null) {
                }
                num = yfwVar.j;
                if (num == null) {
                }
                return new yfw(xfwVar, num, intercityDashboardResponseDto, ugwVar, calendar, gVar2.g.g(), 32);
            case 26:
                List list7 = (List) obj8;
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj7;
                List list8 = (List) obj6;
                i4y i4yVar = (i4y) obj5;
                pne0 pne0Var = (pne0) obj;
                syu0 syu0Var = pne0Var.e;
                int d2 = syu0Var != null ? syu0Var.d() : 0;
                int i25 = 0;
                for (int i26 = 0; i26 < d2; i26++) {
                    Orientation orientation = i4yVar.q;
                    Orientation orientation2 = Orientation.Vertical;
                    syu0 syu0Var2 = pne0Var.e;
                    i25 += (int) (orientation == orientation2 ? (syu0Var2 != null ? syu0Var2.a(i26) : 0L) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD : (syu0Var2 != null ? syu0Var2.a(i26) : 0L) >> 32);
                }
                if (list7 != null) {
                    list7.add(Integer.valueOf(i25));
                }
                if (ref$IntRef.element != list8.size()) {
                    ref$IntRef.element++;
                }
                return zy11Var2;
            case 27:
                c6y c6yVar = (c6y) obj8;
                c6yVar.c = new kzo((p5y) obj7, (t) obj6, (eoe0) obj5);
                return new w50(i4, c6yVar);
            case 28:
                return b(obj);
            default:
                ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) obj8;
                n70 n70Var4 = (n70) obj7;
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) obj6;
                tja1.b(shimmerFrameLayout);
                exa1.e(shimmerFrameLayout, new vsn(23, n70Var4, (sc20) obj5));
                zo31 zo31Var = n70Var4.N;
                Context context4 = n70Var4.P;
                xty0.d(((h261) zo31Var).e, ((uty) n70Var4.Z()).b);
                h261 h261Var = (h261) n70Var4.N;
                xty0.d(h261Var.d, ((uty) n70Var4.Z()).c);
                TextView textView2 = h261Var.d;
                Text text = ((uty) n70Var4.Z()).c;
                CharSequence a8 = text != null ? d.a(context4, text) : null;
                if (a8 != null && a8.length() != 0) {
                    i6 = 0;
                }
                textView2.setVisibility(i6);
                hbv hbvVar = (hbv) ref$ObjectRef2.element;
                if (hbvVar != null) {
                    hbvVar.dispose();
                }
                ref$ObjectRef2.element = v4b1.k(((uty) n70Var4.Z()).d.g(context4, context4.getResources().getDimensionPixelSize(vvg0.ybsdk_clickable_icon_size), context4.getResources().getDimensionPixelSize(vvg0.ybsdk_clickable_icon_size)), h261Var.c, null, null, 6);
                ImageView imageView = h261Var.b;
                Integer num2 = ((uty) n70Var4.Z()).e;
                imageView.setImageDrawable(num2 != null ? vng.t(num2.intValue(), h261Var.a.getContext()) : null);
                com.ybsdk.core.utils.ext.view.b.y(shimmerFrameLayout, ((uty) n70Var4.Z()).f);
                if (((uty) n70Var4.Z()).h) {
                    shimmerFrameLayout.startShimmer();
                } else {
                    shimmerFrameLayout.stopShimmer();
                }
                return zy11Var2;
        }
    }

    public /* synthetic */ lc0(tls tlsVar, Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.x = obj;
        this.w = obj2;
        this.c = obj3;
        this.b = tlsVar;
    }

    public /* synthetic */ lc0(androidx.compose.animation.core.a aVar, kj2 kj2Var, tls tlsVar, Ref$BooleanRef ref$BooleanRef) {
        this.a = 2;
        this.x = aVar;
        this.w = kj2Var;
        this.b = tlsVar;
        this.c = ref$BooleanRef;
    }

    public /* synthetic */ lc0(Object obj, tls tlsVar, pa90 pa90Var, tls tlsVar2, int i) {
        this.a = i;
        this.x = obj;
        this.b = tlsVar;
        this.c = pa90Var;
        this.w = tlsVar2;
    }

    public /* synthetic */ lc0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.x = obj;
        this.b = obj2;
        this.w = obj3;
        this.c = obj4;
    }

    public /* synthetic */ lc0(ArrayList arrayList, Ref$IntRef ref$IntRef, List list, int i, i4y i4yVar) {
        this.a = 26;
        this.x = arrayList;
        this.b = ref$IntRef;
        this.w = list;
        this.c = i4yVar;
    }
}
