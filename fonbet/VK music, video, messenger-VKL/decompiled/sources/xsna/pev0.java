package xsna;

import com.vk.core.preference.Preference;
import com.vk.log.L;
import com.vk.network.proxy.data.VkProxyPreferences;
import java.util.concurrent.TimeUnit;
import kotlin.text.Regex;

/* compiled from: VkProxyStore.kt */
/* loaded from: classes.dex */
public final class pev0 {
    public static final Regex k = new Regex("\\.");
    public final a a;
    public final VkProxyPreferences b;
    public final eev0 c;
    public final kae0 d;
    public final cj00 e;
    public final kpy f;
    public volatile String g = "";
    public volatile v9e0 h;
    public final io.reactivex.rxjava3.subjects.d<v9e0> i;
    public final io.reactivex.rxjava3.subjects.d<Boolean> j;

    /* compiled from: VkProxyStore.kt */
    public static final class a {
        public final gzs<Boolean> a;
        public final gzs<Boolean> b;
        public final gzs<Boolean> c;
        public final boolean d;

        public a(gzs<Boolean> gzsVar, gzs<Boolean> gzsVar2, gzs<Boolean> gzsVar3, boolean z) {
            this.a = gzsVar;
            this.b = gzsVar2;
            this.c = gzsVar3;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && this.d == aVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + sf3.a(sf3.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Config(isForce=");
            sb.append(this.a);
            sb.append(", isDebug=");
            sb.append(this.b);
            sb.append(", isBlocked=");
            sb.append(this.c);
            sb.append(", isProxyStateExperiment=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    public pev0(a aVar, VkProxyPreferences vkProxyPreferences, eev0 eev0Var, kae0 kae0Var, cj00 cj00Var, kpy kpyVar) {
        this.a = aVar;
        this.b = vkProxyPreferences;
        this.c = eev0Var;
        this.d = kae0Var;
        this.e = cj00Var;
        this.f = kpyVar;
        io.reactivex.rxjava3.subjects.d<v9e0> N0 = io.reactivex.rxjava3.subjects.d.N0();
        this.i = N0;
        io.reactivex.rxjava3.subjects.d<Boolean> N02 = io.reactivex.rxjava3.subjects.d.N0();
        this.j = N02;
        if (a()) {
            N02.onNext(Boolean.FALSE);
            return;
        }
        io.reactivex.rxjava3.subjects.d a2 = eev0Var.a();
        final mev0 mev0Var = new mev0(this);
        io.reactivex.rxjava3.core.q.m(N0, a2, new io.reactivex.rxjava3.functions.c() { // from class: xsna.nev0
            @Override // io.reactivex.rxjava3.functions.c
            public final Object apply(Object obj, Object obj2) {
                return (s3q0) mev0.this.invoke(obj, obj2);
            }
        }).subscribe();
    }

    public final boolean a() {
        return this.a.c.invoke().booleanValue() || !enj.n(this.e.a);
    }

    public final boolean b() {
        return this.a.b.invoke().booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0048 A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #0 {all -> 0x0033, blocks: (B:4:0x0003, B:7:0x0028, B:9:0x002c, B:12:0x0037, B:14:0x0048), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void c() {
        String str;
        try {
            Object a2 = new io.reactivex.rxjava3.internal.operators.observable.p1(this.i.y0(4L, TimeUnit.SECONDS), new i6n0()).a();
            if (((v9e0) a2).equals(v9e0.d)) {
                a2 = null;
            }
            v9e0 v9e0Var = (v9e0) a2;
            if (v9e0Var != null) {
                str = v9e0Var.a();
                if (str == null) {
                }
                this.g = str;
                Preference.H("NetworkProxy", "last_enabled_proxy", this.g);
                if (b()) {
                    L.e("Reset proxy on new - ".concat(this.g));
                }
            }
            str = "";
            this.g = str;
            Preference.H("NetworkProxy", "last_enabled_proxy", this.g);
            if (b()) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
