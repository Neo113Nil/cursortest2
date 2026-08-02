package yads;

/* loaded from: classes10.dex */
public abstract class jv1 {
    public static kv1 a() {
        kv1 kv1Var;
        kv1 kv1Var2 = kv1.b;
        if (kv1Var2 != null) {
            return kv1Var2;
        }
        synchronized (kv1.c) {
            kv1Var = kv1.b;
            if (kv1Var == null) {
                kv1Var = new kv1();
                kv1.b = kv1Var;
            }
        }
        return kv1Var;
    }
}
