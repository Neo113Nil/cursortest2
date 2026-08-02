package defpackage;

import android.view.ViewGroup;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.adjust.sdk.ActivityHandler;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView;
import com.yandex.div.core.view2.i;
import com.yandex.go.app.icon.c;
import com.yandex.go.payments.addmethod.analytics.PaymentMethodsAnalytics$PlatformPayAction;
import com.yandex.go.payments.addmethod.analytics.PaymentMethodsAnalytics$PlatformPayProvider;
import com.yandex.go.payments.api.GooglePayInteractor$GooglePayTokenResult;
import io.appmetrica.analytics.impl.E0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.analytics.Events$Zalogin$LinkageContext;
import ru.yandex.taxi.design.AddressInputComponent;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.DividerAwareComponent;
import ru.yandex.taxi.design.FloatingTitleToolbarComponent;
import ru.yandex.taxi.design.NotificationStackComponent;
import ru.yandex.taxi.linked_order.a;
import ru.yandex.taxi.widget.progress.SimpleSpinnerModalView;
import ru.yandex.taxi.zalogin.d;
import ru.yandex.taxi.zalogin.e;

/* loaded from: classes.dex */
public final /* synthetic */ class b7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((AbstractComposeView) obj).attachedToWindow();
                return;
            case 1:
                ((n10) obj).e.cancel();
                return;
            case 2:
                a aVar = (a) obj;
                ((p10) aVar.m.c).x9(aVar.n.b);
                return;
            case 3:
                ((ActivityHandler) obj).lambda$new$1();
                return;
            case 4:
                ((in2) obj).invoke();
                return;
            case 5:
                AndroidComposeViewAccessibilityDelegateCompat.semanticsChangeChecker$lambda$0((AndroidComposeViewAccessibilityDelegateCompat) obj);
                return;
            case 6:
                AndroidContentCaptureManager.contentCaptureChangeChecker$lambda$0((AndroidContentCaptureManager) obj);
                return;
            case 7:
                lh2 lh2Var = lh2.c;
                ((gtg) obj).invoke();
                return;
            case 8:
                lh2 lh2Var2 = lh2.c;
                ((gtg) obj).invoke();
                return;
            case 9:
                ((c) obj).c.a();
                return;
            case 10:
                ((hf4) obj).d.cancel();
                return;
            case 11:
                ConcurrentHashMap concurrentHashMap = ((ru.yandex.taxi.banners.c) obj).t;
                Iterator it = concurrentHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    ((Runnable) ((Map.Entry) it.next()).getValue()).run();
                }
                concurrentHashMap.clear();
                return;
            case 12:
                ((kf5) obj).d();
                return;
            case 13:
                ((bw6) obj).b.c.b();
                return;
            case 14:
                ButtonComponent.init$lambda$0((ButtonComponent) obj);
                return;
            case 15:
                bxx0 bxx0Var = ((k49) obj).a;
                LinkedHashMap linkedHashMap = bxx0Var.c;
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    tj60 tj60Var = (tj60) entry.getKey();
                    sj60 sj60Var = (sj60) entry.getValue();
                    NotificationStackComponent notificationStackComponent = tj60Var.a;
                    if (notificationStackComponent != null) {
                        notificationStackComponent.removeListener(sj60Var);
                    }
                }
                linkedHashMap.clear();
                bxx0Var.b.clear();
                r0 r0Var = bxx0Var.a;
                Boolean bool = Boolean.FALSE;
                r0Var.getClass();
                r0Var.m(null, bool);
                return;
            case 16:
                ((j89) obj).e();
                return;
            case 17:
                ((b850) obj).a.a().h();
                return;
            case 18:
                d dVar = (d) obj;
                Events$Zalogin$LinkageContext events$Zalogin$LinkageContext = dVar.n;
                if (events$Zalogin$LinkageContext == null) {
                    jst.e.s(new IllegalStateException("LinkedContext is required to link accounts"));
                    return;
                }
                int i2 = 21;
                zi ziVar = new zi(i2);
                yes0 yes0Var = SimpleSpinnerModalView.Companion;
                ViewGroup viewGroup = (ViewGroup) dVar.e.requireViewById(teh0.top_fullscreen_modal_views_container);
                yes0Var.getClass();
                dVar.o = yes0.c(viewGroup, false, false);
                sjy sjyVar = (sjy) dVar.h.get();
                sjyVar.a.a(new e(sjyVar, events$Zalogin$LinkageContext, ziVar), new dhv(i2, sjyVar));
                return;
            case 19:
                v0j v0jVar = (v0j) obj;
                v0jVar.e(g18.u1);
                Lifecycle.Event event = Lifecycle.Event.ON_DESTROY;
                if (v0jVar.w) {
                    return;
                }
                v0jVar.z.g(event);
                return;
            case 20:
                Div2View.addNewStateViewWithTransition$lambda$54((Div2View) obj);
                return;
            case 21:
                DivLineHeightTextView.startDivAnimation$lambda$2((DivLineHeightTextView) obj);
                return;
            case 22:
                i iVar = (i) obj;
                Iterator it2 = iVar.b.a.iterator();
                if (it2.hasNext()) {
                    throw unr0.i(it2);
                }
                iVar.l = false;
                return;
            case 23:
                ((DividerAwareComponent) obj).invalidate();
                return;
            case 24:
                ((DrawerLayout) obj).closeDrawers();
                return;
            case 25:
                ((E0) obj).o();
                return;
            case 26:
                ((FloatingTitleToolbarComponent) obj).initScrollTracker();
                return;
            case 27:
                ((Fragment) obj).lambda$performCreateView$0();
                return;
            case 28:
                ((AddressInputComponent) obj).requestInputFocus();
                return;
            default:
                com.yandex.go.payments.googlepay.domain.e eVar = (com.yandex.go.payments.googlepay.domain.e) obj;
                jst.e.n("Google Pay: onTokenCancel");
                eVar.v = uut.e;
                eVar.s.g(GooglePayInteractor$GooglePayTokenResult.CANCEL);
                ((g9a0) eVar.k.get()).g(PaymentMethodsAnalytics$PlatformPayProvider.GooglePay, PaymentMethodsAnalytics$PlatformPayAction.SelectCancel, eVar.u, null);
                return;
        }
    }
}
