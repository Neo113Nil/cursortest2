package androidx.recyclerview.widget;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.b64;
import defpackage.i6e0;
import defpackage.jpb;
import defpackage.kbs;
import defpackage.ny61;
import defpackage.w511;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes.dex */
public final class r0 {
    public final ArrayList a;
    public ArrayList b;
    public final ArrayList c;
    public final List d;
    public int e;
    public int f;
    public RecyclerView.h g;
    public RecyclerView.l h;
    public final /* synthetic */ RecyclerView i;

    public r0(RecyclerView recyclerView) {
        this.i = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = null;
        this.c = new ArrayList();
        this.d = Collections.unmodifiableList(arrayList);
        this.e = 2;
        this.f = 2;
    }

    public static void f(ViewGroup viewGroup, boolean z) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                f((ViewGroup) childAt, true);
            }
        }
        if (z) {
            if (viewGroup.getVisibility() == 4) {
                viewGroup.setVisibility(0);
                viewGroup.setVisibility(4);
            } else {
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }
    }

    public final void a(x0 x0Var, boolean z) {
        RecyclerView.clearNestedRecyclerViewIfNotNested(x0Var);
        View view = x0Var.a;
        RecyclerView recyclerView = this.i;
        z0 z0Var = recyclerView.mAccessibilityDelegate;
        if (z0Var != null) {
            AccessibilityDelegateCompat a = z0Var.a();
            androidx.core.view.b.p(view, a instanceof y0 ? (AccessibilityDelegateCompat) ((y0) a).b.remove(view) : null);
        }
        if (z) {
            if (recyclerView.mRecyclerListeners.size() > 0) {
                recyclerView.mRecyclerListeners.get(0).getClass();
                ny61.u();
                return;
            }
            RecyclerView.Adapter adapter = recyclerView.mAdapter;
            if (adapter != null) {
                adapter.onViewRecycled(x0Var);
            }
            if (recyclerView.mState != null) {
                recyclerView.mViewInfoStore.d(x0Var);
            }
            if (RecyclerView.sVerboseLoggingEnabled) {
                Objects.toString(x0Var);
            }
        }
        x0Var.L = null;
        x0Var.K = null;
        d().d(x0Var);
    }

    public final void b() {
        this.a.clear();
        i();
    }

    public final int c(int i) {
        RecyclerView recyclerView = this.i;
        if (i >= 0 && i < recyclerView.mState.b()) {
            return !recyclerView.mState.g ? i : recyclerView.mAdapterHelper.h(i, 0);
        }
        StringBuilder t = b64.t(i, "invalid position ", ". State item count is ");
        t.append(recyclerView.mState.b());
        t.append(recyclerView.exceptionLabel());
        throw new IndexOutOfBoundsException(t.toString());
    }

    public final RecyclerView.h d() {
        if (this.g == null) {
            this.g = new RecyclerView.h();
            g();
        }
        return this.g;
    }

    public final View e(int i) {
        return n(i, ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED).a;
    }

    public final void g() {
        if (this.g != null) {
            RecyclerView recyclerView = this.i;
            if (recyclerView.mAdapter == null || !recyclerView.isAttachedToWindow()) {
                return;
            }
            RecyclerView.h hVar = this.g;
            hVar.c.add(recyclerView.mAdapter);
        }
    }

    public final void h(RecyclerView.Adapter adapter, boolean z) {
        RecyclerView.h hVar = this.g;
        if (hVar != null) {
            SparseArray sparseArray = hVar.a;
            Set set = hVar.c;
            set.remove(adapter);
            if (set.size() != 0 || z) {
                return;
            }
            for (int i = 0; i < sparseArray.size(); i++) {
                ArrayList arrayList = ((q0) sparseArray.get(sparseArray.keyAt(i))).a;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    i6e0.a(((x0) arrayList.get(i2)).a);
                }
            }
        }
    }

    public final void i() {
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            j(size);
        }
        arrayList.clear();
        if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
            o oVar = this.i.mPrefetchRegistry;
            int[] iArr = oVar.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            oVar.d = 0;
        }
    }

    public final void j(int i) {
        int i2 = RecyclerView.HORIZONTAL;
        ArrayList arrayList = this.c;
        x0 x0Var = (x0) arrayList.get(i);
        if (RecyclerView.sVerboseLoggingEnabled) {
            Objects.toString(x0Var);
        }
        a(x0Var, true);
        arrayList.remove(i);
    }

    public final void k(View view) {
        x0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        boolean P = childViewHolderInt.P();
        RecyclerView recyclerView = this.i;
        if (P) {
            recyclerView.removeDetachedView(view, false);
        }
        if (childViewHolderInt.O()) {
            childViewHolderInt.G.o(childViewHolderInt);
        } else if (childViewHolderInt.V()) {
            childViewHolderInt.C &= -33;
        }
        l(childViewHolderInt);
        if (recyclerView.mItemAnimator == null || childViewHolderInt.M()) {
            return;
        }
        recyclerView.mItemAnimator.j(childViewHolderInt);
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x00ca, code lost:
    
        r5 = r5 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(x0 x0Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean O = x0Var.O();
        View view = x0Var.a;
        boolean z5 = true;
        RecyclerView recyclerView = this.i;
        if (O || view.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(x0Var.O());
            sb.append(" isAttached:");
            sb.append(view.getParent() != null);
            sb.append(recyclerView.exceptionLabel());
            throw new IllegalArgumentException(sb.toString());
        }
        if (x0Var.P()) {
            StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
            sb2.append(x0Var);
            ny61.g(b64.g(recyclerView, sb2));
            return;
        }
        if (x0Var.U()) {
            ny61.g(b64.g(recyclerView, new StringBuilder("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
            return;
        }
        if ((x0Var.C & 16) == 0) {
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            if (view.hasTransientState()) {
                z = true;
                RecyclerView.Adapter adapter = recyclerView.mAdapter;
                z2 = adapter == null && z && adapter.onFailedToRecycleView(x0Var);
                z3 = RecyclerView.sDebugAssertionsEnabled;
                ArrayList arrayList = this.c;
                if (!z3 && arrayList.contains(x0Var)) {
                    StringBuilder sb3 = new StringBuilder("cached view received recycle internal? ");
                    sb3.append(x0Var);
                    ny61.g(b64.g(recyclerView, sb3));
                    return;
                }
                if (!z2 || x0Var.M()) {
                    if (this.f > 0 || (x0Var.C & 526) != 0) {
                        z4 = false;
                    } else {
                        int size = arrayList.size();
                        if (size >= this.f && size > 0) {
                            j(0);
                            size--;
                        }
                        if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0) {
                            o oVar = recyclerView.mPrefetchRegistry;
                            int i = x0Var.c;
                            if (oVar.c != null) {
                                int i2 = oVar.d * 2;
                                for (int i3 = 0; i3 < i2; i3 += 2) {
                                    if (oVar.c[i3] == i) {
                                        break;
                                    }
                                }
                            }
                            int i4 = size - 1;
                            loop1: while (i4 >= 0) {
                                int i5 = ((x0) arrayList.get(i4)).c;
                                o oVar2 = recyclerView.mPrefetchRegistry;
                                if (oVar2.c == null) {
                                    break;
                                }
                                int i6 = oVar2.d * 2;
                                for (int i7 = 0; i7 < i6; i7 += 2) {
                                    if (oVar2.c[i7] == i5) {
                                        break;
                                    }
                                }
                                break loop1;
                            }
                            size = i4 + 1;
                        }
                        arrayList.add(size, x0Var);
                        z4 = true;
                    }
                    if (z4) {
                        a(x0Var, true);
                    } else {
                        z5 = false;
                    }
                    r2 = z4;
                } else {
                    if (RecyclerView.sVerboseLoggingEnabled) {
                        recyclerView.exceptionLabel();
                    }
                    z5 = false;
                }
                recyclerView.mViewInfoStore.d(x0Var);
                if (r2 && !z5 && z) {
                    i6e0.a(view);
                    x0Var.L = null;
                    x0Var.K = null;
                    return;
                }
                return;
            }
        }
        z = false;
        RecyclerView.Adapter adapter2 = recyclerView.mAdapter;
        if (adapter2 == null) {
        }
        z3 = RecyclerView.sDebugAssertionsEnabled;
        ArrayList arrayList2 = this.c;
        if (!z3) {
        }
        if (z2) {
        }
        if (this.f > 0) {
        }
        z4 = false;
        if (z4) {
        }
        r2 = z4;
        recyclerView.mViewInfoStore.d(x0Var);
        if (r2) {
        }
    }

    public final void m(View view) {
        x0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        int i = childViewHolderInt.C & 12;
        RecyclerView recyclerView = this.i;
        if (i == 0 && childViewHolderInt.Q() && !recyclerView.canReuseUpdatedViewHolder(childViewHolderInt)) {
            if (this.b == null) {
                this.b = new ArrayList();
            }
            childViewHolderInt.G = this;
            childViewHolderInt.H = true;
            this.b.add(childViewHolderInt);
            return;
        }
        if (childViewHolderInt.L() && !childViewHolderInt.N() && !recyclerView.mAdapter.hasStableIds()) {
            ny61.g(b64.g(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
            return;
        }
        childViewHolderInt.G = this;
        childViewHolderInt.H = false;
        this.a.add(childViewHolderInt);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x050a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x03aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final x0 n(int i, long j) {
        x0 x0Var;
        int i2;
        int i3;
        long j2;
        long j3;
        long j4;
        boolean z;
        int i4;
        long j5;
        int i5;
        int i6;
        ViewGroup.LayoutParams layoutParams;
        RecyclerView.LayoutParams layoutParams2;
        RecyclerView findNestedRecyclerView;
        RecyclerView.l lVar;
        View a;
        View view;
        x0 x0Var2;
        boolean z2;
        int size;
        int h;
        RecyclerView recyclerView = this.i;
        if (i < 0 || i >= recyclerView.mState.b()) {
            StringBuilder s = b64.s(i, i, "Invalid item position ", Extension.O_BRAKE, "). Item count:");
            s.append(recyclerView.mState.b());
            s.append(recyclerView.exceptionLabel());
            throw new IndexOutOfBoundsException(s.toString());
        }
        int i7 = 1;
        if (recyclerView.mState.g) {
            ArrayList arrayList = this.b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                int i8 = 0;
                while (true) {
                    if (i8 < size) {
                        x0Var = (x0) this.b.get(i8);
                        if (!x0Var.V() && x0Var.G() == i) {
                            x0Var.D(32);
                            break;
                        }
                        i8++;
                    } else if (recyclerView.mAdapter.hasStableIds() && (h = recyclerView.mAdapterHelper.h(i, 0)) > 0 && h < recyclerView.mAdapter.getItemCount()) {
                        long itemId = recyclerView.mAdapter.getItemId(h);
                        for (int i9 = 0; i9 < size; i9++) {
                            x0 x0Var3 = (x0) this.b.get(i9);
                            if (!x0Var3.V() && x0Var3.x == itemId) {
                                x0Var3.D(32);
                                x0Var = x0Var3;
                                break;
                            }
                        }
                    }
                }
                if (x0Var != null) {
                    i2 = 1;
                    ArrayList arrayList2 = this.a;
                    ArrayList arrayList3 = this.c;
                    if (x0Var == null) {
                        int size2 = arrayList2.size();
                        for (int i10 = 0; i10 < size2; i10++) {
                            x0Var2 = (x0) arrayList2.get(i10);
                            if (!x0Var2.V() && x0Var2.G() == i && !x0Var2.L() && (recyclerView.mState.g || !x0Var2.N())) {
                                x0Var2.D(32);
                                break;
                            }
                        }
                        ArrayList arrayList4 = recyclerView.mChildHelper.c;
                        int size3 = arrayList4.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 >= size3) {
                                view = null;
                                break;
                            }
                            view = (View) arrayList4.get(i11);
                            x0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                            if (childViewHolderInt.G() == i && !childViewHolderInt.L() && !childViewHolderInt.N()) {
                                break;
                            }
                            i11++;
                        }
                        if (view != null) {
                            x0Var = RecyclerView.getChildViewHolderInt(view);
                            d dVar = recyclerView.mChildHelper;
                            jpb jpbVar = dVar.b;
                            int indexOfChild = ((RecyclerView) dVar.a.a).indexOfChild(view);
                            if (indexOfChild < 0) {
                                kbs.f(view, "view is not a child, cannot hide ");
                                return null;
                            }
                            if (!jpbVar.e(indexOfChild)) {
                                w511.v(view, "trying to unhide a view that was not hidden");
                                return null;
                            }
                            jpbVar.b(indexOfChild);
                            dVar.l(view);
                            int j6 = recyclerView.mChildHelper.j(view);
                            if (j6 == -1) {
                                StringBuilder sb = new StringBuilder("layout index should not be -1 after unhiding a view:");
                                sb.append(x0Var);
                                ny61.r(b64.g(recyclerView, sb));
                                return null;
                            }
                            recyclerView.mChildHelper.c(j6);
                            m(view);
                            x0Var.D(8224);
                        } else {
                            int size4 = arrayList3.size();
                            for (int i12 = 0; i12 < size4; i12++) {
                                x0Var2 = (x0) arrayList3.get(i12);
                                if (!x0Var2.L() && x0Var2.G() == i && !x0Var2.J()) {
                                    arrayList3.remove(i12);
                                    if (RecyclerView.sVerboseLoggingEnabled) {
                                        x0Var2.toString();
                                    }
                                    x0Var = x0Var2;
                                }
                            }
                            x0Var = null;
                        }
                        if (x0Var != null) {
                            if (!x0Var.N()) {
                                int i13 = x0Var.c;
                                if (i13 < 0 || i13 >= recyclerView.mAdapter.getItemCount()) {
                                    StringBuilder sb2 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                                    sb2.append(x0Var);
                                    ny61.m(b64.g(recyclerView, sb2));
                                    return null;
                                }
                                z2 = (recyclerView.mState.g || recyclerView.mAdapter.getItemViewType(x0Var.c) == x0Var.y) && (!recyclerView.mAdapter.hasStableIds() || x0Var.x == recyclerView.mAdapter.getItemId(x0Var.c));
                            } else {
                                if (RecyclerView.sDebugAssertionsEnabled && !recyclerView.mState.g) {
                                    ny61.r(b64.g(recyclerView, new StringBuilder("should not receive a removed view unless it is pre layout")));
                                    return null;
                                }
                                z2 = recyclerView.mState.g;
                            }
                            if (z2) {
                                i2 = 1;
                            } else {
                                x0Var.D(4);
                                if (x0Var.O()) {
                                    recyclerView.removeDetachedView(x0Var.a, false);
                                    x0Var.G.o(x0Var);
                                } else if (x0Var.V()) {
                                    x0Var.C &= -33;
                                }
                                l(x0Var);
                                x0Var = null;
                            }
                        }
                    }
                    if (x0Var != null) {
                        j2 = 3;
                        int h2 = recyclerView.mAdapterHelper.h(i, 0);
                        if (h2 < 0 || h2 >= recyclerView.mAdapter.getItemCount()) {
                            StringBuilder s2 = b64.s(i, h2, "Inconsistency detected. Invalid item position ", "(offset:", ").state:");
                            s2.append(recyclerView.mState.b());
                            s2.append(recyclerView.exceptionLabel());
                            throw new IndexOutOfBoundsException(s2.toString());
                        }
                        int itemViewType = recyclerView.mAdapter.getItemViewType(h2);
                        j3 = 4;
                        if (recyclerView.mAdapter.hasStableIds()) {
                            long itemId2 = recyclerView.mAdapter.getItemId(h2);
                            int size5 = arrayList2.size() - 1;
                            while (true) {
                                if (size5 >= 0) {
                                    j4 = 0;
                                    x0 x0Var4 = (x0) arrayList2.get(size5);
                                    i3 = i7;
                                    long j7 = x0Var4.x;
                                    View view2 = x0Var4.a;
                                    if (j7 == itemId2 && !x0Var4.V()) {
                                        if (itemViewType == x0Var4.y) {
                                            x0Var4.D(32);
                                            if (x0Var4.N() && !recyclerView.mState.g) {
                                                x0Var4.C = (x0Var4.C & (-15)) | 2;
                                            }
                                            x0Var = x0Var4;
                                        } else {
                                            arrayList2.remove(size5);
                                            recyclerView.removeDetachedView(view2, false);
                                            x0 childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view2);
                                            childViewHolderInt2.G = null;
                                            childViewHolderInt2.H = false;
                                            childViewHolderInt2.C &= -33;
                                            l(childViewHolderInt2);
                                        }
                                    }
                                    size5--;
                                    i7 = i3;
                                } else {
                                    i3 = i7;
                                    j4 = 0;
                                    int size6 = arrayList3.size() - 1;
                                    while (true) {
                                        if (size6 < 0) {
                                            break;
                                        }
                                        x0 x0Var5 = (x0) arrayList3.get(size6);
                                        if (x0Var5.x != itemId2 || x0Var5.J()) {
                                            size6--;
                                        } else if (itemViewType == x0Var5.y) {
                                            arrayList3.remove(size6);
                                            x0Var = x0Var5;
                                        } else {
                                            j(size6);
                                        }
                                    }
                                    x0Var = null;
                                }
                            }
                            if (x0Var != null) {
                                x0Var.c = h2;
                                i2 = i3;
                            }
                        } else {
                            i3 = 1;
                            j4 = 0;
                        }
                        if (x0Var == null && (lVar = this.h) != null && (a = lVar.a()) != null) {
                            x0Var = recyclerView.getChildViewHolder(a);
                            if (x0Var == null) {
                                ny61.g(b64.g(recyclerView, new StringBuilder("getViewForPositionAndType returned a view which does not have a ViewHolder")));
                                return null;
                            }
                            if (x0Var.U()) {
                                ny61.g(b64.g(recyclerView, new StringBuilder("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.")));
                                return null;
                            }
                        }
                        if (x0Var == null) {
                            int i14 = RecyclerView.HORIZONTAL;
                            x0 b = d().b(itemViewType);
                            if (b != null) {
                                b.S();
                                if (RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST) {
                                    View view3 = b.a;
                                    if (view3 instanceof ViewGroup) {
                                        f((ViewGroup) view3, false);
                                    }
                                }
                            }
                            x0Var = b;
                        }
                        if (x0Var == null) {
                            long nanoTime = recyclerView.getNanoTime();
                            if (j != ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
                                long j8 = this.g.c(itemViewType).c;
                                if (j8 != j4 && j8 + nanoTime >= j) {
                                    return null;
                                }
                            }
                            x0Var = recyclerView.mAdapter.createViewHolder(recyclerView, itemViewType);
                            if (RecyclerView.ALLOW_THREAD_GAP_WORK && (findNestedRecyclerView = RecyclerView.findNestedRecyclerView(x0Var.a)) != null) {
                                x0Var.b = new WeakReference(findNestedRecyclerView);
                            }
                            long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                            q0 c = this.g.c(itemViewType);
                            long j9 = c.c;
                            if (j9 != j4) {
                                nanoTime2 = (nanoTime2 / 4) + ((j9 / 4) * 3);
                            }
                            c.c = nanoTime2;
                        }
                    } else {
                        i3 = 1;
                        j2 = 3;
                        j3 = 4;
                        j4 = 0;
                    }
                    if (i2 != 0) {
                        RecyclerView.k kVar = recyclerView.mState;
                        if (!kVar.g) {
                            int i15 = x0Var.C;
                            if ((i15 & 8192) != 0) {
                                x0Var.C = i15 & (-8193);
                                if (kVar.j) {
                                    RecyclerView.c.e(x0Var);
                                    RecyclerView.c cVar = recyclerView.mItemAnimator;
                                    x0Var.H();
                                    cVar.getClass();
                                    RecyclerView.c.a aVar = new RecyclerView.c.a();
                                    View view4 = x0Var.a;
                                    aVar.a = view4.getLeft();
                                    aVar.b = view4.getTop();
                                    view4.getRight();
                                    view4.getBottom();
                                    recyclerView.recordAnimationInfoIfBouncedHiddenView(x0Var, aVar);
                                }
                            }
                        }
                    }
                    if (!recyclerView.mState.g && x0Var.K()) {
                        x0Var.z = i;
                    } else if (x0Var.K() || (x0Var.C & 2) != 0 || x0Var.L()) {
                        if (!RecyclerView.sDebugAssertionsEnabled && x0Var.N()) {
                            StringBuilder sb3 = new StringBuilder("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
                            sb3.append(x0Var);
                            ny61.r(b64.g(recyclerView, sb3));
                            return null;
                        }
                        z = false;
                        int h3 = recyclerView.mAdapterHelper.h(i, 0);
                        x0Var.L = null;
                        View view5 = x0Var.a;
                        x0Var.K = recyclerView;
                        int i16 = x0Var.y;
                        long nanoTime3 = recyclerView.getNanoTime();
                        if (j != ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
                            long j10 = this.g.c(i16).d;
                            if (j10 != j4 && j10 + nanoTime3 >= j) {
                                i6 = 0;
                                i5 = i3;
                                View view6 = x0Var.a;
                                layoutParams = view6.getLayoutParams();
                                if (layoutParams != null) {
                                    layoutParams2 = (RecyclerView.LayoutParams) recyclerView.generateDefaultLayoutParams();
                                    view6.setLayoutParams(layoutParams2);
                                } else if (recyclerView.checkLayoutParams(layoutParams)) {
                                    layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
                                } else {
                                    layoutParams2 = (RecyclerView.LayoutParams) recyclerView.generateLayoutParams(layoutParams);
                                    view6.setLayoutParams(layoutParams2);
                                }
                                layoutParams2.mViewHolder = x0Var;
                                layoutParams2.mPendingInvalidate = (i2 != 0 || i6 == 0) ? z : i5;
                                return x0Var;
                            }
                        }
                        if (x0Var.P()) {
                            i4 = 0;
                        } else {
                            recyclerView.attachViewToParent(view5, recyclerView.getChildCount(), view5.getLayoutParams());
                            i4 = i3;
                        }
                        recyclerView.mAdapter.bindViewHolder(x0Var, h3);
                        if (i4 != 0) {
                            recyclerView.detachViewFromParent(view5);
                        }
                        long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
                        q0 c2 = this.g.c(x0Var.y);
                        j5 = c2.d;
                        if (j5 != j4) {
                            nanoTime4 = (nanoTime4 / j3) + ((j5 / j3) * j2);
                        }
                        c2.d = nanoTime4;
                        if (recyclerView.isAccessibilityEnabled()) {
                            i5 = i3;
                        } else {
                            if (view5.getImportantForAccessibility() == 0) {
                                i5 = i3;
                                view5.setImportantForAccessibility(i5);
                            } else {
                                i5 = i3;
                            }
                            z0 z0Var = recyclerView.mAccessibilityDelegate;
                            if (z0Var != null) {
                                AccessibilityDelegateCompat a2 = z0Var.a();
                                if (a2 instanceof y0) {
                                    y0 y0Var = (y0) a2;
                                    AccessibilityDelegateCompat f = androidx.core.view.b.f(view5);
                                    if (f != null && f != y0Var) {
                                        y0Var.b.put(view5, f);
                                    }
                                }
                                androidx.core.view.b.p(view5, a2);
                            }
                        }
                        if (recyclerView.mState.g) {
                            x0Var.z = i;
                        }
                        i6 = i5;
                        View view62 = x0Var.a;
                        layoutParams = view62.getLayoutParams();
                        if (layoutParams != null) {
                        }
                        layoutParams2.mViewHolder = x0Var;
                        layoutParams2.mPendingInvalidate = (i2 != 0 || i6 == 0) ? z : i5;
                        return x0Var;
                    }
                    i5 = i3;
                    i6 = 0;
                    z = false;
                    View view622 = x0Var.a;
                    layoutParams = view622.getLayoutParams();
                    if (layoutParams != null) {
                    }
                    layoutParams2.mViewHolder = x0Var;
                    layoutParams2.mPendingInvalidate = (i2 != 0 || i6 == 0) ? z : i5;
                    return x0Var;
                }
            }
            x0Var = null;
            if (x0Var != null) {
            }
        } else {
            x0Var = null;
        }
        i2 = 0;
        ArrayList arrayList22 = this.a;
        ArrayList arrayList32 = this.c;
        if (x0Var == null) {
        }
        if (x0Var != null) {
        }
        if (i2 != 0) {
        }
        if (!recyclerView.mState.g) {
        }
        if (x0Var.K()) {
        }
        if (!RecyclerView.sDebugAssertionsEnabled) {
        }
        z = false;
        int h32 = recyclerView.mAdapterHelper.h(i, 0);
        x0Var.L = null;
        View view52 = x0Var.a;
        x0Var.K = recyclerView;
        int i162 = x0Var.y;
        long nanoTime32 = recyclerView.getNanoTime();
        if (j != ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
        }
        if (x0Var.P()) {
        }
        recyclerView.mAdapter.bindViewHolder(x0Var, h32);
        if (i4 != 0) {
        }
        long nanoTime42 = recyclerView.getNanoTime() - nanoTime32;
        q0 c22 = this.g.c(x0Var.y);
        j5 = c22.d;
        if (j5 != j4) {
        }
        c22.d = nanoTime42;
        if (recyclerView.isAccessibilityEnabled()) {
        }
        if (recyclerView.mState.g) {
        }
        i6 = i5;
        View view6222 = x0Var.a;
        layoutParams = view6222.getLayoutParams();
        if (layoutParams != null) {
        }
        layoutParams2.mViewHolder = x0Var;
        layoutParams2.mPendingInvalidate = (i2 != 0 || i6 == 0) ? z : i5;
        return x0Var;
    }

    public final void o(x0 x0Var) {
        if (x0Var.H) {
            this.b.remove(x0Var);
        } else {
            this.a.remove(x0Var);
        }
        x0Var.G = null;
        x0Var.H = false;
        x0Var.C &= -33;
    }

    public final void p() {
        RecyclerView.e eVar = this.i.mLayout;
        this.f = this.e + (eVar != null ? eVar.D : 0);
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f; size--) {
            j(size);
        }
    }
}
