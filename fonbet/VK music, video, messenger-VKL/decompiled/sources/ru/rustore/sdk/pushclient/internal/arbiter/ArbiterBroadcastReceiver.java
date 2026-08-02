package ru.rustore.sdk.pushclient.internal.arbiter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.vk.push.common.DefaultLogger;
import com.vk.push.common.Logger;
import com.vk.push.core.base.SdkInitAwaiter;
import com.vk.push.core.domain.ComponentActions;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.pushclient.a.h;
import xsna.aaz0;
import xsna.b6l;
import xsna.bdn;
import xsna.bpn0;
import xsna.gzs;
import xsna.hpj;
import xsna.myc0;
import xsna.s101;
import xsna.s3q0;
import xsna.spj;
import xsna.whn0;
import xsna.wzs;
import xsna.yvj;
import xsna.zvj;

/* loaded from: classes9.dex */
public final class ArbiterBroadcastReceiver extends BroadcastReceiver {
    public final bpn0 a = new bpn0(new a());
    public final hpj b = zvj.a(bdn.b.plus(whn0.a()));

    public static final class a extends Lambda implements gzs<Logger> {
        public a() {
            super(0);
        }

        @Override // xsna.gzs
        public final Logger invoke() {
            Logger defaultLogger;
            ArbiterBroadcastReceiver arbiterBroadcastReceiver = ArbiterBroadcastReceiver.this;
            aaz0 aaz0Var = s101.f;
            if (aaz0Var == null || (defaultLogger = aaz0Var.c) == null) {
                defaultLogger = new DefaultLogger("VkpnsClientSdk");
            }
            return defaultLogger.createLogger(arbiterBroadcastReceiver);
        }
    }

    @b6l(c = "ru.rustore.sdk.pushclient.internal.arbiter.ArbiterBroadcastReceiver$onReceive$1", f = "ArbiterBroadcastReceiver.kt", l = {26}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        public int a;
        public final /* synthetic */ Intent b;
        public final /* synthetic */ BroadcastReceiver.PendingResult c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Intent intent, BroadcastReceiver.PendingResult pendingResult, spj<? super b> spjVar) {
            super(2, spjVar);
            this.b = intent;
            this.c = pendingResult;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new b(this.b, this.c, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return new b(this.b, this.c, spjVar).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0057 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object b;
            Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.a;
            try {
                if (i == 0) {
                    kotlin.a.a(obj);
                    Intent intent = this.b;
                    String action = intent != null ? intent.getAction() : null;
                    if (action != null && action.hashCode() == 1854594276 && action.equals(ComponentActions.MASTER_HOST_UPDATE_ACTION)) {
                        h.b bVar = h.t;
                        this.a = 1;
                        if (SdkInitAwaiter.awaitInitialization$default(h.w, 0L, 1, null) && (b = h.b(h.b.a(), this)) == obj2) {
                            if (b == obj2) {
                                return obj2;
                            }
                        }
                        b = s3q0.a;
                        if (b == obj2) {
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                this.c.finish();
                return s3q0.a;
            } catch (Throwable th) {
                this.c.finish();
                throw th;
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Logger.DefaultImpls.info$default((Logger) this.a.getValue(), "Master update broadcast received", null, 2, null);
        myc0.h(this.b, null, null, new b(intent, goAsync(), null), 3);
    }
}
