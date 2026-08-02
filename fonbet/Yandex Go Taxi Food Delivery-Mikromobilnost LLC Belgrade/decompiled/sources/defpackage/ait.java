package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class ait extends xlf {
    public final a5d0 w;
    public final bdp x;

    public ait(a5d0 a5d0Var, bdp bdpVar) {
        this.w = a5d0Var;
        this.x = bdpVar;
    }

    @Override // defpackage.iax0
    public final void onLoadCleared(Drawable drawable) {
        this.w.onImage(drawable);
        this.x.invoke();
    }

    @Override // defpackage.xlf, defpackage.iax0
    public final void onLoadFailed(Drawable drawable) {
        this.w.onImage(drawable);
        this.x.invoke();
    }

    @Override // defpackage.iax0
    public final void onResourceReady(Object obj, xx01 xx01Var) {
        this.w.onImage((Drawable) obj);
        this.x.invoke();
    }
}
