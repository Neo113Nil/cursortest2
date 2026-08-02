package xsna;

import com.vk.dto.common.data.VKList;
import com.vk.dto.photo.Photo;
import com.vk.lists.c;

/* compiled from: ArchivePagedDataProviderDelegate.kt */
/* loaded from: classes4.dex */
public final class ki3 implements c.m<VKList<Photo>> {
    public final vi3 b;
    public final io.reactivex.rxjava3.disposables.b c;
    public final ix2 d;

    public ki3(vi3 vi3Var, io.reactivex.rxjava3.disposables.b bVar, ix2 ix2Var) {
        this.b = vi3Var;
        this.c = bVar;
        this.d = ix2Var;
    }

    @Override // com.vk.lists.c.m
    public final io.reactivex.rxjava3.core.q<VKList<Photo>> O9(String str, com.vk.lists.c cVar) {
        return this.b.c(str);
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<VKList<Photo>> hj(com.vk.lists.c cVar, boolean z) {
        return new io.reactivex.rxjava3.internal.operators.observable.c0(this.b.c("0"), new sf(new hi3(this, z, 0), 2), io.reactivex.rxjava3.internal.functions.a.c);
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<VKList<Photo>> qVar, boolean z, com.vk.lists.c cVar) {
        int i = 0;
        this.c.b(qVar.subscribe(new tf(new ii3(cVar, this, z, i), 2), new ji3(new g20(this, 3), i)));
    }
}
