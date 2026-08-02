package xsna;

import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.eda;
import xsna.ugw;
import xsna.uo40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class sgw implements iy3, eda.a, yads.ng1 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sgw(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.iy3
    /* renamed from: apply */
    public ugz mo416apply(Object obj) {
        ugz a;
        switch (this.b) {
            case 0:
                if (((ugw.i) this.d).c) {
                    throw null;
                }
                return r0t.d(Boolean.FALSE);
            default:
                a = super/*xsna.xon0*/.a((ArrayList) this.d);
                return a;
        }
    }

    @Override // xsna.eda.a
    public io.reactivex.rxjava3.core.q b(wba wbaVar, List list, String str) {
        uo40 uo40Var = (uo40) this.c;
        mh40 mh40Var = (mh40) this.d;
        int i = uo40.a.$EnumSwitchMapping$0[uo40Var.F.ordinal()];
        if (i == 1) {
            laa z0 = uo40Var.z0();
            z0.getClass();
            if (p4g.b(list, s9a.c)) {
                String str2 = (String) j5g.Y(list);
                return z0.v(str2).l(new q40(new eaa(0, z0, str2), 3)).w();
            }
            return z0.a.h(mh40Var.b(wbaVar, list, null));
        }
        if (i == 2) {
            laa z02 = uo40Var.z0();
            z02.getClass();
            if (p4g.b(list, s9a.c)) {
                String str3 = (String) j5g.Y(list);
                return z02.t(str3).l(new fq1(new du0(5, z02, str3), 6)).w();
            }
            return z02.a.h(mh40Var.b(wbaVar, list, null));
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        laa z03 = uo40Var.z0();
        z03.getClass();
        if (!p4g.b(list, s9a.c)) {
            return z03.a.h(mh40Var.b(wbaVar, list, null));
        }
        String str4 = (String) j5g.Y(list);
        return z03.n(str4).l(new rx0(new rw(z03, str4, z03.e, 3), 4)).w();
    }

    @Override // yads.ng1
    public void invoke(Object obj) {
        ((yads.af) obj).getClass();
    }
}
