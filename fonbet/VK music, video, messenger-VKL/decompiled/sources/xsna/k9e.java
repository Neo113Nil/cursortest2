package xsna;

import xsna.x0r;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class k9e implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ io.reactivex.rxjava3.subjects.f c;

    public /* synthetic */ k9e(io.reactivex.rxjava3.subjects.f fVar, int i) {
        this.b = i;
        this.c = fVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                Integer num = (Integer) obj;
                num.intValue();
                this.c.onNext(num);
                break;
            default:
                this.c.onNext(x0r.a.Loading);
                break;
        }
        return s3q0.a;
    }
}
