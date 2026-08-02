package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lgjp0;", "Lkr;", "Companion", "ejp0", "fjp0", "flex-sections-action_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class gjp0 extends kr {
    public static final fjp0 Companion = new fjp0();
    public final Boolean a;

    public /* synthetic */ gjp0(Boolean bool, int i) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return gjp0.class.equals(obj != null ? obj.getClass() : null) && jl40.l(this.a, ((gjp0) obj).a);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        if (bool != null) {
            return bool.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ScrollToScreenTopAction(isAnimated=" + this.a + Extension.C_BRAKE;
    }

    public gjp0() {
        this(null);
    }

    public gjp0(Boolean bool) {
        this.a = bool;
    }
}
