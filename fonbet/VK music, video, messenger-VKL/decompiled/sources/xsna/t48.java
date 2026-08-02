package xsna;

import android.content.DialogInterface;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$RegistrationFieldItem;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class t48 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.b) {
            case 0:
                dialogInterface.cancel();
                break;
            default:
                com.vk.registration.funnels.b.a.getClass();
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                SchemeStatSak$TypeRegistrationItem.EventType eventType = SchemeStatSak$TypeRegistrationItem.EventType.CLOSE_ALERT_TAP;
                ArrayList arrayList = new ArrayList();
                arrayList.add(com.vk.registration.funnels.b.d(SchemeStatSak$RegistrationFieldItem.Name.ALERT, "accounts_limit_reached"));
                s3q0 s3q0Var = s3q0.a;
                frf0.a(eventType, arrayList, null, null, null, null, null, 252);
                break;
        }
    }
}
