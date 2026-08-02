package defpackage;

import com.ybsdk.widgets.common.bottomsheet.h;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class p8b0 implements s8b0 {
    public final String a;
    public final h b;
    public final y390 c;

    public p8b0(String str, h hVar, y390 y390Var) {
        this.a = str;
        this.b = hVar;
        this.c = y390Var;
    }

    @Override // defpackage.s8b0
    public final String a() {
        return this.a;
    }

    @Override // defpackage.s8b0
    public final h b() {
        return this.b;
    }

    public final y390 c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p8b0)) {
            return false;
        }
        p8b0 p8b0Var = (p8b0) obj;
        return this.a.equals(p8b0Var.a) && this.b.equals(p8b0Var.b) && this.c.equals(p8b0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Date(associatedFilterId=" + tab0.a(this.a) + ", toolbarState=" + this.b + ", calendarViewState=" + this.c + Extension.C_BRAKE;
    }
}
