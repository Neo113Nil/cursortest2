package xsna;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.vk.push.common.Logger;
import com.vk.push.core.utils.IdleHandler;
import com.vk.push.core.utils.PackageExtenstionsKt;
import com.vk.push.pushsdk.data.source.PushServiceType;
import com.vk.push.pushsdk.ipc.ForegroundPushService;
import com.vk.push.pushsdk.ipc.PushService;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.yly;

/* compiled from: StartPushServiceUseCase.kt */
/* loaded from: classes5.dex */
public final class pqk0 {
    public final Context a;
    public final Intent b;
    public final yly c;
    public final hpj d;
    public final Logger e;

    /* compiled from: StartPushServiceUseCase.kt */
    @b6l(c = "com.vk.push.pushsdk.domain.usecase.StartPushServiceUseCase$invoke$1", f = "StartPushServiceUseCase.kt", l = {40, 45, 54}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        public a(spj<? super a> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return pqk0.this.new a(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
        
            if (xsna.pqk0.a(r6, r1, r5) == r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
        
            if (xsna.pqk0.a(r6, r1, r5) == r0) goto L18;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                pqk0 pqk0Var = pqk0.this;
                pqk0Var.getClass();
                if (PackageExtenstionsKt.isIgnoringBatteryOptimizations$default(pqk0Var.a, null, 1, null)) {
                    Logger.DefaultImpls.info$default(pqk0.this.e, "Allowed to work in the background, starting service quietly.", null, 2, null);
                    pqk0 pqk0Var2 = pqk0.this;
                    Context context = pqk0Var2.a;
                    this.label = 2;
                } else {
                    Logger.DefaultImpls.info$default(pqk0.this.e, "\n                    Not allowed to work in the background and start in foreground mode.\n                    Trying to start service anyway.\n                 ", null, 2, null);
                    pqk0 pqk0Var3 = pqk0.this;
                    Context context2 = pqk0Var3.a;
                    this.label = 3;
                }
            } else {
                if (i != 1 && i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    public pqk0(Context context, yly ylyVar, Logger logger) {
        Intent intent = new Intent(context, (Class<?>) PushService.class);
        new Intent(context, (Class<?>) ForegroundPushService.class);
        hpj a2 = zvj.a(bdn.b);
        this.a = context;
        this.b = intent;
        this.c = ylyVar;
        this.d = a2;
        this.e = logger.createLogger("StartPushServiceUseCase");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(pqk0 pqk0Var, Context context, ContinuationImpl continuationImpl) {
        qqk0 qqk0Var;
        Object obj;
        int i;
        pqk0 pqk0Var2;
        boolean z;
        pqk0 pqk0Var3;
        pqk0Var.getClass();
        if (continuationImpl instanceof qqk0) {
            qqk0Var = (qqk0) continuationImpl;
            int i2 = qqk0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qqk0Var.label = i2 - Integer.MIN_VALUE;
                obj = qqk0Var.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = qqk0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    yly ylyVar = pqk0Var.c;
                    qqk0Var.L$0 = pqk0Var;
                    qqk0Var.L$1 = context;
                    qqk0Var.Z$0 = false;
                    qqk0Var.label = 1;
                    obj = ylyVar.a(qqk0Var);
                    if (obj == obj2) {
                        return obj2;
                    }
                    pqk0Var2 = pqk0Var;
                    z = false;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z = qqk0Var.Z$0;
                        context = (Context) qqk0Var.L$1;
                        pqk0Var3 = (pqk0) qqk0Var.L$0;
                        kotlin.a.a(obj);
                        pqk0Var2 = pqk0Var3;
                        if (z) {
                            IdleHandler.INSTANCE.post(new rqk0(pqk0Var2, context));
                        } else {
                            Intent intent = pqk0Var2.b;
                            Logger logger = pqk0Var2.e;
                            try {
                                context.startService(intent);
                            } catch (IllegalStateException e) {
                                logger.error("Unable to start push service", e);
                            } catch (RuntimeException e2) {
                                logger.error("Unable to start push service", e2);
                            }
                        }
                        return s3q0.a;
                    }
                    z = qqk0Var.Z$0;
                    context = (Context) qqk0Var.L$1;
                    pqk0Var2 = (pqk0) qqk0Var.L$0;
                    kotlin.a.a(obj);
                }
                if (obj != PushServiceType.BACKGROUND) {
                    Context context2 = pqk0Var2.a;
                    try {
                        context2.getPackageManager().setComponentEnabledSetting(new ComponentName(context2, (Class<?>) PushService.class), 1, 1);
                    } catch (RuntimeException unused) {
                    }
                    Context context3 = pqk0Var2.a;
                    try {
                        context3.getPackageManager().setComponentEnabledSetting(new ComponentName(context3, (Class<?>) ForegroundPushService.class), 2, 1);
                    } catch (RuntimeException unused2) {
                    }
                    yly ylyVar2 = pqk0Var2.c;
                    PushServiceType pushServiceType = PushServiceType.BACKGROUND;
                    qqk0Var.L$0 = pqk0Var2;
                    qqk0Var.L$1 = context;
                    qqk0Var.Z$0 = z;
                    qqk0Var.label = 2;
                    Object write = ylyVar2.a.write(new yly.a(pushServiceType), qqk0Var);
                    if (write != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        write = s3q0.a;
                    }
                    if (write == obj2) {
                        return obj2;
                    }
                    pqk0Var3 = pqk0Var2;
                    pqk0Var2 = pqk0Var3;
                }
                if (z) {
                }
                return s3q0.a;
            }
        }
        qqk0Var = new qqk0(pqk0Var, continuationImpl);
        obj = qqk0Var.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = qqk0Var.label;
        if (i != 0) {
        }
        if (obj != PushServiceType.BACKGROUND) {
        }
        if (z) {
        }
        return s3q0.a;
    }

    public final void b() {
        myc0.h(this.d, null, null, new a(null), 3);
    }
}
