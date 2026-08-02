package defpackage;

import com.ybsdk.feature.autotopup.internal.presentation.saver.AutoTopupRegularFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class ex3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AutoTopupRegularFragment b;

    public /* synthetic */ ex3(AutoTopupRegularFragment autoTopupRegularFragment, int i) {
        this.a = i;
        this.b = autoTopupRegularFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        AutoTopupRegularFragment autoTopupRegularFragment = this.b;
        switch (i) {
            case 0:
                AutoTopupRegularFragment.onSummaryViewDropDownToggle$lambda$66(autoTopupRegularFragment);
                break;
            case 1:
                AutoTopupRegularFragment.consumeSideEffect$lambda$43(autoTopupRegularFragment);
                break;
            default:
                AutoTopupRegularFragment.consumeSideEffect$lambda$44(autoTopupRegularFragment);
                break;
        }
    }
}
