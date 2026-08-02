package xsna;

import android.content.Context;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.superapp.vkhealth.permissions.api.RequestedMiniApp;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: VkHealthPermissionsManagerExtensions.kt */
/* loaded from: classes6.dex */
public final class byu0 {

    /* compiled from: VkHealthPermissionsManagerExtensions.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<iyu0, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(iyu0 iyu0Var) {
            ((spj) this.receiver).resumeWith(iyu0Var);
            return s3q0.a;
        }
    }

    /* compiled from: VkHealthPermissionsManagerExtensions.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((spj) this.receiver).resumeWith(new Result.Failure(th));
            return s3q0.a;
        }
    }

    public static final Object a(ayu0 ayu0Var, Context context, SuspendLambda suspendLambda) {
        gzg0 gzg0Var = new gzg0(s7s0.c(suspendLambda));
        try {
            ayu0Var.l(context, new ee8(1, gzg0Var, upj.class, CampaignEx.JSON_NATIVE_VIDEO_RESUME, "resume(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V", 1, 16));
        } catch (Throwable th) {
            gzg0Var.resumeWith(new Result.Failure(th));
        }
        Object a2 = gzg0Var.a();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return a2;
    }

    public static final Object b(ayu0 ayu0Var, Context context, RequestedMiniApp requestedMiniApp, spj<? super iyu0> spjVar) {
        gzg0 gzg0Var = new gzg0(s7s0.c(spjVar));
        try {
            ayu0Var.j(context, requestedMiniApp, new b(1, gzg0Var, upj.class, "resumeWithException", "resumeWithException(Lkotlin/coroutines/Continuation;Ljava/lang/Throwable;)V", 1), new a(1, gzg0Var, upj.class, CampaignEx.JSON_NATIVE_VIDEO_RESUME, "resume(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V", 1));
        } catch (Throwable th) {
            gzg0Var.resumeWith(new Result.Failure(th));
        }
        Object a2 = gzg0Var.a();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return a2;
    }

    public static final Object c(ayu0 ayu0Var, Context context, ContinuationImpl continuationImpl) {
        gzg0 gzg0Var = new gzg0(s7s0.c(continuationImpl));
        try {
            ayu0Var.i(context, new xgb0(gzg0Var, 2));
        } catch (Throwable th) {
            gzg0Var.resumeWith(new Result.Failure(th));
        }
        Object a2 = gzg0Var.a();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return a2;
    }
}
