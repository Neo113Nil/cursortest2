package defpackage;

import androidx.compose.foundation.text.selection.i;
import androidx.compose.ui.focus.FocusStateImpl;

/* loaded from: classes10.dex */
public final /* synthetic */ class hkq0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ i b;

    public /* synthetic */ hkq0(i iVar, int i) {
        this.a = i;
        this.b = iVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        bkq0 bkq0Var;
        bkq0 bkq0Var2;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        i iVar = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                rzx rzxVar = (rzx) obj;
                zii0 zii0Var = (zii0) iVar.j.getValue();
                if (zii0Var != null) {
                    rzx rzxVar2 = iVar.l;
                    if (rzxVar2 == null) {
                        lxv.d("Required value was null.");
                        ny61.A();
                        break;
                    } else {
                        break;
                    }
                }
                break;
            case 2:
                if (iVar.a.a().b(((Long) obj).longValue())) {
                    iVar.j();
                    iVar.b.setValue(null);
                    break;
                }
                break;
            case 3:
                long longValue = ((Long) obj).longValue();
                ckq0 g = iVar.g();
                if (g != null && (bkq0Var2 = g.a) != null && longValue == bkq0Var2.c) {
                    iVar.p.setValue(null);
                }
                ckq0 g2 = iVar.g();
                if (g2 != null && (bkq0Var = g2.b) != null && longValue == bkq0Var.c) {
                    iVar.q.setValue(null);
                }
                if (iVar.a.a().b(longValue)) {
                    iVar.o();
                    break;
                }
                break;
            case 4:
                rzx rzxVar3 = (rzx) obj;
                iVar.l = rzxVar3;
                if (((Boolean) iVar.i.getValue()).booleanValue() && iVar.g() != null) {
                    wu60 wu60Var = rzxVar3 != null ? new wu60(rzxVar3.m(0L)) : null;
                    if (!jl40.l(iVar.k, wu60Var)) {
                        iVar.k = wu60Var;
                        iVar.m();
                        iVar.o();
                        break;
                    }
                }
                break;
            case 5:
                oz40 oz40Var = iVar.i;
                FocusStateImpl focusStateImpl = (FocusStateImpl) ((ivr) obj);
                if (!focusStateImpl.a() && ((Boolean) oz40Var.getValue()).booleanValue()) {
                    iVar.j();
                }
                oz40Var.setValue(Boolean.valueOf(focusStateImpl.a()));
                break;
            case 6:
                iVar.l(((Boolean) obj).booleanValue());
                break;
            case 7:
                ckq0 ckq0Var = (ckq0) obj;
                iVar.b.setValue(ckq0Var);
                if (ckq0Var != null) {
                    iVar.m();
                    break;
                }
                break;
            default:
                if (iVar.a.a().b(((Long) obj).longValue())) {
                    iVar.m.setValue(zy11Var);
                    iVar.m();
                    iVar.o();
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
