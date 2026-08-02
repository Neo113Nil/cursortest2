package sg.bigo.ads.cl;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.api.core.ApiInvocationException;
import sg.bigo.ads.BigoAdSdk;
import sg.bigo.ads.ai.k;
import sg.bigo.ads.ch.d;
import sg.bigo.ads.ci.i;
import sg.bigo.ads.common.utils.r;

/* loaded from: classes9.dex */
public final class e extends sg.bigo.ads.ce.b {
    final sg.bigo.ads.an.g a;
    final sg.bigo.ads.ci.e b;
    final i c;
    int g;
    final Context h;
    private final sg.bigo.ads.cf.b i;
    private int l;
    long d = -1;
    boolean e = false;
    private final List<b> j = new ArrayList();
    private final AtomicReference<sg.bigo.ads.cn.h> k = new AtomicReference<>();
    final AtomicInteger f = new AtomicInteger(0);

    public interface a {
        void a(int i);

        void a(int i, int i2, String str);
    }

    public static class b implements a {
        private final String a;
        private final a b;
        private final sg.bigo.ads.an.g c;
        private final sg.bigo.ads.ci.e d;
        private final i e;
        private final sg.bigo.ads.cf.b f;
        private final e g;

        public b(String str, a aVar, @NonNull sg.bigo.ads.ci.e eVar, @NonNull i iVar, @NonNull sg.bigo.ads.an.g gVar, @NonNull sg.bigo.ads.cf.b bVar, @NonNull e eVar2) {
            this.a = str;
            this.b = aVar;
            this.c = gVar;
            this.d = eVar;
            this.e = iVar;
            this.f = bVar;
            this.g = eVar2;
            c.a().b.compareAndSet(-1, 0);
        }

        @Override // sg.bigo.ads.cl.e.a
        public final void a(int i) {
            sg.bigo.ads.ch.d dVar;
            c.a().b();
            a aVar = this.b;
            if (aVar != null) {
                aVar.a(i);
            }
            if (k.a.x()) {
                dVar = d.a.a;
                dVar.a(this.f, this.c, this.d, this.e, this.g);
            }
        }

        @Override // sg.bigo.ads.cl.e.a
        public final void a(int i, int i2, String str) {
            c a = c.a();
            String str2 = this.a;
            if (1101 == i2 || 1105 == i2) {
                Map map = a.a;
                if (map == null) {
                    map = new ConcurrentHashMap();
                    a.a = map;
                }
                if (str2 != null && c.a(map, str2)) {
                    map.put(str2, Long.valueOf(SystemClock.elapsedRealtime()));
                }
                if (a.b.compareAndSet(0, -1)) {
                    sg.bigo.ads.bn.a.a(0, "ConfigInitProcessor", "Failed to init config and set status.");
                }
            }
            a aVar = this.b;
            if (aVar != null) {
                aVar.a(i, i2, str);
            }
        }
    }

    public e(@NonNull Context context, @NonNull sg.bigo.ads.ci.e eVar, @NonNull i iVar, @NonNull sg.bigo.ads.an.g gVar, @NonNull sg.bigo.ads.cf.b bVar) {
        this.h = context;
        this.a = gVar;
        this.b = eVar;
        this.c = iVar;
        this.i = bVar;
    }

    public final void a() {
        sg.bigo.ads.a a2 = BigoAdSdk.a(this.h);
        a2.b = this.a.a();
        a2.c(this.h);
    }

    public final void b(int i, String str) {
        this.k.set(null);
        if (this.j.isEmpty()) {
            return;
        }
        this.j.remove(0).a(this.l, i, str);
        if (this.j.isEmpty()) {
            return;
        }
        a(this.g, this.l);
    }

    private void a(int i, int i2) {
        if (this.k.get() != null) {
            return;
        }
        this.k.set(new sg.bigo.ads.cn.h(this.a, this.i, this.c, sg.bigo.ads.ci.f.F(), this));
        this.g = i;
        this.d = SystemClock.elapsedRealtime();
        this.e = sg.bigo.ads.at.b.d();
        this.f.incrementAndGet();
        this.l = i2;
        String a2 = this.a.a();
        if (r.a((CharSequence) a2)) {
            b(1100, "App id cannot be empty, please pass the id when initializing bigo sdk");
        } else if (c.a().a(a2)) {
            this.k.get().b();
        } else {
            b(1101, "The slot id is invalid, please make sure the id is aligned with app id.");
        }
    }

