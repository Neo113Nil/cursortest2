package sg.bigo.ads.cf;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.cf.e;
import sg.bigo.ads.cn.l;
import sg.bigo.ads.common.utils.m;
import sg.bigo.ads.common.utils.r;
import xsna.odj;

/* loaded from: classes9.dex */
public final class b {
    public final sg.bigo.ads.cf.a a;
    public final sg.bigo.ads.an.g b;

    @Nullable
    public sg.bigo.ads.ce.b g;
    private final sg.bigo.ads.ai.j h;
    private final Context i;
    final AtomicBoolean c = new AtomicBoolean(false);
    final AtomicBoolean d = new AtomicBoolean(false);
    final AtomicBoolean e = new AtomicBoolean(false);
    final AtomicBoolean f = new AtomicBoolean(false);
    private final f k = new f() { // from class: sg.bigo.ads.cf.b.1
        @Override // sg.bigo.ads.cf.f
        public final void a() {
            b.this.a.a(0L);
        }

        @Override // sg.bigo.ads.cf.f
        public final void a(String str, boolean z) {
            if (!z) {
                b.a(b.this, (l.a) null);
            }
            b.a(b.this, str, true);
        }
    };
    private final Runnable l = new Runnable() { // from class: sg.bigo.ads.cf.b.2
        @Override // java.lang.Runnable
        public final void run() {
            if (b.a(b.this, new l.a() { // from class: sg.bigo.ads.cf.b.2.1
                @Override // sg.bigo.ads.cn.l.a
                public final void a(String str, int i, int i2, int i3, @NonNull String str2, @Nullable Map<String, Object> map) {
                    b bVar = b.this;
                    b.a(bVar, bVar.b.v(), false);
                }

                @Override // sg.bigo.ads.cn.l.a
                public final void a(String str, int i, String str2, @Nullable Map<String, Object> map) {
                }
            })) {
                return;
            }
            b bVar = b.this;
            b.a(bVar, bVar.b.v(), false);
        }
    };
    private final Map<String, String> j = new ConcurrentHashMap();

    public static class a {
        public final j a;
        public final String b;
        public final long c;

        private a(j jVar, String str, long j) {
            this.a = jVar;
            this.b = str;
            this.c = j;
        }

        public /* synthetic */ a(j jVar, String str, long j, byte b) {
            this(jVar, str, j);
        }
    }

    public b(@NonNull Context context, @NonNull sg.bigo.ads.an.g gVar, @NonNull sg.bigo.ads.ai.j jVar) {
        this.i = context;
        this.a = new sg.bigo.ads.cf.a(context, jVar);
        this.b = gVar;
        this.h = jVar;
    }

    @NonNull
    public final g a(String str, String str2, long j, boolean z) {
        g a2 = this.a.a(str, str2, this.j, this.b.v(), this.h.s());
        long elapsedRealtime = j <= 0 ? 0L : SystemClock.elapsedRealtime() - j;
        if (a2.b) {
            this.a.a(0L);
            a2.toString();
            if (z) {
                sg.bigo.ads.da.b.a(elapsedRealtime, a2.c, str2, true);
            }
        } else {
            long j2 = elapsedRealtime;
            int i = a2.d;
            if (i == 0) {
                if (z) {
                    sg.bigo.ads.da.b.a(j2, a2.c, str2, false);
                }
            } else if (z) {
                sg.bigo.ads.da.b.a(j2, a2.c, str2, i, a2.e);
            }
        }
        a2.toString();
        return a2;
    }

    public final e b(@NonNull String str, String str2) {
        e.a aVar = new e.a(this.a, this.b, this.h, str, str2);
        aVar.a(this.k);
        return aVar;
    }

    public final void a(long j, String str) {
        sg.bigo.ads.bh.d.a(this.l);
        sg.bigo.ads.bh.d.a(1, this.l, Math.max(j, 0L));
    }

    public final void a(String str, String str2) {
        if (sg.bigo.ads.common.utils.c.a(str2)) {
            if (r.a((CharSequence) str)) {
                str = "all";
            }
            this.j.put(str, str2);
            if (this.a.a(str, str2)) {
                this.a.a(10L);
            }
        }
    }

    public final void a(@NonNull final String str, @NonNull final sg.bigo.ads.cg.g gVar, @Nullable final ValueCallback<a> valueCallback, @Nullable final ValueCallback<String> valueCallback2) {
        final j a2 = gVar.a(str);
        Objects.toString(a2);
        this.a.a(0L);
        if (a2 == null) {
            if (valueCallback2 != null) {
                valueCallback2.onReceiveValue("not available url.");
            }
        } else {
            sg.bigo.ads.bs.a aVar = new sg.bigo.ads.bs.a(new sg.bigo.ads.bs.d(a2.a), this.i);
            aVar.l = sg.bigo.ads.bp.e.b();
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            sg.bigo.ads.bo.g.a(aVar, new sg.bigo.ads.bo.b<sg.bigo.ads.bs.a, sg.bigo.ads.bt.d>() { // from class: sg.bigo.ads.cf.b.9
                @Override // sg.bigo.ads.bo.b
                public final /* synthetic */ sg.bigo.ads.bt.d a(@NonNull sg.bigo.ads.bt.a aVar2) {
                    return new sg.bigo.ads.bt.d(aVar2);
                }

                @Override // sg.bigo.ads.bo.b
                public final /* synthetic */ void a(@NonNull sg.bigo.ads.bs.a aVar2, @NonNull sg.bigo.ads.bo.h hVar) {
                    String str2 = a2.a;
                    sg.bigo.ads.da.b.a(elapsedRealtime > 0 ? SystemClock.elapsedRealtime() - elapsedRealtime : 0L, false, a2.a, 4000, "NetError:" + hVar.a + ", " + hVar.getMessage());
                    b.this.a(str, gVar, valueCallback, valueCallback2);
                }

                @Override // sg.bigo.ads.bo.b
                public final /* synthetic */ void a(@NonNull sg.bigo.ads.bs.a aVar2, @NonNull sg.bigo.ads.bt.d dVar) {
                    String str2 = a2.a;
                    String a3 = dVar.a();
                    if (valueCallback != null) {
                        valueCallback.onReceiveValue(new a(a2, a3, elapsedRealtime, (byte) 0));
                    }
                }
            });
        }
    }

