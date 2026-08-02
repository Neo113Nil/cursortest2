package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lpb41;", "", "Companion", "nb41", "ob41", "sdk-care"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class pb41 {
    public static final ob41 Companion = new ob41();
    public final float a;
    public final boolean b;

    public /* synthetic */ pb41(int i, float f, boolean z) {
        this.a = (i & 1) == 0 ? 0.0f : f;
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pb41)) {
            return false;
        }
        pb41 pb41Var = (pb41) obj;
        return Float.compare(this.a, pb41Var.a) == 0 && this.b == pb41Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ExposureConfig(correction=" + this.a + ", spotMetering=" + this.b + Extension.C_BRAKE;
    }

    public pb41() {
        this.a = 0.0f;
        this.b = false;
    }
}
