package xsna;

import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.List;
import xsna.p53;
import xsna.tg20;

/* compiled from: GeneratedSuperappApi.kt */
/* loaded from: classes6.dex */
public final class pit implements jfn0 {
    public final bpn0 a = new bpn0(new kk1(10));

    @Override // xsna.jfn0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 a(long j, UserId userId, ArrayList arrayList) {
        UserId userId2 = new UserId(j);
        ArrayList a = p53.a.a(arrayList);
        ArrayList b = p53.a.b(arrayList);
        ufx ufxVar = new ufx("messages.isMessagesFromGroupAllowed", new kr(27), new lr(23));
        ufx.m(ufxVar, "group_id", userId2, 1L, 8);
        ufx.m(ufxVar, "user_id", userId, 1L, 8);
        ufxVar.h("intents", a);
        ufxVar.h("subscribe_ids", b);
        return rdx0.u(e370.e(ufxVar)).U(new n7(new wd8(1, (fg20) this.a.getValue(), fg20.class, "mapToWebGroupMessageStatus", "mapToWebGroupMessageStatus(Lcom/vk/api/generated/messages/dto/MessagesIsMessagesFromGroupAllowedResponseDto;)Lcom/vk/superapp/api/dto/group/WebGroupMessageStatus;", 0, 8), 26));
    }

    @Override // xsna.jfn0
    public final io.reactivex.rxjava3.internal.operators.single.y b(long j, String str) {
        xy2 l;
        l = new ug20().l(0, new UserId(j), (r50 & 64) != 0 ? null : null, (r50 & 128) != 0 ? null : null, (r50 & 2048) != 0 ? null : null, (r50 & 4096) != 0 ? null : null, (r50 & 8192) != 0 ? null : null, (r50 & 16384) != 0 ? null : null, (32768 & r50) != 0 ? null : null, (65536 & r50) != 0 ? null : null, (262144 & r50) != 0 ? null : null, (1048576 & r50) != 0 ? null : str, (2097152 & r50) != 0 ? null : null, (16777216 & r50) != 0 ? null : null, (33554432 & r50) != 0 ? null : null, (67108864 & r50) != 0 ? null : null, (134217728 & r50) != 0 ? null : null, (r50 & 268435456) != 0 ? null : null, (r51 & 2) != 0 ? null : null, (r51 & 4) != 0 ? null : null, (r51 & 8) != 0 ? null : null, (r51 & 1024) != 0 ? null : null);
        return rdx0.B(e370.e(l)).l(new l7(new wh6(28), 26));
    }

    @Override // xsna.jfn0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 c(long j, long j2, String str, List list) {
        return rdx0.u(e370.e(tg20.a.a(new UserId(j2), null, (192 & 4) != 0 ? null : str, (192 & 8) != 0 ? null : Integer.valueOf((int) j), (192 & 16) != 0 ? null : p53.a.a(list), (192 & 32) != 0 ? null : p53.a.b(list), null))).U(new j7(new qt0(29), 27));
    }
}
