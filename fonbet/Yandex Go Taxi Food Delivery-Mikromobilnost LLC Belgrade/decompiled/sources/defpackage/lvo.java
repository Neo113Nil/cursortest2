package defpackage;

import com.yandex.div.evaluable.EvaluableException;

/* loaded from: classes.dex */
public final class lvo extends kvo {
    public final String b;
    public final eg90 c;
    public String d;

    public lvo(eg90 eg90Var, String str) {
        super(str);
        this.b = "";
        this.c = eg90Var;
    }

    @Override // defpackage.kvo, com.yandex.div.json.expressions.Expression
    public final Object a(rvo rvoVar) {
        String str = this.d;
        if (str != null) {
            return str;
        }
        try {
            String u = ngd0.u((String) this.a);
            this.d = u;
            return u;
        } catch (EvaluableException e) {
            this.c.a(e);
            String str2 = this.b;
            this.d = str2;
            return str2;
        }
    }
}
