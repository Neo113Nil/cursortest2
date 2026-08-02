package xsna;

import android.animation.Animator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.preference.Preference;
import com.vk.core.ui.themes.NavigationBarStyle;
import com.vk.core.ui.themes.ThemeKeyAttributes;
import com.vk.core.ui.themes.VKTheme;
import com.vk.core.ui.themes.a;
import com.vk.log.L;
import com.vk.sunrise.SunState;
import com.vk.toggle.features.CoreFeatures;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TimeZone;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.e3m;
import xsna.lrv0;

/* compiled from: VKThemeHelper.kt */
/* loaded from: classes.dex */
public final class dhr0 implements lrv0 {
    public static final String A;
    public static final dhr0 a;
    public static final /* synthetic */ qcy<Object>[] b = {new PropertyReference1Impl(dhr0.class, "themedContext", "getThemedContext()Landroid/content/Context;", 0), b09.a(0, dhr0.class, "legoContext", "getLegoContext()Landroid/content/Context;", fpf0.a)};
    public static ehr0 c;
    public static final ehr0 d;
    public static final ehr0 e;
    public static final zgr0 f;
    public static final ryt0 g;
    public static final ryt0 h;
    public static final ryt0 i;
    public static cxw j;
    public static final CopyOnWriteArrayList<WeakReference<e>> k;
    public static final CopyOnWriteArrayList<WeakReference<lrv0.a>> l;
    public static final cpn0 m;
    public static final z6n0 n;
    public static final pyo0 o;
    public static final bpn0 p;
    public static final bpn0 q;
    public static final cpn0 r;
    public static final cpn0 s;
    public static final abg0 t;
    public static final abg0 u;
    public static final bpn0 v;
    public static final bpn0 w;
    public static final bpn0 x;
    public static v801 y;
    public static zxc0 z;

    /* compiled from: VKThemeHelper.kt */
    /* loaded from: classes17.dex */
    public static final class a {
        public a() {
            throw null;
        }

        public final void a() {
            throw null;
        }
    }

    /* compiled from: VKThemeHelper.kt */
    /* loaded from: classes17.dex */
    public static final class b extends AppCompatImageView {
        public final ArrayList<a> b;
        public a c;
        public d.a d;
        public final Paint e;
        public boolean f;

        /* compiled from: VKThemeHelper.kt */
        public static abstract class a {

            /* compiled from: VKThemeHelper.kt */
            /* renamed from: xsna.dhr0$b$a$a, reason: collision with other inner class name */
            public static final class C2735a extends a {
                public static final C2735a a = new C2735a();
            }

            /* compiled from: VKThemeHelper.kt */
            /* renamed from: xsna.dhr0$b$a$b, reason: collision with other inner class name */
            public static final class C2736b extends a {
                public final float a;

                public C2736b(float f) {
                    this.a = f;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C2736b) && Float.compare(this.a, ((C2736b) obj).a) == 0;
                }

                public final int hashCode() {
                    return Float.hashCode(this.a);
                }

                public final String toString() {
                    return xq.c(')', this.a, new StringBuilder("Stroke(maxRadius="));
                }
            }
        }

