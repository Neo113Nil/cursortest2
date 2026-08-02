package com.yandex.div.serialization;

import com.yandex.div.data.EntityTemplate;

/* compiled from: TemplateDeserializer.kt */
/* loaded from: classes7.dex */
public interface TemplateDeserializer<D, T extends EntityTemplate<?>> extends Deserializer<D, T> {
    T deserialize(ParsingContext parsingContext, T t, D d);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.div.serialization.Deserializer
    /* bridge */ /* synthetic */ default Object deserialize(ParsingContext parsingContext, Object obj) {
        return deserialize(parsingContext, (ParsingContext) obj);
    }

    @Override // com.yandex.div.serialization.Deserializer
    default T deserialize(ParsingContext parsingContext, D d) {
        return deserialize(parsingContext, null, d);
    }
}
