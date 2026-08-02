package defpackage;

import com.yandex.messaging.ui.settings.inviteLinkInfo.InviteLinkType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class lww {
    public final InviteLinkType a;
    public final boolean b;

    public lww(InviteLinkType inviteLinkType, boolean z) {
        this.a = inviteLinkType;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lww)) {
            return false;
        }
        lww lwwVar = (lww) obj;
        return this.a == lwwVar.a && this.b == lwwVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InviteLinkInfoUiState(selectedLinkType=" + this.a + ", isLoading=" + this.b + Extension.C_BRAKE;
    }

    public lww() {
        this(0);
    }

    public /* synthetic */ lww(int i) {
        this(InviteLinkType.TEMPORARY, false);
    }
}
