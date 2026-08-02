package xsna;

import com.vk.api.generated.notifications.dto.NotificationsNotificationListRedesignResponseDto;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.fou;

/* compiled from: GroupedNotificationListFeature.kt */
@b6l(c = "com.vk.notifications.list.impl.presentation.base.mvi.grouped.GroupedNotificationListFeature$loadNotifications$2", f = "GroupedNotificationListFeature.kt", l = {417, 424}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class fnu extends SuspendLambda implements wzs<yvj, spj<? super NotificationsNotificationListRedesignResponseDto>, Object> {
    final /* synthetic */ String $nextFrom;
    int label;
    final /* synthetic */ gnu this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fnu(gnu gnuVar, String str, spj<? super fnu> spjVar) {
        super(2, spjVar);
        this.this$0 = gnuVar;
        this.$nextFrom = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new fnu(this.this$0, this.$nextFrom, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super NotificationsNotificationListRedesignResponseDto> spjVar) {
        return ((fnu) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        if (r14 == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
    
        if (r14 == r0) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.a.a(obj);
                return (NotificationsNotificationListRedesignResponseDto) obj;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            return (NotificationsNotificationListRedesignResponseDto) obj;
        }
        kotlin.a.a(obj);
        gnu gnuVar = this.this$0;
        fou fouVar = gnuVar.g;
        s101 s101Var = gnuVar.j;
        if (fouVar instanceof fou.b) {
            String str = ((fou.b) fouVar).a;
            String str2 = this.$nextFrom;
            s101Var.getClass();
            tfx tfxVar = new tfx("notifications.ungroupRedesign", new eq0(21), new k73(24));
            tfx.o(tfxVar, "query", str, 0, 0, 12);
            if (str2 != null) {
                tfx.o(tfxVar, "start_from", str2, 0, 0, 12);
            }
            iz2 A = yfb.A(tfxVar);
            this.label = 1;
            obj = evj.p(A, this);
        } else {
            if (!(fouVar instanceof fou.a)) {
                throw new NoWhenBranchMatchedException();
            }
            iz2 A2 = yfb.A(s101Var.A(new Long(((fou.a) fouVar).a), this.$nextFrom, null));
            this.label = 2;
            obj = evj.p(A2, this);
        }
        return coroutineSingletons;
    }
}
