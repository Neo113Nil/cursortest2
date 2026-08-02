package com.yandex.go.zone.dto.objects;

import com.yandex.go.zone.dto.objects.Notification;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class p2 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = Notification.Type.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
