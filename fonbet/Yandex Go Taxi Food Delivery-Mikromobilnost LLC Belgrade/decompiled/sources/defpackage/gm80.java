package defpackage;

import android.view.View;
import androidx.constraintlayout.helper.widget.Flow;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes13.dex */
public final class gm80 implements zo31 {
    public final GoLinearLayout a;
    public final GoConstraintLayout b;
    public final Flow c;
    public final ListItemComponent d;

    public gm80(GoLinearLayout goLinearLayout, GoConstraintLayout goConstraintLayout, Flow flow, ListItemComponent listItemComponent) {
        this.a = goLinearLayout;
        this.b = goConstraintLayout;
        this.c = flow;
        this.d = listItemComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
