package xsna;

import com.vk.api.sdk.exceptions.VKApiException;
import xsna.k840;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class gh4 implements izs {
    public final /* synthetic */ int b;

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        if (!((nd4) obj).a) {
            return io.reactivex.rxjava3.core.a.k(new VKApiException("Can`t subscribe to audiobook"));
        }
        r5v0 r5v0Var = k840.a.h;
        if (r5v0Var == null) {
            r5v0Var = null;
        }
        r5v0Var.b(xo50.a);
        r5v0 r5v0Var2 = k840.a.h;
        (r5v0Var2 != null ? r5v0Var2 : null).b(new wj4(this.b));
        return io.reactivex.rxjava3.internal.operators.completable.i.b;
    }
}
