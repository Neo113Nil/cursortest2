package xsna;

import com.vk.dto.newsfeed.entries.ClipsEntry;

/* compiled from: ClipsBlockHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class wjd extends ol60 {
    public final int h;
    public final ClipsEntry i;
    public final boolean j;
    public final String k;

    public wjd(int i, ClipsEntry clipsEntry, boolean z, String str) {
        super(i, 0, 0, 0, null);
        this.h = i;
        this.i = clipsEntry;
        this.j = z;
        this.k = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wjd)) {
            return false;
        }
        wjd wjdVar = (wjd) obj;
        return this.h == wjdVar.h && epx.f(this.i, wjdVar.i) && this.j == wjdVar.j && epx.f(this.k, wjdVar.k);
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        int b = qoy.b((this.i.hashCode() + (Integer.hashCode(this.h) * 31)) * 31, 31, this.j);
        String str = this.k;
        return Integer.hashCode(0) + ((b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsBlockHolderUiDto(holderType=");
        sb.append(this.h);
        sb.append(", entry=");
        sb.append(this.i);
        sb.append(", isAsync=");
        sb.append(this.j);
        sb.append(", trackCode=");
        return i5s.a(sb, this.k, ", seqId=0)");
    }
}
