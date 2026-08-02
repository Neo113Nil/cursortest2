package com.yandex.go.drive.delegates;

import android.net.Uri;
import com.yandex.passport.api.KPassportEnvironment;
import defpackage.fn21;
import defpackage.kj;
import defpackage.ny61;
import defpackage.rbe0;
import defpackage.tem;
import defpackage.tm91;
import defpackage.u02;
import defpackage.ucm;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.am.n;
import ru.yandex.taxi.am.o;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes.dex */
public final class b {
    public final u02 a;
    public final g b;
    public final ru.yandex.taxi.am.token.a c;
    public final fn21 d;
    public final o e;
    public tem f;

    public b(u02 u02Var, g gVar, ru.yandex.taxi.am.token.a aVar, fn21 fn21Var, o oVar) {
        this.a = u02Var;
        this.b = gVar;
        this.c = aVar;
        this.d = fn21Var;
        this.e = oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Comparable a(Uri uri, ContinuationImpl continuationImpl) {
        DriveSdkAccountManagerImpl$getAuthorizationUrl$1 driveSdkAccountManagerImpl$getAuthorizationUrl$1;
        int i;
        if (continuationImpl instanceof DriveSdkAccountManagerImpl$getAuthorizationUrl$1) {
            driveSdkAccountManagerImpl$getAuthorizationUrl$1 = (DriveSdkAccountManagerImpl$getAuthorizationUrl$1) continuationImpl;
            int i2 = driveSdkAccountManagerImpl$getAuthorizationUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                driveSdkAccountManagerImpl$getAuthorizationUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = driveSdkAccountManagerImpl$getAuthorizationUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = driveSdkAccountManagerImpl$getAuthorizationUrl$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String uri2 = uri.toString();
                    driveSdkAccountManagerImpl$getAuthorizationUrl$1.L$0 = null;
                    driveSdkAccountManagerImpl$getAuthorizationUrl$1.label = 1;
                    obj = n.a(this.e, uri2, driveSdkAccountManagerImpl$getAuthorizationUrl$1);
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
                return Uri.parse((String) obj);
            }
        }
        driveSdkAccountManagerImpl$getAuthorizationUrl$1 = new DriveSdkAccountManagerImpl$getAuthorizationUrl$1(this, continuationImpl);
        Object obj2 = driveSdkAccountManagerImpl$getAuthorizationUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = driveSdkAccountManagerImpl$getAuthorizationUrl$1.label;
        if (i != 0) {
        }
        return Uri.parse((String) obj2);
    }

    public final ucm b() {
        rbe0 d;
        String b = this.b.b();
        if (b == null || (d = d(b)) == null) {
            return null;
        }
        return d.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        DriveSdkAccountManagerImpl$getCurrentAuthData$1 driveSdkAccountManagerImpl$getCurrentAuthData$1;
        int i;
        Object d;
        String str;
        rbe0 d2;
        if (continuationImpl instanceof DriveSdkAccountManagerImpl$getCurrentAuthData$1) {
            driveSdkAccountManagerImpl$getCurrentAuthData$1 = (DriveSdkAccountManagerImpl$getCurrentAuthData$1) continuationImpl;
            int i2 = driveSdkAccountManagerImpl$getCurrentAuthData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                driveSdkAccountManagerImpl$getCurrentAuthData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = driveSdkAccountManagerImpl$getCurrentAuthData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = driveSdkAccountManagerImpl$getCurrentAuthData$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    driveSdkAccountManagerImpl$getCurrentAuthData$1.label = 1;
                    d = this.c.d(false, driveSdkAccountManagerImpl$getCurrentAuthData$1);
                    if (d == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    d = ((Result) obj).getValue();
                }
                if (d instanceof Result.Failure) {
                    d = null;
                }
                str = (String) d;
                if (str == null || (d2 = d(str)) == null) {
                    return null;
                }
                return d2.a();
            }
        }
        driveSdkAccountManagerImpl$getCurrentAuthData$1 = new DriveSdkAccountManagerImpl$getCurrentAuthData$1(this, continuationImpl);
        Object obj2 = driveSdkAccountManagerImpl$getCurrentAuthData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = driveSdkAccountManagerImpl$getCurrentAuthData$1.label;
        if (i != 0) {
        }
        if (d instanceof Result.Failure) {
        }
        str = (String) d;
        if (str == null) {
            return d2.a();
        }
        return null;
    }

    public final rbe0 d(String str) {
        String Hg;
        kj Ig = this.b.a.Ig();
        if (Ig == null || !Ig.n || (Hg = ((h) this.d).Hg()) == null) {
            return null;
        }
        long j = Ig.a;
        this.a.getClass();
        return new rbe0(Ig, new ucm(Hg, j, str, tm91.a(KPassportEnvironment.PRODUCTION)));
    }
}
