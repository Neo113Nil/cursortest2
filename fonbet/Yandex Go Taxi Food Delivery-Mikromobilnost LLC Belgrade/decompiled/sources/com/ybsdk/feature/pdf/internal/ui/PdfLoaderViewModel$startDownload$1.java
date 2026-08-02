package com.ybsdk.feature.pdf.internal.ui;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.ybsdk.core.utils.c;
import com.ybsdk.core.utils.d;
import com.ybsdk.feature.pdf.api.PdfLoaderScreenParams;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.rqa0;
import defpackage.tse;
import defpackage.w1j0;
import defpackage.wls;
import defpackage.xqa0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.pdf.internal.ui.PdfLoaderViewModel$startDownload$1", f = "PdfLoaderViewModel.kt", l = {50}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PdfLoaderViewModel$startDownload$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", AuthSdkActivity.RESPONSE_TYPE_TOKEN, "Lkotlin/Result;", "Lw1j0;", "<anonymous>", "(Ljava/lang/String;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.ybsdk.feature.pdf.internal.ui.PdfLoaderViewModel$startDownload$1$2", f = "PdfLoaderViewModel.kt", l = {52}, m = "invokeSuspend")
    /* renamed from: com.ybsdk.feature.pdf.internal.ui.PdfLoaderViewModel$startDownload$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(a aVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                b.b(obj);
                String str = (String) this.L$0;
                a aVar = this.this$0;
                com.ybsdk.feature.pdf.internal.domain.a aVar2 = aVar.E;
                PdfLoaderScreenParams pdfLoaderScreenParams = aVar.B;
                this.label = 1;
                obj = aVar2.c(pdfLoaderScreenParams, str, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
            }
            return new Result(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdfLoaderViewModel$startDownload$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PdfLoaderViewModel$startDownload$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PdfLoaderViewModel$startDownload$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        Object a;
        r0 r0Var2;
        Object value2;
        r0 r0Var3;
        Object value3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            pz40 Y = aVar.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, new xqa0(rqa0.a(aVar.B))));
            a aVar2 = this.this$0;
            c cVar = aVar2.H;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(aVar2, null);
            this.label = 1;
            a = d.a(cVar, anonymousClass2, this);
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
        a aVar3 = this.this$0;
        Throwable a2 = Result.a(a);
        if (a2 != null) {
            pz40 Y2 = aVar3.Y();
            do {
                r0Var3 = (r0) Y2;
                value3 = r0Var3.getValue();
            } while (!r0Var3.k(value3, xqa0.a((xqa0) value3, a2, null, null, 25)));
        }
        a aVar4 = this.this$0;
        if (!(a instanceof Result.Failure)) {
            w1j0 w1j0Var = (w1j0) a;
            pz40 Y3 = aVar4.Y();
            do {
                r0Var2 = (r0) Y3;
                value2 = r0Var2.getValue();
            } while (!r0Var2.k(value2, xqa0.a((xqa0) value2, w1j0Var.b, w1j0Var.a, w1j0Var.c, 9)));
        }
        return zy11.a;
    }
}
