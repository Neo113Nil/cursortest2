package com.ybsdk.feature.transfer.internal.screens.result.domain;

import com.ybsdk.core.transfer.utils.domain.entities.TransferStatus;
import com.ybsdk.feature.transfer.api.TransferResultScreenParams;
import defpackage.ayp0;
import defpackage.et01;
import defpackage.mvg;
import defpackage.mw3;
import defpackage.ny61;
import defpackage.tse;
import defpackage.vpr;
import defpackage.wls;
import defpackage.x4c;
import defpackage.zxp0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u00030\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Layp0;", "Let01;", "Lcom/ybsdk/feature/transfer/internal/screens/result/domain/TransferStatusEntity2fa;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.internal.screens.result.domain.TransferStatusInteractor$getTransferStatuses$1", f = "TransferStatusInteractor.kt", l = {34, 47}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TransferStatusInteractor$getTransferStatuses$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $verificationToken;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.ybsdk.feature.transfer.internal.screens.result.domain.TransferStatusInteractor$getTransferStatuses$1$1", f = "TransferStatusInteractor.kt", l = {35, 36, 41, 43, 44}, m = "invokeSuspend")
    /* renamed from: com.ybsdk.feature.transfer.internal.screens.result.domain.TransferStatusInteractor$getTransferStatuses$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ vpr $$this$flow;
        final /* synthetic */ String $verificationToken;
        Object L$0;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b bVar, String str, vpr vprVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bVar;
            this.$verificationToken = str;
            this.$$this$flow = vprVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$verificationToken, this.$$this$flow, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x00b3, code lost:
        
            if (r13.emit(r1, r12) == r0) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0096, code lost:
        
            if (r13.emit(r1, r12) == r0) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00a3, code lost:
        
            if (r13 == r0) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0053, code lost:
        
            if (r13.emit(r1, r12) == r0) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0042, code lost:
        
            if (r13 == r0) goto L38;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ayp0 ayp0Var;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                b bVar = this.this$0;
                TransferResultScreenParams transferResultScreenParams = bVar.c;
                String str = this.$verificationToken;
                this.label = 1;
                obj = b.a(bVar, transferResultScreenParams, str, this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                kotlin.b.b(obj);
                                zxp0 zxp0Var = new zxp0(obj);
                                vpr vprVar = this.$$this$flow;
                                this.label = 5;
                            } else if (i != 5) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        }
                        kotlin.b.b(obj);
                        return zy11.a;
                    }
                    ayp0Var = (ayp0) this.L$0;
                    kotlin.b.b(obj);
                    if (ayp0Var instanceof zxp0) {
                        et01 et01Var = (et01) ((zxp0) ayp0Var).a;
                        if (et01Var.a == TransferStatus.PROCESSING) {
                            String str2 = et01Var.b;
                            if (str2 == null) {
                                str2 = this.this$0.c.getTransferId();
                            }
                            if (str2 == null) {
                                x4c.g("transferId is null in ConfirmResult and screenArguments", null, null, null, 14);
                                vpr vprVar2 = this.$$this$flow;
                                zxp0 zxp0Var2 = new zxp0(new et01(TransferStatus.ERROR, (String) null, (String) null, (mw3) null, 30));
                                this.L$0 = null;
                                this.label = 3;
                            } else {
                                b bVar2 = this.this$0;
                                this.L$0 = null;
                                this.label = 4;
                                obj = b.b(bVar2, str2, this);
                            }
                            return coroutineSingletons;
                        }
                    }
                    return zy11.a;
                }
                kotlin.b.b(obj);
            }
            ayp0Var = (ayp0) obj;
            vpr vprVar3 = this.$$this$flow;
            this.L$0 = ayp0Var;
            this.label = 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferStatusInteractor$getTransferStatuses$1(b bVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$verificationToken = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TransferStatusInteractor$getTransferStatuses$1 transferStatusInteractor$getTransferStatuses$1 = new TransferStatusInteractor$getTransferStatuses$1(this.this$0, this.$verificationToken, continuation);
        transferStatusInteractor$getTransferStatuses$1.L$0 = obj;
        return transferStatusInteractor$getTransferStatuses$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TransferStatusInteractor$getTransferStatuses$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        if (r1.emit(r11, r10) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        if (r11 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vprVar = (vpr) this.L$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$verificationToken, vprVar, null);
            this.L$0 = vprVar;
            this.label = 1;
            obj = kotlinx.coroutines.a.w(15000L, anonymousClass1, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar = (vpr) this.L$0;
            kotlin.b.b(obj);
        }
        if (((zy11) obj) == null) {
            zxp0 zxp0Var = new zxp0(new et01(TransferStatus.TIMEOUT, (String) null, (String) null, (mw3) null, 30));
            this.L$0 = null;
            this.label = 2;
        }
        return zy11.a;
    }
}
