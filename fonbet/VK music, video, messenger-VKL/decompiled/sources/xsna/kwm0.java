package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Size;
import android.view.View;
import android.view.Window;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.AdminLeaveAction;
import com.vk.dto.user.SocialButtonType;
import com.vk.subscription.impl.RxUsersSubscriptionBusImpl;
import com.vk.toggle.features.ComFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.data.groups.FullSourceJoinApi;
import io.reactivex.rxjava3.internal.functions.a;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ikv0;
import xsna.yqu;

/* compiled from: SubscribeHelperImpl.kt */
/* loaded from: classes11.dex */
public final class kwm0 implements zvm0 {
    public final RxUsersSubscriptionBusImpl a = new RxUsersSubscriptionBusImpl();
    public final boolean b;

    /* compiled from: SubscribeHelperImpl.kt */
    /* loaded from: classes6.dex */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        public static final a b = new a(1, h03.class, "showToastError", "showToastError(Ljava/lang/Throwable;)V", 1);

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            h03.b(th);
            return s3q0.a;
        }
    }

    /* compiled from: SubscribeHelperImpl.kt */
    /* loaded from: classes6.dex */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        public static final b b = new b(1, h03.class, "showToastError", "showToastError(Ljava/lang/Throwable;)V", 1);

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            h03.b(th);
            return s3q0.a;
        }
    }

    /* compiled from: SubscribeHelperImpl.kt */
    /* loaded from: classes6.dex */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        public static final c b = new c(1, h03.class, "showToastError", "showToastError(Ljava/lang/Throwable;)V", 1);

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            h03.b(th);
            return s3q0.a;
        }
    }

    /* compiled from: SubscribeHelperImpl.kt */
    /* loaded from: classes6.dex */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        public static final d b = new d(1, h03.class, "showToastError", "showToastError(Ljava/lang/Throwable;)V", 1);

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            h03.b(th);
            return s3q0.a;
        }
    }

    public kwm0() {
        ComFeatures comFeatures = ComFeatures.COM_JOIN_FULL_SOURCE;
        comFeatures.getClass();
        this.b = com.vk.toggle.b.A.a(comFeatures);
    }

    @SuppressLint({"CheckResult"})
    public static void p(Context context, UserId userId, String str, long j, AdminLeaveAction adminLeaveAction, izs izsVar) {
        io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(new hqu(userId, str, (String) null, adminLeaveAction, 20), null, null, 3);
        tk40 tk40Var = new tk40(new k990(22), 18);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        hg1.m(y0.E(tk40Var, lVar, kVar, kVar), context, j, false, 60).subscribe(new m5y(new ync(izsVar, userId, context, 10), 29), new uk40(b.b, 17));
    }

    public static /* synthetic */ void q(kwm0 kwm0Var, Context context, UserId userId, String str, long j, AdminLeaveAction adminLeaveAction, izs izsVar, int i) {
        if ((i & 8) != 0) {
            j = 300;
        }
        long j2 = j;
        if ((i & 16) != 0) {
            adminLeaveAction = null;
        }
        kwm0Var.getClass();
        p(context, userId, str, j2, adminLeaveAction, izsVar);
    }

    public static io.reactivex.rxjava3.internal.operators.observable.b0 r(io.reactivex.rxjava3.internal.operators.observable.m1 m1Var, io.reactivex.rxjava3.functions.f fVar) {
        be50 be50Var = new be50(new mga0(fVar, 21), 18);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return m1Var.E(be50Var, lVar, kVar, kVar);
    }

    @SuppressLint({"CheckResult"})
    public static void s(Context context, UserId userId, long j, izs izsVar) {
        hg1.m(rsg0.y0(new eos(userId, 0), null, null, 3), context, j, false, 60).subscribe(new cx00(new hcf0(3, izsVar, userId), 27), new h8l0(c.b, 2));
    }

    @Override // xsna.zvm0
    public final io.reactivex.rxjava3.core.q a(UserId userId, boolean z, String str, boolean z2, FullSourceJoinApi fullSourceJoinApi) {
        rsg0 rsg0Var;
        if (z) {
            return zvm0.g(this, userId, str, null, null, 20);
        }
        String str2 = null;
        if (fkq0.d(userId)) {
            yjs yjsVar = new yjs(userId, (String) null);
            yjsVar.H0(str);
            io.reactivex.rxjava3.internal.operators.observable.m1 T = rsg0.T(yjsVar);
            fs00 fs00Var = new fs00(new gda0(this, userId), 28);
            a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
            a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
            return T.E(fs00Var, lVar, kVar, kVar).U(new joi0(new gz30(21)));
        }
        ComFeatures comFeatures = ComFeatures.COM_CODEGEN_GROUPS_JOIN;
        comFeatures.getClass();
        boolean a2 = com.vk.toggle.b.A.a(comFeatures);
        boolean z3 = this.b;
        if (a2) {
            zqu zquVar = new zqu();
            UserId a3 = fkq0.a(userId);
            String g = zm00.g(!z2);
            if (z3 && fullSourceJoinApi != null) {
                str2 = fullSourceJoinApi.a();
            }
            rsg0Var = yfb.y(yqu.a.c(zquVar, a3, g, null, str, null, null, null, str2, 244), new p7x(27));
        } else {
            gqu gquVar = new gqu(fkq0.e(userId), !z2, z3, 60);
            gquVar.U0(str);
            gquVar.N0(fullSourceJoinApi);
            rsg0Var = gquVar;
        }
        return r(rsg0.T(rsg0Var), new f5y(userId, 28));
    }

    @Override // xsna.zvm0
    public final void b(Context context, Window window, boolean z) {
        Window y = window == null ? s200.y(context) : window;
        if (y != null) {
            int i = ikv0.e;
            ikv0.b.a(y);
        }
        int i2 = z ? R.string.friends_add_subscription_success_message : R.string.friends_add_success_message_old;
        ikv0.a aVar = new ikv0.a(context);
        aVar.h(new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_filled_blue_24, (Integer) null, (Size) null, 14));
        aVar.i(new ikv0.d(context.getString(i2), (String) null, (ikv0.d.a) null, 6));
        if (window != null) {
            aVar.p(window);
        } else {
            aVar.n();
        }
    }

    @Override // xsna.zvm0
    public final void c(final View view, final UserId userId, int i, boolean z, final String str, final String str2, final izs<? super UserId, s3q0> izsVar, final izs<? super UserId, s3q0> izsVar2) {
        e.b a2;
        e.b bVar;
        if (userId.b >= 0) {
            throw new IllegalArgumentException(b4q.b(userId, "Event id must be negative. Id provided: "));
        }
        if (i == 0) {
            t(view.getContext(), fkq0.e(userId), false, str, str2, 300L, null, izsVar);
            return;
        }
        final boolean z2 = i == 2;
        a2 = VkContextMenu.e.a(krv0.l(R.attr.vk_ui_icon_accent), view);
        if (z) {
            gzs gzsVar = new gzs() { // from class: xsna.iwm0
                @Override // xsna.gzs
                public final Object invoke() {
                    kwm0.q(this, view.getContext(), fkq0.e(userId), str, 0L, null, izsVar2, 8);
                    return s3q0.a;
                }
            };
            bVar = a2;
            VkContextMenu.c.c(bVar, R.string.leave_group, null, false, null, gzsVar, 30);
        } else {
            VkContextMenu.c.c(a2, !z2 ? R.string.group_inv_event_unsure : R.string.group_inv_event_accept, null, false, null, new gzs() { // from class: xsna.gwm0
                @Override // xsna.gzs
                public final Object invoke() {
                    kwm0.this.t(view.getContext(), fkq0.e(userId), !z2, str, str2, 300L, null, izsVar);
                    return s3q0.a;
                }
            }, 30);
            gzs gzsVar2 = new gzs() { // from class: xsna.hwm0
                @Override // xsna.gzs
                public final Object invoke() {
                    kwm0.q(this, view.getContext(), fkq0.e(userId), str, 0L, null, izsVar2, 8);
                    return s3q0.a;
                }
            };
            bVar = a2;
            VkContextMenu.c.c(bVar, R.string.event_inv_decline, null, false, null, gzsVar2, 30);
        }
        bVar.j();
    }

    @Override // xsna.zvm0
    public final io.reactivex.rxjava3.internal.operators.observable.b0 d(UserId userId, boolean z, String str, boolean z2, String str2, FullSourceJoinApi fullSourceJoinApi, AdminLeaveAction adminLeaveAction, String str3, String str4) {
        rsg0 rsg0Var;
        if (z) {
            return l(userId, str, str2, adminLeaveAction, str3);
        }
        ComFeatures comFeatures = ComFeatures.COM_CODEGEN_GROUPS_JOIN;
        comFeatures.getClass();
        boolean a2 = com.vk.toggle.b.A.a(comFeatures);
        boolean z3 = this.b;
        if (a2) {
            zqu zquVar = new zqu();
            UserId a3 = fkq0.a(userId);
            String g = zm00.g(!z2);
            String str5 = null;
            if (z3 && fullSourceJoinApi != null) {
                str5 = fullSourceJoinApi.a();
            }
            rsg0Var = yfb.y(yqu.a.c(zquVar, a3, g, str2, str, null, str3, str4, str5, 48), new awm0(0));
        } else {
            gqu gquVar = new gqu(fkq0.e(userId), !z2, z3, 60);
            gquVar.U0(str);
            gquVar.N0(fullSourceJoinApi);
            gquVar.P0(str2);
            gquVar.S0(str3);
            gquVar.K0(str4);
            rsg0Var = gquVar;
        }
        return r(rsg0.T(rsg0Var), new w250(userId, 22));
    }

    @Override // xsna.zvm0
    public final void e(final long j, final Context context, final UserId userId, SocialButtonType socialButtonType, FullSourceJoinApi fullSourceJoinApi, final String str, String str2, izs izsVar, final izs izsVar2, boolean z, boolean z2) {
        if (z) {
            xwk.e().h0().c(context, userId, new izs(j, context, userId, str, izsVar2, this) { // from class: xsna.ewm0
                public final /* synthetic */ Context b;
                public final /* synthetic */ UserId c;
                public final /* synthetic */ String d;
                public final /* synthetic */ long e;
                public final /* synthetic */ izs f;

                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    UserId e = fkq0.e(this.c);
                    kwm0.p(this.b, e, this.d, this.e, (AdminLeaveAction) obj, this.f);
                    return s3q0.a;
                }
            }, new izs() { // from class: xsna.fwm0
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    ((Integer) obj).getClass();
                    UserId userId2 = userId;
                    boolean b2 = fkq0.b(userId2);
                    Context context2 = context;
                    long j2 = j;
                    izs izsVar3 = izsVar2;
                    if (b2) {
                        kwm0.q(this, context2, fkq0.e(userId2), str, j2, null, izsVar3, 16);
                    } else {
                        kwm0.s(context2, userId2, j2, izsVar3);
                    }
                    return s3q0.a;
                }
            }, null, socialButtonType);
        } else if (fkq0.d(userId)) {
            o(context, userId, z2, str, str2, j, izsVar, socialButtonType);
        } else {
            t(context, fkq0.e(userId), false, str, str2, j, fullSourceJoinApi, izsVar);
        }
    }

    @Override // xsna.zvm0
    public final io.reactivex.rxjava3.internal.operators.mixed.f i(Context context, UserId userId) {
        return (io.reactivex.rxjava3.internal.operators.mixed.f) xwk.e().h0().i(context, userId).h(new hl30(new g86(21, this, userId), 15));
    }

    @Override // xsna.zvm0
    public final void j(final View view, final UserId userId, boolean z, final String str, String str2, boolean z2, izs izsVar, final izs izsVar2, final Context context, SocialButtonType socialButtonType) {
        if (z) {
            xwk.e().h0().c(view.getContext(), userId, new pb0(view, userId, str, izsVar2, this), new izs() { // from class: xsna.bwm0
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    int intValue = ((Integer) obj).intValue();
                    int l = krv0.l(R.attr.vk_ui_icon_accent);
                    View view2 = view;
                    view2.getContext();
                    e.b bVar = new e.b(view2, null, null, l, 6);
                    bVar.w = R.layout.ds_internal_context_menu_item;
                    Context context2 = context;
                    if (context2 == null) {
                        context2 = view2.getContext();
                    }
                    bVar.e = context2;
                    VkContextMenu.c.c(bVar, intValue, null, false, null, new f7h(view2, userId, str, izsVar2, this), 30);
                    bVar.j();
                    return s3q0.a;
                }
            }, null, socialButtonType);
        } else if (fkq0.d(userId)) {
            o(view.getContext(), userId, z2, str, str2, 300L, izsVar, socialButtonType);
        } else {
            t(view.getContext(), fkq0.e(userId), false, str, str2, 300L, null, izsVar);
        }
    }

    @Override // xsna.zvm0
    public final io.reactivex.rxjava3.internal.operators.observable.b0 l(UserId userId, String str, String str2, AdminLeaveAction adminLeaveAction, String str3) {
        return r(rsg0.T(new hqu(fkq0.e(userId), str2, str, adminLeaveAction, str3)), new fv70(userId, 18));
    }

    @Override // xsna.zvm0
    public final RxUsersSubscriptionBusImpl m() {
        return this.a;
    }

    @Override // xsna.zvm0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 n(UserId userId, boolean z, String str, String str2) {
        yjs yjsVar = new yjs(userId, z ? 1 : 0);
        yjsVar.H0(str);
        yjsVar.F0(str2);
        io.reactivex.rxjava3.internal.operators.observable.m1 T = rsg0.T(yjsVar);
        t520 t520Var = new t520(new bjm0(this, userId), 24);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return T.E(t520Var, lVar, kVar, kVar).U(new itj0(new xsq(29), 3));
    }

    @SuppressLint({"CheckResult"})
    public final void o(Context context, UserId userId, boolean z, String str, String str2, long j, izs<? super UserId, s3q0> izsVar, SocialButtonType socialButtonType) {
        com.vkontakte.android.data.b.l();
        yjs yjsVar = new yjs(userId, (String) null);
        yjsVar.F0(str);
        yjsVar.H0(str2);
        hg1.m(rsg0.y0(yjsVar, null, null, 3), context, j, false, 60).subscribe(new tmz(new jwm0(izsVar, userId, this, z, context, socialButtonType), 16), new sl30(a.b, 27));
    }

    @SuppressLint({"CheckResult"})
    public final void t(Context context, UserId userId, boolean z, String str, String str2, long j, FullSourceJoinApi fullSourceJoinApi, izs<? super UserId, s3q0> izsVar) {
        io.reactivex.rxjava3.core.q<R> L = com.vkontakte.android.data.b.d().L(new gs00(new com.vk.im.engine.commands.messages.c(userId, z, str, str2, this, fullSourceJoinApi), 13), false);
        jsb0 jsb0Var = new jsb0(new h2h0(5), 11);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        hg1.m(L.E(jsb0Var, lVar, kVar, kVar), context, j, false, 60).subscribe(new q440(new nn4(izsVar, userId, context, 7), 21), new xk30(d.b, 24));
    }

    public final io.reactivex.rxjava3.internal.operators.observable.j1 u(UserId userId, String str, String str2) {
        eos eosVar = new eos(userId, 0);
        eosVar.H0(str);
        eosVar.F0(str2);
        io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(eosVar, null, null, 3);
        d120 d120Var = new d120(new wug0(userId, 12), 19);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return y0.E(d120Var, lVar, kVar, kVar).U(new dwm0(new xsq(29)));
    }
}
