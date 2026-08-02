package defpackage;

/* loaded from: classes7.dex */
public final class n381 {
    public static String a(b081 b081Var) {
        if (b081Var instanceof xk71) {
            String str = ((xk71) b081Var).a.h;
            return str == null ? "unknown" : str;
        }
        if (b081Var instanceof vn71) {
            return "default";
        }
        if (b081Var instanceof kh71) {
            return "custom";
        }
        if (b081Var instanceof sq71) {
            return "error";
        }
        if (b081Var instanceof st71) {
            return "browser";
        }
        if (b081Var instanceof bx71) {
            return "internal_browser";
        }
        w511.b();
        return null;
    }
}
