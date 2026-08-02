package com.yandex.go.preorder.source.altpins;

import com.yandex.go.preorder.source.altpins.Alternatives;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class m0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = Alternatives.PinIconAnnotationTypes.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
