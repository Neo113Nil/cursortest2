package xsna;

import android.net.Uri;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* compiled from: DivNinePatchBackground.kt */
/* loaded from: classes8.dex */
public final class fnn implements JSONSerializable, Hashable {
    public final Expression<Uri> a;
    public final com.yandex.div2.b b;
    public Integer c;

    public fnn(Expression<Uri> expression, com.yandex.div2.b bVar) {
        this.a = expression;
        this.b = bVar;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        int hash = this.b.hash() + this.a.hashCode() + fpf0.a(fnn.class).hashCode();
        this.c = Integer.valueOf(hash);
        return hash;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((gnn) BuiltInParserKt.getBuiltInParserComponent().b5.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
