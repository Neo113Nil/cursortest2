package com.yandex.div.serialization;

/* compiled from: Deserializer.kt */
/* loaded from: classes7.dex */
public interface Deserializer<D, V> {
    V deserialize(ParsingContext parsingContext, D d);
}
