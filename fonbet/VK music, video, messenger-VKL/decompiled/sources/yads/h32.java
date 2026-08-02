package yads;

/* loaded from: classes10.dex */
public abstract class h32 {
    public static i32 a() {
        i32 i32Var;
        i32 i32Var2 = i32.b;
        if (i32Var2 != null) {
            return i32Var2;
        }
        synchronized (i32.a) {
            i32Var = i32.b;
            if (i32Var == null) {
                i32Var = new i32();
                i32.b = i32Var;
            }
        }
        return i32Var;
    }
}
