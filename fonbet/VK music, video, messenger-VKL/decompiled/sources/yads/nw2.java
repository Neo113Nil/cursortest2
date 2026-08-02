package yads;

import com.monetization.ads.nativeads.CustomizableMediaView;

/* loaded from: classes10.dex */
public final class nw2 implements Runnable {
    public final /* synthetic */ to1 b;
    public final /* synthetic */ CustomizableMediaView c;
    public final /* synthetic */ po1 d;

    public nw2(to1 to1Var, CustomizableMediaView customizableMediaView, po1 po1Var) {
        this.b = to1Var;
        this.c = customizableMediaView;
        this.d = po1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b(this.c, this.d);
    }
}
