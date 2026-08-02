package xsna;

import androidx.car.app.hardware.common.CarZone;
import com.vk.reefton.protocol.ReefProtocol$Event;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.oy1;

/* compiled from: AnalyticsWebSocketListener.kt */
@b6l(c = "com.vk.push.pushsdk.notifier.websocket.listener.AnalyticsWebSocketListener$startLoop$1", f = "AnalyticsWebSocketListener.kt", l = {69}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ry1 extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ oy1 this$0;

    /* compiled from: AnalyticsWebSocketListener.kt */
    @b6l(c = "com.vk.push.pushsdk.notifier.websocket.listener.AnalyticsWebSocketListener$startLoop$1$1", f = "AnalyticsWebSocketListener.kt", l = {CarZone.CAR_ZONE_COLUMN_DRIVER, CarZone.CAR_ZONE_COLUMN_DRIVER, ReefProtocol$Event.Type.IMAGES_IMAGE_LOADED_VALUE}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;
        final /* synthetic */ oy1 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(oy1 oy1Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.this$0 = oy1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.this$0, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
        
            if (r8.invoke(r7) == r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
        
            if (r8 == r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
        
            if (xsna.qsl.b(r5, r7) == r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
        
            return r0;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0045 -> B:12:0x0023). Please report as a decompilation issue!!! */
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
                    long j = ((qjx0) obj).b;
                    this.label = 2;
                } else if (i == 2) {
                    kotlin.a.a(obj);
                    n4w0 n4w0Var = this.this$0.c;
                    this.label = 3;
                } else if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            kotlin.a.a(obj);
            oy1 oy1Var = this.this$0;
            this.label = 1;
            obj = oy1.a(oy1Var, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ry1(oy1 oy1Var, spj<? super ry1> spjVar) {
        super(1, spjVar);
        this.this$0 = oy1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new ry1(this.this$0, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super s3q0> spjVar) {
        return ((ry1) create(spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a2;
        eyx eyxVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            oy1 oy1Var = this.this$0;
            this.label = 1;
            a2 = oy1.a(oy1Var, this);
            if (a2 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            a2 = obj;
        }
        if (!((qjx0) a2).a) {
            return s3q0.a;
        }
        oy1.a aVar = this.this$0.f;
        if (aVar != null && (eyxVar = aVar.d) != null) {
            eyxVar.b(null);
        }
        oy1 oy1Var2 = this.this$0;
        long currentTimeMillis = System.currentTimeMillis();
        oy1 oy1Var3 = this.this$0;
        oy1Var2.f = new oy1.a(0L, currentTimeMillis, 0L, myc0.h(oy1Var3.e, null, null, new a(oy1Var3, null), 3));
        w80 w80Var = oy1Var2.b;
        myc0.h(w80Var.e, null, null, new y80(w80Var, 0L, 0L, null), 3);
        return s3q0.a;
    }
}
