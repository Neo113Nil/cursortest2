package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lfjj;", "", "Companion", "djj", "ejj", "divkit-section_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class fjj {
    public static final ejj Companion = new ejj();
    public final Boolean a;
    public final String b;
    public final Boolean c;
    public final Boolean d;

    public /* synthetic */ fjj(int i, Boolean bool, String str, Boolean bool2, Boolean bool3) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = bool;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bool2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!fjj.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        fjj fjjVar = (fjj) obj;
        return jl40.l(this.a, fjjVar.a) && jl40.l(this.b, fjjVar.b) && jl40.l(this.c, fjjVar.c) && jl40.l(this.d, fjjVar.d);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        Boolean bool2 = this.c;
        int hashCode2 = (hashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Boolean bool3 = this.d;
        int hashCode3 = (hashCode2 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        String str = this.b;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public fjj() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
