package defpackage;

/* loaded from: classes.dex */
public final class nf5 implements qty {
    public final qty a;
    public int b = 0;
    public int c = -1;
    public int w = -1;
    public Object x = null;

    public nf5(qty qtyVar) {
        this.a = qtyVar;
    }

    public final void a() {
        int i = this.b;
        if (i == 0) {
            return;
        }
        qty qtyVar = this.a;
        if (i == 1) {
            qtyVar.onInserted(this.c, this.w);
        } else if (i == 2) {
            qtyVar.onRemoved(this.c, this.w);
        } else if (i == 3) {
            qtyVar.onChanged(this.c, this.w, this.x);
        }
        this.x = null;
        this.b = 0;
    }

    @Override // defpackage.qty
    public final void onChanged(int i, int i2, Object obj) {
        int i3;
        int i4;
        int i5;
        if (this.b == 3 && i <= (i4 = this.w + (i3 = this.c)) && (i5 = i + i2) >= i3 && this.x == obj) {
            this.c = Math.min(i, i3);
            this.w = Math.max(i4, i5) - this.c;
            return;
        }
        a();
        this.c = i;
        this.w = i2;
        this.x = obj;
        this.b = 3;
    }

    @Override // defpackage.qty
    public final void onInserted(int i, int i2) {
        int i3;
        if (this.b == 1 && i >= (i3 = this.c)) {
            int i4 = this.w;
            if (i <= i3 + i4) {
                this.w = i4 + i2;
                this.c = Math.min(i, i3);
                return;
            }
        }
        a();
        this.c = i;
        this.w = i2;
        this.b = 1;
    }

    @Override // defpackage.qty
    public final void onMoved(int i, int i2) {
        a();
        this.a.onMoved(i, i2);
    }

    @Override // defpackage.qty
    public final void onRemoved(int i, int i2) {
        int i3;
        if (this.b == 2 && (i3 = this.c) >= i && i3 <= i + i2) {
            this.w += i2;
            this.c = i;
        } else {
            a();
            this.c = i;
            this.w = i2;
            this.b = 2;
        }
    }
}
