package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.PhotoAlbum;

/* compiled from: AlbumPickerFeature.kt */
/* loaded from: classes18.dex */
public final class nj1 implements yf90 {
    public final /* synthetic */ oj1 a;

    public nj1(oj1 oj1Var) {
        this.a = oj1Var;
    }

    @Override // xsna.yf90
    public final io.reactivex.rxjava3.core.q<wia0<PhotoAlbum>> a(int i, int i2) {
        oj1 oj1Var = this.a;
        UserId userId = oj1Var.f;
        return new io.reactivex.rxjava3.internal.operators.single.o(oj1Var.g.c(i, userId, i2).l(new mj1(new lj1(oj1Var, userId, i), 0)), new w00(new tl0(oj1Var, 2), 2)).h(new y00(new com.vk.movika.sdk.base.hooks.p(oj1Var, 5), 2)).w();
    }
}
