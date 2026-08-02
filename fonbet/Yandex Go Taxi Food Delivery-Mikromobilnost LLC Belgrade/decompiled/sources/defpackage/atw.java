package defpackage;

import android.widget.EditText;
import com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.forminput.presentation.InternetPaymentFormInputFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.selectprovider.presentation.InternetPaymentSelectProviderFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.selectcontact.presentation.MobilePaymentSelectContactFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.phone.TransferPhoneInputFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class atw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditText b;

    public /* synthetic */ atw(EditText editText, int i) {
        this.a = i;
        this.b = editText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        EditText editText = this.b;
        switch (i) {
            case 0:
                editText.requestFocus();
                break;
            case 1:
                InternetPaymentFormInputFragment.consumeSideEffect$lambda$12$lambda$11(editText);
                break;
            case 2:
                InternetPaymentSelectProviderFragment.consumeSideEffect$lambda$14$lambda$13(editText);
                break;
            case 3:
                MobilePaymentSelectContactFragment.consumeSideEffect$lambda$9$lambda$8(editText);
                break;
            case 4:
                editText.requestFocus();
                break;
            case 5:
                TransferPhoneInputFragment.consumeSideEffect$lambda$17$lambda$16(editText);
                break;
            default:
                TransferPhoneInputFragment.consumeSideEffect$lambda$19$lambda$18(editText);
                break;
        }
    }
}
