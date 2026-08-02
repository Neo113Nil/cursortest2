package xsna;

import android.app.Application;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.my.tracker.MyTracker;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.net.CookieManager;
import java.net.CookieStore;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import xsna.h8z0;
import xsna.kqz0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class w4k implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ w4k(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0091 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02ae  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        zgy0 pliVar;
        CookieStore ycy0Var;
        SQLiteDatabase a;
        taz0 xcz0Var;
        vfz0 vfz0Var;
        vfz0 vfz0Var2;
        CertificateFactory certificateFactory;
        KeyStore keyStore;
        TrustManagerFactory trustManagerFactory;
        X509TrustManager x509TrustManager;
        SSLContext sSLContext;
        qyy0 qyy0Var;
        switch (this.b) {
            case 0:
                ((d5k) this.c).a((k1j0) this.d);
                return;
            default:
                idy0 idy0Var = (idy0) this.c;
                Context context = (Context) this.d;
                Context context2 = idy0Var.a;
                int i = 17;
                int i2 = 0;
                try {
                    SQLiteDatabase openOrCreateDatabase = context2.openOrCreateDatabase("com_my_target_sdk.db", 0, null);
                    if (openOrCreateDatabase == null) {
                        gu8.e(null, "MyTargetDatabase error: can't open database");
                        pliVar = new pli(i);
                    } else {
                        if (openOrCreateDatabase.getVersion() != 2) {
                            openOrCreateDatabase.close();
                            context2.deleteDatabase("com_my_target_sdk.db");
                            openOrCreateDatabase = tqy0.b(context2);
                        }
                        pliVar = new tqy0(openOrCreateDatabase);
                    }
                } catch (Throwable th) {
                    gu8.c(null, "MyTargetDatabase error: exception occurred while initialization database, " + th);
                    pliVar = new pli(i);
                }
                zgy0 zgy0Var = pliVar;
                SQLiteDatabase a2 = zgy0Var.a();
                if (a2 != null) {
                    try {
                        ycy0Var = new ycy0(a2);
                    } catch (Throwable th2) {
                        gu8.c(null, "CookieStore error: " + th2);
                    }
                    if (ycy0Var == null) {
                        ycy0Var = new vrz0();
                    }
                    qjz0 qjz0Var = new qjz0(new CookieManager(ycy0Var, null));
                    xr50.d = qjz0Var;
                    a = zgy0Var.a();
                    if (a != null) {
                        try {
                            xcz0Var = new xcz0(a);
                            try {
                                vfz0Var = new ciz0(a);
                            } catch (Exception unused) {
                                vfz0Var = null;
                            }
                        } catch (Exception unused2) {
                        }
                        if (xcz0Var == null) {
                            xcz0Var = new xbz0();
                        }
                        taz0 taz0Var = xcz0Var;
                        if (vfz0Var == null) {
                            vfz0Var = new xgz0();
                        }
                        jfz0 jfz0Var = new jfz0(o8z0.e, taz0Var, new u3z0(), qjz0Var, idy0Var);
                        ziz0.a = vfz0Var;
                        vfz0Var2 = ziz0.a;
                        if (vfz0Var2 != null) {
                            ConcurrentHashMap all = vfz0Var2.getAll();
                            Iterator it = all.keySet().iterator();
                            while (it.hasNext()) {
                                ziz0.a((String) it.next());
                            }
                            ziz0.d.putAll(all);
                        }
                        jfz0Var.a.execute(new qp50(jfz0Var, 3));
                        synchronized (h8z0.class) {
                            try {
                                if (h8z0.a == null) {
                                    h8z0.a = new h8z0.a(jfz0Var);
                                }
                            } finally {
                            }
                        }
                        mez0.g = idy0Var;
                        mez0.h = qjz0Var;
                        if (kqz0.a.a) {
                            khy0.a |= 2;
                        }
                        try {
                            try {
                                Class.forName("com.unity3d.player.UnityPlayerActivity");
                                khy0.a |= 1;
                            } catch (Throwable unused3) {
                            }
                        } catch (Throwable unused4) {
                            Runtime.getRuntime().loadLibrary(PluginErrorDetails.Platform.UNITY);
                            khy0.a |= 1;
                        }
                        if (!fqa.b) {
                            try {
                                certificateFactory = CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
                            } catch (CertificateException e) {
                                gu8.f(null, "CertManager: exception: " + gu8.b(e));
                                certificateFactory = null;
                            }
                            if (certificateFactory == null) {
                                gu8.f(null, "CertManager: Error make certData – certificateFactory is null");
                            } else {
                                try {
                                    KeyStore keyStore2 = KeyStore.getInstance(KeyStore.getDefaultType());
                                    keyStore2.load(null, null);
                                    keyStore = keyStore2;
                                } catch (Throwable th3) {
                                    gu8.f(null, "CertManager: exception: " + gu8.b(th3));
                                    keyStore = null;
                                }
                                if (keyStore == null) {
                                    gu8.f(null, "CertManager: Error make certData – keyStore is null");
                                } else {
                                    f0z0.a(keyStore, certificateFactory, "russian_trusted_root_ca", n1z0.b);
                                    f0z0.a(keyStore, certificateFactory, "russian_trusted_root_ca_gost_2025", n1z0.c);
                                    f0z0.a(keyStore, certificateFactory, "russian_trusted_sub_ca", n1z0.d);
                                    f0z0.a(keyStore, certificateFactory, "russian_trusted_sub_ca_2024", n1z0.e);
                                    f0z0.a(keyStore, certificateFactory, "russian_trusted_sub_ca_gost_2025", n1z0.f);
                                    ArrayList arrayList = new ArrayList();
                                    try {
                                        KeyStore keyStore3 = KeyStore.getInstance("AndroidCAStore");
                                        if (keyStore3 != null) {
                                            keyStore3.load(null, null);
                                            Enumeration<String> aliases = keyStore3.aliases();
                                            while (aliases.hasMoreElements()) {
                                                try {
                                                    X509Certificate x509Certificate = (X509Certificate) keyStore3.getCertificate(aliases.nextElement());
                                                    if (x509Certificate != null) {
                                                        arrayList.add(x509Certificate);
                                                    }
                                                } catch (Throwable th4) {
                                                    gu8.f(null, "CertManager: exception: " + gu8.b(th4));
                                                }
                                            }
                                        }
                                    } catch (Throwable th5) {
                                        gu8.f(null, "CertManager: exception: " + gu8.b(th5));
                                    }
                                    int size = arrayList.size();
                                    int i3 = 0;
                                    while (i3 < size) {
                                        int i4 = i3 + 1;
                                        X509Certificate x509Certificate2 = (X509Certificate) arrayList.get(i3);
                                        try {
                                            keyStore.setCertificateEntry(x509Certificate2.getIssuerDN().getName(), x509Certificate2);
                                        } catch (KeyStoreException e2) {
                                            gu8.f(null, "CertManager: exception: " + gu8.b(e2));
                                        }
                                        i3 = i4;
                                    }
                                    try {
                                        TrustManagerFactory trustManagerFactory2 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                                        trustManagerFactory2.init(keyStore);
                                        trustManagerFactory = trustManagerFactory2;
                                    } catch (Throwable th6) {
                                        gu8.f(null, "CertManager: exception: " + gu8.b(th6));
                                        trustManagerFactory = null;
                                    }
                                    if (trustManagerFactory == null) {
                                        gu8.f(null, "CertManager: Error make certData – trustManagerFactory is null");
                                    } else {
                                        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                                        int length = trustManagers.length;
                                        while (true) {
                                            if (i2 < length) {
                                                TrustManager trustManager = trustManagers[i2];
                                                if (trustManager instanceof X509TrustManager) {
                                                    x509TrustManager = (X509TrustManager) trustManager;
                                                } else {
                                                    i2++;
                                                }
                                            } else {
                                                x509TrustManager = null;
                                            }
                                        }
                                        if (x509TrustManager == null) {
                                            gu8.f(null, "CertManager: Error make certData – x509TrustManager is null");
                                        } else {
                                            try {
                                                sSLContext = f0z0.b();
                                                sSLContext.init(null, trustManagerFactory.getTrustManagers(), new SecureRandom());
                                            } catch (Throwable th7) {
                                                gu8.f(null, "CertManager: exception: " + gu8.b(th7));
                                                sSLContext = null;
                                            }
                                            if (sSLContext == null) {
                                                gu8.f(null, "CertManager: Error make certData – sslContext is null");
                                            } else {
                                                qyy0Var = new qyy0(x509TrustManager, sSLContext, trustManagerFactory);
                                                fqa.a = qyy0Var;
                                                if (qyy0Var == null) {
                                                    gu8.e(null, "DigitalGovCertsUtils: can't init digital gov certs – certData is null");
                                                }
                                                fqa.b = true;
                                            }
                                        }
                                    }
                                }
                            }
                            qyy0Var = null;
                            fqa.a = qyy0Var;
                            if (qyy0Var == null) {
                            }
                            fqa.b = true;
                        }
                        xez0.a(idy0Var);
                        gpy0 gpy0Var = gpy0.l;
                        AtomicBoolean atomicBoolean = xr50.a;
                        gpy0Var.getClass();
                        if (o8z0.b()) {
                            gu8.c(null, "FingerprintDataProvider: You must not call collectData method from main thread");
                        } else {
                            gpy0Var.a.g(context);
                            gpy0Var.b.h(context);
                            gpy0Var.d.g(context);
                            gpy0Var.f.g(context);
                        }
                        if (!gu8.b) {
                            try {
                                String str = (String) context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get("com.my.target.myTrackerSdkKey");
                                if (str != null) {
                                    MyTracker.initTracker(str, (Application) context.getApplicationContext());
                                } else {
                                    gu8.c(null, "MyTrackerUtils: myTracker SDK key is not provided");
                                }
                            } catch (Throwable th8) {
                                eb3.a(null, new StringBuilder("MyTrackerUtils: Unable to initialize myTracker - "), th8);
                            }
                            gu8.b = true;
                        }
                        ArrayList arrayList2 = o8z0.f;
                        synchronized (arrayList2) {
                            try {
                                Iterator it2 = arrayList2.iterator();
                                while (it2.hasNext()) {
                                    o8z0.c.execute((Runnable) it2.next());
                                }
                                o8z0.f.clear();
                                o8z0.j.set(true);
                            } finally {
                            }
                        }
                        zty0 zty0Var = gpy0.l.b.b;
                        if (zty0Var == null) {
                            fqa.a(StringUtils.UNDEFINED, StringUtils.UNDEFINED, StringUtils.UNDEFINED, StringUtils.UNDEFINED);
                            return;
                        } else {
                            fqa.a((String) zty0Var.b, (String) zty0Var.c, (String) zty0Var.d, (String) zty0Var.e);
                            return;
                        }
                    }
                    xcz0Var = null;
                    vfz0Var = null;
                    if (xcz0Var == null) {
                    }
                    taz0 taz0Var2 = xcz0Var;
                    if (vfz0Var == null) {
                    }
                    jfz0 jfz0Var2 = new jfz0(o8z0.e, taz0Var2, new u3z0(), qjz0Var, idy0Var);
                    ziz0.a = vfz0Var;
                    vfz0Var2 = ziz0.a;
                    if (vfz0Var2 != null) {
                    }
                    jfz0Var2.a.execute(new qp50(jfz0Var2, 3));
                    synchronized (h8z0.class) {
                    }
                }
                ycy0Var = null;
                if (ycy0Var == null) {
                }
                qjz0 qjz0Var2 = new qjz0(new CookieManager(ycy0Var, null));
                xr50.d = qjz0Var2;
                a = zgy0Var.a();
                if (a != null) {
                }
                xcz0Var = null;
                vfz0Var = null;
                if (xcz0Var == null) {
                }
                taz0 taz0Var22 = xcz0Var;
                if (vfz0Var == null) {
                }
                jfz0 jfz0Var22 = new jfz0(o8z0.e, taz0Var22, new u3z0(), qjz0Var2, idy0Var);
                ziz0.a = vfz0Var;
                vfz0Var2 = ziz0.a;
                if (vfz0Var2 != null) {
                }
                jfz0Var22.a.execute(new qp50(jfz0Var22, 3));
                synchronized (h8z0.class) {
                }
        }
    }
}
