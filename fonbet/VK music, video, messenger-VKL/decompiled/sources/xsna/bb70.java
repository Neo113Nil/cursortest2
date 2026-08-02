package xsna;

import com.vk.api.generated.notifications.dto.NotificationsNotificationListRedesignResponseDto;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: NotificationListFeatureV2.kt */
@b6l(c = "com.vk.notifications.list.impl.presentation.base.mvi.list.feature.NotificationListFeatureV2$loadNotifications$2", f = "NotificationListFeatureV2.kt", l = {666, 675}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class bb70 extends SuspendLambda implements wzs<yvj, spj<? super NotificationsNotificationListRedesignResponseDto>, Object> {
    final /* synthetic */ String $categoryId;
    final /* synthetic */ boolean $hasNewNotifications;
    final /* synthetic */ int $markAsReadBeforeTime;
    final /* synthetic */ String $nextFrom;
    int label;
    final /* synthetic */ wa70 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb70(int i, boolean z, wa70 wa70Var, String str, String str2, spj<? super bb70> spjVar) {
        super(2, spjVar);
        this.$markAsReadBeforeTime = i;
        this.$hasNewNotifications = z;
        this.this$0 = wa70Var;
        this.$nextFrom = str;
        this.$categoryId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new bb70(this.$markAsReadBeforeTime, this.$hasNewNotifications, this.this$0, this.$nextFrom, this.$categoryId, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super NotificationsNotificationListRedesignResponseDto> spjVar) {
        return ((bb70) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        if (r7 == r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            int i2 = this.$markAsReadBeforeTime;
            if (i2 > 0 && this.$hasNewNotifications) {
                wa70 wa70Var = this.this$0;
                Integer num = new Integer(i2);
                this.label = 1;
                wa70Var.getClass();
                Object k = myc0.k(hqu0.b(), new db70(wa70Var, num, null), this);
                if (k != obj2) {
                    k = s3q0.a;
                }
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return obj;
            }
            kotlin.a.a(obj);
        }
        wa70 wa70Var2 = this.this$0;
        s101 s101Var = wa70Var2.l;
        wa70Var2.Y().getClass();
        iz2 A = yfb.A(s101Var.A(he70.a(), this.$nextFrom, this.$categoryId));
        this.label = 2;
        Object p = evj.p(A, this);
        return p == obj2 ? obj2 : p;
    }
}
