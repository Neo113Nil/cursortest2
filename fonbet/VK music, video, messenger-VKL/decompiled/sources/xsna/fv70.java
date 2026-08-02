package xsna;

import android.content.Context;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.impl.posting.attachments.PostingAttachLocationFragment;
import com.vk.subscription.api.SubscribeStatus;
import com.vk.subscription.impl.RxUsersSubscriptionBusImpl;
import xsna.cpk0;
import xsna.v6i0;
import xsna.y6i0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class fv70 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fv70(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                el50 el50Var = (el50) obj2;
                el50Var.D(el50Var, new v4w((ib50) obj, 14));
                break;
            case 1:
                ((rm0) obj2).invoke(obj);
                break;
            case 2:
                ((es00) obj2).invoke(obj);
                break;
            case 3:
                ((wv2) obj2).invoke(obj);
                break;
            case 4:
                ((ogd) obj2).invoke(obj);
                break;
            case 5:
                int i2 = PostingAttachLocationFragment.I0;
                ((es00) obj2).invoke(obj);
                break;
            case 6:
                ((es00) obj2).invoke(obj);
                break;
            case 7:
                ((bw6) obj2).invoke(obj);
                break;
            case 8:
                ((es00) obj2).invoke(obj);
                break;
            case 9:
                ((ogd) obj2).invoke(obj);
                break;
            case 10:
                ((s6i0) obj2).n(new y6i0.b(new v6i0.b((Throwable) obj)));
                break;
            case 11:
                ((ug8) obj2).invoke(obj);
                break;
            case 12:
                ((au6) obj2).invoke(obj);
                break;
            case 13:
                ((ab) obj2).invoke(obj);
                break;
            case 14:
                ((waf0) obj2).invoke(obj);
                break;
            case 15:
                ((cpk0.c) obj2).invoke(obj);
                break;
            case 16:
                ((nc90) obj2).invoke(obj);
                break;
            case 17:
                ((waf0) obj2).invoke(obj);
                break;
            case 18:
                UserId userId = (UserId) obj2;
                t6g0 t6g0Var = t6g0.b;
                t6g0.b().a();
                RxUsersSubscriptionBusImpl m = xwk.e().T().m();
                SubscribeStatus subscribeStatus = SubscribeStatus.MEMBER_STATUS_NOT_MEMBER;
                m.b(new kym0(subscribeStatus, userId, null, Peer.Type.GROUP, 4));
                e4h h0 = xwk.e().h0();
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                h0.h(subscribeStatus.value, context, userId);
                break;
            case 19:
                ((waf0) obj2).invoke(obj);
                break;
            case 20:
                ((waf0) obj2).invoke(obj);
                break;
            case 21:
                ((ogd) obj2).invoke(obj);
                break;
            case 22:
                ((waf0) obj2).invoke(obj);
                break;
            case 23:
                ((jv2) obj2).invoke(obj);
                break;
            case 24:
                ((nc90) obj2).invoke(obj);
                break;
            case 25:
                ((waf0) obj2).invoke(obj);
                break;
            case 26:
                ((waf0) obj2).invoke(obj);
                break;
            case 27:
                ((waf0) obj2).invoke(obj);
                break;
            case 28:
                ((nc90) obj2).invoke(obj);
                break;
            default:
                ((sys0) obj2).invoke(obj);
                break;
        }
    }
}
