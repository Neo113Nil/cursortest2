package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.webkit.WebView;
import com.vk.api.sdk.utils.clientagent.model.ClientAgentKey;
import com.vk.api.sdk.utils.clientagent.model.Net;
import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vk.httpexecutor.api.NetworkClient;
import com.vk.log.L;
import com.vk.net.stat.small.NetworkStatSmallListener;
import com.vk.toggle.features.CoreFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.VKApplication;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.collections.builders.ListBuilder;
import okhttp3.Interceptor;
import okhttp3.o;
import okhttp3.p;
import xsna.djv;
import xsna.elc;
import xsna.yy2;

/* compiled from: NetworkClientManager.kt */
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes.dex */
public final class o260 implements NetworkClient {
    public final Context a;
    public final NetworkClient.a b;
    public final y560 c;
    public final mqa d;
    public final kui e;
    public final n460 f;
    public final Object g;
    public final b260 h;
    public final Set<izs<NetworkClient.ClientType, Interceptor>> i;
    public final Set<izs<NetworkClient.ClientType, Interceptor>> j;
    public final djv k;
    public final c l;
    public final q360 m;
    public final fjv n;
    public final r260 o;
    public final Lazy<Boolean> p;
    public final ArrayList q;
    public final b r;
    public final ListBuilder s;
    public ty90 t;
    public final h4j u;
    public final qcn v;
    public final h4j w;
    public final bpn0 x;
    public final bpn0 y;

    /* compiled from: NetworkClientManager.kt */
    public final class a {
        public final NetworkClient.ClientType a;
        public final Object b = new Object();
        public o.a c;
        public okhttp3.o d;
        public r9e0 e;

        public a(NetworkClient.ClientType clientType) {
            this.a = clientType;
        }

