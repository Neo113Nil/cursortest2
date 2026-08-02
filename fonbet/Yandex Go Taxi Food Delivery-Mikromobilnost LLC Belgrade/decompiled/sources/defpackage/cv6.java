package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.design.FloatButtonIconComponent;

/* loaded from: classes14.dex */
public final class cv6 implements zo31 {
    public final GoLinearLayout a;
    public final RecyclerView b;

    public cv6(GoLinearLayout goLinearLayout, FloatButtonIconComponent floatButtonIconComponent, RecyclerView recyclerView) {
        this.a = goLinearLayout;
        this.b = recyclerView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
