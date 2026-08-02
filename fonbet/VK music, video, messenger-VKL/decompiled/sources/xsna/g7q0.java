package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Size;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.vk.dto.common.VideoFile;
import com.vk.permission.PermissionHelper;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.b25;
import xsna.dw20;
import xsna.ikv0;

/* compiled from: UpcomingPresenter.kt */
/* loaded from: classes3.dex */
public final class g7q0 implements z6q0, b25.a {
    public static final /* synthetic */ qcy<Object>[] q = {new MutablePropertyReference1Impl(g7q0.class, "countDownDisposable", "getCountDownDisposable()Lio/reactivex/rxjava3/disposables/Disposable;", 0), p5j.a(0, g7q0.class, "notificationDisposable", "getNotificationDisposable()Lio/reactivex/rxjava3/disposables/Disposable;", fpf0.a), new MutablePropertyReference1Impl(g7q0.class, "subscribeDisposable", "getSubscribeDisposable()Lio/reactivex/rxjava3/disposables/Disposable;", 0), new MutablePropertyReference1Impl(g7q0.class, "videoGetByIdDisposable", "getVideoGetByIdDisposable()Lio/reactivex/rxjava3/disposables/Disposable;", 0)};
    public final a7q0 b;
    public final anz c;
    public final o0r0 d;
    public final mbl e;
    public VideoFile f;
    public final boolean g;
    public final l1i h;
    public long m;
    public boolean n;
    public boolean o;
    public final pgn i = new pgn();
    public final pgn j = new pgn();
    public final pgn k = new pgn();
    public final pgn l = new pgn();
    public final Object p = msy.a(LazyThreadSafetyMode.NONE, new f7q0(0));

    public g7q0(a7q0 a7q0Var, anz anzVar, o0r0 o0r0Var, mbl mblVar, VideoFile videoFile, boolean z, l1i l1iVar) {
        this.b = a7q0Var;
        this.c = anzVar;
        this.d = o0r0Var;
        this.e = mblVar;
        this.f = videoFile;
        this.g = z;
        this.h = l1iVar;
    }

    @Override // xsna.z6q0
    public final void E0(Context context) {
        W(context);
    }

    @Override // xsna.z6q0
    public final void I1() {
        boolean b = o25.a().b();
        a7q0 a7q0Var = this.b;
        if (!b) {
            a7q0Var.j0();
            return;
        }
        if (this.n) {
            t(false);
            return;
        }
        if (Build.VERSION.SDK_INT < 33) {
            t(false);
            return;
        }
        Context context = a7q0Var.getView().getContext();
        PermissionHelper.a.getClass();
        if (PermissionHelper.b(context, PermissionHelper.b)) {
            t(false);
            return;
        }
        Activity b2 = enj.b(a7q0Var.getView());
        FragmentActivity fragmentActivity = b2 instanceof FragmentActivity ? (FragmentActivity) b2 : null;
        if (fragmentActivity == null) {
            return;
        }
        dw20.b t0 = new dw20.b(context, null).v0(R.string.video_accept_push_notification_title).r0(R.string.video_accept_push_notification_subtitle).t0(context.getColor(R.color.vk_steel_gray_500));
        Drawable drawable = context.getDrawable(R.drawable.vk_icon_notification_outline_56);
        if (drawable != null) {
            drawable.setTint(context.getColor(R.color.vk_azure_300));
        } else {
            drawable = null;
        }
        t0.N(drawable).j0(context.getString(R.string.video_allow_push_notification), new yk(13, fragmentActivity, this)).V(context.getString(R.string.video_deny_push_notification), new i8n0(this, 4)).H0(fragmentActivity.getSupportFragmentManager(), null);
    }

    @Override // xsna.z6q0
    public final void N(VideoFile videoFile) {
        this.f = videoFile;
    }

