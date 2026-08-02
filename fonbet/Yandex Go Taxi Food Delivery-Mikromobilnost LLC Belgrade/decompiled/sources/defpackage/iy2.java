package defpackage;

import android.animation.ValueAnimator;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.Process;
import android.os.StrictMode;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.g;
import androidx.room.util.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.b;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.wallet.CardInfo;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentMethodToken;
import com.google.firebase.messaging.FirebaseMessaging;
import com.yandex.go.drive.launch.e;
import com.yandex.go.payments.addmethod.analytics.PaymentMethodsAnalytics$PlatformPayAction;
import com.yandex.go.payments.addmethod.analytics.PaymentMethodsAnalytics$PlatformPayProvider;
import com.yandex.go.payments.api.GooglePayInteractor$GooglePayTokenResult;
import com.yandex.go.payments.paymentlist.domain.k;
import com.yandex.go.payments.summary.ui.PaymentMethodsListModalView;
import com.yandex.go.splash.BaseSplashView;
import com.yandex.go.suggest.impl.view.FullscreenSuperappSuggestModalView;
import com.yandex.pulse.metrics.MetricsState;
import io.appmetrica.analytics.impl.InterfaceC0309ej;
import io.appmetrica.analytics.impl.Oa;
import io.appmetrica.analytics.impl.Wi;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.zip.CRC32;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.analytics.q;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.ModalView;

