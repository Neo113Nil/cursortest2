package com.yandex.div.core.actions;

import android.net.Uri;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.data.Variable;
import com.yandex.div.evaluable.types.Color;
import com.yandex.div.internal.core.VariableMutationHandler;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.k0;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.izs;
import xsna.y57;

/* compiled from: DivActionTypedSetVariableHandler.kt */
/* loaded from: classes7.dex */
public final class DivActionTypedSetVariableHandler implements DivActionTypedHandler {
    private final void handleSetVariable(k0.p pVar, final Div2View div2View, ExpressionResolver expressionResolver) {
        final String evaluate = pVar.b.b.evaluate(expressionResolver);
        final Object evaluate2 = DivActionTypedUtilsKt.evaluate(pVar.b.a, expressionResolver);
        VariableMutationHandler.Companion.setVariable(div2View, evaluate, expressionResolver, new izs<Variable, Variable>() { // from class: com.yandex.div.core.actions.DivActionTypedSetVariableHandler$handleSetVariable$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public final Variable invoke(Variable variable) {
                Object obj = evaluate2;
                Div2View div2View2 = div2View;
                String str = evaluate;
                String str2 = "array";
                if (variable instanceof Variable.ArrayVariable) {
                    boolean z = obj instanceof JSONArray;
                    JSONArray jSONArray = (JSONArray) (z ? obj : null);
                    if (jSONArray == null) {
                        if (obj instanceof Integer ? true : obj instanceof Double) {
                            str2 = "number";
                        } else if (obj instanceof JSONObject) {
                            str2 = "dict";
                        } else if (!z) {
                            str2 = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                        }
                        DivActionTypedUtilsKt.logError(div2View2, new IllegalArgumentException(y57.a("Trying to set value with invalid type (", str2, ") to variable ", str)));
                    }
                    if (jSONArray != null) {
                        ((Variable.ArrayVariable) variable).set(jSONArray);
                        return variable;
                    }
                } else if (variable instanceof Variable.BooleanVariable) {
                    Boolean bool = (Boolean) (obj instanceof Boolean ? obj : null);
                    if (bool == null) {
                        if (obj instanceof Integer ? true : obj instanceof Double) {
                            str2 = "number";
                        } else if (obj instanceof JSONObject) {
                            str2 = "dict";
                        } else if (!(obj instanceof JSONArray)) {
                            str2 = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                        }
                        DivActionTypedUtilsKt.logError(div2View2, new IllegalArgumentException(y57.a("Trying to set value with invalid type (", str2, ") to variable ", str)));
                    }
                    if (bool != null) {
                        ((Variable.BooleanVariable) variable).set(bool.booleanValue());
                        return variable;
                    }
                } else if (variable instanceof Variable.ColorVariable) {
                    boolean z2 = obj instanceof Integer;
                    Integer num = (Integer) (z2 ? obj : null);
                    if (num == null) {
                        if (z2 ? true : obj instanceof Double) {
                            str2 = "number";
                        } else if (obj instanceof JSONObject) {
                            str2 = "dict";
                        } else if (!(obj instanceof JSONArray)) {
                            str2 = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                        }
                        DivActionTypedUtilsKt.logError(div2View2, new IllegalArgumentException(y57.a("Trying to set value with invalid type (", str2, ") to variable ", str)));
                    }
                    if (num != null) {
                        ((Variable.ColorVariable) variable).m139setcIhhviA(Color.m185constructorimpl(num.intValue()));
                        return variable;
                    }
                } else if (variable instanceof Variable.DictVariable) {
                    boolean z3 = obj instanceof JSONObject;
                    JSONObject jSONObject = (JSONObject) (z3 ? obj : null);
                    if (jSONObject == null) {
                        if (obj instanceof Integer ? true : obj instanceof Double) {
                            str2 = "number";
                        } else if (z3) {
                            str2 = "dict";
                        } else if (!(obj instanceof JSONArray)) {
                            str2 = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                        }
                        DivActionTypedUtilsKt.logError(div2View2, new IllegalArgumentException(y57.a("Trying to set value with invalid type (", str2, ") to variable ", str)));
                    }
                    if (jSONObject != null) {
                        ((Variable.DictVariable) variable).set(jSONObject);
                        return variable;
                    }
                } else if (variable instanceof Variable.DoubleVariable) {
                    boolean z4 = obj instanceof Double;
                    Double d = (Double) (z4 ? obj : null);
                    if (d == null) {
                        if (obj instanceof Integer ? true : z4) {
                            str2 = "number";
                        } else if (obj instanceof JSONObject) {
                            str2 = "dict";
                        } else if (!(obj instanceof JSONArray)) {
                            str2 = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                        }
                        DivActionTypedUtilsKt.logError(div2View2, new IllegalArgumentException(y57.a("Trying to set value with invalid type (", str2, ") to variable ", str)));
                    }
                    if (d != null) {
                        ((Variable.DoubleVariable) variable).set(d.doubleValue());
                        return variable;
                    }
                } else if (variable instanceof Variable.IntegerVariable) {
                    Long l = (Long) (obj instanceof Long ? obj : null);
                    if (l == null) {
                        if (obj instanceof Integer ? true : obj instanceof Double) {
                            str2 = "number";
                        } else if (obj instanceof JSONObject) {
                            str2 = "dict";
                        } else if (!(obj instanceof JSONArray)) {
                            str2 = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                        }
                        DivActionTypedUtilsKt.logError(div2View2, new IllegalArgumentException(y57.a("Trying to set value with invalid type (", str2, ") to variable ", str)));
                    }
                    if (l != null) {
                        ((Variable.IntegerVariable) variable).set(l.longValue());
                        return variable;
                    }
                } else if (variable instanceof Variable.StringVariable) {
                    String str3 = (String) (obj instanceof String ? obj : null);
                    if (str3 == null) {
                        if (obj instanceof Integer ? true : obj instanceof Double) {
                            str2 = "number";
                        } else if (obj instanceof JSONObject) {
                            str2 = "dict";
                        } else if (!(obj instanceof JSONArray)) {
                            str2 = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                        }
                        DivActionTypedUtilsKt.logError(div2View2, new IllegalArgumentException(y57.a("Trying to set value with invalid type (", str2, ") to variable ", str)));
                    }
                    if (str3 != null) {
                        variable.set(str3);
                        return variable;
                    }
                } else if (variable instanceof Variable.UrlVariable) {
                    Uri uri = (Uri) (obj instanceof Uri ? obj : null);
                    if (uri == null) {
                        if (obj instanceof Integer ? true : obj instanceof Double) {
                            str2 = "number";
                        } else if (obj instanceof JSONObject) {
                            str2 = "dict";
                        } else if (!(obj instanceof JSONArray)) {
                            str2 = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                        }
                        DivActionTypedUtilsKt.logError(div2View2, new IllegalArgumentException(y57.a("Trying to set value with invalid type (", str2, ") to variable ", str)));
                    }
                    if (uri != null) {
                        ((Variable.UrlVariable) variable).set(uri);
                    }
                }
                return variable;
            }
        });
    }

    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(String str, k0 k0Var, Div2View div2View, ExpressionResolver expressionResolver) {
        if (!(k0Var instanceof k0.p)) {
            return false;
        }
        handleSetVariable((k0.p) k0Var, div2View, expressionResolver);
        return true;
    }
}
