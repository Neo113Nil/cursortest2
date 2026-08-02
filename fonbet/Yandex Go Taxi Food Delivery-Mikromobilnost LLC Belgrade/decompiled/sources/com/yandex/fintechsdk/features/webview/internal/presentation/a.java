package com.yandex.fintechsdk.features.webview.internal.presentation;

import defpackage.kp41;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;

/* loaded from: classes12.dex */
public final class a implements vpr {
    public final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        com.yandex.fintechsdk.core.architecture.api.mvi.b.a(this.a, new WebViewViewModel$observeFacadeStates$1$1$1((kp41) obj, null));
        return zy11.a;
    }
}
