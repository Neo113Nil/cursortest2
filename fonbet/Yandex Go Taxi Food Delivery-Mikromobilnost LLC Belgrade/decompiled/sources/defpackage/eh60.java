package defpackage;

import com.yandex.go.navigator.driving.DrivingModeNotification;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class eh60 implements hmm {
    public final DrivingModeNotification a;

    static {
        int i = DrivingModeNotification.$stable;
    }

    public eh60(DrivingModeNotification drivingModeNotification) {
        this.a = drivingModeNotification;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eh60) && jl40.l(this.a, ((eh60) obj).a);
    }

    public final int hashCode() {
        DrivingModeNotification drivingModeNotification = this.a;
        if (drivingModeNotification == null) {
            return 0;
        }
        return drivingModeNotification.hashCode();
    }

    public final String toString() {
        return "NotificationContent(notification=" + this.a + Extension.C_BRAKE;
    }
}
