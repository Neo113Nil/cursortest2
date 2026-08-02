package xsna;

/* compiled from: ProfileAction.kt */
/* loaded from: classes5.dex */
public final class ztu {
    public final int a;
    public final int b;

    public ztu(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ztu)) {
            return false;
        }
        ztu ztuVar = (ztu) obj;
        return this.a == ztuVar.a && this.b == ztuVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HardcodeRes(textId=");
        sb.append(this.a);
        sb.append(", imageId=");
        return vu5.b(sb, this.b, ')');
    }
}
