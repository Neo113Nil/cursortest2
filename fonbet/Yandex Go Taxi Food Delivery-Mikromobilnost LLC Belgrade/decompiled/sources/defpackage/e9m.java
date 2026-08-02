package defpackage;

import android.view.View;
import com.yandex.go.scooters.misc.api.error_dialog.ScootersErrorDialogAnalyticsState;
import com.yandex.go.scooters.misc.error_dialog.ScootersErrorDialogAnalytics$TappedButton;
import com.yandex.go.scooters.misc.error_dialog.ScootersErrorDialogModalView;
import java.util.List;
import ru.yandex.taxi.logistics.sdk.ui.component.drag_drop_column.utils.ReorderHapticFeedbackType;

/* loaded from: classes13.dex */
public final class e9m implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ e9m(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
        this.x = obj4;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        rjn0 rjn0Var;
        jkn0 jkn0Var;
        List list;
        String str;
        rjn0 rjn0Var2;
        jkn0 jkn0Var2;
        List list2;
        String str2;
        rjn0 rjn0Var3;
        List list3;
        String str3;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj = this.x;
        Object obj2 = this.c;
        Object obj3 = this.b;
        Object obj4 = this.w;
        switch (i) {
            case 0:
                ((wls) obj3).invoke(Integer.valueOf(((yx40) obj2).getIntValue()), Integer.valueOf(((yx40) obj4).getIntValue()));
                t791.h((View) obj, ReorderHapticFeedbackType.END);
                break;
            default:
                ScootersErrorDialogAnalytics$TappedButton scootersErrorDialogAnalytics$TappedButton = (ScootersErrorDialogAnalytics$TappedButton) obj4;
                String str4 = (String) obj3;
                ScootersErrorDialogModalView scootersErrorDialogModalView = (ScootersErrorDialogModalView) obj2;
                if (str4 != null) {
                    rjn0Var3 = scootersErrorDialogModalView.scootersErrorDialogAnalytics;
                    list3 = scootersErrorDialogModalView.scooterNumbers;
                    str3 = scootersErrorDialogModalView.orderId;
                    rjn0Var3.b(str4, list3, scootersErrorDialogAnalytics$TappedButton, str3);
                } else {
                    rjn0Var = scootersErrorDialogModalView.scootersErrorDialogAnalytics;
                    jkn0Var = scootersErrorDialogModalView.dialogPresentation;
                    ScootersErrorDialogAnalyticsState scootersErrorDialogAnalyticsState = jkn0Var.a;
                    list = scootersErrorDialogModalView.scooterNumbers;
                    str = scootersErrorDialogModalView.orderId;
                    rjn0Var.a(scootersErrorDialogAnalyticsState, list, scootersErrorDialogAnalytics$TappedButton, str);
                }
                ((sls) obj).invoke();
                rjn0Var2 = scootersErrorDialogModalView.scootersErrorDialogAnalytics;
                jkn0Var2 = scootersErrorDialogModalView.dialogPresentation;
                ScootersErrorDialogAnalyticsState scootersErrorDialogAnalyticsState2 = jkn0Var2.a;
                list2 = scootersErrorDialogModalView.scooterNumbers;
                str2 = scootersErrorDialogModalView.orderId;
                rjn0Var2.c(scootersErrorDialogAnalyticsState2, list2, str2);
                break;
        }
        return zy11Var;
    }
}
