package yads;

import android.view.View;
import com.monetization.ads.nativeads.CustomizableMediaView;
import java.util.List;

/* loaded from: classes10.dex */
public final class iw2 extends to1 {
    public final ml3 d;

    public iw2(CustomizableMediaView customizableMediaView, bp1 bp1Var, ml3 ml3Var) {
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
        return so1.f;
    }

    @Override // yads.ll3
    public final void a(oi oiVar, ol3 ol3Var, Object obj) {
        po1 po1Var = (po1) obj;
        this.d.a(oiVar, ol3Var, a(po1Var != null ? po1Var.c : null));
    }

    public static x41 a(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (x41) list.get(0);
    }

    @Override // yads.to1
    public final void a(CustomizableMediaView customizableMediaView) {
        this.d.a();
    }

    @Override // yads.ll3
    public final boolean a(View view, Object obj) {
        x41 a = a(((po1) obj).c);
        if (a != null) {
            return this.d.a(a);
        }
        return false;
    }

    @Override // yads.to1
    /* renamed from: a */
    public final void b(CustomizableMediaView customizableMediaView, po1 po1Var) {
        super.b(customizableMediaView, po1Var);
        x41 a = a(po1Var.c);
        if (a == null) {
            return;
        }
        this.d.b(a);
    }

    @Override // yads.to1
    public final void a(po1 po1Var) {
        x41 a = a(po1Var.c);
        if (a == null) {
            return;
        }
        this.d.b(a);
    }
}
