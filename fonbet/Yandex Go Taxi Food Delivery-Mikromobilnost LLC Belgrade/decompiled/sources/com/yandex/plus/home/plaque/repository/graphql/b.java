package com.yandex.plus.home.plaque.repository.graphql;

import android.graphics.drawable.Drawable;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.DisplayRulesDto$HorizontalRuleDto;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.DisplayRulesDto$VerticalRuleDto;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.NotificationDto$Position;
import com.yandex.plus.log.api.LogPriority;
import com.yandex.plus.plaquesdk.plaque.api.models.FormattedText$FontStyle;
import com.yandex.plus.plaquesdk.plaque.api.models.FormattedText$FontWeight;
import com.yandex.plus.plaquesdk.plaque.api.models.FormattedText$TextDecoration;
import com.yandex.plus.plaquesdk.plaque.api.models.FormattedText$VerticalAlignment;
import com.yandex.plus.plaquesdk.plaque.api.models.PlaqueModel$Notification$Position;
import com.yandex.plus.plaquesdk.plaque.api.models.PlaqueModel$Source;
import com.yandex.plus.plaquesdk.plaque.api.models.PlaqueModel$Type;
import com.yandex.plus.plaquesdk.widget.EmptyDrawable;
import defpackage.a2x;
import defpackage.ag20;
import defpackage.aic0;
import defpackage.aoc0;
import defpackage.b5d0;
import defpackage.bic0;
import defpackage.c251;
import defpackage.c8s;
import defpackage.cg20;
import defpackage.cic0;
import defpackage.cvu0;
import defpackage.d251;
import defpackage.d8s;
import defpackage.dic0;
import defpackage.e0k;
import defpackage.e3n;
import defpackage.eg20;
import defpackage.eic0;
import defpackage.eie0;
import defpackage.fe20;
import defpackage.g251;
import defpackage.gw00;
import defpackage.h0k;
import defpackage.h8s;
import defpackage.hkc0;
import defpackage.i151;
import defpackage.ie20;
import defpackage.if20;
import defpackage.j0k;
import defpackage.j151;
import defpackage.j251;
import defpackage.j73;
import defpackage.je20;
import defpackage.jl40;
import defpackage.joc0;
import defpackage.jse;
import defpackage.k151;
import defpackage.k8s;
import defpackage.kf20;
import defpackage.koc0;
import defpackage.l0k;
import defpackage.l151;
import defpackage.l8s;
import defpackage.loc0;
import defpackage.lv;
import defpackage.m251;
import defpackage.m8s;
import defpackage.mv;
import defpackage.nh60;
import defpackage.noh;
import defpackage.ny61;
import defpackage.o430;
import defpackage.of20;
import defpackage.oir0;
import defpackage.p151;
import defpackage.p251;
import defpackage.pfe;
import defpackage.pgz;
import defpackage.phc0;
import defpackage.plc0;
import defpackage.q1x;
import defpackage.qf20;
import defpackage.qh60;
import defpackage.qv;
import defpackage.qyd;
import defpackage.qzj;
import defpackage.rf20;
import defpackage.rh60;
import defpackage.rhc0;
import defpackage.rkj;
import defpackage.roc0;
import defpackage.rzj;
import defpackage.se20;
import defpackage.sfe;
import defpackage.skj;
import defpackage.ssc0;
import defpackage.t1x;
import defpackage.t251;
import defpackage.tcc;
import defpackage.tgc;
import defpackage.tje;
import defpackage.tse;
import defpackage.ue20;
import defpackage.uhh;
import defpackage.uv;
import defpackage.uzj;
import defpackage.v4r0;
import defpackage.vf20;
import defpackage.vqv;
import defpackage.vzj;
import defpackage.w1x;
import defpackage.w251;
import defpackage.w511;
import defpackage.wv;
import defpackage.wzj;
import defpackage.x151;
import defpackage.xd20;
import defpackage.y251;
import defpackage.y7s;
import defpackage.yf20;
import defpackage.z1x;
import defpackage.zhc0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class b {
    public final com.yandex.plus.plaquesdk.widget.a a;
    public final b5d0 b;
    public final jse c;
    public final pgz d;
    public final tse e;

    public b(com.yandex.plus.plaquesdk.widget.a aVar, b5d0 b5d0Var, jse jseVar, l0k l0kVar, ssc0 ssc0Var, pgz pgzVar, tse tseVar) {
        this.a = aVar;
        this.b = b5d0Var;
        this.c = jseVar;
        this.d = pgzVar;
        this.e = tseVar;
    }

    public static eic0 h(wv wvVar) {
        if (wvVar instanceof lv) {
            return new zhc0("", ((lv) wvVar).a());
        }
        if (wvVar instanceof uv) {
            uv uvVar = (uv) wvVar;
            return new cic0("", uvVar.c(), uvVar.b());
        }
        if (wvVar instanceof mv) {
            return new aic0("");
        }
        if (wvVar instanceof qv) {
            qv qvVar = (qv) wvVar;
            return new bic0(qvVar.b(), qvVar.d(), qvVar.c());
        }
        w511.b();
        return null;
    }

    public static PlaqueModel$Notification$Position k(NotificationDto$Position notificationDto$Position) {
        int i = aoc0.b[notificationDto$Position.ordinal()];
        if (i == 1) {
            return PlaqueModel$Notification$Position.LEFT;
        }
        if (i == 2) {
            return PlaqueModel$Notification$Position.RIGHT;
        }
        if (i != 3 && i != 4) {
            w511.b();
        }
        return null;
    }

    public static String o(b bVar, String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            str = cvu0.v(str, (String) entry.getKey(), (String) entry.getValue(), false);
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(qyd qydVar, Map map, Map map2, Map map3, ContinuationImpl continuationImpl) {
        PlaqueMapper$fromDto$3 plaqueMapper$fromDto$3;
        int i;
        qyd qydVar2;
        Map map4;
        eg20 eg20Var;
        eg20 eg20Var2;
        String str;
        qyd qydVar3;
        eg20 eg20Var3;
        String str2;
        e3n k;
        long j;
        e3n b;
        if (continuationImpl instanceof PlaqueMapper$fromDto$3) {
            plaqueMapper$fromDto$3 = (PlaqueMapper$fromDto$3) continuationImpl;
            int i2 = plaqueMapper$fromDto$3.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plaqueMapper$fromDto$3.label = i2 - Integer.MIN_VALUE;
                PlaqueMapper$fromDto$3 plaqueMapper$fromDto$32 = plaqueMapper$fromDto$3;
                Object obj = plaqueMapper$fromDto$32.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plaqueMapper$fromDto$32.label;
                loc0 loc0Var = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    y251 h = qydVar.h();
                    qydVar2 = qydVar;
                    plaqueMapper$fromDto$32.L$0 = qydVar2;
                    plaqueMapper$fromDto$32.L$1 = null;
                    plaqueMapper$fromDto$32.L$2 = map2;
                    plaqueMapper$fromDto$32.L$3 = null;
                    plaqueMapper$fromDto$32.label = 1;
                    obj = c(h, map3, map, map2, EmptySet.a, plaqueMapper$fromDto$32);
                    if (obj != obj2) {
                        map4 = map2;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    eg20Var3 = (eg20) plaqueMapper$fromDto$32.L$7;
                    str2 = (String) plaqueMapper$fromDto$32.L$6;
                    qydVar3 = (qyd) plaqueMapper$fromDto$32.L$0;
                    kotlin.b.b(obj);
                    loc0Var = (loc0) obj;
                    eg20Var2 = eg20Var3;
                    str = str2;
                    roc0 roc0Var = new roc0(str, eg20Var2, loc0Var, PlaqueModel$Type.CONDITIONAL, PlaqueModel$Source.GRAPHQL, false);
                    String c = qydVar3.c();
                    Map d = qydVar3.d();
                    Map j2 = qydVar3.j();
                    String i3 = qydVar3.i();
                    eie0 b2 = ssc0.b(qydVar3.g());
                    int f = qydVar3.f();
                    k = qydVar3.k();
                    long j3 = 0;
                    if (k != null) {
                        j = k.a;
                    } else {
                        o430 o430Var = e3n.b;
                        j = 0;
                    }
                    b = qydVar3.b();
                    if (b != null) {
                        j3 = b.a;
                    } else {
                        o430 o430Var2 = e3n.b;
                    }
                    return new phc0(roc0Var, c, d, j2, f, b2, i3, j, j3);
                }
                map4 = (Map) plaqueMapper$fromDto$32.L$2;
                qyd qydVar4 = (qyd) plaqueMapper$fromDto$32.L$0;
                kotlin.b.b(obj);
                qydVar2 = qydVar4;
                eg20Var = (eg20) obj;
                if (eg20Var != null) {
                    return null;
                }
                String c2 = qydVar2.c();
                rh60 e = qydVar2.e();
                if (e == null) {
                    eg20Var2 = eg20Var;
                    str = c2;
                    qydVar3 = qydVar2;
                    roc0 roc0Var2 = new roc0(str, eg20Var2, loc0Var, PlaqueModel$Type.CONDITIONAL, PlaqueModel$Source.GRAPHQL, false);
                    String c3 = qydVar3.c();
                    Map d2 = qydVar3.d();
                    Map j22 = qydVar3.j();
                    String i32 = qydVar3.i();
                    eie0 b22 = ssc0.b(qydVar3.g());
                    int f2 = qydVar3.f();
                    k = qydVar3.k();
                    long j32 = 0;
                    if (k != null) {
                    }
                    b = qydVar3.b();
                    if (b != null) {
                    }
                    return new phc0(roc0Var2, c3, d2, j22, f2, b22, i32, j, j32);
                }
                plaqueMapper$fromDto$32.L$0 = qydVar2;
                plaqueMapper$fromDto$32.L$1 = null;
                plaqueMapper$fromDto$32.L$2 = null;
                plaqueMapper$fromDto$32.L$3 = null;
                plaqueMapper$fromDto$32.L$4 = null;
                plaqueMapper$fromDto$32.L$5 = null;
                plaqueMapper$fromDto$32.L$6 = c2;
                plaqueMapper$fromDto$32.L$7 = eg20Var;
                plaqueMapper$fromDto$32.I$0 = 0;
                plaqueMapper$fromDto$32.label = 2;
                Object f3 = f(e, map4, plaqueMapper$fromDto$32);
                if (f3 != obj2) {
                    obj = f3;
                    eg20Var3 = eg20Var;
                    str2 = c2;
                    qydVar3 = qydVar2;
                    loc0Var = (loc0) obj;
                    eg20Var2 = eg20Var3;
                    str = str2;
                    roc0 roc0Var22 = new roc0(str, eg20Var2, loc0Var, PlaqueModel$Type.CONDITIONAL, PlaqueModel$Source.GRAPHQL, false);
                    String c32 = qydVar3.c();
                    Map d22 = qydVar3.d();
                    Map j222 = qydVar3.j();
                    String i322 = qydVar3.i();
                    eie0 b222 = ssc0.b(qydVar3.g());
                    int f22 = qydVar3.f();
                    k = qydVar3.k();
                    long j322 = 0;
                    if (k != null) {
                    }
                    b = qydVar3.b();
                    if (b != null) {
                    }
                    return new phc0(roc0Var22, c32, d22, j222, f22, b222, i322, j, j322);
                }
                return obj2;
            }
        }
        plaqueMapper$fromDto$3 = new PlaqueMapper$fromDto$3(this, continuationImpl);
        PlaqueMapper$fromDto$3 plaqueMapper$fromDto$322 = plaqueMapper$fromDto$3;
        Object obj3 = plaqueMapper$fromDto$322.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plaqueMapper$fromDto$322.label;
        loc0 loc0Var2 = null;
        if (i != 0) {
        }
        eg20Var = (eg20) obj3;
        if (eg20Var != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(uhh uhhVar, Map map, Map map2, Map map3, PlaqueModel$Type plaqueModel$Type, ContinuationImpl continuationImpl) {
        PlaqueMapper$fromDto$1 plaqueMapper$fromDto$1;
        int i;
        PlaqueModel$Type plaqueModel$Type2;
        uhh uhhVar2;
        Map map4;
        eg20 eg20Var;
        String str;
        eg20 eg20Var2;
        PlaqueModel$Type plaqueModel$Type3;
        if (continuationImpl instanceof PlaqueMapper$fromDto$1) {
            plaqueMapper$fromDto$1 = (PlaqueMapper$fromDto$1) continuationImpl;
            int i2 = plaqueMapper$fromDto$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plaqueMapper$fromDto$1.label = i2 - Integer.MIN_VALUE;
                PlaqueMapper$fromDto$1 plaqueMapper$fromDto$12 = plaqueMapper$fromDto$1;
                Object obj = plaqueMapper$fromDto$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plaqueMapper$fromDto$12.label;
                loc0 loc0Var = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    y251 y251Var = uhhVar.b;
                    plaqueMapper$fromDto$12.L$0 = uhhVar;
                    plaqueMapper$fromDto$12.L$1 = null;
                    plaqueMapper$fromDto$12.L$2 = map2;
                    plaqueMapper$fromDto$12.L$3 = null;
                    plaqueModel$Type2 = plaqueModel$Type;
                    plaqueMapper$fromDto$12.L$4 = plaqueModel$Type2;
                    plaqueMapper$fromDto$12.label = 1;
                    obj = c(y251Var, map3, map, map2, EmptySet.a, plaqueMapper$fromDto$12);
                    if (obj != obj2) {
                        uhhVar2 = uhhVar;
                        map4 = map2;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    eg20Var2 = (eg20) plaqueMapper$fromDto$12.L$8;
                    str = (String) plaqueMapper$fromDto$12.L$7;
                    plaqueModel$Type3 = (PlaqueModel$Type) plaqueMapper$fromDto$12.L$4;
                    uhhVar2 = (uhh) plaqueMapper$fromDto$12.L$0;
                    kotlin.b.b(obj);
                    loc0Var = (loc0) obj;
                    eg20Var = eg20Var2;
                    plaqueModel$Type2 = plaqueModel$Type3;
                    return new rhc0(new roc0(str, eg20Var, loc0Var, plaqueModel$Type2, PlaqueModel$Source.GRAPHQL, false), uhhVar2.a, uhhVar2.c, uhhVar2.e, uhhVar2.f, ssc0.b(uhhVar2.g));
                }
                PlaqueModel$Type plaqueModel$Type4 = (PlaqueModel$Type) plaqueMapper$fromDto$12.L$4;
                map4 = (Map) plaqueMapper$fromDto$12.L$2;
                uhhVar2 = (uhh) plaqueMapper$fromDto$12.L$0;
                kotlin.b.b(obj);
                plaqueModel$Type2 = plaqueModel$Type4;
                eg20Var = (eg20) obj;
                if (eg20Var != null) {
                    return null;
                }
                str = uhhVar2.a;
                rh60 rh60Var = uhhVar2.d;
                if (rh60Var != null) {
                    plaqueMapper$fromDto$12.L$0 = uhhVar2;
                    plaqueMapper$fromDto$12.L$1 = null;
                    plaqueMapper$fromDto$12.L$2 = null;
                    plaqueMapper$fromDto$12.L$3 = null;
                    plaqueMapper$fromDto$12.L$4 = plaqueModel$Type2;
                    plaqueMapper$fromDto$12.L$5 = null;
                    plaqueMapper$fromDto$12.L$6 = null;
                    plaqueMapper$fromDto$12.L$7 = str;
                    plaqueMapper$fromDto$12.L$8 = eg20Var;
                    plaqueMapper$fromDto$12.I$0 = 0;
                    plaqueMapper$fromDto$12.label = 2;
                    Object f = f(rh60Var, map4, plaqueMapper$fromDto$12);
                    if (f != obj2) {
                        obj = f;
                        eg20Var2 = eg20Var;
                        plaqueModel$Type3 = plaqueModel$Type2;
                        loc0Var = (loc0) obj;
                        eg20Var = eg20Var2;
                        plaqueModel$Type2 = plaqueModel$Type3;
                    }
                    return obj2;
                }
                return new rhc0(new roc0(str, eg20Var, loc0Var, plaqueModel$Type2, PlaqueModel$Source.GRAPHQL, false), uhhVar2.a, uhhVar2.c, uhhVar2.e, uhhVar2.f, ssc0.b(uhhVar2.g));
            }
        }
        plaqueMapper$fromDto$1 = new PlaqueMapper$fromDto$1(this, continuationImpl);
        PlaqueMapper$fromDto$1 plaqueMapper$fromDto$122 = plaqueMapper$fromDto$1;
        Object obj3 = plaqueMapper$fromDto$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plaqueMapper$fromDto$122.label;
        loc0 loc0Var2 = null;
        if (i != 0) {
        }
        eg20Var = (eg20) obj3;
        if (eg20Var != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x084b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x07c2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0853  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x078f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x06e7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x071e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x068d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0449  */
    /* JADX WARN: Type inference failed for: r0v40, types: [eic0] */
    /* JADX WARN: Type inference failed for: r27v0, types: [com.yandex.plus.home.plaque.repository.graphql.b] */
    /* JADX WARN: Type inference failed for: r8v66, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x081d -> B:12:0x082c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0840 -> B:13:0x0849). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(y251 y251Var, Map map, Map map2, Map map3, Set set, ContinuationImpl continuationImpl) {
        PlaqueMapper$fromDto$5 plaqueMapper$fromDto$5;
        int i;
        p151 p151Var;
        j151 j151Var;
        l151 k151Var;
        int i2;
        int i3;
        pfe pfeVar;
        int i4;
        String str;
        String str2;
        pfe pfeVar2;
        char c;
        int i5;
        PlaqueMapper$fromDto$5 plaqueMapper$fromDto$52;
        Map map4;
        Set set2;
        ArrayList arrayList;
        int i6;
        int i7;
        int i8;
        y251 y251Var2;
        pfe pfeVar3;
        p151 p151Var2;
        Iterator it;
        Map map5;
        String str3;
        pfe pfeVar4;
        dic0 dic0Var;
        p151 p151Var3;
        pfe pfeVar5;
        String str4;
        int i9;
        ag20 ag20Var;
        ag20[] ag20VarArr;
        ag20[] ag20VarArr2;
        int i10;
        pfe pfeVar6;
        String str5;
        eic0 eic0Var;
        p151 p151Var4;
        int i11;
        Object obj;
        ag20[] ag20VarArr3;
        String str6;
        pfe pfeVar7;
        p151 p151Var5;
        eic0 eic0Var2;
        String id;
        eic0 eic0Var3;
        Object obj2;
        String str7;
        eic0 eic0Var4;
        p151 p151Var6;
        cg20 cg20Var;
        Drawable drawable;
        Object of20Var;
        cg20 cg20Var2;
        pfe pfeVar8;
        String str8;
        eic0 eic0Var5;
        p151 p151Var7;
        ag20 ag20Var2;
        ag20[] ag20VarArr4;
        String str9;
        Object m;
        y251 y251Var3;
        String str10;
        p151 p151Var8;
        pfe pfeVar9;
        Object obj3;
        ag20[] ag20VarArr5;
        p151 p151Var9;
        int i12;
        cg20 cg20Var3;
        cg20 cg20Var4;
        int i13;
        ag20[] ag20VarArr6;
        pfe pfeVar10;
        y251 y251Var4;
        eic0 eic0Var6;
        String str11;
        ag20[] ag20VarArr7;
        int i14;
        ag20 ag20Var3;
        cg20 cg20Var5;
        cg20 cg20Var6;
        int i15;
        int i16;
        eg20 eg20Var;
        pfe pfeVar11;
        int i17;
        Set set3;
        Map map6;
        int i18;
        Map map7;
        Iterator it2;
        y251 y251Var5;
        ArrayList arrayList2;
        Map map8;
        int i19;
        p151 p151Var10;
        y251 y251Var6 = y251Var;
        Map map9 = map;
        if (continuationImpl instanceof PlaqueMapper$fromDto$5) {
            plaqueMapper$fromDto$5 = (PlaqueMapper$fromDto$5) continuationImpl;
            int i20 = plaqueMapper$fromDto$5.label;
            if ((i20 & Integer.MIN_VALUE) != 0) {
                plaqueMapper$fromDto$5.label = i20 - Integer.MIN_VALUE;
                Object obj4 = plaqueMapper$fromDto$5.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plaqueMapper$fromDto$5.label;
                j151 j151Var2 = j151.a;
                pfe pfeVar12 = pfe.d;
                switch (i) {
                    case 0:
                        kotlin.b.b(obj4);
                        if (set.contains(y251Var6.getId())) {
                            return null;
                        }
                        wzj a = y251Var6.a();
                        boolean z = y251Var6 instanceof j251;
                        vqv vqvVar = a.a;
                        List list = a.b;
                        oir0 oir0Var = a.c;
                        j151Var = j151Var2;
                        e0k e0kVar = new e0k(new rkj(Integer.valueOf(vqvVar.a)), new rkj(Integer.valueOf(vqvVar.c)), new rkj(Integer.valueOf(vqvVar.b)), new rkj(Integer.valueOf(vqvVar.d)));
                        int size = list.size();
                        je20 je20Var = ie20.a;
                        if (size != 0) {
                            if (size != 1) {
                                List list2 = list;
                                ArrayList arrayList3 = new ArrayList(tcc.n(list2, 10));
                                Iterator it3 = list2.iterator();
                                while (it3.hasNext()) {
                                    arrayList3.add(l0k.b((tgc) it3.next()));
                                }
                                ArrayList arrayList4 = new ArrayList();
                                Iterator it4 = arrayList3.iterator();
                                while (it4.hasNext()) {
                                    Object next = it4.next();
                                    if (!jl40.l((fe20) next, je20Var)) {
                                        arrayList4.add(next);
                                    }
                                }
                                int size2 = arrayList4.size();
                                if (size2 != 0) {
                                    if (size2 != 1) {
                                        je20Var = new xd20(arrayList4);
                                    } else {
                                        je20Var = (je20) arrayList4.get(0);
                                    }
                                }
                            } else {
                                je20Var = l0k.b((tgc) list.get(0));
                            }
                        }
                        h0k h0kVar = new h0k(e0kVar, new ue20(je20Var, new se20(l0k.a(oir0Var.a), l0k.a(oir0Var.b), l0k.a(oir0Var.d), l0k.a(oir0Var.c)), z));
                        vzj vzjVar = a.g;
                        if (vzjVar instanceof qzj) {
                            k151Var = i151.a;
                        } else if (vzjVar instanceof rzj) {
                            k151Var = j151Var;
                        } else {
                            if (!(vzjVar instanceof uzj)) {
                                w511.b();
                                return null;
                            }
                            k151Var = new k151(new rkj(Integer.valueOf(((uzj) vzjVar).a())));
                        }
                        DisplayRulesDto$HorizontalRuleDto displayRulesDto$HorizontalRuleDto = a.e;
                        DisplayRulesDto$VerticalRuleDto displayRulesDto$VerticalRuleDto = a.f;
                        int i21 = displayRulesDto$HorizontalRuleDto == null ? -1 : j0k.a[displayRulesDto$HorizontalRuleDto.ordinal()];
                        if (i21 == -1) {
                            i2 = 0;
                        } else if (i21 == 1) {
                            i2 = 3;
                        } else if (i21 == 2) {
                            i2 = 5;
                        } else {
                            if (i21 != 3) {
                                w511.b();
                                return null;
                            }
                            i2 = 1;
                        }
                        int i22 = displayRulesDto$VerticalRuleDto == null ? -1 : j0k.b[displayRulesDto$VerticalRuleDto.ordinal()];
                        if (i22 == -1) {
                            i3 = 0;
                        } else if (i22 == 1) {
                            i3 = 48;
                        } else if (i22 == 2) {
                            i3 = 80;
                        } else {
                            if (i22 != 3) {
                                w511.b();
                                return null;
                            }
                            i3 = 16;
                        }
                        p151Var = new p151(h0kVar, k151Var, i3 | i2);
                        sfe contentDescription = y251Var6.getContentDescription();
                        List list3 = contentDescription != null ? contentDescription.b : null;
                        if (list3 == null) {
                            list3 = EmptyList.a;
                        }
                        Iterator it5 = list3.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                Boolean bool = contentDescription != null ? contentDescription.d : null;
                                if (jl40.l(bool, Boolean.TRUE)) {
                                    i4 = 1;
                                } else {
                                    if (!jl40.l(bool, Boolean.FALSE) && bool != null) {
                                        w511.b();
                                        return null;
                                    }
                                    i4 = 2;
                                }
                                pfeVar = new pfe(i4, (contentDescription == null || (str2 = contentDescription.a) == null) ? null : o(this, str2, map9), (contentDescription == null || (str = contentDescription.c) == null) ? null : o(this, str, map9));
                            } else if (!map9.containsKey((String) it5.next())) {
                                pfeVar = null;
                            }
                        }
                        if (pfeVar == null) {
                            pfeVar = pfeVar12;
                        }
                        if (y251Var6 instanceof w251) {
                            w251 w251Var = (w251) y251Var6;
                            String id2 = w251Var.getId();
                            wv d = w251Var.d();
                            eic0 h = d != null ? h(d) : null;
                            List g = w251Var.g();
                            List f = w251Var.f();
                            plaqueMapper$fromDto$5.L$0 = y251Var6;
                            plaqueMapper$fromDto$5.L$1 = null;
                            plaqueMapper$fromDto$5.L$2 = null;
                            plaqueMapper$fromDto$5.L$3 = null;
                            plaqueMapper$fromDto$5.L$4 = null;
                            plaqueMapper$fromDto$5.L$5 = p151Var;
                            plaqueMapper$fromDto$5.L$6 = pfeVar;
                            plaqueMapper$fromDto$5.L$7 = id2;
                            plaqueMapper$fromDto$5.L$8 = h;
                            plaqueMapper$fromDto$5.label = 1;
                            Object m2 = m(g, f, map9, plaqueMapper$fromDto$5);
                            if (m2 != coroutineSingletons) {
                                obj2 = m2;
                                str7 = id2;
                                eic0Var4 = h;
                                p151Var6 = p151Var;
                                cg20Var = (cg20) obj2;
                                if (cg20Var != null) {
                                    Integer e = ((w251) y251Var6).e();
                                    if (e == null) {
                                        e = null;
                                    }
                                    return new ag20(str7, eic0Var4, pfeVar, p151Var6, cg20Var, e != null ? skj.c(e) : null);
                                }
                                return null;
                            }
                        } else {
                            if (y251Var6 instanceof p251) {
                                return new vf20(((p251) y251Var6).a, null, pfeVar12, p151Var);
                            }
                            pfeVar2 = pfeVar12;
                            if (y251Var6 instanceof m251) {
                                m251 m251Var = (m251) y251Var6;
                                id = m251Var.getId();
                                wv d2 = m251Var.d();
                                eic0 h2 = d2 != null ? h(d2) : null;
                                noh nohVar = (noh) map3.get(m251Var.e());
                                if (nohVar != null) {
                                    plaqueMapper$fromDto$5.L$0 = y251Var6;
                                    plaqueMapper$fromDto$5.L$1 = null;
                                    plaqueMapper$fromDto$5.L$2 = null;
                                    plaqueMapper$fromDto$5.L$3 = null;
                                    plaqueMapper$fromDto$5.L$4 = null;
                                    plaqueMapper$fromDto$5.L$5 = p151Var;
                                    plaqueMapper$fromDto$5.L$6 = pfeVar;
                                    plaqueMapper$fromDto$5.L$7 = id;
                                    plaqueMapper$fromDto$5.L$8 = h2;
                                    plaqueMapper$fromDto$5.label = 2;
                                    Object k = nohVar.k(plaqueMapper$fromDto$5);
                                    if (k != coroutineSingletons) {
                                        eic0 eic0Var7 = h2;
                                        obj4 = k;
                                        eic0Var3 = eic0Var7;
                                        drawable = (Drawable) obj4;
                                        if (drawable == null) {
                                            h2 = eic0Var3;
                                        }
                                        of20Var = new of20(id, eic0Var3, pfeVar, p151Var, new qf20(((m251) y251Var6).e(), drawable));
                                        return of20Var;
                                    }
                                }
                                eic0 eic0Var8 = h2;
                                drawable = EmptyDrawable.INSTANCE;
                                eic0Var3 = eic0Var8;
                                of20Var = new of20(id, eic0Var3, pfeVar, p151Var, new qf20(((m251) y251Var6).e(), drawable));
                                return of20Var;
                            }
                            c = 2;
                            if (z) {
                                j251 j251Var = (j251) y251Var6;
                                String id3 = j251Var.getId();
                                wv d3 = j251Var.d();
                                eic0 h3 = d3 != null ? h(d3) : null;
                                List f2 = j251Var.f();
                                List e2 = j251Var.e();
                                plaqueMapper$fromDto$5.L$0 = null;
                                plaqueMapper$fromDto$5.L$1 = null;
                                plaqueMapper$fromDto$5.L$2 = null;
                                plaqueMapper$fromDto$5.L$3 = null;
                                plaqueMapper$fromDto$5.L$4 = null;
                                plaqueMapper$fromDto$5.L$5 = p151Var;
                                plaqueMapper$fromDto$5.L$6 = pfeVar;
                                plaqueMapper$fromDto$5.L$7 = id3;
                                plaqueMapper$fromDto$5.L$8 = h3;
                                plaqueMapper$fromDto$5.label = 3;
                                Object m3 = m(f2, e2, map9, plaqueMapper$fromDto$5);
                                if (m3 != coroutineSingletons) {
                                    str6 = id3;
                                    pfeVar7 = pfeVar;
                                    p151Var5 = p151Var;
                                    obj4 = m3;
                                    eic0Var2 = h3;
                                    cg20Var2 = (cg20) obj4;
                                    if (cg20Var2 != null) {
                                        of20Var = new kf20(str6, eic0Var2, pfeVar7, p151Var5, cg20Var2);
                                        return of20Var;
                                    }
                                    return null;
                                }
                            } else if (y251Var6 instanceof g251) {
                                g251 g251Var = (g251) y251Var6;
                                String id4 = g251Var.getId();
                                wv d4 = g251Var.d();
                                eic0 h4 = d4 != null ? h(d4) : null;
                                ag20[] ag20VarArr8 = new ag20[3];
                                if (g251Var.h() != null) {
                                    List h5 = g251Var.h();
                                    List g2 = g251Var.g();
                                    plaqueMapper$fromDto$5.L$0 = y251Var6;
                                    plaqueMapper$fromDto$5.L$1 = map9;
                                    ag20Var = null;
                                    plaqueMapper$fromDto$5.L$2 = null;
                                    plaqueMapper$fromDto$5.L$3 = null;
                                    plaqueMapper$fromDto$5.L$4 = null;
                                    plaqueMapper$fromDto$5.L$5 = null;
                                    plaqueMapper$fromDto$5.L$6 = null;
                                    plaqueMapper$fromDto$5.L$7 = ag20VarArr8;
                                    plaqueMapper$fromDto$5.L$8 = null;
                                    plaqueMapper$fromDto$5.L$9 = id4;
                                    plaqueMapper$fromDto$5.L$10 = h4;
                                    plaqueMapper$fromDto$5.L$11 = pfeVar;
                                    plaqueMapper$fromDto$5.L$12 = p151Var;
                                    plaqueMapper$fromDto$5.L$13 = ag20VarArr8;
                                    plaqueMapper$fromDto$5.I$0 = 0;
                                    plaqueMapper$fromDto$5.I$1 = 0;
                                    plaqueMapper$fromDto$5.label = 4;
                                    Object m4 = m(h5, g2, map9, plaqueMapper$fromDto$5);
                                    if (m4 != coroutineSingletons) {
                                        pfeVar6 = pfeVar;
                                        str5 = id4;
                                        eic0Var = h4;
                                        p151Var4 = p151Var;
                                        ag20VarArr2 = ag20VarArr8;
                                        i11 = 0;
                                        obj = m4;
                                        ag20VarArr3 = ag20VarArr2;
                                        cg20Var3 = (cg20) obj;
                                        if (cg20Var3 == null) {
                                            String str12 = ((g251) y251Var6).getId() + ":title";
                                            j151 j151Var3 = j151Var;
                                            p151 p151Var11 = new p151(h0k.c, j151Var3, 0);
                                            j151Var2 = j151Var3;
                                            pfe pfeVar13 = pfeVar2;
                                            pfeVar5 = pfeVar13;
                                            ag20Var2 = new ag20(str12, null, pfeVar13, p151Var11, cg20Var3, null);
                                            p151Var7 = p151Var4;
                                            i9 = 0;
                                            pfeVar8 = pfeVar6;
                                            eic0Var5 = eic0Var;
                                            str8 = str5;
                                            ag20VarArr4 = ag20VarArr2;
                                            ag20VarArr3[i11] = ag20Var2;
                                            StringBuilder sb = new StringBuilder();
                                            g251 g251Var2 = (g251) y251Var6;
                                            sb.append(g251Var2.getId());
                                            sb.append(":balance");
                                            String sb2 = sb.toString();
                                            p151 p151Var12 = new p151(h0k.c, j151Var2, i9);
                                            List e3 = g251Var2.e();
                                            List g3 = g251Var2.g();
                                            plaqueMapper$fromDto$5.L$0 = y251Var6;
                                            plaqueMapper$fromDto$5.L$1 = map9;
                                            plaqueMapper$fromDto$5.L$2 = null;
                                            plaqueMapper$fromDto$5.L$3 = null;
                                            plaqueMapper$fromDto$5.L$4 = null;
                                            plaqueMapper$fromDto$5.L$5 = null;
                                            plaqueMapper$fromDto$5.L$6 = null;
                                            plaqueMapper$fromDto$5.L$7 = ag20VarArr4;
                                            str9 = str8;
                                            plaqueMapper$fromDto$5.L$8 = str9;
                                            plaqueMapper$fromDto$5.L$9 = eic0Var5;
                                            plaqueMapper$fromDto$5.L$10 = pfeVar8;
                                            plaqueMapper$fromDto$5.L$11 = p151Var7;
                                            plaqueMapper$fromDto$5.L$12 = ag20VarArr4;
                                            plaqueMapper$fromDto$5.L$13 = sb2;
                                            plaqueMapper$fromDto$5.L$14 = pfeVar5;
                                            plaqueMapper$fromDto$5.L$15 = p151Var12;
                                            y251 y251Var7 = y251Var6;
                                            plaqueMapper$fromDto$5.I$0 = 1;
                                            plaqueMapper$fromDto$5.label = 5;
                                            m = m(e3, g3, map9, plaqueMapper$fromDto$5);
                                            if (m != coroutineSingletons) {
                                                y251Var3 = y251Var7;
                                                str10 = sb2;
                                                p151Var8 = p151Var12;
                                                pfeVar9 = pfeVar5;
                                                obj3 = m;
                                                ag20VarArr5 = ag20VarArr4;
                                                p151Var9 = p151Var7;
                                                i12 = 1;
                                                cg20Var4 = (cg20) obj3;
                                                if (cg20Var4 != null) {
                                                    ag20VarArr5[i12] = new ag20(str10, null, pfeVar9, p151Var8, cg20Var4, null);
                                                    g251 g251Var3 = (g251) y251Var3;
                                                    if (g251Var3.f() == null) {
                                                        i13 = 2;
                                                        ag20VarArr6 = ag20VarArr4;
                                                        pfeVar10 = pfeVar8;
                                                        ag20VarArr7 = ag20VarArr4;
                                                        i14 = i13;
                                                        eic0Var6 = eic0Var5;
                                                        str11 = str9;
                                                        ag20Var3 = null;
                                                        ag20VarArr7[i14] = ag20Var3;
                                                        of20Var = new rf20(str11, eic0Var6, pfeVar10, p151Var9, j73.A(ag20VarArr6), 1);
                                                        return of20Var;
                                                    }
                                                    List f3 = g251Var3.f();
                                                    List g4 = g251Var3.g();
                                                    plaqueMapper$fromDto$5.L$0 = y251Var3;
                                                    plaqueMapper$fromDto$5.L$1 = null;
                                                    plaqueMapper$fromDto$5.L$2 = null;
                                                    plaqueMapper$fromDto$5.L$3 = null;
                                                    plaqueMapper$fromDto$5.L$4 = null;
                                                    plaqueMapper$fromDto$5.L$5 = null;
                                                    plaqueMapper$fromDto$5.L$6 = null;
                                                    plaqueMapper$fromDto$5.L$7 = ag20VarArr4;
                                                    plaqueMapper$fromDto$5.L$8 = null;
                                                    plaqueMapper$fromDto$5.L$9 = str9;
                                                    plaqueMapper$fromDto$5.L$10 = eic0Var5;
                                                    plaqueMapper$fromDto$5.L$11 = pfeVar8;
                                                    plaqueMapper$fromDto$5.L$12 = p151Var9;
                                                    plaqueMapper$fromDto$5.L$13 = ag20VarArr4;
                                                    plaqueMapper$fromDto$5.L$14 = null;
                                                    plaqueMapper$fromDto$5.L$15 = null;
                                                    plaqueMapper$fromDto$5.I$0 = 0;
                                                    plaqueMapper$fromDto$5.I$1 = 2;
                                                    plaqueMapper$fromDto$5.label = 6;
                                                    Object m5 = m(f3, g4, map9, plaqueMapper$fromDto$5);
                                                    if (m5 != coroutineSingletons) {
                                                        pfeVar10 = pfeVar8;
                                                        y251Var4 = y251Var3;
                                                        ag20VarArr6 = ag20VarArr4;
                                                        eic0Var6 = eic0Var5;
                                                        str11 = str9;
                                                        obj4 = m5;
                                                        ag20VarArr7 = ag20VarArr6;
                                                        i14 = 2;
                                                        cg20Var5 = (cg20) obj4;
                                                        if (cg20Var5 == null) {
                                                            ag20Var3 = new ag20(((g251) y251Var4).getId() + ":subtitle", null, pfeVar5, new p151(h0k.c, j151Var2, 0), cg20Var5, null);
                                                            ag20VarArr7[i14] = ag20Var3;
                                                            of20Var = new rf20(str11, eic0Var6, pfeVar10, p151Var9, j73.A(ag20VarArr6), 1);
                                                            return of20Var;
                                                        }
                                                        pfeVar8 = pfeVar10;
                                                        eic0Var5 = eic0Var6;
                                                        str9 = str11;
                                                        i13 = i14;
                                                        ag20VarArr4 = ag20VarArr7;
                                                        pfeVar10 = pfeVar8;
                                                        ag20VarArr7 = ag20VarArr4;
                                                        i14 = i13;
                                                        eic0Var6 = eic0Var5;
                                                        str11 = str9;
                                                        ag20Var3 = null;
                                                        ag20VarArr7[i14] = ag20Var3;
                                                        of20Var = new rf20(str11, eic0Var6, pfeVar10, p151Var9, j73.A(ag20VarArr6), 1);
                                                        return of20Var;
                                                    }
                                                }
                                                return null;
                                            }
                                        } else {
                                            pfeVar5 = pfeVar2;
                                            i10 = i11;
                                            p151Var = p151Var4;
                                            i9 = 0;
                                            pfeVar = pfeVar6;
                                            h4 = eic0Var;
                                            ag20VarArr = ag20VarArr3;
                                            str4 = str5;
                                            j151Var2 = j151Var;
                                            pfeVar8 = pfeVar;
                                            str8 = str4;
                                            eic0Var5 = h4;
                                            i11 = i10;
                                            ag20VarArr3 = ag20VarArr;
                                            p151Var7 = p151Var;
                                            ag20Var2 = ag20Var;
                                            ag20VarArr4 = ag20VarArr2;
                                            ag20VarArr3[i11] = ag20Var2;
                                            StringBuilder sb3 = new StringBuilder();
                                            g251 g251Var22 = (g251) y251Var6;
                                            sb3.append(g251Var22.getId());
                                            sb3.append(":balance");
                                            String sb22 = sb3.toString();
                                            p151 p151Var122 = new p151(h0k.c, j151Var2, i9);
                                            List e32 = g251Var22.e();
                                            List g32 = g251Var22.g();
                                            plaqueMapper$fromDto$5.L$0 = y251Var6;
                                            plaqueMapper$fromDto$5.L$1 = map9;
                                            plaqueMapper$fromDto$5.L$2 = null;
                                            plaqueMapper$fromDto$5.L$3 = null;
                                            plaqueMapper$fromDto$5.L$4 = null;
                                            plaqueMapper$fromDto$5.L$5 = null;
                                            plaqueMapper$fromDto$5.L$6 = null;
                                            plaqueMapper$fromDto$5.L$7 = ag20VarArr4;
                                            str9 = str8;
                                            plaqueMapper$fromDto$5.L$8 = str9;
                                            plaqueMapper$fromDto$5.L$9 = eic0Var5;
                                            plaqueMapper$fromDto$5.L$10 = pfeVar8;
                                            plaqueMapper$fromDto$5.L$11 = p151Var7;
                                            plaqueMapper$fromDto$5.L$12 = ag20VarArr4;
                                            plaqueMapper$fromDto$5.L$13 = sb22;
                                            plaqueMapper$fromDto$5.L$14 = pfeVar5;
                                            plaqueMapper$fromDto$5.L$15 = p151Var122;
                                            y251 y251Var72 = y251Var6;
                                            plaqueMapper$fromDto$5.I$0 = 1;
                                            plaqueMapper$fromDto$5.label = 5;
                                            m = m(e32, g32, map9, plaqueMapper$fromDto$5);
                                            if (m != coroutineSingletons) {
                                            }
                                        }
                                    }
                                } else {
                                    pfeVar5 = pfeVar2;
                                    str4 = id4;
                                    i9 = 0;
                                    ag20Var = null;
                                    ag20VarArr = ag20VarArr8;
                                    ag20VarArr2 = ag20VarArr;
                                    i10 = 0;
                                    j151Var2 = j151Var;
                                    pfeVar8 = pfeVar;
                                    str8 = str4;
                                    eic0Var5 = h4;
                                    i11 = i10;
                                    ag20VarArr3 = ag20VarArr;
                                    p151Var7 = p151Var;
                                    ag20Var2 = ag20Var;
                                    ag20VarArr4 = ag20VarArr2;
                                    ag20VarArr3[i11] = ag20Var2;
                                    StringBuilder sb32 = new StringBuilder();
                                    g251 g251Var222 = (g251) y251Var6;
                                    sb32.append(g251Var222.getId());
                                    sb32.append(":balance");
                                    String sb222 = sb32.toString();
                                    p151 p151Var1222 = new p151(h0k.c, j151Var2, i9);
                                    List e322 = g251Var222.e();
                                    List g322 = g251Var222.g();
                                    plaqueMapper$fromDto$5.L$0 = y251Var6;
                                    plaqueMapper$fromDto$5.L$1 = map9;
                                    plaqueMapper$fromDto$5.L$2 = null;
                                    plaqueMapper$fromDto$5.L$3 = null;
                                    plaqueMapper$fromDto$5.L$4 = null;
                                    plaqueMapper$fromDto$5.L$5 = null;
                                    plaqueMapper$fromDto$5.L$6 = null;
                                    plaqueMapper$fromDto$5.L$7 = ag20VarArr4;
                                    str9 = str8;
                                    plaqueMapper$fromDto$5.L$8 = str9;
                                    plaqueMapper$fromDto$5.L$9 = eic0Var5;
                                    plaqueMapper$fromDto$5.L$10 = pfeVar8;
                                    plaqueMapper$fromDto$5.L$11 = p151Var7;
                                    plaqueMapper$fromDto$5.L$12 = ag20VarArr4;
                                    plaqueMapper$fromDto$5.L$13 = sb222;
                                    plaqueMapper$fromDto$5.L$14 = pfeVar5;
                                    plaqueMapper$fromDto$5.L$15 = p151Var1222;
                                    y251 y251Var722 = y251Var6;
                                    plaqueMapper$fromDto$5.I$0 = 1;
                                    plaqueMapper$fromDto$5.label = 5;
                                    m = m(e322, g322, map9, plaqueMapper$fromDto$5);
                                    if (m != coroutineSingletons) {
                                    }
                                }
                            } else {
                                i5 = 2;
                                if (y251Var6 instanceof t251) {
                                    t251 t251Var = (t251) y251Var6;
                                    String id5 = t251Var.getId();
                                    dic0 dic0Var2 = new dic0(t251Var.getId());
                                    List e4 = t251Var.e();
                                    List d5 = t251Var.d();
                                    plaqueMapper$fromDto$5.L$0 = null;
                                    plaqueMapper$fromDto$5.L$1 = null;
                                    plaqueMapper$fromDto$5.L$2 = null;
                                    plaqueMapper$fromDto$5.L$3 = null;
                                    plaqueMapper$fromDto$5.L$4 = null;
                                    plaqueMapper$fromDto$5.L$5 = p151Var;
                                    plaqueMapper$fromDto$5.L$6 = pfeVar;
                                    plaqueMapper$fromDto$5.L$7 = id5;
                                    plaqueMapper$fromDto$5.L$8 = dic0Var2;
                                    plaqueMapper$fromDto$5.label = 7;
                                    Object m6 = m(e4, d5, map9, plaqueMapper$fromDto$5);
                                    if (m6 != coroutineSingletons) {
                                        str3 = id5;
                                        pfeVar4 = pfeVar;
                                        dic0Var = dic0Var2;
                                        p151Var3 = p151Var;
                                        obj4 = m6;
                                        cg20Var6 = (cg20) obj4;
                                        if (cg20Var6 != null) {
                                            return new yf20(str3, dic0Var, pfeVar4, p151Var3, cg20Var6, false);
                                        }
                                        return null;
                                    }
                                } else {
                                    if (!(y251Var6 instanceof d251)) {
                                        w511.b();
                                        return null;
                                    }
                                    List b = ((d251) y251Var6).b();
                                    plaqueMapper$fromDto$52 = plaqueMapper$fromDto$5;
                                    map4 = map3;
                                    set2 = set;
                                    arrayList = new ArrayList();
                                    i6 = 0;
                                    i7 = 0;
                                    i8 = 0;
                                    y251Var2 = y251Var6;
                                    pfeVar3 = pfeVar;
                                    p151Var2 = p151Var;
                                    it = b.iterator();
                                    map5 = map2;
                                    if (!it.hasNext()) {
                                        pfe pfeVar14 = pfeVar3;
                                        p151 p151Var13 = p151Var2;
                                        ArrayList arrayList5 = arrayList;
                                        d251 d251Var = (d251) y251Var2;
                                        if (arrayList5.size() == d251Var.b().size()) {
                                            if (d251Var instanceof x151) {
                                                x151 x151Var = (x151) y251Var2;
                                                String id6 = x151Var.getId();
                                                wv d6 = x151Var.d();
                                                of20Var = new if20(id6, d6 != null ? h(d6) : null, pfeVar14, p151Var13, arrayList5);
                                                return of20Var;
                                            }
                                            if (!(d251Var instanceof c251)) {
                                                w511.b();
                                                return null;
                                            }
                                            c251 c251Var = (c251) y251Var2;
                                            String str13 = c251Var.a;
                                            wv wvVar = c251Var.c;
                                            eic0 h6 = wvVar != null ? h(wvVar) : null;
                                            int i23 = aoc0.a[c251Var.f.ordinal()];
                                            if (i23 == 1) {
                                                i15 = 0;
                                            } else {
                                                if (i23 != i5) {
                                                    w511.b();
                                                    return null;
                                                }
                                                i15 = 1;
                                            }
                                            return new rf20(str13, h6, pfeVar14, p151Var13, arrayList5, i15);
                                        }
                                        return null;
                                    }
                                    y251 y251Var8 = (y251) map5.get((String) it.next());
                                    if (y251Var8 != null) {
                                        LinkedHashSet i24 = v4r0.i(set2, y251Var2.getId());
                                        plaqueMapper$fromDto$52.L$0 = y251Var2;
                                        plaqueMapper$fromDto$52.L$1 = map9;
                                        plaqueMapper$fromDto$52.L$2 = map5;
                                        plaqueMapper$fromDto$52.L$3 = map4;
                                        plaqueMapper$fromDto$52.L$4 = set2;
                                        plaqueMapper$fromDto$52.L$5 = p151Var2;
                                        plaqueMapper$fromDto$52.L$6 = pfeVar3;
                                        plaqueMapper$fromDto$52.L$7 = null;
                                        plaqueMapper$fromDto$52.L$8 = null;
                                        plaqueMapper$fromDto$52.L$9 = arrayList;
                                        plaqueMapper$fromDto$52.L$10 = null;
                                        plaqueMapper$fromDto$52.L$11 = it;
                                        plaqueMapper$fromDto$52.L$12 = null;
                                        plaqueMapper$fromDto$52.L$13 = null;
                                        plaqueMapper$fromDto$52.L$14 = null;
                                        plaqueMapper$fromDto$52.I$0 = i6;
                                        plaqueMapper$fromDto$52.I$1 = i7;
                                        plaqueMapper$fromDto$52.I$2 = i8;
                                        plaqueMapper$fromDto$52.I$3 = 0;
                                        plaqueMapper$fromDto$52.I$4 = 0;
                                        plaqueMapper$fromDto$52.label = 8;
                                        pfeVar11 = pfeVar3;
                                        p151 p151Var14 = p151Var2;
                                        i5 = 2;
                                        Object c2 = c(y251Var8, map9, map5, map4, i24, plaqueMapper$fromDto$52);
                                        if (c2 != coroutineSingletons) {
                                            Map map10 = map5;
                                            obj4 = c2;
                                            i17 = i8;
                                            set3 = set2;
                                            map6 = map10;
                                            i18 = i6;
                                            map7 = map4;
                                            plaqueMapper$fromDto$5 = plaqueMapper$fromDto$52;
                                            it2 = it;
                                            y251Var5 = y251Var2;
                                            arrayList2 = arrayList;
                                            map8 = map9;
                                            i19 = i7;
                                            p151Var10 = p151Var14;
                                            eg20 eg20Var2 = (eg20) obj4;
                                            Map map11 = map7;
                                            eg20Var = eg20Var2;
                                            i16 = i18;
                                            p151Var2 = p151Var10;
                                            i7 = i19;
                                            map9 = map8;
                                            arrayList = arrayList2;
                                            y251Var2 = y251Var5;
                                            it = it2;
                                            plaqueMapper$fromDto$52 = plaqueMapper$fromDto$5;
                                            map4 = map11;
                                            map5 = map6;
                                            set2 = set3;
                                            i8 = i17;
                                            pfeVar3 = pfeVar11;
                                            if (eg20Var != null) {
                                                arrayList.add(eg20Var);
                                            }
                                            i6 = i16;
                                            if (!it.hasNext()) {
                                            }
                                        }
                                    } else {
                                        i5 = 2;
                                        i16 = i6;
                                        eg20Var = null;
                                        if (eg20Var != null) {
                                        }
                                        i6 = i16;
                                        if (!it.hasNext()) {
                                        }
                                    }
                                }
                            }
                        }
                        return coroutineSingletons;
                    case 1:
                        eic0 eic0Var9 = (eic0) plaqueMapper$fromDto$5.L$8;
                        String str14 = (String) plaqueMapper$fromDto$5.L$7;
                        pfe pfeVar15 = (pfe) plaqueMapper$fromDto$5.L$6;
                        p151 p151Var15 = (p151) plaqueMapper$fromDto$5.L$5;
                        y251 y251Var9 = (y251) plaqueMapper$fromDto$5.L$0;
                        kotlin.b.b(obj4);
                        eic0Var4 = eic0Var9;
                        obj2 = obj4;
                        str7 = str14;
                        y251Var6 = y251Var9;
                        p151Var6 = p151Var15;
                        pfeVar = pfeVar15;
                        cg20Var = (cg20) obj2;
                        if (cg20Var != null) {
                        }
                        return null;
                    case 2:
                        eic0Var3 = (eic0) plaqueMapper$fromDto$5.L$8;
                        String str15 = (String) plaqueMapper$fromDto$5.L$7;
                        pfe pfeVar16 = (pfe) plaqueMapper$fromDto$5.L$6;
                        p151 p151Var16 = (p151) plaqueMapper$fromDto$5.L$5;
                        y251 y251Var10 = (y251) plaqueMapper$fromDto$5.L$0;
                        kotlin.b.b(obj4);
                        p151Var = p151Var16;
                        pfeVar = pfeVar16;
                        id = str15;
                        y251Var6 = y251Var10;
                        drawable = (Drawable) obj4;
                        if (drawable == null) {
                        }
                        of20Var = new of20(id, eic0Var3, pfeVar, p151Var, new qf20(((m251) y251Var6).e(), drawable));
                        return of20Var;
                    case 3:
                        eic0Var2 = (eic0) plaqueMapper$fromDto$5.L$8;
                        str6 = (String) plaqueMapper$fromDto$5.L$7;
                        pfeVar7 = (pfe) plaqueMapper$fromDto$5.L$6;
                        p151Var5 = (p151) plaqueMapper$fromDto$5.L$5;
                        kotlin.b.b(obj4);
                        cg20Var2 = (cg20) obj4;
                        if (cg20Var2 != null) {
                        }
                        return null;
                    case 4:
                        int i25 = plaqueMapper$fromDto$5.I$1;
                        ag20[] ag20VarArr9 = (ag20[]) plaqueMapper$fromDto$5.L$13;
                        p151 p151Var17 = (p151) plaqueMapper$fromDto$5.L$12;
                        pfe pfeVar17 = (pfe) plaqueMapper$fromDto$5.L$11;
                        eic0 eic0Var10 = (eic0) plaqueMapper$fromDto$5.L$10;
                        String str16 = (String) plaqueMapper$fromDto$5.L$9;
                        ag20[] ag20VarArr10 = (ag20[]) plaqueMapper$fromDto$5.L$7;
                        Map map12 = (Map) plaqueMapper$fromDto$5.L$1;
                        y251 y251Var11 = (y251) plaqueMapper$fromDto$5.L$0;
                        kotlin.b.b(obj4);
                        ag20VarArr3 = ag20VarArr9;
                        p151Var4 = p151Var17;
                        j151Var = j151Var2;
                        pfeVar6 = pfeVar17;
                        eic0Var = eic0Var10;
                        str5 = str16;
                        ag20VarArr2 = ag20VarArr10;
                        map9 = map12;
                        c = 2;
                        i11 = i25;
                        obj = obj4;
                        pfeVar2 = pfeVar12;
                        y251Var6 = y251Var11;
                        ag20Var = null;
                        cg20Var3 = (cg20) obj;
                        if (cg20Var3 == null) {
                        }
                        break;
                    case 5:
                        int i26 = plaqueMapper$fromDto$5.I$0;
                        p151 p151Var18 = (p151) plaqueMapper$fromDto$5.L$15;
                        pfe pfeVar18 = (pfe) plaqueMapper$fromDto$5.L$14;
                        String str17 = (String) plaqueMapper$fromDto$5.L$13;
                        ag20[] ag20VarArr11 = (ag20[]) plaqueMapper$fromDto$5.L$12;
                        p151 p151Var19 = (p151) plaqueMapper$fromDto$5.L$11;
                        pfe pfeVar19 = (pfe) plaqueMapper$fromDto$5.L$10;
                        eic0Var5 = (eic0) plaqueMapper$fromDto$5.L$9;
                        str9 = (String) plaqueMapper$fromDto$5.L$8;
                        ag20[] ag20VarArr12 = (ag20[]) plaqueMapper$fromDto$5.L$7;
                        Map map13 = (Map) plaqueMapper$fromDto$5.L$1;
                        y251 y251Var12 = (y251) plaqueMapper$fromDto$5.L$0;
                        kotlin.b.b(obj4);
                        p151Var8 = p151Var18;
                        pfeVar9 = pfeVar18;
                        str10 = str17;
                        map9 = map13;
                        obj3 = obj4;
                        pfeVar8 = pfeVar19;
                        pfeVar5 = pfeVar12;
                        i12 = i26;
                        ag20VarArr5 = ag20VarArr11;
                        y251Var3 = y251Var12;
                        p151Var9 = p151Var19;
                        ag20VarArr4 = ag20VarArr12;
                        cg20Var4 = (cg20) obj3;
                        if (cg20Var4 != null) {
                        }
                        return null;
                    case 6:
                        i14 = plaqueMapper$fromDto$5.I$1;
                        ag20VarArr7 = (ag20[]) plaqueMapper$fromDto$5.L$13;
                        p151Var9 = (p151) plaqueMapper$fromDto$5.L$12;
                        pfeVar10 = (pfe) plaqueMapper$fromDto$5.L$11;
                        eic0Var6 = (eic0) plaqueMapper$fromDto$5.L$10;
                        str11 = (String) plaqueMapper$fromDto$5.L$9;
                        ag20VarArr6 = (ag20[]) plaqueMapper$fromDto$5.L$7;
                        y251Var4 = (y251) plaqueMapper$fromDto$5.L$0;
                        kotlin.b.b(obj4);
                        pfeVar5 = pfeVar12;
                        cg20Var5 = (cg20) obj4;
                        if (cg20Var5 == null) {
                        }
                        break;
                    case 7:
                        ?? r0 = (eic0) plaqueMapper$fromDto$5.L$8;
                        String str18 = (String) plaqueMapper$fromDto$5.L$7;
                        pfe pfeVar20 = (pfe) plaqueMapper$fromDto$5.L$6;
                        p151 p151Var20 = (p151) plaqueMapper$fromDto$5.L$5;
                        kotlin.b.b(obj4);
                        dic0Var = r0;
                        str3 = str18;
                        pfeVar4 = pfeVar20;
                        p151Var3 = p151Var20;
                        cg20Var6 = (cg20) obj4;
                        if (cg20Var6 != null) {
                        }
                        return null;
                    case 8:
                        i17 = plaqueMapper$fromDto$5.I$2;
                        i19 = plaqueMapper$fromDto$5.I$1;
                        i18 = plaqueMapper$fromDto$5.I$0;
                        it2 = (Iterator) plaqueMapper$fromDto$5.L$11;
                        ?? r8 = (Collection) plaqueMapper$fromDto$5.L$9;
                        pfe pfeVar21 = (pfe) plaqueMapper$fromDto$5.L$6;
                        p151Var10 = (p151) plaqueMapper$fromDto$5.L$5;
                        set3 = (Set) plaqueMapper$fromDto$5.L$4;
                        map7 = (Map) plaqueMapper$fromDto$5.L$3;
                        map6 = (Map) plaqueMapper$fromDto$5.L$2;
                        map8 = (Map) plaqueMapper$fromDto$5.L$1;
                        y251Var5 = (y251) plaqueMapper$fromDto$5.L$0;
                        kotlin.b.b(obj4);
                        pfeVar11 = pfeVar21;
                        i5 = 2;
                        arrayList2 = r8;
                        eg20 eg20Var22 = (eg20) obj4;
                        Map map112 = map7;
                        eg20Var = eg20Var22;
                        i16 = i18;
                        p151Var2 = p151Var10;
                        i7 = i19;
                        map9 = map8;
                        arrayList = arrayList2;
                        y251Var2 = y251Var5;
                        it = it2;
                        plaqueMapper$fromDto$52 = plaqueMapper$fromDto$5;
                        map4 = map112;
                        map5 = map6;
                        set2 = set3;
                        i8 = i17;
                        pfeVar3 = pfeVar11;
                        if (eg20Var != null) {
                        }
                        i6 = i16;
                        if (!it.hasNext()) {
                        }
                        break;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        plaqueMapper$fromDto$5 = new PlaqueMapper$fromDto$5(this, continuationImpl);
        Object obj42 = plaqueMapper$fromDto$5.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plaqueMapper$fromDto$5.label;
        j151 j151Var22 = j151.a;
        pfe pfeVar122 = pfe.d;
        switch (i) {
        }
    }

    public final LinkedHashMap d(plc0 plc0Var) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        Iterator it = plc0Var.d.iterator();
        while (it.hasNext()) {
            arrayList.add(((uhh) it.next()).d);
        }
        Iterator it2 = plc0Var.e.iterator();
        while (it2.hasNext()) {
            arrayList.add(((uhh) it2.next()).d);
        }
        Iterator it3 = plc0Var.c.iterator();
        while (it3.hasNext()) {
            arrayList.add(((uhh) it3.next()).d);
        }
        Iterator it4 = plc0Var.b.iterator();
        while (it4.hasNext()) {
            arrayList.add(((qyd) it4.next()).e());
        }
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            rh60 rh60Var = (rh60) it5.next();
            if (rh60Var != null && (rh60Var instanceof qh60)) {
                linkedHashSet.add(((qh60) rh60Var).b());
            }
        }
        for (y251 y251Var : plc0Var.a) {
            if (y251Var instanceof m251) {
                linkedHashSet.add(((m251) y251Var).e());
            }
        }
        int d = gw00.d(tcc.n(linkedHashSet, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (Object obj : linkedHashSet) {
            linkedHashMap.put(obj, tje.h(this.e, this.c, null, new PlaqueMapper$imagesDeferredMap$7$1(this, (String) obj, null), 2));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(qh60 qh60Var, Map map, ContinuationImpl continuationImpl) {
        PlaqueMapper$mapPlaqueIconNotification$1 plaqueMapper$mapPlaqueIconNotification$1;
        int i;
        PlaqueModel$Notification$Position k;
        PlaqueModel$Notification$Position plaqueModel$Notification$Position;
        Drawable drawable;
        if (continuationImpl instanceof PlaqueMapper$mapPlaqueIconNotification$1) {
            plaqueMapper$mapPlaqueIconNotification$1 = (PlaqueMapper$mapPlaqueIconNotification$1) continuationImpl;
            int i2 = plaqueMapper$mapPlaqueIconNotification$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plaqueMapper$mapPlaqueIconNotification$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plaqueMapper$mapPlaqueIconNotification$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plaqueMapper$mapPlaqueIconNotification$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    NotificationDto$Position a = qh60Var.a();
                    if (a == null || (k = k(a)) == null) {
                        return null;
                    }
                    noh nohVar = (noh) map.get(qh60Var.b());
                    if (nohVar != null) {
                        plaqueMapper$mapPlaqueIconNotification$1.L$0 = qh60Var;
                        plaqueMapper$mapPlaqueIconNotification$1.L$1 = null;
                        plaqueMapper$mapPlaqueIconNotification$1.L$2 = k;
                        plaqueMapper$mapPlaqueIconNotification$1.label = 1;
                        Object k2 = nohVar.k(plaqueMapper$mapPlaqueIconNotification$1);
                        if (k2 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        plaqueModel$Notification$Position = k;
                        obj = k2;
                    }
                    plaqueModel$Notification$Position = k;
                    drawable = EmptyDrawable.INSTANCE;
                    return new koc0(new qf20(qh60Var.b(), drawable), plaqueModel$Notification$Position);
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                PlaqueModel$Notification$Position plaqueModel$Notification$Position2 = (PlaqueModel$Notification$Position) plaqueMapper$mapPlaqueIconNotification$1.L$2;
                qh60 qh60Var2 = (qh60) plaqueMapper$mapPlaqueIconNotification$1.L$0;
                kotlin.b.b(obj);
                plaqueModel$Notification$Position = plaqueModel$Notification$Position2;
                qh60Var = qh60Var2;
                drawable = (Drawable) obj;
                if (drawable == null) {
                    k = plaqueModel$Notification$Position;
                    plaqueModel$Notification$Position = k;
                    drawable = EmptyDrawable.INSTANCE;
                }
                return new koc0(new qf20(qh60Var.b(), drawable), plaqueModel$Notification$Position);
            }
        }
        plaqueMapper$mapPlaqueIconNotification$1 = new PlaqueMapper$mapPlaqueIconNotification$1(this, continuationImpl);
        Object obj2 = plaqueMapper$mapPlaqueIconNotification$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plaqueMapper$mapPlaqueIconNotification$1.label;
        if (i != 0) {
        }
        drawable = (Drawable) obj2;
        if (drawable == null) {
        }
        return new koc0(new qf20(qh60Var.b(), drawable), plaqueModel$Notification$Position);
    }

    public final Object f(rh60 rh60Var, Map map, ContinuationImpl continuationImpl) {
        NotificationDto$Position b;
        PlaqueModel$Notification$Position k;
        if (rh60Var instanceof qh60) {
            Object e = e((qh60) rh60Var, map, continuationImpl);
            return e == CoroutineSingletons.COROUTINE_SUSPENDED ? e : (loc0) e;
        }
        if (!(rh60Var instanceof nh60)) {
            w511.b();
            return null;
        }
        nh60 nh60Var = (nh60) rh60Var;
        if (nh60Var.a() < 1 || (b = nh60Var.b()) == null || (k = k(b)) == null) {
            return null;
        }
        return new joc0(k, nh60Var.a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    public final l8s g(z1x z1xVar, Map map) {
        FormattedText$FontStyle formattedText$FontStyle;
        ?? r0;
        String o = o(this, z1xVar.f(), map);
        String c = z1xVar.c();
        if (c == null || (formattedText$FontStyle = FormattedText$FontStyle.valueOf(c.toUpperCase(Locale.ROOT))) == null) {
            formattedText$FontStyle = FormattedText$FontStyle.NORMAL;
        }
        FormattedText$FontStyle formattedText$FontStyle2 = formattedText$FontStyle;
        String d = z1xVar.d();
        FormattedText$FontWeight valueOf = d != null ? FormattedText$FontWeight.valueOf(d.toUpperCase(Locale.ROOT)) : null;
        Integer b = z1xVar.b();
        List<String> g = z1xVar.g();
        if (g != null) {
            r0 = new ArrayList();
            for (String str : g) {
                FormattedText$TextDecoration valueOf2 = str != null ? FormattedText$TextDecoration.valueOf(str) : null;
                if (valueOf2 != null) {
                    r0.add(valueOf2);
                }
            }
        } else {
            r0 = EmptyList.a;
        }
        List list = r0;
        String a = z1xVar.a();
        if (a == null) {
            a = "";
        }
        return new l8s(o, formattedText$FontStyle2, valueOf, b, list, a, z1xVar.e());
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x019f, code lost:
    
        if (r1 == r7) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v18, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v11, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v10, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x019f -> B:11:0x01a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0121 -> B:26:0x0125). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(plc0 plc0Var, Map map, ContinuationImpl continuationImpl) {
        PlaqueMapper$mapToDefaultPlaqueConfig$1 plaqueMapper$mapToDefaultPlaqueConfig$1;
        int i;
        LinkedHashMap d;
        Iterator it;
        LinkedHashMap linkedHashMap;
        ArrayList arrayList;
        PlaqueMapper$mapToDefaultPlaqueConfig$1 plaqueMapper$mapToDefaultPlaqueConfig$12;
        plc0 plc0Var2;
        int i2;
        int i3;
        int i4;
        Map map2;
        Iterator it2;
        ArrayList arrayList2;
        Iterator it3;
        PlaqueMapper$mapToDefaultPlaqueConfig$1 plaqueMapper$mapToDefaultPlaqueConfig$13;
        ArrayList arrayList3;
        int i5;
        int i6;
        int i7;
        b bVar = this;
        if (continuationImpl instanceof PlaqueMapper$mapToDefaultPlaqueConfig$1) {
            plaqueMapper$mapToDefaultPlaqueConfig$1 = (PlaqueMapper$mapToDefaultPlaqueConfig$1) continuationImpl;
            int i8 = plaqueMapper$mapToDefaultPlaqueConfig$1.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                plaqueMapper$mapToDefaultPlaqueConfig$1.label = i8 - Integer.MIN_VALUE;
                Object obj = plaqueMapper$mapToDefaultPlaqueConfig$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plaqueMapper$mapToDefaultPlaqueConfig$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    LinkedHashMap p = p(plc0Var);
                    if (p != null) {
                        d = d(plc0Var);
                        List list = plc0Var.d;
                        ArrayList arrayList4 = new ArrayList();
                        it = list.iterator();
                        PlaqueMapper$mapToDefaultPlaqueConfig$1 plaqueMapper$mapToDefaultPlaqueConfig$14 = plaqueMapper$mapToDefaultPlaqueConfig$1;
                        linkedHashMap = p;
                        arrayList = arrayList4;
                        plaqueMapper$mapToDefaultPlaqueConfig$12 = plaqueMapper$mapToDefaultPlaqueConfig$14;
                        plc0Var2 = plc0Var;
                        i2 = 0;
                        i3 = 0;
                        i4 = 0;
                        map2 = map;
                        it2 = it;
                        if (it2.hasNext()) {
                        }
                    }
                    return null;
                }
                if (i == 1) {
                    int i9 = plaqueMapper$mapToDefaultPlaqueConfig$1.I$2;
                    int i10 = plaqueMapper$mapToDefaultPlaqueConfig$1.I$1;
                    int i11 = plaqueMapper$mapToDefaultPlaqueConfig$1.I$0;
                    Iterator it4 = (Iterator) plaqueMapper$mapToDefaultPlaqueConfig$1.L$8;
                    ?? r8 = (Collection) plaqueMapper$mapToDefaultPlaqueConfig$1.L$6;
                    ?? r12 = (Map) plaqueMapper$mapToDefaultPlaqueConfig$1.L$3;
                    ?? r13 = (Map) plaqueMapper$mapToDefaultPlaqueConfig$1.L$2;
                    Map map3 = (Map) plaqueMapper$mapToDefaultPlaqueConfig$1.L$1;
                    plc0 plc0Var3 = (plc0) plaqueMapper$mapToDefaultPlaqueConfig$1.L$0;
                    kotlin.b.b(obj);
                    plaqueMapper$mapToDefaultPlaqueConfig$12 = plaqueMapper$mapToDefaultPlaqueConfig$1;
                    linkedHashMap = r13;
                    i3 = i10;
                    map2 = map3;
                    i4 = i11;
                    it = it4;
                    i2 = i9;
                    d = r12;
                    ArrayList arrayList5 = r8;
                    rhc0 rhc0Var = (rhc0) obj;
                    if (rhc0Var != null) {
                        arrayList5.add(rhc0Var);
                    }
                    arrayList = arrayList5;
                    plc0Var2 = plc0Var3;
                    it2 = it;
                    if (it2.hasNext()) {
                        uhh uhhVar = (uhh) it2.next();
                        PlaqueModel$Type plaqueModel$Type = PlaqueModel$Type.DEFAULT;
                        plaqueMapper$mapToDefaultPlaqueConfig$12.L$0 = plc0Var2;
                        plaqueMapper$mapToDefaultPlaqueConfig$12.L$1 = map2;
                        plaqueMapper$mapToDefaultPlaqueConfig$12.L$2 = linkedHashMap;
                        plaqueMapper$mapToDefaultPlaqueConfig$12.L$3 = d;
                        plaqueMapper$mapToDefaultPlaqueConfig$12.L$4 = null;
                        plaqueMapper$mapToDefaultPlaqueConfig$12.L$5 = null;
                        plaqueMapper$mapToDefaultPlaqueConfig$12.L$6 = arrayList;
                        plaqueMapper$mapToDefaultPlaqueConfig$12.L$7 = null;
                        plaqueMapper$mapToDefaultPlaqueConfig$12.L$8 = it2;
                        plaqueMapper$mapToDefaultPlaqueConfig$12.L$9 = null;
                        plaqueMapper$mapToDefaultPlaqueConfig$12.L$10 = null;
                        plaqueMapper$mapToDefaultPlaqueConfig$12.L$11 = null;
                        plaqueMapper$mapToDefaultPlaqueConfig$12.I$0 = i4;
                        plaqueMapper$mapToDefaultPlaqueConfig$12.I$1 = i3;
                        plaqueMapper$mapToDefaultPlaqueConfig$12.I$2 = i2;
                        plaqueMapper$mapToDefaultPlaqueConfig$12.I$3 = 0;
                        plaqueMapper$mapToDefaultPlaqueConfig$12.I$4 = 0;
                        plaqueMapper$mapToDefaultPlaqueConfig$12.label = 1;
                        ArrayList arrayList6 = arrayList;
                        obj = bVar.b(uhhVar, linkedHashMap, d, map2, plaqueModel$Type, plaqueMapper$mapToDefaultPlaqueConfig$12);
                        if (obj != coroutineSingletons) {
                            it = it2;
                            plc0Var3 = plc0Var2;
                            arrayList5 = arrayList6;
                            rhc0 rhc0Var2 = (rhc0) obj;
                            if (rhc0Var2 != null) {
                            }
                            arrayList = arrayList5;
                            plc0Var2 = plc0Var3;
                            it2 = it;
                            if (it2.hasNext()) {
                                ArrayList arrayList7 = arrayList;
                                if (arrayList7.isEmpty()) {
                                    arrayList7 = null;
                                }
                                if (arrayList7 == null) {
                                    LogPriority logPriority = LogPriority.ERROR;
                                    pgz pgzVar = bVar.d;
                                    if (pgzVar.e(logPriority)) {
                                        pgzVar.a(logPriority, "PlaqueMapper", "defaultPlaques is empty");
                                    }
                                    return null;
                                }
                                List list2 = plc0Var2.b;
                                ArrayList arrayList8 = new ArrayList();
                                arrayList2 = arrayList7;
                                it3 = list2.iterator();
                                plaqueMapper$mapToDefaultPlaqueConfig$13 = plaqueMapper$mapToDefaultPlaqueConfig$12;
                                arrayList3 = arrayList8;
                                i5 = 0;
                                i6 = 0;
                                i7 = 0;
                                if (it3.hasNext()) {
                                }
                            }
                        }
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i12 = plaqueMapper$mapToDefaultPlaqueConfig$1.I$2;
                    int i13 = plaqueMapper$mapToDefaultPlaqueConfig$1.I$1;
                    int i14 = plaqueMapper$mapToDefaultPlaqueConfig$1.I$0;
                    Iterator it5 = (Iterator) plaqueMapper$mapToDefaultPlaqueConfig$1.L$9;
                    ?? r9 = (Collection) plaqueMapper$mapToDefaultPlaqueConfig$1.L$7;
                    ?? r122 = (List) plaqueMapper$mapToDefaultPlaqueConfig$1.L$4;
                    ?? r132 = (Map) plaqueMapper$mapToDefaultPlaqueConfig$1.L$3;
                    ?? r14 = (Map) plaqueMapper$mapToDefaultPlaqueConfig$1.L$2;
                    Map map4 = (Map) plaqueMapper$mapToDefaultPlaqueConfig$1.L$1;
                    kotlin.b.b(obj);
                    plaqueMapper$mapToDefaultPlaqueConfig$13 = plaqueMapper$mapToDefaultPlaqueConfig$1;
                    linkedHashMap = r14;
                    arrayList2 = r122;
                    it3 = it5;
                    i5 = i12;
                    d = r132;
                    arrayList3 = r9;
                    i7 = i14;
                    i6 = i13;
                    map2 = map4;
                    phc0 phc0Var = (phc0) obj;
                    if (phc0Var != null) {
                        arrayList3.add(phc0Var);
                    }
                    bVar = this;
                    if (it3.hasNext()) {
                        return new hkc0(arrayList3, arrayList2);
                    }
                    qyd qydVar = (qyd) it3.next();
                    plaqueMapper$mapToDefaultPlaqueConfig$13.L$0 = null;
                    plaqueMapper$mapToDefaultPlaqueConfig$13.L$1 = map2;
                    plaqueMapper$mapToDefaultPlaqueConfig$13.L$2 = linkedHashMap;
                    plaqueMapper$mapToDefaultPlaqueConfig$13.L$3 = d;
                    plaqueMapper$mapToDefaultPlaqueConfig$13.L$4 = arrayList2;
                    plaqueMapper$mapToDefaultPlaqueConfig$13.L$5 = null;
                    plaqueMapper$mapToDefaultPlaqueConfig$13.L$6 = null;
                    plaqueMapper$mapToDefaultPlaqueConfig$13.L$7 = arrayList3;
                    plaqueMapper$mapToDefaultPlaqueConfig$13.L$8 = null;
                    plaqueMapper$mapToDefaultPlaqueConfig$13.L$9 = it3;
                    plaqueMapper$mapToDefaultPlaqueConfig$13.L$10 = null;
                    plaqueMapper$mapToDefaultPlaqueConfig$13.L$11 = null;
                    plaqueMapper$mapToDefaultPlaqueConfig$13.L$12 = null;
                    plaqueMapper$mapToDefaultPlaqueConfig$13.I$0 = i7;
                    plaqueMapper$mapToDefaultPlaqueConfig$13.I$1 = i6;
                    plaqueMapper$mapToDefaultPlaqueConfig$13.I$2 = i5;
                    plaqueMapper$mapToDefaultPlaqueConfig$13.I$3 = 0;
                    plaqueMapper$mapToDefaultPlaqueConfig$13.I$4 = 0;
                    plaqueMapper$mapToDefaultPlaqueConfig$13.label = 2;
                    obj = bVar.a(qydVar, linkedHashMap, d, map2, plaqueMapper$mapToDefaultPlaqueConfig$13);
                }
            }
        }
        plaqueMapper$mapToDefaultPlaqueConfig$1 = new PlaqueMapper$mapToDefaultPlaqueConfig$1(bVar, continuationImpl);
        Object obj2 = plaqueMapper$mapToDefaultPlaqueConfig$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plaqueMapper$mapToDefaultPlaqueConfig$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00fa, code lost:
    
        if (r10 != null) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00d7 -> B:10:0x00de). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(plc0 plc0Var, Map map, ContinuationImpl continuationImpl) {
        PlaqueMapper$mapToFallbackPlaqueConfig$1 plaqueMapper$mapToFallbackPlaqueConfig$1;
        int i;
        plc0 plc0Var2;
        PlaqueMapper$mapToFallbackPlaqueConfig$1 plaqueMapper$mapToFallbackPlaqueConfig$12;
        Iterator it;
        ArrayList arrayList;
        int i2;
        int i3;
        int i4;
        int i5;
        Map map2;
        List list;
        b bVar = this;
        if (continuationImpl instanceof PlaqueMapper$mapToFallbackPlaqueConfig$1) {
            plaqueMapper$mapToFallbackPlaqueConfig$1 = (PlaqueMapper$mapToFallbackPlaqueConfig$1) continuationImpl;
            int i6 = plaqueMapper$mapToFallbackPlaqueConfig$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                plaqueMapper$mapToFallbackPlaqueConfig$1.label = i6 - Integer.MIN_VALUE;
                Object obj = plaqueMapper$mapToFallbackPlaqueConfig$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plaqueMapper$mapToFallbackPlaqueConfig$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (plc0Var != null && (r2 = p(plc0Var)) != null) {
                        List list2 = plc0Var.e;
                        ArrayList arrayList2 = new ArrayList();
                        plc0Var2 = plc0Var;
                        plaqueMapper$mapToFallbackPlaqueConfig$12 = plaqueMapper$mapToFallbackPlaqueConfig$1;
                        it = list2.iterator();
                        arrayList = arrayList2;
                        i2 = 0;
                        i3 = 0;
                        i4 = 0;
                        i5 = 0;
                        map2 = map;
                        if (it.hasNext()) {
                        }
                    }
                    list = Collections.singletonList(rhc0.g);
                    return new hkc0(EmptyList.a, list);
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i7 = plaqueMapper$mapToFallbackPlaqueConfig$1.I$3;
                int i8 = plaqueMapper$mapToFallbackPlaqueConfig$1.I$2;
                int i9 = plaqueMapper$mapToFallbackPlaqueConfig$1.I$1;
                int i10 = plaqueMapper$mapToFallbackPlaqueConfig$1.I$0;
                Iterator it2 = (Iterator) plaqueMapper$mapToFallbackPlaqueConfig$1.L$7;
                ?? r12 = (Collection) plaqueMapper$mapToFallbackPlaqueConfig$1.L$5;
                ?? r13 = (Map) plaqueMapper$mapToFallbackPlaqueConfig$1.L$2;
                Map map3 = (Map) plaqueMapper$mapToFallbackPlaqueConfig$1.L$1;
                plc0 plc0Var3 = (plc0) plaqueMapper$mapToFallbackPlaqueConfig$1.L$0;
                kotlin.b.b(obj);
                i2 = i7;
                it = it2;
                plc0Var2 = plc0Var3;
                i5 = i10;
                plaqueMapper$mapToFallbackPlaqueConfig$12 = plaqueMapper$mapToFallbackPlaqueConfig$1;
                arrayList = r12;
                int i11 = i8;
                map2 = map3;
                i4 = i9;
                LinkedHashMap linkedHashMap = r13;
                rhc0 rhc0Var = (rhc0) obj;
                if (rhc0Var != null) {
                    arrayList.add(rhc0Var);
                }
                LinkedHashMap p = linkedHashMap;
                i3 = i11;
                bVar = this;
                if (it.hasNext()) {
                    uhh uhhVar = (uhh) it.next();
                    LinkedHashMap d = bVar.d(plc0Var2);
                    PlaqueModel$Type plaqueModel$Type = PlaqueModel$Type.FALLBACK;
                    plaqueMapper$mapToFallbackPlaqueConfig$12.L$0 = plc0Var2;
                    plaqueMapper$mapToFallbackPlaqueConfig$12.L$1 = map2;
                    plaqueMapper$mapToFallbackPlaqueConfig$12.L$2 = p;
                    plaqueMapper$mapToFallbackPlaqueConfig$12.L$3 = null;
                    plaqueMapper$mapToFallbackPlaqueConfig$12.L$4 = null;
                    plaqueMapper$mapToFallbackPlaqueConfig$12.L$5 = arrayList;
                    plaqueMapper$mapToFallbackPlaqueConfig$12.L$6 = null;
                    plaqueMapper$mapToFallbackPlaqueConfig$12.L$7 = it;
                    plaqueMapper$mapToFallbackPlaqueConfig$12.L$8 = null;
                    plaqueMapper$mapToFallbackPlaqueConfig$12.L$9 = null;
                    plaqueMapper$mapToFallbackPlaqueConfig$12.L$10 = null;
                    plaqueMapper$mapToFallbackPlaqueConfig$12.I$0 = i5;
                    plaqueMapper$mapToFallbackPlaqueConfig$12.I$1 = i4;
                    plaqueMapper$mapToFallbackPlaqueConfig$12.I$2 = i3;
                    plaqueMapper$mapToFallbackPlaqueConfig$12.I$3 = i2;
                    plaqueMapper$mapToFallbackPlaqueConfig$12.I$4 = 0;
                    plaqueMapper$mapToFallbackPlaqueConfig$12.I$5 = 0;
                    plaqueMapper$mapToFallbackPlaqueConfig$12.label = 1;
                    Iterator it3 = it;
                    ArrayList arrayList3 = arrayList;
                    Object b = bVar.b(uhhVar, p, d, map2, plaqueModel$Type, plaqueMapper$mapToFallbackPlaqueConfig$12);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    i11 = i3;
                    arrayList = arrayList3;
                    linkedHashMap = p;
                    obj = b;
                    it = it3;
                    rhc0 rhc0Var2 = (rhc0) obj;
                    if (rhc0Var2 != null) {
                    }
                    LinkedHashMap p2 = linkedHashMap;
                    i3 = i11;
                    bVar = this;
                    if (it.hasNext()) {
                        ArrayList arrayList4 = arrayList;
                        list = arrayList4.isEmpty() ? null : arrayList4;
                    }
                }
            }
        }
        plaqueMapper$mapToFallbackPlaqueConfig$1 = new PlaqueMapper$mapToFallbackPlaqueConfig$1(bVar, continuationImpl);
        Object obj2 = plaqueMapper$mapToFallbackPlaqueConfig$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plaqueMapper$mapToFallbackPlaqueConfig$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r16v0, types: [com.yandex.plus.home.plaque.repository.graphql.b] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x00c7 -> B:10:0x00ca). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(plc0 plc0Var, Map map, ContinuationImpl continuationImpl) {
        PlaqueMapper$mapToPrefetchPlaqueConfig$1 plaqueMapper$mapToPrefetchPlaqueConfig$1;
        int i;
        LinkedHashMap d;
        PlaqueMapper$mapToPrefetchPlaqueConfig$1 plaqueMapper$mapToPrefetchPlaqueConfig$12;
        Iterator it;
        ArrayList arrayList;
        int i2;
        int i3;
        int i4;
        Map map2;
        LinkedHashMap linkedHashMap;
        if (continuationImpl instanceof PlaqueMapper$mapToPrefetchPlaqueConfig$1) {
            plaqueMapper$mapToPrefetchPlaqueConfig$1 = (PlaqueMapper$mapToPrefetchPlaqueConfig$1) continuationImpl;
            int i5 = plaqueMapper$mapToPrefetchPlaqueConfig$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                plaqueMapper$mapToPrefetchPlaqueConfig$1.label = i5 - Integer.MIN_VALUE;
                Object obj = plaqueMapper$mapToPrefetchPlaqueConfig$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plaqueMapper$mapToPrefetchPlaqueConfig$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    LinkedHashMap p = p(plc0Var);
                    if (p != null) {
                        d = d(plc0Var);
                        List list = plc0Var.c;
                        ArrayList arrayList2 = new ArrayList();
                        plaqueMapper$mapToPrefetchPlaqueConfig$12 = plaqueMapper$mapToPrefetchPlaqueConfig$1;
                        it = list.iterator();
                        arrayList = arrayList2;
                        i2 = 0;
                        i3 = 0;
                        i4 = 0;
                        map2 = map;
                        linkedHashMap = p;
                        if (it.hasNext()) {
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i6 = plaqueMapper$mapToPrefetchPlaqueConfig$1.I$2;
                int i7 = plaqueMapper$mapToPrefetchPlaqueConfig$1.I$1;
                int i8 = plaqueMapper$mapToPrefetchPlaqueConfig$1.I$0;
                Iterator it2 = (Iterator) plaqueMapper$mapToPrefetchPlaqueConfig$1.L$8;
                ?? r11 = (Collection) plaqueMapper$mapToPrefetchPlaqueConfig$1.L$6;
                ?? r12 = (Map) plaqueMapper$mapToPrefetchPlaqueConfig$1.L$3;
                ?? r13 = (Map) plaqueMapper$mapToPrefetchPlaqueConfig$1.L$2;
                Map map3 = (Map) plaqueMapper$mapToPrefetchPlaqueConfig$1.L$1;
                kotlin.b.b(obj);
                arrayList = r11;
                i2 = i6;
                d = r12;
                i3 = i7;
                map2 = map3;
                it = it2;
                plaqueMapper$mapToPrefetchPlaqueConfig$12 = plaqueMapper$mapToPrefetchPlaqueConfig$1;
                linkedHashMap = r13;
                i4 = i8;
                rhc0 rhc0Var = (rhc0) obj;
                if (rhc0Var != null) {
                    arrayList.add(rhc0Var);
                }
                if (it.hasNext()) {
                    uhh uhhVar = (uhh) it.next();
                    PlaqueModel$Type plaqueModel$Type = PlaqueModel$Type.PREFETCH;
                    plaqueMapper$mapToPrefetchPlaqueConfig$12.L$0 = null;
                    plaqueMapper$mapToPrefetchPlaqueConfig$12.L$1 = map2;
                    plaqueMapper$mapToPrefetchPlaqueConfig$12.L$2 = linkedHashMap;
                    plaqueMapper$mapToPrefetchPlaqueConfig$12.L$3 = d;
                    plaqueMapper$mapToPrefetchPlaqueConfig$12.L$4 = null;
                    plaqueMapper$mapToPrefetchPlaqueConfig$12.L$5 = null;
                    plaqueMapper$mapToPrefetchPlaqueConfig$12.L$6 = arrayList;
                    plaqueMapper$mapToPrefetchPlaqueConfig$12.L$7 = null;
                    plaqueMapper$mapToPrefetchPlaqueConfig$12.L$8 = it;
                    plaqueMapper$mapToPrefetchPlaqueConfig$12.L$9 = null;
                    plaqueMapper$mapToPrefetchPlaqueConfig$12.L$10 = null;
                    plaqueMapper$mapToPrefetchPlaqueConfig$12.L$11 = null;
                    plaqueMapper$mapToPrefetchPlaqueConfig$12.I$0 = i4;
                    plaqueMapper$mapToPrefetchPlaqueConfig$12.I$1 = i3;
                    plaqueMapper$mapToPrefetchPlaqueConfig$12.I$2 = i2;
                    plaqueMapper$mapToPrefetchPlaqueConfig$12.I$3 = 0;
                    plaqueMapper$mapToPrefetchPlaqueConfig$12.I$4 = 0;
                    plaqueMapper$mapToPrefetchPlaqueConfig$12.label = 1;
                    obj = b(uhhVar, linkedHashMap, d, map2, plaqueModel$Type, plaqueMapper$mapToPrefetchPlaqueConfig$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    rhc0 rhc0Var2 = (rhc0) obj;
                    if (rhc0Var2 != null) {
                    }
                    if (it.hasNext()) {
                        ArrayList arrayList3 = arrayList;
                        if (arrayList3.isEmpty()) {
                            arrayList3 = null;
                        }
                        if (arrayList3 != null) {
                            return new hkc0(EmptyList.a, arrayList3);
                        }
                        LogPriority logPriority = LogPriority.ERROR;
                        pgz pgzVar = this.d;
                        if (pgzVar.e(logPriority)) {
                            pgzVar.a(logPriority, "PlaqueMapper", "prefetchPlaques is empty");
                        }
                        return null;
                    }
                }
            }
        }
        plaqueMapper$mapToPrefetchPlaqueConfig$1 = new PlaqueMapper$mapToPrefetchPlaqueConfig$1(this, continuationImpl);
        Object obj2 = plaqueMapper$mapToPrefetchPlaqueConfig$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plaqueMapper$mapToPrefetchPlaqueConfig$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(List list, List list2, Map map, ContinuationImpl continuationImpl) {
        PlaqueMapper$mapToTextModel$1 plaqueMapper$mapToTextModel$1;
        int i;
        m8s m8sVar;
        if (continuationImpl instanceof PlaqueMapper$mapToTextModel$1) {
            plaqueMapper$mapToTextModel$1 = (PlaqueMapper$mapToTextModel$1) continuationImpl;
            int i2 = plaqueMapper$mapToTextModel$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plaqueMapper$mapToTextModel$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plaqueMapper$mapToTextModel$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plaqueMapper$mapToTextModel$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (!map.containsKey((String) it.next())) {
                            return null;
                        }
                    }
                    List list3 = list;
                    ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(n((a2x) it2.next(), map));
                    }
                    m8s m8sVar2 = new m8s(arrayList);
                    plaqueMapper$mapToTextModel$1.L$0 = null;
                    plaqueMapper$mapToTextModel$1.L$1 = null;
                    plaqueMapper$mapToTextModel$1.L$2 = null;
                    plaqueMapper$mapToTextModel$1.L$3 = m8sVar2;
                    plaqueMapper$mapToTextModel$1.label = 1;
                    obj = this.a.d(m8sVar2, plaqueMapper$mapToTextModel$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    m8sVar = m8sVar2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    m8sVar = (m8s) plaqueMapper$mapToTextModel$1.L$3;
                    kotlin.b.b(obj);
                }
                return new cg20((CharSequence) obj, m8sVar);
            }
        }
        plaqueMapper$mapToTextModel$1 = new PlaqueMapper$mapToTextModel$1(this, continuationImpl);
        Object obj2 = plaqueMapper$mapToTextModel$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plaqueMapper$mapToTextModel$1.label;
        if (i != 0) {
        }
        return new cg20((CharSequence) obj2, m8sVar);
    }

    public final h8s n(a2x a2xVar, Map map) {
        FormattedText$VerticalAlignment formattedText$VerticalAlignment;
        if (a2xVar instanceof z1x) {
            return g((z1x) a2xVar, map);
        }
        if (a2xVar instanceof w1x) {
            w1x w1xVar = (w1x) a2xVar;
            return new k8s(w1xVar.b(), g(w1xVar.a(), map));
        }
        if (!(a2xVar instanceof t1x)) {
            if (!(a2xVar instanceof q1x)) {
                w511.b();
                return null;
            }
            q1x q1xVar = (q1x) a2xVar;
            String b = q1xVar.b();
            c8s c8sVar = b != null ? new c8s(b) : null;
            List a = q1xVar.a();
            ArrayList arrayList = new ArrayList(tcc.n(a, 10));
            Iterator it = a.iterator();
            while (it.hasNext()) {
                arrayList.add(n((a2x) it.next(), map));
            }
            return new y7s(c8sVar, arrayList);
        }
        t1x t1xVar = (t1x) a2xVar;
        String c = t1xVar.c();
        String d = t1xVar.d();
        if (d == null || (formattedText$VerticalAlignment = FormattedText$VerticalAlignment.valueOf(d)) == null) {
            formattedText$VerticalAlignment = FormattedText$VerticalAlignment.BASELINE;
        }
        FormattedText$VerticalAlignment formattedText$VerticalAlignment2 = formattedText$VerticalAlignment;
        String a2 = t1xVar.a();
        if (a2 == null) {
            a2 = "";
        }
        String str = a2;
        Integer e = t1xVar.e();
        int intValue = e != null ? e.intValue() : 0;
        Integer b2 = t1xVar.b();
        return new d8s(c, formattedText$VerticalAlignment2, str, intValue, b2 != null ? b2.intValue() : 0, 32);
    }

    public final LinkedHashMap p(plc0 plc0Var) {
        List list = plc0Var.a;
        List list2 = list;
        int d = gw00.d(tcc.n(list2, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (Object obj : list2) {
            linkedHashMap.put(((y251) obj).getId(), obj);
        }
        if (linkedHashMap.size() == list.size()) {
            return linkedHashMap;
        }
        LogPriority logPriority = LogPriority.ERROR;
        pgz pgzVar = this.d;
        if (!pgzVar.e(logPriority)) {
            return null;
        }
        StringBuilder sb = new StringBuilder("There are equal ids for widgets: ");
        List list3 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(((y251) it.next()).getId());
        }
        sb.append(kotlin.collections.a.k0(arrayList, linkedHashMap.keySet()));
        pgzVar.a(logPriority, "PlaqueMapper", sb.toString());
        return null;
    }
}
