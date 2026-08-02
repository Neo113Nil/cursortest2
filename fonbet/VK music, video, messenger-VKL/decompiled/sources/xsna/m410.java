package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: MarketItemReviewsInteractor.kt */
/* loaded from: classes18.dex */
public final class m410 {
    public final t410 a;
    public final hoz b;
    public final fy2 c;
    public final o210 d;

    public m410(t410 t410Var, hoz hozVar, fy2 fy2Var, o210 o210Var) {
        this.a = t410Var;
        this.b = hozVar;
        this.c = fy2Var;
        this.d = o210Var;
    }

    public final io.reactivex.rxjava3.internal.operators.single.y a(int i, long j, UserId userId, String str, String str2) {
        return this.a.b(userId, j, 30, new rpz(Integer.valueOf(i), str, str2)).l(new mj1(new ozh(this, 28), 27));
    }
}
