package defpackage;

import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes8.dex */
public final class o4z {
    public static final n4z Companion = new n4z();
    public static final i3y[] k;
    public final Integer a;
    public final Integer b;
    public final Set c;
    public final Set d;
    public final Set e;
    public final Set f;
    public final Integer g;
    public final Integer h;
    public final Boolean i;
    public final long j;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        k = new i3y[]{null, null, a.b(lazyThreadSafetyMode, new wwx(24)), a.b(lazyThreadSafetyMode, new wwx(25)), a.b(lazyThreadSafetyMode, new wwx(26)), a.b(lazyThreadSafetyMode, new wwx(27)), null, null, null, null};
    }

    public /* synthetic */ o4z(int i, Integer num, Integer num2, Set set, Set set2, Set set3, Set set4, Integer num3, Integer num4, Boolean bool, e3n e3nVar) {
        if (1023 != (i & 1023)) {
            qje.Z(i, 1023, m4z.a.getDescriptor());
            throw null;
        }
        this.a = num;
        this.b = num2;
        this.c = set;
        this.d = set2;
        this.e = set3;
        this.f = set4;
        this.g = num3;
        this.h = num4;
        this.i = bool;
        this.j = e3nVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o4z)) {
            return false;
        }
        o4z o4zVar = (o4z) obj;
        return jl40.l(this.a, o4zVar.a) && jl40.l(this.b, o4zVar.b) && jl40.l(this.c, o4zVar.c) && jl40.l(this.d, o4zVar.d) && jl40.l(this.e, o4zVar.e) && jl40.l(this.f, o4zVar.f) && jl40.l(this.g, o4zVar.g) && jl40.l(this.h, o4zVar.h) && jl40.l(this.i, o4zVar.i) && e3n.d(this.j, o4zVar.j);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Set set = this.c;
        int hashCode3 = (hashCode2 + (set == null ? 0 : set.hashCode())) * 31;
        Set set2 = this.d;
        int hashCode4 = (hashCode3 + (set2 == null ? 0 : set2.hashCode())) * 31;
        Set set3 = this.e;
        int hashCode5 = (hashCode4 + (set3 == null ? 0 : set3.hashCode())) * 31;
        Set set4 = this.f;
        int hashCode6 = (hashCode5 + (set4 == null ? 0 : set4.hashCode())) * 31;
        Integer num3 = this.g;
        int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.h;
        int hashCode8 = (hashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool = this.i;
        int hashCode9 = (hashCode8 + (bool != null ? bool.hashCode() : 0)) * 31;
        o430 o430Var = e3n.b;
        return Long.hashCode(this.j) + hashCode9;
    }

    public final String toString() {
        return "LocalSdkConfigurationModel(readyMessageTimeoutMillis=" + this.a + ", animationDurationMillis=" + this.b + ", hostsForOpenInSystem=" + this.c + ", allowedHosts=" + this.d + ", jsBridgeAllowedHosts=" + this.e + ", forbiddenHosts=" + this.f + ", webViewHideThreshold=" + this.g + ", webViewDownwardScrollFriction=" + this.h + ", isPanelDiagnosticEnabled=" + this.i + ", createdAt=" + ((Object) e3n.p(this.j)) + ')';
    }

    public o4z(Integer num, Integer num2, Set set, Set set2, Set set3, Set set4, Integer num3, Integer num4, Boolean bool, long j) {
        this.a = num;
        this.b = num2;
        this.c = set;
        this.d = set2;
        this.e = set3;
        this.f = set4;
        this.g = num3;
        this.h = num4;
        this.i = bool;
        this.j = j;
    }
}
