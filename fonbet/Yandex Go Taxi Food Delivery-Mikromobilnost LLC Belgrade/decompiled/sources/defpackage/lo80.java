package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.ShimmeringFrameLayout;
import ru.yandex.taxi.widget.buttons.CircleButtonImageView;

/* loaded from: classes13.dex */
public final class lo80 implements zo31 {
    public final GoConstraintLayout a;
    public final GoImageView b;
    public final dna c;
    public final px6 d;
    public final RecyclerView e;
    public final GoConstraintLayout f;
    public final GoView g;
    public final ListItemComponent h;
    public final ButtonComponent i;
    public final RecyclerView j;
    public final ShimmeringFrameLayout k;
    public final CircleButtonImageView l;

    public lo80(GoConstraintLayout goConstraintLayout, GoImageView goImageView, dna dnaVar, px6 px6Var, RecyclerView recyclerView, GoConstraintLayout goConstraintLayout2, GoView goView, ListItemComponent listItemComponent, ButtonComponent buttonComponent, RecyclerView recyclerView2, ShimmeringFrameLayout shimmeringFrameLayout, CircleButtonImageView circleButtonImageView) {
        this.a = goConstraintLayout;
        this.b = goImageView;
        this.c = dnaVar;
        this.d = px6Var;
        this.e = recyclerView;
        this.f = goConstraintLayout2;
        this.g = goView;
        this.h = listItemComponent;
        this.i = buttonComponent;
        this.j = recyclerView2;
        this.k = shimmeringFrameLayout;
        this.l = circleButtonImageView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
