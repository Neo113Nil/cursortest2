package com.yandex.go.scooters.photocontrol.data.model;

import com.yandex.go.scooters.photocontrol.data.model.ScootersPhotocontrolStatusResponse;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class i {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ScootersPhotocontrolStatusResponse.PhotocontrolStatus.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
