package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: CompactInlineWriteBarHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class a6i extends ol60 {
    public final UserId h;
    public final int i;
    public final String j;
    public final boolean k;

    public a6i(int i, UserId userId, String str, boolean z) {
        super(65, 0, 0, 0, null);
        this.h = userId;
        this.i = i;
        this.j = str;
        this.k = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a6i)) {
            return false;
        }
        a6i a6iVar = (a6i) obj;
        a6iVar.getClass();
        return epx.f(this.h, a6iVar.h) && this.i == a6iVar.i && epx.f(this.j, a6iVar.j) && this.k == a6iVar.k;
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        int a = shy.a(this.i, bh10.a(Integer.hashCode(0) * 31, 31, this.h.b), 31);
        String str = this.j;
        return Boolean.hashCode(this.k) + ((a + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompactInlineWriteBarHolderUiDto(seqId=0, ownerId=");
        sb.append(this.h);
        sb.append(", postId=");
        sb.append(this.i);
        sb.append(", trackCode=");
        sb.append(this.j);
        sb.append(", canGroupComment=");
        return defpackage.q0.a(sb, this.k, ')');
    }
}
