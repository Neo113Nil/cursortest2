package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import one.video.ad.ux.motion.view.OneVideoMotionView;
import xsna.jm80;

/* compiled from: VideoMotionAdapter.kt */
/* loaded from: classes8.dex */
public final class tws0 extends androidx.recyclerview.widget.x<na30, zws0> {
    public final OneVideoMotionView.a c;
    public boolean d;

    /* compiled from: VideoMotionAdapter.kt */
    public static final class a extends m.e<na30> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(na30 na30Var, na30 na30Var2) {
            return na30Var.equals(na30Var2);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(na30 na30Var, na30 na30Var2) {
            return epx.f(na30Var.a, na30Var2.a);
        }
    }

    public tws0(OneVideoMotionView.a aVar) {
        super(new a());
        this.c = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((jm80) ((zws0) e0Var).itemView).P4(this.c, new jm80.a(getItem(i), this.d));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new zws0(new jm80(viewGroup.getContext()));
    }
}
