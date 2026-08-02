package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.BottomEdgeButtonLayout;

/* loaded from: classes14.dex */
public final class jzx implements zo31 {
    public final GoLinearLayout a;
    public final ButtonComponent b;
    public final BottomEdgeButtonLayout c;
    public final RecyclerView d;

    public jzx(GoLinearLayout goLinearLayout, ButtonComponent buttonComponent, BottomEdgeButtonLayout bottomEdgeButtonLayout, RecyclerView recyclerView) {
        this.a = goLinearLayout;
        this.b = buttonComponent;
        this.c = bottomEdgeButtonLayout;
        this.d = recyclerView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
