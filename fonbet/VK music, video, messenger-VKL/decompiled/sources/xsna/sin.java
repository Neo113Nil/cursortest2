package xsna;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* compiled from: DivActionCopyToClipboardContentTemplate.kt */
/* loaded from: classes8.dex */
public abstract class sin implements JSONSerializable, JsonTemplate<oin> {

    /* compiled from: DivActionCopyToClipboardContentTemplate.kt */
    public static final class a extends sin {
        public final ilj a;

        public a(ilj iljVar) {
            this.a = iljVar;
        }
    }

    /* compiled from: DivActionCopyToClipboardContentTemplate.kt */
    public static final class b extends sin {
        public final slj a;

        public b(slj sljVar) {
            this.a = sljVar;
        }
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((qin) BuiltInParserKt.getBuiltInParserComponent().d0.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
