package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes8.dex */
public final class p251 implements y251 {
    public static final o251 Companion = new o251();
    public static final i3y[] e = {null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new z151(2)), null};
    public final String a;
    public final sfe b;
    public final wv c;
    public final wzj d;

    public /* synthetic */ p251(int i, String str, sfe sfeVar, wv wvVar, wzj wzjVar) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, n251.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = sfeVar;
        this.c = wvVar;
        this.d = wzjVar;
    }

    @Override // defpackage.y251
    public final wzj a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p251)) {
            return false;
        }
        p251 p251Var = (p251) obj;
        return jl40.l(this.a, p251Var.a) && jl40.l(this.b, p251Var.b) && jl40.l(this.c, p251Var.c) && jl40.l(this.d, p251Var.d);
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
        return this.d.hashCode() + ((hashCode2 + (wvVar != null ? wvVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Spacer(id=" + this.a + ", contentDescription=" + this.b + ", action=" + this.c + ", displayRules=" + this.d + ')';
    }

    public p251(String str, sfe sfeVar, wv wvVar, wzj wzjVar) {
        this.a = str;
        this.b = sfeVar;
        this.c = wvVar;
        this.d = wzjVar;
    }
}
