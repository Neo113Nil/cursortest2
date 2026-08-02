package defpackage;

import com.ybsdk.core.common.domain.entities.cache.ExpireableEntity$Behaviour;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class aso implements sro {
    public final Object a;
    public final long b;
    public final long c;
    public final ExpireableEntity$Behaviour d;

    public aso(Object obj, long j, long j2, ExpireableEntity$Behaviour expireableEntity$Behaviour) {
        this.a = obj;
        this.b = j;
        this.c = j2;
        this.d = expireableEntity$Behaviour;
    }

    public final Object a(boolean z) {
        Object obj = this.a;
        if (z || System.currentTimeMillis() <= xga1.d(this)) {
            return obj;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aso)) {
            return false;
        }
        aso asoVar = (aso) obj;
        return jl40.l(this.a, asoVar.a) && this.b == asoVar.b && this.c == asoVar.c && this.d == asoVar.d;
    }

    @Override // defpackage.sro
    public final long getReceivedAt() {
        return this.c;
    }

    @Override // defpackage.sro
    public final long getTtl() {
        return this.b;
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.d.hashCode() + qv10.c(qv10.c((obj == null ? 0 : obj.hashCode()) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExpireableEntity(value=");
        sb.append(this.a);
        sb.append(", ttl=");
        sb.append(this.b);
        x4e.A(this.c, ", receivedAt=", ", behaviour=", sb);
        sb.append(this.d);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
