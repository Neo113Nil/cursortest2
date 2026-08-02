package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class jno0 implements zo31 {
    public final GoLinearLayout a;
    public final ButtonComponent b;
    public final RecyclerView c;
    public final GoImageView d;
    public final RobotoTextView e;

    public jno0(GoLinearLayout goLinearLayout, ButtonComponent buttonComponent, RecyclerView recyclerView, GoImageView goImageView, RobotoTextView robotoTextView) {
        this.a = goLinearLayout;
        this.b = buttonComponent;
        this.c = recyclerView;
        this.d = goImageView;
        this.e = robotoTextView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
