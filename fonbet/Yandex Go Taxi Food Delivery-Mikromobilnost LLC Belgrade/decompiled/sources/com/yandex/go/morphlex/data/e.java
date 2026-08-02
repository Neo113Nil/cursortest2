package com.yandex.go.morphlex.data;

import android.content.Context;
import android.util.TypedValue;
import com.yandex.go.morphlex.api.MorphlexScreenPayload$ParamType;
import com.yandex.go.morphlex.data.descriptors.actions.change_status_bar.ChangeStatusBarThemeAction;
import com.yandex.go.morphlex.data.dto.MorphlexRequestDto;
import com.yandex.go.morphlex.ui.controllers.preview.a;
import defpackage.amc;
import defpackage.at20;
import defpackage.axm;
import defpackage.bte0;
import defpackage.bvf0;
import defpackage.csz;
import defpackage.d0l0;
import defpackage.dqe0;
import defpackage.ep21;
import defpackage.fgl0;
import defpackage.g0p;
import defpackage.ghr;
import defpackage.h3y;
import defpackage.h830;
import defpackage.i6z0;
import defpackage.i830;
import defpackage.ikm0;
import defpackage.jqr;
import defpackage.k6x;
import defpackage.kpi0;
import defpackage.kr;
import defpackage.lhr;
import defpackage.ljr;
import defpackage.mo21;
import defpackage.mqg0;
import defpackage.mqq;
import defpackage.mrg0;
import defpackage.n830;
import defpackage.nhr;
import defpackage.nu;
import defpackage.ny61;
import defpackage.o400;
import defpackage.p730;
import defpackage.plr;
import defpackage.po21;
import defpackage.q730;
import defpackage.qhr;
import defpackage.qoi0;
import defpackage.rhr;
import defpackage.rol0;
import defpackage.s59;
import defpackage.sfa0;
import defpackage.sjh;
import defpackage.t730;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tls;
import defpackage.tpr;
import defpackage.tse;
import defpackage.tt2;
import defpackage.u1m;
import defpackage.ujm0;
import defpackage.uyj;
import defpackage.v7j0;
import defpackage.vlr;
import defpackage.vng;
import defpackage.w511;
import defpackage.w730;
import defpackage.wgr;
import defpackage.wnt;
import defpackage.xnt;
import defpackage.y1s;
import defpackage.ycq0;
import defpackage.zm5;
import defpackage.zy11;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.systemrequeirements.location.n;

/* loaded from: classes12.dex */
public final class e {
    public final Context a;
    public final Context b;
    public final tt2 c;
    public final p730 d;
    public final wgr e;
    public final i830 f;
    public final po21 g;
    public final com.yandex.go.route.interactor.b h;
    public final wnt i;
    public final n830 j;
    public final v7j0 k;
    public final n l;
    public final fgl0 m;
    public final k6x n;
    public final h3y o;
    public final dqe0 p;
    public final axm q;
    public final y1s r;
    public final sfa0 s;
    public final kpi0 t;
    public final bte0 u;
    public final ycq0 v;
    public final amc w;
    public final Set x;

