package com.yandex.go.data.repositories;

import com.yandex.go.data.api.UserPhotoUploadingApi;
import com.yandex.go.utils.UserPhotoUploadingException;
import defpackage.bvf0;
import defpackage.cmt;
import defpackage.ffx;
import defpackage.g92;
import defpackage.gci0;
import defpackage.hst;
import defpackage.i3y;
import defpackage.icg;
import defpackage.jqr;
import defpackage.jst;
import defpackage.lr21;
import defpackage.lr40;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.on2;
import defpackage.rol0;
import defpackage.rq21;
import defpackage.sjh;
import defpackage.sq21;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.xby;
import defpackage.xq21;
import defpackage.zg6;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.o;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class h {
    public final com.yandex.go.repositories.e a;
    public final com.yandex.go.data.mappers.a b;
    public final tt2 c;
    public final rq21 d;
    public final sq21 e;
    public final boolean f;
    public final icg g;
    public final i3y h;
    public final r0 i;
    public final gci0 j;
    public final n0 k;
    public final n0 l;

    public h(on2 on2Var, com.yandex.go.repositories.e eVar, com.yandex.go.data.mappers.a aVar, tt2 tt2Var, rq21 rq21Var, sq21 sq21Var, boolean z, icg icgVar) {
        this.a = eVar;
        this.b = aVar;
        this.c = tt2Var;
        this.d = rq21Var;
        this.e = sq21Var;
        this.f = z;
        this.g = icgVar;
        this.h = kotlin.a.a(new lr40(on2Var, 19));
        r0 c = bvf0.c(null);
        this.i = c;
        this.j = kotlinx.coroutines.flow.e.d(c);
        n0 c2 = ffx.c(0, 0, null, 7);
        this.k = c2;
        this.l = c2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(h hVar, byte[] bArr, xq21 xq21Var, ContinuationImpl continuationImpl) {
        UserPhotoUploadingRepository$uploadUserPhotoByteArray$1 userPhotoUploadingRepository$uploadUserPhotoByteArray$1;
        int i;
        rq21 rq21Var = hVar.d;
        try {
            if (continuationImpl instanceof UserPhotoUploadingRepository$uploadUserPhotoByteArray$1) {
                userPhotoUploadingRepository$uploadUserPhotoByteArray$1 = (UserPhotoUploadingRepository$uploadUserPhotoByteArray$1) continuationImpl;
                int i2 = userPhotoUploadingRepository$uploadUserPhotoByteArray$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    userPhotoUploadingRepository$uploadUserPhotoByteArray$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = userPhotoUploadingRepository$uploadUserPhotoByteArray$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = userPhotoUploadingRepository$uploadUserPhotoByteArray$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        sq21 sq21Var = hVar.e;
                        userPhotoUploadingRepository$uploadUserPhotoByteArray$1.L$0 = bArr;
                        userPhotoUploadingRepository$uploadUserPhotoByteArray$1.L$1 = xq21Var;
                        userPhotoUploadingRepository$uploadUserPhotoByteArray$1.label = 1;
                        obj = ((com.yandex.go.domain.a) sq21Var).a(bArr, null, null, userPhotoUploadingRepository$uploadUserPhotoByteArray$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        xq21Var = (xq21) userPhotoUploadingRepository$uploadUserPhotoByteArray$1.L$1;
                        bArr = (byte[]) userPhotoUploadingRepository$uploadUserPhotoByteArray$1.L$0;
                        try {
                            kotlin.b.b(obj);
                        } catch (Throwable th) {
                            rq21Var.a().delete();
                            throw th;
                        }
                    }
                    lr21 lr21Var = (lr21) obj;
                    rq21Var.a().delete();
                    return lr21Var;
                }
            }
            if (i != 0) {
            }
            lr21 lr21Var2 = (lr21) obj;
            rq21Var.a().delete();
            return lr21Var2;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th2) {
            hst hstVar = jst.e;
            String message = th2.getMessage();
            if (message == null) {
                message = "";
            }
            xby.l(hstVar, "USER_PHOTO_UPLOAD:UPLOAD_PHOTO_ON_SERVER", null, th2, message, 2);
            UserPhotoUploadingException userPhotoUploadingException = new UserPhotoUploadingException(bArr, xq21Var);
            userPhotoUploadingException.initCause(th2);
            throw userPhotoUploadingException;
        }
        userPhotoUploadingRepository$uploadUserPhotoByteArray$1 = new UserPhotoUploadingRepository$uploadUserPhotoByteArray$1(hVar, continuationImpl);
        Object obj2 = userPhotoUploadingRepository$uploadUserPhotoByteArray$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userPhotoUploadingRepository$uploadUserPhotoByteArray$1.label;
    }

    public final Object b(tpr tprVar, boolean z, ContinuationImpl continuationImpl) {
        return new o(kotlinx.coroutines.flow.e.t(new c(tprVar, this)), new UserPhotoUploadingRepository$collectUserPhotoUploadingState$$inlined$safeCollect$1(this, null)).collect(new zg6(this, z), continuationImpl);
    }

    public final Object c(xq21 xq21Var, Continuation continuation) {
        return b(kotlinx.coroutines.flow.e.X(new o(e(((UserPhotoUploadingApi) this.h.getValue()).c()), new UserPhotoUploadingRepository$deleteUserPhoto$2(xq21Var, null)), new UserPhotoUploadingRepository$deleteUserPhoto$$inlined$flatMapLatest$1(this, null)), true, (ContinuationImpl) continuation);
    }

    public final Object d(SuspendLambda suspendLambda) {
        return b(new n(e(((UserPhotoUploadingApi) this.h.getValue()).b()), new UserPhotoUploadingRepository$loadUserPhotoUploadingState$2(this, null)), false, suspendLambda);
    }

    public final e e(cmt cmtVar) {
        g92 g92Var = new g92(2, cmtVar);
        this.c.getClass();
        sjh sjhVar = uyj.a;
        return new e(kotlinx.coroutines.flow.e.I(kotlinx.coroutines.flow.e.F(g92Var, mdh.b), new UserPhotoUploadingRepository$singleRequestFullFlow$1(2, null)));
    }

    public final Object f(byte[] bArr, xq21 xq21Var, Continuation continuation) {
        g gVar = new g(new rol0(new UserPhotoUploadingRepository$uploadUserPhoto$2(bArr, null)), this, xq21Var);
        this.c.getClass();
        sjh sjhVar = uyj.a;
        return b(new jqr(kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.F(gVar, mdh.b), new UserPhotoUploadingRepository$uploadUserPhoto$$inlined$flatMapLatest$1(this, null)), new UserPhotoUploadingRepository$uploadUserPhoto$5(this, null), 3), false, (ContinuationImpl) continuation);
    }
}
