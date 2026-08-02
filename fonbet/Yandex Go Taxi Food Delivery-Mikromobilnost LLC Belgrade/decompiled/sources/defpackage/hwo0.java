package defpackage;

import android.content.Context;
import android.util.Base64;
import androidx.compose.ui.platform.ComposeView;
import com.yandex.go.payments.shared.members.list.MemberListMode;
import com.yandex.go.payments.shared.y;
import com.yandex.go.preorder.suggested.menu.analytics.SuggestMenuLegacyAnalytics$Prefix;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.TemplatePaymentTypeTransfers;
import java.io.ByteArrayInputStream;
import java.security.KeyStore;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.ssl.util.TLSContext;
import ru.rt.ebs.cryptosdk.core.common.controllers.ICommonController;
import ru.rt.ebs.cryptosdk.core.logging.EbsLogger;
import ru.rt.ebs.cryptosdk.core.security.controllers.ISecurityController;
import ru.rt.ebs.cryptosdk.core.security.di.ISecurityComponent;
import ru.rt.ebs.cryptosdk.core.security.entities.exceptions.CertificateSecurityEbsException;
import ru.rt.ebs.cryptosdk.core.security.entities.models.ITLSFactory;
import ru.rt.ebs.cryptosdk.core.security.entities.models.ITLSProvider;
import ru.rt.ebs.cryptosdk.core.security.entities.models.TLSOptions;
import ru.rt.ebs.cryptosdk.core.storage.di.IStorageComponent;
import ru.rt.ebs.cryptosdk.core.storage.file.IFileManager;
import ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage;
import ru.rt.ebs.cryptosdk.core.storage.keystore.KeyStorageType;
import ru.yandex.logistics.sdk.cargo_form.impl.domain.a;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.text_input.d;
import ru.yandex.taxi.preorder.suggested.menu.EntryPoint;

/* loaded from: classes4.dex */
public final class hwo0 implements ISecurityComponent, wni, IStorageComponent, ITLSFactory {
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;
    public Object w;
    public Object x;

    public hwo0(EntryPoint entryPoint, lx4 lx4Var, o7r0 o7r0Var) {
        this.a = 16;
        this.b = entryPoint;
        this.c = lx4Var;
        this.w = o7r0Var;
        this.x = b6v0.a[entryPoint.ordinal()] == 1 ? SuggestMenuLegacyAnalytics$Prefix.SelectedLocationMenu : SuggestMenuLegacyAnalytics$Prefix.SuggestContextMenu;
    }

    public static hwo0 a(Throwable th, kjz kjzVar) {
        Stack stack = new Stack();
        while (th != null) {
            stack.push(th);
            th = th.getCause();
        }
        hwo0 hwo0Var = null;
        while (!stack.isEmpty()) {
            Throwable th2 = (Throwable) stack.pop();
            hwo0Var = new hwo0(th2.getLocalizedMessage(), th2.getClass().getName(), kjzVar.a(th2.getStackTrace()), hwo0Var, 29);
        }
        return hwo0Var;
    }

    public static void c(hwo0 hwo0Var, String str, tky0 tky0Var, boolean z, String str2, int i) {
        Object value;
        LinkedHashMap linkedHashMap;
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        u1n u1nVar = (u1n) hwo0Var.x;
        String str3 = tky0Var.a;
        String str4 = str.length() > 0 ? str : null;
        if (str2 != null) {
            u1nVar.q(null, str2.concat(".TextInput.Changed"));
        }
        zpy0 zpy0Var = tky0Var.c;
        if (zpy0Var != null) {
            ((d) hwo0Var.w).a(tky0Var.d, str, zpy0Var);
        }
        if (!z) {
            u1n.m(u1nVar, new x2s(tky0Var.e, null));
        }
        if (!tky0Var.b) {
            ((p6s) hwo0Var.b).c(str4, str3);
            return;
        }
        r0 r0Var = ((a) hwo0Var.c).b;
        do {
            value = r0Var.getValue();
            linkedHashMap = new LinkedHashMap((Map) value);
            linkedHashMap.put(str3, str4);
        } while (!r0Var.k(value, linkedHashMap));
    }

    public void b() {
        y yVar = (y) this.c;
        int i = xor0.a[((MemberListMode) this.b).ordinal()];
        if (i == 1) {
            yVar.c.a().d(new bm((il) this.w, new tor0(yVar, (ynr0) this.x)));
        } else if (i == 2 || i == 3 || i == 4) {
            yVar.d();
        } else {
            w511.b();
        }
    }

