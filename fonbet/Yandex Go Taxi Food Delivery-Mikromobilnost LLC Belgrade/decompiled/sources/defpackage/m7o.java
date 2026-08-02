package defpackage;

import android.view.View;
import com.yandex.fintechsdk.features.error.internal.presentation.ErrorFragment;

/* loaded from: classes12.dex */
public final /* synthetic */ class m7o implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ErrorFragment b;

    public /* synthetic */ m7o(ErrorFragment errorFragment, int i) {
        this.a = i;
        this.b = errorFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        ErrorFragment errorFragment = this.b;
        switch (i) {
            case 0:
                ErrorFragment.initTryAgainButton$lambda$1(errorFragment, view);
                break;
            default:
                ErrorFragment.initCloseButton$lambda$2(errorFragment, view);
                break;
        }
    }
}
