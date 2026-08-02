package xsna;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivDrawable.kt */
/* loaded from: classes8.dex */
public abstract class ukn implements JSONSerializable, Hashable {
    public Integer a;

    /* compiled from: DivDrawable.kt */
    public static final class a extends ukn {
        public final von b;

        public a(von vonVar) {
            this.b = vonVar;
        }
    }

    public final boolean a(ukn uknVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (uknVar == null) {
            return false;
        }
        if (!(this instanceof a)) {
            throw new NoWhenBranchMatchedException();
        }
        a aVar = (a) this;
        if (!(uknVar instanceof a)) {
            throw new NoWhenBranchMatchedException();
        }
        von vonVar = ((a) uknVar).b;
        if (vonVar == null) {
            vonVar = null;
        }
        von vonVar2 = aVar.b;
        vonVar2.getClass();
        if (vonVar != null) {
            com.yandex.div2.va vaVar = vonVar.c;
            if (vonVar2.a.evaluate(expressionResolver).intValue() == vonVar.a.evaluate(expressionResolver2).intValue() && vonVar2.b.a(vonVar.b, expressionResolver, expressionResolver2)) {
                com.yandex.div2.va vaVar2 = vonVar2.c;
                if (vaVar2 != null ? vaVar2.a(vaVar, expressionResolver, expressionResolver2) : vaVar == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = fpf0.a(getClass()).hashCode();
        if (!(this instanceof a)) {
            throw new NoWhenBranchMatchedException();
        }
        int hash = ((a) this).b.hash() + hashCode;
        this.a = Integer.valueOf(hash);
        return hash;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((vkn) BuiltInParserKt.getBuiltInParserComponent().V2.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
