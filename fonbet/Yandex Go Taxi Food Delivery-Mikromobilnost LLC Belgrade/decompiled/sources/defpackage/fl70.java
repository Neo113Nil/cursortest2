package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.design.DividerWithColorView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class fl70 implements zo31 {
    public final GoLinearLayout a;
    public final GoLinearLayout b;
    public final RobotoTextView c;
    public final DividerWithColorView d;
    public final GoFrameLayout e;
    public final RecyclerView f;
    public final RobotoTextView g;
    public final RobotoTextView h;

    public fl70(GoLinearLayout goLinearLayout, GoLinearLayout goLinearLayout2, RobotoTextView robotoTextView, DividerWithColorView dividerWithColorView, GoFrameLayout goFrameLayout, RecyclerView recyclerView, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3) {
        this.a = goLinearLayout;
        this.b = goLinearLayout2;
        this.c = robotoTextView;
        this.d = dividerWithColorView;
        this.e = goFrameLayout;
        this.f = recyclerView;
        this.g = robotoTextView2;
        this.h = robotoTextView3;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
