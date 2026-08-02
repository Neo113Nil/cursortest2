package xsna;

import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.dto.common.id.UserId;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import xsna.xqu;

/* compiled from: DocumentsStorage.kt */
/* loaded from: classes18.dex */
public final class dvn {
    public static io.reactivex.rxjava3.core.q a(UserId userId) {
        io.reactivex.rxjava3.core.t T;
        tfx tfxVar = new tfx("docs.getTypes", new ar(12), new br(15));
        if (userId != null) {
            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        }
        io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(yfb.x(tfxVar), null, null, 3);
        tfx tfxVar2 = new tfx("docs.get", new cr(12), new io.reactivex.rxjava3.internal.operators.observable.n0(20));
        tfx.l(tfxVar2, "count", 100, 0, 0, 8);
        if (userId != null) {
            tfx.n(tfxVar2, "owner_id", userId, 0L, 0L, 12);
        }
        io.reactivex.rxjava3.internal.operators.observable.j1 U = rsg0.y0(yfb.x(tfxVar2), null, null, 3).U(new io.reactivex.rxjava3.processors.b(new y40(27), 14));
        if (fkq0.b(userId)) {
            List singletonList = Collections.singletonList(fkq0.e(userId));
            List singletonList2 = Collections.singletonList(GroupsFieldsDto.CAN_UPLOAD_DOC);
            if ((4 & 2) != 0) {
                singletonList2 = null;
            }
            T = rsg0.y0(yfb.x(xqu.a.a(null, singletonList, singletonList2)), null, null, 3).U(new io.reactivex.rxjava3.subjects.c(new ci7(20), 16));
        } else {
            T = io.reactivex.rxjava3.core.q.T(Optional.empty());
        }
        return io.reactivex.rxjava3.core.q.I0(y0, T, new ux0(new cv4(U, 2), 24)).L(new rf3(new av70(11), 9), false);
    }
}
