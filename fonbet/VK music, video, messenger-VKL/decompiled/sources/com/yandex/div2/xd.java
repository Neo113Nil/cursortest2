package com.yandex.div2;

import android.net.Uri;
import com.huawei.hms.adapter.internal.CommonCode;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.td;
import com.yandex.div2.wd;
import org.json.JSONObject;
import xsna.pqn;

/* compiled from: DivVideoSourceTemplate.kt */
/* loaded from: classes8.dex */
public final class xd implements JSONSerializable, JsonTemplate<td> {
    public final Field<Expression<Long>> a;
    public final Field<Expression<String>> b;
    public final Field<a> c;
    public final Field<Expression<Uri>> d;

    /* compiled from: DivVideoSourceTemplate.kt */
    public static final class a implements JSONSerializable, JsonTemplate<td.a> {
        public final Field<Expression<Long>> a;
        public final Field<Expression<Long>> b;

        public a(Field<Expression<Long>> field, Field<Expression<Long>> field2) {
            this.a = field;
            this.b = field2;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public final JSONObject writeToJSON() {
            wd.b bVar = (wd.b) BuiltInParserKt.getBuiltInParserComponent().o9.getValue();
            ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
            bVar.getClass();
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(builtInParsingContext, jSONObject, "height", this.a);
            JsonPropertyParser.write(builtInParsingContext, jSONObject, "type", CommonCode.MapKey.HAS_RESOLUTION);
            JsonFieldParser.writeExpressionField(builtInParsingContext, jSONObject, "width", this.b);
            return jSONObject;
        }
    }

    public xd(Field<Expression<Long>> field, Field<Expression<String>> field2, Field<a> field3, Field<Expression<Uri>> field4) {
        this.a = field;
        this.b = field2;
        this.c = field3;
        this.d = field4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((pqn) BuiltInParserKt.getBuiltInParserComponent().l9.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
