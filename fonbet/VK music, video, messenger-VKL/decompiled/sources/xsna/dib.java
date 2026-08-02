package xsna;

import kotlin.collections.EmptyList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class dib implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dib(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((io.reactivex.rxjava3.subjects.f) ((fjk0) this.d).b).onNext(Integer.valueOf(this.c));
                break;
            default:
                v5b v5bVar = (v5b) this.d;
                EmptyList emptyList = EmptyList.b;
                v5bVar.invoke(new rbt0(this.c, 50, 0, 32, emptyList));
                break;
        }
        return s3q0.a;
    }
}
