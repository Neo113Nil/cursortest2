package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.vk.catalog2.common.ui.mvp.holder.container.PaginatedGridListVh;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import xsna.ub9;
import xsna.yx50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class wrl implements ub9.c, yx50.d, AbstractPaginatedView.g {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wrl(Object obj, Object obj2, Object obj3) {
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // xsna.yx50.d
    public void a() {
        ((yx50) this.b).w0((Class) this.c, (Bundle) this.d);
    }

    @Override // xsna.ub9.c
    public Object attachCompleter(ub9.a aVar) {
        ArrayList arrayList = (ArrayList) this.b;
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.c;
        Executor executor = (Executor) this.d;
        sez sezVar = new sez(new ArrayList(arrayList), false, xo9.g());
        ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new wu6(executor, sezVar, aVar, 2), 5000L, TimeUnit.MILLISECONDS);
        aVar.a(new pu5(sezVar, 4), executor);
        r0t.a(sezVar, new xrl(aVar, schedule), executor);
        return "surfaceList";
    }

    @Override // com.vk.lists.AbstractPaginatedView.g
    public int c(int i) {
        RecyclerPaginatedView recyclerPaginatedView = (RecyclerPaginatedView) this.b;
        PaginatedGridListVh paginatedGridListVh = (PaginatedGridListVh) this.c;
        View view = (View) this.d;
        int paddingStart = (i - recyclerPaginatedView.getRecyclerView().getPaddingStart()) - recyclerPaginatedView.getRecyclerView().getPaddingEnd();
        PaginatedGridListVh.c cVar = paginatedGridListVh.q;
        Context context = view.getContext();
        HashSet hashSet = iah0.a;
        int a = cVar.a(paddingStart, fnj.d(context));
        paginatedGridListVh.x = a;
        return a;
    }
}
