package xsna;

import android.content.Context;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.vk.log.L;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.EmptyList;
import xsna.uyg0;

/* compiled from: SSLKeyStore.kt */
/* loaded from: classes11.dex */
public class uyg0 {
    public final boolean a;
    public final List<Certificate> b;
    public final CopyOnWriteArrayList<b> c;
    public final CopyOnWriteArrayList<Certificate> d;
    public final AtomicReference<KeyStore> e;
    public final Future<?> f;
    public volatile a g;
    public final BigInteger h;

    /* compiled from: SSLKeyStore.kt */
    public static abstract class a {

        /* compiled from: SSLKeyStore.kt */
        /* renamed from: xsna.uyg0$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C3854a extends a {
            public final Throwable a;

            public C3854a(Throwable th) {
                this.a = th;
            }

            public final Throwable a() {
                return this.a;
            }
        }

        /* compiled from: SSLKeyStore.kt */
        public static final class b extends a {
            public static final b a = new b();
        }

        /* compiled from: SSLKeyStore.kt */
        public static final class c extends a {
            public static final c a = new c();
        }
    }

    /* compiled from: SSLKeyStore.kt */
    public interface b {
        void a();

        void b(Throwable th);
    }

    public uyg0() {
        throw null;
    }

    public uyg0(final Context context, boolean z) {
        EmptyList emptyList = EmptyList.b;
        this.a = z;
        this.b = emptyList;
        this.c = new CopyOnWriteArrayList<>();
        this.d = new CopyOnWriteArrayList<>();
        this.e = new AtomicReference<>();
        this.g = a.c.a;
        this.h = new BigInteger("551222861474729630828211419619667128155611726319");
        final BufferedInputStream bufferedInputStream = new BufferedInputStream(context.getResources().openRawResource(R.raw.vk_cacerts), SQLiteDatabase.OPEN_PRIVATECACHE);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 100L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new syg0());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f = threadPoolExecutor.submit(new Runnable() { // from class: xsna.tyg0
            @Override // java.lang.Runnable
            public final void run() {
                Object failure;
                uyg0 uyg0Var = uyg0.this;
                BufferedInputStream bufferedInputStream2 = bufferedInputStream;
                Context applicationContext = context.getApplicationContext();
                try {
                    KeyStore keyStore = KeyStore.getInstance("BKS");
                    uyg0Var.b(bufferedInputStream2, keyStore);
                    uyg0Var.c(applicationContext, keyStore);
                    uyg0Var.d.addAll(uyg0Var.b);
                    synchronized (uyg0Var.g) {
                        uyg0Var.g = uyg0.a.b.a;
                        s3q0 s3q0Var = s3q0.a;
                    }
                    Iterator<uyg0.b> it = uyg0Var.c.iterator();
                    while (it.hasNext()) {
                        it.next().a();
                    }
                    failure = s3q0.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a2 = Result.a(failure);
                if (a2 != null) {
                    L.j(a2, "uyg0", "Can't load SSL certificates");
                    synchronized (uyg0Var.g) {
                        uyg0Var.g = new uyg0.a.C3854a(a2);
                        s3q0 s3q0Var2 = s3q0.a;
                    }
                    Iterator<uyg0.b> it2 = uyg0Var.c.iterator();
                    while (it2.hasNext()) {
                        it2.next().b(a2);
                    }
                }
            }
        });
    }

    public final void a(b bVar) {
        synchronized (this.g) {
            try {
                a aVar = this.g;
                if (aVar instanceof a.c) {
                    this.c.add(bVar);
                } else if (aVar instanceof a.b) {
                    bVar.a();
                    s3q0 s3q0Var = s3q0.a;
                } else {
                    if (!(aVar instanceof a.C3854a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar.b(((a.C3854a) aVar).a());
                    s3q0 s3q0Var2 = s3q0.a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0036, code lost:
    
        r9.d.addAll(xsna.rli0.A(xsna.rli0.j(new xsna.ulp0(xsna.dli0.c(new xsna.d5g(r11.aliases())), new xsna.vlg0(r11, 1)), new xsna.vyg0(1, r9, xsna.uyg0.class, "filterVkRuCertificate", "filterVkRuCertificate(Ljava/security/cert/Certificate;)Z", 0))));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(BufferedInputStream bufferedInputStream, KeyStore keyStore) {
        try {
            keyStore.load(bufferedInputStream, "vkcerts".toCharArray());
            AtomicReference<KeyStore> atomicReference = this.e;
            while (true) {
                if (atomicReference.compareAndSet(null, keyStore)) {
                    break;
                }
                try {
                    if (atomicReference.get() != null) {
                        break;
                    }
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        ro.e(bufferedInputStream, th2);
                        throw th3;
                    }
                }
            }
            s3q0 s3q0Var = s3q0.a;
            bufferedInputStream.close();
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final void c(Context context, KeyStore keyStore) {
        Object failure;
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
            for (Map.Entry entry : pn00.k(new Pair(Integer.valueOf(R.raw.russian_trusted_root_ca), "inapp_russian_trusted_root_ca"), new Pair(Integer.valueOf(R.raw.russian_trusted_sub_ca), "inapp_russian_trusted_sub_ca"), new Pair(Integer.valueOf(R.raw.russian_trusted_sub_ca_2024), "inapp_russian_trusted_sub_ca_2024"), new Pair(Integer.valueOf(R.raw.vk_self_signed), "inapp_vk_self_signed")).entrySet()) {
                int intValue = ((Number) entry.getKey()).intValue();
                String str = (String) entry.getValue();
                Object obj = null;
                try {
                    InputStream openRawResource = context.getResources().openRawResource(intValue);
                    try {
                        failure = certificateFactory.generateCertificate(openRawResource);
                        ro.e(openRawResource, null);
                    } finally {
                    }
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                if (!(failure instanceof Result.Failure)) {
                    obj = failure;
                }
                Certificate certificate = (Certificate) obj;
                if (certificate != null) {
                    keyStore.setCertificateEntry(str, certificate);
                    this.d.add(certificate);
                }
            }
            s3q0 s3q0Var = s3q0.a;
        } catch (Throwable unused) {
        }
    }
}
