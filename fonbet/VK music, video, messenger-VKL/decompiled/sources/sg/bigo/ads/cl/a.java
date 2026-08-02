package sg.bigo.ads.cl;

import android.content.ContentValues;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.Z3;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import sg.bigo.ads.ai.j;
import sg.bigo.ads.ai.k;
import sg.bigo.ads.ai.n;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdConfig;
import sg.bigo.ads.api.b;
import sg.bigo.ads.api.core.g;
import sg.bigo.ads.api.core.q;
import sg.bigo.ads.ci.i;
import sg.bigo.ads.cl.e;
import sg.bigo.ads.cm.a;
import sg.bigo.ads.common.utils.l;
import sg.bigo.ads.common.utils.r;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.d.b;
import xsna.odj;
import xsna.yup;

/* loaded from: classes9.dex */
public final class a implements sg.bigo.ads.ce.e<sg.bigo.ads.api.b, sg.bigo.ads.api.core.b, n>, a.InterfaceC2454a {

    @NonNull
    public final Context a;
    final sg.bigo.ads.ci.e b;
    final i c;
    final sg.bigo.ads.cf.b d;

    @NonNull
    public final d e;

    @NonNull
    final e f;

    @Nullable
    public f g;
    final LinkedList<C2453a<? extends sg.bigo.ads.api.b>> h;
    final SparseArray<C2453a<sg.bigo.ads.cn.i>> i;
    public long j;

    @NonNull
    final b m;
    private Context o;
    private final sg.bigo.ads.ce.b q;
    private final AtomicBoolean n = new AtomicBoolean(false);
    boolean k = true;
    private final AtomicBoolean p = new AtomicBoolean(false);
    final AtomicBoolean l = new AtomicBoolean(false);

    /* renamed from: sg.bigo.ads.cl.a$a, reason: collision with other inner class name */
    public static class C2453a<T> {

        @NonNull
        public final T a;

        @NonNull
        final sg.bigo.ads.ce.c b;
        public boolean c;
        public boolean d;
        public int e;
        public int f;
        public q g;

        private C2453a(@NonNull T t, @NonNull sg.bigo.ads.ce.c cVar) {
            this.e = 1;
            this.f = 0;
            this.a = t;
            this.b = cVar;
        }

        public /* synthetic */ C2453a(Object obj, sg.bigo.ads.ce.c cVar, byte b) {
            this(obj, cVar);
        }
    }

    public class b implements Runnable {
        private volatile int b = 0;
        private boolean c = true;

        public b() {
        }

        public final void a() {
            if (this.b == 0 || this.b == 2) {
                sg.bigo.ads.bh.d.a(3, this, 5000L);
                this.b = 1;
            }
        }

        public final void b() {
            if (this.b == 1 || this.b == 2) {
                if (this.b == 1) {
                    sg.bigo.ads.bh.d.a(this);
                }
                this.b = 3;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!sg.bigo.ads.at.b.e()) {
                b();
                return;
            }
            if (!this.c || a.this.k) {
                this.b = 4;
                a.this.f.a(new e.a() { // from class: sg.bigo.ads.cl.a.b.1
                    @Override // sg.bigo.ads.cl.e.a
                    public final void a(int i) {
                        a.a(a.this, 1, (Map) null);
                    }

                    @Override // sg.bigo.ads.cl.e.a
                    public final void a(int i, int i2, String str) {
                    }
                }, 0);
            } else {
                this.c = false;
                sg.bigo.ads.bn.a.a("PrefetchConfigTask", "The network is unavailable now. Task paused.");
                this.b = 2;
            }
        }

        public static /* synthetic */ void a(b bVar) {
            if (bVar.b == 2) {
                bVar.a();
            }
        }
    }

