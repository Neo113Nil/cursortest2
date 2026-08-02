package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class em80 implements zo31 {
    public final GoConstraintLayout a;
    public final GoImageView b;

    public em80(GoConstraintLayout goConstraintLayout, GoImageView goImageView, RobotoTextView robotoTextView) {
        this.a = goConstraintLayout;
        this.b = goImageView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
