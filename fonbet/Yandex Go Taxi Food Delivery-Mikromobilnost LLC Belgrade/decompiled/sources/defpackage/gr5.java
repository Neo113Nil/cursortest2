package defpackage;

import kotlin.Pair;

/* loaded from: classes5.dex */
public final /* synthetic */ class gr5 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ m3u0 b;

    public /* synthetic */ gr5(m3u0 m3u0Var, int i) {
        this.a = i;
        this.b = m3u0Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        m3u0 m3u0Var = this.b;
        switch (i) {
            case 0:
                return Integer.valueOf(((Number) m3u0Var.getValue()).intValue());
            case 1:
                return (ywy) m3u0Var.getValue();
            case 2:
                Boolean bool = (Boolean) m3u0Var.getValue();
                bool.booleanValue();
                return bool;
            case 3:
                return (ywy) m3u0Var.getValue();
            case 4:
                return (Integer) m3u0Var.getValue();
            case 5:
                return Float.valueOf(((Number) m3u0Var.getValue()).floatValue());
            case 6:
                return Float.valueOf(((Number) m3u0Var.getValue()).floatValue());
            case 7:
                return new wu60(((wu60) m3u0Var.getValue()).a);
            case 8:
                pj2 pj2Var = vkq0.a;
                return new wu60(((wu60) m3u0Var.getValue()).a);
            case 9:
                return Boolean.valueOf(((Number) m3u0Var.getValue()).floatValue() >= 0.7f);
            case 10:
                Boolean bool2 = (Boolean) m3u0Var.getValue();
                bool2.getClass();
                return bool2;
            case 11:
                return Float.valueOf(((Number) m3u0Var.getValue()).floatValue());
            case 12:
                return Float.valueOf(((Number) m3u0Var.getValue()).floatValue());
            case 13:
                return (wu60) m3u0Var.getValue();
            case 14:
                return (zqv0) m3u0Var.getValue();
            case 15:
                return (ywy) m3u0Var.getValue();
            case 16:
                return Float.valueOf(1.0f - y6i0.c(Math.abs(((Number) m3u0Var.getValue()).floatValue()) * 3.27f, 0.0f, 1.0f));
            case 17:
                Boolean bool3 = (Boolean) m3u0Var.getValue();
                bool3.getClass();
                return bool3;
            case 18:
                return (Pair) m3u0Var.getValue();
            case 19:
                return (ywy) m3u0Var.getValue();
            case 20:
                return Boolean.valueOf(((Number) m3u0Var.getValue()).floatValue() > 0.0f);
            case 21:
                return Boolean.valueOf(((Number) m3u0Var.getValue()).floatValue() > 0.0f);
            default:
                quz0 quz0Var = (quz0) m3u0Var.getValue();
                if (quz0Var != null) {
                    return quz0Var.b;
                }
                return null;
        }
    }
}
