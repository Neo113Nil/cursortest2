package xsna;

import ru.ok.android.sdk.api.ApiDeviceIdProvider;

/* compiled from: OkApiCreator.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class ow70 implements ApiDeviceIdProvider, g0t {
    public final /* synthetic */ z34 b;

    public ow70(z34 z34Var) {
        this.b = z34Var;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ApiDeviceIdProvider) && (obj instanceof g0t)) {
            return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // ru.ok.android.sdk.api.ApiDeviceIdProvider
    public final /* synthetic */ String getDeviceId() {
        return (String) this.b.invoke();
    }

    @Override // xsna.g0t
    public final xzs<?> getFunctionDelegate() {
        return this.b;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
