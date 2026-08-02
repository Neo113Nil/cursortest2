package xsna;

import com.vk.dto.common.data.VKList;
import com.vk.dto.photo.Photo;

/* compiled from: BasePhotoListPresenter.kt */
/* loaded from: classes4.dex */
public final class uj6 implements od90<ucv0> {
    public final /* synthetic */ wj6<ij6<?>> a;

    public uj6(wj6<ij6<?>> wj6Var) {
        this.a = wj6Var;
    }

    @Override // xsna.od90
    public final io.reactivex.rxjava3.core.q<VKList<ucv0>> a(oap<Integer, String> oapVar, int i) {
        wj6<ij6<?>> wj6Var = this.a;
        io.reactivex.rxjava3.core.q<VKList<Photo>> O = wj6Var.O(oapVar, i);
        asu0 asu0Var = asu0.a;
        return O.a0(asu0Var.c()).U(new w7(new jy(wj6Var, 11), 5)).a0(asu0Var.d());
    }
}
