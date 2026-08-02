package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: ServicesService.kt */
/* loaded from: classes2.dex */
public interface isi0 {
    default tfx a(UserId userId) {
        tfx tfxVar = new tfx("services.getServices", new gp(29), new eq0(25));
        tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
        return tfxVar;
    }
}
