package xsna;

import com.vk.core.utils.newtork.NetworkState;
import com.vk.core.utils.newtork.NetworkType;
import com.vk.net.stat.metric.NetStatSource;
import com.vk.stat.scheme.SchemeStat$TypeNetworkCommon;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import okhttp3.Protocol;

/* compiled from: MetricsCollector.kt */
/* loaded from: classes.dex */
public final class il20 {
    public final bpn0 a;
    public final AtomicLong b = new AtomicLong(0);
    public final m460 c;

    /* compiled from: MetricsCollector.kt */
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

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
                iArr[Protocol.QUIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[NetStatSource.values().length];
            try {
                iArr2[NetStatSource.OKHTTP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[NetStatSource.OKHTTP_EXECUTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[NetStatSource.CRONET.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public il20(com.vk.core.utils.newtork.b bVar, bpn0 bpn0Var) {
        this.a = bpn0Var;
        m460 m460Var = new m460();
        m460Var.a = SchemeStat$TypeNetworkCommon.VkProxyMode.OFF;
        m460Var.f = SchemeStat$TypeNetworkCommon.NetworkType.UNKNOWN;
        this.c = m460Var;
    }

    public final m460 a() {
        long andIncrement = this.b.getAndIncrement();
        m460 m460Var = this.c;
        if (andIncrement == 127) {
            NetworkState c = com.vk.core.utils.newtork.b.c();
            NetworkType.a aVar = NetworkType.Companion;
            Set<Integer> set = c.b;
            aVar.getClass();
            m460Var.c = Boolean.valueOf(NetworkType.VPN.n(set));
            m460Var.d = Boolean.valueOf(c.e.a);
            b(m460Var);
        }
        if (andIncrement % 512 == 0) {
            b(m460Var);
        }
        return m460Var;
    }

    public final void b(m460 m460Var) {
        SchemeStat$TypeNetworkCommon.NetworkType networkType;
        SchemeStat$TypeNetworkCommon.VkProxyMode vkProxyMode = ((dev0) this.a.getValue()).isEnabled() ? SchemeStat$TypeNetworkCommon.VkProxyMode.ON : SchemeStat$TypeNetworkCommon.VkProxyMode.OFF;
        m460Var.a = vkProxyMode;
        if (vkProxyMode != SchemeStat$TypeNetworkCommon.VkProxyMode.OFF) {
            m460Var.b = ((dev0) this.a.getValue()).getHost();
        }
        NetworkState c = com.vk.core.utils.newtork.b.c();
        NetworkType d = c.d();
        d.getClass();
        if (d == NetworkType.WIFI) {
            networkType = SchemeStat$TypeNetworkCommon.NetworkType.WIFI;
        } else if (c.d().l()) {
            int i = c.c;
            if (i == 8) {
                networkType = SchemeStat$TypeNetworkCommon.NetworkType.HSDPA;
            } else if (i == 9) {
                networkType = SchemeStat$TypeNetworkCommon.NetworkType.HSUPA;
            } else if (i != 20) {
                switch (i) {
                    case 1:
                        networkType = SchemeStat$TypeNetworkCommon.NetworkType.GPRS;
                        break;
                    case 2:
                        networkType = SchemeStat$TypeNetworkCommon.NetworkType.EDGE;
                        break;
                    case 3:
                        networkType = SchemeStat$TypeNetworkCommon.NetworkType.WCDMA_UMTS;
                        break;
                    case 4:
                        networkType = SchemeStat$TypeNetworkCommon.NetworkType.CDMA;
                        break;
                    case 5:
                        networkType = SchemeStat$TypeNetworkCommon.NetworkType.CDMAEVDOREV0;
                        break;
                    case 6:
                        networkType = SchemeStat$TypeNetworkCommon.NetworkType.CDMAEVDOREVA;
                        break;
                    default:
                        switch (i) {
                            case 12:
                                networkType = SchemeStat$TypeNetworkCommon.NetworkType.CDMAEVDOREVB;
                                break;
                            case 13:
                                networkType = SchemeStat$TypeNetworkCommon.NetworkType.LTE;
                                break;
                            case 14:
                                networkType = SchemeStat$TypeNetworkCommon.NetworkType.EHRPD;
                                break;
                            default:
                                networkType = SchemeStat$TypeNetworkCommon.NetworkType.UNKNOWN;
                                break;
                        }
                }
            } else {
                networkType = SchemeStat$TypeNetworkCommon.NetworkType.NR;
            }
        } else {
            networkType = SchemeStat$TypeNetworkCommon.NetworkType.OTHER;
        }
        m460Var.f = networkType;
        c63 c63Var = c63.a;
        m460Var.e = !c63.f;
    }
}
