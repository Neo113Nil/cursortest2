package defpackage;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.InMessage$LogoutResponse$LogoutStatus;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class imv implements gov {
    public static final gmv Companion = new gmv();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new syu(24))};
    public final String a;
    public final InMessage$LogoutResponse$LogoutStatus b;

    public /* synthetic */ imv(int i, String str, InMessage$LogoutResponse$LogoutStatus inMessage$LogoutResponse$LogoutStatus) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, fmv.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = inMessage$LogoutResponse$LogoutStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof imv)) {
            return false;
        }
        imv imvVar = (imv) obj;
        return jl40.l(this.a, imvVar.a) && this.b == imvVar.b;
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "LogoutResponse(trackId=" + this.a + ", status=" + this.b + ')';
    }

    public imv(String str, InMessage$LogoutResponse$LogoutStatus inMessage$LogoutResponse$LogoutStatus) {
        this.a = str;
        this.b = inMessage$LogoutResponse$LogoutStatus;
    }
}
