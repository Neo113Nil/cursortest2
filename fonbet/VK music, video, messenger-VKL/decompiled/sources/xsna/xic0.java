package xsna;

import com.vk.newsfeed.posting.additional_settings.data.AdditionalSettingsConfiguration;
import java.util.UUID;

/* compiled from: PostingPatch.kt */
/* loaded from: classes4.dex */
public final class xic0 implements com.vk.newsfeed.posting.impl.domain.model.e {
    public final AdditionalSettingsConfiguration b;
    public final boolean c;
    public final UUID d;

    public xic0(AdditionalSettingsConfiguration additionalSettingsConfiguration, boolean z, UUID uuid) {
        this.b = additionalSettingsConfiguration;
        this.c = z;
        this.d = uuid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xic0)) {
            return false;
        }
        xic0 xic0Var = (xic0) obj;
        return epx.f(this.b, xic0Var.b) && this.c == xic0Var.c && epx.f(this.d, xic0Var.d);
    }

    public final int hashCode() {
        int b = qoy.b(this.b.hashCode() * 31, 31, this.c);
        UUID uuid = this.d;
        return b + (uuid == null ? 0 : uuid.hashCode());
    }

    public final String toString() {
        return "UpdateAdditionalSettings(configuration=" + this.b + ", isCommentChangeAvailable=" + this.c + ", screenUniqueId=" + this.d + ')';
    }
}
