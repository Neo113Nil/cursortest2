package xsna;

/* compiled from: AndroidFontResolveInterceptor.android.kt */
/* loaded from: classes11.dex */
public final class x82 implements zta0 {
    public final int a;

    public x82(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x82) && this.a == ((x82) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.a, ')');
    }
}
