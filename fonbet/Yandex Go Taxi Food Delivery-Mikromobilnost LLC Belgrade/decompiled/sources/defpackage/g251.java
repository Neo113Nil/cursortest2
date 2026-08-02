package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
/* loaded from: classes2.dex */
public final class g251 implements y251 {
    public static final f251 Companion = new f251();
    public static final i3y[] i;
    public final String a;
    public final sfe b;
    public final wv c;
    public final wzj d;
    public final List e;
    public final List f;
    public final List g;
    public final List h;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        i = new i3y[]{null, null, a.b(lazyThreadSafetyMode, new tn41(19)), null, a.b(lazyThreadSafetyMode, new tn41(20)), a.b(lazyThreadSafetyMode, new tn41(21)), a.b(lazyThreadSafetyMode, new tn41(22)), a.b(lazyThreadSafetyMode, new tn41(23))};
    }

    public /* synthetic */ g251(int i2, String str, sfe sfeVar, wv wvVar, wzj wzjVar, List list, List list2, List list3, List list4) {
        if (255 != (i2 & 255)) {
            qje.Z(i2, 255, e251.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = sfeVar;
        this.c = wvVar;
        this.d = wzjVar;
        this.e = list;
        this.f = list2;
        this.g = list3;
        this.h = list4;
    }

    public static final void i(g251 g251Var, yjd yjdVar, SerialDescriptor serialDescriptor) {
        yjdVar.o(serialDescriptor, 0, g251Var.a);
        yjdVar.g(serialDescriptor, 1, qfe.a, g251Var.b);
        i3y[] i3yVarArr = i;
        yjdVar.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), g251Var.c);
        yjdVar.e(serialDescriptor, 3, nzj.a, g251Var.d);
        yjdVar.g(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), g251Var.e);
        yjdVar.g(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), g251Var.f);
        yjdVar.e(serialDescriptor, 6, (KSerializer) i3yVarArr[6].getValue(), g251Var.g);
        yjdVar.e(serialDescriptor, 7, (KSerializer) i3yVarArr[7].getValue(), g251Var.h);
    }

    @Override // defpackage.y251
    public final wzj a() {
        return this.d;
    }

    public final wv d() {
        return this.c;
    }

    public final List e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g251)) {
            return false;
        }
        g251 g251Var = (g251) obj;
        return jl40.l(this.a, g251Var.a) && jl40.l(this.b, g251Var.b) && jl40.l(this.c, g251Var.c) && jl40.l(this.d, g251Var.d) && jl40.l(this.e, g251Var.e) && jl40.l(this.f, g251Var.f) && jl40.l(this.g, g251Var.g) && jl40.l(this.h, g251Var.h);
    }

    public final List f() {
        return this.f;
    }

    public final List g() {
        return this.h;
    }

    @Override // defpackage.y251
    public final sfe getContentDescription() {
        return this.b;
    }

    @Override // defpackage.y251
    public final String getId() {
        return this.a;
    }

    public final List h() {
        return this.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        sfe sfeVar = this.b;
        int hashCode2 = (hashCode + (sfeVar == null ? 0 : sfeVar.hashCode())) * 31;
        wv wvVar = this.c;
        int hashCode3 = (this.d.hashCode() + ((hashCode2 + (wvVar == null ? 0 : wvVar.hashCode())) * 31)) * 31;
        List list = this.e;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f;
        return this.h.hashCode() + unr0.c((hashCode4 + (list2 != null ? list2.hashCode() : 0)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Balance(id=");
        sb.append(this.a);
        sb.append(", contentDescription=");
        sb.append(this.b);
        sb.append(", action=");
        sb.append(this.c);
        sb.append(", displayRules=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", subtitle=");
        sb.append(this.f);
        sb.append(", balance=");
        sb.append(this.g);
        sb.append(", templates=");
        return unr0.t(sb, this.h, ')');
    }

    public g251(String str, sfe sfeVar, wv wvVar, wzj wzjVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, List list) {
        this.a = str;
        this.b = sfeVar;
        this.c = wvVar;
        this.d = wzjVar;
        this.e = arrayList;
        this.f = arrayList2;
        this.g = arrayList3;
        this.h = list;
    }
}
