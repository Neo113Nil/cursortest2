package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class nmk0 implements omk0 {
    public final String a;
    public final String b;
    public final String c;
    public final ArrayList d;
    public final akk0 e;

    public nmk0(String str, String str2, String str3, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = arrayList;
        this.e = qpa1.e(str2, EmptyList.a, new nqs0[0]);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nmk0)) {
            return false;
        }
        nmk0 nmk0Var = (nmk0) obj;
        return jl40.l(this.a, nmk0Var.a) && jl40.l(this.b, nmk0Var.b) && jl40.l(this.c, nmk0Var.c) && this.d.equals(nmk0Var.d);
    }

    @Override // defpackage.omk0
    public final List g() {
        return this.d;
    }

    @Override // defpackage.zjk0
    public final wrs0 getAnalytics() {
        return this.e;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.omk0
    public final String getTitle() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return this.d.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("Text(id=", this.a, ", analyticsId=", this.b, ", title=");
        v.append(this.c);
        v.append(", badges=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
