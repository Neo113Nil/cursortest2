package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.map_object.BubbleStructure;

/* loaded from: classes5.dex */
public final class aqb0 {
    public final String a;
    public final String b;
    public final BubbleStructure c;
    public final Integer d;

    public aqb0(String str, String str2, BubbleStructure bubbleStructure, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = bubbleStructure;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqb0)) {
            return false;
        }
        aqb0 aqb0Var = (aqb0) obj;
        return jl40.l(this.a, aqb0Var.a) && jl40.l(this.b, aqb0Var.b) && this.c == aqb0Var.c && jl40.l(this.d, aqb0Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        Integer num = this.d;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("BubbleStyleState(backgroundColor=", this.a, ", fontColor=", this.b, ", structure=");
        v.append(this.c);
        v.append(", cornerRadius=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public aqb0() {
        this(0);
    }

    public /* synthetic */ aqb0(int i) {
        this(null, null, BubbleStructure.UNKNOWN, null);
    }
}
