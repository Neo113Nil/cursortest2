package defpackage;

import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.e;

/* loaded from: classes5.dex */
public final class poi extends yr31 {
    public final joi b;
    public final coi c;
    public final d5u0 w;
    public final m8h x;
    public final vbu y;
    public final gci0 z;

    public poi(joi joiVar, coi coiVar, d5u0 d5u0Var, m8h m8hVar) {
        this.b = joiVar;
        this.c = coiVar;
        this.w = d5u0Var;
        this.x = m8hVar;
        abu abuVar = joiVar.b;
        this.y = new vbu(abuVar.a, abuVar.b, abuVar.c, abuVar.d, abuVar.e, abuVar.f);
        this.z = e.R(new n1f(6, joiVar.c, this), ds31.a(this), wsr0.a(xsr0.a, 3), new qws0(EmptyList.a, true));
    }
}
