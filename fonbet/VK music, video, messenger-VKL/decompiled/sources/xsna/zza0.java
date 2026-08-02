package xsna;

import com.vk.music.player.api.BottomPlayerAppearance;

/* compiled from: PlayerConfig.kt */
/* loaded from: classes3.dex */
public final class zza0 {
    public final BottomPlayerAppearance a;

    public zza0(BottomPlayerAppearance bottomPlayerAppearance) {
        this.a = bottomPlayerAppearance;
    }

    public final BottomPlayerAppearance a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zza0) && this.a == ((zza0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PlayerConfig(bottomPlayerAppearance=" + this.a + ')';
    }
}