    public e(Context context, Context context2, tt2 tt2Var, p730 p730Var, wgr wgrVar, i830 i830Var, po21 po21Var, com.yandex.go.route.interactor.b bVar, wnt wntVar, n830 n830Var, v7j0 v7j0Var, n nVar, fgl0 fgl0Var, k6x k6xVar, h3y h3yVar, dqe0 dqe0Var, axm axmVar, y1s y1sVar, sfa0 sfa0Var, kpi0 kpi0Var, bte0 bte0Var, ycq0 ycq0Var, amc amcVar, Set set) {
        this.a = context;
        this.b = context2;
        this.c = tt2Var;
        this.d = p730Var;
        this.e = wgrVar;
        this.f = i830Var;
        this.g = po21Var;
        this.h = bVar;
        this.i = wntVar;
        this.j = n830Var;
        this.k = v7j0Var;
        this.l = nVar;
        this.m = fgl0Var;
        this.n = k6xVar;
        this.o = h3yVar;
        this.p = dqe0Var;
        this.q = axmVar;
        this.r = y1sVar;
        this.s = sfa0Var;
        this.t = kpi0Var;
        this.u = bte0Var;
        this.v = ycq0Var;
        this.w = amcVar;
        this.x = set;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable a(e eVar, h830 h830Var, ContinuationImpl continuationImpl) {
        MorphlexFlexConfigFactory$getSourceAddress$1 morphlexFlexConfigFactory$getSourceAddress$1;
        int i;
        eVar.getClass();
        if (continuationImpl instanceof MorphlexFlexConfigFactory$getSourceAddress$1) {
            morphlexFlexConfigFactory$getSourceAddress$1 = (MorphlexFlexConfigFactory$getSourceAddress$1) continuationImpl;
            int i2 = morphlexFlexConfigFactory$getSourceAddress$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                morphlexFlexConfigFactory$getSourceAddress$1.label = i2 - Integer.MIN_VALUE;
                Object obj = morphlexFlexConfigFactory$getSourceAddress$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = morphlexFlexConfigFactory$getSourceAddress$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    boolean b = h830Var.b(MorphlexScreenPayload$ParamType.POINT_A);
                    tpr k = eVar.h.k();
                    MorphlexFlexConfigFactory$getSourceAddress$2 morphlexFlexConfigFactory$getSourceAddress$2 = new MorphlexFlexConfigFactory$getSourceAddress$2(b, null);
                    morphlexFlexConfigFactory$getSourceAddress$1.L$0 = null;
                    morphlexFlexConfigFactory$getSourceAddress$1.Z$0 = b;
                    morphlexFlexConfigFactory$getSourceAddress$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.x(k, morphlexFlexConfigFactory$getSourceAddress$2, morphlexFlexConfigFactory$getSourceAddress$1);
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
                return ((d0l0) obj).h();
            }
        }
        morphlexFlexConfigFactory$getSourceAddress$1 = new MorphlexFlexConfigFactory$getSourceAddress$1(eVar, continuationImpl);
        Object obj2 = morphlexFlexConfigFactory$getSourceAddress$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = morphlexFlexConfigFactory$getSourceAddress$1.label;
        if (i != 0) {
        }
        return ((d0l0) obj2).h();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e4, code lost:
    
        if (r13 == r3) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00af, code lost:
    
        if (((java.lang.Boolean) r13).booleanValue() == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ff, code lost:
    
        if (r13 == r3) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0080, code lost:
    
        if (r13 == r3) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a6, code lost:
    
        if (r13 == r3) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(e eVar, h830 h830Var, ContinuationImpl continuationImpl) {
        MorphlexFlexConfigFactory$getUserLocation$1 morphlexFlexConfigFactory$getUserLocation$1;
        int i;
        boolean b;
        boolean z;
        boolean booleanValue;
        n nVar = eVar.l;
        po21 po21Var = eVar.g;
        if (continuationImpl instanceof MorphlexFlexConfigFactory$getUserLocation$1) {
            morphlexFlexConfigFactory$getUserLocation$1 = (MorphlexFlexConfigFactory$getUserLocation$1) continuationImpl;
            int i2 = morphlexFlexConfigFactory$getUserLocation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                morphlexFlexConfigFactory$getUserLocation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = morphlexFlexConfigFactory$getUserLocation$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = morphlexFlexConfigFactory$getUserLocation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b = h830Var.b(MorphlexScreenPayload$ParamType.GEO);
                    if (b) {
                        if (nVar.c()) {
                            morphlexFlexConfigFactory$getUserLocation$1.L$0 = null;
                            morphlexFlexConfigFactory$getUserLocation$1.Z$0 = b;
                            morphlexFlexConfigFactory$getUserLocation$1.label = 2;
                            obj = eVar.f(morphlexFlexConfigFactory$getUserLocation$1);
                        }
                        if (nVar.b()) {
                            v7j0 v7j0Var = eVar.k;
                            morphlexFlexConfigFactory$getUserLocation$1.L$0 = null;
                            morphlexFlexConfigFactory$getUserLocation$1.Z$0 = b;
                            morphlexFlexConfigFactory$getUserLocation$1.label = 3;
                            obj = ((com.yandex.go.permission.b) v7j0Var).d(1, morphlexFlexConfigFactory$getUserLocation$1);
                            if (obj != obj2) {
                                z = b;
                                booleanValue = ((Boolean) obj).booleanValue();
                                if (booleanValue) {
                                }
                                return null;
                            }
                        } else {
                            morphlexFlexConfigFactory$getUserLocation$1.L$0 = null;
                            morphlexFlexConfigFactory$getUserLocation$1.Z$0 = b;
                            morphlexFlexConfigFactory$getUserLocation$1.label = 5;
                            obj = ((ru.yandex.taxi.preorder.source.userposition.e) po21Var).m(morphlexFlexConfigFactory$getUserLocation$1);
                        }
                    } else {
                        morphlexFlexConfigFactory$getUserLocation$1.L$0 = null;
                        morphlexFlexConfigFactory$getUserLocation$1.Z$0 = b;
                        morphlexFlexConfigFactory$getUserLocation$1.label = 1;
                        obj = ((ru.yandex.taxi.preorder.source.userposition.e) po21Var).m(morphlexFlexConfigFactory$getUserLocation$1);
                    }
                    return obj2;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    mo21 A = vng.A((ep21) obj);
                    if (A != null) {
                        return new MorphlexRequestDto.Location(A.a, A.b);
                    }
                    return null;
                }
                if (i != 2) {
                    if (i == 3) {
                        z = morphlexFlexConfigFactory$getUserLocation$1.Z$0;
                        kotlin.b.b(obj);
                        booleanValue = ((Boolean) obj).booleanValue();
                        if (booleanValue) {
                            jqr n = ((ru.yandex.taxi.preorder.source.userposition.e) po21Var).n();
                            morphlexFlexConfigFactory$getUserLocation$1.L$0 = null;
                            morphlexFlexConfigFactory$getUserLocation$1.Z$0 = z;
                            morphlexFlexConfigFactory$getUserLocation$1.Z$1 = booleanValue;
                            morphlexFlexConfigFactory$getUserLocation$1.label = 4;
                            obj = kotlinx.coroutines.flow.e.y(n, morphlexFlexConfigFactory$getUserLocation$1);
                        }
                        return null;
                    }
                    if (i == 4) {
                        kotlin.b.b(obj);
                        mo21 mo21Var = (mo21) obj;
                        return new MorphlexRequestDto.Location(mo21Var.a, mo21Var.b);
                    }
                    if (i != 5) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    mo21 A2 = vng.A((ep21) obj);
                    if (A2 != null) {
                        return new MorphlexRequestDto.Location(A2.a, A2.b);
                    }
                    return null;
                }
                b = morphlexFlexConfigFactory$getUserLocation$1.Z$0;
                kotlin.b.b(obj);
            }
        }
        morphlexFlexConfigFactory$getUserLocation$1 = new MorphlexFlexConfigFactory$getUserLocation$1(eVar, continuationImpl);
        Object obj3 = morphlexFlexConfigFactory$getUserLocation$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = morphlexFlexConfigFactory$getUserLocation$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(h830 h830Var, ContinuationImpl continuationImpl) {
        MorphlexFlexConfigFactory$buildDocumentQuery$1 morphlexFlexConfigFactory$buildDocumentQuery$1;
        int i;
        MorphlexRequestDto morphlexRequestDto;
        if (continuationImpl instanceof MorphlexFlexConfigFactory$buildDocumentQuery$1) {
            morphlexFlexConfigFactory$buildDocumentQuery$1 = (MorphlexFlexConfigFactory$buildDocumentQuery$1) continuationImpl;
            int i2 = morphlexFlexConfigFactory$buildDocumentQuery$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                morphlexFlexConfigFactory$buildDocumentQuery$1.label = i2 - Integer.MIN_VALUE;
                Object obj = morphlexFlexConfigFactory$buildDocumentQuery$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = morphlexFlexConfigFactory$buildDocumentQuery$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    morphlexFlexConfigFactory$buildDocumentQuery$1.L$0 = h830Var;
                    morphlexFlexConfigFactory$buildDocumentQuery$1.label = 1;
                    obj = bvf0.n(new MorphlexFlexConfigFactory$awaitMorphlexRequest$2(h830Var, this, null), morphlexFlexConfigFactory$buildDocumentQuery$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    h830Var = (h830) morphlexFlexConfigFactory$buildDocumentQuery$1.L$0;
                    kotlin.b.b(obj);
                }
                morphlexRequestDto = (MorphlexRequestDto) obj;
                if (morphlexRequestDto != null) {
                    return null;
                }
                MapBuilder mapBuilder = new MapBuilder();
                mapBuilder.putAll(((xnt) this.i).f(morphlexRequestDto, MorphlexRequestDto.Companion.serializer()));
                Map map = h830Var.f;
                if (map == null) {
                    map = kotlin.collections.b.f();
                }
                mapBuilder.putAll(map);
                MapBuilder j = mapBuilder.j();
                return new u1m(kotlin.collections.b.f(), h830Var.b, j);
            }
        }
        morphlexFlexConfigFactory$buildDocumentQuery$1 = new MorphlexFlexConfigFactory$buildDocumentQuery$1(this, continuationImpl);
        Object obj2 = morphlexFlexConfigFactory$buildDocumentQuery$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = morphlexFlexConfigFactory$buildDocumentQuery$1.label;
        if (i != 0) {
        }
        morphlexRequestDto = (MorphlexRequestDto) obj2;
        if (morphlexRequestDto != null) {
        }
    }

