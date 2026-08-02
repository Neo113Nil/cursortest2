package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes12.dex */
public final class h4a implements zo31 {
    public final GoFrameLayout a;
    public final GoImageView b;
    public final GoImageView c;
    public final RobotoTextView d;
    public final RobotoTextView e;
    public final View f;

    public h4a(GoFrameLayout goFrameLayout, GoImageView goImageView, GoImageView goImageView2, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, View view) {
        this.a = goFrameLayout;
        this.b = goImageView;
        this.c = goImageView2;
        this.d = robotoTextView;
        this.e = robotoTextView2;
        this.f = view;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
