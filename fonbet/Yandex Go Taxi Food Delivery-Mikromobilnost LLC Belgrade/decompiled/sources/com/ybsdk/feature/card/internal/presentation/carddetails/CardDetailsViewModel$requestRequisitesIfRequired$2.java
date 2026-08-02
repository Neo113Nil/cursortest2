package com.ybsdk.feature.card.internal.presentation.carddetails;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.card.api.CardSecondFactorHelper$Request;
import defpackage.bq8;
import defpackage.dzh0;
import defpackage.en8;
import defpackage.fe8;
import defpackage.gao;
import defpackage.mf8;
import defpackage.mvg;
import defpackage.n0t0;
import defpackage.ny61;
import defpackage.pk11;
import defpackage.pz40;
import defpackage.qk11;
import defpackage.qn8;
import defpackage.r8j0;
import defpackage.rk11;
import defpackage.sk11;
import defpackage.t8j0;
import defpackage.tfl0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zqj0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.card.internal.presentation.carddetails.CardDetailsViewModel$requestRequisitesIfRequired$2", f = "CardDetailsViewModel.kt", l = {423, 428, 480}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CardDetailsViewModel$requestRequisitesIfRequired$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $cardId;
    final /* synthetic */ Integer $errorMessage;
    final /* synthetic */ String $operationId;
    final /* synthetic */ wls $successCallback;
    final /* synthetic */ String $verificationToken;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "idempotencyToken", "Lkotlin/Result;", "Lsk11;", "Laq51;", "<anonymous>", "(Ljava/lang/String;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.ybsdk.feature.card.internal.presentation.carddetails.CardDetailsViewModel$requestRequisitesIfRequired$2$2", f = "CardDetailsViewModel.kt", l = {NetworkRequestException.TOO_MANY_REQUESTS}, m = "invokeSuspend")
    /* renamed from: com.ybsdk.feature.card.internal.presentation.carddetails.CardDetailsViewModel$requestRequisitesIfRequired$2$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ String $cardId;
        final /* synthetic */ String $operationId;
        final /* synthetic */ String $verificationToken;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(b bVar, String str, String str2, String str3, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bVar;
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
                kotlin.b.b(obj);
                String str = (String) this.L$0;
                en8 en8Var = this.this$0.S;
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
                kotlin.b.b(obj);
                a = ((Result) obj).getValue();
            }
            return new Result(a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardDetailsViewModel$requestRequisitesIfRequired$2(b bVar, String str, wls wlsVar, String str2, String str3, Integer num, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$cardId = str;
        this.$successCallback = wlsVar;
        this.$verificationToken = str2;
        this.$operationId = str3;
        this.$errorMessage = num;
    }

    public static bq8 i(String str, bq8 bq8Var) {
        return bq8.a(bq8Var, null, kotlin.collections.b.j(str, bq8Var.b), false, null, null, null, null, null, null, 16381);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CardDetailsViewModel$requestRequisitesIfRequired$2(this.this$0, this.$cardId, this.$successCallback, this.$verificationToken, this.$operationId, this.$errorMessage, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CardDetailsViewModel$requestRequisitesIfRequired$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x01b4, code lost:
    
        if (r4.invoke(r3, r23) == r2) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x01c9 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:8:0x0016, B:9:0x01bf, B:11:0x01c9, B:13:0x01cd, B:14:0x01e2, B:15:0x01d3, B:28:0x0024, B:29:0x00c3, B:31:0x00cf, B:33:0x00d6, B:34:0x00da, B:37:0x0109, B:39:0x0120, B:41:0x0124, B:42:0x0128, B:45:0x014f, B:47:0x0164, B:49:0x0168, B:50:0x016f, B:54:0x01a7, B:57:0x01b9, B:58:0x01be, B:59:0x0031, B:61:0x0039, B:63:0x004d, B:65:0x0053, B:68:0x0061, B:69:0x0069, B:72:0x009b), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cf A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:8:0x0016, B:9:0x01bf, B:11:0x01c9, B:13:0x01cd, B:14:0x01e2, B:15:0x01d3, B:28:0x0024, B:29:0x00c3, B:31:0x00cf, B:33:0x00d6, B:34:0x00da, B:37:0x0109, B:39:0x0120, B:41:0x0124, B:42:0x0128, B:45:0x014f, B:47:0x0164, B:49:0x0168, B:50:0x016f, B:54:0x01a7, B:57:0x01b9, B:58:0x01be, B:59:0x0031, B:61:0x0039, B:63:0x004d, B:65:0x0053, B:68:0x0061, B:69:0x0069, B:72:0x009b), top: B:2:0x000c }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        bq8 bq8Var;
        Object O;
        r0 r0Var3;
        Object value3;
        bq8 bq8Var2;
        r0 r0Var4;
        Object value4;
        bq8 bq8Var3;
        r0 r0Var5;
        Object value5;
        r0 r0Var6;
        Object value6;
        Throwable a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                Object obj2 = ((bq8) this.this$0.X()).b.get(this.$cardId);
                r8j0 r8j0Var = obj2 instanceof r8j0 ? (r8j0) obj2 : null;
                if (r8j0Var != null) {
                    wls wlsVar = this.$successCallback;
                    Object obj3 = r8j0Var.a;
                    this.label = 1;
                    if (wlsVar.invoke(obj3, this) == coroutineSingletons) {
                    }
                } else {
                    b bVar = this.this$0;
                    String str = this.$cardId;
                    pz40 Y = bVar.Y();
                    do {
                        r0Var2 = (r0) Y;
                        value2 = r0Var2.getValue();
                        bq8Var = (bq8) value2;
                    } while (!r0Var2.k(value2, bq8.a(bq8Var, null, kotlin.collections.b.o(bq8Var.b, new Pair(str, new t8j0())), false, null, null, null, null, null, null, 16381)));
                    b bVar2 = this.this$0;
                    String str2 = "card_details_" + this.$cardId;
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$verificationToken, this.$operationId, this.$cardId, null);
                    this.label = 2;
                    O = bVar2.O(anonymousClass2, str2, this);
                    if (O == coroutineSingletons) {
                    }
                    b bVar3 = this.this$0;
                    wls wlsVar2 = this.$successCallback;
                    String str3 = this.$cardId;
                    Integer num = this.$errorMessage;
                    if (!(O instanceof Result.Failure)) {
                    }
                    b bVar4 = this.this$0;
                    Integer num2 = this.$errorMessage;
                    a = Result.a(O);
                    if (a != null) {
                    }
                }
                return coroutineSingletons;
            }
            if (i == 1) {
                kotlin.b.b(obj);
            } else if (i == 2) {
                kotlin.b.b(obj);
                O = ((Result) obj).getValue();
                b bVar32 = this.this$0;
                wls wlsVar22 = this.$successCallback;
                String str32 = this.$cardId;
                Integer num3 = this.$errorMessage;
                if (!(O instanceof Result.Failure)) {
                    sk11 sk11Var = (sk11) O;
                    if (sk11Var instanceof pk11) {
                        pz40 Y2 = bVar32.Y();
                        do {
                            r0Var5 = (r0) Y2;
                            value5 = r0Var5.getValue();
                        } while (!r0Var5.k(value5, bq8.a((bq8) value5, null, null, false, null, null, null, null, null, new zqj0(((pk11) sk11Var).b, str32, num3, wlsVar22), 14335)));
                        tfl0 tfl0Var = bVar32.C;
                        qn8 qn8Var = bVar32.H;
                        Text.Empty empty = Text.Empty.INSTANCE;
                        tfl0Var.h(((mf8) qn8Var).b(((pk11) sk11Var).a, CardSecondFactorHelper$Request.REQUISITES));
                    } else if (sk11Var instanceof qk11) {
                        pz40 Y3 = bVar32.Y();
                        do {
                            r0Var4 = (r0) Y3;
                            value4 = r0Var4.getValue();
                            bq8Var3 = (bq8) value4;
                        } while (!r0Var4.k(value4, bq8.a(bq8Var3, null, kotlin.collections.b.j(str32, bq8Var3.b), false, null, null, null, null, null, null, 14333)));
                        bVar32.Z(new fe8(new n0t0(new Text.Resource(dzh0.ybsdk_card_card_payment_details_loading_failure))));
                    } else {
                        if (!(sk11Var instanceof rk11)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        rk11 rk11Var = (rk11) sk11Var;
                        pz40 Y4 = bVar32.Y();
                        do {
                            r0Var3 = (r0) Y4;
                            value3 = r0Var3.getValue();
                            bq8Var2 = (bq8) value3;
                        } while (!r0Var3.k(value3, bq8.a(bq8Var2, null, kotlin.collections.b.o(bq8Var2.b, new Pair(str32, new r8j0(rk11Var.a, null, 14))), false, null, null, null, null, null, null, 14333)));
                        Object obj4 = ((rk11) sk11Var).a;
                        this.L$0 = O;
                        this.label = 3;
                    }
                }
                b bVar42 = this.this$0;
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
                kotlin.b.b(obj);
                b bVar422 = this.this$0;
                Integer num222 = this.$errorMessage;
                a = Result.a(O);
                if (a != null) {
                    bVar422.Z(new fe8(num222 == null ? gao.e(null, null, a, 3) : gao.d(Text.Empty.INSTANCE, new Text.Resource(num222.intValue()), a)));
                }
            }
            if (((bq8) this.this$0.X()).b.get(this.$cardId) instanceof t8j0) {
                b bVar5 = this.this$0;
                String str4 = this.$cardId;
                pz40 Y5 = bVar5.Y();
                do {
                    r0Var6 = (r0) Y5;
                    value6 = r0Var6.getValue();
                } while (!r0Var6.k(value6, i(str4, (bq8) value6)));
            }
            return zy11.a;
        } catch (Throwable th) {
            if (((bq8) this.this$0.X()).b.get(this.$cardId) instanceof t8j0) {
                b bVar6 = this.this$0;
                String str5 = this.$cardId;
                pz40 Y6 = bVar6.Y();
                do {
                    r0Var = (r0) Y6;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, i(str5, (bq8) value)));
            }
            throw th;
        }
    }
}
