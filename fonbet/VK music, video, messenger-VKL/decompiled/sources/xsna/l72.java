package xsna;

/* compiled from: ContentDataType.android.kt */
@vby
/* loaded from: classes11.dex */
public final class l72 implements cgj {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof l72) {
            return this.a == ((l72) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return uqi.a("AndroidContentDataType(androidAutofillType=", this.a, ')');
    }
}
