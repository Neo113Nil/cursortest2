package xsna;

import com.vk.api.base.Document;
import com.vk.api.base.VkPaginationList;
import com.vk.lists.c;

/* compiled from: AttachDocumentsFragment.kt */
/* loaded from: classes18.dex */
public final class qun implements c.l<VkPaginationList<Document>> {
    public final /* synthetic */ run b;

    public qun(run runVar) {
        this.b = runVar;
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<VkPaginationList<Document>> hj(com.vk.lists.c cVar, boolean z) {
        run runVar = this.b;
        return runVar.c.b.isEmpty() ? ui(0, cVar) : io.reactivex.rxjava3.core.q.T(runVar.c);
    }

    @Override // com.vk.lists.c.l
    public final io.reactivex.rxjava3.core.q<VkPaginationList<Document>> ui(int i, com.vk.lists.c cVar) {
        run runVar = this.b;
        return rsg0.y0(new qf3(i, cVar.k(), runVar.a, runVar.b), null, null, 3);
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<VkPaginationList<Document>> qVar, boolean z, com.vk.lists.c cVar) {
        run runVar = this.b;
        qVar.subscribe(new cw(new nk0(13, cVar, runVar), 17), new ew(new z8f(runVar, 11), 19));
    }
}
