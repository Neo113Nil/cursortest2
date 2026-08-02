package com.yandex.div.evaluable;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.internal.Token;
import com.yandex.div.evaluable.types.Color;
import com.yandex.div.evaluable.types.DateTime;
import com.yandex.div.evaluable.types.Url;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.c5g;
import xsna.cqi;
import xsna.e43;
import xsna.epx;
import xsna.gzs;
import xsna.j5g;
import xsna.zcl;

/* compiled from: Evaluator.kt */
/* loaded from: classes7.dex */
public class Evaluator {
    public static final Companion Companion = new Companion(null);
    private final EvaluationContext evaluationContext;

    /* compiled from: Evaluator.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x005b, code lost:
        
            if (r3 == r0.longValue()) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:
        
            if (r19.equals(-1L) != false) goto L21;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object evalFactor$div_evaluable(Token.Operator.Binary.Factor factor, Object obj, Object obj2) {
            double doubleValue;
            long longValue;
            boolean z = obj instanceof Long;
            if (!z || !(obj2 instanceof Long)) {
                if (!(obj instanceof Double) || !(obj2 instanceof Double)) {
                    EvaluableExceptionKt.throwExceptionOnEvaluationFailed(factor, obj, obj2);
                    throw new KotlinNothingValueException();
                }
                if (factor instanceof Token.Operator.Binary.Factor.Multiplication) {
                    doubleValue = ((Number) obj2).doubleValue() * ((Number) obj).doubleValue();
                } else if (factor instanceof Token.Operator.Binary.Factor.Division) {
                    Number number = (Number) obj2;
                    if (number.doubleValue() == ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                        EvaluableExceptionKt.throwExceptionOnEvaluationFailed$default(obj + " / " + obj2, "Division by zero is not supported.", null, 4, null);
                        throw new KotlinNothingValueException();
                    }
                    doubleValue = ((Number) obj).doubleValue() / number.doubleValue();
                } else {
                    if (!(factor instanceof Token.Operator.Binary.Factor.Modulo)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Number number2 = (Number) obj2;
                    if (number2.doubleValue() == ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                        EvaluableExceptionKt.throwExceptionOnEvaluationFailed$default(obj + " % " + obj2, "Division by zero is not supported.", null, 4, null);
                        throw new KotlinNothingValueException();
                    }
                    doubleValue = ((Number) obj).doubleValue() % number2.doubleValue();
                }
                return Double.valueOf(doubleValue);
            }
            if (factor instanceof Token.Operator.Binary.Factor.Multiplication) {
                Number number3 = (Number) obj;
                Number number4 = (Number) obj2;
                long longValue2 = number4.longValue() * number3.longValue();
                if (((Math.abs(number3.longValue()) | Math.abs(number4.longValue())) >>> 31) != 0) {
                    if (!obj2.equals(0L)) {
                        long longValue3 = longValue2 / number4.longValue();
                        if (z) {
                        }
                        throw new IntegerOverflow(obj + " * " + obj2, null, 2, null);
                    }
                    if (obj.equals(Long.MIN_VALUE)) {
                    }
                }
                return Long.valueOf(longValue2);
            }
            if (factor instanceof Token.Operator.Binary.Factor.Division) {
                if (obj2.equals(0L)) {
                    EvaluableExceptionKt.throwExceptionOnEvaluationFailed$default(obj + " / " + obj2, "Division by zero is not supported.", null, 4, null);
                    throw new KotlinNothingValueException();
                }
                longValue = ((Number) obj).longValue() / ((Number) obj2).longValue();
            } else {
                if (!(factor instanceof Token.Operator.Binary.Factor.Modulo)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (obj2.equals(0L)) {
                    EvaluableExceptionKt.throwExceptionOnEvaluationFailed$default(obj + " % " + obj2, "Division by zero is not supported.", null, 4, null);
                    throw new KotlinNothingValueException();
                }
                longValue = ((Number) obj).longValue() % ((Number) obj2).longValue();
            }
            return Long.valueOf(longValue);
        }

        public final Object evalSum$div_evaluable(Token.Operator.Binary.Sum sum, Object obj, Object obj2) {
            double doubleValue;
            if ((obj instanceof String) && (obj2 instanceof String)) {
                if (!(sum instanceof Token.Operator.Binary.Sum.Plus)) {
                    EvaluableExceptionKt.throwExceptionOnEvaluationFailed(sum, obj, obj2);
                    throw new KotlinNothingValueException();
                }
                StringBuilder sb = new StringBuilder();
                sb.append(obj);
                sb.append(obj2);
                return sb.toString();
            }
            if (!(obj instanceof Long) || !(obj2 instanceof Long)) {
                if (!(obj instanceof Double) || !(obj2 instanceof Double)) {
                    EvaluableExceptionKt.throwExceptionOnEvaluationFailed(sum, obj, obj2);
                    throw new KotlinNothingValueException();
                }
                if (sum instanceof Token.Operator.Binary.Sum.Plus) {
                    doubleValue = ((Number) obj2).doubleValue() + ((Number) obj).doubleValue();
                } else {
                    if (!(sum instanceof Token.Operator.Binary.Sum.Minus)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    doubleValue = ((Number) obj).doubleValue() - ((Number) obj2).doubleValue();
                }
                return Double.valueOf(doubleValue);
            }
            if (sum instanceof Token.Operator.Binary.Sum.Plus) {
                Number number = (Number) obj;
                Number number2 = (Number) obj2;
                long longValue = number2.longValue() + number.longValue();
                if (((number.longValue() ^ longValue) & (number2.longValue() ^ longValue)) >= 0) {
                    return Long.valueOf(longValue);
                }
                throw new IntegerOverflow(obj + " + " + obj2, null, 2, null);
            }
            if (!(sum instanceof Token.Operator.Binary.Sum.Minus)) {
                throw new NoWhenBranchMatchedException();
            }
            Number number3 = (Number) obj;
            Number number4 = (Number) obj2;
            long longValue2 = number3.longValue() - number4.longValue();
            if (((number3.longValue() ^ number4.longValue()) & (number3.longValue() ^ longValue2)) >= 0) {
                return Long.valueOf(longValue2);
            }
            throw new IntegerOverflow(obj + " - " + obj2, null, 2, null);
        }

        private Companion() {
        }
    }

    /* compiled from: Evaluator.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EvaluableType.values().length];
            try {
                iArr[EvaluableType.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Evaluator(EvaluationContext evaluationContext) {
        this.evaluationContext = evaluationContext;
    }

    private Pair<Object, Object> castArgumentsIfNeeded(Object obj, Object obj2) {
        return obj.getClass().equals(obj2.getClass()) ? new Pair<>(obj, obj2) : ((obj instanceof Long) && (obj2 instanceof Double)) ? new Pair<>(Double.valueOf(((Number) obj).longValue()), obj2) : ((obj instanceof Double) && (obj2 instanceof Long)) ? new Pair<>(obj, Double.valueOf(((Number) obj2).longValue())) : new Pair<>(obj, obj2);
    }

    private List<Object> castEvalArgumentsIfNeeded(Function function, List<? extends Object> list) {
        EvaluableType evaluableType;
        List<FunctionArgument> declaredArgs = function.getDeclaredArgs();
        List<? extends Object> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            int h = e43.h(declaredArgs);
            if (i > h) {
                i = h;
            }
            EvaluableType type = declaredArgs.get(i).getType();
            EvaluableType.Companion companion = EvaluableType.Companion;
            if (obj instanceof Long) {
                evaluableType = EvaluableType.INTEGER;
            } else if (obj instanceof Double) {
                evaluableType = EvaluableType.NUMBER;
            } else if (obj instanceof Boolean) {
                evaluableType = EvaluableType.BOOLEAN;
            } else if (obj instanceof String) {
                evaluableType = EvaluableType.STRING;
            } else if (obj instanceof DateTime) {
                evaluableType = EvaluableType.DATETIME;
            } else if (obj instanceof Color) {
                evaluableType = EvaluableType.COLOR;
            } else if (obj instanceof Url) {
                evaluableType = EvaluableType.URL;
            } else if (obj instanceof JSONObject) {
                evaluableType = EvaluableType.DICT;
            } else {
                if (!(obj instanceof JSONArray)) {
                    if (obj == null) {
                        throw new EvaluableException("Unable to find type for null", null, 2, null);
                    }
                    throw new EvaluableException("Unable to find type for ".concat(obj.getClass().getName()), null, 2, null);
                }
                evaluableType = EvaluableType.ARRAY;
            }
            if (type != evaluableType) {
                obj = castIfPossible(obj, type);
            }
            arrayList.add(obj);
            i = i2;
        }
        return arrayList;
    }

    private Object castIfPossible(Object obj, EvaluableType evaluableType) {
        return ((obj instanceof Long) && WhenMappings.$EnumSwitchMapping$0[evaluableType.ordinal()] == 1) ? Double.valueOf(((Number) obj).longValue()) : obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0016, code lost:
    
        if (r5.compareTo(r6) <= 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0021, code lost:
    
        if (r5.compareTo(r6) >= 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002c, code lost:
    
        if (r5.compareTo(r6) > 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r5.compareTo(r6) < 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0033, code lost:
    
        return java.lang.Boolean.valueOf(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private <T extends Comparable<? super T>> Object evalComparableTypes(Token.Operator.Binary.Comparison comparison, T t, T t2) {
        boolean z = false;
        if (!(comparison instanceof Token.Operator.Binary.Comparison.Less)) {
            if (!(comparison instanceof Token.Operator.Binary.Comparison.LessOrEqual)) {
                if (!(comparison instanceof Token.Operator.Binary.Comparison.GreaterOrEqual)) {
                    if (!(comparison instanceof Token.Operator.Binary.Comparison.Greater)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
        }
    }

    private Object evalComparison(Token.Operator.Binary.Comparison comparison, Object obj, Object obj2) {
        if ((obj instanceof Double) && (obj2 instanceof Double)) {
            return evalComparableTypes(comparison, (Comparable) obj, (Comparable) obj2);
        }
        if ((obj instanceof Long) && (obj2 instanceof Long)) {
            return evalComparableTypes(comparison, (Comparable) obj, (Comparable) obj2);
        }
        if ((obj instanceof DateTime) && (obj2 instanceof DateTime)) {
            return evalComparableTypes(comparison, (Comparable) obj, (Comparable) obj2);
        }
        EvaluableExceptionKt.throwExceptionOnEvaluationFailed(comparison, obj, obj2);
        throw new KotlinNothingValueException();
    }

    private Object evalEquality(Token.Operator.Binary.Equality equality, Object obj, Object obj2) {
        boolean z;
        if (equality instanceof Token.Operator.Binary.Equality.Equal) {
            z = epx.f(obj, obj2);
        } else {
            if (!(equality instanceof Token.Operator.Binary.Equality.NotEqual)) {
                throw new NoWhenBranchMatchedException();
            }
            z = !epx.f(obj, obj2);
        }
        return Boolean.valueOf(z);
    }

    private Object evalLogical(Token.Operator.Binary.Logical logical, Object obj, gzs<? extends Object> gzsVar) {
        if (!(obj instanceof Boolean)) {
            EvaluableExceptionKt.throwExceptionOnEvaluationFailed$default(obj + ' ' + logical + " ...", "'" + logical + "' must be called with boolean operands.", null, 4, null);
            throw new KotlinNothingValueException();
        }
        boolean z = logical instanceof Token.Operator.Binary.Logical.Or;
        if ((z && ((Boolean) obj).booleanValue()) || ((logical instanceof Token.Operator.Binary.Logical.And) && !((Boolean) obj).booleanValue())) {
            return obj;
        }
        Object invoke = gzsVar.invoke();
        if (!(invoke instanceof Boolean)) {
            EvaluableExceptionKt.throwExceptionOnEvaluationFailed(logical, obj, invoke);
            throw new KotlinNothingValueException();
        }
        boolean z2 = true;
        if (!z ? !((Boolean) obj).booleanValue() || !((Boolean) invoke).booleanValue() : !((Boolean) obj).booleanValue() && !((Boolean) invoke).booleanValue()) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }

    public <T> T eval(Evaluable evaluable) throws EvaluableException {
        try {
            return (T) evaluable.eval$div_evaluable(this);
        } catch (EvaluableException e) {
            throw e;
        } catch (Exception e2) {
            String message = e2.getMessage();
            if (message == null) {
                message = "";
            }
            throw new EvaluableException(message, e2);
        }
    }

    public Object evalBinary$div_evaluable(final Evaluable.Binary binary) {
        Object eval = eval(binary.getLeft());
        binary.updateIsCacheable$div_evaluable(binary.getLeft().checkIsCacheable());
        if (binary.getToken() instanceof Token.Operator.Binary.Logical) {
            return evalLogical((Token.Operator.Binary.Logical) binary.getToken(), eval, new gzs<Object>() { // from class: com.yandex.div.evaluable.Evaluator$evalBinary$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // xsna.gzs
                public final Object invoke() {
                    Object eval2 = Evaluator.this.eval(binary.getRight());
                    Evaluable.Binary binary2 = binary;
                    binary2.updateIsCacheable$div_evaluable(binary2.getRight().checkIsCacheable());
                    return eval2;
                }
            });
        }
        Object eval2 = eval(binary.getRight());
        binary.updateIsCacheable$div_evaluable(binary.getRight().checkIsCacheable());
        Pair<Object, Object> castArgumentsIfNeeded = castArgumentsIfNeeded(eval, eval2);
        Object d = castArgumentsIfNeeded.d();
        Object g = castArgumentsIfNeeded.g();
        if (!d.getClass().equals(g.getClass())) {
            EvaluableExceptionKt.throwExceptionOnEvaluationFailed(binary.getToken(), d, g);
            throw new KotlinNothingValueException();
        }
        Token.Operator.Binary token = binary.getToken();
        if (token instanceof Token.Operator.Binary.Equality) {
            return evalEquality((Token.Operator.Binary.Equality) binary.getToken(), d, g);
        }
        if (token instanceof Token.Operator.Binary.Sum) {
            return Companion.evalSum$div_evaluable((Token.Operator.Binary.Sum) binary.getToken(), d, g);
        }
        if (token instanceof Token.Operator.Binary.Factor) {
            return Companion.evalFactor$div_evaluable((Token.Operator.Binary.Factor) binary.getToken(), d, g);
        }
        if (token instanceof Token.Operator.Binary.Comparison) {
            return evalComparison((Token.Operator.Binary.Comparison) binary.getToken(), d, g);
        }
        EvaluableExceptionKt.throwExceptionOnEvaluationFailed(binary.getToken(), d, g);
        throw new KotlinNothingValueException();
    }

    public Object evalFunctionCall$div_evaluable(Evaluable.FunctionCall functionCall) {
        EvaluableType evaluableType;
        ArrayList arrayList = new ArrayList();
        for (Evaluable evaluable : functionCall.getArguments()) {
            arrayList.add(eval(evaluable));
            functionCall.updateIsCacheable$div_evaluable(evaluable.checkIsCacheable());
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        for (Object obj : arrayList) {
            EvaluableType.Companion companion = EvaluableType.Companion;
            if (obj instanceof Long) {
                evaluableType = EvaluableType.INTEGER;
            } else if (obj instanceof Double) {
                evaluableType = EvaluableType.NUMBER;
            } else if (obj instanceof Boolean) {
                evaluableType = EvaluableType.BOOLEAN;
            } else if (obj instanceof String) {
                evaluableType = EvaluableType.STRING;
            } else if (obj instanceof DateTime) {
                evaluableType = EvaluableType.DATETIME;
            } else if (obj instanceof Color) {
                evaluableType = EvaluableType.COLOR;
            } else if (obj instanceof Url) {
                evaluableType = EvaluableType.URL;
            } else if (obj instanceof JSONObject) {
                evaluableType = EvaluableType.DICT;
            } else {
                if (!(obj instanceof JSONArray)) {
                    if (obj == null) {
                        throw new EvaluableException("Unable to find type for null", null, 2, null);
                    }
                    throw new EvaluableException("Unable to find type for ".concat(obj.getClass().getName()), null, 2, null);
                }
                evaluableType = EvaluableType.ARRAY;
            }
            arrayList2.add(evaluableType);
        }
        try {
            Function function = getEvaluationContext().getFunctionProvider().get(functionCall.getToken().getName(), arrayList2);
            Evaluable m142constructorimpl = ExpressionContext.m142constructorimpl(functionCall);
            functionCall.updateIsCacheable$div_evaluable(function.isPure());
            try {
                return function.m143invokeex6DHhM(getEvaluationContext(), m142constructorimpl, castEvalArgumentsIfNeeded(function, arrayList));
            } catch (IntegerOverflow unused) {
                throw new IntegerOverflow(EvaluableExceptionKt.functionToMessageFormat(function.getName(), arrayList), null, 2, null);
            }
        } catch (EvaluableException e) {
            String name = functionCall.getToken().getName();
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            EvaluableExceptionKt.throwExceptionOnFunctionEvaluationFailed$default(name, arrayList, message, null, 8, null);
            throw new KotlinNothingValueException();
        }
    }

    public Object evalMethodCall$div_evaluable(Evaluable.MethodCall methodCall) {
        EvaluableType evaluableType;
        ArrayList arrayList = new ArrayList();
        for (Evaluable evaluable : methodCall.getArguments()) {
            arrayList.add(eval(evaluable));
            methodCall.updateIsCacheable$div_evaluable(evaluable.checkIsCacheable());
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        for (Object obj : arrayList) {
            EvaluableType.Companion companion = EvaluableType.Companion;
            if (obj instanceof Long) {
                evaluableType = EvaluableType.INTEGER;
            } else if (obj instanceof Double) {
                evaluableType = EvaluableType.NUMBER;
            } else if (obj instanceof Boolean) {
                evaluableType = EvaluableType.BOOLEAN;
            } else if (obj instanceof String) {
                evaluableType = EvaluableType.STRING;
            } else if (obj instanceof DateTime) {
                evaluableType = EvaluableType.DATETIME;
            } else if (obj instanceof Color) {
                evaluableType = EvaluableType.COLOR;
            } else if (obj instanceof Url) {
                evaluableType = EvaluableType.URL;
            } else if (obj instanceof JSONObject) {
                evaluableType = EvaluableType.DICT;
            } else {
                if (!(obj instanceof JSONArray)) {
                    if (obj == null) {
                        throw new EvaluableException("Unable to find type for null", null, 2, null);
                    }
                    throw new EvaluableException("Unable to find type for ".concat(obj.getClass().getName()), null, 2, null);
                }
                evaluableType = EvaluableType.ARRAY;
            }
            arrayList2.add(evaluableType);
        }
        try {
            Function method = getEvaluationContext().getFunctionProvider().getMethod(methodCall.getToken().getName(), arrayList2);
            Evaluable m142constructorimpl = ExpressionContext.m142constructorimpl(methodCall);
            methodCall.updateIsCacheable$div_evaluable(method.isPure());
            return method.m143invokeex6DHhM(getEvaluationContext(), m142constructorimpl, castEvalArgumentsIfNeeded(method, arrayList));
        } catch (EvaluableException e) {
            String name = methodCall.getToken().getName();
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            EvaluableExceptionKt.throwExceptionOnMethodEvaluationFailed(name, arrayList, message, e);
            throw new KotlinNothingValueException();
        }
    }

    public String evalStringTemplate$div_evaluable(Evaluable.StringTemplate stringTemplate) {
        ArrayList arrayList = new ArrayList();
        for (Evaluable evaluable : stringTemplate.getArguments()) {
            arrayList.add(eval(evaluable).toString());
            stringTemplate.updateIsCacheable$div_evaluable(evaluable.checkIsCacheable());
        }
        return j5g.g0(arrayList, "", null, null, 0, null, 62);
    }

    public Object evalTernary$div_evaluable(Evaluable.Ternary ternary) {
        if (!(ternary.getToken() instanceof Token.Operator.TernaryIfElse)) {
            EvaluableExceptionKt.throwExceptionOnEvaluationFailed$default(ternary.getRawExpr(), ternary.getToken() + " was incorrectly parsed as a ternary operator.", null, 4, null);
            throw new KotlinNothingValueException();
        }
        Object eval = eval(ternary.getFirstExpression());
        ternary.updateIsCacheable$div_evaluable(ternary.getFirstExpression().checkIsCacheable());
        if (eval instanceof Boolean) {
            if (((Boolean) eval).booleanValue()) {
                Object eval2 = eval(ternary.getSecondExpression());
                ternary.updateIsCacheable$div_evaluable(ternary.getSecondExpression().checkIsCacheable());
                return eval2;
            }
            Object eval3 = eval(ternary.getThirdExpression());
            ternary.updateIsCacheable$div_evaluable(ternary.getThirdExpression().checkIsCacheable());
            return eval3;
        }
        EvaluableExceptionKt.throwExceptionOnEvaluationFailed$default(ternary.getFirstExpression() + " ? " + ternary.getSecondExpression() + " : " + ternary.getThirdExpression(), "Ternary must be called with a Boolean value as a condition.", null, 4, null);
        throw new KotlinNothingValueException();
    }

    public Object evalTry$div_evaluable(Evaluable.Try r3) {
        Object failure;
        try {
            failure = eval(r3.getTryExpression());
            r3.updateIsCacheable$div_evaluable(r3.getTryExpression().checkIsCacheable());
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (Result.a(failure) == null) {
            return failure;
        }
        Object eval = eval(r3.getFallbackExpression());
        r3.updateIsCacheable$div_evaluable(r3.getFallbackExpression().checkIsCacheable());
        return eval;
    }

    public Object evalUnary$div_evaluable(Evaluable.Unary unary) {
        Object eval = eval(unary.getExpression());
        unary.updateIsCacheable$div_evaluable(unary.getExpression().checkIsCacheable());
        Token.Operator token = unary.getToken();
        if (token instanceof Token.Operator.Unary.Plus) {
            if (eval instanceof Long) {
                return Long.valueOf(((Number) eval).longValue());
            }
            if (eval instanceof Double) {
                return Double.valueOf(((Number) eval).doubleValue());
            }
            EvaluableExceptionKt.throwExceptionOnEvaluationFailed$default(cqi.c(eval, "+"), "A Number is expected after a unary plus.", null, 4, null);
            throw new KotlinNothingValueException();
        }
        if (token instanceof Token.Operator.Unary.Minus) {
            if (eval instanceof Long) {
                return Long.valueOf(-((Number) eval).longValue());
            }
            if (eval instanceof Double) {
                return Double.valueOf(-((Number) eval).doubleValue());
            }
            EvaluableExceptionKt.throwExceptionOnEvaluationFailed$default(cqi.c(eval, "-"), "A Number is expected after a unary minus.", null, 4, null);
            throw new KotlinNothingValueException();
        }
        if (!epx.f(token, Token.Operator.Unary.Not.INSTANCE)) {
            throw new EvaluableException(unary.getToken() + " was incorrectly parsed as a unary operator.", null, 2, null);
        }
        if (eval instanceof Boolean) {
            return Boolean.valueOf(!((Boolean) eval).booleanValue());
        }
        String str = eval instanceof String ? "'" : "";
        EvaluableExceptionKt.throwExceptionOnEvaluationFailed$default("!" + str + eval + str, "A Boolean is expected after a unary not.", null, 4, null);
        throw new KotlinNothingValueException();
    }

    public Object evalValue$div_evaluable(Evaluable.Value value) {
        Token.Operand.Literal token = value.getToken();
        if (token instanceof Token.Operand.Literal.Num) {
            return ((Token.Operand.Literal.Num) token).m167unboximpl();
        }
        if (token instanceof Token.Operand.Literal.Bool) {
            return Boolean.valueOf(((Token.Operand.Literal.Bool) token).m161unboximpl());
        }
        if (token instanceof Token.Operand.Literal.Str) {
            return ((Token.Operand.Literal.Str) token).m173unboximpl();
        }
        throw new NoWhenBranchMatchedException();
    }

    public Object evalVariable$div_evaluable(Evaluable.Variable variable) {
        Object obj = getEvaluationContext().getVariableProvider().get(variable.m141getTokenA4lXSVo());
        if (obj != null) {
            return obj;
        }
        throw new MissingVariableException(variable.m141getTokenA4lXSVo(), null, 2, null);
    }

    public EvaluationContext getEvaluationContext() {
        return this.evaluationContext;
    }
}
