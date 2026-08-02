package com.yandex.div2;

import com.huawei.hms.framework.common.BundleUtil;
import com.yandex.div.data.Hashable;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.n4;
import com.yandex.div2.o4;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import xsna.fpf0;
import xsna.qmn;

/* compiled from: DivFixedLengthInputMask.kt */
/* loaded from: classes8.dex */
public final class m4 implements JSONSerializable, Hashable, qmn {
    public final Expression<Boolean> a;
    public final Expression<String> b;
    public final List<a> c;
    public final String d;
    public Integer e;

    /* compiled from: DivFixedLengthInputMask.kt */
    public static final class a implements JSONSerializable, Hashable {
        public final Expression<String> a;
        public final Expression<String> b;
        public final Expression<String> c;
        public Integer d;

        static {
            Expression.Companion.constant$default(Expression.Companion, BundleUtil.UNDERLINE_TAG, null, 2, null);
        }

        public a(Expression<String> expression, Expression<String> expression2, Expression<String> expression3) {
            this.a = expression;
            this.b = expression2;
            this.c = expression3;
        }

        @Override // com.yandex.div.data.Hashable
        public final int hash() {
            Integer num = this.d;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = this.b.hashCode() + this.a.hashCode() + fpf0.a(a.class).hashCode();
            Expression<String> expression = this.c;
            int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0);
            this.d = Integer.valueOf(hashCode2);
            return hashCode2;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public final JSONObject writeToJSON() {
            o4.a aVar = (o4.a) BuiltInParserKt.getBuiltInParserComponent().t3.getValue();
            ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
            aVar.getClass();
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(builtInParsingContext, jSONObject, "key", this.a);
            JsonExpressionParser.writeExpression(builtInParsingContext, jSONObject, "placeholder", this.b);
            JsonExpressionParser.writeExpression(builtInParsingContext, jSONObject, "regex", this.c);
            return jSONObject;
        }
    }

    static {
        Expression.Companion.constant$default(Expression.Companion, Boolean.FALSE, null, 2, null);
    }

    public m4(Expression<Boolean> expression, Expression<String> expression2, List<a> list, String str) {
        this.a = expression;
        this.b = expression2;
        this.c = list;
        this.d = str;
    }

    @Override // xsna.qmn
    public final String a() {
        return this.d;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.e;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.b.hashCode() + this.a.hashCode() + fpf0.a(m4.class).hashCode();
        Iterator<T> it = this.c.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((a) it.next()).hash();
        }
        int hashCode2 = this.d.hashCode() + hashCode + i;
        this.e = Integer.valueOf(hashCode2);
        return hashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((n4.a) BuiltInParserKt.getBuiltInParserComponent().q3.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
