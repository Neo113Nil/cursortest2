package com.yandex.go.places.impl.navigation;

import com.yandex.go.address.models.PlaceType;
import com.yandex.go.places.impl.navigation.common.stack.PlacesNavigationEntry$Source;
import defpackage.am80;
import defpackage.bcc0;
import defpackage.bm80;
import defpackage.bms;
import defpackage.cm80;
import defpackage.dm80;
import defpackage.i4b0;
import defpackage.i75;
import defpackage.k1j0;
import defpackage.l75;
import defpackage.m75;
import defpackage.mac0;
import defpackage.ny61;
import defpackage.sls;
import defpackage.ul80;
import defpackage.vl80;
import defpackage.w511;
import defpackage.wg30;
import defpackage.wl80;
import defpackage.xl80;
import defpackage.y7c0;
import defpackage.yl80;
import defpackage.zl80;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class e extends com.yandex.go.places.impl.navigation.common.stack.a {
    public final com.yandex.go.places.impl.navigation.common.base.c a;
    public final com.yandex.go.places.impl.navigation.common.navigator.internal.b b;
    public final com.yandex.go.places.experiments.flex.b c;
    public final i4b0 d;
    public final sls e;
    public final bms f;
    public final wg30 g;
    public boolean h;

    public e(com.yandex.go.places.impl.navigation.common.base.c cVar, com.yandex.go.places.impl.navigation.common.navigator.internal.b bVar, com.yandex.go.places.experiments.flex.b bVar2, i4b0 i4b0Var, sls slsVar, bms bmsVar, wg30 wg30Var) {
        this.a = cVar;
        this.b = bVar;
        this.c = bVar2;
        this.d = i4b0Var;
        this.e = slsVar;
        this.f = bmsVar;
        this.g = wg30Var;
    }

    public static final void c(e eVar) {
        eVar.e.invoke();
        eVar.b.m.a();
    }

    @Override // com.yandex.go.places.impl.navigation.common.stack.a
    public final Object a(bcc0 bcc0Var, boolean z, Continuation continuation) {
        if (z) {
            this.h = false;
            this.d.invoke(bcc0Var.a);
            return d(bcc0Var.a, (ContinuationImpl) continuation);
        }
        dm80 dm80Var = bcc0Var.a;
        PlacesNavigationEntry$Source placesNavigationEntry$Source = bcc0Var.b;
        boolean z2 = dm80Var instanceof yl80;
        com.yandex.go.places.impl.navigation.common.base.c cVar = this.a;
        zy11 zy11Var = zy11.a;
        if (z2) {
            int i = mac0.a[placesNavigationEntry$Source.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    cVar.d((yl80) dm80Var, true, null);
                    return zy11Var;
                }
                w511.b();
                return null;
            }
            Object invoke = ((PlacesInternalRouter$replayer$2$3) this.f).invoke(dm80Var, Boolean.valueOf(this.h), new PlacesMainEntryOpener$openChild$2(0, this, e.class, "handleScreenGoBack", "handleScreenGoBack()V", 0), continuation);
            if (invoke == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return invoke;
            }
        } else {
            if (dm80Var instanceof xl80) {
                int i2 = mac0.a[placesNavigationEntry$Source.ordinal()];
                if (i2 == 1) {
                    this.g.invoke(dm80Var, Boolean.valueOf(this.h), new PlacesMainEntryOpener$openChild$3(0, this, e.class, "handleScreenGoBack", "handleScreenGoBack()V", 0));
                    return zy11Var;
                }
                if (i2 == 2) {
                    cVar.c((xl80) dm80Var, true, true, new PlacesMainEntryOpener$openChild$4(0, this, e.class, "handleScreenGoBack", "handleScreenGoBack()V", 0));
                    return zy11Var;
                }
                w511.b();
                return null;
            }
            boolean z3 = dm80Var instanceof wl80;
            com.yandex.go.places.impl.navigation.common.navigator.internal.b bVar = this.b;
            if (z3) {
                int i3 = mac0.a[placesNavigationEntry$Source.ordinal()];
                if (i3 == 1) {
                    wl80 wl80Var = (wl80) dm80Var;
                    bVar.g(wl80Var.c, wl80Var.d, new PlacesMainEntryOpener$openChild$5(0, this, e.class, "handleScreenGoBack", "handleScreenGoBack()V", 0));
                    return zy11Var;
                }
                if (i3 != 2) {
                    w511.b();
                    return null;
                }
                wl80 wl80Var2 = (wl80) dm80Var;
                PlaceType placeType = wl80Var2.c;
                zzs zzsVar = wl80Var2.d;
                com.yandex.go.places.impl.navigation.common.base.d dVar = cVar.a;
                dVar.T().f(placeType, zzsVar, new i75(dVar, 4));
                return zy11Var;
            }
            if (dm80Var instanceof ul80) {
                cVar.a((ul80) dm80Var, true, null);
                return zy11Var;
            }
            if (dm80Var instanceof zl80) {
                cVar.f((zl80) dm80Var);
                return zy11Var;
            }
            if (dm80Var instanceof am80) {
                cVar.g((am80) dm80Var);
                return zy11Var;
            }
            if (dm80Var instanceof cm80) {
                cm80 cm80Var = (cm80) dm80Var;
                boolean z4 = cm80Var.f;
                this.h = z4;
                bVar.h(z4, cm80Var.g, new PlacesMainEntryOpener$openChild$6(0, this, e.class, "handleScreenGoBack", "handleScreenGoBack()V", 0));
                return zy11Var;
            }
            if (!(dm80Var instanceof vl80) && !(dm80Var instanceof bm80)) {
                w511.b();
                return null;
            }
        }
        return zy11Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(dm80 dm80Var, ContinuationImpl continuationImpl) {
        PlacesMainEntryOpener$openRoot$1 placesMainEntryOpener$openRoot$1;
        int i;
        y7c0 y7c0Var;
        dm80 dm80Var2 = dm80Var;
        if (continuationImpl instanceof PlacesMainEntryOpener$openRoot$1) {
            placesMainEntryOpener$openRoot$1 = (PlacesMainEntryOpener$openRoot$1) continuationImpl;
            int i2 = placesMainEntryOpener$openRoot$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                placesMainEntryOpener$openRoot$1.label = i2 - Integer.MIN_VALUE;
                Object obj = placesMainEntryOpener$openRoot$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placesMainEntryOpener$openRoot$1.label;
                int i3 = 1;
                com.yandex.go.places.impl.navigation.common.base.c cVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!(dm80Var2 instanceof vl80)) {
                        if (dm80Var2 instanceof cm80) {
                            cm80 cm80Var = (cm80) dm80Var2;
                            this.h = cm80Var.f;
                            cVar.h(cm80Var, false);
                        } else if (dm80Var2 instanceof yl80) {
                            cVar.d((yl80) dm80Var2, false, null);
                        } else if (dm80Var2 instanceof xl80) {
                            cVar.c((xl80) dm80Var2, true, false, new PlacesMainEntryOpener$openRoot$2(0, this, e.class, "handleScreenGoBack", "handleScreenGoBack()V", 0));
                        } else if (dm80Var2 instanceof wl80) {
                            wl80 wl80Var = (wl80) dm80Var2;
                            PlaceType placeType = wl80Var.c;
                            zzs zzsVar = wl80Var.d;
                            com.yandex.go.places.impl.navigation.common.base.d dVar = cVar.a;
                            dVar.T().f(placeType, zzsVar, new i75(dVar, 4));
                        } else if (dm80Var2 instanceof ul80) {
                            cVar.a((ul80) dm80Var2, false, null);
                        } else if (dm80Var2 instanceof zl80) {
                            cVar.f((zl80) dm80Var2);
                        } else if (dm80Var2 instanceof am80) {
                            cVar.g((am80) dm80Var2);
                        }
                        return zy11.a;
                    }
                    placesMainEntryOpener$openRoot$1.L$0 = dm80Var2;
                    placesMainEntryOpener$openRoot$1.label = 1;
                    obj = this.c.a(placesMainEntryOpener$openRoot$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dm80Var2 = (dm80) placesMainEntryOpener$openRoot$1.L$0;
                    kotlin.b.b(obj);
                }
                y7c0Var = (y7c0) obj;
                if (y7c0Var != null) {
                    this.h = true;
                    cVar.h(new cm80(dm80Var2.a, dm80Var2.b, ((vl80) dm80Var2).c, null, null, false, false, 120), false);
                } else {
                    com.yandex.go.places.impl.navigation.common.base.d dVar2 = cVar.a;
                    dVar2.T().d(new l75(3), y7c0Var, new m75(dVar2, i3), k1j0.a);
                }
                return zy11.a;
            }
        }
        placesMainEntryOpener$openRoot$1 = new PlacesMainEntryOpener$openRoot$1(this, continuationImpl);
        Object obj2 = placesMainEntryOpener$openRoot$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesMainEntryOpener$openRoot$1.label;
        int i32 = 1;
        com.yandex.go.places.impl.navigation.common.base.c cVar2 = this.a;
        if (i != 0) {
        }
        y7c0Var = (y7c0) obj2;
        if (y7c0Var != null) {
        }
        return zy11.a;
    }
}
