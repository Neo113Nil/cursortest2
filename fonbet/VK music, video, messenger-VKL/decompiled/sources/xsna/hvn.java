package xsna;

import com.vk.api.base.Document;
import com.vk.api.base.VkPaginationList;

/* compiled from: DocumentsViewFragment.java */
/* loaded from: classes18.dex */
public final class hvn implements io.reactivex.rxjava3.functions.f<VkPaginationList<Document>> {
    public final /* synthetic */ Document b;

    public hvn(Document document) {
        this.b = document;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(VkPaginationList<Document> vkPaginationList) throws Throwable {
        VkPaginationList<Document> vkPaginationList2 = vkPaginationList;
        vkPaginationList2.b.add(0, this.b);
        wmi0.a.a("userDocs", new VkPaginationList(vkPaginationList2.b, vkPaginationList2.c + 1, vkPaginationList2.d));
    }
}
