package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: CommunityCheckListRepositoryImpl.kt */
/* loaded from: classes18.dex */
public final class qwg {
    public final zqu a;
    public final jwg b;

    public qwg(zqu zquVar, jwg jwgVar) {
        this.a = zquVar;
        this.b = jwgVar;
    }

    public final io.reactivex.rxjava3.internal.operators.single.y a(UserId userId) {
        UserId a = fkq0.a(userId);
        this.a.getClass();
        tfx tfxVar = new tfx("groups.getRecommendedTipsList", new k73(15), new pm0(16));
        tfx.n(tfxVar, "group_id", a, 1L, 0L, 8);
        return rsg0.w0(yfb.x(tfxVar)).l(new u5(new mf8(this.b, 4), 7));
    }
}