/* loaded from: classes9.dex */
public final /* synthetic */ class iy2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ iy2(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        moh mohVar;
        uut uutVar;
        boolean z = false;
        FileOutputStream fileOutputStream = null;
        switch (this.a) {
            case 0:
                ((ky2) this.b).c.remove((hy2) this.c);
                return;
            case 1:
                ((BaseSplashView) this.b).startAnimator((ValueAnimator) this.c);
                return;
            case 2:
                ((gh00) ((ah00) ((lb7) this.b).c)).u((v65) this.c);
                return;
            case 3:
                WorkDatabase workDatabase = (WorkDatabase) this.b;
                b bVar = (b) this.c;
                Iterator it = ((List) a.b(workDatabase.X0().a, true, false, new u431(15))).iterator();
                while (it.hasNext()) {
                    eja1.i(bVar, (String) it.next());
                }
                bVar.b.d.getClass();
                workDatabase.T0().b(new nle0("last_cancel_all_time_ms", Long.valueOf(System.currentTimeMillis())));
                return;
            case 4:
                ((ComponentActivity) this.b).addObserverForBackInvoker((qx60) this.c);
                return;
            case 5:
                cg70 cg70Var = (cg70) this.b;
                zvf0 zvf0Var = (zvf0) this.c;
                if (cg70Var.b != cg70.d) {
                    ny61.r("provide() can be called only once.");
                    return;
                }
                synchronized (cg70Var) {
                    mohVar = cg70Var.a;
                    cg70Var.a = null;
                    cg70Var.b = zvf0Var;
                }
                mohVar.f(zvf0Var);
                return;
            case 6:
                f7y f7yVar = (f7y) this.b;
                zvf0 zvf0Var2 = (zvf0) this.c;
                synchronized (f7yVar) {
                    try {
                        if (f7yVar.b == null) {
                            f7yVar.a.add(zvf0Var2);
                        } else {
                            f7yVar.b.add(zvf0Var2.get());
                        }
                    } finally {
                    }
                }
                return;
            case 7:
                List list = (List) this.b;
                e8e e8eVar = (e8e) this.c;
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((zy4) it2.next()).a(e8eVar.e);
                }
                return;
            case 8:
                ((com.google.firebase.crashlytics.internal.common.a) this.b).c((String) this.c, Boolean.FALSE);
                return;
            case 9:
                ((v2f) this.b).a((com.google.firebase.crashlytics.internal.settings.a) this.c);
                return;
            case 10:
                v2f v2fVar = (v2f) this.b;
                String str = (String) this.c;
                jp21 jp21Var = v2fVar.h.d;
                jp21Var.getClass();
                String a = dlx.a(1024, str);
                synchronized (jp21Var.g) {
                    try {
                        String str2 = (String) jp21Var.g.getReference();
                        if (a != null) {
                            z = a.equals(str2);
                        } else if (str2 == null) {
                            z = true;
                        }
                        if (z) {
                            return;
                        }
                        jp21Var.g.set(a, true);
                        jp21Var.b.b.a(new ymp0(13, jp21Var));
                        return;
                    } finally {
                    }
                }
            case 11:
                zlf zlfVar = (zlf) this.b;
                Runnable runnable = (Runnable) this.c;
                Process.setThreadPriority(zlfVar.c);
                StrictMode.ThreadPolicy threadPolicy = zlfVar.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 12:
                ((g) this.b).a((iot0) this.c);
                return;
            case 13:
                ((j) ((e) this.b).b).m.n.remove((nfm) this.c);
                return;
            case 14:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.b;
                atx0 atx0Var = (atx0) this.c;
                try {
                    atx0Var.a(firebaseMessaging.a());
                    return;
                } catch (Exception e) {
                    atx0Var.a.r(e);
                    return;
                }
            case 15:
                ((tls) this.b).invoke(((cfs) this.c).c());
                return;
            case 16:
                FullscreenSuperappSuggestModalView.lambda$0$0((FullscreenSuperappSuggestModalView) this.b, (ListItemComponent) this.c);
                return;
            case 17:
                com.yandex.go.payments.googlepay.domain.e eVar = (com.yandex.go.payments.googlepay.domain.e) this.b;
                Intent intent = (Intent) this.c;
                if (intent == null) {
                    jst.e.x(new RuntimeException("Intent is null"), "Google Pay card select error");
                    return;
                }
                jst.e.n("Google Pay: onTokenSuccess");
                eVar.a.getClass();
                uut uutVar2 = uut.e;
                PaymentData fromIntent = PaymentData.getFromIntent(intent);
                PaymentMethodToken paymentMethodToken = fromIntent != null ? fromIntent.getPaymentMethodToken() : null;
                CardInfo cardInfo = fromIntent != null ? fromIntent.getCardInfo() : null;
                if (paymentMethodToken == null) {
                    uutVar = uut.e;
                } else {
                    String token = paymentMethodToken.getToken();
                    if (cardInfo != null) {
                        cardInfo.getCardNetwork();
                    }
                    uutVar = new uut(token, paymentMethodToken.getPaymentMethodTokenizationType());
                }
                eVar.v = uutVar;
                eVar.s.g(GooglePayInteractor$GooglePayTokenResult.SUCCESS);
                ((g9a0) eVar.k.get()).g(PaymentMethodsAnalytics$PlatformPayProvider.GooglePay, PaymentMethodsAnalytics$PlatformPayAction.SelectSuccess, eVar.u, null);
                ((q) ((ac20) eVar.p.get())).h("GooglePay.Finished", g8e.z("identifier", eVar.u));
                return;
            case 18:
                ((j18) this.b).G((g6u) this.c, zy11.a);
                return;
            case 19:
                ((JobInfoSchedulerService) this.b).lambda$onStartJob$0((JobParameters) this.c);
                return;
            case 20:
                ((m8f0) ((k900) this.b).a.a).l(new ves0(((co11) this.c).a));
                return;
            case 21:
                ((j) ((ru.yandex.taxi.messenger.e) this.b).e).m.n.remove((nfm) this.c);
                return;
            case 22:
                MetricsState metricsState = (MetricsState) this.b;
                byte[] bArr = (byte[]) this.c;
                vku vkuVar = MetricsState.i;
                File file = metricsState.a;
                File file2 = new File(file.getPath() + ".tmp");
                try {
                    try {
                        try {
                            FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                            try {
                                CRC32 crc32 = new CRC32();
                                crc32.update(bArr);
                                ByteBuffer order = ByteBuffer.allocate(8).order(ByteOrder.BIG_ENDIAN);
                                order.putLong(crc32.getValue());
                                fileOutputStream2.write(order.array());
                                fileOutputStream2.write(bArr);
                                try {
                                    fileOutputStream2.close();
                                } catch (IOException unused) {
                                }
                                if (!file2.renameTo(file)) {
                                    throw new IOException();
                                }
                                vkuVar.b(0);
                                return;
                            } catch (Throwable th) {
                                th = th;
                                fileOutputStream = fileOutputStream2;
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (IOException unused2) {
                                    }
                                }
                                throw th;
                            }
                        } catch (IOException unused3) {
                            file2.delete();
                            vkuVar.b(1);
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } finally {
                    file2.delete();
                }
            case 23:
                ModalView.dismissInternal$lambda$1((ModalView) this.b, (Runnable) this.c);
                return;
            case 24:
                Oa.a((Wi) this.b, (InterfaceC0309ej) this.c);
                return;
            case 25:
                Oa.a((Oa) this.b, (Wi) this.c);
                return;
            case 26:
                ((kotlinx.coroutines.selects.b) ((fcq0) this.b)).k((y070) this.c, zy11.a);
                return;
            case 27:
                PaymentMethodsListModalView.configureButtonDone$lambda$0((PaymentMethodsListModalView) this.b, (m4m) this.c);
                return;
            case 28:
                jfa0 jfa0Var = (jfa0) this.b;
                k kVar = (k) this.c;
                List<nea0> list2 = jfa0Var.a;
                if ((list2 instanceof Collection) && list2.isEmpty()) {
                    return;
                }
                for (nea0 nea0Var : list2) {
                    if ((nea0Var.a instanceof ivt) && jl40.l(nea0Var.b, xw91.C)) {
                        kVar.J.g(PaymentMethodsAnalytics$PlatformPayProvider.GooglePay, PaymentMethodsAnalytics$PlatformPayAction.OptionShown, ((com.yandex.go.payments.googlepay.domain.e) kVar.S).u, null);
                        return;
                    }
                }
                return;
            default:
                ((aea0) this.b).T.s5(((dt51) this.c).a);
                return;
        }
    }
}
