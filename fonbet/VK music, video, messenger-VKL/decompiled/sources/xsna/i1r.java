package xsna;

import com.vk.dto.common.data.VKList;
import com.vk.dto.photo.Photo;
import com.vk.lists.c;
import kotlin.NoWhenBranchMatchedException;
import xsna.oap;

/* compiled from: FeedLikesPhotoPresenter.kt */
/* loaded from: classes4.dex */
public final class i1r extends vj6<Object> {
    public int l;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.fj6
    public final io.reactivex.rxjava3.core.q<VKList<Photo>> O(oap<Integer, String> oapVar, int i) {
        if (oapVar instanceof oap.b) {
            return rsg0.y0(new gqq((String) ((oap.b) oapVar).a, i), null, null, 3);
        }
        if (!(oapVar instanceof oap.a)) {
            throw new NoWhenBranchMatchedException();
        }
        b7l.a("You should use fave photos with start next pagination, because it allows load more photos than pagination with offset");
        return rsg0.y0(new gqq(((Number) ((oap.a) oapVar).a).intValue(), i), null, null, 3);
    }

    @Override // xsna.vj6
    public final int j7() {
        return this.l;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.vj6
    public final c.h u7() {
        c.h u7 = super.u7();
        u7.h = j5j.d;
        u7.f = (c.i) this.j.getValue();
        return u7;
    }
}
