package xsna;

import java.util.Map;
import kotlin.random.Random;

/* compiled from: OneEventConfig.kt */
/* loaded from: classes11.dex */
public final class oi80 {
    public static final a d = new a();
    public static final oi80 e = new oi80(10, "", jgp.b);
    public final String a;
    public final int b;
    public final Object c;

    /* compiled from: OneEventConfig.kt */
    public static final class a {
    }

    public oi80(int i, String str, Map map) {
        this.a = str;
        this.b = i;
        this.c = map;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final boolean a(String str) {
        Float f = (Float) this.c.get(str);
        if (f == null) {
            return false;
        }
        float floatValue = f.floatValue();
        Random.b.getClass();
        return Random.c.i() > floatValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oi80)) {
            return false;
        }
        oi80 oi80Var = (oi80) obj;
        return epx.f(this.a, oi80Var.a) && this.b == oi80Var.b && this.c.equals(oi80Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + shy.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OneEventConfig(url=");
        sb.append(this.a);
        sb.append(", countTriggerThreshold=");
        sb.append(this.b);
        sb.append(", eventToSendProbMap=");
        return k73.c(sb, this.c, ')');
    }
}
