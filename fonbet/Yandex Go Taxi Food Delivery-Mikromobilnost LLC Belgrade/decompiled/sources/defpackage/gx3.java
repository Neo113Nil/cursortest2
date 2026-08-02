package defpackage;

import com.ybsdk.feature.autotopup.internal.presentation.saver.AutoTopupRegularFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class gx3 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ AutoTopupRegularFragment b;

    public /* synthetic */ gx3(AutoTopupRegularFragment autoTopupRegularFragment, int i) {
        this.a = i;
        this.b = autoTopupRegularFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        qa3 adapter_delegate$lambda$1;
        zy11 onCreate$lambda$3;
        zy11 viewBinding$lambda$21$lambda$18;
        zy11 viewBinding$lambda$21$lambda$19;
        zy11 viewBinding$lambda$21$lambda$20;
        int i = this.a;
        AutoTopupRegularFragment autoTopupRegularFragment = this.b;
        switch (i) {
            case 0:
                adapter_delegate$lambda$1 = AutoTopupRegularFragment.adapter_delegate$lambda$1(autoTopupRegularFragment);
                return adapter_delegate$lambda$1;
            case 1:
                onCreate$lambda$3 = AutoTopupRegularFragment.onCreate$lambda$3(autoTopupRegularFragment);
                return onCreate$lambda$3;
            case 2:
                viewBinding$lambda$21$lambda$18 = AutoTopupRegularFragment.getViewBinding$lambda$21$lambda$18(autoTopupRegularFragment);
                return viewBinding$lambda$21$lambda$18;
            case 3:
                viewBinding$lambda$21$lambda$19 = AutoTopupRegularFragment.getViewBinding$lambda$21$lambda$19(autoTopupRegularFragment);
                return viewBinding$lambda$21$lambda$19;
            default:
                viewBinding$lambda$21$lambda$20 = AutoTopupRegularFragment.getViewBinding$lambda$21$lambda$20(autoTopupRegularFragment);
                return viewBinding$lambda$21$lambda$20;
        }
    }
}
