package defpackage;

import com.ybsdk.feature.transfer.version2.api.TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadEntity$FormEntityType;
import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class oo01 {
    public final TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadEntity$FormEntityType a;
    public final ArrayList b;

    public oo01(TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadEntity$FormEntityType transferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadEntity$FormEntityType, ArrayList arrayList) {
        this.a = transferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadEntity$FormEntityType;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oo01)) {
            return false;
        }
        oo01 oo01Var = (oo01) obj;
        return this.a == oo01Var.a && this.b.equals(oo01Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FormPayloadEntity(formType=" + this.a + ", formPayloadItems=" + this.b + Extension.C_BRAKE;
    }
}
