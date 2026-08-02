package defpackage;

import com.ybsdk.core.utils.text.Text;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class p29 implements s29 {
    public final List a;
    public final Text.Resource b;
    public final boolean c;

    public p29(ListBuilder listBuilder, Text.Resource resource, boolean z) {
        this.a = listBuilder;
        this.b = resource;
        this.c = z;
    }

    public final Text a() {
        return this.b;
    }

    public final List b() {
        return this.a;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p29)) {
            return false;
        }
        p29 p29Var = (p29) obj;
        return jl40.l(this.a, p29Var.a) && this.b.equals(p29Var.b) && this.c == p29Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + uw51.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(items=");
        sb.append(this.a);
        sb.append(", buttonText=");
        sb.append(this.b);
        sb.append(", submittingInProgress=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
