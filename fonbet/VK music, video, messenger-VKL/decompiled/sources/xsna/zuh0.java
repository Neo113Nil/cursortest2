package xsna;

import com.vk.music.ui.search.history.SearchHistoryItemViewParams$ActionIconParams;
import com.vk.music.ui.search.history.SearchHistoryItemViewParams$SubTitleParams;
import xsna.avh0;

/* compiled from: StateParams.kt */
/* loaded from: classes3.dex */
public final class zuh0 {
    public final avh0 a;
    public final bi40 b;
    public final bvh0 c;
    public final SearchHistoryItemViewParams$SubTitleParams d;
    public final SearchHistoryItemViewParams$ActionIconParams e;
    public final SearchHistoryItemViewParams$ActionIconParams f;

    public zuh0() {
        this(0);
    }

    public static zuh0 a(zuh0 zuh0Var, avh0 avh0Var, bvh0 bvh0Var, SearchHistoryItemViewParams$SubTitleParams searchHistoryItemViewParams$SubTitleParams, SearchHistoryItemViewParams$ActionIconParams searchHistoryItemViewParams$ActionIconParams) {
        bi40 bi40Var = zuh0Var.b;
        SearchHistoryItemViewParams$ActionIconParams searchHistoryItemViewParams$ActionIconParams2 = zuh0Var.e;
        zuh0Var.getClass();
        return new zuh0(avh0Var, bi40Var, bvh0Var, searchHistoryItemViewParams$SubTitleParams, searchHistoryItemViewParams$ActionIconParams2, searchHistoryItemViewParams$ActionIconParams);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zuh0)) {
            return false;
        }
        zuh0 zuh0Var = (zuh0) obj;
        return epx.f(this.a, zuh0Var.a) && epx.f(this.b, zuh0Var.b) && epx.f(this.c, zuh0Var.c) && epx.f(this.d, zuh0Var.d) && epx.f(this.e, zuh0Var.e) && epx.f(this.f, zuh0Var.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        bi40 bi40Var = this.b;
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (bi40Var == null ? 0 : bi40Var.hashCode())) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SearchHistoryItemState(image=" + this.a + ", downloading=" + this.b + ", title=" + this.c + ", subtitle=" + this.d + ", preActionIcon=" + this.e + ", actionIcon=" + this.f + ')';
    }

    public zuh0(avh0 avh0Var, bi40 bi40Var, bvh0 bvh0Var, SearchHistoryItemViewParams$SubTitleParams searchHistoryItemViewParams$SubTitleParams, SearchHistoryItemViewParams$ActionIconParams searchHistoryItemViewParams$ActionIconParams, SearchHistoryItemViewParams$ActionIconParams searchHistoryItemViewParams$ActionIconParams2) {
        this.a = avh0Var;
        this.b = bi40Var;
        this.c = bvh0Var;
        this.d = searchHistoryItemViewParams$SubTitleParams;
        this.e = searchHistoryItemViewParams$ActionIconParams;
        this.f = searchHistoryItemViewParams$ActionIconParams2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zuh0(int i) {
        this(r1, null, bvh0.c, r4, r5, r5);
        avh0.b bVar = avh0.b.a;
        SearchHistoryItemViewParams$SubTitleParams searchHistoryItemViewParams$SubTitleParams = SearchHistoryItemViewParams$SubTitleParams.c;
        SearchHistoryItemViewParams$ActionIconParams searchHistoryItemViewParams$ActionIconParams = SearchHistoryItemViewParams$ActionIconParams.d;
    }
}
