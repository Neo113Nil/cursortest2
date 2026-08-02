package defpackage;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.OutMessage$NativeVibrateRequest$VibrateType;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class lt80 implements pw80 {
    public static final kt80 Companion = new kt80();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new yi80(17))};
    public final String a;
    public final OutMessage$NativeVibrateRequest$VibrateType b;

    public /* synthetic */ lt80(int i, String str, OutMessage$NativeVibrateRequest$VibrateType outMessage$NativeVibrateRequest$VibrateType) {
        if (2 != (i & 2)) {
            qje.Z(i, 2, jt80.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        this.b = outMessage$NativeVibrateRequest$VibrateType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lt80)) {
            return false;
        }
        lt80 lt80Var = (lt80) obj;
        return jl40.l(this.a, lt80Var.a) && this.b == lt80Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "NativeVibrateRequest(trackId=" + this.a + ", vibrateType=" + this.b + ')';
    }
}
