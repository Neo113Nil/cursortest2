package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class g38 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g38(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.b) {
            case 0:
                h38 h38Var = (h38) this.c;
                if (i8 - i6 != i4 - i2 || i7 - i5 != i3 - i) {
                    RecyclerView recyclerView = h38Var.g;
                    if (recyclerView == null) {
                        recyclerView = null;
                    }
                    recyclerView.post(new ef2(h38Var, 2));
                    break;
                }
                break;
            default:
                view.getLocationOnScreen(((avt0) this.c).a.b);
                break;
        }
    }
}
