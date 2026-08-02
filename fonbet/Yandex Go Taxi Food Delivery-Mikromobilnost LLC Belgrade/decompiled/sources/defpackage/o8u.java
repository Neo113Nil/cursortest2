package defpackage;

import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.RequisitesLegalTransferPayloadEntity;
import com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.RequisiteTarget;
import com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.TransferRequisiteResultEntity;
import com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.TransferRequisiteScreenParams;
import com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.state.ItemType;

/* loaded from: classes3.dex */
public final class o8u extends n15 {
    public final n4u0 x;
    public final TransferRequisiteScreenParams y;

    public o8u(n4u0 n4u0Var, eg01 eg01Var, TransferRequisiteScreenParams transferRequisiteScreenParams, crj0 crj0Var) {
        super(0, n4u0Var, eg01Var, crj0Var);
        this.x = n4u0Var;
        this.y = transferRequisiteScreenParams;
    }

    @Override // defpackage.n15
    public final TransferRequisiteResultEntity g() {
        Boolean bool;
        n4u0 n4u0Var = this.x;
        dh90 dh90Var = ((zq01) n4u0Var.getValue()).a;
        ch90 ch90Var = dh90Var instanceof ch90 ? (ch90) dh90Var : null;
        if (ch90Var != null) {
            yg90 yg90Var = ch90Var.a;
            tq01 b = ((zq01) n4u0Var.getValue()).b();
            oq01 oq01Var = b instanceof oq01 ? (oq01) b : null;
            if (oq01Var != null) {
                String b2 = dtb1.b(oq01Var, ItemType.ACCOUNT_NUMBER);
                String b3 = dtb1.b(oq01Var, ItemType.BIC);
                String b4 = dtb1.b(oq01Var, ItemType.PAYMENT_PURPOSE);
                String b5 = dtb1.b(oq01Var, ItemType.INN);
                RequisiteTarget requisiteTarget = new RequisiteTarget(yg90Var.a, yg90Var.b);
                String b6 = dtb1.b(oq01Var, ItemType.BENEFICIARY_NAME);
                String b7 = dtb1.b(oq01Var, ItemType.PERSONAL_ACCOUNT);
                String b8 = dtb1.b(oq01Var, ItemType.PAYMENT_PERIOD);
                Object obj = oq01Var.b.get(ItemType.VAT);
                xqj0 xqj0Var = obj instanceof xqj0 ? (xqj0) obj : null;
                if (xqj0Var != null && (bool = xqj0Var.b) != null) {
                    boolean booleanValue = bool.booleanValue();
                    RequisitesLegalTransferPayloadEntity legalValidation = this.y.getRequisitePayload().getLegalValidation();
                    return new TransferRequisiteResultEntity.Hcs(b2, b3, b5, b6, b7, b8, booleanValue, b4, requisiteTarget, legalValidation != null ? legalValidation.getDivkitWidget() : null);
                }
                x4c.g("[requisites] no chip selected on button click", null, null, null, 14);
            }
        }
        return null;
    }

    @Override // defpackage.n15
    public final boolean i(vqj0 vqj0Var) {
        return false;
    }
}
