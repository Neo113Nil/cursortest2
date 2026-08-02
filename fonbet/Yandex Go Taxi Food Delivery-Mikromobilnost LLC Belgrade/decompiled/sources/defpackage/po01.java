package defpackage;

import com.ybsdk.feature.transfer.version2.api.TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadItemEntity$FormPayloadItemEntityType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class po01 {
    public final TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadItemEntity$FormPayloadItemEntityType a;
    public final int b;

    public po01(TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadItemEntity$FormPayloadItemEntityType transferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadItemEntity$FormPayloadItemEntityType, int i) {
        this.a = transferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadItemEntity$FormPayloadItemEntityType;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof po01)) {
            return false;
        }
        po01 po01Var = (po01) obj;
        return this.a == po01Var.a && this.b == po01Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FormPayloadItemEntity(itemType=" + this.a + ", maxInputLength=" + this.b + Extension.C_BRAKE;
    }
}
