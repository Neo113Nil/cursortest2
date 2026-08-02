package defpackage;

import android.net.Uri;
import android.os.Bundle;
import com.ybsdk.feature.transfer.version2.internal.screens.result.TransferMainResultFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class ek01 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ TransferMainResultFragment b;

    public /* synthetic */ ek01(TransferMainResultFragment transferMainResultFragment, int i) {
        this.a = i;
        this.b = transferMainResultFragment;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        boolean widgetsAdapter_delegate$lambda$1$lambda$0;
        zy11 onViewCreated$lambda$4;
        int i = this.a;
        TransferMainResultFragment transferMainResultFragment = this.b;
        switch (i) {
            case 0:
                widgetsAdapter_delegate$lambda$1$lambda$0 = TransferMainResultFragment.widgetsAdapter_delegate$lambda$1$lambda$0(transferMainResultFragment, (Uri) obj, (spl) obj2);
                return Boolean.valueOf(widgetsAdapter_delegate$lambda$1$lambda$0);
            default:
                onViewCreated$lambda$4 = TransferMainResultFragment.onViewCreated$lambda$4(transferMainResultFragment, (String) obj, (Bundle) obj2);
                return onViewCreated$lambda$4;
        }
    }
}
