package xsna;

/* compiled from: YandexNativeAdLoader.kt */
/* loaded from: classes14.dex */
public final class gv50 {
    public final String a;

    public gv50(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gv50) && epx.f(this.a, ((gv50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("NativeAdLoadParams(adUnitId="), this.a, ')');
    }
}
