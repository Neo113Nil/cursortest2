package xsna;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewRootImpl;
import android.view.Window;
import android.widget.FrameLayout;
import com.android.internal.policy.DecorView;
import com.unity3d.services.UnityAdsConstants;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.collections.builders.MapBuilder;
import kotlin.collections.builders.SetBuilder;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: view.kt */
/* loaded from: classes4.dex */
public final class fyt0 {

    /* compiled from: view.kt */
    public static final class a implements View.OnLayoutChangeListener {
        public final /* synthetic */ izs<View, s3q0> b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(izs<? super View, s3q0> izsVar) {
            this.b = izsVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            this.b.invoke(view);
        }
    }

    public static void a(ViewGroup viewGroup, View view, int i, gzs gzsVar, int i2) {
        if ((i2 & 2) != 0) {
            i = viewGroup.getChildCount();
        }
        if ((i2 & 4) != 0) {
            gzsVar = null;
        }
        if (!view.isAttachedToWindow() && viewGroup.indexOfChild(view) == -1 && view.getParent() == null) {
            if (gzsVar != null) {
                viewGroup.addView(view, i, (ViewGroup.LayoutParams) gzsVar.invoke());
            } else {
                viewGroup.addView(view, i);
            }
        }
    }

    public static final void b(View view, izs<? super View, s3q0> izsVar) {
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            c(view, izsVar);
        } else {
            izsVar.invoke(view);
        }
    }

    public static final void c(View view, izs<? super View, s3q0> izsVar) {
        view.addOnLayoutChangeListener(new a(izsVar));
    }

    public static void d(View view, gzs gzsVar, int i) {
        long j = (i & 2) != 0 ? 0L : 400L;
        if ((i & 4) != 0) {
            gzsVar = null;
        }
        view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        view.setVisibility(0);
        d0u0.a(view.animate().alpha(1.0f).setDuration(200L).setStartDelay(j), gzsVar).start();
    }

    public static final Window e(View view, n4p n4pVar) {
        ViewRootImpl parent = view.getParent();
        while (parent instanceof View) {
            parent = ((View) parent).getParent();
        }
        try {
            DecorView view2 = parent.getView();
            Field declaredField = DecorView.class.getDeclaredField("mWindow");
            declaredField.setAccessible(true);
            return (Window) declaredField.get(view2);
        } catch (Throwable th) {
            if (n4pVar == null) {
                return null;
            }
            n4pVar.a(new RuntimeException("Cannot extract Window from ViewRootImpl and DecorView", th));
            return null;
        }
    }

    public static final float f(View view) {
        int measuredWidth = view.getMeasuredWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int marginEnd = measuredWidth + (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd() : 0);
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        int marginStart = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginStart() : 0;
        return view.getPaddingEnd() + view.getPaddingStart() + marginEnd + marginStart;
    }

    public static final void g(Rect rect, View view) {
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.getHitRect(rect);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setScaleX(scaleX);
        view.setScaleY(scaleY);
    }

    public static final void h(View view) {
        view.setVisibility(8);
    }

    public static final void i(ViewGroup viewGroup) {
        j(viewGroup, new oqt0(1));
    }

    public static final void j(ViewGroup viewGroup, izs<? super View, Boolean> izsVar) {
        SetBuilder setBuilder = new SetBuilder();
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            setBuilder.add(viewGroup.getChildAt(i));
        }
        Object it = setBuilder.d().iterator();
        while (((MapBuilder.d) it).hasNext()) {
            View view = (View) ((MapBuilder.e) it).next();
            if (izsVar.invoke(view).booleanValue()) {
                viewGroup.removeView(view);
            } else if (view instanceof ViewGroup) {
                j((ViewGroup) view, izsVar);
            }
        }
    }

    public static final void k(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.gravity = i;
        }
        view.setLayoutParams(layoutParams);
    }

    public static final void l(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() > 0) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    l(viewGroup.getChildAt(i), z);
                }
            }
        }
    }

    public static final void m(bbp bbpVar, View... viewArr) {
        rmk0 rmk0Var = new rmk0(2);
        rmk0Var.a(bbpVar);
        rmk0Var.b(viewArr);
        ArrayList<Object> arrayList = rmk0Var.a;
        View[] viewArr2 = (View[]) arrayList.toArray(new View[arrayList.size()]);
        n0 n0Var = new n0(29, bbpVar, viewArr);
        ArrayList arrayList2 = new ArrayList();
        for (View view : viewArr2) {
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            if (!view.isLaidOut() || view.isLayoutRequested()) {
                arrayList2.add(view);
            }
        }
        if (arrayList2.isEmpty()) {
            n0Var.invoke();
            return;
        }
        sc5 sc5Var = new sc5(new Ref$IntRef(), arrayList2, n0Var, 7);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            b((View) it.next(), sc5Var);
        }
    }

    public static final void n(View view, boolean z) {
        view.setVisibility(z ? 0 : 4);
    }

    public static final void o(View view, boolean z) {
        view.setVisibility(z ? 0 : 8);
    }
}
