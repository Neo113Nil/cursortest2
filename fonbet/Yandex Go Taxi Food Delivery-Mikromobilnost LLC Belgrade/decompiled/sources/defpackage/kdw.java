package defpackage;

/* loaded from: classes12.dex */
public final class kdw implements idw {
    public static final v8w c = new v8w(0.0d, 0.0d);
    public final h2t a;
    public final o61 b;

    public kdw(h2t h2tVar, o61 o61Var) {
        this.a = h2tVar;
        this.b = o61Var;
    }

    public static v8w a(Double[] dArr) {
        return dArr.length != 2 ? c : new v8w(dArr[1].doubleValue(), dArr[0].doubleValue());
    }
}
