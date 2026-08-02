package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.apps.BuildInfo;
import xsna.nwb;

/* compiled from: ChatProfileDividerItemDelegate.kt */
/* loaded from: classes2.dex */
public final class dxb extends p1u0<nwb.c> {
    public final kkm a;

    /* compiled from: ChatProfileDividerItemDelegate.kt */
    public static final class a extends vfz<nwb.c> {
        public final kkm l;

        public a(View view, kkm kkmVar) {
            super(view);
            this.l = kkmVar;
        }

        @Override // xsna.vfz
        public final void V5() {
            if (BuildInfo.t()) {
                return;
            }
            View view = this.itemView;
            kkm kkmVar = this.l;
            kkmVar.getClass();
            kkmVar.a(view, "backgroundTint", new wcg(kkmVar, 9));
        }

        @Override // xsna.vfz
        /* renamed from: W5 */
        public final /* bridge */ /* synthetic */ void i6(nwb.c cVar) {
        }

        @Override // xsna.vfz
        public final void a6() {
            if (BuildInfo.t()) {
                return;
            }
            this.l.h(this.itemView);
        }
    }

    public dxb(kkm kkmVar) {
        this.a = kkmVar;
    }

    @Override // xsna.p1u0
    public final vfz<? extends nwb.c> b(ViewGroup viewGroup) {
        View view = new View(viewGroup.getContext());
        if (BuildInfo.t()) {
            view.setLayoutParams(new RecyclerView.p(-1, (int) (cn70.a() * 12.0f)));
        } else {
            RecyclerView.p pVar = new RecyclerView.p(-1, (int) (cn70.a() * 0.5f));
            pVar.setMarginStart(cn70.b(16));
            pVar.setMarginEnd(cn70.b(16));
            view.setLayoutParams(pVar);
        }
        return new a(view, this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof nwb.c;
    }
}
