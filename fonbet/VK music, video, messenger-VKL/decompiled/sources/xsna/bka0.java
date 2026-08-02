package xsna;

import android.annotation.SuppressLint;
import android.graphics.Outline;
import android.os.Binder;
import android.provider.Settings;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.vk.voip.ui.picture_in_picture.view.PictureInPictureViewMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.lka0;
import xsna.wja0;

/* compiled from: PictureInPictureOverlayManager.kt */
/* loaded from: classes7.dex */
public final class bka0 {
    public final l7s a;
    public final WindowManager b;
    public vja0 c;
    public eka0 d;
    public FrameLayout e;
    public boolean f;
    public final io.reactivex.rxjava3.disposables.b g = new io.reactivex.rxjava3.disposables.b();

    /* compiled from: PictureInPictureOverlayManager.kt */
    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), iah0.a(8.0f));
        }
    }

    public bka0(l7s l7sVar) {
        this.a = l7sVar;
        this.b = (WindowManager) l7sVar.getSystemService("window");
    }

    public final void a() {
        try {
            if (this.f) {
                this.b.removeView(this.e);
                this.g.e();
                eka0 eka0Var = this.d;
                if (eka0Var != null) {
                    eka0Var.u.b(eka0Var.s);
                    eka0Var.m.b();
                    eka0Var.n.b();
                    eka0Var.q = false;
                    eka0Var.v.dispose();
                }
                this.d = null;
                vja0 vja0Var = this.c;
                if (vja0Var != null) {
                    vja0Var.a();
                }
                this.c = null;
                this.f = false;
            }
        } catch (Throwable th) {
            com.vk.metrics.eventtracking.b.a.q(th);
        }
    }

    @SuppressLint({"ClickableViewAccessibility", "InlinedApi"})
    public final void b() {
        int i;
        io.reactivex.rxjava3.subjects.d<xja0> dVar;
        WindowManager windowManager = this.b;
        io.reactivex.rxjava3.disposables.b bVar = this.g;
        l7s l7sVar = this.a;
        if (this.f || !Settings.canDrawOverlays(l7sVar)) {
            return;
        }
        vja0 vja0Var = new vja0(com.vk.voip.ui.c.b);
        wja0.a aVar = wja0.a.a;
        synchronized (vja0Var) {
            if (!vja0Var.f) {
                throw new IllegalStateException("Instance is destroyed");
            }
            vja0Var.c(aVar);
        }
        eka0 eka0Var = new eka0(l7sVar, PictureInPictureViewMode.OVERLAY);
        io.reactivex.rxjava3.subjects.f<lka0> fVar = eka0Var.o;
        int i2 = (int) (iah0.f().widthPixels * 0.382f);
        ou3 ou3Var = (ou3) com.vk.voip.ui.c.s0.a.invoke();
        float f = ou3Var.a / ou3Var.b;
        boolean a2 = gz80.a(26);
        if (a2) {
            i = 2038;
        } else {
            if (a2) {
                throw new NoWhenBranchMatchedException();
            }
            i = 2002;
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(i);
        layoutParams.width = i2;
        layoutParams.height = (int) (i2 / f);
        layoutParams.gravity = 8388693;
        float f2 = 48;
        layoutParams.x = iah0.a(f2);
        layoutParams.y = iah0.a(f2);
        layoutParams.type = i;
        layoutParams.format = -3;
        layoutParams.token = new Binder();
        layoutParams.flags = 16777384;
        FrameLayout frameLayout = new FrameLayout(l7sVar);
        frameLayout.setElevation(iah0.a(24));
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new a());
        frameLayout.setOnTouchListener(new zja0(frameLayout.getContext(), frameLayout, windowManager, layoutParams));
        frameLayout.addView(eka0Var.b);
        frameLayout.addOnAttachStateChangeListener(new b(frameLayout, this));
        this.e = frameLayout;
        windowManager.addView(frameLayout, layoutParams);
        eka0Var.a();
        bVar.b(fVar.b0(lka0.a.class).subscribe(new fsq(new d4r(this, 17), 17)));
        eka0Var.a();
        bVar.b(fVar.b0(lka0.b.class).subscribe(new b0y(new tuq(this, 21), 14)));
        synchronized (vja0Var) {
            if (!vja0Var.f) {
                throw new IllegalStateException("Instance is destroyed");
            }
            dVar = vja0Var.b;
        }
        bVar.b(dVar.a0(asu0.a.d()).subscribe(new eiy(new ekh(eka0Var, 25), 14)));
        this.c = vja0Var;
        this.d = eka0Var;
        this.f = true;
    }

    /* compiled from: ViewExt.kt */
    public static final class b implements View.OnAttachStateChangeListener {
        public final /* synthetic */ FrameLayout b;
        public final /* synthetic */ bka0 c;

        public b(FrameLayout frameLayout, bka0 bka0Var) {
            this.b = frameLayout;
            this.c = bka0Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            this.b.removeOnAttachStateChangeListener(this);
            this.c.a();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }
}
