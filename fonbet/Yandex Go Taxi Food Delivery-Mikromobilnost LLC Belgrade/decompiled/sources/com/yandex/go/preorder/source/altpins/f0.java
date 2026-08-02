package com.yandex.go.preorder.source.altpins;

import com.yandex.go.preorder.source.altpins.Alternatives;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class f0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = Alternatives.OptionTypeLegacy.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
