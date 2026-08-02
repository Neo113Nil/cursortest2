package com.yandex.go.user_profile.fullscreen.models;

import com.yandex.go.user_profile.fullscreen.models.UserProfileExperiment;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class g {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = UserProfileExperiment.Type.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
