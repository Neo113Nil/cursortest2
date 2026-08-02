package xsna;

import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class e340 implements io.reactivex.rxjava3.functions.c, b9i {
    public final /* synthetic */ Object b;

    public /* synthetic */ e340(Object obj) {
        this.b = obj;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (Pair) ((d340) this.b).invoke(obj, obj2);
    }

    @Override // xsna.b9i
    public Object c(lcg0 lcg0Var) {
        yuf0 lambda$getComponents$0;
        lambda$getComponents$0 = RemoteConfigRegistrar.lambda$getComponents$0((toe0) this.b, lcg0Var);
        return lambda$getComponents$0;
    }
}
