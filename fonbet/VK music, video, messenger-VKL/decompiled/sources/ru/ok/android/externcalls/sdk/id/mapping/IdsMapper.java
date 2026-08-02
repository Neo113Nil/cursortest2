package ru.ok.android.externcalls.sdk.id.mapping;

import java.util.Collection;
import java.util.Map;

/* compiled from: IdsMapper.kt */
/* loaded from: classes9.dex */
public interface IdsMapper<From, To> {
    Map<From, To> map(Collection<? extends From> collection, MappingContext mappingContext);
}
