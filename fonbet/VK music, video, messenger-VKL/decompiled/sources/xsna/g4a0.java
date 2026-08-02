package xsna;

import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$RegistrationFieldItem;
import java.util.ArrayList;

/* compiled from: PhoneValidationTracker.kt */
/* loaded from: classes15.dex */
public final class g4a0 {
    public boolean a;

    public final void a(gzs gzsVar) {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        SchemeStatSak$EventScreen schemeStatSak$EventScreen = SchemeStatSak$EventScreen.VERIFICATION_ASK_NUMBER;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new SchemeStatSak$RegistrationFieldItem(SchemeStatSak$RegistrationFieldItem.Name.CAN_SKIP, "", "", com.vk.registration.funnels.a.e(Boolean.valueOf(this.a))));
        frf0.l(schemeStatSak$EventScreen, arrayList);
        gzsVar.invoke();
    }
}
