package com.yandex.go.zone.repository;

import defpackage.ae61;
import defpackage.bvf0;
import defpackage.cne0;
import defpackage.dne0;
import defpackage.ed61;
import defpackage.fd61;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.mdh;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.oay0;
import defpackage.on2;
import defpackage.sjh;
import defpackage.td61;
import defpackage.tje;
import defpackage.tt2;
import defpackage.ud61;
import defpackage.uyj;
import defpackage.vd61;
import defpackage.w511;
import defpackage.wd61;
import defpackage.zzs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class r {
    public final on2 a;
    public final ru.yandex.taxi.launch.c b;
    public final tt2 c;
    public final ae61 d;
    public final ed61 e;
    public final fd61 f;
    public final l g;
    public final cne0 i;
    public volatile String j;
    public final i3y h = kotlin.a.a(new oay0(27, this));
    public final r0 k = bvf0.c(td61.a);

    public r(on2 on2Var, ru.yandex.taxi.launch.c cVar, tt2 tt2Var, ae61 ae61Var, dne0 dne0Var, ed61 ed61Var, fd61 fd61Var, l lVar) {
        this.a = on2Var;
        this.b = cVar;
        this.c = tt2Var;
        this.d = ae61Var;
        this.e = ed61Var;
        this.f = fd61Var;
        this.g = lVar;
        this.i = dne0Var.a("ZoneNameRepository");
    }

    public final synchronized String a() {
        try {
            if (this.j == null) {
                this.j = this.i.l("lastCity", null);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(zzs zzsVar, ContinuationImpl continuationImpl) {
        ZoneNameRepositoryImpl$nearestZoneNameByGeoPoint$1 zoneNameRepositoryImpl$nearestZoneNameByGeoPoint$1;
        int i;
        if (continuationImpl instanceof ZoneNameRepositoryImpl$nearestZoneNameByGeoPoint$1) {
            zoneNameRepositoryImpl$nearestZoneNameByGeoPoint$1 = (ZoneNameRepositoryImpl$nearestZoneNameByGeoPoint$1) continuationImpl;
            int i2 = zoneNameRepositoryImpl$nearestZoneNameByGeoPoint$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zoneNameRepositoryImpl$nearestZoneNameByGeoPoint$1.label = i2 - Integer.MIN_VALUE;
                Object obj = zoneNameRepositoryImpl$nearestZoneNameByGeoPoint$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zoneNameRepositoryImpl$nearestZoneNameByGeoPoint$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    zoneNameRepositoryImpl$nearestZoneNameByGeoPoint$1.L$0 = zzsVar;
                    zoneNameRepositoryImpl$nearestZoneNameByGeoPoint$1.L$1 = this;
                    zoneNameRepositoryImpl$nearestZoneNameByGeoPoint$1.label = 1;
                    obj = this.b.c(zoneNameRepositoryImpl$nearestZoneNameByGeoPoint$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    this = (r) zoneNameRepositoryImpl$nearestZoneNameByGeoPoint$1.L$1;
                    zzsVar = (zzs) zoneNameRepositoryImpl$nearestZoneNameByGeoPoint$1.L$0;
                    kotlin.b.b(obj);
                }
                zoneNameRepositoryImpl$nearestZoneNameByGeoPoint$1.L$0 = null;
                zoneNameRepositoryImpl$nearestZoneNameByGeoPoint$1.L$1 = null;
                zoneNameRepositoryImpl$nearestZoneNameByGeoPoint$1.label = 2;
                Object d = this.d(zzsVar, (String) obj, zoneNameRepositoryImpl$nearestZoneNameByGeoPoint$1);
                return d != coroutineSingletons ? coroutineSingletons : d;
            }
        }
        zoneNameRepositoryImpl$nearestZoneNameByGeoPoint$1 = new ZoneNameRepositoryImpl$nearestZoneNameByGeoPoint$1(this, continuationImpl);
        Object obj2 = zoneNameRepositoryImpl$nearestZoneNameByGeoPoint$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zoneNameRepositoryImpl$nearestZoneNameByGeoPoint$1.label;
        if (i != 0) {
        }
        zoneNameRepositoryImpl$nearestZoneNameByGeoPoint$1.L$0 = null;
        zoneNameRepositoryImpl$nearestZoneNameByGeoPoint$1.L$1 = null;
        zoneNameRepositoryImpl$nearestZoneNameByGeoPoint$1.label = 2;
        Object d2 = this.d(zzsVar, (String) obj2, zoneNameRepositoryImpl$nearestZoneNameByGeoPoint$1);
        if (d2 != coroutineSingletons2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (r7 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        ZoneNameRepositoryImpl$nearestZoneNameByLastLocation$1 zoneNameRepositoryImpl$nearestZoneNameByLastLocation$1;
        int i;
        if (continuationImpl instanceof ZoneNameRepositoryImpl$nearestZoneNameByLastLocation$1) {
            zoneNameRepositoryImpl$nearestZoneNameByLastLocation$1 = (ZoneNameRepositoryImpl$nearestZoneNameByLastLocation$1) continuationImpl;
            int i2 = zoneNameRepositoryImpl$nearestZoneNameByLastLocation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zoneNameRepositoryImpl$nearestZoneNameByLastLocation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = zoneNameRepositoryImpl$nearestZoneNameByLastLocation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zoneNameRepositoryImpl$nearestZoneNameByLastLocation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    zoneNameRepositoryImpl$nearestZoneNameByLastLocation$1.L$0 = this;
                    zoneNameRepositoryImpl$nearestZoneNameByLastLocation$1.label = 1;
                    obj = ((ru.yandex.taxi.preorder.source.userposition.e) this.f.a).f(zoneNameRepositoryImpl$nearestZoneNameByLastLocation$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (r) zoneNameRepositoryImpl$nearestZoneNameByLastLocation$1.L$0;
                    kotlin.b.b(obj);
                }
                zzs a = ((mo21) obj).a();
                zoneNameRepositoryImpl$nearestZoneNameByLastLocation$1.L$0 = null;
                zoneNameRepositoryImpl$nearestZoneNameByLastLocation$1.label = 2;
                Object b = this.b(a, zoneNameRepositoryImpl$nearestZoneNameByLastLocation$1);
                return b != coroutineSingletons ? coroutineSingletons : b;
            }
        }
        zoneNameRepositoryImpl$nearestZoneNameByLastLocation$1 = new ZoneNameRepositoryImpl$nearestZoneNameByLastLocation$1(this, continuationImpl);
        Object obj2 = zoneNameRepositoryImpl$nearestZoneNameByLastLocation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zoneNameRepositoryImpl$nearestZoneNameByLastLocation$1.label;
        if (i != 0) {
        }
        zzs a2 = ((mo21) obj2).a();
        zoneNameRepositoryImpl$nearestZoneNameByLastLocation$1.L$0 = null;
        zoneNameRepositoryImpl$nearestZoneNameByLastLocation$1.label = 2;
        Object b2 = this.b(a2, zoneNameRepositoryImpl$nearestZoneNameByLastLocation$1);
        if (b2 != coroutineSingletons2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (r9 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(zzs zzsVar, String str, ContinuationImpl continuationImpl) {
        ZoneNameRepositoryImpl$requestNearestZone$1 zoneNameRepositoryImpl$requestNearestZone$1;
        int i;
        String str2;
        if (continuationImpl instanceof ZoneNameRepositoryImpl$requestNearestZone$1) {
            zoneNameRepositoryImpl$requestNearestZone$1 = (ZoneNameRepositoryImpl$requestNearestZone$1) continuationImpl;
            int i2 = zoneNameRepositoryImpl$requestNearestZone$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zoneNameRepositoryImpl$requestNearestZone$1.label = i2 - Integer.MIN_VALUE;
                Object obj = zoneNameRepositoryImpl$requestNearestZone$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zoneNameRepositoryImpl$requestNearestZone$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    zoneNameRepositoryImpl$requestNearestZone$1.L$0 = str;
                    zoneNameRepositoryImpl$requestNearestZone$1.L$1 = zzsVar;
                    zoneNameRepositoryImpl$requestNearestZone$1.label = 1;
                    obj = e(zzsVar, zoneNameRepositoryImpl$requestNearestZone$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    zzsVar = (zzs) zoneNameRepositoryImpl$requestNearestZone$1.L$1;
                    str = (String) zoneNameRepositoryImpl$requestNearestZone$1.L$0;
                    kotlin.b.b(obj);
                }
                str2 = (String) obj;
                if (str2 == null) {
                    return str2;
                }
                r0 r0Var = this.k;
                r0Var.getClass();
                r0Var.m(null, td61.a);
                this.c.getClass();
                sjh sjhVar = uyj.a;
                mdh mdhVar = mdh.b;
                ZoneNameRepositoryImpl$requestNearestZone$3 zoneNameRepositoryImpl$requestNearestZone$3 = new ZoneNameRepositoryImpl$requestNearestZone$3(this, zzsVar, str, null);
                zoneNameRepositoryImpl$requestNearestZone$1.L$0 = null;
                zoneNameRepositoryImpl$requestNearestZone$1.L$1 = null;
                zoneNameRepositoryImpl$requestNearestZone$1.label = 2;
                Object k0 = tje.k0(mdhVar, zoneNameRepositoryImpl$requestNearestZone$3, zoneNameRepositoryImpl$requestNearestZone$1);
                return k0 == obj2 ? obj2 : k0;
            }
        }
        zoneNameRepositoryImpl$requestNearestZone$1 = new ZoneNameRepositoryImpl$requestNearestZone$1(this, continuationImpl);
        Object obj3 = zoneNameRepositoryImpl$requestNearestZone$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zoneNameRepositoryImpl$requestNearestZone$1.label;
        if (i != 0) {
        }
        str2 = (String) obj3;
        if (str2 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(zzs zzsVar, ContinuationImpl continuationImpl) {
        ZoneNameRepositoryImpl$tryToUseCache$1 zoneNameRepositoryImpl$tryToUseCache$1;
        int i;
        wd61 wd61Var;
        if (continuationImpl instanceof ZoneNameRepositoryImpl$tryToUseCache$1) {
            zoneNameRepositoryImpl$tryToUseCache$1 = (ZoneNameRepositoryImpl$tryToUseCache$1) continuationImpl;
            int i2 = zoneNameRepositoryImpl$tryToUseCache$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zoneNameRepositoryImpl$tryToUseCache$1.label = i2 - Integer.MIN_VALUE;
                Object obj = zoneNameRepositoryImpl$tryToUseCache$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zoneNameRepositoryImpl$tryToUseCache$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    r0 r0Var = this.k;
                    wd61 wd61Var2 = (wd61) r0Var.getValue();
                    if (!jl40.l(wd61Var2, td61.a)) {
                        if (wd61Var2 instanceof ud61) {
                            ud61 ud61Var = (ud61) wd61Var2;
                            if (jl40.l(zzsVar, ud61Var.a())) {
                                return ud61Var.b().a;
                            }
                        } else {
                            if (!(wd61Var2 instanceof vd61)) {
                                w511.b();
                                return null;
                            }
                            if (jl40.l(zzsVar, ((vd61) wd61Var2).a())) {
                                q qVar = new q(r0Var);
                                zoneNameRepositoryImpl$tryToUseCache$1.L$0 = null;
                                zoneNameRepositoryImpl$tryToUseCache$1.L$1 = null;
                                zoneNameRepositoryImpl$tryToUseCache$1.label = 1;
                                obj = kotlinx.coroutines.flow.e.A(qVar, zoneNameRepositoryImpl$tryToUseCache$1);
                                if (obj == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                wd61Var = (wd61) obj;
                if (wd61Var instanceof ud61) {
                    return ((ud61) wd61Var).b().a;
                }
                return null;
            }
        }
        zoneNameRepositoryImpl$tryToUseCache$1 = new ZoneNameRepositoryImpl$tryToUseCache$1(this, continuationImpl);
        Object obj2 = zoneNameRepositoryImpl$tryToUseCache$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zoneNameRepositoryImpl$tryToUseCache$1.label;
        if (i != 0) {
        }
        wd61Var = (wd61) obj2;
        if (wd61Var instanceof ud61) {
        }
        return null;
    }
}
