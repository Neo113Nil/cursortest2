package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
/* loaded from: classes2.dex */
public final class lgc implements tgc {
    public static final kgc Companion = new kgc();
    public static final i3y[] d = {a.b(LazyThreadSafetyMode.PUBLICATION, new z2c(8)), null, null};
    public final List a;
    public final ogc b;
    public final ogc c;

    public /* synthetic */ lgc(int i, List list, ogc ogcVar, ogc ogcVar2) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, jgc.a.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = ogcVar;
        this.c = ogcVar2;
    }

    public static final /* synthetic */ void e(lgc lgcVar, yjd yjdVar, SerialDescriptor serialDescriptor) {
        yjdVar.e(serialDescriptor, 0, (KSerializer) d[0].getValue(), lgcVar.a);
        mgc mgcVar = mgc.a;
        yjdVar.e(serialDescriptor, 1, mgcVar, lgcVar.b);
        yjdVar.e(serialDescriptor, 2, mgcVar, lgcVar.c);
    }

    public final List b() {
        return this.a;
    }

    public final ogc c() {
        return this.c;
    }

    public final ogc d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lgc)) {
            return false;
        }
        lgc lgcVar = (lgc) obj;
        return jl40.l(this.a, lgcVar.a) && jl40.l(this.b, lgcVar.b) && jl40.l(this.c, lgcVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LinearGradient(colors=" + this.a + ", startPoint=" + this.b + ", endPoint=" + this.c + ')';
    }

    public lgc(ArrayList arrayList, ogc ogcVar, ogc ogcVar2) {
        this.a = arrayList;
        this.b = ogcVar;
        this.c = ogcVar2;
    }
}
