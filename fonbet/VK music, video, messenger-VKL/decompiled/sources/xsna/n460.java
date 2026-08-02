package xsna;

import android.os.SystemClock;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.core.performance.network.NetworkPerformanceMeasurer;
import com.vk.log.L;
import com.vk.stat.scheme.SchemeStat$TypeNetworkCommon;
import com.vk.stat.scheme.SchemeStat$TypeNetworkImagesItem;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.text.Regex;
import okhttp3.Protocol;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cru0;
import xsna.e260;
import xsna.il20;
import xsna.o360;

/* compiled from: NetworkMetricsReporter.kt */
/* loaded from: classes.dex */
public final class n460 implements py70 {
    public static final List<Regex> i = e43.l(new Regex("[0-9]+\\.ms\\.vk\\.(com|ru|me)"), new Regex("[-0-9]+mnews.ms\\.vk\\.(com|ru|me)"), new Regex("[0-9]+\\.ms\\.dzen\\.ru"));
    public final a a;
    public final ziv b;
    public final il20 c;
    public final bpn0 d = new bpn0(new w94(11));
    public final io.reactivex.rxjava3.subjects.f<jkv> e = new io.reactivex.rxjava3.subjects.f<>();
    public final io.reactivex.rxjava3.subjects.f<qv10> f = new io.reactivex.rxjava3.subjects.f<>();
    public final x5l g;
    public final long h;

    /* compiled from: NetworkMetricsReporter.kt */
    public static final class a {
        public final File a;
        public final int b;
        public final boolean c;
        public final Set<String> d;

        public a(File file, int i, boolean z, Set set) {
            this.a = file;
            this.b = i;
            this.c = z;
            this.d = set;
        }
    }

