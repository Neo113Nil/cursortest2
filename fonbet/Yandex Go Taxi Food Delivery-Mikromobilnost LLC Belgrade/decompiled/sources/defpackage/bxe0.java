package defpackage;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PresentationOptionsDto$ModalHeight$Type;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class bxe0 {
    public static final zwe0 Companion = new zwe0();
    public static final i3y[] c = {a.b(LazyThreadSafetyMode.PUBLICATION, new jee0(25)), null};
    public final PresentationOptionsDto$ModalHeight$Type a;
    public final int b;

    public /* synthetic */ bxe0(int i, PresentationOptionsDto$ModalHeight$Type presentationOptionsDto$ModalHeight$Type, int i2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, ywe0.a.getDescriptor());
            throw null;
        }
        this.a = presentationOptionsDto$ModalHeight$Type;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bxe0)) {
            return false;
        }
        bxe0 bxe0Var = (bxe0) obj;
        return this.a == bxe0Var.a && this.b == bxe0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ModalHeight(type=");
        sb.append(this.a);
        sb.append(", value=");
        return oyr.s(sb, this.b, ')');
    }
}
