package xsna;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContentInfo;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.widget.AppCompatEditText;
import com.vkontakte.android.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.WeakHashMap;
import xsna.am;
import xsna.bqx0;
import xsna.chj;
import xsna.hk;
import xsna.iut0;

/* compiled from: ViewCompat.java */
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public final class iut0 {
    public static WeakHashMap<View, b0u0> a = null;
    public static Method b = null;
    public static Field c = null;
    public static boolean d = false;
    public static final int[] e = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    public static final dut0 f = new dut0();
    public static final a g = new a();

    /* compiled from: ViewCompat.java */
    /* loaded from: classes11.dex */
    public static abstract class b<T> {
        public final int a;
        public final Class<T> b;
        public final int c;
        public final int d;

        public b(int i, Class<T> cls, int i2, int i3) {
            this.a = i;
            this.b = cls;
            this.d = i2;
            this.c = i3;
        }

        public abstract T a(View view);

        public abstract void b(View view, T t);

        public final T c(View view) {
            if (Build.VERSION.SDK_INT >= this.c) {
                return a(view);
            }
            T t = (T) view.getTag(this.a);
            if (this.b.isInstance(t)) {
                return t;
            }
            return null;
        }

        public final void d(View view, T t) {
            if (Build.VERSION.SDK_INT >= this.c) {
                b(view, t);
                return;
            }
            if (e(c(view), t)) {
                hk d = iut0.d(view);
                if (d == null) {
                    d = new hk();
                }
                iut0.q(view, d);
                view.setTag(this.a, t);
                iut0.k(this.d, view);
            }
        }

        public abstract boolean e(T t, T t2);
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes11.dex */
    public static class c {
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            int i = gxt0.a;
            return view.dispatchApplyWindowInsets(windowInsets);
        }
    }

    /* compiled from: ViewCompat.java */
    public static class d {

        /* compiled from: ViewCompat.java */
        public class a implements View.OnApplyWindowInsetsListener {
            public bqx0 a = null;
            public final /* synthetic */ View b;
            public final /* synthetic */ u080 c;

            public a(View view, u080 u080Var) {
                this.b = view;
                this.c = u080Var;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                bqx0 h = bqx0.h(view, windowInsets);
                int i = Build.VERSION.SDK_INT;
                u080 u080Var = this.c;
                if (i < 30) {
                    d.a(windowInsets, this.b);
                    if (h.equals(this.a)) {
                        return u080Var.b(view, h).g();
                    }
                }
                this.a = h;
                bqx0 b = u080Var.b(view, h);
                if (i >= 30) {
                    return b.g();
                }
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                view.requestApplyInsets();
                return b.g();
            }
        }

        public static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static bqx0 b(View view, bqx0 bqx0Var, Rect rect) {
            WindowInsets g = bqx0Var.g();
            if (g != null) {
                return bqx0.h(view, view.computeSystemWindowInsets(g, rect));
            }
            rect.setEmpty();
            return bqx0Var;
        }

        public static void c(View view, u080 u080Var) {
            a aVar = u080Var != null ? new a(view, u080Var) : null;
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(R.id.tag_on_apply_window_listener, aVar);
            }
            if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
                return;
            }
            if (aVar != null) {
                view.setOnApplyWindowInsetsListener(aVar);
            } else {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
            }
        }
    }

    /* compiled from: ViewCompat.java */
    public static class e {
        public static bqx0 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            bqx0 h = bqx0.h(null, rootWindowInsets);
            bqx0.q qVar = h.a;
            qVar.y(h);
            View rootView = view.getRootView();
            qVar.d(rootView);
            qVar.p(rootView);
            qVar.q();
            return h;
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes11.dex */
    public static class f {
        public static void a(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }
    }

    /* compiled from: ViewCompat.java */
    public static class g {
        public static int a(View view) {
            return view.getImportantForAutofill();
        }

        public static void b(View view, int i) {
            view.setImportantForAutofill(i);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes11.dex */
    public static class h {
        public static void a(View view, final m mVar) {
            dpj0 dpj0Var = (dpj0) view.getTag(R.id.tag_unhandled_key_listeners);
            if (dpj0Var == null) {
                dpj0Var = new dpj0();
                view.setTag(R.id.tag_unhandled_key_listeners, dpj0Var);
            }
            Objects.requireNonNull(mVar);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: xsna.jut0
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return iut0.m.this.a();
                }
            };
            dpj0Var.put(mVar, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        public static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        public static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        public static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        public static void e(View view, m mVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            dpj0 dpj0Var = (dpj0) view.getTag(R.id.tag_unhandled_key_listeners);
            if (dpj0Var == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) dpj0Var.get(mVar)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        public static void f(View view, boolean z) {
            view.setAccessibilityHeading(z);
        }

        public static void g(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void h(View view, boolean z) {
            view.setScreenReaderFocusable(z);
        }
    }

    /* compiled from: ViewCompat.java */
    public static class i {
        public static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        public static void b(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    /* compiled from: ViewCompat.java */
    public static class j {
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static CharSequence b(View view) {
            return view.getStateDescription();
        }

        public static oqx0 c(View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return oqx0.c(windowInsetsController);
            }
            return null;
        }

        public static void d(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes11.dex */
    public static final class k {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static chj b(View view, chj chjVar) {
            ContentInfo b = chjVar.a.b();
            Objects.requireNonNull(b);
            ContentInfo c = tgj.c(b);
            ContentInfo performReceiveContent = view.performReceiveContent(c);
            if (performReceiveContent == null) {
                return null;
            }
            return performReceiveContent == c ? chjVar : new chj(new chj.d(performReceiveContent));
        }

        public static void c(View view, String[] strArr, oa80 oa80Var) {
            if (oa80Var == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new l(oa80Var));
            }
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes11.dex */
    public static final class l implements OnReceiveContentListener {
        public final oa80 a;

        public l(oa80 oa80Var) {
            this.a = oa80Var;
        }

        public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            chj chjVar = new chj(new chj.d(contentInfo));
            chj a = this.a.a(view, chjVar);
            if (a == null) {
                return null;
            }
            if (a == chjVar) {
                return contentInfo;
            }
            ContentInfo b = a.a.b();
            Objects.requireNonNull(b);
            return tgj.c(b);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes11.dex */
    public interface m {
        boolean a();
    }

    public static void a(View view, ViewGroup viewGroup) {
        viewGroup.getOverlay().add(view);
        fvr.y((View) view.getParent(), viewGroup);
    }

    @Deprecated
    public static b0u0 b(View view) {
        if (a == null) {
            a = new WeakHashMap<>();
        }
        b0u0 b0u0Var = a.get(view);
        if (b0u0Var != null) {
            return b0u0Var;
        }
        b0u0 b0u0Var2 = new b0u0(view);
        a.put(view, b0u0Var2);
        return b0u0Var2;
    }

    public static bqx0 c(View view, bqx0 bqx0Var) {
        WindowInsets g2 = bqx0Var.g();
        if (g2 != null) {
            WindowInsets a2 = Build.VERSION.SDK_INT >= 30 ? j.a(view, g2) : c.a(view, g2);
            if (!a2.equals(g2)) {
                return bqx0.h(view, a2);
            }
        }
        return bqx0Var;
    }

    public static hk d(View view) {
        View.AccessibilityDelegate e2 = e(view);
        if (e2 == null) {
            return null;
        }
        return e2 instanceof hk.a ? ((hk.a) e2).a : new hk(e2);
    }

    public static View.AccessibilityDelegate e(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return i.a(view);
        }
        if (d) {
            return null;
        }
        if (c == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                c = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                d = true;
                return null;
            }
        }
        try {
            Object obj = c.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            d = true;
            return null;
        }
    }

    public static CharSequence f(View view) {
        return new fut0().c(view);
    }

    public static ArrayList g(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] h(AppCompatEditText appCompatEditText) {
        return Build.VERSION.SDK_INT >= 31 ? k.a(appCompatEditText) : (String[]) appCompatEditText.getTag(R.id.tag_on_receive_content_mime_types);
    }

    @Deprecated
    public static oqx0 i(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return j.c(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return ppx0.a(window, view);
                }
                return null;
            }
        }
        return null;
    }

    public static boolean j(View view) {
        Boolean c2 = new hut0().c(view);
        return c2 != null && c2.booleanValue();
    }

    public static void k(int i2, View view) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = f(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : 2048);
                obtain.setContentChangeTypes(i2);
                if (z) {
                    obtain.getText().add(f(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i2 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i2);
                        return;
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e2);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(obtain2);
            obtain2.setEventType(32);
            obtain2.setContentChangeTypes(i2);
            obtain2.setSource(view);
            view.onPopulateAccessibilityEvent(obtain2);
            obtain2.getText().add(f(view));
            accessibilityManager.sendAccessibilityEvent(obtain2);
        }
    }

    public static bqx0 l(View view, bqx0 bqx0Var) {
        WindowInsets g2 = bqx0Var.g();
        if (g2 != null) {
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(g2);
            if (!onApplyWindowInsets.equals(g2)) {
                return bqx0.h(view, onApplyWindowInsets);
            }
        }
        return bqx0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static chj m(View view, chj chjVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Objects.toString(chjVar);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return k.b(view, chjVar);
        }
        oa80 oa80Var = (oa80) view.getTag(R.id.tag_on_receive_content_listener);
        pa80 pa80Var = f;
        if (oa80Var == null) {
            if (view instanceof pa80) {
                pa80Var = (pa80) view;
            }
            return pa80Var.onReceiveContent(chjVar);
        }
        chj a2 = oa80Var.a(view, chjVar);
        if (a2 == null) {
            return null;
        }
        if (view instanceof pa80) {
            pa80Var = (pa80) view;
        }
        return pa80Var.onReceiveContent(a2);
    }

    public static void n(int i2, View view) {
        ArrayList g2 = g(view);
        for (int i3 = 0; i3 < g2.size(); i3++) {
            if (((am.a) g2.get(i3)).b() == i2) {
                g2.remove(i3);
                return;
            }
        }
    }

    public static void o(View view, am.a aVar, CharSequence charSequence, zm zmVar) {
        if (zmVar == null && charSequence == null) {
            n(aVar.b(), view);
            k(0, view);
            return;
        }
        am.a a2 = aVar.a(charSequence, zmVar);
        hk d2 = d(view);
        if (d2 == null) {
            d2 = new hk();
        }
        q(view, d2);
        n(a2.b(), view);
        g(view).add(a2);
        k(0, view);
    }

    public static void p(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            i.b(view, context, iArr, attributeSet, typedArray, i2, 0);
        }
    }

    public static void q(View view, hk hkVar) {
        if (hkVar == null && (e(view) instanceof hk.a)) {
            hkVar = new hk();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(hkVar == null ? null : hkVar.getBridge());
    }

    public static void r(View view, CharSequence charSequence) {
        new fut0().d(view, charSequence);
        a aVar = g;
        if (charSequence == null) {
            aVar.b.remove(view);
            view.removeOnAttachStateChangeListener(aVar);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(aVar);
        } else {
            aVar.b.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(aVar);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(aVar);
            }
        }
    }

    public static void s(View view, String[] strArr, oa80 oa80Var) {
        if (Build.VERSION.SDK_INT >= 31) {
            k.c(view, strArr, oa80Var);
            return;
        }
        if (strArr == null || strArr.length == 0) {
            strArr = null;
        }
        boolean z = false;
        obr.a("When the listener is set, MIME types must also be set", strArr != null);
        if (strArr != null) {
            int length = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (strArr[i2].startsWith("*")) {
                    z = true;
                    break;
                }
                i2++;
            }
            obr.a("A MIME type set here must not start with *: " + Arrays.toString(strArr), !z);
        }
        view.setTag(R.id.tag_on_receive_content_mime_types, strArr);
        view.setTag(R.id.tag_on_receive_content_listener, oa80Var);
    }

    public static void t(View view, CharSequence charSequence) {
        new gut0().d(view, charSequence);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void u(View view) {
        if (view instanceof q160) {
            ((q160) view).stopNestedScroll(1);
        }
    }

    /* compiled from: ViewCompat.java */
    public static class a implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
        public final WeakHashMap<View, Boolean> b = new WeakHashMap<>();

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }
}
