package com.yandex.mob.domain;

import com.yandex.mob.model.MobRemoteNotificationCommand;
import com.yandex.mob.reporting.MobTrigger;
import defpackage.gp20;
import defpackage.lq20;
import defpackage.no20;
import defpackage.npt;
import defpackage.ny61;
import defpackage.qr20;
import defpackage.rot;
import defpackage.tm20;
import defpackage.w511;
import defpackage.zcx;
import defpackage.zq20;
import defpackage.zvi0;
import defpackage.zy11;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class r {
    public final no20 a;
    public final l b;
    public final com.yandex.mob.datastore.c c;
    public final d d;
    public final u e;
    public final gp20 f;
    public final com.yandex.mob.okhttp.d g;
    public final npt h;
    public final m i;
    public final com.yandex.mob.reporting.a j;
    public final rot k;

    public r(no20 no20Var, l lVar, com.yandex.mob.datastore.c cVar, d dVar, u uVar, com.yandex.mob.network.a aVar, com.yandex.mob.okhttp.d dVar2, npt nptVar, m mVar, com.yandex.mob.reporting.a aVar2, rot rotVar) {
        this.a = no20Var;
        this.b = lVar;
        this.c = cVar;
        this.d = dVar;
        this.e = uVar;
        this.f = aVar;
        this.g = dVar2;
        this.h = nptVar;
        this.i = mVar;
        this.j = aVar2;
        this.k = rotVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0193, code lost:
    
        if (r17.e.c(r1, r2) == r3) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0175, code lost:
    
        if (r17.d.c(r1, true, true, r2) == r3) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0150, code lost:
    
        if (r17.c.b(r12, r2) == r3) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ad, code lost:
    
        if (r4 == r3) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0111 -> B:29:0x0114). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List list, ContinuationImpl continuationImpl) {
        RemoteNotificationUseCase$handleAddToConfig$1 remoteNotificationUseCase$handleAddToConfig$1;
        int i;
        List list2;
        Object d;
        Iterator it;
        tm20 tm20Var;
        int i2;
        List list3;
        if (continuationImpl instanceof RemoteNotificationUseCase$handleAddToConfig$1) {
            remoteNotificationUseCase$handleAddToConfig$1 = (RemoteNotificationUseCase$handleAddToConfig$1) continuationImpl;
            int i3 = remoteNotificationUseCase$handleAddToConfig$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                remoteNotificationUseCase$handleAddToConfig$1.label = i3 - Integer.MIN_VALUE;
                Object obj = remoteNotificationUseCase$handleAddToConfig$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = remoteNotificationUseCase$handleAddToConfig$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    list2 = list;
                    remoteNotificationUseCase$handleAddToConfig$1.L$0 = list2;
                    remoteNotificationUseCase$handleAddToConfig$1.label = 1;
                    d = this.b.d(remoteNotificationUseCase$handleAddToConfig$1);
                } else if (i == 1) {
                    List list4 = (List) remoteNotificationUseCase$handleAddToConfig$1.L$0;
                    kotlin.b.b(obj);
                    d = obj;
                    list2 = list4;
                } else {
                    if (i == 2) {
                        int i4 = remoteNotificationUseCase$handleAddToConfig$1.I$0;
                        rot rotVar = (rot) remoteNotificationUseCase$handleAddToConfig$1.L$7;
                        it = (Iterator) remoteNotificationUseCase$handleAddToConfig$1.L$4;
                        List list5 = (List) remoteNotificationUseCase$handleAddToConfig$1.L$2;
                        tm20Var = (tm20) remoteNotificationUseCase$handleAddToConfig$1.L$1;
                        kotlin.b.b(obj);
                        rotVar.b((Pair) obj);
                        i2 = i4;
                        list3 = list5;
                        if (!it.hasNext()) {
                            lq20 lq20Var = (lq20) it.next();
                            remoteNotificationUseCase$handleAddToConfig$1.L$0 = null;
                            remoteNotificationUseCase$handleAddToConfig$1.L$1 = tm20Var;
                            remoteNotificationUseCase$handleAddToConfig$1.L$2 = list3;
                            remoteNotificationUseCase$handleAddToConfig$1.L$3 = null;
                            remoteNotificationUseCase$handleAddToConfig$1.L$4 = it;
                            remoteNotificationUseCase$handleAddToConfig$1.L$5 = null;
                            remoteNotificationUseCase$handleAddToConfig$1.L$6 = null;
                            rotVar = this.k;
                            remoteNotificationUseCase$handleAddToConfig$1.L$7 = rotVar;
                            remoteNotificationUseCase$handleAddToConfig$1.I$0 = i2;
                            remoteNotificationUseCase$handleAddToConfig$1.I$1 = 0;
                            remoteNotificationUseCase$handleAddToConfig$1.label = 2;
                            Serializable m = this.j.m(lq20Var, remoteNotificationUseCase$handleAddToConfig$1);
                            if (m != coroutineSingletons) {
                                list5 = list3;
                                i4 = i2;
                                obj = m;
                                rotVar.b((Pair) obj);
                                i2 = i4;
                                list3 = list5;
                                if (!it.hasNext()) {
                                    List list6 = list3;
                                    if (!list6.isEmpty()) {
                                        tm20 tm20Var2 = new tm20(tm20Var.a, tm20Var.b, kotlin.collections.a.m0(tm20Var.c, list6), tm20Var.d);
                                        remoteNotificationUseCase$handleAddToConfig$1.L$0 = null;
                                        remoteNotificationUseCase$handleAddToConfig$1.L$1 = null;
                                        remoteNotificationUseCase$handleAddToConfig$1.L$2 = list3;
                                        remoteNotificationUseCase$handleAddToConfig$1.L$3 = null;
                                        remoteNotificationUseCase$handleAddToConfig$1.L$4 = null;
                                        remoteNotificationUseCase$handleAddToConfig$1.L$5 = null;
                                        remoteNotificationUseCase$handleAddToConfig$1.L$6 = null;
                                        remoteNotificationUseCase$handleAddToConfig$1.L$7 = null;
                                        remoteNotificationUseCase$handleAddToConfig$1.label = 3;
                                    }
                                    if (!list3.isEmpty()) {
                                    }
                                    MobTrigger mobTrigger = MobTrigger.AddToConfig;
                                    remoteNotificationUseCase$handleAddToConfig$1.L$0 = null;
                                    remoteNotificationUseCase$handleAddToConfig$1.L$1 = null;
                                    remoteNotificationUseCase$handleAddToConfig$1.L$2 = null;
                                    remoteNotificationUseCase$handleAddToConfig$1.L$3 = null;
                                    remoteNotificationUseCase$handleAddToConfig$1.L$4 = null;
                                    remoteNotificationUseCase$handleAddToConfig$1.L$5 = null;
                                    remoteNotificationUseCase$handleAddToConfig$1.L$6 = null;
                                    remoteNotificationUseCase$handleAddToConfig$1.L$7 = null;
                                    remoteNotificationUseCase$handleAddToConfig$1.label = 5;
                                }
                            }
                        }
                        return coroutineSingletons;
                    }
                    if (i == 3) {
                        list3 = (List) remoteNotificationUseCase$handleAddToConfig$1.L$2;
                        kotlin.b.b(obj);
                        if (!list3.isEmpty()) {
                            MobTrigger mobTrigger2 = MobTrigger.AddToConfig;
                            remoteNotificationUseCase$handleAddToConfig$1.L$0 = null;
                            remoteNotificationUseCase$handleAddToConfig$1.L$1 = null;
                            remoteNotificationUseCase$handleAddToConfig$1.L$2 = null;
                            remoteNotificationUseCase$handleAddToConfig$1.L$3 = null;
                            remoteNotificationUseCase$handleAddToConfig$1.L$4 = null;
                            remoteNotificationUseCase$handleAddToConfig$1.L$5 = null;
                            remoteNotificationUseCase$handleAddToConfig$1.L$6 = null;
                            remoteNotificationUseCase$handleAddToConfig$1.L$7 = null;
                            remoteNotificationUseCase$handleAddToConfig$1.label = 4;
                        }
                        MobTrigger mobTrigger3 = MobTrigger.AddToConfig;
                        remoteNotificationUseCase$handleAddToConfig$1.L$0 = null;
                        remoteNotificationUseCase$handleAddToConfig$1.L$1 = null;
                        remoteNotificationUseCase$handleAddToConfig$1.L$2 = null;
                        remoteNotificationUseCase$handleAddToConfig$1.L$3 = null;
                        remoteNotificationUseCase$handleAddToConfig$1.L$4 = null;
                        remoteNotificationUseCase$handleAddToConfig$1.L$5 = null;
                        remoteNotificationUseCase$handleAddToConfig$1.L$6 = null;
                        remoteNotificationUseCase$handleAddToConfig$1.L$7 = null;
                        remoteNotificationUseCase$handleAddToConfig$1.label = 5;
                    } else {
                        if (i != 4) {
                            if (i != 5) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return zy11.a;
                        }
                        kotlin.b.b(obj);
                        MobTrigger mobTrigger32 = MobTrigger.AddToConfig;
                        remoteNotificationUseCase$handleAddToConfig$1.L$0 = null;
                        remoteNotificationUseCase$handleAddToConfig$1.L$1 = null;
                        remoteNotificationUseCase$handleAddToConfig$1.L$2 = null;
                        remoteNotificationUseCase$handleAddToConfig$1.L$3 = null;
                        remoteNotificationUseCase$handleAddToConfig$1.L$4 = null;
                        remoteNotificationUseCase$handleAddToConfig$1.L$5 = null;
                        remoteNotificationUseCase$handleAddToConfig$1.L$6 = null;
                        remoteNotificationUseCase$handleAddToConfig$1.L$7 = null;
                        remoteNotificationUseCase$handleAddToConfig$1.label = 5;
                    }
                }
                tm20 tm20Var3 = (tm20) d;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    String str = ((lq20) obj2).i;
                    if (str == null || str.equals("default")) {
                        arrayList.add(obj2);
                    }
                }
                it = arrayList.iterator();
                tm20Var = tm20Var3;
                i2 = 0;
                list3 = arrayList;
                if (!it.hasNext()) {
                }
                return coroutineSingletons;
            }
        }
        remoteNotificationUseCase$handleAddToConfig$1 = new RemoteNotificationUseCase$handleAddToConfig$1(this, continuationImpl);
        Object obj3 = remoteNotificationUseCase$handleAddToConfig$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = remoteNotificationUseCase$handleAddToConfig$1.label;
        if (i != 0) {
        }
        tm20 tm20Var32 = (tm20) d;
        ArrayList arrayList2 = new ArrayList();
        while (r1.hasNext()) {
        }
        it = arrayList2.iterator();
        tm20Var = tm20Var32;
        i2 = 0;
        list3 = arrayList2;
        if (!it.hasNext()) {
        }
        return coroutineSingletons2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0109, code lost:
    
        if (a(r13, r0) == r1) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Map map, Continuation continuation) {
        RemoteNotificationUseCase$invoke$1 remoteNotificationUseCase$invoke$1;
        int i;
        String str;
        String str2;
        Object b;
        zq20 zq20Var;
        rot rotVar;
        String str3;
        int i2;
        if (continuation instanceof RemoteNotificationUseCase$invoke$1) {
            remoteNotificationUseCase$invoke$1 = (RemoteNotificationUseCase$invoke$1) continuation;
            int i3 = remoteNotificationUseCase$invoke$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                remoteNotificationUseCase$invoke$1.label = i3 - Integer.MIN_VALUE;
                Object obj = remoteNotificationUseCase$invoke$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = remoteNotificationUseCase$invoke$1.label;
                Object obj3 = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    str = (String) map.get("id");
                    if (str != null && (str2 = (String) map.get("x-mob")) != null) {
                        if (zq20.class.equals(zy11.class)) {
                            b = (zq20) obj3;
                        } else {
                            zcx zcxVar = qr20.a;
                            zcxVar.getClass();
                            b = zcxVar.b(zq20.Companion.serializer(), str2);
                        }
                        zq20Var = (zq20) b;
                        if (zq20Var != null) {
                            MobRemoteNotificationCommand mobRemoteNotificationCommand = zq20Var.a;
                            if (mobRemoteNotificationCommand != null) {
                                remoteNotificationUseCase$invoke$1.L$0 = null;
                                remoteNotificationUseCase$invoke$1.L$1 = str;
                                remoteNotificationUseCase$invoke$1.L$2 = zq20Var;
                                remoteNotificationUseCase$invoke$1.L$3 = null;
                                rot rotVar2 = this.k;
                                remoteNotificationUseCase$invoke$1.L$4 = rotVar2;
                                remoteNotificationUseCase$invoke$1.I$0 = 0;
                                remoteNotificationUseCase$invoke$1.label = 1;
                                Object s = this.j.s(mobRemoteNotificationCommand, remoteNotificationUseCase$invoke$1);
                                if (s != obj2) {
                                    obj = s;
                                    rotVar = rotVar2;
                                }
                            }
                            str3 = str;
                            MobRemoteNotificationCommand mobRemoteNotificationCommand2 = zq20Var.a;
                            i2 = mobRemoteNotificationCommand2 == null ? -1 : zvi0.a[mobRemoteNotificationCommand2.ordinal()];
                            no20 no20Var = this.a;
                            if (i2 == -1) {
                                no20Var.getClass();
                            } else {
                                if (i2 != 1) {
                                    w511.b();
                                    return null;
                                }
                                List list = zq20Var.b;
                                List list2 = list;
                                if (list2 == null || list2.isEmpty()) {
                                    no20Var.getClass();
                                    return obj3;
                                }
                                remoteNotificationUseCase$invoke$1.L$0 = null;
                                remoteNotificationUseCase$invoke$1.L$1 = str3;
                                remoteNotificationUseCase$invoke$1.L$2 = null;
                                remoteNotificationUseCase$invoke$1.L$3 = null;
                                remoteNotificationUseCase$invoke$1.L$4 = null;
                                remoteNotificationUseCase$invoke$1.label = 2;
                            }
                        }
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj3;
                    }
                    str3 = (String) remoteNotificationUseCase$invoke$1.L$1;
                    kotlin.b.b(obj);
                    remoteNotificationUseCase$invoke$1.L$0 = null;
                    remoteNotificationUseCase$invoke$1.L$1 = null;
                    remoteNotificationUseCase$invoke$1.L$2 = null;
                    remoteNotificationUseCase$invoke$1.L$3 = null;
                    remoteNotificationUseCase$invoke$1.label = 3;
                    Object a = this.f.a(new RemoteNotificationUseCase$sendAcknowledgement$2(this, str3, null), remoteNotificationUseCase$invoke$1);
                    if (a != obj2) {
                        a = obj3;
                    }
                    return a == obj2 ? obj2 : obj3;
                }
                rotVar = (rot) remoteNotificationUseCase$invoke$1.L$4;
                zq20Var = (zq20) remoteNotificationUseCase$invoke$1.L$2;
                str = (String) remoteNotificationUseCase$invoke$1.L$1;
                kotlin.b.b(obj);
                rotVar.b((Pair) obj);
                str3 = str;
                MobRemoteNotificationCommand mobRemoteNotificationCommand22 = zq20Var.a;
                if (mobRemoteNotificationCommand22 == null) {
                }
                no20 no20Var2 = this.a;
                if (i2 == -1) {
                }
            }
        }
        remoteNotificationUseCase$invoke$1 = new RemoteNotificationUseCase$invoke$1(this, continuation);
        Object obj4 = remoteNotificationUseCase$invoke$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = remoteNotificationUseCase$invoke$1.label;
        Object obj32 = zy11.a;
        if (i != 0) {
        }
        rotVar.b((Pair) obj4);
        str3 = str;
        MobRemoteNotificationCommand mobRemoteNotificationCommand222 = zq20Var.a;
        if (mobRemoteNotificationCommand222 == null) {
        }
        no20 no20Var22 = this.a;
        if (i2 == -1) {
        }
    }
}
