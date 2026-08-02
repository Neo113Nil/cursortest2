package com.github.dart_lang.jni;

import defpackage.fse;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.uyj;
import kotlin.coroutines.Continuation;

/* loaded from: classes10.dex */
public class PortContinuation<T> implements Continuation<T> {
    private final long port;

    static {
        System.loadLibrary("dartjni");
    }

    public PortContinuation(long j) {
        this.port = j;
    }

    private native void _resumeWith(long j, Object obj);

    @Override // kotlin.coroutines.Continuation
    /* renamed from: getContext */
    public fse get_context() {
        sjh sjhVar = uyj.a;
        return mdh.b;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        _resumeWith(this.port, obj);
    }
}
