package defpackage;

/* loaded from: classes.dex */
public final class iu7 implements rur {
    public static final iu7 a = new iu7();
    public static Boolean b;

    @Override // defpackage.rur
    public final void b(boolean z) {
        b = Boolean.valueOf(z);
    }

    @Override // defpackage.rur
    public final boolean g() {
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw x4e.v("canFocus is read before it is written");
    }
}
