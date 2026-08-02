package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.c3;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class mnl implements qfy0 {
    public final JsonParserComponent a;

    public mnl(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final c3 a(yf90 yf90Var, wnl wnlVar, JSONObject jSONObject) {
        kbs kbsVar = q5z.b;
        abl0 abl0Var = q5z.c;
        boolean z = wnlVar instanceof unl;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            tqu0 tqu0Var = (tqu0) jsonParserComponent.Ja.getValue();
            uqu0 uqu0Var = ((unl) wnlVar).a;
            tqu0Var.getClass();
            return new fnl(new qqu0(xcx.c(yf90Var, uqu0Var.b, jSONObject, "value", wm11.c), (String) xcx.a(uqu0Var.a, jSONObject, "name", abl0Var, kbsVar)));
        }
        if (wnlVar instanceof snl) {
            wn60 wn60Var = (wn60) jsonParserComponent.ua.getValue();
            xn60 xn60Var = ((snl) wnlVar).a;
            wn60Var.getClass();
            return new bnl(new tn60(xcx.d(yf90Var, xn60Var.b, jSONObject, "value", wm11.d, b.g), (String) xcx.a(xn60Var.a, jSONObject, "name", abl0Var, kbsVar)));
        }
        if (wnlVar instanceof rnl) {
            o7w o7wVar = (o7w) jsonParserComponent.la.getValue();
            p7w p7wVar = ((rnl) wnlVar).a;
            o7wVar.getClass();
            return new anl(new l7w(xcx.d(yf90Var, p7wVar.b, jSONObject, "value", wm11.b, b.h), (String) xcx.a(p7wVar.a, jSONObject, "name", abl0Var, kbsVar)));
        }
        if (wnlVar instanceof onl) {
            e96 e96Var = (e96) jsonParserComponent.l.getValue();
            f96 f96Var = ((onl) wnlVar).a;
            e96Var.getClass();
            return new xml(new b96(xcx.d(yf90Var, f96Var.b, jSONObject, "value", wm11.a, b.f), (String) xcx.a(f96Var.a, jSONObject, "name", abl0Var, kbsVar)));
        }
        if (wnlVar instanceof pnl) {
            uhc uhcVar = (uhc) jsonParserComponent.r.getValue();
            vhc vhcVar = ((pnl) wnlVar).a;
            uhcVar.getClass();
            return new yml(new rhc(xcx.d(yf90Var, vhcVar.b, jSONObject, "value", wm11.f, b.b), (String) xcx.a(vhcVar.a, jSONObject, "name", abl0Var, kbsVar)));
        }
        if (wnlVar instanceof vnl) {
            ki21 ki21Var = (ki21) jsonParserComponent.Pa.getValue();
            li21 li21Var = ((vnl) wnlVar).a;
            ki21Var.getClass();
            return new inl(new hi21(xcx.d(yf90Var, li21Var.b, jSONObject, "value", wm11.e, b.e), (String) xcx.a(li21Var.a, jSONObject, "name", abl0Var, kbsVar)));
        }
        if (wnlVar instanceof qnl) {
            hhj hhjVar = (hhj) jsonParserComponent.D.getValue();
            ihj ihjVar = ((qnl) wnlVar).a;
            hhjVar.getClass();
            return new zml(new ehj(xcx.c(yf90Var, ihjVar.b, jSONObject, "value", wm11.h), (String) xcx.a(ihjVar.a, jSONObject, "name", abl0Var, kbsVar)));
        }
        if (!(wnlVar instanceof nnl)) {
            if (wnlVar instanceof tnl) {
                return new dnl(((utf0) jsonParserComponent.Aa.getValue()).a(yf90Var, ((tnl) wnlVar).a, jSONObject));
            }
            w511.b();
            return null;
        }
        y63 y63Var = (y63) jsonParserComponent.f.getValue();
        z63 z63Var = ((nnl) wnlVar).a;
        y63Var.getClass();
        return new wml(new v63(xcx.c(yf90Var, z63Var.b, jSONObject, "value", wm11.g), (String) xcx.a(z63Var.a, jSONObject, "name", abl0Var, kbsVar)));
    }
}
