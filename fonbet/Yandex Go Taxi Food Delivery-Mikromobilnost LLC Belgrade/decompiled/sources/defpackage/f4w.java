package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lf4w;", "", "Companion", "d4w", "e4w", "go-client-android.features.requirements:models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class f4w {
    public static final e4w Companion = new e4w();
    public final String a;
    public final String b;

    public /* synthetic */ f4w(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f4w)) {
            return false;
        }
        f4w f4wVar = (f4w) obj;
        return jl40.l(this.a, f4wVar.a) && jl40.l(this.b, f4wVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("InstructionLabelKeys(instructionLabelKey=", this.a, ", localInstructionLabelKey=", this.b, Extension.C_BRAKE);
    }

    public f4w() {
        this.a = "";
        this.b = "";
    }
}
