package com.yandex.go.repositories;

import defpackage.bms;
import defpackage.cgv;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.m0;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lvpr;", "Legv;", "", "isExperimentEnabled", "", "passportAvatar", "Lzy11;", "<anonymous>", "(Lvpr;ZLjava/lang/String;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.repositories.UserPhotoStateRepository$photoUrlFlow$1", f = "UserPhotoStateRepository.kt", l = {47, 49}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class UserPhotoStateRepository$photoUrlFlow$1 extends SuspendLambda implements bms {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserPhotoStateRepository$photoUrlFlow$1(e eVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = eVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        UserPhotoStateRepository$photoUrlFlow$1 userPhotoStateRepository$photoUrlFlow$1 = new UserPhotoStateRepository$photoUrlFlow$1(this.this$0, (Continuation) obj4);
        userPhotoStateRepository$photoUrlFlow$1.L$0 = (vpr) obj;
        userPhotoStateRepository$photoUrlFlow$1.Z$0 = booleanValue;
        userPhotoStateRepository$photoUrlFlow$1.L$1 = (String) obj3;
        return userPhotoStateRepository$photoUrlFlow$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (kotlinx.coroutines.flow.e.u(r9, r0, r8) == r3) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        boolean z = this.Z$0;
        String str = (String) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (z) {
                m0 b = e.b(this.this$0, str);
                this.L$0 = null;
                this.L$1 = null;
                this.Z$0 = z;
                this.label = 2;
            } else {
                cgv cgvVar = new cgv(str, AvatarStatus.APPROVED.getText());
                this.L$0 = null;
                this.L$1 = null;
                this.Z$0 = z;
                this.label = 1;
                Object emit = vprVar.emit(cgvVar, this);
                if (emit != coroutineSingletons) {
                    return emit;
                }
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            kotlin.b.b(obj);
            return obj;
        }
        if (i != 2) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        return zy11.a;
    }
}
