package xsna;

import android.content.Context;
import com.vk.auth.modal.base.ModalAuthInfo;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$RegistrationFieldItem;
import java.util.ArrayList;
import xsna.ane0;
import xsna.arf0;
import xsna.iv20;

/* compiled from: QrAuthPresenter.kt */
/* loaded from: classes15.dex */
public class cne0<V extends ane0 & arf0> extends wv20<V> implements zme0<V> {
    public final bne0 h;

    public cne0(Context context, bne0 bne0Var) {
        super(context, bne0Var);
        this.h = bne0Var;
    }

    @Override // xsna.wv20, xsna.hv20
    public final void M2(ModalAuthInfo modalAuthInfo) {
        super.M2(modalAuthInfo);
        com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
        iv20.b bVar2 = this.d;
        String str = (bVar2 != null ? bVar2 : null).f;
        Integer num = (bVar2 != null ? bVar2 : null).i;
        if (bVar2 == null) {
            bVar2 = null;
        }
        boolean z = bVar2.j;
        this.e.getClass();
        boolean a = coe0.a();
        bVar.getClass();
        SchemeStatSak$RegistrationFieldItem d = com.vk.registration.funnels.b.d(SchemeStatSak$RegistrationFieldItem.Name.QR_CODE_SOURCE, z ? "external_camera" : "internal_camera");
        ArrayList arrayList = new ArrayList();
        arrayList.add(d);
        arrayList.add(com.vk.registration.funnels.b.d(SchemeStatSak$RegistrationFieldItem.Name.QR_CODE_ID, str));
        arrayList.add(com.vk.registration.funnels.b.d(SchemeStatSak$RegistrationFieldItem.Name.APP_ID, String.valueOf(num)));
        if (a) {
            arrayList.add(com.vk.registration.funnels.b.d(SchemeStatSak$RegistrationFieldItem.Name.AVAILABLE_MULTIACC_SELECTOR, ""));
        }
        com.vk.registration.funnels.b.z(bVar, SchemeStatSak$EventScreen.QR_CODE_ASK_CONFIRM, arrayList, null, null, 28);
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.k(com.vk.registration.funnels.a.f(d));
        iv20.b bVar3 = this.d;
        com.vk.registration.funnels.b.q((bVar3 != null ? bVar3 : null).f, (bVar3 != null ? bVar3 : null).j);
    }

    @Override // xsna.wv20
    public void c() {
        this.h.r4();
    }

    @Override // xsna.wv20, xsna.hv20
    public final void onDestroy() {
        super.onDestroy();
        com.vk.registration.funnels.b.a.getClass();
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        qro0.a(new i13(25));
    }
}
