package com.ybsdk.feature.card.internal.presentation.singlecard;

import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.card.api.CardSecondFactorHelper$Request;
import com.ybsdk.rconfig.configs.NonYbProductDetailsFlags;
import com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationParams;
import com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationTarget;
import defpackage.dzh0;
import defpackage.en8;
import defpackage.gao;
import defpackage.hgs0;
import defpackage.if8;
import defpackage.jgs0;
import defpackage.mf8;
import defpackage.mvg;
import defpackage.n0t0;
import defpackage.ny61;
import defpackage.oe60;
import defpackage.pk11;
import defpackage.pz40;
import defpackage.qk11;
import defpackage.qn8;
import defpackage.r8j0;
import defpackage.rgs0;
import defpackage.rk11;
import defpackage.sk11;
import defpackage.t8j0;
import defpackage.tse;
import defpackage.u8j0;
import defpackage.vgs0;
import defpackage.wls;
import defpackage.zqj0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.card.internal.presentation.singlecard.SingleCardViewModel$requestRequisitesIfRequired$2", f = "SingleCardViewModel.kt", l = {202, 205, SubsamplingScaleImageView.ORIENTATION_270}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SingleCardViewModel$requestRequisitesIfRequired$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $cardId;
    final /* synthetic */ Integer $errorMessage;
    final /* synthetic */ String $operationId;
    final /* synthetic */ wls $successCallback;
    final /* synthetic */ String $verificationToken;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "idempotencyToken", "Lkotlin/Result;", "Lsk11;", "Laq51;", "<anonymous>", "(Ljava/lang/String;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.ybsdk.feature.card.internal.presentation.singlecard.SingleCardViewModel$requestRequisitesIfRequired$2$2", f = "SingleCardViewModel.kt", l = {206}, m = "invokeSuspend")
    /* renamed from: com.ybsdk.feature.card.internal.presentation.singlecard.SingleCardViewModel$requestRequisitesIfRequired$2$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ String $cardId;
        final /* synthetic */ String $operationId;
        final /* synthetic */ String $verificationToken;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(a aVar, String str, String str2, String str3, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
            this.$verificationToken = str;
            this.$operationId = str2;
            this.$cardId = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$verificationToken, this.$operationId, this.$cardId, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                b.b(obj);
                String str = (String) this.L$0;
                en8 en8Var = this.this$0.N;
                String str2 = this.$verificationToken;
                String str3 = this.$operationId;
                String str4 = this.$cardId;
                this.label = 1;
                a = en8Var.a(str2, str, str3, str4, this);
                if (a == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                a = ((Result) obj).getValue();
            }
            return new Result(a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleCardViewModel$requestRequisitesIfRequired$2(a aVar, wls wlsVar, String str, String str2, String str3, Integer num, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$successCallback = wlsVar;
        this.$cardId = str;
        this.$verificationToken = str2;
        this.$operationId = str3;
        this.$errorMessage = num;
    }

    public static rgs0 i(rgs0 rgs0Var) {
        return rgs0.a(rgs0Var, null, false, null, false, null, null, false, 1007);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SingleCardViewModel$requestRequisitesIfRequired$2(this.this$0, this.$successCallback, this.$cardId, this.$verificationToken, this.$operationId, this.$errorMessage, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SingleCardViewModel$requestRequisitesIfRequired$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x01f3, code lost:
    
        if (r5.invoke(r3, r36) == r2) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0206 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:8:0x0016, B:9:0x01fc, B:11:0x0206, B:13:0x020a, B:14:0x021f, B:15:0x0210, B:28:0x0024, B:29:0x00ac, B:31:0x00b8, B:33:0x00bf, B:35:0x00c5, B:39:0x00f2, B:41:0x010a, B:43:0x0116, B:44:0x0159, B:45:0x014b, B:46:0x0163, B:48:0x0167, B:49:0x016b, B:52:0x0188, B:54:0x0194, B:56:0x019a, B:58:0x01aa, B:59:0x019e, B:62:0x01b3, B:64:0x01b7, B:65:0x01bb, B:68:0x01e6, B:72:0x01f6, B:73:0x01fb, B:74:0x0031, B:76:0x0039, B:78:0x0047, B:80:0x004d, B:83:0x005b, B:84:0x0061, B:87:0x0084), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b8 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:8:0x0016, B:9:0x01fc, B:11:0x0206, B:13:0x020a, B:14:0x021f, B:15:0x0210, B:28:0x0024, B:29:0x00ac, B:31:0x00b8, B:33:0x00bf, B:35:0x00c5, B:39:0x00f2, B:41:0x010a, B:43:0x0116, B:44:0x0159, B:45:0x014b, B:46:0x0163, B:48:0x0167, B:49:0x016b, B:52:0x0188, B:54:0x0194, B:56:0x019a, B:58:0x01aa, B:59:0x019e, B:62:0x01b3, B:64:0x01b7, B:65:0x01bb, B:68:0x01e6, B:72:0x01f6, B:73:0x01fb, B:74:0x0031, B:76:0x0039, B:78:0x0047, B:80:0x004d, B:83:0x005b, B:84:0x0061, B:87:0x0084), top: B:2:0x000c }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        Object O;
        r0 r0Var3;
        Object value3;
        r0 r0Var4;
        Object value4;
        n0t0 n0t0Var;
        r0 r0Var5;
        Object value5;
        FragmentScreen b;
        r0 r0Var6;
        Object value6;
        Throwable a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                u8j0 u8j0Var = ((rgs0) this.this$0.X()).c;
                r8j0 r8j0Var = u8j0Var instanceof r8j0 ? (r8j0) u8j0Var : null;
                if (r8j0Var != null) {
                    wls wlsVar = this.$successCallback;
                    Object obj2 = r8j0Var.a;
                    this.label = 1;
                    if (wlsVar.invoke(obj2, this) == coroutineSingletons) {
                    }
                } else {
                    pz40 Y = this.this$0.Y();
                    do {
                        r0Var2 = (r0) Y;
                        value2 = r0Var2.getValue();
                    } while (!r0Var2.k(value2, rgs0.a((rgs0) value2, null, false, new t8j0(), false, null, null, false, 1007)));
                    a aVar = this.this$0;
                    String str = "card_details_" + this.$cardId;
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$verificationToken, this.$operationId, this.$cardId, null);
                    this.label = 2;
                    O = aVar.O(anonymousClass2, str, this);
                    if (O == coroutineSingletons) {
                    }
                    a aVar2 = this.this$0;
                    wls wlsVar2 = this.$successCallback;
                    String str2 = this.$cardId;
                    Integer num = this.$errorMessage;
                    if (!(O instanceof Result.Failure)) {
                    }
                    a aVar3 = this.this$0;
                    Integer num2 = this.$errorMessage;
                    a = Result.a(O);
                    if (a != null) {
                    }
                }
                return coroutineSingletons;
            }
            if (i == 1) {
                b.b(obj);
            } else if (i == 2) {
                b.b(obj);
                O = ((Result) obj).getValue();
                a aVar22 = this.this$0;
                wls wlsVar22 = this.$successCallback;
                String str22 = this.$cardId;
                Integer num3 = this.$errorMessage;
                if (!(O instanceof Result.Failure)) {
                    sk11 sk11Var = (sk11) O;
                    if (sk11Var instanceof pk11) {
                        pz40 Y2 = aVar22.Y();
                        qn8 qn8Var = aVar22.F;
                        do {
                            r0Var5 = (r0) Y2;
                            value5 = r0Var5.getValue();
                        } while (!r0Var5.k(value5, rgs0.a((rgs0) value5, null, false, null, false, new zqj0(((pk11) sk11Var).b, str22, num3, wlsVar22), null, false, 959)));
                        if (((NonYbProductDetailsFlags) ((if8) aVar22.M).a.d(oe60.a).getData()).getNonYbProductsEnabled() && com.ybsdk.feature.card.internal.interactors.requisites.a.a(aVar22.B.getProductId())) {
                            Text.Empty empty = Text.Empty.INSTANCE;
                            String str3 = ((pk11) sk11Var).a;
                            CardSecondFactorHelper$Request cardSecondFactorHelper$Request = CardSecondFactorHelper$Request.REQUISITES;
                            mf8 mf8Var = (mf8) qn8Var;
                            mf8Var.getClass();
                            b = com.ybsdk.screens.registration.a.e(mf8Var.a, new CodeConfirmationParams.HeaderText.UniversalText(null, 1, null), str3, null, null, false, null, null, cardSecondFactorHelper$Request.getKey(), OpenScreenRequirement.WithUid.INSTANCE, false, CodeConfirmationTarget.CorpCardAuthorization.INSTANCE, 1260);
                        } else {
                            Text.Empty empty2 = Text.Empty.INSTANCE;
                            b = ((mf8) qn8Var).b(((pk11) sk11Var).a, CardSecondFactorHelper$Request.REQUISITES);
                        }
                        aVar22.E.h(b);
                    } else if (sk11Var instanceof qk11) {
                        pz40 Y3 = aVar22.Y();
                        do {
                            r0Var4 = (r0) Y3;
                            value4 = r0Var4.getValue();
                        } while (!r0Var4.k(value4, rgs0.a((rgs0) value4, null, false, null, false, null, null, false, 943)));
                        hgs0 b2 = ((rgs0) aVar22.X()).b();
                        jgs0 jgs0Var = b2 != null ? b2.n : null;
                        if (jgs0Var == null || (n0t0Var = jgs0Var.a) == null) {
                            n0t0Var = new n0t0(new Text.Resource(dzh0.ybsdk_card_card_payment_details_loading_failure));
                        }
                        aVar22.Z(new vgs0(n0t0Var));
                    } else {
                        if (!(sk11Var instanceof rk11)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        pz40 Y4 = aVar22.Y();
                        do {
                            r0Var3 = (r0) Y4;
                            value3 = r0Var3.getValue();
                        } while (!r0Var3.k(value3, rgs0.a((rgs0) value3, null, false, new r8j0(((rk11) sk11Var).a, null, 14), false, null, null, false, 943)));
                        Object obj3 = ((rk11) sk11Var).a;
                        this.L$0 = O;
                        this.label = 3;
                    }
                }
                a aVar32 = this.this$0;
                Integer num22 = this.$errorMessage;
                a = Result.a(O);
                if (a != null) {
                }
            } else {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                O = this.L$0;
                b.b(obj);
                a aVar322 = this.this$0;
                Integer num222 = this.$errorMessage;
                a = Result.a(O);
                if (a != null) {
                    aVar322.Z(new vgs0(num222 == null ? gao.e(null, null, a, 3) : gao.d(new Text.Resource(num222.intValue()), Text.Empty.INSTANCE, a)));
                }
            }
            if (((rgs0) this.this$0.X()).c instanceof t8j0) {
                pz40 Y5 = this.this$0.Y();
                do {
                    r0Var6 = (r0) Y5;
                    value6 = r0Var6.getValue();
                } while (!r0Var6.k(value6, i((rgs0) value6)));
            }
            return zy11.a;
        } catch (Throwable th) {
            if (((rgs0) this.this$0.X()).c instanceof t8j0) {
                pz40 Y6 = this.this$0.Y();
                do {
                    r0Var = (r0) Y6;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, i((rgs0) value)));
            }
            throw th;
        }
    }
}
