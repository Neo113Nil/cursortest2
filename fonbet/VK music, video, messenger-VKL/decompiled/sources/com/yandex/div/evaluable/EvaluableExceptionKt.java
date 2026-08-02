package com.yandex.div.evaluable;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.internal.Token;
import com.yandex.div.evaluable.types.Color;
import com.yandex.div.evaluable.types.DateTime;
import com.yandex.div.evaluable.types.Url;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.jsonwebtoken.JwtParser;
import java.util.List;
import kotlin.KotlinNothingValueException;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.izs;
import xsna.j5g;
import xsna.y57;

/* compiled from: EvaluableException.kt */
/* loaded from: classes7.dex */
public final class EvaluableExceptionKt {
    public static final String functionToMessageFormat(String str, List<? extends Object> list) {
        return j5g.g0(list, null, str.concat("("), ")", 0, new izs<Object, CharSequence>() { // from class: com.yandex.div.evaluable.EvaluableExceptionKt$functionToMessageFormat$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // xsna.izs
            public final CharSequence invoke(Object obj) {
                return EvaluableExceptionKt.toMessageFormat(obj);
            }
        }, 25);
    }

    public static final String methodToMessageFormat(String str, List<? extends Object> list) {
        if (list.size() <= 1) {
            return str.concat("()");
        }
        return j5g.g0(list.subList(1, list.size()), StringUtils.COMMA, str.concat("("), ")", 0, null, 56);
    }

    public static final Void throwExceptionOnEvaluationFailed(String str, String str2, Exception exc) {
        throw new EvaluableException(y57.a("Failed to evaluate [", str, "]. ", str2), exc);
    }

    public static /* synthetic */ Void throwExceptionOnEvaluationFailed$default(String str, String str2, Exception exc, int i, Object obj) {
        if ((i & 4) != 0) {
            exc = null;
        }
        return throwExceptionOnEvaluationFailed(str, str2, exc);
    }

