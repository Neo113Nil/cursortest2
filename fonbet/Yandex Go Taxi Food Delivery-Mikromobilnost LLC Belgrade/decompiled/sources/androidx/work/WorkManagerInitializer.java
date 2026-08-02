package androidx.work;

import android.content.Context;
import androidx.work.impl.b;
import defpackage.f0e;
import defpackage.hgz;
import defpackage.u0e;
import defpackage.xwv;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public final class WorkManagerInitializer implements xwv {
    static {
        hgz.o("WrkMgrInitializer");
    }

    @Override // defpackage.xwv
    public final Object create(Context context) {
        hgz.g().getClass();
        b.j(context, new u0e(new f0e()));
        return b.i(context);
    }

    @Override // defpackage.xwv
    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }
}
