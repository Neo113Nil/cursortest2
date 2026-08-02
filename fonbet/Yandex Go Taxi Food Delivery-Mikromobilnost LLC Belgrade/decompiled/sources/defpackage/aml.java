package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class aml implements qfy0 {
    public final JsonParserComponent a;

    public aml(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final xll a(yf90 yf90Var, jml jmlVar, JSONObject jSONObject) {
        boolean z = jmlVar instanceof hml;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            oqu0 oqu0Var = (oqu0) jsonParserComponent.Ga.getValue();
            pqu0 pqu0Var = ((hml) jmlVar).a;
            oqu0Var.getClass();
            return new vll(new lqu0(xcx.c(yf90Var, pqu0Var.a, jSONObject, "value", wm11.c)));
        }
        if (jmlVar instanceof fml) {
            j7w j7wVar = (j7w) jsonParserComponent.ia.getValue();
            k7w k7wVar = ((fml) jmlVar).a;
            j7wVar.getClass();
            return new tll(new g7w(xcx.d(yf90Var, k7wVar.a, jSONObject, "value", wm11.b, b.h)));
        }
        if (jmlVar instanceof gml) {
            rn60 rn60Var = (rn60) jsonParserComponent.ra.getValue();
            sn60 sn60Var = ((gml) jmlVar).a;
            rn60Var.getClass();
            return new ull(new on60(xcx.d(yf90Var, sn60Var.a, jSONObject, "value", wm11.d, b.g)));
        }
        if (jmlVar instanceof dml) {
            phc phcVar = (phc) jsonParserComponent.o.getValue();
            qhc qhcVar = ((dml) jmlVar).a;
            phcVar.getClass();
            return new rll(new mhc(xcx.d(yf90Var, qhcVar.a, jSONObject, "value", wm11.f, b.b)));
        }
        if (jmlVar instanceof cml) {
            z86 z86Var = (z86) jsonParserComponent.i.getValue();
            a96 a96Var = ((cml) jmlVar).a;
            z86Var.getClass();
            return new qll(new w86(xcx.d(yf90Var, a96Var.a, jSONObject, "value", wm11.a, b.f)));
        }
        if (jmlVar instanceof iml) {
            fi21 fi21Var = (fi21) jsonParserComponent.Ma.getValue();
            gi21 gi21Var = ((iml) jmlVar).a;
            fi21Var.getClass();
            return new wll(new ci21(xcx.d(yf90Var, gi21Var.a, jSONObject, "value", wm11.e, b.e)));
        }
        if (jmlVar instanceof eml) {
            chj chjVar = (chj) jsonParserComponent.A.getValue();
            dhj dhjVar = ((eml) jmlVar).a;
            chjVar.getClass();
            return new sll(new zgj(xcx.c(yf90Var, dhjVar.a, jSONObject, "value", wm11.h)));
        }
        if (!(jmlVar instanceof bml)) {
            w511.b();
            return null;
        }
        s63 s63Var = (s63) jsonParserComponent.c.getValue();
        t63 t63Var = ((bml) jmlVar).a;
        s63Var.getClass();
        return new pll(new p63(xcx.c(yf90Var, t63Var.a, jSONObject, "value", wm11.g)));
    }
}
