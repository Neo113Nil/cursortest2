package ru.mail.libverify.m;

import java.util.Objects;
import ru.mail.verify.core.utils.Gsonable;

/* loaded from: classes9.dex */
public class g implements Gsonable {
    private String device_id;
    private String system_id;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Objects.equals(this.device_id, gVar.device_id) && Objects.equals(this.system_id, gVar.system_id);
    }

    public final int hashCode() {
        return Objects.hash(this.device_id, this.system_id);
    }
}
