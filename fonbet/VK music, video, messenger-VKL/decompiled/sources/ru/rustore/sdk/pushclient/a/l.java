package ru.rustore.sdk.pushclient.a;

import android.app.Application;
import com.vk.push.core.deviceid.CollectDeviceIdErrorsUseCase;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import xsna.b6l;
import xsna.gay0;
import xsna.gzs;
import xsna.iay0;
import xsna.izs;
import xsna.myc0;
import xsna.piy0;
import xsna.s101;
import xsna.s3q0;
import xsna.siy0;
import xsna.spj;
import xsna.uoy0;
import xsna.wzs;
import xsna.yvj;

@b6l(c = "ru.rustore.sdk.pushclient.internal.VkpnsClientSdk$onInitialize$1", f = "VkpnsClientSdk.kt", l = {Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 134, 135, Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE}, m = "invokeSuspend")
/* loaded from: classes9.dex */
public final class l extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    public int a;
    public final /* synthetic */ h b;

    public static final class a extends Lambda implements gzs<s3q0> {
        public final /* synthetic */ h a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h hVar) {
            super(0);
            this.a = hVar;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            siy0 siy0Var = (siy0) this.a.l.getValue();
            myc0.h(siy0Var.d, null, null, new ru.rustore.sdk.pushclient.t.b(siy0Var, null), 3);
            piy0 piy0Var = (piy0) this.a.m.getValue();
            myc0.h(piy0Var.d, null, null, new ru.rustore.sdk.pushclient.q.b(piy0Var, null), 3);
            return s3q0.a;
        }
    }

    @b6l(c = "ru.rustore.sdk.pushclient.internal.VkpnsClientSdk$onInitialize$1$2", f = "VkpnsClientSdk.kt", l = {139}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
        public int a;
        public final /* synthetic */ h b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(h hVar, spj<? super b> spjVar) {
            super(1, spjVar);
            this.b = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(spj<?> spjVar) {
            return new b(this.b, spjVar);
        }

        @Override // xsna.izs
        public final Object invoke(spj<? super s3q0> spjVar) {
            return new b(this.b, spjVar).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.a;
            if (i == 0) {
                kotlin.a.a(obj);
                ru.rustore.sdk.pushclient.a.a aVar = (ru.rustore.sdk.pushclient.a.a) this.b.n.getValue();
                this.a = 1;
                if (aVar.g(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(h hVar, spj<? super l> spjVar) {
        super(2, spjVar);
        this.b = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new l(this.b, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return new l(this.b, spjVar).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0096, code lost:
    
        if (r8.a(r3, r4, r1, r7) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0098, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
    
        if (r8 == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
    
        if (r8.a(r7) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0036, code lost:
    
        if (ru.rustore.sdk.pushclient.a.h.c(r8, r7) == r0) goto L30;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            kotlin.a.a(obj);
            h hVar = this.b;
            this.a = 1;
        } else if (i == 1) {
            kotlin.a.a(obj);
        } else if (i == 2) {
            kotlin.a.a(obj);
            h hVar2 = this.b;
            this.a = 3;
            Object d = ((iay0) hVar2.e.getValue()).d(this);
            if (d != coroutineSingletons) {
                d = s3q0.a;
            }
        } else {
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return s3q0.a;
            }
            kotlin.a.a(obj);
            uoy0 uoy0Var = (uoy0) this.b.o.getValue();
            h hVar3 = this.b;
            Application application = hVar3.b;
            a aVar = new a(hVar3);
            b bVar = new b(this.b, null);
            this.a = 4;
        }
        ((CollectDeviceIdErrorsUseCase) this.b.k.getValue()).invoke();
        gay0 gay0Var = (gay0) this.b.g.getValue();
        if (s101.f == null) {
            throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
        }
        this.a = 2;
    }
}
