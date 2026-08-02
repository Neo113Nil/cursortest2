package xsna;

import android.content.Context;
import android.view.View;
import android.view.Window;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.AdminLeaveAction;
import com.vk.dto.user.SocialButtonType;
import com.vk.subscription.api.SubscribeStatus;
import com.vk.subscription.impl.RxUsersSubscriptionBusImpl;
import com.vkontakte.android.data.groups.FullSourceJoinApi;
import io.reactivex.rxjava3.internal.functions.a;

/* compiled from: SubscribeHelper.kt */
/* loaded from: classes11.dex */
public interface zvm0 {
    static io.reactivex.rxjava3.core.q g(final kwm0 kwm0Var, final UserId userId, String str, String str2, AdminLeaveAction adminLeaveAction, int i) {
        String str3 = (i & 4) != 0 ? null : str2;
        if (!fkq0.d(userId)) {
            return kwm0.r(rsg0.T(new hqu(fkq0.e(userId), str3, str, adminLeaveAction, (String) null)), new io.reactivex.rxjava3.functions.f() { // from class: xsna.cwm0
                @Override // io.reactivex.rxjava3.functions.f
                public final void accept(Object obj) {
                    t6g0 t6g0Var = t6g0.b;
                    t6g0.b().a();
                    RxUsersSubscriptionBusImpl rxUsersSubscriptionBusImpl = kwm0.this.a;
                    SubscribeStatus subscribeStatus = SubscribeStatus.MEMBER_STATUS_NOT_MEMBER;
                    Peer.Type type = Peer.Type.GROUP;
                    UserId userId2 = userId;
                    rxUsersSubscriptionBusImpl.b(new kym0(subscribeStatus, userId2, null, type, 4));
                    e4h h0 = xwk.e().h0();
                    Context context = e43.a;
                    if (context == null) {
                        context = null;
                    }
                    h0.h(subscribeStatus.value, context, userId2);
                }
            });
        }
        eos eosVar = new eos(userId, 0);
        eosVar.H0(str);
        io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(eosVar, null, null, 3);
        n240 n240Var = new n240(new whi0(5, kwm0Var, userId), 21);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return y0.E(n240Var, lVar, kVar, kVar).U(new jh(new gz30(21), 27));
    }

    static /* synthetic */ io.reactivex.rxjava3.core.q h(zvm0 zvm0Var, UserId userId, boolean z, String str, String str2, FullSourceJoinApi fullSourceJoinApi, AdminLeaveAction adminLeaveAction, String str3, String str4, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 16) != 0) {
            str2 = null;
        }
        if ((i & 32) != 0) {
            fullSourceJoinApi = null;
        }
        if ((i & 64) != 0) {
            adminLeaveAction = null;
        }
        if ((i & 128) != 0) {
            str3 = null;
        }
        String str5 = (i & 256) != 0 ? null : str4;
        return zvm0Var.d(userId, z, str, true, str2, fullSourceJoinApi, adminLeaveAction, str3, str5);
    }

    static /* synthetic */ boolean k(zvm0 zvm0Var, Context context, Window window, boolean z, boolean z2, int i) {
        if ((i & 2) != 0) {
            window = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        zvm0Var.b(context, window, z);
        return true;
    }

    io.reactivex.rxjava3.core.q a(UserId userId, boolean z, String str, boolean z2, FullSourceJoinApi fullSourceJoinApi);

    void b(Context context, Window window, boolean z);

    void c(View view, UserId userId, int i, boolean z, String str, String str2, izs<? super UserId, s3q0> izsVar, izs<? super UserId, s3q0> izsVar2);

    io.reactivex.rxjava3.internal.operators.observable.b0 d(UserId userId, boolean z, String str, boolean z2, String str2, FullSourceJoinApi fullSourceJoinApi, AdminLeaveAction adminLeaveAction, String str3, String str4);

    void e(long j, Context context, UserId userId, SocialButtonType socialButtonType, FullSourceJoinApi fullSourceJoinApi, String str, String str2, izs izsVar, izs izsVar2, boolean z, boolean z2);

    io.reactivex.rxjava3.internal.operators.mixed.f i(Context context, UserId userId);

    void j(View view, UserId userId, boolean z, String str, String str2, boolean z2, izs izsVar, izs izsVar2, Context context, SocialButtonType socialButtonType);

    io.reactivex.rxjava3.internal.operators.observable.b0 l(UserId userId, String str, String str2, AdminLeaveAction adminLeaveAction, String str3);

    RxUsersSubscriptionBusImpl m();

    io.reactivex.rxjava3.internal.operators.observable.j1 n(UserId userId, boolean z, String str, String str2);
}
