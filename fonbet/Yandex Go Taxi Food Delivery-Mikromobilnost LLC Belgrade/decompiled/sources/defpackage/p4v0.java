package defpackage;

import com.yandex.messaging.core.net.entities.directives.Button;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class p4v0 {
    public final long a;
    public final Button[] b;
    public final List c;

    public p4v0(long j, Button[] buttonArr, List list) {
        this.a = j;
        this.b = buttonArr;
        this.c = list;
    }

    public static p4v0 a(p4v0 p4v0Var, ArrayList arrayList) {
        long j = p4v0Var.a;
        Button[] buttonArr = p4v0Var.b;
        p4v0Var.getClass();
        return new p4v0(j, buttonArr, arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p4v0)) {
            return false;
        }
        p4v0 p4v0Var = (p4v0) obj;
        return this.a == p4v0Var.a && jl40.l(this.b, p4v0Var.b) && jl40.l(this.c, p4v0Var.c);
    }

    public final int hashCode() {
        int hashCode = (Arrays.hashCode(this.b) + (Long.hashCode(this.a) * 31)) * 31;
        List list = this.c;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder k = x4e.k("SuggestButtons(sourceMessageId=", this.a, ", buttons=", Arrays.toString(this.b));
        k.append(", translations=");
        k.append(this.c);
        k.append(Extension.C_BRAKE);
        return k.toString();
    }
}
