package xsna;

import com.vk.fave.entities.FaveSource;

/* compiled from: FaveMetaInfo.kt */
/* loaded from: classes18.dex */
public final class pqq {
    public final String a;
    public final String b;
    public final String c;
    public final FaveSource d;

    public pqq() {
        this(null, null, null, null, 15);
    }

    public static pqq a(pqq pqqVar, FaveSource faveSource) {
        String str = pqqVar.a;
        String str2 = pqqVar.b;
        String str3 = pqqVar.c;
        pqqVar.getClass();
        return new pqq(str, str2, str3, faveSource);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pqq)) {
            return false;
        }
        pqq pqqVar = (pqq) obj;
        return epx.f(this.a, pqqVar.a) && epx.f(this.b, pqqVar.b) && epx.f(this.c, pqqVar.c) && this.d == pqqVar.d;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        FaveSource faveSource = this.d;
        return hashCode3 + (faveSource != null ? faveSource.hashCode() : 0);
    }

    public final String toString() {
        return "FaveMetaInfo(accessKey=" + this.a + ", ref=" + this.b + ", trackCode=" + this.c + ", source=" + this.d + ')';
    }

    public pqq(String str, String str2, String str3, FaveSource faveSource) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = faveSource;
    }

    public /* synthetic */ pqq(String str, String str2, String str3, FaveSource faveSource, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : faveSource);
    }
}
