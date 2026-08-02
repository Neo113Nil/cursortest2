package xsna;

import android.animation.Animator;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.AsyncUpdates;
import com.airbnb.lottie.LottieFeatureFlag;
import com.airbnb.lottie.RenderMode;
import com.airbnb.lottie.configurations.reducemotion.ReducedMotionMode;
import com.airbnb.lottie.model.content.LBlendMode;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.unity3d.services.UnityAdsConstants;
import com.vk.sidecontrols.api.AnimatedSharingController;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: LottieDrawable.java */
/* loaded from: classes12.dex */
public final class k800 extends Drawable implements Drawable.Callback, Animatable {
    public static final List<String> S = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
    public static final ThreadPoolExecutor T = new ThreadPoolExecutor(0, 2, 35, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new y800());
    public final Matrix A;
    public Bitmap B;
    public Canvas C;
    public Rect D;
    public RectF E;
    public xky F;
    public Rect G;
    public Rect H;
    public RectF I;
    public RectF J;
    public Matrix K;
    public final float[] L;
    public Matrix M;
    public boolean N;

    @Nullable
    public AsyncUpdates O;
    public final Semaphore P;
    public final kv3 Q;
    public float R;
    public i700 b;
    public final z800 c;
    public final boolean d;
    public boolean e;
    public boolean f;
    public b g;
    public final ArrayList<a> h;

    @Nullable
    public sfw i;

    @Nullable
    public String j;

    @Nullable
    public ofw k;

    @Nullable
    public q4s l;

    @Nullable
    public Map<String, Typeface> m;

    @Nullable
    public String n;
    public final o800 o;
    public boolean p;
    public boolean q;

    @Nullable
    public com.airbnb.lottie.model.layer.b r;
    public int s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public RenderMode y;
    public boolean z;

    /* compiled from: LottieDrawable.java */
    public interface a {
        void run();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LottieDrawable.java */
    public static final class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b NONE;
        public static final b PLAY;
        public static final b RESUME;

