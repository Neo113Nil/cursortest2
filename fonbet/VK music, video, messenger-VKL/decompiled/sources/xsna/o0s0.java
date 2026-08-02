package xsna;

import com.vk.log.L;
import org.json.JSONObject;

/* compiled from: VideoAdsTrialSuspendConfig.kt */
/* loaded from: classes11.dex */
public final class o0s0 {
    public static final a c = new a();
    public final boolean a;
    public final boolean b;

    /* compiled from: VideoAdsTrialSuspendConfig.kt */
    public static final class a {
        public static o0s0 a(String str) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new o0s0(f370.p(jSONObject, "showSuccessPopup", true), f370.p(jSONObject, "checkInstallDate", true));
            } catch (Exception e) {
                L.i(e);
                return new o0s0(true, true);
            }
        }
    }

    public o0s0() {
        this(true, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0s0)) {
            return false;
        }
        o0s0 o0s0Var = (o0s0) obj;
        return this.a == o0s0Var.a && this.b == o0s0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoAdsTrialSuspendConfig(showSuccessPopup=");
        sb.append(this.a);
        sb.append(", checkInstallDate=");
        return defpackage.q0.a(sb, this.b, ')');
    }

    public o0s0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
