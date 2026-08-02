package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class atn0 implements zo31 {
    public final GoLinearLayout a;
    public final RecyclerView b;
    public final ButtonComponent c;
    public final RobotoTextView d;

    public atn0(GoLinearLayout goLinearLayout, RecyclerView recyclerView, ButtonComponent buttonComponent, RobotoTextView robotoTextView) {
        this.a = goLinearLayout;
        this.b = recyclerView;
        this.c = buttonComponent;
        this.d = robotoTextView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
