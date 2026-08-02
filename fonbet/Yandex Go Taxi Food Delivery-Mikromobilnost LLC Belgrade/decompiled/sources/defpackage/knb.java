package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoLinearLayout;

/* loaded from: classes6.dex */
public final class knb implements zo31 {
    public final GoLinearLayout a;
    public final GoLinearLayout b;

    public knb(GoLinearLayout goLinearLayout, GoLinearLayout goLinearLayout2) {
        this.a = goLinearLayout;
        this.b = goLinearLayout2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
