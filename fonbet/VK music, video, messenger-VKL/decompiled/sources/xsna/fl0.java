package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vkontakte.android.R;
import xsna.xg10;

/* compiled from: AddCustomVirtualBackgroundMaskHolder.kt */
/* loaded from: classes3.dex */
public final class fl0 extends vmg0<s3q0> {
    public final View q;

    /* compiled from: View.kt */
    public static final class a implements View.OnLayoutChangeListener {
        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            fl0 fl0Var = fl0.this;
            view.setPivotX(fl0Var.q.getWidth() / 2.0f);
            view.setPivotY(view.getHeight() - (fl0Var.q.getHeight() / 2.0f));
        }
    }

    public fl0(ViewGroup viewGroup, xg10.a aVar, zzz zzzVar) {
        super(tf3.b(viewGroup, R.layout.layout_mask_add_custom_virtual_background, viewGroup, false), zzzVar);
        this.q = this.itemView.findViewById(R.id.view_background);
        this.itemView.setContentDescription(g6(R.string.mask_view_holder_content_description_add_new_mask));
        jjc.g(this.itemView, new el0(aVar, 0));
        View view = this.itemView;
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new a());
        } else {
            view.setPivotX(r3.getWidth() / 2.0f);
            view.setPivotY(view.getHeight() - (r3.getHeight() / 2.0f));
        }
    }
}
