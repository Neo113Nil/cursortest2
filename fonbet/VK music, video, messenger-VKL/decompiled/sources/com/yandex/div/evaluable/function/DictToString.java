package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Pair;
import org.json.JSONObject;
import xsna.g5g;
import xsna.ho8;
import xsna.j5g;
import xsna.on00;

/* compiled from: ToString.kt */
/* loaded from: classes7.dex */
public final class DictToString extends Function {
    private static final boolean isPure = false;
    public static final DictToString INSTANCE = new DictToString();
    private static final String name = "toString";
    private static final List<FunctionArgument> declaredArgs = Collections.singletonList(new FunctionArgument(EvaluableType.DICT, false, 2, null));
    private static final EvaluableType resultType = EvaluableType.STRING;

    private DictToString() {
    }

    private final Map<String, Object> sort(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            arrayList.add(keys.next());
        }
        g5g.K(arrayList);
        TreeMap g = on00.g(new Pair[0]);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object obj = jSONObject.get(str);
            if (obj instanceof JSONObject) {
                obj = INSTANCE.sort((JSONObject) obj);
            }
            g.put(str, obj);
        }
        return g;
    }

    private final String toStringLikeJson(Object obj) {
        if (!(obj instanceof Map)) {
            if (!(obj instanceof String)) {
                return obj.toString();
            }
            return "\"" + obj + '\"';
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            StringBuilder sb = new StringBuilder("\"");
            sb.append(entry.getKey());
            sb.append("\":");
            Object value = entry.getValue();
            sb.append(value != null ? INSTANCE.toStringLikeJson(value) : null);
            arrayList.add(sb.toString());
        }
        return ho8.a(new StringBuilder("{"), j5g.g0(arrayList, StringUtils.COMMA, null, null, 0, null, 62), '}');
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        return toStringLikeJson(sort((JSONObject) j5g.Y(list)));
    }

    @Override // com.yandex.div.evaluable.Function
    public List<FunctionArgument> getDeclaredArgs() {
        return declaredArgs;
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }

    @Override // com.yandex.div.evaluable.Function
    public EvaluableType getResultType() {
        return resultType;
    }

    @Override // com.yandex.div.evaluable.Function
    public boolean isPure() {
        return isPure;
    }
}
