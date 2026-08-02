package com.yandex.passport.sloth.command.performers;

import android.content.Context;
import defpackage.v7p;
import defpackage.yvf0;

/* loaded from: classes2.dex */
public final class k implements v7p {
    public final /* synthetic */ int a;
    public final yvf0 b;

    public /* synthetic */ k(yvf0 yvf0Var, int i) {
        this.a = i;
        this.b = yvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        switch (this.a) {
            case 0:
                return new j((Context) this.b.get());
            case 1:
                return new n((com.yandex.passport.sloth.v) this.b.get());
            case 2:
                return new p((com.yandex.passport.sloth.v) this.b.get());
            case 3:
                return new q((com.yandex.passport.sloth.v) this.b.get());
            default:
                return new s((com.yandex.passport.sloth.v) this.b.get());
        }
    }
}
