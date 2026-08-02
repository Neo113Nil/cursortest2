package com.vungle.ads.internal;

import com.vungle.ads.InitializationListener;
import com.vungle.ads.VungleError;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Lambda;
import ru.ok.android.api.methods.batch.execute.BatchApiRequest;
import xsna.gzs;
import xsna.s3q0;

/* loaded from: classes7.dex */
public final class u2 extends Lambda implements gzs {
    public final /* synthetic */ w2 a;
    public final /* synthetic */ VungleError b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(w2 w2Var, VungleError vungleError) {
        super(0);
        this.a = w2Var;
        this.b = vungleError;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        boolean z = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.b("VungleInitializer", BatchApiRequest.FIELD_NAME_ON_ERROR);
        CopyOnWriteArrayList copyOnWriteArrayList = this.a.c;
        VungleError vungleError = this.b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ((InitializationListener) it.next()).onError(vungleError);
        }
        this.a.c.clear();
        return s3q0.a;
    }
}
