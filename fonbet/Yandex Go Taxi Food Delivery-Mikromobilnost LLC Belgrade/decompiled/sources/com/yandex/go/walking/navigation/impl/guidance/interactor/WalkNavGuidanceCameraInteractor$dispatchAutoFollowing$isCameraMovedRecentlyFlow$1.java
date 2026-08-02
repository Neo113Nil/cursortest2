package com.yandex.go.walking.navigation.impl.guidance.interactor;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.Key.foreign.JCSP3DesKeyGenerator;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "", "Lzs7;", "it", "Lzy11;", "<anonymous>", "(Lvpr;Lzs7;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.walking.navigation.impl.guidance.interactor.WalkNavGuidanceCameraInteractor$dispatchAutoFollowing$isCameraMovedRecentlyFlow$1", f = "WalkNavGuidanceCameraInteractor.kt", l = {166, 167, JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class WalkNavGuidanceCameraInteractor$dispatchAutoFollowing$isCameraMovedRecentlyFlow$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        WalkNavGuidanceCameraInteractor$dispatchAutoFollowing$isCameraMovedRecentlyFlow$1 walkNavGuidanceCameraInteractor$dispatchAutoFollowing$isCameraMovedRecentlyFlow$1 = new WalkNavGuidanceCameraInteractor$dispatchAutoFollowing$isCameraMovedRecentlyFlow$1(3, (Continuation) obj3);
        walkNavGuidanceCameraInteractor$dispatchAutoFollowing$isCameraMovedRecentlyFlow$1.L$0 = (vpr) obj;
        return walkNavGuidanceCameraInteractor$dispatchAutoFollowing$isCameraMovedRecentlyFlow$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        if (r0.emit(r8, r7) == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        if (kotlinx.coroutines.a.i(10000, r7) == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0033, code lost:
    
        if (r0.emit(r8, r7) == r1) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Boolean bool = Boolean.TRUE;
            this.L$0 = vprVar;
            this.label = 1;
        } else if (i == 1) {
            kotlin.b.b(obj);
        } else {
            if (i != 2) {
                if (i == 3) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            Boolean bool2 = Boolean.FALSE;
            this.L$0 = null;
            this.label = 3;
        }
        this.L$0 = vprVar;
        this.label = 2;
    }
}
