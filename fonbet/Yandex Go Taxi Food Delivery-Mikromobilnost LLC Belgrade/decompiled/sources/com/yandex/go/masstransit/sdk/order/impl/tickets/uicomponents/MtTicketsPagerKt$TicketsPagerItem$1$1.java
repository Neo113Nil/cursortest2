package com.yandex.go.masstransit.sdk.order.impl.tickets.uicomponents;

import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import defpackage.a940;
import defpackage.ck11;
import defpackage.l840;
import defpackage.ldf;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.p740;
import defpackage.sb2;
import defpackage.t740;
import defpackage.tls;
import defpackage.tse;
import defpackage.u510;
import defpackage.ubn;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.masstransit.sdk.order.impl.tickets.uicomponents.MtTicketsPagerKt$TicketsPagerItem$1$1", f = "MtTicketsPager.kt", l = {174, 176, SubsamplingScaleImageView.ORIENTATION_180, 184}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MtTicketsPagerKt$TicketsPagerItem$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $action;
    final /* synthetic */ oz40 $animationPlayed$delegate;
    final /* synthetic */ boolean $isCurrentPage;
    final /* synthetic */ androidx.compose.animation.core.a $replayAlpha;
    final /* synthetic */ t740 $state;
    final /* synthetic */ u510 $ticket;
    final /* synthetic */ oz40 $wasEverActive$delegate;
    final /* synthetic */ oz40 $wasHeldOffScreen$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtTicketsPagerKt$TicketsPagerItem$1$1(t740 t740Var, u510 u510Var, boolean z, androidx.compose.animation.core.a aVar, oz40 oz40Var, oz40 oz40Var2, oz40 oz40Var3, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.$state = t740Var;
        this.$ticket = u510Var;
        this.$isCurrentPage = z;
        this.$replayAlpha = aVar;
        this.$animationPlayed$delegate = oz40Var;
        this.$wasEverActive$delegate = oz40Var2;
        this.$wasHeldOffScreen$delegate = oz40Var3;
        this.$action = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtTicketsPagerKt$TicketsPagerItem$1$1(this.$state, this.$ticket, this.$isCurrentPage, this.$replayAlpha, this.$animationPlayed$delegate, this.$wasEverActive$delegate, this.$wasHeldOffScreen$delegate, this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtTicketsPagerKt$TicketsPagerItem$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e6, code lost:
    
        if (r0 != r7) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0097, code lost:
    
        if (r0 == r7) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a7, code lost:
    
        if (r0 == r7) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00dd, code lost:
    
        if (androidx.compose.animation.core.a.d(r0, r2, r1, null, null, r12, 12) == r7) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00fa  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object i;
        Object i2;
        Object i3;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = this.label;
        zy11 zy11Var = zy11.a;
        if (i4 == 0) {
            kotlin.b.b(obj);
            if ((this.$state instanceof p740) && this.$ticket.k && this.$isCurrentPage) {
                oz40 oz40Var = this.$animationPlayed$delegate;
                ldf ldfVar = d.a;
                if (!((Boolean) oz40Var.getValue()).booleanValue()) {
                    int i5 = l840.a[(!((Boolean) this.$wasEverActive$delegate.getValue()).booleanValue() ? MtTicketsPagerItemHelper$ExpirationAnimationDelayKind.ReplayFadeInThenDelay : ((Boolean) this.$wasHeldOffScreen$delegate.getValue()).booleanValue() ? MtTicketsPagerItemHelper$ExpirationAnimationDelayKind.HeldOffScreenDelay : MtTicketsPagerItemHelper$ExpirationAnimationDelayKind.StandardExpirationDelay).ordinal()];
                    if (i5 == 1) {
                        if (((Number) this.$replayAlpha.e()).floatValue() < 1.0f) {
                            androidx.compose.animation.core.a aVar = this.$replayAlpha;
                            Float f = new Float(1.0f);
                            ck11 K = sb2.K(300, 0, ubn.a, 2);
                            this.label = 1;
                        }
                        this.label = 2;
                        i3 = kotlinx.coroutines.a.i(400L, this);
                    } else if (i5 == 2) {
                        this.label = 3;
                        i = kotlinx.coroutines.a.i(400L, this);
                    } else {
                        if (i5 != 3) {
                            w511.b();
                            return null;
                        }
                        this.label = 4;
                        i2 = kotlinx.coroutines.a.i(300L, this);
                    }
                    return coroutineSingletons;
                }
            }
            return zy11Var;
        }
        if (i4 != 1) {
            if (i4 == 2) {
                kotlin.b.b(obj);
                i3 = obj;
                oz40 oz40Var2 = this.$animationPlayed$delegate;
                ldf ldfVar2 = d.a;
                oz40Var2.setValue(Boolean.TRUE);
                str = this.$ticket.b;
                if (str != null) {
                }
                return zy11Var;
            }
            if (i4 == 3) {
                kotlin.b.b(obj);
                i = obj;
                oz40 oz40Var22 = this.$animationPlayed$delegate;
                ldf ldfVar22 = d.a;
                oz40Var22.setValue(Boolean.TRUE);
                str = this.$ticket.b;
                if (str != null) {
                }
                return zy11Var;
            }
            if (i4 != 4) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            i2 = obj;
            oz40 oz40Var222 = this.$animationPlayed$delegate;
            ldf ldfVar222 = d.a;
            oz40Var222.setValue(Boolean.TRUE);
            str = this.$ticket.b;
            if (str != null) {
                this.$action.invoke(new a940(str));
            }
            return zy11Var;
        }
        kotlin.b.b(obj);
        this.label = 2;
        i3 = kotlinx.coroutines.a.i(400L, this);
    }
}
