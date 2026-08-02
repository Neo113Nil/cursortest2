package defpackage;

import com.yandex.go.scooters.ignition.data.ScootersIgnitionApi;
import com.yandex.messaging.internal.pending.OutgoingAttachment$ExistingAttachment;
import com.yandex.messaging.internal.view.attach.AttachInfo;
import ru.yandex.taxi.network.api.models.GoApiName;
import ru.yandex.taxi.scooters.data.ScootersControlApi;
import ru.yandex.taxi.scooters.data.ScootersEvolvingApi;
import ru.yandex.taxi.scooters.data.ScootersSessionsCurrentApi;
import ru.yandex.taxi.scooters.data.ScootersUserStateApi;

/* loaded from: classes6.dex */
public abstract class d1b1 {
    public static final boolean a(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt >= 128 || Character.isLetter(charAt)) {
                return true;
            }
        }
        return false;
    }

    public static ScootersControlApi b(on2 on2Var) {
        on2Var.getClass();
        return (ScootersControlApi) on2Var.a(GoApiName.TaxiV4, ScootersControlApi.class);
    }

    public static ScootersEvolvingApi c(on2 on2Var) {
        on2Var.getClass();
        return (ScootersEvolvingApi) on2Var.a(GoApiName.TaxiV4, ScootersEvolvingApi.class);
    }

    public static ScootersIgnitionApi d(on2 on2Var) {
        on2Var.getClass();
        return (ScootersIgnitionApi) on2Var.a(GoApiName.TaxiV4, ScootersIgnitionApi.class);
    }

    public static ScootersSessionsCurrentApi e(on2 on2Var) {
        on2Var.getClass();
        return (ScootersSessionsCurrentApi) on2Var.a(GoApiName.TaxiV4, ScootersSessionsCurrentApi.class);
    }

    public static ScootersUserStateApi f(on2 on2Var) {
        on2Var.getClass();
        return (ScootersUserStateApi) on2Var.a(GoApiName.TaxiV4, ScootersUserStateApi.class);
    }

    public static final uw80 g(AttachInfo attachInfo) {
        String str;
        String str2 = attachInfo.originalChatId;
        return (str2 == null || (str = attachInfo.existingId) == null) ? new tw80(attachInfo.uri.toString(), attachInfo.forceAsFile) : new OutgoingAttachment$ExistingAttachment(str2, str, attachInfo.fileName, attachInfo.size, attachInfo.uri.toString(), attachInfo.mimeType, attachInfo.width, attachInfo.height, attachInfo.durationMs, attachInfo.thumbHash);
    }
}
