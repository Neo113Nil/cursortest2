package rxdogtag2;

import rxdogtag2.RxDogTag;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class k0 implements io.reactivex.rxjava3.functions.c {
    public final /* synthetic */ RxDogTag.Configuration b;

    public /* synthetic */ k0(RxDogTag.Configuration configuration) {
        this.b = configuration;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public final Object apply(Object obj, Object obj2) {
        io.reactivex.rxjava3.core.z lambda$installWithBuilder$2;
        lambda$installWithBuilder$2 = RxDogTag.lambda$installWithBuilder$2(this.b, (io.reactivex.rxjava3.core.x) obj, (io.reactivex.rxjava3.core.z) obj2);
        return lambda$installWithBuilder$2;
    }
}