    @Override // xsna.z6q0
    public final void N0(Context context) {
        if (!this.f.U() || !this.g) {
            W(context);
            return;
        }
        String P = this.f.P();
        if (P == null) {
            P = "";
        }
        this.b.q1(P);
    }

    @Override // xsna.z6q0
    public final void O() {
        this.b.C0(this.f.I0());
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q() {
        boolean z;
        a7q0 a7q0Var = this.b;
        if (a7q0Var.L3()) {
            VideoFile videoFile = this.f;
            if (videoFile.h1() && !qr.f(videoFile.I0())) {
                z = true;
                if (z) {
                    this.o = this.f.U();
                    u2();
                }
                a7q0Var.R(z);
            }
        }
        z = false;
        if (z) {
        }
        a7q0Var.R(z);
    }

    public final void W(Context context) {
        io.reactivex.rxjava3.core.q i;
        boolean b = o25.a().b();
        a7q0 a7q0Var = this.b;
        if (!b) {
            a7q0Var.j0();
            return;
        }
        a7q0Var.y(true);
        if (fkq0.d(this.f.I0()) || fkq0.b(this.f.I0())) {
            i = o0r0.i(this.d, this.f.I0(), this.f.U(), null, false, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
        } else {
            i = this.d.T().i(context, this.f.I0());
        }
        io.reactivex.rxjava3.disposables.c subscribe = new io.reactivex.rxjava3.internal.operators.observable.a0(i.a0(io.reactivex.rxjava3.android.schedulers.a.b()), new mtb(this, 5)).subscribe(new vk40(new h440(this, 24), 23), new c7q0(new c3k0(this, 5), 0));
        qcy<Object> qcyVar = q[2];
        this.k.b(subscribe);
    }

    public final void a2() {
        Pair pair = this.n ? new Pair(Integer.valueOf(R.string.video_will_notify_about_start), Integer.valueOf(R.drawable.vk_icon_done_28)) : new Pair(Integer.valueOf(R.string.video_notify_about_start), Integer.valueOf(R.drawable.vk_icon_notification_outline_24));
        this.b.T3(((Number) pair.d()).intValue(), ((Number) pair.g()).intValue());
    }

    @Override // xsna.b25.a
    public final void d(tbu0 tbu0Var) {
        qcy<Object>[] qcyVarArr = q;
        qcy<Object> qcyVar = qcyVarArr[3];
        pgn pgnVar = this.l;
        io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) pgnVar.b;
        if (cVar != null) {
            cVar.dispose();
        }
        io.reactivex.rxjava3.disposables.c subscribe = rsg0.T(new gns0(this.f.I0(), this.f.o0(), this.f.C1())).a0(asu0.a.d()).subscribe(new e7q0(new qhg0(this, 14), 0));
        qcy<Object> qcyVar2 = qcyVarArr[3];
        pgnVar.b(subscribe);
    }

    @Override // xsna.pk6
    public final void release() {
        qcy<Object>[] qcyVarArr = q;
        qcy<Object> qcyVar = qcyVarArr[0];
        io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) this.i.b;
        if (cVar != null) {
            cVar.dispose();
        }
        qcy<Object> qcyVar2 = qcyVarArr[1];
        io.reactivex.rxjava3.disposables.c cVar2 = (io.reactivex.rxjava3.disposables.c) this.j.b;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        qcy<Object> qcyVar3 = qcyVarArr[3];
        io.reactivex.rxjava3.disposables.c cVar3 = (io.reactivex.rxjava3.disposables.c) this.l.b;
        if (cVar3 != null) {
            cVar3.dispose();
        }
        o25.a().B(this);
    }

    @Override // xsna.pk6
    public final void resume() {
        start();
    }

