package defpackage;

import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.BottomSheetPayloadSectionEntity$Type;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class jg6 {
    public final BottomSheetPayloadSectionEntity$Type a;
    public final String b;
    public final List c;

    public jg6(BottomSheetPayloadSectionEntity$Type bottomSheetPayloadSectionEntity$Type, String str, List list) {
        this.a = bottomSheetPayloadSectionEntity$Type;
        this.b = str;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jg6)) {
            return false;
        }
        jg6 jg6Var = (jg6) obj;
        return this.a == jg6Var.a && jl40.l(this.b, jg6Var.b) && this.c.equals(jg6Var.c);
    }

    public final int hashCode() {
        BottomSheetPayloadSectionEntity$Type bottomSheetPayloadSectionEntity$Type = this.a;
        return this.c.hashCode() + unr0.b((bottomSheetPayloadSectionEntity$Type == null ? 0 : bottomSheetPayloadSectionEntity$Type.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BottomSheetPayloadSectionEntity(sectionType=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", items=");
        return ly3.s(sb, this.c, Extension.C_BRAKE);
    }
}
