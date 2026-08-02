package xsna;

import java.util.ArrayList;

/* compiled from: VmojiMiniAppParamsBuilder.kt */
/* loaded from: classes6.dex */
public final class y8w0 {
    public String a;
    public String b;
    public String c;
    public String d;
    public Boolean e;
    public String f;

    public y8w0() {
        this(0);
    }

    public final String a() {
        ArrayList arrayList = new ArrayList();
        if (this.a != null) {
            arrayList.add("character_id=" + this.a);
        }
        String str = this.b;
        if (str != null) {
            arrayList.add("section_id=".concat(str));
        }
        String str2 = this.c;
        if (str2 != null) {
            arrayList.add("control_id=".concat(str2));
        }
        String str3 = this.d;
        if (str3 != null) {
            arrayList.add("control_item_value=".concat(str3));
        }
        Boolean bool = this.e;
        if (bool != null) {
            arrayList.add("is_suggested=" + bool.booleanValue());
        }
        String str4 = this.f;
        if (str4 != null) {
            arrayList.add("promo_id=".concat(str4));
        }
        return j5g.g0(arrayList, "&", null, null, 0, null, 62);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y8w0)) {
            return false;
        }
        y8w0 y8w0Var = (y8w0) obj;
        return epx.f(this.a, y8w0Var.a) && epx.f(this.b, y8w0Var.b) && epx.f(this.c, y8w0Var.c) && epx.f(this.d, y8w0Var.d) && epx.f(this.e, y8w0Var.e) && epx.f(this.f, y8w0Var.f);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.e;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.f;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VmojiMiniAppParamsBuilder(characterId=");
        sb.append(this.a);
        sb.append(", sectionId=");
        sb.append(this.b);
        sb.append(", controlId=");
        sb.append(this.c);
        sb.append(", controlItemValue=");
        sb.append(this.d);
        sb.append(", isSuggested=");
        sb.append(this.e);
        sb.append(", promoId=");
        return ho8.a(sb, this.f, ')');
    }

    public y8w0(int i) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }
}
