package com.yandex.div2;

import android.net.Uri;
import com.huawei.hms.adapter.internal.CommonCode;
import com.yandex.div.data.Hashable;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.wd;
import org.json.JSONObject;
import xsna.fpf0;

/* compiled from: DivVideoSource.kt */
/* loaded from: classes8.dex */
public final class td implements JSONSerializable, Hashable {
    public final Expression<Long> a;
    public final Expression<String> b;
    public final a c;
    public final Expression<Uri> d;
    public Integer e;

    /* compiled from: DivVideoSource.kt */
    public static final class a implements JSONSerializable, Hashable {
        public final Expression<Long> a;
        public final Expression<Long> b;
        public Integer c;

        public a(Expression<Long> expression, Expression<Long> expression2) {
            this.a = expression;
            this.b = expression2;
        }

        @Override // com.yandex.div.data.Hashable
        public final int hash() {
            Integer num = this.c;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = this.b.hashCode() + this.a.hashCode() + fpf0.a(a.class).hashCode();
            this.c = Integer.valueOf(hashCode);
            return hashCode;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public final JSONObject writeToJSON() {
            wd.a aVar = (wd.a) BuiltInParserKt.getBuiltInParserComponent().n9.getValue();
            ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
            aVar.getClass();
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(builtInParsingContext, jSONObject, "height", this.a);
            JsonPropertyParser.write(builtInParsingContext, jSONObject, "type", CommonCode.MapKey.HAS_RESOLUTION);
            JsonExpressionParser.writeExpression(builtInParsingContext, jSONObject, "width", this.b);
            return jSONObject;
        }
    }

    public td(Expression<Long> expression, Expression<String> expression2, a aVar, Expression<Uri> expression3) {
        this.a = expression;
        this.b = expression2;
        this.c = aVar;
        this.d = expression3;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.e;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = fpf0.a(td.class).hashCode();
        Expression<Long> expression = this.a;
        int hashCode2 = this.b.hashCode() + hashCode + (expression != null ? expression.hashCode() : 0);
        a aVar = this.c;
        int hashCode3 = this.d.hashCode() + hashCode2 + (aVar != null ? aVar.hash() : 0);
        this.e = Integer.valueOf(hashCode3);
        return hashCode3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((ud) BuiltInParserKt.getBuiltInParserComponent().k9.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
