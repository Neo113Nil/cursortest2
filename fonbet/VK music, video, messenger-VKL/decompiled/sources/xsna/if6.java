package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: BaseItemsFactory.kt */
/* loaded from: classes5.dex */
public abstract class if6<T> {
    public final Context a;
    public final Resources b;

    /* compiled from: BaseItemsFactory.kt */
    public static abstract class a {
        public int a;
        public int b;
        public boolean c = true;
        public int d;

        public final void a(List list, boolean z) {
            int size = list.size();
            if (size == 0) {
                return;
            }
            if (this.c) {
                int size2 = list.size();
                if (size2 == 1) {
                    ((we6) list.get(0)).i(6);
                } else {
                    for (int i = 0; i < size2; i++) {
                        if (((we6) list.get(i)).b() == 0) {
                            if (i == 0 || ((we6) list.get(i - 1)).b() == 4) {
                                ((we6) list.get(i)).i(2);
                            } else if (i == size2 - 1) {
                                ((we6) list.get(i)).i(4);
                            } else {
                                ((we6) list.get(i)).i(1);
                            }
                        }
                    }
                }
            }
            if (this.d != 0 && !z) {
                ((we6) list.get(0)).j(this.d);
            }
            if (this.b != 0) {
                ((we6) list.get(size - 1)).d = this.b;
            }
            if (this.a != 0) {
                ((we6) list.get(0)).e = this.a;
            }
        }
    }

    /* compiled from: BaseItemsFactory.kt */
    public static final class b extends a {
        public final List<we6> e;

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends we6> list) {
            this.e = list;
        }
    }

    /* compiled from: BaseItemsFactory.kt */
    public final class c extends a {
        public final d<T>[] e;

        public c(d... dVarArr) {
            this.e = dVarArr;
        }
    }

    /* compiled from: BaseItemsFactory.kt */
    public static abstract class d<T> {
        public abstract List<we6> a(T t);
    }

    /* compiled from: BaseItemsFactory.kt */
    public static final class e extends RecyclerView.n {
        public final gzs<List<z8l>> b;

        /* JADX WARN: Multi-variable type inference failed */
        public e(gzs<? extends List<? extends z8l>> gzsVar) {
            this.b = gzsVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            int childLayoutPosition = recyclerView.getChildLayoutPosition(view);
            List<z8l> invoke = this.b.invoke();
            if (invoke == null || invoke.isEmpty() || childLayoutPosition >= invoke.size()) {
                return;
            }
            z8l z8lVar = invoke.get(childLayoutPosition);
            rect.bottom = z8lVar.getPaddingBottom();
            rect.top = z8lVar.getPaddingTop();
            rect.left = 0;
            rect.right = 0;
        }
    }

    /* compiled from: BaseItemsFactory.kt */
    public final class f extends d<T> {
        public final izs<T, List<we6>> a;

        public f(izs izsVar) {
            this.a = izsVar;
        }

        @Override // xsna.if6.d
        public final List<we6> a(T t) {
            return this.a.invoke(t);
        }
    }

    /* compiled from: BaseItemsFactory.kt */
    public final class g extends d<T> {
        public final izs<T, we6> a;

        public g(izs izsVar) {
            this.a = izsVar;
        }

        @Override // xsna.if6.d
        public final List<we6> a(T t) {
            we6 invoke = this.a.invoke(t);
            if (invoke == null) {
                return null;
            }
            return Collections.singletonList(invoke);
        }
    }

    public if6(Context context) {
        this.a = context;
        this.b = context.getResources();
    }

    public abstract if6<T>.c[] a(T t);

    /* JADX WARN: Multi-variable type inference failed */
    public final ArrayList b(Object obj) {
        ArrayList arrayList = new ArrayList();
        if (obj != 0) {
            for (c cVar : a(obj)) {
                cVar.getClass();
                ArrayList arrayList2 = new ArrayList();
                for (d<T> dVar : cVar.e) {
                    List<we6> a2 = dVar.a(obj);
                    if (a2 != null) {
                        arrayList2.addAll(a2);
                    }
                }
                cVar.a(arrayList2, false);
                arrayList.addAll(arrayList2);
            }
        }
        return arrayList;
    }
}
