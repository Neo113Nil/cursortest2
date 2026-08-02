package xsna;

import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.dto.common.VideoFile;
import java.util.List;

/* compiled from: ClipsList.kt */
/* loaded from: classes14.dex */
public final class h7d {
    public final List<VideoFile> a;
    public final PaginationKey b;
    public final PaginationKey c;
    public final long d;
    public final String e;
    public final eqe0 f;

    /* JADX WARN: Multi-variable type inference failed */
    public h7d(List<? extends VideoFile> list, PaginationKey paginationKey, PaginationKey paginationKey2, long j, String str, eqe0 eqe0Var) {
        this.a = list;
        this.b = paginationKey;
        this.c = paginationKey2;
        this.d = j;
        this.e = str;
        this.f = eqe0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h7d)) {
            return false;
        }
        h7d h7dVar = (h7d) obj;
        return epx.f(this.a, h7dVar.a) && epx.f(this.b, h7dVar.b) && epx.f(this.c, h7dVar.c) && this.d == h7dVar.d && epx.f(this.e, h7dVar.e) && epx.f(this.f, h7dVar.f);
    }

    public final int hashCode() {
        int a = bh10.a((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        String str = this.e;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        eqe0 eqe0Var = this.f;
        return hashCode + (eqe0Var != null ? eqe0Var.a.hashCode() : 0);
    }

    public final String toString() {
        return "ClipListResponse(items=" + this.a + ", paginationKeyBackward=" + this.b + ", paginationKeyForward=" + this.c + ", count=" + this.d + ", title=" + this.e + ", questionnaires=" + this.f + ')';
    }
}
