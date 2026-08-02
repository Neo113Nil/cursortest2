package xsna;

/* compiled from: InfoBarViewsCountData.kt */
/* loaded from: classes2.dex */
public final class qvw {
    public final int a;
    public final int b;

    public qvw(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static qvw a(qvw qvwVar, int i) {
        return new qvw(i, qvwVar.b);
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qvw)) {
            return false;
        }
        qvw qvwVar = (qvw) obj;
        return this.a == qvwVar.a && this.b == qvwVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InfoBarViewsCountData(viewsCount=");
        sb.append(this.a);
        sb.append(", hideAfterViewsCount=");
        return vu5.b(sb, this.b, ')');
    }
}
