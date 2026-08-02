package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vkontakte.android.R;
import xsna.xg10;

/* compiled from: UnselectedMaskHolder.kt */
/* loaded from: classes3.dex */
public final class x5q0 extends vmg0<Boolean> {
    public final xg10.a q;
    public final View r;
    public final View s;

    /* compiled from: View.kt */
    public static final class a implements View.OnLayoutChangeListener {
        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            x5q0 x5q0Var = x5q0.this;
            view.setPivotX(x5q0Var.s.getWidth() / 2.0f);
            view.setPivotY(view.getHeight() - (x5q0Var.s.getHeight() / 2.0f));
        }
    }

    public x5q0(ViewGroup viewGroup, xg10.a aVar, zzz zzzVar) {
        super(tf3.b(viewGroup, R.layout.layout_mask_unselected, viewGroup, false), zzzVar);
        this.q = aVar;
        this.r = this.itemView.findViewById(R.id.view_selected_foreground);
        this.s = this.itemView.findViewById(R.id.view_background);
        this.itemView.setContentDescription(g6(R.string.mask_view_holder_content_description_hide_mask));
        bwt0.i0(this.itemView, new t440(this, 28));
        View view = this.itemView;
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new a());
        } else {
            view.setPivotX(r3.getWidth() / 2.0f);
            view.setPivotY(view.getHeight() - (r3.getHeight() / 2.0f));
        }
    }

    @Override // xsna.vmg0, xsna.vif0
    public final void i6(Object obj) {
        bwt0.p0(this.r, !((Boolean) obj).booleanValue());
    }
}
