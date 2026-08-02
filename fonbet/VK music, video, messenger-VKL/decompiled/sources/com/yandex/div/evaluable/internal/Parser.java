package com.yandex.div.evaluable.internal;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.internal.Token;
import java.util.ArrayList;
import java.util.List;
import xsna.epx;
import xsna.ho8;

/* compiled from: Parser.kt */
/* loaded from: classes7.dex */
public final class Parser {
    public static final Parser INSTANCE = new Parser();

    /* compiled from: Parser.kt */
    public static final class ParsingState {
        private int index;
        private final String rawExpr;
        private final List<Token> tokens;

        /* JADX WARN: Multi-variable type inference failed */
        public ParsingState(List<? extends Token> list, String str) {
            this.tokens = list;
            this.rawExpr = str;
        }

        public final Token currentToken() {
            return this.tokens.get(this.index);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ParsingState)) {
                return false;
            }
            ParsingState parsingState = (ParsingState) obj;
            return epx.f(this.tokens, parsingState.tokens) && epx.f(this.rawExpr, parsingState.rawExpr);
        }

        public final int forward() {
            int i = this.index;
            this.index = i + 1;
            return i;
        }

        public final String getRawExpr() {
            return this.rawExpr;
        }

        public int hashCode() {
            return this.rawExpr.hashCode() + (this.tokens.hashCode() * 31);
        }

        public final boolean isAtEnd() {
            return this.index >= this.tokens.size();
        }

        public final boolean isNotAtEnd() {
            return !isAtEnd();
        }

        public final Token next() {
            return this.tokens.get(forward());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ParsingState(tokens=");
            sb.append(this.tokens);
            sb.append(", rawExpr=");
            return ho8.a(sb, this.rawExpr, ')');
        }
    }

    private Parser() {
    }

    private final Evaluable and(ParsingState parsingState) {
        Evaluable equal = equal(parsingState);
        while (parsingState.isNotAtEnd() && (parsingState.currentToken() instanceof Token.Operator.Binary.Logical.And)) {
            parsingState.forward();
            equal = new Evaluable.Binary(Token.Operator.Binary.Logical.And.INSTANCE, equal, equal(parsingState), parsingState.getRawExpr());
        }
        return equal;
    }

    private final Evaluable call(ParsingState parsingState, Evaluable evaluable) {
        if (parsingState.isAtEnd()) {
            throw new EvaluableException("Expression expected", null, 2, null);
        }
        Token next = parsingState.next();
        if (evaluable != null && !(next instanceof Token.Function)) {
            throw new EvaluableException("Method expected after .", null, 2, null);
        }
        if (next instanceof Token.Operand.Literal) {
            return new Evaluable.Value((Token.Operand.Literal) next, parsingState.getRawExpr());
        }
        if (next instanceof Token.Operand.Variable) {
            return new Evaluable.Variable(((Token.Operand.Variable) next).m180unboximpl(), parsingState.getRawExpr(), null);
        }
        if (next instanceof Token.Function) {
            return parseFunction((Token.Function) next, parsingState, evaluable);
        }
        if (next instanceof Token$Bracket$LeftRound) {
            Evaluable expression = expression(parsingState);
            if (parsingState.next() instanceof Token$Bracket$RightRound) {
                return expression;
            }
            throw new EvaluableException("')' expected after expression", null, 2, null);
        }
        if (!(next instanceof Token$StringTemplate$Start)) {
            throw new EvaluableException("Expression expected", null, 2, null);
        }
        ArrayList arrayList = new ArrayList();
        while (parsingState.isNotAtEnd() && !(parsingState.currentToken() instanceof Token$StringTemplate$End)) {
            if ((parsingState.currentToken() instanceof Token$StringTemplate$StartOfExpression) || (parsingState.currentToken() instanceof Token$StringTemplate$EndOfExpression)) {
                parsingState.forward();
            } else {
                arrayList.add(expression(parsingState));
            }
        }
        if (parsingState.next() instanceof Token$StringTemplate$End) {
            return new Evaluable.StringTemplate(arrayList, parsingState.getRawExpr());
        }
        throw new EvaluableException("expected ''' at end of a string template", null, 2, null);
    }

    public static /* synthetic */ Evaluable call$default(Parser parser, ParsingState parsingState, Evaluable evaluable, int i, Object obj) {
        if ((i & 2) != 0) {
            evaluable = null;
        }
        return parser.call(parsingState, evaluable);
    }

    private final Evaluable comparison(ParsingState parsingState) {
        Evaluable sum = sum(parsingState);
        while (parsingState.isNotAtEnd() && (parsingState.currentToken() instanceof Token.Operator.Binary.Comparison)) {
            sum = new Evaluable.Binary((Token.Operator.Binary) parsingState.next(), sum, sum(parsingState), parsingState.getRawExpr());
        }
        return sum;
    }

    private final Evaluable equal(ParsingState parsingState) {
        Evaluable comparison = comparison(parsingState);
        while (parsingState.isNotAtEnd() && (parsingState.currentToken() instanceof Token.Operator.Binary.Equality)) {
            comparison = new Evaluable.Binary((Token.Operator.Binary) parsingState.next(), comparison, comparison(parsingState), parsingState.getRawExpr());
        }
        return comparison;
    }

    private final Evaluable exponent(ParsingState parsingState) {
        Evaluable method = method(parsingState);
        if (!parsingState.isNotAtEnd() || !(parsingState.currentToken() instanceof Token.Operator.Binary.Power)) {
            return method;
        }
        parsingState.forward();
        return new Evaluable.Binary(Token.Operator.Binary.Power.INSTANCE, method, unary(parsingState), parsingState.getRawExpr());
    }

    private final Evaluable expression(ParsingState parsingState) {
        Evaluable m155try = m155try(parsingState);
        if (!parsingState.isNotAtEnd() || !(parsingState.currentToken() instanceof Token.Operator.TernaryIf)) {
            return m155try;
        }
        parsingState.forward();
        Evaluable expression = expression(parsingState);
        if (parsingState.isAtEnd() || !(parsingState.currentToken() instanceof Token.Operator.TernaryElse)) {
            throw new EvaluableException("':' expected in ternary-if-else expression", null, 2, null);
        }
        parsingState.forward();
        return new Evaluable.Ternary(Token.Operator.TernaryIfElse.INSTANCE, m155try, expression, expression(parsingState), parsingState.getRawExpr());
    }

    private final Evaluable factor(ParsingState parsingState) {
        Evaluable unary = unary(parsingState);
        while (parsingState.isNotAtEnd() && (parsingState.currentToken() instanceof Token.Operator.Binary.Factor)) {
            unary = new Evaluable.Binary((Token.Operator.Binary) parsingState.next(), unary, unary(parsingState), parsingState.getRawExpr());
        }
        return unary;
    }

    private final Evaluable method(ParsingState parsingState) {
        Evaluable call$default = call$default(this, parsingState, null, 2, null);
        while (parsingState.isNotAtEnd() && (parsingState.currentToken() instanceof Token.Operator.Dot)) {
            parsingState.forward();
            call$default = call(parsingState, call$default);
        }
        return call$default;
    }

    private final Evaluable or(ParsingState parsingState) {
        Evaluable and = and(parsingState);
        while (parsingState.isNotAtEnd() && (parsingState.currentToken() instanceof Token.Operator.Binary.Logical.Or)) {
            parsingState.forward();
            and = new Evaluable.Binary(Token.Operator.Binary.Logical.Or.INSTANCE, and, and(parsingState), parsingState.getRawExpr());
        }
        return and;
    }

    private final Evaluable parseFunction(Token.Function function, ParsingState parsingState, Evaluable evaluable) {
        if (!(parsingState.next() instanceof Token$Bracket$LeftRound)) {
            throw new EvaluableException("'(' expected after function call", null, 2, null);
        }
        ArrayList arrayList = new ArrayList();
        if (evaluable != null) {
            arrayList.add(evaluable);
        }
        while (!(parsingState.currentToken() instanceof Token$Bracket$RightRound)) {
            arrayList.add(expression(parsingState));
            if (parsingState.currentToken() instanceof Token.Function.ArgumentDelimiter) {
                parsingState.forward();
            }
        }
        if (parsingState.next() instanceof Token$Bracket$RightRound) {
            return evaluable == null ? new Evaluable.FunctionCall(function, arrayList, parsingState.getRawExpr()) : new Evaluable.MethodCall(function, arrayList, parsingState.getRawExpr());
        }
        throw new EvaluableException("expected ')' after a function call", null, 2, null);
    }

    private final Evaluable sum(ParsingState parsingState) {
        Evaluable factor = factor(parsingState);
        while (parsingState.isNotAtEnd() && (parsingState.currentToken() instanceof Token.Operator.Binary.Sum)) {
            factor = new Evaluable.Binary((Token.Operator.Binary) parsingState.next(), factor, factor(parsingState), parsingState.getRawExpr());
        }
        return factor;
    }

    /* renamed from: try, reason: not valid java name */
    private final Evaluable m155try(ParsingState parsingState) {
        Evaluable or = or(parsingState);
        if (!parsingState.isNotAtEnd() || !(parsingState.currentToken() instanceof Token.Operator.Try)) {
            return or;
        }
        return new Evaluable.Try((Token.Operator.Try) parsingState.next(), or, expression(parsingState), parsingState.getRawExpr());
    }

    private final Evaluable unary(ParsingState parsingState) {
        return (parsingState.isNotAtEnd() && (parsingState.currentToken() instanceof Token.Operator.Unary)) ? new Evaluable.Unary((Token.Operator) parsingState.next(), unary(parsingState), parsingState.getRawExpr()) : exponent(parsingState);
    }

    public final Evaluable parse(List<? extends Token> list, String str) {
        if (list.isEmpty()) {
            throw new EvaluableException("Expression expected", null, 2, null);
        }
        ParsingState parsingState = new ParsingState(list, str);
        Evaluable expression = expression(parsingState);
        if (parsingState.isNotAtEnd()) {
            throw new EvaluableException("Expression expected", null, 2, null);
        }
        return expression;
    }
}
