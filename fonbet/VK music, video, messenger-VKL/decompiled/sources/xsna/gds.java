package xsna;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: FragmentTransitionImpl.java */
@SuppressLint({"UnknownNullness"})
/* loaded from: classes12.dex */
public abstract class gds {
    public static void f(View view, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i) == view) {
                return;
            }
        }
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        if (view.getTransitionName() != null) {
            list.add(view);
        }
        for (int i2 = size; i2 < list.size(); i2++) {
            View view2 = (View) list.get(i2);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = viewGroup.getChildAt(i3);
                    int i4 = 0;
                    while (true) {
                        if (i4 < size) {
                            if (list.get(i4) == childAt) {
                                break;
                            } else {
                                i4++;
                            }
                        } else if (childAt.getTransitionName() != null) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    public static void j(Rect rect, View view) {
        if (view.isAttachedToWindow()) {
            RectF rectF = new RectF();
            rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            view.getRootView().getLocationOnScreen(new int[2]);
            rectF.offset(r1[0], r1[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public static boolean k(List list) {
        return list == null || list.isEmpty();
    }

    public abstract void a(@NonNull View view, @NonNull Object obj);

    public abstract void b(@NonNull Object obj, @NonNull ArrayList<View> arrayList);

    public abstract void e(@NonNull ViewGroup viewGroup, @Nullable Object obj);

    public abstract boolean g(@NonNull Object obj);

    public abstract Object h(@Nullable Object obj);

    @Nullable
    public Object i(@NonNull ViewGroup viewGroup, @NonNull Object obj) {
        return null;
    }

    public boolean l() {
        return false;
    }

    public boolean m(@NonNull Object obj) {
        return false;
    }

    public abstract Object n(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3);

    public abstract Object o(@Nullable Object obj, @Nullable Object obj2);

    public abstract void p(@NonNull Object obj, @NonNull View view, @NonNull ArrayList<View> arrayList);

    public abstract void q(@NonNull Object obj, @Nullable Object obj2, @Nullable ArrayList arrayList, @Nullable Object obj3, @Nullable ArrayList arrayList2);

    public abstract void s(@Nullable View view, @NonNull Object obj);

    public abstract void t(@NonNull Object obj, @NonNull Rect rect);

    public void u(@NonNull Fragment fragment, @NonNull Object obj, @NonNull rq9 rq9Var, @NonNull wq8 wq8Var) {
        v(obj, rq9Var, null, wq8Var);
    }

    public void v(@NonNull Object obj, @NonNull rq9 rq9Var, @Nullable qo4 qo4Var, @NonNull Runnable runnable) {
        runnable.run();
    }

    public abstract void w(@NonNull Object obj, @NonNull View view, @NonNull ArrayList<View> arrayList);

    public abstract void x(@Nullable Object obj, @Nullable ArrayList<View> arrayList, @Nullable ArrayList<View> arrayList2);

    public abstract Object y(@Nullable Object obj);

    public void c(@NonNull Object obj) {
    }

    public void d(@NonNull Object obj, @NonNull at6 at6Var) {
    }

    public void r(@NonNull Object obj, float f) {
    }
}
