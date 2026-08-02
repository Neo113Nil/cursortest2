package xsna;

import java.util.ArrayList;

/* compiled from: VoipCallServiceSearchSection.kt */
/* loaded from: classes7.dex */
public final class xiw0 {
    public final String a;
    public final String b;
    public final ArrayList c;

    public xiw0(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xiw0)) {
            return false;
        }
        xiw0 xiw0Var = (xiw0) obj;
        return epx.f(this.a, xiw0Var.a) && epx.f(this.b, xiw0Var.b) && this.c.equals(xiw0Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return this.c.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VoipCallServiceSearchSection(sectionId=");
        sb.append(this.a);
        sb.append(", nextSection=");
        sb.append(this.b);
        sb.append(", userList=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.c);
    }
}
