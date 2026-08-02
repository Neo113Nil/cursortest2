package defpackage;

import com.ybsdk.core.transfer.utils.domain.entities.PartnerEntity;
import com.ybsdk.feature.transfer.internal.screens.phone.adapter.ListContentData$Partner$Status;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ary {
    public final PartnerEntity a;
    public final ListContentData$Partner$Status b;

    public ary(PartnerEntity partnerEntity, ListContentData$Partner$Status listContentData$Partner$Status) {
        this.a = partnerEntity;
        this.b = listContentData$Partner$Status;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ary)) {
            return false;
        }
        ary aryVar = (ary) obj;
        return jl40.l(this.a, aryVar.a) && this.b == aryVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Partner(partner=" + this.a + ", status=" + this.b + Extension.C_BRAKE;
    }
}
