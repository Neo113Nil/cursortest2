package com.yandex.go.morphlex.router;

import com.yandex.go.morphlex.api.MorphlexScreenPayload$ParamType;
import com.yandex.go.morphlex.data.f;
import defpackage.c0g;
import defpackage.dvw;
import defpackage.eqh;
import defpackage.h3y;
import defpackage.h55;
import defpackage.h830;
import defpackage.i6r;
import defpackage.j18;
import defpackage.jj3;
import defpackage.m3g;
import defpackage.m950;
import defpackage.mdh;
import defpackage.mjr;
import defpackage.ny61;
import defpackage.qu;
import defpackage.qzj0;
import defpackage.si3;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.um3;
import defpackage.uyj;
import defpackage.wui;
import defpackage.yvf0;
import defpackage.z0j;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;

/* loaded from: classes12.dex */
public final class b extends h55 implements m950 {
    public final m3g D;
    public final yvf0 E;
    public final h3y F;
    public final tt2 G;
    public final i6r H;
    public final h3y I;
    public final h3y J;
    public final mjr K;

    public b(m3g m3gVar, eqh eqhVar, h3y h3yVar, tt2 tt2Var, i6r i6rVar, h3y h3yVar2, h3y h3yVar3, mjr mjrVar) {
        super(null);
        this.D = m3gVar;
        this.E = eqhVar;
        this.F = h3yVar;
        this.G = tt2Var;
        this.H = i6rVar;
        this.I = h3yVar2;
        this.J = h3yVar3;
        this.K = mjrVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
    
        if (r2 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(b bVar, h830 h830Var, ContinuationImpl continuationImpl) {
        MorphlexRouterImpl$openMorphlexScreen$1 morphlexRouterImpl$openMorphlexScreen$1;
        Object obj;
        int i;
        boolean b;
        Object s;
        bVar.getClass();
        if (continuationImpl instanceof MorphlexRouterImpl$openMorphlexScreen$1) {
            morphlexRouterImpl$openMorphlexScreen$1 = (MorphlexRouterImpl$openMorphlexScreen$1) continuationImpl;
            int i2 = morphlexRouterImpl$openMorphlexScreen$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                morphlexRouterImpl$openMorphlexScreen$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = morphlexRouterImpl$openMorphlexScreen$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = morphlexRouterImpl$openMorphlexScreen$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    b = h830Var.b(MorphlexScreenPayload$ParamType.AUTH);
                    if (b) {
                        morphlexRouterImpl$openMorphlexScreen$1.L$0 = h830Var;
                        morphlexRouterImpl$openMorphlexScreen$1.Z$0 = b;
                        morphlexRouterImpl$openMorphlexScreen$1.label = 1;
                        j18 j18Var = new j18(1, dvw.b(morphlexRouterImpl$openMorphlexScreen$1));
                        j18Var.u();
                        ((jj3) bVar.F.get()).c(new um3(Events$Zalogin$LoginContext.AUTOLOGIN, new qzj0(null, new si3(j18Var, 11)), false, false, 28));
                        s = j18Var.s();
                    }
                    morphlexRouterImpl$openMorphlexScreen$1.L$0 = null;
                    morphlexRouterImpl$openMorphlexScreen$1.Z$0 = b;
                    morphlexRouterImpl$openMorphlexScreen$1.label = 2;
                    Object Q = bVar.Q(h830Var, morphlexRouterImpl$openMorphlexScreen$1);
                    return Q == obj ? obj : Q;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return obj2;
                }
                boolean z = morphlexRouterImpl$openMorphlexScreen$1.Z$0;
                h830 h830Var2 = (h830) morphlexRouterImpl$openMorphlexScreen$1.L$0;
                kotlin.b.b(obj2);
                b = z;
                h830Var = h830Var2;
                s = obj2;
                if (!((Boolean) s).booleanValue()) {
                    bVar.r(new qu(9));
                    return zy11.a;
                }
                morphlexRouterImpl$openMorphlexScreen$1.L$0 = null;
                morphlexRouterImpl$openMorphlexScreen$1.Z$0 = b;
                morphlexRouterImpl$openMorphlexScreen$1.label = 2;
                Object Q2 = bVar.Q(h830Var, morphlexRouterImpl$openMorphlexScreen$1);
                if (Q2 == obj) {
                }
            }
        }
        morphlexRouterImpl$openMorphlexScreen$1 = new MorphlexRouterImpl$openMorphlexScreen$1(bVar, continuationImpl);
        Object obj22 = morphlexRouterImpl$openMorphlexScreen$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = morphlexRouterImpl$openMorphlexScreen$1.label;
        if (i != 0) {
        }
        if (!((Boolean) s).booleanValue()) {
        }
        morphlexRouterImpl$openMorphlexScreen$1.L$0 = null;
        morphlexRouterImpl$openMorphlexScreen$1.Z$0 = b;
        morphlexRouterImpl$openMorphlexScreen$1.label = 2;
        Object Q22 = bVar.Q(h830Var, morphlexRouterImpl$openMorphlexScreen$1);
        if (Q22 == obj) {
        }
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        if (((h830) obj).h) {
            f fVar = (f) this.I.get();
            json.state.disk.storage.feature.b bVar = fVar.d;
            if (bVar != null) {
                bVar.b();
            }
            fVar.d = null;
        }
        ((z0j) ((c0g) this.H).Re.get()).c(this);
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        ((z0j) ((c0g) this.H).Re.get()).a(this);
        tje.N(o(), null, null, new MorphlexRouterImpl$onLaunch$1((h830) obj, this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Q(h830 h830Var, ContinuationImpl continuationImpl) {
        MorphlexRouterImpl$startFlexRouter$1 morphlexRouterImpl$startFlexRouter$1;
        int i;
        m950 m950Var;
        b bVar;
        if (continuationImpl instanceof MorphlexRouterImpl$startFlexRouter$1) {
            morphlexRouterImpl$startFlexRouter$1 = (MorphlexRouterImpl$startFlexRouter$1) continuationImpl;
            int i2 = morphlexRouterImpl$startFlexRouter$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                morphlexRouterImpl$startFlexRouter$1.label = i2 - Integer.MIN_VALUE;
                Object obj = morphlexRouterImpl$startFlexRouter$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = morphlexRouterImpl$startFlexRouter$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    m950 m950Var2 = (m950) this.D.get();
                    this.G.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    MorphlexRouterImpl$startFlexRouter$2 morphlexRouterImpl$startFlexRouter$2 = new MorphlexRouterImpl$startFlexRouter$2(h830Var, this, null);
                    morphlexRouterImpl$startFlexRouter$1.L$0 = null;
                    morphlexRouterImpl$startFlexRouter$1.L$1 = this;
                    morphlexRouterImpl$startFlexRouter$1.L$2 = m950Var2;
                    morphlexRouterImpl$startFlexRouter$1.label = 1;
                    Object k0 = tje.k0(mdhVar, morphlexRouterImpl$startFlexRouter$2, morphlexRouterImpl$startFlexRouter$1);
                    if (k0 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = k0;
                    m950Var = m950Var2;
                    bVar = this;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    m950Var = (m950) morphlexRouterImpl$startFlexRouter$1.L$2;
                    bVar = (b) morphlexRouterImpl$startFlexRouter$1.L$1;
                    kotlin.b.b(obj);
                }
                bVar.A(m950Var, obj, new wui(this, 27));
                return zy11.a;
            }
        }
        morphlexRouterImpl$startFlexRouter$1 = new MorphlexRouterImpl$startFlexRouter$1(this, continuationImpl);
        Object obj2 = morphlexRouterImpl$startFlexRouter$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = morphlexRouterImpl$startFlexRouter$1.label;
        if (i != 0) {
        }
        bVar.A(m950Var, obj2, new wui(this, 27));
        return zy11.a;
    }
}
