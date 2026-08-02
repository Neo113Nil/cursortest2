package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.BottomEdgeButtonLayout;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes5.dex */
public final class g2y implements zo31 {
    public final GoLinearLayout a;
    public final BottomEdgeButtonLayout b;
    public final ButtonComponent c;
    public final RecyclerView d;
    public final ImageView e;
    public final RobotoTextView f;

    public g2y(GoLinearLayout goLinearLayout, BottomEdgeButtonLayout bottomEdgeButtonLayout, ButtonComponent buttonComponent, RecyclerView recyclerView, ImageView imageView, RobotoTextView robotoTextView) {
        this.a = goLinearLayout;
        this.b = bottomEdgeButtonLayout;
        this.c = buttonComponent;
        this.d = recyclerView;
        this.e = imageView;
        this.f = robotoTextView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
