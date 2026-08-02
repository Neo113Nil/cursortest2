package xsna;

import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.n7r0;

/* compiled from: LoggingValidationHandlerDecorator.kt */
/* loaded from: classes11.dex */
public final class k200 implements n7r0 {
    public final t8u0 b;
    public final bpn0 c = new bpn0(new q57(5));

    /* compiled from: LoggingValidationHandlerDecorator.kt */
    /* loaded from: classes7.dex */
    public final /* synthetic */ class a extends FunctionReferenceImpl implements izs<String, String> {
        public a(Object obj) {
            super(1, obj, p2i0.class, "strip", "strip(Ljava/lang/String;)Ljava/lang/String;", 0);
        }

        @Override // xsna.izs
        public final String invoke(String str) {
            return ((p2i0) this.receiver).a(str);
        }
    }

    public k200(t8u0 t8u0Var) {
        this.b = t8u0Var;
    }

    @Override // xsna.n7r0
    public final void a(n7r0.b bVar, n7r0.a<n7r0.c> aVar) {
        this.b.a(bVar, aVar);
    }

    @Override // xsna.n7r0
    public final void b(String str, n7r0.a<Boolean> aVar) {
        this.b.b(str, aVar);
    }

    @Override // xsna.n7r0
    public final void c(String str, n7r0.a<n7r0.d> aVar) {
        this.b.c(str, aVar);
    }

    public final void d() {
        this.b.b.b.getClass();
        com.vk.registration.funnels.b.a.getClass();
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.CAPTCHA_SUCCESS, null, null, null, null, null, null, 254);
    }
}
