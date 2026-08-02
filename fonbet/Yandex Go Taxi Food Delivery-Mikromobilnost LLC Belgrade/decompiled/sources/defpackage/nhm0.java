package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.feature.main.internal.domain.entities.sbpPartners.Status;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class nhm0 {
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final ThemedImageUrlEntity e;
    public final qhm0 f;
    public final hu5 g;
    public final Status h;

    public nhm0(boolean z, String str, String str2, String str3, ThemedImageUrlEntity themedImageUrlEntity, qhm0 qhm0Var, hu5 hu5Var, Status status) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = themedImageUrlEntity;
        this.f = qhm0Var;
        this.g = hu5Var;
        this.h = status;
    }

    public static nhm0 a(nhm0 nhm0Var, Status status) {
        boolean z = nhm0Var.a;
        String str = nhm0Var.b;
        String str2 = nhm0Var.c;
        String str3 = nhm0Var.d;
        ThemedImageUrlEntity themedImageUrlEntity = nhm0Var.e;
        qhm0 qhm0Var = nhm0Var.f;
        hu5 hu5Var = nhm0Var.g;
        nhm0Var.getClass();
        return new nhm0(z, str, str2, str3, themedImageUrlEntity, qhm0Var, hu5Var, status);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nhm0)) {
            return false;
        }
        nhm0 nhm0Var = (nhm0) obj;
        return this.a == nhm0Var.a && jl40.l(this.b, nhm0Var.b) && jl40.l(this.c, nhm0Var.c) && jl40.l(this.d, nhm0Var.d) && this.e.equals(nhm0Var.e) && jl40.l(this.f, nhm0Var.f) && jl40.l(this.g, nhm0Var.g) && this.h == nhm0Var.h;
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int c = xvz.c(this.e, (b + (str == null ? 0 : str.hashCode())) * 31, 31);
        qhm0 qhm0Var = this.f;
        int hashCode = (c + (qhm0Var == null ? 0 : qhm0Var.hashCode())) * 31;
        hu5 hu5Var = this.g;
        return this.h.hashCode() + ((hashCode + (hu5Var != null ? hu5Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = ly3.v("SbpPartnerEntity(isEnabled=", ", nspkId=", this.b, ", title=", this.a);
        g8e.D(v, this.c, ", subtitle=", this.d, ", image=");
        v.append(this.e);
        v.append(", yandexBankPayload=");
        v.append(this.f);
        v.append(", bindAccountSheetOverrides=");
        v.append(this.g);
        v.append(", status=");
        v.append(this.h);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
