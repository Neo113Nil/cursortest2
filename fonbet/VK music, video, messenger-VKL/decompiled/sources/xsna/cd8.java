package xsna;

import xsna.q630;

/* compiled from: BringIntoViewRequester.kt */
/* loaded from: classes11.dex */
public final class cd8 extends q630.c {
    public yc8 p;

    @Override // xsna.q630.c
    public final boolean X1() {
        return false;
    }

    @Override // xsna.q630.c
    public final void a2() {
        yc8 yc8Var = this.p;
        if (yc8Var instanceof bd8) {
            ((bd8) yc8Var).a.j(this);
        }
        if (yc8Var instanceof bd8) {
            ((bd8) yc8Var).a.b(this);
        }
        this.p = yc8Var;
    }

    @Override // xsna.q630.c
    public final void b2() {
        yc8 yc8Var = this.p;
        if (yc8Var instanceof bd8) {
            ((bd8) yc8Var).a.j(this);
        }
    }
}
