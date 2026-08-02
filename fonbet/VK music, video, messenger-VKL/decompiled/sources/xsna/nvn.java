package xsna;

import android.os.SystemClock;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.toggle.features.CoreFeatures;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import xsna.ct0;

/* compiled from: DohDns.kt */
/* loaded from: classes.dex */
public final class nvn implements tsn {
    public static final nvn b = new nvn();
    public static final bpn0 c = new bpn0(new xh6(1));
    public static final bpn0 d = new bpn0(new y56(1));
    public static final bpn0 e = new bpn0(new kb0(1));

    public static List b(String str, ohk0 ohk0Var) {
        Object failure;
        ct0 ct0Var = (ct0) d.getValue();
        ct0Var.getClass();
        try {
            failure = (ct0.a) ct0Var.a.get(str);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        ct0.a aVar = (ct0.a) failure;
        List<InetAddress> list = (aVar == null || aVar.b < SystemClock.elapsedRealtime()) ? null : aVar.a;
        if (list == null) {
            return null;
        }
        m63.j(ohk0Var, new Pair("dns.source", "cache"));
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{zr.a("IP for host ", str, " resolved from cache")});
        }
        return list;
    }

    public static List c(String str, ohk0 ohk0Var) {
        try {
            List u0 = rl3.u0(InetAddress.getAllByName(str));
            m63.j(ohk0Var, new Pair("dns.source", "system"));
            b.getClass();
            ct0 ct0Var = (ct0) d.getValue();
            ct0Var.getClass();
            try {
                ct0Var.a.put(str, new ct0.a(u0));
            } catch (Throwable unused) {
            }
            return u0;
        } catch (NullPointerException e2) {
            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
            unknownHostException.initCause(e2);
            throw unknownHostException;
        }
    }

    @Override // xsna.tsn
    public final List<InetAddress> a(final String str) {
        Object i;
        i = vhk0.i((wdp0) gav0.f.getValue(), "DNS ".concat(str), (r5 & 2) == 0, new xdf(2), new izs() { // from class: xsna.kvn
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                Object failure;
                final String str2 = str;
                final ohk0 ohk0Var = (ohk0) obj;
                nvn.b.getClass();
                try {
                    failure = nvn.b(str2, ohk0Var);
                    if (failure == null) {
                        failure = nvn.c(str2, ohk0Var);
                    }
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                tk1 tk1Var = new tk1(2, str2, ohk0Var);
                Throwable a = Result.a(failure);
                if (a != null && (a instanceof UnknownHostException)) {
                    com.vk.core.utils.newtork.b.a.getClass();
                    if (com.vk.core.utils.newtork.b.d()) {
                        try {
                            failure = tk1Var.invoke(a);
                        } catch (Throwable th2) {
                            failure = new Result.Failure(th2);
                        }
                    }
                }
                mvn mvnVar = new mvn(0, CoreFeatures.DNS_OVER_HTTPS, CoreFeatures.class, "hasFeatureEnabled", "hasFeatureEnabled()Z", 0);
                izs izsVar = new izs() { // from class: xsna.lvn
                    @Override // xsna.izs
                    public final Object invoke(Object obj2) {
                        Object failure2;
                        Object failure3;
                        UnknownHostException unknownHostException = (UnknownHostException) obj2;
                        nvn.b.getClass();
                        String str3 = str2;
                        ohk0 ohk0Var2 = ohk0Var;
                        List b2 = nvn.b(str3, ohk0Var2);
                        if (b2 != null) {
                            return b2;
                        }
                        try {
                            for (usn usnVar : (List) nvn.c.getValue()) {
                                List<InetAddress> b3 = nvn.b(str3, ohk0Var2);
                                if (b3 == null) {
                                    try {
                                        b3 = usnVar.a(str3);
                                    } catch (Throwable th3) {
                                        failure3 = new Result.Failure(th3);
                                    }
                                    if (((ArrayList) b3).isEmpty()) {
                                        failure3 = s3q0.a;
                                        Throwable a2 = Result.a(failure3);
                                        if (a2 != null) {
                                            L l = L.a;
                                            l.getClass();
                                            if (!L.m(LoggerOutputTarget.NONE)) {
                                                L.u(l, L.LogType.d, new Object[]{"Failed to resolve " + str3 + " by DNS " + usnVar.e().d});
                                            }
                                            L.i(a2);
                                            mnh0.d(unknownHostException, a2);
                                        }
                                    } else {
                                        m63.a(ohk0Var2, "dns.doh_attempt", new Pair("dns.doh_server", usnVar.e().d));
                                        L l2 = L.a;
                                        l2.getClass();
                                        if (!L.m(LoggerOutputTarget.NONE)) {
                                            L.u(l2, L.LogType.d, new Object[]{"IP for host " + str3 + " resolved by DNS " + usnVar.e().d});
                                        }
                                        m63.j(ohk0Var2, new Pair("dns.source", "doh"));
                                        ct0 ct0Var = (ct0) nvn.d.getValue();
                                        ct0Var.getClass();
                                        try {
                                            ct0Var.a.put(str3, new ct0.a(b3));
                                        } catch (Throwable unused) {
                                        }
                                    }
                                }
                                return b3;
                            }
                            failure2 = s3q0.a;
                        } catch (Throwable th4) {
                            failure2 = new Result.Failure(th4);
                        }
                        Throwable a3 = Result.a(failure2);
                        if (a3 == null) {
                            throw unknownHostException;
                        }
                        L l3 = L.a;
                        l3.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                            L.u(l3, L.LogType.d, new Object[]{"Can't init DOH providers"});
                        }
                        L.i(a3);
                        mnh0.d(unknownHostException, a3);
                        throw unknownHostException;
                    }
                };
                Throwable a2 = Result.a(failure);
                if (a2 != null && (a2 instanceof UnknownHostException)) {
                    com.vk.core.utils.newtork.b.a.getClass();
                    if (com.vk.core.utils.newtork.b.d() && ((Boolean) mvnVar.invoke()).booleanValue()) {
                        try {
                            failure = izsVar.invoke(a2);
                        } catch (Throwable th3) {
                            failure = new Result.Failure(th3);
                        }
                    }
                }
                kotlin.a.a(failure);
                return (List) failure;
            }
        });
        return (List) i;
    }
}
