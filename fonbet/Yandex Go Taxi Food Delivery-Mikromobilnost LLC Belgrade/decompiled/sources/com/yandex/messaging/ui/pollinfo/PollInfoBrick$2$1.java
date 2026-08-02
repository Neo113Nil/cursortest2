package com.yandex.messaging.ui.pollinfo;

import android.os.Build;
import com.yandex.alicekit.core.permissions.Permission;
import com.yandex.messaging.contacts.PermissionState;
import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import defpackage.j40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oyh0;
import defpackage.tse;
import defpackage.wh91;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.pollinfo.PollInfoBrick$2$1", f = "PollInfoBrick.kt", l = {69, CalendarDayView.DISABLED_DAY_ALPHA, HProv.ALG_SID_SHA3_384}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class PollInfoBrick$2$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollInfoBrick$2$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PollInfoBrick$2$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PollInfoBrick$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        if (com.yandex.messaging.ui.pollinfo.c.r(r7, r6) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0038, code lost:
    
        if (r7 == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
    
        if (com.yandex.messaging.ui.pollinfo.c.r(r1, r6) == r0) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            int i2 = Build.VERSION.SDK_INT;
            c cVar = this.this$0;
            if (i2 < 30) {
                j40 j40Var = cVar.z;
                Permission permission = Permission.WRITE_EXTERNAL_STORAGE;
                int i3 = oyh0.disk_permission_blocked_message;
                this.label = 1;
                obj = wh91.c(j40Var, permission, 101, i3, this);
            } else {
                this.label = 3;
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            kotlin.b.b(obj);
            if (((PermissionState) obj) == PermissionState.GRANTED) {
                c cVar2 = this.this$0;
                this.label = 2;
            }
            return zy11.a;
        }
        if (i == 2 || i == 3) {
            kotlin.b.b(obj);
            return zy11.a;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
