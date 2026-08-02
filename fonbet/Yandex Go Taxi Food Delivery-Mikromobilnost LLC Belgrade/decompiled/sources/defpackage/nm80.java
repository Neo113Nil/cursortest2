package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoConstraintLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.BottomEdgeButtonLayout;

/* loaded from: classes13.dex */
public final class nm80 implements zo31 {
    public final GoConstraintLayout a;
    public final BottomEdgeButtonLayout b;
    public final RecyclerView c;
    public final ButtonComponent d;
    public final ButtonComponent e;

    public nm80(GoConstraintLayout goConstraintLayout, BottomEdgeButtonLayout bottomEdgeButtonLayout, RecyclerView recyclerView, ButtonComponent buttonComponent, ButtonComponent buttonComponent2) {
        this.a = goConstraintLayout;
        this.b = bottomEdgeButtonLayout;
        this.c = recyclerView;
        this.d = buttonComponent;
        this.e = buttonComponent2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
