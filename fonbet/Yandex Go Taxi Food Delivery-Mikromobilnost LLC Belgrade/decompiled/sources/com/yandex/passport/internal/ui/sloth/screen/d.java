package com.yandex.passport.internal.ui.sloth.screen;

import com.yandex.passport.internal.ui.sloth.n;
import com.yandex.passport.sloth.ui.SlothUiWish;
import com.yandex.passport.sloth.ui.dependencies.q;
import defpackage.n3w;
import defpackage.tls;
import defpackage.v7p;
import java.util.Map;

/* loaded from: classes15.dex */
public final class d implements v7p {
    public final /* synthetic */ int a;
    public final b b;
    public final n3w c;

    public /* synthetic */ d(b bVar, n3w n3wVar, int i) {
        this.a = i;
        this.b = bVar;
        this.c = n3wVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        n3w n3wVar = this.c;
        b bVar = this.b;
        switch (i) {
            case 0:
                Map map = (Map) n3wVar.a;
                bVar.getClass();
                return new n(map);
            default:
                final tls tlsVar = (tls) n3wVar.a;
                bVar.getClass();
                return new q() { // from class: com.yandex.passport.internal.ui.sloth.screen.a
                    @Override // com.yandex.passport.sloth.ui.dependencies.q
                    public final void a(SlothUiWish slothUiWish) {
                        tls.this.invoke(slothUiWish);
                    }
                };
        }
    }
}
