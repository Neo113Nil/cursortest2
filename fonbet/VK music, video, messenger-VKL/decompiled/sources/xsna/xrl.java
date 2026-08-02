package xsna;

import android.view.Surface;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import xsna.ub9;

/* compiled from: DeferrableSurfaces.java */
/* loaded from: classes11.dex */
public final class xrl implements o0t<List<Surface>> {
    public final /* synthetic */ ub9.a b;
    public final /* synthetic */ ScheduledFuture c;

    public xrl(ub9.a aVar, ScheduledFuture scheduledFuture) {
        this.b = aVar;
        this.c = scheduledFuture;
    }

    @Override // xsna.o0t
    public final void onFailure(Throwable th) {
        this.b.b(Collections.unmodifiableList(Collections.EMPTY_LIST));
        this.c.cancel(true);
    }

    @Override // xsna.o0t
    public final void onSuccess(@Nullable List<Surface> list) {
        this.b.b(new ArrayList(list));
        this.c.cancel(true);
    }
}
