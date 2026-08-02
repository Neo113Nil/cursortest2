package defpackage;

import com.ybsdk.feature.transfer.version2.internal.screens.me2me.list.domain.AutoPullPermissionEntity$Status;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ks3 {
    public final String a;
    public final String b;
    public final rbv c;
    public final String d;
    public final AutoPullPermissionEntity$Status e;

    public ks3(String str, String str2, rbv rbvVar, String str3, AutoPullPermissionEntity$Status autoPullPermissionEntity$Status) {
        this.a = str;
        this.b = str2;
        this.c = rbvVar;
        this.d = str3;
        this.e = autoPullPermissionEntity$Status;
    }

    public final String a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ks3)) {
            return false;
        }
        ks3 ks3Var = (ks3) obj;
        return jl40.l(this.a, ks3Var.a) && jl40.l(this.b, ks3Var.b) && this.c.equals(ks3Var.c) && jl40.l(this.d, ks3Var.d) && this.e == ks3Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.b(ly3.c(this.c, unr0.b(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder v = b64.v("AutoPullPermissionEntity(id=", this.a, ", title=", this.b, ", logo=");
        v.append(this.c);
        v.append(", actionDescription=");
        v.append(this.d);
        v.append(", status=");
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
