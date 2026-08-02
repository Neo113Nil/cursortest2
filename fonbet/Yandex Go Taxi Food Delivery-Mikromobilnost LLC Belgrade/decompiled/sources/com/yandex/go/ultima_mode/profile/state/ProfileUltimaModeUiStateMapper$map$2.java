package com.yandex.go.ultima_mode.profile.state;

import com.yandex.go.ultima_mode.api.data.UltimaModeResponse;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.fv11;
import defpackage.ief;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.qv11;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.xgf0;
import defpackage.xss0;
import defpackage.ygf0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzgf0;", "<anonymous>", "(Ltse;)Lzgf0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.ultima_mode.profile.state.ProfileUltimaModeUiStateMapper$map$2", f = "ProfileUltimaModeUiStateMapper.kt", l = {53, 54, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE, 56, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ProfileUltimaModeUiStateMapper$map$2 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $isUltimaModeManuallyDisabled;
    final /* synthetic */ UltimaModeResponse $response;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileUltimaModeUiStateMapper$map$2(UltimaModeResponse ultimaModeResponse, a aVar, Continuation continuation, boolean z) {
        super(2, continuation);
        this.$response = ultimaModeResponse;
        this.this$0 = aVar;
        this.$isUltimaModeManuallyDisabled = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ProfileUltimaModeUiStateMapper$map$2 profileUltimaModeUiStateMapper$map$2 = new ProfileUltimaModeUiStateMapper$map$2(this.$response, this.this$0, continuation, this.$isUltimaModeManuallyDisabled);
        profileUltimaModeUiStateMapper$map$2.L$0 = obj;
        return profileUltimaModeUiStateMapper$map$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ProfileUltimaModeUiStateMapper$map$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01b2  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        UltimaModeResponse.Profile profile;
        UltimaModeResponse.Profile.Card card;
        noh h;
        noh h2;
        Object s;
        noh nohVar;
        noh nohVar2;
        Object k;
        noh nohVar3;
        fv11 fv11Var;
        Object k2;
        noh nohVar4;
        qv11 qv11Var;
        noh nohVar5;
        Object k3;
        qv11 qv11Var2;
        xss0 xss0Var;
        noh nohVar6;
        fv11 fv11Var2;
        xss0 xss0Var2;
        Object k4;
        fv11 fv11Var3;
        xss0 xss0Var3;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            UltimaModeResponse ultimaModeResponse = this.$response;
            if (!ultimaModeResponse.a || (profile = ultimaModeResponse.d) == null || (card = profile.a) == null) {
                return ygf0.a;
            }
            ief iefVar = ultimaModeResponse.c;
            qoh h3 = tje.h(tseVar, null, null, new ProfileUltimaModeUiStateMapper$map$2$headerState$1(iefVar, card, this.this$0, null), 3);
            qoh h4 = tje.h(tseVar, null, null, new ProfileUltimaModeUiStateMapper$map$2$progressBar$1(iefVar, card, this.this$0, null), 3);
            qoh h5 = tje.h(tseVar, null, null, new ProfileUltimaModeUiStateMapper$map$2$plus$1(iefVar, card, this.this$0, null), 3);
            h = tje.h(tseVar, null, null, new ProfileUltimaModeUiStateMapper$map$2$concierge$1(iefVar, card, this.this$0, null), 3);
            h2 = tje.h(tseVar, null, null, new ProfileUltimaModeUiStateMapper$map$2$modeToggle$1(this.$response, this.this$0, null, this.$isUltimaModeManuallyDisabled), 3);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = h4;
            this.L$5 = h5;
            this.L$6 = h;
            this.L$7 = h2;
            this.label = 1;
            s = h3.s(this);
            if (s != coroutineSingletons) {
                nohVar = h4;
                nohVar2 = h5;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                fv11 fv11Var4 = (fv11) this.L$8;
                noh nohVar7 = (noh) this.L$7;
                noh nohVar8 = (noh) this.L$6;
                nohVar2 = (noh) this.L$5;
                b.b(obj);
                fv11Var = fv11Var4;
                h2 = nohVar7;
                nohVar3 = nohVar8;
                k = obj;
                qv11 qv11Var3 = (qv11) k;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = nohVar3;
                this.L$7 = h2;
                this.L$8 = fv11Var;
                this.L$9 = qv11Var3;
                this.label = 3;
                k2 = nohVar2.k(this);
                if (k2 != coroutineSingletons) {
                    noh nohVar9 = nohVar3;
                    nohVar4 = h2;
                    qv11Var = qv11Var3;
                    nohVar5 = nohVar9;
                    xss0 xss0Var4 = (xss0) k2;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = nohVar4;
                    this.L$8 = fv11Var;
                    this.L$9 = qv11Var;
                    this.L$10 = xss0Var4;
                    this.label = 4;
                    k3 = nohVar5.k(this);
                    if (k3 != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            if (i == 3) {
                qv11Var = (qv11) this.L$9;
                fv11Var = (fv11) this.L$8;
                noh nohVar10 = (noh) this.L$7;
                nohVar5 = (noh) this.L$6;
                b.b(obj);
                nohVar4 = nohVar10;
                k2 = obj;
                xss0 xss0Var42 = (xss0) k2;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = nohVar4;
                this.L$8 = fv11Var;
                this.L$9 = qv11Var;
                this.L$10 = xss0Var42;
                this.label = 4;
                k3 = nohVar5.k(this);
                if (k3 != coroutineSingletons) {
                    fv11 fv11Var5 = fv11Var;
                    qv11Var2 = qv11Var;
                    xss0Var = xss0Var42;
                    nohVar6 = nohVar4;
                    fv11Var2 = fv11Var5;
                    xss0Var2 = (xss0) k3;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.L$8 = fv11Var2;
                    this.L$9 = qv11Var2;
                    this.L$10 = xss0Var;
                    this.L$11 = xss0Var2;
                    this.label = 5;
                    k4 = nohVar6.k(this);
                    if (k4 != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            if (i != 4) {
                if (i != 5) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xss0 xss0Var5 = (xss0) this.L$11;
                xss0 xss0Var6 = (xss0) this.L$10;
                qv11Var2 = (qv11) this.L$9;
                fv11 fv11Var6 = (fv11) this.L$8;
                b.b(obj);
                xss0Var3 = xss0Var6;
                fv11Var3 = fv11Var6;
                k4 = obj;
                xss0Var2 = xss0Var5;
                return new xgf0(fv11Var3, qv11Var2, xss0Var3, xss0Var2, (xss0) k4);
            }
            xss0Var = (xss0) this.L$10;
            qv11Var2 = (qv11) this.L$9;
            fv11 fv11Var7 = (fv11) this.L$8;
            nohVar6 = (noh) this.L$7;
            b.b(obj);
            fv11Var2 = fv11Var7;
            k3 = obj;
            xss0Var2 = (xss0) k3;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = null;
            this.L$7 = null;
            this.L$8 = fv11Var2;
            this.L$9 = qv11Var2;
            this.L$10 = xss0Var;
            this.L$11 = xss0Var2;
            this.label = 5;
            k4 = nohVar6.k(this);
            if (k4 != coroutineSingletons) {
                fv11Var3 = fv11Var2;
                xss0Var3 = xss0Var;
                return new xgf0(fv11Var3, qv11Var2, xss0Var3, xss0Var2, (xss0) k4);
            }
            return coroutineSingletons;
        }
        h2 = (noh) this.L$7;
        h = (noh) this.L$6;
        nohVar2 = (noh) this.L$5;
        nohVar = (noh) this.L$4;
        b.b(obj);
        s = obj;
        fv11 fv11Var8 = (fv11) s;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.L$5 = nohVar2;
        this.L$6 = h;
        this.L$7 = h2;
        this.L$8 = fv11Var8;
        this.label = 2;
        k = nohVar.k(this);
        if (k != coroutineSingletons) {
            nohVar3 = h;
            fv11Var = fv11Var8;
            qv11 qv11Var32 = (qv11) k;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = nohVar3;
            this.L$7 = h2;
            this.L$8 = fv11Var;
            this.L$9 = qv11Var32;
            this.label = 3;
            k2 = nohVar2.k(this);
            if (k2 != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