        public b(Activity activity) {
            super(activity);
            setLayerType(2, null);
            this.b = new ArrayList<>();
            this.d = new d.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0);
            Paint paint = new Paint();
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            this.e = paint;
        }

        @Override // android.widget.ImageView, android.view.View
        public final void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            a aVar = this.c;
            boolean z = aVar instanceof a.C2736b;
            Paint paint = this.e;
            if (z) {
                a.C2736b c2736b = (a.C2736b) aVar;
                paint.setStrokeWidth((c2736b.a - this.d.a) * 2);
                d.a aVar2 = this.d;
                canvas.drawCircle(aVar2.b, aVar2.c, c2736b.a, paint);
            } else if (aVar instanceof a.C2735a) {
                canvas.drawCircle(r0.b, r0.c, this.d.a, paint);
            }
            if (this.f) {
                Iterator<a> it = this.b.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw null;
                }
            }
        }
    }

    /* compiled from: VKThemeHelper.kt */
    public interface c {
        int a(int i, Context context);
    }

    /* compiled from: VKThemeHelper.kt */
    public interface e {
        void sb(VKTheme vKTheme);
    }

    /* compiled from: VKThemeHelper.kt */
    public static final class f extends lpj {
        public final Object a;
        public final ThreadLocal<gdr0> b;

        public f(Context context, int i) {
            super(context, i);
            this.a = new Object();
            this.b = new ThreadLocal<>();
        }

        @Override // xsna.lpj, android.content.ContextWrapper, android.content.Context
        public final Object getSystemService(String str) {
            gdr0 gdr0Var;
            if (!"layout_inflater".equals(str)) {
                return super.getSystemService(str);
            }
            gdr0 gdr0Var2 = this.b.get();
            if (gdr0Var2 != null) {
                return gdr0Var2;
            }
            synchronized (this.a) {
                gdr0Var = this.b.get();
                if (gdr0Var == null) {
                    gdr0Var = new gdr0(LayoutInflater.from(getBaseContext()), this);
                    gdr0Var.setFactory2(new vhr0(gdr0Var, null));
                    this.b.set(gdr0Var);
                }
            }
            return gdr0Var;
        }
    }

    /* compiled from: VKThemeHelper.kt */
    public static final /* synthetic */ class g {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NavigationBarStyle.values().length];
            try {
                iArr[NavigationBarStyle.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NavigationBarStyle.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NavigationBarStyle.DYNAMIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        dhr0 dhr0Var = new dhr0();
        a = dhr0Var;
        c = new ehr0(new VKTheme(true, R.style.VkMilkLightStyle, "bright_light"), new VKTheme(false, R.style.VkMilkDarkStyle, "space_gray"));
        d = new ehr0(new VKTheme(true, R.style.VkMilkLightStyle_Force, "bright_light"), new VKTheme(false, R.style.VkMilkDarkStyle_Force, "space_gray"));
        e = new ehr0(new VKTheme(true, R.style.VkLegoLightStyle, "bright_light"), new VKTheme(false, R.style.VkLegoDarkStyle, "space_gray"));
        f = new zgr0();
        g = new ryt0();
        h = new ryt0();
        i = new ryt0();
        k = new CopyOnWriteArrayList<>();
        l = new CopyOnWriteArrayList<>();
        int i2 = 10;
        m = new cpn0(new x0f(i2));
        z6n0 z6n0Var = new z6n0();
        z6n0Var.a = SunState.UNKNOWN;
        n = z6n0Var;
        o = new pyo0((nyo0) oyo0.a.getValue());
        p = new bpn0(new y0f(9));
        int i3 = 11;
        q = new bpn0(new cu2(i3));
        r = new cpn0(new u94(i3));
        s = new cpn0(new v94(14));
        t = new abg0(new w94(17), new ps0(i2));
        int i4 = 12;
        u = new abg0(new u35(13), new w0f(i4));
        v = new bpn0(new via(i4));
        w = new bpn0(new wa3(15));
        x = new bpn0(new xa3(i2));
        A = "VKThemeHelper";
        TypedValue typedValue = krv0.a;
        krv0.b = dhr0Var;
    }

    public static final int A(String str, AttributeSet attributeSet) {
        a.getClass();
        return p("http://schemas.android.com/apk/res-auto", str, attributeSet);
    }

    public static final int B(String str, AttributeSet attributeSet) {
        int A2 = A(str, attributeSet);
        a.getClass();
        if (J(A2)) {
            return A2;
        }
        return 0;
    }

    public static final VKTheme C() {
        a.getClass();
        String s2 = Preference.s("vk_theme_helper", "current_theme_name", ((VKTheme) m.a()).d);
        s2.equals(u().d);
        return s2.equals(u().d) ? c.b : c.a;
    }

    public static com.vk.core.ui.themes.a D() {
        return (com.vk.core.ui.themes.a) x.getValue();
    }

    public static Context E() {
        qcy<Object> qcyVar = b[0];
        return (Context) r.a();
    }

    public static int[] G() {
        abg0 abg0Var = t;
        int c2 = abg0Var.c(R.attr.vk_ui_icon_accent);
        int i2 = n8g.i(abg0Var.c(R.attr.vk_ui_icon_contrast_secondary), abg0Var.c(R.attr.vk_ui_background_content));
        return new int[]{n8g.i(l8g.f(0.64f, i2), abg0Var.c(R.attr.vk_ui_background_content)), n8g.i(l8g.f(0.64f, c2), abg0Var.c(R.attr.vk_ui_background_content)), i2, c2};
    }

    public static int[] H() {
        abg0 abg0Var = t;
        int i2 = n8g.i(abg0Var.c(R.attr.vk_ui_icon_tertiary_alpha), abg0Var.c(R.attr.vk_ui_background_content));
        int f2 = l8g.f(0.48f, n8g.i(abg0Var.c(R.attr.vk_ui_icon_accent), abg0Var.c(R.attr.vk_ui_background_content)));
        return new int[]{n8g.i(l8g.f(0.64f, i2), abg0Var.c(R.attr.vk_ui_background_content)), n8g.i(l8g.f(0.64f, f2), abg0Var.c(R.attr.vk_ui_background_content)), i2, f2};
    }

    public static am00 I() {
        if (!M()) {
            return null;
        }
        zxc0 zxc0Var = z;
        if (zxc0Var == null) {
            zxc0Var = null;
        }
        Context context = e43.a;
        Context context2 = context != null ? context : null;
        zxc0Var.getClass();
        return new odr0(MapStyleOptions.b(context2));
    }

    public static boolean J(int i2) {
        return apo0.a.contains(Integer.valueOf(i2)) || udw.a.contains(Integer.valueOf(i2));
    }

    public static final boolean K() {
        if (Preference.v("vk_theme_helper", "auto_change_theme")) {
            return true;
        }
        if (Preference.v("vk_theme_helper", "current_theme_name") || Preference.v("vk_theme_helper", "timetable_change_theme") || P()) {
            return false;
        }
        a.getClass();
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        return anj.a(context, "android.permission.ACCESS_COARSE_LOCATION") == 0;
    }

    public static final boolean L() {
        VKTheme C = C();
        a.getClass();
        return C.equals(z());
    }

    public static final boolean M() {
        return !C().b;
    }

    public static final boolean N() {
        return (Q() || K() || R() || C().b) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0050 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean P() {
        String str;
        int parseInt;
        if (Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        bpn0 bpn0Var = t5m.a;
        if ("Xiaomi".equalsIgnoreCase(Build.MANUFACTURER)) {
            try {
                str = (String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class, String.class).invoke(null, "ro.miui.ui.version.name", "");
            } catch (Throwable unused) {
            }
            if (!TextUtils.isEmpty(str) && str.length() > 1) {
                parseInt = Integer.parseInt(str.substring(1));
                return parseInt < 10;
            }
        }
        parseInt = -1;
        if (parseInt < 10) {
        }
    }

    public static final boolean Q() {
        return (!P() || K() || R() || Preference.v("vk_theme_helper", "current_theme_name")) ? false : true;
    }

    public static final boolean R() {
        return Preference.v("vk_theme_helper", "timetable_change_theme");
    }

    public static void S(CompoundButton compoundButton) {
        abg0 abg0Var = t;
        wvi.a(compoundButton, new ColorStateList(q(), new int[]{l8g.f(0.64f, abg0Var.c(R.attr.vk_ui_icon_tertiary)), l8g.f(0.64f, abg0Var.c(R.attr.vk_ui_icon_tertiary)), abg0Var.c(R.attr.vk_ui_icon_tertiary), abg0Var.c(R.attr.vk_ui_icon_accent)}));
    }

    public static void T(tm10 tm10Var) {
        int[][] q2 = q();
        abg0 abg0Var = t;
        int c2 = abg0Var.c(R.attr.vk_ui_icon_contrast);
        int c3 = abg0Var.c(R.attr.vk_ui_icon_medium);
        tm10Var.setThumbTintList(new ColorStateList(q2, new int[]{n8g.i(l8g.f(0.64f, c3), abg0Var.c(R.attr.vk_ui_background_content)), n8g.i(l8g.f(0.64f, c2), abg0Var.c(R.attr.vk_ui_background_content)), c3, c2}));
        int[][] q3 = q();
        int c4 = abg0Var.c(R.attr.vk_ui_background_accent);
        int c5 = abg0Var.c(R.attr.vk_ui_background_secondary);
        tm10Var.setTrackTintList(new ColorStateList(q3, new int[]{n8g.i(l8g.f(0.64f, c5), abg0Var.c(R.attr.vk_ui_background_content)), n8g.i(l8g.f(0.64f, c4), abg0Var.c(R.attr.vk_ui_background_content)), c5, c4}));
        int[][] q4 = q();
        int c6 = abg0Var.c(R.attr.vk_ui_transparent);
        int c7 = abg0Var.c(R.attr.vk_ui_field_border_alpha);
        tm10Var.setTrackDecorationTintList(new ColorStateList(q4, new int[]{l8g.f((Color.alpha(c7) / 255.0f) * 0.64f, c7), c6, c7, c6}));
    }

    public static void U(SwitchCompat switchCompat) {
        if (switchCompat instanceof tm10) {
            T((tm10) switchCompat);
        } else {
            switchCompat.getThumbDrawable().setTintList(new ColorStateList(q(), G()));
            switchCompat.getTrackDrawable().setTintList(new ColorStateList(q(), H()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void W(View view) {
        char c2;
        ThemeKeyAttributes themeKeyAttributes;
        baf0 baf0Var;
        baf0 baf0Var2;
        Context context = view.getContext();
        dhr0 dhr0Var = a;
        dhr0Var.getClass();
        if (context instanceof lpj) {
            int a2 = npj.a((ContextWrapper) context);
            ehr0 ehr0Var = e;
            if (a2 == ehr0Var.a.c || a2 == ehr0Var.b.c) {
                dhr0Var.g((lpj) context);
            } else {
                eqy<bek0> eqyVar = com.vk.toggle.d.a;
                CoreFeatures coreFeatures = CoreFeatures.COMPOSE_VIEW_NESTED_THEME;
                coreFeatures.getClass();
                if (com.vk.toggle.b.A.a(coreFeatures)) {
                    lpj lpjVar = (lpj) context;
                    int themeResId = lpjVar.getThemeResId();
                    lpjVar.getTheme().setTo(lpjVar.getBaseContext().getTheme());
                    lpjVar.setTheme(themeResId);
                } else if (a2 == 0) {
                    l((lpj) context);
                }
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                W(viewGroup.getChildAt(i2));
            }
        }
        com.vk.core.ui.themes.a D = D();
        Context E = E();
        D.getClass();
        PorterDuff.Mode[] modeArr = com.vk.core.ui.themes.a.b;
        if (!(view instanceof vqo) && !(view.getContext() instanceof l7s)) {
            if (view instanceof too0) {
                ((too0) view).Ng();
            }
            com.vk.core.ui.themes.a.e(view);
            if (view.getTag(R.id.theme_tag_key) != null) {
                SparseIntArray sparseIntArray = (SparseIntArray) view.getTag(R.id.theme_tag_key);
                if (com.vk.toggle.d.S()) {
                    E = view.getContext();
                }
                int size = sparseIntArray.size();
                for (int i3 = 0; i3 < size; i3++) {
                    int keyAt = sparseIntArray.keyAt(i3);
                    int valueAt = sparseIntArray.valueAt(i3);
                    int f2 = com.vk.toggle.d.S() ? e3m.f(valueAt, E) : t.c(valueAt);
                    ThemeKeyAttributes.Companion.getClass();
                    ThemeKeyAttributes[] values = ThemeKeyAttributes.values();
                    int length = values.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 < length) {
                            themeKeyAttributes = values[i4];
                            c2 = 0;
                            if (themeKeyAttributes.h() != keyAt) {
                                i4++;
                            }
                        } else {
                            c2 = 0;
                            themeKeyAttributes = null;
                        }
                    }
                    switch (themeKeyAttributes == null ? -1 : a.C0793a.$EnumSwitchMapping$0[themeKeyAttributes.ordinal()]) {
                        case -1:
                        case 10:
                            break;
                        case 0:
                        default:
                            throw new NoWhenBranchMatchedException();
                        case 1:
                            TextView textView = view instanceof TextView ? (TextView) view : null;
                            if (textView != null) {
                                textView.setTextColor(f2);
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            TextView textView2 = view instanceof TextView ? (TextView) view : null;
                            if (textView2 != null) {
                                textView2.setHintTextColor(f2);
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            TextView textView3 = view instanceof TextView ? (TextView) view : null;
                            if (textView3 != null) {
                                textView3.setTextColor(anj.b(valueAt, E));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            Toolbar toolbar = view instanceof Toolbar ? (Toolbar) view : null;
                            if (toolbar != null) {
                                toolbar.setTitleTextColor(f2);
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            view.setBackgroundColor(f2);
                            if (view instanceof Toolbar) {
                                com.vk.core.ui.themes.a.d((Toolbar) view, valueAt);
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            view.setBackgroundTintList(ColorStateList.valueOf(f2));
                            break;
                        case 7:
                            try {
                                view.setBackground(m33.a(valueAt, E));
                                break;
                            } catch (Resources.NotFoundException unused) {
                                break;
                            }
                        case 8:
                            ImageView imageView = view instanceof ImageView ? (ImageView) view : null;
                            if (imageView != null) {
                                Drawable drawable = imageView.getDrawable();
                                if (drawable instanceof baf0) {
                                    ((baf0) drawable).a(f2);
                                    baf0Var = (baf0) drawable;
                                } else {
                                    baf0Var = new baf0(drawable, f2);
                                }
                                imageView.setImageDrawable(baf0Var);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            Drawable background = view.getBackground();
                            if (background instanceof baf0) {
                                ((baf0) background).a(f2);
                                baf0Var2 = (baf0) background;
                            } else {
                                baf0Var2 = new baf0(background, f2);
                            }
                            view.setBackground(baf0Var2);
                            break;
                        case 11:
                            ImageView imageView2 = (ImageView) view;
                            int i5 = ((SparseIntArray) view.getTag(R.id.theme_tag_key)).get(ThemeKeyAttributes.IMAGE_COLOR_FILTER_MODE.h());
                            PorterDuff.Mode mode = (i5 < 0 || i5 >= modeArr.length) ? modeArr[c2] : modeArr[i5];
                            imageView2.clearColorFilter();
                            imageView2.setColorFilter(f2, mode);
                            break;
                        case 12:
                            ImageView imageView3 = view instanceof ImageView ? (ImageView) view : null;
                            if (imageView3 != null) {
                                imageView3.clearColorFilter();
                            }
                            if (imageView3 != null) {
                                imageView3.setColorFilter(f2, PorterDuff.Mode.SRC_IN);
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            CollapsingToolbarLayout collapsingToolbarLayout = view instanceof CollapsingToolbarLayout ? (CollapsingToolbarLayout) view : null;
                            if (collapsingToolbarLayout != null) {
                                collapsingToolbarLayout.setContentScrimColor(f2);
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            TextView textView4 = view instanceof TextView ? (TextView) view : null;
                            if (textView4 != null) {
                                textView4.setCompoundDrawableTintList(ColorStateList.valueOf(f2));
                                break;
                            } else {
                                break;
                            }
                    }
                }
            }
        }
        i.getClass();
    }

    public static void X(e eVar) {
        WeakReference<e> weakReference;
        CopyOnWriteArrayList<WeakReference<e>> copyOnWriteArrayList = k;
        Iterator<WeakReference<e>> it = copyOnWriteArrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                weakReference = null;
                break;
            } else {
                weakReference = it.next();
                if (eVar.equals(weakReference.get())) {
                    break;
                }
            }
        }
        WeakReference<e> weakReference2 = weakReference;
        if (weakReference2 != null) {
            copyOnWriteArrayList.remove(weakReference2);
        }
    }

    public static final int Y(int i2, Context context) {
        return context instanceof l7s ? e3m.f(i2, context) : t.c(i2);
    }

    public static final int a0(int i2) {
        return e3m.d(i2, t.b.invoke());
    }

    public static final int b0(int i2) {
        return e3m.g(i2, t.b.invoke());
    }

    public static final int c0(int i2, int i3, boolean z2) {
        a.getClass();
        int i4 = (gz80.a(23) && C().b && z2) ? i2 | 8192 : i2 & (-8193);
        return gz80.a(26) ? l8g.d(i3) ? i4 | 16 : i4 & (-17) : i4;
    }

    public static void d0(VKTheme vKTheme, Activity activity, float[] fArr) {
        boolean equals = vKTheme.equals(C());
        Preference.C("vk_theme_helper", "auto_change_theme");
        Preference.C("vk_theme_helper", "timetable_change_theme");
        dhr0 dhr0Var = a;
        dhr0Var.getClass();
        Preference.H("vk_theme_helper", "current_theme_name", vKTheme.d);
        m.b();
        if (equals) {
            return;
        }
        p0(dhr0Var, activity, vKTheme, fArr, 8);
    }

    public static final void f(e eVar) {
        k.add(new WeakReference<>(eVar));
    }

    public static final void f0(int i2, int i3, View view) {
        a.getClass();
        Drawable a2 = m33.a(i2, E());
        if (com.vk.toggle.d.S()) {
            view.setBackground(new baf0(a2, e3m.f(i3, view.getContext())));
        } else {
            view.setBackground(new baf0(a2, u.c(i3)));
        }
        D().getClass();
        com.vk.core.ui.themes.a.a(view, i3, ThemeKeyAttributes.BACKGROUND_DRAWABLE);
    }

    public static final void g0(View view, Drawable drawable, int i2) {
        if (com.vk.toggle.d.S()) {
            view.setBackground(new baf0(drawable, e3m.f(i2, view.getContext())));
        } else {
            view.setBackground(new baf0(drawable, u.c(i2)));
        }
        a.getClass();
        D().getClass();
        com.vk.core.ui.themes.a.a(view, i2, ThemeKeyAttributes.BACKGROUND_DRAWABLE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void h(List list) {
        List<Fragment> list2;
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment instanceof too0) {
                ((too0) fragment).Ng();
                try {
                    list2 = fragment.getChildFragmentManager().c.f();
                } catch (IllegalStateException unused) {
                    list2 = EmptyList.b;
                }
                a.getClass();
                h(list2);
            }
        }
    }

    public static final void h0(int i2, View view) {
        boolean S = com.vk.toggle.d.S();
        dhr0 dhr0Var = a;
        if (S) {
            view.setBackground(m33.a(i2, view.getContext()));
        } else {
            dhr0Var.getClass();
            view.setBackground(m33.a(i2, E()));
        }
        dhr0Var.getClass();
        D().getClass();
        com.vk.core.ui.themes.a.a(view, i2, ThemeKeyAttributes.BACKGROUND_RES);
    }

    public static void j(dhr0 dhr0Var, FragmentActivity fragmentActivity) {
        dhr0Var.getClass();
        itg0.a(fragmentActivity, new io.reactivex.rxjava3.internal.operators.single.r(new io.reactivex.rxjava3.internal.operators.single.v(new bhr0()).q(asu0.a.c()), new ca4(new iqa(fragmentActivity, 3), 2)).subscribe(new c2w(new hx50(fragmentActivity, 1), 1), new ck40(new gml(2), 2)));
    }

    public static void k0(int i2, Drawable drawable, ImageView imageView) {
        if (com.vk.toggle.d.S()) {
            imageView.setImageDrawable(new baf0(drawable, e3m.f(i2, imageView.getContext())));
        } else {
            imageView.setImageDrawable(new baf0(drawable, u.c(i2)));
        }
        D().getClass();
        com.vk.core.ui.themes.a.a(imageView, i2, ThemeKeyAttributes.IMAGE_DRAWABLE);
    }

    public static void l(lpj lpjVar) {
        lpjVar.getTheme().setTo(lpjVar.getBaseContext().getTheme());
        lpjVar.setTheme(0);
    }

    public static final SparseIntArray m(View view, boolean z2) {
        a.getClass();
        D().getClass();
        Object tag = view.getTag(R.id.theme_tag_key);
        SparseIntArray sparseIntArray = tag instanceof SparseIntArray ? (SparseIntArray) tag : null;
        view.setTag(R.id.theme_tag_key, null);
        if (z2 && (view instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                m(viewGroup.getChildAt(i2), true);
            }
        }
        return sparseIntArray;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x009a, code lost:
    
        if (((r3 < r0 || ((r3 > r0 && r3 > r6) || (r3 > r6 && r3 > r2.getMaximum(11)))) ? r0 > r6 ? (r6 > r3 || r3 > r0) ? com.vk.sunrise.SunState.DOWN : com.vk.sunrise.SunState.UP : (r0 > r3 || r3 > r6) ? com.vk.sunrise.SunState.UP : com.vk.sunrise.SunState.DOWN : (r3 == r0 && r3 == r6) ? (r5 > r4 || r4 > r7) ? com.vk.sunrise.SunState.UP : com.vk.sunrise.SunState.DOWN : r3 == r0 ? r4 >= r5 ? com.vk.sunrise.SunState.DOWN : com.vk.sunrise.SunState.UP : r3 == r6 ? r4 <= r7 ? com.vk.sunrise.SunState.DOWN : com.vk.sunrise.SunState.UP : com.vk.sunrise.SunState.DOWN) != com.vk.sunrise.SunState.DOWN) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static VKTheme n(Context context) {
        if (R()) {
            pyo0 pyo0Var = o;
            pyo0Var.getClass();
            Date date = new Date();
            Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
            calendar.setTime(date);
            int i2 = calendar.get(11);
            int i3 = calendar.get(12);
            pyo0Var.a.getClass();
            int m2 = (int) Preference.m(22L, "THEME_TIMETABLE", "HOUR_START");
            int m3 = (int) Preference.m(0L, "THEME_TIMETABLE", "MINUTE_START");
            int m4 = (int) Preference.m(8L, "THEME_TIMETABLE", "HOUR_END");
            int m5 = (int) Preference.m(0L, "THEME_TIMETABLE", "MINUTE_END");
        }
        if ((!K() || n.a != SunState.DOWN) && (K() || R() || (context.getResources().getConfiguration().uiMode & 48) != 32)) {
            return c.a;
        }
        return c.b;
    }

    public static void n0(Toolbar toolbar, int i2) {
        if (com.vk.toggle.d.S()) {
            toolbar.setTitleTextColor(e3m.f(i2, toolbar.getContext()));
        } else {
            toolbar.setTitleTextColor(u.c(i2));
        }
        D().getClass();
        com.vk.core.ui.themes.a.a(toolbar, i2, ThemeKeyAttributes.TITLE_COLOR);
    }

    public static final int o(String str, AttributeSet attributeSet) {
        a.getClass();
        return p("http://schemas.android.com/apk/res/android", str, attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void o0(Activity activity, VKTheme vKTheme, float[] fArr, a[] aVarArr) {
        Bitmap i2;
        tok R;
        b bVar = null;
        rok rokVar = activity instanceof rok ? (rok) activity : null;
        if (rokVar != null && (R = rokVar.R()) != null) {
            R.a();
            return;
        }
        if (fArr != null) {
            FrameLayout frameLayout = (FrameLayout) activity.getWindow().getDecorView();
            b bVar2 = new b(activity);
            bVar2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            if (aVarArr != null) {
                try {
                    for (a aVar : aVarArr) {
                        aVar.a();
                    }
                } catch (Exception unused) {
                }
            }
            i2 = kd7.i(frameLayout, null);
            bVar2.setImageBitmap(i2);
            frameLayout.addView(bVar2);
            bVar = bVar2;
        }
        b bVar3 = bVar;
        activity.setTheme(vKTheme.c);
        if (activity instanceof too0) {
            ((too0) activity).Ng();
        }
        activity.getWindow().setBackgroundDrawable(t.a(R.drawable.bg_window_themable));
        v0(activity);
        r0(activity);
        if (activity instanceof FragmentActivity) {
            FragmentActivity fragmentActivity = (FragmentActivity) activity;
            h(fragmentActivity.getSupportFragmentManager().c.f());
            List<Fragment> f2 = fragmentActivity.getSupportFragmentManager().c.f();
            ArrayList arrayList = new ArrayList();
            for (Object obj : f2) {
                if (((Fragment) obj).isVisible()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof xoo0) {
                    arrayList2.add(next);
                }
            }
            xoo0 xoo0Var = (xoo0) j5g.a0(arrayList2);
            if (xoo0Var != null) {
                Window window = fragmentActivity.getWindow();
                HashSet hashSet = iah0.a;
                window.setStatusBarColor(!fnj.d(activity) ? xoo0Var.l2() : 0);
                if (xoo0Var instanceof nds) {
                    mnh0.w(fragmentActivity.getWindow().getDecorView(), ((nds) xoo0Var).W9());
                }
            }
            List<Fragment> f3 = fragmentActivity.getSupportFragmentManager().c.f();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : f3) {
                if (((Fragment) obj2).isVisible()) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                if (next2 instanceof woo0) {
                    arrayList4.add(next2);
                }
            }
            woo0 woo0Var = (woo0) j5g.a0(arrayList4);
            if (woo0Var != null) {
                t0(fragmentActivity.getWindow(), woo0Var.o7());
            }
        }
        W((ViewGroup) activity.getWindow().getDecorView());
        if (bVar3 != null) {
            a.getClass();
            FrameLayout frameLayout2 = (FrameLayout) bVar3.getParent();
            int hypot = (int) Math.hypot(frameLayout2.getMeasuredWidth(), frameLayout2.getMeasuredHeight());
            boolean M = M();
            float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            float f5 = M ? 0.0f : hypot;
            if (M()) {
                f4 = hypot;
            }
            d dVar = new d(bVar3, an10.b(fArr[0]), an10.b(fArr[1]), f5, f4);
            dVar.setDuration(500L);
            dVar.setInterpolator(new pkk(0.455d, 0.03d, 0.515d, 0.955d));
            xo2.i(dVar, new ume0(9, aVarArr, bVar3));
            xo2.h(dVar, new com.vk.movika.sdk.base.flow.binding.l(25, bVar3, frameLayout2));
            dVar.start();
        }
    }

    public static int p(String str, String str2, AttributeSet attributeSet) {
        String attributeValue = attributeSet.getAttributeValue(str, str2);
        if (attributeValue == null || !brm0.B(attributeValue, "?", false)) {
            return 0;
        }
        return Integer.parseInt(brm0.y(attributeValue, "?", ""));
    }

    public static void p0(dhr0 dhr0Var, Activity activity, VKTheme vKTheme, float[] fArr, int i2) {
        Activity activity2;
        if ((i2 & 4) != 0) {
            fArr = null;
        }
        dhr0Var.getClass();
        r.b();
        s.b();
        LinkedList linkedList = null;
        if (activity != null && !gz80.a(23)) {
            try {
                Field declaredField = m33.class.getDeclaredField("sColorStateCaches");
                declaredField.setAccessible(true);
                SparseArray sparseArray = (SparseArray) ((WeakHashMap) declaredField.get(null)).get(activity);
                if (sparseArray != null) {
                    sparseArray.clear();
                }
            } catch (Exception e2) {
                L.g(A, e2);
            }
        }
        dhr0 dhr0Var2 = a;
        if (activity != null) {
            dhr0Var2.getClass();
            o0(activity, vKTheme, fArr, null);
        }
        if (y != null) {
            ArrayList arrayList = x93.d;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                WeakReference weakReference = (WeakReference) next;
                Object obj = weakReference.get();
                WeakReference<Activity> weakReference2 = x93.c;
                if (!epx.f(obj, weakReference2 != null ? weakReference2.get() : null) && (activity2 = (Activity) weakReference.get()) != null && !activity2.isDestroyed()) {
                    arrayList2.add(next);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Activity activity3 = (Activity) ((WeakReference) it2.next()).get();
                if (activity3 != null && !activity3.isDestroyed()) {
                    dhr0Var2.getClass();
                    o0(activity3, vKTheme, null, null);
                }
            }
        }
        CopyOnWriteArrayList<WeakReference<e>> copyOnWriteArrayList = k;
        Iterator<WeakReference<e>> it3 = copyOnWriteArrayList.iterator();
        while (it3.hasNext()) {
            WeakReference<e> next2 = it3.next();
            e eVar = next2.get();
            if (eVar != null) {
                eVar.sb(vKTheme);
            } else {
                if (linkedList == null) {
                    linkedList = new LinkedList();
                }
                linkedList.add(next2);
            }
        }
        if (linkedList != null) {
            copyOnWriteArrayList.removeAll(linkedList);
        }
        ArrayList arrayList3 = new ArrayList();
        CopyOnWriteArrayList<WeakReference<lrv0.a>> copyOnWriteArrayList2 = l;
        Iterator<WeakReference<lrv0.a>> it4 = copyOnWriteArrayList2.iterator();
        while (it4.hasNext()) {
            WeakReference<lrv0.a> next3 = it4.next();
            if (next3.get() == null) {
                arrayList3.add(next3);
            }
        }
        copyOnWriteArrayList2.removeAll(arrayList3);
        Iterator<WeakReference<lrv0.a>> it5 = copyOnWriteArrayList2.iterator();
        while (it5.hasNext()) {
            lrv0.a aVar = it5.next().get();
            if (aVar != null) {
                aVar.xb();
            }
        }
        cxw cxwVar = j;
        if (cxwVar != null) {
            cxwVar.sb(vKTheme);
        }
    }

    public static int[][] q() {
        return new int[][]{new int[]{-16842912, -16842910}, new int[]{android.R.attr.state_checked, -16842910}, new int[]{-16842912}, new int[]{android.R.attr.state_checked}};
    }

    public static final f q0(int i2) {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        return new f(context, i2);
    }

    public static final ColorStateList r(int i2) {
        return ColorStateList.valueOf(t.c(i2));
    }

    public static final void r0(Activity activity) {
        s0(activity.getWindow());
    }

    public static Context s() {
        return (Context) w.getValue();
    }

    public static final void s0(Window window) {
        u0(window, NavigationBarStyle.DYNAMIC);
    }

    public static l7s t(Context context) {
        return new l7s(context, u().c);
    }

    public static final void t0(Window window, int i2) {
        boolean d2;
        if (window == null) {
            return;
        }
        a.getClass();
        if (!gz80.a(26)) {
            Context context = window.getContext();
            e3m.a aVar = e3m.a;
            window.setNavigationBarColor(context.getColor(R.color.vk_black));
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        window.setNavigationBarColor(i2);
        if (gz80.a(29)) {
            window.setNavigationBarContrastEnforced(false);
        }
        boolean z2 = i2 == 0;
        if (z2) {
            d2 = l8g.d(t.c(R.attr.vk_ui_background));
        } else {
            if (z2) {
                throw new NoWhenBranchMatchedException();
            }
            d2 = l8g.d(i2);
        }
        if (d2) {
            decorView.setSystemUiVisibility(systemUiVisibility | 16);
        } else {
            decorView.setSystemUiVisibility(systemUiVisibility & (-17));
        }
    }

    public static VKTheme u() {
        return (VKTheme) q.getValue();
    }

    public static final void u0(final Window window, NavigationBarStyle navigationBarStyle) {
        final int f2;
        int i2 = g.$EnumSwitchMapping$0[navigationBarStyle.ordinal()];
        dhr0 dhr0Var = a;
        if (i2 == 1) {
            dhr0Var.getClass();
            f2 = e3m.f(R.attr.vk_ui_background_content, s());
        } else if (i2 == 2) {
            dhr0Var.getClass();
            f2 = e3m.f(R.attr.vk_ui_background_content, y());
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            f2 = t.c(R.attr.vk_ui_background_content);
        }
        try {
            t0(window, f2);
        } catch (Throwable unused) {
            i0q0.f(new gzs() { // from class: xsna.ahr0
                @Override // xsna.gzs
                public final Object invoke() {
                    try {
                        dhr0.t0(window, f2);
                    } catch (Throwable th) {
                        L.i(th);
                    }
                    return s3q0.a;
                }
            });
        }
    }

    public static final void v0(Activity activity) {
        mnh0.w(activity.getWindow().getDecorView(), C().b);
    }

    public static final Drawable w(int i2, Context context) {
        return context instanceof l7s ? m33.a(i2, context) : t.a(i2);
    }

    public static final baf0 x(int i2, int i3, Context context) {
        return context instanceof l7s ? new baf0(m33.a(i2, context), Y(i3, context)) : t.b(i2, i3);
    }

    public static Context y() {
        return (Context) v.getValue();
    }

    public static VKTheme z() {
        return (VKTheme) p.getValue();
    }

    public final Drawable F(int i2) {
        g.getClass();
        return t.a(i2);
    }

    public final boolean O(int i2) {
        return u().c == i2 || e.b.c == i2 || d.b.c == i2;
    }

    public final boolean V(Toolbar toolbar) {
        D().getClass();
        if (toolbar.getTag(R.id.theme_tag_key) != null) {
            return com.vk.core.ui.themes.a.d(toolbar, ((SparseIntArray) toolbar.getTag(R.id.theme_tag_key)).get(ThemeKeyAttributes.BACKGROUND.h(), 0));
        }
        return false;
    }

    public final int Z(int i2, Context context) {
        return f.a(i2, context);
    }

    @Override // xsna.lrv0
    public final void a(lrv0.a aVar) {
        l.add(new WeakReference<>(aVar));
    }

    @Override // xsna.lrv0
    public final Context b() {
        return y();
    }

    @Override // xsna.lrv0
    public final boolean c(Context context) {
        eqy<bek0> eqyVar = com.vk.toggle.d.a;
        CoreFeatures coreFeatures = CoreFeatures.COMPOSE_VIEW_NESTED_THEME;
        coreFeatures.getClass();
        if (!com.vk.toggle.b.A.a(coreFeatures)) {
            int themeResId = context instanceof lpj ? ((lpj) context).getThemeResId() : context instanceof ContextThemeWrapper ? npj.a((ContextWrapper) context) : context instanceof ContextWrapper ? npj.a((ContextWrapper) context) : -1;
            return themeResId > 0 ? O(themeResId) : M();
        }
        if (context == null) {
            return M();
        }
        e3m.a aVar = e3m.a;
        return epx.f(context.getTheme().resolveAttribute(R.attr.vk_ui_theme_type, e3m.i(), true) ? e3m.i().string : null, "dark");
    }

    @Override // xsna.lrv0
    public final void d(lrv0.a aVar) {
        ArrayList arrayList = new ArrayList();
        CopyOnWriteArrayList<WeakReference<lrv0.a>> copyOnWriteArrayList = l;
        for (Object obj : copyOnWriteArrayList) {
            WeakReference weakReference = (WeakReference) obj;
            if (weakReference.get() == null || epx.f(weakReference.get(), aVar)) {
                arrayList.add(obj);
            }
        }
        copyOnWriteArrayList.removeAll(arrayList);
    }

    @Override // xsna.lrv0
    public final Context e() {
        return s();
    }

    public final void e0(int i2, View view) {
        if (com.vk.toggle.d.S()) {
            view.setBackgroundColor(e3m.f(i2, view.getContext()));
        } else {
            view.setBackgroundColor(u.c(i2));
        }
        D().getClass();
        com.vk.core.ui.themes.a.a(view, i2, ThemeKeyAttributes.BACKGROUND);
    }

    public final void g(lpj lpjVar) {
        boolean c2 = c(lpjVar.getBaseContext());
        ehr0 ehr0Var = e;
        VKTheme vKTheme = c2 ? ehr0Var.b : ehr0Var.a;
        if (lpjVar.getThemeResId() != vKTheme.c) {
            lpjVar.getTheme().setTo(lpjVar.getBaseContext().getTheme());
            lpjVar.setTheme(vKTheme.c);
        }
    }

    public final void i(FragmentActivity fragmentActivity) {
        if (Preference.v("vk_theme_helper", "auto_change_theme")) {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            if (anj.a(context, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
                Preference.C("vk_theme_helper", "auto_change_theme");
            }
        }
        VKTheme n2 = n(fragmentActivity);
        cpn0 cpn0Var = m;
        if (epx.f((VKTheme) cpn0Var.a(), n2)) {
            return;
        }
        cpn0Var.b();
        p0(this, fragmentActivity, n2, null, 8);
    }

    public final void i0(int i2, View view) {
        view.setBackgroundTintMode(PorterDuff.Mode.SRC_OVER);
        if (com.vk.toggle.d.S()) {
            view.setBackgroundTintList(ColorStateList.valueOf(e3m.f(i2, view.getContext())));
        } else {
            view.setBackgroundTintList(ColorStateList.valueOf(u.c(i2)));
        }
        D().getClass();
        com.vk.core.ui.themes.a.a(view, i2, ThemeKeyAttributes.BACKGROUND_TINT);
    }

    public final void j0(ImageView imageView, int i2, PorterDuff.Mode mode) {
        if (com.vk.toggle.d.S()) {
            imageView.setColorFilter(e3m.f(i2, imageView.getContext()), mode);
        } else {
            imageView.setColorFilter(u.c(i2), mode);
        }
        D().getClass();
        com.vk.core.ui.themes.a.a(imageView, i2, ThemeKeyAttributes.IMAGE_COLOR_FILTER);
        PorterDuff.Mode[] modeArr = com.vk.core.ui.themes.a.b;
        int U = rl3.U(mode, modeArr);
        if (U < 0 || U >= modeArr.length) {
            U = 0;
        }
        com.vk.core.ui.themes.a.a(imageView, U, ThemeKeyAttributes.IMAGE_COLOR_FILTER_MODE);
    }

    public final void k(FragmentActivity fragmentActivity) {
        if (Preference.v("vk_theme_helper", "current_theme_name")) {
            return;
        }
        i(fragmentActivity);
    }

    public final void l0(ImageView imageView, int i2, int i3) {
        Drawable a2 = m33.a(i2, E());
        if (com.vk.toggle.d.S()) {
            imageView.setImageDrawable(new baf0(a2, e3m.f(i3, imageView.getContext())));
        } else {
            imageView.setImageDrawable(new baf0(a2, u.c(i3)));
        }
        D().getClass();
        com.vk.core.ui.themes.a.a(imageView, i3, ThemeKeyAttributes.IMAGE_DRAWABLE);
    }

    public final void m0(TextView textView, int i2) {
        if (com.vk.toggle.d.S()) {
            textView.setTextColor(e3m.f(i2, textView.getContext()));
        } else {
            textView.setTextColor(u.c(i2));
        }
        D().getClass();
        com.vk.core.ui.themes.a.a(textView, i2, ThemeKeyAttributes.TEXT_COLOR);
    }

    public final int v() {
        return d.b.c;
    }

    /* compiled from: VKThemeHelper.kt */
    /* loaded from: classes17.dex */
    public static final class d extends ValueAnimator {

        /* compiled from: VKThemeHelper.kt */
        public static final class a {
            public float a;
            public final int b;
            public final int c;

            public a(float f, int i, int i2) {
                this.a = f;
                this.b = i;
                this.c = i2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return Float.compare(this.a, aVar.a) == 0 && this.b == aVar.b && this.c == aVar.c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.c) + shy.a(this.b, Float.hashCode(this.a) * 31, 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("RevealCircle(radius=");
                sb.append(this.a);
                sb.append(", x=");
                sb.append(this.b);
                sb.append(", y=");
                return vu5.b(sb, this.c, ')');
            }
        }

        /* compiled from: VKThemeHelper.kt */
        public static final class b implements TypeEvaluator<a> {
            public final a a;

            public b(int i, int i2) {
                this.a = new a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i, i2);
            }

            @Override // android.animation.TypeEvaluator
            public final a evaluate(float f, a aVar, a aVar2) {
                a aVar3 = aVar;
                a aVar4 = aVar2;
                a aVar5 = this.a;
                if (aVar3 == null || aVar4 == null) {
                    return aVar5;
                }
                float f2 = aVar3.a;
                aVar5.a = u11.b(aVar4.a, f2, f, f2);
                return aVar5;
            }
        }

        public d(b bVar, int i, int i2, float f, float f2) {
            b.a c2736b = f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? b.a.C2735a.a : new b.a.C2736b(f);
            setObjectValues(new a(f, i, i2), new a(f2, i, i2));
            setEvaluator(new b(i, i2));
            addUpdateListener(new ho6(bVar, 4));
            addListener(new C2737d(bVar, c2736b));
            addListener(new c(bVar));
        }

        /* compiled from: Animator.kt */
        public static final class c implements Animator.AnimatorListener {
            public final /* synthetic */ b b;

            public c(b bVar) {
                this.b = bVar;
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                this.b.c = null;
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }
        }

        /* compiled from: Animator.kt */
        /* renamed from: xsna.dhr0$d$d, reason: collision with other inner class name */
        public static final class C2737d implements Animator.AnimatorListener {
            public final /* synthetic */ b b;
            public final /* synthetic */ b.a c;

            public C2737d(b bVar, b.a aVar) {
                this.b = bVar;
                this.c = aVar;
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                b bVar = this.b;
                Paint paint = bVar.e;
                b.a aVar = this.c;
                bVar.c = aVar;
                if (aVar instanceof b.a.C2736b) {
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setAntiAlias(true);
                    paint.setDither(true);
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }
        }
    }
}
