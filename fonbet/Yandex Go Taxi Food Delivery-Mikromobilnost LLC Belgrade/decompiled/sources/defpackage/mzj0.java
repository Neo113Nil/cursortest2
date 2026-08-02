package defpackage;

import android.view.View;
import com.yandex.payment.sdk.ui.common.ResultFragment;

/* loaded from: classes2.dex */
public final /* synthetic */ class mzj0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ResultFragment b;

    public /* synthetic */ mzj0(ResultFragment resultFragment, int i) {
        this.a = i;
        this.b = resultFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        ResultFragment resultFragment = this.b;
        switch (i) {
            case 0:
                resultFragment.finish();
                break;
            default:
                resultFragment.finish();
                break;
        }
    }
}
