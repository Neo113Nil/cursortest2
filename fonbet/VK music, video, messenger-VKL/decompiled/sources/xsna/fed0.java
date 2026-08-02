package xsna;

import com.vk.dto.common.data.PrivacySetting;

/* compiled from: PrivacyOptionItem.kt */
/* loaded from: classes5.dex */
public final class fed0 {
    public final PrivacySetting.PrivacyRule a;
    public final String b;

    public fed0(PrivacySetting.PrivacyRule privacyRule, String str) {
        this.a = privacyRule;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fed0)) {
            return false;
        }
        fed0 fed0Var = (fed0) obj;
        return epx.f(this.a, fed0Var.a) && epx.f(this.b, fed0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PrivacyOptionItem(rule=");
        sb.append(this.a);
        sb.append(", subtitle=");
        return ho8.a(sb, this.b, ')');
    }
}
