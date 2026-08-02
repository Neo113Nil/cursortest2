package xsna;

import java.util.ArrayList;

/* compiled from: VoipCallServicePatch.kt */
/* loaded from: classes7.dex */
public final class kiw0 implements niw0 {
    public final String b;
    public final String c;
    public final ArrayList d;

    public kiw0(String str, String str2, ArrayList arrayList) {
        this.b = str;
        this.c = str2;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kiw0)) {
            return false;
        }
        kiw0 kiw0Var = (kiw0) obj;
        return epx.f(this.b, kiw0Var.b) && epx.f(this.c, kiw0Var.c) && this.d.equals(kiw0Var.d);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        return this.d.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(idSection=");
        sb.append(this.b);
        sb.append(", nextSection=");
        sb.append(this.c);
        sb.append(", itemList=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.d);
    }
}