    /* compiled from: NetworkMetricsReporter.kt */
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Protocol.values().length];
            try {
                iArr[Protocol.HTTP_1_0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Protocol.HTTP_1_1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Protocol.HTTP_2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Protocol.H2_PRIOR_KNOWLEDGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Protocol.QUIC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public n460(a aVar, bpn0 bpn0Var, com.vk.core.utils.newtork.b bVar, sq6 sq6Var, jnf jnfVar, ziv zivVar) {
        this.a = aVar;
        this.b = zivVar;
        this.c = new il20(bVar, bpn0Var);
        File file = aVar.a;
        x5l x5lVar = new x5l(file);
        this.g = x5lVar;
        this.h = SystemClock.elapsedRealtime();
        if (aVar.c && x5lVar.b.compareAndSet(false, true)) {
            File file2 = new File(file, "net/net_metrics-info_" + x5lVar.a.format(new Date()) + ".log");
            if (file2.exists()) {
                return;
            }
            File parentFile = file2.getParentFile();
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
            file2.createNewFile();
            x5lVar.c = new FileOutputStream(file2, true);
        }
    }

    public static SchemeStat$TypeNetworkImagesItem.Protocol c(Protocol protocol) {
        int i2 = protocol == null ? -1 : b.$EnumSwitchMapping$0[protocol.ordinal()];
        if (i2 == 1) {
            return SchemeStat$TypeNetworkImagesItem.Protocol.HTTP_1_0;
        }
        if (i2 == 2) {
            return SchemeStat$TypeNetworkImagesItem.Protocol.HTTP_1_1;
        }
        if (i2 == 3) {
            return SchemeStat$TypeNetworkImagesItem.Protocol.H2;
        }
        if (i2 == 4) {
            return SchemeStat$TypeNetworkImagesItem.Protocol.H2;
        }
        if (i2 != 5) {
            return null;
        }
        return SchemeStat$TypeNetworkImagesItem.Protocol.QUIC;
    }

    @Override // xsna.py70
    public final long a() {
        return this.h;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:193:? A[RETURN, SYNTHETIC] */
    @Override // xsna.py70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(jkv jkvVar) {
        m460 m460Var;
        String str;
        String str2;
        SchemeStat$TypeNetworkCommon.HttpClient httpClient;
        NetworkPerformanceMeasurer.a.getClass();
        byte b2 = 0;
        if (NetworkPerformanceMeasurer.c) {
            String str3 = jkvVar.z;
            if (str3 == null) {
                str3 = jkvVar.r;
            }
            int i2 = jkvVar.d;
            int i3 = jkvVar.b;
            Integer num = jkvVar.s;
            if (i2 > 0 && i3 > 0 && str3 != null && num != null) {
                int intValue = num.intValue();
                if (NetworkPerformanceMeasurer.b && NetworkPerformanceMeasurer.c && i2 > 0) {
                    m900<String, Boolean> m900Var = NetworkPerformanceMeasurer.o;
                    if (m900Var.get(str3) != null) {
                        m900Var.remove(str3);
                        m900<String, Double> m900Var2 = NetworkPerformanceMeasurer.n;
                        Double d = m900Var2.get(str3);
                        if (d != null) {
                            double doubleValue = d.doubleValue();
                            L.e("NetworkPerformanceMeasurer", "onImageEvent: advice for " + str3 + " is " + doubleValue);
                            m900Var2.remove(str3);
                            i2 = (int) (((double) i2) / doubleValue);
                        }
                        double sqrt = Math.sqrt(((i3 * 1.0d) * intValue) / Math.sqrt(i2 * 1.0d));
                        double d2 = (NetworkPerformanceMeasurer.g * NetworkPerformanceMeasurer.f) + sqrt;
                        NetworkPerformanceMeasurer.f++;
                        NetworkPerformanceMeasurer.g = d2 / NetworkPerformanceMeasurer.f;
                        NetworkPerformanceMeasurer.h = true;
                        L.e("NetworkPerformanceMeasurer", "onImageEvent: accumulated network quality is " + NetworkPerformanceMeasurer.g);
                        NetworkPerformanceMeasurer.b<Double> bVar = NetworkPerformanceMeasurer.p;
                        Double valueOf = Double.valueOf(sqrt);
                        synchronized (bVar.b) {
                            try {
                                long elapsedRealtime = SystemClock.elapsedRealtime() / 1000;
                                while (!bVar.b.isEmpty() && elapsedRealtime - bVar.b.first().j().longValue() > bVar.a) {
                                    bVar.b.removeFirst();
                                }
                                bVar.b.addLast(new Pair<>(valueOf, Long.valueOf(elapsedRealtime)));
                                s3q0 s3q0Var = s3q0.a;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        Object valueOf2 = Double.valueOf(ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
                        a76 a76Var = new a76(b2, 6);
                        synchronized (bVar.b) {
                            Iterator<Pair<Double, Long>> it = bVar.b.iterator();
                            while (it.hasNext()) {
                                valueOf2 = a76Var.invoke(valueOf2, it.next().i());
                            }
                        }
                        int doubleValue2 = (int) (((Number) valueOf2).doubleValue() / bVar.b.size());
                        L.e("NetworkPerformanceMeasurer", lhg.a(doubleValue2, "onImageEvent: recent network quality is "));
                        NetworkPerformanceMeasurer.a.getClass();
                        NetworkPerformanceMeasurer.NetworkClass d3 = NetworkPerformanceMeasurer.d(doubleValue2);
                        NetworkPerformanceMeasurer.NetworkClass networkClass = NetworkPerformanceMeasurer.m;
                        if (networkClass == null || networkClass != d3) {
                            NetworkPerformanceMeasurer.b(d3, false);
                        }
                    }
                }
            }
        }
        Object obj = cru0.j;
        if (!cru0.a.b() && !cru0.a.c()) {
            cru0 a2 = cru0.a.a();
            if (!(a2 != null ? a2.f() : false)) {
                return;
            }
        }
        List<Regex> list = i;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                if (((Regex) it2.next()).f(jkvVar.i)) {
                    return;
                }
            }
        }
        Object obj2 = cru0.j;
        cru0 a3 = cru0.a.a();
        if (a3 != null ? a3.f() : false) {
            String str4 = jkvVar.h;
            Set<String> set = this.a.d;
            if (!set.isEmpty()) {
                Iterator<T> it3 = set.iterator();
                while (it3.hasNext()) {
                    if (drm0.D(str4, (String) it3.next(), true)) {
                    }
                }
            }
            m460 a4 = this.c.a();
            int i4 = jkvVar.a;
            int i5 = jkvVar.b;
            int i6 = jkvVar.d;
            boolean z = jkvVar.e;
            il20 il20Var = this.c;
            Protocol protocol = jkvVar.f;
            il20Var.getClass();
            int i7 = protocol == null ? -1 : il20.a.$EnumSwitchMapping$0[protocol.ordinal()];
            String str5 = i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? "unknown" : "quic" : "h2" : "http/1.1" : "http/1.0";
            String str6 = jkvVar.j;
            String str7 = jkvVar.i;
            int i8 = jkvVar.k;
            String str8 = jkvVar.l;
            Integer num2 = jkvVar.m;
            SchemeStat$TypeNetworkCommon.NetworkType networkType = a4.f;
            boolean z2 = jkvVar.n;
            String str9 = jkvVar.o;
            SchemeStat$TypeNetworkCommon.VkProxyMode vkProxyMode = a4.a;
            String str10 = a4.b;
            boolean z3 = a4.e;
            Integer num3 = jkvVar.p;
            Integer num4 = jkvVar.q;
            Integer num5 = jkvVar.s;
            Integer num6 = jkvVar.t;
            String str11 = jkvVar.u;
            Boolean bool = jkvVar.v;
            Integer num7 = jkvVar.w;
            Boolean bool2 = a4.c;
            Boolean bool3 = a4.d;
            int i9 = jkvVar.c;
            boolean z4 = jkvVar.x;
            String str12 = jkvVar.y;
            int i10 = il20.a.$EnumSwitchMapping$1[jkvVar.g.ordinal()];
            if (i10 == 1) {
                httpClient = SchemeStat$TypeNetworkCommon.HttpClient.OKHTTP;
            } else if (i10 == 2) {
                httpClient = SchemeStat$TypeNetworkCommon.HttpClient.OKHTTP_EXEC;
            } else {
                if (i10 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                httpClient = SchemeStat$TypeNetworkCommon.HttpClient.CRONET;
            }
            SchemeStat$TypeNetworkCommon schemeStat$TypeNetworkCommon = new SchemeStat$TypeNetworkCommon(i4, i5, i6, z, str6, str7, i8, networkType, z2, vkProxyMode, z3, num3, num4, num5, num6, str5, str11, bool, httpClient, null, str8, num2, num7, str9, null, bool2, bool3, str10, Boolean.valueOf(z4), str12, Integer.valueOf(i9), Integer.valueOf(this.a.b), jkvVar.P, C.DEFAULT_MUXED_BUFFER_SIZE, 0, null);
            Object obj3 = cru0.j;
            cru0 a5 = cru0.a.a();
            if (a5 != null ? a5.f() : false) {
                kx6 kx6Var = new kx6();
                kx6Var.f = schemeStat$TypeNetworkCommon;
                kx6Var.q();
            }
            this.e.onNext(jkvVar);
            m460Var = a4;
            if (this.a.c) {
                x5l x5lVar = this.g;
                if (x5lVar.b.get()) {
                    String str13 = jkvVar.x ? SignalingProtocol.HUNGUP_REASON_FAILED : "SUCCESS";
                    long j = jkvVar.L - jkvVar.K;
                    String str14 = jkvVar.y;
                    if (str14 == null || str14.length() == 0) {
                        str2 = "\n";
                    } else {
                        str2 = " | fail_reason: " + jkvVar + ".failReason\n";
                    }
                    StringBuilder sb = new StringBuilder(X3.j.d);
                    sb.append(jkvVar.g);
                    sb.append(' ');
                    sb.append(jkvVar.f);
                    sb.append(' ');
                    sb.append(str13);
                    sb.append("] [");
                    sb.append(jkvVar.i);
                    sb.append("] ");
                    sb.append(jkvVar.j);
                    sb.append(' ');
                    sb.append(jkvVar.k);
                    sb.append(" {size: ");
                    sb.append(jkvVar.d);
                    sb.append(", req: ");
                    sb.append(j);
                    sb.append(", res: ");
                    sb.append(jkvVar.s);
                    sb.append(", is_reused: ");
                    sb.append(jkvVar.e);
                    sb.append(", ttfb : ");
                    sb.append(jkvVar.b);
                    sb.append(", con: ");
                    sb.append(jkvVar.a);
                    sb.append(", rtt : ");
                    sb.append(jkvVar.q);
                    sb.append(", domain : ");
                    sb.append(jkvVar.p);
                    sb.append("} ");
                    String a6 = i5s.a(sb, jkvVar.r, str2);
                    FileOutputStream fileOutputStream = x5lVar.c;
                    if (fileOutputStream != null) {
                        fileOutputStream.write(a6.getBytes(Charset.forName(C.UTF8_NAME)));
                    }
                }
            }
            if (((Boolean) this.b.invoke(jkvVar.i)).booleanValue()) {
                dx90 dx90Var = ow90.e;
                if (dx90Var.a == 0) {
                    dx90Var.G.incrementAndGet();
                } else if (!dx90Var.J) {
                    dx90Var.J = true;
                    if (dx90Var.G.get() > 16 && dx90Var.a - dx90Var.c < 10000) {
                        fp.d("Start api calls count limit exceed. Max is 16");
                    }
                    dx90Var.x();
                }
                int i11 = jkvVar.k;
                if (1 > i11 || i11 >= 400) {
                    ((qx90) this.d.getValue()).b().incrementAndGet();
                    int i12 = jkvVar.k;
                    if (400 <= i12 && i12 < 500) {
                        ((qx90) this.d.getValue()).a().incrementAndGet();
                    }
                } else {
                    long j2 = jkvVar.d;
                    if (dx90Var.a == 0) {
                        dx90Var.H.addAndGet(j2);
                    } else if (System.currentTimeMillis() <= TimeUnit.SECONDS.toMillis(30L) + dx90Var.a) {
                        dx90Var.I.addAndGet(j2);
                        if (!dx90Var.K) {
                            dx90Var.K = true;
                            dx90Var.x();
                        }
                    } else if (!dx90Var.L) {
                        dx90Var.L = true;
                        dx90Var.x();
                    }
                    c63 c63Var = c63.a;
                    if (!c63.f) {
                        ((qx90) this.d.getValue()).c().addAndGet(jkvVar.d);
                    }
                }
            }
            Object obj4 = cru0.j;
            if (!cru0.a.c() || cru0.a.b()) {
                if (m460Var == null) {
                    m460Var = this.c.a();
                }
                if (cru0.a.c() && ((str = jkvVar.z) != null || (str = jkvVar.r) != null)) {
                    String str15 = str;
                    int i13 = jkvVar.d;
                    Integer num8 = jkvVar.s;
                    qv10 qv10Var = new qv10(str15, jkvVar.C, i13, num8 == null ? num8.intValue() : 0, jkvVar.b, c(jkvVar.f), jkvVar.i, jkvVar.k, jkvVar.m, x260.c(m460Var.f), this.a.b);
                    bpn0 bpn0Var = o360.e;
                    o360.a.a().g(qv10Var);
                    this.f.onNext(qv10Var);
                }
                if (cru0.a.b()) {
                    return;
                }
                String str16 = jkvVar.z;
                if (str16 == null && (str16 = jkvVar.r) == null) {
                    return;
                }
                String str17 = str16;
                bpn0 bpn0Var2 = e260.e;
                e260.a.a().getClass();
                if (e260.a(str17)) {
                    int i14 = jkvVar.d;
                    Integer num9 = jkvVar.s;
                    e260.a.a().b(new qv10(str17, jkvVar.C, i14, num9 != null ? num9.intValue() : 0, jkvVar.b, c(jkvVar.f), jkvVar.i, jkvVar.k, jkvVar.m, x260.c(m460Var.f), this.a.b));
                    return;
                }
                return;
            }
            return;
        }
        m460Var = null;
        if (this.a.c) {
        }
        if (((Boolean) this.b.invoke(jkvVar.i)).booleanValue()) {
        }
        Object obj42 = cru0.j;
        if (cru0.a.c()) {
        }
        if (m460Var == null) {
        }
        if (cru0.a.c()) {
            String str152 = str;
            int i132 = jkvVar.d;
            Integer num82 = jkvVar.s;
            qv10 qv10Var2 = new qv10(str152, jkvVar.C, i132, num82 == null ? num82.intValue() : 0, jkvVar.b, c(jkvVar.f), jkvVar.i, jkvVar.k, jkvVar.m, x260.c(m460Var.f), this.a.b);
            bpn0 bpn0Var3 = o360.e;
            o360.a.a().g(qv10Var2);
            this.f.onNext(qv10Var2);
        }
        if (cru0.a.b()) {
        }
    }
}
