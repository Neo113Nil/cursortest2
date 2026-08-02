package defpackage;

import com.yandex.go.trusted_contacts.data.entities.network.ShareSettingsOption;
import com.yandex.go.trusted_contacts.share_settings.ShareSettingsItemType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class nlr0 extends xkr0 {
    public final String a;
    public final ShareSettingsOption b;

    public nlr0(String str, ShareSettingsOption shareSettingsOption) {
        ShareSettingsItemType shareSettingsItemType = ShareSettingsItemType.CONTACT;
        this.a = str;
        this.b = shareSettingsOption;
    }

    @Override // defpackage.xkr0
    public final boolean a(xkr0 xkr0Var) {
        if (!(xkr0Var instanceof nlr0)) {
            return false;
        }
        nlr0 nlr0Var = (nlr0) xkr0Var;
        return jl40.l(this.a, nlr0Var.a) && jl40.l(this.b, nlr0Var.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nlr0)) {
            return false;
        }
        nlr0 nlr0Var = (nlr0) obj;
        return jl40.l(this.a, nlr0Var.a) && jl40.l(this.b, nlr0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShareSettingsOptionItem(enabledId=" + this.a + ", settingsOption=" + this.b + Extension.C_BRAKE;
    }
}
