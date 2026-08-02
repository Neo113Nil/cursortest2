package yads;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import java.util.List;

/* loaded from: classes10.dex */
public final class qu0 {
    public final d4 a;
    public final ov2 b;
    public final lv c;
    public final m22 d;
    public final v02 e;
    public final pu0 f;

    public qu0(d4 d4Var, ov2 ov2Var, lv lvVar, m22 m22Var, v02 v02Var, pu0 pu0Var) {
        this.a = d4Var;
        this.b = ov2Var;
        this.c = lvVar;
        this.d = m22Var;
        this.e = v02Var;
        this.f = pu0Var;
    }

    public final void a(Context context, hu0 hu0Var) {
        View a = this.d.c.a("feedback");
        ImageView imageView = a instanceof ImageView ? (ImageView) a : null;
        if (imageView == null) {
            return;
        }
        List list = hu0Var.b;
        if (list.isEmpty()) {
            return;
        }
        try {
            za zaVar = new za(context, this.b, this.a);
            this.f.getClass();
            PopupMenu a2 = pu0.a(context, imageView, list);
            a2.setOnMenuItemClickListener(new eh2(zaVar, list, this.c, this.e));
            a2.show();
        } catch (Exception e) {
            ((mv3) this.b).a().reportError("Failed to render feedback", e);
        }
    }
}
