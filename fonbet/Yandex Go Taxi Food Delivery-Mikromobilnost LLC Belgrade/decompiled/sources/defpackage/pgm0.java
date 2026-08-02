package defpackage;

import android.view.View;
import com.yandex.payment.sdk.ui.payment.sbp.SbpFragment;

/* loaded from: classes2.dex */
public final /* synthetic */ class pgm0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ SbpFragment b;

    public /* synthetic */ pgm0(SbpFragment sbpFragment, int i) {
        this.a = i;
        this.b = sbpFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        SbpFragment sbpFragment = this.b;
        switch (i) {
            case 0:
                SbpFragment.initBankListLayout$lambda$0$0(sbpFragment, view);
                break;
            case 1:
                SbpFragment.initBankListLayout$lambda$0$4(sbpFragment, view);
                break;
            case 2:
                SbpFragment.initLoadingLayout$lambda$0$1(sbpFragment, view);
                break;
            case 3:
                SbpFragment.initLoadingLayout$lambda$0$2(sbpFragment, view);
                break;
            case 4:
                SbpFragment.initHeader$lambda$0$1(sbpFragment, view);
                break;
            case 5:
                SbpFragment.initErrorLayout$lambda$0$0(sbpFragment, view);
                break;
            default:
                SbpFragment.initErrorLayout$lambda$0$1(sbpFragment, view);
                break;
        }
    }
}
