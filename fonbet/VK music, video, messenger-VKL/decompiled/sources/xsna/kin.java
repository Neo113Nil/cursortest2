package xsna;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;

/* compiled from: DivActionClearFocusJsonParser.kt */
/* loaded from: classes8.dex */
public final class kin implements Serializer, TemplateDeserializer {
    @Override // com.yandex.div.serialization.TemplateDeserializer
    public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        return new min();
    }

    @Override // com.yandex.div.serialization.Serializer
    public final Object serialize(ParsingContext parsingContext, Object obj) {
        return lr.b(parsingContext, "type", "clear_focus");
    }
}
