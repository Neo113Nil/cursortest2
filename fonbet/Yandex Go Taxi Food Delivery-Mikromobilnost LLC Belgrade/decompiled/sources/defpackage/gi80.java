package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.places.impl.ui.common.chip.ChipView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class gi80 implements zo31 {
    public final ChipView a;
    public final GoImageView b;
    public final RobotoTextView c;
    public final GoImageView d;

    public gi80(ChipView chipView, GoImageView goImageView, RobotoTextView robotoTextView, GoImageView goImageView2) {
        this.a = chipView;
        this.b = goImageView;
        this.c = robotoTextView;
        this.d = goImageView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
