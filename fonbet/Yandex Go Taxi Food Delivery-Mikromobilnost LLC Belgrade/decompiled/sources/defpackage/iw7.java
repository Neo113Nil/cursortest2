package defpackage;

import com.yandex.delivery.mapper.model.CancelType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class iw7 {
    public final String a;
    public final CancelType b;

    public iw7(String str, CancelType cancelType) {
        this.a = str;
        this.b = cancelType;
    }

    public final CancelType a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iw7)) {
            return false;
        }
        iw7 iw7Var = (iw7) obj;
        return jl40.l(this.a, iw7Var.a) && this.b == iw7Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ConfirmButton(title=" + this.a + ", cancelType=" + this.b + Extension.C_BRAKE;
    }
}
