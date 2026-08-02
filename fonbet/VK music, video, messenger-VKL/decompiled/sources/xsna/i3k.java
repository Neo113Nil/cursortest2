package xsna;

import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.imageloader.view.VKImageView;
import xsna.ef6;

/* compiled from: CoverViewController.kt */
/* loaded from: classes3.dex */
public final class i3k {
    public final VKImageView a;
    public final af6 b;
    public final ef6.b c;
    public final ef6.c d;
    public final ef6.d e;
    public final boolean f;
    public final a g = new a();
    public boolean h = true;

    public i3k(VKImageView vKImageView, af6 af6Var, ef6.b bVar, ef6.c cVar, ef6.d dVar, boolean z) {
        this.a = vKImageView;
        this.b = af6Var;
        this.c = bVar;
        this.d = cVar;
        this.e = dVar;
        this.f = z;
    }

    public final void a(boolean z, boolean z2) {
        if (this.h == z) {
            return;
        }
        this.h = z;
        VKImageView vKImageView = this.a;
        if (!z2) {
            vKImageView.setVisibility(z ? 0 : 8);
        } else if (z) {
            d3m.c(vKImageView, (r15 & 1) != 0 ? 300L : 300L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            d3m.e(vKImageView, (r15 & 1) != 0 ? 300L : 300L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
        }
        a aVar = this.g;
        vKImageView.removeOnAttachStateChangeListener(aVar);
        if (z) {
            return;
        }
        vKImageView.addOnAttachStateChangeListener(aVar);
    }

    /* compiled from: CoverViewController.kt */
    public final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            i3k.this.a(true, false);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }
}
