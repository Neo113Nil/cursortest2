package xsna;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.HardwareRenderer;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.PixelCopy;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.widget.MaxWidthFrameLayout;
import com.vk.core.tool.view.vkblur.VkBlurContentView;
import com.vk.core.tool.view.vkblur.VkBlurView;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import xsna.u1z;

/* compiled from: ModalBottomSheetDialog.kt */
/* loaded from: classes17.dex */
public class nw20 extends b33 {
    public static final float k1;
    public static final float m1;
    public Rect A;
    public u1z.a A0;
    public boolean B;
    public u080 B0;
    public CharSequence C;
    public final ColorDrawable C0;
    public String D;
    public final Handler D0;
    public izs<? super View, s3q0> E;
    public boolean E0;
    public Drawable F;
    public MaxWidthFrameLayout F0;
    public CharSequence G;
    public Integer G0;
    public CharSequence H;
    public boolean H0;
    public hz20 I;
    public boolean I0;
    public izs<? super View, s3q0> J;
    public int J0;
    public wzs<? super View, ? super MotionEvent, Boolean> K;
    public int K0;
    public CharSequence L;
    public int L0;
    public hz20 M;
    public int M0;
    public izs<? super View, s3q0> N;
    public boolean N0;
    public float O;
    public boolean O0;
    public boolean P;
    public boolean P0;
    public ModalBottomSheetBehavior.d Q;
    public boolean Q0;
    public int R;
    public int R0;
    public int S;
    public Integer S0;
    public float T;
    public boolean T0;
    public boolean U;
    public boolean U0;
    public boolean V;
    public c V0;
    public int W;
    public boolean W0;
    public int X;
    public boolean X0;

    @SuppressLint({"WrongConstant"})
    public int Y;
    public gzs<s3q0> Y0;
    public ImageView Z;
    public Drawable Z0;
    public ViewGroup a0;
    public boolean a1;
    public TextView b0;
    public a b1;
    public TextView c0;
    public boolean c1;
    public TextView d0;
    public boolean d1;
    public ImageView e0;
    public boolean e1;
    public View f0;
    public boolean f1;
    public TextView g0;
    public final b g1;
    public wzs<? super com.vk.core.ui.bottomsheet.internal.b, ? super u080, ? extends ModalBottomSheetBehavior<ViewGroup>> h;
    public TextView h0;
    public ModalBottomSheetBehavior<ViewGroup> i;
    public ViewGroup i0;
    public boolean j;
    public ViewGroup j0;
    public boolean k;
    public CoordinatorLayout k0;
    public boolean l;
    public ViewGroup l0;
    public boolean m;
    public View m0;
    public boolean n;
    public ViewGroup n0;
    public boolean o;
    public ViewGroup o0;
    public boolean p;
    public ViewGroup p0;
    public boolean q;
    public View q0;
    public boolean r;
    public com.vk.core.ui.bottomsheet.internal.b r0;
    public boolean s;
    public boolean s0;
    public boolean t;
    public boolean t0;
    public CharSequence u;
    public Boolean u0;
    public Integer v;
    public boolean v0;
    public Integer w;
    public boolean w0;
    public Integer x;
    public VkBlurView x0;
    public Integer y;
    public boolean y0;
    public float z;
    public soo z0;
    public static final int h1 = iah0.a(68);
    public static final int i1 = iah0.a(38);
    public static final float j1 = iah0.a(48);
    public static final int l1 = iah0.a(4);

    /* compiled from: ModalBottomSheetDialog.kt */
    public static final class a extends RecyclerView.t {
        public int b;
        public boolean c;
        public final WeakReference<RecyclerView> d;
        public final WeakReference<View> e;
        public final bpn0 f = new bpn0(new a44(24));
        public ep0 g;

        public a(RecyclerView recyclerView, View view) {
            this.d = new WeakReference<>(recyclerView);
            this.e = new WeakReference<>(view);
            recyclerView.addOnScrollListener(this);
        }

        public final void l() {
            View view = this.e.get();
            if (view != null) {
                view.setVisibility(this.b <= nw20.l1 ? 4 : 0);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            this.c = false;
            this.b = recyclerView.computeVerticalScrollOffset();
            l();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            this.b += i2;
            ep0 ep0Var = this.g;
            bpn0 bpn0Var = this.f;
            if (ep0Var != null) {
                ((Handler) bpn0Var.getValue()).removeCallbacks(ep0Var);
            }
            this.c = true;
            Handler handler = (Handler) bpn0Var.getValue();
            ep0 ep0Var2 = this.g;
            if (ep0Var2 == null) {
                ep0Var2 = new ep0(this, 7);
                this.g = ep0Var2;
            }
            handler.postDelayed(ep0Var2, 16L);
            l();
        }
    }

    /* compiled from: ModalBottomSheetDialog.kt */
    public static final class b extends ModalBottomSheetBehavior.d {
        public float a = -1.0f;

        public b() {
        }

        @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
        public final void a(View view, float f) {
            ModalBottomSheetBehavior<ViewGroup> modalBottomSheetBehavior;
            nw20 nw20Var = nw20.this;
            if (!nw20Var.H0 && nw20Var.I0) {
                nw20.p(nw20Var);
            }
            nw20.n(nw20Var, nw20Var.n0);
            nw20.n(nw20Var, nw20Var.p0);
            nw20.o(nw20Var);
            if (!nw20Var.d1 || (modalBottomSheetBehavior = nw20Var.i) == null || modalBottomSheetBehavior.k != 2 || modalBottomSheetBehavior.l != 3 || f >= this.a) {
                ColorDrawable colorDrawable = nw20Var.C0;
                ModalBottomSheetBehavior<ViewGroup> modalBottomSheetBehavior2 = nw20Var.i;
                float min = (modalBottomSheetBehavior2 == null || !modalBottomSheetBehavior2.j) ? 1 + Math.min(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f) : Math.min(1.0f, f);
                float f2 = nw20Var.O;
                if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f2 = 0.5f;
                }
                colorDrawable.setAlpha(l8g.b(min * f2));
            }
            nw20Var.x();
            VkBlurView vkBlurView = nw20Var.x0;
            if (vkBlurView != null) {
                vkBlurView.invalidate();
            }
            ModalBottomSheetBehavior.d dVar = nw20Var.Q;
            if (dVar != null) {
                dVar.a(view, f);
            }
            this.a = f;
        }

        @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
        public final void b(int i, View view) {
            nw20 nw20Var = nw20.this;
            int i2 = nw20Var.Y;
            if (i2 <= 0) {
                i2 = 5;
            }
            if (i == i2) {
                if (nw20Var.Q0) {
                    nw20Var.dismiss();
                } else {
                    nw20Var.cancel();
                }
            }
            ModalBottomSheetBehavior.d dVar = nw20Var.Q;
            if (dVar != null) {
                dVar.b(i, view);
            }
        }
    }

