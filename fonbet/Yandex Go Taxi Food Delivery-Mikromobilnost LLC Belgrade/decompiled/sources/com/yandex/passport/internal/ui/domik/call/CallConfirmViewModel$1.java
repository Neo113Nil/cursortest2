package com.yandex.passport.internal.ui.domik.call;

import com.yandex.passport.internal.ui.domik.RegTrack;
import com.yandex.passport.legacy.lx.m;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class CallConfirmViewModel$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        com.yandex.passport.internal.interaction.e eVar = ((e) this.receiver).E;
        eVar.c.m(Boolean.TRUE);
        eVar.a.a.add(m.d(new com.yandex.passport.internal.interaction.a(2, eVar, (RegTrack) obj)));
        return zy11.a;
    }
}
