package com.yandex.passport.internal.ui.base;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class m {
    public final Callable a;
    public final String b;
    public final boolean c;
    public final ShowFragmentInfo$AnimationType d;

    public m(Callable callable, String str, boolean z, ShowFragmentInfo$AnimationType showFragmentInfo$AnimationType) {
        this.a = callable;
        this.b = str;
        this.c = z;
        this.d = showFragmentInfo$AnimationType;
    }

    public m(Callable callable, String str, boolean z) {
        this(callable, str, z, ShowFragmentInfo$AnimationType.SLIDE);
    }
}
