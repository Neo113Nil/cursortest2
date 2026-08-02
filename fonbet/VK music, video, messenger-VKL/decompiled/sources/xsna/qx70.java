package xsna;

import okhttp3.Interceptor;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class qx70 implements Interceptor {
    @Override // okhttp3.Interceptor
    public final okhttp3.u intercept(Interceptor.a aVar) {
        try {
            return aVar.a(aVar.request());
        } catch (Exception e) {
            aVar.call().cancel();
            throw e;
        }
    }
}
