package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.v8;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import xsna.epx;
import xsna.fpf0;
import xsna.izs;

/* compiled from: DivRadialGradientRelativeRadius.kt */
/* loaded from: classes8.dex */
public final class DivRadialGradientRelativeRadius implements JSONSerializable, Hashable {
    public final Expression<Value> a;
    public Integer b;

    /* compiled from: DivRadialGradientRelativeRadius.kt */
    public enum Value {
        NEAREST_CORNER("nearest_corner"),
        FARTHEST_CORNER("farthest_corner"),
        NEAREST_SIDE("nearest_side"),
        FARTHEST_SIDE("farthest_side");

        private final String value;
        public static final c Converter = new c();
        public static final izs<Value, String> TO_STRING = b.i;
        public static final izs<String, Value> FROM_STRING = a.i;

        /* compiled from: DivRadialGradientRelativeRadius.kt */
        public static final class a extends Lambda implements izs<String, Value> {
            public static final a i = new a(1);

            @Override // xsna.izs
            public final Value invoke(String str) {
                String str2 = str;
                Value.Converter.getClass();
                Value value = Value.NEAREST_CORNER;
                if (epx.f(str2, value.value)) {
                    return value;
                }
                Value value2 = Value.FARTHEST_CORNER;
                if (epx.f(str2, value2.value)) {
                    return value2;
                }
                Value value3 = Value.NEAREST_SIDE;
                if (epx.f(str2, value3.value)) {
                    return value3;
                }
                Value value4 = Value.FARTHEST_SIDE;
                if (epx.f(str2, value4.value)) {
                    return value4;
                }
                return null;
            }
        }

        /* compiled from: DivRadialGradientRelativeRadius.kt */
        public static final class b extends Lambda implements izs<Value, String> {
            public static final b i = new b(1);

            @Override // xsna.izs
            public final String invoke(Value value) {
                Value.Converter.getClass();
                return value.value;
            }
        }

        /* compiled from: DivRadialGradientRelativeRadius.kt */
        public static final class c {
        }

        Value(String str) {
            this.value = str;
        }
    }

    public DivRadialGradientRelativeRadius(Expression<Value> expression) {
        this.a = expression;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.a.hashCode() + fpf0.a(DivRadialGradientRelativeRadius.class).hashCode();
        this.b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        v8.b bVar = (v8.b) BuiltInParserKt.getBuiltInParserComponent().l6.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        bVar.getClass();
        return v8.b.a(builtInParsingContext, this);
    }
}
