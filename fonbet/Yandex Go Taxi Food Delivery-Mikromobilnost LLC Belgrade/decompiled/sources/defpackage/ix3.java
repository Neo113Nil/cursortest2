package defpackage;

import android.view.View;
import com.ybsdk.feature.autotopup.internal.presentation.saver.AutoTopupRegularFragment;
import com.ybsdk.widgets.common.bottomsheet.daychoosers.WeekDayChooserView;

/* loaded from: classes14.dex */
public final /* synthetic */ class ix3 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ WeekDayChooserView b;

    public /* synthetic */ ix3(WeekDayChooserView weekDayChooserView, int i) {
        this.a = i;
        this.b = weekDayChooserView;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        View showDayOfWeekBottomSheet$lambda$55;
        nry nryVar;
        int i = this.a;
        WeekDayChooserView weekDayChooserView = this.b;
        switch (i) {
            case 0:
                showDayOfWeekBottomSheet$lambda$55 = AutoTopupRegularFragment.showDayOfWeekBottomSheet$lambda$55(weekDayChooserView);
                return showDayOfWeekBottomSheet$lambda$55;
            default:
                nryVar = weekDayChooserView.selectedDay;
                return nryVar;
        }
    }
}
