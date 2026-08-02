package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class pfn {
    public final String a;
    public final String b;

    public pfn(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pfn)) {
            return false;
        }
        pfn pfnVar = (pfn) obj;
        return jl40.l(this.a, pfnVar.a) && jl40.l(this.b, pfnVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("EatsOrderTimelineItem(iconTag=", this.a, ", backgroundColor=", this.b, Extension.C_BRAKE);
    }
}
