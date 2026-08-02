package com.yandex.go.navigator.settings.voice_settings;

import defpackage.i650;
import defpackage.n;
import defpackage.sls;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class VoiceSettingsPresenter$updateButtons$2 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        c cVar = (c) this.receiver;
        i650 i650Var = cVar.I.a;
        i650Var.a.a("navigation.settings.language.voice.save_and_close", n.u(i650Var), 1, new HashMap());
        cVar.J.b();
        return zy11.a;
    }
}