    /* compiled from: ModalBottomSheetDialog.kt */
    public static final class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            nw20 nw20Var = nw20.this;
            ModalBottomSheetBehavior<ViewGroup> modalBottomSheetBehavior = nw20Var.i;
            if (modalBottomSheetBehavior != null && modalBottomSheetBehavior.k == 5) {
                modalBottomSheetBehavior.O((modalBottomSheetBehavior.j || nw20Var.k || (nw20Var.v0 && nw20Var.t())) ? 3 : 4);
            }
            nw20Var.w(nw20Var.U0);
            if (equals(nw20Var.V0)) {
                nw20Var.V0 = null;
            }
        }
    }

    static {
        float f = 12;
        k1 = iah0.a(f);
        m1 = iah0.a(f);
    }

    public nw20(Context context, int i) {
        super(context, i);
        this.l = true;
        this.p = true;
        this.q = true;
        this.r = true;
        this.u = "";
        this.z = j1;
        this.C = "";
        this.H = "";
        this.L = "";
        this.O = -1.0f;
        this.P = true;
        this.R = -1;
        this.S = -1;
        this.T = m1;
        this.V = true;
        this.W = -1;
        this.Y = -1;
        this.r0 = new ts90(0.5f, 2);
        this.s0 = true;
        this.B0 = new kw20();
        ColorDrawable colorDrawable = new ColorDrawable(-16777216);
        colorDrawable.setAlpha(0);
        this.C0 = colorDrawable;
        this.D0 = new Handler(Looper.getMainLooper());
        this.E0 = true;
        this.I0 = true;
        this.J0 = iah0.a(125);
        this.L0 = -1;
        this.M0 = -1;
        this.N0 = true;
        this.X0 = true;
        m(1);
        this.g1 = new b();
    }

    public static final void n(nw20 nw20Var, View view) {
        if (view != null) {
            ViewGroup viewGroup = nw20Var.i0;
            if (viewGroup == null) {
                viewGroup = null;
            }
            int height = view.getHeight() + viewGroup.getTop();
            CoordinatorLayout coordinatorLayout = nw20Var.k0;
            int height2 = (height - (coordinatorLayout != null ? coordinatorLayout : null).getHeight()) + i1;
            if (height2 > 0) {
                view.setTranslationY(height2);
            } else {
                view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            view.setImportantForAccessibility(1);
        }
    }

    public static final void o(nw20 nw20Var) {
        ViewGroup viewGroup;
        if (nw20Var.e1 && nw20Var.M0 == -1 && (viewGroup = nw20Var.n0) != null) {
            ViewGroup viewGroup2 = nw20Var.i0;
            if (viewGroup2 == null) {
                viewGroup2 = null;
            }
            int top = viewGroup2.getTop();
            ViewGroup viewGroup3 = nw20Var.i0;
            if (viewGroup3 == null) {
                viewGroup3 = null;
            }
            int height = ((viewGroup3.getHeight() + top) - viewGroup.getTop()) - viewGroup.getHeight();
            ViewGroup viewGroup4 = nw20Var.j0;
            if (viewGroup4 == null) {
                viewGroup4 = null;
            }
            if (viewGroup4.getPaddingBottom() == height) {
                return;
            }
            ViewGroup viewGroup5 = nw20Var.j0;
            f4m.v(height, viewGroup5 != null ? viewGroup5 : null);
        }
    }

    public static final void p(nw20 nw20Var) {
        CoordinatorLayout coordinatorLayout = nw20Var.k0;
        if (coordinatorLayout == null) {
            coordinatorLayout = null;
        }
        int bottom = coordinatorLayout.getBottom();
        ViewGroup viewGroup = nw20Var.i0;
        if (viewGroup == null) {
            viewGroup = null;
        }
        float top = bottom - viewGroup.getTop();
        CoordinatorLayout coordinatorLayout2 = nw20Var.k0;
        if (coordinatorLayout2 == null) {
            coordinatorLayout2 = null;
        }
        float measuredHeight = top / coordinatorLayout2.getMeasuredHeight();
        float f = 1;
        float f2 = f - 0.9f;
        float f3 = ((f2 / 3) * 2) + 0.9f;
        int i = 4;
        if (nw20Var.X0) {
            ImageView imageView = nw20Var.Z;
            if (imageView == null) {
                imageView = null;
            }
            imageView.setAlpha(1.0f);
        } else if (nw20Var.W0) {
            ImageView imageView2 = nw20Var.Z;
            if (imageView2 == null) {
                imageView2 = null;
            }
            imageView2.setVisibility(4);
        } else if (measuredHeight < f3) {
            ImageView imageView3 = nw20Var.Z;
            if (imageView3 == null) {
                imageView3 = null;
            }
            imageView3.setScaleX(0.6f);
            ImageView imageView4 = nw20Var.Z;
            if (imageView4 == null) {
                imageView4 = null;
            }
            imageView4.setScaleY(0.6f);
            ImageView imageView5 = nw20Var.Z;
            if (imageView5 == null) {
                imageView5 = null;
            }
            imageView5.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            ImageView imageView6 = nw20Var.Z;
            if (imageView6 == null) {
                imageView6 = null;
            }
            imageView6.setVisibility(4);
        }
        if (nw20Var.X0) {
            nw20Var.z(true);
            ImageView imageView7 = nw20Var.Z;
            if (imageView7 == null) {
                imageView7 = null;
            }
            imageView7.setVisibility(0);
        } else if (measuredHeight < 0.9f || drm0.N(nw20Var.u)) {
            if (!nw20Var.E0) {
                View view = nw20Var.f0;
                if (view == null) {
                    view = null;
                }
                view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                View view2 = nw20Var.f0;
                if (view2 == null) {
                    view2 = null;
                }
                view2.setVisibility(4);
            }
            nw20Var.z(false);
        } else if (nw20Var.W0) {
            nw20Var.z(false);
            ImageView imageView8 = nw20Var.Z;
            if (imageView8 == null) {
                imageView8 = null;
            }
            imageView8.setVisibility(4);
        } else {
            float f4 = (measuredHeight - 0.9f) / f2;
            float f5 = (measuredHeight - f3) / (f - f3);
            if (f5 >= 0.6f) {
                ImageView imageView9 = nw20Var.Z;
                if (imageView9 == null) {
                    imageView9 = null;
                }
                imageView9.setScaleX(f5);
                ImageView imageView10 = nw20Var.Z;
                if (imageView10 == null) {
                    imageView10 = null;
                }
                imageView10.setScaleY(f5);
            }
            ImageView imageView11 = nw20Var.Z;
            if (imageView11 == null) {
                imageView11 = null;
            }
            imageView11.setAlpha(f5);
            ImageView imageView12 = nw20Var.Z;
            if (imageView12 == null) {
                imageView12 = null;
            }
            imageView12.setVisibility(f5 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 4 : 0);
            if (!nw20Var.E0) {
                View view3 = nw20Var.f0;
                if (view3 == null) {
                    view3 = null;
                }
                view3.setAlpha(f4);
                View view4 = nw20Var.f0;
                if (view4 == null) {
                    view4 = null;
                }
                if (f4 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && nw20Var.P) {
                    i = 0;
                }
                view4.setVisibility(i);
            }
            if (!nw20Var.v0 || nw20Var.w0) {
                ViewGroup viewGroup2 = nw20Var.a0;
                if (viewGroup2 == null) {
                    viewGroup2 = null;
                }
                ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
                FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
                if (layoutParams2 != null) {
                    float f6 = k1;
                    layoutParams2.setMarginStart((int) u11.b(nw20Var.z, f6, f4, f6));
                    ViewGroup viewGroup3 = nw20Var.a0;
                    if (viewGroup3 == null) {
                        viewGroup3 = null;
                    }
                    viewGroup3.setLayoutParams(layoutParams2);
                }
            }
        }
        ViewGroup viewGroup4 = nw20Var.a0;
        (viewGroup4 != null ? viewGroup4 : null).setImportantForAccessibility(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0025, code lost:
    
        if (r0 == r2) goto L31;
     */
    @Override // android.app.Dialog, android.content.DialogInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void cancel() {
        Activity ownerActivity = getOwnerActivity();
        if (ownerActivity == null) {
            return;
        }
        if (ownerActivity.isFinishing() || ownerActivity.isDestroyed()) {
            super.cancel();
            return;
        }
        if (!this.O0) {
            ModalBottomSheetBehavior<ViewGroup> modalBottomSheetBehavior = this.i;
            if (modalBottomSheetBehavior != null) {
                int i = modalBottomSheetBehavior.k;
                int i2 = this.Y;
                if (i2 <= 0) {
                    i2 = 5;
                }
            }
            c cVar = this.V0;
            if (cVar != null) {
                this.D0.removeCallbacks(cVar);
                this.V0 = null;
            }
            ModalBottomSheetBehavior<ViewGroup> modalBottomSheetBehavior2 = this.i;
            if (modalBottomSheetBehavior2 != null) {
                modalBottomSheetBehavior2.M(true);
            }
            ModalBottomSheetBehavior<ViewGroup> modalBottomSheetBehavior3 = this.i;
            if (modalBottomSheetBehavior3 != null) {
                modalBottomSheetBehavior3.O(5);
            }
            this.O0 = true;
            return;
        }
        super.cancel();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0039, code lost:
    
        if (r0 == r2) goto L36;
     */
    @Override // xsna.b33, android.app.Dialog, android.content.DialogInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void dismiss() {
        soo sooVar;
        if (Build.VERSION.SDK_INT >= 31 && (sooVar = this.z0) != null) {
            sooVar.f = false;
            sooVar.c.removeFrameCallback(sooVar.g);
        }
        Activity ownerActivity = getOwnerActivity();
        if (ownerActivity == null) {
            return;
        }
        if (ownerActivity.isFinishing() || ownerActivity.isDestroyed()) {
            super.dismiss();
            return;
        }
        if (!this.O0) {
            ModalBottomSheetBehavior<ViewGroup> modalBottomSheetBehavior = this.i;
            if (modalBottomSheetBehavior != null) {
                int i = modalBottomSheetBehavior.k;
                int i2 = this.Y;
                if (i2 <= 0) {
                    i2 = 5;
                }
            }
            c cVar = this.V0;
            if (cVar != null) {
                this.D0.removeCallbacks(cVar);
                this.V0 = null;
            }
            ModalBottomSheetBehavior<ViewGroup> modalBottomSheetBehavior2 = this.i;
            if (modalBottomSheetBehavior2 != null) {
                modalBottomSheetBehavior2.M(true);
            }
            ModalBottomSheetBehavior<ViewGroup> modalBottomSheetBehavior3 = this.i;
            if (modalBottomSheetBehavior3 != null) {
                modalBottomSheetBehavior3.O(5);
            }
            this.O0 = true;
            return;
        }
        super.dismiss();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.t = false;
        super.onAttachedToWindow();
    }

    @Override // xsna.b33, xsna.y8i, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            if (this.o) {
                window.setFlags(8, 8);
                window.getDecorView().setSystemUiVisibility(4866);
                window.clearFlags(8);
            }
            if (this.n) {
                window.addFlags(1024);
            } else {
                window.clearFlags(1024);
            }
            window.setLayout(-1, -1);
            window.setGravity(1);
            window.clearFlags(2);
            window.setWindowAnimations(0);
        }
        TypedValue typedValue = krv0.a;
        krv0.s(window, this.R0);
        View decorView = window != null ? window.getDecorView() : null;
        if (decorView != null) {
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.t = true;
        a aVar = this.b1;
        if (aVar != null) {
            bpn0 bpn0Var = aVar.f;
            RecyclerView recyclerView = aVar.d.get();
            if (recyclerView != null) {
                recyclerView.removeOnScrollListener(aVar);
            }
            ep0 ep0Var = aVar.g;
            if (ep0Var != null) {
                ((Handler) bpn0Var.getValue()).removeCallbacks(ep0Var);
            }
            ((Handler) bpn0Var.getValue()).removeCallbacksAndMessages(null);
        }
        super.onDetachedFromWindow();
    }

    public final void q() {
        ViewGroup viewGroup = this.j0;
        if (viewGroup == null) {
            viewGroup = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams();
        marginLayoutParams.setMarginStart(this.X);
        marginLayoutParams.setMarginEnd(this.X);
        marginLayoutParams.bottomMargin = this.X;
    }

    public final void r() {
        Window window;
        e90 e90Var = e90.a;
        final Context context = getContext();
        final rlh rlhVar = new rlh(this, 24);
        e90Var.getClass();
        Context context2 = context;
        while (true) {
            if (!(context2 instanceof ContextWrapper)) {
                window = null;
                break;
            } else {
                if (context2 instanceof Activity) {
                    window = ((Activity) context2).getWindow();
                    break;
                }
                context2 = ((ContextWrapper) context2).getBaseContext();
            }
        }
        if (window == null) {
            rlhVar.invoke(null);
            return;
        }
        View decorView = window.getDecorView();
        int width = decorView.getWidth();
        int height = decorView.getHeight();
        if (width <= 0 || height <= 0) {
            rlhVar.invoke(null);
            return;
        }
        final Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        try {
            PixelCopy.request(window, new Rect(0, 0, width, height), createBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: xsna.d90
                @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                public final void onPixelCopyFinished(int i) {
                    ImageReader newInstance;
                    RenderEffect createBlurEffect;
                    RecordingCanvas beginRecording;
                    HardwareRenderer.FrameRenderRequest createRenderRequest;
                    HardwareRenderer.FrameRenderRequest waitForPresent;
                    Bitmap wrapHardwareBuffer;
                    rlh rlhVar2 = rlhVar;
                    if (i != 0) {
                        rlhVar2.invoke(null);
                        return;
                    }
                    e90.a.getClass();
                    Bitmap bitmap = createBitmap;
                    int width2 = (int) (bitmap.getWidth() * 0.25f);
                    if (width2 < 1) {
                        width2 = 1;
                    }
                    int height2 = (int) (bitmap.getHeight() * 0.25f);
                    if (height2 < 1) {
                        height2 = 1;
                    }
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, width2, height2, true);
                    if (Build.VERSION.SDK_INT >= 31) {
                        newInstance = ImageReader.newInstance(createScaledBitmap.getWidth(), createScaledBitmap.getHeight(), 1, 1, 768L);
                        RenderNode b2 = z80.b();
                        HardwareRenderer c2 = i32.c();
                        try {
                            c2.setSurface(newInstance.getSurface());
                            c2.setContentRoot(b2);
                            b2.setPosition(0, 0, createScaledBitmap.getWidth(), createScaledBitmap.getHeight());
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            createBlurEffect = RenderEffect.createBlurEffect(10.0f, 10.0f, Shader.TileMode.CLAMP);
                            b2.setRenderEffect(createBlurEffect);
                            beginRecording = b2.beginRecording();
                            try {
                                beginRecording.drawBitmap(createScaledBitmap, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Paint) null);
                                b2.endRecording();
                                createRenderRequest = c2.createRenderRequest();
                                waitForPresent = createRenderRequest.setWaitForPresent(true);
                                waitForPresent.syncAndDraw();
                                Image acquireNextImage = newInstance.acquireNextImage();
                                if (acquireNextImage != null) {
                                    HardwareBuffer hardwareBuffer = acquireNextImage.getHardwareBuffer();
                                    if (hardwareBuffer == null) {
                                        acquireNextImage.close();
                                    } else {
                                        wrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, createScaledBitmap.getColorSpace());
                                        hardwareBuffer.close();
                                        acquireNextImage.close();
                                        if (wrapHardwareBuffer != null) {
                                            createScaledBitmap = wrapHardwareBuffer;
                                        }
                                    }
                                }
                            } catch (Throwable th) {
                                b2.endRecording();
                                throw th;
                            }
                        } finally {
                            c2.destroy();
                            b2.discardDisplayList();
                            newInstance.close();
                        }
                    } else {
                        RenderScript create = RenderScript.create(context);
                        Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
                        Allocation createTyped = Allocation.createTyped(create, createFromBitmap.getType());
                        ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
                        try {
                            create2.setRadius(swe0.f(10.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 25.0f));
                            create2.setInput(createFromBitmap);
                            create2.forEach(createTyped);
                            createTyped.copyTo(createScaledBitmap);
                        } finally {
                            create2.destroy();
                            createFromBitmap.destroy();
                            createTyped.destroy();
                            create.destroy();
                        }
                    }
                    rlhVar2.invoke(createScaledBitmap);
                }
            }, new Handler(Looper.getMainLooper()));
        } catch (IllegalArgumentException unused) {
            rlhVar.invoke(null);
        }
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) {
        ModalBottomSheetBehavior<ViewGroup> modalBottomSheetBehavior;
        super.setCancelable(z);
        if (this.p != z) {
            this.p = z;
            if (z && this.N0) {
                ModalBottomSheetBehavior<ViewGroup> modalBottomSheetBehavior2 = this.i;
                if (modalBottomSheetBehavior2 != null) {
                    modalBottomSheetBehavior2.M(true);
                    return;
                }
                return;
            }
            if (z || (modalBottomSheetBehavior = this.i) == null) {
                return;
            }
            modalBottomSheetBehavior.M(false);
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.p) {
            this.p = true;
        }
        this.r = z;
        this.s = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0120  */
    @Override // xsna.b33, xsna.y8i, android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        boolean z;
        Drawable d;
        ModalBottomSheetBehavior<ViewGroup> modalBottomSheetBehavior;
        FrameLayout frameLayout;
        String str;
        soo sooVar;
        CoordinatorLayout coordinatorLayout;
        Window window;
        Boolean bool = this.u0;
        int i = 0;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            getContext();
            z = false;
        }
        this.v0 = z;
        this.k0 = (CoordinatorLayout) LayoutInflater.from(getContext()).inflate(z ? R.layout.modal_dialog_bottom_sheet_lego : R.layout.modal_dialog_bottom_sheet, (ViewGroup) null);
        int i2 = 5;
        if (this.v0) {
            this.U0 = true;
            int a2 = (this.t0 || t()) ? 0 : iah0.a(42);
            float f = t() ? 1.0f : 0.6666667f;
            if (this.q0 == null) {
                if (!this.s0) {
                    com.vk.core.ui.bottomsheet.internal.c cVar = new com.vk.core.ui.bottomsheet.internal.c(f);
                    cVar.b = a2;
                    this.r0 = cVar;
                } else if ((this.k || (this.r0 instanceof ts90)) && !this.t0) {
                    com.vk.core.ui.bottomsheet.internal.d dVar = new com.vk.core.ui.bottomsheet.internal.d(f);
                    dVar.d = a2;
                    this.r0 = dVar;
                }
            }
            int f2 = e3m.f(R.attr.vk_ui_background_modal, getContext());
            int[] iArr = new int[5];
            for (int i3 = 0; i3 < 5; i3++) {
                iArr[i3] = Color.argb(swe0.g((int) (u1z.b[i3] * 255.0f), 0, 255), Color.red(f2), Color.green(f2), Color.blue(f2));
            }
            this.A0 = new u1z.a(iArr, u1z.a);
            if (this.y0 && Build.VERSION.SDK_INT >= 31 && ValueAnimator.areAnimatorsEnabled()) {
                Context context = getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        window = null;
                        break;
                    } else {
                        if (context instanceof Activity) {
                            window = ((Activity) context).getWindow();
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                if (window != null) {
                    sooVar = new soo(window);
                    if (sooVar == null) {
                        this.z0 = sooVar;
                        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{sooVar.b, this.A0});
                        Window window2 = getWindow();
                        if (window2 != null) {
                            window2.setBackgroundDrawable(layerDrawable);
                            s3q0 s3q0Var = s3q0.a;
                        }
                        if (!sooVar.f) {
                            sooVar.f = true;
                            sooVar.c.postFrameCallback(sooVar.g);
                        }
                    } else {
                        Window window3 = getWindow();
                        if (window3 != null) {
                            window3.setBackgroundDrawable(new LayerDrawable(new Drawable[]{this.A0}));
                            s3q0 s3q0Var2 = s3q0.a;
                        }
                        r();
                    }
                    coordinatorLayout = this.k0;
                    if (coordinatorLayout == null) {
                        coordinatorLayout = null;
                    }
                    coordinatorLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: xsna.hw20
                        @Override // android.view.View.OnLayoutChangeListener
                        public final void onLayoutChange(View view2, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                            int i12 = i10 - i8;
                            int i13 = i11 - i9;
                            if (!(i6 - i4 == i12 && i7 - i5 == i13) && i12 > 0 && i13 > 0) {
                                nw20 nw20Var = nw20.this;
                                CoordinatorLayout coordinatorLayout2 = nw20Var.k0;
                                if (coordinatorLayout2 == null) {
                                    coordinatorLayout2 = null;
                                }
                                coordinatorLayout2.post(new tw3(nw20Var, 11));
                            }
                        }
                    });
                }
            }
            sooVar = null;
            if (sooVar == null) {
            }
            coordinatorLayout = this.k0;
            if (coordinatorLayout == null) {
            }
            coordinatorLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: xsna.hw20
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view2, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                    int i12 = i10 - i8;
                    int i13 = i11 - i9;
                    if (!(i6 - i4 == i12 && i7 - i5 == i13) && i12 > 0 && i13 > 0) {
                        nw20 nw20Var = nw20.this;
                        CoordinatorLayout coordinatorLayout2 = nw20Var.k0;
                        if (coordinatorLayout2 == null) {
                            coordinatorLayout2 = null;
                        }
                        coordinatorLayout2.post(new tw3(nw20Var, 11));
                    }
                }
            });
        }
        CoordinatorLayout coordinatorLayout2 = this.k0;
        if (coordinatorLayout2 == null) {
            coordinatorLayout2 = null;
        }
        ViewGroup viewGroup = (ViewGroup) coordinatorLayout2.findViewById(R.id.design_bottom_sheet);
        this.i0 = viewGroup;
        this.Z = (ImageView) viewGroup.findViewById(R.id.ivClose);
        ViewGroup viewGroup2 = this.i0;
        if (viewGroup2 == null) {
            viewGroup2 = null;
        }
        this.a0 = (ViewGroup) viewGroup2.findViewById(R.id.llTitleContainer);
        ViewGroup viewGroup3 = this.i0;
        if (viewGroup3 == null) {
            viewGroup3 = null;
        }
        this.b0 = (TextView) viewGroup3.findViewById(R.id.tvTitle);
        ViewGroup viewGroup4 = this.i0;
        if (viewGroup4 == null) {
            viewGroup4 = null;
        }
        this.c0 = (TextView) viewGroup4.findViewById(R.id.tvSubtitle);
        ViewGroup viewGroup5 = this.i0;
        if (viewGroup5 == null) {
            viewGroup5 = null;
        }
        this.e0 = (ImageView) viewGroup5.findViewById(R.id.ivEndIcon);
        ViewGroup viewGroup6 = this.i0;
        if (viewGroup6 == null) {
            viewGroup6 = null;
        }
        this.f0 = viewGroup6.findViewById(R.id.header_shadow);
        ViewGroup viewGroup7 = this.i0;
        if (viewGroup7 == null) {
            viewGroup7 = null;
        }
        this.l0 = (ViewGroup) viewGroup7.findViewById(R.id.toolbar);
        ViewGroup viewGroup8 = this.i0;
        if (viewGroup8 == null) {
            viewGroup8 = null;
        }
        this.j0 = (ViewGroup) viewGroup8.findViewById(R.id.bottom_sheet_content_holder);
        ViewGroup viewGroup9 = this.i0;
        if (viewGroup9 == null) {
            viewGroup9 = null;
        }
        this.d0 = (TextView) viewGroup9.findViewById(R.id.btnEndTitle);
        ViewGroup viewGroup10 = this.i0;
        if (viewGroup10 == null) {
            viewGroup10 = null;
        }
        View findViewById = viewGroup10.findViewById(R.id.drag_handle);
        this.m0 = findViewById;
        f4m.E(findViewById, this.c1);
        int i4 = 12;
        if (this.v0) {
            ViewGroup viewGroup11 = this.i0;
            if (viewGroup11 == null) {
                viewGroup11 = null;
            }
            viewGroup11.setBackground(new ColorDrawable(e3m.f(R.attr.vk_ui_background_modal, getContext())));
            if (this.F != null || this.D != null || this.N != null) {
                ImageView imageView = this.Z;
                if (imageView == null) {
                    imageView = null;
                }
                ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                FrameLayout.LayoutParams layoutParams3 = layoutParams2 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams2 : null;
                if (layoutParams3 != null) {
                    layoutParams3.gravity = 8388627;
                    ImageView imageView2 = this.Z;
                    if (imageView2 == null) {
                        imageView2 = null;
                    }
                    imageView2.setLayoutParams(layoutParams3);
                }
                ViewGroup viewGroup12 = this.a0;
                if (viewGroup12 == null) {
                    viewGroup12 = null;
                }
                ViewGroup.LayoutParams layoutParams4 = viewGroup12.getLayoutParams();
                FrameLayout.LayoutParams layoutParams5 = layoutParams4 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams4 : null;
                if (layoutParams5 != null) {
                    layoutParams5.setMarginStart(iah0.a(56));
                    layoutParams5.setMarginEnd(iah0.a(12));
                    ViewGroup viewGroup13 = this.a0;
                    if (viewGroup13 == null) {
                        viewGroup13 = null;
                    }
                    viewGroup13.setLayoutParams(layoutParams5);
                }
                this.w0 = true;
            }
            com.vk.core.ui.bottomsheet.internal.b bVar = this.r0;
            com.vk.core.ui.bottomsheet.internal.d dVar2 = bVar instanceof com.vk.core.ui.bottomsheet.internal.d ? (com.vk.core.ui.bottomsheet.internal.d) bVar : null;
            if (dVar2 != null) {
                ViewGroup viewGroup14 = this.j0;
                if (viewGroup14 == null) {
                    viewGroup14 = null;
                }
                dVar2.b = viewGroup14;
                s3q0 s3q0Var3 = s3q0.a;
            }
            if (view.findViewById(R.id.close_icon) != null && !this.m) {
                View view2 = this.m0;
                if (view2 == null) {
                    view2 = null;
                }
                view2.setVisibility(0);
            }
        }
        if (this.a1) {
            CoordinatorLayout coordinatorLayout3 = this.k0;
            if (coordinatorLayout3 == null) {
                coordinatorLayout3 = null;
            }
            sk3 sk3Var = new sk3();
            sk3Var.addLast(coordinatorLayout3);
            while (!sk3Var.isEmpty()) {
                View view3 = (View) sk3Var.removeLast();
                view3.setFitsSystemWindows(false);
                if (view3 instanceof ViewGroup) {
                    ViewGroup viewGroup15 = (ViewGroup) view3;
                    for (int i5 = 0; i5 < viewGroup15.getChildCount(); i5++) {
                        sk3Var.addLast(viewGroup15.getChildAt(i5));
                    }
                }
            }
        }
        Integer num = this.w;
        if (num != null) {
            int intValue = num.intValue();
            TextView textView = this.b0;
            if (textView == null) {
                textView = null;
            }
            textView.setTextAppearance(intValue);
            s3q0 s3q0Var4 = s3q0.a;
        }
        Integer num2 = this.x;
        if (num2 != null) {
            int intValue2 = num2.intValue();
            TextView textView2 = this.b0;
            if (textView2 == null) {
                textView2 = null;
            }
            textView2.setMaxLines(intValue2);
            s3q0 s3q0Var5 = s3q0.a;
        }
        Integer num3 = this.y;
        if (num3 != null) {
            int intValue3 = num3.intValue();
            TextView textView3 = this.b0;
            if (textView3 == null) {
                textView3 = null;
            }
            textView3.setGravity(intValue3);
            s3q0 s3q0Var6 = s3q0.a;
        }
        Rect rect = this.A;
        if (rect != null) {
            ViewGroup viewGroup16 = this.a0;
            if (viewGroup16 == null) {
                viewGroup16 = null;
            }
            viewGroup16.setPadding(rect.left, rect.top, rect.right, rect.bottom);
            s3q0 s3q0Var7 = s3q0.a;
        }
        ViewGroup viewGroup17 = this.j0;
        if (viewGroup17 == null) {
            viewGroup17 = null;
        }
        if (this.v0) {
            q();
            d = new ColorDrawable(e3m.f(R.attr.vk_ui_background_modal, view.getContext()));
        } else if (this.P0) {
            q();
            d = null;
        } else if (this.R != -1) {
            d = gu9.d(view.getContext(), Integer.valueOf(e3m.f(this.R, view.getContext())));
        } else if (this.W != -1) {
            q();
            Integer num4 = this.v;
            int intValue4 = num4 != null ? num4.intValue() : l8g.d(this.W) ? -16777216 : -1;
            ImageView imageView3 = this.Z;
            if (imageView3 == null) {
                imageView3 = null;
            }
            imageView3.setColorFilter(intValue4);
            TextView textView4 = this.b0;
            if (textView4 == null) {
                textView4 = null;
            }
            textView4.setTextColor(intValue4);
            d = gu9.d(view.getContext(), Integer.valueOf(this.W));
        } else {
            d = gu9.d(view.getContext(), null);
        }
        viewGroup17.setBackground(d);
        if (this.C.length() == 0) {
            TextView textView5 = this.c0;
            if (textView5 == null) {
                textView5 = null;
            }
            textView5.setVisibility(8);
        } else {
            TextView textView6 = this.c0;
            if (textView6 == null) {
                textView6 = null;
            }
            textView6.setVisibility(0);
        }
        TextView textView7 = this.b0;
        if (textView7 == null) {
            textView7 = null;
        }
        textView7.setText(this.u);
        TextView textView8 = this.c0;
        if (textView8 == null) {
            textView8 = null;
        }
        textView8.setText(this.C);
        Drawable drawable = this.F;
        int i6 = 7;
        if (drawable != null) {
            ImageView imageView4 = this.e0;
            if (imageView4 == null) {
                imageView4 = null;
            }
            imageView4.setImageDrawable(drawable);
            CharSequence charSequence = this.G;
            if (charSequence != null) {
                ImageView imageView5 = this.e0;
                if (imageView5 == null) {
                    imageView5 = null;
                }
                imageView5.setContentDescription(charSequence);
            }
            ImageView imageView6 = this.e0;
            if (imageView6 == null) {
                imageView6 = null;
            }
            jjc.g(imageView6, new mgz(this, i6));
            ImageView imageView7 = this.e0;
            if (imageView7 == null) {
                imageView7 = null;
            }
            imageView7.setVisibility(0);
        } else {
            ImageView imageView8 = this.e0;
            if (imageView8 == null) {
                imageView8 = null;
            }
            f4m.j(imageView8);
        }
        Integer num5 = this.S0;
        if (num5 != null) {
            int intValue5 = num5.intValue();
            ImageView imageView9 = this.Z;
            if (imageView9 == null) {
                imageView9 = null;
            }
            imageView9.setColorFilter(e3m.f(intValue5, getContext()));
            s3q0 s3q0Var8 = s3q0.a;
        }
        String str2 = this.D;
        if (str2 != null) {
            TextView textView9 = this.d0;
            if (textView9 == null) {
                textView9 = null;
            }
            textView9.setText(str2);
            TextView textView10 = this.d0;
            if (textView10 == null) {
                textView10 = null;
            }
            jjc.g(textView10, new lw20(this, i));
            TextView textView11 = this.d0;
            if (textView11 == null) {
                textView11 = null;
            }
            textView11.setVisibility(0);
        } else {
            TextView textView12 = this.d0;
            if (textView12 == null) {
                textView12 = null;
            }
            f4m.j(textView12);
        }
        ImageView imageView10 = this.Z;
        if (imageView10 == null) {
            imageView10 = null;
        }
        imageView10.setOnClickListener(new vw0(this, i4));
        Drawable drawable2 = this.Z0;
        if (drawable2 != null) {
            ImageView imageView11 = this.Z;
            if (imageView11 == null) {
                imageView11 = null;
            }
            imageView11.setImageDrawable(drawable2);
            s3q0 s3q0Var9 = s3q0.a;
        }
        if (!this.I0) {
            if (this.W0) {
                z(false);
            } else {
                ImageView imageView12 = this.Z;
                if (imageView12 == null) {
                    imageView12 = null;
                }
                imageView12.setVisibility(0);
                z(true);
            }
            if (!this.E0) {
                View view4 = this.f0;
                if (this.P) {
                    if (view4 == null) {
                        view4 = null;
                    }
                    view4.setVisibility(0);
                } else {
                    if (view4 == null) {
                        view4 = null;
                    }
                    f4m.j(view4);
                }
            }
        }
        CoordinatorLayout coordinatorLayout4 = this.k0;
        if (coordinatorLayout4 == null) {
            coordinatorLayout4 = null;
        }
        this.n0 = (ViewGroup) coordinatorLayout4.findViewById(R.id.buttons_container);
        CoordinatorLayout coordinatorLayout5 = this.k0;
        if (coordinatorLayout5 == null) {
            coordinatorLayout5 = null;
        }
        ViewGroup viewGroup18 = (ViewGroup) coordinatorLayout5.findViewById(R.id.buttons_nested_container);
        this.o0 = viewGroup18;
        if (this.S != -1 && !this.v0 && viewGroup18 != null) {
            viewGroup18.setBackgroundColor(e3m.f(this.S, getContext()));
            s3q0 s3q0Var10 = s3q0.a;
        }
        if (this.v0) {
            CoordinatorLayout coordinatorLayout6 = this.k0;
            if (coordinatorLayout6 == null) {
                coordinatorLayout6 = null;
            }
            VkBlurContentView vkBlurContentView = (VkBlurContentView) coordinatorLayout6.findViewById(R.id.lego_sheet_blur_content);
            if (vkBlurContentView != null) {
                CoordinatorLayout coordinatorLayout7 = this.k0;
                if (coordinatorLayout7 == null) {
                    coordinatorLayout7 = null;
                }
                final VkBlurView vkBlurView = (VkBlurView) coordinatorLayout7.findViewById(R.id.lego_buttons_blur);
                if (vkBlurView != null) {
                    this.x0 = vkBlurView;
                    vkBlurView.setBlurRadius(28.0f);
                    vkBlurView.setupWithContent(vkBlurContentView);
                    vkBlurView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: xsna.jw20
                        @Override // android.view.View.OnLayoutChangeListener
                        public final void onLayoutChange(View view5, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
                            int i15 = i10 - i8;
                            if (i15 <= 0 || i15 == i14 - i12) {
                                return;
                            }
                            nw20 nw20Var = this;
                            int f3 = e3m.f(R.attr.vk_ui_background_modal, nw20Var.getContext());
                            float f4 = i15;
                            int[] iArr2 = {n8g.l(f3, 0), n8g.l(f3, 191)};
                            float[] fArr = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f};
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            LinearGradient linearGradient = new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, iArr2, fArr, tileMode);
                            VkBlurView vkBlurView2 = VkBlurView.this;
                            vkBlurView2.setColorOverlayShader(linearGradient);
                            int i16 = bfu0.a;
                            vkBlurView2.setFallbackColorOverlay(new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, new int[]{0, krv0.m(R.attr.vk_ui_background, nw20Var.getContext())}, new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.95f}, tileMode));
                        }
                    });
                }
            }
            if (t()) {
                int a3 = iah0.a(393);
                ViewGroup viewGroup19 = this.i0;
                if (viewGroup19 == null) {
                    viewGroup19 = null;
                }
                View findViewById2 = viewGroup19.findViewById(R.id.bottom_sheet_content);
                if (findViewById2 != null) {
                    ViewGroup.LayoutParams layoutParams6 = findViewById2.getLayoutParams();
                    FrameLayout.LayoutParams layoutParams7 = layoutParams6 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams6 : null;
                    if (layoutParams7 != null) {
                        layoutParams7.width = a3;
                        layoutParams7.gravity = 1;
                        findViewById2.setLayoutParams(layoutParams7);
                    }
                }
                ViewGroup viewGroup20 = this.o0;
                if (viewGroup20 != null) {
                    ViewGroup.LayoutParams layoutParams8 = viewGroup20.getLayoutParams();
                    FrameLayout.LayoutParams layoutParams9 = layoutParams8 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams8 : null;
                    if (layoutParams9 != null) {
                        layoutParams9.width = a3;
                        layoutParams9.gravity = 81;
                        viewGroup20.setLayoutParams(layoutParams9);
                    }
                }
            }
        }
        CoordinatorLayout coordinatorLayout8 = this.k0;
        if (coordinatorLayout8 == null) {
            coordinatorLayout8 = null;
        }
        View findViewById3 = coordinatorLayout8.findViewById(R.id.button_space);
        this.g0 = (TextView) this.n0.findViewById(R.id.positive_button);
        int i7 = 11;
        if (drm0.N(this.H) || this.I == null) {
            TextView textView13 = this.g0;
            if (textView13 == null) {
                textView13 = null;
            }
            f4m.j(textView13);
            CoordinatorLayout coordinatorLayout9 = this.k0;
            if (coordinatorLayout9 == null) {
                coordinatorLayout9 = null;
            }
            TextView textView14 = this.g0;
            if (textView14 == null) {
                textView14 = null;
            }
            coordinatorLayout9.removeView(textView14);
        } else {
            TextView textView15 = this.g0;
            if (textView15 == null) {
                textView15 = null;
            }
            textView15.setText(this.H);
            textView15.setOnClickListener(new y01(this, i7));
            this.n0.setElevation(100.0f);
        }
        this.h0 = (TextView) this.n0.findViewById(R.id.negative_button);
        if (drm0.N(this.L) || this.M == null) {
            TextView textView16 = this.h0;
            if (textView16 == null) {
                textView16 = null;
            }
            f4m.j(textView16);
            CoordinatorLayout coordinatorLayout10 = this.k0;
            if (coordinatorLayout10 == null) {
                coordinatorLayout10 = null;
            }
            TextView textView17 = this.h0;
            if (textView17 == null) {
                textView17 = null;
            }
            coordinatorLayout10.removeView(textView17);
        } else {
            TextView textView18 = this.h0;
            if (textView18 == null) {
                textView18 = null;
            }
            textView18.setText(this.L);
            textView18.setOnClickListener(new z01(this, i2));
            this.n0.setElevation(100.0f);
        }
        if (u()) {
            f4m.j(findViewById3);
            CoordinatorLayout coordinatorLayout11 = this.k0;
            if (coordinatorLayout11 == null) {
                coordinatorLayout11 = null;
            }
            coordinatorLayout11.removeView(findViewById3);
        } else {
            TextView textView19 = this.g0;
            if (textView19 == null) {
                textView19 = null;
            }
            if (f4m.f(textView19)) {
                TextView textView20 = this.h0;
                if (textView20 == null) {
                    textView20 = null;
                }
                if (f4m.f(textView20)) {
                    ViewGroup viewGroup21 = this.n0;
                    if (viewGroup21 != null) {
                        viewGroup21.removeAllViews();
                        s3q0 s3q0Var11 = s3q0.a;
                    }
                    ViewGroup viewGroup22 = this.n0;
                    if (viewGroup22 != null) {
                        f4m.j(viewGroup22);
                        s3q0 s3q0Var12 = s3q0.a;
                    }
                    CoordinatorLayout coordinatorLayout12 = this.k0;
                    if (coordinatorLayout12 == null) {
                        coordinatorLayout12 = null;
                    }
                    coordinatorLayout12.removeView(this.n0);
                    this.n0 = null;
                }
            }
        }
        TextView textView21 = this.g0;
        if (textView21 == null) {
            textView21 = null;
        }
        if (f4m.f(textView21)) {
            TextView textView22 = this.h0;
            if (textView22 == null) {
                textView22 = null;
            }
            if (f4m.f(textView22)) {
                CoordinatorLayout coordinatorLayout13 = this.k0;
                if (coordinatorLayout13 == null) {
                    coordinatorLayout13 = null;
                }
                coordinatorLayout13.removeView(this.n0);
                this.n0 = null;
            }
        }
        CoordinatorLayout coordinatorLayout14 = this.k0;
        if (coordinatorLayout14 == null) {
            coordinatorLayout14 = null;
        }
        this.p0 = (ViewGroup) coordinatorLayout14.findViewById(R.id.custom_bottom_container);
        View view5 = this.q0;
        if (view5 != null) {
            if (view5.getParent() != null && (view5.getParent() instanceof ViewGroup)) {
                ((ViewGroup) view5.getParent()).removeView(view5);
            }
            ViewGroup viewGroup23 = this.p0;
            if (viewGroup23 != null) {
                viewGroup23.addView(view5);
                s3q0 s3q0Var13 = s3q0.a;
            }
        }
        View view6 = this.q0;
        if (view6 == null || f4m.f(view6)) {
            CoordinatorLayout coordinatorLayout15 = this.k0;
            if (coordinatorLayout15 == null) {
                coordinatorLayout15 = null;
            }
            coordinatorLayout15.removeView(this.p0);
            this.p0 = null;
        }
        wzs<? super com.vk.core.ui.bottomsheet.internal.b, ? super u080, ? extends ModalBottomSheetBehavior<ViewGroup>> wzsVar = this.h;
        if (wzsVar == null || (modalBottomSheetBehavior = wzsVar.invoke(this.r0, this.B0)) == null) {
            modalBottomSheetBehavior = new ModalBottomSheetBehavior<>(this.r0, this.B0);
        }
        this.i = modalBottomSheetBehavior;
        modalBottomSheetBehavior.u = this.g1;
        s3q0 s3q0Var14 = s3q0.a;
        modalBottomSheetBehavior.M(this.p);
        ModalBottomSheetBehavior<ViewGroup> modalBottomSheetBehavior2 = this.i;
        if (modalBottomSheetBehavior2 != null) {
            modalBottomSheetBehavior2.D = this.N0;
        }
        if (modalBottomSheetBehavior2 != null) {
            modalBottomSheetBehavior2.O(5);
        }
        ModalBottomSheetBehavior<ViewGroup> modalBottomSheetBehavior3 = this.i;
        if (modalBottomSheetBehavior3 != null) {
            modalBottomSheetBehavior3.F = this.T0;
        }
        ViewGroup viewGroup24 = this.i0;
        if (viewGroup24 == null) {
            viewGroup24 = null;
        }
        ((CoordinatorLayout.f) viewGroup24.getLayoutParams()).c(this.i);
        boolean z2 = (!this.m && awt0.k(view) == null && this.l) ? false : true;
        if (!this.j && z2) {
            FrameLayout frameLayout2 = new FrameLayout(view.getContext());
            if (layoutParams != null) {
                frameLayout2.addView(view, 0, layoutParams);
                frameLayout = frameLayout2;
            } else {
                frameLayout2.addView(view, 0);
                frameLayout = frameLayout2;
            }
        } else if (this.f1) {
            final ScrollView scrollView = new ScrollView(view.getContext());
            if (layoutParams != null) {
                scrollView.addView(view, layoutParams);
            } else {
                scrollView.addView(view, -1, -2);
            }
            frameLayout = scrollView;
            if (this.B) {
                final int a4 = iah0.a(56);
                ViewGroup viewGroup25 = this.l0;
                if (viewGroup25 == null) {
                    viewGroup25 = null;
                }
                viewGroup25.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                scrollView.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: xsna.mw20
                    @Override // android.view.View.OnScrollChangeListener
                    public final void onScrollChange(View view7, int i8, int i9, int i10, int i11) {
                        ViewGroup viewGroup26 = nw20.this.l0;
                        if (viewGroup26 == null) {
                            viewGroup26 = null;
                        }
                        viewGroup26.setAlpha(xwk.a(scrollView.getY() / a4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
                    }
                });
                frameLayout = scrollView;
            }
        } else {
            NestedScrollView nestedScrollView = new NestedScrollView(view.getContext(), null);
            if (layoutParams != null) {
                nestedScrollView.addView(view, layoutParams);
            } else {
                nestedScrollView.addView(view, -1, -2);
            }
            frameLayout = nestedScrollView;
            if (this.B) {
                int a5 = iah0.a(56);
                ViewGroup viewGroup26 = this.l0;
                if (viewGroup26 == null) {
                    viewGroup26 = null;
                }
                viewGroup26.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                nestedScrollView.setOnScrollChangeListener(new fel(this, a5));
                frameLayout = nestedScrollView;
            }
        }
        int i8 = (this.v0 || this.n0 == null) ? 0 : u() ? h1 : this.J0;
        if (this.v0 && this.n0 != null) {
            View k = awt0.k(frameLayout);
            if (k instanceof ViewGroup) {
                ViewGroup viewGroup27 = (ViewGroup) k;
                viewGroup27.setClipToPadding(false);
                ViewGroup viewGroup28 = this.n0;
                if (viewGroup28 != null) {
                    if (!viewGroup28.isLaidOut() || viewGroup28.isLayoutRequested()) {
                        viewGroup28.addOnLayoutChangeListener(new ow20((ViewGroup) k));
                    } else {
                        f4m.v(viewGroup28.getHeight() + viewGroup27.getPaddingBottom(), k);
                    }
                }
            }
        }
        int i9 = this.B ? 0 : this.K0;
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        marginLayoutParams.topMargin = i9;
        marginLayoutParams.bottomMargin = i8;
        frameLayout.setLayoutParams(marginLayoutParams);
        if (this.B) {
            int i10 = this.W;
            if (i10 != -1) {
                ViewGroup viewGroup29 = this.l0;
                if (viewGroup29 == null) {
                    viewGroup29 = null;
                }
                viewGroup29.setBackgroundColor(i10);
            }
            ViewGroup viewGroup30 = this.l0;
            if (viewGroup30 == null) {
                viewGroup30 = null;
            }
            viewGroup30.setClipToOutline(true);
            viewGroup30.setOutlineProvider(new t0w0(4, this.T, false, false));
        }
        if (this.B || this.U) {
            ViewGroup viewGroup31 = this.j0;
            if (viewGroup31 == null) {
                viewGroup31 = null;
            }
            viewGroup31.setClipToOutline(true);
            ViewGroup viewGroup32 = this.j0;
            if (viewGroup32 == null) {
                viewGroup32 = null;
            }
            viewGroup32.setOutlineProvider(new t0w0(4, this.T, this.V, false));
            frameLayout.setClipToOutline(true);
            frameLayout.setOutlineProvider(new t0w0(4, this.T, this.V, false));
        }
        ModalBottomSheetBehavior<ViewGroup> modalBottomSheetBehavior4 = this.i;
        if (modalBottomSheetBehavior4 != null) {
            modalBottomSheetBehavior4.b = frameLayout;
        }
        int i11 = this.L0;
        if (i11 != -1) {
            ViewGroup viewGroup33 = this.j0;
            if (viewGroup33 == null) {
                viewGroup33 = null;
            }
            f4m.y(i11, viewGroup33);
        }
        int i12 = this.M0;
        if (i12 != -1) {
            ViewGroup viewGroup34 = this.j0;
            if (viewGroup34 == null) {
                viewGroup34 = null;
            }
            f4m.v(i12, viewGroup34);
        }
        CoordinatorLayout coordinatorLayout16 = this.k0;
        if (coordinatorLayout16 == null) {
            coordinatorLayout16 = null;
        }
        LinearLayout linearLayout = (LinearLayout) coordinatorLayout16.findViewById(R.id.bottom_sheet_content);
        if (linearLayout != null) {
            linearLayout.addView(frameLayout);
        }
        if (this.v0) {
            boolean z3 = drm0.N(this.u) && this.C.length() == 0 && ((str = this.D) == null || str.length() == 0) && this.F == null && this.N == null;
            boolean z4 = frameLayout.findViewById(R.id.close_icon) != null;
            if (z3 || z4) {
                ViewGroup viewGroup35 = this.l0;
                if (viewGroup35 == null) {
                    viewGroup35 = null;
                }
                f4m.j(viewGroup35);
            }
        }
        CoordinatorLayout coordinatorLayout17 = this.k0;
        if (coordinatorLayout17 == null) {
            coordinatorLayout17 = null;
        }
        View findViewById4 = coordinatorLayout17.findViewById(R.id.touch_outside);
        findViewById4.setOnClickListener(new wz5(this, 7));
        findViewById4.setOnTouchListener(new View.OnTouchListener() { // from class: xsna.iw20
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view7, MotionEvent motionEvent) {
                wzs<? super View, ? super MotionEvent, Boolean> wzsVar2 = nw20.this.K;
                if (wzsVar2 != null) {
                    return wzsVar2.invoke(view7, motionEvent).booleanValue();
                }
                return false;
            }
        });
        ViewGroup viewGroup36 = this.i0;
        if (viewGroup36 == null) {
            viewGroup36 = null;
        }
        if (!viewGroup36.isLaidOut() || viewGroup36.isLayoutRequested()) {
            viewGroup36.addOnLayoutChangeListener(new pw20(this));
        } else {
            if (!this.H0 && this.I0) {
                p(this);
            }
            n(this, this.n0);
            n(this, this.p0);
            o(this);
            x();
            VkBlurView vkBlurView2 = this.x0;
            if (vkBlurView2 != null) {
                vkBlurView2.invalidate();
            }
        }
        MaxWidthFrameLayout maxWidthFrameLayout = this.F0;
        Integer num6 = this.G0;
        if (maxWidthFrameLayout != null) {
            CoordinatorLayout coordinatorLayout18 = this.k0;
            if (coordinatorLayout18 == null) {
                coordinatorLayout18 = null;
            }
            if (coordinatorLayout18.getChildCount() > 0) {
                CoordinatorLayout.f fVar = new CoordinatorLayout.f(iah0.a(231.0f), iah0.a(204.0f));
                if (num6 != null) {
                    fVar.b(num6.intValue());
                }
                fVar.d = 49;
                fVar.c = 49;
                CoordinatorLayout coordinatorLayout19 = this.k0;
                if (coordinatorLayout19 == null) {
                    coordinatorLayout19 = null;
                }
                coordinatorLayout19.addView(maxWidthFrameLayout, 1, fVar);
            }
        }
        ViewGroup viewGroup37 = this.i0;
        if (viewGroup37 == null) {
            viewGroup37 = null;
        }
        iut0.q(viewGroup37, new qw20(this));
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler);
        if (this.E0 && recyclerView != null) {
            a aVar = this.b1;
            if (aVar != null) {
                bpn0 bpn0Var = aVar.f;
                RecyclerView recyclerView2 = aVar.d.get();
                if (recyclerView2 != null) {
                    recyclerView2.removeOnScrollListener(aVar);
                }
                ep0 ep0Var = aVar.g;
                if (ep0Var != null) {
                    ((Handler) bpn0Var.getValue()).removeCallbacks(ep0Var);
                }
                ((Handler) bpn0Var.getValue()).removeCallbacksAndMessages(null);
            }
            View view7 = this.f0;
            if (view7 == null) {
                view7 = null;
            }
            this.b1 = new a(recyclerView, view7);
        }
        if (this.H0) {
            ViewGroup viewGroup38 = this.l0;
            if (viewGroup38 == null) {
                viewGroup38 = null;
            }
            f4m.j(viewGroup38);
            this.P = false;
            View view8 = this.f0;
            if (view8 == null) {
                view8 = null;
            }
            f4m.j(view8);
        }
        ViewGroup viewGroup39 = this.n0;
        if (viewGroup39 != null) {
            awt0.t(viewGroup39, new tzv(viewGroup39, 9));
        }
        ViewGroup viewGroup40 = this.p0;
        if (viewGroup40 != null) {
            awt0.t(viewGroup40, new k7y(viewGroup40, i7));
        }
        CoordinatorLayout coordinatorLayout20 = this.k0;
        setContentView(coordinatorLayout20 != null ? coordinatorLayout20 : null);
    }

    @Override // android.app.Dialog
    public final void show() {
        Activity ownerActivity = getOwnerActivity();
        if (ownerActivity == null || ownerActivity.isFinishing() || ownerActivity.isDestroyed()) {
            return;
        }
        try {
            super.show();
            c cVar = this.V0;
            Handler handler = this.D0;
            if (cVar != null) {
                handler.removeCallbacks(cVar);
            }
            c cVar2 = new c();
            this.V0 = cVar2;
            handler.postDelayed(cVar2, 64L);
        } catch (Throwable th) {
            th.toString();
        }
    }

    public final boolean t() {
        return getContext().getResources().getConfiguration().orientation == 2;
    }

    public final boolean u() {
        TextView textView = this.g0;
        if (textView == null) {
            textView = null;
        }
        if (f4m.f(textView)) {
            TextView textView2 = this.h0;
            if (textView2 == null) {
                textView2 = null;
            }
            if (f4m.h(textView2)) {
                return true;
            }
        }
        TextView textView3 = this.g0;
        if (textView3 == null) {
            textView3 = null;
        }
        if (!f4m.h(textView3)) {
            return false;
        }
        TextView textView4 = this.h0;
        return f4m.f(textView4 != null ? textView4 : null);
    }

    public final void v(int i) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        Activity ownerActivity = getOwnerActivity();
        if (ownerActivity == null || ownerActivity.isFinishing() || ownerActivity.isDestroyed() || this.t) {
            return;
        }
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setGravity(1);
        }
        ViewGroup viewGroup = this.i0;
        if (viewGroup != null) {
            ViewGroup.LayoutParams layoutParams3 = viewGroup.getLayoutParams();
            layoutParams3.width = i;
            layoutParams3.height = -1;
            ViewGroup viewGroup2 = this.i0;
            if (viewGroup2 == null) {
                viewGroup2 = null;
            }
            viewGroup2.requestLayout();
        }
        ViewGroup viewGroup3 = this.n0;
        if (viewGroup3 != null && (layoutParams2 = viewGroup3.getLayoutParams()) != null) {
            layoutParams2.width = i;
        }
        ViewGroup viewGroup4 = this.n0;
        if (viewGroup4 != null) {
            viewGroup4.requestLayout();
        }
        ViewGroup viewGroup5 = this.p0;
        if (viewGroup5 != null && (layoutParams = viewGroup5.getLayoutParams()) != null) {
            layoutParams.width = i;
        }
        ViewGroup viewGroup6 = this.p0;
        if (viewGroup6 != null) {
            viewGroup6.requestLayout();
        }
    }

    public final void w(boolean z) {
        this.U0 = z;
        CoordinatorLayout coordinatorLayout = this.k0;
        if (coordinatorLayout == null || z) {
            return;
        }
        Object parent = coordinatorLayout.getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view != null) {
            view.setBackground(this.C0);
        }
    }

    public final void x() {
        u1z.a aVar = this.A0;
        if (aVar != null) {
            ViewGroup viewGroup = this.i0;
            if (viewGroup == null) {
                viewGroup = null;
            }
            int[] iArr = new int[2];
            viewGroup.getLocationInWindow(iArr);
            int i = iArr[1];
            int i2 = aVar.d;
            if (i2 < 0 || Math.abs(i2 - i) >= 2) {
                aVar.d = i;
                aVar.a();
                aVar.invalidateSelf();
            }
        }
    }

    public final void z(boolean z) {
        ViewGroup viewGroup = this.a0;
        if (viewGroup == null) {
            viewGroup = null;
        }
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            return;
        }
        if (!this.v0 || this.w0) {
            if (z) {
                layoutParams2.setMarginStart((int) this.z);
            } else {
                layoutParams2.setMarginStart((int) k1);
            }
            ViewGroup viewGroup2 = this.a0;
            (viewGroup2 != null ? viewGroup2 : null).setLayoutParams(layoutParams2);
        }
    }
}
