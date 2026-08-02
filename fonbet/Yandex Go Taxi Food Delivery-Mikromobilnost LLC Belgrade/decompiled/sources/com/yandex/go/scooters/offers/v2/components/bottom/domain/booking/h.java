package com.yandex.go.scooters.offers.v2.components.bottom.domain.booking;

import com.yandex.go.scooters.domain.model.ScootersBookingException;
import com.yandex.go.scooters.domain.model.ScootersBookingFailedException;
import com.yandex.go.scooters.domain.model.ScootersDriverLicenseVerificationRequiredException;
import com.yandex.go.scooters.domain.model.ScootersPhotoVerificationRequiredException;
import com.yandex.go.scooters.offers.v2.analytics.ScootersCardV2Analytics$CardButton;
import com.yandex.go.scooters.offers.v2.data.model.ScootersBookState$Booking$Type;
import com.yandex.go.scooters.passes.domain.model.ScootersPassesType;
import com.yandex.go.scooters.passes.exception.ScootersPassActionException;
import com.yandex.go.scooters.photocontrol.api.ScootersExamType;
import com.yandex.go.scooters.tariff_fix.selection.ScootersTariffFixSelectionAnalytics$FixSelectionOpenReason;
import defpackage.b3n0;
import defpackage.b4p0;
import defpackage.b590;
import defpackage.bvn0;
import defpackage.e2e0;
import defpackage.eer;
import defpackage.f7n0;
import defpackage.h7n0;
import defpackage.i2n0;
import defpackage.j2n0;
import defpackage.j73;
import defpackage.jl40;
import defpackage.joo0;
import defpackage.k2n0;
import defpackage.l2n0;
import defpackage.m2n0;
import defpackage.m950;
import defpackage.mkn0;
import defpackage.moo0;
import defpackage.mro0;
import defpackage.n2n0;
import defpackage.n6n0;
import defpackage.nkn0;
import defpackage.ny61;
import defpackage.oio0;
import defpackage.okn0;
import defpackage.pjn0;
import defpackage.pkn0;
import defpackage.poo0;
import defpackage.q1b1;
import defpackage.q4o0;
import defpackage.qkn0;
import defpackage.r2n0;
import defpackage.r7p0;
import defpackage.r95;
import defpackage.rho0;
import defpackage.s6n0;
import defpackage.sho0;
import defpackage.sy60;
import defpackage.t2n0;
import defpackage.tcc;
import defpackage.tho0;
import defpackage.vam0;
import defpackage.vbn0;
import defpackage.w511;
import defpackage.y5n0;
import defpackage.y5p0;
import defpackage.z2o0;
import defpackage.zin0;
import defpackage.znn0;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.scooters.data.model.ScootersErrorCode;

/* loaded from: classes13.dex */
public final class h extends r95 {
    public final e2e0 b;
    public final n6n0 c;
    public final y5p0 d;
    public final b3n0 e;
    public final znn0 f;
    public final com.yandex.go.scooters.domain.d g;
    public final s6n0 h;
    public final bvn0 i;
    public final z2o0 j;
    public final com.yandex.go.scooters.offers.v2.components.bottom.data.a k;
    public final com.yandex.go.scooters.passes.domain.g l;
    public final q4o0 m;