    @Override // sg.bigo.ads.ce.e
    public final void a(final int i, final int i2, final int i3, @NonNull final String str, @Nullable Object obj) {
        sg.bigo.ads.bh.d.a(3, new Runnable() { // from class: sg.bigo.ads.cl.e.2
            @Override // java.lang.Runnable
            public final void run() {
                e eVar;
                int i4;
                sg.bigo.ads.bn.a.a(0, "GlobalConfig", "request error, seq=" + i + ", error=" + i2 + ", message=" + str);
                StringBuilder sb = new StringBuilder("Error from server: ");
                sb.append(str);
                String sb2 = sb.toString();
                if (i3 == -9) {
                    eVar = e.this;
                    i4 = 1105;
                } else {
                    eVar = e.this;
                    i4 = 1104;
                }
                eVar.b(i4, sb2);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                e eVar2 = e.this;
                long j = elapsedRealtime - eVar2.d;
                int i5 = i2;
                int i6 = i3;
                String str2 = str;
                int i7 = eVar2.g;
                boolean z = eVar2.e;
                int i8 = eVar2.f.get();
                sg.bigo.ads.an.g gVar = e.this.a;
                sg.bigo.ads.da.b.a(j, i5, i6, str2, i7, z, i8, gVar == null ? null : gVar.X());
            }
        });
    }

    @Override // sg.bigo.ads.ce.b
    public final void a(int i, @NonNull String str) {
        a(i, str, false);
    }

