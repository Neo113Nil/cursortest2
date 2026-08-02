package xsna;

import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;

/* compiled from: DivActionClearFocusJsonParser.kt */
/* loaded from: classes8.dex */
public final class jin implements Serializer, Deserializer {
    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        return new iin();
    }

    @Override // com.yandex.div.serialization.Serializer
    public final Object serialize(ParsingContext parsingContext, Object obj) {
        return lr.b(parsingContext, "type", "clear_focus");
    }
}
