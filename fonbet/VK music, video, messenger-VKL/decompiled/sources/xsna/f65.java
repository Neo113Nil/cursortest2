package xsna;

import com.vk.api.generated.auth.dto.AuthServiceUserValueDto;

/* compiled from: AuthServiceUserValue.kt */
/* loaded from: classes6.dex */
public final class f65 {
    public final AuthServiceUserValueDto.TypeDto a;
    public final String b;

    public f65(AuthServiceUserValueDto.TypeDto typeDto, String str) {
        this.a = typeDto;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f65)) {
            return false;
        }
        f65 f65Var = (f65) obj;
        return this.a == f65Var.a && epx.f(this.b, f65Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthServiceUserValue(type=");
        sb.append(this.a);
        sb.append(", value=");
        return ho8.a(sb, this.b, ')');
    }
}
