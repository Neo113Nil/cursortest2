package com.yandex.go.domain.interactor;

import android.net.Uri;
import com.yandex.go.data.repositories.h;
import defpackage.d9v;
import defpackage.eq21;
import defpackage.fr21;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.unr0;
import defpackage.uyj;
import defpackage.xq21;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class d {
    public final tt2 a;
    public final h b;
    public final fr21 c;
    public final d9v d;
    public final eq21 e;

    public d(tt2 tt2Var, h hVar, fr21 fr21Var, d9v d9vVar, eq21 eq21Var) {
        this.a = tt2Var;
        this.b = hVar;
        this.c = fr21Var;
        this.d = d9vVar;
        this.e = eq21Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
    
        if (r11 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Uri uri, xq21 xq21Var, ContinuationImpl continuationImpl) {
        UserPhotoUploadingInteractor$uploadUserPhoto$1 userPhotoUploadingInteractor$uploadUserPhoto$1;
        int i;
        byte[] bArr;
        if (continuationImpl instanceof UserPhotoUploadingInteractor$uploadUserPhoto$1) {
            userPhotoUploadingInteractor$uploadUserPhoto$1 = (UserPhotoUploadingInteractor$uploadUserPhoto$1) continuationImpl;
            int i2 = userPhotoUploadingInteractor$uploadUserPhoto$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userPhotoUploadingInteractor$uploadUserPhoto$1.label = i2 - Integer.MIN_VALUE;
                Object obj = userPhotoUploadingInteractor$uploadUserPhoto$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userPhotoUploadingInteractor$uploadUserPhoto$1.label;
                Object obj3 = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.a.getClass();
                    sjh sjhVar = uyj.a;
                    UserPhotoUploadingInteractor$uploadUserPhoto$photoByteArray$1 userPhotoUploadingInteractor$uploadUserPhoto$photoByteArray$1 = new UserPhotoUploadingInteractor$uploadUserPhoto$photoByteArray$1(this, uri, null);
                    userPhotoUploadingInteractor$uploadUserPhoto$1.L$0 = uri;
                    userPhotoUploadingInteractor$uploadUserPhoto$1.L$1 = xq21Var;
                    userPhotoUploadingInteractor$uploadUserPhoto$1.label = 1;
                    obj = tje.k0(sjhVar, userPhotoUploadingInteractor$uploadUserPhoto$photoByteArray$1, userPhotoUploadingInteractor$uploadUserPhoto$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj3;
                        }
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    xq21Var = (xq21) userPhotoUploadingInteractor$uploadUserPhoto$1.L$1;
                    uri = (Uri) userPhotoUploadingInteractor$uploadUserPhoto$1.L$0;
                    kotlin.b.b(obj);
                }
                bArr = (byte[]) obj;
                if (bArr != null) {
                    IllegalStateException illegalStateException = new IllegalStateException(unr0.n(uri, "Image compression failed for uri="));
                    userPhotoUploadingInteractor$uploadUserPhoto$1.L$0 = null;
                    userPhotoUploadingInteractor$uploadUserPhoto$1.L$1 = null;
                    userPhotoUploadingInteractor$uploadUserPhoto$1.L$2 = null;
                    userPhotoUploadingInteractor$uploadUserPhoto$1.label = 2;
                    this.b.i.emit(new Result(new Result.Failure(illegalStateException)), userPhotoUploadingInteractor$uploadUserPhoto$1);
                    if (obj3 != obj2) {
                        return obj3;
                    }
                } else {
                    userPhotoUploadingInteractor$uploadUserPhoto$1.L$0 = null;
                    userPhotoUploadingInteractor$uploadUserPhoto$1.L$1 = null;
                    userPhotoUploadingInteractor$uploadUserPhoto$1.L$2 = null;
                    userPhotoUploadingInteractor$uploadUserPhoto$1.label = 3;
                    Object b = b(bArr, xq21Var, userPhotoUploadingInteractor$uploadUserPhoto$1);
                    if (b != obj2) {
                        return b;
                    }
                }
                return obj2;
            }
        }
        userPhotoUploadingInteractor$uploadUserPhoto$1 = new UserPhotoUploadingInteractor$uploadUserPhoto$1(this, continuationImpl);
        Object obj4 = userPhotoUploadingInteractor$uploadUserPhoto$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userPhotoUploadingInteractor$uploadUserPhoto$1.label;
        Object obj32 = zy11.a;
        if (i != 0) {
        }
        bArr = (byte[]) obj4;
        if (bArr != null) {
        }
        return obj22;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|(1:(1:(2:11|12)(2:14|15))(3:16|17|18))(3:19|20|(1:23)(1:22))))|29|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0081, code lost:
    
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0063, code lost:
    
        r0.L$0 = null;
        r0.L$1 = null;
        r0.L$2 = null;
        r0.L$3 = null;
        r0.label = 2;
        r7.i.emit(new kotlin.Result(new kotlin.Result.Failure(r8)), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
    
        if (r6 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(byte[] bArr, xq21 xq21Var, ContinuationImpl continuationImpl) {
        UserPhotoUploadingInteractor$uploadUserPhotoByteArray$1 userPhotoUploadingInteractor$uploadUserPhotoByteArray$1;
        int i;
        if (continuationImpl instanceof UserPhotoUploadingInteractor$uploadUserPhotoByteArray$1) {
            userPhotoUploadingInteractor$uploadUserPhotoByteArray$1 = (UserPhotoUploadingInteractor$uploadUserPhotoByteArray$1) continuationImpl;
            int i2 = userPhotoUploadingInteractor$uploadUserPhotoByteArray$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userPhotoUploadingInteractor$uploadUserPhotoByteArray$1.label = i2 - Integer.MIN_VALUE;
                Object obj = userPhotoUploadingInteractor$uploadUserPhotoByteArray$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userPhotoUploadingInteractor$uploadUserPhotoByteArray$1.label;
                h hVar = this.b;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    userPhotoUploadingInteractor$uploadUserPhotoByteArray$1.L$0 = null;
                    userPhotoUploadingInteractor$uploadUserPhotoByteArray$1.L$1 = null;
                    userPhotoUploadingInteractor$uploadUserPhotoByteArray$1.label = 1;
                    return hVar.f(bArr, xq21Var, userPhotoUploadingInteractor$uploadUserPhotoByteArray$1) == coroutineSingletons ? coroutineSingletons : zy11Var;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11Var;
            }
        }
        userPhotoUploadingInteractor$uploadUserPhotoByteArray$1 = new UserPhotoUploadingInteractor$uploadUserPhotoByteArray$1(this, continuationImpl);
        Object obj2 = userPhotoUploadingInteractor$uploadUserPhotoByteArray$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userPhotoUploadingInteractor$uploadUserPhotoByteArray$1.label;
        h hVar2 = this.b;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
    }
}
