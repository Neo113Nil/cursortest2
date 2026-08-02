package defpackage;

import com.ybsdk.feature.transfer.version2.api.entities.MiddleNameEntity;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.RequisitesPersonTransferPayloadEntity;
import com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.RequisiteTarget;
import com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.TransferRequisiteResultEntity;
import com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.TransferRequisiteScreenParams;
import com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.state.ItemType;
import com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.state.TransferRequisiteFormItemType$PersonFormItemType;

/* loaded from: classes3.dex */
public final class f3b0 extends n15 {
    public final n4u0 x;
    public final TransferRequisiteScreenParams y;

    public f3b0(n4u0 n4u0Var, eg01 eg01Var, TransferRequisiteScreenParams transferRequisiteScreenParams, crj0 crj0Var) {
        super(0, n4u0Var, eg01Var, crj0Var);
        this.x = n4u0Var;
        this.y = transferRequisiteScreenParams;
    }

    @Override // defpackage.n15
    public final TransferRequisiteResultEntity g() {
        n4u0 n4u0Var = this.x;
        dh90 dh90Var = ((zq01) n4u0Var.getValue()).a;
        ch90 ch90Var = dh90Var instanceof ch90 ? (ch90) dh90Var : null;
        if (ch90Var != null) {
            yg90 yg90Var = ch90Var.a;
            tq01 b = ((zq01) n4u0Var.getValue()).b();
            sq01 sq01Var = b instanceof sq01 ? (sq01) b : null;
            if (sq01Var != null) {
                String b2 = dtb1.b(sq01Var, ItemType.FIRST_NAME);
                String b3 = dtb1.b(sq01Var, ItemType.LAST_NAME);
                String b4 = dtb1.b(sq01Var, ItemType.MIDDLE_NAME);
                Object obj = sq01Var.b.get(ItemType.MIDDLE_NAME_RADIO_BUTTON);
                wqj0 wqj0Var = obj instanceof wqj0 ? (wqj0) obj : null;
                MiddleNameEntity middleNameEntity = new MiddleNameEntity(b4, wqj0Var != null ? wqj0Var.b : false);
                String b5 = dtb1.b(sq01Var, ItemType.ACCOUNT_NUMBER);
                String b6 = dtb1.b(sq01Var, ItemType.BIC);
                String b7 = dtb1.b(sq01Var, ItemType.PAYMENT_PURPOSE);
                RequisiteTarget requisiteTarget = new RequisiteTarget(yg90Var.a, yg90Var.b);
                RequisitesPersonTransferPayloadEntity personValidation = this.y.getRequisitePayload().getPersonValidation();
                return new TransferRequisiteResultEntity.Person(b2, b3, middleNameEntity, b5, b6, b7, requisiteTarget, personValidation != null ? personValidation.getDivkitWidget() : null);
            }
        }
        return null;
    }

    @Override // defpackage.n15
    public final boolean i(vqj0 vqj0Var) {
        tq01 b = ((zq01) this.x.getValue()).b();
        sq01 sq01Var = b instanceof sq01 ? (sq01) b : null;
        if (sq01Var == null) {
            return false;
        }
        Object obj = sq01Var.b.get(ItemType.MIDDLE_NAME_RADIO_BUTTON);
        wqj0 wqj0Var = obj instanceof wqj0 ? (wqj0) obj : null;
        return wqj0Var != null && wqj0Var.b && vqj0Var.a == TransferRequisiteFormItemType$PersonFormItemType.MIDDLE_NAME;
    }
}
