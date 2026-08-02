package xsna;

import xsna.buy;
import xsna.foa0;

/* compiled from: LazyLayoutPinnableItem.kt */
/* loaded from: classes11.dex */
public final class yty implements foa0, foa0.a, buy.a {
    public final Object a;
    public final buy b;
    public int d;
    public foa0.a e;
    public boolean f;
    public int c = -1;
    public final wh50 g = androidx.compose.runtime.k.b(null);

    public yty(Object obj, buy buyVar) {
        this.a = obj;
        this.b = buyVar;
    }

    @Override // xsna.foa0
    public final yty a() {
        if (this.f) {
            xzw.c("Pin should not be called on an already disposed item ");
        }
        if (this.d == 0) {
            this.b.b.add(this);
            foa0 foa0Var = (foa0) ((zak0) this.g).getValue();
            this.e = foa0Var != null ? foa0Var.a() : null;
        }
        this.d++;
        return this;
    }

    @Override // xsna.buy.a
    public final int getIndex() {
        return this.c;
    }

    @Override // xsna.buy.a
    public final Object getKey() {
        return this.a;
    }

    @Override // xsna.foa0.a
    public final void release() {
        if (this.f) {
            return;
        }
        if (this.d <= 0) {
            xzw.c("Release should only be called once");
        }
        int i = this.d - 1;
        this.d = i;
        if (i == 0) {
            this.b.b.remove(this);
            foa0.a aVar = this.e;
            if (aVar != null) {
                aVar.release();
            }
            this.e = null;
        }
    }
}
