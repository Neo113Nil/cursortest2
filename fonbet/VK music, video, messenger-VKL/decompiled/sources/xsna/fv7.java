package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingActionResult;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingServiceType;
import com.vk.ecomm.onlinebooking.impl.model.BookingRecord;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.dv7;
import xsna.iw7;
import xsna.mm7;
import xsna.xv7;

/* compiled from: BookingRecordsScreenFeature.kt */
@b6l(c = "com.vk.ecomm.onlinebooking.impl.records.BookingRecordsScreenFeature$cancelRecord$1", f = "BookingRecordsScreenFeature.kt", l = {129}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class fv7 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ iw7.d $state;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ev7 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fv7(iw7.d dVar, ev7 ev7Var, spj<? super fv7> spjVar) {
        super(2, spjVar);
        this.$state = dVar;
        this.this$0 = ev7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new fv7(this.$state, this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((fv7) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BookingScreenParams bookingScreenParams;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            try {
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                this.this$0.i.b(e2);
            }
            if (i == 0) {
                kotlin.a.a(obj);
                iw7.d dVar = this.$state;
                BookingScreenParams bookingScreenParams2 = dVar != null ? dVar.d : null;
                BookingRecord bookingRecord = dVar != null ? dVar.e : null;
                if ((bookingScreenParams2 != null ? bookingScreenParams2.b : null) != null && bookingRecord != null) {
                    zu7 zu7Var = this.this$0.g;
                    UserId userId = bookingScreenParams2.b;
                    int i2 = bookingRecord.b;
                    String str = bookingRecord.p;
                    this.L$0 = bookingScreenParams2;
                    this.L$1 = null;
                    this.label = 1;
                    if (zu7Var.a(userId, i2, str, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    bookingScreenParams = bookingScreenParams2;
                }
                ev7 ev7Var = this.this$0;
                ev7Var.getClass();
                ev7Var.T(xv7.a.b);
                return s3q0.a;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            BookingScreenParams bookingScreenParams3 = (BookingScreenParams) this.L$0;
            kotlin.a.a(obj);
            bookingScreenParams = bookingScreenParams3;
            this.this$0.j.b(new mm7.b.a(bookingScreenParams.b, new Integer(bookingScreenParams.l), this.$state.e.o == 0 ? BookingServiceType.INDIVIDUAL : BookingServiceType.GROUP));
            ev7 ev7Var2 = this.this$0;
            dv7.f fVar = new dv7.f(bookingScreenParams);
            BookingActionResult bookingActionResult = BookingActionResult.CANCELLATION_SUCCESS;
            ev7Var2.getClass();
            ev7Var2.T(new xv7.e(bookingScreenParams));
            myc0.h(ev7Var2.f, null, null, new gv7(ev7Var2, bookingScreenParams, bookingActionResult, fVar, null), 3);
            ev7 ev7Var3 = this.this$0;
            ev7Var3.getClass();
            ev7Var3.T(xv7.a.b);
            return s3q0.a;
        } catch (Throwable th) {
            ev7 ev7Var4 = this.this$0;
            ev7Var4.getClass();
            ev7Var4.T(xv7.a.b);
            throw th;
        }
    }
}
