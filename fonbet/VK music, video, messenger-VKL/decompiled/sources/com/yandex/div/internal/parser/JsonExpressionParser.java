package com.yandex.div.internal.parser;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.json.expressions.ConstantExpressionList;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.MutableExpressionList;
import com.yandex.div.serialization.ParsingContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.izs;

/* loaded from: classes7.dex */
public class JsonExpressionParser {
    private static final ExpressionList<?> EMPTY_EXPRESSION_LIST = new ConstantExpressionList(Collections.EMPTY_LIST);

    @NonNull
    private static <V> ExpressionList<V> emptyExpressionList() {
        return (ExpressionList<V>) EMPTY_EXPRESSION_LIST;
    }

    @Nullable
    private static <T> T optSafe(JSONObject jSONObject, String str) {
        T t = (T) jSONObject.opt(str);
        if (t == JSONObject.NULL) {
            return null;
        }
        return t;
    }

    @NonNull
    public static <V> Expression<V> readExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper) {
        return readExpression(parsingContext, jSONObject, str, typeHelper, JsonParsers.doNotConvert(), JsonParsers.alwaysValid());
    }

    @Nullable
    public static <V> Expression<V> readOptionalExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper) {
        return readOptionalExpression(parsingContext, jSONObject, str, typeHelper, JsonParsers.doNotConvert(), JsonParsers.alwaysValid(), null);
    }

    @Nullable
    public static <R, V> ExpressionList<V> readOptionalExpressionList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull izs<R, V> izsVar, @NonNull ListValidator<V> listValidator) {
        return readOptionalExpressionList(parsingContext, jSONObject, str, typeHelper, izsVar, listValidator, JsonParsers.alwaysValid());
    }

    public static <V> void writeExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @Nullable Expression<V> expression) {
        writeExpression(parsingContext, jSONObject, str, expression, JsonParsers.doNotConvert());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <R, V> void writeExpressionList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @Nullable ExpressionList<V> expressionList, @NonNull izs<V, R> izsVar) {
        if (expressionList == null) {
            return;
        }
        int i = 0;
        if (expressionList instanceof ConstantExpressionList) {
            List<V> evaluate = expressionList.evaluate(ExpressionResolver.EMPTY);
            int size = evaluate.size();
            JSONArray jSONArray = new JSONArray();
            while (i < size) {
                jSONArray.put(izsVar.invoke(evaluate.get(i)));
                i++;
            }
            try {
                jSONObject.put(str, jSONArray);
                return;
            } catch (JSONException e) {
                parsingContext.getLogger().logError(e);
                return;
            }
        }
        if (expressionList instanceof MutableExpressionList) {
            List expressionsInternal = ((MutableExpressionList) expressionList).getExpressionsInternal();
            if (expressionsInternal.isEmpty()) {
                return;
            }
            int size2 = expressionsInternal.size();
            JSONArray jSONArray2 = new JSONArray();
            while (i < size2) {
                Expression expression = (Expression) expressionsInternal.get(i);
                if (expression instanceof Expression.ConstantExpression) {
                    jSONArray2.put(izsVar.invoke(expression.evaluate(ExpressionResolver.EMPTY)));
                } else {
                    jSONArray2.put(expression.getRawValue());
                }
                i++;
            }
            try {
                jSONObject.put(str, jSONArray2);
            } catch (JSONException e2) {
                parsingContext.getLogger().logError(e2);
            }
        }
    }

    @NonNull
    public static <R, V> Expression<V> readExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull izs<R, V> izsVar) {
        return readExpression(parsingContext, jSONObject, str, typeHelper, izsVar, JsonParsers.alwaysValid());
    }

    @Nullable
    public static <R, V> Expression<V> readOptionalExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull izs<R, V> izsVar) {
        return readOptionalExpression(parsingContext, jSONObject, str, typeHelper, izsVar, JsonParsers.alwaysValid(), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static <R, V> ExpressionList<V> readOptionalExpressionList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull izs<R, V> izsVar, @NonNull ListValidator<V> listValidator, @NonNull ValueValidator<V> valueValidator) {
        V invoke;
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        int length = optJSONArray.length();
        if (length == 0) {
            List<? extends V> list = Collections.EMPTY_LIST;
            try {
                if (listValidator.isValid(list)) {
                    return emptyExpressionList();
                }
                parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, list));
                return emptyExpressionList();
            } catch (ClassCastException unused) {
                parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, list));
                return emptyExpressionList();
            }
        }
        ArrayList arrayList = new ArrayList(length);
        boolean z = false;
        ParsingErrorLogger parsingErrorLogger = null;
        for (int i = 0; i < length; i++) {
            Object optSafe = optSafe(optJSONArray, i);
            if (optSafe != null) {
                if (Expression.mayBeExpression(optSafe)) {
                    if (parsingErrorLogger == null) {
                        parsingErrorLogger = parsingContext.getLogger();
                    }
                    ParsingErrorLogger parsingErrorLogger2 = parsingErrorLogger;
                    arrayList.add(new Expression.MutableExpression(str + X3.j.d + i + X3.j.e, optSafe.toString(), izsVar, valueValidator, parsingErrorLogger2, typeHelper, null));
                    z = true;
                    parsingErrorLogger = parsingErrorLogger2;
                } else {
                    try {
                        invoke = izsVar.invoke(optSafe);
                    } catch (ClassCastException unused2) {
                        parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(optJSONArray, str, i, optSafe));
                    } catch (Exception e) {
                        parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(optJSONArray, str, i, optSafe, e));
                    }
                    if (invoke != null) {
                        if (typeHelper.isTypeValid(invoke)) {
                            try {
                                if (valueValidator.isValid(invoke)) {
                                    arrayList.add(invoke);
                                } else {
                                    try {
                                        parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(optJSONArray, str, i, invoke));
                                    } catch (ClassCastException unused3) {
                                        parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(optJSONArray, str, i, invoke));
                                    }
                                }
                            } catch (ClassCastException unused4) {
                            }
                        } else {
                            parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(optJSONArray, str, i, optSafe));
                        }
                    }
                }
            }
        }
        if (!z) {
            try {
                if (listValidator.isValid(arrayList)) {
                    return new ConstantExpressionList(arrayList);
                }
                parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, arrayList));
                return null;
            } catch (ClassCastException unused5) {
                parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, arrayList));
                return null;
            }
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            if (!(obj instanceof Expression)) {
                arrayList.set(i2, Expression.constant(obj, parsingContext.getLogger()));
            }
        }
        return new MutableExpressionList(str, arrayList, listValidator, parsingContext.getLogger());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <R, V> void writeExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @Nullable Expression<V> expression, @NonNull izs<V, R> izsVar) {
        if (expression == null) {
            return;
        }
        Object rawValue = expression.getRawValue();
        try {
            if (expression instanceof Expression.MutableExpression) {
                jSONObject.put(str, rawValue);
            } else {
                jSONObject.put(str, izsVar.invoke(rawValue));
            }
        } catch (JSONException e) {
            parsingContext.getLogger().logError(e);
        }
    }

    @Nullable
    private static <T> T optSafe(JSONArray jSONArray, int i) {
        T t = (T) jSONArray.opt(i);
        if (t == JSONObject.NULL) {
            return null;
        }
        return t;
    }

    @NonNull
    public static <V> Expression<V> readExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull ValueValidator<V> valueValidator) {
        return readExpression(parsingContext, jSONObject, str, typeHelper, JsonParsers.doNotConvert(), valueValidator);
    }

    @Nullable
    public static <R, V> Expression<V> readOptionalExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull izs<R, V> izsVar, @Nullable Expression<V> expression) {
        return readOptionalExpression(parsingContext, jSONObject, str, typeHelper, izsVar, JsonParsers.alwaysValid(), expression);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static <R, V> Expression<V> readExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull izs<R, V> izsVar, @NonNull ValueValidator<V> valueValidator) {
        Object optSafe = optSafe(jSONObject, str);
        if (optSafe != null) {
            if (Expression.mayBeExpression(optSafe)) {
                return new Expression.MutableExpression(str, optSafe.toString(), izsVar, valueValidator, parsingContext.getLogger(), typeHelper, null);
            }
            try {
                V invoke = izsVar.invoke(optSafe);
                if (invoke != null) {
                    if (typeHelper.isTypeValid(invoke)) {
                        try {
                            if (valueValidator.isValid(invoke)) {
                                return Expression.constant(invoke, parsingContext.getLogger());
                            }
                            throw ParsingExceptionKt.invalidValue(jSONObject, str, optSafe);
                        } catch (ClassCastException unused) {
                            throw ParsingExceptionKt.typeMismatch(jSONObject, str, optSafe);
                        }
                    }
                    throw ParsingExceptionKt.typeMismatch(jSONObject, str, optSafe);
                }
                throw ParsingExceptionKt.invalidValue(jSONObject, str, optSafe);
            } catch (ClassCastException unused2) {
                throw ParsingExceptionKt.typeMismatch(jSONObject, str, optSafe);
            } catch (Exception e) {
                throw ParsingExceptionKt.invalidValue(jSONObject, str, optSafe, e);
            }
        }
        throw ParsingExceptionKt.missingValue(jSONObject, str);
    }

    @Nullable
    public static <V> Expression<V> readOptionalExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull ValueValidator<V> valueValidator, @Nullable Expression<V> expression) {
        return readOptionalExpression(parsingContext, jSONObject, str, typeHelper, JsonParsers.doNotConvert(), valueValidator, expression);
    }

    @Nullable
    public static <R, V> Expression<V> readOptionalExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull izs<R, V> izsVar, @NonNull ValueValidator<V> valueValidator) {
        return readOptionalExpression(parsingContext, jSONObject, str, typeHelper, izsVar, valueValidator, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static <R, V> Expression<V> readOptionalExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull izs<R, V> izsVar, @NonNull ValueValidator<V> valueValidator, @Nullable Expression<V> expression) {
        Object optSafe = optSafe(jSONObject, str);
        if (optSafe == null) {
            return null;
        }
        if (Expression.mayBeExpression(optSafe)) {
            return new Expression.MutableExpression(str, optSafe.toString(), izsVar, valueValidator, parsingContext.getLogger(), typeHelper, expression);
        }
        try {
            V invoke = izsVar.invoke(optSafe);
            if (invoke == null) {
                parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, optSafe));
                return null;
            }
            if (!typeHelper.isTypeValid(invoke)) {
                parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, optSafe));
                return null;
            }
            try {
                if (!valueValidator.isValid(invoke)) {
                    parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, optSafe));
                    return null;
                }
                return Expression.constant(invoke, parsingContext.getLogger());
            } catch (ClassCastException unused) {
                parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, optSafe));
                return null;
            }
        } catch (ClassCastException unused2) {
            parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, optSafe));
            return null;
        } catch (Exception e) {
            parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, optSafe, e));
            return null;
        }
    }
}