        static {
            b bVar = new b("NONE", 0);
            NONE = bVar;
            b bVar2 = new b("PLAY", 1);
            PLAY = bVar2;
            b bVar3 = new b("RESUME", 2);
            RESUME = bVar3;
            $VALUES = new b[]{bVar, bVar2, bVar3};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    public k800() {
        z800 z800Var = new z800();
        z800Var.e = 1.0f;
        z800Var.f = false;
        z800Var.g = 0L;
        z800Var.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        z800Var.i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        z800Var.j = 0;
        z800Var.k = -2.1474836E9f;
        z800Var.l = 2.1474836E9f;
        z800Var.n = false;
        z800Var.o = false;
        this.c = z800Var;
        this.d = true;
        this.e = false;
        this.f = false;
        this.g = b.NONE;
        this.h = new ArrayList<>();
        this.o = new o800();
        this.p = false;
        this.q = true;
        this.s = 255;
        this.x = false;
        this.y = RenderMode.AUTOMATIC;
        this.z = false;
        this.A = new Matrix();
        this.L = new float[9];
        this.N = false;
        hb6 hb6Var = new hb6(this, 2);
        this.P = new Semaphore(1);
        this.Q = new kv3(this, 11);
        this.R = -3.4028235E38f;
        z800Var.addUpdateListener(hb6Var);
    }

    public static void g(Rect rect, RectF rectF) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public static boolean n(float f) {
        return (Float.isNaN(f) || Float.isInfinite(f)) ? false : true;
    }

    public final void A(final String str) {
        i700 i700Var = this.b;
        if (i700Var == null) {
            this.h.add(new a() { // from class: xsna.e800
                @Override // xsna.k800.a
                public final void run() {
                    k800.this.A(str);
                }
            });
        } else {
            go00 e = i700Var.e(str);
            if (e == null) {
                throw new IllegalArgumentException(zr.a("Cannot find marker with name ", str, "."));
            }
            z((int) e.b);
        }
    }

    public final void B(final float f) {
        i700 i700Var = this.b;
        if (i700Var == null) {
            this.h.add(new a() { // from class: xsna.h800
                @Override // xsna.k800.a
                public final void run() {
                    k800.this.B(f);
                }
            });
        } else {
            AsyncUpdates asyncUpdates = tky.a;
            this.c.n(ls20.f(i700Var.l, i700Var.m, f));
        }
    }

    public final boolean C() {
        i700 i700Var = this.b;
        if (i700Var == null) {
            return false;
        }
        float f = this.R;
        float i = this.c.i();
        this.R = i;
        return Math.abs(i - f) * i700Var.b() >= 50.0f;
    }

    public final <T> void a(final udy udyVar, final T t, @Nullable final a900<T> a900Var) {
        com.airbnb.lottie.model.layer.b bVar = this.r;
        if (bVar == null) {
            this.h.add(new a() { // from class: xsna.y700
                @Override // xsna.k800.a
                public final void run() {
                    k800.this.a(udyVar, t, a900Var);
                }
            });
            return;
        }
        boolean z = true;
        if (udyVar == udy.c) {
            bVar.f(t, a900Var);
        } else {
            vdy vdyVar = udyVar.b;
            if (vdyVar != null) {
                vdyVar.f(t, a900Var);
            } else {
                ArrayList arrayList = new ArrayList();
                this.r.d(udyVar, 0, arrayList, new udy(new String[0]));
                for (int i = 0; i < arrayList.size(); i++) {
                    ((udy) arrayList.get(i)).b.f(t, a900Var);
                }
                z = true ^ arrayList.isEmpty();
            }
        }
        if (z) {
            invalidateSelf();
            if (t == t800.C) {
                B(this.c.i());
            }
        }
    }

    public final boolean b(@Nullable Context context) {
        if (this.e) {
            return true;
        }
        if (!this.d) {
            return false;
        }
        tky.d.getClass();
        return ((context == null || (b3r0.d(context) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (b3r0.d(context) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) != 0) ? ReducedMotionMode.STANDARD_MOTION : ReducedMotionMode.REDUCED_MOTION) == ReducedMotionMode.STANDARD_MOTION;
    }

    public final void c() {
        i700 i700Var = this.b;
        if (i700Var == null) {
            return;
        }
        JsonReader.a aVar = iny.a;
        Rect rect = i700Var.k;
        List list = Collections.EMPTY_LIST;
        com.airbnb.lottie.model.layer.b bVar = new com.airbnb.lottie.model.layer.b(this, new Layer(list, i700Var, "__container", -1L, Layer.LayerType.PRE_COMP, -1L, null, list, new dg2(), 0, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rect.width(), rect.height(), null, null, list, Layer.MatteType.NONE, null, false, null, null, LBlendMode.NORMAL), i700Var.j, i700Var);
        this.r = bVar;
        if (this.u) {
            bVar.q(true);
        }
        this.r.L = this.q;
    }

    public final void d() {
        this.h.clear();
        this.c.cancel();
        if (isVisible()) {
            return;
        }
        this.g = b.NONE;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        com.airbnb.lottie.model.layer.b bVar = this.r;
        if (bVar == null) {
            return;
        }
        AsyncUpdates asyncUpdates = this.O;
        if (asyncUpdates == null) {
            asyncUpdates = tky.a;
        }
        boolean z = asyncUpdates == AsyncUpdates.ENABLED;
        kv3 kv3Var = this.Q;
        ThreadPoolExecutor threadPoolExecutor = T;
        z800 z800Var = this.c;
        Semaphore semaphore = this.P;
        if (z) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                AsyncUpdates asyncUpdates2 = tky.a;
                if (!z) {
                    return;
                }
                semaphore.release();
                if (bVar.K == z800Var.i()) {
                    return;
                }
            } catch (Throwable th) {
                AsyncUpdates asyncUpdates3 = tky.a;
                if (z) {
                    semaphore.release();
                    if (bVar.K != z800Var.i()) {
                        threadPoolExecutor.execute(kv3Var);
                    }
                }
                throw th;
            }
        }
        AsyncUpdates asyncUpdates4 = tky.a;
        if (z && C()) {
            B(z800Var.i());
        }
        if (this.f) {
            try {
                if (this.z) {
                    q(canvas, bVar);
                } else {
                    h(canvas);
                }
            } catch (Throwable unused2) {
                n100.a.getClass();
                AsyncUpdates asyncUpdates5 = tky.a;
            }
        } else if (this.z) {
            q(canvas, bVar);
        } else {
            h(canvas);
        }
        this.N = false;
        if (z) {
            semaphore.release();
            if (bVar.K == z800Var.i()) {
                return;
            }
            threadPoolExecutor.execute(kv3Var);
        }
    }

