package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.libvideo.api.VideoAutoPlayDelayType;
import java.lang.ref.WeakReference;

/* compiled from: EntriesListAutoPlayProvider.kt */
/* loaded from: classes4.dex */
public final class cqp implements ai5 {
    public final /* synthetic */ int b;
    public final Object c;
    public final Object d;
    public Object e;

    public cqp(fqp fqpVar, dqp dqpVar, a4r a4rVar) {
        this.b = 0;
        this.c = fqpVar;
        this.d = dqpVar;
        this.e = a4rVar;
    }

    @Override // xsna.ai5
    public final y9t0 Eh(int i) {
        switch (this.b) {
            case 0:
                dqp dqpVar = (dqp) this.d;
                return new y9t0(dqpVar.B0(i), new ni5(dqpVar.a(), dqpVar.z0(i), dqpVar.E0(i), 8));
            default:
                yg5 yg5Var = ((ei5) this.e).a.get(i);
                ei5 ei5Var = (ei5) this.e;
                return new y9t0(yg5Var, new ni5(ei5Var.f, ei5Var.c.get(i), ((ei5) this.e).b.get(i), 8));
        }
    }

    @Override // xsna.dkf0
    public final int getAdapterOffset() {
        switch (this.b) {
            case 0:
                return 0;
            default:
                return ((ei5) this.e).d;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xsna.fqp] */
    @Override // xsna.dkf0
    public final int getItemCount() {
        switch (this.b) {
            case 0:
                return this.c.me();
            default:
                return ((ei5) this.e).e;
        }
    }

    @Override // xsna.dkf0
    public final RecyclerView getRecyclerView() {
        switch (this.b) {
            case 0:
                return ((a4r) this.e).c;
            default:
                return (RecyclerView) ((WeakReference) this.d).get();
        }
    }

    @Override // xsna.ai5
    public final VideoAutoPlayDelayType getVideoAutoPlayDelayType() {
        switch (this.b) {
            case 0:
                return ((dqp) this.d).getVideoAutoPlayDelayType();
            default:
                return ((ei5) this.e).g;
        }
    }

    public cqp(RecyclerView recyclerView, fr20 fr20Var) {
        this.b = 1;
        this.c = fr20Var;
        this.d = new WeakReference(recyclerView);
        this.e = ei5.h;
    }
}
