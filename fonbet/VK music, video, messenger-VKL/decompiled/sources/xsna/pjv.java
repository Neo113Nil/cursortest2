package xsna;

import android.content.Context;
import android.os.Bundle;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;

/* compiled from: HttpLinkProcessor.kt */
/* loaded from: classes17.dex */
public final class pjv implements yp80 {
    public final /* synthetic */ yp80 b;
    public final /* synthetic */ qjv c;
    public final /* synthetic */ Context d;

    public pjv(yp80 yp80Var, qjv qjvVar, Context context) {
        this.b = yp80Var;
        this.c = qjvVar;
        this.d = context;
    }

    @Override // xsna.yp80
    public final void B0(boolean z) {
        this.b.B0(z);
    }

    @Override // xsna.yp80
    public final void I() {
        this.b.I();
    }

    @Override // xsna.yp80
    public final void U() {
        this.b.U();
    }

    @Override // xsna.yp80
    public final void onError(Throwable th) {
        if (th instanceof VKApiExecutionException) {
            VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th;
            if (vKApiExecutionException.T()) {
                Bundle w = vKApiExecutionException.w();
                long j = w != null ? w.getLong("owner_id") : 0L;
                if (j != 0) {
                    ProfileFragmentProviderComponent profileFragmentProviderComponent = (ProfileFragmentProviderComponent) ((k7m) m7m.f(this.c)).a(fpf0.a(ProfileFragmentProviderComponent.class));
                    ProfileFragmentProviderComponent.Companion companion = ProfileFragmentProviderComponent.Companion;
                    profileFragmentProviderComponent.E7(j).k(this.d);
                    s3q0 s3q0Var = s3q0.a;
                    return;
                }
                return;
            }
        }
        this.b.onError(th);
    }

    @Override // xsna.yp80
    public final void onSuccess() {
        this.b.onSuccess();
    }
}
