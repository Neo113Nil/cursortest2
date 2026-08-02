package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.feature.testpayment.internal.domain.entities.TestPaymentStatusEntity$Failed$ErrorType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class hhy0 implements lhy0 {
    public final ThemedImageUrlEntity a;
    public final String b;
    public final String c;
    public final ygy0 d;
    public final ygy0 e;
    public final TestPaymentStatusEntity$Failed$ErrorType f;

    public hhy0(ThemedImageUrlEntity themedImageUrlEntity, String str, String str2, ygy0 ygy0Var, ygy0 ygy0Var2, TestPaymentStatusEntity$Failed$ErrorType testPaymentStatusEntity$Failed$ErrorType) {
        this.a = themedImageUrlEntity;
        this.b = str;
        this.c = str2;
        this.d = ygy0Var;
        this.e = ygy0Var2;
        this.f = testPaymentStatusEntity$Failed$ErrorType;
    }

    @Override // defpackage.lhy0
    public final ygy0 a() {
        return this.e;
    }

    @Override // defpackage.lhy0
    public final ygy0 b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hhy0)) {
            return false;
        }
        hhy0 hhy0Var = (hhy0) obj;
        return this.a.equals(hhy0Var.a) && jl40.l(this.b, hhy0Var.b) && jl40.l(this.c, hhy0Var.c) && this.d.equals(hhy0Var.d) && jl40.l(this.e, hhy0Var.e) && this.f == hhy0Var.f;
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        ygy0 ygy0Var = this.e;
        return this.f.hashCode() + ((hashCode + (ygy0Var == null ? 0 : ygy0Var.hashCode())) * 31);
    }

    public final String toString() {
        return "Failed(memberImage=" + this.a + ", title=" + this.b + ", description=" + this.c + ", primaryButton=" + this.d + ", secondaryButton=" + this.e + ", analyticsErrorType=" + this.f + Extension.C_BRAKE;
    }
}
