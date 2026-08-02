package xsna;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* compiled from: DivActionSetStoredValueTemplate.kt */
/* loaded from: classes8.dex */
public final class vjn implements JSONSerializable, JsonTemplate<rjn> {
    public final Field<Expression<Long>> a;
    public final Field<Expression<String>> b;
    public final Field<oqn> c;

    public vjn(Field<Expression<Long>> field, Field<Expression<String>> field2, Field<oqn> field3) {
        this.a = field;
        this.b = field2;
        this.c = field3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((tjn) BuiltInParserKt.getBuiltInParserComponent().H0.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
