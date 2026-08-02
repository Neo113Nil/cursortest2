package xsna;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import java.util.List;
import org.json.JSONObject;
import xsna.jln;

/* compiled from: DivFocusTemplate.kt */
/* loaded from: classes8.dex */
public final class qln implements JSONSerializable, JsonTemplate<jln> {
    public final Field<List<com.yandex.div2.q1>> a;
    public final Field<com.yandex.div2.w1> b;
    public final Field<a> c;
    public final Field<List<com.yandex.div2.h0>> d;
    public final Field<List<com.yandex.div2.h0>> e;

    /* compiled from: DivFocusTemplate.kt */
    public static final class a implements JSONSerializable, JsonTemplate<jln.a> {
        public final Field<Expression<String>> a;
        public final Field<Expression<String>> b;
        public final Field<Expression<String>> c;
        public final Field<Expression<String>> d;
        public final Field<Expression<String>> e;

        public a(Field<Expression<String>> field, Field<Expression<String>> field2, Field<Expression<String>> field3, Field<Expression<String>> field4, Field<Expression<String>> field5) {
            this.a = field;
            this.b = field2;
            this.c = field3;
            this.d = field4;
            this.e = field5;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public final JSONObject writeToJSON() {
            oln olnVar = (oln) BuiltInParserKt.getBuiltInParserComponent().D3.getValue();
            ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
            olnVar.getClass();
            return oln.a(builtInParsingContext, this);
        }
    }

    public qln(Field<List<com.yandex.div2.q1>> field, Field<com.yandex.div2.w1> field2, Field<a> field3, Field<List<com.yandex.div2.h0>> field4, Field<List<com.yandex.div2.h0>> field5) {
        this.a = field;
        this.b = field2;
        this.c = field3;
        this.d = field4;
        this.e = field5;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((lln) BuiltInParserKt.getBuiltInParserComponent().A3.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
