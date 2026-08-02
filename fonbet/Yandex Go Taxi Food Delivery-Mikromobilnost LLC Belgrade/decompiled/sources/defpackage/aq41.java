package defpackage;

import android.view.View;
import com.yandex.payment.sdk.ui.common.WebViewFragment;
import com.yandex.plus.home.feature.webviews.internal.container.a;
import com.ybsdk.widgets.common.WidgetWithButtonView;
import com.ybsdk.widgets.common.WidgetWithToggleView;
import com.ybsdk.widgets.common.bottomsheet.daychoosers.WeekDayChooserView;
import yads.r41;
import yads.ti3;
import yads.x91;

/* loaded from: classes7.dex */
public final /* synthetic */ class aq41 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ aq41(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                WebViewFragment.onViewCreated$lambda$0((WebViewFragment) obj, view);
                break;
            case 1:
                com.ybsdk.feature.webview.internal.presentation.WebViewFragment.setOnControlClickListenerIfNeeded$lambda$14((com.ybsdk.feature.webview.internal.presentation.WebViewFragment) obj, view);
                break;
            case 2:
                ((a) obj).s(null);
                break;
            case 3:
                ((WeekDayChooserView) obj).onSaveButtonClick();
                break;
            case 4:
                WidgetWithButtonView._init_$lambda$0((WidgetWithButtonView) obj, view);
                break;
            case 5:
                WidgetWithToggleView._init_$lambda$3((WidgetWithToggleView) obj, view);
                break;
            case 6:
                ((ti3) ((q271) obj).O).invoke();
                break;
            case 7:
                r41.a((r41) obj, view);
                break;
            default:
                ((x91) obj).invoke(wz61.a);
                break;
        }
    }
}
