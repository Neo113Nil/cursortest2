package defpackage;

import com.yandex.plus.core.data.common.PlusColor;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class idg {
    public final PlusColor a;
    public final String b;
    public final ArrayList c;
    public final ArrayList d;
    public final PlusColor e;
    public final PlusColor f;
    public final PlusColor g;
    public final float h;

    public idg(PlusColor plusColor, String str, ArrayList arrayList, ArrayList arrayList2, PlusColor plusColor2, PlusColor plusColor3, PlusColor plusColor4, float f) {
        this.a = plusColor;
        this.b = str;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = plusColor2;
        this.f = plusColor3;
        this.g = plusColor4;
        this.h = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof idg)) {
            return false;
        }
        idg idgVar = (idg) obj;
        return this.a.equals(idgVar.a) && jl40.l(this.b, idgVar.b) && this.c.equals(idgVar.c) && this.d.equals(idgVar.d) && this.e.equals(idgVar.e) && this.f.equals(idgVar.f) && this.g.equals(idgVar.g) && Float.compare(this.h, idgVar.h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ly3.b(ly3.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GiftProgressProperties(backgroundColor=");
        sb.append(this.a);
        sb.append(", scoreText=");
        sb.append(this.b);
        sb.append(", scoreTextsIcons=");
        sb.append(this.c);
        sb.append(", scoreStyledTexts=");
        sb.append(this.d);
        sb.append(", scoreFilledTextColor=");
        sb.append(this.e);
        sb.append(", scoreUnfilledTextColor=");
        sb.append(this.f);
        sb.append(", progressColor=");
        sb.append(this.g);
        sb.append(", progressPercent=");
        return n.n(sb, this.h, ')');
    }
}
