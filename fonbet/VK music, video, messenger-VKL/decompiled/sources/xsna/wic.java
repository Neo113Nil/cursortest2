package xsna;

import java.util.ArrayList;

/* compiled from: ClearableJob.kt */
/* loaded from: classes3.dex */
public final class wic implements uic {
    public final /* synthetic */ int b;
    public final Object c;

    public wic(yok0 yok0Var) {
        this.b = 0;
        this.c = yok0Var;
    }

    @Override // xsna.uic
    public final void clear() {
        switch (this.b) {
            case 0:
                ((yok0) this.c).b(null);
                break;
            default:
                ((ul50) this.c).clear();
                break;
        }
    }

    public wic(int i) {
        this.b = 1;
        this.c = new ul50();
        new ArrayList();
    }
}
