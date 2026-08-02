package defpackage;

import com.yandex.delivery.mapper.model.DisplayTarget;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class nuh extends quh {
    public final UUID a;
    public final List b;

    public nuh(UUID uuid) {
        List singletonList = Collections.singletonList(DisplayTarget.MULTIORDER);
        this.a = uuid;
        this.b = singletonList;
    }

    public final UUID a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nuh)) {
            return false;
        }
        nuh nuhVar = (nuh) obj;
        return jl40.l(this.a, nuhVar.a) && jl40.l(this.b, nuhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "C2CStub(localUuid=" + this.a + ", displayTargets=" + this.b + Extension.C_BRAKE;
    }
}
