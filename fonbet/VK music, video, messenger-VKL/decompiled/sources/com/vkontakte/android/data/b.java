package com.vkontakte.android.data;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.huawei.hms.framework.common.BundleUtil;
import com.ironsource.C4217a2;
import com.ironsource.X3;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.log.L;
import com.vk.metrics.eventtracking.Event;
import com.vk.statistic.DeprecatedStatisticInterface;
import com.vk.statistic.DeprecatedStatisticUrl;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import io.reactivex.rxjava3.internal.operators.observable.s0;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.utils.Logger;
import xsna.asu0;
import xsna.b0m;
import xsna.bd3;
import xsna.c06;
import xsna.c0m;
import xsna.e43;
import xsna.el3;
import xsna.ew;
import xsna.h5s;
import xsna.hx2;
import xsna.i5s;
import xsna.ja3;
import xsna.jx2;
import xsna.nfp0;
import xsna.o1;
import xsna.ozl;
import xsna.pvo0;
import xsna.pzl;
import xsna.qzl;
import xsna.rzl;
import xsna.tj0;
import xsna.tw3;
import xsna.vhk0;
import xsna.wzs;
import xsna.yzl;

/* compiled from: DeprecatedAnalytics.java */
@ozl
/* loaded from: classes11.dex */
public final class b {
    public static volatile b x;
    public static final bd3 y = new bd3();
    public static final pzl z = new pzl();
    public final i a;
    public final ScheduledExecutorService b;
    public final io.reactivex.rxjava3.internal.schedulers.d c;
    public final g d;
    public volatile ScheduledFuture<?> e;
    public volatile ScheduledFuture<?> f;
    public String g;
    public final LinkedBlockingQueue<JSONObject> h;
    public final ConcurrentHashMap<String, JSONObject> i;
    public final ConcurrentHashMap<JSONObject, HashSet<String>> j;
    public final Set<JSONObject> k;
    public final LinkedBlockingQueue<String> l;
    public final LinkedBlockingQueue<String> m;
    public final LinkedBlockingQueue<String> n;
    public boolean o;

    @Nullable
    public String p;

    @Nullable
    public JSONObject q;
    public String r;
    public final HashMap<String, String> s;

    @NonNull
    public InterfaceC2101b t;
    public int u;
    public Set<String> v;
    public final rzl w;

    /* compiled from: DeprecatedAnalytics.java */
    /* loaded from: classes7.dex */
    public class a implements hx2<JSONObject> {
        public final /* synthetic */ nfp0.a b;
        public final /* synthetic */ Object[] c;

        public a(nfp0.a aVar, Object[] objArr) {
            this.b = aVar;
            this.c = objArr;
        }

        @Override // xsna.hx2
        public final void b(JSONObject jSONObject) {
            i iVar = b.h().a;
            iVar.a.a(this.b.a);
            if (b.h().h.size() >= b.h().u) {
                b.b(b.h());
            }
            this.c[0] = null;
        }

        @Override // xsna.hx2
        public final void e(@NonNull VKApiExecutionException vKApiExecutionException) {
            int s = vKApiExecutionException.s();
            Object[] objArr = this.c;
            if (s == -1) {
                objArr[0] = new IOException(vKApiExecutionException.toString());
                return;
            }
            objArr[0] = new VKApiExecutionException(s, "sendAnalyticsSyncLikeNormalProgrammersDo", false, vKApiExecutionException.getMessage());
            if (s == 12) {
                i iVar = b.h().a;
                List<JSONObject> list = this.b.a;
                iVar.getClass();
                if (list.isEmpty()) {
                    return;
                }
                iVar.a.a(list);
                int size = list.size();
                if (size == 1) {
                    com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
                    el3 el3Var = Event.b;
                    Event.a b = h5s.b("ERROR.STATS.EVENT_CORRUPTED");
                    b.c("events_body", list.get(0).toString().substring(0, 100));
                    bVar.k(b.e());
                    b.h().k.removeAll(list);
                    return;
                }
                b.h().k.addAll(list);
                int i = size / 2;
                List<JSONObject> subList = list.subList(0, i);
                List<JSONObject> subList2 = list.subList(i, size);
                iVar.a(nfp0.b(subList));
                iVar.a(nfp0.b(subList2));
            }
        }
    }

    /* compiled from: DeprecatedAnalytics.java */
    /* renamed from: com.vkontakte.android.data.b$b, reason: collision with other inner class name */
    public interface InterfaceC2101b {
        q<c0m.a> a(String str);

        void b(String str);

        void c();
    }

