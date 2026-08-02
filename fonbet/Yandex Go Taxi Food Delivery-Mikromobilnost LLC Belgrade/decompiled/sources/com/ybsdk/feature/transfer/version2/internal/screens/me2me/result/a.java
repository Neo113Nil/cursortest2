package com.ybsdk.feature.transfer.version2.internal.screens.me2me.result;

import com.ybsdk.core.analytics.generated.delegates.Me2mePullDebitEvents$Me2mePullDebitPermissionStateResultResult;
import com.ybsdk.core.analytics.generated.delegates.Me2mePullDebitEvents$Me2mePullDebitPermissionStateToggledState;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.navigation.cicerone.Screen;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.transfer.version2.api.TransferTwoFactorScreenProvider$Request;
import com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.domain.Me2MeDebitResultEntity$Status;
import com.ybsdk.utils.poller.b;
import defpackage.ag1;
import defpackage.ak00;
import defpackage.ct11;
import defpackage.ds31;
import defpackage.e100;
import defpackage.f910;
import defpackage.g8e;
import defpackage.gao;
import defpackage.hu01;
import defpackage.j910;
import defpackage.job1;
import defpackage.k910;
import defpackage.l0p;
import defpackage.m910;
import defpackage.mjb1;
import defpackage.mvy;
import defpackage.n0t0;
import defpackage.n910;
import defpackage.ny61;
import defpackage.ou01;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.qbg;
import defpackage.rbv;
import defpackage.rm01;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.tu01;
import defpackage.uc5;
import defpackage.us3;
import defpackage.w511;
import defpackage.ws00;
import defpackage.xyz;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes3.dex */
public final class a extends uc5 {
    public final Me2MeDebitResultScreenParams B;
    public final hu01 C;
    public final tfl0 D;
    public final rm01 E;
    public final us3 F;
    public final com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.domain.a G;
    public pzt0 H;

    public a(Me2MeDebitResultScreenParams me2MeDebitResultScreenParams, j910 j910Var, hu01 hu01Var, tfl0 tfl0Var, rm01 rm01Var, us3 us3Var) {
        super(new xyz(17, me2MeDebitResultScreenParams), new ak00(3));
        this.B = me2MeDebitResultScreenParams;
        this.C = hu01Var;
        this.D = tfl0Var;
        this.E = rm01Var;
        this.F = us3Var;
        e100 e100Var = j910Var.a;
        this.G = new com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.domain.a((com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.data.a) ((mvy) e100Var.b).get(), this, me2MeDebitResultScreenParams, (ag1) ((qbg) e100Var.c).get(), (b) ((qbg) e100Var.w).get());
        f0(null);
    }

