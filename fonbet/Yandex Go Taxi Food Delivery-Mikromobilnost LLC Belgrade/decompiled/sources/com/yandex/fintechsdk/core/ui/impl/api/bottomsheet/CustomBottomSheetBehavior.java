package com.yandex.fintechsdk.core.ui.impl.api.bottomsheet;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.n751;
import defpackage.oxe;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u000bB\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\f"}, d2 = {"Lcom/yandex/fintechsdk/core/ui/impl/api/bottomsheet/CustomBottomSheetBehavior;", "Landroid/view/View;", CA20Status.STATUS_CERTIFICATE_V, "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CustomBottomSheetBehavior<V extends View> extends BottomSheetBehavior<V> {
    public static final /* synthetic */ int P0 = 0;
    public final float L0;
    public int M0;
    public a N0;
    public boolean O0;

    public CustomBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.N0 = a.d;
        this.L0 = (int) TypedValue.applyDimension(1, 60.0f, Resources.getSystem().getDisplayMetrics());
    }

    public static View f0(float f, float f2, View view) {
        View f0;
        if (0.0f > f || f > view.getWidth() || 0.0f > f2 || f2 > view.getHeight()) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (true) {
                childCount--;
                if (-1 >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt.getVisibility() == 0 && (f0 = f0(f - childAt.getLeft(), f2 - childAt.getTop(), childAt)) != null) {
                    return f0;
                }
            }
        }
        return view;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final n751 c(View view, n751 n751Var) {
        int i = n751Var.a.g(1).b;
        if (this.M0 != i) {
            this.M0 = i;
            if (!this.O0) {
                P(i);
            }
            if (this.k0 == 3) {
                view.post(new oxe(4, this));
            }
        }
        return n751Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0034, code lost:
    
        if ((r0 instanceof android.widget.ScrollView) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0049, code lost:
    
        if (r0.canScrollVertically(-1) != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        if (r0 != 3) goto L57;
     */
    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (view.getHeight() > 0) {
            int actionMasked = motionEvent.getActionMasked();
            a aVar = a.d;
            boolean z = true;
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked == 2) {
                        a aVar2 = this.N0;
                        if (aVar2.a) {
                            View view2 = aVar2.c;
                            if (view2 != null) {
                                if (!(view2 instanceof RecyclerView)) {
                                    if (!(view2 instanceof NestedScrollView)) {
                                    }
                                }
                                if (motionEvent.getY() - this.N0.b > 0.0f) {
                                }
                            }
                        }
                    }
                }
                this.N0 = aVar;
            } else {
                float f = this.M0;
                float f2 = this.L0 + f;
                float y = motionEvent.getY();
                if (y < f || y > f2 || motionEvent.getY() > view.getHeight()) {
                    this.N0 = aVar;
                } else {
                    View f0 = f0(motionEvent.getX(), motionEvent.getY(), view);
                    View view3 = f0;
                    while (view3 != null && view3 != view) {
                        Object parent = view3.getParent();
                        view3 = parent instanceof View ? (View) parent : null;
                        if (view3 == null) {
                            break;
                        }
                        if (view3 instanceof CoordinatorLayout) {
                            break;
                        }
                    }
                    z = false;
                    boolean z2 = !z;
                    float y2 = motionEvent.getY();
                    if (z) {
                        f0 = null;
                    }
                    this.N0 = new a(y2, z2, f0);
                }
            }
            if (this.N0.a) {
                return super.h(coordinatorLayout, view, motionEvent);
            }
        }
        return false;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final boolean r(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        if (this.N0.a) {
            return super.r(coordinatorLayout, view, view2, view3, i, i2);
        }
        return false;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final boolean t(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        a aVar = this.N0;
        if (!aVar.a) {
            return false;
        }
        View view2 = aVar.c;
        if ((view2 instanceof RecyclerView) || (view2 instanceof NestedScrollView) || (view2 instanceof ScrollView)) {
            return false;
        }
        return super.t(coordinatorLayout, view, motionEvent);
    }

    public static final class a {
        public static final a d = new a(0);
        public final boolean a;
        public final float b;
        public final View c;

        public a(float f, boolean z, View view) {
            this.a = z;
            this.b = f;
            this.c = view;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && Float.compare(this.b, aVar.b) == 0 && jl40.l(this.c, aVar.c);
        }

        public final int hashCode() {
            int c = g8e.c(this.b, Boolean.hashCode(this.a) * 31, 31);
            View view = this.c;
            return c + (view == null ? 0 : view.hashCode());
        }

        public final String toString() {
            return "TouchState(isInDragZone=" + this.a + ", initialY=" + this.b + ", viewUnderTouch=" + this.c + Extension.C_BRAKE;
        }

        public a() {
            this(0);
        }

        public /* synthetic */ a(int i) {
            this(0.0f, false, null);
        }
    }

    public CustomBottomSheetBehavior() {
        this.N0 = a.d;
    }
}
