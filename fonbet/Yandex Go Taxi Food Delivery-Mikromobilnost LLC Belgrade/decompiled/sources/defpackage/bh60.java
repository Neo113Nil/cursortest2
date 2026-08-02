package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes12.dex */
public final class bh60 implements zo31 {
    public final GoLinearLayout a;
    public final RobotoTextView b;

    public bh60(GoLinearLayout goLinearLayout, RobotoTextView robotoTextView) {
        this.a = goLinearLayout;
        this.b = robotoTextView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
