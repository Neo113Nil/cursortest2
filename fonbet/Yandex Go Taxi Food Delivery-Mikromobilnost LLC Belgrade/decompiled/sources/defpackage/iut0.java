package defpackage;

import com.ybsdk.feature.split.deposit.internal.ui.b;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class iut0 implements jut0 {
    public final b a;
    public final String b;
    public final List c;

    public iut0(b bVar, String str, List list) {
        this.a = bVar;
        this.b = str;
        this.c = list;
    }

    public final String a() {
        return this.b;
    }

    public final List b() {
        return this.c;
    }

    public final b c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iut0)) {
            return false;
        }
        iut0 iut0Var = (iut0) obj;
        return this.a.equals(iut0Var.a) && jl40.l(this.b, iut0Var.b) && this.c.equals(iut0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(statusScreenViewState=");
        sb.append(this.a);
        sb.append(", challengeUrl=");
        sb.append(this.b);
        sb.append(", localVariables=");
        return ly3.s(sb, this.c, Extension.C_BRAKE);
    }
}
