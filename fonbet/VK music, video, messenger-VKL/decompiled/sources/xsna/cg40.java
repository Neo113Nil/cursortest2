package xsna;

/* compiled from: MusicDelegateViewHolder.kt */
/* loaded from: classes3.dex */
public abstract class cg40<T> extends se50<T> {
    public final se50<T> n;

    public cg40(se50<T> se50Var) {
        super(se50Var.itemView);
        this.n = se50Var;
    }

    @Override // xsna.se50
    public void V5(String str, boolean z, int i, Object obj) {
        this.n.V5(str, z, i, obj);
        super.V5(str, z, i, obj);
    }

    @Override // xsna.se50
    public final void a6() {
        this.n.a6();
    }

    @Override // xsna.se50
    public final void h6() {
        this.n.h6();
    }

    @Override // xsna.se50
    public void i6() {
        this.n.i6();
    }
}
