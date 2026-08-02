package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.ultima_mode.ui.header.UltimaModeHeaderView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class cv11 implements zo31 {
    public final UltimaModeHeaderView a;
    public final RobotoTextView b;
    public final GoImageView c;
    public final RobotoTextView d;

    public cv11(UltimaModeHeaderView ultimaModeHeaderView, RobotoTextView robotoTextView, GoImageView goImageView, RobotoTextView robotoTextView2) {
        this.a = ultimaModeHeaderView;
        this.b = robotoTextView;
        this.c = goImageView;
        this.d = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
