package xsna;

import java.util.ArrayList;

/* compiled from: StoryStatisticsInfoDbModel.kt */
/* loaded from: classes6.dex */
public final class efm0 {
    public final String a;
    public final String b;
    public final String c;
    public final ArrayList d;

    public efm0(String str, String str2, String str3, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof efm0)) {
            return false;
        }
        efm0 efm0Var = (efm0) obj;
        return this.a.equals(efm0Var.a) && epx.f(this.b, efm0Var.b) && epx.f(this.c, efm0Var.c) && this.d.equals(efm0Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return Boolean.hashCode(false) + qr.a(this.d, (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "StoryStatisticsInfoDbModel(preview=" + this.a + ", achievement=" + this.b + ", achievementSubtitle=" + this.c + ", categories=" + this.d + ", needPrivacyBlock=false)";
    }
}
