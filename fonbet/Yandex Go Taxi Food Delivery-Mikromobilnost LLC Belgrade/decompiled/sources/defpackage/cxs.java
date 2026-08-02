package defpackage;

/* loaded from: classes2.dex */
public final class cxs implements bwg {
    public final String a;
    public final String b;

    public cxs(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cxs)) {
            return false;
        }
        cxs cxsVar = (cxs) obj;
        return jl40.l(this.a, cxsVar.a) && this.b.equals(cxsVar.b);
    }

    @Override // defpackage.bwg
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GeneralInfoModel(id=");
        sb.append(this.a);
        sb.append(", value=");
        return b64.p(sb, this.b, ')');
    }
}
