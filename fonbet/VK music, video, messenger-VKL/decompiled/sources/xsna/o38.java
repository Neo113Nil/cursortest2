package xsna;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import xsna.n38;

/* compiled from: BottomActionAdapterWithCommunityImpl.kt */
/* loaded from: classes6.dex */
public final class o38 extends n38 {
    public static final int e = cn70.b(266);
    public final izs<UserId, s3q0> c;
    public List<q38> d;

    /* JADX WARN: Multi-variable type inference failed */
    public o38(izs<? super UserId, s3q0> izsVar) {
        this.c = izsVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        List<q38> list = this.d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(n38.a aVar, int i) {
        q38 q38Var;
        n38.a aVar2 = aVar;
        List<q38> list = this.d;
        if (list == null || (q38Var = (q38) j5g.b0(i, list)) == null) {
            return;
        }
        aVar2.V5(q38Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final n38.a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(viewGroup, this.c);
    }

    /* compiled from: BottomActionAdapterWithCommunityImpl.kt */
    public static final class a extends n38.a {
        public final izs<UserId, s3q0> l;
        public final t38 m;
        public final b n;
        public final RecyclerView o;

        /* JADX WARN: Multi-variable type inference failed */
        public a(ViewGroup viewGroup, izs<? super UserId, s3q0> izsVar) {
            super(tf3.b(viewGroup, R.layout.holder_bottom_groups_action_popup, viewGroup, false));
            this.l = izsVar;
            this.itemView.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC3438a());
            t38 t38Var = new t38();
            this.m = t38Var;
            this.n = new b();
            RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.recycler_groups);
            recyclerView.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
            recyclerView.setAdapter(t38Var);
            this.o = recyclerView;
        }

        @Override // xsna.n38.a
        public final void V5(q38 q38Var) {
            List<sh00> list = q38Var.a;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            for (sh00 sh00Var : list) {
                arrayList.add(new p38(new bqv(1, null, sh00Var.c), sh00Var.b, sh00Var.a, new zv(3, this, sh00Var)));
            }
            t38 t38Var = this.m;
            t38Var.c = arrayList;
            RecyclerView recyclerView = this.o;
            b bVar = this.n;
            recyclerView.removeOnItemTouchListener(bVar);
            if (t38Var.getItemCount() >= 6) {
                ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
                layoutParams.height = o38.e;
                recyclerView.setLayoutParams(layoutParams);
                recyclerView.requestLayout();
                recyclerView.addOnItemTouchListener(bVar);
            }
        }

        /* compiled from: BottomActionAdapterWithCommunityImpl.kt */
        /* renamed from: xsna.o38$a$a, reason: collision with other inner class name */
        public static final class ViewOnAttachStateChangeListenerC3438a implements View.OnAttachStateChangeListener {
            public ViewOnAttachStateChangeListenerC3438a() {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
                a aVar = a.this;
                aVar.o.removeOnItemTouchListener(aVar.n);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
            }
        }

        /* compiled from: BottomActionAdapterWithCommunityImpl.kt */
        public static final class b implements RecyclerView.s {
            @Override // androidx.recyclerview.widget.RecyclerView.s
            public final boolean j(RecyclerView recyclerView, MotionEvent motionEvent) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0) {
                    recyclerView.getParent().requestDisallowInterceptTouchEvent(true);
                    return false;
                }
                if (actionMasked != 1 && actionMasked != 3) {
                    return false;
                }
                recyclerView.getParent().requestDisallowInterceptTouchEvent(false);
                return false;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.s
            public final void h(boolean z) {
            }

            @Override // androidx.recyclerview.widget.RecyclerView.s
            public final void f(RecyclerView recyclerView, MotionEvent motionEvent) {
            }
        }
    }
}
