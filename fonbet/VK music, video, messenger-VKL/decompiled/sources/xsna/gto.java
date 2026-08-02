package xsna;

import ru.ok.android.api.core.ApiInvocationException;

/* compiled from: DzenArticlesBlockHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class gto extends ol60 {
    public final String h;
    public final String i;

    public gto(String str, String str2) {
        super(ApiInvocationException.ErrorCodes.GROUP_RESTRICTION, 0, 0, 0, null);
        this.h = str;
        this.i = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gto)) {
            return false;
        }
        gto gtoVar = (gto) obj;
        return epx.f(this.h, gtoVar.h) && epx.f(this.i, gtoVar.i);
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        String str = this.h;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.i;
        return Integer.hashCode(0) + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DzenArticlesBlockHolderUiDto(title=");
        sb.append(this.h);
        sb.append(", iconStr=");
        return i5s.a(sb, this.i, ", seqId=0)");
    }
}
