package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;

/* compiled from: ClassifiedsUIBlockPositionRecord.kt */
/* loaded from: classes16.dex */
public final class fhc {
    public final int a;
    public final UIBlock b;

    public fhc(int i, UIBlock uIBlock) {
        this.a = i;
        this.b = uIBlock;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fhc)) {
            return false;
        }
        fhc fhcVar = (fhc) obj;
        return this.a == fhcVar.a && epx.f(this.b, fhcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ClassifiedsUIBlockPositionRecord(position=" + this.a + ", block=" + this.b + ')';
    }
}
