package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes12.dex */
public final class hfa0 {
    public static final hfa0 c = new hfa0(EmptyList.a, null);
    public final List a;
    public final shq0 b;

    public hfa0(List list, shq0 shq0Var) {
        this.a = list;
        this.b = shq0Var;
    }

    public final h8b0 a() {
        h8b0 h8b0Var;
        Iterator it = this.a.iterator();
        do {
            h8b0Var = null;
            if (!it.hasNext()) {
                break;
            }
            lea0 lea0Var = (lea0) it.next();
            if (lea0Var instanceof h8b0) {
                h8b0Var = (h8b0) lea0Var;
            }
        } while (h8b0Var == null);
        return h8b0Var;
    }

    public final lea0 b() {
        shq0 shq0Var = this.b;
        if (shq0Var != null) {
            return shq0Var.a;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[LOOP:0: B:6:0x0012->B:19:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final h8b0 c() {
        lea0 lea0Var;
        h8b0 h8b0Var;
        shq0 shq0Var = this.b;
        if (shq0Var != null && (lea0Var = shq0Var.b) != null) {
            for (lea0 lea0Var2 : this.a) {
                if (lea0Var2 instanceof h8b0) {
                    h8b0Var = (h8b0) lea0Var2;
                    if (lea0Var.c() == PaymentMethod$Type.PERSONAL_WALLET && jl40.l(lea0Var.getId(), h8b0Var.a)) {
                        if (h8b0Var == null) {
                            return h8b0Var;
                        }
                    }
                }
                hst hstVar = jst.e;
                ke00 a = hstVar.b.a();
                if (a != null && a.b(15)) {
                    a.a(15, "PaymentOptions", null, "Complement payment with id " + lea0Var.getId() + " and type " + lea0Var.c() + " not found in payment models.", hstVar.a);
                }
                h8b0Var = null;
                if (h8b0Var == null) {
                }
            }
        }
        return null;
    }

    public final m6a0 d() {
        shq0 shq0Var = this.b;
        if (shq0Var == null) {
            return null;
        }
        lea0 lea0Var = shq0Var.a;
        PaymentMethod$Type c2 = lea0Var.c();
        String id = lea0Var.getId();
        lea0 lea0Var2 = shq0Var.b;
        return new m6a0(c2, id, lea0Var2 != null ? new m6a0(lea0Var2.c(), lea0Var2.getId(), null) : null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hfa0)) {
            return false;
        }
        hfa0 hfa0Var = (hfa0) obj;
        return jl40.l(this.a, hfa0Var.a) && jl40.l(this.b, hfa0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        shq0 shq0Var = this.b;
        return hashCode + (shq0Var == null ? 0 : shq0Var.hashCode());
    }

    public final String toString() {
        return "PaymentOptions(paymentModels=" + this.a + ", selectedPaymentMethod=" + this.b + Extension.C_BRAKE;
    }
}
