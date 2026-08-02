package defpackage;

import android.content.Context;
import android.view.View;
import androidx.core.view.b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.b0t0;
import defpackage.gki0;
import defpackage.kki0;
import flex.scroll.RecyclerViewSmoothScrollExtKt$smoothScrollToPosition$lambda$2$$inlined$doOnLayout$1;
import java.util.WeakHashMap;

/* loaded from: classes9.dex */
public abstract class kki0 {
    public static final Integer a(gki0 gki0Var) {
        Integer valueOf = Integer.valueOf(gki0Var.b());
        if (valueOf.intValue() != -1) {
            return valueOf;
        }
        return null;
    }

    public static final void b(RecyclerView recyclerView, int i, int i2) {
        if (i > i2 + 40) {
            recyclerView.scrollToPosition(i - 40);
        } else if (i < i2 - 40) {
            recyclerView.scrollToPosition(i + 40);
        }
    }

    public static final void c(final RecyclerView recyclerView, final b0t0 b0t0Var, final int i) {
        final gki0 gki0Var;
        Object layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            gki0Var = h2b1.j((LinearLayoutManager) layoutManager);
        } else if (!(layoutManager instanceof gki0)) {
            return;
        } else {
            gki0Var = (gki0) layoutManager;
        }
        Integer a = a(gki0Var);
        if (a != null) {
            b(recyclerView, i, a.intValue());
            WeakHashMap weakHashMap = b.a;
            if (!recyclerView.isLaidOut() || recyclerView.isLayoutRequested()) {
                recyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: flex.scroll.RecyclerViewSmoothScrollExtKt$smoothScrollToPosition$$inlined$doOnLayout$2
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                        view.removeOnLayoutChangeListener(this);
                        gki0 gki0Var2 = gki0.this;
                        Context context = recyclerView.getContext();
                        b0t0 b0t0Var2 = b0t0Var;
                        int i2 = i;
                        RecyclerView.j jVar = b0t0Var2.get(context);
                        jVar.a = i2;
                        gki0Var2.v(jVar);
                    }
                });
                return;
            }
            RecyclerView.j jVar = b0t0Var.get(recyclerView.getContext());
            jVar.a = i;
            gki0Var.v(jVar);
            return;
        }
        WeakHashMap weakHashMap2 = b.a;
        if (!recyclerView.isLaidOut() || recyclerView.isLayoutRequested()) {
            recyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: flex.scroll.RecyclerViewSmoothScrollExtKt$smoothScrollToPosition$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    Integer a2 = kki0.a(gki0.this);
                    if (a2 != null) {
                        kki0.b(recyclerView, i, a2.intValue());
                    }
                    RecyclerView recyclerView2 = recyclerView;
                    WeakHashMap weakHashMap3 = b.a;
                    if (!recyclerView2.isLaidOut() || recyclerView2.isLayoutRequested()) {
                        recyclerView2.addOnLayoutChangeListener(new RecyclerViewSmoothScrollExtKt$smoothScrollToPosition$lambda$2$$inlined$doOnLayout$1(gki0.this, recyclerView, b0t0Var, i));
                        return;
                    }
                    gki0 gki0Var2 = gki0.this;
                    Context context = recyclerView.getContext();
                    b0t0 b0t0Var2 = b0t0Var;
                    int i2 = i;
                    RecyclerView.j jVar2 = b0t0Var2.get(context);
                    jVar2.a = i2;
                    gki0Var2.v(jVar2);
                }
            });
            return;
        }
        Integer a2 = a(gki0Var);
        if (a2 != null) {
            b(recyclerView, i, a2.intValue());
        }
        if (!recyclerView.isLaidOut() || recyclerView.isLayoutRequested()) {
            recyclerView.addOnLayoutChangeListener(new RecyclerViewSmoothScrollExtKt$smoothScrollToPosition$lambda$2$$inlined$doOnLayout$1(gki0Var, recyclerView, b0t0Var, i));
            return;
        }
        RecyclerView.j jVar2 = b0t0Var.get(recyclerView.getContext());
        jVar2.a = i;
        gki0Var.v(jVar2);
    }
}