    @Override // xsna.pk6
    public final void start() {
        long Na = this.f.Na() * 1000;
        xuo0.a.getClass();
        long a = Na - xuo0.a();
        a7q0 a7q0Var = this.b;
        if (a <= 0) {
            a7q0Var.Z(false);
            a7q0Var.S3();
            this.h.invoke();
        } else {
            this.m = a + 5000;
            a7q0Var.Z(true);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            asu0 asu0Var = asu0.a;
            io.reactivex.rxjava3.internal.operators.observable.e1 Q = io.reactivex.rxjava3.core.q.Q(0L, 1L, timeUnit, asu0Var.c());
            b8v b8vVar = new b8v(new m2l0(this, 7), 27);
            a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
            a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
            io.reactivex.rxjava3.disposables.c subscribe = new io.reactivex.rxjava3.internal.operators.observable.z(Q.E(b8vVar, lVar, kVar, kVar).a0(asu0Var.d()), new nex(new r9c0(this, 16), 27)).subscribe(new wx00(new k7l0(this, 12), 24));
            qcy<Object> qcyVar = q[0];
            this.i.b(subscribe);
        }
        Boolean P8 = this.f.P8();
        this.n = P8 != null ? P8.booleanValue() : false;
        a2();
        Q();
        mbl mblVar = this.e;
        if (mblVar != null) {
            ((nef0) mblVar.b).start();
        }
        o25.a().b0(this);
    }

    public final void t(final boolean z) {
        this.b.B(true);
        io.reactivex.rxjava3.disposables.c subscribe = new io.reactivex.rxjava3.internal.operators.completable.h(this.c.u(this.f.o0(), this.f.I0(), !this.n), new zm80(this, 3)).subscribe(new io.reactivex.rxjava3.functions.a() { // from class: xsna.d7q0
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                Pair pair;
                g7q0 g7q0Var = g7q0.this;
                boolean z2 = !g7q0Var.n;
                g7q0Var.n = z2;
                g7q0Var.f.p5(Boolean.valueOf(z2));
                boolean z3 = g7q0Var.n;
                a7q0 a7q0Var = g7q0Var.b;
                if (z3) {
                    pair = new Pair(Integer.valueOf(z ? R.string.video_send_notification_on_live_start_in_bell : R.string.video_send_notification_on_live_start), Integer.valueOf(R.drawable.vk_icon_notification_check_outline_28));
                } else {
                    pair = new Pair(Integer.valueOf(R.string.video_do_not_send_notification_on_live_start), Integer.valueOf(R.drawable.vk_icon_notifications_28));
                }
                int intValue = ((Number) pair.d()).intValue();
                int intValue2 = ((Number) pair.g()).intValue();
                Window c = pkv0.c(a7q0Var.getView().getContext(), null);
                if (c != null) {
                    ikv0.a aVar = new ikv0.a(c.getContext());
                    aVar.t = new ikv0.c.C3058c(intValue2, Integer.valueOf(R.attr.vk_ui_text_accent), (Size) null, 12);
                    aVar.u = new ikv0.d(new ikv0.d.c(a7q0Var.getView().getContext().getString(intValue)), (ikv0.d.b) null, (ikv0.d.a) null, 6);
                    aVar.p(c);
                }
            }
        }, new fv70(new waf0(this, 16), 20));
        qcy<Object> qcyVar = q[1];
        this.j.b(subscribe);
    }

    public final void u2() {
        Pair pair;
        if (this.o) {
            pair = new Pair(Integer.valueOf(R.string.profile_btn_subscribed), Integer.valueOf(fkq0.d(this.f.I0()) ? R.drawable.vk_icon_user_added_24 : R.drawable.vk_icon_done_24));
        } else {
            pair = new Pair(Integer.valueOf(R.string.profile_subscribe), Integer.valueOf(fkq0.d(this.f.I0()) ? R.drawable.vk_icon_user_add_outline_24 : R.drawable.vk_icon_add_24));
        }
        this.b.e4(((Number) pair.d()).intValue(), ((Number) pair.g()).intValue());
    }

    @Override // xsna.pk6
    public final void pause() {
    }
}
