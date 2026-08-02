package com.yandex.go.yb.domain;

import android.net.Uri;
import com.adjust.sdk.Constants;
import com.yandex.go.yb.api.domain.model.YbScreenSource;
import com.yandex.messaging.domain.poll.PollMessageDraft;
import defpackage.avu0;
import defpackage.aw51;
import defpackage.cvu0;
import defpackage.cw51;
import defpackage.ew51;
import defpackage.g6u;
import defpackage.hh31;
import defpackage.ijs;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tse;
import defpackage.uyj;
import defpackage.v770;
import defpackage.wls;
import defpackage.yv51;
import defpackage.zv51;
import defpackage.zy11;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.deeplinks.ExternalSchemesInteractor;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.yb.domain.YbSdkDeeplinkHandlerImpl$handleDeeplinkAuthorized$1", f = "YbSdkDeeplinkHandlerImpl.kt", l = {HProv.PP_VERSION_TIMESTAMP, PollMessageDraft.MAX_ANSWER_LENGTH}, m = "invokeSuspend", v = 2)
/* loaded from: classes15.dex */
final class YbSdkDeeplinkHandlerImpl$handleDeeplinkAuthorized$1 extends SuspendLambda implements wls {
    final /* synthetic */ v770 $openReason;
    final /* synthetic */ Uri $uri;
    Object L$0;
    int label;
    final /* synthetic */ y this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.yb.domain.YbSdkDeeplinkHandlerImpl$handleDeeplinkAuthorized$1$1", f = "YbSdkDeeplinkHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.yb.domain.YbSdkDeeplinkHandlerImpl$handleDeeplinkAuthorized$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ ew51 $intent;
        int label;
        final /* synthetic */ y this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(y yVar, ew51 ew51Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = yVar;
            this.$intent = ew51Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$intent, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((tse) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            y yVar = this.this$0;
            ew51 ew51Var = this.$intent;
            yVar.h.a.invoke(new ijs(14, new hh31(22, yVar, ew51Var)));
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YbSdkDeeplinkHandlerImpl$handleDeeplinkAuthorized$1(y yVar, Uri uri, v770 v770Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = yVar;
        this.$uri = uri;
        this.$openReason = v770Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new YbSdkDeeplinkHandlerImpl$handleDeeplinkAuthorized$1(this.this$0, this.$uri, this.$openReason, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((YbSdkDeeplinkHandlerImpl$handleDeeplinkAuthorized$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x012f, code lost:
    
        if (defpackage.tje.k0(r1, r3, r7) == r0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0131, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bf, code lost:
    
        if (r8 == r0) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0115  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ew51 yv51Var;
        aw51 aw51Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ExternalSchemesInteractor externalSchemesInteractor = this.this$0.i;
            Uri uri = this.$uri;
            externalSchemesInteractor.getClass();
            if (ExternalSchemesInteractor.a(uri)) {
                yv51Var = new cw51(y.c(this.this$0, this.$openReason), this.$uri.toString());
            } else {
                boolean l = jl40.l(this.$uri.getQueryParameter(MetaDataField.SCREEN_FIELD), "deposit");
                y yVar = this.this$0;
                Uri uri2 = this.$uri;
                if (l) {
                    YbScreenSource c = y.c(yVar, this.$openReason);
                    this.label = 1;
                    String queryParameter = uri2.getQueryParameter("currency");
                    if (queryParameter == null || queryParameter.length() == 0) {
                        aw51Var = new aw51(null, c);
                    } else {
                        String queryParameter2 = uri2.getQueryParameter("amount");
                        BigDecimal h = queryParameter2 != null ? avu0.h(queryParameter2) : null;
                        if (h == null) {
                            String queryParameter3 = uri2.getQueryParameter("up_to_amount");
                            BigDecimal h2 = queryParameter3 != null ? avu0.h(queryParameter3) : null;
                            if (h2 != null) {
                                obj = yVar.d(queryParameter, h2, c, this);
                            } else {
                                aw51Var = new aw51(null, c);
                            }
                        } else if (h.compareTo(BigDecimal.ZERO) < 0) {
                            aw51Var = new aw51(null, c);
                        } else {
                            obj = new aw51(new zv51(queryParameter, h), c);
                        }
                    }
                    obj = aw51Var;
                } else {
                    yVar.getClass();
                    String queryParameter4 = uri2.getQueryParameter(Constants.DEEPLINK);
                    if (queryParameter4 == null) {
                        y yVar2 = this.this$0;
                        Uri uri3 = this.$uri;
                        yVar2.getClass();
                        String encodedSchemeSpecificPart = uri3.getEncodedSchemeSpecificPart();
                        queryParameter4 = cvu0.x(encodedSchemeSpecificPart, "//yandex_bank", false) ? cvu0.v(encodedSchemeSpecificPart, "//yandex_bank/", "yandexbank://", false) : null;
                    }
                    yv51Var = (queryParameter4 == null || queryParameter4.length() == 0) ? new yv51(y.c(this.this$0, this.$openReason)) : new cw51(y.c(this.this$0, this.$openReason), queryParameter4);
                }
            }
            if (yv51Var != null) {
                this.this$0.f.getClass();
                sjh sjhVar = uyj.a;
                g6u g6uVar = o400.a;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, yv51Var, null);
                this.L$0 = null;
                this.label = 2;
            }
            return zy11.a;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return zy11.a;
        }
        kotlin.b.b(obj);
        yv51Var = (ew51) obj;
        if (yv51Var != null) {
        }
        return zy11.a;
    }
}
