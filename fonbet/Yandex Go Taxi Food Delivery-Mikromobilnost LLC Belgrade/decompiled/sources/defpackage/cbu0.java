package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoImageView;
import ru.yandex.taxi.widget.ButtonsView;

/* loaded from: classes5.dex */
public final class cbu0 implements zo31 {
    public final ConstraintLayout a;
    public final FrameLayout b;
    public final GoImageView c;
    public final RecyclerView d;
    public final ButtonsView e;

    public cbu0(ConstraintLayout constraintLayout, FrameLayout frameLayout, GoImageView goImageView, RecyclerView recyclerView, ButtonsView buttonsView) {
        this.a = constraintLayout;
        this.b = frameLayout;
        this.c = goImageView;
        this.d = recyclerView;
        this.e = buttonsView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
