package xsna;

import com.vk.newsfeed.posting.impl.domain.model.PostPrivacyData;
import java.util.UUID;

/* compiled from: PrivacySettingsState.kt */
/* loaded from: classes4.dex */
public final class kfd0 implements km50 {
    public final PostPrivacyData b;
    public final lcd0 c;
    public final UUID d;

    public kfd0(PostPrivacyData postPrivacyData, lcd0 lcd0Var, UUID uuid) {
        this.b = postPrivacyData;
        this.c = lcd0Var;
        this.d = uuid;
    }

    public static kfd0 a(kfd0 kfd0Var, PostPrivacyData postPrivacyData, lcd0 lcd0Var, int i) {
        if ((i & 1) != 0) {
            postPrivacyData = kfd0Var.b;
        }
        if ((i & 2) != 0) {
            lcd0Var = kfd0Var.c;
        }
        UUID uuid = kfd0Var.d;
        kfd0Var.getClass();
        return new kfd0(postPrivacyData, lcd0Var, uuid);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kfd0)) {
            return false;
        }
        kfd0 kfd0Var = (kfd0) obj;
        return epx.f(this.b, kfd0Var.b) && epx.f(this.c, kfd0Var.c) && epx.f(this.d, kfd0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PrivacySettingsState(privacyData=" + this.b + ", privacyBestFriendInfo=" + this.c + ", uuid=" + this.d + ')';
    }
}