    @Override // ru.rt.ebs.cryptosdk.core.storage.di.IStorageComponent
    public void clearStorage(String str) {
        IKeyStorage iKeyStorage = (IKeyStorage) ((ConcurrentHashMap) ((g1o) getKeyStorageManager()).a).get(str);
        if (iKeyStorage != null) {
            iKeyStorage.release();
        }
    }

    @Override // ru.rt.ebs.cryptosdk.core.storage.di.IStorageComponent
    public IFileManager getFileManager() {
        me0 me0Var = (me0) this.c;
        if (me0Var != null) {
            return me0Var;
        }
        Context context = ((an8) this.b).getContext();
        new g1r();
        me0 me0Var2 = new me0();
        me0Var2.a = context;
        this.c = me0Var2;
        return me0Var2;
    }

    @Override // ru.rt.ebs.cryptosdk.core.storage.di.IStorageComponent
    public b3v getKeyStorageManager() {
        g1o g1oVar = (g1o) this.x;
        if (g1oVar != null) {
            return g1oVar;
        }
        g1o g1oVar2 = new g1o(((an8) this.b).getContext());
        this.x = g1oVar2;
        return g1oVar2;
    }

    @Override // ru.rt.ebs.cryptosdk.core.security.entities.models.ITLSFactory
    public ITLSProvider getOrCreateGostTLSProvider() {
        cjw0 cjw0Var = (cjw0) this.w;
        if (cjw0Var != null) {
            return cjw0Var;
        }
        p1b p1bVar = (p1b) this.b;
        k4x0 k4x0Var = (k4x0) this.x;
        ddf ddfVar = (ddf) p1bVar.a;
        KeyStore keyStore = KeyStore.getInstance("CertStore", "JCSP");
        keyStore.load(null, null);
        for (String str : Collections.list(keyStore.aliases())) {
            if (keyStore.containsAlias(str)) {
                keyStore.deleteEntry(str);
            }
        }
        ((ICommonController) ddfVar.b).verifySelfSignCertificates(new ybf(ddfVar, k4x0Var));
        try {
            Iterator it = kotlin.collections.a.m0(k4x0Var.b, k4x0Var.a).iterator();
            while (it.hasNext()) {
                X509Certificate x509Certificate = (X509Certificate) it.next();
                String bigInteger = x509Certificate.getSerialNumber().toString(16);
                if (keyStore.containsAlias(bigInteger)) {
                    ddf.i("is duplicate", x509Certificate);
                    throw null;
                }
                keyStore.setCertificateEntry(bigInteger, x509Certificate);
            }
            TrustManager[] trustManagerArr = new TrustManager[1];
            SSLSocketFactory socketFactory = TLSContext.initClientSSL("JTLS", "TLSv1.2", keyStore, trustManagerArr).getSocketFactory();
            cjw0 cjw0Var2 = new cjw0((String[]) Arrays.copyOf(ddf.c, 3), (X509TrustManager) trustManagerArr[0], socketFactory);
            this.w = cjw0Var2;
            return cjw0Var2;
        } catch (Exception e) {
            if (e instanceof CertificateSecurityEbsException) {
                throw e;
            }
            throw new CertificateSecurityEbsException(e);
        }
    }

    @Override // ru.rt.ebs.cryptosdk.core.storage.di.IStorageComponent
    public u3v getResourceManager() {
        me0 me0Var = (me0) this.w;
        if (me0Var != null) {
            return me0Var;
        }
        me0 me0Var2 = new me0(((an8) this.b).getContext(), (byte) 0);
        this.w = me0Var2;
        return me0Var2;
    }

    @Override // ru.rt.ebs.cryptosdk.core.security.di.ISecurityComponent
    public ISecurityController getSecurityController() {
        an8 an8Var = (an8) this.w;
        a7q0 a7q0Var = (a7q0) this.x;
        if (a7q0Var != null) {
            return a7q0Var;
        }
        ICommonController commonController = an8Var.getCommonController();
        Context context = an8Var.getContext();
        u3v resourceManager = ((hwo0) this.c).getResourceManager();
        p1b p1bVar = new p1b(new cdf(), new adf(), new ycf(), new ddf(0, an8Var.getCommonController()), new vbb(context, resourceManager));
        mpe mpeVar = (mpe) this.b;
        a7q0 a7q0Var2 = new a7q0(commonController, p1bVar, mpeVar.o, mpeVar.n, an8Var.getSdkDispatchers());
        this.x = a7q0Var2;
        return a7q0Var2;
    }

