package xsna;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.feed.design.view.newsfeed.list.FeedRecyclerView;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: FeedOverlayComponentRendererDecoration.kt */
/* loaded from: classes4.dex */
public final class b2r extends RecyclerView.n implements i290 {
    public final FeedRecyclerView b;
    public final ho60 c;
    public final Rect d = new Rect();
    public final Rect e = new Rect();
    public final ne7 f = new ne7();
    public final vfe g = new vfe(9);
    public final LinkedHashMap h = new LinkedHashMap();
    public final LinkedHashMap i = new LinkedHashMap();
    public final a2r j = new a2r(this);

    public b2r(FeedRecyclerView feedRecyclerView, ho60 ho60Var) {
        this.b = feedRecyclerView;
        this.c = ho60Var;
    }

    @Override // xsna.i290
    public final void clear() {
        this.i.clear();
        ((SparseArray) this.g.b).clear();
    }

    @Override // xsna.i290
    public final void d(List<? extends qyp0> list) {
        this.i.clear();
        for (qyp0 qyp0Var : list) {
            LinkedHashMap linkedHashMap = this.h;
            if (!linkedHashMap.containsKey(qyp0Var)) {
                linkedHashMap.remove(qyp0Var);
            }
            ho60 ho60Var = this.c;
            if (!ho60Var.e.contains(qyp0Var)) {
                ho60Var.e.add(qyp0Var);
            }
        }
        n();
    }

    public final void l(pyp0 pyp0Var, qyp0 qyp0Var) {
        if (pyp0Var != null) {
            pyp0Var.detach();
        }
        this.h.remove(qyp0Var);
        LinkedHashMap linkedHashMap = this.i;
        linkedHashMap.remove(qyp0Var);
        View view = (View) linkedHashMap.get(qyp0Var);
        if (view != null) {
            view.removeOnAttachStateChangeListener(this.j);
        }
        if (pyp0Var != null) {
            SparseArray sparseArray = (SparseArray) this.g.b;
            svb0 svb0Var = (svb0) sparseArray.get(pyp0Var.b());
            if (svb0Var == null) {
                svb0Var = new tvb0(10);
            }
            sparseArray.append(pyp0Var.b(), svb0Var);
            svb0Var.a(pyp0Var);
        }
    }

    public final void m(izs<? super pyp0, Boolean> izsVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : this.h.entrySet()) {
            if (izsVar.invoke(entry.getValue()).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            ((pyp0) ((Map.Entry) it.next()).getValue()).hide();
        }
    }

    public final void n() {
        this.b.postInvalidate();
    }

    public final pyp0 o(float f, float f2) {
        for (pyp0 pyp0Var : this.h.values()) {
            if (pyp0Var.l(f, f2)) {
                return pyp0Var;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bf, code lost:
    
        if (r5 != null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c3, code lost:
    
        r5.itemView.addOnAttachStateChangeListener(r17.j);
        p(r7, r5.itemView);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e7, code lost:
    
        if (r7.k().a(r9.getTop(), r9.getBottom(), r8.bottom, r8.top, r7.getPaddingBottom()) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ff, code lost:
    
        l(r7, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e9, code lost:
    
        r8 = r5.itemView;
        r7.d(r17);
        r7.j(r3, r5);
        r7.f(r8);
        r6.put(r3, r7);
        r4.put(r3, r8);
        r7.draw(r18);
     */
    @Override // androidx.recyclerview.widget.RecyclerView.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        pyp0 aVar;
        for (qyp0 qyp0Var : this.c.e) {
            LinkedHashMap linkedHashMap = this.i;
            View view = (View) linkedHashMap.get(qyp0Var);
            LinkedHashMap linkedHashMap2 = this.h;
            pyp0 pyp0Var = (pyp0) linkedHashMap2.get(qyp0Var);
            Rect rect = this.d;
            FeedRecyclerView feedRecyclerView = this.b;
            if (view == null || pyp0Var == null) {
                RecyclerView.e0 e0Var = null;
                if (pyp0Var == null) {
                    svb0 svb0Var = (svb0) ((SparseArray) this.g.b).get(qyp0Var.a);
                    pyp0Var = svb0Var != null ? (pyp0) svb0Var.c() : null;
                    if (pyp0Var == null) {
                        int i = qyp0Var.a;
                        recyclerView.getContext();
                        this.f.getClass();
                        if (i == 0) {
                            aVar = new com.vk.newsfeed.impl.recycler.decorations.components.on_media_like.a();
                        } else {
                            if (i != 1) {
                                throw new IllegalArgumentException(lhg.a(i, "Unsupported component type "));
                            }
                            aVar = new a880();
                        }
                        aVar.g(i);
                        pyp0Var = aVar;
                    }
                }
                int i2 = 0;
                while (true) {
                    if (i2 >= feedRecyclerView.getChildCount()) {
                        break;
                    }
                    int i3 = i2 + 1;
                    View childAt = feedRecyclerView.getChildAt(i2);
                    if (childAt == null) {
                        throw new IndexOutOfBoundsException();
                    }
                    RecyclerView.e0 childViewHolder = feedRecyclerView.getChildViewHolder(childAt);
                    if (pyp0Var.i(qyp0Var, childViewHolder)) {
                        e0Var = childViewHolder;
                        break;
                    }
                    i2 = i3;
                }
            } else {
                p(pyp0Var, view);
                if (pyp0Var.k().a(feedRecyclerView.getTop(), feedRecyclerView.getBottom(), rect.bottom, rect.top, pyp0Var.getPaddingBottom())) {
                    pyp0Var.draw(canvas);
                } else {
                    l(pyp0Var, qyp0Var);
                }
            }
        }
    }

    public final void p(pyp0 pyp0Var, View view) {
        FeedRecyclerView feedRecyclerView = this.b;
        Rect rect = this.e;
        feedRecyclerView.getDecoratedBoundsWithMargins(view, rect);
        rect.offset((int) view.getTranslationX(), (int) view.getTranslationY());
        rect.set(pyp0Var.getPaddingStart() + rect.left, rect.top, rect.right, rect.bottom - pyp0Var.getPaddingBottom());
        Gravity.apply(pyp0Var.c(), pyp0Var.getWidth(), pyp0Var.getHeight(), this.e, this.d, feedRecyclerView.getLayoutDirection());
        Rect rect2 = this.d;
        pyp0Var.n(rect2.left, rect2.right, rect2.top, rect2.bottom);
    }

    public final void q(qyp0 qyp0Var, qyp0 qyp0Var2) {
        this.b.post(new z1r(this, qyp0Var, qyp0Var2, 0));
    }
}
