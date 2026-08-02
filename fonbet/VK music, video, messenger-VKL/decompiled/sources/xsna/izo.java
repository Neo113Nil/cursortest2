package xsna;

import android.content.DialogInterface;
import com.vk.photos.ui.editalbum.domain.g;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class izo implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ izo(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.b;
        Object obj = this.c;
        switch (i2) {
            case 0:
                ((g.h) obj).b.invoke();
                break;
            default:
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.MOBILE_QR_CLOSE_ALERT_TAP, null, null, null, null, null, null, 254);
                ((joe0) obj).un();
                break;
        }
    }
}
