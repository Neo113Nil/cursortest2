package defpackage;

import android.text.Editable;
import com.ybsdk.feature.autotopup.internal.presentation.saver.AutoTopupRegularFragment;
import com.ybsdk.widgets.common.Tooltip$DismissReason;

/* loaded from: classes3.dex */
public final /* synthetic */ class dx3 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ AutoTopupRegularFragment b;

    public /* synthetic */ dx3(AutoTopupRegularFragment autoTopupRegularFragment, int i) {
        this.a = i;
        this.b = autoTopupRegularFragment;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 viewBinding$lambda$21$lambda$7;
        zy11 viewBinding$lambda$21$lambda$12;
        zy11 showTooltip$lambda$52;
        zy11 adapter_delegate$lambda$1$lambda$0;
        zy11 showDayOfWeekBottomSheet$lambda$54$lambda$53;
        zy11 viewBinding$lambda$21$lambda$14;
        zy11 viewBinding$lambda$21$lambda$17;
        int i = this.a;
        AutoTopupRegularFragment autoTopupRegularFragment = this.b;
        switch (i) {
            case 0:
                viewBinding$lambda$21$lambda$7 = AutoTopupRegularFragment.getViewBinding$lambda$21$lambda$7(autoTopupRegularFragment, (Editable) obj);
                return viewBinding$lambda$21$lambda$7;
            case 1:
                viewBinding$lambda$21$lambda$12 = AutoTopupRegularFragment.getViewBinding$lambda$21$lambda$12(autoTopupRegularFragment, (Editable) obj);
                return viewBinding$lambda$21$lambda$12;
            case 2:
                showTooltip$lambda$52 = AutoTopupRegularFragment.showTooltip$lambda$52(autoTopupRegularFragment, (Tooltip$DismissReason) obj);
                return showTooltip$lambda$52;
            case 3:
                adapter_delegate$lambda$1$lambda$0 = AutoTopupRegularFragment.adapter_delegate$lambda$1$lambda$0(autoTopupRegularFragment, ((Integer) obj).intValue());
                return adapter_delegate$lambda$1$lambda$0;
            case 4:
                showDayOfWeekBottomSheet$lambda$54$lambda$53 = AutoTopupRegularFragment.showDayOfWeekBottomSheet$lambda$54$lambda$53(autoTopupRegularFragment, (vw41) obj);
                return showDayOfWeekBottomSheet$lambda$54$lambda$53;
            case 5:
                viewBinding$lambda$21$lambda$14 = AutoTopupRegularFragment.getViewBinding$lambda$21$lambda$14(autoTopupRegularFragment, (Editable) obj);
                return viewBinding$lambda$21$lambda$14;
            default:
                viewBinding$lambda$21$lambda$17 = AutoTopupRegularFragment.getViewBinding$lambda$21$lambda$17(autoTopupRegularFragment, ((Boolean) obj).booleanValue());
                return viewBinding$lambda$21$lambda$17;
        }
    }
}
