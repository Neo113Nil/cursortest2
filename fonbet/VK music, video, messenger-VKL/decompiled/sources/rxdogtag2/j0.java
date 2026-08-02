package rxdogtag2;

import rxdogtag2.RxDogTag;
import xsna.axm0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class j0 implements io.reactivex.rxjava3.functions.c {
    public final /* synthetic */ RxDogTag.Configuration b;

    public /* synthetic */ j0(RxDogTag.Configuration configuration) {
        this.b = configuration;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public final Object apply(Object obj, Object obj2) {
        axm0 lambda$installWithBuilder$1;
        lambda$installWithBuilder$1 = RxDogTag.lambda$installWithBuilder$1(this.b, (io.reactivex.rxjava3.core.g) obj, (axm0) obj2);
        return lambda$installWithBuilder$1;
    }
}
