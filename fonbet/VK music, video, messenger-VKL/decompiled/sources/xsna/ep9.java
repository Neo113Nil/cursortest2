package xsna;

/* compiled from: NodeKind.kt */
/* loaded from: classes11.dex */
public final class ep9 implements jwr {
    public static final ep9 a = new ep9();
    public static Boolean b;

    @Override // xsna.jwr
    public final void c(boolean z) {
        b = Boolean.valueOf(z);
    }

    @Override // xsna.jwr
    public final boolean r0() {
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw pm0.f("canFocus is read before it is written");
    }
}
