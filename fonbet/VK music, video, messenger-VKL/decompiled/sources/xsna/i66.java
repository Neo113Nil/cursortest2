package xsna;

import com.ironsource.Z3;
import com.vk.profile.design.compose.buttons.ProfileButtons;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.s7d0;
import xsna.sir0;
import xsna.skm0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class i66 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ i66(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                p66 p66Var = (p66) this.c;
                String str = (String) this.d;
                String str2 = (String) this.e;
                sir0 sir0Var = sir0.a;
                sir0.e eVar = new sir0.e(str, str2, p66Var.c.n().a(), false, false, false, false, false, false, null, Z3.l);
                sir0.d dVar = new sir0.d(new vl1(p66Var, 8), new lb(p66Var, 10), null, null, 12);
                sir0Var.getClass();
                p66Var.t.b(mnh0.B(p66Var.w0(sir0.g(eVar, dVar), true), p66Var.s, new hn0(2, p66Var, str2), new mb(p66Var, 8), null));
                break;
            case 1:
                etv0 etv0Var = (etv0) this.c;
                m8d0 m8d0Var = (m8d0) this.d;
                m8d0.d((wh50) this.e, true);
                if (etv0Var.isVisible()) {
                    m8d0Var.g().invoke(s7d0.d.a);
                }
                break;
            case 2:
                ((izs) this.c).invoke(new ProfileButtons.b(((ProfileButtons.a) this.d).a, (zhf0) ((wh50) this.e).getValue()));
                break;
            case 3:
                cjx cjxVar = (cjx) this.c;
                ajx ajxVar = (ajx) this.d;
                skm0.a aVar = (skm0.a) this.e;
                cjxVar.b(ajxVar);
                aVar.q0();
                break;
            default:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.c;
                krp0 krp0Var = (krp0) this.d;
                lrp0 lrp0Var = (lrp0) this.e;
                if (ref$ObjectRef.element != 0) {
                    r500 r500Var = (r500) ((jrp0) ((zak0) lrp0Var.f).getValue()).d.getValue();
                    krp0Var.a(((Number) ((jrp0) ((zak0) lrp0Var.f).getValue()).e.getValue()).longValue(), new q500(r500Var.a, r500Var.b));
                    ref$ObjectRef.element = null;
                }
                break;
        }
        return s3q0.a;
    }
}