    /* compiled from: DeprecatedAnalytics.java */
    @Deprecated
    public static class c implements InterfaceC2101b {
        @Override // com.vkontakte.android.data.b.InterfaceC2101b
        public final q<c0m.a> a(@NonNull String str) {
            L.G("com.vkontakte.android.data.b$c", "sendEvents");
            return q.H(new IllegalStateException("Trying to sent event with the empty provider!"));
        }

        @Override // com.vkontakte.android.data.b.InterfaceC2101b
        public final void b(@NonNull String str) {
            L.G("com.vkontakte.android.data.b$c", "sendEventsAdvertisement");
        }

        @Override // com.vkontakte.android.data.b.InterfaceC2101b
        public final void c() {
            L.G("com.vkontakte.android.data.b$c", "isGeoDataEnabled");
        }
    }

    /* compiled from: DeprecatedAnalytics.java */
    /* loaded from: classes7.dex */
    public static class d {
        public final JSONObject a;
        public boolean b;
        public boolean c;
        public final String d;
        public final int e;
        public Long f;

        public /* synthetic */ d(JSONObject jSONObject, int i, String str) {
            this(str, jSONObject);
        }

        public final void a(Boolean bool, String str) {
            b(bool.booleanValue() ? "1" : "0", str);
        }

        public final void b(Object obj, String str) {
            String str2 = this.d;
            if (g()) {
                return;
            }
            boolean z = this.b;
            JSONObject jSONObject = this.a;
            if (!z) {
                int i = this.e;
                if (i != -1) {
                    try {
                        obj = obj.toString().split(BundleUtil.UNDERLINE_TAG)[i];
                    } catch (Exception e) {
                        com.vk.metrics.eventtracking.b.a.a(e);
                        return;
                    }
                }
                if (obj != null) {
                    jSONObject.put(str, obj);
                    return;
                }
                return;
            }
            if (obj != null) {
                try {
                    if (!b.h().i.containsKey(str2)) {
                        b.h().i.put(str2, jSONObject);
                    }
                    JSONObject jSONObject2 = b.h().i.get(str2);
                    if (!jSONObject2.has(str)) {
                        jSONObject2.put(str, new JSONArray());
                    }
                    if (this.c) {
                        if (!b.h().j.containsKey(jSONObject2)) {
                            b.h().j.put(jSONObject2, new HashSet<>());
                        }
                        if (!b.h().j.get(jSONObject2).add(str + StringUtils.PROCESS_POSTFIX_DELIMITER + obj.toString())) {
                            return;
                        }
                    }
                    jSONObject2.getJSONArray(str).put(obj);
                } catch (Exception e2) {
                    com.vk.metrics.eventtracking.b.a.a(e2);
                }
            }
        }

        public final void c(@NonNull Integer num) {
            String str = this.d;
            if (g()) {
                return;
            }
            try {
                boolean z = this.b;
                JSONObject jSONObject = this.a;
                if (!z) {
                    jSONObject.put(X3.i.L, num);
                    return;
                }
                if (!b.h().i.containsKey(str)) {
                    b.h().i.put(str, jSONObject);
                }
                JSONObject jSONObject2 = b.h().i.get(str);
                if (this.c) {
                    if (!b.h().j.containsKey(jSONObject2)) {
                        b.h().j.put(jSONObject2, new HashSet<>());
                    }
                    if (!b.h().j.get(jSONObject2).add("position:" + num)) {
                        return;
                    }
                }
                jSONObject2.put(X3.i.L, num);
            } catch (Exception e) {
                com.vk.metrics.eventtracking.b.a.a(e);
            }
        }

        public final void d() {
            this.b = true;
        }

        public final void e() {
            if (g()) {
                return;
            }
            if (this.b) {
                b.a(b.h());
                return;
            }
            i iVar = b.h().a;
            iVar.getClass();
            b.h().b.execute(new ja3(4, iVar, this.a));
        }

        public final void f() {
            if (g()) {
                return;
            }
            e();
            if (g()) {
                return;
            }
            b.l();
        }

        public final boolean g() {
            return b.h().v.contains(this.d);
        }

        @SuppressLint({"CheckResult"})
        public final void h() {
            if (g()) {
                return;
            }
            String str = this.d;
            boolean contains = str.contains(DomExceptionUtils.SEPARATOR);
            JSONObject jSONObject = this.a;
            if (!contains) {
                q<c0m.a> a = b.h().t.a(jSONObject.toString());
                Long l = this.f;
                if (l != null) {
                    a = a.y0(l.longValue(), TimeUnit.SECONDS);
                }
                a.subscribe(new c06(), new ew(this, 17));
                return;
            }
            try {
                String[] split = str.split(DomExceptionUtils.SEPARATOR, 2);
                String str2 = split[0];
                String str3 = split[1];
                if (com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS.equals(str2)) {
                    jSONObject.remove(Logger.METHOD_E);
                    jSONObject.put("event_type", str3);
                    b.h().t.b(jSONObject.toString());
                }
            } catch (Exception e) {
                com.vk.metrics.eventtracking.b.a.a(e);
            }
        }

