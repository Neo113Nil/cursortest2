package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class od21 extends n351 {
    public final c0k0 c;
    public final List d;
    public final tkb0 e;
    public final l690 f;
    public final String g;
    public final String h;

    public od21(c0k0 c0k0Var, List list, tkb0 tkb0Var, l690 l690Var, String str, String str2) {
        super("uploaded-images-preview", false, 14);
        this.c = c0k0Var;
        this.d = list;
        this.e = tkb0Var;
        this.f = l690Var;
        this.g = str;
        this.h = str2;
    }

    @Override // defpackage.n351
    public final String a() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof od21)) {
            return false;
        }
        od21 od21Var = (od21) obj;
        return this.c.equals(od21Var.c) && jl40.l(this.d, od21Var.d) && this.e.equals(od21Var.e) && this.f.equals(od21Var.f) && jl40.l(this.g, od21Var.g) && jl40.l(this.h, od21Var.h);
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + ((this.e.hashCode() + unr0.c(this.c.hashCode() * 31, 31, this.d)) * 31)) * 31;
        String str = this.g;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UploadedImagesModel(resultPosition=");
        sb.append(this.c);
        sb.append(", images=");
        sb.append(this.d);
        sb.append(", imageConfig=");
        sb.append(this.e);
        sb.append(", contentPaddings=");
        sb.append(this.f);
        sb.append(", metricaLabel=");
        return g8e.r(sb, this.g, ", id=", this.h, Extension.C_BRAKE);
    }
}
