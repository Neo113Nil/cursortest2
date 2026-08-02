package com.yandex.go.zone.dto.objects;

import com.yandex.go.zone.dto.objects.QueueScreen;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class n3 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = QueueScreen.QueueButton.QueueButtonAction.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
