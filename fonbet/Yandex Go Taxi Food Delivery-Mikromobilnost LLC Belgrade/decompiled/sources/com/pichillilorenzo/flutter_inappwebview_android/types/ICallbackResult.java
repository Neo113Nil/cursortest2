package com.pichillilorenzo.flutter_inappwebview_android.types;

import defpackage.da20;

/* loaded from: classes11.dex */
public interface ICallbackResult<T> extends da20 {
    T decodeResult(Object obj);

    void defaultBehaviour(T t);

    @Override // defpackage.da20
    /* synthetic */ void error(String str, String str2, Object obj);

    boolean nonNullSuccess(T t);

    @Override // defpackage.da20
    /* synthetic */ void notImplemented();

    boolean nullSuccess();

    @Override // defpackage.da20
    /* synthetic */ void success(Object obj);
}
