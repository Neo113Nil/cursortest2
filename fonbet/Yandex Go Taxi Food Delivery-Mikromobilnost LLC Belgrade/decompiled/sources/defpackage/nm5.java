package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class nm5 implements om5 {
    public final String a;

    public nm5(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nm5) && jl40.l(this.a, ((nm5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("SwipeDismissedAction(userInput=", this.a, Extension.C_BRAKE);
    }
}
