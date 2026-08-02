package xsna;

import com.vk.newsfeed.posting.impl.domain.model.PostPrivacyData;
import com.vk.newsfeed.posting.privacy_picker.presentation.PrivacyViewState;

/* compiled from: PrivacySettingsViewState.kt */
/* loaded from: classes4.dex */
public final class ifd0 implements fm50<kfd0> {
    public final yzt0<PostPrivacyData> a;
    public final yzt0<lcd0> b;
    public final yzt0<PrivacyViewState> c;

    public ifd0(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3) {
        this.a = h0u0Var;
        this.b = h0u0Var2;
        this.c = h0u0Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ifd0)) {
            return false;
        }
        ifd0 ifd0Var = (ifd0) obj;
        return epx.f(this.a, ifd0Var.a) && epx.f(this.b, ifd0Var.b) && epx.f(this.c, ifd0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + sr.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(privacyData=");
        sb.append(this.a);
        sb.append(", privacyBestFriendsInfo=");
        sb.append(this.b);
        sb.append(", newPrivacyUiState=");
        return tr.c(sb, this.c, ')');
    }
}
