package xsna;

import com.vk.dto.newsfeed.FaveTag;
import com.vk.fave.entities.FaveType;

/* compiled from: FaveEmptyPlaceholderDto.kt */
/* loaded from: classes4.dex */
public final class unq {
    public final FaveType a;
    public final FaveTag b;
    public final boolean c;

    public unq(FaveType faveType, FaveTag faveTag, boolean z) {
        this.a = faveType;
        this.b = faveTag;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof unq)) {
            return false;
        }
        unq unqVar = (unq) obj;
        return this.a == unqVar.a && epx.f(this.b, unqVar.b) && this.c == unqVar.c;
    }

    public final int hashCode() {
        FaveType faveType = this.a;
        int hashCode = (faveType == null ? 0 : faveType.hashCode()) * 31;
        FaveTag faveTag = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (faveTag != null ? faveTag.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FaveEmptyPlaceholderDto(faveType=");
        sb.append(this.a);
        sb.append(", faveTag=");
        sb.append(this.b);
        sb.append(", isEmptyPages=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
