package xsna;

import java.util.StringJoiner;

/* compiled from: View.java */
/* loaded from: classes8.dex */
public abstract class ttt0 {
    public static p8v a() {
        p8v p8vVar = new p8v(3);
        p8vVar.c = v9l.a;
        p8vVar.d = u670.c;
        p8vVar.b = 2000;
        return p8vVar;
    }

    public abstract x71 b();

    public abstract s770 c();

    public abstract int d();

    public abstract String e();

    public abstract String f();

    public final String toString() {
        StringJoiner stringJoiner = new StringJoiner(", ", "View{", "}");
        if (f() != null) {
            stringJoiner.add("name=" + f());
        }
        if (e() != null) {
            stringJoiner.add("description=" + e());
        }
        stringJoiner.add("aggregation=" + b());
        stringJoiner.add("attributesProcessor=" + c());
        stringJoiner.add("cardinalityLimit=" + d());
        return stringJoiner.toString();
    }
}
