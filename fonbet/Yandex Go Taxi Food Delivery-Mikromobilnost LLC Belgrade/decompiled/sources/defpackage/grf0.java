package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.LoadingComponent;
import ru.yandex.taxi.design.ToolbarComponent;
import ru.yandex.taxi.widget.BottomEdgeButtonLayout;
import ru.yandex.taxi.widget.scroll.NestedScrollViewAdvanced;

/* loaded from: classes13.dex */
public final class grf0 implements zo31 {
    public final ConstraintLayout a;
    public final View b;

    public grf0(ConstraintLayout constraintLayout, ListItemComponent listItemComponent, View view, ImageView imageView, BottomEdgeButtonLayout bottomEdgeButtonLayout, LoadingComponent loadingComponent, ButtonComponent buttonComponent, NestedScrollViewAdvanced nestedScrollViewAdvanced, LinearLayout linearLayout, ButtonComponent buttonComponent2, AppCompatImageView appCompatImageView, ListItemComponent listItemComponent2, ToolbarComponent toolbarComponent, ListItemComponent listItemComponent3) {
        this.a = constraintLayout;
        this.b = view;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
