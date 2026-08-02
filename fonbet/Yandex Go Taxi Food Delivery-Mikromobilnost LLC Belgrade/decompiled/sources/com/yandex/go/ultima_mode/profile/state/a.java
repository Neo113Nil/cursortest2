package com.yandex.go.ultima_mode.profile.state;

import com.yandex.go.ultima_mode.api.data.UltimaModeResponse;
import defpackage.bvf0;
import defpackage.irs0;
import defpackage.yu11;
import kotlin.coroutines.Continuation;

/* loaded from: classes14.dex */
public final class a {
    public final irs0 a;
    public final yu11 b;
    public final com.yandex.go.ultima_mode.ui.header.state.a c;
    public final com.yandex.go.ultima_mode.ui.progress_bar.state.a d;

    public a(irs0 irs0Var, yu11 yu11Var, com.yandex.go.ultima_mode.ui.header.state.a aVar, com.yandex.go.ultima_mode.ui.progress_bar.state.a aVar2) {
        this.a = irs0Var;
        this.b = yu11Var;
        this.c = aVar;
        this.d = aVar2;
    }

    public final Object a(UltimaModeResponse ultimaModeResponse, boolean z, Continuation continuation) {
        return bvf0.n(new ProfileUltimaModeUiStateMapper$map$2(ultimaModeResponse, this, null, z), continuation);
    }
}
