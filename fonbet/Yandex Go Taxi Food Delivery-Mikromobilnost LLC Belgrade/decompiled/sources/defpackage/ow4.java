package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.textfield.TextInputLayout;
import com.yandex.messaging.input.b;
import com.ybsdk.feature.qr.payments.internal.screens.list.presentation.QrSubscriptionsListFragment;
import ru.CryptoPro.JCSP.tools.common.window.CSPSelectReader;
import ru.cprocsp.ACSP.tools.common.ErrorMessageDialog;
import ru.rt.ebs.cryptosdk.presentation.base.BaseActivity;

/* loaded from: classes15.dex */
public final /* synthetic */ class ow4 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ow4(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i2) {
            case 0:
                BaseActivity.showCancelVerificationDialog$lambda$2((BaseActivity) obj2, obj, dialogInterface, i);
                break;
            case 1:
                ((CSPSelectReader) obj2).lambda$onCreateDialog$1((TextInputLayout) obj, dialogInterface, i);
                break;
            case 2:
                j4n j4nVar = (j4n) obj2;
                ((BottomSheetDialog) j4nVar.b).dismiss();
                Toast.makeText((Context) j4nVar.a, (String) j4nVar.w, 0).show();
                ((Runnable) obj).run();
                break;
            case 3:
                ((ErrorMessageDialog) obj2).lambda$onCreateDialog$0((FragmentActivity) obj, dialogInterface, i);
                break;
            case 4:
                QrSubscriptionsListFragment.showRemoveDialog$lambda$6((QrSubscriptionsListFragment) obj2, (p0v0) obj, dialogInterface, i);
                break;
            default:
                b00 b00Var = ((b) ((yfa) obj2).a).p.a;
                ((Handler) b00Var.a.get()).post(new jz(b00Var, (String) obj, 1));
                break;
        }
    }
}
