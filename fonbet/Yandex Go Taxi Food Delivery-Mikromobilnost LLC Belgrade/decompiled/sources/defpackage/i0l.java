package defpackage;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAnimationDirection;
import com.yandex.div2.DivAnimationInterpolator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class i0l implements c4x, aek {
    public final List a;
    public final Expression b;
    public final Expression c;
    public final List d;
    public final Expression e;
    public final String f;
    public final Expression g;
    public final pkk h;
    public final Expression i;
    public final Expression j;
    public final String k;
    public Integer l;

    static {
        ngd0.m(DivAnimationDirection.NORMAL);
        ngd0.m(DivAnimationInterpolator.LINEAR);
        ngd0.m(1L);
        ngd0.m(0L);
    }

    public i0l(List list, Expression expression, Expression expression2, List list2, Expression expression3, String str, Expression expression4, pkk pkkVar, Expression expression5, Expression expression6, String str2) {
        this.a = list;
        this.b = expression;
        this.c = expression2;
        this.d = list2;
        this.e = expression3;
        this.f = str;
        this.g = expression4;
        this.h = pkkVar;
        this.i = expression5;
        this.j = expression6;
        this.k = str2;
    }

    @Override // defpackage.aek
    public final pkk a() {
        return this.h;
    }

    @Override // defpackage.aek
    public final List b() {
        return this.a;
    }

    @Override // defpackage.aek
    public final Expression c() {
        return this.g;
    }

    @Override // defpackage.aek
    public final List d() {
        return this.d;
    }

    @Override // defpackage.aek
    public final Expression e() {
        return this.i;
    }

    @Override // defpackage.aek
    public final Expression getDirection() {
        return this.b;
    }

    @Override // defpackage.aek
    public final Expression getDuration() {
        return this.c;
    }

    @Override // defpackage.aek
    public final String getId() {
        return this.f;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((j0l) ft6.b.p5.getValue()).b(ft6.a, this);
    }
}
