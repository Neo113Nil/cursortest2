package xsna;

import xsna.v6w;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class g39 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g39(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ((h39) this.c).b.log("CallFinishHandler", "on complete BitrateDumpFileSendTrigger");
                break;
            case 1:
                ((d7w) this.c).l.c().c(((v6w.c.b) ((v6w.c) this.d)).b);
                break;
            default:
                ((cme0) this.c).e(e43.a((rne0) this.d), false);
                break;
        }
    }
}
