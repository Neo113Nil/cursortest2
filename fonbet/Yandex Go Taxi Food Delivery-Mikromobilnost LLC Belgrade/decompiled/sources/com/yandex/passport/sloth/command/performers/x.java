package com.yandex.passport.sloth.command.performers;

import com.yandex.passport.sloth.data.SlothParams;
import defpackage.n3w;
import defpackage.v7p;

/* loaded from: classes2.dex */
public final class x implements v7p {
    public final /* synthetic */ int a;
    public final n3w b;

    public /* synthetic */ x(n3w n3wVar, int i) {
        this.a = i;
        this.b = n3wVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        n3w n3wVar = this.b;
        switch (i) {
            case 0:
                return new w((SlothParams) n3wVar.a);
            default:
                return new com.yandex.passport.sloth.url.a((SlothParams) n3wVar.a);
        }
    }
}