    public final boolean a(String str, final ValueCallback<a> valueCallback, ValueCallback<String> valueCallback2) {
        final sg.bigo.ads.cg.e eVar = this.a.k;
        eVar.a();
        if (!eVar.a()) {
            this.f.set(false);
            return false;
        }
        eVar.b();
        a(str, eVar, new ValueCallback<a>() { // from class: sg.bigo.ads.cf.b.8
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(a aVar) {
                eVar.a(true);
                b.this.a.a(0L);
                valueCallback.onReceiveValue(aVar);
            }
        }, valueCallback2);
        return true;
    }

    public static /* synthetic */ boolean a(b bVar, final String str, boolean z) {
        bVar.e.compareAndSet(false, z);
        if (!bVar.d.compareAndSet(false, true)) {
            return false;
        }
        sg.bigo.ads.cg.f fVar = bVar.a.j;
        fVar.a();
        final ValueCallback<a> valueCallback = new ValueCallback<a>() { // from class: sg.bigo.ads.cf.b.5
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(a aVar) {
                j jVar;
                a aVar2 = aVar;
                b.this.d.set(false);
                b.this.e.set(false);
                b.this.f.set(false);
                if (aVar2 == null || (jVar = aVar2.a) == null) {
                    return;
                }
                b.this.a(aVar2.b, jVar.a, aVar2.c, true);
            }
        };
        final ValueCallback<String> valueCallback2 = new ValueCallback<String>() { // from class: sg.bigo.ads.cf.b.6
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(String str2) {
                b.this.e.set(false);
                b.this.f.set(false);
            }
        };
        if (fVar.a()) {
            fVar.b();
            bVar.a(str, fVar, valueCallback, new ValueCallback<String>() { // from class: sg.bigo.ads.cf.b.7
                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(String str2) {
                    b.this.d.set(false);
                    if (b.this.e.compareAndSet(true, false) && b.this.f.compareAndSet(false, true)) {
                        b.this.a(str, valueCallback, valueCallback2);
                    }
                }
            });
            return true;
        }
        if (bVar.e.compareAndSet(true, false) && bVar.f.compareAndSet(false, true)) {
            bVar.a(str, valueCallback, valueCallback2);
        }
        bVar.d.set(false);
        return false;
    }

    public static /* synthetic */ boolean a(b bVar, final l.a aVar) {
        final sg.bigo.ads.cg.c cVar = bVar.a.g;
        cVar.b();
        if (!bVar.c.compareAndSet(false, true)) {
            return false;
        }
        if (!cVar.b()) {
            bVar.c.set(false);
            return false;
        }
        cVar.g = System.currentTimeMillis();
        bVar.a.a(0L);
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        new l(bVar.b, bVar, new l.a() { // from class: sg.bigo.ads.cf.b.4
            @Override // sg.bigo.ads.cn.l.a
            public final void a(String str, int i, int i2, int i3, @NonNull String str2, @Nullable Map<String, Object> map) {
                int i4;
                int i5;
                String str3;
                b.this.c.set(false);
                if (TextUtils.isEmpty(m.a(map, "host_cfg"))) {
                    long elapsedRealtime2 = elapsedRealtime > 0 ? SystemClock.elapsedRealtime() - elapsedRealtime : 0L;
                    i4 = i2;
                    i5 = i3;
                    StringBuilder a2 = odj.a(i4, i5, "code=", ",subCode=", ",message=");
                    str3 = str2;
                    a2.append(str3);
                    sg.bigo.ads.da.b.a(elapsedRealtime2, false, str, 4001, a2.toString());
                } else {
                    i4 = i2;
                    i5 = i3;
                    str3 = str2;
                }
                l.a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.a(str, i, i4, i5, str3, map);
                }
                sg.bigo.ads.ce.b bVar2 = b.this.g;
                if (bVar2 != null) {
                    bVar2.a(i, i2, i3, str2, map);
                }
            }

            @Override // sg.bigo.ads.cn.l.a
            public final void a(String str, int i, String str2, @Nullable Map<String, Object> map) {
                String str3;
                b.this.c.set(false);
                cVar.h = System.currentTimeMillis();
                b.this.a.a(0L);
                if (TextUtils.isEmpty(m.a(map, "host_cfg"))) {
                    str3 = str;
                    sg.bigo.ads.da.b.a(elapsedRealtime > 0 ? SystemClock.elapsedRealtime() - elapsedRealtime : 0L, false, str3, 4002, "host_cfg is empty.");
                } else {
                    str3 = str;
                }
                l.a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.a(str3, i, str2, map);
                }
                sg.bigo.ads.ce.b bVar2 = b.this.g;
                if (bVar2 != null) {
                    bVar2.a(i, str2);
                }
            }
        }).b();
        return true;
    }
}