    public a(@NonNull Context context, @NonNull AdConfig adConfig) {
        sg.bigo.ads.ce.b bVar = new sg.bigo.ads.ce.b() { // from class: sg.bigo.ads.cl.a.1
            @Override // sg.bigo.ads.ce.e
            public final void a(int i, int i2, int i3, @NonNull String str, @Nullable Object obj) {
                StringBuilder a = odj.a(i, i2, "sdk config fetch error, seq=", ", code=", ", subCode=");
                a.append(i3);
                a.append(", message=");
                a.append(str);
                sg.bigo.ads.bn.a.a(0, "AdController", a.toString());
            }

            @Override // sg.bigo.ads.ce.b
            public final void a(int i, @NonNull String str) {
            }
        };
        this.q = bVar;
        this.a = context;
        sg.bigo.ads.ci.e eVar = new sg.bigo.ads.ci.e(context);
        this.b = eVar;
        k.a = eVar;
        i iVar = new i(context);
        this.c = iVar;
        d dVar = new d(context, adConfig, eVar);
        this.e = dVar;
        sg.bigo.ads.cf.b bVar2 = new sg.bigo.ads.cf.b(context, dVar, eVar);
        this.d = bVar2;
        bVar2.g = bVar;
        sg.bigo.ads.bp.e.a(bVar2.a.m);
        sg.bigo.ads.bo.g.c = dVar;
        sg.bigo.ads.bo.g.a = new sg.bigo.ads.bp.a(dVar);
        this.f = new e(context, eVar, iVar, dVar, bVar2);
        j jVar = k.a;
        if (jVar != null) {
            sg.bigo.ads.ai.b q = jVar.q();
            if (q instanceof sg.bigo.ads.ci.b) {
                ((sg.bigo.ads.ci.b) q).a = iVar;
            }
        }
        this.h = new LinkedList<>();
        this.i = new SparseArray<>();
        this.m = new b();
    }

