package com.yandex.div.internal.storage;

import android.content.Context;
import defpackage.bvf0;
import defpackage.fse;
import defpackage.gci0;
import defpackage.gtq0;
import defpackage.ike;
import defpackage.l8x;
import defpackage.n1f;
import defpackage.opg;
import defpackage.ppg;
import defpackage.qly0;
import defpackage.seu;
import defpackage.tls;
import defpackage.wsr0;
import defpackage.xsr0;
import defpackage.zy11;
import java.io.File;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes11.dex */
public final class b {
    public final qly0 a;
    public final fse b;
    public final File c;
    public final kotlinx.coroutines.sync.a d;
    public final r0 e;
    public final gci0 f;

    public b(Context context, String str, ike ikeVar, qly0 qly0Var) {
        this.a = qly0Var;
        fse fseVar = ikeVar.a;
        this.b = fseVar;
        this.c = new File(context.getApplicationContext().getFilesDir(), str);
        this.d = gtq0.a();
        r0 c = bvf0.c(ppg.a);
        this.e = c;
        this.f = e.R(new n1f(3, new n(c, new DataStorage$data$1(this, null)), this), ikeVar, wsr0.a(xsr0.a, 3), null);
        new DataStorage$1(2, null);
        l8x l8xVar = (l8x) fseVar.get(seu.C);
        if (l8xVar != null) {
            l8xVar.w(new tls() { // from class: com.yandex.div.internal.storage.DataStorage$2
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    r0 r0Var = b.this.e;
                    r0Var.getClass();
                    r0Var.m(null, opg.a);
                    return zy11.a;
                }
            });
        }
    }
}
