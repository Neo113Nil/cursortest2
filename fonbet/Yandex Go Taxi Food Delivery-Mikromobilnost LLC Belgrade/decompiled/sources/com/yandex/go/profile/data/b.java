package com.yandex.go.profile.data;

import com.yandex.go.profile.data.ProfileItem;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class b {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ProfileItem.Id.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