    public final void e() {
        z800 z800Var = this.c;
        if (z800Var.n) {
            z800Var.cancel();
            if (!isVisible()) {
                this.g = b.NONE;
            }
        }
        this.b = null;
        this.r = null;
        this.i = null;
        this.R = -3.4028235E38f;
        z800Var.m = null;
        z800Var.k = -2.1474836E9f;
        z800Var.l = 2.1474836E9f;
        invalidateSelf();
    }

    public final void f() {
        i700 i700Var = this.b;
        if (i700Var == null) {
            return;
        }
        RenderMode renderMode = this.y;
        int i = i700Var.o;
        renderMode.getClass();
        int i2 = RenderMode.a.a[renderMode.ordinal()];
        boolean z = false;
        if (i2 != 1 && (i2 == 2 || i > 4)) {
            z = true;
        }
        this.z = z;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.s;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        i700 i700Var = this.b;
        if (i700Var == null) {
            return -1;
        }
        return i700Var.k.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        i700 i700Var = this.b;
        if (i700Var == null) {
            return -1;
        }
        return i700Var.k.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h(Canvas canvas) {
        com.airbnb.lottie.model.layer.b bVar = this.r;
        i700 i700Var = this.b;
        if (bVar == null || i700Var == null) {
            return;
        }
        Matrix matrix = this.A;
        matrix.reset();
        if (!getBounds().isEmpty()) {
            matrix.preTranslate(r3.left, r3.top);
            matrix.preScale(r3.width() / i700Var.k.width(), r3.height() / i700Var.k.height());
        }
        bVar.e(canvas, matrix, this.s, null);
    }

    public final void i(LottieFeatureFlag lottieFeatureFlag, boolean z) {
        boolean remove;
        HashSet<LottieFeatureFlag> hashSet = this.o.a;
        if (!z) {
            remove = hashSet.remove(lottieFeatureFlag);
        } else if (Build.VERSION.SDK_INT < lottieFeatureFlag.minRequiredSdkVersion) {
            n100.b(String.format("%s is not supported pre SDK %d", lottieFeatureFlag.name(), Integer.valueOf(lottieFeatureFlag.minRequiredSdkVersion)));
            remove = false;
        } else {
            remove = hashSet.add(lottieFeatureFlag);
        }
        if (this.b == null || !remove) {
            return;
        }
        c();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.N) {
            return;
        }
        this.N = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return m();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r4 == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
    
        if (r0 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        r17.i = null;
     */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap j(String str) {
        Bitmap bitmap;
        sfw sfwVar = this.i;
        Bitmap bitmap2 = null;
        if (sfwVar != null) {
            Context k = k();
            Context context = sfwVar.a;
            if (k != null) {
                if (context instanceof Application) {
                    k = k.getApplicationContext();
                }
            }
        }
        if (this.i == null) {
            this.i = new sfw(getCallback(), this.j, this.k, this.b.d());
        }
        sfw sfwVar2 = this.i;
        if (sfwVar2 != null) {
            String str2 = sfwVar2.b;
            q800 q800Var = sfwVar2.d.get(str);
            if (q800Var != null) {
                int i = q800Var.b;
                int i2 = q800Var.a;
                Bitmap bitmap3 = q800Var.f;
                if (bitmap3 != null) {
                    return bitmap3;
                }
                ofw ofwVar = sfwVar2.c;
                if (ofwVar != null) {
                    ll2 ll2Var = (ll2) ofwVar;
                    AnimatedSharingController.Strategy strategy = (AnimatedSharingController.Strategy) ll2Var.b;
                    List list = (List) ll2Var.c;
                    String str3 = q800Var.c;
                    if (str3 != null && ((strategy != AnimatedSharingController.Strategy.LIKE_AND_REWATCH_ONCE_WITH_STOP_FRAME || !str3.equals("comp_0")) && brm0.B(str3, "image_", false))) {
                        StringBuilder sb = new StringBuilder();
                        int length = str3.length();
                        for (int i3 = 0; i3 < length; i3++) {
                            char charAt = str3.charAt(i3);
                            if (Character.isDigit(charAt)) {
                                sb.append(charAt);
                            }
                        }
                        Integer m = arm0.m(10, sb.toString());
                        if (m != null && (bitmap = (Bitmap) j5g.b0(m.intValue(), list)) != null) {
                            if (bitmap.getWidth() == i2 && bitmap.getHeight() == i) {
                                bitmap2 = bitmap;
                            } else {
                                Matrix matrix = new Matrix();
                                matrix.postScale(i2 / bitmap.getWidth(), i / bitmap.getHeight());
                                bitmap2 = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                            }
                        }
                    }
                    if (bitmap2 != null) {
                        sfwVar2.a(bitmap2, str);
                    }
                    return bitmap2;
                }
                Context context2 = sfwVar2.a;
                if (context2 != null) {
                    String str4 = q800Var.d;
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = 160;
                    if (!str4.startsWith("data:") || str4.indexOf("base64,") <= 0) {
                        try {
                            if (TextUtils.isEmpty(str2)) {
                                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                            }
                            try {
                                Bitmap decodeStream = BitmapFactory.decodeStream(context2.getAssets().open(str2 + str4), null, options);
                                if (decodeStream != null) {
                                    Bitmap e = b3r0.e(i2, i, decodeStream);
                                    sfwVar2.a(e, str);
                                    return e;
                                }
                                n100.b("Decoded image `" + str + "` is null.");
                                return null;
                            } catch (IllegalArgumentException e2) {
                                n100.c("Unable to decode image `" + str + "`.", e2);
                            }
                        } catch (IOException e3) {
                            n100.c("Unable to open asset.", e3);
                        }
                    } else {
                        try {
                            byte[] decode = Base64.decode(str4.substring(str4.indexOf(44) + 1), 0);
                            try {
                                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                                if (decodeByteArray != null) {
                                    Bitmap e4 = b3r0.e(i2, i, decodeByteArray);
                                    sfwVar2.a(e4, str);
                                    return e4;
                                }
                                n100.b("Decoded image `" + str + "` is null.");
                                return null;
                            } catch (IllegalArgumentException e5) {
                                n100.c("Unable to decode image `" + str + "`.", e5);
                            }
                        } catch (IllegalArgumentException e6) {
                            n100.c("data URL did not have correct base64 format.", e6);
                        }
                    }
                }
            }
        }
        return null;
    }

    @Nullable
    public final Context k() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    public final q4s l() {
        if (getCallback() == null) {
            return null;
        }
        if (this.l == null) {
            q4s q4sVar = new q4s(getCallback());
            this.l = q4sVar;
            String str = this.n;
            if (str != null) {
                q4sVar.e = str;
            }
        }
        return this.l;
    }

    public final boolean m() {
        z800 z800Var = this.c;
        if (z800Var == null) {
            return false;
        }
        return z800Var.n;
    }

    public final void o() {
        this.h.clear();
        z800 z800Var = this.c;
        z800Var.m(true);
        Iterator it = z800Var.d.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(z800Var);
        }
        if (isVisible()) {
            return;
        }
        this.g = b.NONE;
    }

    public final void p() {
        if (this.r == null) {
            this.h.add(new a() { // from class: xsna.f800
                @Override // xsna.k800.a
                public final void run() {
                    k800.this.p();
                }
            });
            return;
        }
        f();
        boolean b2 = b(k());
        z800 z800Var = this.c;
        if (b2 || z800Var.getRepeatCount() == 0) {
            if (isVisible()) {
                z800Var.n = true;
                boolean l = z800Var.l();
                Iterator it = z800Var.c.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorListener) it.next()).onAnimationStart(z800Var, l);
                }
                z800Var.n((int) (z800Var.l() ? z800Var.j() : z800Var.k()));
                z800Var.g = 0L;
                z800Var.j = 0;
                if (z800Var.n) {
                    z800Var.m(false);
                    Choreographer.getInstance().postFrameCallback(z800Var);
                }
                this.g = b.NONE;
            } else {
                this.g = b.PLAY;
            }
        }
        if (b(k())) {
            return;
        }
        Iterator<String> it2 = S.iterator();
        go00 go00Var = null;
        while (it2.hasNext()) {
            go00Var = this.b.e(it2.next());
            if (go00Var != null) {
                break;
            }
        }
        if (go00Var != null) {
            t((int) go00Var.b);
        } else {
            t((int) (z800Var.e < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? z800Var.k() : z800Var.j()));
        }
        z800Var.m(true);
        z800Var.a(z800Var.l());
        if (isVisible()) {
            return;
        }
        this.g = b.NONE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(Canvas canvas, com.airbnb.lottie.model.layer.b bVar) {
        boolean z;
        RectF rectF;
        if (this.b == null || bVar == null) {
            return;
        }
        if (this.C == null) {
            this.C = new Canvas();
            this.J = new RectF();
            this.K = new Matrix();
            this.M = new Matrix();
            this.D = new Rect();
            this.E = new RectF();
            this.F = new xky();
            this.G = new Rect();
            this.H = new Rect();
            this.I = new RectF();
        }
        canvas.getMatrix(this.K);
        canvas.getClipBounds(this.D);
        Rect rect = this.D;
        this.E.set(rect.left, rect.top, rect.right, rect.bottom);
        this.K.mapRect(this.E);
        g(this.D, this.E);
        if (this.q) {
            this.J.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            bVar.g(this.J, null, false);
        }
        this.K.mapRect(this.J);
        Rect bounds = getBounds();
        float width = bounds.width() / getIntrinsicWidth();
        float height = bounds.height() / getIntrinsicHeight();
        RectF rectF2 = this.J;
        rectF2.set(rectF2.left * width, rectF2.top * height, rectF2.right * width, rectF2.bottom * height);
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            ViewParent parent = ((View) callback).getParent();
            if (parent instanceof ViewGroup) {
                z = !((ViewGroup) parent).getClipChildren();
                if (!z) {
                    RectF rectF3 = this.J;
                    Rect rect2 = this.D;
                    rectF3.intersect(rect2.left, rect2.top, rect2.right, rect2.bottom);
                }
                rectF = this.J;
                if (!n(rectF.left) && n(rectF.top) && n(rectF.right) && n(rectF.bottom)) {
                    n100.b("Skipping software rendering: transformed bounds contain non-finite values.");
                    return;
                }
                int ceil = (int) Math.ceil(this.J.width());
                int ceil2 = (int) Math.ceil(this.J.height());
                if (ceil <= 0 || ceil2 <= 0) {
                    n100.b("Skipping software rendering: transformed bounds have negative values.");
                    return;
                }
                long j = ceil * ceil2;
                if (j > 50000000) {
                    n100.b("Skipping software rendering: bitmap request exceeds safe pixel count (" + j + ")");
                    return;
                }
                Bitmap bitmap = this.B;
                if (bitmap == null || bitmap.getWidth() < ceil || this.B.getHeight() < ceil2) {
                    Bitmap createBitmap = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
                    this.B = createBitmap;
                    this.C.setBitmap(createBitmap);
                    this.N = true;
                } else if (this.B.getWidth() > ceil || this.B.getHeight() > ceil2) {
                    Bitmap createBitmap2 = Bitmap.createBitmap(this.B, 0, 0, ceil, ceil2);
                    this.B = createBitmap2;
                    this.C.setBitmap(createBitmap2);
                    this.N = true;
                }
                if (this.N) {
                    Matrix matrix = this.K;
                    float[] fArr = this.L;
                    matrix.getValues(fArr);
                    float f = fArr[0];
                    float f2 = fArr[4];
                    Matrix matrix2 = this.K;
                    Matrix matrix3 = this.A;
                    matrix3.set(matrix2);
                    matrix3.preScale(width, height);
                    RectF rectF4 = this.J;
                    matrix3.postTranslate(-rectF4.left, -rectF4.top);
                    matrix3.postScale(1.0f / f, 1.0f / f2);
                    this.B.eraseColor(0);
                    this.C.setMatrix(b3r0.a);
                    this.C.scale(f, f2);
                    bVar.e(this.C, matrix3, this.s, null);
                    this.K.invert(this.M);
                    this.M.mapRect(this.I, this.J);
                    g(this.H, this.I);
                }
                this.G.set(0, 0, ceil, ceil2);
                canvas.drawBitmap(this.B, this.G, this.H, this.F);
                return;
            }
        }
        z = false;
        if (!z) {
        }
        rectF = this.J;
        if (!n(rectF.left) && n(rectF.top) && n(rectF.right) && n(rectF.bottom)) {
        }
    }

    public final void r() {
        if (this.r == null) {
            this.h.add(new a() { // from class: xsna.c800
                @Override // xsna.k800.a
                public final void run() {
                    k800.this.r();
                }
            });
            return;
        }
        f();
        boolean b2 = b(k());
        z800 z800Var = this.c;
        if (b2 || z800Var.getRepeatCount() == 0) {
            if (isVisible()) {
                z800Var.n = true;
                z800Var.m(false);
                Choreographer.getInstance().postFrameCallback(z800Var);
                z800Var.g = 0L;
                if (z800Var.l() && z800Var.i == z800Var.k()) {
                    z800Var.n(z800Var.j());
                } else if (!z800Var.l() && z800Var.i == z800Var.j()) {
                    z800Var.n(z800Var.k());
                }
                Iterator it = z800Var.d.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(z800Var);
                }
                this.g = b.NONE;
            } else {
                this.g = b.RESUME;
            }
        }
        if (b(k())) {
            return;
        }
        t((int) (z800Var.e < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? z800Var.k() : z800Var.j()));
        z800Var.m(true);
        z800Var.a(z800Var.l());
        if (isVisible()) {
            return;
        }
        this.g = b.NONE;
    }

    public final boolean s(i700 i700Var) {
        if (this.b == i700Var) {
            return false;
        }
        this.N = true;
        e();
        this.b = i700Var;
        c();
        z800 z800Var = this.c;
        boolean z = z800Var.m == null;
        z800Var.m = i700Var;
        if (z) {
            z800Var.o(Math.max(z800Var.k, i700Var.l), Math.min(z800Var.l, i700Var.m));
        } else {
            z800Var.o((int) i700Var.l, (int) i700Var.m);
        }
        float f = z800Var.i;
        z800Var.i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        z800Var.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        z800Var.n((int) f);
        z800Var.e();
        B(z800Var.getAnimatedFraction());
        ArrayList<a> arrayList = this.h;
        Iterator it = new ArrayList(arrayList).iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar != null) {
                aVar.run();
            }
            it.remove();
        }
        arrayList.clear();
        i700Var.a.a = this.t;
        f();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.s = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        n100.b("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean isVisible = isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            b bVar = this.g;
            if (bVar == b.PLAY) {
                p();
                return visible;
            }
            if (bVar == b.RESUME) {
                r();
                return visible;
            }
        } else {
            if (this.c.n) {
                o();
                this.g = b.RESUME;
                return visible;
            }
            if (isVisible) {
                this.g = b.NONE;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        p();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.h.clear();
        z800 z800Var = this.c;
        z800Var.m(true);
        z800Var.a(z800Var.l());
        if (isVisible()) {
            return;
        }
        this.g = b.NONE;
    }

    public final void t(final int i) {
        if (this.b != null) {
            this.c.n(i);
        } else {
            this.h.add(new a() { // from class: xsna.i800
                @Override // xsna.k800.a
                public final void run() {
                    k800.this.t(i);
                }
            });
        }
    }

    public final void u(final int i) {
        if (this.b == null) {
            this.h.add(new a() { // from class: xsna.w700
                @Override // xsna.k800.a
                public final void run() {
                    k800.this.u(i);
                }
            });
        } else {
            z800 z800Var = this.c;
            z800Var.o(z800Var.k, i + 0.99f);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public final void v(final String str) {
        i700 i700Var = this.b;
        if (i700Var == null) {
            this.h.add(new a() { // from class: xsna.d800
                @Override // xsna.k800.a
                public final void run() {
                    k800.this.v(str);
                }
            });
        } else {
            go00 e = i700Var.e(str);
            if (e == null) {
                throw new IllegalArgumentException(zr.a("Cannot find marker with name ", str, "."));
            }
            u((int) (e.b + e.c));
        }
    }

    public final void w(final int i, final int i2) {
        if (this.b == null) {
            this.h.add(new a() { // from class: xsna.a800
                @Override // xsna.k800.a
                public final void run() {
                    k800.this.w(i, i2);
                }
            });
        } else {
            this.c.o(i, i2 + 0.99f);
        }
    }

    public final void x(final String str) {
        i700 i700Var = this.b;
        if (i700Var == null) {
            this.h.add(new a() { // from class: xsna.v700
                @Override // xsna.k800.a
                public final void run() {
                    k800.this.x(str);
                }
            });
            return;
        }
        go00 e = i700Var.e(str);
        if (e == null) {
            throw new IllegalArgumentException(zr.a("Cannot find marker with name ", str, "."));
        }
        int i = (int) e.b;
        w(i, ((int) e.c) + i);
    }

    public final void y() {
        i700 i700Var = this.b;
        if (i700Var == null) {
            this.h.add(new a() { // from class: xsna.b800
                @Override // xsna.k800.a
                public final void run() {
                    k800.this.y();
                }
            });
        } else {
            int f = (int) ls20.f(i700Var.l, i700Var.m, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            i700 i700Var2 = this.b;
            w(f, (int) ls20.f(i700Var2.l, i700Var2.m, 1.0f));
        }
    }

    public final void z(final int i) {
        if (this.b == null) {
            this.h.add(new a() { // from class: xsna.x700
                @Override // xsna.k800.a
                public final void run() {
                    k800.this.z(i);
                }
            });
        } else {
            this.c.o(i, (int) r0.l);
        }
    }
}
