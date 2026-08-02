package xsna;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivRadialGradientRelativeCenter.kt */
/* loaded from: classes8.dex */
public final class pon implements JSONSerializable, Hashable {
    public final Expression<Double> a;
    public Integer b;

    public pon(Expression<Double> expression) {
        this.a = expression;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.a.hashCode() + fpf0.a(pon.class).hashCode();
        this.b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        qon qonVar = (qon) BuiltInParserKt.getBuiltInParserComponent().i6.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        qonVar.getClass();
        return qon.a(builtInParsingContext, this);
    }
}
