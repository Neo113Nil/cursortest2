package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.compose.foundation.lazy.b;
import com.yandex.fintechsdk.core.architecture.api.fragment.BaseFragment;
import com.yandex.go.address.models.Address;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.taxi.summary.verticalsummary.router.d;
import com.yandex.go.where_you_are.impl.presentation.WhereYouAreModalView;
import com.yandex.go.yb.domain.t;
import com.yandex.go.yb.domain.y;
import com.yandex.messaging.extension.view.ViewExtensionsKt$onHeightChanged$listener$1;
import com.yandex.messaging.internal.net.VpnMonitor$observeVpn$1$callback$1;
import com.yandex.messaging.internal.net.c;
import com.yandex.payment.sdk.core.data.PaymentSdkEnvironment;
import com.yandex.plus.core.strings.PlusSdkBrandType;
import com.yandex.plus.home.feature.webviews.internal.stories.WebStoriesView;
import com.ybsdk.core.utils.ext.view.ViewExtensionsKt$textFlow$1$listener$1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatCapability;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;
import ru.yandex.taxi.preorder.summary.selector.verticals.bold.a;

/* loaded from: classes14.dex */
public final /* synthetic */ class hh31 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hh31(y6f0 y6f0Var, c cVar, VpnMonitor$observeVpn$1$callback$1 vpnMonitor$observeVpn$1$callback$1) {
        this.a = 10;
        this.b = cVar;
        this.c = vpnMonitor$observeVpn$1$callback$1;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        b450 nativePayButtonViewController_delegate$lambda$4;
        zy11 openSourcePicker$lambda$0;
        int i = this.a;
        int i2 = 1;
        zy11 zy11Var = zy11.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                d dVar = (d) obj;
                dVar.A((m950) dVar.U.get(), k0b1.a((Address) obj2, ((gh00) dVar.G).e.b(), SourcePicker.ADDITIONAL_FROM_SUMMARY, ModalViewOrigin.SUMMARY, false, new e83(6, dVar)), sy60.Q2);
                return zy11Var;
            case 1:
                b bVar = (b) obj;
                float w0 = ((fwi) obj2).w0(4.0f);
                if (w0 < 1.0f) {
                    w0 = 1.0f;
                }
                return Float.valueOf(bVar.h() <= 0 ? bVar.i() > 0 ? y6i0.c(bVar.i() / w0, 0.0f, 1.0f) : 0.0f : 1.0f);
            case 2:
                ((tls) obj2).invoke(((zaz0) obj).b);
                return zy11Var;
            case 3:
                a aVar = (a) obj2;
                q0v q0vVar = (q0v) obj;
                ob31 ob31Var = aVar.U;
                if (ob31Var != null) {
                    q0vVar.invoke(Integer.valueOf(aVar.F()), ob31Var);
                }
                return zy11Var;
            case 4:
                return (zo31) ((tls) obj2).invoke(((BaseFragment) obj).requireView());
            case 5:
                ((sls) obj2).invoke();
                com.ybsdk.core.utils.ext.view.b.c((LinearLayout) obj, true, 300L, 0, 0L, null, 28);
                return zy11Var;
            case 6:
                ((View) obj2).removeOnLayoutChangeListener((ViewExtensionsKt$onHeightChanged$listener$1) obj);
                return zy11Var;
            case 7:
                ((View) obj2).getViewTreeObserver().removeOnGlobalLayoutListener((phd) obj);
                return zy11Var;
            case 8:
                ((EditText) obj2).removeTextChangedListener((ViewExtensionsKt$textFlow$1$listener$1) obj);
                return zy11Var;
            case 9:
                ((uy31) obj2).e.a((String) obj);
                return zy11Var;
            case 10:
                try {
                    ((c) obj2).c.unregisterNetworkCallback((VpnMonitor$observeVpn$1$callback$1) obj);
                } catch (Throwable unused) {
                }
                return zy11Var;
            case 11:
                syj0 b = ((t830) ((com.yandex.quark.webchat.navigation.internal.a) obj).c).b(TAliceChatCapability.TChatNavigateBackDirective.class, new TAliceChatCapability.TChatNavigateBackDirective(null, (String) obj2, null, 5, null));
                if (b instanceof lyj0) {
                    b = new lyj0(new smj("chat_navigate_back_directive", new fnj((String) ((lyj0) b).a)));
                } else if (!(b instanceof jyj0)) {
                    w511.b();
                    return null;
                }
                return b.a(zd41.a);
            case 12:
                nativePayButtonViewController_delegate$lambda$4 = WebStoriesView.nativePayButtonViewController_delegate$lambda$4((WebStoriesView) obj2, (PlusSdkBrandType) obj);
                return nativePayButtonViewController_delegate$lambda$4;
            case 13:
                bo41 bo41Var = (bo41) obj2;
                LinkedHashSet b2 = bo41Var.b();
                HashMap hashMap = bo41Var.c;
                ArrayList arrayList = bo41Var.a;
                arrayList.remove((do41) obj);
                Set<String> g = v4r0.g(b2, bo41Var.b());
                if (arrayList.isEmpty()) {
                    hashMap.clear();
                    bo41Var.d = null;
                }
                for (String str : g) {
                    hashMap.remove(str);
                    List list = (List) bo41Var.b.get(str);
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((v221) it.next()).b();
                        }
                    }
                }
                return zy11Var;
            case 14:
                openSourcePicker$lambda$0 = WhereYouAreModalView.openSourcePicker$lambda$0((WhereYouAreModalView) obj2, (Screen) obj);
                return openSourcePicker$lambda$0;
            case 15:
                ((tls) obj2).invoke((uz41) obj);
                return zy11Var;
            case 16:
                qke.v(((View) obj2).getContext());
                ((i051) obj).d0.b();
                return zy11Var;
            case 17:
                ((androidx.window.layout.a) obj2).a.b((k9b) obj);
                return zy11Var;
            case 18:
                mj31 mj31Var = (mj31) obj2;
                mj31 mj31Var2 = new mj31((Context) mj31Var.b, (PaymentSdkEnvironment) obj, (rwo) mj31Var.c, 8);
                l1g l1gVar = new l1g();
                int i3 = 4;
                l1gVar.a = i5m.b(new e641(mj31Var2, i5m.b(new jd51(mj31Var2, 2)), i3));
                xvf0 b3 = i5m.b(new jd51(mj31Var2, i2));
                l1gVar.b = b3;
                i5m.b(new x851(mj31Var2, l1gVar.a, b3));
                l1gVar.c = i5m.b(new jd51(mj31Var2, 3));
                l1gVar.d = i5m.b(new sk21(mj31Var2, l1gVar.c, i5m.b(new jd51(mj31Var2, i3)), 13));
                l1gVar.e = i5m.b(new jd51(mj31Var2, 0));
                return l1gVar;
            case 19:
                ((de51) obj2).e.d((k200) obj);
                return zy11Var;
            case 20:
                ((dv51) ((cv51) ((t) obj2).c.get())).b(new fv51((dw51) obj, true), new bgc(12));
                return zy11Var;
            case 21:
                com.yandex.go.yb.qr.ui.a aVar2 = (com.yandex.go.yb.qr.ui.a) obj2;
                ((j) aVar2.e.a).n("BankQrButton.Tapped");
                ((a60) aVar2.d).c(((iu51) obj).a, v770.c);
                return zy11Var;
            case 22:
                cv51 cv51Var = (cv51) ((y) obj2).g.get();
                fv51 fv51Var = new fv51((ew51) obj, true);
                bgc bgcVar = new bgc(12);
                dv51 dv51Var = (dv51) cv51Var;
                ((com.yandex.go.yb.c) dv51Var.c.getValue()).i();
                dv51Var.b(fv51Var, bgcVar);
                return zy11Var;
            default:
                return new com.yandex.plus.pay.ui.webview.common.diagnostic.a((com.yandex.plus.domain.auth.impl.a) obj2, ((gz51) obj).b);
        }
    }

    public /* synthetic */ hh31(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
