package xsna;

/* compiled from: VkExperiments.kt */
/* loaded from: classes.dex */
public final class h6v0 implements qsu0 {
    public static final h6v0 a = new h6v0();
    public static final wh50 b;
    public static final wh50 c;

    static {
        Boolean bool = Boolean.FALSE;
        b = androidx.compose.runtime.k.b(bool);
        c = androidx.compose.runtime.k.b(bool);
    }

    public static void b(boolean z) {
        ((zak0) c).setValue(Boolean.valueOf(z));
    }

    @Override // xsna.qsu0
    public final boolean a() {
        return ((Boolean) ((zak0) b).getValue()).booleanValue();
    }
}
