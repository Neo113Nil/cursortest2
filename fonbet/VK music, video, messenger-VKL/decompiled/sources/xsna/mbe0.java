package xsna;

import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.donut.DonutLevel;
import xsna.dbe0;

/* compiled from: PublishAction.kt */
/* loaded from: classes7.dex */
public final class mbe0 implements dbe0.i {
    public final PrivacySetting b;
    public final DonutLevel c;

    public mbe0(PrivacySetting privacySetting, DonutLevel donutLevel) {
        this.b = privacySetting;
        this.c = donutLevel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mbe0)) {
            return false;
        }
        mbe0 mbe0Var = (mbe0) obj;
        return epx.f(this.b, mbe0Var.b) && epx.f(this.c, mbe0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        DonutLevel donutLevel = this.c;
        return hashCode + (donutLevel == null ? 0 : donutLevel.hashCode());
    }

    public final String toString() {
        return "Edit(newPrivacySetting=" + this.b + ", newDonutLevel=" + this.c + ')';
    }
}
