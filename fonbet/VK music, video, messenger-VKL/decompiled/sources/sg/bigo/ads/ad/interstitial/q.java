package sg.bigo.ads.ad.interstitial;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.URLUtil;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.reactivex.rxjava3.internal.operators.observable.q1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sg.bigo.ads.R;
import sg.bigo.ads.api.core.b;
import sg.bigo.ads.api.core.o;
import sg.bigo.ads.common.utils.b;
import sg.bigo.ads.common.view.AdImageView;
import sg.bigo.ads.common.view.AutoNextLineLinearLayout;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import xsna.ho8;
import xsna.xy9;

/* loaded from: classes9.dex */
public final class q {

    @NonNull
    final d A;

    @NonNull
    final e B;
    c C;

    @Nullable
    private final f F;

    @Nullable
    private Runnable G;

    @Nullable
    private Runnable H;

    @Nullable
    private View I;
    private int M;
    private long N;
    private boolean O;

    @Nullable
    private Runnable P;
    final Context a;

    @NonNull
    final sg.bigo.ads.y.b b;

    @Nullable
    final sg.bigo.ads.api.core.b c;

    @Nullable
    final sg.bigo.ads.ai.o d;

    @Nullable
    Runnable e;

    @Nullable
    FrameLayout f;

    @Nullable
    FrameLayout g;

    @Nullable
    AlertDialog h;
    boolean o;
    boolean p;
    int q;
    long s;
    List<Integer> t;
    long u;

    @Nullable
    Runnable v;

    @Nullable
    Runnable w;

    @Nullable
    Runnable x;

    @NonNull
    final a z;
    public boolean i = true;
    private boolean J = false;
    boolean j = false;
    private boolean K = false;
    boolean k = false;
    boolean l = false;
    boolean m = false;
    boolean n = false;
    int r = 0;
    private long L = -1;

    @NonNull
    private final List<Runnable> Q = new ArrayList();

    @NonNull
    public final b y = new b();
    boolean D = false;
    int E = 0;

    @SuppressLint({"ClickableViewAccessibility"})
    public static class a {
        int a;
        boolean b;
        boolean c;
        boolean d;
        boolean e;
        int f;
        boolean g;
        int h;
        boolean i;
        int j;
        float k;
        float l;

        @Nullable
        View m;

        @Nullable
        View n;

        @Nullable
        View o;

        @Nullable
        q p;

        @NonNull
        final Map<View, sg.bigo.ads.core.adview.h> q;

        @NonNull
        final sg.bigo.ads.core.adview.h r;

        private a() {
            this.a = 0;
            this.q = new HashMap();
            this.r = new sg.bigo.ads.core.adview.h() { // from class: sg.bigo.ads.ad.interstitial.q.a.1
                @Override // sg.bigo.ads.core.adview.h
                public final void a(int i, int i2, int i3, int i4, int i5, int i6) {
                }

                @Override // sg.bigo.ads.core.adview.h
                public final void a(sg.bigo.ads.an.i iVar, int i, int i2) {
                }
            };
        }

        public static /* synthetic */ View a(a aVar, View view, float f, float f2) {
            ArrayList arrayList = new ArrayList();
            aVar.a(view, f, f2, 0, new int[2], arrayList);
            if (arrayList.size() > 0) {
                return (View) xy9.b(1, arrayList);
            }
            return null;
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public final sg.bigo.ads.core.adview.h a(final sg.bigo.ads.y.b bVar, sg.bigo.ads.core.adview.h hVar) {
            return hVar == bVar ? new sg.bigo.ads.core.adview.h() { // from class: sg.bigo.ads.ad.interstitial.q.a.3
                @Override // sg.bigo.ads.core.adview.h
                public final void a(int i, int i2, int i3, int i4, int i5, int i6) {
                    a.this.p.m = true;
                    bVar.a(i, i2, i3, i4, i5, i6);
                }

                @Override // sg.bigo.ads.core.adview.h
                public final void a(sg.bigo.ads.an.i iVar, int i, int i2) {
                    a.this.p.m = true;
                    bVar.a(iVar, i, i2);
                }
            } : hVar;
        }

        private void a(View view, float f, float f2, int i, @NonNull int[] iArr, @NonNull List<View> list) {
            if (i > 10) {
                return;
            }
            int i2 = i + 1;
            if (view == null) {
                return;
            }
            view.getLocationOnScreen(iArr);
            int i3 = iArr[0];
            int i4 = iArr[1];
            if (f > i3 && f < view.getWidth() + i3 && f2 > i4 && f2 < view.getHeight() + i4 && (view.getTag() instanceof Integer) && this.q.containsKey(view)) {
                list.add(view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i5 = 0; i5 < childCount; i5++) {
                    a(viewGroup.getChildAt(i5), f, f2, i2, iArr, list);
                }
            }
        }

        private void a(final sg.bigo.ads.y.b bVar, @NonNull final View view, final int i) {
            final int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            view.setOnTouchListener(new View.OnTouchListener() { // from class: sg.bigo.ads.ad.interstitial.q.a.2
                boolean a;
                int b;
                int c;
                final /* synthetic */ int h = 11;

                private View a(float f) {
                    a aVar = a.this;
                    if (f < aVar.h) {
                        return aVar.n;
                    }
                    if (aVar.f <= 0 || f <= aVar.j - r1) {
                        return null;
                    }
                    return aVar.o;
                }

                /* JADX WARN: Code restructure failed: missing block: B:29:0x00ba, code lost:
                
                    if (r16.i.m == r7) goto L41;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:35:0x00ec, code lost:
                
                    r4 = r16.i;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:36:0x00f0, code lost:
                
                    if (r7 != r4.n) goto L49;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:37:0x00f2, code lost:
                
                    r7 = r2;
                    r8 = r5;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:38:0x00f8, code lost:
                
                    if (r4.i == false) goto L46;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:39:0x00fa, code lost:
                
                    r9 = r8;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:40:0x00fe, code lost:
                
                    r4 = r4.a(r8, r9);
                    r8 = r16.i.i;
                    r8 = 24;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:41:0x0108, code lost:
                
                    r14 = r8;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:42:0x0142, code lost:
                
                    if (r7 == null) goto L77;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:43:0x0144, code lost:
                
                    if (r4 != null) goto L65;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:44:0x0146, code lost:
                
                    r4 = r16.i.r;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:45:0x014a, code lost:
                
                    r8 = r4;
                    r4 = new int[2];
                    r5 = r17;
                    r5.getLocationOnScreen(r4);
                    r7 = r2;
                    r9 = (int) r18.getX();
                    r10 = (int) r18.getY();
                    r11 = r16.i;
                    r12 = ((int) r11.k) - r4[0];
                    r11 = ((int) r11.l) - r4[1];
                    r13 = r16.h;
                    r12 = r11;
                    r11 = r12;
                    r4 = 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:47:0x0174, code lost:
                
                    if (r4 >= 100) goto L85;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:49:0x017c, code lost:
                
                    if ((r5.getParent() instanceof android.view.ViewGroup) == false) goto L86;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:50:0x017e, code lost:
                
                    r4 = r4 + 1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:51:0x0180, code lost:
                
                    if (r5 == r7) goto L83;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:53:0x0184, code lost:
                
                    if ((r5 instanceof sg.bigo.ads.api.NativeAdView) != false) goto L84;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:54:0x0186, code lost:
                
                    r9 = r9 + r5.getLeft();
                    r11 = r11 + r5.getLeft();
                    r10 = r10 + r5.getTop();
                    r12 = r12 + r5.getTop();
                    r5 = (android.view.View) r5.getParent();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:56:0x01a1, code lost:
                
                    if (r8 == null) goto L77;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:57:0x01a3, code lost:
                
                    r8.a(r9, r10, r11, r12, r13, r14);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:61:0x00fc, code lost:
                
                    r9 = r4.r;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:63:0x010c, code lost:
                
                    if (r7 != r4.o) goto L56;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:64:0x010e, code lost:
                
                    r7 = r2;
                    r8 = r5;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:65:0x0114, code lost:
                
                    if (r4.g == false) goto L54;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:66:0x0116, code lost:
                
                    r9 = r8;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:67:0x011a, code lost:
                
                    r4 = r4.a(r8, r9);
                    r8 = r16.i.g;
                    r8 = 25;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:68:0x0118, code lost:
                
                    r9 = r4.r;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:69:0x0125, code lost:
                
                    if (r7 == null) goto L61;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:70:0x0127, code lost:
                
                    r4 = r4.q.get(r7);
                    r8 = r7.getTag();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:71:0x0135, code lost:
                
                    if ((r8 instanceof java.lang.Integer) == false) goto L60;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:72:0x0137, code lost:
                
                    r8 = ((java.lang.Integer) r8).intValue();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:73:0x013e, code lost:
                
                    r14 = 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:74:0x0140, code lost:
                
                    r4 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:83:0x00e7, code lost:
                
                    if (java.lang.Math.abs(r6 - r16.i.l) < r4) goto L41;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:84:0x00ea, code lost:
                
                    if (r7 != null) goto L41;
                 */
                @Override // android.view.View.OnTouchListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    if (motionEvent.getActionMasked() == 0) {
                        a.this.k = motionEvent.getRawX();
                        a.this.l = motionEvent.getRawY();
                        this.b = view.getScrollX();
                        this.c = view.getScrollY();
                        this.a = false;
                        a aVar = a.this;
                        aVar.m = a(aVar.l);
                        a aVar2 = a.this;
                        if (aVar2.m == null) {
                            aVar2.m = a.a(aVar2, view, motionEvent.getRawX(), motionEvent.getRawY());
                        }
                        return !view.isScrollContainer();
                    }
                    if (motionEvent.getActionMasked() == 2) {
                        if (i == 3 && (Math.abs(motionEvent.getRawX() - a.this.k) >= scaledTouchSlop || Math.abs(motionEvent.getRawY() - a.this.l) >= scaledTouchSlop)) {
                            this.a = true;
                        }
                    } else if (motionEvent.getActionMasked() == 1) {
                        float rawX = motionEvent.getRawX();
                        float rawY = motionEvent.getRawY();
                        View a = a(rawY);
                        if (a == null) {
                            a = a.a(a.this, view, motionEvent.getRawX(), motionEvent.getRawY());
                        }
                        int i2 = i;
                        if (i2 != 2) {
                            if (i2 == 3) {
                                a aVar3 = a.this;
                                if (aVar3.m == a) {
                                    if (!this.a) {
                                        if (Math.abs(rawX - aVar3.k) < scaledTouchSlop) {
                                        }
                                    }
                                }
                                if (Math.abs(rawX - a.this.k) < scaledTouchSlop && Math.abs(rawY - a.this.l) < scaledTouchSlop) {
                                    return true;
                                }
                            }
                        }
                    }
                    return false;
                }
            });
        }

