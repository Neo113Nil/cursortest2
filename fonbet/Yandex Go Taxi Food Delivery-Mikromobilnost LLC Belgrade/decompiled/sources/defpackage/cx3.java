package defpackage;

import android.view.View;
import com.ybsdk.feature.autotopup.internal.presentation.saver.AutoTopupRegularFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class cx3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ AutoTopupRegularFragment b;

    public /* synthetic */ cx3(AutoTopupRegularFragment autoTopupRegularFragment, int i) {
        this.a = i;
        this.b = autoTopupRegularFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        AutoTopupRegularFragment autoTopupRegularFragment = this.b;
        switch (i) {
            case 0:
                AutoTopupRegularFragment.getViewBinding$lambda$21$lambda$5(autoTopupRegularFragment, view);
                break;
            case 1:
                AutoTopupRegularFragment.getViewBinding$lambda$21$lambda$8(autoTopupRegularFragment, view);
                break;
            case 2:
                AutoTopupRegularFragment.getViewBinding$lambda$21$lambda$9(autoTopupRegularFragment, view);
                break;
            case 3:
                AutoTopupRegularFragment.getViewBinding$lambda$21$lambda$10(autoTopupRegularFragment, view);
                break;
            case 4:
                AutoTopupRegularFragment.getViewBinding$lambda$21$lambda$11(autoTopupRegularFragment, view);
                break;
            case 5:
                AutoTopupRegularFragment.getViewBinding$lambda$21$lambda$13(autoTopupRegularFragment, view);
                break;
            case 6:
                AutoTopupRegularFragment.showSourceBottomSheet$lambda$65$lambda$64(autoTopupRegularFragment, view);
                break;
            case 7:
                AutoTopupRegularFragment.getViewBinding$lambda$21$lambda$4(autoTopupRegularFragment, view);
                break;
            case 8:
                AutoTopupRegularFragment.getViewBinding$lambda$21$lambda$15(autoTopupRegularFragment, view);
                break;
            default:
                AutoTopupRegularFragment.getViewBinding$lambda$21$lambda$16(autoTopupRegularFragment, view);
                break;
        }
    }
}
