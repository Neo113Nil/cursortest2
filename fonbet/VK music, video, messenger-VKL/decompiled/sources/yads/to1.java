package yads;

import com.monetization.ads.nativeads.CustomizableMediaView;

/* loaded from: classes10.dex */
public abstract class to1 extends ll3 {
    public final bp1 c;

    public to1(CustomizableMediaView customizableMediaView, bp1 bp1Var) {
        super(customizableMediaView);
        this.c = bp1Var;
    }

    public abstract void a(CustomizableMediaView customizableMediaView);

    @Override // yads.ll3
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(CustomizableMediaView customizableMediaView, po1 po1Var) {
        bp1 bp1Var = this.c;
        so1 d = d();
        if (bp1Var.c) {
            if (bp1Var.a.a == e00.g) {
                ap1 ap1Var = new ap1(bp1Var, customizableMediaView, d);
                an3 an3Var = om3.a;
                customizableMediaView.getViewTreeObserver().addOnPreDrawListener(new nm3(customizableMediaView, ap1Var));
            }
            bp1Var.c = false;
        }
    }

    public abstract void a(po1 po1Var);

    public abstract so1 d();
}
