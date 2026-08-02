package com.yandex.passport.internal.flags.presentation;

import defpackage.jl40;
import defpackage.unr0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes15.dex */
public final class d0 {
    public final List a;
    public final u b;
    public final Throwable c;
    public final c0 d;
    public final boolean e;

    public d0(List list, u uVar, Throwable th, c0 c0Var, boolean z) {
        this.a = list;
        this.b = uVar;
        this.c = th;
        this.d = c0Var;
        this.e = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.List] */
    public static d0 a(d0 d0Var, ArrayList arrayList, u uVar, Throwable th, c0 c0Var, boolean z, int i) {
        ArrayList arrayList2 = arrayList;
        if ((i & 1) != 0) {
            arrayList2 = d0Var.a;
        }
        ArrayList arrayList3 = arrayList2;
        if ((i & 2) != 0) {
            uVar = d0Var.b;
        }
        u uVar2 = uVar;
        if ((i & 4) != 0) {
            th = d0Var.c;
        }
        Throwable th2 = th;
        if ((i & 8) != 0) {
            c0Var = d0Var.d;
        }
        c0 c0Var2 = c0Var;
        if ((i & 16) != 0) {
            z = d0Var.e;
        }
        d0Var.getClass();
        return new d0(arrayList3, uVar2, th2, c0Var2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return jl40.l(this.a, d0Var.a) && jl40.l(this.b, d0Var.b) && jl40.l(this.c, d0Var.c) && jl40.l(this.d, d0Var.d) && this.e == d0Var.e;
    }

    public final int hashCode() {
        List list = this.a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        u uVar = this.b;
        int hashCode2 = (hashCode + (uVar == null ? 0 : uVar.hashCode())) * 31;
        Throwable th = this.c;
        int hashCode3 = (hashCode2 + (th == null ? 0 : th.hashCode())) * 31;
        c0 c0Var = this.d;
        return Boolean.hashCode(this.e) + ((hashCode3 + (c0Var != null ? c0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(experimentsList=");
        sb.append(this.a);
        sb.append(", detailsState=");
        sb.append(this.b);
        sb.append(", error=");
        sb.append(this.c);
        sb.append(", command=");
        sb.append(this.d);
        sb.append(", isInProgress=");
        return unr0.u(sb, this.e, ')');
    }

    public /* synthetic */ d0(int i) {
        this(null, null, null, null, false);
    }

    public d0() {
        this(0);
    }
}
