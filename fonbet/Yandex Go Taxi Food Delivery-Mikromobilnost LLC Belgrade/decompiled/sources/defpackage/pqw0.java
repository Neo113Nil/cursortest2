package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class pqw0 implements zo31 {
    public final LinearLayout a;
    public final RecyclerView b;
    public final RobotoTextView c;

    public pqw0(LinearLayout linearLayout, RecyclerView recyclerView, RobotoTextView robotoTextView) {
        this.a = linearLayout;
        this.b = recyclerView;
        this.c = robotoTextView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
