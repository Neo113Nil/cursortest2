package com.yandex.go.rida.header.data;

import com.yandex.go.navigation.screen.api.Screen;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class DefaultRidaHeaderStateInteractor$uiStateFlow$1 extends FunctionReferenceImpl implements tls {
    public DefaultRidaHeaderStateInteractor$uiStateFlow$1(c cVar) {
        super(1, cVar, c.class, "transientScreenDebounceMs", "transientScreenDebounceMs(Lcom/yandex/go/navigation/screen/api/Screen;)J", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Screen screen = (Screen) obj;
        ((c) this.receiver).getClass();
        return Long.valueOf((screen == Screen.UNSUPPORTED || screen == Screen.NONE) ? 150L : 0L);
    }
}
