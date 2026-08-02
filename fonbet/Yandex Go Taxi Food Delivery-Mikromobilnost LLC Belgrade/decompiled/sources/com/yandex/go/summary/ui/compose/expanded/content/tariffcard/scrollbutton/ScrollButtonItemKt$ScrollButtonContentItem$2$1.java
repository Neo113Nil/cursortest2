package com.yandex.go.summary.ui.compose.expanded.content.tariffcard.scrollbutton;

import defpackage.ck11;
import defpackage.hhp0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sb2;
import defpackage.tse;
import defpackage.ubn;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.ui.compose.expanded.content.tariffcard.scrollbutton.ScrollButtonItemKt$ScrollButtonContentItem$2$1", f = "ScrollButtonItem.kt", l = {80, HProv.ALG_SID_KECCAK_224, HProv.PP_BIO_STATISTICA_LEN}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ScrollButtonItemKt$ScrollButtonContentItem$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ float $jumpHeightPx;
    final /* synthetic */ hhp0 $scrollButtonUiState;
    final /* synthetic */ androidx.compose.animation.core.a $translationY;
    float F$0;
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollButtonItemKt$ScrollButtonContentItem$2$1(hhp0 hhp0Var, androidx.compose.animation.core.a aVar, float f, Continuation continuation) {
        super(2, continuation);
        this.$scrollButtonUiState = hhp0Var;
        this.$translationY = aVar;
        this.$jumpHeightPx = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScrollButtonItemKt$ScrollButtonContentItem$2$1(this.$scrollButtonUiState, this.$translationY, this.$jumpHeightPx, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScrollButtonItemKt$ScrollButtonContentItem$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00fa  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00f2 -> B:7:0x00f4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00fa -> B:8:0x00fe). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        hhp0 hhp0Var;
        int i;
        androidx.compose.animation.core.a aVar;
        float f;
        int i2;
        float f2;
        androidx.compose.animation.core.a aVar2;
        hhp0 hhp0Var2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        androidx.compose.animation.core.a aVar3;
        hhp0 hhp0Var3;
        Float f3;
        ck11 K;
        androidx.compose.animation.core.a aVar4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = this.label;
        if (i8 == 0) {
            b.b(obj);
            hhp0 hhp0Var4 = this.$scrollButtonUiState;
            int i9 = hhp0Var4.b;
            if (i9 > 0) {
                hhp0Var = hhp0Var4;
                i = i9;
                aVar = this.$translationY;
                f = this.$jumpHeightPx;
                i2 = 0;
                if (i2 < i) {
                }
            }
            return zy11.a;
        }
        if (i8 == 1) {
            int i10 = this.I$2;
            int i11 = this.I$1;
            float f4 = this.F$0;
            int i12 = this.I$0;
            hhp0 hhp0Var5 = (hhp0) this.L$1;
            aVar3 = (androidx.compose.animation.core.a) this.L$0;
            b.b(obj);
            i2 = i10;
            i7 = i11;
            f2 = f4;
            i6 = i12;
            hhp0Var3 = hhp0Var5;
            f3 = new Float(0.0f);
            K = sb2.K(1000, 0, ubn.a, 2);
            this.L$0 = aVar3;
            this.L$1 = hhp0Var3;
            this.I$0 = i6;
            this.F$0 = f2;
            this.I$1 = i7;
            this.I$2 = i2;
            this.label = 2;
            hhp0 hhp0Var6 = hhp0Var3;
            aVar4 = aVar3;
            if (androidx.compose.animation.core.a.d(aVar4, f3, K, null, null, this, 12) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i8 != 2) {
            if (i8 != 3) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i13 = this.I$1;
            float f5 = this.F$0;
            i3 = this.I$0;
            hhp0Var2 = (hhp0) this.L$1;
            aVar2 = (androidx.compose.animation.core.a) this.L$0;
            b.b(obj);
            f = f5;
            i4 = i13;
            i = i3;
            hhp0Var = hhp0Var2;
            aVar = aVar2;
            i2 = i4 + 1;
            if (i2 < i) {
                Float f6 = new Float(-f);
                ck11 K2 = sb2.K(500, 0, ubn.a, 2);
                this.L$0 = aVar;
                this.L$1 = hhp0Var;
                this.I$0 = i;
                this.F$0 = f;
                this.I$1 = i2;
                this.I$2 = i2;
                this.label = 1;
                if (androidx.compose.animation.core.a.d(aVar, f6, K2, null, null, this, 12) != coroutineSingletons) {
                    aVar3 = aVar;
                    hhp0Var3 = hhp0Var;
                    i6 = i;
                    f2 = f;
                    i7 = i2;
                    f3 = new Float(0.0f);
                    K = sb2.K(1000, 0, ubn.a, 2);
                    this.L$0 = aVar3;
                    this.L$1 = hhp0Var3;
                    this.I$0 = i6;
                    this.F$0 = f2;
                    this.I$1 = i7;
                    this.I$2 = i2;
                    this.label = 2;
                    hhp0 hhp0Var62 = hhp0Var3;
                    aVar4 = aVar3;
                    if (androidx.compose.animation.core.a.d(aVar4, f3, K, null, null, this, 12) != coroutineSingletons) {
                        aVar2 = aVar4;
                        i5 = i2;
                        i4 = i7;
                        i3 = i6;
                        hhp0Var2 = hhp0Var62;
                        if (i5 >= hhp0Var2.b - 1) {
                            long j = hhp0Var2.c;
                            this.L$0 = aVar2;
                            this.L$1 = hhp0Var2;
                            this.I$0 = i3;
                            this.F$0 = f2;
                            this.I$1 = i4;
                            this.I$2 = i5;
                            this.label = 3;
                            if (kotlinx.coroutines.a.i(j, this) != coroutineSingletons) {
                                i13 = i4;
                                f5 = f2;
                                f = f5;
                                i4 = i13;
                                i = i3;
                                hhp0Var = hhp0Var2;
                                aVar = aVar2;
                                i2 = i4 + 1;
                                if (i2 < i) {
                                }
                            }
                        } else {
                            f = f2;
                            hhp0Var = hhp0Var2;
                            aVar = aVar2;
                            i = i3;
                            i2 = i4 + 1;
                            if (i2 < i) {
                            }
                        }
                    }
                }
                return coroutineSingletons;
            }
            return zy11.a;
        }
        i5 = this.I$2;
        i4 = this.I$1;
        float f7 = this.F$0;
        int i14 = this.I$0;
        hhp0 hhp0Var7 = (hhp0) this.L$1;
        androidx.compose.animation.core.a aVar5 = (androidx.compose.animation.core.a) this.L$0;
        b.b(obj);
        f2 = f7;
        i3 = i14;
        hhp0Var2 = hhp0Var7;
        aVar2 = aVar5;
        if (i5 >= hhp0Var2.b - 1) {
        }
    }
}
