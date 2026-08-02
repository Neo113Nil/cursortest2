package defpackage;

import com.ybsdk.core.transfer.utils.TransferCommentView;
import com.ybsdk.feature.transfer.version2.internal.screens.main.presentation.TransferMainFragment;
import com.ybsdk.widgets.common.Tooltip$DismissReason;

/* loaded from: classes2.dex */
public final /* synthetic */ class lh01 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ TransferCommentView b;

    public /* synthetic */ lh01(TransferCommentView transferCommentView, int i) {
        this.a = i;
        this.b = transferCommentView;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 showTooltip$lambda$10;
        zy11 commentValidator_delegate$lambda$2$lambda$1;
        zy11 showCommentDialogView$lambda$80$lambda$79$lambda$78;
        int i = this.a;
        TransferCommentView transferCommentView = this.b;
        switch (i) {
            case 0:
                showTooltip$lambda$10 = TransferCommentView.showTooltip$lambda$10(transferCommentView, (Tooltip$DismissReason) obj);
                return showTooltip$lambda$10;
            case 1:
                commentValidator_delegate$lambda$2$lambda$1 = TransferCommentView.commentValidator_delegate$lambda$2$lambda$1(transferCommentView, (String) obj);
                return commentValidator_delegate$lambda$2$lambda$1;
            default:
                showCommentDialogView$lambda$80$lambda$79$lambda$78 = TransferMainFragment.showCommentDialogView$lambda$80$lambda$79$lambda$78(transferCommentView, (pk31) obj);
                return showCommentDialogView$lambda$80$lambda$79$lambda$78;
        }
    }
}
