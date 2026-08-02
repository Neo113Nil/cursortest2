package com.yandex.go.loyalty.impl.selector.domain;

import com.yandex.go.loyalty.impl.common.domain.h;
import com.yandex.go.loyalty.impl.selector.data.LoyaltyApi;
import com.yandex.go.loyalty.impl.selector.data.model.GeoState;
import com.yandex.go.loyalty.impl.selector.data.model.LoyaltyAcceptParam;
import defpackage.cmt;
import defpackage.ny61;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a {
    public final LoyaltyApi a;
    public final h b;

    public a(LoyaltyApi loyaltyApi, h hVar) {
        this.a = loyaltyApi;
        this.b = hVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        if (ru.yandex.taxi.network.api.a.d(r6, r0) != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        LoyaltyAcceptProgramInteractor$acceptProgramLoyalty$1 loyaltyAcceptProgramInteractor$acceptProgramLoyalty$1;
        int i;
        try {
            if (continuationImpl instanceof LoyaltyAcceptProgramInteractor$acceptProgramLoyalty$1) {
                loyaltyAcceptProgramInteractor$acceptProgramLoyalty$1 = (LoyaltyAcceptProgramInteractor$acceptProgramLoyalty$1) continuationImpl;
                int i2 = loyaltyAcceptProgramInteractor$acceptProgramLoyalty$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    loyaltyAcceptProgramInteractor$acceptProgramLoyalty$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = loyaltyAcceptProgramInteractor$acceptProgramLoyalty$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = loyaltyAcceptProgramInteractor$acceptProgramLoyalty$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        loyaltyAcceptProgramInteractor$acceptProgramLoyalty$1.L$0 = str;
                        loyaltyAcceptProgramInteractor$acceptProgramLoyalty$1.label = 1;
                        obj = this.b.a(loyaltyAcceptProgramInteractor$acceptProgramLoyalty$1);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return zy11.a;
                        }
                        str = (String) loyaltyAcceptProgramInteractor$acceptProgramLoyalty$1.L$0;
                        kotlin.b.b(obj);
                    }
                    cmt<zy11> c = this.a.c(new LoyaltyAcceptParam(str, (GeoState) obj));
                    loyaltyAcceptProgramInteractor$acceptProgramLoyalty$1.L$0 = null;
                    loyaltyAcceptProgramInteractor$acceptProgramLoyalty$1.L$1 = null;
                    loyaltyAcceptProgramInteractor$acceptProgramLoyalty$1.L$2 = null;
                    loyaltyAcceptProgramInteractor$acceptProgramLoyalty$1.label = 2;
                }
            }
            if (i != 0) {
            }
            cmt<zy11> c2 = this.a.c(new LoyaltyAcceptParam(str, (GeoState) obj));
            loyaltyAcceptProgramInteractor$acceptProgramLoyalty$1.L$0 = null;
            loyaltyAcceptProgramInteractor$acceptProgramLoyalty$1.L$1 = null;
            loyaltyAcceptProgramInteractor$acceptProgramLoyalty$1.L$2 = null;
            loyaltyAcceptProgramInteractor$acceptProgramLoyalty$1.label = 2;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            return new Result.Failure(e2);
        }
        loyaltyAcceptProgramInteractor$acceptProgramLoyalty$1 = new LoyaltyAcceptProgramInteractor$acceptProgramLoyalty$1(this, continuationImpl);
        Object obj2 = loyaltyAcceptProgramInteractor$acceptProgramLoyalty$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = loyaltyAcceptProgramInteractor$acceptProgramLoyalty$1.label;
    }
}
