package xsna;

import android.content.Context;
import com.vk.stat.sak.model.DebugStatsEventKey;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeDebugStatsItem;
import java.util.Map;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONObject;
import xsna.mgn0;

/* compiled from: SuperAppKitPerformanceChecker.kt */
/* loaded from: classes11.dex */
public abstract class i9n0 {
    public volatile long a;
    public volatile long b;
    public final bpn0 c = new bpn0(new lq6(6));

    /* compiled from: SuperAppKitPerformanceChecker.kt */
    @b6l(c = "com.vk.superapp.perf.time.SuperAppKitPerformanceChecker$end$1", f = "SuperAppKitPerformanceChecker.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ Context $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return i9n0.this.new a(this.$context, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            i9n0 i9n0Var = i9n0.this;
            Context context = this.$context;
            String a = context != null ? dgq0.a(context) : null;
            if (a == null) {
                a = "";
            }
            i9n0Var.g(a);
            i9n0 i9n0Var2 = i9n0.this;
            i9n0Var2.a = 0L;
            i9n0Var2.b = 0L;
            return s3q0.a;
        }
    }

    public final void a() {
        this.a = gcd0.y();
        e("Start = " + this.a);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    public final void b(Context context) {
        this.b = gcd0.y();
        if (this.a <= 0) {
            this.a = 0L;
            this.b = 0L;
            return;
        }
        e("Finish = " + this.b);
        if (b0h0.a()) {
            myc0.h(vhv0.a(), dgn0.f().getIo(), null, new a(context, null), 2);
            return;
        }
        mgn0 mgn0Var = dgn0.a;
        mgn0 mgn0Var2 = dgn0.a;
        ((mgn0.h) (mgn0Var2 != null ? mgn0Var2 : null).j.getValue()).c().execute(new li0(5, this, context));
    }

    public abstract DebugStatsEventKey c();

    public abstract String d();

    public final void e(String str) {
        xgx0 xgx0Var = xgx0.a;
        String str2 = "[SuperAppKitPerformanceChecker] [" + d() + "] - " + str;
        xgx0Var.getClass();
        xgx0.b(str2);
    }

    public final void f(String str, String str2) {
        ((Map) this.c.getValue()).put(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [kotlin.Result$Failure] */
    public final void g(String str) {
        JSONObject failure;
        long j = this.b - this.a;
        String h = c().h();
        String d = d();
        JSONObject put = new JSONObject().put("time", String.valueOf(j)).put("user_agent", str);
        if (this.c.isInitialized()) {
            try {
                failure = new JSONObject();
                for (Map.Entry entry : ((Map) this.c.getValue()).entrySet()) {
                    failure.put((String) entry.getKey(), (String) entry.getValue());
                }
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            r3 = failure instanceof Result.Failure ? null : failure;
        }
        new x6l(new SchemeStatSak$TypeDebugStatsItem(h, d, null, put.putOpt("metadata", r3).toString(), 4, null), false).q();
        e("Save = " + j);
    }
}
