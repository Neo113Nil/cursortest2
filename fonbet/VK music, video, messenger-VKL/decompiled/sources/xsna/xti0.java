package xsna;

import com.huawei.hms.framework.common.BundleUtil;
import java.util.UUID;
import kotlin.text.Regex;
import kotlin.text.RegexOption;

/* compiled from: SessionKey.kt */
/* loaded from: classes8.dex */
public final class xti0 {
    public static final Regex c = new Regex("^[a-z0-9]{1,13}$");
    public static final Regex d = new Regex("^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$", RegexOption.IGNORE_CASE);
    public final String a;
    public final UUID b;

    public xti0(String str, UUID uuid) {
        this.a = str;
        this.b = uuid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xti0)) {
            return false;
        }
        xti0 xti0Var = (xti0) obj;
        return epx.f(this.a, xti0Var.a) && epx.f(this.b, xti0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.a + BundleUtil.UNDERLINE_TAG + this.b;
    }
}
