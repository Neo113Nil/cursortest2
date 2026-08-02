package com.ybsdk.feature.autotopup.internal.presentation.saver;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.ybsdk.core.analytics.generated.AutoTopupSettingsResultTypeAutotopup;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.navigation.cicerone.Screen;
import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.feature.autotopup.internal.domain.entities.ConfirmInstructionEntity;
import com.ybsdk.feature.autotopup.internal.domain.entities.regular.RegularAutotopupStatusEntity;
import com.ybsdk.feature.autotopup.internal.presentation.result.AutoTopupResultParams;
import defpackage.asi0;
import defpackage.cqg;
import defpackage.ct11;
import defpackage.dqg;
import defpackage.gsi0;
import defpackage.h5a0;
import defpackage.hsi0;
import defpackage.iz3;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz3;
import defpackage.pk11;
import defpackage.pz40;
import defpackage.qk11;
import defpackage.qx3;
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
import defpackage.zri0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.autotopup.internal.presentation.saver.AutoTopupRegularViewModel$saveSettings$1", f = "AutoTopupRegularViewModel.kt", l = {440, NetworkRequestException.BANNED}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AutoTopupRegularViewModel$saveSettings$1 extends SuspendLambda implements wls {
    final /* synthetic */ zri0 $settings;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", AuthSdkActivity.RESPONSE_TYPE_TOKEN, "Lkotlin/Result;", "Lsk11;", "Lty3;", "<anonymous>", "(Ljava/lang/String;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.ybsdk.feature.autotopup.internal.presentation.saver.AutoTopupRegularViewModel$saveSettings$1$3", f = "AutoTopupRegularViewModel.kt", l = {456, 464, 473}, m = "invokeSuspend")
    /* renamed from: com.ybsdk.feature.autotopup.internal.presentation.saver.AutoTopupRegularViewModel$saveSettings$1$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements wls {
        final /* synthetic */ zri0 $settings;
        /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(a aVar, zri0 zri0Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
            this.$settings = zri0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, this.$settings, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:53:0x004b, code lost:
        
            if (r2 == r1) goto L45;
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x012b  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object b;
            Object b2;
            tfl0 tfl0Var;
            Object obj2;
            oz3 oz3Var;
            Throwable a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                String str = (String) this.L$0;
                com.ybsdk.feature.autotopup.internal.domain.b bVar = this.this$0.G;
                zri0 zri0Var = this.$settings;
                this.label = 1;
                b = bVar.b(str, zri0Var, this);
            } else {
                if (i != 1) {
                    if (i == 2) {
                        obj2 = this.L$0;
                        kotlin.b.b(obj);
                        b = obj2;
                        a aVar = this.this$0;
                        a = Result.a(b);
                        if (a != null) {
                        }
                        return new Result(b);
                    }
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tfl0Var = (tfl0) this.L$1;
                    b = this.L$0;
                    kotlin.b.b(obj);
                    b2 = obj;
                    tfl0Var.h((Screen) b2);
                    a aVar2 = this.this$0;
                    a = Result.a(b);
                    if (a != null) {
                        a.d0(aVar2, a);
                    }
                    return new Result(b);
                }
                kotlin.b.b(obj);
                b = ((Result) obj).getValue();
            }
            a aVar3 = this.this$0;
            if (!(b instanceof Result.Failure)) {
                sk11 sk11Var = (sk11) b;
                aVar3.N = null;
                tfl0 tfl0Var2 = aVar3.C;
                if (sk11Var instanceof rk11) {
                    asi0 asi0Var = (asi0) ((qx3) aVar3.X()).e.a();
                    oz3 oz3Var2 = asi0Var != null ? asi0Var.j : null;
                    if (((qx3) aVar3.X()).c() || oz3Var2 == null) {
                        ty3 ty3Var = (ty3) ((rk11) sk11Var).a;
                        this.L$0 = b;
                        this.label = 2;
                        if (a.c0(aVar3, ty3Var, this) != coroutineSingletons) {
                            obj2 = b;
                            b = obj2;
                        }
                        return coroutineSingletons;
                    }
                    ty3 ty3Var2 = (ty3) ((rk11) sk11Var).a;
                    asi0 asi0Var2 = (asi0) ((qx3) aVar3.X()).e.a();
                    if (asi0Var2 != null && (oz3Var = asi0Var2.j) != null) {
                        ConfirmInstructionEntity confirmInstructionEntity = oz3Var.b;
                        h5a0 h5a0Var = ((qx3) aVar3.X()).f;
                        ThemedImageUrlEntity d = h5a0Var != null ? h5a0Var.d() : null;
                        iz3 iz3Var = aVar3.H;
                        AutoTopupResultParams.Polling polling = new AutoTopupResultParams.Polling(ty3Var2.a, ty3Var2.b, ty3Var2.c, d, confirmInstructionEntity.getTitle(), confirmInstructionEntity.getDescription(), true, Collections.singletonList(AutoTopupSettingsResultTypeAutotopup.REGULAR_AUTOTOPUP));
                        iz3Var.getClass();
                        tfl0Var2.l(iz3.a(polling));
                    }
                } else {
                    if (sk11Var instanceof pk11) {
                        pk11 pk11Var = (pk11) sk11Var;
                        aVar3.N = pk11Var.b;
                        uk11 uk11Var = aVar3.K;
                        String str2 = pk11Var.a;
                        this.L$0 = b;
                        this.L$1 = tfl0Var2;
                        this.label = 3;
                        b2 = ((vv3) uk11Var).b(str2);
                        if (b2 != coroutineSingletons) {
                            tfl0Var = tfl0Var2;
                            tfl0Var.h((Screen) b2);
                        }
                        return coroutineSingletons;
                    }
                    if (!(sk11Var instanceof qk11)) {
                        w511.b();
                        return null;
                    }
                    a.d0(aVar3, new FailDataException((ct11) sk11Var));
                }
            }
            a aVar22 = this.this$0;
            a = Result.a(b);
            if (a != null) {
            }
            return new Result(b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoTopupRegularViewModel$saveSettings$1(a aVar, zri0 zri0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$settings = zri0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AutoTopupRegularViewModel$saveSettings$1(this.this$0, this.$settings, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AutoTopupRegularViewModel$saveSettings$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0075, code lost:
    
        if (r2 == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00eb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ea A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        Object c;
        cqg cqgVar;
        ArrayList arrayList;
        a aVar;
        String str;
        AnonymousClass3 anonymousClass3;
        r0 r0Var2;
        Object value2;
        hsi0 hsi0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar2 = this.this$0;
            zri0 zri0Var = this.$settings;
            pz40 Y = aVar2.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, qx3.a((qx3) value, new r8j0(zri0Var.a, null, 12), null, null, EmptyList.a, null, null, null, false, 246)));
            zri0 zri0Var2 = this.$settings;
            if (zri0Var2.a == RegularAutotopupStatusEntity.ENABLED) {
                com.ybsdk.feature.autotopup.internal.domain.b bVar = this.this$0.G;
                this.label = 1;
                c = bVar.c(zri0Var2, this);
            }
            cqgVar = null;
            arrayList = (cqgVar != null || (hsi0Var = (hsi0) cqgVar.a) == null) ? null : hsi0Var.a;
            if (arrayList != null || arrayList.isEmpty()) {
                aVar = this.this$0;
                zri0 zri0Var3 = this.$settings;
                str = zri0Var3.b;
                anonymousClass3 = new AnonymousClass3(aVar, zri0Var3, null);
                this.label = 2;
                if (aVar.O(anonymousClass3, str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                a.M0(this.this$0, ((gsi0) kotlin.collections.a.P(((hsi0) cqgVar.a).a)).a);
                pz40 Y2 = this.this$0.Y();
                do {
                    r0Var2 = (r0) Y2;
                    value2 = r0Var2.getValue();
                } while (!r0Var2.k(value2, qx3.a((qx3) value2, null, null, null, null, null, null, null, false, 254)));
            }
            return zy11Var;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            ((Result) obj).getClass();
            return zy11Var;
        }
        kotlin.b.b(obj);
        c = ((Result) obj).getValue();
        if (c instanceof Result.Failure) {
            c = null;
        }
        dqg dqgVar = (dqg) c;
        if (dqgVar != null && (dqgVar instanceof cqg)) {
            cqgVar = (cqg) dqgVar;
            if (cqgVar != null) {
            }
            if (arrayList != null) {
            }
            aVar = this.this$0;
            zri0 zri0Var32 = this.$settings;
            str = zri0Var32.b;
            anonymousClass3 = new AnonymousClass3(aVar, zri0Var32, null);
            this.label = 2;
            if (aVar.O(anonymousClass3, str, this) == coroutineSingletons) {
                return zy11Var;
            }
        }
        cqgVar = null;
        if (cqgVar != null) {
        }
        if (arrayList != null) {
        }
        aVar = this.this$0;
        zri0 zri0Var322 = this.$settings;
        str = zri0Var322.b;
        anonymousClass3 = new AnonymousClass3(aVar, zri0Var322, null);
        this.label = 2;
        if (aVar.O(anonymousClass3, str, this) == coroutineSingletons) {
        }
    }
}