        public final void i() {
            this.f = 2L;
        }

        public final void j() {
            this.c = true;
        }

        public final String toString() {
            return this.a.toString();
        }

        public d(String str) {
            this(str, null);
        }

        public d(String str, @Nullable JSONObject jSONObject) {
            this.e = -1;
            this.f = null;
            this.d = str;
            if (jSONObject != null) {
                this.a = jSONObject;
            } else {
                this.a = new JSONObject();
            }
            try {
                this.a.put(Logger.METHOD_E, str);
            } catch (Exception e) {
                com.vk.metrics.eventtracking.b.a.a(e);
            }
        }
    }

    /* compiled from: DeprecatedAnalytics.java */
    public interface e {
        void r();
    }

    /* compiled from: DeprecatedAnalytics.java */
    public static class f implements e {
        public final void a(List<JSONObject> list) {
            b.h().c();
            b.h().h.removeAll(list);
            b.h().i.values().removeAll(list);
            b.h().k.removeAll(list);
            b.h().j.keySet().removeAll(list);
            try {
                Regex regex = com.vk.core.files.a.a;
                vhk0.b(new File(e43.a.getFilesDir(), b.j("analytics.log")));
                vhk0.b(new File(e43.a.getFilesDir(), b.j("analytics_collapsed.log")));
            } catch (Exception e) {
                com.vk.metrics.eventtracking.b.a.a(e);
            }
            b.h().m.clear();
            long a = pvo0.a();
            Iterator<JSONObject> it = b.h().h.iterator();
            while (it.hasNext()) {
                JSONObject next = it.next();
                b.h().m.add(a + StringUtils.COMMA + next);
            }
            b.a(b.h());
        }

        @Override // com.vkontakte.android.data.b.e
        public final void r() {
            b.q(b.j("analytics.log"), "", b.h().m, true);
            b.q(b.j("analytics_events.log"), "", b.h().n, true);
            String str = pvo0.a() + StringUtils.COMMA;
            b.q(b.j("analytics_collapsed.log"), str, b.h().i.values(), false);
            b.q(b.j("analytics_corrupted_events.log"), str, b.h().k, false);
            b.h().m.clear();
            b.h().n.clear();
            b.h().f = null;
        }
    }

