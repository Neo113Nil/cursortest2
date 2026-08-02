package defpackage;

import com.ybsdk.feature.card.api.entities.YbCardStatusEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class mq51 extends hz91 {
    public final YbCardStatusEntity c;
    public final boolean d;
    public final boolean e;
    public final rbv f;

    public mq51(YbCardStatusEntity ybCardStatusEntity, boolean z, boolean z2, rbv rbvVar) {
        this.c = ybCardStatusEntity;
        this.d = z;
        this.e = z2;
        this.f = rbvVar;
    }

    @Override // defpackage.hz91
    public final rbv a() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mq51)) {
            return false;
        }
        mq51 mq51Var = (mq51) obj;
        return this.c == mq51Var.c && this.d == mq51Var.d && this.e == mq51Var.e && jl40.l(this.f, mq51Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + unr0.e(unr0.e(this.c.hashCode() * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "Existed(cardStatus=" + this.c + ", issued=" + this.d + ", cardPromoAvailable=" + this.e + ", icon=" + this.f + Extension.C_BRAKE;
    }
}
