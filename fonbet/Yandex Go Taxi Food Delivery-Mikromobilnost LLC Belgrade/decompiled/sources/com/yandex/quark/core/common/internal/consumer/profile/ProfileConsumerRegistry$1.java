package com.yandex.quark.core.common.internal.consumer.profile;

import com.yandex.quark.webchat.feature.dependencies.BufferingProfile;
import defpackage.wdf0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* synthetic */ class ProfileConsumerRegistry$1 extends FunctionReferenceImpl implements wls {
    public static final ProfileConsumerRegistry$1 b = new ProfileConsumerRegistry$1(2, 0, wdf0.class, "setProfile", "setProfile(Lcom/yandex/quark/alice/profile/Profile;)V");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ((wdf0) obj).v((BufferingProfile) obj2);
        return zy11.a;
    }
}
