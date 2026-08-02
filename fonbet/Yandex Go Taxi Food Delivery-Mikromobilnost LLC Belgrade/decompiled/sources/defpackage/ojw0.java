package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class ojw0 implements zo31 {
    public final GoLinearLayout a;
    public final View b;
    public final m2y c;
    public final RecyclerView d;
    public final RobotoTextView e;
    public final RobotoTextView f;

    public ojw0(GoLinearLayout goLinearLayout, View view, m2y m2yVar, RecyclerView recyclerView, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.a = goLinearLayout;
        this.b = view;
        this.c = m2yVar;
        this.d = recyclerView;
        this.e = robotoTextView;
        this.f = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
