package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.vkontakte.android.R;
import java.lang.reflect.Field;
import kotlin.jvm.internal.Ref$IntRef;
import ru.ok.android.utils.Logger;
import xsna.am;

/* compiled from: ViewExt.kt */
/* loaded from: classes.dex */
public final class awt0 {
    public static Field a;

    /* compiled from: ViewExt.kt */
    /* loaded from: classes17.dex */
    public static final class a implements gzs<s3q0> {
        public final /* synthetic */ View b;
        public final /* synthetic */ Ref$IntRef c;
        public final /* synthetic */ Ref$IntRef d;
        public final /* synthetic */ RecyclerView e;

        public a(RecyclerView recyclerView, Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, RecyclerView recyclerView2) {
            this.b = recyclerView;
            this.c = ref$IntRef;
            this.d = ref$IntRef2;
            this.e = recyclerView2;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            View view = this.b;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            Ref$IntRef ref$IntRef = this.c;
            int i = ref$IntRef.element;
            Ref$IntRef ref$IntRef2 = this.d;
            if (i != measuredWidth || ref$IntRef2.element != measuredHeight) {
                ref$IntRef.element = measuredWidth;
                ref$IntRef2.element = measuredHeight;
                RecyclerView recyclerView = this.e;
                if (!recyclerView.isComputingLayout()) {
                    recyclerView.invalidateItemDecorations();
                }
            }
            return s3q0.a;
        }
    }

    /* compiled from: View.kt */
    /* loaded from: classes17.dex */
    public static final class b implements View.OnLayoutChangeListener {
        public final /* synthetic */ View b;
        public final /* synthetic */ int c;

        public b(View view, int i) {
            this.b = view;
            this.c = i;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            Rect rect = new Rect();
            View view2 = this.b;
            view2.getHitRect(rect);
            int i9 = rect.top;
            int i10 = this.c;
            rect.top = i9 - i10;
            rect.left -= i10;
            rect.right += i10;
            rect.bottom += i10;
            view.setTouchDelegate(new TouchDelegate(rect, view2));
        }
    }

    /* compiled from: ViewExt.kt */
    /* loaded from: classes17.dex */
    public static final class c extends hk {
        public final /* synthetic */ izs<am, s3q0> b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(izs<? super am, s3q0> izsVar) {
            this.b = izsVar;
        }

        @Override // xsna.hk
        public final void onInitializeAccessibilityNodeInfo(View view, am amVar) {
            super.onInitializeAccessibilityNodeInfo(view, amVar);
            this.b.invoke(amVar);
        }
    }

    /* compiled from: ViewExt.kt */
    /* loaded from: classes17.dex */
    public static final class d implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ View b;
        public final /* synthetic */ gzs<s3q0> c;

