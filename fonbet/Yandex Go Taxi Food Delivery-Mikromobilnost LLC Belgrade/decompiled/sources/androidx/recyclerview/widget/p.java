package androidx.recyclerview.widget;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.its;
import defpackage.ny61;
import defpackage.y0u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes.dex */
public final class p implements Runnable {
    public static final ThreadLocal x = new ThreadLocal();
    public static final y0u y = new y0u(6);
    public long b;
    public long c;
    public final ArrayList a = new ArrayList();
    public final ArrayList w = new ArrayList();

    public static x0 c(RecyclerView recyclerView, int i, long j) {
        int h = recyclerView.mChildHelper.h();
        for (int i2 = 0; i2 < h; i2++) {
            x0 childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.g(i2));
            if (childViewHolderInt.c == i && !childViewHolderInt.L()) {
                return null;
            }
        }
        r0 r0Var = recyclerView.mRecycler;
        if (j == ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
            try {
                if (Trace.isEnabled()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } catch (Throwable th) {
                recyclerView.onExitLayoutOrScroll(false);
                Trace.endSection();
                throw th;
            }
        }
        recyclerView.onEnterLayoutOrScroll();
        x0 n = r0Var.n(i, j);
        if (n != null) {
            if (!n.K() || n.L()) {
                r0Var.a(n, false);
            } else {
                r0Var.k(n.a);
            }
        }
        recyclerView.onExitLayoutOrScroll(false);
        Trace.endSection();
        return n;
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.sDebugAssertionsEnabled && !this.a.contains(recyclerView)) {
                ny61.r("attempting to post unregistered view!");
                return;
            } else if (this.b == 0) {
                this.b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        o oVar = recyclerView.mPrefetchRegistry;
        oVar.a = i;
        oVar.b = i2;
    }

    public final void b(long j) {
        its itsVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        its itsVar2;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                recyclerView3.mPrefetchRegistry.b(recyclerView3, false);
                i += recyclerView3.mPrefetchRegistry.d;
            }
        }
        ArrayList arrayList2 = this.w;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i3);
            if (recyclerView4.getWindowVisibility() == 0) {
                o oVar = recyclerView4.mPrefetchRegistry;
                int abs = Math.abs(oVar.b) + Math.abs(oVar.a);
                int i5 = z ? 1 : 0;
                while (i5 < oVar.d * 2) {
                    if (i4 >= arrayList2.size()) {
                        itsVar2 = new its();
                        arrayList2.add(itsVar2);
                    } else {
                        itsVar2 = (its) arrayList2.get(i4);
                    }
                    int[] iArr = oVar.c;
                    int i6 = iArr[i5 + 1];
                    if (i6 <= abs) {
                        z = true;
                    }
                    itsVar2.a = z;
                    itsVar2.b = abs;
                    itsVar2.c = i6;
                    itsVar2.d = recyclerView4;
                    itsVar2.e = iArr[i5];
                    i4++;
                    i5 += 2;
                    z = false;
                }
            }
            i3++;
            z = false;
        }
        Collections.sort(arrayList2, y);
        for (int i7 = 0; i7 < arrayList2.size() && (recyclerView = (itsVar = (its) arrayList2.get(i7)).d) != null; i7++) {
            x0 c = c(recyclerView, itsVar.e, itsVar.a ? Long.MAX_VALUE : j);
            if (c != null && c.b != null && c.K() && !c.L() && (recyclerView2 = (RecyclerView) c.b.get()) != null) {
                if (recyclerView2.mDataSetHasChangedAfterLayout && recyclerView2.mChildHelper.h() != 0) {
                    recyclerView2.removeAndRecycleViews();
                }
                o oVar2 = recyclerView2.mPrefetchRegistry;
                oVar2.b(recyclerView2, true);
                if (oVar2.d != 0) {
                    try {
                        Trace.beginSection(j == ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED ? "RV Nested Prefetch" : "RV Nested Prefetch forced - needed next frame");
                        RecyclerView.k kVar = recyclerView2.mState;
                        RecyclerView.Adapter adapter = recyclerView2.mAdapter;
                        kVar.d = 1;
                        kVar.e = adapter.getItemCount();
                        kVar.g = false;
                        kVar.h = false;
                        kVar.i = false;
                        for (int i8 = 0; i8 < oVar2.d * 2; i8 += 2) {
                            c(recyclerView2, oVar2.c[i8], j);
                        }
                        itsVar.a();
                    } finally {
                        Trace.endSection();
                    }
                }
            }
            itsVar.a();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.a;
        try {
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(j) + this.c);
                }
            }
        } finally {
            this.b = 0L;
            Trace.endSection();
        }
    }
}
