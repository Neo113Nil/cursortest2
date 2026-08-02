package xsna;

import com.vk.dto.common.GroupsSuggestions;

/* compiled from: RecommendedGroupsHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class kdf0 extends ol60 {
    public final GroupsSuggestions h;
    public final String i;
    public final boolean j;
    public final bwy k;
    public final String l;

    public kdf0(GroupsSuggestions groupsSuggestions, String str, boolean z, bwy bwyVar, String str2) {
        super(116, 0, 0, 0, null);
        this.h = groupsSuggestions;
        this.i = str;
        this.j = z;
        this.k = bwyVar;
        this.l = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kdf0)) {
            return false;
        }
        kdf0 kdf0Var = (kdf0) obj;
        return epx.f(this.h, kdf0Var.h) && epx.f(this.i, kdf0Var.i) && this.j == kdf0Var.j && epx.f(this.k, kdf0Var.k) && epx.f(this.l, kdf0Var.l);
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        int hashCode = (this.k.hashCode() + qoy.b(urd0.a(this.h.hashCode() * 31, 31, this.i), 31, this.j)) * 31;
        String str = this.l;
        return Integer.hashCode(0) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecommendedGroupsHolderUiDto(groups=");
        sb.append(this.h);
        sb.append(", type=");
        sb.append(this.i);
        sb.append(", isAsync=");
        sb.append(this.j);
        sb.append(", lazyLoadState=");
        sb.append(this.k);
        sb.append(", trackCode=");
        return i5s.a(sb, this.l, ", seqId=0)");
    }
}
