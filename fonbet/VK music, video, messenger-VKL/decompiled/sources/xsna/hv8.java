package xsna;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class hv8 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hv8(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ((ConcurrentHashMap) ((iv8) this.c).b).remove(this.d);
                break;
            default:
                ((fhe) this.c).c = (e2f) this.d;
                break;
        }
    }
}
