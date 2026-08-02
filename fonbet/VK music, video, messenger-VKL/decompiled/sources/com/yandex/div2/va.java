package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.wa;
import com.yandex.div2.xa;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.fpf0;
import xsna.lpn;
import xsna.qpn;

/* compiled from: DivStroke.kt */
/* loaded from: classes8.dex */
public final class va implements JSONSerializable, Hashable {
    public final Expression<Integer> a;
    public final xa b;
    public final Expression<DivSizeUnit> c;
    public final Expression<Double> d;
    public Integer e;

    static {
        new xa.b(new qpn());
        Expression.Companion companion = Expression.Companion;
        Expression.Companion.constant$default(companion, DivSizeUnit.DP, null, 2, null);
        Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
    }

    public va(Expression<Integer> expression, xa xaVar, Expression<DivSizeUnit> expression2, Expression<Double> expression3) {
        this.a = expression;
        this.b = xaVar;
        this.c = expression2;
        this.d = expression3;
    }

    public final boolean a(va vaVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        Hashable hashable;
        Hashable hashable2;
        Hashable hashable3;
        if (vaVar == null || this.a.evaluate(expressionResolver).intValue() != vaVar.a.evaluate(expressionResolver2).intValue()) {
            return false;
        }
        xa xaVar = vaVar.b;
        xa xaVar2 = this.b;
        xaVar2.getClass();
        if (xaVar == null) {
            return false;
        }
        if (xaVar2 instanceof xa.b) {
            qpn qpnVar = ((xa.b) xaVar2).b;
            if (xaVar instanceof xa.b) {
                hashable3 = ((xa.b) xaVar).b;
            } else {
                if (!(xaVar instanceof xa.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                hashable3 = ((xa.a) xaVar).b;
            }
            hashable2 = hashable3 instanceof qpn ? (qpn) hashable3 : null;
            qpnVar.getClass();
            if (hashable2 == null) {
                return false;
            }
        } else {
            if (!(xaVar2 instanceof xa.a)) {
                throw new NoWhenBranchMatchedException();
            }
            lpn lpnVar = ((xa.a) xaVar2).b;
            if (xaVar instanceof xa.b) {
                hashable = ((xa.b) xaVar).b;
            } else {
                if (!(xaVar instanceof xa.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                hashable = ((xa.a) xaVar).b;
            }
            hashable2 = hashable instanceof lpn ? (lpn) hashable : null;
            lpnVar.getClass();
            if (hashable2 == null) {
                return false;
            }
        }
        return this.c.evaluate(expressionResolver) == vaVar.c.evaluate(expressionResolver2) && this.d.evaluate(expressionResolver).doubleValue() == vaVar.d.evaluate(expressionResolver2).doubleValue();
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.e;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.d.hashCode() + this.c.hashCode() + this.b.hash() + this.a.hashCode() + fpf0.a(va.class).hashCode();
        this.e = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((wa.b) BuiltInParserKt.getBuiltInParserComponent().I7.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
