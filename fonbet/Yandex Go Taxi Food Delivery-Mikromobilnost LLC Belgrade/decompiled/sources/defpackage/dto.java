package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.superapp.discovery.map.impl.ui.main.explorer.ExplorerAnimatedBorderView;
import ru.yandex.taxi.design.SwitchComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class dto implements zo31 {
    public final GoConstraintLayout a;
    public final ExplorerAnimatedBorderView b;
    public final GoImageView c;
    public final View d;
    public final RobotoTextView e;
    public final SwitchComponent f;

    public dto(GoConstraintLayout goConstraintLayout, ExplorerAnimatedBorderView explorerAnimatedBorderView, GoImageView goImageView, View view, RobotoTextView robotoTextView, SwitchComponent switchComponent) {
        this.a = goConstraintLayout;
        this.b = explorerAnimatedBorderView;
        this.c = goImageView;
        this.d = view;
        this.e = robotoTextView;
        this.f = switchComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
