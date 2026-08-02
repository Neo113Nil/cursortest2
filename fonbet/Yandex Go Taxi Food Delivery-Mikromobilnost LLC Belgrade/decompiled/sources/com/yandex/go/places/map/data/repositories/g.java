package com.yandex.go.places.map.data.repositories;

import defpackage.bvf0;
import defpackage.ffx;
import defpackage.g050;
import defpackage.gci0;
import defpackage.gtq0;
import defpackage.in00;
import defpackage.jl40;
import defpackage.jst;
import defpackage.kn00;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.yac0;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public abstract class g {
    public final tt2 a;
    public final tse b;
    public final int c;
    public final kotlinx.coroutines.sync.a d;
    public final LinkedHashMap e;
    public final kotlinx.coroutines.sync.a f;
    public final r0 g;
    public final gci0 h;
    public final n0 i;

    public g(tt2 tt2Var, tse tseVar, yac0 yac0Var) {
        this.a = tt2Var;
        this.b = tseVar;
        int i = yac0Var.d;
        jst.e.getClass();
        this.c = i;
        this.d = gtq0.a();
        this.e = new LinkedHashMap();
        this.f = gtq0.a();
        r0 c = bvf0.c(null);
        this.g = c;
        this.h = kotlinx.coroutines.flow.e.d(c);
        this.i = ffx.c(0, 2, null, 5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008a, code lost:
    
        if (r6.emit(r7, r0) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0055, code lost:
    
        if (r8.a(r0) == r1) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r7v8, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(g gVar, String str, ContinuationImpl continuationImpl) {
        PlacesBaseMapObjectsRepository$clearSelectedMapObject$1 placesBaseMapObjectsRepository$clearSelectedMapObject$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        in00 i2;
        Object t;
        gVar.getClass();
        try {
            if (continuationImpl instanceof PlacesBaseMapObjectsRepository$clearSelectedMapObject$1) {
                placesBaseMapObjectsRepository$clearSelectedMapObject$1 = (PlacesBaseMapObjectsRepository$clearSelectedMapObject$1) continuationImpl;
                int i3 = placesBaseMapObjectsRepository$clearSelectedMapObject$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    placesBaseMapObjectsRepository$clearSelectedMapObject$1.label = i3 - Integer.MIN_VALUE;
                    Object obj = placesBaseMapObjectsRepository$clearSelectedMapObject$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = placesBaseMapObjectsRepository$clearSelectedMapObject$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        aVar = gVar.f;
                        placesBaseMapObjectsRepository$clearSelectedMapObject$1.L$0 = str;
                        placesBaseMapObjectsRepository$clearSelectedMapObject$1.L$1 = aVar;
                        placesBaseMapObjectsRepository$clearSelectedMapObject$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return zy11.a;
                        }
                        ?? r7 = (g050) placesBaseMapObjectsRepository$clearSelectedMapObject$1.L$1;
                        String str2 = (String) placesBaseMapObjectsRepository$clearSelectedMapObject$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r7;
                        str = str2;
                    }
                    i2 = gVar.i();
                    if (i2 != null && (str == null || jl40.l(i2.getId(), str))) {
                        gVar.u(null);
                        t = gVar.t(null, false);
                        if (t != null) {
                            n0 n0Var = gVar.i;
                            placesBaseMapObjectsRepository$clearSelectedMapObject$1.L$0 = null;
                            placesBaseMapObjectsRepository$clearSelectedMapObject$1.L$1 = null;
                            placesBaseMapObjectsRepository$clearSelectedMapObject$1.L$2 = null;
                            placesBaseMapObjectsRepository$clearSelectedMapObject$1.label = 2;
                        }
                        return zy11.a;
                    }
                    t = null;
                    if (t != null) {
                    }
                    return zy11.a;
                }
            }
            i2 = gVar.i();
            if (i2 != null) {
                gVar.u(null);
                t = gVar.t(null, false);
                if (t != null) {
                }
                return zy11.a;
            }
            t = null;
            if (t != null) {
            }
            return zy11.a;
        } finally {
            aVar.d(null);
        }
        placesBaseMapObjectsRepository$clearSelectedMapObject$1 = new PlacesBaseMapObjectsRepository$clearSelectedMapObject$1(gVar, continuationImpl);
        Object obj2 = placesBaseMapObjectsRepository$clearSelectedMapObject$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesBaseMapObjectsRepository$clearSelectedMapObject$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r5v7, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object d(g gVar, ContinuationImpl continuationImpl) {
        PlacesBaseMapObjectsRepository$clearMapObjects$1 placesBaseMapObjectsRepository$clearMapObjects$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        try {
            if (continuationImpl instanceof PlacesBaseMapObjectsRepository$clearMapObjects$1) {
                placesBaseMapObjectsRepository$clearMapObjects$1 = (PlacesBaseMapObjectsRepository$clearMapObjects$1) continuationImpl;
                int i2 = placesBaseMapObjectsRepository$clearMapObjects$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    placesBaseMapObjectsRepository$clearMapObjects$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = placesBaseMapObjectsRepository$clearMapObjects$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = placesBaseMapObjectsRepository$clearMapObjects$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        aVar = gVar.d;
                        placesBaseMapObjectsRepository$clearMapObjects$1.L$0 = gVar;
                        placesBaseMapObjectsRepository$clearMapObjects$1.L$1 = aVar;
                        placesBaseMapObjectsRepository$clearMapObjects$1.label = 1;
                        if (aVar.a(placesBaseMapObjectsRepository$clearMapObjects$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r5 = (g050) placesBaseMapObjectsRepository$clearMapObjects$1.L$1;
                        g gVar2 = (g) placesBaseMapObjectsRepository$clearMapObjects$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r5;
                        gVar = gVar2;
                    }
                    gVar.e.clear();
                    aVar.d(null);
                    return zy11.a;
                }
            }
            gVar.e.clear();
            aVar.d(null);
            return zy11.a;
        } catch (Throwable th) {
            aVar.d(null);
            throw th;
        }
        placesBaseMapObjectsRepository$clearMapObjects$1 = new PlacesBaseMapObjectsRepository$clearMapObjects$1(gVar, continuationImpl);
        Object obj2 = placesBaseMapObjectsRepository$clearMapObjects$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesBaseMapObjectsRepository$clearMapObjects$1.label;
        if (i != 0) {
        }
    }

    public final void b() {
        tje.N(this.b, null, null, new PlacesBaseMapObjectsRepository$clear$1(this, null), 3);
    }

    public abstract Object c(ContinuationImpl continuationImpl);

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #0 {all -> 0x0055, blocks: (B:11:0x004a, B:13:0x0050), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, ContinuationImpl continuationImpl) {
        PlacesBaseMapObjectsRepository$deselectCurrentIfDifferent$1 placesBaseMapObjectsRepository$deselectCurrentIfDifferent$1;
        int i;
        String str2;
        g050 g050Var;
        String id;
        try {
            if (continuationImpl instanceof PlacesBaseMapObjectsRepository$deselectCurrentIfDifferent$1) {
                placesBaseMapObjectsRepository$deselectCurrentIfDifferent$1 = (PlacesBaseMapObjectsRepository$deselectCurrentIfDifferent$1) continuationImpl;
                int i2 = placesBaseMapObjectsRepository$deselectCurrentIfDifferent$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    placesBaseMapObjectsRepository$deselectCurrentIfDifferent$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = placesBaseMapObjectsRepository$deselectCurrentIfDifferent$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = placesBaseMapObjectsRepository$deselectCurrentIfDifferent$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        placesBaseMapObjectsRepository$deselectCurrentIfDifferent$1.L$0 = str;
                        kotlinx.coroutines.sync.a aVar = this.f;
                        placesBaseMapObjectsRepository$deselectCurrentIfDifferent$1.L$1 = aVar;
                        placesBaseMapObjectsRepository$deselectCurrentIfDifferent$1.label = 1;
                        if (aVar.a(placesBaseMapObjectsRepository$deselectCurrentIfDifferent$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        str2 = str;
                        g050Var = aVar;
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) placesBaseMapObjectsRepository$deselectCurrentIfDifferent$1.L$1;
                        str2 = (String) placesBaseMapObjectsRepository$deselectCurrentIfDifferent$1.L$0;
                        kotlin.b.b(obj);
                    }
                    in00 i3 = i();
                    id = i3 == null ? i3.getId() : null;
                    if (id != null && !id.equals(str2)) {
                        f(id);
                    }
                    return zy11.a;
                }
            }
            in00 i32 = i();
            if (i32 == null) {
            }
            if (id != null) {
                f(id);
            }
            return zy11.a;
        } finally {
            g050Var.d(null);
        }
        placesBaseMapObjectsRepository$deselectCurrentIfDifferent$1 = new PlacesBaseMapObjectsRepository$deselectCurrentIfDifferent$1(this, continuationImpl);
        Object obj2 = placesBaseMapObjectsRepository$deselectCurrentIfDifferent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesBaseMapObjectsRepository$deselectCurrentIfDifferent$1.label;
        if (i != 0) {
        }
    }

    public final void f(String str) {
        this.a.getClass();
        tje.N(this.b, uyj.a, null, new PlacesBaseMapObjectsRepository$deselectMapObjectById$1(this, str, null), 2);
    }

    public final Object g(ContinuationImpl continuationImpl) {
        this.a.getClass();
        Object k0 = tje.k0(uyj.a, new PlacesBaseMapObjectsRepository$deselectSelectedMapObject$2(this, null), continuationImpl);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r6v3, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(String str, ContinuationImpl continuationImpl) {
        PlacesBaseMapObjectsRepository$getMapObjectById$1 placesBaseMapObjectsRepository$getMapObjectById$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        try {
            if (continuationImpl instanceof PlacesBaseMapObjectsRepository$getMapObjectById$1) {
                placesBaseMapObjectsRepository$getMapObjectById$1 = (PlacesBaseMapObjectsRepository$getMapObjectById$1) continuationImpl;
                int i2 = placesBaseMapObjectsRepository$getMapObjectById$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    placesBaseMapObjectsRepository$getMapObjectById$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = placesBaseMapObjectsRepository$getMapObjectById$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = placesBaseMapObjectsRepository$getMapObjectById$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        placesBaseMapObjectsRepository$getMapObjectById$1.L$0 = str;
                        aVar = this.d;
                        placesBaseMapObjectsRepository$getMapObjectById$1.L$1 = aVar;
                        placesBaseMapObjectsRepository$getMapObjectById$1.label = 1;
                        if (aVar.a(placesBaseMapObjectsRepository$getMapObjectById$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r6 = (g050) placesBaseMapObjectsRepository$getMapObjectById$1.L$1;
                        String str2 = (String) placesBaseMapObjectsRepository$getMapObjectById$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r6;
                        str = str2;
                    }
                    return (kn00) this.e.get(str);
                }
            }
            return (kn00) this.e.get(str);
        } finally {
            aVar.d(null);
        }
        placesBaseMapObjectsRepository$getMapObjectById$1 = new PlacesBaseMapObjectsRepository$getMapObjectById$1(this, continuationImpl);
        Object obj2 = placesBaseMapObjectsRepository$getMapObjectById$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesBaseMapObjectsRepository$getMapObjectById$1.label;
        if (i != 0) {
        }
    }

    public final in00 i() {
        return (in00) this.g.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(ContinuationImpl continuationImpl) {
        PlacesBaseMapObjectsRepository$hasSelectedMapObject$1 placesBaseMapObjectsRepository$hasSelectedMapObject$1;
        int i;
        g050 g050Var;
        try {
            if (continuationImpl instanceof PlacesBaseMapObjectsRepository$hasSelectedMapObject$1) {
                placesBaseMapObjectsRepository$hasSelectedMapObject$1 = (PlacesBaseMapObjectsRepository$hasSelectedMapObject$1) continuationImpl;
                int i2 = placesBaseMapObjectsRepository$hasSelectedMapObject$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    placesBaseMapObjectsRepository$hasSelectedMapObject$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = placesBaseMapObjectsRepository$hasSelectedMapObject$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = placesBaseMapObjectsRepository$hasSelectedMapObject$1.label;
                    boolean z = true;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        kotlinx.coroutines.sync.a aVar = this.f;
                        placesBaseMapObjectsRepository$hasSelectedMapObject$1.L$0 = aVar;
                        placesBaseMapObjectsRepository$hasSelectedMapObject$1.label = 1;
                        if (aVar.a(placesBaseMapObjectsRepository$hasSelectedMapObject$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        g050Var = aVar;
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) placesBaseMapObjectsRepository$hasSelectedMapObject$1.L$0;
                        kotlin.b.b(obj);
                    }
                    if (i() != null) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
            }
            if (i() != null) {
            }
            return Boolean.valueOf(z);
        } finally {
            g050Var.d(null);
        }
        placesBaseMapObjectsRepository$hasSelectedMapObject$1 = new PlacesBaseMapObjectsRepository$hasSelectedMapObject$1(this, continuationImpl);
        Object obj2 = placesBaseMapObjectsRepository$hasSelectedMapObject$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesBaseMapObjectsRepository$hasSelectedMapObject$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
    }

    public abstract void k();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0050 A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:11:0x004a, B:13:0x0050, B:14:0x0058), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r6v3, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(String str, ContinuationImpl continuationImpl) {
        PlacesBaseMapObjectsRepository$isMapObjectSelected$1 placesBaseMapObjectsRepository$isMapObjectSelected$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        try {
            if (continuationImpl instanceof PlacesBaseMapObjectsRepository$isMapObjectSelected$1) {
                placesBaseMapObjectsRepository$isMapObjectSelected$1 = (PlacesBaseMapObjectsRepository$isMapObjectSelected$1) continuationImpl;
                int i2 = placesBaseMapObjectsRepository$isMapObjectSelected$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    placesBaseMapObjectsRepository$isMapObjectSelected$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = placesBaseMapObjectsRepository$isMapObjectSelected$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = placesBaseMapObjectsRepository$isMapObjectSelected$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        placesBaseMapObjectsRepository$isMapObjectSelected$1.L$0 = str;
                        aVar = this.f;
                        placesBaseMapObjectsRepository$isMapObjectSelected$1.L$1 = aVar;
                        placesBaseMapObjectsRepository$isMapObjectSelected$1.label = 1;
                        if (aVar.a(placesBaseMapObjectsRepository$isMapObjectSelected$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r6 = (g050) placesBaseMapObjectsRepository$isMapObjectSelected$1.L$1;
                        String str2 = (String) placesBaseMapObjectsRepository$isMapObjectSelected$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r6;
                        str = str2;
                    }
                    in00 i3 = i();
                    Boolean valueOf = Boolean.valueOf(jl40.l(i3 == null ? i3.getId() : null, str));
                    aVar.d(null);
                    return valueOf;
                }
            }
            in00 i32 = i();
            Boolean valueOf2 = Boolean.valueOf(jl40.l(i32 == null ? i32.getId() : null, str));
            aVar.d(null);
            return valueOf2;
        } catch (Throwable th) {
            aVar.d(null);
            throw th;
        }
        placesBaseMapObjectsRepository$isMapObjectSelected$1 = new PlacesBaseMapObjectsRepository$isMapObjectSelected$1(this, continuationImpl);
        Object obj2 = placesBaseMapObjectsRepository$isMapObjectSelected$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesBaseMapObjectsRepository$isMapObjectSelected$1.label;
        if (i != 0) {
        }
    }

    public abstract Object m(ContinuationImpl continuationImpl);

    public abstract Object n(in00 in00Var);

    public final Object o(String str, Continuation continuation) {
        this.a.getClass();
        Object k0 = tje.k0(uyj.a, new PlacesBaseMapObjectsRepository$redrawSelectedMapObject$2(this, str, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    public abstract void p(kn00 kn00Var);

    public final void q(String str) {
        tje.N(this.b, null, null, new PlacesBaseMapObjectsRepository$removeMapObjectById$1(this, str, null), 3);
    }

    public abstract Object r(Set set, ContinuationImpl continuationImpl);

    /* JADX WARN: Code restructure failed: missing block: B:31:0x004a, code lost:
    
        if (r2.a(r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(ContinuationImpl continuationImpl) {
        PlacesBaseMapObjectsRepository$replaySelectionIfAny$1 placesBaseMapObjectsRepository$replaySelectionIfAny$1;
        int i;
        g050 g050Var;
        in00 i2;
        try {
            if (continuationImpl instanceof PlacesBaseMapObjectsRepository$replaySelectionIfAny$1) {
                placesBaseMapObjectsRepository$replaySelectionIfAny$1 = (PlacesBaseMapObjectsRepository$replaySelectionIfAny$1) continuationImpl;
                int i3 = placesBaseMapObjectsRepository$replaySelectionIfAny$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    placesBaseMapObjectsRepository$replaySelectionIfAny$1.label = i3 - Integer.MIN_VALUE;
                    Object obj = placesBaseMapObjectsRepository$replaySelectionIfAny$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = placesBaseMapObjectsRepository$replaySelectionIfAny$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        g050Var = this.f;
                        placesBaseMapObjectsRepository$replaySelectionIfAny$1.L$0 = g050Var;
                        placesBaseMapObjectsRepository$replaySelectionIfAny$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return obj;
                        }
                        g050Var = (g050) placesBaseMapObjectsRepository$replaySelectionIfAny$1.L$0;
                        kotlin.b.b(obj);
                    }
                    i2 = i();
                    if (i2 != null) {
                        return zy11.a;
                    }
                    Object t = t(i2, false);
                    placesBaseMapObjectsRepository$replaySelectionIfAny$1.L$0 = null;
                    placesBaseMapObjectsRepository$replaySelectionIfAny$1.label = 2;
                    Object emit = this.i.emit(t, placesBaseMapObjectsRepository$replaySelectionIfAny$1);
                    return emit == coroutineSingletons ? coroutineSingletons : emit;
                }
            }
            i2 = i();
            if (i2 != null) {
            }
        } finally {
            g050Var.d(null);
        }
        placesBaseMapObjectsRepository$replaySelectionIfAny$1 = new PlacesBaseMapObjectsRepository$replaySelectionIfAny$1(this, continuationImpl);
        Object obj2 = placesBaseMapObjectsRepository$replaySelectionIfAny$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesBaseMapObjectsRepository$replaySelectionIfAny$1.label;
        if (i != 0) {
        }
    }

    public abstract Object t(in00 in00Var, boolean z);

    public final void u(in00 in00Var) {
        this.g.l(in00Var);
    }

    public abstract Object v(List list, Continuation continuation);

    public final Object w(in00 in00Var, boolean z, ContinuationImpl continuationImpl) {
        this.a.getClass();
        Object k0 = tje.k0(uyj.a, new PlacesBaseMapObjectsRepository$updateSelectedMapObject$2(this, in00Var, z, null), continuationImpl);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }
}
