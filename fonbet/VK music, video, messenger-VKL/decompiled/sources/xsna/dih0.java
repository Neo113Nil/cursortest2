package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: ScrollingUtils.kt */
/* loaded from: classes17.dex */
public final class dih0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[LOOP:0: B:8:0x0038->B:55:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf  */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Pair a(int i, RecyclerView recyclerView, boolean z) {
        Pair pair;
        View view;
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            j9x it = (z ? new k9x(i, linearLayoutManager.getPosition(recyclerView.getChildAt(recyclerView.getChildCount() - 1)), 1) : swe0.m(i, linearLayoutManager.getPosition(recyclerView.getChildAt(0)))).iterator();
            while (it.d) {
                int nextInt = it.nextInt();
                View findViewByPosition = linearLayoutManager.findViewByPosition(nextInt);
                if (findViewByPosition != null) {
                    if (!iut0.j(findViewByPosition)) {
                        ViewGroup viewGroup = findViewByPosition instanceof ViewGroup ? (ViewGroup) findViewByPosition : null;
                        if (viewGroup != null) {
                            Iterator kxt0Var = new kxt0(viewGroup);
                            ArrayList arrayList = new ArrayList();
                            while (true) {
                                if (!kxt0Var.hasNext()) {
                                    view = 0;
                                    break;
                                }
                                view = kxt0Var.next();
                                View view2 = (View) view;
                                ViewGroup viewGroup2 = view2 instanceof ViewGroup ? (ViewGroup) view2 : null;
                                kxt0 kxt0Var2 = viewGroup2 != null ? new kxt0(viewGroup2) : null;
                                if (kxt0Var2 == null || !kxt0Var2.hasNext()) {
                                    while (!kxt0Var.hasNext() && !arrayList.isEmpty()) {
                                        kxt0Var = (Iterator) j5g.i0(arrayList);
                                        g5g.I(arrayList);
                                    }
                                } else {
                                    arrayList.add(kxt0Var);
                                    kxt0Var = kxt0Var2;
                                }
                                if (iut0.j((View) view)) {
                                    break;
                                }
                            }
                            findViewByPosition = view;
                        }
                    }
                    pair = findViewByPosition == null ? new Pair(Integer.valueOf(nextInt), findViewByPosition) : null;
                    if (pair == null) {
                        return pair;
                    }
                }
                findViewByPosition = null;
                if (findViewByPosition == null) {
                }
                if (pair == null) {
                }
            }
        }
        return null;
    }

    public static final void b(int i, RecyclerView recyclerView, boolean z) {
        if (c(i, recyclerView, z)) {
            return;
        }
        int i2 = z ? 1 : -1;
        if (recyclerView.canScrollVertically(i2)) {
            int height = ((recyclerView.getHeight() - recyclerView.getPaddingTop()) - recyclerView.getPaddingBottom()) * i2;
            recyclerView.addOnScrollListener(new cih0(new Ref$IntRef(), recyclerView, i, z, i2, height));
            if (recyclerView.canScrollVertically(height)) {
                recyclerView.smoothScrollBy(0, height, null, IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED);
            }
        }
    }

    public static final boolean c(int i, RecyclerView recyclerView, boolean z) {
        Pair a;
        if (z) {
            RecyclerView.o layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                int v = linearLayoutManager.v();
                int i2 = i + 1;
                if (v < i2) {
                    v = i2;
                }
                a = a(v, recyclerView, true);
            }
            a = null;
        } else {
            RecyclerView.o layoutManager2 = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager2 = layoutManager2 instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager2 : null;
            if (linearLayoutManager2 != null) {
                int x = linearLayoutManager2.x();
                int i3 = i - 1;
                if (x > i3) {
                    x = i3;
                }
                a = a(x, recyclerView, false);
            }
            a = null;
        }
        if (a == null) {
            return false;
        }
        int intValue = ((Number) a.d()).intValue();
        View view = (View) a.g();
        RecyclerView.o layoutManager3 = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager3 = layoutManager3 instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager3 : null;
        if (linearLayoutManager3 == null) {
            return true;
        }
        recyclerView.addOnLayoutChangeListener(new aih0(view));
        linearLayoutManager3.K(intValue, 0);
        return true;
    }
}
