package xsna;

import com.vk.api.base.VkPaginationList;
import com.vk.dto.user.RequestUserProfile;
import com.vk.lists.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import xsna.r1r0;

/* compiled from: BasePagedFriendsDataProvider.kt */
/* loaded from: classes15.dex */
public abstract class yi6 implements c.l<VkPaginationList<RequestUserProfile>> {
    public final uuk<nqs> b;
    public io.reactivex.rxjava3.disposables.c c;
    public final j2r0 d = new j2r0();
    public final Object e = msy.a(LazyThreadSafetyMode.NONE, new xu0(3));
    public final bpn0 f = new bpn0(new yv2(3));

    public yi6(uuk<nqs> uukVar) {
        this.b = uukVar;
    }

    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, kotlin.Lazy] */
    public final io.reactivex.rxjava3.internal.operators.single.r a(int i, int i2, ArrayList arrayList, List list) {
        int i3 = i2 + i;
        int size = list.size();
        if (i3 > size) {
            i3 = size;
        }
        return new io.reactivex.rxjava3.internal.operators.single.r(rsg0.W(yfb.x(r1r0.a.b((s1r0) this.e.getValue(), i > e43.h(list) ? EmptyList.b : list.subList(i, i3), arrayList, null, null, 58)), 7), new l8(new wi6(this, list, i, 0), 6));
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<VkPaginationList<RequestUserProfile>> hj(com.vk.lists.c cVar, boolean z) {
        cVar.r(true);
        io.reactivex.rxjava3.disposables.c cVar2 = this.c;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        b();
        return ui(0, cVar);
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<VkPaginationList<RequestUserProfile>> qVar, boolean z, com.vk.lists.c cVar) {
        this.c = qVar.a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new io1(new vi6(cVar, z, this), 5));
    }

    public void b() {
    }
}
