package xsna;

import com.vk.dto.common.data.PrivacySetting;
import xsna.dbe0;

/* compiled from: PublishAction.kt */
/* loaded from: classes7.dex */
public final class kbe0 implements dbe0.i {
    public final PrivacySetting b;

    public kbe0(PrivacySetting privacySetting) {
        this.b = privacySetting;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kbe0) && epx.f(this.b, ((kbe0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Edit(newPrivacySetting=" + this.b + ')';
    }
}
