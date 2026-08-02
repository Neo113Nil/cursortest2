package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.core.tips.Tooltip;
import com.vkontakte.android.R;

/* compiled from: TooltipComponentsViewHolder.kt */
/* loaded from: classes17.dex */
public final class b5p0 extends vfz<p5p0> implements View.OnAttachStateChangeListener {
    public Tooltip.b l;
    public final View m;
    public final View n;
    public final View o;
    public final View p;
    public final View q;

    public b5p0(ViewGroup viewGroup) {
        super(R.layout.vk_tooltip_components__holder, viewGroup);
        View findViewById = this.itemView.findViewById(R.id.tooltip_start_btn);
        this.m = findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.tooltip_center_btn);
        this.n = findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.tooltip_end_btn);
        this.o = findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.tooltip_overlay_rect_btn);
        this.p = findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.tooltip_overlay_square_btn);
        this.q = findViewById5;
        h6();
        findViewById.setOnClickListener(new v9b(this, 10));
        findViewById2.setOnClickListener(new yg1(this, 10));
        findViewById3.setOnClickListener(new qp4(this, 11));
        int i = 8;
        findViewById4.setOnClickListener(new ep6(this, i));
        findViewById5.setOnClickListener(new ybq(this, i));
        this.itemView.addOnAttachStateChangeListener(this);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final /* bridge */ /* synthetic */ void i6(p5p0 p5p0Var) {
    }

    public final void h6() {
        Tooltip.b bVar = this.l;
        if (bVar != null) {
            bVar.dismiss();
        }
        this.l = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        h6();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
