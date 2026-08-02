package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class nn1 implements afu0 {
    public final FormattedText a;
    public final List b;
    public final hhg c;
    public final w4v w;
    public final w4v x;
    public final String y;
    public final Object z;

    public nn1(FormattedText formattedText, ArrayList arrayList, hhg hhgVar, w4v w4vVar, w4v w4vVar2, String str, Object obj) {
        this.a = formattedText;
        this.b = arrayList;
        this.c = hhgVar;
        this.w = w4vVar;
        this.x = w4vVar2;
        this.y = str;
        this.z = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nn1)) {
            return false;
        }
        nn1 nn1Var = (nn1) obj;
        return jl40.l(this.a, nn1Var.a) && jl40.l(this.b, nn1Var.b) && this.c.equals(nn1Var.c) && jl40.l(this.w, nn1Var.w) && jl40.l(this.x, nn1Var.x) && jl40.l(this.y, nn1Var.y) && jl40.l(this.z, nn1Var.z);
    }

    public final int hashCode() {
        FormattedText formattedText = this.a;
        int hashCode = (formattedText == null ? 0 : formattedText.a.hashCode()) * 31;
        List list = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        w4v w4vVar = this.w;
        int hashCode3 = (hashCode2 + (w4vVar == null ? 0 : w4vVar.hashCode())) * 31;
        w4v w4vVar2 = this.x;
        int hashCode4 = (hashCode3 + (w4vVar2 == null ? 0 : w4vVar2.hashCode())) * 31;
        String str = this.y;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Object obj = this.z;
        return hashCode5 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AiChatModel(text=");
        sb.append(this.a);
        sb.append(", dynamicTexts=");
        sb.append(this.b);
        sb.append(", action=");
        sb.append(this.c);
        sb.append(", leadImage=");
        sb.append(this.w);
        sb.append(", trailImage=");
        sb.append(this.x);
        sb.append(", metricaLabel=");
        sb.append(this.y);
        sb.append(", meta=");
        return x4e.h(sb, this.z, Extension.C_BRAKE);
    }
}