    @Override // ru.rt.ebs.cryptosdk.core.security.entities.models.ITLSFactory
    public ITLSFactory init(TLSOptions tLSOptions) {
        Set entrySet = ((Map) this.c).entrySet();
        ArrayList arrayList = new ArrayList(tcc.n(entrySet, 10));
        Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            arrayList.add((X509Certificate) CertificateFactory.getInstance(JCP.CERTIFICATE_FACTORY_NAME).generateCertificate(new ByteArrayInputStream(Base64.decode((String) ((Map.Entry) it.next()).getValue(), 4))));
        }
        this.x = new k4x0(arrayList, tLSOptions.getCertificates$cryptosdk_core_prodRelease());
        return this;
    }

    @Override // defpackage.wni
    public ComposeView m(uni uniVar, vni vniVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 12:
                ComposeView composeView = new ComposeView((Context) obj, null, 0, 6, null);
                composeView.setContent(new androidx.compose.runtime.internal.a(-1245831972, new d7s0(this, 0), true));
                return composeView;
            default:
                ComposeView composeView2 = new ComposeView((Context) obj, null, 0, 6, null);
                composeView2.setContent(new androidx.compose.runtime.internal.a(-1258401842, new l701(this, (m701) uniVar, (i701) vniVar, 2), true));
                return composeView2;
        }
    }

    @Override // ru.rt.ebs.cryptosdk.core.storage.di.IStorageComponent
    public IKeyStorage memoryKeyStorage(String str) {
        return ((g1o) getKeyStorageManager()).b(str, KeyStorageType.MEMORY);
    }

    @Override // ru.rt.ebs.cryptosdk.core.storage.di.IStorageComponent
    public IKeyStorage prefsKeyStorage(String str) {
        return ((g1o) getKeyStorageManager()).b(str, KeyStorageType.PREFS);
    }

    @Override // ru.rt.ebs.cryptosdk.core.common.entities.models.IComponent
    public void release() {
        switch (this.a) {
            case 6:
                a7q0 a7q0Var = (a7q0) this.x;
                if (a7q0Var != null) {
                    a7q0Var.f = null;
                }
                this.x = null;
                break;
            default:
                this.c = null;
                this.w = null;
                g1o g1oVar = (g1o) this.x;
                if (g1oVar != null) {
                    Iterator it = ((ConcurrentHashMap) g1oVar.a).entrySet().iterator();
                    while (it.hasNext()) {
                        ((IKeyStorage) ((Map.Entry) it.next()).getValue()).release();
                    }
                    ((ConcurrentHashMap) g1oVar.a).clear();
                }
                this.x = null;
                break;
        }
    }

    @Override // ru.rt.ebs.cryptosdk.core.storage.di.IStorageComponent
    public void removeStorage(String str) {
        try {
            g1o g1oVar = (g1o) getKeyStorageManager();
            IKeyStorage iKeyStorage = (IKeyStorage) ((ConcurrentHashMap) g1oVar.a).get(str);
            if (iKeyStorage != null) {
                iKeyStorage.release();
            }
            ((ConcurrentHashMap) g1oVar.a).remove(str);
        } catch (Exception e) {
            EbsLogger.INSTANCE.warning(e);
        }
    }

    public hwo0(p1b p1bVar, Map map) {
        this.a = 18;
        this.b = p1bVar;
        this.c = map;
        this.x = new k4x0(0);
    }

    public hwo0(c7q0 c7q0Var, mpe mpeVar, hwo0 hwo0Var, an8 an8Var) {
        this.a = 6;
        this.b = mpeVar;
        this.c = hwo0Var;
        this.w = an8Var;
    }

    public hwo0(eju0 eju0Var, an8 an8Var) {
        this.a = 15;
        this.b = an8Var;
    }

    public hwo0(a3v a3vVar, z2s0 z2s0Var) {
        this.a = 11;
        this.b = a3vVar;
        this.c = z2s0Var;
        this.w = z2s0Var;
        this.x = z2s0Var;
    }

    public /* synthetic */ hwo0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
        this.x = obj4;
    }

    public hwo0(AppAnalyticsReporter appAnalyticsReporter, TemplatePaymentTypeTransfers templatePaymentTypeTransfers, String str, String str2) {
        this.a = 21;
        this.c = appAnalyticsReporter;
        this.w = templatePaymentTypeTransfers;
        this.b = str;
        this.x = str2;
    }

    public hwo0(Context context, hwy0 hwy0Var, n701 n701Var) {
        this.a = 24;
        this.b = context;
        this.c = hwy0Var;
        this.w = n701Var;
        this.x = new tgg(Collections.singleton(new fms0()));
    }

    public hwo0(String str, String[] strArr, String str2, dpy0 dpy0Var) {
        this.a = 23;
        this.b = str;
        this.c = strArr;
        this.x = str2;
        this.w = dpy0Var;
    }
}
