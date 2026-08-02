package xsna;

import com.vk.im.engine.models.messages.MsgFromUser;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.nn20;
import xsna.r070;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class mq0 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ mq0(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Type inference failed for: r3v9, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((hr0) this.d).j((is0) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((yp7) this.d).h((hq7) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 2:
                gzs gzsVar = (gzs) this.d;
                gzs gzsVar2 = (gzs) this.e;
                ajk ajkVar = (ajk) this.c;
                xlb0 xlb0Var = (xlb0) obj;
                ov70 ov70Var = (ov70) obj2;
                if (!((Boolean) gzsVar.invoke()).booleanValue() && ((Boolean) gzsVar2.invoke()).booleanValue()) {
                    if (!ov70.c(fdi.E(xlb0Var, false), 0L)) {
                        xlb0Var.a();
                    }
                    ajkVar.a(ov70Var.a);
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((nn20) this.d).e((nn20.a) this.e, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(391));
                break;
            case 4:
                vm30 vm30Var = (vm30) this.d;
                MsgFromUser msgFromUser = (MsgFromUser) this.e;
                ?? r3 = (FunctionReferenceImpl) this.c;
                ym30 ym30Var = vm30Var.t0;
                if (ym30Var != null) {
                    ym30Var.g0(msgFromUser);
                }
                vm30Var.g0 = null;
                r3.invoke();
                break;
            default:
                zz60 zz60Var = (zz60) this.d;
                st60 st60Var = (st60) this.e;
                xz60 xz60Var = (xz60) this.c;
                rui ruiVar = (rui) obj;
                nn50 nn50Var = (nn50) obj2;
                final f64 a = ruiVar.a(new dv60(zz60Var.k, zz60Var.r, st60Var, zz60Var, nn50Var));
                es60 es60Var = st60Var.a;
                final f64 a2 = ruiVar.a(new qv60(es60Var, nn50Var));
                final f64 a3 = ruiVar.a(new wh60(es60Var, nn50Var));
                final f64 a4 = ruiVar.a(new nc60(zz60Var.n, nn50Var));
                final f64 a5 = ruiVar.a(new rd60(es60Var, nn50Var));
                final f64 a6 = ruiVar.a(new oz60(st60Var, nn50Var));
                final f64 a7 = ruiVar.a(new uj60(zz60Var, st60Var, xz60Var.d, nn50Var));
                final f64 a8 = ruiVar.a(new yj60(zz60Var.c, ce60.b, zz60Var.k, nn50Var));
                ot60 ot60Var = zz60Var.u;
                qn60 qn60Var = zz60Var.g;
                pn60 pn60Var = zz60Var.h;
                final f64 a9 = ruiVar.a(new m070(ot60Var, qn60Var, pn60Var, nn50Var));
                final f64 a10 = ruiVar.a(new x5o0(es60Var, ot60Var, nn50Var));
                final f64 a11 = ruiVar.a(new oi60(ot60Var, qn60Var, pn60Var, es60Var.e, nn50Var));
                final f64 a12 = ruiVar.a(new z5o0(es60Var, ot60Var, nn50Var));
                final f64 a13 = ruiVar.a(new y5o0(es60Var, ot60Var, nn50Var));
                final f64 a14 = ruiVar.a(new vl60(zz60Var.d, nn50Var));
                es60 es60Var2 = zz60Var.v.a;
                final f64 a15 = ruiVar.a(new ni60(es60Var2, ot60Var, nn50Var));
                final f64 a16 = ruiVar.a(new b6o0(es60Var2, ot60Var, nn50Var));
                ruiVar.b = new wzs() { // from class: xsna.tz60
                    @Override // xsna.wzs
                    public final Object invoke(Object obj3, Object obj4) {
                        qk50 qk50Var = (qk50) obj3;
                        r070 r070Var = (r070) obj4;
                        if (r070Var instanceof t070) {
                            return qk50Var.a(f64.this, r070Var);
                        }
                        if (r070Var instanceof s070) {
                            return qk50Var.a(a11, r070Var);
                        }
                        if (r070Var instanceof v070) {
                            return qk50Var.a(a12, r070Var);
                        }
                        if (r070Var instanceof u070) {
                            return qk50Var.a(a13, r070Var);
                        }
                        if (r070Var instanceof w070) {
                            return qk50Var.a(a16, r070Var);
                        }
                        if (r070Var instanceof r070.d) {
                            return qk50Var.a(a15, r070Var);
                        }
                        if (r070Var instanceof r070.h) {
                            return qk50Var.a(a, r070Var);
                        }
                        if (r070Var instanceof r070.i) {
                            return qk50Var.a(a2, r070Var);
                        }
                        if (r070Var instanceof r070.k) {
                            return qk50Var.a(a9, r070Var);
                        }
                        if (r070Var instanceof r070.b) {
                            return qk50Var.a(a5, r070Var);
                        }
                        if (r070Var instanceof r070.a) {
                            return qk50Var.a(a4, r070Var);
                        }
                        if (r070Var instanceof r070.j) {
                            return qk50Var.a(a6, r070Var);
                        }
                        if (r070Var instanceof r070.e) {
                            return qk50Var.a(a7, r070Var);
                        }
                        if (r070Var instanceof r070.f) {
                            return qk50Var.a(a8, r070Var);
                        }
                        if (r070Var instanceof r070.g) {
                            return qk50Var.a(a14, r070Var);
                        }
                        if (r070Var instanceof r070.c) {
                            return qk50Var.a(a3, r070Var);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                };
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ mq0(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ mq0(vm30 vm30Var, MsgFromUser msgFromUser, gzs gzsVar) {
        this.b = 4;
        this.d = vm30Var;
        this.e = msgFromUser;
        this.c = (FunctionReferenceImpl) gzsVar;
    }
}
