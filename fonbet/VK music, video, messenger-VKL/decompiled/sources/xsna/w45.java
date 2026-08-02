package xsna;

import com.vk.auth.api.models.AuthResult;
import com.vk.auth.main.SilentAuthSource;
import com.vk.mail.auth.api.MailAuthFlowConfig;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class w45 implements izs {
    public final /* synthetic */ SilentAuthSource b;
    public final /* synthetic */ Boolean c;
    public final /* synthetic */ MailAuthFlowConfig d;

    public /* synthetic */ w45(SilentAuthSource silentAuthSource, Boolean bool, MailAuthFlowConfig mailAuthFlowConfig) {
        this.b = silentAuthSource;
        this.c = bool;
        this.d = mailAuthFlowConfig;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        AuthResult authResult = (AuthResult) obj;
        if (this.b == SilentAuthSource.BY_WHITE_LINK) {
            if (!epx.f(this.c, Boolean.TRUE)) {
                MailAuthFlowConfig mailAuthFlowConfig = this.d;
                String str = mailAuthFlowConfig != null ? mailAuthFlowConfig.b : null;
                if (str == null) {
                    str = "";
                }
                String g0 = drm0.g0(str, "@", "");
                if (drm0.N(str) || drm0.N(g0)) {
                    return io.reactivex.rxjava3.core.q.H(new IllegalArgumentException("Email or redirect domain is empty"));
                }
                l55.a.getClass();
                return new io.reactivex.rxjava3.internal.operators.observable.o1(((zc00) l55.h.getValue()).invoke().r0(io.reactivex.rxjava3.schedulers.a.b()).U(new c8(new yy(str, 3), 3)), new mq(new oc0(5), 6));
            }
        }
        return io.reactivex.rxjava3.core.q.T(authResult);
    }
}
