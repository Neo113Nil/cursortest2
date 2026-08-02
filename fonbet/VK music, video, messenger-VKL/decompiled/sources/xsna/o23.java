package xsna;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.R$styleable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.WindowCallbackWrapper;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.lifecycle.Lifecycle;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;
import org.chromium.base.TimeUtils;
import ru.ok.gl.tf.Tensorflow;
import xsna.dbg0;
import xsna.ftp0;
import xsna.g40;
import xsna.gin0;
import xsna.idy;
import xsna.iut0;
import xsna.x2p0;

/* compiled from: AppCompatDelegateImpl.java */
/* loaded from: classes.dex */
public final class o23 extends l23 implements f.a, LayoutInflater.Factory2 {
    public static final dpj0<String, Integer> j0 = new dpj0<>();
    public static final int[] k0 = {R.attr.windowBackground};
    public static final boolean l0 = !"robolectric".equals(Build.FINGERPRINT);
    public boolean B;
    public ViewGroup C;
    public TextView D;
    public View E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public o[] N;
    public o O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public Configuration T;
    public final int U;
    public int V;
    public int W;
    public boolean X;
    public m Y;
    public k Z;
    public boolean a0;
    public int b0;
    public boolean d0;
    public Rect e0;
    public Rect f0;
    public u33 g0;
    public OnBackInvokedDispatcher h0;
    public OnBackInvokedCallback i0;
    public final Object k;
    public final Context l;
    public Window m;
    public j n;
    public final g23 o;
    public eu p;
    public lin0 q;
    public CharSequence r;
    public s8l s;
    public d t;
    public p u;
    public g40 v;
    public ActionBarContextView w;
    public PopupWindow x;
    public r23 y;
    public b0u0 z = null;
    public final boolean A = true;
    public final a c0 = new a();

