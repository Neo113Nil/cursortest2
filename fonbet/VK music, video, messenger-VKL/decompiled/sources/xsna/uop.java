package xsna;

import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: EnterLoginPresenter.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class uop extends FunctionReferenceImpl implements izs<String, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(String str) {
        String str2 = str;
        vop vopVar = (vop) this.receiver;
        vopVar.getClass();
        com.vk.registration.funnels.b.a.getClass();
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.GOOGLE_PHONE_HINT_ADDED, null, null, null, null, null, null, 254);
        cop copVar = (cop) vopVar.a;
        if (copVar != null) {
            copVar.setLogin(str2);
        }
        vopVar.D();
        return s3q0.a;
    }
}
