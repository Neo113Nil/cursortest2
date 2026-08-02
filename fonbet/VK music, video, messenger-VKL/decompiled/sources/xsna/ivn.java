package xsna;

import com.vk.api.base.Document;
import com.vk.api.base.VkPaginationList;
import java.util.List;

/* compiled from: DocumentsViewFragment.java */
/* loaded from: classes18.dex */
public final class ivn implements io.reactivex.rxjava3.functions.f<VkPaginationList<Document>> {
    public final /* synthetic */ int b;

    public ivn(int i) {
        this.b = i;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(VkPaginationList<Document> vkPaginationList) throws Throwable {
        VkPaginationList<Document> vkPaginationList2 = vkPaginationList;
        int i = 0;
        while (true) {
            List<Document> list = vkPaginationList2.b;
            if (i == list.size()) {
                return;
            }
            if (this.b == list.get(i).b) {
                list.remove(i);
                wmi0.a.a("userDocs", new VkPaginationList(list, vkPaginationList2.c + 1, vkPaginationList2.d));
                return;
            }
            i++;
        }
    }
}
