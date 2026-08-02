package defpackage;

import com.yandex.go.taxi.order.models.api.response.OrderChangesDto;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ho70 implements io70 {
    public final tb9 a;
    public final OrderChangesDto.PendingChangeDto b;

    public ho70(tb9 tb9Var, OrderChangesDto.PendingChangeDto pendingChangeDto) {
        this.a = tb9Var;
        this.b = pendingChangeDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ho70)) {
            return false;
        }
        ho70 ho70Var = (ho70) obj;
        return this.a.equals(ho70Var.a) && this.b.equals(ho70Var.b);
    }

    @Override // defpackage.io70
    public final tb9 getPayload() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(payload=" + this.a + ", changeDto=" + this.b + Extension.C_BRAKE;
    }
}
