package defpackage;

import com.ybsdk.feature.change.payment.method.internal.data.DefaultPaymentMethodUnifiedStatusEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class bd9 {
    public final u8j0 a;
    public final boolean b;
    public final String c;
    public final DefaultPaymentMethodUnifiedStatusEntity d;

    public bd9(u8j0 u8j0Var, boolean z, String str, DefaultPaymentMethodUnifiedStatusEntity defaultPaymentMethodUnifiedStatusEntity) {
        this.a = u8j0Var;
        this.b = z;
        this.c = str;
        this.d = defaultPaymentMethodUnifiedStatusEntity;
    }

    public static bd9 a(bd9 bd9Var, u8j0 u8j0Var, String str, DefaultPaymentMethodUnifiedStatusEntity defaultPaymentMethodUnifiedStatusEntity, int i) {
        if ((i & 1) != 0) {
            u8j0Var = bd9Var.a;
        }
        boolean z = (i & 2) != 0 ? bd9Var.b : false;
        if ((i & 4) != 0) {
            str = bd9Var.c;
        }
        if ((i & 8) != 0) {
            defaultPaymentMethodUnifiedStatusEntity = bd9Var.d;
        }
        bd9Var.getClass();
        return new bd9(u8j0Var, z, str, defaultPaymentMethodUnifiedStatusEntity);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bd9)) {
            return false;
        }
        bd9 bd9Var = (bd9) obj;
        return jl40.l(this.a, bd9Var.a) && this.b == bd9Var.b && jl40.l(this.c, bd9Var.c) && this.d == bd9Var.d;
    }

    public final int hashCode() {
        int e = unr0.e(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        DefaultPaymentMethodUnifiedStatusEntity defaultPaymentMethodUnifiedStatusEntity = this.d;
        return hashCode + (defaultPaymentMethodUnifiedStatusEntity != null ? defaultPaymentMethodUnifiedStatusEntity.hashCode() : 0);
    }

    public final String toString() {
        return "ChangePaymentMethodState(changePaymentMethodEntity=" + this.a + ", isFirstLaunch=" + this.b + ", urlFor3ds=" + this.c + ", paymentMethodStatus=" + this.d + Extension.C_BRAKE;
    }

    public bd9() {
        this(0);
    }

    public /* synthetic */ bd9(int i) {
        this(new t8j0(), true, null, null);
    }
}