    public final void a() {
        if (this.l.get() && this.p.get()) {
            sg.bigo.ads.da.b.a(this.e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0238  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        C2453a<? extends sg.bigo.ads.api.b> poll;
        int i;
        String str;
        int i2;
        sg.bigo.ads.cn.i bVar;
        a aVar;
        n nVar;
        b.a aVar2;
        boolean z;
        sg.bigo.ads.api.core.b a;
        j jVar;
        int i3;
        j jVar2;
        while (this.i.size() < this.b.E() && (poll = this.h.poll()) != null) {
            n a2 = this.c.a((sg.bigo.ads.api.b) poll.a);
            String str2 = ((sg.bigo.ads.api.b) poll.a).a;
            byte b2 = 0;
            if (a2 == null) {
                sg.bigo.ads.bn.a.a(0, "AdController", "scheduleRequest error, slot is empty, slot id=" + ((sg.bigo.ads.api.b) poll.a).d());
                i = yup.DATABASE_ERROR;
                str = "The slot id is inactive or invalid, please make sure the id is aligned with app id. If ids are correct, please wait for at least 30 minutes then try again";
                i2 = Z3.j;
            } else if (!a2.m()) {
                sg.bigo.ads.bn.a.a(0, "AdController", "schedule next request, slot is disable, slot id=" + ((sg.bigo.ads.api.b) poll.a).d());
                i = yup.INVALID_UID;
                str = "The switch of the slot is turned off. Please check slot setup.";
                i2 = 1015;
            } else if (((sg.bigo.ads.api.b) poll.a).a(a2.b())) {
                sg.bigo.ads.bn.a.a(0, "AdController", "schedule next request, this slot id is ad type " + a2.b() + ", request as type " + ((sg.bigo.ads.api.b) poll.a).c());
                i = yup.INTERNAL_ERROR;
                str = "The ad type of this slot isn't consistent with the method to querying an ad.";
                i2 = Z3.l;
            } else {
                boolean w = a2.w();
                if (!w && !TextUtils.isEmpty(str2)) {
                    sg.bigo.ads.bn.a.a(0, "AdController", "requsting an ordinary ad with server bidding payload.");
                }
                if (poll.c && (jVar2 = k.a) != null && jVar2.q().f(a2.l()) > 1) {
                    sg.bigo.ads.bn.a.a(0, "AdController", "schedule next request, slot is timeout, slot id=" + ((sg.bigo.ads.api.b) poll.a).d());
                    i3 = 10207;
                } else {
                    if (!poll.d || (jVar = k.a) == null || jVar.q().g(a2.l()) <= 1) {
                        if (sg.bigo.ads.api.core.a.d(a2.b())) {
                            sg.bigo.ads.bw.a.l(a2.l());
                            int a3 = a2.q().a("splash_impression_limit");
                            if (a3 <= 0) {
                                z = true;
                            } else {
                                z = sg.bigo.ads.bw.a.k(a2.l()) < a3;
                                if (!z) {
                                    sg.bigo.ads.bn.a.a("AdController", "The maximum number of ad impressions for the day (" + a3 + ") has been reached.");
                                }
                            }
                            if (!z) {
                                i = yup.CHANGES_TOKEN_OUTDATED;
                                str = "The impressions of the ad has reached the limit. You can change this setup on bigo's console";
                                i2 = 1017;
                            } else if (!w && (a = sg.bigo.ads.cj.a.a(a2, ((sg.bigo.ads.api.b) poll.a).g)) != null) {
                                if (a.K()) {
                                    sg.bigo.ads.cj.a.a(a2.l());
                                } else {
                                    g.a aVar3 = new g.a(a, a2, (sg.bigo.ads.api.b) poll.a, this.a, c());
                                    aVar3.a = this.e;
                                    poll.b.a(-1, poll.a, aVar3.a());
                                }
                            }
                        }
                        j jVar3 = k.a;
                        if (jVar3 != null && jVar3.t() && !this.k) {
                            a(poll, 1003, 3006, "no network connection");
                            return;
                        }
                        sg.bigo.ads.ci.e eVar = this.b;
                        d dVar = this.e;
                        sg.bigo.ads.cf.b bVar2 = this.d;
                        sg.bigo.ads.api.b bVar3 = (sg.bigo.ads.api.b) poll.a;
                        if (bVar3.f()) {
                            aVar = this;
                            bVar = new sg.bigo.ads.cn.j(eVar, dVar, bVar2, bVar3, a2, aVar);
                        } else {
                            if (a2.w()) {
                                bVar = new sg.bigo.ads.cn.c(eVar, dVar, bVar3, a2, this);
                                aVar = this;
                                nVar = a2;
                                aVar.i.put(bVar.a(), new C2453a<>(bVar, poll.b, b2));
                                aVar2 = ((sg.bigo.ads.api.b) poll.a).g;
                                if (aVar2.k == 0) {
                                    aVar2.k = System.currentTimeMillis();
                                }
                                poll.e = 2;
                                if (bVar instanceof sg.bigo.ads.cn.b) {
                                    poll.g = ((sg.bigo.ads.cn.b) bVar).h;
                                }
                                bVar.b();
                                Map<String, Object> a4 = sg.bigo.ads.cq.a.a("load", nVar, (sg.bigo.ads.api.b) poll.a, null, Integer.valueOf(nVar.v()));
                                a4.put("is_server_request", 1);
                                sg.bigo.ads.cq.b.a().a("load", a4);
                                return;
                            }
                            aVar = this;
                            bVar = new sg.bigo.ads.cn.b(eVar, dVar, bVar2, bVar3, a2, aVar);
                        }
                        nVar = a2;
                        aVar.i.put(bVar.a(), new C2453a<>(bVar, poll.b, b2));
                        aVar2 = ((sg.bigo.ads.api.b) poll.a).g;
                        if (aVar2.k == 0) {
                        }
                        poll.e = 2;
                        if (bVar instanceof sg.bigo.ads.cn.b) {
                        }
                        bVar.b();
                        Map<String, Object> a42 = sg.bigo.ads.cq.a.a("load", nVar, (sg.bigo.ads.api.b) poll.a, null, Integer.valueOf(nVar.v()));
                        a42.put("is_server_request", 1);
                        sg.bigo.ads.cq.b.a().a("load", a42);
                        return;
                    }
                    sg.bigo.ads.bn.a.a(0, "AdController", "schedule next request, slot is loaded with cache, slot id=" + ((sg.bigo.ads.api.b) poll.a).d());
                    i3 = 10208;
                }
                a(poll, 1011, i3, "no fill");
            }
            a(poll, i2, i, str);
        }
    }

    public final Context c() {
        Context createWindowContext;
        try {
            if (Build.VERSION.SDK_INT < 30) {
                return this.a;
            }
            Context context = this.o;
            if (context != null) {
                return context;
            }
            createWindowContext = this.a.createDisplayContext(((DisplayManager) this.a.getSystemService(DisplayManager.class)).getDisplay(0)).createWindowContext(1001, null);
            this.o = createWindowContext;
            return createWindowContext;
        } catch (Throwable unused) {
            return this.a;
        }
    }

    @Override // sg.bigo.ads.ce.e
    public final /* synthetic */ void a(final int i, final int i2, final int i3, @NonNull final String str, @Nullable n nVar) {
        final n nVar2 = nVar;
        sg.bigo.ads.bh.d.a(3, new Runnable() { // from class: sg.bigo.ads.cl.a.4
            @Override // java.lang.Runnable
            public final void run() {
                C2453a<sg.bigo.ads.cn.i> c2453a = a.this.i.get(i);
                if (c2453a != null) {
                    sg.bigo.ads.api.b k = c2453a.a.k();
                    a.this.i.remove(i);
                    int i4 = i2;
                    String str2 = str;
                    if (i4 == 1005) {
                        if (i3 == -6) {
                            i4 = 1004;
                            str2 = "The sdk integration and ad request are successful, but no ad wins at this time.";
                        } else {
                            str2 = "Error from server: " + str;
                        }
                    }
                    c2453a.b.a(i, i4, i3, str2, Pair.create(k, nVar2));
                }
                a.this.b();
            }
        });
    }

    @Override // sg.bigo.ads.ce.e
    public final /* synthetic */ void a(final int i, @NonNull sg.bigo.ads.api.b bVar, @NonNull sg.bigo.ads.api.core.b[] bVarArr) {
        final sg.bigo.ads.api.b bVar2 = bVar;
        final sg.bigo.ads.api.core.b[] bVarArr2 = bVarArr;
        sg.bigo.ads.bh.d.a(3, new Runnable() { // from class: sg.bigo.ads.cl.a.3
            @Override // java.lang.Runnable
            public final void run() {
                C2453a<sg.bigo.ads.cn.i> c2453a = a.this.i.get(i);
                if (c2453a != null) {
                    a.this.i.remove(i);
                    if (!l.a(bVarArr2)) {
                        sg.bigo.ads.api.core.g[] gVarArr = new sg.bigo.ads.api.core.g[bVarArr2.length];
                        int i2 = 0;
                        while (true) {
                            sg.bigo.ads.api.core.b[] bVarArr3 = bVarArr2;
                            if (i2 >= bVarArr3.length) {
                                break;
                            }
                            sg.bigo.ads.api.core.b bVar3 = bVarArr3[i2];
                            n l = c2453a.a.l();
                            sg.bigo.ads.api.b bVar4 = bVar2;
                            a aVar = a.this;
                            g.a aVar2 = new g.a(bVar3, l, bVar4, aVar.a, aVar.c());
                            aVar2.a = a.this.e;
                            gVarArr[i2] = aVar2.a();
                            if (sg.bigo.ads.api.core.a.d(bVar3.y())) {
                                u.a();
                                ContentValues contentValues = new ContentValues();
                                contentValues.put("slot", bVar3.b());
                                contentValues.put("log_id", Long.valueOf(bVar3.aa()));
                                long currentTimeMillis = System.currentTimeMillis();
                                contentValues.put("start_time", Long.valueOf(currentTimeMillis));
                                contentValues.put("end_time", Long.valueOf((bVar3.M() * 1000) + currentTimeMillis));
                                JSONObject ag = bVar3.ag();
                                contentValues.put("ad_data", ag == null ? "" : ag.toString());
                                contentValues.put("mtime", Long.valueOf(currentTimeMillis));
                                sg.bigo.ads.au.a.b("tb_addata", contentValues);
                            }
                            i2++;
                        }
                        c2453a.b.a(i, bVar2, gVarArr);
                    }
                }
                a.this.b();
            }
        });
    }

    public final void a(String str, String str2) {
        this.d.a(str, str2);
    }

    public final void a(@NonNull final C2453a<? extends sg.bigo.ads.api.b> c2453a, final int i, final int i2, final String str) {
        sg.bigo.ads.bh.d.a(2, new Runnable() { // from class: sg.bigo.ads.cl.a.2
            @Override // java.lang.Runnable
            public final void run() {
                c2453a.b.a(0, i, i2, str, new Pair(c2453a.a, null));
            }
        });
    }

    public static /* synthetic */ void a(a aVar, int i, Map map) {
        if (r.a((CharSequence) aVar.e.c.G()) || aVar.n.getAndSet(true)) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = sg.bigo.ads.bw.a.j();
        long elapsedRealtime = aVar.j == 0 ? -1L : SystemClock.elapsedRealtime() - aVar.j;
        if (currentTimeMillis - j >= 300000) {
            sg.bigo.ads.da.b.a(elapsedRealtime, i, sg.bigo.ads.bw.a.t(), sg.bigo.ads.bg.b.f(), (Map<String, String>) map);
            sg.bigo.ads.bw.a.c(currentTimeMillis);
            sg.bigo.ads.da.b.a();
            aVar.p.set(true);
            aVar.a();
        }
    }

    public static /* synthetic */ void a(a aVar, final C2453a c2453a) {
        if (aVar.b.I()) {
            sg.bigo.ads.bh.d.a(3, new Runnable() { // from class: sg.bigo.ads.cl.a.12
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    Ad a;
                    sg.bigo.ads.api.b bVar = (sg.bigo.ads.api.b) c2453a.a;
                    n a2 = a.this.c.a(bVar);
                    if ((a2 != null ? a2.w() : false) || bVar.h()) {
                        a.this.h.addFirst(c2453a);
                    } else {
                        if (a2 != null && (a = b.a.a.a(a2)) != null) {
                            sg.bigo.ads.ce.c cVar = c2453a.b;
                            if ((cVar instanceof sg.bigo.ads.ce.a) && (((sg.bigo.ads.ce.a) cVar).a instanceof sg.bigo.ads.ce.d)) {
                                sg.bigo.ads.ce.c cVar2 = ((sg.bigo.ads.ce.a) cVar).a;
                                if (cVar2 instanceof sg.bigo.ads.ce.d) {
                                    ((sg.bigo.ads.ce.d) cVar2).a(a2, a);
                                }
                            }
                        }
                        a.this.h.offer(c2453a);
                    }
                    a.this.b();
                }
            });
        } else {
            aVar.a(c2453a, 1005, yup.INVALID_PERMISSION_RATIONALE_DECLARATION, "The country where the ad request comes from is not supported, please change your country to RU or US and have a try. Besides, check your COPPA setup on bigo's console. The app will fail to send an ad request if it's targeted children under 13.");
        }
    }

    @Override // sg.bigo.ads.cm.a.InterfaceC2454a
    public final void a(boolean z) {
        this.k = z;
        if (z) {
            sg.bigo.ads.bz.b.a();
            b.a(this.m);
        }
    }
}
