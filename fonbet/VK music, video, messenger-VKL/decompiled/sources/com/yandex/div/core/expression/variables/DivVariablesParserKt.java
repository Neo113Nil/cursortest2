package com.yandex.div.core.expression.variables;

import com.yandex.div.data.Variable;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.md;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import xsna.bom0;
import xsna.cax;
import xsna.ll3;
import xsna.pfq0;
import xsna.pn70;
import xsna.t8g;
import xsna.x08;
import xsna.ywm;

/* compiled from: DivVariablesParser.kt */
/* loaded from: classes7.dex */
public final class DivVariablesParserKt {
    public static final Variable toVariable(md mdVar, ExpressionResolver expressionResolver) {
        if (mdVar instanceof md.b) {
            x08 x08Var = ((md.b) mdVar).b;
            return new Variable.BooleanVariable(x08Var.a, x08Var.b.evaluate(expressionResolver).booleanValue());
        }
        if (mdVar instanceof md.e) {
            cax caxVar = ((md.e) mdVar).b;
            return new Variable.IntegerVariable(caxVar.a, caxVar.b.evaluate(expressionResolver).longValue());
        }
        if (mdVar instanceof md.f) {
            pn70 pn70Var = ((md.f) mdVar).b;
            return new Variable.DoubleVariable(pn70Var.a, pn70Var.b.evaluate(expressionResolver).doubleValue());
        }
        if (mdVar instanceof md.h) {
            bom0 bom0Var = ((md.h) mdVar).b;
            return new Variable.StringVariable(bom0Var.a, bom0Var.b.evaluate(expressionResolver));
        }
        if (mdVar instanceof md.c) {
            t8g t8gVar = ((md.c) mdVar).b;
            return new Variable.ColorVariable(t8gVar.a, t8gVar.b.evaluate(expressionResolver).intValue());
        }
        if (mdVar instanceof md.i) {
            pfq0 pfq0Var = ((md.i) mdVar).b;
            return new Variable.UrlVariable(pfq0Var.a, pfq0Var.b.evaluate(expressionResolver));
        }
        if (mdVar instanceof md.d) {
            ywm ywmVar = ((md.d) mdVar).b;
            return new Variable.DictVariable(ywmVar.a, ywmVar.b.evaluate(expressionResolver));
        }
        if (mdVar instanceof md.a) {
            ll3 ll3Var = ((md.a) mdVar).b;
            return new Variable.ArrayVariable(ll3Var.a, ll3Var.b.evaluate(expressionResolver));
        }
        if (mdVar instanceof md.g) {
            throw new NotImplementedError("An operation is not implemented: Support property variables");
        }
        throw new NoWhenBranchMatchedException();
    }
}
