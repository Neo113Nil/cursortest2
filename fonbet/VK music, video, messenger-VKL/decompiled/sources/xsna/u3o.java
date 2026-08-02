package xsna;

import xsna.tlo0;

/* compiled from: DonutTeaserState.kt */
/* loaded from: classes4.dex */
public final class u3o implements km50 {
    public final boolean b;
    public final boolean c;
    public final tlo0 d;
    public final String e;
    public final qko0 f;
    public final int g;
    public final String h;
    public final String i;

    public u3o(boolean z, boolean z2, tlo0 tlo0Var, String str, qko0 qko0Var, int i, String str2, String str3) {
        this.b = z;
        this.c = z2;
        this.d = tlo0Var;
        this.e = str;
        this.f = qko0Var;
        this.g = i;
        this.h = str2;
        this.i = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [xsna.tlo0] */
    public static u3o a(u3o u3oVar, boolean z, boolean z2, tlo0.f fVar, String str, qko0 qko0Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            z = u3oVar.b;
        }
        boolean z3 = z;
        if ((i2 & 2) != 0) {
            z2 = u3oVar.c;
        }
        boolean z4 = z2;
        tlo0.f fVar2 = fVar;
        if ((i2 & 4) != 0) {
            fVar2 = u3oVar.d;
        }
        tlo0.f fVar3 = fVar2;
        if ((i2 & 8) != 0) {
            str = u3oVar.e;
        }
        String str2 = str;
        if ((i2 & 16) != 0) {
            qko0Var = u3oVar.f;
        }
        qko0 qko0Var2 = qko0Var;
        int i3 = (i2 & 32) != 0 ? u3oVar.g : i;
        String str3 = u3oVar.h;
        String str4 = u3oVar.i;
        u3oVar.getClass();
        return new u3o(z3, z4, fVar3, str2, qko0Var2, i3, str3, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3o)) {
            return false;
        }
        u3o u3oVar = (u3o) obj;
        return this.b == u3oVar.b && this.c == u3oVar.c && epx.f(this.d, u3oVar.d) && epx.f(this.e, u3oVar.e) && epx.f(this.f, u3oVar.f) && this.g == u3oVar.g && epx.f(this.h, u3oVar.h) && epx.f(this.i, u3oVar.i);
    }

    public final int hashCode() {
        int b = qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c);
        tlo0 tlo0Var = this.d;
        int hashCode = (b + (tlo0Var == null ? 0 : tlo0Var.hashCode())) * 31;
        String str = this.e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        qko0 qko0Var = this.f;
        int a = urd0.a(shy.a(this.g, (hashCode2 + (qko0Var == null ? 0 : Long.hashCode(qko0Var.a))) * 31, 31), 31, this.h);
        String str2 = this.i;
        return a + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DonutTeaserState(isLoading=");
        sb.append(this.b);
        sb.append(", isLoaderVisible=");
        sb.append(this.c);
        sb.append(", errorTextSource=");
        sb.append(this.d);
        sb.append(", teaserText=");
        sb.append(this.e);
        sb.append(", teaserTextSelection=");
        sb.append(this.f);
        sb.append(", updateTeaserTextTrigger=");
        sb.append(this.g);
        sb.append(", defaultTeaserText=");
        sb.append(this.h);
        sb.append(", initialTeaserText=");
        return ho8.a(sb, this.i, ')');
    }
}
