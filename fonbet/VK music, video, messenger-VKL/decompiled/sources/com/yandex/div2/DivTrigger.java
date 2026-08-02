package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.kd;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import xsna.e43;
import xsna.epx;
import xsna.fpf0;
import xsna.izs;

/* compiled from: DivTrigger.kt */
/* loaded from: classes8.dex */
public final class DivTrigger implements JSONSerializable, Hashable {
    public final List<DivAction> a;
    public final Expression<Boolean> b;
    public final Expression<Mode> c;
    public Integer d;

    /* compiled from: DivTrigger.kt */
    public enum Mode {
        ON_CONDITION("on_condition"),
        ON_VARIABLE("on_variable");

        private final String value;
        public static final c Converter = new c();
        public static final izs<Mode, String> TO_STRING = b.i;
        public static final izs<String, Mode> FROM_STRING = a.i;

        /* compiled from: DivTrigger.kt */
        public static final class a extends Lambda implements izs<String, Mode> {
            public static final a i = new a(1);

            @Override // xsna.izs
            public final Mode invoke(String str) {
                String str2 = str;
                Mode.Converter.getClass();
                Mode mode = Mode.ON_CONDITION;
                if (epx.f(str2, mode.value)) {
                    return mode;
                }
                Mode mode2 = Mode.ON_VARIABLE;
                if (epx.f(str2, mode2.value)) {
                    return mode2;
                }
                return null;
            }
        }

        /* compiled from: DivTrigger.kt */
        public static final class b extends Lambda implements izs<Mode, String> {
            public static final b i = new b(1);

            @Override // xsna.izs
            public final String invoke(Mode mode) {
                Mode.Converter.getClass();
                return mode.value;
            }
        }

        /* compiled from: DivTrigger.kt */
        public static final class c {
        }

        Mode(String str) {
            this.value = str;
        }
    }

    static {
        Expression.Companion.constant$default(Expression.Companion, Mode.ON_CONDITION, null, 2, null);
    }

    public DivTrigger(List<DivAction> list, Expression<Boolean> expression, Expression<Mode> expression2) {
        this.a = list;
        this.b = expression;
        this.c = expression2;
    }

    public final boolean a(DivTrigger divTrigger, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divTrigger == null) {
            return false;
        }
        List<DivAction> list = divTrigger.a;
        List<DivAction> list2 = this.a;
        if (list2.size() == list.size()) {
            Iterator<T> it = list2.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    if (this.b.evaluate(expressionResolver).booleanValue() != divTrigger.b.evaluate(expressionResolver2).booleanValue() || this.c.evaluate(expressionResolver) != divTrigger.c.evaluate(expressionResolver2)) {
                        break;
                    }
                    return true;
                }
                Object next = it.next();
                int i2 = i + 1;
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                if (!((DivAction) next).a(list.get(i), expressionResolver, expressionResolver2)) {
                    break;
                }
                i = i2;
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.d;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = fpf0.a(DivTrigger.class).hashCode();
        Iterator<T> it = this.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((DivAction) it.next()).hash();
        }
        int hashCode2 = this.c.hashCode() + this.b.hashCode() + hashCode + i;
        this.d = Integer.valueOf(hashCode2);
        return hashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((kd.b) BuiltInParserKt.getBuiltInParserComponent().b9.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
