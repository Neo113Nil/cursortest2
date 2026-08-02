package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
/* loaded from: classes2.dex */
public final class m251 implements y251 {
    public static final l251 Companion = new l251();
    public static final i3y[] f = {null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new tn41(27)), null, null};
    public final String a;
    public final sfe b;
    public final wv c;
    public final wzj d;
    public final String e;

    public /* synthetic */ m251(int i, String str, sfe sfeVar, wv wvVar, wzj wzjVar, String str2) {
        if (31 != (i & 31)) {
            qje.Z(i, 31, k251.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = sfeVar;
        this.c = wvVar;
        this.d = wzjVar;
        this.e = str2;
    }

    public static final void f(m251 m251Var, yjd yjdVar, SerialDescriptor serialDescriptor) {
        yjdVar.o(serialDescriptor, 0, m251Var.a);
        yjdVar.g(serialDescriptor, 1, qfe.a, m251Var.b);
        yjdVar.g(serialDescriptor, 2, (KSerializer) f[2].getValue(), m251Var.c);
        yjdVar.e(serialDescriptor, 3, nzj.a, m251Var.d);
        yjdVar.o(serialDescriptor, 4, m251Var.e);
    }

    @Override // defpackage.y251
    public final wzj a() {
        return this.d;
    }

    public final wv d() {
        return this.c;
    }

    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m251)) {
            return false;
        }
        m251 m251Var = (m251) obj;
        return jl40.l(this.a, m251Var.a) && jl40.l(this.b, m251Var.b) && jl40.l(this.c, m251Var.c) && jl40.l(this.d, m251Var.d) && jl40.l(this.e, m251Var.e);
    }

    @Override // defpackage.y251
    public final sfe getContentDescription() {
        return this.b;
    }

    @Override // defpackage.y251
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        sfe sfeVar = this.b;
        int hashCode2 = (hashCode + (sfeVar == null ? 0 : sfeVar.hashCode())) * 31;
        wv wvVar = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + ((hashCode2 + (wvVar != null ? wvVar.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Icon(id=");
        sb.append(this.a);
        sb.append(", contentDescription=");
        sb.append(this.b);
        sb.append(", action=");
        sb.append(this.c);
        sb.append(", displayRules=");
        sb.append(this.d);
        sb.append(", image=");
        return b64.p(sb, this.e, ')');
    }

    public m251(String str, sfe sfeVar, wv wvVar, wzj wzjVar, String str2) {
        this.a = str;
        this.b = sfeVar;
        this.c = wvVar;
        this.d = wzjVar;
        this.e = str2;
    }
}
