package sg.bigo.ads.ch;

import android.text.TextUtils;
import android.util.Pair;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import ru.ok.android.externcalls.sdk.rate.connection.CandidateTypeHintConfig;
import sg.bigo.ads.ai.k;
import sg.bigo.ads.an.g;
import sg.bigo.ads.ci.i;
import xsna.hq;

/* loaded from: classes9.dex */
public abstract class c {
    protected final sg.bigo.ads.cf.b b;
    protected final g c;
    protected final sg.bigo.ads.ci.e d;
    protected final i e;
    protected sg.bigo.ads.bh.e f = null;
    protected AtomicInteger g = new AtomicInteger(0);
    protected AtomicBoolean h = new AtomicBoolean(false);
    private long a = 0;
    private final Runnable i = new Runnable() { // from class: sg.bigo.ads.ch.c.1
        @Override // java.lang.Runnable
        public final void run() {
            c cVar = c.this;
            if (cVar.b != null) {
                if (cVar.f == null) {
                    cVar.f = cVar.a();
                }
                sg.bigo.ads.bh.e eVar = c.this.f;
                if (eVar == null || eVar.a.get() != 0) {
                    c.this.d();
                    return;
                }
                Pair<String, Integer> a = c.a(c.this);
                if (a == null || TextUtils.isEmpty((CharSequence) a.first)) {
                    return;
                }
                c.this.a(a);
                c.this.b.a.a(0L);
                if (1 == ((Integer) a.second).intValue() % k.a.y()) {
                    c.this.a((String) a.first, ((Integer) a.second).intValue(), "0");
                }
            }
        }
    };

    public c(sg.bigo.ads.cf.b bVar, g gVar, sg.bigo.ads.ci.e eVar, i iVar) {
        this.b = bVar;
        this.c = gVar;
        this.d = eVar;
        this.e = iVar;
    }

    public static /* synthetic */ Pair a(c cVar) {
        sg.bigo.ads.cf.b bVar = cVar.b;
        if (bVar == null || bVar.a == null) {
            return null;
        }
        return cVar.b().a(k.a);
    }

    public abstract sg.bigo.ads.bh.e a();

    public abstract void a(Pair<String, Integer> pair);

    public abstract sg.bigo.ads.cg.b b();

    public final void c() {
        long currentTimeMillis = System.currentTimeMillis();
        int round = Math.round((k.a.z() / 2.0f) * 60000.0f);
        long abs = Math.abs(currentTimeMillis - this.a);
        if (this.a == 0 || abs > round) {
            this.a = currentTimeMillis;
            this.g.set(0);
            d();
        }
    }

    public final void d() {
        if (this.g.getAndAdd(1) >= 3 || this.h.get()) {
            return;
        }
        sg.bigo.ads.bh.d.a(this.i);
        sg.bigo.ads.bh.d.a(1, this.i, 5000L);
    }

    public final void a(Pair<String, Integer> pair, boolean z) {
        if (this.b == null || this.c == null || this.d == null || pair == null) {
            return;
        }
        boolean a = b().a((String) pair.first, this.c.v(), this.d.s(), k.a, z);
        this.b.a.a(0L);
        if (a) {
            a((String) pair.first, ((Integer) pair.second).intValue(), "1");
        }
    }

    public final void a(String str, int i, String str2) {
        HashMap a = hq.a("type", this instanceof b ? "1" : this instanceof a ? "2" : "0", CandidateTypeHintConfig.TYPE_HOST, str);
        a.put("retry_times", String.valueOf(k.a.y()));
        a.put("retry_interval", String.valueOf(k.a.z()));
        a.put("next_retry_interval", String.valueOf(k.a.A()));
        a.put("cur_retry_time", String.valueOf(i));
        a.put("uuid", this.c.X());
        a.put("action", str2);
        sg.bigo.ads.da.b.d(a);
    }

    public static boolean a(int i) {
        return i == 702 || i == 701 || i == 700;
    }
}
