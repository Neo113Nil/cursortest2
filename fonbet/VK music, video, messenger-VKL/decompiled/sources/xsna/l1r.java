package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.base.Document;
import com.vk.api.base.VkPaginationList;
import com.vk.core.compose.component.modal.SheetValue;
import com.vk.documents.impl.SearchDocumentsListFragment;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.VKList;
import com.vk.dto.gift.GiftItem;
import com.vk.feedlikes.fragments.FeedLikesFragment;
import com.vk.log.L;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.profile.user.impl.ui.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import kotlin.collections.EmptyList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class l1r implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;

    public /* synthetic */ l1r(SearchDocumentsListFragment searchDocumentsListFragment, com.vk.lists.c cVar, boolean z) {
        this.b = 1;
        this.e = searchDocumentsListFragment;
        this.c = cVar;
        this.d = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        List list;
        RecyclerView recyclerView;
        switch (this.b) {
            case 0:
                com.vk.lists.c cVar = (com.vk.lists.c) this.c;
                p1r p1rVar = (p1r) this.e;
                krt krtVar = (krt) obj;
                String str = krtVar.c;
                ArrayList arrayList = krtVar.a;
                cVar.s(str);
                int i = 0;
                cVar.r((str == null || str.length() == 0 || str.equals("0") || arrayList.isEmpty()) ? false : true);
                FeedLikesFragment feedLikesFragment = p1rVar.d0;
                feedLikesFragment.so(false);
                boolean z = this.d;
                if (z) {
                    h1r h1rVar = feedLikesFragment.n0;
                    if (h1rVar == null) {
                        L.l("Can't find sticky header view");
                    } else if (h1rVar.V(1) && (recyclerView = feedLikesFragment.d0.y.c) != null) {
                        recyclerView.scrollToPosition(1);
                    }
                }
                if (z) {
                    p1rVar.t();
                }
                List list2 = krtVar.b;
                if (list2 == null) {
                    list2 = EmptyList.b;
                }
                p1rVar.f0.setItems(list2.isEmpty() ? EmptyList.b : Collections.singletonList(list2));
                if (p1rVar.c.d.isEmpty() && arrayList.isEmpty()) {
                    i = 1;
                }
                k1r k1rVar = feedLikesFragment.q0;
                k1rVar.getClass();
                if (i == 0) {
                    list = EmptyList.b;
                } else if (i == 1) {
                    list = Collections.singletonList(1);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException(lhg.a(i, "Unsupported state "));
                    }
                    list = Collections.singletonList(2);
                }
                k1rVar.setItems(list);
                f1r f1rVar = feedLikesFragment.p0;
                s3q0 s3q0Var = s3q0.a;
                f1rVar.setItems(Collections.singletonList(s3q0Var));
                p1rVar.o(arrayList, null);
                return s3q0Var;
            case 1:
                SearchDocumentsListFragment searchDocumentsListFragment = (SearchDocumentsListFragment) this.e;
                com.vk.lists.c cVar2 = (com.vk.lists.c) this.c;
                VkPaginationList vkPaginationList = (VkPaginationList) obj;
                String str2 = searchDocumentsListFragment.a0;
                ArrayList<Document> arrayList2 = searchDocumentsListFragment.b0;
                if (myc0.f(str2)) {
                    return s3q0.a;
                }
                List<T> list3 = vkPaginationList.b;
                int i2 = vkPaginationList.c;
                boolean z2 = cVar2.i() + list3.size() < i2;
                cVar2.l(i2);
                if (!this.d || arrayList2.isEmpty()) {
                    arrayList2.addAll(list3);
                    searchDocumentsListFragment.c0 = i2;
                }
                wun wunVar = searchDocumentsListFragment.S;
                if (wunVar != null) {
                    wunVar.n0(list3);
                }
                if (z2) {
                    wun wunVar2 = searchDocumentsListFragment.S;
                    cVar2.q(wunVar2 != null ? wunVar2.getItemCount() : 0);
                } else {
                    cVar2.r(false);
                }
                return s3q0.a;
            case 2:
                return new fdj0(this.d, (azl) this.c, (SheetValue) obj, (izs) this.e);
            case 3:
                gnq0 gnq0Var = (gnq0) this.c;
                mzt mztVar = (mzt) this.e;
                VKList vKList = (VKList) obj;
                boolean z3 = this.d;
                if (z3 && vKList.isEmpty()) {
                    wmq0.B(gnq0Var, mztVar, CommunityProfileContentItem.State.EMPTY, null, 4);
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    List<GiftItem> list4 = mztVar.j;
                    if (list4 != null) {
                        arrayList3.addAll(list4);
                    }
                    arrayList3.addAll(vKList);
                    int i3 = vKList.i();
                    boolean z4 = arrayList3.size() < i3;
                    izs<? super com.vk.profile.user.impl.ui.b, s3q0> izsVar = gnq0Var.h;
                    (izsVar != null ? izsVar : null).invoke(new b.c(mzt.i(mztVar, arrayList3, z4, i3, z3 ? CommunityProfileContentItem.State.LOADED : mztVar.p, z3 ? mztVar.r : CommunityProfileContentItem.State.LOADED, 696)));
                }
                return s3q0.a;
            default:
                final ckh ckhVar = new ckh((com.vk.video.ui.discovery.minimizable.g) this.c, (VideoFile) this.e, this.d, 3);
                ((Optional) obj).ifPresent(new Consumer() { // from class: xsna.dus0
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj2) {
                        ckh.this.invoke(obj2);
                    }
                });
                return s3q0.a;
        }
    }

    public /* synthetic */ l1r(Object obj, Object obj2, boolean z, int i) {
        this.b = i;
        this.c = obj;
        this.e = obj2;
        this.d = z;
    }

    public /* synthetic */ l1r(boolean z, azl azlVar, izs izsVar) {
        this.b = 2;
        this.d = z;
        this.c = azlVar;
        this.e = izsVar;
    }
}
