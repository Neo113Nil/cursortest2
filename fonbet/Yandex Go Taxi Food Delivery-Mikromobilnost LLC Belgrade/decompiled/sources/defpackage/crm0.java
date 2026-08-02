package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import ru.yandex.taxi.design.ButtonComponent;

/* loaded from: classes13.dex */
public final class crm0 implements zo31 {
    public final GoFrameLayout a;
    public final GoConstraintLayout b;
    public final ButtonComponent c;
    public final RecyclerView d;

    public crm0(GoFrameLayout goFrameLayout, GoConstraintLayout goConstraintLayout, ButtonComponent buttonComponent, RecyclerView recyclerView) {
        this.a = goFrameLayout;
        this.b = goConstraintLayout;
        this.c = buttonComponent;
        this.d = recyclerView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
