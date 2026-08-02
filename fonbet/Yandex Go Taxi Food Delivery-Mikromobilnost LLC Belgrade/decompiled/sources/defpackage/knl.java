package defpackage;

import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.c3;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class knl implements zsq0, nyi {
    public final JsonParserComponent a;

    public knl(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    @Override // defpackage.nyi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final c3 a(yf90 yf90Var, JSONObject jSONObject) {
        String R = wwg.R(jSONObject);
        int hashCode = R.hashCode();
        JsonParserComponent jsonParserComponent = this.a;
        switch (hashCode) {
            case -1034364087:
                if (R.equals("number")) {
                    ((un60) jsonParserComponent.sa.getValue()).getClass();
                    return new bnl(un60.c(yf90Var, jSONObject));
                }
                break;
            case -993141291:
                if (R.equals("property")) {
                    return new dnl(((stf0) jsonParserComponent.ya.getValue()).a(yf90Var, jSONObject));
                }
                break;
            case -891985903:
                if (R.equals("string")) {
                    ((rqu0) jsonParserComponent.Ha.getValue()).getClass();
                    return new fnl(rqu0.c(yf90Var, jSONObject));
                }
                break;
            case 116079:
                if (R.equals("url")) {
                    ((ii21) jsonParserComponent.Na.getValue()).getClass();
                    return new inl(ii21.c(yf90Var, jSONObject));
                }
                break;
            case 3083190:
                if (R.equals("dict")) {
                    ((fhj) jsonParserComponent.B.getValue()).getClass();
                    return new zml(fhj.c(yf90Var, jSONObject));
                }
                break;
            case 64711720:
                if (R.equals("boolean")) {
                    ((c96) jsonParserComponent.j.getValue()).getClass();
                    return new xml(c96.c(yf90Var, jSONObject));
                }
                break;
            case 93090393:
                if (R.equals("array")) {
                    ((w63) jsonParserComponent.d.getValue()).getClass();
                    return new wml(w63.c(yf90Var, jSONObject));
                }
                break;
            case 94842723:
                if (R.equals("color")) {
                    ((shc) jsonParserComponent.p.getValue()).getClass();
                    return new yml(shc.c(yf90Var, jSONObject));
                }
                break;
            case 1958052158:
                if (R.equals("integer")) {
                    ((m7w) jsonParserComponent.ja.getValue()).getClass();
                    return new anl(m7w.c(yf90Var, jSONObject));
                }
                break;
        }
        hex b = yf90Var.b().b(R, jSONObject);
        wnl wnlVar = b instanceof wnl ? (wnl) b : null;
        if (wnlVar != null) {
            return ((mnl) jsonParserComponent.H9.getValue()).a(yf90Var, wnlVar, jSONObject);
        }
        throw fg90.m(jSONObject, "type", R);
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, c3 c3Var) {
        boolean z = c3Var instanceof fnl;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            rqu0 rqu0Var = (rqu0) jsonParserComponent.Ha.getValue();
            qqu0 qqu0Var = ((fnl) c3Var).c;
            rqu0Var.getClass();
            return rqu0.d(yf90Var, qqu0Var);
        }
        if (c3Var instanceof bnl) {
            un60 un60Var = (un60) jsonParserComponent.sa.getValue();
            tn60 tn60Var = ((bnl) c3Var).c;
            un60Var.getClass();
            return un60.d(yf90Var, tn60Var);
        }
        if (c3Var instanceof anl) {
            m7w m7wVar = (m7w) jsonParserComponent.ja.getValue();
            l7w l7wVar = ((anl) c3Var).c;
            m7wVar.getClass();
            return m7w.d(yf90Var, l7wVar);
        }
        if (c3Var instanceof xml) {
            c96 c96Var = (c96) jsonParserComponent.j.getValue();
            b96 b96Var = ((xml) c3Var).c;
            c96Var.getClass();
            return c96.d(yf90Var, b96Var);
        }
        if (c3Var instanceof yml) {
            shc shcVar = (shc) jsonParserComponent.p.getValue();
            rhc d = ((yml) c3Var).d();
            shcVar.getClass();
            return shc.d(yf90Var, d);
        }
        if (c3Var instanceof inl) {
            ii21 ii21Var = (ii21) jsonParserComponent.Na.getValue();
            hi21 d2 = ((inl) c3Var).d();
            ii21Var.getClass();
            return ii21.d(yf90Var, d2);
        }
        if (c3Var instanceof zml) {
            fhj fhjVar = (fhj) jsonParserComponent.B.getValue();
            ehj d3 = ((zml) c3Var).d();
            fhjVar.getClass();
            return fhj.d(yf90Var, d3);
        }
        if (c3Var instanceof wml) {
            w63 w63Var = (w63) jsonParserComponent.d.getValue();
            v63 d4 = ((wml) c3Var).d();
            w63Var.getClass();
            return w63.d(yf90Var, d4);
        }
        if (c3Var instanceof dnl) {
            return ((stf0) jsonParserComponent.ya.getValue()).b(yf90Var, ((dnl) c3Var).c);
        }
        w511.b();
        return null;
    }
}
