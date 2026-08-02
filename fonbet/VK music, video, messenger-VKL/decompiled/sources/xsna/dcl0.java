package xsna;

import android.graphics.Rect;
import android.os.Handler;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashMap;
import java.util.Map;
import xsna.dcl0;

/* compiled from: StickersRecyclerItemVisibilityTracker.kt */
/* loaded from: classes6.dex */
public final class dcl0<T> extends RecyclerView.t {
    public final RecyclerView b;
    public final Map<Class<? extends RecyclerView.e0>, a<T>> c;
    public final sxm d;
    public boolean g;
    public final Handler e = i0q0.a();
    public final LinkedHashMap f = new LinkedHashMap();
    public final LinkedHashMap h = new LinkedHashMap();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StickersRecyclerItemVisibilityTracker.kt */
    public static final class b {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b NOT_VISIBLE;
        public static final b TRACKED;
        public static final b VISIBLE;

        static {
            b bVar = new b("NOT_VISIBLE", 0);
            NOT_VISIBLE = bVar;
            b bVar2 = new b("VISIBLE", 1);
            VISIBLE = bVar2;
            b bVar3 = new b("TRACKED", 2);
            TRACKED = bVar3;
            b[] bVarArr = {bVar, bVar2, bVar3};
            $VALUES = bVarArr;
            $ENTRIES = new asp(bVarArr);
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    public dcl0(RecyclerView recyclerView, Map<Class<? extends RecyclerView.e0>, a<T>> map, sxm sxmVar) {
        this.b = recyclerView;
        this.c = map;
        this.d = sxmVar;
    }

    public static boolean n(View view) {
        Rect rect = new Rect();
        return view.getGlobalVisibleRect(rect) && rect.height() == view.getHeight() && rect.width() == view.getWidth();
    }

    public final void l(final int i, View view, RecyclerView.e0 e0Var) {
        final a<T> aVar = this.c.get(e0Var.getClass());
        Handler handler = this.e;
        LinkedHashMap linkedHashMap = this.f;
        LinkedHashMap linkedHashMap2 = this.h;
        if (aVar == null || !n(view)) {
            if (linkedHashMap2.get(Integer.valueOf(i)) == b.VISIBLE) {
                Runnable runnable = (Runnable) linkedHashMap.get(Integer.valueOf(i));
                if (runnable != null) {
                    handler.removeCallbacks(runnable);
                }
                linkedHashMap.remove(Integer.valueOf(i));
            }
            linkedHashMap2.put(Integer.valueOf(i), b.NOT_VISIBLE);
            return;
        }
        if (linkedHashMap2.get(Integer.valueOf(i)) == b.NOT_VISIBLE || linkedHashMap2.get(Integer.valueOf(i)) == null) {
            final hfz hfzVar = this.d.getItems().get(i);
            if (hfzVar == null) {
                hfzVar = null;
            }
            if (hfzVar == null || !aVar.c.invoke(hfzVar).booleanValue()) {
                return;
            }
            Runnable runnable2 = new Runnable() { // from class: xsna.ccl0
                @Override // java.lang.Runnable
                public final void run() {
                    u4u0<T> u4u0Var = dcl0.a.this.b;
                    dcl0 dcl0Var = this;
                    boolean z = !dcl0Var.g;
                    int i2 = i;
                    u4u0Var.e(i2, hfzVar, z);
                    dcl0Var.h.put(Integer.valueOf(i2), dcl0.b.TRACKED);
                }
            };
            linkedHashMap.put(Integer.valueOf(i), runnable2);
            handler.postDelayed(runnable2, aVar.a);
            linkedHashMap2.put(Integer.valueOf(i), b.VISIBLE);
        }
    }

    public final void m() {
        RecyclerView recyclerView;
        RecyclerView.o layoutManager;
        if (this.c.isEmpty() || (layoutManager = (recyclerView = this.b).getLayoutManager()) == null) {
            return;
        }
        RecyclerView.o layoutManager2 = recyclerView.getLayoutManager();
        GridLayoutManager gridLayoutManager = layoutManager2 instanceof GridLayoutManager ? (GridLayoutManager) layoutManager2 : null;
        int childCount = layoutManager.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = layoutManager.getChildAt(i);
            if (childAt != null) {
                RecyclerView.e0 childViewHolder = recyclerView.getChildViewHolder(childAt);
                int absoluteAdapterPosition = childViewHolder.getAbsoluteAdapterPosition();
                if (gridLayoutManager == null) {
                    l(absoluteAdapterPosition, childAt, childViewHolder);
                } else if (gridLayoutManager.x.b(absoluteAdapterPosition, gridLayoutManager.s) == 0) {
                    l(absoluteAdapterPosition, childAt, childViewHolder);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (i == 1) {
            this.g = true;
        }
        if (i == 0) {
            m();
            this.g = false;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        m();
    }

    /* compiled from: StickersRecyclerItemVisibilityTracker.kt */
    public static final class a<T> {
        public final long a;
        public final u4u0<T> b;
        public final izs<T, Boolean> c;

        public a(u4u0 u4u0Var, izs izsVar) {
            this.a = 400L;
            this.b = u4u0Var;
            this.c = izsVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TrackingConfig(visibilityDuration=");
            sb.append(this.a);
            sb.append(", callback=");
            sb.append(this.b);
            sb.append(", isShouldTrack=");
            return up.c(sb, this.c, ')');
        }

        public /* synthetic */ a(u4u0 u4u0Var) {
            this(u4u0Var, new a60(1));
        }
    }
}
