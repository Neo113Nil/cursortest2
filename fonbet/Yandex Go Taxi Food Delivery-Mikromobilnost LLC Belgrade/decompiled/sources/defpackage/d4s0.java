package defpackage;

import com.yandex.go.shortcuts.dto.response.Layout;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class d4s0 {
    public static final d4s0 m = new d4s0(null, null, null, EmptyList.a, null, null, null, null, null, false, 4087);
    public final Layout a;
    public final f1z b;
    public final List c;
    public final List d;
    public final zzs e;
    public final yaf0 f;
    public final String g;
    public final List h;
    public final List i;
    public final boolean j;
    public final boolean k;
    public final List l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ d4s0(Layout layout, f1z f1zVar, List list, List list2, zzs zzsVar, yaf0 yaf0Var, String str, List list3, List list4, boolean z, int i) {
        this(r3, r4, r1 != 0 ? r14 : list, (i & 8) != 0 ? r14 : list2, (i & 16) != 0 ? zzs.f : zzsVar, (i & 32) != 0 ? null : yaf0Var, (i & 64) != 0 ? null : str, (i & 128) != 0 ? r14 : list3, (i & 256) != 0 ? r14 : list4, (i & 512) != 0 ? false : z, (i & 1024) == 0, r14);
        Layout layout2 = (i & 1) != 0 ? Layout.e : layout;
        f1z f1zVar2 = (i & 2) != 0 ? e1z.a : f1zVar;
        int i2 = i & 4;
        EmptyList emptyList = EmptyList.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.util.List] */
    public static d4s0 a(d4s0 d4s0Var, ArrayList arrayList, ArrayList arrayList2, int i) {
        Layout layout = d4s0Var.a;
        f1z f1zVar = d4s0Var.b;
        List list = d4s0Var.c;
        ArrayList arrayList3 = arrayList;
        if ((i & 8) != 0) {
            arrayList3 = d4s0Var.d;
        }
        ArrayList arrayList4 = arrayList3;
        zzs zzsVar = d4s0Var.e;
        yaf0 yaf0Var = d4s0Var.f;
        String str = d4s0Var.g;
        List list2 = (i & 128) != 0 ? d4s0Var.h : EmptyList.a;
        ArrayList arrayList5 = (i & 256) != 0 ? d4s0Var.i : arrayList2;
        boolean z = d4s0Var.j;
        boolean z2 = d4s0Var.k;
        List list3 = d4s0Var.l;
        d4s0Var.getClass();
        return new d4s0(layout, f1zVar, list, arrayList4, zzsVar, yaf0Var, str, list2, arrayList5, z, z2, list3);
    }

    public final d4s0 b(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            e6v e6vVar = (e6v) obj;
            if (!(e6vVar instanceof nc6) && !(e6vVar instanceof gwz0)) {
                arrayList.add(obj);
            }
        }
        return a(this, arrayList, null, 4087);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d4s0)) {
            return false;
        }
        d4s0 d4s0Var = (d4s0) obj;
        return jl40.l(this.a, d4s0Var.a) && jl40.l(this.b, d4s0Var.b) && jl40.l(this.c, d4s0Var.c) && jl40.l(this.d, d4s0Var.d) && jl40.l(this.e, d4s0Var.e) && jl40.l(this.f, d4s0Var.f) && jl40.l(this.g, d4s0Var.g) && jl40.l(this.h, d4s0Var.h) && jl40.l(this.i, d4s0Var.i) && this.j == d4s0Var.j && this.k == d4s0Var.k && jl40.l(this.l, d4s0Var.l);
    }

    public final int hashCode() {
        int b = nnm.b(this.e, unr0.c(unr0.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31);
        yaf0 yaf0Var = this.f;
        int hashCode = (b + (yaf0Var == null ? 0 : yaf0Var.hashCode())) * 31;
        String str = this.g;
        return this.l.hashCode() + unr0.e(unr0.e(unr0.c(unr0.c((hashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.h), 31, this.i), 31, this.j), 31, this.k);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortcutsViewModel(layout=");
        sb.append(this.a);
        sb.append(", modelsLoadingState=");
        sb.append(this.b);
        sb.append(", availableServices=");
        nnm.w(sb, this.c, ", models=", this.d, ", taxiPointA=");
        sb.append(this.e);
        sb.append(", screenType=");
        sb.append(this.f);
        sb.append(", eventPayload=");
        tse0.x(this.g, ", topItems=", ", bottomItems=", sb, this.h);
        nzs.p(sb, this.i, ", isFallback=", this.j, ", shouldOpenExpanded=");
        sb.append(this.k);
        sb.append(", excludedLoadingPositions=");
        sb.append(this.l);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public d4s0(Layout layout, f1z f1zVar, List list, List list2, zzs zzsVar, yaf0 yaf0Var, String str, List list3, List list4, boolean z, boolean z2, List list5) {
        this.a = layout;
        this.b = f1zVar;
        this.c = list;
        this.d = list2;
        this.e = zzsVar;
        this.f = yaf0Var;
        this.g = str;
        this.h = list3;
        this.i = list4;
        this.j = z;
        this.k = z2;
        this.l = list5;
    }

    public d4s0() {
        this(null, null, null, null, null, null, null, null, null, false, 4095);
    }
}
