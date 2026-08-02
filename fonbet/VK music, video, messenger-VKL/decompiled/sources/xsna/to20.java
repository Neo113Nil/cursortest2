package xsna;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Outline;
import android.os.Binder;
import android.provider.Settings;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.vk.voip.miniapps.impl.picture_in_picture.overlay.MiniAppCallPiPOverlayService;
import com.vk.voip.ui.groupcalls.GroupCallViewModel;
import kotlin.NoWhenBranchMatchedException;
import org.chromium.base.version_info.VersionConstants;
import xsna.ou3;
import xsna.qo20;
import xsna.ro20;

/* compiled from: MiniAppCallPiPOverlayManager.kt */
/* loaded from: classes7.dex */
public final class to20 {
    public final l7s a;
    public final WindowManager b;
    public po20 c;
    public vo20 d;
    public FrameLayout e;
    public boolean f;
    public final io.reactivex.rxjava3.disposables.b g = new io.reactivex.rxjava3.disposables.b();

    /* compiled from: MiniAppCallPiPOverlayManager.kt */
    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), iah0.a(8.0f));
        }
    }

    public to20(l7s l7sVar) {
        this.a = l7sVar;
        this.b = (WindowManager) l7sVar.getSystemService("window");
    }

    public final void a() {
        if (this.f) {
            this.b.removeView(this.e);
            this.g.e();
            vo20 vo20Var = this.d;
            if (vo20Var != null) {
                vo20Var.r = false;
                vo20Var.t.dispose();
            }
            this.d = null;
            po20 po20Var = this.c;
            if (po20Var != null) {
                synchronized (po20Var) {
                    if (po20Var.h) {
                        po20Var.f.e();
                        po20Var.f.dispose();
                        ro20.b bVar = ro20.b.a;
                        synchronized (po20Var) {
                            if (po20Var.h) {
                                po20Var.c.onNext(bVar);
                            }
                            po20Var.h = false;
                        }
                    }
                }
            }
            this.c = null;
            this.f = false;
            int i = MiniAppCallPiPOverlayService.e;
            l7s l7sVar = this.a;
            try {
                l7sVar.stopService(new Intent(l7sVar, (Class<?>) MiniAppCallPiPOverlayService.class));
            } catch (Throwable th) {
                com.vk.metrics.eventtracking.b.a.q(th);
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility", "InlinedApi"})
    public final void b() {
        int i;
        if (this.f || !Settings.canDrawOverlays(this.a)) {
            return;
        }
        po20 po20Var = new po20(com.vk.voip.ui.c.b, GroupCallViewModel.b);
        po20Var.a(qo20.d.a);
        vo20 vo20Var = new vo20(this.a);
        int a2 = iah0.a(VersionConstants.PRODUCT_MAJOR_VERSION);
        ou3 a3 = ou3.a.a("1:1");
        float f = a3.a / a3.b;
        boolean a4 = gz80.a(26);
        if (a4) {
            i = 2038;
        } else {
            if (a4) {
                throw new NoWhenBranchMatchedException();
            }
            i = 2002;
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(i);
        layoutParams.width = a2;
        layoutParams.height = (int) (a2 / f);
        layoutParams.gravity = 8388693;
        float f2 = 48;
        layoutParams.x = iah0.a(f2);
        layoutParams.y = iah0.a(f2);
        layoutParams.type = i;
        layoutParams.format = -3;
        layoutParams.token = new Binder();
        layoutParams.flags = 16777384;
        FrameLayout frameLayout = new FrameLayout(this.a);
        frameLayout.setElevation(iah0.a(4));
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new a());
        frameLayout.setOnTouchListener(new zja0(frameLayout.getContext(), frameLayout, this.b, layoutParams));
        frameLayout.addView(vo20Var.b);
        frameLayout.addOnAttachStateChangeListener(new b(frameLayout, this));
        this.e = frameLayout;
        this.b.addView(frameLayout, layoutParams);
        if (!vo20Var.r) {
            throw new IllegalStateException("Instance is destroyed");
        }
        this.g.b(vo20Var.p.subscribe(new xn(new g6(17, this, po20Var), 28)));
        synchronized (po20Var) {
            try {
                try {
                    if (!po20Var.h) {
                        throw new IllegalStateException("Instance is destroyed");
                    }
                    io.reactivex.rxjava3.subjects.d<ro20> dVar = po20Var.c;
                    asu0 asu0Var = asu0.a;
                    this.g.b(dVar.a0(asu0Var.d()).subscribe(new g600(new iie(vo20Var, 26), 3)));
                    synchronized (po20Var) {
                        try {
                            try {
                                if (!po20Var.h) {
                                    throw new IllegalStateException("Instance is destroyed");
                                }
                                this.g.b(po20Var.d.a0(asu0Var.d()).subscribe(new kjs(new vs6(1, this, to20.class, "onFeatureEvent", "onFeatureEvent(Lcom/vk/voip/miniapps/impl/picture_in_picture/feature/MiniAppCallPipFeatureEvent;)V", 0, 6), 4)));
                                this.c = po20Var;
                                this.d = vo20Var;
                                this.f = true;
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    /* compiled from: ViewExt.kt */
    public static final class b implements View.OnAttachStateChangeListener {
        public final /* synthetic */ FrameLayout b;
        public final /* synthetic */ to20 c;

        public b(FrameLayout frameLayout, to20 to20Var) {
            this.b = frameLayout;
            this.c = to20Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            this.b.removeOnAttachStateChangeListener(this);
            try {
                this.c.a();
            } catch (Throwable th) {
                com.vk.metrics.eventtracking.b.a.q(th);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }
}
