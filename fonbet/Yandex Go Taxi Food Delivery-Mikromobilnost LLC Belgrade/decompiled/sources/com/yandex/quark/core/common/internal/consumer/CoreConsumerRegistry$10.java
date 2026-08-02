package com.yandex.quark.core.common.internal.consumer;

import defpackage.c1k;
import defpackage.jd41;
import defpackage.w5h;
import defpackage.wf3;
import defpackage.wls;
import defpackage.xc41;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* synthetic */ class CoreConsumerRegistry$10 extends FunctionReferenceImpl implements wls {
    public static final CoreConsumerRegistry$10 b = new CoreConsumerRegistry$10(2, 0, wf3.class, "setAudioFocusManagerRegistry", "setAudioFocusManagerRegistry(Lcom/yandex/quark/contracts/internal/audio/AudioFocusManagerRegistry;)V");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        jd41 jd41Var = ((xc41) ((wf3) obj)).B;
        jd41Var.getClass();
        ((w5h) obj2).a.c("DefaultAudioFocusManagerRegistry", "registerManager called");
        jd41Var.G.a(c1k.a);
        return zy11.a;
    }
}
