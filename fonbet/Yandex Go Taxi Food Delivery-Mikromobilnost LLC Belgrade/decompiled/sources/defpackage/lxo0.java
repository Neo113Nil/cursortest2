package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.div.internal.widget.EllipsizedTextView;
import com.yandex.go.payments.shared.y;
import com.yandex.go.scooters.super_passes.upsale_on_book.ScootersSuperPassesUpsaleOnBookUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1;
import com.yandex.go.sharedpayments.api.analytics.SharedPaymentsOpenReason;
import com.yandex.go.shortcuts.impl.view.adapter.q;
import com.yandex.go.shortcuts.impl.view.adapter.r;
import com.yandex.go.zone.dto.objects.TariffCard;
import com.yandex.go.zone.dto.objects.TariffInfoGroupDefinition;
import com.yandex.go.zone.dto.objects.ZoneTariffInfo;
import com.yandex.go.zone.model.Zone;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.cashback.impl.entities.CashbackSelectorCategoryEntity;
import com.ybsdk.feature.cashback.impl.entities.types.CashbackSelectionType;
import com.ybsdk.feature.cashback.impl.screens.categories.adapter.CashbackButtonState;
import com.ybsdk.feature.pin.api.entities.PinScenario;
import com.ybsdk.feature.pin.api.entities.ReissueActionType;
import com.ybsdk.feature.pin.internal.screens.createpin.OnFinishStrategy;
import com.ybsdk.feature.qr.payments.internal.screens.list.data.entities.SubscriptionEntity$Status;
import com.ybsdk.feature.settings.internal.view.b;
import com.ybsdk.screens.modal.SpoilerOnboardingBottomSheet;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import com.ybsdk.widgets.common.checkbox.CheckBoxView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;
import defpackage.afx0;
import defpackage.agd;
import defpackage.f580;
import defpackage.fhj0;
import defpackage.ghj0;
import defpackage.hhj0;
import defpackage.ihj0;
import defpackage.j2p0;
import defpackage.jhj0;
import defpackage.jl40;
import defpackage.jmw0;
import defpackage.jst;
import defpackage.khj0;
import defpackage.lhj0;
import defpackage.lot0;
import defpackage.lrm0;
import defpackage.m950;
import defpackage.mfx0;
import defpackage.mhj0;
import defpackage.pxo0;
import defpackage.qu;
import defpackage.soj0;
import defpackage.t;
import defpackage.tje;
import defpackage.upj0;
import defpackage.w511;
import defpackage.yio0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.e;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.taxi.HapticController$Effect;
import ru.yandex.taxi.preorder.summary.tariffpage.badge.j;
import ru.yandex.taxi.summary.promotions.analytics.SummaryPromotionsAnalytics$SummaryState;
import ru.yandex.taxi.summary.requirements.list.interactors.k0;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.taxi.widget.c;
import ru.yandex.taxi.widget.h;

