package xsna;

import java.util.List;
import xsna.rye;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class rhe implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rhe(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                uhe uheVar = (uhe) this.c;
                uheVar.f.onNext((List) this.d);
                break;
            default:
                io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) this.c;
                rye.b bVar = (rye.b) this.d;
                if (cVar != null) {
                    cVar.dispose();
                }
                bVar.a();
                break;
        }
    }
}
