package xsna;

import com.ironsource.X3;
import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.live.api.view.BroadcastContract$State;
import com.vk.toggle.features.ComFeatures;
import java.util.Arrays;
import java.util.Collections;
import xsna.wqu;

/* compiled from: BroadcastPresenter.java */
/* loaded from: classes3.dex */
public final class sh8 extends io.reactivex.rxjava3.observers.a<Long> {
    public final /* synthetic */ qh8 c;

    public sh8(qh8 qh8Var) {
        this.c = qh8Var;
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onComplete() {
        io.reactivex.rxjava3.core.q H0;
        io.reactivex.rxjava3.internal.operators.observable.m1 y0;
        qh8 qh8Var = this.c;
        ymz ymzVar = qh8Var.d;
        anz anzVar = qh8Var.c;
        qh8Var.g.S(true);
        uh8 uh8Var = qh8Var.u;
        if (uh8Var != null) {
            uh8Var.dispose();
            qh8Var.u = null;
        }
        io.reactivex.rxjava3.internal.operators.observable.m1 g = qhp0.a().g(qh8Var.q);
        io.reactivex.rxjava3.core.q<rit0> j = anzVar.j();
        io.reactivex.rxjava3.core.q<vqk0> p = anzVar.p(new wqk0(qh8Var.p, qh8Var.l, qh8Var.q, anzVar.y(), anzVar.n(), qh8Var.t, qh8Var.d0, qh8Var.h0));
        if (fkq0.b(qh8Var.q)) {
            UserId e = fkq0.e(qh8Var.q);
            ymzVar.getClass();
            ComFeatures comFeatures = ComFeatures.COM_GROUPS_GETBYID_CODEGEN;
            comFeatures.getClass();
            if (com.vk.toggle.b.A.a(comFeatures)) {
                fz2 y = yfb.y(wqu.a.a(null, Collections.singletonList(fkq0.a(e)), Arrays.asList(GroupsFieldsDto.CAN_UPLOAD_STORY, GroupsFieldsDto.MEMBERS_COUNT, GroupsFieldsDto.VERIFIED, GroupsFieldsDto.TRENDING, GroupsFieldsDto.IS_CLOSED, GroupsFieldsDto.START_DATE, GroupsFieldsDto.CAN_MESSAGE, GroupsFieldsDto.IS_MESSAGES_BLOCKED, GroupsFieldsDto.MEMBER_STATUS, GroupsFieldsDto.BAN_INFO)), new kpr(3));
                ahn.D(y);
                y0 = rsg0.y0(y, null, null, 3);
            } else {
                y0 = rsg0.y0(new rpu(e, new String[]{"can_upload_story", "members_count", "verified", "trending", "is_closed", "start_date", "can_message", "is_messages_blocked", "member_status", "ban_info"}), null, null, 3);
            }
            H0 = io.reactivex.rxjava3.core.q.H0(p, y0, j, g, new dg1(qh8Var, 5));
        } else {
            UserId userId = qh8Var.q;
            ymzVar.getClass();
            H0 = io.reactivex.rxjava3.core.q.H0(p, rsg0.y0(new z0r0(Collections.singletonList(userId), new String[]{"first_name", "verified", "trending", "last_name", "trending", "trending", "photo_base", "name", "friend_status", "is_friend", "sex", X3.j.D}), null, null, 3).L(new hg10(2), false), j, g, new pj4(qh8Var, 6));
        }
        io.reactivex.rxjava3.core.q L = H0.L(new vh8(qh8Var), false);
        uh8 uh8Var2 = new uh8(qh8Var);
        L.subscribe(uh8Var2);
        qh8Var.u = uh8Var2;
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onError(Throwable th) {
        BroadcastContract$State broadcastContract$State = BroadcastContract$State.MODEL_ERROR;
        qh8 qh8Var = this.c;
        qh8Var.Q(broadcastContract$State);
        qh8Var.d();
    }

    @Override // io.reactivex.rxjava3.core.v
    public final /* bridge */ /* synthetic */ void onNext(Object obj) {
    }
}
