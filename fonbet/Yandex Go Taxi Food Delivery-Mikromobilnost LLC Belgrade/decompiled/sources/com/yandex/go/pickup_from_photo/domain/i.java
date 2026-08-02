package com.yandex.go.pickup_from_photo.domain;

import com.yandex.go.pickup_from_photo.domain.exception.SuggestException;
import defpackage.ny61;
import defpackage.pv0;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class i {
    public final t a;
    public final com.yandex.go.pickup_from_photo.data.b b;

    public i(t tVar, com.yandex.go.pickup_from_photo.data.b bVar) {
        this.a = tVar;
        this.b = bVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:(5:11|12|13|14|(2:16|17)(2:19|20))(2:22|23))(1:24))(1:29)|25|26))|33|6|7|(0)(0)|25|26) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
    
        if (r7 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0048, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0060, code lost:
    
        r7 = new kotlin.Result.Failure(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        PickupFromPhotoGuesserInteractor$guessLocation$1 pickupFromPhotoGuesserInteractor$guessLocation$1;
        int i;
        if (continuationImpl instanceof PickupFromPhotoGuesserInteractor$guessLocation$1) {
            pickupFromPhotoGuesserInteractor$guessLocation$1 = (PickupFromPhotoGuesserInteractor$guessLocation$1) continuationImpl;
            int i2 = pickupFromPhotoGuesserInteractor$guessLocation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pickupFromPhotoGuesserInteractor$guessLocation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pickupFromPhotoGuesserInteractor$guessLocation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pickupFromPhotoGuesserInteractor$guessLocation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pickupFromPhotoGuesserInteractor$guessLocation$1.label = 1;
                    obj = this.a.a(pickupFromPhotoGuesserInteractor$guessLocation$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        Object failure = (pv0) obj;
                        if (Result.a(failure) != null) {
                            throw new SuggestException();
                        }
                        kotlin.b.b(failure);
                        return failure;
                    }
                    kotlin.b.b(obj);
                }
                List list = (List) obj;
                com.yandex.go.pickup_from_photo.data.b bVar = this.b;
                pickupFromPhotoGuesserInteractor$guessLocation$1.L$0 = null;
                pickupFromPhotoGuesserInteractor$guessLocation$1.L$1 = null;
                pickupFromPhotoGuesserInteractor$guessLocation$1.label = 2;
                obj = bVar.b(list, pickupFromPhotoGuesserInteractor$guessLocation$1);
            }
        }
        pickupFromPhotoGuesserInteractor$guessLocation$1 = new PickupFromPhotoGuesserInteractor$guessLocation$1(this, continuationImpl);
        Object obj2 = pickupFromPhotoGuesserInteractor$guessLocation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pickupFromPhotoGuesserInteractor$guessLocation$1.label;
        if (i != 0) {
        }
        List list2 = (List) obj2;
        com.yandex.go.pickup_from_photo.data.b bVar2 = this.b;
        pickupFromPhotoGuesserInteractor$guessLocation$1.L$0 = null;
        pickupFromPhotoGuesserInteractor$guessLocation$1.L$1 = null;
        pickupFromPhotoGuesserInteractor$guessLocation$1.label = 2;
        obj2 = bVar2.b(list2, pickupFromPhotoGuesserInteractor$guessLocation$1);
    }
}
