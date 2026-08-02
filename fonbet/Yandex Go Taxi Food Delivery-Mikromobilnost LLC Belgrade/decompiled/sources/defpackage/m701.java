package defpackage;

import java.util.UUID;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class m701 implements uni {
    public final UUID a;

    public m701(UUID uuid) {
        this.a = uuid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m701) && this.a.equals(((m701) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TrackingSkeletonScreenArgs(localUuid=" + this.a + Extension.C_BRAKE;
    }
}
