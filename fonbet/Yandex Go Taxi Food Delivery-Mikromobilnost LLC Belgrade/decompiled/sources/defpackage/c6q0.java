package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import flex.engine.section.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes9.dex */
public final /* synthetic */ class c6q0 {
    public final /* synthetic */ c a;

    public /* synthetic */ c6q0(c cVar) {
        this.a = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x012e, code lost:
    
        if (r4 != null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0131, code lost:
    
        r10 = ((androidx.recyclerview.widget.RecyclerView.LayoutParams) r4.getLayoutParams()).getViewLayoutPosition();
        r9 = r9.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x013d, code lost:
    
        if (r9 == null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x013f, code lost:
    
        r9.smoothScrollToPosition(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0142, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(List list, boolean z) {
        just.adapter.snapping.c cVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView.e layoutManager;
        a2t0 a2t0Var;
        q7o q7oVar;
        xke xkeVar;
        b4q0 b4q0Var;
        c cVar2 = this.a;
        l0z l0zVar = cVar2.l0;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ycc.r(((b4q0) it.next()).b, arrayList);
        }
        boolean n = cVar2.n(arrayList, z);
        int i = 0;
        l0zVar.e = false;
        View view = null;
        l0zVar.c = null;
        l0zVar.d = null;
        if (n && l0zVar.b != null && !l0zVar.a && (b4q0Var = (b4q0) a.b0(list)) != null) {
            String a = b4q0Var.a.b.getA();
            pyp0 pyp0Var = l0zVar.b;
            if (jl40.l(a, pyp0Var != null ? pyp0Var.getA() : null)) {
                int size = list.size() - 1;
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    i2 += ((b4q0) list.get(i3)).b.size();
                }
                if (b4q0Var.b.size() != 0) {
                    l0zVar.c = Integer.valueOf(i2);
                    l0zVar.d = Integer.valueOf((i2 + r10) - 1);
                }
            }
        }
        if (cVar2.n(arrayList, z)) {
            u0x u0xVar = (u0x) a.b0(arrayList);
            u0x a2 = u0xVar instanceof i3x ? u0xVar : ((l0zVar.b == null || l0zVar.a) && (xkeVar = cVar2.y) != null) ? ((yke) xkeVar).a(arrayList) : null;
            if (u0xVar != a2 && a2 != null) {
                arrayList = a.o0(arrayList, a2);
            }
        }
        if (!cVar2.A.a && (q7oVar = cVar2.z) != null) {
            arrayList = a.o0(arrayList, ((r7o) q7oVar).a(arrayList, new a6q0(cVar2, 6)));
        }
        cVar2.J.g(arrayList);
        if (cVar2.a.d && (cVar = cVar2.Q) != null && (recyclerView = cVar.j) != null && recyclerView.getScrollState() == 0 && (recyclerView2 = cVar.j) != null && (layoutManager = recyclerView2.getLayoutManager()) != null) {
            int d0 = layoutManager.d0();
            while (true) {
                if (i >= d0) {
                    break;
                }
                int i4 = i + 1;
                View c0 = layoutManager.c0(i);
                if (c0 != null && (a2t0Var = (a2t0) cVar.a.invoke(c0)) != null && a2t0Var.d()) {
                    if (c0.getTop() > 0) {
                        view = c0;
                        break;
                    } else if (c0.getTop() == 0) {
                        return;
                    }
                }
                i = i4;
            }
        }
    }
}
