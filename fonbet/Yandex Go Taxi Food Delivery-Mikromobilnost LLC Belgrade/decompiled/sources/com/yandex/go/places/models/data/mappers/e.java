package com.yandex.go.places.models.data.mappers;

import com.yandex.go.places.models.data.entities.network.CompressionResistantAttributedTextDto;
import defpackage.bvf0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class e {
    public final ru.yandex.taxi.widget.c a;

    public e(ru.yandex.taxi.widget.c cVar) {
        this.a = cVar;
    }

    public final Object a(CompressionResistantAttributedTextDto compressionResistantAttributedTextDto, ContinuationImpl continuationImpl) {
        return bvf0.n(new CompressionResistantAttributedTextMapper$mapModel$2(this, compressionResistantAttributedTextDto, null), continuationImpl);
    }
}
