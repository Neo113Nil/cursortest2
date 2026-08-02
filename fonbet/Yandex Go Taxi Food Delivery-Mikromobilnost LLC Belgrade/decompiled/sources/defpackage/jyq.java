package defpackage;

import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class jyq extends keo {
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public jyq(String str, String str2, String str3) {
        super("card_input_field_validation_failed", b.i(new Pair("field_type", str), new Pair("error", str2), new Pair("trigger", "change"), new Pair("form_step", str3)));
        this.c = str;
        this.d = str2;
        this.e = "change";
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jyq)) {
            return false;
        }
        jyq jyqVar = (jyq) obj;
        return jl40.l(this.c, jyqVar.c) && jl40.l(this.d, jyqVar.d) && jl40.l(this.e, jyqVar.e) && jl40.l(this.f, jyqVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + unr0.b(unr0.b(this.c.hashCode() * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        return g8e.r(b64.v("FieldValidationFailedEvent(fieldType=", this.c, ", error=", this.d, ", trigger="), this.e, ", formStep=", this.f, Extension.C_BRAKE);
    }
}
