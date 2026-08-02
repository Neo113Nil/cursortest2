package defpackage;

import com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.TransferRequisiteResultEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class gr01 extends jr01 {
    public final TransferRequisiteResultEntity a;

    public gr01(TransferRequisiteResultEntity transferRequisiteResultEntity) {
        this.a = transferRequisiteResultEntity;
    }

    public final TransferRequisiteResultEntity a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gr01) && this.a.equals(((gr01) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RequisiteSuccess(result=" + this.a + Extension.C_BRAKE;
    }
}
