package xsna;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;
import ru.ok.android.commons.http.Http;
import xsna.ha70;
import xsna.jnu;
import xsna.xh70;

/* compiled from: GroupedNotificationListFeature.kt */
@b6l(c = "com.vk.notifications.list.impl.presentation.base.mvi.grouped.GroupedNotificationListFeature$handleDeleteNotification$1", f = "GroupedNotificationListFeature.kt", l = {Http.StatusCode.SEE_OTHER}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class zmu extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ ha70.b $action;
    final /* synthetic */ wnu $state;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ gnu this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zmu(gnu gnuVar, ha70.b bVar, wnu wnuVar, spj<? super zmu> spjVar) {
        super(2, spjVar);
        this.this$0 = gnuVar;
        this.$action = bVar;
        this.$state = wnuVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new zmu(this.this$0, this.$action, this.$state, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((zmu) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00af  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Result.Failure failure;
        Object obj2;
        ha70.b bVar;
        gnu gnuVar;
        wnu wnuVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                gnu gnuVar2 = this.this$0;
                bVar = this.$action;
                wnu wnuVar2 = this.$state;
                iz2 A = yfb.A(m4s.A(gnuVar2.j, bVar.b));
                this.L$0 = gnuVar2;
                this.L$1 = bVar;
                this.L$2 = wnuVar2;
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                if (evj.p(A, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                gnuVar = gnuVar2;
                wnuVar = wnuVar2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wnuVar = (wnu) this.L$2;
                bVar = (ha70.b) this.L$1;
                gnuVar = (gnu) this.L$0;
                kotlin.a.a(obj);
            }
            Integer g = i7o0.g(wnuVar.i, new iie(bVar, 16));
            if (g != null) {
                kb70 kb70Var = wnuVar.i.get(g.intValue());
                gnuVar.T(new jnu.b(g.intValue()));
                gnuVar.T(new jnu.r(new xh70.a(new ha70.w(bVar.b, g.intValue(), kb70Var))));
            }
            obj2 = s3q0.a;
        } catch (TimeoutCancellationException e) {
            failure = new Result.Failure(e);
            obj2 = failure;
            gnu gnuVar3 = this.this$0;
            if (Result.a(obj2) != null) {
            }
            return s3q0.a;
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
            obj2 = failure;
            gnu gnuVar32 = this.this$0;
            if (Result.a(obj2) != null) {
            }
            return s3q0.a;
        }
        gnu gnuVar322 = this.this$0;
        if (Result.a(obj2) != null) {
            gnuVar322.T(jnu.o.b);
        }
        return s3q0.a;
    }
}
