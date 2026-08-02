package defpackage;

import android.content.Context;
import com.ybsdk.core.common.domain.entities.ActionButtonEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams;
import com.ybsdk.feature.transfer.version2.api.entities.StatusIconType;
import com.ybsdk.feature.transfer.version2.api.entities.TransferHeaderEntity;
import com.ybsdk.feature.transfer.version2.api.entities.TransferQuickActionEntity;
import com.ybsdk.feature.transfer.version2.api.entities.TransferResultPageEntity;
import com.ybsdk.feature.transfer.version2.internal.entities.ResultStatus;
import com.ybsdk.feature.transfer.version2.internal.screens.result.Required3dsPageState;
import com.ybsdk.widgets.common.OperationProgressView;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public final class jk01 implements ev31 {
    public final Context a;

    public jk01(Context context) {
        this.a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0228 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x033e  */
    @Override // defpackage.ev31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        OperationProgressView.StatusIcon statusIcon;
        rbv nbvVar;
        vty0 vty0Var;
        vty0 vty0Var2;
        vty0 vty0Var3;
        stz0 stz0Var;
        ThemedImageUrlEntity image;
        String description;
        String title;
        qc70 qc70Var;
        Text.Constant i;
        ActionButtonEntity primaryButton;
        Integer valueOf;
        YbButtonView.a aVar;
        List<TransferQuickActionEntity> quickActions;
        Text text;
        Text text2;
        v9j0 v9j0Var;
        kk01 kk01Var = (kk01) obj;
        Required3dsPageState required3dsPageState = kk01Var.l;
        TransferMainResultScreenParams transferMainResultScreenParams = kk01Var.b;
        Text text3 = kk01Var.g;
        Text text4 = kk01Var.f;
        ResultStatus resultStatus = kk01Var.c;
        TransferResultPageEntity transferResultPageEntity = kk01Var.a;
        StatusIconType statusIconType = transferResultPageEntity.getStatusIconType();
        int i2 = statusIconType == null ? -1 : ik01.a[statusIconType.ordinal()];
        int i3 = 4;
        int i4 = 3;
        if (i2 == -1) {
            statusIcon = null;
        } else if (i2 == 1) {
            statusIcon = OperationProgressView.StatusIcon.ERROR;
        } else if (i2 == 2) {
            statusIcon = OperationProgressView.StatusIcon.SUCCESS;
        } else if (i2 == 3) {
            statusIcon = OperationProgressView.StatusIcon.TIMEOUT;
        } else {
            if (i2 != 4) {
                w511.b();
                return null;
            }
            statusIcon = OperationProgressView.StatusIcon.WARNING;
        }
        rr51 divkitWidget = transferResultPageEntity.getDivkitWidget();
        List<TransferQuickActionEntity> list = kk01Var.i;
        if (kk01Var.d != null) {
            list = null;
        }
        String comment = transferResultPageEntity.getComment();
        if (comment != null && !evu0.J(comment) && !this.a.getResources().getBoolean(oog0.ybsdk_can_show_banner)) {
            list = null;
        }
        List<TransferQuickActionEntity> list2 = EmptyList.a;
        List<TransferQuickActionEntity> list3 = list == null ? list2 : list;
        ThemedImageUrlEntity image2 = transferResultPageEntity.getImage();
        if (image2 == null || (nbvVar = job1.f(image2, new ri01(i4))) == null) {
            nbvVar = new nbv(txg0.ybsdk_ic_yb_placeholder, null);
        }
        rbv rbvVar = nbvVar;
        int[] iArr = ik01.b;
        switch (iArr[resultStatus.ordinal()]) {
            case 1:
                vty0Var = new vty0(g8e.i(Text.Companion, transferResultPageEntity.getTitle()), l1i0.Widget_YB_Text_Numbers2);
                break;
            case 2:
                if (text4 == null) {
                    text4 = g8e.i(Text.Companion, transferResultPageEntity.getTitle());
                }
                vty0Var = new vty0(text4, l1i0.Widget_YB_Text_Numbers2);
                break;
            case 3:
                if (text4 == null) {
                    text4 = g8e.i(Text.Companion, transferResultPageEntity.getTitle());
                }
                vty0Var = new vty0(text4, l1i0.Widget_YB_Text_Headline2);
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                if (text4 == null) {
                    text4 = g8e.i(Text.Companion, transferResultPageEntity.getTitle());
                }
                vty0Var = new vty0(text4, l1i0.Widget_YB_Text_Headline2);
                break;
            default:
                w511.b();
                return null;
        }
        vty0 vty0Var4 = vty0Var;
        switch (iArr[resultStatus.ordinal()]) {
            case 1:
                vty0Var2 = new vty0(g8e.i(Text.Companion, transferResultPageEntity.getDescription()), transferMainResultScreenParams instanceof TransferMainResultScreenParams.B2cTransferParams ? l1i0.Widget_YB_Text_Body2_Secondary : l1i0.Widget_YB_Text_Body2);
                if (iArr[resultStatus.ordinal()] == 1 || required3dsPageState != Required3dsPageState.PAGE_SUCCESS) {
                    TransferHeaderEntity header = transferResultPageEntity.getHeader();
                    Text i5 = (header != null || (title = header.getTitle()) == null) ? Text.Empty.INSTANCE : g8e.i(Text.Companion, title);
                    TransferHeaderEntity header2 = transferResultPageEntity.getHeader();
                    Text.Constant i6 = (header2 != null || (description = header2.getDescription()) == null) ? null : g8e.i(Text.Companion, description);
                    TransferHeaderEntity header3 = transferResultPageEntity.getHeader();
                    stz0Var = new stz0(i5, i6, null, (header3 != null || (image = header3.getImage()) == null) ? null : job1.f(image, new ri01(5)), null, null, false, null, null, null, null, null, 32756);
                } else {
                    stz0Var = new stz0(Text.Empty.INSTANCE, null, null, null, null, null, false, null, null, null, null, null, 32766);
                }
                stz0 stz0Var2 = stz0Var;
                switch (iArr[resultStatus.ordinal()]) {
                    case 1:
                        qc70Var = pc70.a;
                        break;
                    case 2:
                        if (statusIcon == null) {
                            statusIcon = OperationProgressView.StatusIcon.SUCCESS;
                        }
                        qc70Var = new l(statusIcon);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        if (statusIcon == null) {
                            statusIcon = OperationProgressView.StatusIcon.TIMEOUT;
                        }
                        qc70Var = new l(statusIcon);
                        break;
                    case 6:
                        qc70Var = oc70.a;
                        break;
                    case 7:
                        if (statusIcon == null) {
                            statusIcon = OperationProgressView.StatusIcon.ERROR;
                        }
                        qc70Var = new l(statusIcon);
                        break;
                    default:
                        w511.b();
                        break;
                }
                qc70 qc70Var2 = qc70Var;
                switch (iArr[resultStatus.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 6:
                        String comment2 = transferResultPageEntity.getComment();
                        if (comment2 != null) {
                            i = g8e.i(Text.Companion, comment2);
                            p39 p39Var = kk01Var.j;
                            x49 a = p39Var == null ? q39.a(p39Var) : null;
                            String str = (iArr[resultStatus.ordinal()] == 1 || (v9j0Var = kk01Var.k) == null) ? null : v9j0Var.a;
                            boolean z = iArr[resultStatus.ordinal()] != 1 && required3dsPageState == Required3dsPageState.PAGE_SUCCESS;
                            primaryButton = transferResultPageEntity.getPrimaryButton();
                            if (primaryButton != null || (text2 = primaryButton.getText()) == null) {
                                if (kk01Var.h != null) {
                                    switch (iArr[resultStatus.ordinal()]) {
                                        case 1:
                                        case 3:
                                            valueOf = null;
                                            break;
                                        case 2:
                                            valueOf = Integer.valueOf(dzh0.ybsdk_transfer_button_great);
                                            break;
                                        case 4:
                                        case 6:
                                            valueOf = Integer.valueOf(dzh0.ybsdk_transfer_button_agree);
                                            break;
                                        case 5:
                                        case 7:
                                            valueOf = Integer.valueOf(dzh0.ybsdk_transfer_button_ok);
                                            break;
                                        default:
                                            w511.b();
                                            break;
                                    }
                                } else {
                                    valueOf = Integer.valueOf(dzh0.ybsdk_common_support_chat_button_title);
                                }
                                aVar = new YbButtonView.a(valueOf == null ? new Text.Resource(valueOf.intValue()) : null, null, null, null, null, null, null, false, false, null, 4094);
                            } else {
                                aVar = new YbButtonView.a(text2, null, null, null, null, null, null, false, false, null, 4094);
                            }
                            YbButtonView.a aVar2 = aVar;
                            ActionButtonEntity secondaryButton = transferResultPageEntity.getSecondaryButton();
                            YbButtonViewGroup.b bVar = new YbButtonViewGroup.b(null, aVar2, (secondaryButton != null || (text = secondaryButton.getText()) == null) ? null : new YbButtonView.a(text, null, null, null, null, null, null, false, false, null, 4094), null, 9);
                            quickActions = transferResultPageEntity.getQuickActions();
                            if (quickActions != null) {
                                list2 = quickActions;
                            }
                            List<TransferQuickActionEntity> list4 = list2;
                            ArrayList arrayList = new ArrayList(tcc.n(list4, 10));
                            for (TransferQuickActionEntity transferQuickActionEntity : list4) {
                                Text.Constant i7 = g8e.i(Text.Companion, transferQuickActionEntity.getTitle());
                                rbv f = job1.f(transferQuickActionEntity.getIcon(), new ri01(i3));
                                if (f == null) {
                                    f = new nbv(vxg0.ybsdk_ic_circle_gray, null);
                                }
                                arrayList.add(new un01(i7, f, transferQuickActionEntity.getActions()));
                            }
                            break;
                        }
                        break;
                    case 4:
                    case 5:
                    case 7:
                        i = null;
                        p39 p39Var2 = kk01Var.j;
                        if (p39Var2 == null) {
                        }
                        if (iArr[resultStatus.ordinal()] == 1) {
                            break;
                        }
                        if (iArr[resultStatus.ordinal()] != 1) {
                            break;
                        }
                        boolean z2 = iArr[resultStatus.ordinal()] != 1 && required3dsPageState == Required3dsPageState.PAGE_SUCCESS;
                        primaryButton = transferResultPageEntity.getPrimaryButton();
                        if (primaryButton != null) {
                            break;
                        }
                        if (kk01Var.h != null) {
                        }
                        aVar = new YbButtonView.a(valueOf == null ? new Text.Resource(valueOf.intValue()) : null, null, null, null, null, null, null, false, false, null, 4094);
                        YbButtonView.a aVar22 = aVar;
                        ActionButtonEntity secondaryButton2 = transferResultPageEntity.getSecondaryButton();
                        if (secondaryButton2 != null) {
                            break;
                        }
                        YbButtonViewGroup.b bVar2 = new YbButtonViewGroup.b(null, aVar22, (secondaryButton2 != null || (text = secondaryButton2.getText()) == null) ? null : new YbButtonView.a(text, null, null, null, null, null, null, false, false, null, 4094), null, 9);
                        quickActions = transferResultPageEntity.getQuickActions();
                        if (quickActions != null) {
                        }
                        List<TransferQuickActionEntity> list42 = list2;
                        ArrayList arrayList2 = new ArrayList(tcc.n(list42, 10));
                        while (r1.hasNext()) {
                        }
                        break;
                    default:
                        w511.b();
                        break;
                }
            case 2:
            case 3:
            case 6:
                if (text3 == null) {
                    text3 = g8e.i(Text.Companion, transferResultPageEntity.getDescription());
                }
                vty0Var2 = new vty0(text3, transferMainResultScreenParams instanceof TransferMainResultScreenParams.B2cTransferParams ? l1i0.Widget_YB_Text_Body2_Secondary : l1i0.Widget_YB_Text_Body2);
                if (iArr[resultStatus.ordinal()] == 1) {
                    break;
                }
                TransferHeaderEntity header4 = transferResultPageEntity.getHeader();
                if (header4 != null) {
                    break;
                }
                Text i52 = (header4 != null || (title = header4.getTitle()) == null) ? Text.Empty.INSTANCE : g8e.i(Text.Companion, title);
                TransferHeaderEntity header22 = transferResultPageEntity.getHeader();
                if (header22 != null) {
                    break;
                }
                TransferHeaderEntity header32 = transferResultPageEntity.getHeader();
                if (header32 != null) {
                    break;
                }
                stz0Var = new stz0(i52, i6, null, (header32 != null || (image = header32.getImage()) == null) ? null : job1.f(image, new ri01(5)), null, null, false, null, null, null, null, null, 32756);
                stz0 stz0Var22 = stz0Var;
                switch (iArr[resultStatus.ordinal()]) {
                }
                qc70 qc70Var22 = qc70Var;
                switch (iArr[resultStatus.ordinal()]) {
                }
            case 4:
                if (text3 == null) {
                    text3 = g8e.i(Text.Companion, transferResultPageEntity.getDescription());
                }
                vty0Var3 = new vty0(text3, l1i0.Widget_YB_Text_Body2_Secondary);
                vty0Var2 = vty0Var3;
                if (iArr[resultStatus.ordinal()] == 1) {
                }
                TransferHeaderEntity header42 = transferResultPageEntity.getHeader();
                Text i522 = (header42 != null || (title = header42.getTitle()) == null) ? Text.Empty.INSTANCE : g8e.i(Text.Companion, title);
                TransferHeaderEntity header222 = transferResultPageEntity.getHeader();
                if (header222 != null) {
                }
                TransferHeaderEntity header322 = transferResultPageEntity.getHeader();
                stz0Var = new stz0(i522, i6, null, (header322 != null || (image = header322.getImage()) == null) ? null : job1.f(image, new ri01(5)), null, null, false, null, null, null, null, null, 32756);
                stz0 stz0Var222 = stz0Var;
                switch (iArr[resultStatus.ordinal()]) {
                }
                qc70 qc70Var222 = qc70Var;
                switch (iArr[resultStatus.ordinal()]) {
                }
            case 5:
            case 7:
                if (text3 != null) {
                    vty0Var3 = new vty0(text3, l1i0.Widget_YB_Text_Body2_Secondary);
                    vty0Var2 = vty0Var3;
                    if (iArr[resultStatus.ordinal()] == 1) {
                    }
                    TransferHeaderEntity header422 = transferResultPageEntity.getHeader();
                    Text i5222 = (header422 != null || (title = header422.getTitle()) == null) ? Text.Empty.INSTANCE : g8e.i(Text.Companion, title);
                    TransferHeaderEntity header2222 = transferResultPageEntity.getHeader();
                    if (header2222 != null) {
                    }
                    TransferHeaderEntity header3222 = transferResultPageEntity.getHeader();
                    stz0Var = new stz0(i5222, i6, null, (header3222 != null || (image = header3222.getImage()) == null) ? null : job1.f(image, new ri01(5)), null, null, false, null, null, null, null, null, 32756);
                    stz0 stz0Var2222 = stz0Var;
                    switch (iArr[resultStatus.ordinal()]) {
                    }
                    qc70 qc70Var2222 = qc70Var;
                    switch (iArr[resultStatus.ordinal()]) {
                    }
                } else {
                    vty0Var2 = null;
                    if (iArr[resultStatus.ordinal()] == 1) {
                    }
                    TransferHeaderEntity header4222 = transferResultPageEntity.getHeader();
                    Text i52222 = (header4222 != null || (title = header4222.getTitle()) == null) ? Text.Empty.INSTANCE : g8e.i(Text.Companion, title);
                    TransferHeaderEntity header22222 = transferResultPageEntity.getHeader();
                    if (header22222 != null) {
                    }
                    TransferHeaderEntity header32222 = transferResultPageEntity.getHeader();
                    stz0Var = new stz0(i52222, i6, null, (header32222 != null || (image = header32222.getImage()) == null) ? null : job1.f(image, new ri01(5)), null, null, false, null, null, null, null, null, 32756);
                    stz0 stz0Var22222 = stz0Var;
                    switch (iArr[resultStatus.ordinal()]) {
                    }
                    qc70 qc70Var22222 = qc70Var;
                    switch (iArr[resultStatus.ordinal()]) {
                    }
                }
            default:
                w511.b();
                break;
        }
        return null;
    }
}
