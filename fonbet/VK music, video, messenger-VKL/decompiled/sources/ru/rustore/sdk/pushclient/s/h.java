package ru.rustore.sdk.pushclient.s;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.vk.push.common.Logger;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.bdn;
import xsna.ie00;
import xsna.k1z0;
import xsna.myc0;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.xwy0;
import xsna.yvj;

@b6l(c = "ru.rustore.sdk.pushclient.internal.domain.usecase.RegisterPushClickActivityCallbackUseCase$onActivityCreated$1", f = "RegisterPushClickActivityCallbackUseCase.kt", l = {38, 42, 45, 49}, m = "invokeSuspend")
/* loaded from: classes9.dex */
public final class h extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    public Bundle a;
    public String b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Activity e;
    public final /* synthetic */ k1z0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Activity activity, k1z0 k1z0Var, spj<? super h> spjVar) {
        super(2, spjVar);
        this.e = activity;
        this.f = k1z0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        h hVar = new h(this.e, this.f, spjVar);
        hVar.d = obj;
        return hVar;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((h) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00d9, code lost:
    
        if (xsna.k1z0.a(r4, r3, r1, r10) == r0) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00cd A[Catch: all -> 0x00e6, TryCatch #0 {all -> 0x00e6, blocks: (B:8:0x0013, B:9:0x00e4, B:16:0x0028, B:17:0x00c5, B:19:0x00cd, B:23:0x00dd, B:25:0x0035, B:26:0x00a8, B:28:0x00ac, B:33:0x0042, B:34:0x0085, B:36:0x008d, B:38:0x0090, B:42:0x0051, B:44:0x0057, B:46:0x005a, B:49:0x0061, B:52:0x0069), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ac A[Catch: all -> 0x00e6, TryCatch #0 {all -> 0x00e6, blocks: (B:8:0x0013, B:9:0x00e4, B:16:0x0028, B:17:0x00c5, B:19:0x00cd, B:23:0x00dd, B:25:0x0035, B:26:0x00a8, B:28:0x00ac, B:33:0x0042, B:34:0x0085, B:36:0x008d, B:38:0x0090, B:42:0x0051, B:44:0x0057, B:46:0x005a, B:49:0x0061, B:52:0x0069), top: B:2:0x0009 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        k1z0 k1z0Var;
        Bundle extras;
        String str;
        Bundle bundle;
        Integer num;
        Bundle bundle2;
        k1z0 k1z0Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            a.a(obj);
            Activity activity = this.e;
            k1z0Var = this.f;
            Intent intent = activity.getIntent();
            if (intent != null && (extras = intent.getExtras()) != null) {
                String action = intent.getAction();
                if (action == null) {
                    action = "";
                }
                this.d = k1z0Var;
                this.a = extras;
                this.b = action;
                this.c = 1;
                bdn bdnVar = bdn.a;
                Object k = myc0.k(ie00.a, new ru.rustore.sdk.pushclient.g.c(extras, null), this);
                if (k == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str = action;
                obj = k;
                bundle = extras;
            }
            return s3q0.a;
        }
        if (i == 1) {
            str = this.b;
            bundle = this.a;
            k1z0Var = (k1z0) this.d;
            a.a(obj);
        } else {
            if (i == 2) {
                str = this.b;
                bundle = this.a;
                k1z0Var = (k1z0) this.d;
                a.a(obj);
                num = (Integer) obj;
                if (num != null) {
                    xwy0 xwy0Var = k1z0Var.b;
                    int intValue = num.intValue();
                    this.d = k1z0Var;
                    this.a = bundle;
                    this.b = str;
                    this.c = 3;
                    obj = xwy0Var.a.a(intValue, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    bundle2 = bundle;
                    k1z0Var2 = k1z0Var;
                    if (((Boolean) obj).booleanValue()) {
                    }
                }
                Logger.DefaultImpls.info$default(k1z0Var.f, "clickSDKNotificationEvent skipped", null, 2, null);
                s3q0 s3q0Var = s3q0.a;
                return s3q0.a;
            }
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a.a(obj);
                s3q0 s3q0Var2 = s3q0.a;
                return s3q0.a;
            }
            str = this.b;
            bundle2 = this.a;
            k1z0Var2 = (k1z0) this.d;
            a.a(obj);
            if (((Boolean) obj).booleanValue()) {
                k1z0Var = k1z0Var2;
                Logger.DefaultImpls.info$default(k1z0Var.f, "clickSDKNotificationEvent skipped", null, 2, null);
                s3q0 s3q0Var22 = s3q0.a;
                return s3q0.a;
            }
            this.d = null;
            this.a = null;
            this.b = null;
            this.c = 4;
        }
        if (!((Boolean) obj).booleanValue()) {
            return s3q0.a;
        }
        this.d = k1z0Var;
        this.a = bundle;
        this.b = str;
        this.c = 2;
        bdn bdnVar2 = bdn.a;
        obj = myc0.k(ie00.a, new ru.rustore.sdk.pushclient.g.b(bundle, null), this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        num = (Integer) obj;
        if (num != null) {
        }
        Logger.DefaultImpls.info$default(k1z0Var.f, "clickSDKNotificationEvent skipped", null, 2, null);
        s3q0 s3q0Var222 = s3q0.a;
        return s3q0.a;
    }
}
