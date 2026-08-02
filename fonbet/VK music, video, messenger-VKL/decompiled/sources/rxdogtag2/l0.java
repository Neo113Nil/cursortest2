package rxdogtag2;

import rxdogtag2.RxDogTag;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class l0 implements io.reactivex.rxjava3.functions.c {
    public final /* synthetic */ RxDogTag.Configuration b;

    public /* synthetic */ l0(RxDogTag.Configuration configuration) {
        this.b = configuration;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public final Object apply(Object obj, Object obj2) {
        io.reactivex.rxjava3.core.m lambda$installWithBuilder$3;
        lambda$installWithBuilder$3 = RxDogTag.lambda$installWithBuilder$3(this.b, (io.reactivex.rxjava3.core.k) obj, (io.reactivex.rxjava3.core.m) obj2);
        return lambda$installWithBuilder$3;
    }
}
