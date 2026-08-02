package xsna;

import com.vk.api.generated.serviceBooking.dto.ServiceBookingGetStaffResponseDto;
import com.vk.dto.common.id.UserId;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: BookingMastersInteractor.kt */
/* loaded from: classes18.dex */
public final class zq7 {
    public final loi0 a;

    public zq7(loi0 loi0Var) {
        this.a = loi0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(UserId userId, ContinuationImpl continuationImpl) {
        xq7 xq7Var;
        int i;
        if (continuationImpl instanceof xq7) {
            xq7Var = (xq7) continuationImpl;
            int i2 = xq7Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xq7Var.label = i2 - Integer.MIN_VALUE;
                Object obj = xq7Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = xq7Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    iz2 A = yfb.A(this.a.a(userId, null, null));
                    xq7Var.L$0 = null;
                    xq7Var.L$1 = null;
                    xq7Var.L$2 = null;
                    xq7Var.label = 1;
                    obj = evj.p(A, xq7Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return new wq7(crx0.d((ServiceBookingGetStaffResponseDto) obj));
            }
        }
        xq7Var = new xq7(this, continuationImpl);
        Object obj2 = xq7Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = xq7Var.label;
        if (i != 0) {
        }
        return new wq7(crx0.d((ServiceBookingGetStaffResponseDto) obj2));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(UserId userId, String str, ArrayList arrayList, ContinuationImpl continuationImpl) {
        yq7 yq7Var;
        int i;
        if (continuationImpl instanceof yq7) {
            yq7Var = (yq7) continuationImpl;
            int i2 = yq7Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yq7Var.label = i2 - Integer.MIN_VALUE;
                Object obj = yq7Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = yq7Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    iz2 A = yfb.A(this.a.a(userId, str, arrayList));
                    yq7Var.L$0 = null;
                    yq7Var.L$1 = null;
                    yq7Var.L$2 = null;
                    yq7Var.label = 1;
                    obj = evj.p(A, yq7Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return crx0.d((ServiceBookingGetStaffResponseDto) obj);
            }
        }
        yq7Var = new yq7(this, continuationImpl);
        Object obj2 = yq7Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = yq7Var.label;
        if (i != 0) {
        }
        return crx0.d((ServiceBookingGetStaffResponseDto) obj2);
    }
}
