package defpackage;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.compose.ui.semantics.f;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.expression.BduiExpressionResolverImpl;
import com.yandex.fintechsdk.core.architecture.api.fragment.BaseFragment;
import com.yandex.go.benefits_center.activation.analytics.AddBenefitAnalytics$AddBenefitCloseAction;
import com.yandex.go.benefits_center.activation.analytics.AddBenefitAnalytics$AddBenefitTappedType;
import com.yandex.go.places.impl.navigation.common.base.d;
import com.yandex.go.places.organization.card.impl.ui.card.recycler.viewholders.images.a;
import com.yandex.go.rida.bids.router.e;
import com.yandex.messaging.views.WaveformView;
import com.yandex.passport.api.h;
import com.yandex.payment.sdk.ui.bind.BindCardActivity;
import com.yandex.xplat.common.YSError;
import com.yandex.xplat.payment.sdk.MobileBackendInvalidAuthorizationError;
import com.ybsdk.feature.autotopup.internal.presentation.view.AutoTopupSummaryView;
import com.ybsdk.widgets.common.Tooltip$DismissReason;
import defpackage.agd;
import defpackage.avj0;
import defpackage.b1;
import defpackage.cm5;
import defpackage.dm5;
import defpackage.hm5;
import defpackage.im5;
import defpackage.jl40;
import defpackage.jm5;
import defpackage.km5;
import defpackage.kyh0;
import defpackage.lm5;
import defpackage.mm5;
import defpackage.nm5;
import defpackage.om5;
import defpackage.pm5;
import defpackage.qm5;
import defpackage.qu;
import defpackage.rm5;
import defpackage.tje;
import defpackage.ur5;
import defpackage.w511;
import defpackage.wl5;
import defpackage.zuj0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.design.ellipsize.TextMiddleEllipsizer$EllipsizingMode;
import ru.yandex.taxi.preorder.summary.tariffpage.data.b;
import ru.yandex.taxi.widget.c;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes13.dex */
public final /* synthetic */ class j24 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j24(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 tooltip$lambda$6$lambda$5;
        zy11 onAttach$lambda$1;
        Integer parseColor;
        zy11 onCreate$lambda$1;
        int i = this.a;
        int i2 = 5;
        int i3 = 3;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                tooltip$lambda$6$lambda$5 = AutoTopupSummaryView.setTooltip$lambda$6$lambda$5((AutoTopupSummaryView) obj2, (Tooltip$DismissReason) obj);
                return tooltip$lambda$6$lambda$5;
            case 1:
                nf4 nf4Var = (nf4) obj2;
                rs20 rs20Var = (rs20) obj;
                if (rs20Var == null) {
                    return zmx.d(null);
                }
                String str = rs20Var.b;
                if (!nf4Var.c) {
                    return zmx.d(rs20Var);
                }
                cn90 b = np90.b();
                if (b == null) {
                    return zmx.c(new MobileBackendInvalidAuthorizationError("Mobile backend invalid authorization error: Oauth token exchange failure - \"Failed to perform Oauth token exchange due to the missing \\\"passport\\\" library dependency.\nPlease, make sure that it is provided in your .gradle file.\n\""));
                }
                String str2 = nf4Var.f;
                if (str2 != null) {
                    return zmx.d(new rs20(str2, str));
                }
                Context context = nf4Var.a;
                boolean z = nf4Var.d;
                md51 f = zmx.b(new ls40(2, new uge((gn90) b, z, h.a(context)), str, z ? yri0.a : yri0.b)).f(new at3(12));
                w04 w04Var = new w04(i3, nf4Var, rs20Var);
                ymx ymxVar = (ymx) f;
                ymxVar.getClass();
                md51 l = ymx.l(ymxVar, w04Var, null, 5);
                ((y22) nf4Var.e).b(vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Выдача авторизационного токена для конкретного пользователя", "exchange_oauth_token"), l);
                return l;
            case 2:
                mrj mrjVar = (mrj) obj2;
                LinearLayout linearLayout = (LinearLayout) obj;
                b bVar = new b(linearLayout, (pav) mrjVar.b, (c) mrjVar.c, (p370) mrjVar.w);
                linearLayout.addView(bVar.d);
                return new nj1(linearLayout, bVar);
            case 3:
                n891.n(new mw2(13, (com.yandex.payment.sdk.ui.payment.sbp.c) obj2, (YSError) obj));
                return zy11.a;
            case 4:
                mj91.e(((Integer) obj).intValue(), ((nx4) obj2).a.getContainer());
                return zy11.a;
            case 5:
                onAttach$lambda$1 = BaseFragment.onAttach$lambda$1((BaseFragment) obj2, (mx60) obj);
                return onAttach$lambda$1;
            case 6:
                ((a) obj2).g0(false);
                return zy11.a;
            case 7:
                t35 t35Var = (t35) obj2;
                synchronized (t35Var.b) {
                    try {
                        if (t35Var.a == null) {
                            t35Var.a = obj;
                            ArrayList arrayList = t35Var.c;
                            Iterable J0 = arrayList != null ? kotlin.collections.a.J0(arrayList) : EmptyList.a;
                            t35Var.c = null;
                            Iterator it = J0.iterator();
                            while (it.hasNext()) {
                                try {
                                    ((tls) it.next()).invoke(obj);
                                } catch (Throwable th) {
                                    xby.l(jst.e, "MapKitComponentHolder", null, th, "Callback failed", 2);
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return zy11.a;
            case 8:
                return ((d) obj2).J;
            case 9:
                qgc0 qgc0Var = (qgc0) obj;
                if (((com.yandex.go.places.webview.impl.navigation.common.b) obj2).D) {
                    qgc0Var.Y0();
                }
                return zy11.a;
            case 10:
                return ((pry0) obj2).a((CharSequence) obj, TextMiddleEllipsizer$EllipsizingMode.MIDDLE_ELLIPSE);
            case 11:
                Integer num = (Integer) obj;
                num.getClass();
                ((com.yandex.messaging.internal.view.timeline.poll.a) obj2).M0(Collections.singletonList(num));
                return zy11.a;
            case 12:
                WaveformView.a aVar = (WaveformView.a) obj;
                aVar.b = (byte[]) obj2;
                aVar.a = Float.valueOf(0.0f);
                return zy11.a;
            case 13:
                dd5 dd5Var = (dd5) obj2;
                dd5Var.v0(new cd5(dd5Var.T2.i, dd5Var.H2.b));
                return zy11.a;
            case 14:
                return Boolean.valueOf(jl40.l(((Pair) obj).f(), (ku00) obj2));
            case 15:
                return new w50(i2, (androidx.compose.foundation.text.contextmenu.provider.a) obj2);
            case 16:
                return new w50(6, (svz0) obj2);
            case 17:
                return g8e.p((String) obj, " ", ((abe) obj2).d());
            case 18:
                parseColor = ((BduiExpressionResolverImpl) obj2).parseColor((String) obj);
                return parseColor;
            case 19:
                ((cx7) obj2).invoke(((c231) obj).d());
                return zy11.a;
            case 20:
                f.l((mnq0) obj, ((f611) obj2).e);
                return zy11.a;
            case 21:
                f.l((mnq0) obj, ((g611) obj2).i);
                return zy11.a;
            case 22:
                f.l((mnq0) obj, ((k611) obj2).d);
                return zy11.a;
            case 23:
                dl5 dl5Var = (dl5) obj2;
                if (((Boolean) obj).booleanValue()) {
                    ((cl5) dl5Var.Dg()).disableExitAnimation();
                    ((fl5) dl5Var.x.b).r(new qu(9));
                } else {
                    ((cl5) dl5Var.Dg()).stopProgress();
                }
                return zy11.a;
            case 24:
                final dm5 dm5Var = (dm5) obj2;
                final yfd yfdVar = (yfd) obj;
                final cm5 cm5Var = new cm5(dm5Var, ((wl5) ((agd) yfdVar).a).b);
                rm5 rm5Var = dm5Var.K;
                agd agdVar = (agd) yfdVar;
                String str3 = ((wl5) agdVar.a).a;
                r0 r0Var = (r0) rm5Var.b;
                avj0 avj0Var = (avj0) ((zuj0) rm5Var.d);
                String h = avj0Var.h(kyh0.promocode_activate_hint);
                if (str3 == null) {
                    str3 = "";
                }
                qm5 qm5Var = new qm5(h, str3, avj0Var.h(kyh0.benefits_center_promo_activate_title), 52);
                r0Var.getClass();
                r0Var.m(null, qm5Var);
                agdVar.c = (gci0) rm5Var.c;
                agdVar.e = new tls() { // from class: com.yandex.go.benefits_center.activation.router.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj3) {
                        Object value;
                        qm5 qm5Var2;
                        Object value2;
                        cm5 cm5Var2 = cm5Var;
                        dm5 dm5Var2 = cm5Var2.b;
                        om5 om5Var = (om5) obj3;
                        pm5 pm5Var = dm5.this.J;
                        String str4 = ((wl5) ((agd) yfdVar).a).b;
                        b1 b1Var = (b1) pm5Var.b;
                        if (om5Var instanceof im5) {
                            b1Var.d(str4, AddBenefitAnalytics$AddBenefitTappedType.Back, null);
                            b1Var.b(((im5) om5Var).a, AddBenefitAnalytics$AddBenefitCloseAction.BackButton);
                            dm5Var2.r(new qu(9));
                        } else if (om5Var instanceof nm5) {
                            b1Var.b(((nm5) om5Var).a, AddBenefitAnalytics$AddBenefitCloseAction.Swipe);
                        } else if (om5Var instanceof hm5) {
                            AddBenefitAnalytics$AddBenefitTappedType addBenefitAnalytics$AddBenefitTappedType = AddBenefitAnalytics$AddBenefitTappedType.AddPromo;
                            String str5 = ((hm5) om5Var).a;
                            b1Var.d(str4, addBenefitAnalytics$AddBenefitTappedType, str5);
                            r0 r0Var2 = (r0) dm5Var2.K.b;
                            do {
                                value2 = r0Var2.getValue();
                            } while (!r0Var2.k(value2, qm5.a((qm5) value2, null, false, null, null, true, 31)));
                            tje.N(dm5Var2.o(), null, null, new BenefitActivationRouter$BenefitActivationNavigatorImpl$activate$1(dm5Var2, str5, cm5Var2, null), 3);
                        } else if (jl40.l(om5Var, km5.a)) {
                            dm5Var2.r(new qu(9));
                        } else if (jl40.l(om5Var, mm5.a)) {
                            b1Var.getClass();
                            HashMap hashMap = new HashMap();
                            hashMap.put("open_reason", str4);
                            b1Var.a.a("AddBenefit.Shown", hashMap, 1, new HashMap());
                        } else if (om5Var instanceof jm5) {
                            rm5 rm5Var2 = dm5Var2.K;
                            r0 r0Var3 = (r0) rm5Var2.b;
                            do {
                                value = r0Var3.getValue();
                                qm5Var2 = (qm5) value;
                                if (!qm5Var2.c) {
                                    break;
                                }
                            } while (!r0Var3.k(value, qm5.a(qm5Var2, ((avj0) ((zuj0) rm5Var2.d)).h(kyh0.promocode_activate_hint), false, null, "", false, 42)));
                        } else {
                            if (!(om5Var instanceof lm5)) {
                                w511.b();
                                return null;
                            }
                            String str6 = ((lm5) om5Var).a;
                            b1Var.getClass();
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("user_input", str6);
                            b1Var.a.a("AddBenefit.UserInputChanged", hashMap2, 1, new HashMap());
                        }
                        return zy11.a;
                    }
                };
                g3d.a.getClass();
                agdVar.g = g3d.b;
                return zy11.a;
            case 25:
                ((com.yandex.go.ads.mobile_ads_sdk.domain.a) obj2).e.remove(v60.a);
                return zy11.a;
            case 26:
                fq5 fq5Var = (fq5) obj2;
                ((g1a0) fq5Var.b).b((ImageView) obj, fq5Var.a);
                return zy11.a;
            case 27:
                final e eVar = (e) obj2;
                yfd yfdVar2 = (yfd) obj;
                ((agd) yfdVar2).f = me4.a;
                agd agdVar2 = (agd) yfdVar2;
                agdVar2.c = eVar.I.a();
                agdVar2.e = new tls() { // from class: com.yandex.go.rida.bids.router.b
                    @Override // defpackage.tls
                    public final Object invoke(Object obj3) {
                        e eVar2 = e.this;
                        tje.N(eVar2.o(), null, null, new BidsModalRouter$content$1$1$1(eVar2, (ur5) obj3, null), 3);
                        return zy11.a;
                    }
                };
                agdVar2.g = new androidx.compose.runtime.internal.a(876967034, new alb0(i3, eVar), true);
                return zy11.a;
            case 28:
                ((r89) obj2).l((wx90) obj);
                return zy11.a;
            default:
                onCreate$lambda$1 = BindCardActivity.onCreate$lambda$1((BindCardActivity) obj2, (mx60) obj);
                return onCreate$lambda$1;
        }
    }
}
