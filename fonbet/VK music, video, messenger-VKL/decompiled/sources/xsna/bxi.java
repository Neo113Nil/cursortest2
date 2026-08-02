package xsna;

import android.app.Application;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;

/* compiled from: Config.kt */
/* loaded from: classes3.dex */
public final class bxi {
    public final Application a;
    public final boolean b;
    public final q1p0 c;
    public final Executor d;
    public final yo20 e;
    public final a f;
    public final pxv g;
    public final f370 h;
    public final pni0 i;
    public final LinkedHashSet j;
    public final Set<String> k;
    public final boolean l;
    public final jcw m;
    public final g6q0 n;
    public final List<String> o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final dr6 u;

    /* compiled from: Config.kt */
    public static final class a {
        public final String a;
        public final String b;
        public final String c;
        public final C2631a d;
        public final C2631a e;

        /* compiled from: Config.kt */
        /* renamed from: xsna.bxi$a$a, reason: collision with other inner class name */
        public static final class C2631a {
            public final String a;
            public final String b;

            public C2631a(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2631a)) {
                    return false;
                }
                C2631a c2631a = (C2631a) obj;
                return epx.f(this.a, c2631a.a) && epx.f(this.b, c2631a.b);
            }

            public final int hashCode() {
                String str = this.a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Button(title=");
                sb.append(this.a);
                sb.append(", deeplink=");
                return ho8.a(sb, this.b, ')');
            }
        }

        public a(String str, String str2, String str3, C2631a c2631a, C2631a c2631a2) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = c2631a;
            this.e = c2631a2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            C2631a c2631a = this.d;
            int hashCode4 = (hashCode3 + (c2631a == null ? 0 : c2631a.hashCode())) * 31;
            C2631a c2631a2 = this.e;
            return hashCode4 + (c2631a2 != null ? c2631a2.hashCode() : 0);
        }

        public final String toString() {
            return "ModalWindow(icon=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", button1=" + this.d + ", button2=" + this.e + ')';
        }
    }

    public bxi() {
        throw null;
    }

    public bxi(Application application, q1p0 q1p0Var, ExecutorService executorService, yo20 yo20Var, a aVar, pxv pxvVar, f370 f370Var, pni0 pni0Var, LinkedHashSet linkedHashSet, boolean z, jcw jcwVar, g6q0 g6q0Var, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, dr6 dr6Var) {
        EmptySet emptySet = EmptySet.b;
        EmptyList emptyList = EmptyList.b;
        this.a = application;
        this.b = true;
        this.c = q1p0Var;
        this.d = executorService;
        this.e = yo20Var;
        this.f = aVar;
        this.g = pxvVar;
        this.h = f370Var;
        this.i = pni0Var;
        this.j = linkedHashSet;
        this.k = emptySet;
        this.l = z;
        this.m = jcwVar;
        this.n = g6q0Var;
        this.o = emptyList;
        this.p = z2;
        this.q = z3;
        this.r = z4;
        this.s = z5;
        this.t = z6;
        this.u = dr6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bxi)) {
            return false;
        }
        bxi bxiVar = (bxi) obj;
        return epx.f(this.a, bxiVar.a) && this.b == bxiVar.b && epx.f(this.c, bxiVar.c) && epx.f(this.d, bxiVar.d) && epx.f(this.e, bxiVar.e) && epx.f(this.f, bxiVar.f) && epx.f(this.g, bxiVar.g) && epx.f(this.h, bxiVar.h) && epx.f(this.i, bxiVar.i) && epx.f(this.j, bxiVar.j) && epx.f(this.k, bxiVar.k) && this.l == bxiVar.l && epx.f(this.m, bxiVar.m) && epx.f(this.n, bxiVar.n) && epx.f(this.o, bxiVar.o) && this.p == bxiVar.p && this.q == bxiVar.q && this.r == bxiVar.r && this.s == bxiVar.s && this.t == bxiVar.t && epx.f(this.u, bxiVar.u);
    }

    public final int hashCode() {
        int b = qoy.b(this.a.hashCode() * 31, 31, this.b);
        q1p0 q1p0Var = this.c;
        int hashCode = (this.d.hashCode() + ((b + (q1p0Var == null ? 0 : q1p0Var.hashCode())) * 31)) * 961;
        yo20 yo20Var = this.e;
        int hashCode2 = (hashCode + (yo20Var == null ? 0 : yo20Var.hashCode())) * 31;
        a aVar = this.f;
        int hashCode3 = (hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        pxv pxvVar = this.g;
        int hashCode4 = (hashCode3 + (pxvVar == null ? 0 : pxvVar.hashCode())) * 961;
        f370 f370Var = this.h;
        int b2 = qoy.b(fw3.b((this.j.hashCode() + ((this.i.hashCode() + ((hashCode4 + (f370Var == null ? 0 : f370Var.hashCode())) * 31)) * 31)) * 31, 31, this.k), 31, this.l);
        jcw jcwVar = this.m;
        int hashCode5 = (b2 + (jcwVar == null ? 0 : jcwVar.hashCode())) * 31;
        g6q0 g6q0Var = this.n;
        return this.u.hashCode() + qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(fw3.a((hashCode5 + (g6q0Var != null ? g6q0Var.hashCode() : 0)) * 31, 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t);
    }

    public final String toString() {
        return "Config(application=" + this.a + ", autostart=" + this.b + ", extendedNetworkCheck=" + this.c + ", extendedCheckExecutor=" + this.d + ", customLocalTunnelDetector=null, modalControllerProvider=" + this.e + ", defaultModalContent=" + this.f + ", getIsDarkTheme=" + this.g + ", listener=null, logger=" + this.h + ", deeplinkHandler=" + this.i + ", whitelistedScreens=" + this.j + ", blacklistedScreens=" + this.k + ", checkOnAppResumed=" + this.l + ", modalDecisionInterceptor=" + this.m + ", globalModalBuilderInterceptor=" + this.n + ", screensWhitelist=" + this.o + ", debugEmulateVpn=" + this.p + ", debugEmulateUnstable=" + this.q + ", debugForceDismissable=" + this.r + ", dryRun=" + this.s + ", wifiCheckEnabled=" + this.t + ", checkActiveOnly=" + this.u + ')';
    }
}
