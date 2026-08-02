package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.impl.model.BookingRecord;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: BookingRecordCompletedScreenTaskExecutor.kt */
@b6l(c = "com.vk.ecomm.onlinebooking.impl.completed.pesentation.mvi2.BookingRecordCompletedScreenTaskExecutor$loadRecords$1", f = "BookingRecordCompletedScreenTaskExecutor.kt", l = {57}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class tu7 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int I$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ uu7 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tu7(uu7 uu7Var, spj<? super tu7> spjVar) {
        super(2, spjVar);
        this.this$0 = uu7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        tu7 tu7Var = new tu7(this.this$0, spjVar);
        tu7Var.L$0 = obj;
        return tu7Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((tu7) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Exception exc;
        tu7 tu7Var;
        zu7 zu7Var;
        UserId userId;
        int i;
        String str;
        String str2;
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        try {
        } catch (Exception e) {
            exc = e;
            tu7Var = this;
        }
        if (i2 == 0) {
            kotlin.a.a(obj);
            uu7 uu7Var = this.this$0;
            BookingScreenParams bookingScreenParams = uu7Var.h;
            if (bookingScreenParams == null) {
                throw new IllegalStateException("params must be not null");
            }
            ?? r4 = bookingScreenParams.o != null ? 1 : 0;
            uu7Var.c(new vt7(bookingScreenParams.b, r4, new Integer(bookingScreenParams.l)));
            uu7 uu7Var2 = this.this$0;
            BookingRecord bookingRecord = uu7Var2.h.o;
            if (bookingRecord != null) {
                return s3q0.a;
            }
            try {
                uu7Var2.e(ju7.a);
                uu7 uu7Var3 = this.this$0;
                zu7Var = uu7Var3.g;
                BookingScreenParams bookingScreenParams2 = uu7Var3.h;
                userId = bookingScreenParams2.b;
                i = bookingScreenParams2.l;
                BookingScreenParams.DateTime dateTime = bookingScreenParams2.h;
                str = dateTime != null ? dateTime.b : null;
                str2 = bookingScreenParams2.m;
                this.L$0 = yvjVar;
                this.I$0 = r4;
                this.label = 1;
                tu7Var = this;
            } catch (Exception e2) {
                e = e2;
                tu7Var = this;
                exc = e;
                zvj.e(yvjVar);
                uu7 uu7Var4 = tu7Var.this$0;
                BookingScreenParams bookingScreenParams3 = uu7Var4.h;
                uu7Var4.c(new ut7(bookingScreenParams3.b, new Integer(bookingScreenParams3.l)));
                return s3q0.a;
            }
            try {
                obj = zu7Var.b(userId, i, str, str2, tu7Var);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } catch (Exception e3) {
                e = e3;
                exc = e;
                zvj.e(yvjVar);
                uu7 uu7Var42 = tu7Var.this$0;
                BookingScreenParams bookingScreenParams32 = uu7Var42.h;
                uu7Var42.c(new ut7(bookingScreenParams32.b, new Integer(bookingScreenParams32.l)));
                return s3q0.a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            tu7Var = this;
        }
        zvj.e(yvjVar);
        return s3q0.a;
    }
}
