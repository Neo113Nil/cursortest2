package xsna;

import com.vk.api.sdk.exceptions.ApiErrorViewType;

/* compiled from: FallbackApiError.kt */
/* loaded from: classes15.dex */
public final class xjq extends vgg {
    public final ApiErrorViewType b;

    public xjq(Throwable th) {
        super(th);
        this.b = ApiErrorViewType.CUSTOM;
    }

    @Override // xsna.vgg
    public final ApiErrorViewType b() {
        return this.b;
    }

    @Override // xsna.vgg
    public final void c() {
    }
}
