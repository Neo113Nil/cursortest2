package com.yandex.mob.domain;

import com.yandex.mob.reporting.MobTrigger;
import defpackage.ate0;
import defpackage.ceu0;
import defpackage.ep20;
import defpackage.gp20;
import defpackage.h73;
import defpackage.jpt;
import defpackage.ll20;
import defpackage.ny61;
import defpackage.rot;
import defpackage.tl20;
import defpackage.tm20;
import defpackage.vy21;
import defpackage.w511;
import defpackage.xl20;
import defpackage.xm20;
import defpackage.yw01;
import defpackage.zp20;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class u {
    public final com.yandex.mob.okhttp.b a;
    public final com.yandex.mob.datastore.d b;
    public final List c;
    public final m d;
    public final com.yandex.mob.cron.a e;
    public final gp20 f;
    public final com.yandex.mob.reporting.a g;
    public final rot h;
    public final com.yandex.mob.datastore.c i;
    public final com.yandex.mob.datastore.f j;
    public final d k;
    public final vy21 l;
    public final jpt m;

    public u(com.yandex.mob.okhttp.b bVar, com.yandex.mob.datastore.d dVar, List list, m mVar, com.yandex.mob.cron.a aVar, com.yandex.mob.network.a aVar2, com.yandex.mob.reporting.a aVar3, rot rotVar, com.yandex.mob.datastore.c cVar, com.yandex.mob.datastore.f fVar, d dVar2, vy21 vy21Var, jpt jptVar) {
        this.a = bVar;
        this.b = dVar;
        this.c = list;
        this.d = mVar;
        this.e = aVar;
        this.f = aVar2;
        this.g = aVar3;
        this.h = rotVar;
        this.i = cVar;
        this.j = fVar;
        this.k = dVar2;
        this.l = vy21Var;
        this.m = jptVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x02e9, code lost:
    
        if (r15.c(r0, true, true, r3) != r4) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x02ac, code lost:
    
        if (r15 == r4) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01e8, code lost:
    
        if (r15 != r4) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0164, code lost:
    
        if (r15 == r4) goto L97;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(u uVar, MobTrigger mobTrigger, ContinuationImpl continuationImpl) {
        UpdateConfigUseCase$updateConfigInternal$1 updateConfigUseCase$updateConfigInternal$1;
        List list;
        MobTrigger mobTrigger2;
        tm20 tm20Var;
        String str;
        Object b;
        tm20 tm20Var2;
        String str2;
        MobTrigger mobTrigger3;
        rot rotVar;
        tm20 tm20Var3;
        MobTrigger mobTrigger4;
        xm20 xm20Var;
        xl20 xl20Var;
        rot rotVar2;
        Object obj;
        tm20 tm20Var4;
        tm20 tm20Var5;
        MobTrigger mobTrigger5;
        String str3;
        rot rotVar3;
        com.yandex.mob.datastore.c cVar = uVar.i;
        com.yandex.mob.reporting.a aVar = uVar.g;
        rot rotVar4 = uVar.h;
        if (continuationImpl instanceof UpdateConfigUseCase$updateConfigInternal$1) {
            updateConfigUseCase$updateConfigInternal$1 = (UpdateConfigUseCase$updateConfigInternal$1) continuationImpl;
            int i = updateConfigUseCase$updateConfigInternal$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                updateConfigUseCase$updateConfigInternal$1.label = i - Integer.MIN_VALUE;
                Object obj2 = updateConfigUseCase$updateConfigInternal$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (updateConfigUseCase$updateConfigInternal$1.label) {
                    case 0:
                        kotlin.b.b(obj2);
                        updateConfigUseCase$updateConfigInternal$1.L$0 = mobTrigger;
                        updateConfigUseCase$updateConfigInternal$1.label = 1;
                        obj2 = cVar.a(updateConfigUseCase$updateConfigInternal$1);
                        break;
                    case 1:
                        mobTrigger = (MobTrigger) updateConfigUseCase$updateConfigInternal$1.L$0;
                        kotlin.b.b(obj2);
                        tm20 tm20Var6 = (tm20) obj2;
                        if (tm20Var6 == null) {
                            ny61.r("Default config is not presented!");
                            break;
                        } else {
                            String str4 = tm20Var6.a;
                            list = uVar.c;
                            com.yandex.mob.datastore.d dVar = uVar.b;
                            updateConfigUseCase$updateConfigInternal$1.L$0 = mobTrigger;
                            updateConfigUseCase$updateConfigInternal$1.L$1 = tm20Var6;
                            updateConfigUseCase$updateConfigInternal$1.L$2 = str4;
                            updateConfigUseCase$updateConfigInternal$1.L$3 = list;
                            updateConfigUseCase$updateConfigInternal$1.label = 2;
                            Object d = dVar.d(updateConfigUseCase$updateConfigInternal$1);
                            if (d != obj3) {
                                mobTrigger2 = mobTrigger;
                                tm20Var = tm20Var6;
                                str = str4;
                                obj2 = d;
                                String str5 = (String) obj2;
                                jpt jptVar = uVar.m;
                                updateConfigUseCase$updateConfigInternal$1.L$0 = mobTrigger2;
                                updateConfigUseCase$updateConfigInternal$1.L$1 = tm20Var;
                                updateConfigUseCase$updateConfigInternal$1.L$2 = str;
                                updateConfigUseCase$updateConfigInternal$1.L$3 = list;
                                updateConfigUseCase$updateConfigInternal$1.L$4 = str5;
                                updateConfigUseCase$updateConfigInternal$1.label = 3;
                                b = jptVar.a.a.b(updateConfigUseCase$updateConfigInternal$1);
                                if (b != obj3) {
                                    MobTrigger mobTrigger6 = mobTrigger2;
                                    tm20Var2 = tm20Var;
                                    str2 = str5;
                                    obj2 = b;
                                    mobTrigger3 = mobTrigger6;
                                    xm20 xm20Var2 = new xm20(str, str2, (String) obj2, list);
                                    updateConfigUseCase$updateConfigInternal$1.L$0 = mobTrigger3;
                                    updateConfigUseCase$updateConfigInternal$1.L$1 = tm20Var2;
                                    updateConfigUseCase$updateConfigInternal$1.L$2 = xm20Var2;
                                    updateConfigUseCase$updateConfigInternal$1.L$3 = rotVar4;
                                    updateConfigUseCase$updateConfigInternal$1.L$4 = null;
                                    updateConfigUseCase$updateConfigInternal$1.label = 4;
                                    obj2 = aVar.d(mobTrigger3, updateConfigUseCase$updateConfigInternal$1);
                                    if (obj2 != obj3) {
                                        rotVar = rotVar4;
                                        tm20Var3 = tm20Var2;
                                        mobTrigger4 = mobTrigger3;
                                        xm20Var = xm20Var2;
                                        rotVar.b((Pair) obj2);
                                        gp20 gp20Var = uVar.f;
                                        UpdateConfigUseCase$updateConfigInternal$response$1 updateConfigUseCase$updateConfigInternal$response$1 = new UpdateConfigUseCase$updateConfigInternal$response$1(uVar, xm20Var, null);
                                        updateConfigUseCase$updateConfigInternal$1.L$0 = mobTrigger4;
                                        updateConfigUseCase$updateConfigInternal$1.L$1 = tm20Var3;
                                        updateConfigUseCase$updateConfigInternal$1.L$2 = null;
                                        updateConfigUseCase$updateConfigInternal$1.L$3 = null;
                                        updateConfigUseCase$updateConfigInternal$1.label = 5;
                                        obj2 = gp20Var.a(updateConfigUseCase$updateConfigInternal$response$1, updateConfigUseCase$updateConfigInternal$1);
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    case 2:
                        List list2 = (List) updateConfigUseCase$updateConfigInternal$1.L$3;
                        String str6 = (String) updateConfigUseCase$updateConfigInternal$1.L$2;
                        tm20 tm20Var7 = (tm20) updateConfigUseCase$updateConfigInternal$1.L$1;
                        mobTrigger2 = (MobTrigger) updateConfigUseCase$updateConfigInternal$1.L$0;
                        kotlin.b.b(obj2);
                        list = list2;
                        tm20Var = tm20Var7;
                        str = str6;
                        String str52 = (String) obj2;
                        jpt jptVar2 = uVar.m;
                        updateConfigUseCase$updateConfigInternal$1.L$0 = mobTrigger2;
                        updateConfigUseCase$updateConfigInternal$1.L$1 = tm20Var;
                        updateConfigUseCase$updateConfigInternal$1.L$2 = str;
                        updateConfigUseCase$updateConfigInternal$1.L$3 = list;
                        updateConfigUseCase$updateConfigInternal$1.L$4 = str52;
                        updateConfigUseCase$updateConfigInternal$1.label = 3;
                        b = jptVar2.a.a.b(updateConfigUseCase$updateConfigInternal$1);
                        if (b != obj3) {
                        }
                        break;
                    case 3:
                        str2 = (String) updateConfigUseCase$updateConfigInternal$1.L$4;
                        list = (List) updateConfigUseCase$updateConfigInternal$1.L$3;
                        str = (String) updateConfigUseCase$updateConfigInternal$1.L$2;
                        tm20Var2 = (tm20) updateConfigUseCase$updateConfigInternal$1.L$1;
                        mobTrigger3 = (MobTrigger) updateConfigUseCase$updateConfigInternal$1.L$0;
                        kotlin.b.b(obj2);
                        xm20 xm20Var22 = new xm20(str, str2, (String) obj2, list);
                        updateConfigUseCase$updateConfigInternal$1.L$0 = mobTrigger3;
                        updateConfigUseCase$updateConfigInternal$1.L$1 = tm20Var2;
                        updateConfigUseCase$updateConfigInternal$1.L$2 = xm20Var22;
                        updateConfigUseCase$updateConfigInternal$1.L$3 = rotVar4;
                        updateConfigUseCase$updateConfigInternal$1.L$4 = null;
                        updateConfigUseCase$updateConfigInternal$1.label = 4;
                        obj2 = aVar.d(mobTrigger3, updateConfigUseCase$updateConfigInternal$1);
                        if (obj2 != obj3) {
                        }
                        break;
                    case 4:
                        rotVar = (rot) updateConfigUseCase$updateConfigInternal$1.L$3;
                        xm20Var = (xm20) updateConfigUseCase$updateConfigInternal$1.L$2;
                        tm20Var3 = (tm20) updateConfigUseCase$updateConfigInternal$1.L$1;
                        mobTrigger4 = (MobTrigger) updateConfigUseCase$updateConfigInternal$1.L$0;
                        kotlin.b.b(obj2);
                        rotVar.b((Pair) obj2);
                        gp20 gp20Var2 = uVar.f;
                        UpdateConfigUseCase$updateConfigInternal$response$1 updateConfigUseCase$updateConfigInternal$response$12 = new UpdateConfigUseCase$updateConfigInternal$response$1(uVar, xm20Var, null);
                        updateConfigUseCase$updateConfigInternal$1.L$0 = mobTrigger4;
                        updateConfigUseCase$updateConfigInternal$1.L$1 = tm20Var3;
                        updateConfigUseCase$updateConfigInternal$1.L$2 = null;
                        updateConfigUseCase$updateConfigInternal$1.L$3 = null;
                        updateConfigUseCase$updateConfigInternal$1.label = 5;
                        obj2 = gp20Var2.a(updateConfigUseCase$updateConfigInternal$response$12, updateConfigUseCase$updateConfigInternal$1);
                        break;
                    case 5:
                        tm20 tm20Var8 = (tm20) updateConfigUseCase$updateConfigInternal$1.L$1;
                        MobTrigger mobTrigger7 = (MobTrigger) updateConfigUseCase$updateConfigInternal$1.L$0;
                        kotlin.b.b(obj2);
                        tm20Var3 = tm20Var8;
                        mobTrigger4 = mobTrigger7;
                        xl20Var = (xl20) obj2;
                        if (!(xl20Var instanceof ll20) && !(xl20Var instanceof tl20) && !(xl20Var instanceof ep20)) {
                            if (!(xl20Var instanceof zp20)) {
                                w511.b();
                                break;
                            } else {
                                String message = ((zp20) xl20Var).a().getMessage();
                                if (message == null) {
                                    message = "Config parsing error!";
                                }
                                updateConfigUseCase$updateConfigInternal$1.L$0 = mobTrigger4;
                                updateConfigUseCase$updateConfigInternal$1.L$1 = tm20Var3;
                                updateConfigUseCase$updateConfigInternal$1.L$2 = null;
                                updateConfigUseCase$updateConfigInternal$1.L$3 = xl20Var;
                                updateConfigUseCase$updateConfigInternal$1.L$4 = xl20Var;
                                updateConfigUseCase$updateConfigInternal$1.L$5 = null;
                                updateConfigUseCase$updateConfigInternal$1.L$6 = rotVar4;
                                updateConfigUseCase$updateConfigInternal$1.I$0 = 0;
                                updateConfigUseCase$updateConfigInternal$1.I$1 = 0;
                                updateConfigUseCase$updateConfigInternal$1.label = 6;
                                obj2 = aVar.q(message, updateConfigUseCase$updateConfigInternal$1);
                                if (obj2 != obj3) {
                                    rotVar2 = rotVar4;
                                    rotVar2.b((Pair) obj2);
                                }
                            }
                        }
                        if (!(xl20Var instanceof ll20)) {
                            if (!(xl20Var instanceof tl20)) {
                                if (!(xl20Var instanceof ep20) && !(xl20Var instanceof zp20)) {
                                    w511.b();
                                    break;
                                }
                            } else {
                                obj = ((tl20) xl20Var).a;
                                tm20Var4 = (tm20) obj;
                                if (tm20Var4 != null) {
                                    vy21 vy21Var = uVar.l;
                                    vy21Var.getClass();
                                    List s = kotlin.sequences.b.s(new yw01(kotlin.sequences.b.g(new yw01(new h73(1, tm20Var4.c), new ate0(27, vy21Var)), new ceu0(20)), new ceu0(21)));
                                    if (!s.isEmpty()) {
                                        String str7 = tm20Var4.a;
                                        updateConfigUseCase$updateConfigInternal$1.L$0 = null;
                                        updateConfigUseCase$updateConfigInternal$1.L$1 = null;
                                        updateConfigUseCase$updateConfigInternal$1.L$2 = null;
                                        updateConfigUseCase$updateConfigInternal$1.L$3 = null;
                                        updateConfigUseCase$updateConfigInternal$1.L$4 = null;
                                        updateConfigUseCase$updateConfigInternal$1.L$5 = null;
                                        updateConfigUseCase$updateConfigInternal$1.L$6 = rotVar4;
                                        updateConfigUseCase$updateConfigInternal$1.label = 7;
                                        obj2 = aVar.p(str7, s, updateConfigUseCase$updateConfigInternal$1);
                                        break;
                                    } else {
                                        updateConfigUseCase$updateConfigInternal$1.L$0 = mobTrigger4;
                                        updateConfigUseCase$updateConfigInternal$1.L$1 = tm20Var3;
                                        updateConfigUseCase$updateConfigInternal$1.L$2 = null;
                                        updateConfigUseCase$updateConfigInternal$1.L$3 = null;
                                        updateConfigUseCase$updateConfigInternal$1.L$4 = null;
                                        updateConfigUseCase$updateConfigInternal$1.L$5 = null;
                                        updateConfigUseCase$updateConfigInternal$1.L$6 = null;
                                        updateConfigUseCase$updateConfigInternal$1.label = 8;
                                        if (cVar.b(tm20Var4, updateConfigUseCase$updateConfigInternal$1) != obj3) {
                                            tm20Var5 = tm20Var3;
                                            mobTrigger5 = mobTrigger4;
                                            d dVar2 = uVar.k;
                                            updateConfigUseCase$updateConfigInternal$1.L$0 = null;
                                            updateConfigUseCase$updateConfigInternal$1.L$1 = tm20Var5;
                                            updateConfigUseCase$updateConfigInternal$1.L$2 = null;
                                            updateConfigUseCase$updateConfigInternal$1.L$3 = null;
                                            updateConfigUseCase$updateConfigInternal$1.L$4 = null;
                                            updateConfigUseCase$updateConfigInternal$1.L$5 = null;
                                            updateConfigUseCase$updateConfigInternal$1.label = 9;
                                            break;
                                        }
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                        obj = null;
                        tm20Var4 = (tm20) obj;
                        if (tm20Var4 != null) {
                        }
                        break;
                    case 6:
                        rotVar2 = (rot) updateConfigUseCase$updateConfigInternal$1.L$6;
                        xl20Var = (xl20) updateConfigUseCase$updateConfigInternal$1.L$3;
                        tm20Var3 = (tm20) updateConfigUseCase$updateConfigInternal$1.L$1;
                        mobTrigger4 = (MobTrigger) updateConfigUseCase$updateConfigInternal$1.L$0;
                        kotlin.b.b(obj2);
                        rotVar2.b((Pair) obj2);
                        if (!(xl20Var instanceof ll20)) {
                        }
                        obj = null;
                        tm20Var4 = (tm20) obj;
                        if (tm20Var4 != null) {
                        }
                        break;
                    case 7:
                        rotVar4 = (rot) updateConfigUseCase$updateConfigInternal$1.L$6;
                        kotlin.b.b(obj2);
                        rotVar4.b((Pair) obj2);
                        break;
                    case 8:
                        tm20Var5 = (tm20) updateConfigUseCase$updateConfigInternal$1.L$1;
                        mobTrigger5 = (MobTrigger) updateConfigUseCase$updateConfigInternal$1.L$0;
                        kotlin.b.b(obj2);
                        d dVar22 = uVar.k;
                        updateConfigUseCase$updateConfigInternal$1.L$0 = null;
                        updateConfigUseCase$updateConfigInternal$1.L$1 = tm20Var5;
                        updateConfigUseCase$updateConfigInternal$1.L$2 = null;
                        updateConfigUseCase$updateConfigInternal$1.L$3 = null;
                        updateConfigUseCase$updateConfigInternal$1.L$4 = null;
                        updateConfigUseCase$updateConfigInternal$1.L$5 = null;
                        updateConfigUseCase$updateConfigInternal$1.label = 9;
                        break;
                    case 9:
                        tm20Var5 = (tm20) updateConfigUseCase$updateConfigInternal$1.L$1;
                        kotlin.b.b(obj2);
                        String str8 = tm20Var5.a;
                        com.yandex.mob.datastore.f fVar = uVar.j;
                        updateConfigUseCase$updateConfigInternal$1.L$0 = null;
                        updateConfigUseCase$updateConfigInternal$1.L$1 = null;
                        updateConfigUseCase$updateConfigInternal$1.L$2 = null;
                        updateConfigUseCase$updateConfigInternal$1.L$3 = null;
                        updateConfigUseCase$updateConfigInternal$1.L$4 = null;
                        updateConfigUseCase$updateConfigInternal$1.L$5 = null;
                        updateConfigUseCase$updateConfigInternal$1.L$6 = rotVar4;
                        updateConfigUseCase$updateConfigInternal$1.L$7 = aVar;
                        updateConfigUseCase$updateConfigInternal$1.L$8 = str8;
                        updateConfigUseCase$updateConfigInternal$1.label = 10;
                        obj2 = fVar.b(updateConfigUseCase$updateConfigInternal$1);
                        if (obj2 != obj3) {
                            str3 = str8;
                            updateConfigUseCase$updateConfigInternal$1.L$0 = null;
                            updateConfigUseCase$updateConfigInternal$1.L$1 = null;
                            updateConfigUseCase$updateConfigInternal$1.L$2 = null;
                            updateConfigUseCase$updateConfigInternal$1.L$3 = null;
                            updateConfigUseCase$updateConfigInternal$1.L$4 = null;
                            updateConfigUseCase$updateConfigInternal$1.L$5 = null;
                            updateConfigUseCase$updateConfigInternal$1.L$6 = rotVar4;
                            updateConfigUseCase$updateConfigInternal$1.L$7 = null;
                            updateConfigUseCase$updateConfigInternal$1.L$8 = null;
                            updateConfigUseCase$updateConfigInternal$1.label = 11;
                            obj2 = aVar.o(str3, (List) obj2, updateConfigUseCase$updateConfigInternal$1);
                            if (obj2 != obj3) {
                                rotVar3 = rotVar4;
                                rotVar3.b((Pair) obj2);
                                break;
                            }
                        }
                        break;
                    case 10:
                        str3 = (String) updateConfigUseCase$updateConfigInternal$1.L$8;
                        aVar = (com.yandex.mob.reporting.a) updateConfigUseCase$updateConfigInternal$1.L$7;
                        rotVar4 = (rot) updateConfigUseCase$updateConfigInternal$1.L$6;
                        kotlin.b.b(obj2);
                        updateConfigUseCase$updateConfigInternal$1.L$0 = null;
                        updateConfigUseCase$updateConfigInternal$1.L$1 = null;
                        updateConfigUseCase$updateConfigInternal$1.L$2 = null;
                        updateConfigUseCase$updateConfigInternal$1.L$3 = null;
                        updateConfigUseCase$updateConfigInternal$1.L$4 = null;
                        updateConfigUseCase$updateConfigInternal$1.L$5 = null;
                        updateConfigUseCase$updateConfigInternal$1.L$6 = rotVar4;
                        updateConfigUseCase$updateConfigInternal$1.L$7 = null;
                        updateConfigUseCase$updateConfigInternal$1.L$8 = null;
                        updateConfigUseCase$updateConfigInternal$1.label = 11;
                        obj2 = aVar.o(str3, (List) obj2, updateConfigUseCase$updateConfigInternal$1);
                        if (obj2 != obj3) {
                        }
                        break;
                    case 11:
                        rotVar3 = (rot) updateConfigUseCase$updateConfigInternal$1.L$6;
                        kotlin.b.b(obj2);
                        rotVar3.b((Pair) obj2);
                        break;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        break;
                }
                return null;
            }
        }
        updateConfigUseCase$updateConfigInternal$1 = new UpdateConfigUseCase$updateConfigInternal$1(uVar, continuationImpl);
        Object obj22 = updateConfigUseCase$updateConfigInternal$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (updateConfigUseCase$updateConfigInternal$1.label) {
        }
        return null;
    }

    public final void b() {
        this.e.e(new UpdateConfigUseCase$init$1(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(MobTrigger mobTrigger, ContinuationImpl continuationImpl) {
        UpdateConfigUseCase$invoke$1 updateConfigUseCase$invoke$1;
        int i;
        Object f;
        if (continuationImpl instanceof UpdateConfigUseCase$invoke$1) {
            updateConfigUseCase$invoke$1 = (UpdateConfigUseCase$invoke$1) continuationImpl;
            int i2 = updateConfigUseCase$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                updateConfigUseCase$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = updateConfigUseCase$invoke$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = updateConfigUseCase$invoke$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    UpdateConfigUseCase$invoke$2 updateConfigUseCase$invoke$2 = new UpdateConfigUseCase$invoke$2(this, mobTrigger, null);
                    updateConfigUseCase$invoke$1.L$0 = null;
                    updateConfigUseCase$invoke$1.label = 1;
                    f = this.e.f(mobTrigger, updateConfigUseCase$invoke$2, updateConfigUseCase$invoke$1);
                    if (f == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    f = ((Result) obj).getValue();
                }
                return !(f instanceof Result.Failure) ? Boolean.FALSE : f;
            }
        }
        updateConfigUseCase$invoke$1 = new UpdateConfigUseCase$invoke$1(this, continuationImpl);
        Object obj2 = updateConfigUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = updateConfigUseCase$invoke$1.label;
        if (i != 0) {
        }
        if (!(f instanceof Result.Failure)) {
        }
    }
}
