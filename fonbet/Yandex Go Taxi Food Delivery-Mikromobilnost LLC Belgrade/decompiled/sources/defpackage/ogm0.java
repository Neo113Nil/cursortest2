package defpackage;

import android.view.View;
import com.yandex.payment.sdk.ui.payment.sbp.SbpFragment;

/* loaded from: classes2.dex */
public final /* synthetic */ class ogm0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ SbpFragment b;

    public /* synthetic */ ogm0(SbpFragment sbpFragment, int i) {
        this.a = i;
        this.b = sbpFragment;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 observeChanges$lambda$0;
        zy11 observeChanges$lambda$1;
        zy11 initLoadingLayout$lambda$0$0;
        int i = this.a;
        SbpFragment sbpFragment = this.b;
        switch (i) {
            case 0:
                observeChanges$lambda$0 = SbpFragment.observeChanges$lambda$0(sbpFragment, (ljm0) obj);
                return observeChanges$lambda$0;
            case 1:
                observeChanges$lambda$1 = SbpFragment.observeChanges$lambda$1(sbpFragment, (ejm0) obj);
                return observeChanges$lambda$1;
            default:
                initLoadingLayout$lambda$0$0 = SbpFragment.initLoadingLayout$lambda$0$0(sbpFragment, (View) obj);
                return initLoadingLayout$lambda$0$0;
        }
    }
}
