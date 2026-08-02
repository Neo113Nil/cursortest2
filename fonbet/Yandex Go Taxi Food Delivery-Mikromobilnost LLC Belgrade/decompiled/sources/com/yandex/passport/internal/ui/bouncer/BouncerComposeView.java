package com.yandex.passport.internal.ui.bouncer;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import com.yandex.passport.api.PassportLoginAction;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.w;
import com.yandex.passport.common.ui.AppTheme;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.a0;
import com.yandex.passport.internal.account.PassportAccountImpl;
import com.yandex.passport.internal.report.zd;
import com.yandex.passport.internal.ui.bouncer.model.a2;
import com.yandex.passport.internal.ui.bouncer.model.b2;
import com.yandex.passport.internal.ui.bouncer.model.c2;
import com.yandex.passport.internal.ui.bouncer.model.k1;
import com.yandex.passport.internal.ui.bouncer.model.l1;
import com.yandex.passport.internal.ui.bouncer.model.m1;
import com.yandex.passport.internal.ui.bouncer.model.n1;
import com.yandex.passport.internal.ui.bouncer.model.o1;
import com.yandex.passport.internal.ui.bouncer.model.p1;
import com.yandex.passport.internal.ui.bouncer.model.q1;
import com.yandex.passport.internal.ui.bouncer.model.r1;
import com.yandex.passport.internal.ui.bouncer.model.s1;
import com.yandex.passport.internal.ui.bouncer.model.t1;
import com.yandex.passport.internal.ui.bouncer.model.v1;
import com.yandex.passport.internal.ui.bouncer.model.w1;
import com.yandex.passport.internal.ui.bouncer.model.y1;
import com.yandex.passport.internal.ui.bouncer.model.z1;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.jl40;
import defpackage.oz40;
import defpackage.w511;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B;\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u001b\u0010\u001a\u001a\u00020\u0013*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001c\u0010\u0015J\u000f\u0010\u001d\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010!R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\"R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010#R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010$R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00100\u001a\u00020/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00064"}, d2 = {"Lcom/yandex/passport/internal/ui/bouncer/BouncerComposeView;", "Landroid/widget/FrameLayout;", "Lcom/yandex/passport/internal/ui/bouncer/p;", "Lcom/yandex/passport/internal/ui/bouncer/u;", "rendererComponentBuilder", "Lcom/yandex/passport/internal/ui/bouncer/BouncerActivity;", "activity", "", "isWhiteLabel", "Lcom/yandex/passport/common/ui/AppTheme;", "appTheme", "Lcom/yandex/passport/internal/report/zd;", "timeTracker", "Lcom/yandex/passport/internal/report/reporters/n;", "reporter", "<init>", "(Lcom/yandex/passport/internal/ui/bouncer/u;Lcom/yandex/passport/internal/ui/bouncer/BouncerActivity;ZLcom/yandex/passport/common/ui/AppTheme;Lcom/yandex/passport/internal/report/zd;Lcom/yandex/passport/internal/report/reporters/n;)V", "Lcom/yandex/passport/internal/ui/bouncer/model/s1;", ClidProvider.STATE, "Lzy11;", "trackBouncerEvent", "(Lcom/yandex/passport/internal/ui/bouncer/model/s1;)V", "processResult", "Landroid/app/Activity;", "Lcom/yandex/passport/api/w;", TarifficatorScenarioActivity.RESULT_KEY, "finishWithResultAndTrackTime", "(Landroid/app/Activity;Lcom/yandex/passport/api/w;)V", "render", "onDestroy", "()V", "canGoBackInSloth", "()Z", "Lcom/yandex/passport/internal/ui/bouncer/BouncerActivity;", "Z", "Lcom/yandex/passport/common/ui/AppTheme;", "Lcom/yandex/passport/internal/report/zd;", "Lcom/yandex/passport/internal/report/reporters/n;", "Lcom/yandex/passport/internal/ui/bouncer/v;", "rendererComponent", "Lcom/yandex/passport/internal/ui/bouncer/v;", "Landroidx/compose/ui/platform/ComposeView;", "composeView", "Landroidx/compose/ui/platform/ComposeView;", "Loz40;", "stateState", "Loz40;", "Landroid/view/View;", "theRootView", "Landroid/view/View;", "getTheRootView", "()Landroid/view/View;", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BouncerComposeView extends FrameLayout implements p {
    public static final int $stable = 8;
    private final BouncerActivity activity;
    private final AppTheme appTheme;
    private final ComposeView composeView;
    private final boolean isWhiteLabel;
    private final v rendererComponent;
    private final com.yandex.passport.internal.report.reporters.n reporter;
    private final oz40 stateState;
    private final View theRootView;
    private final zd timeTracker;

    public BouncerComposeView(u uVar, BouncerActivity bouncerActivity, boolean z, AppTheme appTheme, zd zdVar, com.yandex.passport.internal.report.reporters.n nVar) {
        super(bouncerActivity);
        this.activity = bouncerActivity;
        this.isWhiteLabel = z;
        this.appTheme = appTheme;
        this.timeTracker = zdVar;
        this.reporter = nVar;
        this.rendererComponent = uVar.build();
        ComposeView composeView = new ComposeView(bouncerActivity, null, 0, 6, null);
        this.composeView = composeView;
        this.stateState = androidx.compose.runtime.f.j(null);
        this.theRootView = this;
        addView(composeView, new FrameLayout.LayoutParams(-1, -1));
        composeView.setContent(new androidx.compose.runtime.internal.a(-1460217627, new n(this, 1), true));
    }

    private final void finishWithResultAndTrackTime(Activity activity, w wVar) {
        com.yandex.passport.internal.ui.c.k(activity, com.yandex.passport.internal.ui.c.B(wVar));
        this.timeTracker.e("native.finish");
        zd zdVar = this.timeTracker;
        zdVar.c.put(TarifficatorScenarioActivity.RESULT_KEY, com.yandex.passport.internal.properties.u.x(wVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processResult(s1 state) {
        this.reporter.k(state.b);
        BouncerActivity bouncerActivity = this.activity;
        r1 r1Var = state.b;
        if (jl40.l(r1Var, k1.a) || (r1Var instanceof l1)) {
            finishWithResultAndTrackTime(bouncerActivity, com.yandex.passport.api.q.a);
            return;
        }
        if (r1Var instanceof m1) {
            finishWithResultAndTrackTime(bouncerActivity, new com.yandex.passport.api.s(((m1) r1Var).a));
            return;
        }
        if (jl40.l(r1Var, n1.a)) {
            finishWithResultAndTrackTime(bouncerActivity, com.yandex.passport.api.t.a);
            return;
        }
        if (!(r1Var instanceof q1)) {
            if (r1Var instanceof o1) {
                o1 o1Var = (o1) r1Var;
                finishWithResultAndTrackTime(bouncerActivity, new com.yandex.passport.api.v(o1Var.a, o1Var.b));
                return;
            } else {
                if (jl40.l(r1Var, p1.a)) {
                    return;
                }
                w511.b();
                return;
            }
        }
        q1 q1Var = (q1) r1Var;
        ModernAccount modernAccount = q1Var.a;
        PassportUidImpl A = com.yandex.passport.internal.util.p.A(modernAccount.getUid());
        PassportAccountImpl g0 = a0.g0(modernAccount);
        PassportLoginAction passportLoginAction = q1Var.c;
        String str = q1Var.d;
        String str2 = q1Var.e;
        if (str2 == null) {
            str2 = state.f;
        }
        finishWithResultAndTrackTime(bouncerActivity, new com.yandex.passport.api.u(A, g0, passportLoginAction, str, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackBouncerEvent(s1 state) {
        c2 c2Var = state.a;
        if ((c2Var instanceof t1) || (c2Var instanceof z1) || (c2Var instanceof v1) || (c2Var instanceof y1) || (c2Var instanceof a2) || (c2Var instanceof b2) || (c2Var instanceof w1)) {
            this.timeTracker.e(com.yandex.passport.internal.properties.u.y(c2Var));
        }
    }

    @Override // com.yandex.passport.internal.ui.bouncer.p
    public boolean canGoBackInSloth() {
        return false;
    }

    @Override // com.yandex.passport.internal.ui.bouncer.p
    public View getTheRootView() {
        return this.theRootView;
    }

    @Override // com.yandex.passport.internal.ui.bouncer.p
    public void onDestroy() {
    }

    @Override // com.yandex.passport.common.mvi.f
    public void render(s1 state) {
        this.stateState.setValue(state);
    }
}
