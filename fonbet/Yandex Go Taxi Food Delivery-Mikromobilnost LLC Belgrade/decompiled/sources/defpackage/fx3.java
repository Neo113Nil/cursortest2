package defpackage;

import android.view.View;
import com.ybsdk.feature.autotopup.internal.presentation.saver.AutoTopupRegularFragment;
import com.ybsdk.widgets.common.bottomsheet.daychoosers.MonthDayChooserView;

/* loaded from: classes12.dex */
public final /* synthetic */ class fx3 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ MonthDayChooserView b;

    public /* synthetic */ fx3(MonthDayChooserView monthDayChooserView, int i) {
        this.a = i;
        this.b = monthDayChooserView;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        View showDayOfMonthBottomSheet$lambda$60;
        jsg jsgVar;
        int i = this.a;
        MonthDayChooserView monthDayChooserView = this.b;
        switch (i) {
            case 0:
                showDayOfMonthBottomSheet$lambda$60 = AutoTopupRegularFragment.showDayOfMonthBottomSheet$lambda$60(monthDayChooserView);
                return showDayOfMonthBottomSheet$lambda$60;
            default:
                jsgVar = monthDayChooserView.selectedDay;
                return jsgVar;
        }
    }
}
