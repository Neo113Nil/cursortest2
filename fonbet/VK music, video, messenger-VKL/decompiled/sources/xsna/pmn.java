package xsna;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* compiled from: DivInputFilterTemplate.kt */
/* loaded from: classes8.dex */
public abstract class pmn implements JSONSerializable, JsonTemplate<bmn> {

    /* compiled from: DivInputFilterTemplate.kt */
    public static final class a extends pmn {
        public final gmn a;

        public a(gmn gmnVar) {
            this.a = gmnVar;
        }
    }

    /* compiled from: DivInputFilterTemplate.kt */
    public static final class b extends pmn {
        public final omn a;

        public b(omn omnVar) {
            this.a = omnVar;
        }
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((imn) BuiltInParserKt.getBuiltInParserComponent().q4.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
