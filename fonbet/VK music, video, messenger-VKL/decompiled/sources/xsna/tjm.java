package xsna;

import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.im.ui.views.dialogs.DialogSkeletonView;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: View.kt */
/* loaded from: classes2.dex */
public final class tjm implements Runnable {
    public final /* synthetic */ DialogSkeletonView.a b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;

    public tjm(DialogSkeletonView.a aVar, DialogSkeletonView.a aVar2, boolean z, int i) {
        this.b = aVar2;
        this.c = z;
        this.d = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b6 A[LOOP:6: B:65:0x00b6->B:67:0x00bc, LOOP_START, PHI: r4
      0x00b6: PHI (r4v1 int) = (r4v0 int), (r4v2 int) binds: [B:52:0x009b, B:67:0x00bc] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        DialogSkeletonView.a aVar = this.b;
        int i2 = aVar.c;
        DialogSkeletonView dialogSkeletonView = DialogSkeletonView.this;
        int i3 = 0;
        if (this.c) {
            int i4 = 0;
            while (true) {
                i4 += i2;
                if (i4 - i2 >= this.d) {
                    break;
                } else {
                    i3++;
                }
            }
        } else {
            ViewParent parent = dialogSkeletonView.getParent();
            RecyclerView recyclerView = parent instanceof RecyclerView ? (RecyclerView) parent : null;
            if (recyclerView != null) {
                RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager != null) {
                    k9x k9xVar = new k9x(0, linearLayoutManager.x() - linearLayoutManager.v(), 1);
                    ArrayList arrayList = new ArrayList();
                    j9x it = k9xVar.iterator();
                    while (it.d) {
                        View childAt = linearLayoutManager.getChildAt(it.nextInt());
                        if (childAt != null) {
                            arrayList.add(childAt);
                        }
                    }
                    int height = recyclerView.getHeight();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (!epx.f((View) next, dialogSkeletonView)) {
                            arrayList2.add(next);
                        }
                    }
                    Iterator it3 = arrayList2.iterator();
                    int i5 = 0;
                    while (it3.hasNext()) {
                        i5 += ((View) it3.next()).getMeasuredHeight();
                    }
                    i = height - i5;
                    if (i <= 0) {
                        int i6 = 0;
                        int i7 = 0;
                        while (true) {
                            i7 += i2;
                            if (i7 >= i) {
                                break;
                            } else {
                                i6++;
                            }
                        }
                        if (i6 < dialogSkeletonView.getSkeletonCount()) {
                            while (i3 < dialogSkeletonView.getSkeletonCount()) {
                                i3++;
                            }
                        } else {
                            i3 = i6;
                        }
                    } else {
                        while (i3 < dialogSkeletonView.getSkeletonCount()) {
                            i3++;
                        }
                    }
                }
            }
            i = 0;
            if (i <= 0) {
            }
        }
        DialogSkeletonView.b bVar = aVar.b;
        int i8 = bVar.c;
        if (i8 != i3) {
            if (i8 != i3) {
                bVar.c = i3;
                bVar.notifyDataSetChanged();
            }
            aVar.requestLayout();
        }
    }
}
