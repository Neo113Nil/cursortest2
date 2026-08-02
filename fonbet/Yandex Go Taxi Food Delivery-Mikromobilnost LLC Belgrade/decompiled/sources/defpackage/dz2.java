package defpackage;

import android.content.DialogInterface;
import com.yandex.messaging.internal.view.timeline.k;
import com.ybsdk.feature.qr.payments.internal.screens.list.presentation.QrSubscriptionsListFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.fpspay.presentation.FpsPayEnrollFragment;
import ru.cprocsp.ACSP.tools.common.AppUtils;
import ru.rt.ebs.cryptosdk.presentation.base.BaseActivity;

/* loaded from: classes15.dex */
public final /* synthetic */ class dz2 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;

    public /* synthetic */ dz2(int i) {
        this.a = i;
    }

    private final void a(DialogInterface dialogInterface, int i) {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.a) {
            case 0:
                AppUtils.lambda$showWarning$1(dialogInterface, i);
                break;
            case 1:
                BaseActivity.showCancelVerificationDialog$lambda$3(dialogInterface, i);
                break;
            case 2:
                dialogInterface.cancel();
                break;
            case 3:
                FpsPayEnrollFragment.showErrorDialog$lambda$19(dialogInterface, i);
                break;
            case 4:
                int i2 = k.E0;
                break;
            case 5:
                QrSubscriptionsListFragment.showRemoveDialog$lambda$5(dialogInterface, i);
                break;
            case 6:
                dialogInterface.dismiss();
                break;
            case 7:
                dialogInterface.cancel();
                break;
            case 8:
                dialogInterface.dismiss();
                break;
        }
    }
}
