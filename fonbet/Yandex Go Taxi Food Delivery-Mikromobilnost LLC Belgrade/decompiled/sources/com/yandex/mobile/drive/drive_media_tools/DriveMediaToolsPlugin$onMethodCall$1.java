package com.yandex.mobile.drive.drive_media_tools;

import defpackage.da20;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mobile.drive.drive_media_tools.DriveMediaToolsPlugin$onMethodCall$1", f = "DriveMediaToolsPlugin.kt", l = {54}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class DriveMediaToolsPlugin$onMethodCall$1 extends SuspendLambda implements wls {
    final /* synthetic */ da20 $result;
    final /* synthetic */ int $seconds;
    final /* synthetic */ String $videoUrl;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DriveMediaToolsPlugin$onMethodCall$1(a aVar, String str, int i, da20 da20Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$videoUrl = str;
        this.$seconds = i;
        this.$result = da20Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DriveMediaToolsPlugin$onMethodCall$1(this.this$0, this.$videoUrl, this.$seconds, this.$result, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DriveMediaToolsPlugin$onMethodCall$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                b bVar = this.this$0.b;
                String str = this.$videoUrl;
                int i2 = this.$seconds;
                this.label = 1;
                obj = bVar.b(i2, str, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            this.$result.success((String) obj);
        } catch (Exception e) {
            da20 da20Var = this.$result;
            String message = e.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            da20Var.error("CLIP_ERROR", message, null);
        }
        return zy11.a;
    }
}
