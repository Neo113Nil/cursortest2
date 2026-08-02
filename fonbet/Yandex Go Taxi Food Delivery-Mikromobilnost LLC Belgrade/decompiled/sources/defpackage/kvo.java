package defpackage;

import com.yandex.div.json.expressions.Expression;

/* loaded from: classes.dex */
public class kvo extends Expression {
    public final Object a;

    public kvo(Object obj) {
        this.a = obj;
    }

    @Override // com.yandex.div.json.expressions.Expression
    public Object a(rvo rvoVar) {
        return this.a;
    }

    @Override // com.yandex.div.json.expressions.Expression
    public final Object b() {
        return this.a;
    }

    @Override // com.yandex.div.json.expressions.Expression
    public final f1k c(rvo rvoVar, tls tlsVar) {
        return f1k.O1;
    }

    @Override // com.yandex.div.json.expressions.Expression
    public final f1k d(rvo rvoVar, tls tlsVar) {
        tlsVar.invoke(this.a);
        return f1k.O1;
    }
}
