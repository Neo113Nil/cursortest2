package com.yandex.passport.legacy.lx;

import java.util.concurrent.Future;

/* loaded from: classes8.dex */
public class n extends g {
    public Future b;
    public f c;

    @Override // com.yandex.passport.legacy.lx.g
    public final void a() {
        if (!this.a) {
            this.b.cancel(this.c.a());
        }
        this.a = true;
    }
}
