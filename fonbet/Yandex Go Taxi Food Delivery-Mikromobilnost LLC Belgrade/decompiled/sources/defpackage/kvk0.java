package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.core.widget.NestedScrollView;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.design.ListHeaderComponent;
import ru.yandex.taxi.widget.BottomEdgeButtonLayout;

/* loaded from: classes14.dex */
public final class kvk0 implements zo31 {
    public final NestedScrollView a;
    public final GoLinearLayout b;
    public final ListHeaderComponent c;
    public final ImageView d;
    public final BottomEdgeButtonLayout e;

    public kvk0(NestedScrollView nestedScrollView, GoLinearLayout goLinearLayout, ListHeaderComponent listHeaderComponent, ImageView imageView, BottomEdgeButtonLayout bottomEdgeButtonLayout) {
        this.a = nestedScrollView;
        this.b = goLinearLayout;
        this.c = listHeaderComponent;
        this.d = imageView;
        this.e = bottomEdgeButtonLayout;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