/* loaded from: classes13.dex */
public final /* synthetic */ class lxo0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ lxo0(k2s0 k2s0Var, wor0 wor0Var, t4s0 t4s0Var, k3s0 k3s0Var) {
        this.a = 6;
        this.b = k2s0Var;
        this.c = wor0Var;
        this.w = k3s0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:211:0x066f  */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v24, types: [T, hbv] */
    @Override // defpackage.tls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        CharSequence charSequence;
        CharSequence charSequence2;
        vxo0 a;
        vxo0 a2;
        Object obj2;
        Object obj3;
        Spannable a3;
        String str;
        qfx0 qfx0Var;
        Iterator it;
        int i = this.a;
        List list = EmptyList.a;
        int i2 = 13;
        int i3 = 4;
        int i4 = 6;
        int i5 = 12;
        final int i6 = 1;
        zy11 zy11Var = zy11.a;
        Object obj4 = this.w;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (i) {
            case 0:
                final t tVar = (t) obj6;
                xxo0 xxo0Var = (xxo0) obj5;
                final qxo0 qxo0Var = (qxo0) obj4;
                yfd yfdVar = (yfd) obj;
                final nxo0 nxo0Var = new nxo0(tVar);
                final eyo0 eyo0Var = ((kxo0) ((agd) yfdVar).a).a;
                try {
                    xxo0Var.getClass();
                    charSequence = eyo0Var.a;
                    charSequence2 = eyo0Var.b;
                    dyo0 dyo0Var = eyo0Var.d;
                    a = dyo0Var != null ? xxo0.a(dyo0Var) : null;
                    a2 = xxo0.a(eyo0Var.c);
                } catch (Exception e) {
                    zgz.a(null, e);
                    tVar.r(new qu(9));
                }
                if (a2 == null) {
                    throw new IllegalStateException("Not valid confirm button");
                }
                agd agdVar = (agd) yfdVar;
                agdVar.c = new g92(2, new wxo0(charSequence, charSequence2, a2, a));
                agdVar.e = new tls() { // from class: com.yandex.go.scooters.subscription.upsale_on_book.info.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj7) {
                        tje.N(t.this.o(), null, null, new ScootersSubscriptionPurchaseInfoRouter$content$1$1$1(qxo0Var, (pxo0) obj7, nxo0Var, eyo0Var, null), 3);
                        return zy11.a;
                    }
                };
                qcd.a.getClass();
                agdVar.g = qcd.b;
                return zy11Var;
            case 1:
                yp1 yp1Var = (yp1) obj5;
                pzo0 pzo0Var = (pzo0) obj4;
                yfd yfdVar2 = (yfd) obj;
                pgk0 pgk0Var = new pgk0(i2, (lrm0) obj6);
                a0p0 a0p0Var = ((ezo0) ((agd) yfdVar2).a).a;
                yp1Var.getClass();
                CharSequence charSequence3 = a0p0Var.a;
                CharSequence charSequence4 = a0p0Var.b;
                CharSequence charSequence5 = a0p0Var.c;
                xzo0 xzo0Var = a0p0Var.d;
                szo0 szo0Var = xzo0Var != null ? new szo0(xzo0Var.a, ly3.g(eq2.a, yp1Var.a, xzo0Var.b)) : null;
                String str2 = a0p0Var.e;
                String str3 = str2 == null ? "" : str2;
                zzo0 zzo0Var = a0p0Var.h;
                uzo0 uzo0Var = zzo0Var != null ? new uzo0(zzo0Var.a, zzo0Var.b) : null;
                yzo0 yzo0Var = a0p0Var.g;
                CharSequence charSequence6 = yzo0Var.a;
                CharSequence charSequence7 = yzo0Var.b;
                if (charSequence7 == null) {
                    charSequence7 = "";
                }
                tzo0 tzo0Var = new tzo0(charSequence6, charSequence7);
                yzo0 yzo0Var2 = a0p0Var.f;
                CharSequence charSequence8 = yzo0Var2.a;
                ?? r0 = yzo0Var2.b;
                agd agdVar2 = (agd) yfdVar2;
                agdVar2.c = new g92(2, new vzo0(charSequence3, charSequence4, charSequence5, szo0Var, str3, tzo0Var, new tzo0(charSequence8, r0 != 0 ? r0 : ""), uzo0Var));
                agdVar2.e = new vam0(29, pzo0Var, pgk0Var);
                rcd.a.getClass();
                agdVar2.g = rcd.b;
                return zy11Var;
            case 2:
                final lrm0 lrm0Var = (lrm0) obj6;
                m2p0 m2p0Var = (m2p0) obj5;
                final k2p0 k2p0Var = (k2p0) obj4;
                yfd yfdVar3 = (yfd) obj;
                final b2p0 b2p0Var = new b2p0(lrm0Var);
                p2p0 p2p0Var = ((a2p0) ((agd) yfdVar3).a).a;
                agd agdVar3 = (agd) yfdVar3;
                agdVar3.c = e.F(e.t(e.X(m2p0Var.a.a(), new ScootersSuperPassesUpsaleOnBookUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1(null, p2p0Var, m2p0Var))), uyj.a);
                agdVar3.e = new tls() { // from class: com.yandex.go.scooters.super_passes.upsale_on_book.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj7) {
                        tje.N(lrm0.this.o(), null, null, new ScootersSuperPassesUpsaleOnBookRouter$content$1$1$1(k2p0Var, (j2p0) obj7, b2p0Var, null), 3);
                        return zy11.a;
                    }
                };
                vcd.a.getClass();
                agdVar3.g = vcd.b;
                return zy11Var;
            case 3:
                ArrayList arrayList = (ArrayList) obj4;
                d6x d6xVar = (d6x) obj;
                r1s r1sVar = (r1s) ((d870) obj6).c;
                x5x x5xVar = ((wgp0) obj5).a;
                r1sVar.getClass();
                String str4 = x5xVar.a;
                try {
                    kje kjeVar = (kje) ((uje) r1sVar.w).get();
                    t5x t5xVar = (t5x) r1sVar.b;
                    b5x b5xVar = (b5x) r1sVar.c;
                    kjeVar.c = -1;
                    ArrayList arrayList2 = kjeVar.g;
                    arrayList2.clear();
                    kjeVar.d = d6xVar;
                    kjeVar.e = t5xVar;
                    kjeVar.f = b5xVar;
                    obj2 = new z4x(kjeVar.d, a.J0(arrayList2), uj91.d(x5xVar.b, kjeVar));
                } catch (Throwable th) {
                    obj2 = new y4x(th);
                }
                if (obj2 instanceof z4x) {
                    z4x z4xVar = (z4x) obj2;
                    obj3 = new z5x(z4xVar.a, z4xVar.b);
                } else {
                    if (!(obj2 instanceof y4x)) {
                        w511.b();
                        return null;
                    }
                    obj3 = new y5x(((y4x) obj2).a);
                }
                if (obj3 instanceof z5x) {
                    h5z0.a.a(oyr.p("Script '", str4, "' successfully completed"), new Object[0]);
                    z5x z5xVar = (z5x) obj3;
                    arrayList.addAll(z5xVar.b);
                    return z5xVar.a;
                }
                if (obj3 instanceof y5x) {
                    h5z0.a.f(((y5x) obj3).a, oyr.p("Script '", str4, "' failed with error"), new Object[0]);
                    return d6xVar;
                }
                w511.b();
                return null;
            case 4:
                Set set = (Set) obj5;
                unp0 unp0Var = (unp0) obj;
                unp0Var.b.a(qpp0.a, new c6p0(29));
                inp0 inp0Var = fop0.a;
                ja5 ja5Var = new ja5((tt2) obj4, i6);
                gwf0 gwf0Var = unp0Var.b;
                gwf0Var.a(inp0Var, ja5Var);
                gwf0Var.a(rop0.a, new wpp0(r3));
                Iterator it2 = ((Set) obj6).iterator();
                while (it2.hasNext()) {
                    ((knp0) it2.next()).a.invoke(unp0Var);
                }
                Iterator it3 = set.iterator();
                while (it3.hasNext()) {
                    ((snp0) it3.next()).a.invoke(unp0Var);
                }
                return zy11Var;
            case 5:
                return new q((c) obj6, (t4s0) obj5, (View) obj, (j1s0) obj4);
            case 6:
                return new r((com.yandex.go.shortcuts.impl.view.adapter.t) ((k2s0) obj6).invoke(), (wor0) obj5, (k3s0) obj4, (View) obj);
            case 7:
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj4;
                zvd0 zvd0Var = (zvd0) obj;
                if (((fb30) obj6).c(zvd0Var.c, (dkq0) obj5)) {
                    zvd0Var.a();
                    ref$BooleanRef.element = true;
                }
                return zy11Var;
            case 8:
                n70 n70Var = (n70) obj6;
                tls tlsVar = (tls) obj5;
                lxo0 lxo0Var = (lxo0) obj4;
                o261 o261Var = (o261) n70Var.N;
                z8r0 z8r0Var = (z8r0) n70Var.Z();
                TextView textView = o261Var.d;
                Text text = z8r0Var.b;
                ShimmerFrameLayout shimmerFrameLayout = o261Var.a;
                textView.setText(d.a(shimmerFrameLayout.getContext(), text));
                o261Var.d.setEnabled(z8r0Var.d);
                z8r0 z8r0Var2 = (z8r0) n70Var.Z();
                TextView textView2 = o261Var.c;
                textView2.setMovementMethod(LinkMovementMethod.getInstance());
                Text text2 = z8r0Var2.c;
                textView2.setVisibility(d.a(shimmerFrameLayout.getContext(), text2).length() > 0 ? 0 : 8);
                if (z8r0Var2.d) {
                    textView2.setText(rtu.a(new uwl0(2, tlsVar), d.a(shimmerFrameLayout.getContext(), text2).toString()));
                } else {
                    a3 = rtu.a(new jiu(6), d.a(shimmerFrameLayout.getContext(), text2).toString());
                    textView2.setText(a3);
                }
                u5r0 u5r0Var = z8r0Var2.e ? new u5r0(lxo0Var, z8r0Var2, 0) : null;
                textView2.setOnClickListener(u5r0Var != null ? new eaj0(i2, u5r0Var) : null);
                z8r0 z8r0Var3 = (z8r0) n70Var.Z();
                ConstraintLayout constraintLayout = o261Var.b;
                u5r0 u5r0Var2 = (z8r0Var3.d && z8r0Var3.e) ? new u5r0(lxo0Var, z8r0Var3, 1) : null;
                constraintLayout.setOnClickListener(u5r0Var2 != null ? new eaj0(14, u5r0Var2) : null);
                if (((z8r0) n70Var.Z()).f) {
                    shimmerFrameLayout.startShimmer();
                } else {
                    shimmerFrameLayout.stopShimmer();
                }
                return zy11Var;
            case 9:
                final b bVar = (b) obj6;
                pgk0 pgk0Var2 = bVar.d;
                tfl0 tfl0Var = bVar.b;
                sls slsVar = (sls) obj5;
                tls tlsVar2 = (tls) obj4;
                z8r0 z8r0Var4 = (z8r0) obj;
                String str5 = z8r0Var4.a;
                switch (str5.hashCode()) {
                    case -2131583866:
                        if (str5.equals("change_pin")) {
                            tfl0Var.h(pgk0Var2.p());
                            return zy11Var;
                        }
                        str = z8r0Var4.g;
                        if (str != null) {
                            ((y7r0) bVar.a).a(str);
                        }
                        return zy11Var;
                    case -1411276183:
                        if (str5.equals("nfc_draw_overlay")) {
                            tlsVar2.invoke(new tls() { // from class: com.ybsdk.feature.settings.internal.view.a
                                @Override // defpackage.tls
                                public final Object invoke(Object obj7) {
                                    int i7 = i6;
                                    zy11 zy11Var2 = zy11.a;
                                    b bVar2 = bVar;
                                    Activity activity = (Activity) obj7;
                                    switch (i7) {
                                        case 0:
                                            b.b(activity, new SettingsAdapterFactoryImpl$createInternalAdapter$8$1$1(bVar2, activity, null));
                                            break;
                                        case 1:
                                            b.b(activity, new SettingsAdapterFactoryImpl$createInternalAdapter$8$2$1(bVar2, activity, null));
                                            break;
                                        default:
                                            b.b(activity, new SettingsAdapterFactoryImpl$createInternalAdapter$8$3$1(bVar2, activity, null));
                                            break;
                                    }
                                    return zy11Var2;
                                }
                            });
                            return zy11Var;
                        }
                        str = z8r0Var4.g;
                        if (str != null) {
                        }
                        return zy11Var;
                    case -1392512706:
                        if (str5.equals("make_default_nfc_app")) {
                            tlsVar2.invoke(new tls() { // from class: com.ybsdk.feature.settings.internal.view.a
                                @Override // defpackage.tls
                                public final Object invoke(Object obj7) {
                                    int i7 = r2;
                                    zy11 zy11Var2 = zy11.a;
                                    b bVar2 = bVar;
                                    Activity activity = (Activity) obj7;
                                    switch (i7) {
                                        case 0:
                                            b.b(activity, new SettingsAdapterFactoryImpl$createInternalAdapter$8$1$1(bVar2, activity, null));
                                            break;
                                        case 1:
                                            b.b(activity, new SettingsAdapterFactoryImpl$createInternalAdapter$8$2$1(bVar2, activity, null));
                                            break;
                                        default:
                                            b.b(activity, new SettingsAdapterFactoryImpl$createInternalAdapter$8$3$1(bVar2, activity, null));
                                            break;
                                    }
                                    return zy11Var2;
                                }
                            });
                            return zy11Var;
                        }
                        str = z8r0Var4.g;
                        if (str != null) {
                        }
                        return zy11Var;
                    case -996304255:
                        if (str5.equals("nfc_xiaomi_background_start")) {
                            final int i7 = 2;
                            tlsVar2.invoke(new tls() { // from class: com.ybsdk.feature.settings.internal.view.a
                                @Override // defpackage.tls
                                public final Object invoke(Object obj7) {
                                    int i72 = i7;
                                    zy11 zy11Var2 = zy11.a;
                                    b bVar2 = bVar;
                                    Activity activity = (Activity) obj7;
                                    switch (i72) {
                                        case 0:
                                            b.b(activity, new SettingsAdapterFactoryImpl$createInternalAdapter$8$1$1(bVar2, activity, null));
                                            break;
                                        case 1:
                                            b.b(activity, new SettingsAdapterFactoryImpl$createInternalAdapter$8$2$1(bVar2, activity, null));
                                            break;
                                        default:
                                            b.b(activity, new SettingsAdapterFactoryImpl$createInternalAdapter$8$3$1(bVar2, activity, null));
                                            break;
                                    }
                                    return zy11Var2;
                                }
                            });
                            return zy11Var;
                        }
                        str = z8r0Var4.g;
                        if (str != null) {
                        }
                        return zy11Var;
                    case -533374890:
                        if (str5.equals("nfc_wipe_sdk")) {
                            slsVar.invoke();
                            return zy11Var;
                        }
                        str = z8r0Var4.g;
                        if (str != null) {
                        }
                        return zy11Var;
                    case 1985322040:
                        if (str5.equals("set_pin")) {
                            tfl0Var.h(ycp0.b(((com.ybsdk.feature.pin.internal.a) pgk0Var2.b).b, ReissueActionType.NONE, OnFinishStrategy.EXIT, PinScenario.SETUP_PIN, false, null, 16));
                            return zy11Var;
                        }
                        str = z8r0Var4.g;
                        if (str != null) {
                        }
                        return zy11Var;
                    default:
                        str = z8r0Var4.g;
                        if (str != null) {
                        }
                        return zy11Var;
                }
            case 10:
                n70 n70Var2 = (n70) obj;
                n70Var2.W(new ycm0(n70Var2, (tls) obj6, (tls) obj5, (cp1) obj4, 4));
                return zy11Var;
            case 11:
                ((y) obj6).l((tmr0) obj5, (SharedPaymentsOpenReason) obj4, ((tmr0) obj).j);
                return zy11Var;
            case 12:
                ((y) obj6).j((at20) obj5, (SharedPaymentsOpenReason) obj4, (tmr0) obj);
                return zy11Var;
            case 13:
                psr0 psr0Var = (psr0) obj6;
                tls tlsVar3 = (tls) obj5;
                oz40 oz40Var = (oz40) obj4;
                u6y u6yVar = (u6y) obj;
                u6y.b(u6yVar, null, new androidx.compose.runtime.internal.a(-973719113, new w7o0(i5, psr0Var), true), 3);
                List b = psr0Var != null ? psr0Var.b() : null;
                if (b != null) {
                    list = b;
                }
                m6y m6yVar = (m6y) u6yVar;
                m6yVar.f(list.size(), null, new rc0(list, 15, bsr0.a), new androidx.compose.runtime.internal.a(802480018, new zx8(list, tlsVar3, 11), true));
                fdd.a.getClass();
                u6y.b(m6yVar, null, fdd.d, 3);
                u6y.b(m6yVar, null, new androidx.compose.runtime.internal.a(2016095615, new ls40(psr0Var, tlsVar3, oz40Var, 21), true), 3);
                return zy11Var;
            case 14:
                Matrix matrix = (Matrix) obj6;
                eb2 eb2Var = (eb2) obj5;
                c1y c1yVar = (c1y) obj;
                c1yVar.a();
                k28 k28Var = c1yVar.a;
                float floatValue = (((Number) ((m3u0) obj4).getValue()).floatValue() * (Float.intBitsToFloat((int) (k28Var.c() >> 32)) * 2.0f)) - Float.intBitsToFloat((int) (k28Var.c() >> 32));
                matrix.reset();
                matrix.preTranslate(floatValue, 0.0f);
                Shader shader = eb2Var.c;
                if (shader != null) {
                    shader.setLocalMatrix(matrix);
                }
                k28Var.b.q().i(0.0f, 0.0f, Float.intBitsToFloat((int) (k28Var.c() >> 32)), Float.intBitsToFloat((int) (k28Var.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), eb2Var);
                return zy11Var;
            case 15:
                SlideableModalView slideableModalView = (SlideableModalView) obj5;
                v130 v130Var = (v130) obj4;
                t1w t1wVar = (t1w) obj;
                r3 = ((h) obj6).d.get_cardMode() == SlideableModalView.CardMode.FULLSCREEN ? 1 : 0;
                if (r3 != 0) {
                    slideableModalView.setTopSystemWindowInset(t1wVar.b);
                }
                slideableModalView.setPadding(slideableModalView.getPaddingLeft(), r3 != 0 ? slideableModalView.getPaddingTop() : t1wVar.b, slideableModalView.getPaddingRight(), (v130Var.a || !t1wVar.f) ? t1wVar.g : slideableModalView.getPaddingBottom());
                return zy11Var;
            case 16:
                return q791.b((f530) obj, (zx40) obj6, null, false, null, null, new ppr0(17, (tls) obj5, (cqs0) obj4), 28);
            case 17:
                tx40 tx40Var = (tx40) obj5;
                oz40 oz40Var2 = (oz40) obj4;
                m2k0 m2k0Var = (m2k0) obj;
                m2k0Var.G(((Number) ((m3u0) obj6).getValue()).floatValue());
                m2k0Var.u(tx40Var.getFloatValue());
                m2k0Var.v(tx40Var.getFloatValue());
                m2k0Var.D(Float.intBitsToFloat((int) (((wu60) oz40Var2.getValue()).a >> 32)));
                m2k0Var.G(Float.intBitsToFloat((int) (((wu60) oz40Var2.getValue()).a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + m2k0Var.y);
                return zy11Var;
            case 18:
                pey peyVar = (pey) obj6;
                wu5 wu5Var = new wu5(i3, (ComposeView) obj5, (oz40) obj4);
                peyVar.getLifecycle().a(wu5Var);
                return new te4(16, peyVar, wu5Var);
            case 19:
                final khj0 khj0Var = (khj0) obj4;
                final yfd yfdVar4 = (yfd) obj;
                final l7s0 l7s0Var = new l7s0((com.yandex.go.summary.requirements.list.requirementgroup.d) obj6);
                TariffInfoGroupDefinition tariffInfoGroupDefinition = (TariffInfoGroupDefinition) ((agd) yfdVar4).a;
                fcj0 fcj0Var = ((ohj0) obj5).a;
                com.yandex.go.summary.requirements.list.requirementgroup.b bVar2 = new com.yandex.go.summary.requirements.list.requirementgroup.b(tariffInfoGroupDefinition, (pwy0) ((xvf0) fcj0Var.a).get(), (lot0) ((xvf0) fcj0Var.b).get(), (g580) ((n3w) fcj0Var.c).a, (f580) ((p6g) fcj0Var.d).get(), (roj0) ((xvf0) fcj0Var.e).get());
                agd agdVar4 = (agd) yfdVar4;
                agdVar4.c = bVar2.f;
                agdVar4.e = new tls() { // from class: com.yandex.go.summary.requirements.list.requirementgroup.c
                    @Override // defpackage.tls
                    public final Object invoke(Object obj7) {
                        soj0 a4;
                        d dVar = (d) l7s0Var.a;
                        jhj0 jhj0Var = (jhj0) obj7;
                        TariffInfoGroupDefinition tariffInfoGroupDefinition2 = (TariffInfoGroupDefinition) ((agd) yfdVar4).a;
                        boolean z = jhj0Var instanceof hhj0;
                        khj0 khj0Var2 = khj0.this;
                        if (z) {
                            lhj0 lhj0Var = ((hhj0) jhj0Var).a;
                            ru.yandex.taxi.preorder.summary.tariffpage.requirements.a aVar = khj0Var2.d;
                            k0 k0Var = khj0Var2.b;
                            if (k0.c(k0Var, lhj0Var.f, tariffInfoGroupDefinition2.a, false, 4) != null && (a4 = k0Var.a(lhj0Var.f, true)) != null) {
                                if (a4.e != null) {
                                    tje.N(khj0Var2.a, null, null, new RequirementGroupScreenUiActionInteractor$onSwitcherClick$1$1$1(khj0Var2, a4, lhj0Var, null), 3);
                                } else {
                                    upj0 upj0Var = a4.a;
                                    if (upj0Var != null) {
                                        aVar.c(upj0Var, !a4.b);
                                    } else {
                                        jmw0 jmw0Var = a4.c;
                                        if (jmw0Var != null) {
                                            aVar.b(jmw0Var);
                                        } else {
                                            jst.e.w(new IllegalStateException("Unsupported action in SpecialNeedsPresenter"));
                                        }
                                    }
                                }
                            }
                        } else if (jhj0Var instanceof ihj0) {
                            lhj0 lhj0Var2 = ((ihj0) jhj0Var).a;
                            lot0 lot0Var = khj0Var2.e;
                            String str6 = lhj0Var2.f;
                            if (lot0Var.b(str6) != null) {
                                lot0Var.a().w(str6);
                            } else {
                                mhj0 mhj0Var = lhj0Var2.d;
                                String str7 = mhj0Var != null ? mhj0Var.e : null;
                                if (str7 == null) {
                                    str7 = "";
                                }
                                lot0Var.a().r(str6, str7);
                            }
                        } else {
                            khj0Var2.getClass();
                            if (jl40.l(jhj0Var, fhj0.a)) {
                                dVar.r(new qu(9));
                            } else {
                                if (!(jhj0Var instanceof ghj0)) {
                                    w511.b();
                                    return null;
                                }
                                f580 f580Var = khj0Var2.f;
                                mhj0 mhj0Var2 = ((ghj0) jhj0Var).a;
                                f580Var.c(mhj0Var2.a);
                                dVar.A((m950) dVar.I.get(), mhj0Var2, new yio0(10, dVar));
                            }
                        }
                        return zy11.a;
                    }
                };
                udd.a.getClass();
                agdVar4.g = udd.b;
                return zy11Var;
            case 20:
                Ref$BooleanRef ref$BooleanRef2 = (Ref$BooleanRef) obj6;
                com.ybsdk.utils.b bVar3 = (com.ybsdk.utils.b) obj5;
                BottomSheetDialogView bottomSheetDialogView = (BottomSheetDialogView) obj4;
                int i8 = awt0.a[((SpoilerOnboardingBottomSheet.ButtonAction) obj).ordinal()];
                if (i8 != 1) {
                    if (i8 != 2) {
                        w511.b();
                        return null;
                    }
                    ew2 ew2Var = bVar3.f.g;
                    kgx kgxVar = com.ybsdk.persistence.b.l[4];
                    ew2Var.d(true);
                }
                ref$BooleanRef2.element = false;
                bottomSheetDialogView.dismiss();
                return zy11Var;
            case 21:
                odu0 odu0Var = (odu0) obj5;
                String[] strArr = (String[]) obj4;
                if (((String[]) obj6).length != 0) {
                    odu0Var.b().c();
                }
                int length = strArr.length;
                while (r3 < length) {
                    odu0Var.b().k(r3, strArr[r3]);
                    r3++;
                }
                return zy11Var;
            case 22:
                z1v0 z1v0Var = (z1v0) obj6;
                String str6 = (String) obj5;
                SubscriptionEntity$Status subscriptionEntity$Status = (SubscriptionEntity$Status) obj4;
                List<wj1> list2 = z1v0Var.a;
                ArrayList arrayList3 = new ArrayList(tcc.n(list2, 10));
                for (wj1 wj1Var : list2) {
                    List<p0v0> list3 = wj1Var.d;
                    ArrayList arrayList4 = new ArrayList(tcc.n(list3, 10));
                    for (p0v0 p0v0Var : list3) {
                        arrayList4.add(new p0v0(p0v0Var.a, p0v0Var.b, p0v0Var.c, p0v0Var.d, jl40.l(p0v0Var.a, str6) ? subscriptionEntity$Status : SubscriptionEntity$Status.DEFAULT));
                    }
                    arrayList3.add(wj1.a(wj1Var, arrayList4));
                }
                return z1v0.a(z1v0Var, arrayList3, null, 6);
            case 23:
                n70 n70Var3 = (n70) obj6;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj5;
                lav0 lav0Var = (lav0) obj4;
                List list4 = (List) obj;
                if (list4.isEmpty()) {
                    zo31 zo31Var = n70Var3.N;
                    Context context = n70Var3.P;
                    p061 p061Var = (p061) zo31Var;
                    ref$ObjectRef.element = v4b1.k(((CashbackSelectorCategoryEntity) n70Var3.Z()).getImage(), ((p061) n70Var3.N).b, null, null, 6);
                    p061Var.f.setText(d.a(context, ((CashbackSelectorCategoryEntity) n70Var3.Z()).getTitle()));
                    p061Var.e.setText(context.getString(ezh0.ybsdk_percentage, ((CashbackSelectorCategoryEntity) n70Var3.Z()).getPercent()));
                    CheckBoxView checkBoxView = p061Var.c;
                    CashbackSelectorCategoryEntity cashbackSelectorCategoryEntity = (CashbackSelectorCategoryEntity) n70Var3.Z();
                    if (cashbackSelectorCategoryEntity.getType() == CashbackSelectionType.PREDEFINED || cashbackSelectorCategoryEntity.isSelected()) {
                        checkBoxView.setChecked(true, false);
                        checkBoxView.setEnabled(false);
                    } else if (lav0Var.a.contains(cashbackSelectorCategoryEntity)) {
                        checkBoxView.setChecked(true, false);
                        checkBoxView.setEnabled(true);
                    } else {
                        checkBoxView.setChecked(false, false);
                        checkBoxView.setEnabled(true);
                    }
                    checkBoxView.setOnCheckedChangeListener(new r3k0(i2, cashbackSelectorCategoryEntity, lav0Var));
                    checkBoxView.setOnClickListener(new nl(17, lav0Var, cashbackSelectorCategoryEntity, checkBoxView));
                    p061Var.d.setOnClickListener(new tai0(23, n70Var3, p061Var));
                } else {
                    for (Object obj7 : list4) {
                        if (obj7 == CashbackButtonState.DISABLED) {
                            if (!((p061) n70Var3.N).c.getChecked()) {
                                ((p061) n70Var3.N).c.setEnabled(false);
                            }
                        } else if (obj7 == CashbackButtonState.ENABLED && !((CashbackSelectorCategoryEntity) n70Var3.Z()).isSelected() && ((CashbackSelectorCategoryEntity) n70Var3.Z()).getType() != CashbackSelectionType.PREDEFINED) {
                            ((p061) n70Var3.N).c.setEnabled(true);
                        }
                    }
                }
                return zy11Var;
            case 24:
                ((j) obj6).b.d((zkv0) obj5, (u051) obj4, SummaryPromotionsAnalytics$SummaryState.EXPANDED, ((Boolean) obj).booleanValue());
                return zy11Var;
            case 25:
                ((com.yandex.go.taxi.order.delegates.a) ((pg7) ((gkw0) obj6).D.D)).c(((o2y0) obj5).b(), ((eiw0) ((miw0) obj4)).a);
                ((dfk0) obj).a();
                return zy11Var;
            case 26:
                ArrayList arrayList5 = ((x6x0) obj6).c;
                ((m6y) ((u6y) obj)).f(arrayList5.size(), null, new oob(4, v6x0.a, arrayList5), new androidx.compose.runtime.internal.a(802480018, new yc0(arrayList5, (tls) obj5, i5, (tls) obj4), true));
                return zy11Var;
            case 27:
                final afx0 afx0Var = (afx0) obj5;
                final nfx0 nfx0Var = (nfx0) obj4;
                yfd yfdVar5 = (yfd) obj;
                gfx0 gfx0Var = (gfx0) ((agd) yfdVar5).a;
                bfx0 bfx0Var = ((pfx0) ((abx0) ((rfx0) obj6).a.a).get()).a;
                Zone zone = gfx0Var.getZone();
                bfx0Var.getClass();
                na4 a4 = bfx0.a(zone);
                if (gfx0Var instanceof efx0) {
                    pex0 pex0Var = ((efx0) gfx0Var).b;
                    String str7 = pex0Var.b;
                    String str8 = pex0Var.l;
                    TariffCard tariffCard = pex0Var.i0;
                    vdu b2 = pfx0.b(str7, str8, tariffCard);
                    boolean z = pex0Var.K0;
                    String str9 = pex0Var.b;
                    if (!z) {
                        list = pfx0.a(str9, pex0Var.o, tariffCard, a4);
                    } else if (a4.b) {
                        ArrayList arrayList6 = new ArrayList();
                        List list5 = pex0Var.U;
                        if (list5 != null) {
                            list = list5;
                        }
                        pfx0.c(str9, a4);
                        Iterator it4 = list.iterator();
                        while (it4.hasNext()) {
                            Object next = it4.next();
                            int i9 = r3 + 1;
                            if (r3 < 0) {
                                scc.m();
                                throw null;
                            }
                            pex0 pex0Var2 = (pex0) next;
                            String str10 = pex0Var2.o;
                            String obj8 = str10 != null ? evu0.k0(str10).toString() : null;
                            if (obj8 == null) {
                                obj8 = "";
                            }
                            String str11 = pex0Var2.l;
                            String obj9 = str11 != null ? evu0.k0(str11).toString() : null;
                            if (obj9 == null) {
                                obj9 = "";
                            }
                            if (obj8.length() > 0) {
                                it = it4;
                                arrayList6.add(new lj6(new qvi0(mja1.a("", null, i4), c1h0.ic_drive_wheel), obj9, obj8.concat(EllipsizedTextView.DEFAULT_ELLIPSIS), new jfx0(pex0Var2)));
                            } else {
                                it = it4;
                            }
                            it4 = it;
                            r3 = i9;
                            i4 = 6;
                        }
                        list = arrayList6;
                    }
                    qfx0Var = new qfx0(b2, list);
                } else {
                    if (!(gfx0Var instanceof ffx0)) {
                        w511.b();
                        return null;
                    }
                    ZoneTariffInfo zoneTariffInfo = ((ffx0) gfx0Var).b;
                    String str12 = zoneTariffInfo.e;
                    String str13 = zoneTariffInfo.d;
                    TariffCard tariffCard2 = zoneTariffInfo.t;
                    qfx0Var = new qfx0(pfx0.b(str12, str13, tariffCard2), pfx0.a(zoneTariffInfo.e, zoneTariffInfo.a, tariffCard2, a4));
                }
                agd agdVar5 = (agd) yfdVar5;
                agdVar5.c = new g92(2, qfx0Var);
                final zex0 zex0Var = new zex0(afx0Var);
                agdVar5.e = new tls() { // from class: ru.yandex.taxi.preorder.summary.tariff_details.presentation.compose.navigation.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj10) {
                        tje.N(afx0.this.o(), null, null, new TariffDetailsComposeRouter$content$1$1$1(nfx0Var, (mfx0) obj10, zex0Var, null), 3);
                        return zy11.a;
                    }
                };
                bed.a.getClass();
                agdVar5.g = bed.b;
                return zy11Var;
            case 28:
                tls tlsVar4 = (tls) obj5;
                tls tlsVar5 = (tls) obj4;
                u6y u6yVar2 = (u6y) obj;
                bpl0 bpl0Var = ((vnx0) obj6).b;
                List list6 = bpl0Var.a;
                wls wlsVar = bpl0Var.b;
                ((m6y) u6yVar2).f(list6.size(), wlsVar != null ? new qq5(10, wlsVar, list6) : null, new pcx0(list6, i6), new androidx.compose.runtime.internal.a(-930734472, new yzr(list6, tlsVar4, tlsVar5, i6), true));
                return zy11Var;
            default:
                jqx0 jqx0Var = (jqx0) obj6;
                tls tlsVar6 = (tls) obj5;
                j5p0 j5p0Var = (j5p0) obj;
                if (j5p0Var instanceof i5p0) {
                    i5p0 i5p0Var = (i5p0) j5p0Var;
                    if (!i5p0Var.c) {
                        qke.E(jqx0Var.R.getContext(), HapticController$Effect.SELECT, false, 12);
                        tlsVar6.invoke(i5p0Var.f);
                    }
                }
                return zy11Var;
        }
    }

    public /* synthetic */ lxo0(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }
}
