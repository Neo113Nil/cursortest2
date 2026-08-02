package com.ybsdk.feature.autotopup.internal.presentation.saver;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.ybsdk.core.analytics.generated.delegates.RoundingEvents$RoundingSettingsActivateResultResult;
import com.ybsdk.core.navigation.cicerone.Screen;
import com.ybsdk.core.utils.dto.common.FailDataException;
import defpackage.ct11;
import defpackage.czk0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pk11;
import defpackage.pz40;
import defpackage.qk11;
import defpackage.r8j0;
import defpackage.rk11;
import defpackage.sk11;
import defpackage.tfl0;
import defpackage.tse;
import defpackage.ty3;
import defpackage.uk11;
import defpackage.vv3;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.autotopup.internal.presentation.saver.RoundingViewModel$saveSettings$2", f = "RoundingViewModel.kt", l = {336}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RoundingViewModel$saveSettings$2 extends SuspendLambda implements wls {
    final /* synthetic */ czk0 $settings;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", AuthSdkActivity.RESPONSE_TYPE_TOKEN, "Lkotlin/Result;", "Lsk11;", "Lty3;", "<anonymous>", "(Ljava/lang/String;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.ybsdk.feature.autotopup.internal.presentation.saver.RoundingViewModel$saveSettings$2$2", f = "RoundingViewModel.kt", l = {338, 349, 355}, m = "invokeSuspend")
    /* renamed from: com.ybsdk.feature.autotopup.internal.presentation.saver.RoundingViewModel$saveSettings$2$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ czk0 $settings;
        /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(b bVar, czk0 czk0Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bVar;
            this.$settings = czk0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$settings, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x0045, code lost:
        
            if (r10 == r0) goto L29;
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x00bf  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object p;
            Object obj2;
            tfl0 tfl0Var;
            Object obj3;
            Throwable a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                String str = (String) this.L$0;
                com.ybsdk.feature.autotopup.internal.data.b bVar = this.this$0.B;
                czk0 czk0Var = this.$settings;
                this.label = 1;
                p = bVar.p(str, czk0Var, this);
            } else {
                if (i != 1) {
                    if (i == 2) {
                        obj3 = this.L$0;
                        kotlin.b.b(obj);
                        obj2 = obj3;
                        b bVar2 = this.this$0;
                        czk0 czk0Var2 = this.$settings;
                        a = Result.a(obj2);
                        if (a != null) {
                        }
                        return new Result(obj2);
                    }
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tfl0Var = (tfl0) this.L$1;
                    obj2 = this.L$0;
                    kotlin.b.b(obj);
                    tfl0Var.h((Screen) obj);
                    b bVar22 = this.this$0;
                    czk0 czk0Var22 = this.$settings;
                    a = Result.a(obj2);
                    if (a != null) {
                        b.d0(bVar22, czk0Var22, a);
                    }
                    return new Result(obj2);
                }
                kotlin.b.b(obj);
                p = ((Result) obj).getValue();
            }
            obj2 = p;
            b bVar3 = this.this$0;
            czk0 czk0Var3 = this.$settings;
            if (!(obj2 instanceof Result.Failure)) {
                sk11 sk11Var = (sk11) obj2;
                bVar3.K = null;
                if (sk11Var instanceof rk11) {
                    bVar3.J.v(bVar3.C, (RoundingState) bVar3.X(), czk0Var3, RoundingEvents$RoundingSettingsActivateResultResult.OK);
                    ty3 ty3Var = (ty3) ((rk11) sk11Var).a;
                    this.L$0 = obj2;
                    this.label = 2;
                    if (b.c0(bVar3, ty3Var, this) != coroutineSingletons) {
                        obj3 = obj2;
                        obj2 = obj3;
                    }
                } else if (sk11Var instanceof pk11) {
                    pk11 pk11Var = (pk11) sk11Var;
                    bVar3.K = pk11Var.b;
                    tfl0 tfl0Var2 = bVar3.D;
                    uk11 uk11Var = bVar3.I;
                    String str2 = pk11Var.a;
                    this.L$0 = obj2;
                    this.L$1 = tfl0Var2;
                    this.label = 3;
                    obj = ((vv3) uk11Var).b(str2);
                    if (obj != coroutineSingletons) {
                        tfl0Var = tfl0Var2;
                        tfl0Var.h((Screen) obj);
                    }
                } else {
                    if (!(sk11Var instanceof qk11)) {
                        w511.b();
                        return null;
                    }
                    b.d0(bVar3, czk0Var3, new FailDataException((ct11) sk11Var));
                }
                return coroutineSingletons;
            }
            b bVar222 = this.this$0;
            czk0 czk0Var222 = this.$settings;
            a = Result.a(obj2);
            if (a != null) {
            }
            return new Result(obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundingViewModel$saveSettings$2(b bVar, czk0 czk0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$settings = czk0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RoundingViewModel$saveSettings$2(this.this$0, this.$settings, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RoundingViewModel$saveSettings$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            czk0 czk0Var = this.$settings;
            pz40 Y = bVar.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, RoundingState.a((RoundingState) value, new r8j0(czk0Var.a, null, 12), null, null, null, null, null, null, HProv.PP_DELETE_SAVED_PASSWD)));
            b bVar2 = this.this$0;
            czk0 czk0Var2 = this.$settings;
            String str = czk0Var2.c;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(bVar2, czk0Var2, null);
            this.label = 1;
            if (bVar2.O(anonymousClass2, str, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            ((Result) obj).getClass();
        }
        return zy11.a;
    }
}
