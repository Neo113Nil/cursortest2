package ru.mail.libverify.api.model;

import ru.mail.libverify.q0.b;
import ru.mail.libverify.requests.VerifyApiRequest;
import ru.mail.verify.core.utils.Gsonable;
import xsna.zcl;

/* loaded from: classes9.dex */
public final class CodeDeliveryInfo implements Gsonable {

    @b("route_type")
    private final VerifyApiRequest.VerifyChecks routeType;
    private final CodeDeliveryStatus status;

    /* JADX WARN: Multi-variable type inference failed */
    public CodeDeliveryInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CodeDeliveryInfo copy$default(CodeDeliveryInfo codeDeliveryInfo, VerifyApiRequest.VerifyChecks verifyChecks, CodeDeliveryStatus codeDeliveryStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            verifyChecks = codeDeliveryInfo.routeType;
        }
        if ((i & 2) != 0) {
            codeDeliveryStatus = codeDeliveryInfo.status;
        }
        return codeDeliveryInfo.copy(verifyChecks, codeDeliveryStatus);
    }

    public final VerifyApiRequest.VerifyChecks component1() {
        return this.routeType;
    }

    public final CodeDeliveryStatus component2() {
        return this.status;
    }

    public final CodeDeliveryInfo copy(VerifyApiRequest.VerifyChecks verifyChecks, CodeDeliveryStatus codeDeliveryStatus) {
        return new CodeDeliveryInfo(verifyChecks, codeDeliveryStatus);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CodeDeliveryInfo)) {
            return false;
        }
        CodeDeliveryInfo codeDeliveryInfo = (CodeDeliveryInfo) obj;
        return this.routeType == codeDeliveryInfo.routeType && this.status == codeDeliveryInfo.status;
    }

    public final VerifyApiRequest.VerifyChecks getRouteType() {
        return this.routeType;
    }

    public final CodeDeliveryStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.status.hashCode() + (this.routeType.hashCode() * 31);
    }

    public String toString() {
        return "";
    }

    public CodeDeliveryInfo(VerifyApiRequest.VerifyChecks verifyChecks, CodeDeliveryStatus codeDeliveryStatus) {
        this.routeType = verifyChecks;
        this.status = codeDeliveryStatus;
    }

    public /* synthetic */ CodeDeliveryInfo(VerifyApiRequest.VerifyChecks verifyChecks, CodeDeliveryStatus codeDeliveryStatus, int i, zcl zclVar) {
        this((i & 1) != 0 ? VerifyApiRequest.VerifyChecks.MESSENGER : verifyChecks, (i & 2) != 0 ? CodeDeliveryStatus.UNKNOWN : codeDeliveryStatus);
    }
}
