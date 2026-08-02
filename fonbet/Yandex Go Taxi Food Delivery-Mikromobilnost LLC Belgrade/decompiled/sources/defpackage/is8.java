package defpackage;

import android.view.View;
import androidx.compose.foundation.lazy.grid.b;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.semantics.f;
import com.yandex.go.mainscreen.superapp.impl.foundation.presentation.SuperAppMainScreenFlexModalView;
import com.yandex.go.scooters.ignition.analytics.a;
import com.yandex.go.taxi.order.details.v2.ui.view.item.timeline.RideCardTimelineView;
import com.ybsdk.feature.merchant.offers.internal.screens.root.MerchantOffersFragment;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.taxi.scooters.presentation.finish_info.ScootersFinishInfoModalView;
import ru.yandex.taxi.scooters.presentation.personal_goals.ScootersRideFinishPersonalGoalsModalView;

/* loaded from: classes13.dex */
public final /* synthetic */ class is8 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ is8(int i, Object obj, int i2) {
        this.a = i2;
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 startPagerTimer$lambda$26;
        zy11 renderBubble$lambda$0;
        zy11 insetsType$lambda$0;
        zy11 insetsType$lambda$02;
        boolean addAll$lambda$0;
        boolean attachMyLocationButton$lambda$1;
        long j;
        int i = this.a;
        int i2 = 0;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.c;
        int i3 = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                boj0 boj0Var = (boj0) obj2;
                s9e s9eVar = (s9e) obj;
                if (s9eVar != null) {
                    ((zqb0) boj0Var.w).c(i3, s9eVar);
                    break;
                }
                break;
            case 2:
                rzx rzxVar = (rzx) obj;
                l3t0 l3t0Var = ((z9m) obj2).d;
                Integer valueOf = Integer.valueOf(i3);
                rzx q = rzxVar.q();
                l3t0Var.put(valueOf, new b1x(Float.intBitsToFloat((int) ((q != null ? q.T(rzxVar, 0L) : 0L) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), (int) (rzxVar.e() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
                break;
            case 3:
                u0r u0rVar = (u0r) obj2;
                u0rVar.f = false;
                u0rVar.b();
                u0rVar.b.setImageResource(i3);
                break;
            case 4:
                a6y a6yVar = (a6y) obj;
                tdh tdhVar = ((b) obj2).a;
                i2t0 D = tje.D();
                tje.W(D, tje.O(D), D != null ? D.e() : null);
                tdhVar.getClass();
                int i4 = a6yVar.a;
                if (i4 == -1) {
                    i4 = tdhVar.a;
                }
                while (i2 < i4) {
                    a6yVar.a(i3 + i2);
                    i2++;
                }
                break;
            case 5:
                a6y a6yVar2 = (a6y) obj;
                vdh vdhVar = ((androidx.compose.foundation.lazy.b) obj2).a;
                i2t0 D2 = tje.D();
                tje.W(D2, tje.O(D2), D2 != null ? D2.e() : null);
                vdhVar.getClass();
                int i5 = a6yVar2.a;
                if (i5 == -1) {
                    i5 = vdhVar.a;
                }
                while (i2 < i5) {
                    a6yVar2.a(i3 + i2);
                    i2++;
                }
                break;
            case 6:
                View view = (View) obj2;
                if (i3 == -2) {
                    mj91.e(-2, view);
                    break;
                }
                break;
            case 7:
                startPagerTimer$lambda$26 = MerchantOffersFragment.startPagerTimer$lambda$26((MerchantOffersFragment) obj2, i3, ((Long) obj).longValue());
                break;
            case 8:
                break;
            case 9:
                mnq0 mnq0Var = (mnq0) obj;
                String str = (String) j73.G(i3, (String[]) obj2);
                if (str == null) {
                    str = String.valueOf(i3 + 1);
                }
                f.l(mnq0Var, str);
                break;
            case 10:
                renderBubble$lambda$0 = RideCardTimelineView.renderBubble$lambda$0((RideCardTimelineView) obj2, i3, (List) obj);
                break;
            case 11:
                insetsType$lambda$0 = ScootersFinishInfoModalView.insetsType$lambda$0((ScootersFinishInfoModalView) obj2, i3, (t1w) obj);
                break;
            case 12:
                w3j0 w3j0Var = (w3j0) obj;
                ((a) obj2).getClass();
                w3j0Var.d("trim_level", i3 != 5 ? i3 != 10 ? i3 != 15 ? i3 != 20 ? i3 != 40 ? i3 != 60 ? i3 != 80 ? "unknown" : "complete" : "moderate" : C0553n3.g : "ui_hidden" : "running_critical" : "running_low" : "running_moderate");
                break;
            case 13:
                insetsType$lambda$02 = ScootersRideFinishPersonalGoalsModalView.insetsType$lambda$0((ScootersRideFinishPersonalGoalsModalView) obj2, i3, (t1w) obj);
                break;
            case 14:
                addAll$lambda$0 = SnapshotStateList.addAll$lambda$0(i3, (Collection) obj2, (List) obj);
                break;
            case 15:
                break;
            case 16:
                attachMyLocationButton$lambda$1 = SuperAppMainScreenFlexModalView.attachMyLocationButton$lambda$1(i3, (SuperAppMainScreenFlexModalView) obj2, (t1w) obj);
                break;
            case 17:
                mnq0 mnq0Var2 = (mnq0) obj;
                f.q(mnq0Var2, ((qa11) obj2).d);
                f.k(mnq0Var2, new icc(i3, 0));
                break;
            default:
                m2k0 m2k0Var = (m2k0) obj;
                long j2 = jw01.b;
                Iterator it = ((s6y) ((sls) obj2).invoke()).k.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (((t6y) ((n6y) next)).a == i3) {
                            r5 = next;
                        }
                    }
                }
                n6y n6yVar = (n6y) r5;
                float f = 0.0f;
                if (n6yVar != null) {
                    t6y t6yVar = (t6y) n6yVar;
                    float f2 = t6yVar.o + (t6yVar.p / 2.0f) + (-r2.l);
                    float e = ((int) (r2.e() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) / 2.0f;
                    float f3 = (f2 - e) / e;
                    if (Math.abs(f3) < 1.0f) {
                        float f4 = (float) (((2.0f * e) / 1.0f) / 3.141592653589793d);
                        if (f3 == 0.0f) {
                            j = 4294967295L;
                        } else {
                            j = 4294967295L;
                            float sin = (float) (Math.sin(Math.toRadians(Math.abs(f3) * 90.0d)) * f4);
                            f = f3 < 0.0f ? (e - Math.abs(sin)) - Math.abs(f2) : (Math.abs(sin) + e) - Math.abs(f2);
                        }
                        m2k0Var.G(f);
                        m2k0Var.u(1.0f - (((float) Math.pow(Math.abs(f3), 2.0d)) * 0.1f));
                        m2k0Var.o((-90.0f) * f3);
                        m2k0Var.B(j2);
                        m2k0Var.e(((int) (r2.e() & j)) / 22.0f);
                        break;
                    } else {
                        m2k0Var.b(0.0f);
                        break;
                    }
                } else {
                    m2k0Var.b(1.0f);
                    m2k0Var.u(1.0f);
                    m2k0Var.o(0.0f);
                    m2k0Var.G(0.0f);
                    break;
                }
        }
        return zy11Var;
    }

    public /* synthetic */ is8(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }
}
