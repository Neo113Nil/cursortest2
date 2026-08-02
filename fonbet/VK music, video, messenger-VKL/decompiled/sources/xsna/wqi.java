package xsna;

/* compiled from: ComposeStartStatConfig.kt */
/* loaded from: classes11.dex */
public final class wqi {
    public static final a d = new a();
    public static final wqi e = new wqi(false, false, false);
    public final boolean a;
    public final boolean b;
    public final boolean c;

    /* compiled from: ComposeStartStatConfig.kt */
    public static final class a {
    }

    public wqi() {
        this(false, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wqi)) {
            return false;
        }
        wqi wqiVar = (wqi) obj;
        return this.a == wqiVar.a && this.b == wqiVar.b && this.c == wqiVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ComposeStartStatConfig(shouldWarmupCompose=");
        sb.append(this.a);
        sb.append(", shouldWarmupState=");
        sb.append(this.b);
        sb.append(", shouldWarmupComposition=");
        return defpackage.q0.a(sb, this.c, ')');
    }

    public wqi(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }
}
