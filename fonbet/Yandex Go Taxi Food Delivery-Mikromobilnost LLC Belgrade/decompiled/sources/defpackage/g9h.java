package defpackage;

import android.view.KeyEvent;
import android.view.View;
import com.yandex.go.payments.shared.SharedPaymentAnalytics$CloseReason;
import com.yandex.go.payments.shared.members.list.b;
import com.yandex.plus.pay.ui.common.api.log.PlusPayLogLayoutInflaterFactory;
import com.ybsdk.feature.kyc.internal.screens.photov3.PhotoFragment;
import ru.CryptoPro.JCSP.tools.common.window.DefaultCspBioGuiCustomizer;

/* loaded from: classes13.dex */
public final /* synthetic */ class g9h implements View.OnKeyListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g9h(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        boolean lambda$onCreateView$1;
        boolean onViewCreated$lambda$0;
        boolean addPressLogging$lambda$4;
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                lambda$onCreateView$1 = ((DefaultCspBioGuiCustomizer) obj).lambda$onCreateView$1(view, i, keyEvent);
                return lambda$onCreateView$1;
            case 1:
                b bVar = (b) obj;
                if (i == 4 && keyEvent.getAction() != 0) {
                    bVar.B.r(SharedPaymentAnalytics$CloseReason.ANDROID_BACK_BUTTON);
                }
                return false;
            case 2:
                onViewCreated$lambda$0 = PhotoFragment.onViewCreated$lambda$0((PhotoFragment) obj, view, i, keyEvent);
                return onViewCreated$lambda$0;
            case 3:
                addPressLogging$lambda$4 = PlusPayLogLayoutInflaterFactory.addPressLogging$lambda$4((PlusPayLogLayoutInflaterFactory) obj, view, i, keyEvent);
                return addPressLogging$lambda$4;
            default:
                Runnable runnable = (Runnable) obj;
                if (4 != i || keyEvent.getAction() != 1) {
                    return false;
                }
                runnable.run();
                return true;
        }
    }
}
