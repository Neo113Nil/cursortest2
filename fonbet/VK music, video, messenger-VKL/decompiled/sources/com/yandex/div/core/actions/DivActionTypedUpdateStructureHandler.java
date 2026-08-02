package com.yandex.div.core.actions;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.data.Variable;
import com.yandex.div.internal.core.VariableMutationHandler;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.k0;
import com.yandex.div2.p0;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.drm0;
import xsna.e43;
import xsna.epx;
import xsna.izs;
import xsna.j5g;
import xsna.zr;

/* compiled from: DivActionTypedUpdateStructureHandler.kt */
/* loaded from: classes7.dex */
public final class DivActionTypedUpdateStructureHandler implements DivActionTypedHandler {

    /* compiled from: DivActionTypedUpdateStructureHandler.kt */
    public interface Structure {

        /* compiled from: DivActionTypedUpdateStructureHandler.kt */
        public static final class Array implements Structure {
            private final JSONArray array;

            public Array(JSONArray jSONArray) {
                this.array = jSONArray;
            }

            @Override // com.yandex.div.core.actions.DivActionTypedUpdateStructureHandler.Structure
            public Structure get(String str) {
                Object opt = this.array.opt(Integer.parseInt(str));
                if (opt instanceof JSONArray) {
                    return new Array((JSONArray) opt);
                }
                if (opt instanceof JSONObject) {
                    return new Dictionary((JSONObject) opt);
                }
                if (opt == null ? true : opt.equals(JSONObject.NULL)) {
                    return null;
                }
                return NonStructure.INSTANCE;
            }

            public int getSize() {
                return this.array.length();
            }

            @Override // com.yandex.div.core.actions.DivActionTypedUpdateStructureHandler.Structure
            public void set(String str, Object obj) {
                int parseInt = Integer.parseInt(str);
                if (parseInt < 0 || parseInt > getSize()) {
                    throw new IndexOutOfBoundsException();
                }
                try {
                    this.array.put(parseInt, obj);
                } catch (Throwable unused) {
                }
            }
        }

        /* compiled from: DivActionTypedUpdateStructureHandler.kt */
        public static final class Dictionary implements Structure {
            private final JSONObject dictionary;

            public Dictionary(JSONObject jSONObject) {
                this.dictionary = jSONObject;
            }

            @Override // com.yandex.div.core.actions.DivActionTypedUpdateStructureHandler.Structure
            public Structure get(String str) {
                Object opt = this.dictionary.opt(str);
                if (opt instanceof JSONArray) {
                    return new Array((JSONArray) opt);
                }
                if (opt instanceof JSONObject) {
                    return new Dictionary((JSONObject) opt);
                }
                if (opt == null ? true : opt.equals(JSONObject.NULL)) {
                    return null;
                }
                return NonStructure.INSTANCE;
            }

            @Override // com.yandex.div.core.actions.DivActionTypedUpdateStructureHandler.Structure
            public void set(String str, Object obj) {
                try {
                    this.dictionary.put(str, obj);
                } catch (Throwable unused) {
                }
            }
        }

        /* compiled from: DivActionTypedUpdateStructureHandler.kt */
        public static final class NonStructure implements Structure {
            public static final NonStructure INSTANCE = new NonStructure();

            private NonStructure() {
            }

            @Override // com.yandex.div.core.actions.DivActionTypedUpdateStructureHandler.Structure
            public Structure get(String str) {
                throw new UnsupportedOperationException();
            }

            @Override // com.yandex.div.core.actions.DivActionTypedUpdateStructureHandler.Structure
            public void set(String str, Object obj) {
                throw new UnsupportedOperationException();
            }
        }

        Structure get(String str);

        void set(String str, Object obj);
    }

