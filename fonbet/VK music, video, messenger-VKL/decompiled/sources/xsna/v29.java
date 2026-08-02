package xsna;

import xsna.vqw0;
import xsna.y6i0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class v29 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v29(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                com.vk.voip.call_effects.a aVar = (com.vk.voip.call_effects.a) this.c;
                io.reactivex.rxjava3.disposables.c cVar = aVar.e;
                if (cVar != null) {
                    cVar.dispose();
                }
                aVar.e = null;
                break;
            case 1:
                ((com.vk.movika.sdk.base.logic.processor.actions.h) this.c).invoke();
                break;
            case 2:
                io.reactivex.rxjava3.subjects.d<kgg> dVar = ((xeg) this.c).i;
                dVar.onNext(dVar.P0() != null ? new kgg(Boolean.FALSE) : null);
                break;
            case 3:
                ((s6i0) this.c).n(y6i0.a.a);
                break;
            default:
                ((pqw0) this.c).T(new vqw0.a(false));
                break;
        }
    }
}
