package com.yandex.go.payments.cards.pci_dss.recognition;

import defpackage.k421;
import defpackage.ny61;
import defpackage.tst;
import defpackage.v7j0;
import defpackage.w9f;
import defpackage.wp4;
import defpackage.ylm0;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a {
    public final tst a;
    public final k421 b;
    public final wp4 c;
    public final v7j0 d;

    public a(tst tstVar, k421 k421Var, wp4 wp4Var, v7j0 v7j0Var) {
        this.a = tstVar;
        this.b = k421Var;
        this.c = wp4Var;
        this.d = v7j0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(3:11|12|(1:(4:15|16|17|(2:19|20)(1:22))(2:23|24))(2:25|(2:27|(2:32|33)(2:30|31))(2:34|35)))(5:40|41|42|43|(2:45|46)(1:47)))(1:49))(2:62|(1:64)(2:66|67))|50|(2:52|(2:57|58)(2:55|56))(1:59)))|72|6|7|(0)(0)|50|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0124, code lost:
    
        if (r11 == r1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0126, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00e7, code lost:
    
        if (r11 == r1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x014d, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x014e, code lost:
    
        throw r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x012a, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x012b, code lost:
    
        r11 = new kotlin.Result.Failure(r10);
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0114 A[Catch: Exception -> 0x012a, CancellationException -> 0x014d, TRY_ENTER, TryCatch #3 {CancellationException -> 0x014d, Exception -> 0x012a, blocks: (B:41:0x00b2, B:42:0x0127, B:59:0x0114), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        BankCardRecognitionInteractor$scanCard$1 bankCardRecognitionInteractor$scanCard$1;
        int i;
        boolean f;
        boolean booleanValue;
        Object failure;
        if (continuationImpl instanceof BankCardRecognitionInteractor$scanCard$1) {
            bankCardRecognitionInteractor$scanCard$1 = (BankCardRecognitionInteractor$scanCard$1) continuationImpl;
            int i2 = bankCardRecognitionInteractor$scanCard$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bankCardRecognitionInteractor$scanCard$1.label = i2 - Integer.MIN_VALUE;
                Object obj = bankCardRecognitionInteractor$scanCard$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bankCardRecognitionInteractor$scanCard$1.label;
                wp4 wp4Var = this.c;
                int i3 = 3;
                if (i != 0) {
                    b.b(obj);
                    if (!((ru.yandex.taxi.vendor_api.google.b) this.a).b()) {
                        this.b.getClass();
                        return new Result.Failure(new UnsupportedOperationException("No supported card recognition services on device was found"));
                    }
                    com.yandex.go.permission.b bVar = (com.yandex.go.permission.b) this.d;
                    f = bVar.f(3);
                    bankCardRecognitionInteractor$scanCard$1.L$0 = this;
                    bankCardRecognitionInteractor$scanCard$1.I$0 = 3;
                    bankCardRecognitionInteractor$scanCard$1.Z$0 = f;
                    bankCardRecognitionInteractor$scanCard$1.label = 1;
                    obj = bVar.d(3, bankCardRecognitionInteractor$scanCard$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            b.b(obj);
                            Object failure2 = (w9f) obj;
                            if (failure2 instanceof Result.Failure) {
                                return failure2;
                            }
                            w9f w9fVar = (w9f) failure2;
                            return new ylm0(w9fVar.a, new Integer(w9fVar.b), new Integer(w9fVar.c));
                        }
                        try {
                        } catch (CancellationException e) {
                            throw e;
                        } catch (Exception e2) {
                            failure = new Result.Failure(e2);
                        }
                        if (i != 3) {
                            if (i != 4) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            b.b(obj);
                            failure = (w9f) obj;
                            if (failure instanceof Result.Failure) {
                                return failure;
                            }
                            w9f w9fVar2 = (w9f) failure;
                            return new ylm0(w9fVar2.a, new Integer(w9fVar2.b), new Integer(w9fVar2.c));
                        }
                        boolean z = bankCardRecognitionInteractor$scanCard$1.Z$0;
                        int i4 = bankCardRecognitionInteractor$scanCard$1.I$0;
                        a aVar = (a) bankCardRecognitionInteractor$scanCard$1.L$0;
                        b.b(obj);
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        if (!booleanValue2) {
                            return (z || ((com.yandex.go.permission.b) aVar.d).f(i4)) ? new Result.Failure(new RuntimeException("Camera permission not granted")) : new Result.Failure(new CameraPermissionPermanentlyDeniedException());
                        }
                        bankCardRecognitionInteractor$scanCard$1.L$0 = null;
                        bankCardRecognitionInteractor$scanCard$1.I$0 = i4;
                        bankCardRecognitionInteractor$scanCard$1.Z$0 = z;
                        bankCardRecognitionInteractor$scanCard$1.Z$1 = booleanValue2;
                        bankCardRecognitionInteractor$scanCard$1.label = 4;
                        wp4Var.getClass();
                        throw new UnsupportedOperationException();
                    }
                    boolean z2 = bankCardRecognitionInteractor$scanCard$1.Z$0;
                    i3 = bankCardRecognitionInteractor$scanCard$1.I$0;
                    a aVar2 = (a) bankCardRecognitionInteractor$scanCard$1.L$0;
                    b.b(obj);
                    f = z2;
                    this = aVar2;
                }
                booleanValue = ((Boolean) obj).booleanValue();
                if (booleanValue) {
                    return (f || ((com.yandex.go.permission.b) this.d).f(i3)) ? new Result.Failure(new RuntimeException("Camera permission not granted")) : new Result.Failure(new CameraPermissionPermanentlyDeniedException());
                }
                bankCardRecognitionInteractor$scanCard$1.L$0 = null;
                bankCardRecognitionInteractor$scanCard$1.I$0 = i3;
                bankCardRecognitionInteractor$scanCard$1.Z$0 = f;
                bankCardRecognitionInteractor$scanCard$1.Z$1 = booleanValue;
                bankCardRecognitionInteractor$scanCard$1.label = 2;
                obj = wp4Var.a.a(bankCardRecognitionInteractor$scanCard$1);
            }
        }
        bankCardRecognitionInteractor$scanCard$1 = new BankCardRecognitionInteractor$scanCard$1(this, continuationImpl);
        Object obj2 = bankCardRecognitionInteractor$scanCard$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bankCardRecognitionInteractor$scanCard$1.label;
        wp4 wp4Var2 = this.c;
        int i32 = 3;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        if (booleanValue) {
        }
    }
}
