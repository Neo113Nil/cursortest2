package defpackage;

import android.view.View;
import com.monetization.ads.nativeads.CustomizableMediaView;
import java.util.List;
import yads.gm1;

/* loaded from: classes7.dex */
public final class j381 extends vd71 {
    public final i971 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j381(CustomizableMediaView customizableMediaView, gx71 gx71Var, j981 j981Var) {
        super(customizableMediaView, j981Var);
        i971 i971Var = new i971(1, gx71Var);
        this.d = i971Var;
    }

    @Override // defpackage.ia71
    public final void a(View view) {
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) view;
        this.d.y();
        customizableMediaView.setVisibility(8);
        customizableMediaView.setOnClickListener(null);
        customizableMediaView.setOnTouchListener(null);
        customizableMediaView.setSelected(false);
    }

    @Override // defpackage.ia71
    public final void b(uy71 uy71Var, pj71 pj71Var, Object obj) {
        d171 d171Var = (d171) obj;
        this.d.z(uy71Var, pj71Var, d171Var != null ? d171Var.c : null);
    }

    @Override // defpackage.ia71
    public final boolean c(View view, Object obj) {
        List list = ((d171) obj).c;
        if (list == null || !(!list.isEmpty())) {
            return false;
        }
        return this.d.C(list);
    }

    @Override // defpackage.vd71
    public final void g(CustomizableMediaView customizableMediaView) {
        this.d.y();
    }

    @Override // defpackage.vd71
    /* renamed from: h */
    public final void e(CustomizableMediaView customizableMediaView, d171 d171Var) {
        super.e(customizableMediaView, d171Var);
        List list = d171Var.c;
        if (list == null || !(!list.isEmpty())) {
            return;
        }
        this.d.D(list);
    }

    @Override // defpackage.vd71
    public final void i(d171 d171Var) {
        List list = d171Var.c;
        if (list == null || !(!list.isEmpty())) {
            return;
        }
        this.d.D(list);
    }

    @Override // defpackage.vd71
    public final gm1 j() {
        return gm1.e;
    }
}
