package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class msr0 implements psr0 {
    public final String a;
    public final List b;
    public final List c;
    public final String d;
    public final String e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ msr0(int i, String str, ArrayList arrayList) {
        this(r1, r2, null, r7 != 0 ? r2 : arrayList, null);
        String str2 = (i & 1) != 0 ? "" : str;
        int i2 = i & 4;
        List list = EmptyList.a;
    }

    @Override // defpackage.psr0
    public final List a() {
        return this.c;
    }

    @Override // defpackage.psr0
    public final List b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof msr0)) {
            return false;
        }
        msr0 msr0Var = (msr0) obj;
        return jl40.l(this.a, msr0Var.a) && jl40.l(this.b, msr0Var.b) && jl40.l(this.c, msr0Var.c) && jl40.l(this.d, msr0Var.d) && jl40.l(this.e, msr0Var.e);
    }

    @Override // defpackage.psr0
    public final String getTitle() {
        return this.a;
    }

    public final int hashCode() {
        int c = unr0.c(unr0.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder r = xvz.r("Available(title=", this.a, ", missions=", this.b, ", buttons=");
        oyr.D(", selectedMissionId=", this.d, ", userAgreement=", r, this.c);
        return oyr.t(r, this.e, Extension.C_BRAKE);
    }

    public msr0(String str, List list, String str2, List list2, String str3) {
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = str2;
        this.e = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public msr0() {
        this(31, null, 0 == true ? 1 : 0);
    }
}
