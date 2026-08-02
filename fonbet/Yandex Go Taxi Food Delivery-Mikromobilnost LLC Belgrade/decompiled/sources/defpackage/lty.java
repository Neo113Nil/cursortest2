package defpackage;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.request.a;

/* loaded from: classes10.dex */
public final class lty implements iax0 {
    public int a;
    public int b;
    public e5j0 c;

    @Override // defpackage.iax0
    public final e5j0 getRequest() {
        return this.c;
    }

    @Override // defpackage.iax0
    public final void getSize(ojs0 ojs0Var) {
        ((a) ojs0Var).onSizeReady(this.b, this.a);
    }

    @Override // defpackage.hey
    public final void onDestroy() {
    }

    @Override // defpackage.iax0
    public final void onLoadCleared(Drawable drawable) {
    }

    @Override // defpackage.iax0
    public final void onLoadFailed(Drawable drawable) {
    }

    @Override // defpackage.iax0
    public final void onLoadStarted(Drawable drawable) {
    }

    @Override // defpackage.iax0
    public final void onResourceReady(Object obj, xx01 xx01Var) {
    }

    @Override // defpackage.hey
    public final void onStart() {
    }

    @Override // defpackage.hey
    public final void onStop() {
    }

    @Override // defpackage.iax0
    public final void removeCallback(ojs0 ojs0Var) {
    }

    @Override // defpackage.iax0
    public final void setRequest(e5j0 e5j0Var) {
        this.c = e5j0Var;
    }
}
