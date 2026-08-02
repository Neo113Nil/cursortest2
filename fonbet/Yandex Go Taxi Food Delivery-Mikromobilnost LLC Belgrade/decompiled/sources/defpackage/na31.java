package defpackage;

import com.yandex.messaging.internal.entities.MessageReactions;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class na31 {
    public final long a;
    public final MessageReactions b;

    public na31(long j, MessageReactions messageReactions) {
        this.a = j;
        this.b = messageReactions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof na31)) {
            return false;
        }
        na31 na31Var = (na31) obj;
        return this.a == na31Var.a && jl40.l(this.b, na31Var.b);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        MessageReactions messageReactions = this.b;
        return hashCode + (messageReactions == null ? 0 : messageReactions.hashCode());
    }

    public final String toString() {
        return "VersionedReactions(version=" + this.a + ", reactions=" + this.b + Extension.C_BRAKE;
    }
}
