package com.yandex.div.serialization;

import com.yandex.div.data.EntityTemplate;

/* compiled from: TemplateResolver.kt */
/* loaded from: classes7.dex */
public interface TemplateResolver<D, T extends EntityTemplate<V>, V> {
    V resolve(ParsingContext parsingContext, T t, D d);
}
