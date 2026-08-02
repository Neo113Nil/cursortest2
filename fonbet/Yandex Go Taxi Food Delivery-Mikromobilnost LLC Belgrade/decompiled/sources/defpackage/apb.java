package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class apb {
    public final String a;
    public final ArrayList b;
    public final gob c;

    public apb(String str, ArrayList arrayList, gob gobVar) {
        this.a = str;
        this.b = arrayList;
        this.c = gobVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apb)) {
            return false;
        }
        apb apbVar = (apb) obj;
        return jl40.l(this.a, apbVar.a) && this.b.equals(apbVar.b) && this.c.equals(apbVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ly3.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder m = x4e.m("ChildCompoundOptionSelectUiState(title=", this.a, ", optionsGroups=", ", closeButtonState=", this.b);
        m.append(this.c);
        m.append(Extension.C_BRAKE);
        return m.toString();
    }
}
