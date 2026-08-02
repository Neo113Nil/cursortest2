package yads;

import android.view.View;
import com.monetization.ads.nativeads.CustomizableMediaView;
import java.util.List;

/* loaded from: classes10.dex */
public final class kw2 extends to1 {
    public final ml3 d;

    public kw2(CustomizableMediaView customizableMediaView, bp1 bp1Var, ml3 ml3Var) {
        super(customizableMediaView, bp1Var);
        this.d = ml3Var;
    }

    @Override // yads.ll3
    public final void a(View view) {
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) view;
        this.d.a();
        customizableMediaView.setVisibility(8);
        customizableMediaView.setOnClickListener(null);
        customizableMediaView.setOnTouchListener(null);
        customizableMediaView.setSelected(false);
    }

    @Override // yads.to1
    public final so1 d() {
        return so1.e;
    }

    @Override // yads.ll3
    public final void a(oi oiVar, ol3 ol3Var, Object obj) {
        po1 po1Var = (po1) obj;
        this.d.a(oiVar, ol3Var, po1Var != null ? po1Var.c : null);
    }

    @Override // yads.to1
    public final void a(CustomizableMediaView customizableMediaView) {
        this.d.a();
    }

    @Override // yads.ll3
    public final boolean a(View view, Object obj) {
        List list = ((po1) obj).c;
        if (list == null || !(!list.isEmpty())) {
            return false;
        }
        return this.d.a(list);
    }

    @Override // yads.to1
    /* renamed from: a */
    public final void b(CustomizableMediaView customizableMediaView, po1 po1Var) {
        super.b(customizableMediaView, po1Var);
        List list = po1Var.c;
        if (list == null || !(!list.isEmpty())) {
            return;
        }
        this.d.b(list);
    }

    @Override // yads.to1
    public final void a(po1 po1Var) {
        List list = po1Var.c;
        if (list == null || !(!list.isEmpty())) {
            return;
        }
        this.d.b(list);
    }
}
