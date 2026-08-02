package xsna;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* compiled from: DivDrawableTemplate.kt */
/* loaded from: classes8.dex */
public abstract class ykn implements JSONSerializable, JsonTemplate<ukn> {

    /* compiled from: DivDrawableTemplate.kt */
    public static final class a extends ykn {
        public final zon a;

        public a(zon zonVar) {
            this.a = zonVar;
        }
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((wkn) BuiltInParserKt.getBuiltInParserComponent().W2.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
