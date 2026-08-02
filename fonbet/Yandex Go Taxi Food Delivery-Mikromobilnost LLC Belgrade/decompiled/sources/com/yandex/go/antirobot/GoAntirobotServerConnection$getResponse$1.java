package com.yandex.go.antirobot;

import com.yandex.go.antirobot.api.HostType;
import defpackage.bmt;
import defpackage.cmt;
import defpackage.evu0;
import defpackage.fmt;
import defpackage.m5j0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rvj0;
import defpackage.tse;
import defpackage.utq0;
import defpackage.w511;
import defpackage.wls;
import defpackage.wms;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lutq0;", "<anonymous>", "(Ltse;)Lutq0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.antirobot.GoAntirobotServerConnection$getResponse$1", f = "GoAntirobotServerConnection.kt", l = {35, 39, 40}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class GoAntirobotServerConnection$getResponse$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $json;
    final /* synthetic */ String $uri;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoAntirobotServerConnection$getResponse$1(String str, b bVar, String str2, Continuation continuation) {
        super(2, continuation);
        this.$json = str;
        this.this$0 = bVar;
        this.$uri = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GoAntirobotServerConnection$getResponse$1(this.$json, this.this$0, this.$uri, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GoAntirobotServerConnection$getResponse$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007a, code lost:
    
        if (r8 == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a0, code lost:
    
        if (r8 == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0048, code lost:
    
        if (r8 == r0) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        m5j0 a;
        fmt fmtVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            int i2 = m5j0.a;
            a = wms.a(this.$json, b.e);
            com.yandex.go.antirobot.experiment.b bVar = this.this$0.b;
            this.L$0 = a;
            this.label = 1;
            obj = bVar.b(this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    fmtVar = (fmt) obj;
                    return new utq0(fmtVar.b, ((rvj0) fmtVar.a).byteStream());
                }
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                fmtVar = (fmt) obj;
                return new utq0(fmtVar.b, ((rvj0) fmtVar.a).byteStream());
            }
            a = (m5j0) this.L$0;
            kotlin.b.b(obj);
        }
        int i3 = bmt.a[((HostType) obj).ordinal()];
        if (i3 == 1) {
            return this.this$0.c.a(this.$uri, this.$json);
        }
        if (i3 != 2) {
            w511.b();
            return null;
        }
        if (evu0.y(this.$uri, "authenticate", false)) {
            cmt<rvj0> a2 = ((GoAntirobotApi) this.this$0.d.getValue()).a(a);
            this.L$0 = null;
            this.label = 2;
            obj = ru.yandex.taxi.network.api.a.b(a2, null, this);
        } else {
            if (!evu0.y(this.$uri, "generate_nonce", false)) {
                ny61.g("Incorrect endpoint called by Antirobot SDK");
                return null;
            }
            cmt<rvj0> b = ((GoAntirobotApi) this.this$0.d.getValue()).b(a);
            this.L$0 = null;
            this.label = 3;
            obj = ru.yandex.taxi.network.api.a.b(b, null, this);
        }
        return coroutineSingletons;
    }
}
