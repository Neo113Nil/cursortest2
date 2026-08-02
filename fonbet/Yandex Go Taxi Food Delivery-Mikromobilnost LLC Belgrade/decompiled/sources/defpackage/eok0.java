package defpackage;

import com.yandex.go.taxi.order.models.api.response.status.RideCardTimerDto;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class eok0 {
    public final String a;
    public final int b;
    public final RideCardTimerDto.TimerType c;
    public final String d;

    public eok0(String str, int i, RideCardTimerDto.TimerType timerType, String str2) {
        this.a = str;
        this.b = i;
        this.c = timerType;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eok0)) {
            return false;
        }
        eok0 eok0Var = (eok0) obj;
        return this.a.equals(eok0Var.a) && this.b == eok0Var.b && this.c == eok0Var.c && jl40.l(this.d, eok0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + oyr.b(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder u = b64.u(this.b, "TimeProgressFormat(template=", this.a, ", numberCount=", ", timerType=");
        u.append(this.c);
        u.append(", orderId=");
        u.append(this.d);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
