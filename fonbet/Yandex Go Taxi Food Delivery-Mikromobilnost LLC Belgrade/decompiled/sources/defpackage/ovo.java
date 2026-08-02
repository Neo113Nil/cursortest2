package defpackage;

import com.yandex.div.json.expressions.Expression;

/* loaded from: classes11.dex */
public final class ovo implements t25 {
    public final Expression a;
    public final rvo b;

    public ovo(Expression expression, rvo rvoVar) {
        this.a = expression;
        this.b = rvoVar;
    }

    @Override // defpackage.t25
    public final boolean a(String str) {
        return ((Boolean) this.a.a(this.b)).booleanValue();
    }
}
