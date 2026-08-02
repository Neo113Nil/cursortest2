package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class lnl implements zsq0, nyi {
    public final JsonParserComponent a;

    public lnl(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        Object snlVar;
        Object a;
        String R = wwg.R(jSONObject);
        hex hexVar = yf90Var.b().get(R);
        wnl wnlVar = hexVar instanceof wnl ? (wnl) hexVar : null;
        if (wnlVar != null) {
            if (wnlVar instanceof unl) {
                R = "string";
            } else if (wnlVar instanceof snl) {
                R = "number";
            } else if (wnlVar instanceof rnl) {
                R = "integer";
            } else if (wnlVar instanceof onl) {
                R = "boolean";
            } else if (wnlVar instanceof pnl) {
                R = "color";
            } else if (wnlVar instanceof vnl) {
                R = "url";
            } else if (wnlVar instanceof qnl) {
                R = "dict";
            } else if (wnlVar instanceof nnl) {
                R = "array";
            } else {
                if (!(wnlVar instanceof tnl)) {
                    w511.b();
                    return null;
                }
                R = "property";
            }
        }
        int hashCode = R.hashCode();
        JsonParserComponent jsonParserComponent = this.a;
        switch (hashCode) {
            case -1034364087:
                if (R.equals("number")) {
                    vn60 vn60Var = (vn60) jsonParserComponent.ta.getValue();
                    a = wnlVar != null ? wnlVar.a() : null;
                    vn60Var.getClass();
                    snlVar = new snl(vn60.c(yf90Var, (xn60) a, jSONObject));
                    return snlVar;
                }
                throw fg90.m(jSONObject, "type", R);
            case -993141291:
                if (R.equals("property")) {
                    snlVar = new tnl(((ttf0) jsonParserComponent.za.getValue()).c(yf90Var, (vtf0) (wnlVar != null ? wnlVar.a() : null), jSONObject));
                    return snlVar;
                }
                throw fg90.m(jSONObject, "type", R);
            case -891985903:
                if (R.equals("string")) {
                    squ0 squ0Var = (squ0) jsonParserComponent.Ia.getValue();
                    a = wnlVar != null ? wnlVar.a() : null;
                    squ0Var.getClass();
                    snlVar = new unl(squ0.c(yf90Var, (uqu0) a, jSONObject));
                    return snlVar;
                }
                throw fg90.m(jSONObject, "type", R);
            case 116079:
                if (R.equals("url")) {
                    ji21 ji21Var = (ji21) jsonParserComponent.Oa.getValue();
                    a = wnlVar != null ? wnlVar.a() : null;
                    ji21Var.getClass();
                    snlVar = new vnl(ji21.c(yf90Var, (li21) a, jSONObject));
                    return snlVar;
                }
                throw fg90.m(jSONObject, "type", R);
            case 3083190:
                if (R.equals("dict")) {
                    ghj ghjVar = (ghj) jsonParserComponent.C.getValue();
                    a = wnlVar != null ? wnlVar.a() : null;
                    ghjVar.getClass();
                    snlVar = new qnl(ghj.c(yf90Var, (ihj) a, jSONObject));
                    return snlVar;
                }
                throw fg90.m(jSONObject, "type", R);
            case 64711720:
                if (R.equals("boolean")) {
                    d96 d96Var = (d96) jsonParserComponent.k.getValue();
                    a = wnlVar != null ? wnlVar.a() : null;
                    d96Var.getClass();
                    snlVar = new onl(d96.c(yf90Var, (f96) a, jSONObject));
                    return snlVar;
                }
                throw fg90.m(jSONObject, "type", R);
            case 93090393:
                if (R.equals("array")) {
                    x63 x63Var = (x63) jsonParserComponent.e.getValue();
                    a = wnlVar != null ? wnlVar.a() : null;
                    x63Var.getClass();
                    snlVar = new nnl(x63.c(yf90Var, (z63) a, jSONObject));
                    return snlVar;
                }
                throw fg90.m(jSONObject, "type", R);
            case 94842723:
                if (R.equals("color")) {
                    thc thcVar = (thc) jsonParserComponent.q.getValue();
                    a = wnlVar != null ? wnlVar.a() : null;
                    thcVar.getClass();
                    snlVar = new pnl(thc.c(yf90Var, (vhc) a, jSONObject));
                    return snlVar;
                }
                throw fg90.m(jSONObject, "type", R);
            case 1958052158:
                if (R.equals("integer")) {
                    n7w n7wVar = (n7w) jsonParserComponent.ka.getValue();
                    a = wnlVar != null ? wnlVar.a() : null;
                    n7wVar.getClass();
                    snlVar = new rnl(n7w.c(yf90Var, (p7w) a, jSONObject));
                    return snlVar;
                }
                throw fg90.m(jSONObject, "type", R);
            default:
                throw fg90.m(jSONObject, "type", R);
        }
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, wnl wnlVar) {
        boolean z = wnlVar instanceof unl;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            squ0 squ0Var = (squ0) jsonParserComponent.Ia.getValue();
            uqu0 uqu0Var = ((unl) wnlVar).a;
            squ0Var.getClass();
            return squ0.d(yf90Var, uqu0Var);
        }
        if (wnlVar instanceof snl) {
            vn60 vn60Var = (vn60) jsonParserComponent.ta.getValue();
            xn60 xn60Var = ((snl) wnlVar).a;
            vn60Var.getClass();
            return vn60.d(yf90Var, xn60Var);
        }
        if (wnlVar instanceof rnl) {
            n7w n7wVar = (n7w) jsonParserComponent.ka.getValue();
            p7w p7wVar = ((rnl) wnlVar).a;
            n7wVar.getClass();
            return n7w.d(yf90Var, p7wVar);
        }
        if (wnlVar instanceof onl) {
            d96 d96Var = (d96) jsonParserComponent.k.getValue();
            f96 f96Var = ((onl) wnlVar).a;
            d96Var.getClass();
            return d96.d(yf90Var, f96Var);
        }
        if (wnlVar instanceof pnl) {
            thc thcVar = (thc) jsonParserComponent.q.getValue();
            vhc vhcVar = ((pnl) wnlVar).a;
            thcVar.getClass();
            return thc.d(yf90Var, vhcVar);
        }
        if (wnlVar instanceof vnl) {
            ji21 ji21Var = (ji21) jsonParserComponent.Oa.getValue();
            li21 li21Var = ((vnl) wnlVar).a;
            ji21Var.getClass();
            return ji21.d(yf90Var, li21Var);
        }
        if (wnlVar instanceof qnl) {
            ghj ghjVar = (ghj) jsonParserComponent.C.getValue();
            ihj ihjVar = ((qnl) wnlVar).a;
            ghjVar.getClass();
            return ghj.d(yf90Var, ihjVar);
        }
        if (wnlVar instanceof nnl) {
            x63 x63Var = (x63) jsonParserComponent.e.getValue();
            z63 z63Var = ((nnl) wnlVar).a;
            x63Var.getClass();
            return x63.d(yf90Var, z63Var);
        }
        if (wnlVar instanceof tnl) {
            return ((ttf0) jsonParserComponent.za.getValue()).b(yf90Var, ((tnl) wnlVar).a);
        }
        w511.b();
        return null;
    }
}
