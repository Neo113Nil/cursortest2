package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes13.dex */
public final class nsr0 implements psr0 {
    public final String a;
    public final List b;
    public final List c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.collections.EmptyList] */
    public nsr0(int i, String str, ArrayList arrayList, ArrayList arrayList2) {
        str = (i & 1) != 0 ? "" : str;
        int i2 = i & 2;
        ?? r1 = EmptyList.a;
        arrayList = i2 != 0 ? r1 : arrayList;
        arrayList2 = (i & 4) != 0 ? r1 : arrayList2;
        this.a = str;
        this.b = arrayList;
        this.c = arrayList2;
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
        if (!(obj instanceof nsr0)) {
            return false;
        }
        nsr0 nsr0Var = (nsr0) obj;
        return jl40.l(this.a, nsr0Var.a) && jl40.l(this.b, nsr0Var.b) && jl40.l(this.c, nsr0Var.c);
    }

    @Override // defpackage.psr0
    public final String getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return unr0.c(unr0.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ly3.s(xvz.r("Completed(title=", this.a, ", missions=", this.b, ", buttons="), this.c, ", selectedMissionId=null)");
    }

    public nsr0() {
        this(15, null, null, null);
    }
}
