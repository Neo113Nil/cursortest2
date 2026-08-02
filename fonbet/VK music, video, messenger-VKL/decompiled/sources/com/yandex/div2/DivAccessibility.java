package com.yandex.div2;

import com.unity3d.ads.BuildConfig;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.e;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import xsna.epx;
import xsna.fpf0;
import xsna.izs;

/* compiled from: DivAccessibility.kt */
/* loaded from: classes8.dex */
public final class DivAccessibility implements JSONSerializable, Hashable {
    public static final Expression<Mode> i;
    public static final Expression<Boolean> j;
    public static final Type k;
    public final Expression<String> a;
    public final Expression<String> b;
    public final Expression<Boolean> c;
    public final Expression<Mode> d;
    public final Expression<Boolean> e;
    public final Expression<String> f;
    public final Type g;
    public Integer h;

    /* compiled from: DivAccessibility.kt */
    public enum Mode {
        DEFAULT(BuildConfig.FLAVOR),
        MERGE("merge"),
        EXCLUDE("exclude");

        private final String value;
        public static final c Converter = new c();
        public static final izs<Mode, String> TO_STRING = b.i;
        public static final izs<String, Mode> FROM_STRING = a.i;

        /* compiled from: DivAccessibility.kt */
        public static final class a extends Lambda implements izs<String, Mode> {
            public static final a i = new a(1);

            @Override // xsna.izs
            public final Mode invoke(String str) {
                String str2 = str;
                Mode.Converter.getClass();
                Mode mode = Mode.DEFAULT;
                if (epx.f(str2, mode.value)) {
                    return mode;
                }
                Mode mode2 = Mode.MERGE;
                if (epx.f(str2, mode2.value)) {
                    return mode2;
                }
                Mode mode3 = Mode.EXCLUDE;
                if (epx.f(str2, mode3.value)) {
                    return mode3;
                }
                return null;
            }
        }

        /* compiled from: DivAccessibility.kt */
        public static final class b extends Lambda implements izs<Mode, String> {
            public static final b i = new b(1);

            @Override // xsna.izs
            public final String invoke(Mode mode) {
                Mode.Converter.getClass();
                return mode.value;
            }
        }

        /* compiled from: DivAccessibility.kt */
        public static final class c {
        }

        Mode(String str) {
            this.value = str;
        }
    }

    /* compiled from: DivAccessibility.kt */
    public enum Type {
        NONE("none"),
        BUTTON("button"),
        IMAGE("image"),
        TEXT("text"),
        EDIT_TEXT("edit_text"),
        HEADER("header"),
        TAB_BAR("tab_bar"),
        LIST("list"),
        SELECT("select"),
        CHECKBOX("checkbox"),
        RADIO("radio"),
        AUTO("auto");

        private final String value;
        public static final c Converter = new c();
        public static final izs<Type, String> TO_STRING = b.i;
        public static final izs<String, Type> FROM_STRING = a.i;

        /* compiled from: DivAccessibility.kt */
        public static final class a extends Lambda implements izs<String, Type> {
            public static final a i = new a(1);

            @Override // xsna.izs
            public final Type invoke(String str) {
                String str2 = str;
                Type.Converter.getClass();
                Type type = Type.NONE;
                if (epx.f(str2, type.value)) {
                    return type;
                }
                Type type2 = Type.BUTTON;
                if (epx.f(str2, type2.value)) {
                    return type2;
                }
                Type type3 = Type.IMAGE;
                if (epx.f(str2, type3.value)) {
                    return type3;
                }
                Type type4 = Type.TEXT;
                if (epx.f(str2, type4.value)) {
                    return type4;
                }
                Type type5 = Type.EDIT_TEXT;
                if (epx.f(str2, type5.value)) {
                    return type5;
                }
                Type type6 = Type.HEADER;
                if (epx.f(str2, type6.value)) {
                    return type6;
                }
                Type type7 = Type.TAB_BAR;
                if (epx.f(str2, type7.value)) {
                    return type7;
                }
                Type type8 = Type.LIST;
                if (epx.f(str2, type8.value)) {
                    return type8;
                }
                Type type9 = Type.SELECT;
                if (epx.f(str2, type9.value)) {
                    return type9;
                }
                Type type10 = Type.CHECKBOX;
                if (epx.f(str2, type10.value)) {
                    return type10;
                }
                Type type11 = Type.RADIO;
                if (epx.f(str2, type11.value)) {
                    return type11;
                }
                Type type12 = Type.AUTO;
                if (epx.f(str2, type12.value)) {
                    return type12;
                }
                return null;
            }
        }

