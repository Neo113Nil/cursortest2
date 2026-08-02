package xsna;

import com.vk.voip.miniapps.impl.picture_in_picture.feature.data.MiniAppNetworkState;

/* compiled from: MiniAppOwnState.kt */
/* loaded from: classes7.dex */
public final class zp20 {
    public final boolean a;
    public final MiniAppNetworkState b;

    public zp20(boolean z, MiniAppNetworkState miniAppNetworkState) {
        this.a = z;
        this.b = miniAppNetworkState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zp20)) {
            return false;
        }
        zp20 zp20Var = (zp20) obj;
        return this.a == zp20Var.a && this.b == zp20Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "MiniAppOwnState(isMicrophoneEnabled=" + this.a + ", networkState=" + this.b + ')';
    }
}
