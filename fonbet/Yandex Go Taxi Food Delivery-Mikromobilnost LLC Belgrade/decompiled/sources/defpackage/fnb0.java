package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersPlusOptionPaymentResult;
import com.yandex.go.pickup_from_photo.navigation.c;
import com.yandex.go.places.impl.domain.interactors.a;
import com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.statusandfamily.PlusPanelStatusAndFamilyView;
import com.yandex.plus.pay.api.analytics.PlusPayTestId;
import com.ybsdk.feature.pin.internal.screens.checkpin.views.PinActionButtonView;
import com.ybsdk.widgets.common.PinCodeDotsView;
import java.util.ArrayList;
import java.util.List;
import ru.yandex.yandexmaps.multiplatform.pin.war.PinVisualState;

/* loaded from: classes13.dex */
public final /* synthetic */ class fnb0 implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ fnb0(int i) {
        this.a = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 actionHandler$lambda$0;
        zy11 onNewDigit$lambda$0;
        ull0 T0;
        PinVisualState pinVisualState;
        ImageView createAvatarViews$lambda$0;
        int i = this.a;
        boolean z = false;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                c cVar = ((pob0) obj).a;
                cVar.P.a = false;
                cVar.M.a(knb0.a);
                cVar.i();
                return zy11Var;
            case 1:
                c cVar2 = ((pob0) obj).a;
                cVar2.E((cnb0) cVar2.T.getValue(), zy11Var, new qob0(null, cVar2), hxx.a);
                return zy11Var;
            case 2:
                actionHandler$lambda$0 = PinActionButtonView.actionHandler$lambda$0((String) obj);
                return actionHandler$lambda$0;
            case 3:
                onNewDigit$lambda$0 = PinCodeDotsView.onNewDigit$lambda$0(((Integer) obj).intValue());
                return onNewDigit$lambda$0;
            case 4:
                return Boolean.FALSE;
            case 5:
                dnz0 dnz0Var = (dnz0) obj;
                return dnz0Var.b == null ? dnz0.a(dnz0Var, null, Long.valueOf(SystemClock.elapsedRealtime()), 1) : dnz0Var;
            case 6:
                return dnz0.a((dnz0) obj, null, null, 1);
            case 7:
                T0 = ((oll0) obj).T0("SELECT chat_id FROM pinned_chats ORDER BY chats_order ASC");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (T0.q()) {
                        arrayList.add(T0.Y1(0));
                    }
                    return (String[]) arrayList.toArray(new String[0]);
                } catch (Throwable th) {
                    throw th;
                }
            case 8:
                oll0 oll0Var = (oll0) obj;
                T0 = oll0Var.T0("DELETE FROM pinned_chats");
                try {
                    T0.q();
                    int x = jx81.x(oll0Var);
                    T0.close();
                    return Integer.valueOf(x);
                } finally {
                    T0.close();
                }
            case 9:
                pwb0 pwb0Var = (pwb0) obj;
                if (pwb0Var.d && (pinVisualState = pwb0Var.b) != PinVisualState.INVISIBLE && pinVisualState != PinVisualState.DUST) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 10:
                kn00 kn00Var = (kn00) obj;
                hn00 hn00Var = kn00Var instanceof hn00 ? (hn00) kn00Var : null;
                return Boolean.valueOf((hn00Var != null ? hn00Var.h : null) instanceof xn00);
            case 11:
                fo00 fo00Var = ((hn00) obj).h;
                if (fo00Var instanceof xn00) {
                    return (xn00) fo00Var;
                }
                return null;
            case 12:
                return zy11Var;
            case 13:
                return (laz) ((a5g) obj).Q2.get();
            case 14:
                d0g d0gVar = ((c0g) ((a5g) obj).a).A.a;
                return new ej1(8, (w030) d0gVar.b.o0.get(), (kss) d0gVar.o2.a, ess.a);
            case 15:
                a5g a5gVar = (a5g) obj;
                c0g c0gVar = (c0g) a5gVar.a;
                Context H1 = c0gVar.H1();
                q5z.h(H1);
                w030 B5 = c0gVar.B5();
                q5z.h(B5);
                yxo yxoVar = (yxo) a5gVar.M2.a;
                a aVar = (a) a5gVar.t0.get();
                pho T1 = c0gVar.T1();
                q5z.h(T1);
                return new f730(H1, B5, yxoVar, new u1n(13, aVar, new yzh(new hsj(T1))));
            case 16:
                return Boolean.valueOf(((pwz0) obj) instanceof owz0);
            case 17:
                throw oyr.d(obj);
            case 18:
                ((acx) obj).c = true;
                return zy11Var;
            case 19:
                ((m2k0) obj).j(1);
                return zy11Var;
            case 20:
                c1y c1yVar = (c1y) obj;
                c1yVar.a();
                qam.t(c1yVar, new skt(), 0L, 0L, 0.0f, null, 9, 62);
                return zy11Var;
            case 21:
                createAvatarViews$lambda$0 = PlusPanelStatusAndFamilyView.createAvatarViews$lambda$0((View) obj);
                return createAvatarViews$lambda$0;
            case 22:
                return (List) obj;
            case 23:
                ((Boolean) obj).getClass();
                kgx[] kgxVarArr = led0.g;
                return zy11Var;
            case 24:
                ((em9) ((mta) obj).a.H).q(ChargersAnalytics$ChargersPlusOptionPaymentResult.Cancel);
                return zy11Var;
            case 25:
                mta mtaVar = (mta) obj;
                ((em9) mtaVar.a.H).q(ChargersAnalytics$ChargersPlusOptionPaymentResult.Failure);
                mtaVar.b.a(new cy9(15, null, null, null, null));
                return zy11Var;
            case 26:
                mta mtaVar2 = (mta) obj;
                ((em9) mtaVar2.a.H).q(ChargersAnalytics$ChargersPlusOptionPaymentResult.Failure);
                mtaVar2.b.a(new cy9(15, null, null, null, null));
                return zy11Var;
            case 27:
                return zy11Var;
            case 28:
                return ((PlusPayTestId) obj).toExpBoxFormat();
            default:
                return Integer.valueOf(((w610) obj).b().a);
        }
    }

    public /* synthetic */ fnb0(int i, Object obj) {
        this.a = i;
    }
}
