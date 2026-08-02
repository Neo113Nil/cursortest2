package defpackage;

import com.yandex.go.sharing_personal_goals.SharingPersonalGoalsPrimaryButtonStyle;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class lrr0 {
    public final String a;
    public final SharingPersonalGoalsPrimaryButtonStyle b;
    public final brr0 c;

    public lrr0(String str, SharingPersonalGoalsPrimaryButtonStyle sharingPersonalGoalsPrimaryButtonStyle, brr0 brr0Var) {
        this.a = str;
        this.b = sharingPersonalGoalsPrimaryButtonStyle;
        this.c = brr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lrr0)) {
            return false;
        }
        lrr0 lrr0Var = (lrr0) obj;
        return jl40.l(this.a, lrr0Var.a) && this.b == lrr0Var.b && this.c.equals(lrr0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SharingPersonalGoalsButtonUiItem(title=" + this.a + ", style=" + this.b + ", action=" + this.c + Extension.C_BRAKE;
    }
}