        /* compiled from: DivAccessibility.kt */
        public static final class b extends Lambda implements izs<Type, String> {
            public static final b i = new b(1);

            @Override // xsna.izs
            public final String invoke(Type type) {
                Type.Converter.getClass();
                return type.value;
            }
        }

        /* compiled from: DivAccessibility.kt */
        public static final class c {
        }

        Type(String str) {
            this.value = str;
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        i = Expression.Companion.constant$default(companion, Mode.DEFAULT, null, 2, null);
        j = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        k = Type.AUTO;
    }

    public DivAccessibility(Expression<String> expression, Expression<String> expression2, Expression<Boolean> expression3, Expression<Mode> expression4, Expression<Boolean> expression5, Expression<String> expression6, Type type) {
        this.a = expression;
        this.b = expression2;
        this.c = expression3;
        this.d = expression4;
        this.e = expression5;
        this.f = expression6;
        this.g = type;
    }

    public final boolean a(DivAccessibility divAccessibility, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divAccessibility == null) {
            return false;
        }
        Expression<String> expression = this.a;
        String evaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<String> expression2 = divAccessibility.a;
        if (epx.f(evaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null)) {
            Expression<String> expression3 = this.b;
            String evaluate2 = expression3 != null ? expression3.evaluate(expressionResolver) : null;
            Expression<String> expression4 = divAccessibility.b;
            if (epx.f(evaluate2, expression4 != null ? expression4.evaluate(expressionResolver2) : null)) {
                Expression<Boolean> expression5 = this.c;
                Boolean evaluate3 = expression5 != null ? expression5.evaluate(expressionResolver) : null;
                Expression<Boolean> expression6 = divAccessibility.c;
                if (epx.f(evaluate3, expression6 != null ? expression6.evaluate(expressionResolver2) : null) && this.d.evaluate(expressionResolver) == divAccessibility.d.evaluate(expressionResolver2) && this.e.evaluate(expressionResolver).booleanValue() == divAccessibility.e.evaluate(expressionResolver2).booleanValue()) {
                    Expression<String> expression7 = this.f;
                    String evaluate4 = expression7 != null ? expression7.evaluate(expressionResolver) : null;
                    Expression<String> expression8 = divAccessibility.f;
                    if (epx.f(evaluate4, expression8 != null ? expression8.evaluate(expressionResolver2) : null) && this.g == divAccessibility.g) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.h;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = fpf0.a(DivAccessibility.class).hashCode();
        Expression<String> expression = this.a;
        int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0);
        Expression<String> expression2 = this.b;
        int hashCode3 = hashCode2 + (expression2 != null ? expression2.hashCode() : 0);
        Expression<Boolean> expression3 = this.c;
        int hashCode4 = this.e.hashCode() + this.d.hashCode() + hashCode3 + (expression3 != null ? expression3.hashCode() : 0);
        Expression<String> expression4 = this.f;
        int hashCode5 = this.g.hashCode() + hashCode4 + (expression4 != null ? expression4.hashCode() : 0);
        this.h = Integer.valueOf(hashCode5);
        return hashCode5;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        e.b bVar = (e.b) BuiltInParserKt.getBuiltInParserComponent().H.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        bVar.getClass();
        return e.b.a(builtInParsingContext, this);
    }

    public DivAccessibility() {
        this(null, null, null, i, j, null, k);
    }
}
