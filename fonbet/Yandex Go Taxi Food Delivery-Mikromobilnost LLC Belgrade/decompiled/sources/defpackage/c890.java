package defpackage;

import com.yandex.messaging.paging.PagedLoader$LoadState;
import com.yandex.messaging.paging.PagedLoader$LoadType;
import java.util.ArrayList;

/* loaded from: classes15.dex */
public final class c890 implements z790 {
    public final /* synthetic */ d890 a;

    public c890(d890 d890Var) {
        this.a = d890Var;
    }

    @Override // defpackage.z790
    public final void a(ArrayList arrayList) {
        d890 d890Var = this.a;
        d890Var.w.a(arrayList, d890Var);
        tls tlsVar = d890Var.b;
        if (tlsVar != null) {
            tlsVar.invoke(arrayList);
        }
    }

    @Override // defpackage.z790
    public final void b(PagedLoader$LoadType pagedLoader$LoadType, PagedLoader$LoadState pagedLoader$LoadState) {
        wls wlsVar = this.a.c;
        if (wlsVar != null) {
            wlsVar.invoke(pagedLoader$LoadType, pagedLoader$LoadState);
        }
    }
}
