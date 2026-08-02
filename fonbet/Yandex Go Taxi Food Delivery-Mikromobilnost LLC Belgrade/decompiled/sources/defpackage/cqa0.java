package defpackage;

import android.view.View;
import com.google.android.material.textfield.TextInputLayout;
import com.yandex.payment.sdk.ui.view.CvnView;

/* loaded from: classes2.dex */
public final class cqa0 implements zo31 {
    public final CvnView a;
    public final TextInputLayout b;

    public cqa0(CvnView cvnView, TextInputLayout textInputLayout) {
        this.a = cvnView;
        this.b = textInputLayout;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
