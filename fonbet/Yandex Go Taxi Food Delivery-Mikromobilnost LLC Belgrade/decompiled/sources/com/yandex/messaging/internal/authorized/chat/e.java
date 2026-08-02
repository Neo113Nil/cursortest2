package com.yandex.messaging.internal.authorized.chat;

import android.os.Looper;
import defpackage.o1b0;
import defpackage.rol0;
import defpackage.sb7;
import defpackage.z83;
import defpackage.zkt0;

/* loaded from: classes15.dex */
public final class e {
    public final Looper a;
    public final sb7 b;
    public final zkt0 c;
    public final o1b0 d;
    public final l e;

    public e(Looper looper, sb7 sb7Var, zkt0 zkt0Var, o1b0 o1b0Var, l lVar) {
        this.a = looper;
        this.b = sb7Var;
        this.c = zkt0Var;
        this.d = o1b0Var;
        this.e = lVar;
        z83.g(null, looper, Looper.myLooper());
    }

    public final kotlinx.coroutines.flow.internal.g a() {
        return kotlinx.coroutines.flow.e.X(new rol0(new ChatSpamMarker$isProbablySpamFlow$1(this, null)), new ChatSpamMarker$flow$$inlined$flatMapLatest$1(this, null));
    }
}
