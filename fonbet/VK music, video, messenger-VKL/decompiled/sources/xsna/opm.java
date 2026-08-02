package xsna;

import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.vkontakte.android.R;

/* compiled from: DialogsFabViewController.kt */
/* loaded from: classes18.dex */
public final class opm extends fi6<ppm, npm> {
    public final o1a0 f;
    public FloatingActionButton g;

    public opm(o1a0 o1a0Var) {
        super(R.layout.dialogs_fab, new my3(R.id.vkim_fab, null));
        this.f = o1a0Var;
    }

    @Override // xsna.fi6
    public final void Q(View view) {
        FloatingActionButton floatingActionButton = (FloatingActionButton) view;
        this.g = floatingActionButton;
        floatingActionButton.setVisibility(0);
        FloatingActionButton floatingActionButton2 = this.g;
        if (floatingActionButton2 == null) {
            floatingActionButton2 = null;
        }
        floatingActionButton2.setOnClickListener(new gi8(this, 4));
        FloatingActionButton floatingActionButton3 = this.g;
        if (floatingActionButton3 == null) {
            floatingActionButton3 = null;
        }
        this.f.a(floatingActionButton3);
        dhr0 dhr0Var = dhr0.a;
        FloatingActionButton floatingActionButton4 = this.g;
        if (floatingActionButton4 == null) {
            floatingActionButton4 = null;
        }
        dhr0Var.i0(R.attr.vk_ui_background_modal, floatingActionButton4);
        FloatingActionButton floatingActionButton5 = this.g;
        dhr0Var.l0(floatingActionButton5 != null ? floatingActionButton5 : null, R.drawable.vk_icon_write_square_outline_28, R.attr.vk_ui_icon_accent_themed);
    }

    @Override // xsna.wn50
    public final /* bridge */ /* synthetic */ void l(ao50 ao50Var) {
    }
}
