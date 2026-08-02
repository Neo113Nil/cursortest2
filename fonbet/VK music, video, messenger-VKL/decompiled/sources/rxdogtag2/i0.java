package rxdogtag2;

import rxdogtag2.RxDogTag;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class i0 implements io.reactivex.rxjava3.functions.c {
    public final /* synthetic */ RxDogTag.Configuration b;

    public /* synthetic */ i0(RxDogTag.Configuration configuration) {
        this.b = configuration;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public final Object apply(Object obj, Object obj2) {
        io.reactivex.rxjava3.core.v lambda$installWithBuilder$0;
        lambda$installWithBuilder$0 = RxDogTag.lambda$installWithBuilder$0(this.b, (io.reactivex.rxjava3.core.q) obj, (io.reactivex.rxjava3.core.v) obj2);
        return lambda$installWithBuilder$0;
    }
}
