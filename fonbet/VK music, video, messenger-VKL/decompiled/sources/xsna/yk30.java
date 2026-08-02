package xsna;

import android.content.Context;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;
import java.util.Collections;
import xsna.ikv0;
import xsna.tlo0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class yk30 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yk30(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        int i2 = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                com.vk.im.ui.components.msg_list.a aVar = (com.vk.im.ui.components.msg_list.a) obj2;
                if (((Boolean) obj).booleanValue()) {
                    Context context = aVar.k;
                    tlo0.f h = tq.h(tlo0.Companion, R.string.vkim_already_downloaded);
                    ikv0.a aVar2 = new ikv0.a(context);
                    aVar2.u = new ikv0.d(new ikv0.d.c(tlo0.b.a(h, context).toString()), (ikv0.d.b) null, (ikv0.d.a) null, 6);
                    aVar2.n();
                }
                a1w a1wVar = aVar.l;
                Serializer.c<Peer> cVar = Peer.CREATOR;
                return a1wVar.C("MsgListComponentNew", new mi30(Peer.a.b(aVar.n), Collections.singletonList(Integer.valueOf(i2)))).q(asu0.a.c());
            default:
                UserId userId = (UserId) obj2;
                qyg0 V0 = ((hyg0) obj).V0("UPDATE story_statistics_viewers_meta SET new_reactions=0 WHERE owner_id = ? AND story_id = ?");
                try {
                    bpn0 bpn0Var = bfm0.a;
                    V0.bindLong(1, userId.b);
                    V0.bindLong(2, i2);
                    V0.step();
                    V0.close();
                    return s3q0.a;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
        }
    }
}
