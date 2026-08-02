package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: ArticlePickerRepositoryImpl.kt */
/* loaded from: classes2.dex */
public final class dp3 implements cp3 {
    public final fai a;

    public dp3(fai faiVar) {
        this.a = faiVar;
    }

    @Override // xsna.cp3
    public final io.reactivex.rxjava3.internal.operators.observable.f0 a(int i, UserId userId, int i2) {
        return rsg0.w0(yfb.x(this.a.f(userId, Integer.valueOf(i), Integer.valueOf(i2))));
    }
}
