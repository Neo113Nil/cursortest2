package xsna;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.impl.common.BookingError;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingActionResult;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingServiceType;
import com.vk.ecomm.onlinebooking.impl.model.BookingRecord;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.hu7;
import xsna.qt7;
import xsna.ru7;

/* compiled from: BookingRecordCompletedScreenTaskExecutor.kt */
@b6l(c = "com.vk.ecomm.onlinebooking.impl.completed.pesentation.mvi2.BookingRecordCompletedScreenTaskExecutor$cancelRecord$1", f = "BookingRecordCompletedScreenTaskExecutor.kt", l = {TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class su7 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ ru7.a $task;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ uu7 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su7(uu7 uu7Var, ru7.a aVar, spj<? super su7> spjVar) {
        super(2, spjVar);
        this.this$0 = uu7Var;
        this.$task = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        su7 su7Var = new su7(this.this$0, this.$task, spjVar);
        su7Var.L$0 = obj;
        return su7Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((su7) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        BookingServiceType bookingServiceType;
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            try {
                if (i == 0) {
                    kotlin.a.a(obj);
                    this.this$0.e(ju7.a);
                    uu7 uu7Var = this.this$0;
                    zu7 zu7Var = uu7Var.g;
                    ru7.a aVar = this.$task;
                    UserId userId = aVar.b;
                    int i2 = aVar.c;
                    BookingScreenParams bookingScreenParams = uu7Var.h;
                    if (bookingScreenParams == null || (str = bookingScreenParams.m) == null) {
                        str = "";
                    }
                    this.L$0 = yvjVar;
                    this.label = 1;
                    if (zu7Var.a(userId, i2, str, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                zvj.e(yvjVar);
                if (((lu7) this.this$0.b.getCurrentState()).d == null) {
                    bookingServiceType = null;
                } else {
                    BookingRecord bookingRecord = ((lu7) this.this$0.b.getCurrentState()).d;
                    bookingServiceType = (bookingRecord == null || bookingRecord.o != 0) ? BookingServiceType.GROUP : BookingServiceType.INDIVIDUAL;
                }
                this.this$0.c(new qt7.a.C3570a(new Integer(this.$task.c), bookingServiceType));
                this.this$0.c(new qt7.c.e(new BookingScreenParams(this.$task.b, a.f.d.a, null, null, null, false, null, null, null, null, 0, null, 0, null, null, null, BookingActionResult.CANCELLATION_SUCCESS, 65532, null)));
            } catch (BookingError.RecordCancellationException e) {
                zvj.e(yvjVar);
                this.this$0.c(new qt7.b(e));
            }
            iyx.e(yvjVar.getCoroutineContext());
            this.this$0.e(hu7.a.a);
            return s3q0.a;
        } catch (Throwable th) {
            zvj.e(yvjVar);
            this.this$0.e(hu7.a.a);
            throw th;
        }
    }
}