    private final Structure findStructureElement(Div2View div2View, Structure structure, List<String> list) {
        int i = 0;
        Structure structure2 = structure;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            String str = (String) obj;
            try {
                structure2 = structure2.get(str);
                if (epx.f(structure2, Structure.NonStructure.INSTANCE)) {
                    DivActionTypedUtilsKt.logError(div2View, new RuntimeException("Element with path '" + j5g.g0(j5g.H0(list, i2), DomExceptionUtils.SEPARATOR, null, null, 0, null, 62) + "' is not a structure"));
                    return null;
                }
                if (structure2 == null) {
                    DivActionTypedUtilsKt.logError(div2View, new RuntimeException("Element with path '" + j5g.g0(j5g.H0(list, i2), DomExceptionUtils.SEPARATOR, null, null, 0, null, 62) + "' is not found"));
                    return null;
                }
                i = i2;
            } catch (NumberFormatException e) {
                DivActionTypedUtilsKt.logError(div2View, new RuntimeException(zr.a("Unable to use '", str, "' as array index"), e));
                return null;
            }
        }
        return structure2;
    }

    private final boolean setValue(Div2View div2View, Structure structure, String str, Object obj) {
        try {
            structure.set(str, obj);
            return true;
        } catch (IndexOutOfBoundsException e) {
            DivActionTypedUtilsKt.logError(div2View, new RuntimeException(zr.a("Position '", str, "' is out of array bounds"), e));
            return false;
        } catch (NumberFormatException e2) {
            DivActionTypedUtilsKt.logError(div2View, new RuntimeException(zr.a("Unable to use '", str, "' as array index"), e2));
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateArrayStructure(Div2View div2View, Variable.ArrayVariable arrayVariable, List<String> list, Object obj) {
        JSONArray jSONArray = (JSONArray) arrayVariable.getValue();
        Structure findStructureElement = findStructureElement(div2View, new Structure.Array(jSONArray), j5g.T(1, list));
        if (findStructureElement == null || !setValue(div2View, findStructureElement, (String) j5g.i0(list), obj)) {
            return;
        }
        arrayVariable.set(jSONArray);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateDictStructure(Div2View div2View, Variable.DictVariable dictVariable, List<String> list, Object obj) {
        JSONObject jSONObject = (JSONObject) dictVariable.getValue();
        Structure findStructureElement = findStructureElement(div2View, new Structure.Dictionary(jSONObject), j5g.T(1, list));
        if (findStructureElement == null || !setValue(div2View, findStructureElement, (String) j5g.i0(list), obj)) {
            return;
        }
        dictVariable.set(jSONObject);
    }

    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(String str, k0 k0Var, Div2View div2View, ExpressionResolver expressionResolver) {
        if (k0Var instanceof k0.t) {
            return handleAction(((k0.t) k0Var).b, div2View, expressionResolver);
        }
        return false;
    }

    private final boolean handleAction(p0 p0Var, final Div2View div2View, ExpressionResolver expressionResolver) {
        String evaluate = p0Var.c.evaluate(expressionResolver);
        String evaluate2 = p0Var.a.evaluate(expressionResolver);
        List c0 = drm0.c0(evaluate2, new String[]{DomExceptionUtils.SEPARATOR}, 0, 6);
        final ArrayList arrayList = new ArrayList();
        for (Object obj : c0) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        final Object evaluate3 = DivActionTypedUtilsKt.evaluate(p0Var.b, expressionResolver);
        if (evaluate2.length() > 0 && arrayList.isEmpty()) {
            DivActionTypedUtilsKt.logError(div2View, new RuntimeException(zr.a("Malformed path '", evaluate2, "': all path segments are empty")));
            return true;
        }
        VariableMutationHandler.Companion.setVariable(div2View, evaluate, expressionResolver, new izs<Variable, Variable>() { // from class: com.yandex.div.core.actions.DivActionTypedUpdateStructureHandler$handleAction$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public final Variable invoke(Variable variable) {
                if (variable instanceof Variable.ArrayVariable) {
                    DivActionTypedUpdateStructureHandler.this.updateArrayStructure(div2View, (Variable.ArrayVariable) variable, arrayList, evaluate3);
                    return variable;
                }
                if (variable instanceof Variable.DictVariable) {
                    DivActionTypedUpdateStructureHandler.this.updateDictStructure(div2View, (Variable.DictVariable) variable, arrayList, evaluate3);
                    return variable;
                }
                DivActionTypedUtilsKt.logError(div2View, new RuntimeException("Action requires array or dictionary variable"));
                return variable;
            }
        });
        return true;
    }
}
