package ru.rustore.sdk.pushclient.g;

import android.os.Bundle;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

@b6l(c = "ru.rustore.sdk.pushclient.internal.analytics.utils.ClickNotificationUtils$isClickSDKNotificationEventHappen$2", f = "ClickNotificationUtils.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes9.dex */
public final class c extends SuspendLambda implements wzs<yvj, spj<? super Boolean>, Object> {
    public final /* synthetic */ Bundle a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Bundle bundle, spj<? super c> spjVar) {
        super(2, spjVar);
        this.a = bundle;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new c(this.a, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Boolean> spjVar) {
        return new c(this.a, spjVar).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r2.containsKey("vkpns.click_event_marker") == true) goto L8;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        kotlin.a.a(obj);
        Bundle bundle = this.a;
        boolean z = bundle != null;
        return Boolean.valueOf(z);
    }
}