        public final okhttp3.o a() {
            if (this.d == null) {
                Object obj = this.b;
                o260 o260Var = o260.this;
                synchronized (obj) {
                    try {
                        if (this.d == null) {
                            o.a i = o260Var.i(this.a);
                            this.c = i;
                            this.d = new okhttp3.o(i);
                        }
                        s3q0 s3q0Var = s3q0.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return this.d;
        }
    }

    /* compiled from: NetworkClientManager.kt */
    public static final class b {
        public final mqa a;

        public b(mqa mqaVar) {
            this.a = mqaVar;
            new bpn0(new cuq(this, 4));
        }
    }

    /* compiled from: NetworkClientManager.kt */
    public static final class c {
        public final Context a;
        public final bpn0 b = new bpn0(new duq(this, 6));
        public final bpn0 c = new bpn0(new x0f(4));

        public c(Context context) {
            this.a = context;
        }

        public final String a() {
            return ((ggq0) this.b.getValue()).getUserAgent();
        }
    }

    /* compiled from: NetworkClientManager.kt */
    public interface d {

        /* compiled from: NetworkClientManager.kt */
        public static final class a {
            public static final /* synthetic */ int a = 0;

            /* compiled from: NetworkClientManager.kt */
            /* renamed from: xsna.o260$d$a$a, reason: collision with other inner class name */
            public static final class C3437a implements d {
            }
        }

        static {
            int i = a.a;
        }
    }

    public o260(Context context, NetworkClient.a aVar, y560 y560Var, mqa mqaVar, kui kuiVar, n460 n460Var, Lazy lazy, b260 b260Var, Set set, Set set2, djv djvVar, c cVar, q360 q360Var, fjv fjvVar, r260 r260Var, bpn0 bpn0Var) {
        this.a = context;
        this.b = aVar;
        this.c = y560Var;
        this.d = mqaVar;
        this.e = kuiVar;
        this.f = n460Var;
        this.g = lazy;
        this.h = b260Var;
        this.i = set;
        this.j = set2;
        this.k = djvVar;
        this.l = cVar;
        this.m = q360Var;
        this.n = fjvVar;
        this.o = r260Var;
        this.p = bpn0Var;
        zrp<NetworkClient.ClientType> h = NetworkClient.ClientType.h();
        ArrayList arrayList = new ArrayList(c5g.u(h, 10));
        Iterator<E> it = h.iterator();
        while (it.hasNext()) {
            arrayList.add(new a((NetworkClient.ClientType) it.next()));
        }
        this.q = arrayList;
        this.r = new b(this.d);
        ListBuilder e = e43.e();
        e.add(NetworkClient.ClientType.CLIENT_PLAYER);
        e.add(NetworkClient.ClientType.CLIENT_OFFLINE_MUSIC_DOWNLOADER);
        VideoFeatures videoFeatures = VideoFeatures.HLS_PROXY_FOR_DOWNLOADER;
        videoFeatures.getClass();
        if (com.vk.toggle.b.A.a(videoFeatures)) {
            e.add(NetworkClient.ClientType.CLIENT_PLAYER_DOWNLOADER);
        }
        this.s = e.g();
        TimeUnit timeUnit = TimeUnit.MINUTES;
        this.u = new h4j(3L);
        asu0.a.getClass();
        this.v = new qcn(asu0.q());
        this.w = new h4j(3L);
        this.x = new bpn0(new t0f(7));
        this.y = new bpn0(new ps0(6));
        q5m.a = new yg9(this, 7);
        if (BuildInfo.m()) {
            return;
        }
        wvv.b(wvv.a, new wq40(this, 1), 5000L, 1000L, 8);
    }

    @Override // com.vk.httpexecutor.api.NetworkClient
    public final byte[] a(String str) {
        return e(str, null, b(NetworkClient.ClientType.CLIENT_DEFAULT)).c();
    }

    @Override // com.vk.httpexecutor.api.NetworkClient
    public final okhttp3.o b(NetworkClient.ClientType clientType) {
        return ((a) this.q.get(clientType.ordinal())).a();
    }

    public final o.a c(NetworkClient.ClientType clientType) {
        ty90 ty90Var;
        if (this.t == null) {
            synchronized (o260.class) {
                L.A("init network file system");
                if (this.t == null) {
                    r27 r27Var = new r27(this.a);
                    BuildInfo.Client client = BuildInfo.a;
                    VKApplication vKApplication = com.vk.core.apps.a.a;
                    lyi0 lyi0Var = new lyi0();
                    ty90 ty90Var2 = new ty90(lyi0Var, r27Var, BuildInfo.h());
                    synchronized (ty90Var2) {
                        lyi0Var.a(r27Var.a());
                    }
                    this.t = ty90Var2;
                }
                s3q0 s3q0Var = s3q0.a;
            }
        }
        o.a aVar = new o.a();
        Pair pair = (clientType == NetworkClient.ClientType.CLIENT_IMAGE_LOADER && this.h.j) ? new Pair(this.w, (qcn) this.x.getValue()) : new Pair(this.u, this.v);
        h4j h4jVar = (h4j) pair.d();
        qcn qcnVar = (qcn) pair.g();
        aVar.b = h4jVar;
        aVar.a = qcnVar;
        r9e0 g = g(clientType);
        q260 q260Var = new q260(qcnVar);
        djv djvVar = this.k;
        n460 n460Var = this.f;
        boolean z = this.h.j;
        w0f w0fVar = new w0f(5);
        bpn0 bpn0Var = djvVar.a;
        b260 b260Var = djvVar.b;
        ListBuilder e = e43.e();
        int i = djv.a.$EnumSwitchMapping$0[clientType.ordinal()];
        int i2 = 2;
        NetworkStatSmallListener.LoaderType loaderType = i != 1 ? i != 2 ? NetworkStatSmallListener.LoaderType.Common : NetworkStatSmallListener.LoaderType.Image : NetworkStatSmallListener.LoaderType.Api;
        e.add(new oy70(n460Var));
        Iterator it = ((Iterable) bpn0Var.getValue()).iterator();
        while (it.hasNext()) {
            e.add(new oy70((py70) it.next()));
        }
        if (b260Var.n) {
            NetworkStatSmallListener.b bVar = new NetworkStatSmallListener.b(clientType.name(), loaderType);
            hjv.a.getClass();
            e.add(new NetworkStatSmallListener(bVar, (com.vk.core.utils.newtork.b) hjv.d.getValue(), q260Var, z, w0fVar));
        }
        ListBuilder g2 = e.g();
        g.d.addAll(g2);
        ArrayList arrayList = new ArrayList();
        for (Object obj : g2) {
            if (obj instanceof cx2) {
                arrayList.add(obj);
            }
        }
        NetworkClient.ClientType clientType2 = NetworkClient.ClientType.CLIENT_API;
        if (clientType == clientType2 && !arrayList.isEmpty()) {
            g5g.y(arrayList, this.e.a);
        }
        if (this.o.a) {
            byte[] bArr = x2r0.a;
            aVar.e = new ey70(e43.l(new n2r0(g), new p260(this)));
        } else {
            byte[] bArr2 = x2r0.a;
            aVar.e = new n2r0(g);
        }
        if (clientType != NetworkClient.ClientType.CLIENT_WEB && (ty90Var = this.t) != null) {
            aVar.j = ty90Var;
        }
        if (!BuildInfo.m()) {
            NetworkClient.a.C1087a c1087a = this.b.d;
            aVar.a(new Interceptor[]{new sjq(clientType, c1087a.a, c1087a.c, c1087a.d)}[0]);
        }
        if (this.s.contains(clientType)) {
            aVar.a(new g9v(h()));
        }
        if (clientType == clientType2) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new bwv(this.b.b));
            yy2.a[] aVarArr = (yy2.a[]) arrayList2.toArray(new yy2.a[0]);
            aVar.a(new yy2((yy2.a[]) Arrays.copyOf(aVarArr, aVarArr.length)));
            aVar.a(tj.a);
            Iterator<T> it2 = this.j.iterator();
            while (it2.hasNext()) {
                Interceptor interceptor = (Interceptor) ((izs) it2.next()).invoke(NetworkClient.ClientType.CLIENT_API);
                if (interceptor != null) {
                    aVar.b(interceptor);
                }
            }
            aVar.a(new bmx0());
            eqy<bek0> eqyVar = com.vk.toggle.d.a;
            if ((BuildInfo.q() ? VideoFeatures.VIDEO_KBH_DETECT : CoreFeatures.KBH_DETECT).h()) {
                aVar.a(m1p0.a);
            }
        }
        new b63(8);
        aVar.a(new z390());
        Iterator<T> it3 = this.i.iterator();
        while (it3.hasNext()) {
            Interceptor interceptor2 = (Interceptor) ((izs) it3.next()).invoke(clientType);
            if (interceptor2 != null) {
                aVar.a(interceptor2);
            }
        }
        Interceptor[] interceptorArr = {new fgq0(new n260(this)), ptu.a, new qv50(), x2q0.a, new a490(h()), new hae0(h()), new kmf0(h()), new fek0(h(), new zww(this, i2)), new rip0()};
        for (int i3 = 0; i3 < 9; i3++) {
            aVar.a(interceptorArr[i3]);
        }
        elc.a a2 = this.m.a();
        a2.a.put(ClientAgentKey.NET, Net.OKHTTP);
        aVar.a(tz80.a(new glc((String) a2.a((String) com.vk.core.apps.a.q.getValue()).a.getValue()), "ClientAgent"));
        aVar.a(new f4y0(this.n, BuildInfo.h()));
        aVar.b(new kek0(h4jVar));
        if (this.h.k && Build.VERSION.SDK_INT <= 29) {
            qy70 qy70Var = new qy70();
            if (!qy70Var.equals(aVar.o)) {
                aVar.B = null;
            }
            aVar.o = qy70Var;
        }
        b260 b260Var2 = this.h;
        long j = b260Var2.f;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aVar.c(j, timeUnit);
        aVar.e(b260Var2.g, timeUnit);
        aVar.g(b260Var2.g, timeUnit);
        if (Preference.j().getBoolean("__dbg_allow_requests_breakpoints", false)) {
            aVar.c(2147483647L, TimeUnit.MILLISECONDS);
        } else {
            h3j h3jVar = new h3j();
            aVar.b(h3jVar);
            g.e.add(h3jVar);
        }
        dev0 h = h();
        b bVar2 = this.r;
        bVar2.getClass();
        vui vuiVar = new vui(h, new z560(bVar2.a), new qae0(this.d));
        if (epx.f(Looper.getMainLooper(), Looper.myLooper())) {
            L.l("error! don't call from main thread!");
        }
        try {
            aVar.f(vuiVar.d, vuiVar);
        } catch (Exception e2) {
            L.E(e2, new Object[0]);
        }
        fti ftiVar = new fti(h(), new k360(), new z9e0(this.d, BuildInfo.h()));
        if (!ftiVar.equals(aVar.t)) {
            aVar.B = null;
        }
        aVar.t = ftiVar;
        if (clientType != NetworkClient.ClientType.CLIENT_SSE && !BuildInfo.m()) {
            q5m.a().getClass();
        }
        if (clientType == NetworkClient.ClientType.CLIENT_API || clientType == NetworkClient.ClientType.CLIENT_DEFAULT) {
            aVar.a(new p400());
        }
        aVar.h = false;
        aVar.i = false;
        aVar.d(nvn.b);
        return aVar;
    }

