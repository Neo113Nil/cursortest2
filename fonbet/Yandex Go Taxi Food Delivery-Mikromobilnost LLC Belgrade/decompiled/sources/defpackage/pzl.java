package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes9.dex */
public final class pzl extends t9 {
    public static final ozl Companion = new ozl();
    public static final i3y[] g;
    public final kr a;
    public final kr b;
    public final kr c;
    public final kr d;
    public final kr e;
    public final kr f;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new i3y[]{a.b(lazyThreadSafetyMode, new tvl(4)), a.b(lazyThreadSafetyMode, new tvl(5)), a.b(lazyThreadSafetyMode, new tvl(6)), a.b(lazyThreadSafetyMode, new tvl(7)), a.b(lazyThreadSafetyMode, new tvl(8)), a.b(lazyThreadSafetyMode, new tvl(9))};
    }

    public /* synthetic */ pzl(int i, kr krVar, kr krVar2, kr krVar3, kr krVar4, kr krVar5, kr krVar6) {
        if (63 != (i & 63)) {
            qje.Z(i, 63, nzl.a.getDescriptor());
            throw null;
        }
        this.a = krVar;
        this.b = krVar2;
        this.c = krVar3;
        this.d = krVar4;
        this.e = krVar5;
        this.f = krVar6;
    }

    @Override // defpackage.szl
    public final void a(neo neoVar, l1o l1oVar) {
        kr krVar = neoVar instanceof izl ? this.a : neoVar instanceof hzl ? this.b : neoVar instanceof czl ? this.c : neoVar instanceof ezl ? this.d : neoVar instanceof fzl ? this.e : neoVar instanceof dzl ? this.f : null;
        if (krVar == null) {
            return;
        }
        l1oVar.b.a(new gxl(krVar));
    }

    @Override // defpackage.szl
    public final void dispose() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!pzl.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        pzl pzlVar = (pzl) obj;
        return jl40.l(this.a, pzlVar.a) && jl40.l(this.b, pzlVar.b) && jl40.l(this.c, pzlVar.c) && jl40.l(this.d, pzlVar.d) && jl40.l(this.e, pzlVar.e) && jl40.l(this.f, pzlVar.f);
    }

    public final int hashCode() {
        kr krVar = this.a;
        int hashCode = (krVar != null ? krVar.hashCode() : 0) * 31;
        kr krVar2 = this.b;
        int hashCode2 = (hashCode + (krVar2 != null ? krVar2.hashCode() : 0)) * 31;
        kr krVar3 = this.c;
        int hashCode3 = (hashCode2 + (krVar3 != null ? krVar3.hashCode() : 0)) * 31;
        kr krVar4 = this.d;
        int hashCode4 = (hashCode3 + (krVar4 != null ? krVar4.hashCode() : 0)) * 31;
        kr krVar5 = this.e;
        int hashCode5 = (hashCode4 + (krVar5 != null ? krVar5.hashCode() : 0)) * 31;
        kr krVar6 = this.f;
        return hashCode5 + (krVar6 != null ? krVar6.hashCode() : 0);
    }

    public final String toString() {
        return "DocumentEventCallbacksTracker(renderingStarted=" + this.a + ", renderingFinished=" + this.b + ", didAppear=" + this.c + ", didDisappear=" + this.d + ", onForeground=" + this.e + ", onBackground=" + this.f + Extension.C_BRAKE;
    }
}
