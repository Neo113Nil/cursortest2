package one.video.calls.sdk.internal.upload.config;

import com.vk.movika.sdk.android.defaultplayer.interactive.c;
import java.io.Serializable;

/* compiled from: BitrateDumpGatheringConfig.kt */
/* loaded from: classes8.dex */
public final class BitrateDumpGatheringConfig implements Serializable {
    private final boolean isEnabled;

    public BitrateDumpGatheringConfig(boolean z) {
        this.isEnabled = z;
    }

    public final boolean d() {
        return this.isEnabled;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BitrateDumpGatheringConfig) && this.isEnabled == ((BitrateDumpGatheringConfig) obj).isEnabled;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isEnabled);
    }

    public final String toString() {
        return c.a("BitrateDumpGatheringConfig(isEnabled=", ")", this.isEnabled);
    }
}