    /* compiled from: DeprecatedAnalytics.java */
    public static class g implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            try {
                b.m();
            } catch (Exception e) {
                com.vk.metrics.eventtracking.b.a.a(e);
            }
        }
    }

    /* compiled from: DeprecatedAnalytics.java */
    /* loaded from: classes7.dex */
    public interface h {
        @Nullable
        DeprecatedStatisticUrl T6();
    }

    /* compiled from: DeprecatedAnalytics.java */
    public static class i implements e {
        public final f a = new f();

        public final void a(nfp0.a aVar) {
            b.h().b.execute(new o1(aVar, 7));
        }

        @Override // com.vkontakte.android.data.b.e
        public final void r() {
            this.a.r();
        }
    }

    public b() {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new qzl());
        this.b = newSingleThreadScheduledExecutor;
        asu0.a.getClass();
        w wVar = io.reactivex.rxjava3.schedulers.a.a;
        this.c = new io.reactivex.rxjava3.internal.schedulers.d(newSingleThreadScheduledExecutor, true);
        this.d = new g();
        this.g = "";
        this.h = new LinkedBlockingQueue<>();
        this.i = new ConcurrentHashMap<>();
        this.j = new ConcurrentHashMap<>();
        this.k = tj0.c();
        this.l = new LinkedBlockingQueue<>();
        this.m = new LinkedBlockingQueue<>();
        this.n = new LinkedBlockingQueue<>();
        this.o = false;
        this.p = null;
        this.q = null;
        this.r = C4217a2.f;
        this.s = new HashMap<>();
        this.t = new c();
        this.u = 32;
        this.v = Collections.EMPTY_SET;
        this.w = new rzl();
        this.a = new i();
    }

    public static void a(b bVar) {
        synchronized (bVar) {
            bVar.c();
            ScheduledExecutorService scheduledExecutorService = bVar.b;
            i iVar = bVar.a;
            Objects.requireNonNull(iVar);
            bVar.f = scheduledExecutorService.schedule(new tw3(iVar, 6), 10L, TimeUnit.SECONDS);
        }
    }

    public static void b(b bVar) {
        synchronized (bVar) {
            synchronized (bVar) {
                ScheduledFuture<?> scheduledFuture = bVar.e;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    bVar.e = null;
                }
            }
        }
        bVar.e = bVar.b.schedule(bVar.d, 1000L, TimeUnit.MILLISECONDS);
    }

    public static m1 d() {
        h().a.getClass();
        return new s0(new Callable() { // from class: xsna.zzl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.vkontakte.android.data.b.m();
                return Boolean.TRUE;
            }
        }).r0(h().c).a0(asu0.a.d());
    }

    @ozl
    public static void e(long j, String str) {
        h().a.getClass();
        h().l.add(str);
        h().n.add(((j / 1000) + pvo0.a()) + StringUtils.COMMA + str);
        a(h());
    }

    @Nullable
    public static JSONObject f() {
        String str = h().p;
        if (h().q == null && !TextUtils.isEmpty(str)) {
            try {
                h().q = new JSONObject(str);
            } catch (Exception e2) {
                com.vk.metrics.eventtracking.b.a.a(e2);
            }
        }
        return h().q;
    }

    public static nfp0.a g() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(h().h);
        arrayList.addAll(h().i.values());
        return nfp0.b(arrayList);
    }

    public static b h() {
        if (x == null) {
            synchronized (b.class) {
                try {
                    if (x == null) {
                        x = new b();
                    }
                } finally {
                }
            }
        }
        return x;
    }

    public static boolean i(String str) {
        return h().l.contains(str);
    }

    public static String j(String str) {
        return i5s.a(new StringBuilder(), h().g, str);
    }

    public static void k(String str, wzs<Long, String, Boolean> wzsVar) throws IOException {
        Regex regex = com.vk.core.files.a.a;
        File file = new File(e43.a.getFilesDir(), str);
        if (file.exists()) {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            ArrayList arrayList = new ArrayList();
            boolean z2 = false;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null || readLine.length() <= 0) {
                    break;
                }
                String[] split = readLine.split(StringUtils.COMMA, 2);
                if (split.length >= 2 && wzsVar.invoke(Long.valueOf(Long.parseLong(split[0])), split[1]).booleanValue()) {
                    arrayList.add(readLine);
                } else {
                    z2 = true;
                }
            }
            bufferedReader.close();
            if (z2) {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                fileOutputStream.write(TextUtils.join("\n", arrayList).getBytes());
                fileOutputStream.close();
            }
        }
    }

    public static void l() {
        h().a.getClass();
        h().b.execute(new yzl(0));
    }

    public static synchronized void m() throws IOException, VKApiExecutionException {
        synchronized (b.class) {
            n(g(), null, null);
        }
    }

    public static synchronized void n(nfp0.a aVar, @Nullable String str, @Nullable String str2) throws IOException, VKApiExecutionException {
        synchronized (b.class) {
            try {
                if (aVar.a.isEmpty()) {
                    return;
                }
                Object[] objArr = new Object[1];
                new jx2(new b0m(aVar, str, str2), new a(aVar, objArr)).b();
                Object obj = objArr[0];
                if (obj != null) {
                    if (!(obj instanceof IOException)) {
                        throw ((VKApiExecutionException) obj);
                    }
                    throw ((IOException) obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void o(DeprecatedStatisticInterface deprecatedStatisticInterface, String str) {
        Iterator<DeprecatedStatisticUrl> it = deprecatedStatisticInterface.R6(str).iterator();
        while (it.hasNext()) {
            p(it.next());
        }
    }

    public static void p(DeprecatedStatisticUrl deprecatedStatisticUrl) {
        if (deprecatedStatisticUrl != null) {
            deprecatedStatisticUrl.Ab(h().w);
        }
    }

    public static synchronized void q(@NonNull String str, @NonNull String str2, @NonNull Collection<?> collection, boolean z2) {
        String str3;
        synchronized (b.class) {
            try {
                try {
                    Regex regex = com.vk.core.files.a.a;
                    File file = new File(e43.a.getFilesDir(), str);
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(file, z2 && !collection.isEmpty());
                    if (collection.isEmpty()) {
                        str3 = "";
                    } else {
                        StringBuilder sb = new StringBuilder();
                        for (Object obj : collection) {
                            sb.append(str2);
                            sb.append(obj);
                            sb.append('\n');
                        }
                        str3 = sb.toString();
                    }
                    fileOutputStream.write(str3.getBytes());
                    fileOutputStream.close();
                } catch (Exception e2) {
                    com.vk.metrics.eventtracking.b.a.a(e2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void c() {
        ScheduledFuture<?> scheduledFuture = this.f;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.f = null;
        }
    }
}
