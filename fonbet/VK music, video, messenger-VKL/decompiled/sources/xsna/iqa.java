package xsna;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.vk.feature.uxpolls.configure.UxPollInitializer;
import com.vk.im.engine.models.events.OnCacheInvalidateEvent;
import java.security.KeyStore;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.security.cert.CertificateException;
import javax.security.cert.X509Certificate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.d4e0;
import xsna.vl8.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class iqa implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ iqa(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        X509Certificate x509Certificate;
        u9e0 u9e0Var;
        d4e0 d4e0Var;
        switch (this.b) {
            case 0:
                mqa mqaVar = (mqa) this.c;
                List list = (List) obj;
                if (epx.f(list, mqaVar.e)) {
                    return s3q0.a;
                }
                List<t9e0> list2 = list;
                wvb0 wvb0Var = mqaVar.b;
                ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                for (t9e0 t9e0Var : list2) {
                    cjv cjvVar = (cjv) wvb0Var.b;
                    PublicKey publicKey = null;
                    try {
                        x509Certificate = X509Certificate.getInstance(t9e0Var.a.getBytes(emb.b));
                    } catch (CertificateException unused) {
                        x509Certificate = null;
                        if (x509Certificate == null) {
                        }
                        arrayList.add(u9e0Var);
                    } catch (Throwable th) {
                        cjvVar.invoke(th);
                        x509Certificate = null;
                        if (x509Certificate == null) {
                        }
                        arrayList.add(u9e0Var);
                    }
                    if (x509Certificate == null) {
                        u9e0Var = new u9e0(t9e0Var, null, null);
                    } else {
                        try {
                            x509Certificate.checkValidity();
                            try {
                                publicKey = x509Certificate.getPublicKey();
                            } catch (Exception unused2) {
                            }
                            u9e0Var = new u9e0(t9e0Var, x509Certificate, publicKey);
                        } catch (CertificateException e) {
                            if (qni0.a() < x509Certificate.getNotBefore().getTime() || qni0.a() > x509Certificate.getNotAfter().getTime()) {
                                ((apf) wvb0Var.a).invoke();
                            } else {
                                cjvVar.invoke(e);
                            }
                            u9e0Var = new u9e0(t9e0Var, x509Certificate, null);
                        }
                    }
                    arrayList.add(u9e0Var);
                }
                c460 c460Var = mqaVar.c;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    u9e0 u9e0Var2 = (u9e0) it.next();
                    c460Var.f.get();
                    KeyStore keyStore = c460Var.e.get();
                    if (keyStore != null) {
                        try {
                            vl8 vl8Var = new vl8();
                            vl8Var.S(u9e0Var2.a().a);
                            Collection<? extends Certificate> generateCertificates = CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509).generateCertificates(vl8Var.new a());
                            if (!generateCertificates.isEmpty()) {
                                Iterator<T> it2 = generateCertificates.iterator();
                                int i = 0;
                                while (it2.hasNext()) {
                                    int i2 = i + 1;
                                    keyStore.setCertificateEntry(String.valueOf(i), (Certificate) it2.next());
                                    i = i2;
                                }
                            }
                        } catch (Exception e2) {
                            com.vk.metrics.eventtracking.b.a.a(e2);
                        }
                    }
                }
                new lqa(mqaVar, mqa.class, "proxyCertificates", "getProxyCertificates()Ljava/util/List;", 0).set(arrayList);
                mqaVar.f.onNext(arrayList);
                return s3q0.a;
            case 1:
                sxp sxpVar = (sxp) obj;
                return Boolean.valueOf(((kzc0) this.c).c.invoke().booleanValue() && ((sxpVar instanceof OnCacheInvalidateEvent) || (sxpVar instanceof p680)));
            case 2:
                UxPollInitializer uxPollInitializer = (UxPollInitializer) this.c;
                if (((Boolean) obj).booleanValue()) {
                    Context context = uxPollInitializer.a;
                    b25 b25Var = uxPollInitializer.b;
                    int i3 = UxPollInitializer.a.$EnumSwitchMapping$0[uxPollInitializer.c.ordinal()];
                    if (i3 == 1) {
                        d4e0Var = d4e0.b.b;
                    } else if (i3 == 2) {
                        d4e0Var = new d4e0.a(o25.b(uxPollInitializer.b) ? "sferum" : NotificationCompat.CATEGORY_MESSAGE);
                    } else if (i3 == 3) {
                        d4e0Var = new d4e0.a("clips");
                    } else {
                        if (i3 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        d4e0Var = new d4e0.a("video");
                    }
                    new s4r0(context, b25Var, d4e0Var, uxPollInitializer.d, uxPollInitializer.e).a();
                }
                return s3q0.a;
            default:
                Pair pair = (Pair) obj;
                return ((Boolean) pair.i()).booleanValue() ? dhr0.n.a(((FragmentActivity) this.c).getApplicationContext()).t(pair) : io.reactivex.rxjava3.core.x.k(pair);
        }
    }
}
