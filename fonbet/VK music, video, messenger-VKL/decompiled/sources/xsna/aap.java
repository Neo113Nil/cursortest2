package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.im.engine.models.c;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.x9p;

/* compiled from: EffectsCameraPreviewDelegateImpl.kt */
/* loaded from: classes7.dex */
public final class aap implements x9p {
    public final AtomicBoolean a;
    public WeakReference<w9p> b;
    public x9p.a c;

    public aap() {
        this(0);
    }

    @Override // xsna.x9p
    public final boolean a() {
        return this.b.get() != null;
    }

    @Override // xsna.x9p
    public final void b(ViewGroup viewGroup) {
        for (View view : awt0.d(viewGroup)) {
            if (epx.f(view, this.b.get())) {
                viewGroup.removeView(view);
            }
        }
        this.b.clear();
    }

    @Override // xsna.x9p
    public final void c(FrameLayout frameLayout, x9p.a aVar) {
        if (this.b.get() == null) {
            Context context = frameLayout.getContext();
            bpn0 bpn0Var = enj.a;
            Activity h = e3m.h(context);
            c.C1123c c1123c = c.C1123c.b;
            y9p y9pVar = new y9p(0, aVar, x9p.a.class, "onCameraFirstFrameDrawn", "onCameraFirstFrameDrawn()V", 0);
            z9p z9pVar = new z9p(0, this, aap.class, "onCameraReady", "onCameraReady()V", 0);
            c1123c.getClass();
            w9p w9pVar = new w9p(h, y9pVar, z9pVar, c1123c.a.h(), 4, false);
            if (this.a.get()) {
                w9pVar.k();
            } else {
                w9pVar.j();
            }
            w9pVar.getHasMoreThenOneCamera();
            b(frameLayout);
            frameLayout.addView(w9pVar, 0);
            this.c = aVar;
            this.b = new WeakReference<>(w9pVar);
        }
    }

    public aap(int i) {
        this.a = new AtomicBoolean(true);
        this.b = new WeakReference<>(null);
    }
}
