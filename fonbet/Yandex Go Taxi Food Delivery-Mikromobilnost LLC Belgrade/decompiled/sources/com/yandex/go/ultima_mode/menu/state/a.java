package com.yandex.go.ultima_mode.menu.state;

import com.yandex.go.ultima_mode.api.data.UltimaModeResponse;
import defpackage.bvf0;
import kotlin.coroutines.Continuation;

/* loaded from: classes14.dex */
public final class a {
    public final com.yandex.go.ultima_mode.ui.header.state.a a;
    public final com.yandex.go.ultima_mode.ui.progress_bar.state.a b;

    public a(com.yandex.go.ultima_mode.ui.header.state.a aVar, com.yandex.go.ultima_mode.ui.progress_bar.state.a aVar2) {
        this.a = aVar;
        this.b = aVar2;
    }

    public final Object a(UltimaModeResponse ultimaModeResponse, Continuation continuation) {
        return bvf0.n(new MenuUltimaModeUiStateMapper$map$2(ultimaModeResponse, this, null), continuation);
    }
}
