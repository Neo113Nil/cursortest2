package com.yandex.div.evaluable;

import com.yandex.div.evaluable.function.GetBooleanValue;
import com.yandex.div.evaluable.function.GetColorValue;
import com.yandex.div.evaluable.function.GetColorValueString;
import com.yandex.div.evaluable.function.GetIntegerValue;
import com.yandex.div.evaluable.function.GetNumberValue;
import com.yandex.div.evaluable.function.GetStringValue;
import com.yandex.div.evaluable.function.GetUrlValueWithStringFallback;
import com.yandex.div.evaluable.function.GetUrlValueWithUrlFallback;
import com.yandex.div.evaluable.internal.Parser;
import com.yandex.div.evaluable.internal.Token;
import com.yandex.div.evaluable.internal.Tokenizer;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.c5g;
import xsna.epx;
import xsna.fw3;
import xsna.j5g;
import xsna.rl3;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: Evaluable.kt */
/* loaded from: classes7.dex */
public abstract class Evaluable {
    public static final Companion Companion = new Companion(null);
    private static final Set<String> functionsWithVariableName = rl3.y0(new String[]{GetIntegerValue.INSTANCE.getName(), GetNumberValue.INSTANCE.getName(), GetStringValue.INSTANCE.getName(), GetColorValue.INSTANCE.getName(), GetColorValueString.INSTANCE.getName(), GetUrlValueWithUrlFallback.INSTANCE.getName(), GetUrlValueWithStringFallback.INSTANCE.getName(), GetBooleanValue.INSTANCE.getName()});
    private boolean evalCalled;
    private boolean isCacheable = true;
    private final String rawExpr;

    /* compiled from: Evaluable.kt */
    public static final class Binary extends Evaluable {
        private final List<Evaluable> dynamicVariables;
        private final Evaluable left;
        private final String rawExpression;
        private final Evaluable right;
        private final Token.Operator.Binary token;
        private final List<String> variables;

