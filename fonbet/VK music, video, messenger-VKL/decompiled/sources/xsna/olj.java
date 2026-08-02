package xsna;

import android.net.Uri;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: ContentUrl.kt */
/* loaded from: classes8.dex */
public final class olj implements JSONSerializable, Hashable {
    public final Expression<Uri> a;
    public Integer b;

    public olj(Expression<Uri> expression) {
        this.a = expression;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.a.hashCode() + fpf0.a(olj.class).hashCode();
        this.b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        plj pljVar = (plj) BuiltInParserKt.getBuiltInParserComponent().v.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        pljVar.getClass();
        return plj.a(builtInParsingContext, this);
    }
}
