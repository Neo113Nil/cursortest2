package xsna;

import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.lists.c;

/* compiled from: PhotoFlowPagedDataProviderDelegate.kt */
/* loaded from: classes4.dex */
public final class b8a0 implements c.m<VKList<Photo>> {
    public final UserId b;
    public final f8a0 c;
    public final h630 d;

    public b8a0(UserId userId, f8a0 f8a0Var, h630 h630Var) {
        this.b = userId;
        this.c = f8a0Var;
        this.d = h630Var;
    }

    @Override // com.vk.lists.c.m
    public final io.reactivex.rxjava3.core.q<VKList<Photo>> O9(String str, com.vk.lists.c cVar) {
        return f8a0.g(this.c, this.b, str, null, 26).a0(asu0.a.d());
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<VKList<Photo>> hj(com.vk.lists.c cVar, boolean z) {
        return O9("0", cVar);
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<VKList<Photo>> qVar, boolean z, com.vk.lists.c cVar) {
        int i = 1;
        qVar.subscribe(new ca10(new r6h(cVar, this, z, 1), 7), new j990(new ve40(this, z, i), i));
    }
}