    public static final void b0(a aVar, Me2MeDebitResultState$WidgetState me2MeDebitResultState$WidgetState, Me2MeDebitResultState$WidgetState me2MeDebitResultState$WidgetState2, Throwable th) {
        r0 r0Var;
        Object value;
        Pair pair = c.b(th) ? new Pair(Me2MeDebitResultState$WidgetSubState.DISABLED, Me2mePullDebitEvents$Me2mePullDebitPermissionStateResultResult.ERROR) : new Pair(Me2MeDebitResultState$WidgetSubState.ENABLED, Me2mePullDebitEvents$Me2mePullDebitPermissionStateResultResult.UNKNOWN);
        Me2MeDebitResultState$WidgetSubState me2MeDebitResultState$WidgetSubState = (Me2MeDebitResultState$WidgetSubState) pair.getFirst();
        aVar.F.q(me2MeDebitResultState$WidgetState, (Me2mePullDebitEvents$Me2mePullDebitPermissionStateResultResult) pair.getSecond());
        pz40 Y = aVar.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, k910.a((k910) value, me2MeDebitResultState$WidgetState2, me2MeDebitResultState$WidgetSubState, null, 103)));
        aVar.Z(new m910(gao.e(null, null, th, 3)));
    }

    public static final void c0(a aVar, Me2MeDebitResultState$WidgetState me2MeDebitResultState$WidgetState, String str) {
        r0 r0Var;
        Object value;
        aVar.F.q(me2MeDebitResultState$WidgetState, Me2mePullDebitEvents$Me2mePullDebitPermissionStateResultResult.OK);
        pz40 Y = aVar.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, k910.a((k910) value, me2MeDebitResultState$WidgetState, Me2MeDebitResultState$WidgetSubState.ENABLED, null, 103)));
        aVar.Z(new m910(new n0t0(g8e.i(Text.Companion, str))));
    }

    public static final void d0(a aVar, Me2MeDebitResultState$WidgetState me2MeDebitResultState$WidgetState, Me2MeDebitResultState$WidgetState me2MeDebitResultState$WidgetState2, ct11 ct11Var) {
        r0 r0Var;
        Object value;
        aVar.F.q(me2MeDebitResultState$WidgetState, Me2mePullDebitEvents$Me2mePullDebitPermissionStateResultResult.ERROR);
        pz40 Y = aVar.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, k910.a((k910) value, me2MeDebitResultState$WidgetState2, Me2MeDebitResultState$WidgetSubState.DISABLED, null, 103)));
        aVar.Z(new m910(new n0t0(g8e.i(Text.Companion, ct11Var.getError()))));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e0(a aVar, String str, TransferTwoFactorScreenProvider$Request transferTwoFactorScreenProvider$Request, ContinuationImpl continuationImpl) {
        Me2MeDebitResultViewModel$openTwoFactorScreen$1 me2MeDebitResultViewModel$openTwoFactorScreen$1;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof Me2MeDebitResultViewModel$openTwoFactorScreen$1) {
            me2MeDebitResultViewModel$openTwoFactorScreen$1 = (Me2MeDebitResultViewModel$openTwoFactorScreen$1) continuationImpl;
            int i2 = me2MeDebitResultViewModel$openTwoFactorScreen$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                me2MeDebitResultViewModel$openTwoFactorScreen$1.label = i2 - Integer.MIN_VALUE;
                Object obj = me2MeDebitResultViewModel$openTwoFactorScreen$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = me2MeDebitResultViewModel$openTwoFactorScreen$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    hu01 hu01Var = aVar.C;
                    String title = ((k910) aVar.X()).a.getHeader().getTitle();
                    Text.Companion.getClass();
                    new Text.Constant(title);
                    Text.Constant constant = new Text.Constant(((k910) aVar.X()).a.getDescription());
                    ThemedImageUrlEntity image = ((k910) aVar.X()).a.getHeader().getImage();
                    rbv f = image != null ? job1.f(image, new ws00(16)) : null;
                    me2MeDebitResultViewModel$openTwoFactorScreen$1.label = 1;
                    obj = ((tu01) hu01Var).b(f, constant, str, transferTwoFactorScreenProvider$Request, null);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                aVar.D.h((Screen) obj);
                return zy11.a;
            }
        }
        me2MeDebitResultViewModel$openTwoFactorScreen$1 = new Me2MeDebitResultViewModel$openTwoFactorScreen$1(aVar, continuationImpl);
        Object obj3 = me2MeDebitResultViewModel$openTwoFactorScreen$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = me2MeDebitResultViewModel$openTwoFactorScreen$1.label;
        if (i != 0) {
        }
        aVar.D.h((Screen) obj3);
        return zy11.a;
    }

    public final void f0(String str) {
        pzt0 pzt0Var = this.H;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.H = tje.N(ds31.a(this), null, null, new Me2MeDebitResultViewModel$executePull$1(this, str, null), 3);
    }

    public final void g0() {
        this.D.e();
        String str = ((k910) X()).f;
        if (str != null) {
            this.F.a.I.a.a("me2me_pull_debit.state.support", null);
            ((ou01) this.E).a(str);
        }
    }

    public final void h0() {
        this.D.e();
    }

    public final void i0() {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, mjb1.f(this.B.getUndefinedResultPage(), Me2MeDebitResultEntity$Status.FAILED)));
    }

    public final void j0(String str) {
        Me2MeDebitResultState$WidgetState me2MeDebitResultState$WidgetState;
        Me2mePullDebitEvents$Me2mePullDebitPermissionStateToggledState me2mePullDebitEvents$Me2mePullDebitPermissionStateToggledState;
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        if (str == null) {
            pz40 Y = Y();
            do {
                r0Var2 = (r0) Y;
                value2 = r0Var2.getValue();
            } while (!r0Var2.k(value2, k910.a((k910) value2, null, null, null, 63)));
        }
        Me2MeDebitResultState$WidgetState me2MeDebitResultState$WidgetState2 = ((k910) X()).d;
        int i = n910.a[me2MeDebitResultState$WidgetState2.ordinal()];
        if (i == 1) {
            me2MeDebitResultState$WidgetState = Me2MeDebitResultState$WidgetState.ON;
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            me2MeDebitResultState$WidgetState = Me2MeDebitResultState$WidgetState.OFF;
        }
        l0p l0pVar = this.F.a.I;
        int i2 = f910.b[me2MeDebitResultState$WidgetState.ordinal()];
        if (i2 == 1) {
            me2mePullDebitEvents$Me2mePullDebitPermissionStateToggledState = Me2mePullDebitEvents$Me2mePullDebitPermissionStateToggledState.OFF;
        } else {
            if (i2 != 2) {
                w511.b();
                return;
            }
            me2mePullDebitEvents$Me2mePullDebitPermissionStateToggledState = Me2mePullDebitEvents$Me2mePullDebitPermissionStateToggledState.ON;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        linkedHashMap.put(ClidProvider.STATE, me2mePullDebitEvents$Me2mePullDebitPermissionStateToggledState.getOriginalValue());
        l0pVar.a.a("me2me_pull_debit.permission_state.toggled", linkedHashMap);
        pz40 Y2 = Y();
        do {
            r0Var = (r0) Y2;
            value = r0Var.getValue();
        } while (!r0Var.k(value, k910.a((k910) value, me2MeDebitResultState$WidgetState, Me2MeDebitResultState$WidgetSubState.PROGRESS, null, 103)));
        pzt0 pzt0Var = this.H;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.H = tje.N(ds31.a(this), null, null, new Me2MeDebitResultViewModel$onWidgetToggle$3(me2MeDebitResultState$WidgetState, this, str, me2MeDebitResultState$WidgetState2, null), 3);
    }
}
