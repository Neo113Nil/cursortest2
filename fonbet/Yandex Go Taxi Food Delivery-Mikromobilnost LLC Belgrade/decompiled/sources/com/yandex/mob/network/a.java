package com.yandex.mob.network;

import com.yandex.mob.datastore.f;
import com.yandex.mob.domain.d;
import com.yandex.mob.domain.l;
import com.yandex.mob.reporting.MobTrigger;
import defpackage.bms;
import defpackage.c1k0;
import defpackage.ep20;
import defpackage.go20;
import defpackage.gp20;
import defpackage.ll20;
import defpackage.ny61;
import defpackage.oq20;
import defpackage.pr20;
import defpackage.rzo;
import defpackage.scc;
import defpackage.tl20;
import defpackage.tm20;
import defpackage.vmb1;
import defpackage.w511;
import defpackage.x0k0;
import defpackage.xl20;
import defpackage.z0k0;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class a implements gp20 {
    public final d a;
    public final f b;
    public final l c;

    public a(d dVar, f fVar, l lVar) {
        this.a = dVar;
        this.b = fVar;
        this.c = lVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x012c, code lost:
    
        if (r4 == r3) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0293 -> B:12:0x0299). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x02ce -> B:40:0x00e5). Please report as a decompilation issue!!! */
    @Override // defpackage.gp20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(bms bmsVar, ContinuationImpl continuationImpl) {
        MobRetryNetworkRequestProcessor$process$1 mobRetryNetworkRequestProcessor$process$1;
        int i;
        bms bmsVar2;
        Object b;
        pr20 pr20Var;
        bms bmsVar3;
        tm20 tm20Var;
        bms bmsVar4;
        int i2;
        int i3;
        pr20 pr20Var2;
        int i4;
        int i5;
        int i6;
        tm20 tm20Var2;
        pr20 pr20Var3;
        bms bmsVar5;
        String str;
        xl20 xl20Var;
        Object obj;
        bms bmsVar6;
        z0k0 z0k0Var;
        boolean z;
        Object invoke;
        tm20 tm20Var3;
        bms bmsVar7;
        int i7;
        int i8;
        MobRetryNetworkRequestProcessor$process$1 mobRetryNetworkRequestProcessor$process$12;
        pr20 pr20Var4;
        tm20 tm20Var4;
        int i9;
        int i10;
        int i11;
        pr20 pr20Var5;
        bms bmsVar8;
        String str2;
        tm20 tm20Var5;
        xl20 xl20Var2;
        z0k0 z0k0Var2;
        Object invoke2;
        if (continuationImpl instanceof MobRetryNetworkRequestProcessor$process$1) {
            mobRetryNetworkRequestProcessor$process$1 = (MobRetryNetworkRequestProcessor$process$1) continuationImpl;
            int i12 = mobRetryNetworkRequestProcessor$process$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                mobRetryNetworkRequestProcessor$process$1.label = i12 - Integer.MIN_VALUE;
                Object obj2 = mobRetryNetworkRequestProcessor$process$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobRetryNetworkRequestProcessor$process$1.label;
                z0k0 z0k0Var3 = z0k0.a;
                String str3 = "mobcf";
                switch (i) {
                    case 0:
                        kotlin.b.b(obj2);
                        bmsVar2 = bmsVar;
                        mobRetryNetworkRequestProcessor$process$1.L$0 = bmsVar2;
                        mobRetryNetworkRequestProcessor$process$1.label = 1;
                        b = b(mobRetryNetworkRequestProcessor$process$1);
                        break;
                    case 1:
                        bms bmsVar9 = (bms) mobRetryNetworkRequestProcessor$process$1.L$0;
                        kotlin.b.b(obj2);
                        b = obj2;
                        bmsVar2 = bmsVar9;
                        pr20Var = (pr20) b;
                        mobRetryNetworkRequestProcessor$process$1.L$0 = bmsVar2;
                        mobRetryNetworkRequestProcessor$process$1.L$1 = pr20Var;
                        mobRetryNetworkRequestProcessor$process$1.label = 2;
                        Object d = this.c.d(mobRetryNetworkRequestProcessor$process$1);
                        if (d != obj3) {
                            bmsVar3 = bmsVar2;
                            obj2 = d;
                            tm20Var = (tm20) obj2;
                            bmsVar4 = bmsVar3;
                            i2 = 0;
                            i3 = 0;
                            pr20Var2 = pr20Var;
                            i4 = 0;
                            kotlinx.coroutines.a.k(mobRetryNetworkRequestProcessor$process$1.get_context());
                            go20 j = rzo.j(i2, i4);
                            str = str3;
                            oq20 oq20Var = new oq20(scc.g(new Pair(str3, tm20Var.a), new Pair("mobpr", pr20Var2.a.b)));
                            mobRetryNetworkRequestProcessor$process$1.L$0 = bmsVar4;
                            mobRetryNetworkRequestProcessor$process$1.L$1 = pr20Var2;
                            mobRetryNetworkRequestProcessor$process$1.L$2 = tm20Var;
                            mobRetryNetworkRequestProcessor$process$1.L$3 = null;
                            mobRetryNetworkRequestProcessor$process$1.L$4 = null;
                            mobRetryNetworkRequestProcessor$process$1.I$0 = i3;
                            mobRetryNetworkRequestProcessor$process$1.I$1 = i2;
                            mobRetryNetworkRequestProcessor$process$1.I$2 = i4;
                            mobRetryNetworkRequestProcessor$process$1.I$3 = 0;
                            mobRetryNetworkRequestProcessor$process$1.label = 3;
                            invoke = bmsVar4.invoke(pr20Var2, j, oq20Var, mobRetryNetworkRequestProcessor$process$1);
                            if (invoke != obj3) {
                                int i13 = i3;
                                pr20Var3 = pr20Var2;
                                i5 = i2;
                                i6 = i13;
                                bmsVar5 = bmsVar4;
                                tm20Var2 = tm20Var;
                                obj2 = invoke;
                                xl20Var = (xl20) obj2;
                                if (!(xl20Var instanceof tl20)) {
                                    if (xl20Var instanceof ll20) {
                                        i4 = ((ll20) xl20Var).a;
                                    }
                                    int i14 = i5 + 1;
                                    c1k0 b2 = vmb1.b(xl20Var, i5);
                                    if (!b2.equals(z0k0Var3)) {
                                        z0k0Var = z0k0Var3;
                                        z = true;
                                        if (!(b2 instanceof x0k0)) {
                                            w511.b();
                                            break;
                                        } else {
                                            long a = ((x0k0) b2).a();
                                            mobRetryNetworkRequestProcessor$process$1.L$0 = bmsVar5;
                                            mobRetryNetworkRequestProcessor$process$1.L$1 = pr20Var3;
                                            mobRetryNetworkRequestProcessor$process$1.L$2 = tm20Var2;
                                            mobRetryNetworkRequestProcessor$process$1.L$3 = null;
                                            mobRetryNetworkRequestProcessor$process$1.L$4 = null;
                                            mobRetryNetworkRequestProcessor$process$1.I$0 = i6;
                                            mobRetryNetworkRequestProcessor$process$1.I$1 = i14;
                                            mobRetryNetworkRequestProcessor$process$1.I$2 = i4;
                                            mobRetryNetworkRequestProcessor$process$1.label = 4;
                                            if (kotlinx.coroutines.a.i(a, mobRetryNetworkRequestProcessor$process$1) != obj3) {
                                                pr20Var2 = pr20Var3;
                                                i3 = i6;
                                                i2 = i14;
                                                tm20Var = tm20Var2;
                                                bmsVar4 = bmsVar5;
                                                z0k0Var3 = z0k0Var;
                                                str3 = str;
                                                kotlinx.coroutines.a.k(mobRetryNetworkRequestProcessor$process$1.get_context());
                                                go20 j2 = rzo.j(i2, i4);
                                                str = str3;
                                                oq20 oq20Var2 = new oq20(scc.g(new Pair(str3, tm20Var.a), new Pair("mobpr", pr20Var2.a.b)));
                                                mobRetryNetworkRequestProcessor$process$1.L$0 = bmsVar4;
                                                mobRetryNetworkRequestProcessor$process$1.L$1 = pr20Var2;
                                                mobRetryNetworkRequestProcessor$process$1.L$2 = tm20Var;
                                                mobRetryNetworkRequestProcessor$process$1.L$3 = null;
                                                mobRetryNetworkRequestProcessor$process$1.L$4 = null;
                                                mobRetryNetworkRequestProcessor$process$1.I$0 = i3;
                                                mobRetryNetworkRequestProcessor$process$1.I$1 = i2;
                                                mobRetryNetworkRequestProcessor$process$1.I$2 = i4;
                                                mobRetryNetworkRequestProcessor$process$1.I$3 = 0;
                                                mobRetryNetworkRequestProcessor$process$1.label = 3;
                                                invoke = bmsVar4.invoke(pr20Var2, j2, oq20Var2, mobRetryNetworkRequestProcessor$process$1);
                                                if (invoke != obj3) {
                                                }
                                            }
                                        }
                                    }
                                }
                                if (!(xl20Var instanceof ep20)) {
                                    MobTrigger mobTrigger = MobTrigger.RequestRetry;
                                    mobRetryNetworkRequestProcessor$process$1.L$0 = bmsVar5;
                                    obj = null;
                                    mobRetryNetworkRequestProcessor$process$1.L$1 = null;
                                    mobRetryNetworkRequestProcessor$process$1.L$2 = tm20Var2;
                                    mobRetryNetworkRequestProcessor$process$1.L$3 = null;
                                    mobRetryNetworkRequestProcessor$process$1.label = 5;
                                    if (this.a.c(mobTrigger, true, true, mobRetryNetworkRequestProcessor$process$1) != obj3) {
                                        bmsVar6 = bmsVar5;
                                        mobRetryNetworkRequestProcessor$process$1.L$0 = bmsVar6;
                                        mobRetryNetworkRequestProcessor$process$1.L$1 = obj;
                                        mobRetryNetworkRequestProcessor$process$1.L$2 = tm20Var2;
                                        mobRetryNetworkRequestProcessor$process$1.L$3 = obj;
                                        mobRetryNetworkRequestProcessor$process$1.label = 6;
                                        obj2 = b(mobRetryNetworkRequestProcessor$process$1);
                                        if (obj2 != obj3) {
                                            tm20Var3 = tm20Var2;
                                            bmsVar7 = bmsVar6;
                                            i7 = 0;
                                            i8 = 0;
                                            mobRetryNetworkRequestProcessor$process$12 = mobRetryNetworkRequestProcessor$process$1;
                                            pr20Var4 = (pr20) obj2;
                                            tm20Var4 = tm20Var3;
                                            i9 = 0;
                                            kotlinx.coroutines.a.k(mobRetryNetworkRequestProcessor$process$12.get_context());
                                            go20 j3 = rzo.j(i7, i9);
                                            str2 = str;
                                            oq20 oq20Var3 = new oq20(scc.g(new Pair(str2, tm20Var4.a), new Pair("mobpr", pr20Var4.a.b)));
                                            mobRetryNetworkRequestProcessor$process$12.L$0 = bmsVar7;
                                            mobRetryNetworkRequestProcessor$process$12.L$1 = null;
                                            mobRetryNetworkRequestProcessor$process$12.L$2 = tm20Var4;
                                            mobRetryNetworkRequestProcessor$process$12.L$3 = null;
                                            mobRetryNetworkRequestProcessor$process$12.L$4 = pr20Var4;
                                            mobRetryNetworkRequestProcessor$process$12.L$5 = null;
                                            mobRetryNetworkRequestProcessor$process$12.L$6 = null;
                                            mobRetryNetworkRequestProcessor$process$12.I$0 = i8;
                                            mobRetryNetworkRequestProcessor$process$12.I$1 = i7;
                                            mobRetryNetworkRequestProcessor$process$12.I$2 = i9;
                                            mobRetryNetworkRequestProcessor$process$12.I$3 = 0;
                                            mobRetryNetworkRequestProcessor$process$12.label = 7;
                                            invoke2 = bmsVar7.invoke(pr20Var4, j3, oq20Var3, mobRetryNetworkRequestProcessor$process$12);
                                            if (invoke2 != obj3) {
                                                pr20Var5 = pr20Var4;
                                                mobRetryNetworkRequestProcessor$process$1 = mobRetryNetworkRequestProcessor$process$12;
                                                i10 = i7;
                                                bmsVar8 = bmsVar7;
                                                i11 = i8;
                                                tm20Var5 = tm20Var4;
                                                obj2 = invoke2;
                                                xl20Var2 = (xl20) obj2;
                                                if (!(xl20Var2 instanceof tl20)) {
                                                    if (xl20Var2 instanceof ll20) {
                                                        i9 = ((ll20) xl20Var2).a;
                                                    }
                                                    int i15 = i10 + 1;
                                                    c1k0 b3 = vmb1.b(xl20Var2, i10);
                                                    if (!b3.equals(z0k0Var3)) {
                                                        if (!(b3 instanceof x0k0)) {
                                                            w511.b();
                                                            break;
                                                        } else {
                                                            z0k0Var2 = z0k0Var3;
                                                            long a2 = ((x0k0) b3).a();
                                                            mobRetryNetworkRequestProcessor$process$1.L$0 = bmsVar8;
                                                            mobRetryNetworkRequestProcessor$process$1.L$1 = null;
                                                            mobRetryNetworkRequestProcessor$process$1.L$2 = tm20Var5;
                                                            mobRetryNetworkRequestProcessor$process$1.L$3 = null;
                                                            mobRetryNetworkRequestProcessor$process$1.L$4 = pr20Var5;
                                                            mobRetryNetworkRequestProcessor$process$1.L$5 = null;
                                                            mobRetryNetworkRequestProcessor$process$1.L$6 = null;
                                                            mobRetryNetworkRequestProcessor$process$1.I$0 = i11;
                                                            mobRetryNetworkRequestProcessor$process$1.I$1 = i15;
                                                            mobRetryNetworkRequestProcessor$process$1.I$2 = i9;
                                                            mobRetryNetworkRequestProcessor$process$1.label = 8;
                                                            if (kotlinx.coroutines.a.i(a2, mobRetryNetworkRequestProcessor$process$1) != obj3) {
                                                                tm20Var4 = tm20Var5;
                                                                i7 = i15;
                                                                mobRetryNetworkRequestProcessor$process$12 = mobRetryNetworkRequestProcessor$process$1;
                                                                pr20Var4 = pr20Var5;
                                                                i8 = i11;
                                                                bmsVar7 = bmsVar8;
                                                                z0k0Var3 = z0k0Var2;
                                                                str = str2;
                                                                kotlinx.coroutines.a.k(mobRetryNetworkRequestProcessor$process$12.get_context());
                                                                go20 j32 = rzo.j(i7, i9);
                                                                str2 = str;
                                                                oq20 oq20Var32 = new oq20(scc.g(new Pair(str2, tm20Var4.a), new Pair("mobpr", pr20Var4.a.b)));
                                                                mobRetryNetworkRequestProcessor$process$12.L$0 = bmsVar7;
                                                                mobRetryNetworkRequestProcessor$process$12.L$1 = null;
                                                                mobRetryNetworkRequestProcessor$process$12.L$2 = tm20Var4;
                                                                mobRetryNetworkRequestProcessor$process$12.L$3 = null;
                                                                mobRetryNetworkRequestProcessor$process$12.L$4 = pr20Var4;
                                                                mobRetryNetworkRequestProcessor$process$12.L$5 = null;
                                                                mobRetryNetworkRequestProcessor$process$12.L$6 = null;
                                                                mobRetryNetworkRequestProcessor$process$12.I$0 = i8;
                                                                mobRetryNetworkRequestProcessor$process$12.I$1 = i7;
                                                                mobRetryNetworkRequestProcessor$process$12.I$2 = i9;
                                                                mobRetryNetworkRequestProcessor$process$12.I$3 = 0;
                                                                mobRetryNetworkRequestProcessor$process$12.label = 7;
                                                                invoke2 = bmsVar7.invoke(pr20Var4, j32, oq20Var32, mobRetryNetworkRequestProcessor$process$12);
                                                                if (invoke2 != obj3) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    case 2:
                        pr20Var = (pr20) mobRetryNetworkRequestProcessor$process$1.L$1;
                        bmsVar3 = (bms) mobRetryNetworkRequestProcessor$process$1.L$0;
                        kotlin.b.b(obj2);
                        tm20Var = (tm20) obj2;
                        bmsVar4 = bmsVar3;
                        i2 = 0;
                        i3 = 0;
                        pr20Var2 = pr20Var;
                        i4 = 0;
                        kotlinx.coroutines.a.k(mobRetryNetworkRequestProcessor$process$1.get_context());
                        go20 j22 = rzo.j(i2, i4);
                        str = str3;
                        oq20 oq20Var22 = new oq20(scc.g(new Pair(str3, tm20Var.a), new Pair("mobpr", pr20Var2.a.b)));
                        mobRetryNetworkRequestProcessor$process$1.L$0 = bmsVar4;
                        mobRetryNetworkRequestProcessor$process$1.L$1 = pr20Var2;
                        mobRetryNetworkRequestProcessor$process$1.L$2 = tm20Var;
                        mobRetryNetworkRequestProcessor$process$1.L$3 = null;
                        mobRetryNetworkRequestProcessor$process$1.L$4 = null;
                        mobRetryNetworkRequestProcessor$process$1.I$0 = i3;
                        mobRetryNetworkRequestProcessor$process$1.I$1 = i2;
                        mobRetryNetworkRequestProcessor$process$1.I$2 = i4;
                        mobRetryNetworkRequestProcessor$process$1.I$3 = 0;
                        mobRetryNetworkRequestProcessor$process$1.label = 3;
                        invoke = bmsVar4.invoke(pr20Var2, j22, oq20Var22, mobRetryNetworkRequestProcessor$process$1);
                        if (invoke != obj3) {
                        }
                        break;
                    case 3:
                        i4 = mobRetryNetworkRequestProcessor$process$1.I$2;
                        i5 = mobRetryNetworkRequestProcessor$process$1.I$1;
                        i6 = mobRetryNetworkRequestProcessor$process$1.I$0;
                        tm20Var2 = (tm20) mobRetryNetworkRequestProcessor$process$1.L$2;
                        pr20Var3 = (pr20) mobRetryNetworkRequestProcessor$process$1.L$1;
                        bmsVar5 = (bms) mobRetryNetworkRequestProcessor$process$1.L$0;
                        kotlin.b.b(obj2);
                        str = "mobcf";
                        xl20Var = (xl20) obj2;
                        if (!(xl20Var instanceof tl20)) {
                        }
                        if (!(xl20Var instanceof ep20)) {
                        }
                        break;
                    case 4:
                        i4 = mobRetryNetworkRequestProcessor$process$1.I$2;
                        int i16 = mobRetryNetworkRequestProcessor$process$1.I$1;
                        int i17 = mobRetryNetworkRequestProcessor$process$1.I$0;
                        tm20Var2 = (tm20) mobRetryNetworkRequestProcessor$process$1.L$2;
                        pr20 pr20Var6 = (pr20) mobRetryNetworkRequestProcessor$process$1.L$1;
                        bmsVar5 = (bms) mobRetryNetworkRequestProcessor$process$1.L$0;
                        kotlin.b.b(obj2);
                        i2 = i16;
                        pr20Var2 = pr20Var6;
                        i3 = i17;
                        z0k0Var = z0k0Var3;
                        str = "mobcf";
                        z = true;
                        tm20Var = tm20Var2;
                        bmsVar4 = bmsVar5;
                        z0k0Var3 = z0k0Var;
                        str3 = str;
                        kotlinx.coroutines.a.k(mobRetryNetworkRequestProcessor$process$1.get_context());
                        go20 j222 = rzo.j(i2, i4);
                        str = str3;
                        oq20 oq20Var222 = new oq20(scc.g(new Pair(str3, tm20Var.a), new Pair("mobpr", pr20Var2.a.b)));
                        mobRetryNetworkRequestProcessor$process$1.L$0 = bmsVar4;
                        mobRetryNetworkRequestProcessor$process$1.L$1 = pr20Var2;
                        mobRetryNetworkRequestProcessor$process$1.L$2 = tm20Var;
                        mobRetryNetworkRequestProcessor$process$1.L$3 = null;
                        mobRetryNetworkRequestProcessor$process$1.L$4 = null;
                        mobRetryNetworkRequestProcessor$process$1.I$0 = i3;
                        mobRetryNetworkRequestProcessor$process$1.I$1 = i2;
                        mobRetryNetworkRequestProcessor$process$1.I$2 = i4;
                        mobRetryNetworkRequestProcessor$process$1.I$3 = 0;
                        mobRetryNetworkRequestProcessor$process$1.label = 3;
                        invoke = bmsVar4.invoke(pr20Var2, j222, oq20Var222, mobRetryNetworkRequestProcessor$process$1);
                        if (invoke != obj3) {
                        }
                        break;
                    case 5:
                        tm20 tm20Var6 = (tm20) mobRetryNetworkRequestProcessor$process$1.L$2;
                        bms bmsVar10 = (bms) mobRetryNetworkRequestProcessor$process$1.L$0;
                        kotlin.b.b(obj2);
                        tm20Var2 = tm20Var6;
                        str = "mobcf";
                        bmsVar6 = bmsVar10;
                        obj = null;
                        mobRetryNetworkRequestProcessor$process$1.L$0 = bmsVar6;
                        mobRetryNetworkRequestProcessor$process$1.L$1 = obj;
                        mobRetryNetworkRequestProcessor$process$1.L$2 = tm20Var2;
                        mobRetryNetworkRequestProcessor$process$1.L$3 = obj;
                        mobRetryNetworkRequestProcessor$process$1.label = 6;
                        obj2 = b(mobRetryNetworkRequestProcessor$process$1);
                        if (obj2 != obj3) {
                        }
                        break;
                    case 6:
                        tm20Var3 = (tm20) mobRetryNetworkRequestProcessor$process$1.L$2;
                        bmsVar6 = (bms) mobRetryNetworkRequestProcessor$process$1.L$0;
                        kotlin.b.b(obj2);
                        str = "mobcf";
                        bmsVar7 = bmsVar6;
                        i7 = 0;
                        i8 = 0;
                        mobRetryNetworkRequestProcessor$process$12 = mobRetryNetworkRequestProcessor$process$1;
                        pr20Var4 = (pr20) obj2;
                        tm20Var4 = tm20Var3;
                        i9 = 0;
                        kotlinx.coroutines.a.k(mobRetryNetworkRequestProcessor$process$12.get_context());
                        go20 j322 = rzo.j(i7, i9);
                        str2 = str;
                        oq20 oq20Var322 = new oq20(scc.g(new Pair(str2, tm20Var4.a), new Pair("mobpr", pr20Var4.a.b)));
                        mobRetryNetworkRequestProcessor$process$12.L$0 = bmsVar7;
                        mobRetryNetworkRequestProcessor$process$12.L$1 = null;
                        mobRetryNetworkRequestProcessor$process$12.L$2 = tm20Var4;
                        mobRetryNetworkRequestProcessor$process$12.L$3 = null;
                        mobRetryNetworkRequestProcessor$process$12.L$4 = pr20Var4;
                        mobRetryNetworkRequestProcessor$process$12.L$5 = null;
                        mobRetryNetworkRequestProcessor$process$12.L$6 = null;
                        mobRetryNetworkRequestProcessor$process$12.I$0 = i8;
                        mobRetryNetworkRequestProcessor$process$12.I$1 = i7;
                        mobRetryNetworkRequestProcessor$process$12.I$2 = i9;
                        mobRetryNetworkRequestProcessor$process$12.I$3 = 0;
                        mobRetryNetworkRequestProcessor$process$12.label = 7;
                        invoke2 = bmsVar7.invoke(pr20Var4, j322, oq20Var322, mobRetryNetworkRequestProcessor$process$12);
                        if (invoke2 != obj3) {
                        }
                        break;
                    case 7:
                        i9 = mobRetryNetworkRequestProcessor$process$1.I$2;
                        i10 = mobRetryNetworkRequestProcessor$process$1.I$1;
                        i11 = mobRetryNetworkRequestProcessor$process$1.I$0;
                        pr20Var5 = (pr20) mobRetryNetworkRequestProcessor$process$1.L$4;
                        tm20 tm20Var7 = (tm20) mobRetryNetworkRequestProcessor$process$1.L$2;
                        bmsVar8 = (bms) mobRetryNetworkRequestProcessor$process$1.L$0;
                        kotlin.b.b(obj2);
                        str2 = "mobcf";
                        tm20Var5 = tm20Var7;
                        xl20Var2 = (xl20) obj2;
                        if (!(xl20Var2 instanceof tl20)) {
                        }
                        break;
                    case 8:
                        i9 = mobRetryNetworkRequestProcessor$process$1.I$2;
                        int i18 = mobRetryNetworkRequestProcessor$process$1.I$1;
                        int i19 = mobRetryNetworkRequestProcessor$process$1.I$0;
                        pr20 pr20Var7 = (pr20) mobRetryNetworkRequestProcessor$process$1.L$4;
                        tm20 tm20Var8 = (tm20) mobRetryNetworkRequestProcessor$process$1.L$2;
                        bms bmsVar11 = (bms) mobRetryNetworkRequestProcessor$process$1.L$0;
                        kotlin.b.b(obj2);
                        z0k0Var2 = z0k0Var3;
                        str2 = "mobcf";
                        tm20Var4 = tm20Var8;
                        i7 = i18;
                        i8 = i19;
                        bmsVar7 = bmsVar11;
                        mobRetryNetworkRequestProcessor$process$12 = mobRetryNetworkRequestProcessor$process$1;
                        pr20Var4 = pr20Var7;
                        z0k0Var3 = z0k0Var2;
                        str = str2;
                        kotlinx.coroutines.a.k(mobRetryNetworkRequestProcessor$process$12.get_context());
                        go20 j3222 = rzo.j(i7, i9);
                        str2 = str;
                        oq20 oq20Var3222 = new oq20(scc.g(new Pair(str2, tm20Var4.a), new Pair("mobpr", pr20Var4.a.b)));
                        mobRetryNetworkRequestProcessor$process$12.L$0 = bmsVar7;
                        mobRetryNetworkRequestProcessor$process$12.L$1 = null;
                        mobRetryNetworkRequestProcessor$process$12.L$2 = tm20Var4;
                        mobRetryNetworkRequestProcessor$process$12.L$3 = null;
                        mobRetryNetworkRequestProcessor$process$12.L$4 = pr20Var4;
                        mobRetryNetworkRequestProcessor$process$12.L$5 = null;
                        mobRetryNetworkRequestProcessor$process$12.L$6 = null;
                        mobRetryNetworkRequestProcessor$process$12.I$0 = i8;
                        mobRetryNetworkRequestProcessor$process$12.I$1 = i7;
                        mobRetryNetworkRequestProcessor$process$12.I$2 = i9;
                        mobRetryNetworkRequestProcessor$process$12.I$3 = 0;
                        mobRetryNetworkRequestProcessor$process$12.label = 7;
                        invoke2 = bmsVar7.invoke(pr20Var4, j3222, oq20Var3222, mobRetryNetworkRequestProcessor$process$12);
                        if (invoke2 != obj3) {
                        }
                        break;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        break;
                }
                return null;
            }
        }
        mobRetryNetworkRequestProcessor$process$1 = new MobRetryNetworkRequestProcessor$process$1(this, continuationImpl);
        Object obj22 = mobRetryNetworkRequestProcessor$process$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobRetryNetworkRequestProcessor$process$1.label;
        z0k0 z0k0Var32 = z0k0.a;
        String str32 = "mobcf";
        switch (i) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        MobRetryNetworkRequestProcessor$selectedProxy$1 mobRetryNetworkRequestProcessor$selectedProxy$1;
        int i;
        pr20 pr20Var;
        if (continuationImpl instanceof MobRetryNetworkRequestProcessor$selectedProxy$1) {
            mobRetryNetworkRequestProcessor$selectedProxy$1 = (MobRetryNetworkRequestProcessor$selectedProxy$1) continuationImpl;
            int i2 = mobRetryNetworkRequestProcessor$selectedProxy$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobRetryNetworkRequestProcessor$selectedProxy$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mobRetryNetworkRequestProcessor$selectedProxy$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobRetryNetworkRequestProcessor$selectedProxy$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mobRetryNetworkRequestProcessor$selectedProxy$1.label = 1;
                    obj = com.yandex.mob.data.d.a(this.b, "mob", mobRetryNetworkRequestProcessor$selectedProxy$1);
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
                pr20Var = (pr20) obj;
                if (pr20Var == null) {
                    return pr20Var;
                }
                ny61.r("Initialize MOB config before usage!");
                return null;
            }
        }
        mobRetryNetworkRequestProcessor$selectedProxy$1 = new MobRetryNetworkRequestProcessor$selectedProxy$1(this, continuationImpl);
        Object obj2 = mobRetryNetworkRequestProcessor$selectedProxy$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobRetryNetworkRequestProcessor$selectedProxy$1.label;
        if (i != 0) {
        }
        pr20Var = (pr20) obj2;
        if (pr20Var == null) {
        }
    }
}
