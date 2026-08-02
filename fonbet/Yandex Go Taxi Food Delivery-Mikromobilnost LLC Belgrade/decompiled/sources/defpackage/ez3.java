package defpackage;

import com.ybsdk.core.common.domain.entities.ActionButtonEntity;
import com.ybsdk.core.common.domain.entities.CommonSheetEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.autotopup.internal.presentation.result.AutoTopupLogoResultStatus;
import com.ybsdk.widgets.common.OperationProgressView;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.l;

/* loaded from: classes3.dex */
public final class ez3 implements ev31 {
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f0  */
    @Override // defpackage.ev31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        rbv nbvVar;
        qc70 lVar;
        qc70 qc70Var;
        Text text;
        Text text2;
        wy3 wy3Var = (wy3) obj;
        AutoTopupLogoResultStatus autoTopupLogoResultStatus = wy3Var.g;
        ThemedImageUrlEntity themedImageUrlEntity = wy3Var.a;
        if (themedImageUrlEntity == null || (nbvVar = job1.f(themedImageUrlEntity, new at3(6))) == null) {
            nbvVar = new nbv(txg0.ybsdk_ic_yb_placeholder, null);
        }
        rbv rbvVar = nbvVar;
        Text text3 = wy3Var.b;
        Text text4 = wy3Var.c;
        ActionButtonEntity actionButtonEntity = wy3Var.d;
        YbButtonView.a aVar = (actionButtonEntity == null || (text2 = actionButtonEntity.getText()) == null) ? null : new YbButtonView.a(text2, null, null, null, null, null, null, false, false, null, 4094);
        ActionButtonEntity actionButtonEntity2 = wy3Var.e;
        YbButtonView.a aVar2 = (actionButtonEntity2 == null || (text = actionButtonEntity2.getText()) == null) ? null : new YbButtonView.a(text, null, null, null, null, null, null, false, false, null, 4094);
        int[] iArr = dz3.a;
        int i = iArr[autoTopupLogoResultStatus.ordinal()];
        qc70 qc70Var2 = oc70.a;
        switch (i) {
            case 1:
                lVar = new l(OperationProgressView.StatusIcon.SUCCESS);
                qc70Var = lVar;
                boolean z = wy3Var.h;
                switch (iArr[autoTopupLogoResultStatus.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        break;
                    case 6:
                        qc70Var2 = pc70.a;
                        break;
                    default:
                        w511.b();
                        break;
                }
                qc70 qc70Var3 = qc70Var2;
                Text text5 = wy3Var.j;
                CommonSheetEntity commonSheetEntity = wy3Var.f;
                break;
            case 2:
                lVar = new l(OperationProgressView.StatusIcon.ERROR);
                qc70Var = lVar;
                boolean z2 = wy3Var.h;
                switch (iArr[autoTopupLogoResultStatus.ordinal()]) {
                }
                qc70 qc70Var32 = qc70Var2;
                Text text52 = wy3Var.j;
                CommonSheetEntity commonSheetEntity2 = wy3Var.f;
                break;
            case 3:
                lVar = new l(OperationProgressView.StatusIcon.TIMEOUT);
                qc70Var = lVar;
                boolean z22 = wy3Var.h;
                switch (iArr[autoTopupLogoResultStatus.ordinal()]) {
                }
                qc70 qc70Var322 = qc70Var2;
                Text text522 = wy3Var.j;
                CommonSheetEntity commonSheetEntity22 = wy3Var.f;
                break;
            case 4:
            case 5:
            case 6:
                qc70Var = qc70Var2;
                boolean z222 = wy3Var.h;
                switch (iArr[autoTopupLogoResultStatus.ordinal()]) {
                }
                qc70 qc70Var3222 = qc70Var2;
                Text text5222 = wy3Var.j;
                CommonSheetEntity commonSheetEntity222 = wy3Var.f;
                break;
            default:
                w511.b();
                break;
        }
        return null;
    }
}
