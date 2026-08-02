package com.yandex.go.domain.interactor;

import android.content.Context;
import com.yandex.go.experiment.UserPhotoUploadingExperiment;
import defpackage.cne0;
import defpackage.d6z;
import defpackage.dne0;
import defpackage.eq21;
import defpackage.gtq0;
import defpackage.hdu0;
import defpackage.i3y;
import defpackage.il01;
import defpackage.jl40;
import defpackage.k7x0;
import defpackage.kq21;
import defpackage.lq21;
import defpackage.lz60;
import defpackage.mdh;
import defpackage.mth;
import defpackage.ny61;
import defpackage.oay0;
import defpackage.oep0;
import defpackage.of11;
import defpackage.oq21;
import defpackage.pav;
import defpackage.sjh;
import defpackage.tj60;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wq21;
import defpackage.yvf0;
import defpackage.zy11;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class b implements lz60 {
    public final Context a;
    public final tse b;
    public final tt2 c;
    public final dne0 d;
    public final k7x0 e;
    public final pav f;
    public final tj60 g;
    public final yvf0 h;
    public final oep0 i;
    public final eq21 j;
    public final oq21 k;
    public final wq21 l;
    public final i3y m = kotlin.a.a(new oay0(12, this));
    public final kotlinx.coroutines.sync.a n = gtq0.a();

    public b(Context context, tse tseVar, tt2 tt2Var, dne0 dne0Var, k7x0 k7x0Var, pav pavVar, tj60 tj60Var, yvf0 yvf0Var, oep0 oep0Var, eq21 eq21Var, oq21 oq21Var, wq21 wq21Var) {
        this.a = context;
        this.b = tseVar;
        this.c = tt2Var;
        this.d = dne0Var;
        this.e = k7x0Var;
        this.f = pavVar;
        this.g = tj60Var;
        this.h = yvf0Var;
        this.i = oep0Var;
        this.j = eq21Var;
        this.k = oq21Var;
        this.l = wq21Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x010d, code lost:
    
        if (r1 == r4) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ec, code lost:
    
        if (r1 == r4) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(b bVar, String str, String str2, UserPhotoUploadingExperiment userPhotoUploadingExperiment, ContinuationImpl continuationImpl) {
        UserPhotoNotificationInteractor$processNotifications$1 userPhotoNotificationInteractor$processNotifications$1;
        Object obj;
        Object obj2;
        int i;
        String str3;
        UserPhotoUploadingExperiment userPhotoUploadingExperiment2;
        String str4;
        String str5;
        Iterator it;
        Object obj3;
        UserPhotoUploadingExperiment userPhotoUploadingExperiment3;
        UserPhotoUploadingExperiment.NotificationParameters notificationParameters;
        int intValue;
        Object i2;
        UserPhotoUploadingExperiment.NotificationParameters notificationParameters2;
        UserPhotoUploadingExperiment userPhotoUploadingExperiment4;
        String d;
        Integer f;
        bVar.getClass();
        i3y i3yVar = bVar.m;
        if (continuationImpl instanceof UserPhotoNotificationInteractor$processNotifications$1) {
            userPhotoNotificationInteractor$processNotifications$1 = (UserPhotoNotificationInteractor$processNotifications$1) continuationImpl;
            int i3 = userPhotoNotificationInteractor$processNotifications$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                userPhotoNotificationInteractor$processNotifications$1.label = i3 - Integer.MIN_VALUE;
                obj = userPhotoNotificationInteractor$processNotifications$1.result;
                obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userPhotoNotificationInteractor$processNotifications$1.label;
                Object obj4 = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    userPhotoNotificationInteractor$processNotifications$1.L$0 = str;
                    userPhotoNotificationInteractor$processNotifications$1.L$1 = str2;
                    userPhotoNotificationInteractor$processNotifications$1.L$2 = userPhotoUploadingExperiment;
                    userPhotoNotificationInteractor$processNotifications$1.label = 1;
                    Object i4 = bVar.i((cne0) i3yVar.getValue(), new of11(28), userPhotoNotificationInteractor$processNotifications$1);
                    if (i4 != obj2) {
                        str3 = str2;
                        userPhotoUploadingExperiment2 = userPhotoUploadingExperiment;
                        str4 = str;
                        obj = i4;
                    }
                    return obj2;
                }
                if (i == 1) {
                    userPhotoUploadingExperiment2 = (UserPhotoUploadingExperiment) userPhotoNotificationInteractor$processNotifications$1.L$2;
                    str3 = (String) userPhotoNotificationInteractor$processNotifications$1.L$1;
                    str4 = (String) userPhotoNotificationInteractor$processNotifications$1.L$0;
                    kotlin.b.b(obj);
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            userPhotoUploadingExperiment2 = (UserPhotoUploadingExperiment) userPhotoNotificationInteractor$processNotifications$1.L$2;
                            str5 = (String) userPhotoNotificationInteractor$processNotifications$1.L$1;
                            kotlin.b.b(obj);
                            it = userPhotoUploadingExperiment2.f.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj3 = null;
                                    break;
                                }
                                obj3 = it.next();
                                if (jl40.l(((UserPhotoUploadingExperiment.NotificationParameters) obj3).getG(), str5)) {
                                    break;
                                }
                            }
                            UserPhotoUploadingExperiment.NotificationParameters notificationParameters3 = (UserPhotoUploadingExperiment.NotificationParameters) obj3;
                            userPhotoNotificationInteractor$processNotifications$1.L$0 = null;
                            userPhotoNotificationInteractor$processNotifications$1.L$1 = str5;
                            userPhotoNotificationInteractor$processNotifications$1.L$2 = userPhotoUploadingExperiment2;
                            userPhotoNotificationInteractor$processNotifications$1.L$3 = notificationParameters3;
                            userPhotoNotificationInteractor$processNotifications$1.label = 4;
                            obj = bVar.i((cne0) i3yVar.getValue(), new il01(str5, 15), userPhotoNotificationInteractor$processNotifications$1);
                            if (obj != obj2) {
                                userPhotoUploadingExperiment3 = userPhotoUploadingExperiment2;
                                notificationParameters = notificationParameters3;
                                intValue = ((Number) obj).intValue();
                                if (notificationParameters != null) {
                                    userPhotoNotificationInteractor$processNotifications$1.L$0 = null;
                                    userPhotoNotificationInteractor$processNotifications$1.L$1 = null;
                                    userPhotoNotificationInteractor$processNotifications$1.L$2 = userPhotoUploadingExperiment3;
                                    userPhotoNotificationInteractor$processNotifications$1.L$3 = notificationParameters;
                                    userPhotoNotificationInteractor$processNotifications$1.I$0 = intValue;
                                    userPhotoNotificationInteractor$processNotifications$1.label = 5;
                                    i2 = bVar.i((cne0) i3yVar.getValue(), new hdu0(str5, intValue + 1, 1), userPhotoNotificationInteractor$processNotifications$1);
                                    if (i2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                                    }
                                    if (obj4 != obj2) {
                                    }
                                }
                                return null;
                            }
                            return obj2;
                        }
                        if (i != 4) {
                            if (i != 5) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            notificationParameters2 = (UserPhotoUploadingExperiment.NotificationParameters) userPhotoNotificationInteractor$processNotifications$1.L$3;
                            userPhotoUploadingExperiment4 = (UserPhotoUploadingExperiment) userPhotoNotificationInteractor$processNotifications$1.L$2;
                            kotlin.b.b(obj);
                            if (!notificationParameters2.getB()) {
                                return lq21.a;
                            }
                            String c = notificationParameters2.getC();
                            if (c != null && (d = notificationParameters2.getD()) != null && (f = notificationParameters2.getF()) != null) {
                                return new kq21(d6z.Y(userPhotoUploadingExperiment4, c), d6z.Y(userPhotoUploadingExperiment4, d), notificationParameters2.getE(), notificationParameters2.getG(), TimeUnit.SECONDS.toMillis(f.intValue()));
                            }
                            return null;
                        }
                        notificationParameters = (UserPhotoUploadingExperiment.NotificationParameters) userPhotoNotificationInteractor$processNotifications$1.L$3;
                        userPhotoUploadingExperiment3 = (UserPhotoUploadingExperiment) userPhotoNotificationInteractor$processNotifications$1.L$2;
                        str5 = (String) userPhotoNotificationInteractor$processNotifications$1.L$1;
                        kotlin.b.b(obj);
                        intValue = ((Number) obj).intValue();
                        if (notificationParameters != null && intValue < notificationParameters.getA()) {
                            userPhotoNotificationInteractor$processNotifications$1.L$0 = null;
                            userPhotoNotificationInteractor$processNotifications$1.L$1 = null;
                            userPhotoNotificationInteractor$processNotifications$1.L$2 = userPhotoUploadingExperiment3;
                            userPhotoNotificationInteractor$processNotifications$1.L$3 = notificationParameters;
                            userPhotoNotificationInteractor$processNotifications$1.I$0 = intValue;
                            userPhotoNotificationInteractor$processNotifications$1.label = 5;
                            i2 = bVar.i((cne0) i3yVar.getValue(), new hdu0(str5, intValue + 1, 1), userPhotoNotificationInteractor$processNotifications$1);
                            if (i2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                                obj4 = i2;
                            }
                            if (obj4 != obj2) {
                                notificationParameters2 = notificationParameters;
                                userPhotoUploadingExperiment4 = userPhotoUploadingExperiment3;
                                if (!notificationParameters2.getB()) {
                                }
                            }
                            return obj2;
                        }
                        return null;
                    }
                    userPhotoUploadingExperiment2 = (UserPhotoUploadingExperiment) userPhotoNotificationInteractor$processNotifications$1.L$2;
                    String str6 = (String) userPhotoNotificationInteractor$processNotifications$1.L$1;
                    String str7 = (String) userPhotoNotificationInteractor$processNotifications$1.L$0;
                    kotlin.b.b(obj);
                    str4 = str7;
                    str3 = str6;
                    userPhotoNotificationInteractor$processNotifications$1.L$0 = null;
                    userPhotoNotificationInteractor$processNotifications$1.L$1 = str3;
                    userPhotoNotificationInteractor$processNotifications$1.L$2 = userPhotoUploadingExperiment2;
                    userPhotoNotificationInteractor$processNotifications$1.label = 3;
                    Object i5 = bVar.i((cne0) i3yVar.getValue(), new il01(str4, 16), userPhotoNotificationInteractor$processNotifications$1);
                    if (i5 != obj2) {
                        i5 = obj4;
                    }
                }
                if (!jl40.l(obj, str4)) {
                    userPhotoNotificationInteractor$processNotifications$1.L$0 = str4;
                    userPhotoNotificationInteractor$processNotifications$1.L$1 = str3;
                    userPhotoNotificationInteractor$processNotifications$1.L$2 = userPhotoUploadingExperiment2;
                    userPhotoNotificationInteractor$processNotifications$1.label = 2;
                    Object i6 = bVar.i((cne0) i3yVar.getValue(), new of11(27), userPhotoNotificationInteractor$processNotifications$1);
                    if (i6 != obj2) {
                        i6 = obj4;
                    }
                }
                str5 = str3;
                it = userPhotoUploadingExperiment2.f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                    }
                }
                UserPhotoUploadingExperiment.NotificationParameters notificationParameters32 = (UserPhotoUploadingExperiment.NotificationParameters) obj3;
                userPhotoNotificationInteractor$processNotifications$1.L$0 = null;
                userPhotoNotificationInteractor$processNotifications$1.L$1 = str5;
                userPhotoNotificationInteractor$processNotifications$1.L$2 = userPhotoUploadingExperiment2;
                userPhotoNotificationInteractor$processNotifications$1.L$3 = notificationParameters32;
                userPhotoNotificationInteractor$processNotifications$1.label = 4;
                obj = bVar.i((cne0) i3yVar.getValue(), new il01(str5, 15), userPhotoNotificationInteractor$processNotifications$1);
                if (obj != obj2) {
                }
                return obj2;
            }
        }
        userPhotoNotificationInteractor$processNotifications$1 = new UserPhotoNotificationInteractor$processNotifications$1(bVar, continuationImpl);
        obj = userPhotoNotificationInteractor$processNotifications$1.result;
        obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userPhotoNotificationInteractor$processNotifications$1.label;
        Object obj42 = zy11.a;
        if (i != 0) {
        }
        if (!jl40.l(obj, str4)) {
        }
        str5 = str3;
        it = userPhotoUploadingExperiment2.f.iterator();
        while (true) {
            if (!it.hasNext()) {
            }
        }
        UserPhotoUploadingExperiment.NotificationParameters notificationParameters322 = (UserPhotoUploadingExperiment.NotificationParameters) obj3;
        userPhotoNotificationInteractor$processNotifications$1.L$0 = null;
        userPhotoNotificationInteractor$processNotifications$1.L$1 = str5;
        userPhotoNotificationInteractor$processNotifications$1.L$2 = userPhotoUploadingExperiment2;
        userPhotoNotificationInteractor$processNotifications$1.L$3 = notificationParameters322;
        userPhotoNotificationInteractor$processNotifications$1.label = 4;
        obj = bVar.i((cne0) i3yVar.getValue(), new il01(str5, 15), userPhotoNotificationInteractor$processNotifications$1);
        if (obj != obj2) {
        }
        return obj2;
    }

    @Override // defpackage.lz60
    public final void g() {
        oq21 oq21Var = this.k;
        mth mthVar = new mth(kotlinx.coroutines.flow.e.n(oq21Var.a, com.yandex.go.coroutines.b.d(this.l.a().a(), new UserPhotoNotificationInteractor$onLargestContentfulPaint$$inlined$start$1(2, null)), oq21Var.b, new UserPhotoNotificationInteractor$onLargestContentfulPaint$2(this, null)), 6);
        this.c.getClass();
        tje.N(this.b, null, null, new UserPhotoNotificationInteractor$onLargestContentfulPaint$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.F(mthVar, uyj.a), null, this), 3);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "UserPhotoNotificationInteractor";
    }

    public final Object i(cne0 cne0Var, tls tlsVar, Continuation continuation) {
        this.c.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new UserPhotoNotificationInteractor$use$2(this, tlsVar, cne0Var, null), continuation);
    }
}
