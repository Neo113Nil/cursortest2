package defpackage;

import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class lmn0 implements zo31 {
    public final MotionLayout a;
    public final RecyclerView b;
    public final RobotoTextView c;
    public final RobotoTextView d;

    public lmn0(MotionLayout motionLayout, GoView goView, RecyclerView recyclerView, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.a = motionLayout;
        this.b = recyclerView;
        this.c = robotoTextView;
        this.d = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
