package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoImageView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes12.dex */
public final class nk9 implements zo31 {
    public final ConstraintLayout a;
    public final RobotoTextView b;
    public final GoImageView c;
    public final RobotoTextView d;
    public final RecyclerView e;

    public nk9(ConstraintLayout constraintLayout, RobotoTextView robotoTextView, GoImageView goImageView, RobotoTextView robotoTextView2, RecyclerView recyclerView) {
        this.a = constraintLayout;
        this.b = robotoTextView;
        this.c = goImageView;
        this.d = robotoTextView2;
        this.e = recyclerView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
