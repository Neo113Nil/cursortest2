package xsna;

import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.lists.c;
import com.vk.photos.root.albumdetails.presentation.AlbumDetailsFragment;
import com.vk.photos.root.albumdetails.presentation.a;
import xsna.xn50;

/* compiled from: AlbumDetailsPagedDataProviderWithStartFrom.kt */
/* loaded from: classes4.dex */
public final class oh1 implements c.m<VKList<Photo>> {
    public final UserId b;
    public final int c;
    public final ch1 d;
    public final AlbumDetailsFragment e;

    public oh1(UserId userId, int i, ch1 ch1Var, AlbumDetailsFragment albumDetailsFragment) {
        this.b = userId;
        this.c = i;
        this.d = ch1Var;
        this.e = albumDetailsFragment;
    }

    @Override // com.vk.lists.c.m
    public final io.reactivex.rxjava3.core.q<VKList<Photo>> O9(String str, com.vk.lists.c cVar) {
        xn50.a.c(this.e, new a.p(false));
        return this.d.d(this.c, this.b, cVar.k(), str).a0(asu0.a.d());
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<VKList<Photo>> hj(com.vk.lists.c cVar, boolean z) {
        xn50.a.c(this.e, new a.p(true));
        return this.d.d(this.c, this.b, cVar.k(), "").a0(asu0.a.d());
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<VKList<Photo>> qVar, boolean z, com.vk.lists.c cVar) {
        qVar.subscribe(new bg1(new mh1(cVar, this, z, 0), 1), new hz(new nh1(this, z, 0), 3));
    }
}
