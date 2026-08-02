package xsna;

import com.vk.voip.OKVoipEngine;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class xre0 implements io.reactivex.rxjava3.functions.e {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xre0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.e
    public final void cancel() {
        switch (this.b) {
            case 0:
                ((sq9) this.c).cancel();
                break;
            default:
                p6x0 p6x0Var = (p6x0) this.c;
                OKVoipEngine.b.getClass();
                OKVoipEngine.k.o.a.remove(p6x0Var);
                break;
        }
    }
}
