package xsna;

import android.graphics.RenderEffect;

/* compiled from: AndroidRenderEffect.android.kt */
/* loaded from: classes11.dex */
public abstract class gyf0 {
    public RenderEffect a;

    public final RenderEffect a() {
        RenderEffect renderEffect = this.a;
        if (renderEffect != null) {
            return renderEffect;
        }
        RenderEffect b = b();
        this.a = b;
        return b;
    }

    public abstract RenderEffect b();
}
