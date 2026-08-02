package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.explicit_comment_courier.requirement.common.DeliveryCommentRequirementType;

/* loaded from: classes5.dex */
public final class pzh {
    public final DeliveryCommentRequirementType a;
    public final String b;

    public pzh(DeliveryCommentRequirementType deliveryCommentRequirementType, String str) {
        this.a = deliveryCommentRequirementType;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pzh)) {
            return false;
        }
        pzh pzhVar = (pzh) obj;
        return this.a == pzhVar.a && jl40.l(this.b, pzhVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "DeliveryCommentRequirementInfo(requirementType=" + this.a + ", subtitle=" + this.b + Extension.C_BRAKE;
    }
}
