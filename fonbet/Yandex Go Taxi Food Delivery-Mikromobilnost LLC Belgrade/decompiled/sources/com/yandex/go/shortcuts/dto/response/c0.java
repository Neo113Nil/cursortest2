package com.yandex.go.shortcuts.dto.response;

import com.yandex.go.shortcuts.dto.response.Offer$Animation;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes6.dex */
public final class c0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = Offer$Animation.Type.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
