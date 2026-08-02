package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: AlbumPickerRepositoryImpl.kt */
/* loaded from: classes2.dex */
public final class zj1 implements yj1 {
    public final aha0 a;
    public final tfa0 b = tfa0.a;

    public zj1(aha0 aha0Var) {
        this.a = aha0Var;
    }

    @Override // xsna.yj1
    public final io.reactivex.rxjava3.internal.operators.single.y c(int i, UserId userId, int i2) {
        return rsg0.w0(yfb.x(zga0.c(this.a, userId, null, Integer.valueOf(i), Integer.valueOf(i2), Boolean.FALSE, 6))).l(new c7(new i50(this, 1), 3));
    }
}
