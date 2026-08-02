package defpackage;

import com.yandex.delivery.mapper.model.DisplayTarget;
import java.util.Collections;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ouh extends quh {
    public final String a;
    public final List b;

    public ouh(String str) {
        List singletonList = Collections.singletonList(DisplayTarget.MULTIORDER);
        this.a = str;
        this.b = singletonList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ouh)) {
            return false;
        }
        ouh ouhVar = (ouh) obj;
        return jl40.l(this.a, ouhVar.a) && jl40.l(this.b, ouhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return nnm.h("MarketStub(originalOrderId=", this.a, ", displayTargets=", Extension.C_BRAKE, this.b);
    }
}