    public final void d(final boolean z) {
        i0q0.d(300L, new Runnable() { // from class: xsna.m260
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    WebView.setWebContentsDebuggingEnabled(z);
                } catch (Throwable unused) {
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final nv9 e(String str, HashMap hashMap, okhttp3.o oVar) {
        okhttp3.v vVar;
        Boolean bool;
        Boolean bool2;
        okhttp3.v vVar2 = null;
        r0 = null;
        byte[] bArr = null;
        try {
            try {
                p.a aVar = new p.a();
                aVar.i(str);
                if (hashMap != null && !hashMap.isEmpty()) {
                    for (Map.Entry entry : hashMap.entrySet()) {
                        aVar.a((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                okhttp3.u execute = ((f8f0) oVar.a(aVar.b())).execute();
                bool2 = Boolean.valueOf(execute.t());
                try {
                    okhttp3.v m = execute.m();
                    if (m != null) {
                        try {
                            bArr = m.bytes();
                        } catch (Exception e) {
                            vVar = m;
                            e = e;
                            bool = bool2;
                            try {
                                L.g("can't read response: ", e);
                                if (vVar != null) {
                                    vVar.close();
                                }
                                bool2 = bool;
                                return new nv9(bArr, bool2);
                            } catch (Throwable th) {
                                th = th;
                                vVar2 = vVar;
                                if (vVar2 != null) {
                                    vVar2.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            vVar2 = m;
                            th = th2;
                            if (vVar2 != null) {
                            }
                            throw th;
                        }
                    }
                    if (m != null) {
                        m.close();
                    }
                } catch (Exception e2) {
                    e = e2;
                    bool = bool2;
                    vVar = null;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e3) {
            e = e3;
            vVar = null;
            bool = null;
        }
        return new nv9(bArr, bool2);
    }

    public final o.a f(NetworkClient.ClientType clientType) {
        a aVar = (a) this.q.get(clientType.ordinal());
        aVar.a();
        return aVar.c;
    }

    public final r9e0 g(NetworkClient.ClientType clientType) {
        a aVar = (a) this.q.get(clientType.ordinal());
        if (aVar.e == null) {
            Object obj = aVar.b;
            o260 o260Var = o260.this;
            synchronized (obj) {
                try {
                    if (aVar.e == null) {
                        asu0.a.getClass();
                        aVar.e = new r9e0(asu0.x(), o260Var.c, new f360[0]);
                    }
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return aVar.e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final dev0 h() {
        return (dev0) this.g.getValue();
    }

    public final o.a i(NetworkClient.ClientType clientType) {
        if (!this.p.getValue().booleanValue()) {
            return c(clientType);
        }
        o.a c2 = c(clientType);
        tz80.b(c2, (wdp0) gav0.b.getValue());
        return c2;
    }
}
