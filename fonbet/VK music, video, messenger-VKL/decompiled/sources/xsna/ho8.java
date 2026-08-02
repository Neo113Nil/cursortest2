package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class ho8 implements plp0 {
    public static String a(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    public static StringBuilder b(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    @Override // xsna.plp0
    public Object apply(Object obj) {
        kti0 kti0Var = (kti0) obj;
        lti0.a.getClass();
        String a = lti0.b.a(kti0Var);
        kti0Var.a.name();
        return a.getBytes(emb.b);
    }
}
