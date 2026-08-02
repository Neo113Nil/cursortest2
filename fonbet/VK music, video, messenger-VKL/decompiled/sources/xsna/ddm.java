package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.core.store.entity.models.NotificationMention;
import com.vk.core.store.entity.models.NotificationMentions;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.messages.DraftMsg;
import java.util.ArrayList;
import kotlin.Pair;
import xsna.vqm;
import xsna.y320;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class ddm implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ddm(long j, NotificationMentions notificationMentions) {
        this.b = 2;
        this.c = j;
        this.d = notificationMentions;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                edm edmVar = (edm) this.d;
                long j = this.c;
                Serializer.c<Peer> cVar = Peer.CREATOR;
                Peer b = Peer.a.b(j);
                DraftMsg a = DraftMsg.a(((vqm.a) obj).a, 47);
                a1w a1wVar = q1w.a;
                if (a1wVar == null) {
                    a1wVar = null;
                }
                edmVar.a.b(a1wVar.C(edmVar, new swm(b, a, "DialogDraftUpdater")).subscribe());
                return s3q0.a;
            case 1:
                ((hpm) this.d).b.b().execSQL("\n            UPDATE dialogs\n            SET\n                keyboard_exists = 0,\n                keyboard_author_type = NULL, keyboard_author_id = NULL, keyboard_one_time = NULL,\n                keyboard_column_count = NULL, keyboard_buttons = NULL, keyboard_buttons = NULL,\n                keyboard_visible = 0\n            WHERE\n                id = ?\n                AND keyboard_exists = 1\n                AND keyboard_one_time = 1\n            ", new Long[]{Long.valueOf(this.c)});
                return s3q0.a;
            case 2:
                long j2 = this.c;
                NotificationMentions notificationMentions = (NotificationMentions) this.d;
                Pair pair = (Pair) obj;
                int intValue = ((Number) pair.d()).intValue();
                NotificationMention notificationMention = (NotificationMention) pair.g();
                y320 y320Var = y320.b;
                return new io.reactivex.rxjava3.internal.operators.maybe.e(io.reactivex.rxjava3.core.k.i(new y320.a(notificationMention.g(), notificationMention.i())), y320.c(j2, NotificationMentions.a(notificationMentions, rdi.A(intValue, notificationMentions.d()))));
            default:
                ArrayList arrayList = (ArrayList) this.d;
                long j3 = this.c;
                xgl0 xgl0Var = (xgl0) obj;
                rey k = xgl0Var.k();
                k.getClass();
                k.k(kvf.a(arrayList).toString(), "friends_suggestions_ids");
                xgl0Var.k().j("friends_suggestions_sync_time", j3);
                return s3q0.a;
        }
    }

    public /* synthetic */ ddm(Object obj, long j, int i) {
        this.b = i;
        this.d = obj;
        this.c = j;
    }
}
