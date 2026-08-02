package defpackage;

import android.net.Uri;
import com.ybsdk.feature.transfer.version2.internal.screens.result.TransferMainResultFragment;
import java.util.List;

/* loaded from: classes3.dex */
public final /* synthetic */ class dk01 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ TransferMainResultFragment b;

    public /* synthetic */ dk01(TransferMainResultFragment transferMainResultFragment, int i) {
        this.a = i;
        this.b = transferMainResultFragment;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 quickActionsAdapter_delegate$lambda$3$lambda$2;
        zy11 ensureWeb3dsView$lambda$35$lambda$33;
        boolean onViewCreated$lambda$9$lambda$5;
        int i = this.a;
        TransferMainResultFragment transferMainResultFragment = this.b;
        switch (i) {
            case 0:
                quickActionsAdapter_delegate$lambda$3$lambda$2 = TransferMainResultFragment.quickActionsAdapter_delegate$lambda$3$lambda$2(transferMainResultFragment, (List) obj);
                return quickActionsAdapter_delegate$lambda$3$lambda$2;
            case 1:
                ensureWeb3dsView$lambda$35$lambda$33 = TransferMainResultFragment.ensureWeb3dsView$lambda$35$lambda$33(transferMainResultFragment, (Throwable) obj);
                return ensureWeb3dsView$lambda$35$lambda$33;
            default:
                onViewCreated$lambda$9$lambda$5 = TransferMainResultFragment.onViewCreated$lambda$9$lambda$5(transferMainResultFragment, (Uri) obj);
                return Boolean.valueOf(onViewCreated$lambda$9$lambda$5);
        }
    }
}
