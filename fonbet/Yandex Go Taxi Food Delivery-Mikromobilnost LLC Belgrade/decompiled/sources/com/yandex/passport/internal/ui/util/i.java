package com.yandex.passport.internal.ui.util;

import android.os.Looper;
import defpackage.dy40;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class i extends dy40 {
    @Override // defpackage.dy40
    public final void m(Object obj) {
        if (jl40.l(Looper.myLooper(), Looper.getMainLooper())) {
            l(obj);
        } else {
            super.m(obj);
        }
    }
}
