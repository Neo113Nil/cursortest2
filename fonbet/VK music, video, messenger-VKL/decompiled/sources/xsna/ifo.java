package xsna;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.WeakHashMap;
import xsna.usx0;
import xsna.vfz;

/* compiled from: DragAndDropController.kt */
/* loaded from: classes2.dex */
public final class ifo<VH extends vfz<? extends hfz> & usx0> {
    public final b a;
    public final qul b;
    public final ifo<VH>.c c;
    public final androidx.recyclerview.widget.r d;

    /* compiled from: DragAndDropController.kt */
    public static final class a extends yj3<VH> {
        public final /* synthetic */ ifo<VH> v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ifo<VH> ifoVar, RecyclerView recyclerView) {
            super(recyclerView);
            this.v = ifoVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.yj3
        public final void o(jsx0 jsx0Var) {
            vfz vfzVar = (vfz) jsx0Var;
            ifo<VH> ifoVar = this.v;
            if (ifoVar.c.g != null) {
                return;
            }
            awt0.p(vfzVar.itemView);
            ifoVar.d.x(vfzVar);
            vfzVar.getAdapterPosition();
        }
    }

    /* compiled from: DragAndDropController.kt */
    public interface b {
        void a(hfz hfzVar, int i);
    }

    public ifo(RecyclerView recyclerView, b bVar, qul qulVar) {
        this.a = bVar;
        this.b = qulVar;
        ifo<VH>.c cVar = new c();
        this.c = cVar;
        androidx.recyclerview.widget.r rVar = new androidx.recyclerview.widget.r(cVar);
        rVar.l(recyclerView);
        this.d = rVar;
        a aVar = new a(this, recyclerView);
        aVar.m = false;
        recyclerView.addOnItemTouchListener(aVar);
    }

    public final void a() {
        int adapterPosition;
        ifo<VH>.c cVar = this.c;
        RecyclerView.e0 e0Var = cVar.g;
        if (e0Var == null || (adapterPosition = e0Var.getAdapterPosition()) == -1) {
            return;
        }
        cVar.g = null;
        this.a.a(this.b.getItems().get(adapterPosition), adapterPosition);
    }

    /* compiled from: DragAndDropController.kt */
    public final class c extends r.g {
        public RecyclerView.e0 g;

        public c() {
            super(3, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.recyclerview.widget.r.d
        public final boolean a(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2) {
            usx0 usx0Var = e0Var2 instanceof usx0 ? (usx0) e0Var2 : null;
            if (usx0Var != null) {
                return usx0Var.M1();
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.r.d
        public final void b(RecyclerView recyclerView, RecyclerView.e0 e0Var) {
            super.b(recyclerView, e0Var);
            View view = e0Var.itemView;
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            view.setElevation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }

        @Override // androidx.recyclerview.widget.r.d
        public final boolean k() {
            return false;
        }

        @Override // androidx.recyclerview.widget.r.d
        public final void m(Canvas canvas, RecyclerView recyclerView, RecyclerView.e0 e0Var, float f, float f2, int i, boolean z) {
            super.m(canvas, recyclerView, e0Var, f, f2, i, z);
            if (z) {
                View view = e0Var.itemView;
                float b = iah0.b(8.0f);
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                view.setElevation(b);
            }
        }

        @Override // androidx.recyclerview.widget.r.d
        public final boolean n(RecyclerView recyclerView, RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2) {
            if (e0Var.getAdapterPosition() != e0Var.getLayoutPosition()) {
                return false;
            }
            qul qulVar = ifo.this.b;
            ArrayList arrayList = new ArrayList(qulVar.getItems());
            hfz hfzVar = (hfz) arrayList.get(e0Var.getAdapterPosition());
            int adapterPosition = e0Var.getAdapterPosition();
            arrayList.remove(e0Var.getAdapterPosition());
            int adapterPosition2 = e0Var2.getAdapterPosition();
            arrayList.add(e0Var2.getAdapterPosition(), hfzVar);
            qulVar.setItems(arrayList);
            if (qulVar instanceof wx3) {
                return true;
            }
            qulVar.notifyItemMoved(adapterPosition, adapterPosition2);
            return true;
        }

        @Override // androidx.recyclerview.widget.r.d
        public final void o(RecyclerView.e0 e0Var, int i) {
            ifo<VH> ifoVar = ifo.this;
            if (e0Var == null) {
                if (this.g != null) {
                    ifoVar.a();
                }
                this.g = null;
            } else {
                RecyclerView.e0 e0Var2 = this.g;
                if (e0Var2 != null && !e0Var2.equals(e0Var)) {
                    ifoVar.a();
                }
                this.g = e0Var;
            }
        }

        @Override // androidx.recyclerview.widget.r.d
        public final void p(RecyclerView.e0 e0Var) {
        }
    }
}
