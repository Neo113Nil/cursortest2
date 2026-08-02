package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: OwnersService.kt */
/* loaded from: classes2.dex */
public interface c690 {
    default tfx a(UserId userId) {
        tfx tfxVar = new tfx("owners.hideMenu", new a690(0), new v11(23));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        return tfxVar;
    }

    default tfx b(int i, UserId userId) {
        tfx tfxVar = new tfx("owners.showMenuItem", new to(25), new t11(28));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "item_id", i, 1, 0, 8);
        return tfxVar;
    }

    default tfx c(int i, UserId userId) {
        tfx tfxVar = new tfx("owners.deleteMenuItem", new bt(24), new ct(21));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "item_id", i, 1, 0, 8);
        return tfxVar;
    }

    default tfx d(int i, UserId userId) {
        tfx tfxVar = new tfx("owners.hideMenuItem", new com.vk.movika.sdk.base.model.n(22), new eq(25));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "item_id", i, 1, 0, 8);
        return tfxVar;
    }
}
