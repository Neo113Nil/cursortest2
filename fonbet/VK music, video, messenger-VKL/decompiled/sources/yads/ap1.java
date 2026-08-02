package yads;

import android.view.ViewTreeObserver;
import com.monetization.ads.nativeads.CustomizableMediaView;

/* loaded from: classes10.dex */
public final class ap1 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ bp1 a;
    public final /* synthetic */ CustomizableMediaView b;
    public final /* synthetic */ so1 c;

    public ap1(bp1 bp1Var, CustomizableMediaView customizableMediaView, so1 so1Var) {
        this.a = bp1Var;
        this.b = customizableMediaView;
        this.c = so1Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.a.b.a(this.b, this.c.b);
        return false;
    }
}
