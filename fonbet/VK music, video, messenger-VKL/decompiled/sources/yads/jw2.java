package yads;

import android.view.View;
import com.monetization.ads.nativeads.CustomizableMediaView;

/* loaded from: classes10.dex */
public final class jw2 extends to1 {
    public final ml3 d;

    public jw2(CustomizableMediaView customizableMediaView, bp1 bp1Var, ml3 ml3Var) {
        super(customizableMediaView, bp1Var);
        this.d = ml3Var;
    }

    @Override // yads.to1
    public final void a(po1 po1Var) {
    }

    @Override // yads.to1
    public final so1 d() {
        return so1.c;
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

    @Override // yads.ll3
    public final void a(oi oiVar, ol3 ol3Var, Object obj) {
        po1 po1Var = (po1) obj;
        this.d.a(oiVar, ol3Var, po1Var != null ? po1Var.a : null);
    }

    @Override // yads.to1
    public final void a(CustomizableMediaView customizableMediaView) {
        this.d.a();
    }

    @Override // yads.ll3
    public final boolean a(View view, Object obj) {
        pk1 pk1Var = ((po1) obj).a;
        if (pk1Var != null) {
            return this.d.a(pk1Var);
        }
        return false;
    }

    @Override // yads.to1
    /* renamed from: a */
    public final void b(CustomizableMediaView customizableMediaView, po1 po1Var) {
        super.b(customizableMediaView, po1Var);
        pk1 pk1Var = po1Var.a;
        if (pk1Var == null) {
            return;
        }
        this.d.b(pk1Var);
    }
}
