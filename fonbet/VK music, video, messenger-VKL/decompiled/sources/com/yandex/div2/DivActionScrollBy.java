package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.n;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import xsna.epx;
import xsna.fpf0;
import xsna.izs;

/* compiled from: DivActionScrollBy.kt */
/* loaded from: classes8.dex */
public final class DivActionScrollBy implements JSONSerializable, Hashable {
    public final Expression<Boolean> a;
    public final Expression<String> b;
    public final Expression<Long> c;
    public final Expression<Long> d;
    public final Expression<Overflow> e;
    public Integer f;

    /* compiled from: DivActionScrollBy.kt */
    public enum Overflow {
        CLAMP("clamp"),
        RING("ring");

        private final String value;
        public static final c Converter = new c();
        public static final izs<Overflow, String> TO_STRING = b.i;
        public static final izs<String, Overflow> FROM_STRING = a.i;

        /* compiled from: DivActionScrollBy.kt */
        public static final class a extends Lambda implements izs<String, Overflow> {
            public static final a i = new a(1);

            @Override // xsna.izs
            public final Overflow invoke(String str) {
                String str2 = str;
                Overflow.Converter.getClass();
                Overflow overflow = Overflow.CLAMP;
                if (epx.f(str2, overflow.value)) {
                    return overflow;
                }
                Overflow overflow2 = Overflow.RING;
                if (epx.f(str2, overflow2.value)) {
                    return overflow2;
                }
                return null;
            }
        }

        /* compiled from: DivActionScrollBy.kt */
        public static final class b extends Lambda implements izs<Overflow, String> {
            public static final b i = new b(1);

            @Override // xsna.izs
            public final String invoke(Overflow overflow) {
                Overflow.Converter.getClass();
                return overflow.value;
            }
        }

        /* compiled from: DivActionScrollBy.kt */
        public static final class c {
        }

        Overflow(String str) {
            this.value = str;
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        Expression.Companion.constant$default(companion, 0L, null, 2, null);
        Expression.Companion.constant$default(companion, 0L, null, 2, null);
        Expression.Companion.constant$default(companion, Overflow.CLAMP, null, 2, null);
    }

    public DivActionScrollBy(Expression<Boolean> expression, Expression<String> expression2, Expression<Long> expression3, Expression<Long> expression4, Expression<Overflow> expression5) {
        this.a = expression;
        this.b = expression2;
        this.c = expression3;
        this.d = expression4;
        this.e = expression5;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.f;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.e.hashCode() + this.d.hashCode() + this.c.hashCode() + this.b.hashCode() + this.a.hashCode() + fpf0.a(DivActionScrollBy.class).hashCode();
        this.f = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        n.b bVar = (n.b) BuiltInParserKt.getBuiltInParserComponent().u0.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        bVar.getClass();
        return n.b.b(builtInParsingContext, this);
    }
}
