package com.yandex.go.places.organization.card.impl.domain.interactors.map.common;

import com.yandex.go.places.map.data.repositories.g;
import com.yandex.go.places.map.data.repositories.h;
import com.yandex.go.places.map.domain.entities.PinLayer;
import com.yandex.go.places.map.domain.layer.c;
import com.yandex.go.places.models.data.entities.network.map.e;
import defpackage.ehq0;
import defpackage.fo00;
import defpackage.gn00;
import defpackage.in00;
import defpackage.k7v;
import defpackage.kn00;
import defpackage.ny61;
import defpackage.p370;
import defpackage.pfq0;
import defpackage.u55;
import defpackage.un00;
import defpackage.vn00;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ u55 b;

    public a(vpr vprVar, u55 u55Var) {
        this.a = vprVar;
        this.b = u55Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x01dc, code lost:
    
        if (r14 == r3) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x04a3, code lost:
    
        if (r12.emit(r0, r2) == r3) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0387, code lost:
    
        if (r14 == r3) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02e9, code lost:
    
        if (r14 == r3) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02c1, code lost:
    
        if (r14 == r3) goto L155;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a3  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        BaseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1 baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1;
        vpr vprVar;
        ehq0 ehq0Var;
        vpr vprVar2;
        Iterator it;
        kn00 kn00Var;
        String str;
        String str2;
        CharSequence charSequence;
        k7v a;
        boolean booleanValue;
        vpr vprVar3;
        kn00 kn00Var2;
        PinLayer pinLayer;
        kn00 kn00Var3;
        vpr vprVar4;
        in00 in00Var;
        kn00 kn00Var4;
        vpr vprVar5;
        PinLayer pinLayer2;
        u55 u55Var;
        PinLayer a2;
        g e;
        kn00 kn00Var5;
        vpr vprVar6;
        in00 in00Var2;
        in00 in00Var3;
        PinLayer pinLayer3;
        vpr vprVar7;
        g e2;
        vpr vprVar8;
        ehq0 ehq0Var2;
        u55 u55Var2 = this.b;
        c cVar = u55Var2.c;
        if (continuation instanceof BaseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1) {
            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1 = (BaseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1) continuation;
            int i = baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.label = i - Integer.MIN_VALUE;
                Object obj2 = baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = 12;
                switch (baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.label) {
                    case 0:
                        kotlin.b.b(obj2);
                        e eVar = (e) obj;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$0 = null;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$1 = null;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$2 = null;
                        vprVar = this.a;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$3 = vprVar;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$4 = null;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$5 = null;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.label = 1;
                        if (eVar == null) {
                            obj2 = null;
                            break;
                        } else {
                            Object n = u55Var2.a.n(eVar, baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1);
                            if (n != coroutineSingletons) {
                                n = (kn00) n;
                            }
                            obj2 = n;
                            break;
                        }
                    case 1:
                        vprVar = (vpr) baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$3;
                        kotlin.b.b(obj2);
                        kn00 kn00Var6 = (kn00) obj2;
                        if (kn00Var6 instanceof in00) {
                            in00 in00Var4 = (in00) kn00Var6;
                            if (in00Var4.b()) {
                                if (!u55Var2.f) {
                                    vprVar2 = vprVar;
                                    it = PinLayer.a().iterator();
                                    kn00Var = kn00Var6;
                                    while (true) {
                                        if (it.hasNext()) {
                                            h hVar = u55Var2.b;
                                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$0 = null;
                                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$1 = null;
                                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$2 = null;
                                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$3 = vprVar2;
                                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$4 = null;
                                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$5 = null;
                                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$6 = kn00Var;
                                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$7 = null;
                                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$8 = null;
                                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$9 = null;
                                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$10 = null;
                                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.label = 3;
                                            obj2 = hVar.y(baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1);
                                            break;
                                        } else {
                                            g e3 = cVar.e((PinLayer) it.next());
                                            String id = ((in00) kn00Var).getId();
                                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$0 = null;
                                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$1 = null;
                                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$2 = null;
                                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$3 = vprVar2;
                                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$4 = null;
                                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$5 = null;
                                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$6 = kn00Var;
                                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$7 = null;
                                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$8 = it;
                                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$9 = null;
                                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$10 = null;
                                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.label = 2;
                                            if (e3.e(id, baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                                                break;
                                            }
                                        }
                                    }
                                    booleanValue = ((Boolean) obj2).booleanValue();
                                    String id2 = ((in00) kn00Var).getId();
                                    baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$0 = null;
                                    baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$1 = null;
                                    baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$2 = null;
                                    baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$3 = vprVar2;
                                    baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$4 = null;
                                    baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$5 = null;
                                    baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$6 = kn00Var;
                                    baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.Z$0 = booleanValue;
                                    baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.label = 4;
                                    obj2 = cVar.c(id2, baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1);
                                    break;
                                } else {
                                    if (in00Var4.b() && (in00Var4 instanceof gn00)) {
                                        fo00 fo00Var = ((gn00) kn00Var6).f;
                                        un00 un00Var = fo00Var instanceof un00 ? (un00) fo00Var : null;
                                        str = (un00Var == null || (a = un00Var.a.a(u55Var2.g.getThemeType())) == null) ? null : a.a;
                                        if (str == null) {
                                            str = "";
                                        }
                                    } else {
                                        str = null;
                                    }
                                    if (in00Var4.b() && (in00Var4 instanceof gn00)) {
                                        fo00 fo00Var2 = ((gn00) kn00Var6).g;
                                        vn00 vn00Var = fo00Var2 instanceof vn00 ? (vn00) fo00Var2 : null;
                                        if (vn00Var != null && (charSequence = vn00Var.a) != null) {
                                            str2 = charSequence.toString();
                                            if (str != null) {
                                                ((pfq0) u55Var2.e).a(new p370(i2, in00Var4.getGeometry(), str, str2));
                                            }
                                        }
                                    }
                                    str2 = null;
                                    if (str != null) {
                                    }
                                }
                            }
                        }
                        ehq0Var = null;
                        if (ehq0Var != null) {
                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$0 = null;
                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$1 = null;
                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$2 = null;
                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$3 = null;
                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$4 = null;
                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$5 = null;
                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$6 = null;
                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$7 = null;
                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$8 = null;
                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.label = 13;
                            break;
                        }
                        return zy11.a;
                    case 2:
                        it = (Iterator) baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$8;
                        kn00Var = (kn00) baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$6;
                        vprVar2 = (vpr) baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$3;
                        kotlin.b.b(obj2);
                        while (true) {
                            if (it.hasNext()) {
                            }
                        }
                        booleanValue = ((Boolean) obj2).booleanValue();
                        String id22 = ((in00) kn00Var).getId();
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$0 = null;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$1 = null;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$2 = null;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$3 = vprVar2;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$4 = null;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$5 = null;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$6 = kn00Var;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.Z$0 = booleanValue;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.label = 4;
                        obj2 = cVar.c(id22, baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1);
                        break;
                    case 3:
                        kn00 kn00Var7 = (kn00) baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$6;
                        vpr vprVar9 = (vpr) baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$3;
                        kotlin.b.b(obj2);
                        vprVar2 = vprVar9;
                        kn00Var = kn00Var7;
                        booleanValue = ((Boolean) obj2).booleanValue();
                        String id222 = ((in00) kn00Var).getId();
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$0 = null;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$1 = null;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$2 = null;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$3 = vprVar2;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$4 = null;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$5 = null;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$6 = kn00Var;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.Z$0 = booleanValue;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.label = 4;
                        obj2 = cVar.c(id222, baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1);
                        break;
                    case 4:
                        booleanValue = baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.Z$0;
                        kn00Var = (kn00) baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$6;
                        vprVar2 = (vpr) baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$3;
                        kotlin.b.b(obj2);
                        PinLayer pinLayer4 = (PinLayer) obj2;
                        if (pinLayer4 == null) {
                            String id3 = ((in00) kn00Var).getId();
                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$0 = null;
                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$1 = null;
                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$2 = null;
                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$3 = vprVar2;
                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$4 = null;
                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$5 = null;
                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$6 = kn00Var;
                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.Z$0 = booleanValue;
                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.label = 7;
                            obj2 = cVar.b(id3, baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1);
                            break;
                        } else {
                            g e4 = cVar.e(u55.a(u55Var2, pinLayer4));
                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$0 = null;
                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$1 = null;
                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$2 = null;
                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$3 = vprVar2;
                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$4 = null;
                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$5 = null;
                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$6 = kn00Var;
                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$7 = pinLayer4;
                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.Z$0 = booleanValue;
                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.label = 5;
                            if (e4.g(baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1) != coroutineSingletons) {
                                vprVar3 = vprVar2;
                                kn00Var2 = kn00Var;
                                pinLayer = pinLayer4;
                                g e5 = cVar.e(pinLayer);
                                String id4 = ((in00) kn00Var2).getId();
                                baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$0 = null;
                                baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$1 = null;
                                baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$2 = null;
                                baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$3 = vprVar3;
                                baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$4 = null;
                                baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$5 = null;
                                baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$6 = kn00Var2;
                                baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$7 = pinLayer;
                                baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$8 = u55Var2;
                                baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.Z$0 = booleanValue;
                                baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.label = 6;
                                obj2 = e5.h(id4, baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1);
                                if (obj2 != coroutineSingletons) {
                                    kn00Var3 = kn00Var2;
                                    vprVar4 = vprVar3;
                                    kn00 kn00Var8 = (kn00) obj2;
                                    u55Var2.getClass();
                                    in00Var = !(kn00Var8 instanceof in00) ? (in00) kn00Var8 : null;
                                    if (in00Var != null || !in00Var.b()) {
                                        in00Var = null;
                                    }
                                    if (in00Var == null) {
                                        in00Var = (in00) kn00Var3;
                                    }
                                    ehq0Var = new ehq0(booleanValue, in00Var, pinLayer, false);
                                    vprVar = vprVar4;
                                    if (ehq0Var != null) {
                                    }
                                    return zy11.a;
                                }
                            }
                        }
                        return coroutineSingletons;
                    case 5:
                        booleanValue = baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.Z$0;
                        pinLayer = (PinLayer) baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$7;
                        kn00Var2 = (kn00) baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$6;
                        vprVar3 = (vpr) baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$3;
                        kotlin.b.b(obj2);
                        g e52 = cVar.e(pinLayer);
                        String id42 = ((in00) kn00Var2).getId();
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$0 = null;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$1 = null;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$2 = null;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$3 = vprVar3;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$4 = null;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$5 = null;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$6 = kn00Var2;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$7 = pinLayer;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$8 = u55Var2;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.Z$0 = booleanValue;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.label = 6;
                        obj2 = e52.h(id42, baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1);
                        if (obj2 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 6:
                        booleanValue = baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.Z$0;
                        u55Var2 = (u55) baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$8;
                        pinLayer = (PinLayer) baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$7;
                        kn00Var3 = (kn00) baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$6;
                        vprVar4 = (vpr) baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$3;
                        kotlin.b.b(obj2);
                        kn00 kn00Var82 = (kn00) obj2;
                        u55Var2.getClass();
                        if (!(kn00Var82 instanceof in00)) {
                        }
                        if (in00Var != null) {
                            break;
                        }
                        in00Var = null;
                        if (in00Var == null) {
                        }
                        ehq0Var = new ehq0(booleanValue, in00Var, pinLayer, false);
                        vprVar = vprVar4;
                        if (ehq0Var != null) {
                        }
                        return zy11.a;
                    case 7:
                        booleanValue = baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.Z$0;
                        kn00Var = (kn00) baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$6;
                        vprVar2 = (vpr) baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$3;
                        kotlin.b.b(obj2);
                        kn00Var4 = kn00Var;
                        vprVar5 = vprVar2;
                        pinLayer2 = (PinLayer) obj2;
                        if (pinLayer2 != null) {
                            g e6 = cVar.e(pinLayer2);
                            String id5 = ((in00) kn00Var4).getId();
                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$0 = null;
                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$1 = null;
                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$2 = null;
                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$3 = vprVar5;
                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$4 = null;
                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$5 = null;
                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$6 = kn00Var4;
                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$7 = pinLayer2;
                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$8 = u55Var2;
                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.Z$0 = booleanValue;
                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.label = 8;
                            obj2 = e6.h(id5, baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1);
                            if (obj2 != coroutineSingletons) {
                                u55Var = u55Var2;
                                kn00 kn00Var9 = (kn00) obj2;
                                u55Var.getClass();
                                in00Var2 = !(kn00Var9 instanceof in00) ? (in00) kn00Var9 : null;
                                if (in00Var2 != null || !in00Var2.b()) {
                                    in00Var2 = null;
                                }
                                if (in00Var2 != null) {
                                    g e7 = cVar.e(u55.a(u55Var2, pinLayer2));
                                    baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$0 = null;
                                    baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$1 = null;
                                    baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$2 = null;
                                    baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$3 = vprVar5;
                                    baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$4 = null;
                                    baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$5 = null;
                                    baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$6 = null;
                                    baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$7 = pinLayer2;
                                    baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$8 = in00Var2;
                                    baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.Z$0 = booleanValue;
                                    baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.label = 9;
                                    if (e7.g(baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1) != coroutineSingletons) {
                                        in00Var3 = in00Var2;
                                        pinLayer3 = pinLayer2;
                                        vprVar7 = vprVar5;
                                        e2 = cVar.e(pinLayer3);
                                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$0 = null;
                                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$1 = null;
                                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$2 = null;
                                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$3 = vprVar7;
                                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$4 = null;
                                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$5 = null;
                                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$6 = null;
                                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$7 = pinLayer3;
                                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$8 = in00Var3;
                                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.Z$0 = booleanValue;
                                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.label = 10;
                                        if (e2.w(in00Var3, false, baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1) != coroutineSingletons) {
                                            vprVar8 = vprVar7;
                                            ehq0Var2 = new ehq0(booleanValue, in00Var3, pinLayer3, false);
                                            ehq0Var = ehq0Var2;
                                            vprVar = vprVar8;
                                            if (ehq0Var != null) {
                                            }
                                            return zy11.a;
                                        }
                                    }
                                }
                            }
                            return coroutineSingletons;
                        }
                        a2 = cVar.a();
                        if (a2 == null) {
                            a2 = PinLayer.MAIN;
                        }
                        e = cVar.e(u55.a(u55Var2, a2));
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$0 = null;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$1 = null;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$2 = null;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$3 = vprVar5;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$4 = null;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$5 = null;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$6 = kn00Var4;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$7 = a2;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$8 = null;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.Z$0 = booleanValue;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.label = 11;
                        if (e.g(baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1) != coroutineSingletons) {
                            kn00Var5 = kn00Var4;
                            vprVar6 = vprVar5;
                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$0 = null;
                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$1 = null;
                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$2 = null;
                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$3 = vprVar6;
                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$4 = null;
                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$5 = null;
                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$6 = kn00Var5;
                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$7 = a2;
                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.Z$0 = booleanValue;
                            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.label = 12;
                            if (cVar.e(a2).w((in00) kn00Var5, true, baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1) != coroutineSingletons) {
                                vprVar8 = vprVar6;
                                ehq0Var2 = new ehq0(booleanValue, kn00Var5, a2, true);
                                ehq0Var = ehq0Var2;
                                vprVar = vprVar8;
                                if (ehq0Var != null) {
                                }
                                return zy11.a;
                            }
                        }
                        return coroutineSingletons;
                    case 8:
                        booleanValue = baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.Z$0;
                        u55Var = (u55) baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$8;
                        pinLayer2 = (PinLayer) baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$7;
                        kn00Var4 = (kn00) baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$6;
                        vprVar5 = (vpr) baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$3;
                        kotlin.b.b(obj2);
                        kn00 kn00Var92 = (kn00) obj2;
                        u55Var.getClass();
                        if (!(kn00Var92 instanceof in00)) {
                        }
                        if (in00Var2 != null) {
                            break;
                        }
                        in00Var2 = null;
                        if (in00Var2 != null) {
                        }
                        a2 = cVar.a();
                        if (a2 == null) {
                        }
                        e = cVar.e(u55.a(u55Var2, a2));
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$0 = null;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$1 = null;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$2 = null;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$3 = vprVar5;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$4 = null;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$5 = null;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$6 = kn00Var4;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$7 = a2;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$8 = null;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.Z$0 = booleanValue;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.label = 11;
                        if (e.g(baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1) != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 9:
                        booleanValue = baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.Z$0;
                        in00Var3 = (in00) baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$8;
                        pinLayer3 = (PinLayer) baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$7;
                        vprVar7 = (vpr) baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$3;
                        kotlin.b.b(obj2);
                        e2 = cVar.e(pinLayer3);
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$0 = null;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$1 = null;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$2 = null;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$3 = vprVar7;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$4 = null;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$5 = null;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$6 = null;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$7 = pinLayer3;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$8 = in00Var3;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.Z$0 = booleanValue;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.label = 10;
                        if (e2.w(in00Var3, false, baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1) != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 10:
                        booleanValue = baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.Z$0;
                        in00Var3 = (in00) baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$8;
                        pinLayer3 = (PinLayer) baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$7;
                        vprVar8 = (vpr) baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$3;
                        kotlin.b.b(obj2);
                        ehq0Var2 = new ehq0(booleanValue, in00Var3, pinLayer3, false);
                        ehq0Var = ehq0Var2;
                        vprVar = vprVar8;
                        if (ehq0Var != null) {
                        }
                        return zy11.a;
                    case 11:
                        booleanValue = baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.Z$0;
                        a2 = (PinLayer) baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$7;
                        kn00Var5 = (kn00) baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$6;
                        vprVar6 = (vpr) baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$3;
                        kotlin.b.b(obj2);
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$0 = null;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$1 = null;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$2 = null;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$3 = vprVar6;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$4 = null;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$5 = null;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$6 = kn00Var5;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$7 = a2;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.Z$0 = booleanValue;
                        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.label = 12;
                        if (cVar.e(a2).w((in00) kn00Var5, true, baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1) != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 12:
                        booleanValue = baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.Z$0;
                        a2 = (PinLayer) baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$7;
                        kn00Var5 = (kn00) baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$6;
                        vprVar8 = (vpr) baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.L$3;
                        kotlin.b.b(obj2);
                        ehq0Var2 = new ehq0(booleanValue, kn00Var5, a2, true);
                        ehq0Var = ehq0Var2;
                        vprVar = vprVar8;
                        if (ehq0Var != null) {
                        }
                        return zy11.a;
                    case 13:
                        kotlin.b.b(obj2);
                        return zy11.a;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1 = new BaseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i22 = 12;
        switch (baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$2$1.label) {
        }
    }
}