        public d(View view, gzs<s3q0> gzsVar) {
            this.b = view;
            this.c = gzsVar;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.c.invoke();
        }
    }

    public static final void a(int i, View view) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight() + i, view.getPaddingBottom());
    }

    public static final void b(int i, View view) {
        view.setPadding(view.getPaddingLeft() + i, view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
    }

    public static final void c(int i, View view) {
        if ((view.getSystemUiVisibility() & i) == 0) {
            view.setSystemUiVisibility(view.getSystemUiVisibility() + i);
        }
    }

    public static final View[] d(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        View[] viewArr = new View[childCount];
        for (int i = 0; i < childCount; i++) {
            viewArr[i] = viewGroup.getChildAt(i);
        }
        return viewArr;
    }

    public static final void e(int i, View view) {
        if ((view.getSystemUiVisibility() & i) != 0) {
            view.setSystemUiVisibility(view.getSystemUiVisibility() - i);
        }
    }

    public static final void f(am amVar, Context context, int i) {
        amVar.b(new am.a(16, context.getString(i)));
    }

    public static final void g(RecyclerView recyclerView) {
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = recyclerView.getMeasuredWidth();
        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        ref$IntRef2.element = recyclerView.getMeasuredHeight();
        f4m.a(recyclerView, new a(recyclerView, ref$IntRef, ref$IntRef2, recyclerView));
    }

    public static final void h(View view, final gzs gzsVar, final boolean z) {
        view.setOnKeyListener(new View.OnKeyListener() { // from class: xsna.lvt0
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view2, int i, KeyEvent keyEvent) {
                if (i != 4) {
                    return false;
                }
                return keyEvent.getAction() == 1 ? ((Boolean) gzsVar.invoke()).booleanValue() : z;
            }
        });
    }

    public static final void i(View view, gzs<s3q0> gzsVar) {
        pj80 pj80Var = new pj80(view, gzsVar, true);
        view.getViewTreeObserver().addOnDrawListener(pj80Var);
        view.addOnAttachStateChangeListener(pj80Var);
    }

    public static final void j(int i, View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            if (!viewGroup.isLaidOut() || viewGroup.isLayoutRequested()) {
                viewGroup.addOnLayoutChangeListener(new b(view, i));
                return;
            }
            Rect rect = new Rect();
            view.getHitRect(rect);
            rect.top -= i;
            rect.left -= i;
            rect.right += i;
            rect.bottom += i;
            viewGroup.setTouchDelegate(new TouchDelegate(rect, view));
        }
    }

    public static final View k(View view) {
        View view2;
        View k;
        if (view instanceof RecyclerView) {
            return view;
        }
        if (view instanceof ViewPager) {
            ViewPager viewPager = (ViewPager) view;
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null && adapter.getCount() != 0 && viewPager.getChildCount() != 0) {
                if (a == null) {
                    try {
                        Field declaredField = ViewPager.g.class.getDeclaredField(Logger.METHOD_E);
                        a = declaredField;
                        declaredField.setAccessible(true);
                    } catch (Exception unused) {
                        throw new RuntimeException("position field not found");
                    }
                }
                int currentItem = viewPager.getCurrentItem();
                int childCount = viewPager.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    view2 = viewPager.getChildAt(i);
                    ViewPager.g gVar = (ViewPager.g) view2.getLayoutParams();
                    if (!gVar.a) {
                        try {
                            if (a.getInt(gVar) == currentItem) {
                                break;
                            }
                        } catch (Exception unused2) {
                        }
                    }
                }
            }
            view2 = null;
            if (view2 != null && (k = k(view2)) != null) {
                return k;
            }
        }
        if (view instanceof NestedScrollView) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                View k2 = k(viewGroup.getChildAt(i2));
                if (k2 != null) {
                    return k2;
                }
            }
        }
        return null;
    }

    public static final View l(View view, izs<? super View, Boolean> izsVar) {
        if (izsVar.invoke(view).booleanValue()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View l = l(viewGroup.getChildAt(i), izsVar);
            if (l != null) {
                return l;
            }
        }
        return null;
    }

    public static final int m(View view) {
        int height = view.getHeight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        return height + (marginLayoutParams != null ? marginLayoutParams.topMargin + marginLayoutParams.bottomMargin : 0);
    }

    public static final int n(View view) {
        if (view.getVisibility() != 8) {
            return view.getHeight();
        }
        return 0;
    }

    public static final void o(View view, izs<? super am, s3q0> izsVar) {
        iut0.q(view, new c(izsVar));
    }

    public static final void p(View view) {
        view.performHapticFeedback(0, 2);
    }

    public static final void q(View view) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        boolean isEnabled = accessibilityManager.isEnabled();
        boolean isTouchExplorationEnabled = accessibilityManager.isTouchExplorationEnabled();
        if (isEnabled || isTouchExplorationEnabled) {
            view.setFocusable(true);
            view.setFocusableInTouchMode(true);
            view.performAccessibilityAction(64, null);
            view.sendAccessibilityEvent(32768);
        }
    }

    public static final void r(am amVar, Context context) {
        amVar.w(context.getString(R.string.vk_accessibility_role_button));
    }

    public static final void s(View view, gzs<s3q0> gzsVar) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(new d(view, gzsVar));
    }

    public static final owt0 t(View view, gzs gzsVar) {
        owt0 owt0Var = new owt0(view, gzsVar);
        view.getViewTreeObserver().addOnPreDrawListener(owt0Var);
        return owt0Var;
    }

    public static final void u(View view, boolean z) {
        view.setVisibility(z ? 0 : 4);
    }

    public static final void v(View view, boolean z) {
        view.setVisibility(z ? 0 : 8);
    }

    public static final void w(View view, int i, int i2, int i3) {
        view.setTranslationY(xwk.b((int) (view.getTranslationY() + i), i2, i3));
    }

    public static void x(View view, int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = view.getPaddingLeft();
        }
        if ((i5 & 2) != 0) {
            i2 = view.getPaddingTop();
        }
        if ((i5 & 4) != 0) {
            i3 = view.getPaddingRight();
        }
        if ((i5 & 8) != 0) {
            i4 = view.getPaddingBottom();
        }
        view.setPadding(i, i2, i3, i4);
    }
}
