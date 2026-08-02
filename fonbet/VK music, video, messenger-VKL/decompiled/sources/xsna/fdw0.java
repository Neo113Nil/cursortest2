package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.edw0;
import xsna.gdw0;

/* compiled from: VoipAdminChangeNameReducer.kt */
/* loaded from: classes7.dex */
public final class fdw0 extends dm50<hdw0, edw0, gdw0> {
    public final idw0 d;

    public fdw0() {
        super(gdw0.b.b);
        this.d = new idw0();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [com.vk.core.serialize.Serializer$StreamParcelableAdapter, com.vk.voip.userid.CallsUserId] */
    @Override // xsna.dm50
    public final gdw0 c(gdw0 gdw0Var, edw0 edw0Var) {
        gdw0 gdw0Var2 = gdw0Var;
        edw0 edw0Var2 = edw0Var;
        if (edw0Var2 instanceof edw0.a) {
            edw0.a aVar = (edw0.a) edw0Var2;
            String str = aVar.e;
            if (str == null) {
                str = aVar.d;
            }
            return new gdw0.a(str, aVar.d, aVar.c, false, gdw0.a.AbstractC2935a.C2936a.a);
        }
        if (edw0Var2 instanceof edw0.c) {
            edw0.c cVar = (edw0.c) edw0Var2;
            if (gdw0Var2 instanceof gdw0.a) {
                return gdw0.a.a((gdw0.a) gdw0Var2, cVar.b, false, gdw0.a.AbstractC2935a.C2936a.a, 14);
            }
        } else if (edw0Var2 instanceof edw0.b.a) {
            edw0.b.a aVar2 = (edw0.b.a) edw0Var2;
            if (gdw0Var2 instanceof gdw0.a) {
                return gdw0.a.a((gdw0.a) gdw0Var2, null, aVar2.b, null, 23);
            }
        } else {
            if (!(edw0Var2 instanceof edw0.b.C2796b)) {
                throw new NoWhenBranchMatchedException();
            }
            if (gdw0Var2 instanceof gdw0.a) {
                return gdw0.a.a((gdw0.a) gdw0Var2, null, false, gdw0.a.AbstractC2935a.b.a, 15);
            }
        }
        return gdw0Var2;
    }

    @Override // xsna.dm50
    public final hdw0 d() {
        return new hdw0(e(new cus0(this, 8)));
    }

    @Override // xsna.dm50
    public final void h(gdw0 gdw0Var, hdw0 hdw0Var) {
        f(hdw0Var.a, gdw0Var);
    }
}
