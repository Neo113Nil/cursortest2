package defpackage;

import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class kxq extends keo {
    public final String c;
    public final String d;

    public kxq(String str, String str2) {
        super("card_input_field_completed", b.i(new Pair("field_type", str), new Pair("form_step", str2)));
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kxq)) {
            return false;
        }
        kxq kxqVar = (kxq) obj;
        return jl40.l(this.c, kxqVar.c) && jl40.l(this.d, kxqVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("FieldCompletedEvent(fieldType=", this.c, ", formStep=", this.d, Extension.C_BRAKE);
    }
}
