package com.yandex.passport.internal.autologin;

import com.yandex.passport.common.core.Uid;

/* loaded from: classes15.dex */
public abstract class c {
    public final Uid a;
    public final String b;

    static {
        int i = Uid.$stable;
    }

    public c(Uid uid, String str) {
        this.a = uid;
        this.b = str;
    }

    public final String a() {
        return this.b;
    }

    public final Uid b() {
        return this.a;
    }
}
