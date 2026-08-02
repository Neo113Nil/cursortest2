package com.yandex.go.safety.center.safetycenter_web.domain.web;

import com.yandex.go.safety.center.safetycenter_web.domain.web.SafetyCenterWebChangeResult;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class b {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = SafetyCenterWebChangeResult.Result.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
