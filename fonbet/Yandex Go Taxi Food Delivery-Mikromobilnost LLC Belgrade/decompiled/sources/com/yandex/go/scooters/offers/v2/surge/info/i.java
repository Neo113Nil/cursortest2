package com.yandex.go.scooters.offers.v2.surge.info;

import com.yandex.passport.sloth.ui.dependencies.m;
import defpackage.bvf0;
import defpackage.c3p0;
import defpackage.e3p0;
import defpackage.g8e;
import defpackage.k7x0;
import defpackage.m7x0;
import defpackage.ny61;
import defpackage.pwy0;
import defpackage.q5z;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.u2p0;
import defpackage.uyj;
import defpackage.v2p0;
import defpackage.w2p0;
import defpackage.w511;
import defpackage.x2p0;
import defpackage.y2p0;
import defpackage.y5p0;
import defpackage.z2p0;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes13.dex */
public final class i {
    public final e a;
    public final tpr b;

    public i(tt2 tt2Var, pwy0 pwy0Var, y5p0 y5p0Var, e eVar) {
        this.a = eVar;
        tpr t = kotlinx.coroutines.flow.e.t(new h(new m0(kotlinx.coroutines.flow.e.d(y5p0Var.c), pwy0Var.a(), new ScootersSurgeInfoUiStateInteractor$uiStateFlow$1(3, null)), this));
        tt2Var.getClass();
        this.b = kotlinx.coroutines.flow.e.F(t, uyj.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0129 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r20v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0108 -> B:10:0x010c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(i iVar, y2p0 y2p0Var, ContinuationImpl continuationImpl) {
        ScootersSurgeInfoUiStateInteractor$createInfoItems$1 scootersSurgeInfoUiStateInteractor$createInfoItems$1;
        int i;
        ArrayList t;
        y2p0 y2p0Var2;
        int size;
        ?? r9;
        Object n;
        i iVar2 = iVar;
        iVar2.getClass();
        if (continuationImpl instanceof ScootersSurgeInfoUiStateInteractor$createInfoItems$1) {
            scootersSurgeInfoUiStateInteractor$createInfoItems$1 = (ScootersSurgeInfoUiStateInteractor$createInfoItems$1) continuationImpl;
            int i2 = scootersSurgeInfoUiStateInteractor$createInfoItems$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersSurgeInfoUiStateInteractor$createInfoItems$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersSurgeInfoUiStateInteractor$createInfoItems$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersSurgeInfoUiStateInteractor$createInfoItems$1.label;
                int i3 = -1;
                int i4 = 1;
                if (i != 0) {
                    t = g8e.t(obj);
                    y2p0Var2 = y2p0Var;
                    size = ((List) y2p0Var2.g.j).size() - 1;
                    r9 = 1;
                    if (i3 < size) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i5 = scootersSurgeInfoUiStateInteractor$createInfoItems$1.I$1;
                    ?? r8 = (List) scootersSurgeInfoUiStateInteractor$createInfoItems$1.L$1;
                    y2p0 y2p0Var3 = (y2p0) scootersSurgeInfoUiStateInteractor$createInfoItems$1.L$0;
                    kotlin.b.b(obj);
                    int i6 = -1;
                    ArrayList arrayList = r8;
                    e3p0 e3p0Var = (e3p0) obj;
                    boolean z = e3p0Var instanceof c3p0;
                    arrayList.add(0, e3p0Var);
                    int i7 = i5 - 1;
                    ArrayList arrayList2 = arrayList;
                    size = i7;
                    t = arrayList2;
                    i3 = i6;
                    y2p0Var2 = y2p0Var3;
                    i4 = 1;
                    r9 = z;
                    iVar2 = iVar;
                    if (i3 < size) {
                        x2p0 x2p0Var = (x2p0) ((List) y2p0Var2.g.j).get(size);
                        scootersSurgeInfoUiStateInteractor$createInfoItems$1.L$0 = y2p0Var2;
                        scootersSurgeInfoUiStateInteractor$createInfoItems$1.L$1 = t;
                        scootersSurgeInfoUiStateInteractor$createInfoItems$1.I$0 = r9;
                        scootersSurgeInfoUiStateInteractor$createInfoItems$1.I$1 = size;
                        scootersSurgeInfoUiStateInteractor$createInfoItems$1.label = i4;
                        e eVar = iVar2.a;
                        if (x2p0Var instanceof v2p0) {
                            Object a = eVar.a((v2p0) x2p0Var, scootersSurgeInfoUiStateInteractor$createInfoItems$1);
                            if (a != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                a = (e3p0) a;
                            }
                            i6 = i3;
                            n = a;
                        } else if (x2p0Var instanceof u2p0) {
                            k7x0 k7x0Var = eVar.a;
                            double d = y2p0Var2.a;
                            m mVar = y2p0Var2.g;
                            i6 = i3;
                            String str = (String) mVar.b;
                            String str2 = (String) mVar.f;
                            String str3 = (String) mVar.e;
                            String str4 = (String) mVar.a;
                            n = new z2p0(d, q5z.S(str), ((u2p0) x2p0Var).a, str4.length() > 0 ? ((m7x0) k7x0Var).a(str4) : "", str3.length() > 0 ? ((m7x0) k7x0Var).a(str3) : "", str2.length() > 0 ? ((m7x0) k7x0Var).a(str2) : "", r9 ^ 1);
                        } else {
                            i6 = i3;
                            if (!(x2p0Var instanceof w2p0)) {
                                w511.b();
                                return null;
                            }
                            eVar.getClass();
                            n = bvf0.n(new ScootersSurgeInfoContentItemMapper$mapTextBlockItem$2(eVar, (w2p0) x2p0Var, r9, null), scootersSurgeInfoUiStateInteractor$createInfoItems$1);
                            if (n != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                n = (e3p0) n;
                            }
                        }
                        if (n == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        y2p0Var3 = y2p0Var2;
                        i5 = size;
                        arrayList = t;
                        obj = n;
                        e3p0 e3p0Var2 = (e3p0) obj;
                        boolean z2 = e3p0Var2 instanceof c3p0;
                        arrayList.add(0, e3p0Var2);
                        int i72 = i5 - 1;
                        ArrayList arrayList22 = arrayList;
                        size = i72;
                        t = arrayList22;
                        i3 = i6;
                        y2p0Var2 = y2p0Var3;
                        i4 = 1;
                        r9 = z2;
                        iVar2 = iVar;
                        if (i3 < size) {
                            return t;
                        }
                    }
                }
            }
        }
        scootersSurgeInfoUiStateInteractor$createInfoItems$1 = new ScootersSurgeInfoUiStateInteractor$createInfoItems$1(iVar2, continuationImpl);
        Object obj2 = scootersSurgeInfoUiStateInteractor$createInfoItems$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersSurgeInfoUiStateInteractor$createInfoItems$1.label;
        int i32 = -1;
        int i42 = 1;
        if (i != 0) {
        }
    }
}
