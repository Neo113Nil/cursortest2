package xsna;

import java.util.ArrayList;

/* compiled from: MviInternalActor.kt */
/* loaded from: classes3.dex */
public final class ml50 implements uic {
    public final /* synthetic */ int b;
    public final uic c;

    public ml50(int i) {
        this.b = 1;
        this.c = new ul50();
        new ArrayList();
    }

    @Override // xsna.uic
    public final void clear() {
        switch (this.b) {
            case 0:
                ((qj50) this.c).clear();
                break;
            default:
                ((ul50) this.c).clear();
                break;
        }
    }

    public ml50(qj50 qj50Var) {
        this.b = 0;
        this.c = qj50Var;
    }
}
