package ru.rustore.sdk.pushclient.a;

import com.vk.push.common.AppInfo;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.epx;
import xsna.izs;
import xsna.s3q0;
import xsna.spj;

@b6l(c = "ru.rustore.sdk.pushclient.internal.VkpnsClientSdk$onUpdate$2", f = "VkpnsClientSdk.kt", l = {162, 163}, m = "invokeSuspend")
/* loaded from: classes9.dex */
public final class n extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
    public AppInfo a;
    public int b;
    public final /* synthetic */ AppInfo c;
    public final /* synthetic */ h d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(AppInfo appInfo, h hVar, spj<? super n> spjVar) {
        super(1, spjVar);
        this.c = appInfo;
        this.d = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new n(this.c, this.d, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super s3q0> spjVar) {
        return new n(this.c, this.d, spjVar).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        if (r5.g(r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        if (r5 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AppInfo appInfo;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i == 0) {
            kotlin.a.a(obj);
            appInfo = this.c;
            ru.rustore.sdk.pushclient.k.b bVar = (ru.rustore.sdk.pushclient.k.b) this.d.h.getValue();
            this.a = appInfo;
            this.b = 1;
            obj = bVar.e(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return s3q0.a;
            }
            appInfo = this.a;
            kotlin.a.a(obj);
        }
        if (!epx.f(appInfo, obj)) {
            a aVar = (a) this.d.n.getValue();
            this.a = null;
            this.b = 2;
        }
        return s3q0.a;
    }
}