    public final void a(final int i, @NonNull final String str, final boolean z) {
        sg.bigo.ads.bh.d.a(3, new Runnable() { // from class: sg.bigo.ads.cl.e.1
            /* JADX WARN: Removed duplicated region for block: B:13:0x0099 A[Catch: JSONException -> 0x0169, TryCatch #0 {JSONException -> 0x0169, blocks: (B:6:0x000b, B:8:0x0038, B:13:0x0099, B:15:0x009d, B:16:0x00a2, B:23:0x00db, B:25:0x0102, B:26:0x0112, B:29:0x0130, B:31:0x012b, B:33:0x0136, B:35:0x013c, B:36:0x0143, B:39:0x0161, B:41:0x015c, B:42:0x0040, B:48:0x005b, B:49:0x0066, B:52:0x0081, B:54:0x008a, B:57:0x0091, B:59:0x0075, B:60:0x0062), top: B:5:0x000b }] */
            /* JADX WARN: Removed duplicated region for block: B:19:0x00d5  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                String str2;
                Pair pair;
                int i2;
                e eVar = e.this;
                int i3 = eVar.g;
                if (z) {
                    i3 = 2;
                }
                int i4 = i3;
                try {
                    boolean O = eVar.b.O();
                    JSONObject jSONObject = new JSONObject(str);
                    JSONObject optJSONObject = jSONObject.optJSONObject("global");
                    String optString = jSONObject.optString("global_md5");
                    JSONArray optJSONArray = jSONObject.optJSONArray("slots");
                    String optString2 = jSONObject.optString("slots_md5");
                    e eVar2 = e.this;
                    if (!r.a((CharSequence) optString) || !r.a((CharSequence) optString2)) {
                        boolean equals = TextUtils.equals(optString, eVar2.b.P);
                        boolean equals2 = TextUtils.equals(optString2, eVar2.c.a);
                        if (equals || equals2) {
                            String str3 = "";
                            if (optJSONObject != null) {
                                if (equals) {
                                    eVar2.b.e(optJSONObject);
                                    str2 = optString;
                                } else {
                                    eVar2.a(optJSONObject, optString);
                                    str2 = "";
                                }
                                eVar2.b.c(eVar2.h);
                            } else {
                                str2 = "";
                            }
                            if (equals2) {
                                str3 = optString2;
                            } else if (optJSONArray != null) {
                                eVar2.c.a(optJSONArray, optString2);
                                eVar2.c.c(eVar2.h);
                            }
                            eVar2.a();
                            if (!r.a((CharSequence) str2) || !r.a((CharSequence) str3)) {
                                pair = new Pair(str2, str3);
                                if (pair == null) {
                                    if (!z) {
                                        e.a(e.this);
                                    }
                                    long i5 = e.this.b.i();
                                    long elapsedRealtime = SystemClock.elapsedRealtime();
                                    e eVar3 = e.this;
                                    sg.bigo.ads.da.b.a(i5, elapsedRealtime - eVar3.d, O, i4, eVar3.e, eVar3.f.getAndSet(0), e.this.a.X(), (String) pair.first, (String) pair.second);
                                    return;
                                }
                                if (optJSONObject != null && optJSONArray != null) {
                                    e.this.a(optJSONObject, optString);
                                    e eVar4 = e.this;
                                    eVar4.b.c(eVar4.h);
                                    e.this.c.a(optJSONArray, optString2);
                                    e eVar5 = e.this;
                                    eVar5.c.c(eVar5.h);
                                    e.this.a();
                                    if (z) {
                                        i2 = 0;
                                    } else {
                                        e.a(e.this);
                                        i2 = e.this.f.getAndSet(0);
                                    }
                                    long i6 = e.this.b.i();
                                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                                    e eVar6 = e.this;
                                    long j = elapsedRealtime2 - eVar6.d;
                                    boolean z2 = eVar6.e;
                                    sg.bigo.ads.an.g gVar = eVar6.a;
                                    sg.bigo.ads.da.b.a(i6, j, O, i4, z2, i2, gVar == null ? null : gVar.X(), (String) null, (String) null);
                                    return;
                                }
                                if (!z) {
                                    e.this.b(1102, "Missing `global` or `slots` params.");
                                }
                                long elapsedRealtime3 = SystemClock.elapsedRealtime();
                                e eVar7 = e.this;
                                long j2 = elapsedRealtime3 - eVar7.d;
                                boolean z3 = eVar7.e;
                                int i7 = eVar7.f.get();
                                sg.bigo.ads.an.g gVar2 = e.this.a;
                                sg.bigo.ads.da.b.a(j2, 1102, 10002, "Missing `global` or `slots` params.", i4, z3, i7, gVar2 == null ? null : gVar2.X());
                                return;
                            }
                        }
                    }
                    pair = null;
                    if (pair == null) {
                    }
                } catch (JSONException unused) {
                    if (!z) {
                        e.this.b(ApiInvocationException.ErrorCodes.FRIENDSHIP_REQUIRED, "Failed to parse global config.");
                    }
                    long elapsedRealtime4 = SystemClock.elapsedRealtime();
                    e eVar8 = e.this;
                    long j3 = elapsedRealtime4 - eVar8.d;
                    boolean z4 = eVar8.e;
                    int i8 = eVar8.f.get();
                    sg.bigo.ads.an.g gVar3 = e.this.a;
                    sg.bigo.ads.da.b.a(j3, ApiInvocationException.ErrorCodes.FRIENDSHIP_REQUIRED, 10002, "Failed to parse global config.", i4, z4, i8, gVar3 != null ? gVar3.X() : null);
                }
            }
        });
    }

    public final void a(JSONObject jSONObject, String str) {
        sg.bigo.ads.cf.a aVar;
        if (jSONObject == null) {
            return;
        }
        if ((this.b.a(jSONObject, str) & 1) != 0 && (aVar = this.i.a) != null) {
            sg.bigo.ads.cg.c cVar = aVar.g;
            if (cVar != null) {
                cVar.a();
            }
            sg.bigo.ads.cg.b bVar = aVar.h;
            if (bVar != null) {
                bVar.a();
            }
            sg.bigo.ads.cg.b bVar2 = aVar.i;
            if (bVar2 != null) {
                bVar2.a();
            }
            aVar.a(0L);
        }
        h.a().a(this.b.K());
    }

    public final void a(@Nullable a aVar, int i) {
        b bVar = new b(this.a.a(), aVar, this.b, this.c, this.a, this.i, this);
        int D = this.b.D();
        if (D != 2) {
            if (D == 3) {
                this.j.add(bVar);
            } else if (D == 4) {
                bVar.a(D);
            } else if (D != 5) {
                return;
            }
            a(i, D);
            return;
        }
        bVar.a(D);
    }

    public static /* synthetic */ void a(e eVar) {
        eVar.k.set(null);
        Iterator<b> it = eVar.j.iterator();
        while (it.hasNext()) {
            it.next().a(eVar.l);
        }
        eVar.j.clear();
    }
}
