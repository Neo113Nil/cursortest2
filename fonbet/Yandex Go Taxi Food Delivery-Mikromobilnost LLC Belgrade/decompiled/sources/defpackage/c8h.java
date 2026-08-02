package defpackage;

import com.yandex.go.inapp_calls.api.defaultoutgoingcall.DefaultOutgoingCallType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class c8h {
    public final DefaultOutgoingCallType a;
    public final String b;
    public final boolean c;

    public c8h(DefaultOutgoingCallType defaultOutgoingCallType, String str, boolean z) {
        this.a = defaultOutgoingCallType;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8h)) {
            return false;
        }
        c8h c8hVar = (c8h) obj;
        return this.a == c8hVar.a && jl40.l(this.b, c8hVar.b) && this.c == c8hVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DefaultCallTypeUiStateItem(type=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", isSelected=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
