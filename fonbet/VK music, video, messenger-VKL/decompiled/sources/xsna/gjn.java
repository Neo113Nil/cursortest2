package xsna;

import android.net.Uri;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.List;
import org.json.JSONObject;

/* compiled from: DivActionDownloadTemplate.kt */
/* loaded from: classes8.dex */
public final class gjn implements JSONSerializable, JsonTemplate<cjn> {
    public final Field<List<com.yandex.div2.h0>> a;
    public final Field<List<com.yandex.div2.h0>> b;
    public final Field<Expression<Uri>> c;

    public gjn(Field<List<com.yandex.div2.h0>> field, Field<List<com.yandex.div2.h0>> field2, Field<Expression<Uri>> field3) {
        this.a = field;
        this.b = field2;
        this.c = field3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((ejn) BuiltInParserKt.getBuiltInParserComponent().m0.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
