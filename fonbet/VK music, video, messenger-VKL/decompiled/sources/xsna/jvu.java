package xsna;

/* compiled from: HashtagSpan.kt */
/* loaded from: classes2.dex */
public final class jvu extends ohl {
    public final String e;

    public jvu(String str) {
        super(3, null);
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jvu) && epx.f(this.e, ((jvu) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    @Override // android.text.style.ClickableSpan
    public final String toString() {
        return ho8.a(new StringBuilder("HashtagSpan(hashtag="), this.e, ')');
    }
}