        public Binary(Token.Operator.Binary binary, Evaluable evaluable, Evaluable evaluable2, String str) {
            super(str);
            this.token = binary;
            this.left = evaluable;
            this.right = evaluable2;
            this.rawExpression = str;
            this.variables = j5g.u0(evaluable2.getVariables(), evaluable.getVariables());
            this.dynamicVariables = j5g.u0(evaluable2.getDynamicVariables(), evaluable.getDynamicVariables());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Binary)) {
                return false;
            }
            Binary binary = (Binary) obj;
            return epx.f(this.token, binary.token) && epx.f(this.left, binary.left) && epx.f(this.right, binary.right) && epx.f(this.rawExpression, binary.rawExpression);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public Object evalImpl(Evaluator evaluator) {
            return evaluator.evalBinary$div_evaluable(this);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public List<Evaluable> getDynamicVariables() {
            return this.dynamicVariables;
        }

        public final Evaluable getLeft() {
            return this.left;
        }

        public final Evaluable getRight() {
            return this.right;
        }

        public final Token.Operator.Binary getToken() {
            return this.token;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public List<String> getVariables() {
            return this.variables;
        }

        public int hashCode() {
            return this.rawExpression.hashCode() + ((this.right.hashCode() + ((this.left.hashCode() + (this.token.hashCode() * 31)) * 31)) * 31);
        }

        public String toString() {
            return "(" + this.left + ' ' + this.token + ' ' + this.right + ')';
        }
    }

    /* compiled from: Evaluable.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final Set<String> getFunctionsWithVariableName$div_evaluable() {
            return Evaluable.functionsWithVariableName;
        }

        public final Evaluable lazy(String str) {
            return new Lazy(str);
        }

        private Companion() {
        }
    }

    /* compiled from: Evaluable.kt */
    public static final class FunctionCall extends Evaluable {
        private final List<Evaluable> arguments;
        private final List<Evaluable> dynamicVariables;
        private final String rawExpression;
        private final Token.Function token;
        private final List<String> variables;

        /* JADX WARN: Multi-variable type inference failed */
        public FunctionCall(Token.Function function, List<? extends Evaluable> list, String str) {
            super(str);
            Object obj;
            this.token = function;
            this.arguments = list;
            this.rawExpression = str;
            List<? extends Evaluable> list2 = list;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((Evaluable) it.next()).getVariables());
            }
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                Object next = it2.next();
                while (it2.hasNext()) {
                    next = j5g.u0((List) it2.next(), (List) next);
                }
                obj = next;
            } else {
                obj = null;
            }
            List<String> list3 = (List) obj;
            this.variables = list3 == null ? EmptyList.b : list3;
            this.dynamicVariables = findDynamicVariables();
        }

        private final List<Evaluable> findDynamicVariables() {
            Object obj;
            Object obj2 = Evaluable.Companion.getFunctionsWithVariableName$div_evaluable().contains(this.token.getName()) ? this.arguments : EmptyList.b;
            List<Evaluable> list = this.arguments;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Evaluable) it.next()).getDynamicVariables());
            }
            Iterator it2 = j5g.u0(Collections.singletonList(obj2), arrayList).iterator();
            if (it2.hasNext()) {
                Object next = it2.next();
                while (it2.hasNext()) {
                    next = j5g.u0((List) it2.next(), (List) next);
                }
                obj = next;
            } else {
                obj = null;
            }
            List<Evaluable> list2 = (List) obj;
            return list2 == null ? EmptyList.b : list2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FunctionCall)) {
                return false;
            }
            FunctionCall functionCall = (FunctionCall) obj;
            return epx.f(this.token, functionCall.token) && epx.f(this.arguments, functionCall.arguments) && epx.f(this.rawExpression, functionCall.rawExpression);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public Object evalImpl(Evaluator evaluator) {
            return evaluator.evalFunctionCall$div_evaluable(this);
        }

        public final List<Evaluable> getArguments() {
            return this.arguments;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public List<Evaluable> getDynamicVariables() {
            return this.dynamicVariables;
        }

        public final Token.Function getToken() {
            return this.token;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public List<String> getVariables() {
            return this.variables;
        }

        public int hashCode() {
            return this.rawExpression.hashCode() + fw3.a(this.token.hashCode() * 31, 31, this.arguments);
        }

        public String toString() {
            return this.token.getName() + '(' + j5g.g0(this.arguments, Token.Function.ArgumentDelimiter.INSTANCE.toString(), null, null, 0, null, 62) + ')';
        }
    }

    /* compiled from: Evaluable.kt */
    public static final class Lazy extends Evaluable {
        private final String expr;
        private Evaluable expression;
        private final List<Token> tokens;

        public Lazy(String str) {
            super(str);
            this.expr = str;
            this.tokens = Tokenizer.INSTANCE.tokenize(str);
        }

        private final void initExpression() {
            if (this.expression == null) {
                this.expression = Parser.INSTANCE.parse(this.tokens, getRawExpr());
            }
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public Object evalImpl(Evaluator evaluator) {
            initExpression();
            Evaluable evaluable = this.expression;
            if (evaluable == null) {
                evaluable = null;
            }
            Object eval$div_evaluable = evaluable.eval$div_evaluable(evaluator);
            Evaluable evaluable2 = this.expression;
            updateIsCacheable$div_evaluable((evaluable2 != null ? evaluable2 : null).isCacheable);
            return eval$div_evaluable;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public List<Evaluable> getDynamicVariables() {
            initExpression();
            s3q0 s3q0Var = s3q0.a;
            Evaluable evaluable = this.expression;
            if (evaluable == null) {
                evaluable = null;
            }
            return evaluable.getDynamicVariables();
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public List<String> getVariables() {
            Evaluable evaluable = this.expression;
            if (evaluable != null) {
                if (evaluable == null) {
                    evaluable = null;
                }
                return evaluable.getVariables();
            }
            List<Token> list = this.tokens;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof Token.Operand.Variable) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Token.Operand.Variable) it.next()).m180unboximpl());
            }
            return arrayList2;
        }

        public String toString() {
            return this.expr;
        }
    }

    /* compiled from: Evaluable.kt */
    public static final class MethodCall extends Evaluable {
        private final List<Evaluable> arguments;
        private final List<Evaluable> dynamicVariables;
        private final String rawExpression;
        private final Token.Function token;
        private final List<String> variables;

        /* JADX WARN: Multi-variable type inference failed */
        public MethodCall(Token.Function function, List<? extends Evaluable> list, String str) {
            super(str);
            Object next;
            this.token = function;
            this.arguments = list;
            this.rawExpression = str;
            List<? extends Evaluable> list2 = list;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((Evaluable) it.next()).getVariables());
            }
            Iterator it2 = arrayList.iterator();
            Object obj = null;
            if (it2.hasNext()) {
                next = it2.next();
                while (it2.hasNext()) {
                    next = j5g.u0((List) it2.next(), (List) next);
                }
            } else {
                next = null;
            }
            List<String> list3 = (List) next;
            this.variables = list3 == null ? EmptyList.b : list3;
            List<Evaluable> list4 = this.arguments;
            ArrayList arrayList2 = new ArrayList(c5g.u(list4, 10));
            Iterator<T> it3 = list4.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((Evaluable) it3.next()).getDynamicVariables());
            }
            Iterator it4 = arrayList2.iterator();
            if (it4.hasNext()) {
                obj = it4.next();
                while (it4.hasNext()) {
                    obj = j5g.u0((List) it4.next(), (List) obj);
                }
            }
            List<Evaluable> list5 = (List) obj;
            this.dynamicVariables = list5 == null ? EmptyList.b : list5;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MethodCall)) {
                return false;
            }
            MethodCall methodCall = (MethodCall) obj;
            return epx.f(this.token, methodCall.token) && epx.f(this.arguments, methodCall.arguments) && epx.f(this.rawExpression, methodCall.rawExpression);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public Object evalImpl(Evaluator evaluator) {
            return evaluator.evalMethodCall$div_evaluable(this);
        }

        public final List<Evaluable> getArguments() {
            return this.arguments;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public List<Evaluable> getDynamicVariables() {
            return this.dynamicVariables;
        }

        public final Token.Function getToken() {
            return this.token;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public List<String> getVariables() {
            return this.variables;
        }

        public int hashCode() {
            return this.rawExpression.hashCode() + fw3.a(this.token.hashCode() * 31, 31, this.arguments);
        }

        public String toString() {
            String str;
            if (this.arguments.size() > 1) {
                List<Evaluable> list = this.arguments;
                str = j5g.g0(list.subList(1, list.size()), Token.Function.ArgumentDelimiter.INSTANCE.toString(), null, null, 0, null, 62);
            } else {
                str = "";
            }
            return j5g.Y(this.arguments) + JwtParser.SEPARATOR_CHAR + this.token.getName() + '(' + str + ')';
        }
    }

    /* compiled from: Evaluable.kt */
    public static final class StringTemplate extends Evaluable {
        private final List<Evaluable> arguments;
        private final List<Evaluable> dynamicVariables;
        private final String rawExpression;
        private final List<String> variables;

        /* JADX WARN: Multi-variable type inference failed */
        public StringTemplate(List<? extends Evaluable> list, String str) {
            super(str);
            this.arguments = list;
            this.rawExpression = str;
            List<? extends Evaluable> list2 = list;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((Evaluable) it.next()).getVariables());
            }
            Iterator it2 = arrayList.iterator();
            if (!it2.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it2.next();
            while (it2.hasNext()) {
                next = j5g.u0((List) it2.next(), (List) next);
            }
            this.variables = (List) next;
            List<Evaluable> list3 = this.arguments;
            ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
            Iterator<T> it3 = list3.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((Evaluable) it3.next()).getDynamicVariables());
            }
            Iterator it4 = arrayList2.iterator();
            if (!it4.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next2 = it4.next();
            while (it4.hasNext()) {
                next2 = j5g.u0((List) it4.next(), (List) next2);
            }
            this.dynamicVariables = (List) next2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StringTemplate)) {
                return false;
            }
            StringTemplate stringTemplate = (StringTemplate) obj;
            return epx.f(this.arguments, stringTemplate.arguments) && epx.f(this.rawExpression, stringTemplate.rawExpression);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public Object evalImpl(Evaluator evaluator) {
            return evaluator.evalStringTemplate$div_evaluable(this);
        }

        public final List<Evaluable> getArguments() {
            return this.arguments;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public List<Evaluable> getDynamicVariables() {
            return this.dynamicVariables;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public List<String> getVariables() {
            return this.variables;
        }

        public int hashCode() {
            return this.rawExpression.hashCode() + (this.arguments.hashCode() * 31);
        }

        public String toString() {
            return j5g.g0(this.arguments, "", null, null, 0, null, 62);
        }
    }

    /* compiled from: Evaluable.kt */
    public static final class Ternary extends Evaluable {
        private final List<Evaluable> dynamicVariables;
        private final Evaluable firstExpression;
        private final String rawExpression;
        private final Evaluable secondExpression;
        private final Evaluable thirdExpression;
        private final Token.Operator token;
        private final List<String> variables;

        public Ternary(Token.Operator operator, Evaluable evaluable, Evaluable evaluable2, Evaluable evaluable3, String str) {
            super(str);
            this.token = operator;
            this.firstExpression = evaluable;
            this.secondExpression = evaluable2;
            this.thirdExpression = evaluable3;
            this.rawExpression = str;
            this.variables = j5g.u0(evaluable3.getVariables(), j5g.u0(evaluable2.getVariables(), evaluable.getVariables()));
            this.dynamicVariables = j5g.u0(evaluable3.getDynamicVariables(), j5g.u0(evaluable2.getDynamicVariables(), evaluable.getDynamicVariables()));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ternary)) {
                return false;
            }
            Ternary ternary = (Ternary) obj;
            return epx.f(this.token, ternary.token) && epx.f(this.firstExpression, ternary.firstExpression) && epx.f(this.secondExpression, ternary.secondExpression) && epx.f(this.thirdExpression, ternary.thirdExpression) && epx.f(this.rawExpression, ternary.rawExpression);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public Object evalImpl(Evaluator evaluator) {
            return evaluator.evalTernary$div_evaluable(this);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public List<Evaluable> getDynamicVariables() {
            return this.dynamicVariables;
        }

        public final Evaluable getFirstExpression() {
            return this.firstExpression;
        }

        public final Evaluable getSecondExpression() {
            return this.secondExpression;
        }

        public final Evaluable getThirdExpression() {
            return this.thirdExpression;
        }

        public final Token.Operator getToken() {
            return this.token;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public List<String> getVariables() {
            return this.variables;
        }

        public int hashCode() {
            return this.rawExpression.hashCode() + ((this.thirdExpression.hashCode() + ((this.secondExpression.hashCode() + ((this.firstExpression.hashCode() + (this.token.hashCode() * 31)) * 31)) * 31)) * 31);
        }

        public String toString() {
            return "(" + this.firstExpression + ' ' + Token.Operator.TernaryIf.INSTANCE + ' ' + this.secondExpression + ' ' + Token.Operator.TernaryElse.INSTANCE + ' ' + this.thirdExpression + ')';
        }
    }

    /* compiled from: Evaluable.kt */
    public static final class Try extends Evaluable {
        private final List<Evaluable> dynamicVariables;
        private final Evaluable fallbackExpression;
        private final String rawExpression;
        private final Token.Operator.Try token;
        private final Evaluable tryExpression;
        private final List<String> variables;

        public Try(Token.Operator.Try r1, Evaluable evaluable, Evaluable evaluable2, String str) {
            super(str);
            this.token = r1;
            this.tryExpression = evaluable;
            this.fallbackExpression = evaluable2;
            this.rawExpression = str;
            this.variables = j5g.u0(evaluable2.getVariables(), evaluable.getVariables());
            this.dynamicVariables = j5g.u0(evaluable2.getDynamicVariables(), evaluable.getDynamicVariables());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Try)) {
                return false;
            }
            Try r5 = (Try) obj;
            return epx.f(this.token, r5.token) && epx.f(this.tryExpression, r5.tryExpression) && epx.f(this.fallbackExpression, r5.fallbackExpression) && epx.f(this.rawExpression, r5.rawExpression);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public Object evalImpl(Evaluator evaluator) {
            return evaluator.evalTry$div_evaluable(this);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public List<Evaluable> getDynamicVariables() {
            return this.dynamicVariables;
        }

        public final Evaluable getFallbackExpression() {
            return this.fallbackExpression;
        }

        public final Evaluable getTryExpression() {
            return this.tryExpression;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public List<String> getVariables() {
            return this.variables;
        }

        public int hashCode() {
            return this.rawExpression.hashCode() + ((this.fallbackExpression.hashCode() + ((this.tryExpression.hashCode() + (this.token.hashCode() * 31)) * 31)) * 31);
        }

        public String toString() {
            return "(" + this.tryExpression + ' ' + this.token + ' ' + this.fallbackExpression + ')';
        }
    }

    /* compiled from: Evaluable.kt */
    public static final class Unary extends Evaluable {
        private final List<Evaluable> dynamicVariables;
        private final Evaluable expression;
        private final String rawExpression;
        private final Token.Operator token;
        private final List<String> variables;

        public Unary(Token.Operator operator, Evaluable evaluable, String str) {
            super(str);
            this.token = operator;
            this.expression = evaluable;
            this.rawExpression = str;
            this.variables = evaluable.getVariables();
            this.dynamicVariables = evaluable.getDynamicVariables();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Unary)) {
                return false;
            }
            Unary unary = (Unary) obj;
            return epx.f(this.token, unary.token) && epx.f(this.expression, unary.expression) && epx.f(this.rawExpression, unary.rawExpression);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public Object evalImpl(Evaluator evaluator) {
            return evaluator.evalUnary$div_evaluable(this);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public List<Evaluable> getDynamicVariables() {
            return this.dynamicVariables;
        }

        public final Evaluable getExpression() {
            return this.expression;
        }

        public final Token.Operator getToken() {
            return this.token;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public List<String> getVariables() {
            return this.variables;
        }

        public int hashCode() {
            return this.rawExpression.hashCode() + ((this.expression.hashCode() + (this.token.hashCode() * 31)) * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.token);
            sb.append(this.expression);
            return sb.toString();
        }
    }

    /* compiled from: Evaluable.kt */
    public static final class Value extends Evaluable {
        private final List<Evaluable> dynamicVariables;
        private final String rawExpression;
        private final Token.Operand.Literal token;
        private final List<String> variables;

        public Value(Token.Operand.Literal literal, String str) {
            super(str);
            this.token = literal;
            this.rawExpression = str;
            EmptyList emptyList = EmptyList.b;
            this.variables = emptyList;
            this.dynamicVariables = emptyList;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Value)) {
                return false;
            }
            Value value = (Value) obj;
            return epx.f(this.token, value.token) && epx.f(this.rawExpression, value.rawExpression);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public Object evalImpl(Evaluator evaluator) {
            return evaluator.evalValue$div_evaluable(this);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public List<Evaluable> getDynamicVariables() {
            return this.dynamicVariables;
        }

        public final Token.Operand.Literal getToken() {
            return this.token;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public List<String> getVariables() {
            return this.variables;
        }

        public int hashCode() {
            return this.rawExpression.hashCode() + (this.token.hashCode() * 31);
        }

        public String toString() {
            Token.Operand.Literal literal = this.token;
            if (literal instanceof Token.Operand.Literal.Str) {
                return "'" + ((Token.Operand.Literal.Str) this.token).m173unboximpl() + '\'';
            }
            if (literal instanceof Token.Operand.Literal.Num) {
                return ((Token.Operand.Literal.Num) literal).m167unboximpl().toString();
            }
            if (literal instanceof Token.Operand.Literal.Bool) {
                return String.valueOf(((Token.Operand.Literal.Bool) literal).m161unboximpl());
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: Evaluable.kt */
    public static final class Variable extends Evaluable {
        private final List<Evaluable> dynamicVariables;
        private final String rawExpression;
        private final String token;
        private final List<String> variables;

        public /* synthetic */ Variable(String str, String str2, zcl zclVar) {
            this(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Variable)) {
                return false;
            }
            Variable variable = (Variable) obj;
            return Token.Operand.Variable.m177equalsimpl0(this.token, variable.token) && epx.f(this.rawExpression, variable.rawExpression);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public Object evalImpl(Evaluator evaluator) {
            return evaluator.evalVariable$div_evaluable(this);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public List<Evaluable> getDynamicVariables() {
            return this.dynamicVariables;
        }

        /* renamed from: getToken-A4lXSVo, reason: not valid java name */
        public final String m141getTokenA4lXSVo() {
            return this.token;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public List<String> getVariables() {
            return this.variables;
        }

        public int hashCode() {
            return this.rawExpression.hashCode() + (Token.Operand.Variable.m178hashCodeimpl(this.token) * 31);
        }

        public String toString() {
            return this.token;
        }

        private Variable(String str, String str2) {
            super(str2);
            this.token = str;
            this.rawExpression = str2;
            this.variables = Collections.singletonList(str);
            this.dynamicVariables = EmptyList.b;
        }
    }

    public Evaluable(String str) {
        this.rawExpr = str;
    }

    public final boolean checkIsCacheable() {
        return this.isCacheable;
    }

    public final Object eval$div_evaluable(Evaluator evaluator) throws EvaluableException {
        Object evalImpl = evalImpl(evaluator);
        this.evalCalled = true;
        return evalImpl;
    }

    public abstract Object evalImpl(Evaluator evaluator) throws EvaluableException;

    public abstract List<Evaluable> getDynamicVariables();

    public final String getRawExpr() {
        return this.rawExpr;
    }

    public abstract List<String> getVariables();

    public final void updateIsCacheable$div_evaluable(boolean z) {
        this.isCacheable = this.isCacheable && z;
    }
}
