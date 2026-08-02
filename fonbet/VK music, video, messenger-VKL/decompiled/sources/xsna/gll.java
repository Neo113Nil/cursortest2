package xsna;

import android.content.Context;
import com.vk.core.preference.Preference;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.pushes.bridgeimpl.PushBridgeType;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;

/* compiled from: DefaultPushBridge.kt */
/* loaded from: classes.dex */
public class gll implements rmr0 {
    public final qmr0 b = new qmr0();
    public final AtomicInteger c = new AtomicInteger();

    /* compiled from: DefaultPushBridge.kt */
    /* loaded from: classes5.dex */
    public static final class a extends IllegalStateException {
        public static final /* synthetic */ int b = 0;

        /* compiled from: DefaultPushBridge.kt */
        /* renamed from: xsna.gll$a$a, reason: collision with other inner class name */
        public static final class C2947a {
            public static a a(boolean z, boolean z2, String str, int i, long j, int i2, Throwable th) {
                StringBuilder sb = new StringBuilder("\n                        Can't get FCM token. Meta = [\n                        cause=");
                sb.append(th);
                sb.append(",\n                        istall_source=");
                sb.append(str);
                sb.append(",\n                        gms_available=");
                gsi0.c(sb, z, ",\n                        hms_available=", z2, ",\n                        prev_launch_retries=");
                cgn.a(i, i2, ",\n                        bridgeType=", ",\n                        token_success_retrieval_ts=", sb);
                sb.append(j);
                sb.append("\n                        ]\n                    ");
                return new a(xqm0.g(sb.toString()), th);
            }
        }
    }

    @Override // xsna.rmr0
    public final void a() {
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"[Vendor] resetting preferred vendor"});
        }
        this.b.b();
    }

    @Override // xsna.rmr0
    public final void b() {
        this.b.a().b();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0110  */
    @Override // xsna.rmr0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair<String, Long> c() {
        int andIncrement;
        String s;
        qmr0 qmr0Var = this.b;
        rmr0 a2 = qmr0Var.a();
        try {
            Pair<String, Long> c = a2.c();
            if (c.i().length() > 0) {
                Preference.F(System.currentTimeMillis(), "vendor", "push.bridge.success.timestamp");
                qmr0Var.c(a2.g());
                if (com.vk.toggle.d.H()) {
                    rtq.a();
                }
            }
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            String i = c.i();
            Charset charset = emb.b;
            messageDigest.update(i.getBytes(charset));
            String str = new String(messageDigest.digest(), charset);
            s = Preference.s("vendor", "push.bridge.success.SHA256", new String());
            if (!str.equals(s)) {
                Preference.H("vendor", "push.bridge.success.SHA256", str);
                String i2 = c.i();
                long currentTimeMillis = System.currentTimeMillis();
                Preference.F(currentTimeMillis, "vendor", "push.bridge.success.lastDistinctReceived");
                return new Pair<>(i2, Long.valueOf(currentTimeMillis));
            }
            long m = Preference.m(0L, "vendor", "push.bridge.success.lastDistinctReceived");
            if (m != 0) {
                return new Pair<>(c.i(), Long.valueOf(m));
            }
            String i3 = c.i();
            long currentTimeMillis2 = System.currentTimeMillis();
            Preference.F(currentTimeMillis2, "vendor", "push.bridge.success.lastDistinctReceived");
            return new Pair<>(i3, Long.valueOf(currentTimeMillis2));
        } catch (InterruptedException e) {
            throw e;
        } catch (Throwable th) {
            int g = a2.g();
            if (g == PushBridgeType.GOOGLE.h()) {
                boolean z = pmr0.a;
                Context context = rwi.e;
                if (context == null) {
                    context = null;
                }
                if (pmr0.b(context)) {
                    qmr0Var.c(PushBridgeType.HUAWEI.h());
                    L l = L.a;
                    l.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l, L.LogType.w, new Object[]{"Fetching FCM registration token failed " + th + '!'});
                    }
                    andIncrement = this.c.getAndIncrement();
                    if (andIncrement <= 0) {
                        Preference.F(andIncrement, "vendor", "push.bridge.failed.try.count");
                    } else {
                        Context context2 = rwi.e;
                        Context context3 = context2 != null ? context2 : null;
                        boolean a3 = pmr0.a(context3);
                        boolean b = pmr0.b(context3);
                        String installerPackageName = context3.getPackageManager().getInstallerPackageName(context3.getPackageName());
                        if (installerPackageName == null) {
                            installerPackageName = StringUtils.UNDEFINED;
                        }
                        String str2 = installerPackageName;
                        int m2 = (int) Preference.m(-1L, "vendor", "push.bridge.failed.try.count");
                        long m3 = Preference.m(0L, "vendor", "push.bridge.success.timestamp");
                        int i4 = a.b;
                        a a4 = a.C2947a.a(a3, b, str2, m2, m3, g, th);
                        if (!com.vk.toggle.d.H() || b) {
                            com.vk.metrics.eventtracking.b.a.a(a4);
                        } else {
                            tmv s2 = q6x.s();
                            if (s2 != null) {
                                ((qtq) s2).c(a4);
                            }
                        }
                    }
                    return new Pair<>("", 0L);
                }
            }
            qmr0Var.b();
            L l2 = L.a;
            l2.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
            }
            andIncrement = this.c.getAndIncrement();
            if (andIncrement <= 0) {
            }
            return new Pair<>("", 0L);
        }
    }

    @Override // xsna.rmr0
    public final String d() {
        return this.b.a().d();
    }

    @Override // xsna.rmr0
    public final int g() {
        return this.b.a().g();
    }
}