    public h(e2e0 e2e0Var, n6n0 n6n0Var, y5p0 y5p0Var, b3n0 b3n0Var, znn0 znn0Var, com.yandex.go.scooters.domain.d dVar, s6n0 s6n0Var, bvn0 bvn0Var, z2o0 z2o0Var, com.yandex.go.scooters.offers.v2.components.bottom.data.a aVar, com.yandex.go.scooters.passes.domain.g gVar, q4o0 q4o0Var) {
        this.b = e2e0Var;
        this.c = n6n0Var;
        this.d = y5p0Var;
        this.e = b3n0Var;
        this.f = znn0Var;
        this.g = dVar;
        this.h = s6n0Var;
        this.i = bvn0Var;
        this.j = z2o0Var;
        this.k = aVar;
        this.l = gVar;
        this.m = q4o0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (d(r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.r95
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ScootersRealBookHandler$handle$1 scootersRealBookHandler$handle$1;
        int i;
        if (continuationImpl instanceof ScootersRealBookHandler$handle$1) {
            scootersRealBookHandler$handle$1 = (ScootersRealBookHandler$handle$1) continuationImpl;
            int i2 = scootersRealBookHandler$handle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersRealBookHandler$handle$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersRealBookHandler$handle$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersRealBookHandler$handle$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.h.a(ScootersCardV2Analytics$CardButton.BOOK);
                    this.f.a = false;
                    scootersRealBookHandler$handle$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                scootersRealBookHandler$handle$1.label = 2;
                Object a = super.a(scootersRealBookHandler$handle$1);
                return a != obj2 ? obj2 : a;
            }
        }
        scootersRealBookHandler$handle$1 = new ScootersRealBookHandler$handle$1(this, continuationImpl);
        Object obj3 = scootersRealBookHandler$handle$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersRealBookHandler$handle$1.label;
        if (i != 0) {
        }
        scootersRealBookHandler$handle$1.label = 2;
        Object a2 = super.a(scootersRealBookHandler$handle$1);
        if (a2 != obj22) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00c4, code lost:
    
        if (r11 == null) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r8v0, types: [T, kotlin.Result] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ScootersPassesType scootersPassesType, ContinuationImpl continuationImpl) {
        ScootersRealBookHandler$handlePackagePurchasing$1 scootersRealBookHandler$handlePackagePurchasing$1;
        int i;
        com.yandex.go.scooters.offers.v2.components.bottom.data.a aVar;
        y5n0 a;
        Object a2;
        ScootersPassesType scootersPassesType2;
        Ref$ObjectRef ref$ObjectRef;
        boolean z;
        ScootersPassesType scootersPassesType3;
        Result result;
        moo0 moo0Var;
        if (continuationImpl instanceof ScootersRealBookHandler$handlePackagePurchasing$1) {
            scootersRealBookHandler$handlePackagePurchasing$1 = (ScootersRealBookHandler$handlePackagePurchasing$1) continuationImpl;
            int i2 = scootersRealBookHandler$handlePackagePurchasing$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersRealBookHandler$handlePackagePurchasing$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersRealBookHandler$handlePackagePurchasing$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersRealBookHandler$handlePackagePurchasing$1.label;
                b3n0 b3n0Var = this.e;
                if (i != 0) {
                    kotlin.b.b(obj);
                    r0 r0Var = b3n0Var.a;
                    r0Var.getClass();
                    r0Var.m(null, t2n0.a);
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    aVar = this.k;
                    a = aVar.a.a();
                    scootersRealBookHandler$handlePackagePurchasing$1.L$0 = scootersPassesType;
                    scootersRealBookHandler$handlePackagePurchasing$1.L$1 = ref$ObjectRef2;
                    scootersRealBookHandler$handlePackagePurchasing$1.L$2 = aVar;
                    scootersRealBookHandler$handlePackagePurchasing$1.L$3 = a;
                    scootersRealBookHandler$handlePackagePurchasing$1.label = 1;
                    a2 = this.l.a(scootersRealBookHandler$handlePackagePurchasing$1);
                    if (a2 != coroutineSingletons) {
                        scootersPassesType2 = scootersPassesType;
                        ref$ObjectRef = ref$ObjectRef2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ref$ObjectRef = (Ref$ObjectRef) scootersRealBookHandler$handlePackagePurchasing$1.L$1;
                    scootersPassesType3 = (ScootersPassesType) scootersRealBookHandler$handlePackagePurchasing$1.L$0;
                    kotlin.b.b(obj);
                    scootersPassesType2 = scootersPassesType3;
                    result = (Result) ref$ObjectRef.element;
                    if (result != null) {
                        Object value = result.getValue();
                        kotlin.b.b(value);
                        moo0Var = (moo0) value;
                    }
                    moo0Var = joo0.a;
                    if (!(moo0Var instanceof joo0)) {
                        com.yandex.go.scooters.offers.v2.g gVar = ((h7n0) this.c).b;
                        gVar.A((m950) gVar.k0.get(), new poo0(moo0Var, scootersPassesType2), sy60.Q2);
                        b3n0Var.b();
                    }
                    return zy11.a;
                }
                y5n0 y5n0Var = (y5n0) scootersRealBookHandler$handlePackagePurchasing$1.L$3;
                aVar = (com.yandex.go.scooters.offers.v2.components.bottom.data.a) scootersRealBookHandler$handlePackagePurchasing$1.L$2;
                Ref$ObjectRef ref$ObjectRef3 = (Ref$ObjectRef) scootersRealBookHandler$handlePackagePurchasing$1.L$1;
                ScootersPassesType scootersPassesType4 = (ScootersPassesType) scootersRealBookHandler$handlePackagePurchasing$1.L$0;
                kotlin.b.b(obj);
                a = y5n0Var;
                ref$ObjectRef = ref$ObjectRef3;
                a2 = ((Result) obj).getValue();
                scootersPassesType2 = scootersPassesType4;
                ref$ObjectRef.element = new Result(a2);
                z = a2 instanceof Result.Failure;
                boolean z2 = !z;
                if (!z) {
                    scootersRealBookHandler$handlePackagePurchasing$1.L$0 = scootersPassesType2;
                    scootersRealBookHandler$handlePackagePurchasing$1.L$1 = ref$ObjectRef;
                    scootersRealBookHandler$handlePackagePurchasing$1.L$2 = null;
                    scootersRealBookHandler$handlePackagePurchasing$1.L$3 = null;
                    scootersRealBookHandler$handlePackagePurchasing$1.Z$0 = z2;
                    scootersRealBookHandler$handlePackagePurchasing$1.label = 2;
                    if (com.yandex.go.scooters.offers.v2.components.bottom.data.a.a(aVar, a, scootersRealBookHandler$handlePackagePurchasing$1) != coroutineSingletons) {
                        scootersPassesType3 = scootersPassesType2;
                        scootersPassesType2 = scootersPassesType3;
                    }
                    return coroutineSingletons;
                }
                result = (Result) ref$ObjectRef.element;
                if (result != null) {
                }
                moo0Var = joo0.a;
                if (!(moo0Var instanceof joo0)) {
                }
                return zy11.a;
            }
        }
        scootersRealBookHandler$handlePackagePurchasing$1 = new ScootersRealBookHandler$handlePackagePurchasing$1(this, continuationImpl);
        Object obj2 = scootersRealBookHandler$handlePackagePurchasing$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersRealBookHandler$handlePackagePurchasing$1.label;
        b3n0 b3n0Var2 = this.e;
        if (i != 0) {
        }
        ref$ObjectRef.element = new Result(a2);
        z = a2 instanceof Result.Failure;
        boolean z22 = !z;
        if (!z) {
        }
        result = (Result) ref$ObjectRef.element;
        if (result != null) {
        }
        moo0Var = joo0.a;
        if (!(moo0Var instanceof joo0)) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        ScootersRealBookHandler$realBookOffer$1 scootersRealBookHandler$realBookOffer$1;
        int i;
        vbn0 vbn0Var;
        Throwable th;
        boolean z;
        try {
            if (continuationImpl instanceof ScootersRealBookHandler$realBookOffer$1) {
                scootersRealBookHandler$realBookOffer$1 = (ScootersRealBookHandler$realBookOffer$1) continuationImpl;
                int i2 = scootersRealBookHandler$realBookOffer$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersRealBookHandler$realBookOffer$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = scootersRealBookHandler$realBookOffer$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersRealBookHandler$realBookOffer$1.label;
                    zy11 zy11Var = zy11.a;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        y5n0 a = this.j.a();
                        if (a != null) {
                            vbn0 vbn0Var2 = a.j;
                            b4p0 a2 = this.d.a();
                            if (a2 != null) {
                                try {
                                    scootersRealBookHandler$realBookOffer$1.L$0 = vbn0Var2;
                                    scootersRealBookHandler$realBookOffer$1.L$1 = null;
                                    scootersRealBookHandler$realBookOffer$1.label = 1;
                                    if (e(vbn0Var2, a2, scootersRealBookHandler$realBookOffer$1) == obj2) {
                                        return obj2;
                                    }
                                } catch (Throwable th2) {
                                    vbn0Var = vbn0Var2;
                                    th = th2;
                                }
                            }
                        }
                        return zy11Var;
                    }
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vbn0Var = (vbn0) scootersRealBookHandler$realBookOffer$1.L$0;
                    try {
                        kotlin.b.b(obj);
                        return zy11Var;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    z = th instanceof ScootersBookingException;
                    e2e0 e2e0Var = this.b;
                    n6n0 n6n0Var = this.c;
                    bvn0 bvn0Var = this.i;
                    b3n0 b3n0Var = this.e;
                    if (z) {
                        boolean z2 = th instanceof ScootersBookingFailedException;
                        if (z2 && ((ScootersBookingFailedException) th).getErrorCode() == ScootersErrorCode.CAR_IS_BUSY) {
                            b3n0Var.a(bvn0Var.a(th));
                        } else if (z2 && ((ScootersBookingFailedException) th).getErrorCode() == ScootersErrorCode.PD_DATA_UNFILLED) {
                            b3n0Var.b();
                            com.yandex.go.scooters.offers.v2.g gVar = ((h7n0) n6n0Var).b;
                            gVar.z(gVar.O.a(), sy60.Q2);
                        } else if ((th instanceof ScootersPassActionException.ScootersPassPurchaseFailedException) || (th instanceof ScootersPassActionException.ScootersPassActionFailedStatusException)) {
                            List c = q1b1.c(vbn0Var);
                            ArrayList arrayList = new ArrayList(tcc.n(c, 10));
                            Iterator it = c.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((r7p0) it.next()).a);
                            }
                            ((h7n0) n6n0Var).f(th, arrayList, false);
                            b3n0Var.b();
                        } else if (th instanceof ScootersPhotoVerificationRequiredException) {
                            ScootersPhotoVerificationRequiredException scootersPhotoVerificationRequiredException = (ScootersPhotoVerificationRequiredException) th;
                            tho0 action = scootersPhotoVerificationRequiredException.getAction();
                            if (jl40.l(action, rho0.a)) {
                                e2e0Var.d("photocontrol", "");
                                b3n0Var.b();
                            } else {
                                if (!(action instanceof sho0)) {
                                    w511.b();
                                    return null;
                                }
                                Set set = ((sho0) scootersPhotoVerificationRequiredException.getAction()).b;
                                String str = ((sho0) scootersPhotoVerificationRequiredException.getAction()).a;
                                h7n0 h7n0Var = (h7n0) n6n0Var;
                                h7n0Var.getClass();
                                h7n0Var.c(new oio0(set, str));
                                b3n0Var.b();
                            }
                        } else if (th instanceof ScootersDriverLicenseVerificationRequiredException) {
                            ScootersDriverLicenseVerificationRequiredException scootersDriverLicenseVerificationRequiredException = (ScootersDriverLicenseVerificationRequiredException) th;
                            this.f(scootersDriverLicenseVerificationRequiredException.getFlow(), scootersDriverLicenseVerificationRequiredException.getStoryId());
                        } else {
                            b3n0Var.a(th);
                        }
                    } else {
                        ScootersBookingException scootersBookingException = (ScootersBookingException) th;
                        Throwable throwable = scootersBookingException.getThrowable();
                        qkn0 payload = scootersBookingException.getPayload();
                        pjn0 content = scootersBookingException.getContent();
                        if (payload instanceof mkn0) {
                            ScootersErrorCode scootersErrorCode = ((mkn0) payload).a;
                            int i3 = mro0.a[scootersErrorCode.ordinal()];
                            if (i3 == 1 || i3 == 2) {
                                b3n0Var.a(new ScootersBookingException(bvn0Var.a(throwable), new mkn0(scootersErrorCode), content));
                            } else if (i3 != 3) {
                                b3n0Var.a(new ScootersBookingException(throwable, new mkn0(scootersErrorCode), content));
                            } else {
                                e2e0Var.d("photocontrol", "");
                                b3n0Var.b();
                            }
                        } else if (payload instanceof okn0) {
                            Set singleton = Collections.singleton(ScootersExamType.SELFIE);
                            String str2 = ((okn0) payload).a;
                            h7n0 h7n0Var2 = (h7n0) n6n0Var;
                            h7n0Var2.getClass();
                            h7n0Var2.c(new oio0(singleton, str2));
                            b3n0Var.b();
                        } else if (payload instanceof pkn0) {
                            Set f0 = j73.f0(new ScootersExamType[]{ScootersExamType.SELFIE, ScootersExamType.PASSPORT});
                            String str3 = ((pkn0) payload).a;
                            h7n0 h7n0Var3 = (h7n0) n6n0Var;
                            h7n0Var3.getClass();
                            h7n0Var3.c(new oio0(f0, str3));
                            b3n0Var.b();
                        } else {
                            if (!(payload instanceof nkn0)) {
                                w511.b();
                                return null;
                            }
                            nkn0 nkn0Var = (nkn0) payload;
                            this.f(nkn0Var.b, nkn0Var.a);
                        }
                    }
                    return zy11Var;
                }
            }
            if (i != 0) {
            }
            z = th instanceof ScootersBookingException;
            e2e0 e2e0Var2 = this.b;
            n6n0 n6n0Var2 = this.c;
            bvn0 bvn0Var2 = this.i;
            b3n0 b3n0Var2 = this.e;
            if (z) {
            }
            return zy11Var;
        } catch (CancellationException e) {
            throw e;
        }
        scootersRealBookHandler$realBookOffer$1 = new ScootersRealBookHandler$realBookOffer$1(this, continuationImpl);
        Object obj3 = scootersRealBookHandler$realBookOffer$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersRealBookHandler$realBookOffer$1.label;
        zy11 zy11Var2 = zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0079, code lost:
    
        if (r11 == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(vbn0 vbn0Var, b4p0 b4p0Var, ContinuationImpl continuationImpl) {
        ScootersRealBookHandler$runBook$1 scootersRealBookHandler$runBook$1;
        int i;
        boolean z;
        if (continuationImpl instanceof ScootersRealBookHandler$runBook$1) {
            scootersRealBookHandler$runBook$1 = (ScootersRealBookHandler$runBook$1) continuationImpl;
            int i2 = scootersRealBookHandler$runBook$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersRealBookHandler$runBook$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersRealBookHandler$runBook$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersRealBookHandler$runBook$1.label;
                b3n0 b3n0Var = this.e;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ScootersBookState$Booking$Type scootersBookState$Booking$Type = b4p0Var instanceof b590 ? ScootersBookState$Booking$Type.PACKAGE_PURCHASE : ScootersBookState$Booking$Type.DEFAULT;
                    r0 r0Var = b3n0Var.a;
                    r2n0 r2n0Var = new r2n0(scootersBookState$Booking$Type);
                    r0Var.getClass();
                    r0Var.m(null, r2n0Var);
                    this.m.a().getClass();
                    scootersRealBookHandler$runBook$1.L$0 = null;
                    scootersRealBookHandler$runBook$1.L$1 = null;
                    scootersRealBookHandler$runBook$1.label = 1;
                    obj = this.g.d(vbn0Var, b4p0Var, scootersRealBookHandler$runBook$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    kotlin.b.b(obj);
                }
                n2n0 n2n0Var = (n2n0) obj;
                scootersRealBookHandler$runBook$1.L$0 = null;
                scootersRealBookHandler$runBook$1.L$1 = null;
                scootersRealBookHandler$runBook$1.L$2 = null;
                scootersRealBookHandler$runBook$1.label = 2;
                z = n2n0Var instanceof j2n0;
                Object obj3 = zy11.a;
                n6n0 n6n0Var = this.c;
                if (z) {
                    if (n2n0Var instanceof l2n0) {
                        l2n0 l2n0Var = (l2n0) n2n0Var;
                        eer eerVar = l2n0Var.a;
                        vbn0 vbn0Var2 = l2n0Var.b;
                        h7n0 h7n0Var = (h7n0) n6n0Var;
                        com.yandex.go.scooters.offers.v2.g gVar = h7n0Var.b;
                        gVar.z((m950) gVar.P.get(), new f7n0(h7n0Var, eerVar, vbn0Var2));
                    } else if (n2n0Var instanceof m2n0) {
                        m2n0 m2n0Var = (m2n0) n2n0Var;
                        eer eerVar2 = m2n0Var.a;
                        vbn0 vbn0Var3 = m2n0Var.c;
                        zzs zzsVar = m2n0Var.b;
                        h7n0 h7n0Var2 = (h7n0) n6n0Var;
                        h7n0Var2.getClass();
                        h7n0Var2.e(eerVar2, vbn0Var3, ScootersTariffFixSelectionAnalytics$FixSelectionOpenReason.DEEPLINK, zzsVar);
                    } else if (n2n0Var instanceof k2n0) {
                        Object c = c(((k2n0) n2n0Var).a, scootersRealBookHandler$runBook$1);
                        if (c == obj2) {
                            obj3 = c;
                        }
                    } else if (!jl40.l(n2n0Var, i2n0.a)) {
                        w511.b();
                        return null;
                    }
                    b3n0Var.b();
                } else {
                    h7n0 h7n0Var3 = (h7n0) n6n0Var;
                    h7n0Var3.b.r(new vam0(16, ((j2n0) n2n0Var).a, h7n0Var3));
                }
                return obj3 != obj2 ? obj2 : obj3;
            }
        }
        scootersRealBookHandler$runBook$1 = new ScootersRealBookHandler$runBook$1(this, continuationImpl);
        Object obj4 = scootersRealBookHandler$runBook$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersRealBookHandler$runBook$1.label;
        b3n0 b3n0Var2 = this.e;
        if (i != 0) {
        }
        n2n0 n2n0Var2 = (n2n0) obj4;
        scootersRealBookHandler$runBook$1.L$0 = null;
        scootersRealBookHandler$runBook$1.L$1 = null;
        scootersRealBookHandler$runBook$1.L$2 = null;
        scootersRealBookHandler$runBook$1.label = 2;
        z = n2n0Var2 instanceof j2n0;
        Object obj32 = zy11.a;
        n6n0 n6n0Var2 = this.c;
        if (z) {
        }
        if (obj32 != obj22) {
        }
    }

    public final void f(String str, String str2) {
        com.yandex.go.scooters.offers.v2.g gVar = ((h7n0) this.c).b;
        gVar.A((m950) gVar.d0.get(), new zin0(str, str2), sy60.Q2);
        this.e.b();
    }
}
