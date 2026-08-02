package xsna;

import android.content.Context;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.subscription.api.SubscribeStatus;
import com.vk.subscription.impl.RxUsersSubscriptionBusImpl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class w250 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w250(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((bk30) obj2).invoke(obj);
                break;
            case 1:
                ((ug8) obj2).invoke(obj);
                break;
            case 2:
                ((bk30) obj2).invoke(obj);
                break;
            case 3:
                ((z410) obj2).invoke(obj);
                break;
            case 4:
                ((bk30) obj2).invoke(obj);
                break;
            case 5:
                ((np80) obj2).invoke(obj);
                break;
            case 6:
                ((bk30) obj2).invoke(obj);
                break;
            case 7:
                ((a2a) obj2).invoke(obj);
                break;
            case 8:
                ((bk30) obj2).invoke(obj);
                break;
            case 9:
                ((cuc0) obj2).invoke(obj);
                break;
            case 10:
                ((bk30) obj2).invoke(obj);
                break;
            case 11:
                ((bk30) obj2).invoke(obj);
                break;
            case 12:
                ((xxh) obj2).invoke(obj);
                break;
            case 13:
                ((j4f0) obj2).e((k4f0) obj);
                break;
            case 14:
                ((izs) obj2).invoke(obj);
                break;
            case 15:
                ((r6i0) obj2).invoke(obj);
                break;
            case 16:
                ((aq1) obj2).invoke(obj);
                break;
            case 17:
                ((r6i0) obj2).invoke(obj);
                break;
            case 18:
                ((r6i0) obj2).invoke(obj);
                break;
            case 19:
                ((qdl0) obj2).invoke(obj);
                break;
            case 20:
                ((z410) obj2).invoke(obj);
                break;
            case 21:
                ((z410) obj2).invoke(obj);
                break;
            case 22:
                UserId userId = (UserId) obj2;
                t6g0 t6g0Var = t6g0.b;
                t6g0.b().a();
                RxUsersSubscriptionBusImpl m = xwk.e().T().m();
                SubscribeStatus subscribeStatus = SubscribeStatus.MEMBER_STATUS_MEMBER;
                m.b(new kym0(subscribeStatus, userId, null, Peer.Type.GROUP, 4));
                e4h h0 = xwk.e().h0();
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                h0.h(subscribeStatus.value, context, userId);
                break;
            case 23:
                ((agq0) obj2).invoke(obj);
                break;
            case 24:
                ((r6i0) obj2).invoke(obj);
                break;
            case 25:
                ((yka0) obj2).invoke(obj);
                break;
            case 26:
                ((cgh) obj2).invoke(obj);
                break;
            case 27:
                ((r6i0) obj2).invoke(obj);
                break;
            case 28:
                ((aq1) obj2).invoke(obj);
                break;
            default:
                ((r6i0) obj2).invoke(obj);
                break;
        }
    }
}
