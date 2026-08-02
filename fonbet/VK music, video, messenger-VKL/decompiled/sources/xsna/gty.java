package xsna;

import xsna.hty;

/* compiled from: Effects.kt */
/* loaded from: classes11.dex */
public final class gty implements kgn {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gty(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // xsna.kgn
    public final void dispose() {
        switch (this.a) {
            case 0:
                ((hty.a) this.b).d = null;
                break;
            default:
                ((yok0) this.b).b(null);
                break;
        }
    }
}
