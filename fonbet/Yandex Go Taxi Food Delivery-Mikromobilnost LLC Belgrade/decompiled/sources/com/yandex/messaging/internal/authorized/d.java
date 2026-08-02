package com.yandex.messaging.internal.authorized;

import defpackage.c3r;
import defpackage.fyc;
import defpackage.gwk0;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tls;
import defpackage.zy11;
import java.util.List;

/* loaded from: classes15.dex */
public final class d {
    public c3r a;
    public final fyc b = gwk0.b();
    public final pzt0 c;

    public d(final f fVar, final String str, String str2, List list, boolean z) {
        pzt0 N = tje.N(fVar.j, null, null, new FilesDownloaderWrapper$Download$job$1(fVar, this, str, str2, list, z, null), 3);
        this.c = N;
        N.w(new tls() { // from class: com.yandex.messaging.internal.authorized.c
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                f fVar2 = f.this;
                tje.N(fVar2.j, null, null, new FilesDownloaderWrapper$Download$1$1(this, fVar2, (Throwable) obj, str, null), 3);
                return zy11.a;
            }
        });
    }
}
