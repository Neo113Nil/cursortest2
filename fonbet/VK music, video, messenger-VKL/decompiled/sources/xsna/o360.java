package xsna;

import android.util.Size;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$TypeNetworkImagesItem;
import io.reactivex.rxjava3.internal.util.ArrayListSupplier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import xsna.cru0;

/* compiled from: NetworkImageMetricsReporter.kt */
/* loaded from: classes3.dex */
public final class o360 {
    public static final bpn0 e = new bpn0(new com.vk.movika.sdk.base.logic.interactor.g(25));
    public volatile MobileOfficialAppsCoreNavStat$EventScreen a;
    public final d b = new d(1000);
    public final ph50<String, List<b>> c = new ph50<>(2);
    public final io.reactivex.rxjava3.subjects.f<String> d;

    /* compiled from: NetworkImageMetricsReporter.kt */
    public static final class a {
        public static o360 a() {
            return (o360) o360.e.getValue();
        }
    }

    /* compiled from: NetworkImageMetricsReporter.kt */
    public interface b {
        void a(long j);

        void b(qv10 qv10Var);

        void c(long j, Boolean bool);

        void d(long j, Boolean bool);
    }

    /* compiled from: NetworkImageMetricsReporter.kt */
    public static final class c {
        public final String a;
        public final long b;

        public c(String str, long j) {
            this.a = str;
            this.b = j;
        }
    }

    /* compiled from: NetworkImageMetricsReporter.kt */
    public static final class d extends m900<String, lkw> {
        @Override // xsna.m900
        public final lkw create(String str) {
            return new lkw();
        }
    }

    public o360() {
        io.reactivex.rxjava3.subjects.f<String> fVar = new io.reactivex.rxjava3.subjects.f<>();
        fVar.a0(io.reactivex.rxjava3.schedulers.a.a()).U(new nit(new m360(this, 0), 8)).d(8L, TimeUnit.SECONDS, io.reactivex.rxjava3.schedulers.a.a(), 1000, ArrayListSupplier.INSTANCE).subscribe(new j50(new eqq(this, 23), 29));
        this.d = fVar;
    }

    public static final o360 b() {
        return a.a();
    }

    public final void a(String str, com.vk.imageloader.stat.a aVar) {
        ph50<String, List<b>> ph50Var = this.c;
        List<b> d2 = ph50Var.d(str);
        if (d2 == null) {
            d2 = new ArrayList<>();
        }
        d2.add(aVar);
        ph50Var.p(str, d2);
    }

    public final void c(String str) {
        if (str.length() != 0) {
            synchronized (this.b) {
                this.b.remove(str);
            }
        }
        List<b> d2 = this.c.d(str);
        if (d2 != null) {
            Iterator<T> it = d2.iterator();
            while (it.hasNext()) {
                ((b) it.next()).getClass();
            }
        }
    }

    public final void d(String str, Size size, SchemeStat$TypeNetworkImagesItem.ImageFormat imageFormat) {
        k(str, new com.vk.movika.sdk.base.ui.s0(21, size, imageFormat));
    }

    public final void e(Boolean bool, String str) {
        k(str, new wh9(this, bool, str, 8));
    }

    public final void f(String str, boolean z) {
        k(str, new n360(this, z, str));
    }

    public final void g(qv10 qv10Var) {
        k(qv10Var.a, new g84(22, qv10Var, this));
    }

    public final void h(String str) {
        if (str != null) {
            this.d.onNext(str);
        }
    }

    public final void i(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            h((String) it.next());
        }
    }

    public final void j(String str, b bVar) {
        ph50<String, List<b>> ph50Var = this.c;
        List<b> d2 = ph50Var.d(str);
        if (d2 != null) {
            d2.remove(bVar);
        }
        List<b> list = d2;
        if (list == null || list.isEmpty()) {
            ph50Var.n(str);
        }
    }

    public final void k(String str, izs<? super lkw, s3q0> izsVar) {
        if (str == null || str.length() == 0) {
            return;
        }
        Object obj = cru0.j;
        if (cru0.a.c()) {
            synchronized (this.b) {
                try {
                    lkw lkwVar = this.b.get(str);
                    izsVar.invoke(lkwVar);
                    SchemeStat$TypeNetworkImagesItem a2 = lkwVar.a();
                    if (a2 != null) {
                        this.b.remove(str);
                    }
                    if (epx.f(lkwVar.i, Boolean.TRUE)) {
                        return;
                    }
                    s3q0 s3q0Var = s3q0.a;
                    if (a2 != null) {
                        kx6 kx6Var = new kx6();
                        kx6Var.f = a2;
                        kx6Var.q();
                        if (jfv0.e != null) {
                            String a3 = a2.a();
                            int g = a2.g();
                            int h = a2.h();
                            Integer valueOf = Integer.valueOf(a2.d());
                            Integer valueOf2 = Integer.valueOf(a2.f());
                            int l = a2.l();
                            int k = a2.k();
                            SchemeStat$TypeNetworkImagesItem.Status m = a2.m();
                            String name = m != null ? m.name() : null;
                            Integer i = a2.i();
                            SchemeStat$TypeNetworkImagesItem.ImageFormat e2 = a2.e();
                            String name2 = e2 != null ? e2.name() : null;
                            SchemeStat$TypeNetworkImagesItem.Protocol j = a2.j();
                            jfv0.a(new mdk0(new qnf0(a3, g, h, valueOf, valueOf2, l, k, name, i, name2, j != null ? j.toString() : null, a2.b(), a2.c()), 23));
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