    public static final Void throwExceptionOnFunctionEvaluationFailed(String str, List<? extends Object> list, String str2, Exception exc) {
        throwExceptionOnEvaluationFailed(functionToMessageFormat(str, list), str2, exc);
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ Void throwExceptionOnFunctionEvaluationFailed$default(String str, List list, String str2, Exception exc, int i, Object obj) {
        if ((i & 8) != 0) {
            exc = null;
        }
        return throwExceptionOnFunctionEvaluationFailed(str, list, str2, exc);
    }

    public static final Void throwExceptionOnMethodEvaluationFailed(String str, List<? extends Object> list, String str2, Exception exc) {
        throwExceptionOnEvaluationFailed(methodToMessageFormat(str, list), str2, exc);
        throw new KotlinNothingValueException();
    }

    public static final String toMessageFormat(List<? extends Object> list) {
        return j5g.g0(list, ", ", null, null, 0, new izs<Object, CharSequence>() { // from class: com.yandex.div.evaluable.EvaluableExceptionKt$toMessageFormat$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // xsna.izs
            public final CharSequence invoke(Object obj) {
                return EvaluableExceptionKt.toMessageFormat(obj);
            }
        }, 30);
    }

    public static final String toMessageFormat(Object obj) {
        if (obj instanceof JSONArray) {
            return "<array>";
        }
        if (obj instanceof JSONObject) {
            return "<dict>";
        }
        if (!(obj instanceof String)) {
            return obj.toString();
        }
        return "'" + obj + '\'';
    }

    public static final Void throwExceptionOnEvaluationFailed(Token.Operator.Binary binary, Object obj, Object obj2) {
        EvaluableType evaluableType;
        String sb;
        EvaluableType evaluableType2;
        EvaluableType evaluableType3;
        String str = toMessageFormat(obj) + ' ' + binary + ' ' + toMessageFormat(obj2);
        if (!obj.getClass().equals(obj2.getClass())) {
            StringBuilder sb2 = new StringBuilder("different types: ");
            EvaluableType.Companion companion = EvaluableType.Companion;
            if (obj instanceof Long) {
                evaluableType2 = EvaluableType.INTEGER;
            } else if (obj instanceof Double) {
                evaluableType2 = EvaluableType.NUMBER;
            } else if (obj instanceof Boolean) {
                evaluableType2 = EvaluableType.BOOLEAN;
            } else if (obj instanceof String) {
                evaluableType2 = EvaluableType.STRING;
            } else if (obj instanceof DateTime) {
                evaluableType2 = EvaluableType.DATETIME;
            } else if (obj instanceof Color) {
                evaluableType2 = EvaluableType.COLOR;
            } else if (obj instanceof Url) {
                evaluableType2 = EvaluableType.URL;
            } else if (obj instanceof JSONObject) {
                evaluableType2 = EvaluableType.DICT;
            } else {
                if (!(obj instanceof JSONArray)) {
                    throw new EvaluableException("Unable to find type for ".concat(obj.getClass().getName()), null, 2, null);
                }
                evaluableType2 = EvaluableType.ARRAY;
            }
            sb2.append(evaluableType2.getTypeName$div_evaluable());
            sb2.append(" and ");
            if (!(obj2 instanceof Long)) {
                if (!(obj2 instanceof Double)) {
                    if (!(obj2 instanceof Boolean)) {
                        if (!(obj2 instanceof String)) {
                            if (!(obj2 instanceof DateTime)) {
                                if (!(obj2 instanceof Color)) {
                                    if (!(obj2 instanceof Url)) {
                                        if (!(obj2 instanceof JSONObject)) {
                                            if (!(obj2 instanceof JSONArray)) {
                                                throw new EvaluableException("Unable to find type for ".concat(obj2.getClass().getName()), null, 2, null);
                                            }
                                            evaluableType3 = EvaluableType.ARRAY;
                                        } else {
                                            evaluableType3 = EvaluableType.DICT;
                                        }
                                    } else {
                                        evaluableType3 = EvaluableType.URL;
                                    }
                                } else {
                                    evaluableType3 = EvaluableType.COLOR;
                                }
                            } else {
                                evaluableType3 = EvaluableType.DATETIME;
                            }
                        } else {
                            evaluableType3 = EvaluableType.STRING;
                        }
                    } else {
                        evaluableType3 = EvaluableType.BOOLEAN;
                    }
                } else {
                    evaluableType3 = EvaluableType.NUMBER;
                }
            } else {
                evaluableType3 = EvaluableType.INTEGER;
            }
            sb2.append(evaluableType3.getTypeName$div_evaluable());
            sb = sb2.toString();
        } else {
            StringBuilder sb3 = new StringBuilder();
            EvaluableType.Companion companion2 = EvaluableType.Companion;
            if (!(obj instanceof Long)) {
                if (!(obj instanceof Double)) {
                    if (!(obj instanceof Boolean)) {
                        if (!(obj instanceof String)) {
                            if (!(obj instanceof DateTime)) {
                                if (!(obj instanceof Color)) {
                                    if (!(obj instanceof Url)) {
                                        if (!(obj instanceof JSONObject)) {
                                            if (!(obj instanceof JSONArray)) {
                                                throw new EvaluableException("Unable to find type for ".concat(obj.getClass().getName()), null, 2, null);
                                            }
                                            evaluableType = EvaluableType.ARRAY;
                                        } else {
                                            evaluableType = EvaluableType.DICT;
                                        }
                                    } else {
                                        evaluableType = EvaluableType.URL;
                                    }
                                } else {
                                    evaluableType = EvaluableType.COLOR;
                                }
                            } else {
                                evaluableType = EvaluableType.DATETIME;
                            }
                        } else {
                            evaluableType = EvaluableType.STRING;
                        }
                    } else {
                        evaluableType = EvaluableType.BOOLEAN;
                    }
                } else {
                    evaluableType = EvaluableType.NUMBER;
                }
            } else {
                evaluableType = EvaluableType.INTEGER;
            }
            sb3.append(evaluableType.getTypeName$div_evaluable());
            sb3.append(" type");
            sb = sb3.toString();
        }
        throwExceptionOnEvaluationFailed$default(str, "Operator '" + binary + "' cannot be applied to " + sb + JwtParser.SEPARATOR_CHAR, null, 4, null);
        throw new KotlinNothingValueException();
    }
}
