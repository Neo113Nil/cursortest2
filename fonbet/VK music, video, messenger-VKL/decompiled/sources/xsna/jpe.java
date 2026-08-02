package xsna;

import com.vk.clips.sdk.shared.paging.PaginationKey;
import java.util.ArrayList;

/* compiled from: ClipsPageModel.kt */
/* loaded from: classes17.dex */
public final class jpe {
    public final ArrayList a;
    public final PaginationKey b;

    public jpe(ArrayList arrayList, PaginationKey paginationKey) {
        this.a = arrayList;
        this.b = paginationKey;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jpe)) {
            return false;
        }
        jpe jpeVar = (jpe) obj;
        return this.a.equals(jpeVar.a) && epx.f(this.b, jpeVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ClipsPageModel(clips=" + this.a + ", paginationKey=" + this.b + ')';
    }
}