    public final rhr d(final tse tseVar, h830 h830Var, k6x k6xVar, lhr lhrVar, com.yandex.div.core.expression.variables.a aVar, ljr ljrVar) {
        Integer num = null;
        rol0 rol0Var = new rol0(new MorphlexFlexConfigFactory$createActionsFlow$1(h830Var, this, null));
        int i = 1;
        ghr ghrVar = new ghr(i, new mqq(new at20(new a(tseVar, this, 0), new a(tseVar, this, i))));
        final plr plrVar = ljrVar.a;
        p730 p730Var = this.d;
        final w730 w730Var = p730Var.a;
        w730Var.getClass();
        List singletonList = Collections.singletonList(new ikm0("MorphlexPreviewScaffold", qoi0.a(t730.class), t730.INSTANCE.serializer(), new ujm0() { // from class: v730
            @Override // defpackage.ujm0
            public final pjm0 get(l1o l1oVar, mjm0 mjm0Var) {
                return new a((wgr) w730.this.a.a.a.get(), plrVar);
            }
        }));
        Set set = p730Var.b;
        ArrayList arrayList = new ArrayList(tcc.n(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((nu) it.next()).create());
        }
        vlr vlrVar = new vlr("Morphlex", new zm5(aVar, 1), ghrVar, new g0p(singletonList, null, arrayList, null, null, null, null, null, 1014), null, null, null, null, null, kotlin.collections.a.J0(this.x), k6xVar, null, null, null, null, null, null, null, null, 1045474);
        vlr a = vlr.a(vlrVar, null, new s59(this.m.a(new tls() { // from class: com.yandex.go.morphlex.data.b
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                tje.N(tse.this, null, null, new MorphlexFlexConfigFactory$createFlexSdkConfig$routeHandler$1$1(this, (kr) obj, null), 3);
                return zy11.a;
            }
        }, "Morphlex", lhrVar, ljrVar, new csz(8, vlrVar))), 1048543);
        n830 n830Var = this.j;
        d dVar = new d(kotlinx.coroutines.flow.e.d(n830Var.a));
        int i2 = q730.a[h830Var.c.ordinal()];
        if (i2 == 1) {
            return new nhr(a, null, rol0Var, dVar, null, Integer.valueOf(mqg0.white), null, ljrVar, h830Var.a, null, 6354);
        }
        Context context = this.a;
        if (i2 == 2) {
            n830Var.a.l(ChangeStatusBarThemeAction.StatusBarThemeDto.DARK);
            return new qhr(a, rol0Var, dVar, false, Integer.valueOf(mqg0.black), null, true, Integer.valueOf(tje.r(mrg0.modal_view_corner_radius_big, context)), false, false, null, h830Var.a, null, null, 3393394);
        }
        if (i2 != 3) {
            w511.b();
            return null;
        }
        boolean z = h830Var.j;
        int r = tje.r(mrg0.modal_view_corner_radius_big, context);
        i6z0 i6z0Var = h830Var.i;
        if (i6z0Var != null) {
            int i3 = i6z0Var.c;
            int i4 = i6z0Var.b;
            if (i3 != 0) {
                if (i3 != 1) {
                    ny61.r("Unsupported TypedValue for conversion");
                    return null;
                }
                i4 = (int) TypedValue.applyDimension(1, i4, this.b.getResources().getDisplayMetrics());
            }
            num = Integer.valueOf(i4);
        }
        return new qhr(a, rol0Var, dVar, z, null, null, false, Integer.valueOf(r), false, false, num, h830Var.a, null, null, 3262386);
    }

    public final Object e(h830 h830Var, Continuation continuation) {
        this.c.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(o400.a, new MorphlexFlexConfigFactory$prepareJasonStateStore$2(h830Var, this, null), continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(2:18|(2:20|21)(2:22|(1:24)))|11|12|13))|28|6|7|(0)(0)|11|12|13|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        throw r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(ContinuationImpl continuationImpl) {
        MorphlexFlexConfigFactory$tryEnableGeoServices$1 morphlexFlexConfigFactory$tryEnableGeoServices$1;
        int i;
        if (continuationImpl instanceof MorphlexFlexConfigFactory$tryEnableGeoServices$1) {
            morphlexFlexConfigFactory$tryEnableGeoServices$1 = (MorphlexFlexConfigFactory$tryEnableGeoServices$1) continuationImpl;
            int i2 = morphlexFlexConfigFactory$tryEnableGeoServices$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                morphlexFlexConfigFactory$tryEnableGeoServices$1.label = i2 - Integer.MIN_VALUE;
                Object obj = morphlexFlexConfigFactory$tryEnableGeoServices$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = morphlexFlexConfigFactory$tryEnableGeoServices$1.label;
                n nVar = this.l;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!nVar.c()) {
                        return Boolean.TRUE;
                    }
                    morphlexFlexConfigFactory$tryEnableGeoServices$1.label = 1;
                    if (nVar.d(morphlexFlexConfigFactory$tryEnableGeoServices$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return Boolean.valueOf(!nVar.c());
            }
        }
        morphlexFlexConfigFactory$tryEnableGeoServices$1 = new MorphlexFlexConfigFactory$tryEnableGeoServices$1(this, continuationImpl);
        Object obj2 = morphlexFlexConfigFactory$tryEnableGeoServices$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = morphlexFlexConfigFactory$tryEnableGeoServices$1.label;
        n nVar2 = this.l;
        if (i != 0) {
        }
        return Boolean.valueOf(!nVar2.c());
    }
}
