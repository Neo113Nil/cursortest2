package xsna;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivCurrencyInputMask.kt */
/* loaded from: classes8.dex */
public final class kkn implements JSONSerializable, Hashable, qmn {
    public final Expression<String> a;
    public final String b;
    public Integer c;

    public kkn(Expression<String> expression, String str) {
        this.a = expression;
        this.b = str;
    }

    @Override // xsna.qmn
    public final String a() {
        return this.b;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = fpf0.a(kkn.class).hashCode();
        Expression<String> expression = this.a;
        int hashCode2 = this.b.hashCode() + hashCode + (expression != null ? expression.hashCode() : 0);
        this.c = Integer.valueOf(hashCode2);
        return hashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        lkn lknVar = (lkn) BuiltInParserKt.getBuiltInParserComponent().y2.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        lknVar.getClass();
        return lkn.b(builtInParsingContext, this);
    }
}
