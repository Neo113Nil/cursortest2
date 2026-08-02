package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class lt51 {
    public static final lt51 d = new lt51(EmptyList.a, dx51.a, qu51.a);
    public final List a;
    public final ex51 b;
    public final ru51 c;

    public lt51(List list, ex51 ex51Var, ru51 ru51Var) {
        this.a = list;
        this.b = ex51Var;
        this.c = ru51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lt51)) {
            return false;
        }
        lt51 lt51Var = (lt51) obj;
        return this.a.equals(lt51Var.a) && this.b.equals(lt51Var.b) && this.c.equals(lt51Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "YbPaymentMethods(paymentMethods=" + this.a + ", splitState=" + this.b + ", saverState=" + this.c + Extension.C_BRAKE;
    }
}