        public final void a(sg.bigo.ads.y.b bVar, @NonNull View view, @NonNull View view2, int i, @Nullable sg.bigo.ads.core.adview.h hVar) {
            view.getTag();
            view.setTag(R.id.content, "TouchView");
            view2.setTag(Integer.valueOf(i));
            if (hVar != null) {
                this.q.put(view2, hVar);
            }
            a(bVar, view, view2, hVar, this.a);
        }

        private void a(sg.bigo.ads.y.b bVar, @NonNull View view, @NonNull View view2, sg.bigo.ads.core.adview.h hVar, int i) {
            if (hVar == null) {
                view2.setOnTouchListener(null);
            } else {
                a(bVar, view, i);
            }
        }
    }

    public class b {
        boolean a = false;

        public b() {
        }

        private void b(Runnable runnable) {
            q.b(q.this);
            sg.bigo.ads.bh.d.a(2, runnable);
        }

        public final boolean a() {
            q qVar = q.this;
            if (qVar.i && !this.a) {
                this.a = true;
                Runnable runnable = qVar.w;
                if (runnable != null) {
                    b(runnable);
                    return true;
                }
            }
            return false;
        }

        public final boolean a(@Nullable Runnable runnable) {
            Runnable runnable2;
            q qVar = q.this;
            if (qVar.i && !this.a) {
                this.a = true;
                Runnable runnable3 = qVar.w;
                if (runnable3 == null && (runnable2 = qVar.v) != null) {
                    sg.bigo.ads.bh.d.a(runnable2);
                    q qVar2 = q.this;
                    runnable3 = qVar2.v;
                    qVar2.w = runnable3;
                }
                if (runnable3 != null) {
                    q.this.x = runnable;
                    b(runnable3);
                    return true;
                }
            }
            return false;
        }
    }

    public interface c {
        boolean a(Runnable runnable);
    }

    public static class d {
        int a;
        int b;
        int c;

        private d() {
        }

        public /* synthetic */ d(byte b) {
            this();
        }
    }

    public static class e {
        long a;
        boolean b;
        private boolean c;
        private final Map<Integer, Long> d;

        private e() {
            this.d = new HashMap();
        }

        public static int a(int i, boolean z) {
            if (i == 1) {
                return z ? 2 : 1;
            }
            if (i == 2) {
                return 4;
            }
            if (i == 3) {
                return 3;
            }
            if (i == 4) {
                return 5;
            }
            return i == 5 ? 6 : 0;
        }

        public final void b(sg.bigo.ads.api.core.b bVar, int i, String str, int i2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int a = a(str, i2);
            Long l = this.d.get(Integer.valueOf(a));
            if (l == null) {
                return;
            }
            sg.bigo.ads.da.b.a(bVar, a(i, false), 5, String.valueOf(a), SystemClock.elapsedRealtime() - l.longValue(), false, 0, (String) null);
        }

        public /* synthetic */ e(byte b) {
            this();
        }

        private static int a(@NonNull String str, int i) {
            return (str + i).hashCode();
        }

        public final void a(sg.bigo.ads.api.core.b bVar, int i, String str, int i2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int a = a(str, i2);
            if (this.d.get(Integer.valueOf(a)) == null) {
                this.d.put(Integer.valueOf(a), Long.valueOf(SystemClock.elapsedRealtime()));
                sg.bigo.ads.da.b.a(bVar, a(i, false), 1, String.valueOf(a), 0L, false, 0, (String) null);
            }
        }

        public final void a(sg.bigo.ads.api.core.b bVar, int i, String str, int i2, int i3, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int a = a(str, i2);
            Long l = this.d.get(Integer.valueOf(a));
            if (l == null) {
                return;
            }
            sg.bigo.ads.da.b.a(bVar, a(i, false), 6, String.valueOf(a), SystemClock.elapsedRealtime() - l.longValue(), true, i3, str2);
        }

        public final void a(sg.bigo.ads.api.core.b bVar, boolean z, int i, String str) {
            if (this.c || this.a <= 0) {
                return;
            }
            this.c = true;
            sg.bigo.ads.da.b.a(bVar, a(1, z), 4, (String) null, SystemClock.elapsedRealtime() - this.a, true, i, str);
        }
    }

    public q(Context context, @NonNull sg.bigo.ads.y.b bVar, sg.bigo.ads.api.core.b bVar2, sg.bigo.ads.ai.o oVar, boolean z, f fVar, Runnable runnable, Runnable runnable2, Runnable runnable3) {
        byte b2 = 0;
        this.o = false;
        this.z = new a(b2);
        this.A = new d(b2);
        this.B = new e(b2);
        this.a = context;
        this.b = bVar;
        this.c = bVar2;
        this.F = fVar;
        this.d = oVar;
        this.o = z;
        this.e = runnable;
        this.G = runnable2;
        this.H = runnable3;
    }

    public static int a(@Nullable sg.bigo.ads.ai.o oVar) {
        return sg.bigo.ads.k.a.a(oVar, "layer.webview_force_time", "layer.webview_force_time_new");
    }

    @NonNull
    private FrameLayout b(@NonNull Context context, @NonNull View view, boolean z) {
        int i = this.A.b;
        RoundedFrameLayout roundedFrameLayout = new RoundedFrameLayout(context);
        if (i == 1) {
            roundedFrameLayout.setCornerRadius(sg.bigo.ads.common.utils.f.a(context, 12));
        } else {
            roundedFrameLayout.a(sg.bigo.ads.common.utils.f.a(context, 12), sg.bigo.ads.common.utils.f.a(context, 12), sg.bigo.ads.common.utils.f.a(context, 0), sg.bigo.ads.common.utils.f.a(context, 0));
        }
        roundedFrameLayout.addView(view, new FrameLayout.LayoutParams(-1, z ? -1 : -2));
        return roundedFrameLayout;
    }

    private void h() {
        Runnable runnable;
        if (this.y.a) {
            if ((this.K || this.l) && this.n && (runnable = this.H) != null) {
                runnable.run();
                this.H = null;
            }
        }
    }

    private boolean i() {
        return (!this.i || this.K || this.k) ? false : true;
    }

    public final void c() {
        Runnable runnable = this.v;
        if (this.O || this.u <= 0 || runnable == null) {
            return;
        }
        this.O = true;
        sg.bigo.ads.bh.d.a(runnable);
        this.u -= SystemClock.elapsedRealtime() - this.N;
    }

    public final void d() {
        int i = this.A.b;
        final FrameLayout frameLayout = this.l ? this.g : this.f;
        if (frameLayout == null) {
            e();
            return;
        }
        b.d dVar = new b.d() { // from class: sg.bigo.ads.ad.interstitial.q.17
            @Override // sg.bigo.ads.common.utils.b.d, android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                frameLayout.clearAnimation();
                frameLayout.setVisibility(8);
                q.this.e();
            }
        };
        if (i == 1) {
            sg.bigo.ads.ad.interstitial.c.c(frameLayout, dVar);
        } else {
            sg.bigo.ads.ad.interstitial.c.b(frameLayout, dVar);
        }
    }

    public final void e() {
        AlertDialog alertDialog = this.h;
        if (alertDialog != null) {
            alertDialog.dismiss();
            this.h = null;
            f();
            h();
        }
        g();
    }

    public final void f() {
        Runnable runnable;
        if (!this.n || (runnable = this.G) == null) {
            return;
        }
        runnable.run();
        this.e = null;
    }

    public final void g() {
        Iterator<Runnable> it = this.Q.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
        this.Q.clear();
        Runnable runnable = this.v;
        if (runnable != null) {
            sg.bigo.ads.bh.d.a(runnable);
        }
        Runnable runnable2 = this.P;
        if (runnable2 != null) {
            sg.bigo.ads.bh.d.a(runnable2);
        }
        this.v = null;
        this.w = null;
        this.k = true;
        this.f = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04b4  */
    /* JADX WARN: Type inference failed for: r1v61, types: [sg.bigo.ads.core.adview.h] */
    /* JADX WARN: Type inference failed for: r2v10, types: [sg.bigo.ads.core.adview.h] */
    /* JADX WARN: Type inference failed for: r2v13, types: [sg.bigo.ads.core.adview.h] */
    /* JADX WARN: Type inference failed for: r2v16, types: [sg.bigo.ads.core.adview.h] */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private View a(Context context, sg.bigo.ads.y.b bVar, sg.bigo.ads.api.core.b bVar2, boolean z) {
        String str;
        String str2;
        String str3;
        String[] strArr;
        String str4;
        String[] strArr2;
        int i;
        int i2;
        String[] strArr3;
        TextView textView;
        String[] strArr4;
        TextView textView2;
        boolean z2;
        TextView textView3;
        View view;
        TextView textView4;
        TextView textView5;
        TextView textView6;
        TextView textView7;
        TextView textView8;
        View view2;
        String str5;
        int i3;
        String str6;
        String str7;
        View view3;
        Context context2;
        q qVar;
        final sg.bigo.ads.api.core.b bVar3;
        View view4;
        q qVar2;
        RoundedFrameLayout roundedFrameLayout;
        final AdImageView adImageView;
        final String str8;
        TextView textView9;
        TextView textView10;
        View findViewById;
        o.a aD;
        String o = bVar2.o();
        if (TextUtils.isEmpty(o)) {
            return null;
        }
        b.d r = bVar2.r();
        if (r != null) {
            str = r.a();
            str2 = r.b();
            str3 = r.c();
            String f = r.f();
            strArr2 = r.e();
            str4 = f;
            strArr = r.d();
        } else {
            str = null;
            str2 = null;
            str3 = null;
            strArr = null;
            str4 = null;
            strArr2 = null;
        }
        boolean z3 = bVar2 instanceof sg.bigo.ads.cp.a;
        if (z3) {
            sg.bigo.ads.cp.a aVar = (sg.bigo.ads.cp.a) bVar2;
            if ((TextUtils.isEmpty(str) || !URLUtil.isNetworkUrl(str)) && (aD = aVar.aD()) != null) {
                str = aD.c();
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = aVar.t();
            }
            if (TextUtils.isEmpty(str3)) {
                str3 = aVar.u();
            }
            if (TextUtils.isEmpty(str) || !URLUtil.isNetworkUrl(str)) {
                if (aVar.aZ()) {
                    str = sg.bigo.ads.an.o.b(context, aVar.aV());
                } else {
                    String bb = aVar.bb();
                    if (!TextUtils.isEmpty(bb) && URLUtil.isNetworkUrl(bb)) {
                        str = bb;
                    }
                }
            }
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = sg.bigo.ads.common.utils.a.a(context, R.string.bigo_ad_title_default, new Object[0]);
        }
        String str9 = str2;
        if (TextUtils.isEmpty(str3)) {
            str3 = sg.bigo.ads.common.utils.a.a(context, R.string.bigo_ad_description_default, new Object[0]);
        }
        String str10 = str3;
        String c2 = (TextUtils.isEmpty(null) || sg.bigo.ads.common.utils.r.a() < 4.0f) ? sg.bigo.ads.y.e.c(o) : null;
        String b2 = TextUtils.isEmpty(null) ? sg.bigo.ads.y.e.b(o) : null;
        String a2 = TextUtils.isEmpty(null) ? sg.bigo.ads.y.e.a(o) : null;
        try {
            if (!this.o) {
                i = R.layout.bigo_ad_layout_interstitial_mid_page_native_view;
            } else if (z) {
                i = R.layout.bigo_ad_layout_interstitial_mid_page_native_view_landscape;
            } else {
                f fVar = this.F;
                i = (fVar == null || !fVar.d) ? R.layout.bigo_ad_layout_interstitial_mid_page_native_fallback_view_landscape : R.layout.bigo_ad_layout_interstitial_mid_page_native_fallback_view_download_info_landscape;
            }
            View a3 = sg.bigo.ads.common.utils.a.a(context, i, null, false);
            View findViewById2 = a3 == null ? null : a3.findViewById(R.id.inter_mid_native_view);
            if (findViewById2 == null) {
                return a3;
            }
            final AdImageView adImageView2 = (AdImageView) findViewById2.findViewById(R.id.inter_iv_icon);
            String str11 = a2;
            TextView textView11 = (TextView) findViewById2.findViewById(R.id.inter_tv_title);
            TextView textView12 = (TextView) findViewById2.findViewById(R.id.inter_tv_desc);
            TextView textView13 = (TextView) findViewById2.findViewById(R.id.inter_tv_desc_below);
            TextView textView14 = (TextView) findViewById2.findViewById(R.id.inter_tv_company_name);
            View findViewById3 = findViewById2.findViewById(R.id.inter_ll_start_rate);
            TextView textView15 = (TextView) findViewById2.findViewById(R.id.inter_tv_start_rate);
            TextView textView16 = (TextView) findViewById2.findViewById(R.id.inter_tv_comment);
            TextView textView17 = (TextView) findViewById2.findViewById(R.id.inter_tv_download_num);
            View findViewById4 = findViewById2.findViewById(R.id.inter_tv_download_num_desc);
            TextView textView18 = (TextView) findViewById2.findViewById(R.id.inter_tv_age);
            View findViewById5 = findViewById2.findViewById(R.id.inter_iv_age);
            View findViewById6 = findViewById2.findViewById(R.id.bigo_ad_btn_cta);
            View findViewById7 = findViewById2.findViewById(R.id.bigo_ad_btn_cta_inner);
            View findViewById8 = findViewById2.findViewById(R.id.inter_tv_gp_info_extra_about);
            View findViewById9 = findViewById2.findViewById(R.id.inter_iv_gp_info_extra_arrow);
            ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(R.id.inter_ll_media);
            AutoNextLineLinearLayout autoNextLineLinearLayout = (AutoNextLineLinearLayout) findViewById2.findViewById(R.id.inter_fbl_genre);
            RoundedFrameLayout roundedFrameLayout2 = (RoundedFrameLayout) findViewById2.findViewById(R.id.inter_fl_icon);
            String str12 = c2;
            if (roundedFrameLayout2 != null) {
                roundedFrameLayout2.setStrokeWidth(sg.bigo.ads.common.utils.f.a(context, 1));
                roundedFrameLayout2.setStrokeColor(sg.bigo.ads.common.utils.r.b("#05000000", -7829368));
            }
            int a4 = s.a(bVar, this.A.c, null);
            if (!z || (findViewById = findViewById2.findViewById(R.id.inter_ll_native_extra)) == null) {
                i2 = a4;
            } else {
                i2 = a4;
                findViewById.setVisibility(0);
            }
            if (TextUtils.isEmpty(str) || adImageView2 == null) {
                strArr3 = strArr;
                textView = textView12;
                strArr4 = strArr2;
                textView2 = textView13;
                z2 = z3;
                textView3 = textView11;
                view = findViewById2;
                textView4 = textView14;
                textView5 = textView15;
                textView6 = textView16;
                textView7 = textView17;
                textView8 = textView18;
                view2 = findViewById7;
                str5 = str12;
                i3 = i2;
                str6 = b2;
                str7 = str11;
                view3 = a3;
            } else {
                adImageView2.setIconTag(true);
                adImageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                adImageView2.setBackgroundColor(sg.bigo.ads.common.utils.r.b("#FFE1E1E6", -7829368));
                adImageView2.setImageDrawable(sg.bigo.ads.common.utils.a.a(context, R.drawable.bigo_ad_icon_default_only_icon));
                final ArrayList arrayList = new ArrayList();
                sg.bigo.ads.bj.g gVar = new sg.bigo.ads.bj.g() { // from class: sg.bigo.ads.ad.interstitial.q.4
                    @Override // sg.bigo.ads.bj.g
                    public final void a(int i4, @NonNull String str13, @Nullable sg.bigo.ads.bj.f fVar2) {
                    }

                    @Override // sg.bigo.ads.bj.g
                    public final void a(@NonNull Bitmap bitmap, @NonNull sg.bigo.ads.bj.f fVar2) {
                        adImageView2.setBackground(null);
                    }
                };
                adImageView2.a(gVar);
                arrayList.add(gVar);
                a(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.q.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        arrayList.clear();
                        adImageView2.a();
                    }
                });
                adImageView2.a(str, bVar2.am());
                view3 = a3;
                view = findViewById2;
                textView4 = textView14;
                str7 = str11;
                strArr3 = strArr;
                textView = textView12;
                strArr4 = strArr2;
                textView2 = textView13;
                z2 = z3;
                textView3 = textView11;
                textView5 = textView15;
                textView6 = textView16;
                textView7 = textView17;
                textView8 = textView18;
                view2 = findViewById7;
                i3 = i2;
                str6 = b2;
                str5 = str12;
                a(view, adImageView2, 1, bVar, bVar);
            }
            if (!TextUtils.isEmpty(str9) && textView3 != null) {
                textView3.setText(str9);
                a(view, textView3, 2, bVar, bVar);
            }
            if (!TextUtils.isEmpty(str10)) {
                if (textView != null) {
                    textView.setText(str10);
                    a(view, textView, 6, bVar, bVar);
                }
                if (z && textView2 != null) {
                    textView2.setText(str10);
                    a(view, textView2, 6, bVar, bVar);
                }
            }
            if (!TextUtils.isEmpty(str4) && textView4 != null) {
                textView4.setVisibility(0);
                textView4.setText(str4);
                textView4.setTextColor(i3);
                a(view, textView4, 26, bVar, bVar);
            }
            if (!TextUtils.isEmpty(str5) && textView5 != null) {
                textView5.setText(str5);
                a(view, textView5, 26, bVar, bVar);
            }
            if (findViewById3 != null) {
                a(view, findViewById3, 26, bVar, bVar);
            }
            if (TextUtils.isEmpty(str6) || str6 == null) {
                context2 = context;
            } else {
                StringBuilder b3 = ho8.b(str6, " ");
                context2 = context;
                b3.append(sg.bigo.ads.common.utils.a.a(context2, R.string.bigo_ad_comment_num_text, new Object[0]));
                TextView textView19 = textView6;
                textView19.setText(b3.toString());
                a(view, textView19, 26, bVar, bVar);
            }
            if (!TextUtils.isEmpty(str7) && (textView10 = textView7) != null) {
                textView10.setText(str7);
                a(view, textView10, 26, bVar, bVar);
            }
            if (findViewById4 != null) {
                a(view, findViewById4, 26, bVar, bVar);
            }
            if (!TextUtils.isEmpty("Everyone") && (textView9 = textView8) != null) {
                textView9.setText("Everyone");
                a(view, textView9, 26, bVar, bVar);
            }
            if (findViewById5 != null) {
                a(view, findViewById5, 26, bVar, bVar);
            }
            if (findViewById6 != null) {
                View view5 = view2;
                if (view5 != null) {
                    view5.setBackgroundColor(i3);
                }
                a(view, findViewById6, 7, bVar, bVar);
            }
            View view6 = view;
            if (z && strArr4 != null) {
                String[] strArr5 = strArr4;
                if (strArr5.length > 0 && viewGroup != null) {
                    qVar = this;
                    bVar3 = bVar2;
                    qVar.a(context2, viewGroup, bVar, bVar3, strArr5);
                    if (!z && z2) {
                        roundedFrameLayout = (RoundedFrameLayout) view6.findViewById(R.id.inter_ll_fallback_media);
                        boolean z4 = false;
                        if (roundedFrameLayout != null) {
                            roundedFrameLayout.setVisibility(0);
                        }
                        adImageView = (AdImageView) view6.findViewById(R.id.inter_iv_fallback_media);
                        if (adImageView != null) {
                            sg.bigo.ads.cp.a aVar2 = (sg.bigo.ads.cp.a) bVar3;
                            String bb2 = aVar2.bb();
                            if (TextUtils.isEmpty(bb2) || !URLUtil.isNetworkUrl(bb2)) {
                                if (aVar2.aZ()) {
                                    String b4 = sg.bigo.ads.an.o.b(context2, aVar2.aV());
                                    if (!TextUtils.isEmpty(b4)) {
                                        str8 = b4;
                                        z4 = true;
                                    }
                                }
                                str8 = null;
                            } else {
                                str8 = bb2;
                            }
                            if (!TextUtils.isEmpty(str8)) {
                                final ArrayList arrayList2 = new ArrayList();
                                if (!z4) {
                                    qVar.B.a(bVar3, 4, str8, -1);
                                }
                                sg.bigo.ads.bj.g gVar2 = new sg.bigo.ads.bj.g() { // from class: sg.bigo.ads.ad.interstitial.q.6
                                    @Override // sg.bigo.ads.bj.g
                                    public final void a(int i4, @NonNull String str13, @Nullable sg.bigo.ads.bj.f fVar2) {
                                        q.this.B.a(bVar3, 4, str8, -1, i4, str13);
                                    }

                                    @Override // sg.bigo.ads.bj.g
                                    public final void a(@NonNull Bitmap bitmap, @NonNull sg.bigo.ads.bj.f fVar2) {
                                        q.this.B.b(bVar3, 4, str8, -1);
                                    }
                                };
                                adImageView.a(gVar2);
                                arrayList2.add(gVar2);
                                qVar.a(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.q.7
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        arrayList2.clear();
                                        adImageView.a();
                                    }
                                });
                                roundedFrameLayout.setStrokeWidth(sg.bigo.ads.common.utils.f.a(context2, 1));
                                roundedFrameLayout.setStrokeColor(sg.bigo.ads.common.utils.r.b("#08000000", -7829368));
                                adImageView.a(str8, bVar3.am());
                                a aVar3 = qVar.z;
                                sg.bigo.ads.y.b bVar4 = aVar3.c ? bVar : aVar3.r;
                                view4 = view6;
                                qVar.a(view4, adImageView, 5, bVar, bVar4);
                                if (strArr3 != null) {
                                    String[] strArr6 = strArr3;
                                    if (strArr6.length > 0 && autoNextLineLinearLayout != null) {
                                        qVar2 = this;
                                        View view7 = view4;
                                        qVar2.a(context2, view7, bVar, autoNextLineLinearLayout, strArr6);
                                        view4 = view7;
                                        if (findViewById8 != null) {
                                            a aVar4 = qVar2.z;
                                            qVar2.a(view4, findViewById8, 27, bVar, aVar4.b ? bVar : aVar4.r);
                                        }
                                        if (findViewById9 != null) {
                                            a aVar5 = qVar2.z;
                                            qVar2.a(view4, findViewById9, 27, bVar, aVar5.b ? bVar : aVar5.r);
                                        }
                                        a aVar6 = qVar2.z;
                                        qVar2.a(view4, view4, 18, bVar, !aVar6.b ? bVar : aVar6.r);
                                        return view3;
                                    }
                                }
                                qVar2 = this;
                                if (findViewById8 != null) {
                                }
                                if (findViewById9 != null) {
                                }
                                a aVar62 = qVar2.z;
                                qVar2.a(view4, view4, 18, bVar, !aVar62.b ? bVar : aVar62.r);
                                return view3;
                            }
                        }
                    }
                    view4 = view6;
                    if (strArr3 != null) {
                    }
                    qVar2 = this;
                    if (findViewById8 != null) {
                    }
                    if (findViewById9 != null) {
                    }
                    a aVar622 = qVar2.z;
                    qVar2.a(view4, view4, 18, bVar, !aVar622.b ? bVar : aVar622.r);
                    return view3;
                }
            }
            qVar = this;
            bVar3 = bVar2;
            if (!z) {
                roundedFrameLayout = (RoundedFrameLayout) view6.findViewById(R.id.inter_ll_fallback_media);
                boolean z42 = false;
                if (roundedFrameLayout != null) {
                }
                adImageView = (AdImageView) view6.findViewById(R.id.inter_iv_fallback_media);
                if (adImageView != null) {
                }
            }
            view4 = view6;
            if (strArr3 != null) {
            }
            qVar2 = this;
            if (findViewById8 != null) {
            }
            if (findViewById9 != null) {
            }
            a aVar6222 = qVar2.z;
            qVar2.a(view4, view4, 18, bVar, !aVar6222.b ? bVar : aVar6222.r);
            return view3;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if ((-1) == r6.E) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        boolean z;
        sg.bigo.ads.ai.o oVar = this.d;
        if (oVar != null) {
            z = true;
            if (oVar.a("endpage.is_endpage", 1) == 0) {
                if (!this.d.c("layer.is_show_layer")) {
                }
            }
        }
        z = false;
        if (this.m && !z) {
            sg.bigo.ads.bh.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.q.16
                @Override // java.lang.Runnable
                public final void run() {
                    q.this.e();
                }
            });
            return;
        }
        if (this.O) {
            long j = this.u;
            if (j <= 0 || this.v == null) {
                return;
            }
            this.O = false;
            a(j);
        }
    }

    public static /* synthetic */ void b(q qVar) {
        qVar.v = null;
        qVar.w = null;
    }

    @NonNull
    private FrameLayout a(@NonNull Context context, @NonNull View view, boolean z) {
        int i;
        FrameLayout frameLayout = new FrameLayout(context);
        int i2 = this.A.b;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, z ? -1 : -2);
        if (i2 == 1) {
            int a2 = sg.bigo.ads.common.utils.f.a(context, 10);
            layoutParams.topMargin = a2;
            layoutParams.bottomMargin = a2;
            layoutParams.leftMargin = a2;
            layoutParams.rightMargin = a2;
            i = 17;
        } else {
            layoutParams.topMargin = sg.bigo.ads.common.utils.f.a(context, 40);
            i = 80;
        }
        layoutParams.gravity = i;
        frameLayout.addView(view, layoutParams);
        String str = this.b.T().f;
        if (sg.bigo.ads.common.utils.r.b((CharSequence) str)) {
            sg.bigo.ads.common.view.c.a(context, frameLayout, new sg.bigo.ads.common.view.c(context, str));
        }
        return frameLayout;
    }

    @NonNull
    private static LinearLayout a(Context context, View view, int i) {
        LinearLayout a2 = q1.a(1, context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(sg.bigo.ads.common.utils.r.b("#F0F3F4", -7829368));
        ImageView imageView = new ImageView(context);
        imageView.setId(R.id.bigo_ad_btn_close);
        imageView.setImageDrawable(sg.bigo.ads.common.utils.a.a(context, R.drawable.bigo_ad_ic_close_gray_light));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(sg.bigo.ads.common.utils.f.a(context, 24), sg.bigo.ads.common.utils.f.a(context, 24), 21);
        layoutParams.rightMargin = sg.bigo.ads.common.utils.f.a(context, 20);
        frameLayout.addView(imageView, layoutParams);
        a2.addView(frameLayout, new LinearLayout.LayoutParams(-1, sg.bigo.ads.common.utils.f.a(context, 48)));
        a2.addView(view, new LinearLayout.LayoutParams(-1, i));
        return a2;
    }

    public final void a() {
        if (this.P != null || this.L <= 0) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: sg.bigo.ads.ad.interstitial.q.12
            @Override // java.lang.Runnable
            public final void run() {
                q qVar = q.this;
                qVar.j = true;
                qVar.g();
            }
        };
        this.P = runnable;
        sg.bigo.ads.bh.d.a(2, runnable, this.L);
    }

    public final void a(int i, boolean z) {
        this.J = true;
        this.q = i;
        this.p = z;
        if (this.l) {
            sg.bigo.ads.bh.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.q.14
                @Override // java.lang.Runnable
                public final void run() {
                    q.a(q.this);
                }
            });
        }
    }

    public final void a(long j) {
        Runnable runnable = this.v;
        this.N = SystemClock.elapsedRealtime();
        sg.bigo.ads.bh.d.a(runnable);
        sg.bigo.ads.bh.d.a(2, runnable, j);
    }

    private void a(@NonNull Context context, View view, sg.bigo.ads.y.b bVar, @NonNull AutoNextLineLinearLayout autoNextLineLinearLayout, @NonNull String[] strArr) {
        View view2;
        sg.bigo.ads.y.b bVar2;
        int i = 0;
        while (i < strArr.length) {
            try {
                String str = strArr[i];
                if (TextUtils.isEmpty(str)) {
                    view2 = view;
                    bVar2 = bVar;
                } else {
                    TextView textView = new TextView(context);
                    textView.setText(str);
                    textView.setTextColor(sg.bigo.ads.common.utils.r.b("#5F6367", -7829368));
                    textView.setTextSize(13.0f);
                    textView.setPadding(sg.bigo.ads.common.utils.f.a(context, 12), sg.bigo.ads.common.utils.f.a(context, 5), sg.bigo.ads.common.utils.f.a(context, 12), sg.bigo.ads.common.utils.f.a(context, 5));
                    textView.setGravity(17);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(0);
                    gradientDrawable.setColor(-1);
                    gradientDrawable.setStroke(sg.bigo.ads.common.utils.f.a(context, 1), sg.bigo.ads.common.utils.r.b("#DBDDE0", -7829368));
                    gradientDrawable.setCornerRadius(sg.bigo.ads.common.utils.f.a(context, 14));
                    textView.setBackground(gradientDrawable);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, sg.bigo.ads.common.utils.f.a(context, 28));
                    layoutParams.topMargin = sg.bigo.ads.common.utils.f.a(context, 12);
                    layoutParams.rightMargin = sg.bigo.ads.common.utils.f.a(context, 12);
                    view2 = view;
                    bVar2 = bVar;
                    a(view2, textView, 27, bVar2, bVar);
                    autoNextLineLinearLayout.addView(textView, layoutParams);
                }
                i++;
                view = view2;
                bVar = bVar2;
            } catch (Exception unused) {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [sg.bigo.ads.ad.interstitial.q] */
    /* JADX WARN: Type inference failed for: r14v0, types: [android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r1v3, types: [sg.bigo.ads.core.adview.h] */
    /* JADX WARN: Type inference failed for: r2v5, types: [sg.bigo.ads.core.adview.h] */
    /* JADX WARN: Type inference failed for: r9v0, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    private void a(@NonNull Context context, ViewGroup viewGroup, sg.bigo.ads.y.b bVar, @NonNull final sg.bigo.ads.api.core.b bVar2, @NonNull String[] strArr) {
        ?? a2 = q1.a(0, context);
        final ArrayList arrayList = new ArrayList();
        final int i = 0;
        while (i < strArr.length) {
            final String str = strArr[i];
            if (!TextUtils.isEmpty(str) && URLUtil.isNetworkUrl(str)) {
                final int a3 = sg.bigo.ads.common.utils.f.a(context, 200);
                final RoundedFrameLayout roundedFrameLayout = new RoundedFrameLayout(context);
                roundedFrameLayout.setCornerRadius(sg.bigo.ads.common.utils.f.a(context, 4));
                roundedFrameLayout.setStrokeWidth(sg.bigo.ads.common.utils.f.a(context, 1));
                roundedFrameLayout.setStrokeColor(sg.bigo.ads.common.utils.r.b("#08000000", -7829368));
                final AdImageView adImageView = new AdImageView(context);
                adImageView.setBackgroundColor(sg.bigo.ads.common.utils.r.b("#FFE1E1E6", -7829368));
                adImageView.setImageDrawable(sg.bigo.ads.common.utils.a.a(context, R.drawable.bigo_ad_icon_default_only_icon));
                this.B.a(bVar2, 2, str, i);
                sg.bigo.ads.bj.g gVar = new sg.bigo.ads.bj.g() { // from class: sg.bigo.ads.ad.interstitial.q.8
                    @Override // sg.bigo.ads.bj.g
                    public final void a(int i2, @NonNull String str2, @Nullable sg.bigo.ads.bj.f fVar) {
                        q.this.B.a(bVar2, 2, str, i, i2, str2);
                    }

                    @Override // sg.bigo.ads.bj.g
                    public final void a(@NonNull Bitmap bitmap, @NonNull sg.bigo.ads.bj.f fVar) {
                        ViewGroup.LayoutParams layoutParams;
                        adImageView.setBackground(null);
                        int width = bitmap.getWidth();
                        int height = bitmap.getHeight();
                        if (width > 0 && height > 0 && (layoutParams = roundedFrameLayout.getLayoutParams()) != null) {
                            layoutParams.width = (width * a3) / height;
                        }
                        adImageView.setScaleType(ImageView.ScaleType.FIT_XY);
                        q.this.B.b(bVar2, 2, str, i);
                    }
                };
                adImageView.a(gVar);
                arrayList.add(gVar);
                a(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.q.9
                    @Override // java.lang.Runnable
                    public final void run() {
                        adImageView.a();
                    }
                });
                adImageView.a(str, bVar2.am());
                roundedFrameLayout.addView(adImageView, new FrameLayout.LayoutParams(-1, -1));
                a aVar = this.z;
                a(viewGroup, roundedFrameLayout, 5, bVar, aVar.c ? bVar : aVar.r);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(sg.bigo.ads.common.utils.f.a(context, 100), a3);
                layoutParams.leftMargin = i == 0 ? sg.bigo.ads.common.utils.f.a(context, 20) : sg.bigo.ads.common.utils.f.a(context, 12);
                if (i + 1 == strArr.length) {
                    layoutParams.rightMargin = sg.bigo.ads.common.utils.f.a(context, 20);
                }
                a2.addView(roundedFrameLayout, layoutParams);
            }
            a(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.q.10
                @Override // java.lang.Runnable
                public final void run() {
                    arrayList.clear();
                }
            });
            i++;
        }
        a aVar2 = this.z;
        a(viewGroup, viewGroup, 18, bVar, aVar2.d ? bVar : aVar2.r);
        viewGroup.addView(a2);
    }

    public final void a(@NonNull final Context context, @NonNull final sg.bigo.ads.y.b bVar, final sg.bigo.ads.api.core.b bVar2, @NonNull final FrameLayout frameLayout) {
        Runnable runnable = new Runnable() { // from class: sg.bigo.ads.ad.interstitial.q.22
            @Override // java.lang.Runnable
            public final void run() {
                q qVar = q.this;
                qVar.D = false;
                boolean a2 = qVar.a(frameLayout);
                if (bVar2 instanceof sg.bigo.ads.cp.a) {
                    q qVar2 = q.this;
                    if (qVar2.s == 0) {
                        qVar2.s = SystemClock.elapsedRealtime();
                        ((sg.bigo.ads.cp.a) bVar2).b(q.this.s);
                    }
                }
                sg.bigo.ads.api.core.b bVar3 = bVar2;
                q qVar3 = q.this;
                sg.bigo.ads.da.b.a(bVar3, "1", e.a(qVar3.q, qVar3.p), q.this.r);
                Context context2 = context;
                if (context2 instanceof Activity) {
                    Activity activity = (Activity) context2;
                    if (activity.isFinishing() || activity.isDestroyed()) {
                        return;
                    }
                }
                AlertDialog create = new AlertDialog.Builder(context).setCancelable(!a2).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: sg.bigo.ads.ad.interstitial.q.22.1
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        q qVar4 = q.this;
                        qVar4.k = true;
                        qVar4.l = false;
                    }
                }).create();
                create.requestWindowFeature(1);
                create.show();
                Window window = create.getWindow();
                window.getDecorView().setPadding(0, 0, 0, 0);
                window.setGravity(17);
                window.setContentView(frameLayout);
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.width = -1;
                attributes.height = -1;
                window.setAttributes(attributes);
                q.this.h = create;
                frameLayout.setVisibility(4);
                frameLayout.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.q.22.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass22 anonymousClass22 = AnonymousClass22.this;
                        int i = q.this.A.b;
                        frameLayout.setVisibility(0);
                        if (i == 1) {
                            sg.bigo.ads.ad.interstitial.c.d(frameLayout);
                        } else {
                            sg.bigo.ads.ad.interstitial.c.a(frameLayout, 400L, new b.d());
                        }
                    }
                });
                q qVar4 = q.this;
                Runnable runnable2 = qVar4.e;
                if (runnable2 != null) {
                    runnable2.run();
                    qVar4.e = null;
                    qVar4.n = true;
                }
            }
        };
        c cVar = this.C;
        if (cVar != null) {
            this.D = cVar.a(runnable);
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(@NonNull View view, @NonNull View view2, int i, @NonNull sg.bigo.ads.y.b bVar, @Nullable sg.bigo.ads.core.adview.h hVar) {
        a aVar = this.z;
        aVar.a(bVar, view, view2, i, aVar.a(bVar, hVar));
    }

    private void a(@NonNull Runnable runnable) {
        this.Q.add(runnable);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01e7 A[LOOP:0: B:2:0x0005->B:33:0x01e7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01e4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(q qVar, final Context context, final sg.bigo.ads.y.b bVar, sg.bigo.ads.api.core.b bVar2) {
        final sg.bigo.ads.y.b bVar3;
        q qVar2;
        boolean z;
        String str;
        q qVar3 = qVar;
        final sg.bigo.ads.api.core.b bVar4 = bVar2;
        int i = 0;
        while (!qVar3.J) {
            if (i > 10) {
                qVar3.a(bVar4);
                return;
            }
            int i2 = qVar3.M;
            List<Integer> list = qVar3.t;
            if (list == null || i2 >= list.size()) {
                qVar3.a(bVar4);
                return;
            }
            Integer num = list.get(i2);
            qVar3.M++;
            int intValue = num.intValue();
            View view = null;
            View view2 = null;
            view = null;
            r2 = null;
            r2 = null;
            r2 = null;
            r2 = null;
            View view3 = null;
            if (intValue == 1) {
                String p = bVar4.p();
                if (TextUtils.isEmpty(p) || !URLUtil.isNetworkUrl(p)) {
                    p = null;
                }
                if (TextUtils.isEmpty(p)) {
                    String o = bVar4.o();
                    if (!TextUtils.isEmpty(o)) {
                        p = "https://play.google.com/store/apps/details?id=".concat(String.valueOf(o));
                        z = true;
                        str = p;
                        if (TextUtils.isEmpty(str)) {
                            view2 = view;
                            if (view2 == null) {
                                qVar3.I = view2;
                                return;
                            }
                            i++;
                        } else {
                            sg.bigo.ads.dm.e a2 = sg.bigo.ads.dm.e.a(context);
                            if (a2 != null) {
                                qVar.a(a2, a2, 28, bVar, bVar);
                                final sg.bigo.ads.api.core.b bVar5 = bVar4;
                                final boolean z2 = z;
                                q qVar4 = qVar;
                                a2.setWebViewClient(new sg.bigo.ads.dm.d() { // from class: sg.bigo.ads.ad.interstitial.q.13
                                    boolean a = false;

                                    @Override // sg.bigo.ads.dm.d
                                    public final void a(RenderProcessGoneDetail renderProcessGoneDetail) {
                                        sg.bigo.ads.da.b.a(3002, 10105, "[MidPage] The render process was gone.");
                                        if (this.a) {
                                            return;
                                        }
                                        this.a = true;
                                        q.a(q.this, context, bVar, bVar5, 1);
                                        q.this.B.a(bVar5, z2, -1, "onRenderProcessGone");
                                    }

                                    @Override // sg.bigo.ads.dm.d, android.webkit.WebViewClient
                                    public final void onPageFinished(WebView webView, String str2) {
                                        super.onPageFinished(webView, str2);
                                        if (this.a) {
                                            return;
                                        }
                                        this.a = true;
                                        q.this.a(1, z2);
                                        e eVar = q.this.B;
                                        sg.bigo.ads.api.core.b bVar6 = bVar5;
                                        boolean z3 = z2;
                                        if (eVar.b || eVar.a <= 0) {
                                            return;
                                        }
                                        eVar.b = true;
                                        sg.bigo.ads.da.b.a(bVar6, e.a(1, z3), 3, (String) null, SystemClock.elapsedRealtime() - eVar.a, false, 0, (String) null);
                                    }

                                    @Override // android.webkit.WebViewClient
                                    public final void onPageStarted(WebView webView, String str2, Bitmap bitmap) {
                                        super.onPageStarted(webView, str2, bitmap);
                                    }

                                    @Override // sg.bigo.ads.dm.d, android.webkit.WebViewClient
                                    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                                        String charSequence;
                                        e eVar;
                                        sg.bigo.ads.api.core.b bVar6;
                                        int i3;
                                        boolean z3;
                                        super.onReceivedError(webView, webResourceRequest, webResourceError);
                                        if (this.a) {
                                            return;
                                        }
                                        this.a = true;
                                        q.a(q.this, context, bVar, bVar5, 1);
                                        if (webResourceError == null) {
                                            eVar = q.this.B;
                                            bVar6 = bVar5;
                                            z3 = z2;
                                            i3 = -1;
                                            charSequence = "onReceivedError";
                                        } else {
                                            CharSequence description = webResourceError.getDescription();
                                            e eVar2 = q.this.B;
                                            sg.bigo.ads.api.core.b bVar7 = bVar5;
                                            boolean z4 = z2;
                                            int errorCode = webResourceError.getErrorCode();
                                            charSequence = description == null ? "null" : description.toString();
                                            eVar = eVar2;
                                            bVar6 = bVar7;
                                            i3 = errorCode;
                                            z3 = z4;
                                        }
                                        eVar.a(bVar6, z3, i3, charSequence);
                                    }

                                    @Override // android.webkit.WebViewClient
                                    public final boolean shouldOverrideUrlLoading(WebView webView, String str2) {
                                        return true;
                                    }
                                });
                                e eVar = qVar4.B;
                                if (eVar.a <= 0) {
                                    eVar.a = SystemClock.elapsedRealtime();
                                    bVar3 = bVar;
                                    sg.bigo.ads.da.b.a(bVar2, e.a(1, z2), 1, (String) null, 0L, false, 0, (String) null);
                                    bVar4 = bVar2;
                                } else {
                                    bVar3 = bVar;
                                    bVar4 = bVar2;
                                }
                                a2.loadUrl(str);
                                view3 = a(context, a2, -2);
                                qVar2 = qVar4;
                                qVar3 = qVar2;
                                view = view3;
                                view2 = view;
                                if (view2 == null) {
                                }
                            } else {
                                qVar3 = qVar;
                                if (view2 == null) {
                                }
                            }
                        }
                    }
                }
                z = false;
                str = p;
                if (TextUtils.isEmpty(str)) {
                }
            } else {
                bVar3 = bVar;
                q qVar5 = qVar3;
                if (intValue == 2) {
                    b.d r = bVar4.r();
                    qVar2 = qVar5;
                    if (r != null) {
                        String[] e2 = r.e();
                        qVar2 = qVar5;
                        if (e2 != null) {
                            qVar2 = qVar5;
                            if (e2.length > 0) {
                                View a3 = qVar5.a(context, bVar3, bVar4, true);
                                view3 = a3;
                                qVar2 = qVar5;
                                if (a3 != null) {
                                    qVar5.a(2, false);
                                    view3 = a3;
                                    qVar2 = qVar5;
                                }
                            }
                        }
                    }
                } else {
                    if (intValue == 3) {
                        final String q = bVar4.q();
                        qVar2 = qVar5;
                        if (!TextUtils.isEmpty(q)) {
                            qVar2 = qVar5;
                            if (URLUtil.isNetworkUrl(q)) {
                                final ImageView imageView = new ImageView(context);
                                FrameLayout frameLayout = new FrameLayout(context);
                                frameLayout.setBackgroundColor(-1);
                                frameLayout.addView(imageView, new FrameLayout.LayoutParams(-1, -1, 17));
                                RoundedFrameLayout roundedFrameLayout = new RoundedFrameLayout(context);
                                roundedFrameLayout.setId(R.id.bigo_ad_btn_close);
                                roundedFrameLayout.setCornerRadius(sg.bigo.ads.common.utils.f.a(context, 12));
                                View view4 = new View(context);
                                view4.setBackgroundColor(sg.bigo.ads.common.utils.r.b("#33000000", -7829368));
                                roundedFrameLayout.addView(view4, new FrameLayout.LayoutParams(sg.bigo.ads.common.utils.f.a(context, 24), sg.bigo.ads.common.utils.f.a(context, 24), 17));
                                ImageView imageView2 = new ImageView(context);
                                imageView2.setBackground(sg.bigo.ads.common.utils.a.a(context, R.drawable.bigo_ad_ic_close));
                                roundedFrameLayout.addView(imageView2, new FrameLayout.LayoutParams(sg.bigo.ads.common.utils.f.a(context, 12), sg.bigo.ads.common.utils.f.a(context, 12), 17));
                                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(sg.bigo.ads.common.utils.f.a(context, 24), sg.bigo.ads.common.utils.f.a(context, 24), 53);
                                layoutParams.topMargin = sg.bigo.ads.common.utils.f.a(context, 18);
                                layoutParams.rightMargin = sg.bigo.ads.common.utils.f.a(context, 22);
                                frameLayout.addView(roundedFrameLayout, layoutParams);
                                final FrameLayout b2 = qVar5.b(context, frameLayout, true);
                                final FrameLayout frameLayout2 = new FrameLayout(context);
                                frameLayout2.addView(b2, new FrameLayout.LayoutParams(-1, -2, qVar5.A.b != 1 ? 80 : 17));
                                qVar5.B.a(bVar4, 3, q, 100);
                                qVar3 = qVar5;
                                sg.bigo.ads.bj.e.a(bVar3.b.e, q, bVar4.am(), new sg.bigo.ads.bj.g() { // from class: sg.bigo.ads.ad.interstitial.q.11
                                    @Override // sg.bigo.ads.bj.g
                                    public final void a(int i3, @NonNull String str2, @Nullable sg.bigo.ads.bj.f fVar) {
                                        q.a(q.this, context, bVar3, bVar4, 2);
                                        q.this.B.a(bVar4, 3, q, 100, i3, str2);
                                    }

                                    /* JADX WARN: Multi-variable type inference failed */
                                    /* JADX WARN: Type inference failed for: r13v2, types: [sg.bigo.ads.core.adview.h] */
                                    /* JADX WARN: Type inference failed for: r13v4, types: [sg.bigo.ads.core.adview.h] */
                                    @Override // sg.bigo.ads.bj.g
                                    public final void a(@NonNull Bitmap bitmap, @NonNull sg.bigo.ads.bj.f fVar) {
                                        final int width = bitmap.getWidth();
                                        final int height = bitmap.getHeight();
                                        frameLayout2.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.q.11.1
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                int i3;
                                                int i4;
                                                int width2 = frameLayout2.getWidth();
                                                int height2 = frameLayout2.getHeight();
                                                ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                                                if (width2 <= 0 || height2 <= 0 || (i3 = width) <= 0 || (i4 = height) <= 0) {
                                                    layoutParams2.width = -1;
                                                    layoutParams2.height = -1;
                                                    return;
                                                }
                                                if ((i3 * 1.0f) / i4 > (width2 * 1.0f) / height2) {
                                                    layoutParams2.width = width2;
                                                    layoutParams2.height = (width2 * i4) / i3;
                                                } else {
                                                    layoutParams2.width = (i3 * height2) / i4;
                                                    layoutParams2.height = height2;
                                                }
                                                imageView.requestLayout();
                                            }
                                        });
                                        imageView.setImageBitmap(bitmap);
                                        q qVar6 = q.this;
                                        FrameLayout frameLayout3 = b2;
                                        ImageView imageView3 = imageView;
                                        sg.bigo.ads.y.b bVar6 = bVar3;
                                        a aVar = qVar6.z;
                                        qVar6.a(frameLayout3, imageView3, 5, bVar6, aVar.c ? bVar6 : aVar.r);
                                        q qVar7 = q.this;
                                        FrameLayout frameLayout4 = b2;
                                        sg.bigo.ads.y.b bVar7 = bVar3;
                                        a aVar2 = qVar7.z;
                                        qVar7.a(frameLayout4, frameLayout4, 18, bVar7, aVar2.d ? bVar7 : aVar2.r);
                                        q.this.a(3, false);
                                        q.this.B.b(bVar4, 3, q, 100);
                                    }
                                });
                                view = frameLayout2;
                            }
                        }
                    } else {
                        qVar3 = qVar5;
                        if (intValue == 4) {
                            View a4 = qVar3.a(context, bVar3, bVar4, false);
                            view2 = a4;
                            if (a4 != null) {
                                qVar3.a(4, false);
                                view2 = a4;
                            }
                            if (view2 == null) {
                            }
                        }
                    }
                    view2 = view;
                    if (view2 == null) {
                    }
                }
                qVar3 = qVar2;
                view = view3;
                view2 = view;
                if (view2 == null) {
                }
            }
        }
    }

    public static /* synthetic */ void a(q qVar, final Context context, final sg.bigo.ads.y.b bVar, final sg.bigo.ads.api.core.b bVar2, int i) {
        qVar.r = i;
        sg.bigo.ads.bh.d.b(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.q.15
            @Override // java.lang.Runnable
            public final void run() {
                q.a(q.this, context, bVar, bVar2);
            }
        });
    }

    private void a(sg.bigo.ads.api.core.b bVar) {
        this.j = true;
        sg.bigo.ads.da.b.a(bVar, "0", e.a(this.q, this.p), this.r);
        d();
    }

    public final boolean a(Context context, sg.bigo.ads.y.b bVar, sg.bigo.ads.api.core.b bVar2, sg.bigo.ads.ai.o oVar) {
        return (context == null || bVar == null || bVar2 == null || oVar == null || this.K) ? false : true;
    }

    public final boolean a(@NonNull FrameLayout frameLayout) {
        int i;
        final View findViewById = frameLayout.findViewById(R.id.bigo_ad_btn_cta);
        if (findViewById != null && this.z.e) {
            sg.bigo.ads.ad.interstitial.c.e(findViewById);
            a(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.q.2
                @Override // java.lang.Runnable
                public final void run() {
                    findViewById.clearAnimation();
                }
            });
        }
        final View findViewById2 = frameLayout.findViewById(R.id.bigo_ad_btn_close);
        if (findViewById2 == null) {
            return false;
        }
        findViewById2.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.ad.interstitial.q.19
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q.this.d();
            }
        });
        sg.bigo.ads.ai.o oVar = this.d;
        if (oVar != null) {
            i = oVar.a("mid_page.force_staying_time");
            if (i < 0 || i > 5) {
                i = 3;
            }
        } else {
            i = 0;
        }
        if (i == 0) {
            findViewById2.setVisibility(0);
            return true;
        }
        findViewById2.setVisibility(4);
        sg.bigo.ads.bh.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.q.20
            @Override // java.lang.Runnable
            public final void run() {
                findViewById2.setVisibility(0);
            }
        }, i * 1000);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3, types: [sg.bigo.ads.core.adview.h] */
    /* JADX WARN: Type inference failed for: r1v4, types: [sg.bigo.ads.core.adview.h] */
    public static /* synthetic */ boolean a(q qVar) {
        String str;
        final Context context = qVar.a;
        final sg.bigo.ads.y.b bVar = qVar.b;
        final sg.bigo.ads.api.core.b bVar2 = qVar.c;
        if (qVar.a(context, bVar, bVar2, qVar.d)) {
            final int i = qVar.q;
            final boolean z = qVar.p;
            View view = qVar.I;
            boolean z2 = qVar.J;
            boolean z3 = qVar.j;
            if (z2 && view != null) {
                if (qVar.i()) {
                    boolean z4 = qVar.q == 3;
                    final FrameLayout a2 = qVar.a(context, qVar.b(context, view, z4), z4);
                    qVar.K = true;
                    if (bVar2 instanceof sg.bigo.ads.cp.a) {
                        ((sg.bigo.ads.cp.a) bVar2).g(e.a(i, z));
                    }
                    sg.bigo.ads.bh.d.b(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.q.18
                        @Override // java.lang.Runnable
                        public final void run() {
                            q qVar2 = q.this;
                            Context context2 = context;
                            sg.bigo.ads.y.b bVar3 = bVar;
                            sg.bigo.ads.api.core.b bVar4 = bVar2;
                            FrameLayout frameLayout = a2;
                            if (!qVar2.l) {
                                qVar2.a(context2, bVar3, bVar4, frameLayout);
                                qVar2.f = frameLayout;
                                return;
                            }
                            FrameLayout frameLayout2 = qVar2.g;
                            if (frameLayout2 != null) {
                                frameLayout2.removeAllViews();
                                qVar2.a(frameLayout);
                                frameLayout2.addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
                            }
                            qVar2.f = frameLayout2;
                            qVar2.l = false;
                            if ((bVar4 instanceof sg.bigo.ads.cp.a) && qVar2.s == 0) {
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                qVar2.s = elapsedRealtime;
                                ((sg.bigo.ads.cp.a) bVar4).b(elapsedRealtime);
                            }
                            sg.bigo.ads.da.b.a(bVar4, "1", e.a(qVar2.q, qVar2.p), qVar2.r);
                        }
                    });
                }
                return true;
            }
            if (z3) {
                str = "Failed to show mid page due to unavailable.";
            } else {
                if (!z2 && view != null) {
                    if (qVar.i()) {
                        final FrameLayout frameLayout = new FrameLayout(context);
                        View a3 = sg.bigo.ads.common.utils.a.a(context, qVar.o ? R.layout.bigo_ad_layout_interstitial_mid_page_loading_view_landscape : R.layout.bigo_ad_layout_interstitial_mid_page_loading_view, null, false);
                        if (a3 != null) {
                            qVar.l = true;
                            FrameLayout a4 = qVar.a(context, (View) qVar.b(context, a(context, a3, -1), true), true);
                            frameLayout.addView(a4, new FrameLayout.LayoutParams(-1, -1));
                            a aVar = qVar.z;
                            qVar.a(a3, a3, 18, bVar, aVar.b ? bVar : aVar.r);
                            a aVar2 = qVar.z;
                            qVar.a(a4, a4, 18, bVar, aVar2.b ? bVar : aVar2.r);
                            qVar.g = frameLayout;
                            if (bVar2 instanceof sg.bigo.ads.cp.a) {
                                ((sg.bigo.ads.cp.a) bVar2).g(6);
                            }
                            qVar.q = 5;
                            sg.bigo.ads.bh.d.b(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.q.21
                                @Override // java.lang.Runnable
                                public final void run() {
                                    q.this.a(context, bVar, bVar2, frameLayout);
                                }
                            });
                        }
                    }
                    return true;
                }
                str = "Failed to show mid page due to unknown reason.";
            }
            sg.bigo.ads.bn.a.a(0, "InterstitialMidPageRenderer", str);
        }
        return false;
    }
}
