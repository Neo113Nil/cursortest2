package defpackage;

import android.net.Uri;
import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class nnk implements c4x, f9l {
    public final Expression a;
    public final tnk b;
    public final Expression c;
    public final Expression d;
    public final Expression e;
    public final JSONObject f;
    public final Expression g;
    public final String h;
    public final jbk i;
    public final Expression j;
    public final Expression k;
    public Integer l;

    static {
        ngd0.m(800L);
        ngd0.m(Boolean.TRUE);
        ngd0.m(1L);
        ngd0.m(0L);
    }

    public nnk(jbk jbkVar, tnk tnkVar, Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5, Expression expression6, Expression expression7, String str, JSONObject jSONObject) {
        this.a = expression;
        this.b = tnkVar;
        this.c = expression2;
        this.d = expression3;
        this.e = expression4;
        this.f = jSONObject;
        this.g = expression5;
        this.h = str;
        this.i = jbkVar;
        this.j = expression6;
        this.k = expression7;
    }

    @Override // defpackage.f9l
    public final tnk a() {
        return this.b;
    }

    @Override // defpackage.f9l
    public final Expression b() {
        return this.d;
    }

    @Override // defpackage.f9l
    public final Expression c() {
        return this.e;
    }

    @Override // defpackage.f9l
    public final jbk d() {
        return this.i;
    }

    @Override // defpackage.f9l
    public final String e() {
        return this.h;
    }

    public final boolean f(nnk nnkVar, rvo rvoVar, rvo rvoVar2) {
        if (nnkVar != null && ((Number) this.a.a(rvoVar)).longValue() == ((Number) nnkVar.a.a(rvoVar2)).longValue()) {
            tnk tnkVar = nnkVar.b;
            tnk tnkVar2 = this.b;
            if ((tnkVar2 != null ? tnkVar2.a(tnkVar, rvoVar, rvoVar2) : tnkVar == null) && ((Boolean) this.c.a(rvoVar)).booleanValue() == ((Boolean) nnkVar.c.a(rvoVar2)).booleanValue() && jl40.l(this.d.a(rvoVar), nnkVar.d.a(rvoVar2)) && ((Number) this.e.a(rvoVar)).longValue() == ((Number) nnkVar.e.a(rvoVar2)).longValue() && jl40.l(this.f, nnkVar.f)) {
                Expression expression = this.g;
                Uri uri = expression != null ? (Uri) expression.a(rvoVar) : null;
                Expression expression2 = nnkVar.g;
                if (jl40.l(uri, expression2 != null ? (Uri) expression2.a(rvoVar2) : null) && jl40.l(this.h, nnkVar.h)) {
                    jbk jbkVar = nnkVar.i;
                    jbk jbkVar2 = this.i;
                    if (jbkVar2 != null ? jbkVar2.a(jbkVar, rvoVar, rvoVar2) : jbkVar == null) {
                        Expression expression3 = this.j;
                        Uri uri2 = expression3 != null ? (Uri) expression3.a(rvoVar) : null;
                        Expression expression4 = nnkVar.j;
                        if (jl40.l(uri2, expression4 != null ? (Uri) expression4.a(rvoVar2) : null) && ((Number) this.k.a(rvoVar)).longValue() == ((Number) nnkVar.k.a(rvoVar2)).longValue()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int g() {
        Integer num = this.l;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.a.hashCode() + qoi0.a(nnk.class).hashCode();
        tnk tnkVar = this.b;
        int hashCode2 = this.e.hashCode() + this.d.hashCode() + this.c.hashCode() + hashCode + (tnkVar != null ? tnkVar.b() : 0);
        JSONObject jSONObject = this.f;
        int hashCode3 = hashCode2 + (jSONObject != null ? jSONObject.hashCode() : 0);
        Expression expression = this.g;
        int hashCode4 = hashCode3 + (expression != null ? expression.hashCode() : 0);
        String str = this.h;
        int hashCode5 = hashCode4 + (str != null ? str.hashCode() : 0);
        jbk jbkVar = this.i;
        int b = hashCode5 + (jbkVar != null ? jbkVar.b() : 0);
        Expression expression2 = this.j;
        int hashCode6 = this.k.hashCode() + b + (expression2 != null ? expression2.hashCode() : 0);
        this.l = Integer.valueOf(hashCode6);
        return hashCode6;
    }

    @Override // defpackage.f9l
    public final JSONObject getPayload() {
        return this.f;
    }

    @Override // defpackage.f9l
    public final Expression getUrl() {
        return this.j;
    }

    @Override // defpackage.f9l
    public final Expression isEnabled() {
        return this.c;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((onk) ft6.b.X2.getValue()).b(ft6.a, this);
    }
}
