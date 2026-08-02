package xsna;

import com.vk.clips.sdk.shared.paging.PaginationKey;
import java.util.List;

/* compiled from: SdkClipListResponse.kt */
/* loaded from: classes17.dex */
public final class qih0 {
    public final List<wih0> a;
    public final int b;
    public final int c;
    public final PaginationKey d;
    public final PaginationKey e;
    public final String f;
    public final eqe0 g;
    public final wrr h;

    /* JADX WARN: Multi-variable type inference failed */
    public qih0(List<? extends wih0> list, int i, int i2, PaginationKey paginationKey, PaginationKey paginationKey2, String str, eqe0 eqe0Var, wrr wrrVar) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = paginationKey;
        this.e = paginationKey2;
        this.f = str;
        this.g = eqe0Var;
        this.h = wrrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qih0)) {
            return false;
        }
        qih0 qih0Var = (qih0) obj;
        return epx.f(this.a, qih0Var.a) && this.b == qih0Var.b && this.c == qih0Var.c && epx.f(this.d, qih0Var.d) && epx.f(this.e, qih0Var.e) && epx.f(this.f, qih0Var.f) && epx.f(this.g, qih0Var.g) && epx.f(this.h, qih0Var.h);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + ((this.d.hashCode() + shy.a(this.c, shy.a(this.b, this.a.hashCode() * 31, 31), 31)) * 31)) * 31;
        String str = this.f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        eqe0 eqe0Var = this.g;
        int hashCode3 = (hashCode2 + (eqe0Var == null ? 0 : eqe0Var.a.hashCode())) * 31;
        wrr wrrVar = this.h;
        return hashCode3 + (wrrVar != null ? wrrVar.hashCode() : 0);
    }

    public final String toString() {
        return "SdkClipListResponse(items=" + this.a + ", totalCount=" + this.b + ", itemsWithZeroIdCount=" + this.c + ", paginationKeyBackward=" + this.d + ", paginationKeyForward=" + this.e + ", title=" + this.f + ", questionnaires=" + this.g + ", floatingButton=" + this.h + ')';
    }

    public /* synthetic */ qih0(List list, PaginationKey paginationKey, PaginationKey paginationKey2, String str, eqe0 eqe0Var) {
        this(list, 0, 0, paginationKey, paginationKey2, str, eqe0Var, null);
    }
}
