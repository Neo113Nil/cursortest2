package xsna;

/* compiled from: HeightInLinesModifier.kt */
/* loaded from: classes11.dex */
public final class u1v {
    public static final void a(int i, int i2) {
        if (!(i > 0 && i2 > 0)) {
            xzw.a("both minLines " + i + " and maxLines " + i2 + " must be greater than zero");
        }
        if (i <= i2) {
            return;
        }
        xzw.a("minLines " + i + " must be less than or equal to maxLines " + i2);
    }
}
