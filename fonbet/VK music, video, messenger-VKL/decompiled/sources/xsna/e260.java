package xsna;

import android.net.Uri;
import com.vk.core.utils.newtork.NetworkType;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.stat.scheme.MobileOfficialAppsCoreDeviceStat$NetworkInfo;
import com.vk.stat.scheme.SchemeStat$TypeNetworkAudioItem;
import com.vk.stat.scheme.SchemeStat$TypeNetworkImagesItem;
import com.vk.stat.scheme.SchemeStat$TypeNetworkProtocol;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.cru0;
import xsna.qv10;

/* compiled from: NetworkAudioMetricsReporter.kt */
/* loaded from: classes3.dex */
public final class e260 {
    public static final bpn0 e = new bpn0(new pr0(23));
    public final Object a = new Object();
    public final ConcurrentHashMap<String, b> b = new ConcurrentHashMap<>();
    public String c = "";
    public Pair<Integer, Long> d = new Pair<>(0, 0L);

    /* compiled from: NetworkAudioMetricsReporter.kt */
    public static final class a {
        public static e260 a() {
            return (e260) e260.e.getValue();
        }
    }

    /* compiled from: NetworkAudioMetricsReporter.kt */
    public static final class b {
        public final ConcurrentHashMap a = new ConcurrentHashMap();
        public volatile qv10 b;
    }

    /* compiled from: NetworkAudioMetricsReporter.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SchemeStat$TypeNetworkAudioItem.EventType.values().length];
            try {
                iArr[SchemeStat$TypeNetworkAudioItem.EventType.FRAGMENT_LOADED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SchemeStat$TypeNetworkAudioItem.EventType.FRAGMENT_STALLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static boolean a(String str) {
        return drm0.D(str, ".ts", false);
    }

    public final void b(qv10 qv10Var) {
        Object obj = cru0.j;
        if (cru0.a.b()) {
            i0q0.f(new com.vk.newsfeed.common.recycler.holders.attachments.a(21, this, qv10Var));
        }
    }

    public final void c(am4 am4Var) {
        Object obj;
        SchemeStat$TypeNetworkAudioItem.EventType eventType;
        Object obj2;
        SchemeStat$TypeNetworkAudioItem.EventType eventType2;
        b bVar = this.b.get(am4Var.c);
        long j = 0;
        if (am4Var.g < 0 || bVar == null || bVar.a.isEmpty() || bVar.b == null) {
            return;
        }
        Object obj3 = this.a;
        synchronized (obj3) {
            try {
                b bVar2 = this.b.get(am4Var.c);
                if (bVar2 == null) {
                    return;
                }
                qv10 qv10Var = bVar2.b;
                if (qv10Var == null) {
                    return;
                }
                bVar2.a.remove(am4Var);
                if (bVar2.a.isEmpty()) {
                    this.b.remove(am4Var.c);
                }
                long j2 = am4Var.e;
                long j3 = am4Var.f;
                long j4 = j2 > j3 ? j3 : j2;
                if (j2 < j3) {
                    j2 = j3;
                }
                if (j4 > 0 || j2 > 0) {
                    if (j4 > 0 && j2 > 0) {
                        j = j2 - j4;
                    }
                    j = -1;
                }
                long j5 = am4Var.i;
                String str = am4Var.d;
                try {
                    if (str.equals("fragment_loaded")) {
                        eventType = SchemeStat$TypeNetworkAudioItem.EventType.FRAGMENT_LOADED;
                    } else {
                        if (!str.equals("fragment_stalled")) {
                            L l = L.a;
                            l.getClass();
                            if (!L.m(LoggerOutputTarget.NONE)) {
                                L.u(l, L.LogType.e, new Object[]{"Unknown audio metric type - ".concat(am4Var.d)});
                            }
                            return;
                        }
                        eventType = SchemeStat$TypeNetworkAudioItem.EventType.FRAGMENT_STALLED;
                    }
                    SchemeStat$TypeNetworkAudioItem.EventType eventType3 = eventType;
                    if (eventType3 == SchemeStat$TypeNetworkAudioItem.EventType.FRAGMENT_STALLED) {
                        try {
                            long j6 = am4Var.b.b;
                            int i = am4Var.a;
                            int i2 = (int) am4Var.g;
                            Integer valueOf = Integer.valueOf(qv10Var.e);
                            Integer valueOf2 = Integer.valueOf((int) j);
                            Integer valueOf3 = Integer.valueOf(qv10Var.d);
                            Integer valueOf4 = Integer.valueOf((int) j5);
                            obj2 = obj3;
                            try {
                                Integer valueOf5 = Integer.valueOf((int) am4Var.h);
                                MobileOfficialAppsCoreDeviceStat$NetworkInfo mobileOfficialAppsCoreDeviceStat$NetworkInfo = qv10Var.j;
                                String host = Uri.parse(am4Var.c).getHost();
                                Integer valueOf6 = Integer.valueOf(qv10Var.h);
                                SchemeStat$TypeNetworkImagesItem.Protocol protocol = qv10Var.f;
                                int i3 = protocol == null ? -1 : qv10.a.$EnumSwitchMapping$0[protocol.ordinal()];
                                SchemeStat$TypeNetworkProtocol schemeStat$TypeNetworkProtocol = i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? null : SchemeStat$TypeNetworkProtocol.QUIC : SchemeStat$TypeNetworkProtocol.H2 : SchemeStat$TypeNetworkProtocol.HTTP_1_1 : SchemeStat$TypeNetworkProtocol.HTTP_1_0;
                                NetworkType.a aVar = NetworkType.Companion;
                                SchemeStat$TypeNetworkProtocol schemeStat$TypeNetworkProtocol2 = schemeStat$TypeNetworkProtocol;
                                Set<Integer> set = com.vk.core.utils.newtork.b.c().b;
                                aVar.getClass();
                                SchemeStat$TypeNetworkAudioItem schemeStat$TypeNetworkAudioItem = new SchemeStat$TypeNetworkAudioItem(eventType3, j6, i, i2, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, mobileOfficialAppsCoreDeviceStat$NetworkInfo, host, valueOf6, schemeStat$TypeNetworkProtocol2, Boolean.valueOf(NetworkType.VPN.n(set)));
                                eventType2 = eventType3;
                                kx6 kx6Var = new kx6();
                                kx6Var.f = schemeStat$TypeNetworkAudioItem;
                                kx6Var.q();
                            } catch (Throwable th) {
                                th = th;
                                obj = obj2;
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            obj2 = obj3;
                            obj = obj2;
                            throw th;
                        }
                    } else {
                        obj2 = obj3;
                        eventType2 = eventType3;
                    }
                    Pair<Integer, Long> pair = new Pair<>(Integer.valueOf(am4Var.a), Long.valueOf(am4Var.b.b));
                    if (!epx.f(this.d, pair)) {
                        this.c = UUID.randomUUID().toString();
                        this.d = pair;
                    }
                    Object obj4 = obj2;
                    ymf0 ymf0Var = new ymf0(am4Var.b.b, am4Var.a, (int) am4Var.g, this.c, Integer.valueOf(qv10Var.e), Integer.valueOf((int) j), Integer.valueOf((int) j5), Integer.valueOf((int) am4Var.h));
                    int i4 = c.$EnumSwitchMapping$0[eventType2.ordinal()];
                    int i5 = 0;
                    if (i4 == 1) {
                        jfv0.a(new hfv0(ymf0Var, i5));
                    } else {
                        if (i4 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        jfv0.a(new gfv0(ymf0Var, i5));
                    }
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                obj = obj3;
            }
        }
    }
}
