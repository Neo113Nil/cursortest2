package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.design.ButtonComponent;

/* loaded from: classes6.dex */
public final class n8n0 implements zo31 {
    public final GoFrameLayout a;
    public final GoLinearLayout b;
    public final ButtonComponent c;
    public final ButtonComponent d;
    public final RecyclerView e;

    public n8n0(GoFrameLayout goFrameLayout, GoLinearLayout goLinearLayout, ButtonComponent buttonComponent, ButtonComponent buttonComponent2, RecyclerView recyclerView) {
        this.a = goFrameLayout;
        this.b = goLinearLayout;
        this.c = buttonComponent;
        this.d = buttonComponent2;
        this.e = recyclerView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
