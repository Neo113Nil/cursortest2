package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoLinearLayout;

/* loaded from: classes13.dex */
public final class amo0 implements zo31 {
    public final GoFrameLayout a;
    public final GoLinearLayout b;

    public amo0(GoLinearLayout goLinearLayout, GoFrameLayout goFrameLayout) {
        this.a = goFrameLayout;
        this.b = goLinearLayout;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
