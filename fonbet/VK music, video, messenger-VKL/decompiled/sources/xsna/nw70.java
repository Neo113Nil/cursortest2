package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.sdk.api.ApiAppKeyProvider;

/* compiled from: OkApiCreator.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class nw70 implements ApiAppKeyProvider, g0t {
    public final /* synthetic */ g19 b;

    public nw70(g19 g19Var) {
        this.b = g19Var;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ApiAppKeyProvider) && (obj instanceof g0t)) {
            return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // ru.ok.android.sdk.api.ApiAppKeyProvider
    public final String getAppKey() {
        return this.b.a();
    }

    @Override // xsna.g0t
    public final xzs<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(0, this.b, g19.class, "getOkAppKey", "getOkAppKey()Ljava/lang/String;", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
