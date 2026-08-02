package xsna;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a4q implements b9i {
    public final /* synthetic */ int b;

    public /* synthetic */ a4q(int i) {
        this.b = i;
    }

    @Override // xsna.b9i
    public final Object c(lcg0 lcg0Var) {
        top0 lambda$getComponents$2;
        switch (this.b) {
            case 0:
                return ExecutorsRegistrar.a.get();
            default:
                lambda$getComponents$2 = TransportRegistrar.lambda$getComponents$2(lcg0Var);
                return lambda$getComponents$2;
        }
    }
}
