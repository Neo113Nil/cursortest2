package com.yandex.go.rida.bids.ui;

import defpackage.fr5;
import defpackage.fwi;
import defpackage.gr5;
import defpackage.hr5;
import defpackage.k651;
import defpackage.lx40;
import defpackage.m3u0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qor;
import defpackage.tse;
import defpackage.w511;
import defpackage.wg6;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.m0;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.rida.bids.ui.BidsScreenKt$SetMainAnchorHeightEffect$1$1", f = "BidsScreen.kt", l = {162}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class BidsScreenKt$SetMainAnchorHeightEffect$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ m3u0 $aboveMapContentHeightState;
    final /* synthetic */ wg6 $bottomSheetState;
    final /* synthetic */ fwi $density;
    final /* synthetic */ qor $driveCardHeightState;
    final /* synthetic */ boolean $isAdditionalPaddingEnabled;
    final /* synthetic */ boolean $isInspectionMode;
    final /* synthetic */ k651 $localWindowInfo;
    final /* synthetic */ lx40 $mainAnchor;
    int label;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "", "driveCardHeight", "aboveMapContentHeight"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @mvg(c = "com.yandex.go.rida.bids.ui.BidsScreenKt$SetMainAnchorHeightEffect$1$1$3", f = "BidsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.rida.bids.ui.BidsScreenKt$SetMainAnchorHeightEffect$1$1$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements zls {
        /* synthetic */ float F$0;
        /* synthetic */ int I$0;
        int label;

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            float floatValue = ((Number) obj).floatValue();
            int intValue = ((Number) obj2).intValue();
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(3, (Continuation) obj3);
            anonymousClass3.F$0 = floatValue;
            anonymousClass3.I$0 = intValue;
            return anonymousClass3.invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            float f = this.F$0;
            int i = this.I$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                kotlin.b.b(obj);
                return new Pair(new Float(f), new Integer(i));
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Pair;", "", "", "<destruct>", "Lzy11;", "<anonymous>", "(Lkotlin/Pair;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.rida.bids.ui.BidsScreenKt$SetMainAnchorHeightEffect$1$1$4", f = "BidsScreen.kt", l = {183}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.rida.bids.ui.BidsScreenKt$SetMainAnchorHeightEffect$1$1$4, reason: invalid class name */
    final class AnonymousClass4 extends SuspendLambda implements wls {
        final /* synthetic */ wg6 $bottomSheetState;
        final /* synthetic */ fwi $density;
        final /* synthetic */ boolean $isAdditionalPaddingEnabled;
        final /* synthetic */ boolean $isInspectionMode;
        final /* synthetic */ k651 $localWindowInfo;
        final /* synthetic */ lx40 $mainAnchor;
        float F$0;
        float F$1;
        float F$2;
        float F$3;
        float F$4;
        float F$5;
        int I$0;
        int I$1;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(k651 k651Var, fwi fwiVar, boolean z, wg6 wg6Var, boolean z2, lx40 lx40Var, Continuation continuation) {
            super(2, continuation);
            this.$localWindowInfo = k651Var;
            this.$density = fwiVar;
            this.$isAdditionalPaddingEnabled = z;
            this.$bottomSheetState = wg6Var;
            this.$isInspectionMode = z2;
            this.$mainAnchor = lx40Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$localWindowInfo, this.$density, this.$isAdditionalPaddingEnabled, this.$bottomSheetState, this.$isInspectionMode, this.$mainAnchor, continuation);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass4) create((Pair) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            float w0;
            Pair pair = (Pair) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                float floatValue = ((Number) pair.getFirst()).floatValue();
                int intValue = ((Number) pair.getSecond()).intValue();
                int a = (int) (this.$localWindowInfo.a() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                float w02 = this.$density.w0(8.0f);
                float f = (a - intValue) - w02;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                boolean z = this.$isAdditionalPaddingEnabled;
                if (z) {
                    w0 = Math.max(((a / 2) - floatValue) - this.$bottomSheetState.C.getIntValue(), this.$density.w0(60.0f));
                } else {
                    if (z) {
                        w511.b();
                        return null;
                    }
                    w0 = this.$density.w0(8.0f);
                }
                float intValue2 = this.$bottomSheetState.C.getIntValue() + w0;
                float f2 = floatValue + intValue2;
                if (f2 > f) {
                    f2 = f;
                }
                boolean z2 = this.$isInspectionMode;
                lx40 lx40Var = this.$mainAnchor;
                if (z2) {
                    lx40Var.a(f2);
                } else {
                    float floatValue2 = lx40Var.c.getFloatValue();
                    hr5 hr5Var = new hr5(this.$mainAnchor, 0);
                    this.L$0 = null;
                    this.F$0 = floatValue;
                    this.I$0 = intValue;
                    this.I$1 = a;
                    this.F$1 = w02;
                    this.F$2 = f;
                    this.F$3 = w0;
                    this.F$4 = intValue2;
                    this.F$5 = f2;
                    this.label = 1;
                    if (androidx.compose.animation.core.e.c(floatValue2, f2, null, hr5Var, this, 12) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BidsScreenKt$SetMainAnchorHeightEffect$1$1(qor qorVar, m3u0 m3u0Var, k651 k651Var, fwi fwiVar, boolean z, wg6 wg6Var, boolean z2, lx40 lx40Var, Continuation continuation) {
        super(2, continuation);
        this.$driveCardHeightState = qorVar;
        this.$aboveMapContentHeightState = m3u0Var;
        this.$localWindowInfo = k651Var;
        this.$density = fwiVar;
        this.$isAdditionalPaddingEnabled = z;
        this.$bottomSheetState = wg6Var;
        this.$isInspectionMode = z2;
        this.$mainAnchor = lx40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BidsScreenKt$SetMainAnchorHeightEffect$1$1(this.$driveCardHeightState, this.$aboveMapContentHeightState, this.$localWindowInfo, this.$density, this.$isAdditionalPaddingEnabled, this.$bottomSheetState, this.$isInspectionMode, this.$mainAnchor, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BidsScreenKt$SetMainAnchorHeightEffect$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            m0 m0Var = new m0(androidx.compose.runtime.f.o(new fr5(this.$driveCardHeightState, 0)), androidx.compose.runtime.f.o(new gr5(this.$aboveMapContentHeightState, 0)), new AnonymousClass3(3, null));
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$localWindowInfo, this.$density, this.$isAdditionalPaddingEnabled, this.$bottomSheetState, this.$isInspectionMode, this.$mainAnchor, null);
            this.label = 1;
            if (kotlinx.coroutines.flow.e.k(m0Var, anonymousClass4, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
