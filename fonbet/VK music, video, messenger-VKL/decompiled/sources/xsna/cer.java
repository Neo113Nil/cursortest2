package xsna;

import com.vk.catalog2.common.dto.ui.UIBlockList;

/* compiled from: CatalogCommand.kt */
/* loaded from: classes16.dex */
public final class cer extends n3a {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final izs<UIBlockList, Boolean> e;

    public cer() {
        throw null;
    }

    public cer(int i, String str, String str2, izs izsVar, boolean z) {
        str2 = (i & 2) != 0 ? null : str2;
        boolean z2 = (i & 4) != 0;
        z = (i & 8) != 0 ? false : z;
        this.a = str;
        this.b = str2;
        this.c = z2;
        this.d = z;
        this.e = izsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cer)) {
            return false;
        }
        cer cerVar = (cer) obj;
        return epx.f(this.a, cerVar.a) && epx.f(this.b, cerVar.b) && this.c == cerVar.c && this.d == cerVar.d && epx.f(this.e, cerVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.e.hashCode() + qoy.b(qoy.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilterSwitchedInsideBlock(replacementId=");
        sb.append(this.a);
        sb.append(", replacementPlace=");
        sb.append(this.b);
        sb.append(", shouldShowProgress=");
        sb.append(this.c);
        sb.append(", scrollToTop=");
        sb.append(this.d);
        sb.append(", shouldHandleSwitch=");
        return up.c(sb, this.e, ')');
    }
}
