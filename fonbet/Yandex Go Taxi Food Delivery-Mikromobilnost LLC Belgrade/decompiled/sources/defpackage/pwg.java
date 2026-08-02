package defpackage;

import java.util.UUID;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes4.dex */
public final class pwg extends pyp0 {
    public static final owg Companion = new owg();
    public final String a;
    public final String b;
    public final Boolean c;
    public final String d;
    public final boolean e;

    public /* synthetic */ pwg(int i, String str, String str2, Boolean bool, String str3, boolean z) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, nwg.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = bool;
        if ((i & 8) == 0) {
            this.d = UUID.randomUUID().toString();
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = false;
        } else {
            this.e = z;
        }
    }

    @Override // defpackage.pyp0
    /* renamed from: c */
    public final String getA() {
        return this.d;
    }

    @Override // defpackage.pyp0
    /* renamed from: d */
    public final boolean getF() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!pwg.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        pwg pwgVar = (pwg) obj;
        return jl40.l(this.a, pwgVar.a) && jl40.l(this.b, pwgVar.b) && jl40.l(this.c, pwgVar.c) && jl40.l(this.d, pwgVar.d) && this.e == pwgVar.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool = this.c;
        return Boolean.hashCode(this.e) + unr0.b((hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder v = b64.v("DebugSection(message=", this.a, ", details=", this.b, ", crit=");
        v.append(this.c);
        v.append(", id=");
        v.append(this.d);
        v.append(", reloadable=");
        return x4e.i(v, this.e, Extension.C_BRAKE);
    }

    public pwg(String str, String str2) {
        String uuid = UUID.randomUUID().toString();
        this.a = str;
        this.b = str2;
        this.c = null;
        this.d = uuid;
        this.e = false;
    }
}
