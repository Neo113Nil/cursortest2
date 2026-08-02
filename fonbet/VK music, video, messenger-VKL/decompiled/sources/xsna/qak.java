package xsna;

/* compiled from: CreateVkEmailContract.kt */
/* loaded from: classes15.dex */
public final class qak {
    public final boolean a;
    public final String b;
    public final boolean c;

    public qak(String str, boolean z, boolean z2) {
        this.a = z;
        this.b = str;
        this.c = z2;
    }

    public static qak a(qak qakVar, boolean z, String str, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = qakVar.a;
        }
        if ((i & 2) != 0) {
            str = qakVar.b;
        }
        if ((i & 4) != 0) {
            z2 = qakVar.c;
        }
        qakVar.getClass();
        return new qak(str, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qak)) {
            return false;
        }
        qak qakVar = (qak) obj;
        return this.a == qakVar.a && epx.f(this.b, qakVar.b) && this.c == qakVar.c;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InputStatus(hasFocus=");
        sb.append(this.a);
        sb.append(", error=");
        sb.append(this.b);
        sb.append(", locked=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
