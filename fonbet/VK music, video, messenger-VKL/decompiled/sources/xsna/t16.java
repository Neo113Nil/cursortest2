package xsna;

import com.vk.clips.sdk.shared.feed.model.DataLoadState;
import java.util.List;

/* compiled from: BannerCompanionState.kt */
/* loaded from: classes17.dex */
public final class t16 {
    public final boolean a;
    public final boolean b;
    public final DataLoadState c;
    public final List<String> d;
    public final String e;
    public final o16 f;

    public /* synthetic */ t16(boolean z, DataLoadState dataLoadState, List list, String str) {
        this(z, false, dataLoadState, list, str, null);
    }

    public static t16 a(t16 t16Var, boolean z, DataLoadState dataLoadState, o16 o16Var, int i) {
        boolean z2 = (i & 1) != 0 ? t16Var.a : false;
        if ((i & 2) != 0) {
            z = t16Var.b;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            dataLoadState = t16Var.c;
        }
        DataLoadState dataLoadState2 = dataLoadState;
        List<String> list = t16Var.d;
        String str = t16Var.e;
        if ((i & 32) != 0) {
            o16Var = t16Var.f;
        }
        t16Var.getClass();
        t16Var.getClass();
        return new t16(z2, z3, dataLoadState2, list, str, o16Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t16)) {
            return false;
        }
        t16 t16Var = (t16) obj;
        return this.a == t16Var.a && this.b == t16Var.b && this.c == t16Var.c && epx.f(this.d, t16Var.d) && epx.f(this.e, t16Var.e) && epx.f(this.f, t16Var.f);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31;
        List<String> list = this.d;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.e;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        o16 o16Var = this.f;
        return Boolean.hashCode(false) + ((hashCode3 + (o16Var == null ? 0 : o16Var.hashCode())) * 31);
    }

    public final String toString() {
        return "BannerCompanionState(canShowBannerCompanion=" + this.a + ", showPositionReached=" + this.b + ", dataLoadState=" + this.c + ", wbItemIds=" + this.d + ", articles=" + this.e + ", bannerData=" + this.f + ", shouldSaveState=false)";
    }

    public t16(boolean z, boolean z2, DataLoadState dataLoadState, List list, String str, o16 o16Var) {
        this.a = z;
        this.b = z2;
        this.c = dataLoadState;
        this.d = list;
        this.e = str;
        this.f = o16Var;
    }
}
