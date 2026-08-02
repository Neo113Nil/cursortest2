package xsna;

import com.vk.dto.common.data.VKList;
import com.vk.dto.photo.Photo;

/* compiled from: BasePhotoListPresenter.kt */
/* loaded from: classes3.dex */
public final class tj6 implements od90<Photo> {
    public final /* synthetic */ vj6<hj6<?>> a;

    public tj6(vj6<hj6<?>> vj6Var) {
        this.a = vj6Var;
    }

    @Override // xsna.od90
    public final io.reactivex.rxjava3.core.q<VKList<Photo>> a(oap<Integer, String> oapVar, int i) {
        return this.a.O(oapVar, i);
    }
}
