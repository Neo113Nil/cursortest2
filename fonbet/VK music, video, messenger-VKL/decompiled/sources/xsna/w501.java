package xsna;

import androidx.annotation.Nullable;
import java.util.Map;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes13.dex */
public final class w501 extends yq01 {
    public final Integer b;
    public final Map c;

    public /* synthetic */ w501(Integer num, Map map) {
        this.b = num;
        this.c = map;
    }

    @Override // xsna.yq01
    @Nullable
    public final Integer a() {
        return this.b;
    }

    @Override // xsna.yq01
    public final Map b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yq01)) {
            return false;
        }
        yq01 yq01Var = (yq01) obj;
        Integer num = this.b;
        if (num == null) {
            if (yq01Var.a() != null) {
                return false;
            }
        } else if (!num.equals(yq01Var.a())) {
            return false;
        }
        return this.c.equals(yq01Var.b());
    }

    public final int hashCode() {
        Integer num = this.b;
        return (((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "LocalTestingConfig{defaultSplitInstallErrorCode=" + this.b + ", splitInstallErrorCodeByModule=" + String.valueOf(this.c) + "}";
    }
}
