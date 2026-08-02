package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoView;
import ru.yandex.taxi.design.ListItemInputComponent;

/* loaded from: classes13.dex */
public final class htp0 implements zo31 {
    public final GoConstraintLayout a;
    public final GoImageView b;
    public final px6 c;
    public final GoView d;
    public final ListItemInputComponent e;
    public final RecyclerView f;

    public htp0(GoConstraintLayout goConstraintLayout, GoImageView goImageView, px6 px6Var, GoView goView, ListItemInputComponent listItemInputComponent, RecyclerView recyclerView) {
        this.a = goConstraintLayout;
        this.b = goImageView;
        this.c = px6Var;
        this.d = goView;
        this.e = listItemInputComponent;
        this.f = recyclerView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
