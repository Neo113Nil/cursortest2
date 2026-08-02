package xsna;

import java.io.IOException;

/* compiled from: LastLoadErrorSnapshot.kt */
/* loaded from: classes3.dex */
public final class amy {
    public final String a;
    public final Integer b;
    public final IOException c;

    public amy() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amy)) {
            return false;
        }
        amy amyVar = (amy) obj;
        return epx.f(this.a, amyVar.a) && epx.f(this.b, amyVar.b) && epx.f(this.c, amyVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        IOException iOException = this.c;
        return hashCode2 + (iOException != null ? iOException.hashCode() : 0);
    }

    public final String toString() {
        return "LastLoadErrorSnapshot(uri=" + this.a + ", dataType=" + this.b + ", error=" + this.c + ')';
    }

    public amy(String str, Integer num, IOException iOException) {
        this.a = str;
        this.b = num;
        this.c = iOException;
    }
}
