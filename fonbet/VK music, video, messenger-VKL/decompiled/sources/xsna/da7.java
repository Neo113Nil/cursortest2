package xsna;

import java.util.ArrayList;

/* compiled from: BirthdayModalInfo.kt */
/* loaded from: classes6.dex */
public final class da7 {
    public final String a;
    public final String b;
    public final ArrayList c;

    public da7(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof da7)) {
            return false;
        }
        da7 da7Var = (da7) obj;
        return epx.f(this.a, da7Var.a) && epx.f(this.b, da7Var.b) && this.c.equals(da7Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BirthdayModalInfo(modalTitle=");
        sb.append(this.a);
        sb.append(", modalSubtitle=");
        sb.append(this.b);
        sb.append(", birthdaysGroups=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.c);
    }
}
