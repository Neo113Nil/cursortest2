package xsna;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ScrollAwareNotificationListener.kt */
/* loaded from: classes4.dex */
public final class peh0<T> implements bd70<T> {
    public final bd70<T> b;
    public final bin0<RecyclerView> c;

    public peh0(bd70<T> bd70Var, bin0<RecyclerView> bin0Var) {
        this.b = bd70Var;
        this.c = bin0Var;
    }

    @Override // xsna.bd70
    public final void x0(final int i, final int i2, final T t) {
        RecyclerView recyclerView = this.c.get();
        if (recyclerView != null) {
            wjf0.c(recyclerView, new gzs() { // from class: xsna.oeh0
                @Override // xsna.gzs
                public final Object invoke() {
                    peh0.this.b.x0(i, i2, t);
                    return s3q0.a;
                }
            });
        } else {
            this.b.x0(i, i2, t);
        }
    }
}
