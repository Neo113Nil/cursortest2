package defpackage;

import android.telephony.TelephonyManager;
import com.yandex.go.call_center.api.model.CallCenter;
import com.yandex.go.call_center.api.model.ContactOptions;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.SerializationException;
import ru.yandex.taxi.h;

/* loaded from: classes9.dex */
public final class kg7 implements jg7 {
    public final pae a;
    public final h b;

    public kg7(pae paeVar, h hVar) {
        this.a = paeVar;
        this.b = hVar;
    }

    public static CallCenter a(List list, CallCenter.Type type, String str) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            CallCenter callCenter = (CallCenter) obj;
            if (callCenter.getA() == type && cvu0.t(callCenter.getE(), str, true)) {
                break;
            }
        }
        return (CallCenter) obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String b() {
        ContactOptions contactOptions;
        TelephonyManager telephonyManager;
        String networkCountryIso;
        CallCenter a;
        pae paeVar = this.a;
        String l = paeVar.c.l(paeVar.b, null);
        if (l != null) {
            try {
                contactOptions = (ContactOptions) ((xnt) paeVar.a).c(l, ContactOptions.Companion.serializer());
            } catch (SerializationException e) {
                jst.e.k(e, "ContactOptions parsing error");
            }
            if (contactOptions != null && !contactOptions.getA().isEmpty()) {
                telephonyManager = (TelephonyManager) this.b.a.getSystemService(TelephonyManager.class);
                if (telephonyManager != null || (networkCountryIso = telephonyManager.getNetworkCountryIso()) == null || networkCountryIso.length() == 0) {
                    networkCountryIso = null;
                }
                if (networkCountryIso != null && !evu0.J(networkCountryIso)) {
                    List a2 = contactOptions.getA();
                    a = a(a2, CallCenter.Type.LOCAL, networkCountryIso);
                    if (a == null) {
                        return a.getC();
                    }
                    CallCenter a3 = a(a2, CallCenter.Type.NATIONAL, networkCountryIso);
                    if (a3 != null) {
                        return a3.getC();
                    }
                }
            }
            return null;
        }
        contactOptions = null;
        if (contactOptions != null) {
            telephonyManager = (TelephonyManager) this.b.a.getSystemService(TelephonyManager.class);
            if (telephonyManager != null) {
            }
            networkCountryIso = null;
            if (networkCountryIso != null) {
                List a22 = contactOptions.getA();
                a = a(a22, CallCenter.Type.LOCAL, networkCountryIso);
                if (a == null) {
                }
            }
        }
        return null;
    }
}
