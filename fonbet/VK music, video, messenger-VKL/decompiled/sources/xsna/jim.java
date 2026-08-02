package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.ui.views.dialogs.DialogItemView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import xsna.vtm;

/* compiled from: DialogPinDragAndDropController.kt */
/* loaded from: classes2.dex */
public final class jim {
    public final Context a;
    public final RecyclerView b;
    public final vtm.c c;
    public Drawable d;
    public final androidx.recyclerview.widget.r e;
    public final bpn0 f;
    public int g;

    public jim(Context context, RecyclerView recyclerView, vtm.c cVar) {
        this.a = context;
        this.b = recyclerView;
        this.c = cVar;
        androidx.recyclerview.widget.r rVar = new androidx.recyclerview.widget.r(new a());
        rVar.l(recyclerView);
        this.e = rVar;
        this.f = new bpn0(new l63(12));
    }

    /* compiled from: DialogPinDragAndDropController.kt */
    public final class a extends r.g {
        public RecyclerView.e0 g;

        public a() {
            super(3, 0);
        }

        @Override // androidx.recyclerview.widget.r.d
        public final boolean a(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2) {
            Dialog Cb;
            yqr0 yqr0Var = e0Var2 instanceof yqr0 ? (yqr0) e0Var2 : null;
            return (yqr0Var == null || (Cb = yqr0Var.V5().Cb()) == null || !Cb.Bc()) ? false : true;
        }

        @Override // androidx.recyclerview.widget.r.d
        public final void b(RecyclerView recyclerView, RecyclerView.e0 e0Var) {
            super.b(recyclerView, e0Var);
            View view = e0Var.itemView;
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            view.setElevation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
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
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter == null) {
                return true;
            }
            bsm bsmVar = (bsm) adapter;
            ArrayList arrayList = new ArrayList(bsmVar.c.f);
            ogm ogmVar = (ogm) arrayList.get(e0Var.getAdapterPosition());
            arrayList.remove(e0Var.getAdapterPosition());
            arrayList.add(e0Var2.getAdapterPosition(), ogmVar);
            bsmVar.submitList(arrayList);
            return true;
        }

        @Override // androidx.recyclerview.widget.r.d
        public final void o(RecyclerView.e0 e0Var, int i) {
            if (i != 0) {
                if (i != 2) {
                    return;
                }
                this.g = e0Var;
                return;
            }
            RecyclerView.e0 e0Var2 = this.g;
            if (e0Var2 != null) {
                awt0.p(e0Var2.itemView);
                View view = e0Var2.itemView;
                jim jimVar = jim.this;
                view.setBackground(jimVar.d);
                yqr0 yqr0Var = e0Var2 instanceof yqr0 ? (yqr0) e0Var2 : null;
                if (yqr0Var != null) {
                    yqr0Var.B = false;
                    DialogItemView.ExtraIcon extraIcon = yqr0Var.A;
                    if (extraIcon != null) {
                        DialogItemView dialogItemView = (DialogItemView) yqr0Var.l;
                        Dialog dialog = yqr0Var.m;
                        if (dialog == null) {
                            dialog = null;
                        }
                        dialogItemView.j(extraIcon, !yqr0.a6(dialog));
                    }
                }
                yqr0 yqr0Var2 = (yqr0) e0Var2;
                Peer peer = yqr0Var2.V5().f;
                int cc = yqr0Var2.V5().Cb().cc() - (e0Var2.getAdapterPosition() - jimVar.g);
                xtm xtmVar = vtm.this.F;
                if (xtmVar != null) {
                    xtmVar.h(cc, peer);
                }
                jimVar.b.setItemAnimator(null);
            }
            this.g = null;
        }

        @Override // androidx.recyclerview.widget.r.d
        public final void p(RecyclerView.e0 e0Var) {
        }
    }
}