    /* compiled from: AppCompatDelegateImpl.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            o23 o23Var = o23.this;
            if ((o23Var.b0 & 1) != 0) {
                o23Var.R(0);
            }
            if ((o23Var.b0 & 4096) != 0) {
                o23Var.R(108);
            }
            o23Var.a0 = false;
            o23Var.b0 = 0;
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes11.dex */
    public class b implements gu {
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes11.dex */
    public interface c {
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes11.dex */
    public final class d implements j.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void a(@NonNull androidx.appcompat.view.menu.f fVar, boolean z) {
            o23.this.N(fVar);
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean b(@NonNull androidx.appcompat.view.menu.f fVar) {
            Window.Callback callback = o23.this.m.getCallback();
            if (callback == null) {
                return true;
            }
            callback.onMenuOpened(108, fVar);
            return true;
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes11.dex */
    public class e implements g40.a {
        public final g40.a a;

        /* compiled from: AppCompatDelegateImpl.java */
        public class a extends f0u0 {
            public a() {
            }

            @Override // xsna.e0u0
            public final void b() {
                o23 o23Var = o23.this;
                o23Var.w.setVisibility(8);
                PopupWindow popupWindow = o23Var.x;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (o23Var.w.getParent() instanceof View) {
                    View view = (View) o23Var.w.getParent();
                    WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                    view.requestApplyInsets();
                }
                o23Var.w.h();
                o23Var.z.d(null);
                o23Var.z = null;
                ViewGroup viewGroup = o23Var.C;
                WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
                viewGroup.requestApplyInsets();
            }
        }

        public e(g40.a aVar) {
            this.a = aVar;
        }

        @Override // xsna.g40.a
        public final boolean a(g40 g40Var, MenuItem menuItem) {
            return this.a.a(g40Var, menuItem);
        }

        @Override // xsna.g40.a
        public final boolean b(g40 g40Var, Menu menu) {
            return this.a.b(g40Var, menu);
        }

        @Override // xsna.g40.a
        public final boolean c(g40 g40Var, Menu menu) {
            ViewGroup viewGroup = o23.this.C;
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            viewGroup.requestApplyInsets();
            return this.a.c(g40Var, menu);
        }

        @Override // xsna.g40.a
        public final void d(g40 g40Var) {
            this.a.d(g40Var);
            o23 o23Var = o23.this;
            if (o23Var.x != null) {
                o23Var.m.getDecorView().removeCallbacks(o23Var.y);
            }
            if (o23Var.w != null) {
                b0u0 b0u0Var = o23Var.z;
                if (b0u0Var != null) {
                    b0u0Var.b();
                }
                b0u0 b = iut0.b(o23Var.w);
                b.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                o23Var.z = b;
                b.d(new a());
            }
            g23 g23Var = o23Var.o;
            if (g23Var != null) {
                g23Var.onSupportActionModeFinished(o23Var.v);
            }
            o23Var.v = null;
            ViewGroup viewGroup = o23Var.C;
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            viewGroup.requestApplyInsets();
            o23Var.d0();
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes11.dex */
    public static class f {
        public static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        public static String b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    public static class g {
        public static void a(@NonNull Configuration configuration, @NonNull Configuration configuration2, @NonNull Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        public static mwz b(Configuration configuration) {
            return mwz.a(configuration.getLocales().toLanguageTags());
        }

        public static void c(mwz mwzVar) {
            LocaleList.setDefault(LocaleList.forLanguageTags(mwzVar.a.a.toLanguageTags()));
        }

        public static void d(Configuration configuration, mwz mwzVar) {
            configuration.setLocales(LocaleList.forLanguageTags(mwzVar.a.a.toLanguageTags()));
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes11.dex */
    public static class h {
        public static void a(@NonNull Configuration configuration, @NonNull Configuration configuration2, @NonNull Configuration configuration3) {
            int i = configuration.colorMode & 3;
            int i2 = configuration2.colorMode & 3;
            if (i != i2) {
                configuration3.colorMode |= i2;
            }
            int i3 = configuration.colorMode & 12;
            int i4 = configuration2.colorMode & 12;
            if (i3 != i4) {
                configuration3.colorMode |= i4;
            }
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    public static class i {
        public static OnBackInvokedDispatcher a(Activity activity) {
            OnBackInvokedDispatcher onBackInvokedDispatcher;
            onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            return onBackInvokedDispatcher;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.window.OnBackInvokedCallback, xsna.y23] */
        public static OnBackInvokedCallback b(Object obj, final o23 o23Var) {
            Objects.requireNonNull(o23Var);
            ?? r0 = new OnBackInvokedCallback() { // from class: xsna.y23
                public final void onBackInvoked() {
                    o23.this.Y();
                }
            };
            u23.b(obj).registerOnBackInvokedCallback(1000000, r0);
            return r0;
        }

        public static void c(Object obj, Object obj2) {
            u23.b(obj).unregisterOnBackInvokedCallback(t23.a(obj2));
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes11.dex */
    public class k extends l {
        public final PowerManager c;

        public k(@NonNull Context context) {
            super();
            this.c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // xsna.o23.l
        public final IntentFilter b() {
            return z23.a("android.os.action.POWER_SAVE_MODE_CHANGED");
        }

        @Override // xsna.o23.l
        public final void c() {
            o23.this.J(true, true);
        }

        public final int e() {
            return f.a(this.c) ? 2 : 1;
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes11.dex */
    public abstract class l {
        public a a;

        /* compiled from: AppCompatDelegateImpl.java */
        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                l.this.c();
            }
        }

        public l() {
        }

        public final void a() {
            a aVar = this.a;
            if (aVar != null) {
                try {
                    o23.this.l.unregisterReceiver(aVar);
                } catch (IllegalArgumentException unused) {
                }
                this.a = null;
            }
        }

        @Nullable
        public abstract IntentFilter b();

        public abstract void c();

        public final void d() {
            a();
            IntentFilter b = b();
            if (b.countActions() == 0) {
                return;
            }
            if (this.a == null) {
                this.a = new a();
            }
            o23.this.l.registerReceiver(this.a, b);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes11.dex */
    public class m extends l {
        public final ftp0 c;

        public m(@NonNull ftp0 ftp0Var) {
            super();
            this.c = ftp0Var;
        }

        @Override // xsna.o23.l
        public final IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // xsna.o23.l
        public final void c() {
            o23.this.J(true, true);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00d2  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int e() {
            Location location;
            boolean z;
            long j;
            ftp0 ftp0Var = this.c;
            ftp0.a aVar = ftp0Var.c;
            LocationManager locationManager = ftp0Var.b;
            if (aVar.b > System.currentTimeMillis()) {
                z = aVar.a;
            } else {
                Context context = ftp0Var.a;
                Location location2 = null;
                if (d02.n(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                    if (locationManager.isProviderEnabled("network")) {
                        location = locationManager.getLastKnownLocation("network");
                        if (d02.n(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                            try {
                                if (locationManager.isProviderEnabled("gps")) {
                                    location2 = locationManager.getLastKnownLocation("gps");
                                }
                            } catch (Exception unused) {
                            }
                        }
                        if (location2 != null || location == null ? location2 != null : location2.getTime() > location.getTime()) {
                            location = location2;
                        }
                        if (location == null) {
                            long currentTimeMillis = System.currentTimeMillis();
                            if (etp0.d == null) {
                                etp0.d = new etp0();
                            }
                            etp0 etp0Var = etp0.d;
                            etp0Var.a(currentTimeMillis - TimeUtils.MILLISECONDS_PER_DAY, location.getLatitude(), location.getLongitude());
                            etp0Var.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
                            z = etp0Var.c == 1;
                            long j2 = etp0Var.b;
                            long j3 = etp0Var.a;
                            etp0Var.a(currentTimeMillis + TimeUtils.MILLISECONDS_PER_DAY, location.getLatitude(), location.getLongitude());
                            long j4 = etp0Var.b;
                            if (j2 == -1 || j3 == -1) {
                                j = currentTimeMillis + 43200000;
                            } else {
                                if (currentTimeMillis <= j3) {
                                    j4 = currentTimeMillis > j2 ? j3 : j2;
                                }
                                j = j4 + 60000;
                            }
                            aVar.a = z;
                            aVar.b = j;
                        } else {
                            int i = Calendar.getInstance().get(11);
                            if (i < 6 || i >= 22) {
                                z = true;
                            }
                        }
                    }
                }
                location = null;
                if (d02.n(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                }
                if (location2 != null) {
                }
                location = location2;
                if (location == null) {
                }
            }
            return z ? 2 : 1;
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes11.dex */
    public class n extends ContentFrameLayout {
        public n(lpj lpjVar) {
            super(lpjVar, null);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return o23.this.Q(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                    o23 o23Var = o23.this;
                    o23Var.O(o23Var.U(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public final void setBackgroundResource(int i) {
            setBackgroundDrawable(m33.a(i, getContext()));
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    public static final class o {
        public int a;
        public int b;
        public int c;
        public int d;
        public n e;
        public View f;
        public View g;
        public androidx.appcompat.view.menu.f h;
        public androidx.appcompat.view.menu.d i;
        public lpj j;
        public boolean k;
        public boolean l;
        public boolean m;
        public boolean n;
        public boolean o;
        public Bundle p;
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes11.dex */
    public final class p implements j.a {
        public p() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void a(@NonNull androidx.appcompat.view.menu.f fVar, boolean z) {
            o oVar;
            androidx.appcompat.view.menu.f k = fVar.k();
            int i = 0;
            boolean z2 = k != fVar;
            if (z2) {
                fVar = k;
            }
            o23 o23Var = o23.this;
            o[] oVarArr = o23Var.N;
            int length = oVarArr != null ? oVarArr.length : 0;
            while (true) {
                if (i < length) {
                    oVar = oVarArr[i];
                    if (oVar != null && oVar.h == fVar) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    oVar = null;
                    break;
                }
            }
            if (oVar != null) {
                if (!z2) {
                    o23Var.O(oVar, z);
                } else {
                    o23Var.M(oVar.a, oVar, k);
                    o23Var.O(oVar, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean b(@NonNull androidx.appcompat.view.menu.f fVar) {
            Window.Callback callback;
            if (fVar != fVar.k()) {
                return true;
            }
            o23 o23Var = o23.this;
            if (!o23Var.H || (callback = o23Var.m.getCallback()) == null || o23Var.S) {
                return true;
            }
            callback.onMenuOpened(108, fVar);
            return true;
        }
    }

    public o23(Context context, Window window, g23 g23Var, Object obj) {
        AppCompatActivity appCompatActivity = null;
        this.U = -100;
        this.l = context;
        this.o = g23Var;
        this.k = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof AppCompatActivity)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        appCompatActivity = (AppCompatActivity) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (appCompatActivity != null) {
                this.U = appCompatActivity.getDelegate().k();
            }
        }
        if (this.U == -100) {
            String name = this.k.getClass().getName();
            dpj0<String, Integer> dpj0Var = j0;
            Integer num = dpj0Var.get(name);
            if (num != null) {
                this.U = num.intValue();
                dpj0Var.remove(this.k.getClass().getName());
            }
        }
        if (window != null) {
            K(window);
        }
        d33.d();
    }

    @Nullable
    public static mwz L(@NonNull Context context) {
        mwz mwzVar;
        if (Build.VERSION.SDK_INT >= 33 || (mwzVar = l23.d) == null) {
            return null;
        }
        mwz b2 = g.b(context.getApplicationContext().getResources().getConfiguration());
        mwz c2 = kci.c(mwzVar, b2);
        return c2.a.a.isEmpty() ? b2 : c2;
    }

    @NonNull
    public static Configuration P(@NonNull Context context, int i2, @Nullable mwz mwzVar, @Nullable Configuration configuration, boolean z) {
        int i3 = i2 != 1 ? i2 != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        if (mwzVar != null) {
            g.d(configuration2, mwzVar);
        }
        return configuration2;
    }

    @Override // xsna.l23
    public final void B(int i2) {
        S();
        ViewGroup viewGroup = (ViewGroup) this.C.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.l).inflate(i2, viewGroup);
        this.n.a(this.m.getCallback());
    }

    @Override // xsna.l23
    public final void C(View view) {
        S();
        ViewGroup viewGroup = (ViewGroup) this.C.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.n.a(this.m.getCallback());
    }

    @Override // xsna.l23
    public final void D(View view, ViewGroup.LayoutParams layoutParams) {
        S();
        ViewGroup viewGroup = (ViewGroup) this.C.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.n.a(this.m.getCallback());
    }

    @Override // xsna.l23
    public final void E(Toolbar toolbar) {
        Object obj = this.k;
        if (obj instanceof Activity) {
            V();
            eu euVar = this.p;
            if (euVar instanceof qpx0) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.q = null;
            if (euVar != null) {
                euVar.h();
            }
            this.p = null;
            if (toolbar != null) {
                x2p0 x2p0Var = new x2p0(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : this.r, this.n);
                this.p = x2p0Var;
                this.n.b = x2p0Var.c;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.n.b = null;
            }
            p();
        }
    }

    @Override // xsna.l23
    public final void F(int i2) {
        this.V = i2;
    }

    @Override // xsna.l23
    public final void G(CharSequence charSequence) {
        this.r = charSequence;
        s8l s8lVar = this.s;
        if (s8lVar != null) {
            s8lVar.setWindowTitle(charSequence);
            return;
        }
        eu euVar = this.p;
        if (euVar != null) {
            euVar.v(charSequence);
            return;
        }
        TextView textView = this.D;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0049  */
    @Override // xsna.l23
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final g40 H(@NonNull g40.a aVar) {
        g40 g40Var;
        ViewGroup viewGroup;
        g40 g40Var2;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        g40 g40Var3 = this.v;
        if (g40Var3 != null) {
            g40Var3.c();
        }
        e eVar = new e(aVar);
        V();
        eu euVar = this.p;
        g23 g23Var = this.o;
        if (euVar != null) {
            g40 w = euVar.w(eVar);
            this.v = w;
            if (w != null && g23Var != null) {
                g23Var.onSupportActionModeStarted(w);
            }
        }
        if (this.v == null) {
            b0u0 b0u0Var = this.z;
            if (b0u0Var != null) {
                b0u0Var.b();
            }
            g40 g40Var4 = this.v;
            if (g40Var4 != null) {
                g40Var4.c();
            }
            if (g23Var != null && !this.S) {
                try {
                    g40Var = g23Var.onWindowStartingSupportActionMode(eVar);
                } catch (AbstractMethodError unused) {
                }
                if (g40Var == null) {
                    this.v = g40Var;
                } else {
                    if (this.w == null) {
                        boolean z = this.K;
                        Context context = this.l;
                        if (z) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(com.vkontakte.android.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                Resources.Theme newTheme = context.getResources().newTheme();
                                newTheme.setTo(theme);
                                newTheme.applyStyle(typedValue.resourceId, true);
                                lpj lpjVar = new lpj(context, 0);
                                lpjVar.getTheme().setTo(newTheme);
                                context = lpjVar;
                            }
                            this.w = new ActionBarContextView(context);
                            PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, com.vkontakte.android.R.attr.actionModePopupWindowStyle);
                            this.x = popupWindow;
                            sv1.D(popupWindow);
                            this.x.setContentView(this.w);
                            this.x.setWidth(-1);
                            context.getTheme().resolveAttribute(com.vkontakte.android.R.attr.actionBarSize, typedValue, true);
                            this.w.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                            this.x.setHeight(-2);
                            this.y = new r23(this);
                        } else {
                            ViewStubCompat viewStubCompat = (ViewStubCompat) this.C.findViewById(com.vkontakte.android.R.id.action_mode_bar_stub);
                            if (viewStubCompat != null) {
                                V();
                                eu euVar2 = this.p;
                                Context e2 = euVar2 != null ? euVar2.e() : null;
                                if (e2 != null) {
                                    context = e2;
                                }
                                viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                                this.w = (ActionBarContextView) viewStubCompat.a();
                            }
                        }
                    }
                    if (this.w != null) {
                        b0u0 b0u0Var2 = this.z;
                        if (b0u0Var2 != null) {
                            b0u0Var2.b();
                        }
                        this.w.h();
                        xok0 xok0Var = new xok0(this.w.getContext(), this.w, eVar);
                        if (eVar.b(xok0Var, xok0Var.e())) {
                            xok0Var.i();
                            this.w.f(xok0Var);
                            this.v = xok0Var;
                            if (this.B && (viewGroup = this.C) != null && viewGroup.isLaidOut()) {
                                this.w.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                b0u0 b2 = iut0.b(this.w);
                                b2.a(1.0f);
                                this.z = b2;
                                b2.d(new s23(this));
                            } else {
                                this.w.setAlpha(1.0f);
                                this.w.setVisibility(0);
                                if (this.w.getParent() instanceof View) {
                                    View view = (View) this.w.getParent();
                                    WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                                    view.requestApplyInsets();
                                }
                            }
                            if (this.x != null) {
                                this.m.getDecorView().post(this.y);
                            }
                        } else {
                            this.v = null;
                        }
                    }
                }
                g40Var2 = this.v;
                if (g40Var2 != null && g23Var != null) {
                    g23Var.onSupportActionModeStarted(g40Var2);
                }
                d0();
                this.v = this.v;
            }
            g40Var = null;
            if (g40Var == null) {
            }
            g40Var2 = this.v;
            if (g40Var2 != null) {
                g23Var.onSupportActionModeStarted(g40Var2);
            }
            d0();
            this.v = this.v;
        }
        d0();
        return this.v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00de A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean J(boolean z, boolean z2) {
        int i2;
        Configuration configuration;
        mwz b2;
        int i3;
        boolean z3;
        Activity activity;
        if (this.S) {
            return false;
        }
        int i4 = this.U;
        if (i4 == -100) {
            i4 = l23.c;
        }
        Context context = this.l;
        int X = X(i4, context);
        int i5 = Build.VERSION.SDK_INT;
        mwz L = i5 < 33 ? L(context) : null;
        if (!z2 && L != null) {
            L = g.b(context.getResources().getConfiguration());
        }
        Configuration P = P(context, X, L, null, false);
        boolean z4 = this.X;
        boolean z5 = true;
        Object obj = this.k;
        if (!z4 && (obj instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i2 = 0;
                configuration = this.T;
                if (configuration == null) {
                    configuration = context.getResources().getConfiguration();
                }
                int i6 = configuration.uiMode & 48;
                int i7 = P.uiMode & 48;
                mwz b3 = g.b(configuration);
                b2 = L != null ? null : g.b(P);
                i3 = i6 == i7 ? 512 : 0;
                if (b2 != null && !b3.equals(b2)) {
                    i3 |= 8196;
                }
                if (((~i2) & i3) != 0 && z && this.Q && ((l0 || this.R) && (obj instanceof Activity))) {
                    activity = (Activity) obj;
                    if (!activity.isChild()) {
                        if (Build.VERSION.SDK_INT >= 31 && (i3 & 8192) != 0) {
                            activity.getWindow().getDecorView().setLayoutDirection(P.getLayoutDirection());
                        }
                        h90.h(activity);
                        z3 = true;
                        if (!z3 || i3 == 0) {
                            z5 = z3;
                        } else {
                            boolean z6 = (i3 & i2) == i3;
                            Resources resources = context.getResources();
                            Configuration configuration2 = new Configuration(resources.getConfiguration());
                            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i7;
                            if (b2 != null) {
                                g.d(configuration2, b2);
                            }
                            resources.updateConfiguration(configuration2, null);
                            int i8 = this.V;
                            if (i8 != 0) {
                                context.setTheme(i8);
                                context.getTheme().applyStyle(this.V, true);
                            }
                            if (z6 && (obj instanceof Activity)) {
                                Activity activity2 = (Activity) obj;
                                if (activity2 instanceof f5z) {
                                    if (((f5z) activity2).getLifecycle().getCurrentState().a(Lifecycle.State.CREATED)) {
                                        activity2.onConfigurationChanged(configuration2);
                                    }
                                } else if (this.R && !this.S) {
                                    activity2.onConfigurationChanged(configuration2);
                                }
                            }
                        }
                        if (z5 && (obj instanceof AppCompatActivity)) {
                            if ((i3 & 512) != 0) {
                                ((AppCompatActivity) obj).onNightModeChanged(X);
                            }
                            if ((i3 & 4) != 0) {
                                ((AppCompatActivity) obj).onLocalesChanged(L);
                            }
                        }
                        if (b2 != null) {
                            g.c(g.b(context.getResources().getConfiguration()));
                        }
                        if (i4 == 0) {
                            if (this.Y == null) {
                                this.Y = new m(ftp0.a(context));
                            }
                            this.Y.d();
                        } else {
                            m mVar = this.Y;
                            if (mVar != null) {
                                mVar.a();
                            }
                        }
                        if (i4 == 3) {
                            if (this.Z == null) {
                                this.Z = new k(context);
                            }
                            this.Z.d();
                        } else {
                            k kVar = this.Z;
                            if (kVar != null) {
                                kVar.a();
                            }
                        }
                        return z5;
                    }
                }
                z3 = false;
                if (z3) {
                }
                z5 = z3;
                if (z5) {
                    if ((i3 & 512) != 0) {
                    }
                    if ((i3 & 4) != 0) {
                    }
                }
                if (b2 != null) {
                }
                if (i4 == 0) {
                }
                if (i4 == 3) {
                }
                return z5;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj.getClass()), i5 >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.W = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                this.W = 0;
            }
        }
        this.X = true;
        i2 = this.W;
        configuration = this.T;
        if (configuration == null) {
        }
        int i62 = configuration.uiMode & 48;
        int i72 = P.uiMode & 48;
        mwz b32 = g.b(configuration);
        if (L != null) {
        }
        if (i62 == i72) {
        }
        if (b2 != null) {
            i3 |= 8196;
        }
        if (((~i2) & i3) != 0) {
            activity = (Activity) obj;
            if (!activity.isChild()) {
            }
        }
        z3 = false;
        if (z3) {
        }
        z5 = z3;
        if (z5) {
        }
        if (b2 != null) {
        }
        if (i4 == 0) {
        }
        if (i4 == 3) {
        }
        return z5;
    }

    public final void K(@NonNull Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.m != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof j) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        j jVar = new j(callback);
        this.n = jVar;
        window.setCallback(jVar);
        Context context = this.l;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, k0);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = null;
        } else {
            d33 a2 = d33.a();
            synchronized (a2) {
                drawable = a2.a.d(resourceId, context, true);
            }
        }
        if (drawable != null) {
            window.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.m = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.h0) != null) {
            return;
        }
        Object obj = this.k;
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.i0) != null) {
            i.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.i0 = null;
        }
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.h0 = i.a(activity);
                d0();
            }
        }
        this.h0 = null;
        d0();
    }

    public final void M(int i2, o oVar, androidx.appcompat.view.menu.f fVar) {
        if (fVar == null) {
            if (oVar == null && i2 >= 0) {
                o[] oVarArr = this.N;
                if (i2 < oVarArr.length) {
                    oVar = oVarArr[i2];
                }
            }
            if (oVar != null) {
                fVar = oVar.h;
            }
        }
        if ((oVar == null || oVar.m) && !this.S) {
            j jVar = this.n;
            Window.Callback callback = this.m.getCallback();
            jVar.getClass();
            try {
                jVar.e = true;
                callback.onPanelClosed(i2, fVar);
            } finally {
                jVar.e = false;
            }
        }
    }

    public final void N(@NonNull androidx.appcompat.view.menu.f fVar) {
        if (this.M) {
            return;
        }
        this.M = true;
        this.s.i();
        Window.Callback callback = this.m.getCallback();
        if (callback != null && !this.S) {
            callback.onPanelClosed(108, fVar);
        }
        this.M = false;
    }

    public final void O(o oVar, boolean z) {
        n nVar;
        s8l s8lVar;
        if (z && oVar.a == 0 && (s8lVar = this.s) != null && s8lVar.f()) {
            N(oVar.h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.l.getSystemService("window");
        if (windowManager != null && oVar.m && (nVar = oVar.e) != null) {
            windowManager.removeView(nVar);
            if (z) {
                M(oVar.a, oVar, null);
            }
        }
        oVar.k = false;
        oVar.l = false;
        oVar.m = false;
        oVar.f = null;
        oVar.n = true;
        if (this.O == oVar) {
            this.O = null;
        }
        if (oVar.a == 0) {
            d0();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        if (r4.dispatchKeyEvent(r7) != false) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Q(KeyEvent keyEvent) {
        boolean z;
        boolean z2;
        AudioManager audioManager;
        Object obj = this.k;
        if (((obj instanceof idy.a) || (obj instanceof b33)) && this.m.getDecorView() != null) {
            idy.a();
        }
        if (keyEvent.getKeyCode() == 82) {
            j jVar = this.n;
            Window.Callback callback = this.m.getCallback();
            jVar.getClass();
            try {
                jVar.d = true;
            } finally {
                jVar.d = false;
            }
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            if (keyCode == 4) {
                this.P = (keyEvent.getFlags() & 128) != 0;
                return false;
            }
            if (keyCode == 82) {
                if (keyEvent.getRepeatCount() == 0) {
                    o U = U(0);
                    if (!U.m) {
                        b0(U, keyEvent);
                        return true;
                    }
                }
            }
        }
        if (keyCode == 4) {
            return Y();
        }
        if (keyCode == 82) {
            if (this.v == null) {
                o U2 = U(0);
                s8l s8lVar = this.s;
                Context context = this.l;
                if (s8lVar == null || !s8lVar.d() || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    boolean z3 = U2.m;
                    if (z3 || U2.l) {
                        O(U2, true);
                        z = z3;
                    } else {
                        if (U2.k) {
                            if (U2.o) {
                                U2.k = false;
                                z2 = b0(U2, keyEvent);
                            } else {
                                z2 = true;
                            }
                            if (z2) {
                                Z(U2, keyEvent);
                                z = true;
                            }
                        }
                        z = false;
                    }
                    if (z && (audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio")) != null) {
                        audioManager.playSoundEffect(0);
                        return true;
                    }
                } else {
                    if (this.s.f()) {
                        z = this.s.a();
                    } else {
                        if (!this.S && b0(U2, keyEvent)) {
                            z = this.s.e();
                        }
                        z = false;
                    }
                    if (z) {
                        audioManager.playSoundEffect(0);
                        return true;
                    }
                }
            }
        }
    }

    public final void R(int i2) {
        o U = U(i2);
        if (U.h != null) {
            Bundle bundle = new Bundle();
            U.h.t(bundle);
            if (bundle.size() > 0) {
                U.p = bundle;
            }
            U.h.w();
            U.h.clear();
        }
        U.o = true;
        U.n = true;
        if ((i2 == 108 || i2 == 0) && this.s != null) {
            o U2 = U(0);
            U2.k = false;
            b0(U2, null);
        }
    }

    public final void S() {
        ViewGroup viewGroup;
        if (this.B) {
            return;
        }
        Context context = this.l;
        int[] iArr = R$styleable.j;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!obtainStyledAttributes.hasValue(Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, false)) {
            z(1);
        } else if (obtainStyledAttributes.getBoolean(Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, false)) {
            z(108);
        }
        if (obtainStyledAttributes.getBoolean(Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, false)) {
            z(109);
        }
        if (obtainStyledAttributes.getBoolean(Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, false)) {
            z(10);
        }
        this.K = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        T();
        this.m.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (this.L) {
            viewGroup = this.J ? (ViewGroup) from.inflate(com.vkontakte.android.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(com.vkontakte.android.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.K) {
            viewGroup = (ViewGroup) from.inflate(com.vkontakte.android.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.I = false;
            this.H = false;
        } else if (this.H) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.vkontakte.android.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new lpj(context, typedValue.resourceId) : context).inflate(com.vkontakte.android.R.layout.abc_screen_toolbar, (ViewGroup) null);
            s8l s8lVar = (s8l) viewGroup.findViewById(com.vkontakte.android.R.id.decor_content_parent);
            this.s = s8lVar;
            s8lVar.setWindowCallback(this.m.getCallback());
            if (this.I) {
                this.s.h(109);
            }
            if (this.F) {
                this.s.h(2);
            }
            if (this.G) {
                this.s.h(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder sb = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
            sb.append(this.H);
            sb.append(", windowActionBarOverlay: ");
            sb.append(this.I);
            sb.append(", android:windowIsFloating: ");
            sb.append(this.K);
            sb.append(", windowActionModeOverlay: ");
            sb.append(this.J);
            sb.append(", windowNoTitle: ");
            throw new IllegalArgumentException(n23.b(sb, this.L, " }"));
        }
        p23 p23Var = new p23(this);
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        iut0.d.c(viewGroup, p23Var);
        if (this.s == null) {
            this.D = (TextView) viewGroup.findViewById(com.vkontakte.android.R.id.title);
        }
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.vkontakte.android.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.m.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.m.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new q23(this));
        this.C = viewGroup;
        Object obj = this.k;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.r;
        if (!TextUtils.isEmpty(title)) {
            s8l s8lVar2 = this.s;
            if (s8lVar2 != null) {
                s8lVar2.setWindowTitle(title);
            } else {
                eu euVar = this.p;
                if (euVar != null) {
                    euVar.v(title);
                } else {
                    TextView textView = this.D;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.C.findViewById(R.id.content);
        View decorView = this.m.getDecorView();
        contentFrameLayout2.h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        obtainStyledAttributes2.getValue(Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, contentFrameLayout2.getMinWidthMajor());
        obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (obtainStyledAttributes2.hasValue(Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE)) {
            obtainStyledAttributes2.getValue(Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, contentFrameLayout2.getFixedWidthMajor());
        }
        if (obtainStyledAttributes2.hasValue(123)) {
            obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (obtainStyledAttributes2.hasValue(120)) {
            obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (obtainStyledAttributes2.hasValue(Sdk.SDKError.Reason.TPAT_ERROR_VALUE)) {
            obtainStyledAttributes2.getValue(Sdk.SDKError.Reason.TPAT_ERROR_VALUE, contentFrameLayout2.getFixedHeightMinor());
        }
        obtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.B = true;
        o U = U(0);
        if (this.S || U.h != null) {
            return;
        }
        W(108);
    }

    public final void T() {
        if (this.m == null) {
            Object obj = this.k;
            if (obj instanceof Activity) {
                K(((Activity) obj).getWindow());
            }
        }
        if (this.m == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final o U(int i2) {
        o[] oVarArr = this.N;
        if (oVarArr == null || oVarArr.length <= i2) {
            o[] oVarArr2 = new o[i2 + 1];
            if (oVarArr != null) {
                System.arraycopy(oVarArr, 0, oVarArr2, 0, oVarArr.length);
            }
            this.N = oVarArr2;
            oVarArr = oVarArr2;
        }
        o oVar = oVarArr[i2];
        if (oVar != null) {
            return oVar;
        }
        o oVar2 = new o();
        oVar2.a = i2;
        oVar2.n = false;
        oVarArr[i2] = oVar2;
        return oVar2;
    }

    public final void V() {
        S();
        if (this.H && this.p == null) {
            Object obj = this.k;
            if (obj instanceof Activity) {
                this.p = new qpx0((Activity) obj, this.I);
            } else if (obj instanceof Dialog) {
                this.p = new qpx0((Dialog) obj);
            }
            eu euVar = this.p;
            if (euVar != null) {
                euVar.m(this.d0);
            }
        }
    }

    public final void W(int i2) {
        this.b0 = (1 << i2) | this.b0;
        if (this.a0) {
            return;
        }
        View decorView = this.m.getDecorView();
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        decorView.postOnAnimation(this.c0);
        this.a0 = true;
    }

    public final int X(int i2, @NonNull Context context) {
        if (i2 != -100) {
            if (i2 == -1) {
                return i2;
            }
            if (i2 != 0) {
                if (i2 == 1 || i2 == 2) {
                    return i2;
                }
                if (i2 != 3) {
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
                if (this.Z == null) {
                    this.Z = new k(context);
                }
                return this.Z.e();
            }
            if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                if (this.Y == null) {
                    this.Y = new m(ftp0.a(context));
                }
                return this.Y.e();
            }
        }
        return -1;
    }

    public final boolean Y() {
        boolean z = this.P;
        this.P = false;
        o U = U(0);
        if (!U.m) {
            g40 g40Var = this.v;
            if (g40Var != null) {
                g40Var.c();
                return true;
            }
            V();
            eu euVar = this.p;
            if (euVar == null || !euVar.b()) {
                return false;
            }
        } else if (!z) {
            O(U, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0134, code lost:
    
        if (r2 != null) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z(o oVar, KeyEvent keyEvent) {
        int i2;
        ViewGroup.LayoutParams layoutParams;
        boolean z = oVar.m;
        int i3 = oVar.a;
        if (z || this.S) {
            return;
        }
        Context context = this.l;
        if (i3 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.m.getCallback();
        if (callback != null && !callback.onMenuOpened(i3, oVar.h)) {
            O(oVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !b0(oVar, keyEvent)) {
            return;
        }
        n nVar = oVar.e;
        if (nVar == null || oVar.n) {
            if (nVar == null) {
                V();
                eu euVar = this.p;
                Context e2 = euVar != null ? euVar.e() : null;
                if (e2 != null) {
                    context = e2;
                }
                TypedValue typedValue = new TypedValue();
                Resources.Theme newTheme = context.getResources().newTheme();
                newTheme.setTo(context.getTheme());
                newTheme.resolveAttribute(com.vkontakte.android.R.attr.actionBarPopupTheme, typedValue, true);
                int i4 = typedValue.resourceId;
                if (i4 != 0) {
                    newTheme.applyStyle(i4, true);
                }
                newTheme.resolveAttribute(com.vkontakte.android.R.attr.panelMenuListTheme, typedValue, true);
                int i5 = typedValue.resourceId;
                if (i5 != 0) {
                    newTheme.applyStyle(i5, true);
                } else {
                    newTheme.applyStyle(com.vkontakte.android.R.style.Theme_AppCompat_CompactMenu, true);
                }
                lpj lpjVar = new lpj(context, 0);
                lpjVar.getTheme().setTo(newTheme);
                oVar.j = lpjVar;
                TypedArray obtainStyledAttributes = lpjVar.obtainStyledAttributes(R$styleable.j);
                oVar.b = obtainStyledAttributes.getResourceId(86, 0);
                oVar.d = obtainStyledAttributes.getResourceId(1, 0);
                obtainStyledAttributes.recycle();
                oVar.e = new n(oVar.j);
                oVar.c = 81;
            } else if (oVar.n && nVar.getChildCount() > 0) {
                oVar.e.removeAllViews();
            }
            View view = oVar.g;
            if (view == null) {
                if (oVar.h != null) {
                    if (this.u == null) {
                        this.u = new p();
                    }
                    p pVar = this.u;
                    if (oVar.i == null) {
                        androidx.appcompat.view.menu.d dVar = new androidx.appcompat.view.menu.d(oVar.j);
                        oVar.i = dVar;
                        dVar.i(pVar);
                        androidx.appcompat.view.menu.f fVar = oVar.h;
                        fVar.b(oVar.i, fVar.a);
                    }
                    View view2 = (View) oVar.i.l(oVar.e);
                    oVar.f = view2;
                }
                oVar.n = true;
                return;
            }
            oVar.f = view;
            if (oVar.f != null && (oVar.g != null || ((d.a) oVar.i.k()).getCount() > 0)) {
                ViewGroup.LayoutParams layoutParams2 = oVar.f.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                oVar.e.setBackgroundResource(oVar.b);
                ViewParent parent = oVar.f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(oVar.f);
                }
                oVar.e.addView(oVar.f, layoutParams2);
                if (!oVar.f.hasFocus()) {
                    oVar.f.requestFocus();
                }
            }
            oVar.n = true;
            return;
        }
        View view3 = oVar.g;
        if (view3 != null && (layoutParams = view3.getLayoutParams()) != null && layoutParams.width == -1) {
            i2 = -1;
            oVar.l = false;
            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i2, -2, 0, 0, 1002, 8519680, -3);
            layoutParams3.gravity = oVar.c;
            layoutParams3.windowAnimations = oVar.d;
            windowManager.addView(oVar.e, layoutParams3);
            oVar.m = true;
            if (i3 != 0) {
                d0();
                return;
            }
            return;
        }
        i2 = -2;
        oVar.l = false;
        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i2, -2, 0, 0, 1002, 8519680, -3);
        layoutParams32.gravity = oVar.c;
        layoutParams32.windowAnimations = oVar.d;
        windowManager.addView(oVar.e, layoutParams32);
        oVar.m = true;
        if (i3 != 0) {
        }
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final void a(@NonNull androidx.appcompat.view.menu.f fVar) {
        s8l s8lVar = this.s;
        if (s8lVar == null || !s8lVar.d() || (ViewConfiguration.get(this.l).hasPermanentMenuKey() && !this.s.c())) {
            o U = U(0);
            U.n = true;
            O(U, false);
            Z(U, null);
            return;
        }
        Window.Callback callback = this.m.getCallback();
        if (this.s.f()) {
            this.s.a();
            if (this.S) {
                return;
            }
            callback.onPanelClosed(108, U(0).h);
            return;
        }
        if (callback == null || this.S) {
            return;
        }
        if (this.a0 && (1 & this.b0) != 0) {
            View decorView = this.m.getDecorView();
            a aVar = this.c0;
            decorView.removeCallbacks(aVar);
            aVar.run();
        }
        o U2 = U(0);
        androidx.appcompat.view.menu.f fVar2 = U2.h;
        if (fVar2 == null || U2.o || !callback.onPreparePanel(0, U2.g, fVar2)) {
            return;
        }
        callback.onMenuOpened(108, U2.h);
        this.s.e();
    }

    public final boolean a0(o oVar, int i2, KeyEvent keyEvent) {
        androidx.appcompat.view.menu.f fVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((oVar.k || b0(oVar, keyEvent)) && (fVar = oVar.h) != null) {
            return fVar.performShortcut(i2, keyEvent, 1);
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final boolean b(@NonNull androidx.appcompat.view.menu.f fVar, @NonNull MenuItem menuItem) {
        o oVar;
        Window.Callback callback = this.m.getCallback();
        if (callback != null && !this.S) {
            androidx.appcompat.view.menu.f k2 = fVar.k();
            o[] oVarArr = this.N;
            int length = oVarArr != null ? oVarArr.length : 0;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    oVar = oVarArr[i2];
                    if (oVar != null && oVar.h == k2) {
                        break;
                    }
                    i2++;
                } else {
                    oVar = null;
                    break;
                }
            }
            if (oVar != null) {
                return callback.onMenuItemSelected(oVar.a, menuItem);
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00cd, code lost:
    
        if (r13.h == null) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b0(o oVar, KeyEvent keyEvent) {
        s8l s8lVar;
        s8l s8lVar2;
        Resources.Theme theme;
        s8l s8lVar3;
        s8l s8lVar4;
        if (!this.S) {
            boolean z = oVar.k;
            int i2 = oVar.a;
            if (z) {
                return true;
            }
            o oVar2 = this.O;
            if (oVar2 != null && oVar2 != oVar) {
                O(oVar2, false);
            }
            Window.Callback callback = this.m.getCallback();
            if (callback != null) {
                oVar.g = callback.onCreatePanelView(i2);
            }
            boolean z2 = i2 == 0 || i2 == 108;
            if (z2 && (s8lVar4 = this.s) != null) {
                s8lVar4.g();
            }
            if (oVar.g == null && (!z2 || !(this.p instanceof x2p0))) {
                androidx.appcompat.view.menu.f fVar = oVar.h;
                if (fVar == null || oVar.o) {
                    if (fVar == null) {
                        Context context = this.l;
                        if ((i2 == 0 || i2 == 108) && this.s != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme2 = context.getTheme();
                            theme2.resolveAttribute(com.vkontakte.android.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                                theme.applyStyle(typedValue.resourceId, true);
                                theme.resolveAttribute(com.vkontakte.android.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme2.resolveAttribute(com.vkontakte.android.R.attr.actionBarWidgetTheme, typedValue, true);
                                theme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (theme == null) {
                                    theme = context.getResources().newTheme();
                                    theme.setTo(theme2);
                                }
                                theme.applyStyle(typedValue.resourceId, true);
                            }
                            if (theme != null) {
                                lpj lpjVar = new lpj(context, 0);
                                lpjVar.getTheme().setTo(theme);
                                context = lpjVar;
                            }
                        }
                        androidx.appcompat.view.menu.f fVar2 = new androidx.appcompat.view.menu.f(context);
                        fVar2.e = this;
                        androidx.appcompat.view.menu.f fVar3 = oVar.h;
                        if (fVar2 != fVar3) {
                            if (fVar3 != null) {
                                fVar3.r(oVar.i);
                            }
                            oVar.h = fVar2;
                            androidx.appcompat.view.menu.d dVar = oVar.i;
                            if (dVar != null) {
                                fVar2.b(dVar, fVar2.a);
                            }
                        }
                    }
                    if (z2 && (s8lVar2 = this.s) != null) {
                        if (this.t == null) {
                            this.t = new d();
                        }
                        s8lVar2.b(oVar.h, this.t);
                    }
                    oVar.h.w();
                    if (callback.onCreatePanelMenu(i2, oVar.h)) {
                        oVar.o = false;
                    } else {
                        androidx.appcompat.view.menu.f fVar4 = oVar.h;
                        if (fVar4 != null) {
                            if (fVar4 != null) {
                                fVar4.r(oVar.i);
                            }
                            oVar.h = null;
                        }
                        if (z2 && (s8lVar = this.s) != null) {
                            s8lVar.b(null, this.t);
                        }
                    }
                }
                oVar.h.w();
                Bundle bundle = oVar.p;
                if (bundle != null) {
                    oVar.h.s(bundle);
                    oVar.p = null;
                }
                if (!callback.onPreparePanel(0, oVar.g, oVar.h)) {
                    if (z2 && (s8lVar3 = this.s) != null) {
                        s8lVar3.b(null, this.t);
                    }
                    oVar.h.v();
                    return false;
                }
                oVar.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                oVar.h.v();
            }
            oVar.k = true;
            oVar.l = false;
            this.O = oVar;
            return true;
        }
        return false;
    }

    @Override // xsna.l23
    public final void c(View view, ViewGroup.LayoutParams layoutParams) {
        S();
        ((ViewGroup) this.C.findViewById(R.id.content)).addView(view, layoutParams);
        this.n.a(this.m.getCallback());
    }

    public final void c0() {
        if (this.B) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    @Override // xsna.l23
    public final void d() {
        mwz mwzVar;
        Context context = this.l;
        if (l23.q(context) && (mwzVar = l23.d) != null && !mwzVar.equals(l23.e)) {
            l23.b.execute(new wc2(context, 1));
        }
        J(true, true);
    }

    public final void d0() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.h0 != null && (U(0).m || this.v != null)) {
                z = true;
            }
            if (z && this.i0 == null) {
                this.i0 = i.b(this.h0, this);
            } else {
                if (z || (onBackInvokedCallback = this.i0) == null) {
                    return;
                }
                i.c(this.h0, onBackInvokedCallback);
                this.i0 = null;
            }
        }
    }

    @Override // xsna.l23
    public final boolean e() {
        return J(true, true);
    }

    @Override // xsna.l23
    @NonNull
    public final Context f(@NonNull Context context) {
        this.Q = true;
        int i2 = this.U;
        if (i2 == -100) {
            i2 = l23.c;
        }
        int X = X(i2, context);
        if (l23.q(context)) {
            l23.I(context);
        }
        mwz L = L(context);
        Configuration configuration = null;
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(P(context, X, L, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof lpj) {
            try {
                ((lpj) context).applyOverrideConfiguration(P(context, X, L, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!l0) {
            return context;
        }
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (!configuration3.equals(configuration4)) {
            configuration = new Configuration();
            configuration.fontScale = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (configuration3.diff(configuration4) != 0) {
                float f2 = configuration3.fontScale;
                float f3 = configuration4.fontScale;
                if (f2 != f3) {
                    configuration.fontScale = f3;
                }
                int i3 = configuration3.mcc;
                int i4 = configuration4.mcc;
                if (i3 != i4) {
                    configuration.mcc = i4;
                }
                int i5 = configuration3.mnc;
                int i6 = configuration4.mnc;
                if (i5 != i6) {
                    configuration.mnc = i6;
                }
                g.a(configuration3, configuration4, configuration);
                int i7 = configuration3.touchscreen;
                int i8 = configuration4.touchscreen;
                if (i7 != i8) {
                    configuration.touchscreen = i8;
                }
                int i9 = configuration3.keyboard;
                int i10 = configuration4.keyboard;
                if (i9 != i10) {
                    configuration.keyboard = i10;
                }
                int i11 = configuration3.keyboardHidden;
                int i12 = configuration4.keyboardHidden;
                if (i11 != i12) {
                    configuration.keyboardHidden = i12;
                }
                int i13 = configuration3.navigation;
                int i14 = configuration4.navigation;
                if (i13 != i14) {
                    configuration.navigation = i14;
                }
                int i15 = configuration3.navigationHidden;
                int i16 = configuration4.navigationHidden;
                if (i15 != i16) {
                    configuration.navigationHidden = i16;
                }
                int i17 = configuration3.orientation;
                int i18 = configuration4.orientation;
                if (i17 != i18) {
                    configuration.orientation = i18;
                }
                int i19 = configuration3.screenLayout & 15;
                int i20 = configuration4.screenLayout & 15;
                if (i19 != i20) {
                    configuration.screenLayout |= i20;
                }
                int i21 = configuration3.screenLayout & PsExtractor.AUDIO_STREAM;
                int i22 = configuration4.screenLayout & PsExtractor.AUDIO_STREAM;
                if (i21 != i22) {
                    configuration.screenLayout |= i22;
                }
                int i23 = configuration3.screenLayout & 48;
                int i24 = configuration4.screenLayout & 48;
                if (i23 != i24) {
                    configuration.screenLayout |= i24;
                }
                int i25 = configuration3.screenLayout & Tensorflow.FRAME_HEIGHT;
                int i26 = configuration4.screenLayout & Tensorflow.FRAME_HEIGHT;
                if (i25 != i26) {
                    configuration.screenLayout |= i26;
                }
                h.a(configuration3, configuration4, configuration);
                int i27 = configuration3.uiMode & 15;
                int i28 = configuration4.uiMode & 15;
                if (i27 != i28) {
                    configuration.uiMode |= i28;
                }
                int i29 = configuration3.uiMode & 48;
                int i30 = configuration4.uiMode & 48;
                if (i29 != i30) {
                    configuration.uiMode |= i30;
                }
                int i31 = configuration3.screenWidthDp;
                int i32 = configuration4.screenWidthDp;
                if (i31 != i32) {
                    configuration.screenWidthDp = i32;
                }
                int i33 = configuration3.screenHeightDp;
                int i34 = configuration4.screenHeightDp;
                if (i33 != i34) {
                    configuration.screenHeightDp = i34;
                }
                int i35 = configuration3.smallestScreenWidthDp;
                int i36 = configuration4.smallestScreenWidthDp;
                if (i35 != i36) {
                    configuration.smallestScreenWidthDp = i36;
                }
                int i37 = configuration3.densityDpi;
                int i38 = configuration4.densityDpi;
                if (i37 != i38) {
                    configuration.densityDpi = i38;
                }
            }
        }
        Configuration P = P(context, X, L, configuration, true);
        lpj lpjVar = new lpj(context, com.vkontakte.android.R.style.Theme_AppCompat_Empty);
        lpjVar.applyOverrideConfiguration(P);
        try {
            if (context.getTheme() != null) {
                dbg0.d.a(lpjVar.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return lpjVar;
    }

    @Override // xsna.l23
    public final View g(@NonNull Context context, View view, String str, @NonNull AttributeSet attributeSet) {
        if (this.g0 == null) {
            int[] iArr = R$styleable.j;
            Context context2 = this.l;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = obtainStyledAttributes.getString(116);
            obtainStyledAttributes.recycle();
            if (string == null) {
                this.g0 = new u33();
            } else {
                try {
                    this.g0 = (u33) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable unused) {
                    this.g0 = new u33();
                }
            }
        }
        u33 u33Var = this.g0;
        int i2 = hlr0.b;
        return u33Var.f(context, view, str, attributeSet);
    }

    @Override // xsna.l23
    @Nullable
    public final <T extends View> T h(int i2) {
        S();
        return (T) this.m.findViewById(i2);
    }

    @Override // xsna.l23
    public final Context i() {
        return this.l;
    }

    @Override // xsna.l23
    public final b j() {
        return new b();
    }

    @Override // xsna.l23
    public final int k() {
        return this.U;
    }

    @Override // xsna.l23
    public final MenuInflater m() {
        if (this.q == null) {
            V();
            eu euVar = this.p;
            this.q = new lin0(euVar != null ? euVar.e() : this.l);
        }
        return this.q;
    }

    @Override // xsna.l23
    public final eu n() {
        V();
        return this.p;
    }

    @Override // xsna.l23
    public final void o() {
        LayoutInflater from = LayoutInflater.from(this.l);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            from.getFactory2();
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return g(context, null, str, attributeSet);
    }

    @Override // xsna.l23
    public final void p() {
        if (this.p != null) {
            V();
            if (this.p.f()) {
                return;
            }
            W(0);
        }
    }

    @Override // xsna.l23
    public final void r(Configuration configuration) {
        if (this.H && this.B) {
            V();
            eu euVar = this.p;
            if (euVar != null) {
                euVar.g();
            }
        }
        d33 a2 = d33.a();
        Context context = this.l;
        synchronized (a2) {
            xag0 xag0Var = a2.a;
            synchronized (xag0Var) {
                x500<WeakReference<Drawable.ConstantState>> x500Var = xag0Var.b.get(context);
                if (x500Var != null) {
                    x500Var.clear();
                }
            }
        }
        this.T = new Configuration(this.l.getResources().getConfiguration());
        J(false, false);
    }

    @Override // xsna.l23
    public final void s() {
        String str;
        this.Q = true;
        J(false, true);
        T();
        Object obj = this.k;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = jw50.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e2) {
                    throw new IllegalArgumentException(e2);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                eu euVar = this.p;
                if (euVar == null) {
                    this.d0 = true;
                } else {
                    euVar.m(true);
                }
            }
            synchronized (l23.i) {
                l23.y(this);
                l23.h.add(new WeakReference<>(this));
            }
        }
        this.T = new Configuration(this.l.getResources().getConfiguration());
        this.R = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // xsna.l23
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t() {
        eu euVar;
        m mVar;
        k kVar;
        if (this.k instanceof Activity) {
            synchronized (l23.i) {
                l23.y(this);
            }
        }
        if (this.a0) {
            this.m.getDecorView().removeCallbacks(this.c0);
        }
        this.S = true;
        if (this.U != -100) {
            Object obj = this.k;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                j0.put(this.k.getClass().getName(), Integer.valueOf(this.U));
                euVar = this.p;
                if (euVar != null) {
                    euVar.h();
                }
                mVar = this.Y;
                if (mVar != null) {
                    mVar.a();
                }
                kVar = this.Z;
                if (kVar == null) {
                    kVar.a();
                    return;
                }
                return;
            }
        }
        j0.remove(this.k.getClass().getName());
        euVar = this.p;
        if (euVar != null) {
        }
        mVar = this.Y;
        if (mVar != null) {
        }
        kVar = this.Z;
        if (kVar == null) {
        }
    }

    @Override // xsna.l23
    public final void u() {
        S();
    }

    @Override // xsna.l23
    public final void v() {
        V();
        eu euVar = this.p;
        if (euVar != null) {
            euVar.s(true);
        }
    }

    @Override // xsna.l23
    public final void w() {
        J(true, false);
    }

    @Override // xsna.l23
    public final void x() {
        V();
        eu euVar = this.p;
        if (euVar != null) {
            euVar.s(false);
        }
    }

    @Override // xsna.l23
    public final boolean z(int i2) {
        if (i2 == 8) {
            i2 = 108;
        } else if (i2 == 9) {
            i2 = 109;
        }
        if (this.L && i2 == 108) {
            return false;
        }
        if (this.H && i2 == 1) {
            this.H = false;
        }
        if (i2 == 1) {
            c0();
            this.L = true;
            return true;
        }
        if (i2 == 2) {
            c0();
            this.F = true;
            return true;
        }
        if (i2 == 5) {
            c0();
            this.G = true;
            return true;
        }
        if (i2 == 10) {
            c0();
            this.J = true;
            return true;
        }
        if (i2 == 108) {
            c0();
            this.H = true;
            return true;
        }
        if (i2 != 109) {
            return this.m.requestFeature(i2);
        }
        c0();
        this.I = true;
        return true;
    }

    /* compiled from: AppCompatDelegateImpl.java */
    public class j extends WindowCallbackWrapper {
        public c b;
        public boolean c;
        public boolean d;
        public boolean e;

        public j(Window.Callback callback) {
            super(callback);
        }

        public final void a(Window.Callback callback) {
            try {
                this.c = true;
                callback.onContentChanged();
            } finally {
                this.c = false;
            }
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.d ? getWrapped().dispatchKeyEvent(keyEvent) : o23.this.Q(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            if (!super.dispatchKeyShortcutEvent(keyEvent)) {
                int keyCode = keyEvent.getKeyCode();
                o23 o23Var = o23.this;
                o23Var.V();
                eu euVar = o23Var.p;
                if (euVar == null || !euVar.i(keyCode, keyEvent)) {
                    o oVar = o23Var.O;
                    if (oVar == null || !o23Var.a0(oVar, keyEvent.getKeyCode(), keyEvent)) {
                        if (o23Var.O == null) {
                            o U = o23Var.U(0);
                            o23Var.b0(U, keyEvent);
                            boolean a0 = o23Var.a0(U, keyEvent.getKeyCode(), keyEvent);
                            U.k = false;
                            if (a0) {
                            }
                        }
                        return false;
                    }
                    o oVar2 = o23Var.O;
                    if (oVar2 != null) {
                        oVar2.l = true;
                        return true;
                    }
                }
            }
            return true;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final void onContentChanged() {
            if (this.c) {
                getWrapped().onContentChanged();
            }
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof androidx.appcompat.view.menu.f)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final View onCreatePanelView(int i) {
            View a;
            c cVar = this.b;
            return (cVar == null || (a = ((x2p0.e) cVar).a(i)) == null) ? super.onCreatePanelView(i) : a;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            o23 o23Var = o23.this;
            if (i == 108) {
                o23Var.V();
                eu euVar = o23Var.p;
                if (euVar != null) {
                    euVar.c(true);
                }
            } else {
                o23Var.getClass();
            }
            return true;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final void onPanelClosed(int i, Menu menu) {
            if (this.e) {
                getWrapped().onPanelClosed(i, menu);
                return;
            }
            super.onPanelClosed(i, menu);
            o23 o23Var = o23.this;
            if (i == 108) {
                o23Var.V();
                eu euVar = o23Var.p;
                if (euVar != null) {
                    euVar.c(false);
                    return;
                }
                return;
            }
            if (i == 0) {
                o U = o23Var.U(i);
                if (U.m) {
                    o23Var.O(U, false);
                }
            }
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final boolean onPreparePanel(int i, View view, Menu menu) {
            androidx.appcompat.view.menu.f fVar = menu instanceof androidx.appcompat.view.menu.f ? (androidx.appcompat.view.menu.f) menu : null;
            if (i == 0 && fVar == null) {
                return false;
            }
            if (fVar != null) {
                fVar.x = true;
            }
            c cVar = this.b;
            if (cVar != null) {
                ((x2p0.e) cVar).b(i);
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (fVar != null) {
                fVar.x = false;
            }
            return onPreparePanel;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            androidx.appcompat.view.menu.f fVar = o23.this.U(0).h;
            if (fVar != null) {
                super.onProvideKeyboardShortcuts(list, fVar, i);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i);
            }
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            o23 o23Var = o23.this;
            if (!o23Var.A || i != 0) {
                return super.onWindowStartingActionMode(callback, i);
            }
            gin0.a aVar = new gin0.a(o23Var.l, callback);
            g40 H = o23Var.H(aVar);
            if (H != null) {
                return aVar.e(H);
            }
            return null;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }
    }
}
