package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import com.yandex.payment.sdk.ui.view.ProgressResultView;

/* loaded from: classes2.dex */
public final class ppa0 implements zo31 {
    public final FrameLayout a;
    public final ProgressResultView b;

    public ppa0(FrameLayout frameLayout, ProgressResultView progressResultView) {
        this.a = frameLayout;
        this.b = progressResultView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
