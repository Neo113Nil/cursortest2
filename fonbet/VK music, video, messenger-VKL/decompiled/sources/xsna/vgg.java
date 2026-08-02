package xsna;

import com.vk.api.sdk.exceptions.ApiErrorViewType;

/* compiled from: CommonApiError.kt */
/* loaded from: classes6.dex */
public abstract class vgg {
    public final Throwable a;

    public vgg(Throwable th) {
        this.a = th;
    }

    public final Throwable a() {
        return this.a;
    }

    public abstract ApiErrorViewType b();

    public abstract void c();

    public final void d(gzs<s3q0> gzsVar) {
        if (b() == ApiErrorViewType.CUSTOM) {
            gzsVar.invoke();
        } else {
            c();
        }
    }
}
