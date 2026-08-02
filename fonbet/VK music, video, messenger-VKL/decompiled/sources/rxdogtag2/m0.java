package rxdogtag2;

import rxdogtag2.RxDogTag;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class m0 implements io.reactivex.rxjava3.functions.c {
    public final /* synthetic */ RxDogTag.Configuration b;

    public /* synthetic */ m0(RxDogTag.Configuration configuration) {
        this.b = configuration;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public final Object apply(Object obj, Object obj2) {
        io.reactivex.rxjava3.core.c lambda$installWithBuilder$4;
        lambda$installWithBuilder$4 = RxDogTag.lambda$installWithBuilder$4(this.b, (io.reactivex.rxjava3.core.a) obj, (io.reactivex.rxjava3.core.c) obj2);
        return lambda$installWithBuilder$4;
    }
}
