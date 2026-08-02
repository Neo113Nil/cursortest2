package xsna;

/* compiled from: AndroidTextStyle.android.kt */
/* loaded from: classes11.dex */
public final class yta0 {
    public static final yta0 c = new yta0();
    public final boolean a;
    public final int b;

    public yta0(int i) {
        this.a = false;
        this.b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yta0)) {
            return false;
        }
        yta0 yta0Var = (yta0) obj;
        return this.a == yta0Var.a && this.b == yta0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.a + ", emojiSupportMatch=" + ((Object) ydp.a(this.b)) + ')';
    }

    public yta0(int i, boolean z) {
        this.a = z;
        this.b = i;
    }

    public yta0() {
        this(0, false);
    }
}
