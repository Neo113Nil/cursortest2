package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import java.util.List;

/* compiled from: AlbumDetailsInteractorImpl.kt */
/* loaded from: classes4.dex */
public final class eh1 implements ch1 {
    public final xh1 a;
    public boolean b = true;

    public eh1(xh1 xh1Var) {
        this.a = xh1Var;
    }

    @Override // xsna.ch1
    public final io.reactivex.rxjava3.core.x<Integer> a(UserId userId, List<? extends Photo> list) {
        return this.a.a(userId, list);
    }

    @Override // xsna.ch1
    public final io.reactivex.rxjava3.internal.operators.completable.w b() {
        return io.reactivex.rxjava3.internal.operators.completable.i.b.g(new dh1(this, 0));
    }

    @Override // xsna.ch1
    public final io.reactivex.rxjava3.core.x<Integer> c(UserId userId, int i, List<? extends Photo> list) {
        return this.a.b(userId, i, list);
    }

    @Override // xsna.ch1
    public final io.reactivex.rxjava3.internal.operators.observable.l2 d(int i, UserId userId, int i2, String str) {
        return this.a.c(userId, i, i2, str, this.b).r0(asu0.a.c());
    }
}
