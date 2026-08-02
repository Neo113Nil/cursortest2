package com.yandex.go.address.address_map_picker.domain;

import com.yandex.go.address.address_map_picker.api.AddressMapPickerPointType;
import com.yandex.go.address.address_map_picker.data.AddressMapPickerAddressStateRepository;
import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.PlainAddress;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.clarify_address.AddressClarificationReason;
import com.yandex.go.pickup_from_photo.experiment.p;
import defpackage.ac1;
import defpackage.atd0;
import defpackage.az0;
import defpackage.bc1;
import defpackage.bz0;
import defpackage.c91;
import defpackage.cz0;
import defpackage.d6z;
import defpackage.d91;
import defpackage.dz0;
import defpackage.e91;
import defpackage.ep0;
import defpackage.ez0;
import defpackage.f11;
import defpackage.f21;
import defpackage.f2t;
import defpackage.f91;
import defpackage.fz0;
import defpackage.g21;
import defpackage.g2t;
import defpackage.g91;
import defpackage.gfp;
import defpackage.gz0;
import defpackage.h11;
import defpackage.h91;
import defpackage.hfp;
import defpackage.hz0;
import defpackage.i11;
import defpackage.i91;
import defpackage.ifp;
import defpackage.iz0;
import defpackage.j11;
import defpackage.j91;
import defpackage.jl40;
import defpackage.jy0;
import defpackage.jz0;
import defpackage.k91;
import defpackage.kip;
import defpackage.kr0;
import defpackage.kz0;
import defpackage.mo21;
import defpackage.mob0;
import defpackage.mq40;
import defpackage.n11;
import defpackage.ny61;
import defpackage.nz0;
import defpackage.oce0;
import defpackage.pce0;
import defpackage.po21;
import defpackage.ptd0;
import defpackage.pv0;
import defpackage.pzt0;
import defpackage.qce0;
import defpackage.tdp;
import defpackage.tje;
import defpackage.tse;
import defpackage.uy0;
import defpackage.vy0;
import defpackage.w511;
import defpackage.wb1;
import defpackage.wy0;
import defpackage.xtd0;
import defpackage.xy0;
import defpackage.yve;
import defpackage.yy0;
import defpackage.zb1;
import defpackage.zy0;
import defpackage.zy11;
import defpackage.zzs;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.address.clarification.UpdateReason;
import ru.yandex.taxi.persuggest.api.finalsuggest.PositionInitAction;
import ru.yandex.taxi.search.suggest.i;

/* loaded from: classes12.dex */
public final class c {
    public final tse a;
    public final g21 b;
    public final AddressMapPickerAddressStateRepository c;
    public final nz0 d;
    public final j11 e;
    public final i f;
    public final atd0 g;
    public final po21 h;
    public final jy0 i;
    public final kr0 j;
    public final ru.yandex.taxi.location.autolocation.a k;
    public final pce0 l;
    public final wb1 m;
    public final kip n;
    public final mob0 o;
    public final ru.yandex.taxi.favorites.address.impl.data.a p;
    public final ru.yandex.taxi.favorites.address.api.experiment.a q;
    public pzt0 r;

    public c(tse tseVar, g21 g21Var, AddressMapPickerAddressStateRepository addressMapPickerAddressStateRepository, nz0 nz0Var, j11 j11Var, i iVar, atd0 atd0Var, po21 po21Var, jy0 jy0Var, kr0 kr0Var, ru.yandex.taxi.location.autolocation.a aVar, pce0 pce0Var, wb1 wb1Var, kip kipVar, mob0 mob0Var, ru.yandex.taxi.favorites.address.impl.data.a aVar2, ru.yandex.taxi.favorites.address.api.experiment.a aVar3) {
        this.a = tseVar;
        this.b = g21Var;
        this.c = addressMapPickerAddressStateRepository;
        this.d = nz0Var;
        this.e = j11Var;
        this.f = iVar;
        this.g = atd0Var;
        this.h = po21Var;
        this.i = jy0Var;
        this.j = kr0Var;
        this.k = aVar;
        this.l = pce0Var;
        this.m = wb1Var;
        this.n = kipVar;
        this.o = mob0Var;
        this.p = aVar2;
        this.q = aVar3;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, pv0 pv0Var, Continuation continuation) {
        AddressMapPickerDomainActionsInteractor$onAddressInfoReceived$1 addressMapPickerDomainActionsInteractor$onAddressInfoReceived$1;
        int i;
        pv0 pv0Var2;
        k91 k91Var;
        f21 f21Var;
        String str;
        String str2;
        mob0 mob0Var = cVar.o;
        j11 j11Var = cVar.e;
        g21 g21Var = cVar.b;
        AddressMapPickerAddressStateRepository addressMapPickerAddressStateRepository = cVar.c;
        if (continuation instanceof AddressMapPickerDomainActionsInteractor$onAddressInfoReceived$1) {
            addressMapPickerDomainActionsInteractor$onAddressInfoReceived$1 = (AddressMapPickerDomainActionsInteractor$onAddressInfoReceived$1) continuation;
            int i2 = addressMapPickerDomainActionsInteractor$onAddressInfoReceived$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addressMapPickerDomainActionsInteractor$onAddressInfoReceived$1.label = i2 - Integer.MIN_VALUE;
                Object obj = addressMapPickerDomainActionsInteractor$onAddressInfoReceived$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addressMapPickerDomainActionsInteractor$onAddressInfoReceived$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    k91 b = cVar.b(pv0Var);
                    addressMapPickerAddressStateRepository.b(AddressMapPickerAddressStateRepository.State.Loaded);
                    if (!(b instanceof d91)) {
                        AddressMapPickerAddressStateRepository.a(addressMapPickerAddressStateRepository, pv0Var.a.B());
                    }
                    f21 a = g21Var.a();
                    if (a == null) {
                        return zy11Var;
                    }
                    addressMapPickerDomainActionsInteractor$onAddressInfoReceived$1.L$0 = null;
                    addressMapPickerDomainActionsInteractor$onAddressInfoReceived$1.L$1 = null;
                    addressMapPickerDomainActionsInteractor$onAddressInfoReceived$1.L$2 = null;
                    addressMapPickerDomainActionsInteractor$onAddressInfoReceived$1.L$3 = g21Var;
                    addressMapPickerDomainActionsInteractor$onAddressInfoReceived$1.L$4 = a;
                    addressMapPickerDomainActionsInteractor$onAddressInfoReceived$1.L$5 = b;
                    addressMapPickerDomainActionsInteractor$onAddressInfoReceived$1.L$6 = pv0Var;
                    addressMapPickerDomainActionsInteractor$onAddressInfoReceived$1.label = 1;
                    Object c = cVar.c(pv0Var, addressMapPickerDomainActionsInteractor$onAddressInfoReceived$1);
                    if (c == obj2) {
                        return obj2;
                    }
                    pv0Var2 = pv0Var;
                    k91Var = b;
                    f21Var = a;
                    obj = c;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pv0 pv0Var3 = (pv0) addressMapPickerDomainActionsInteractor$onAddressInfoReceived$1.L$6;
                    k91 k91Var2 = (k91) addressMapPickerDomainActionsInteractor$onAddressInfoReceived$1.L$5;
                    f21 f21Var2 = (f21) addressMapPickerDomainActionsInteractor$onAddressInfoReceived$1.L$4;
                    g21 g21Var2 = (g21) addressMapPickerDomainActionsInteractor$onAddressInfoReceived$1.L$3;
                    kotlin.b.b(obj);
                    pv0Var2 = pv0Var3;
                    k91Var = k91Var2;
                    f21Var = f21Var2;
                    g21Var = g21Var2;
                }
                ifp ifpVar = (ifp) obj;
                if (!(j11Var.a() instanceof f11)) {
                    String d = mob0Var.a.d();
                    if (mob0Var.b()) {
                        str = d;
                        if (!(j11Var.a() instanceof f11)) {
                            String e = mob0Var.a.e();
                            if (mob0Var.b()) {
                                str2 = e;
                                g21Var.b(f21.a(f21Var, k91Var, pv0Var2, ifpVar, str, str2, 1));
                                return zy11Var;
                            }
                        }
                        str2 = null;
                        g21Var.b(f21.a(f21Var, k91Var, pv0Var2, ifpVar, str, str2, 1));
                        return zy11Var;
                    }
                }
                str = null;
                if (!(j11Var.a() instanceof f11)) {
                }
                str2 = null;
                g21Var.b(f21.a(f21Var, k91Var, pv0Var2, ifpVar, str, str2, 1));
                return zy11Var;
            }
        }
        addressMapPickerDomainActionsInteractor$onAddressInfoReceived$1 = new AddressMapPickerDomainActionsInteractor$onAddressInfoReceived$1(cVar, continuation);
        Object obj3 = addressMapPickerDomainActionsInteractor$onAddressInfoReceived$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addressMapPickerDomainActionsInteractor$onAddressInfoReceived$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        ifp ifpVar2 = (ifp) obj3;
        if (!(j11Var.a() instanceof f11)) {
        }
        str = null;
        if (!(j11Var.a() instanceof f11)) {
        }
        str2 = null;
        g21Var.b(f21.a(f21Var, k91Var, pv0Var2, ifpVar2, str, str2, 1));
        return zy11Var2;
    }

    public final k91 b(pv0 pv0Var) {
        oce0 a = ((qce0) this.l).a(pv0Var.a, pv0Var.j, pv0Var.g);
        return this.m.c() ? c91.a : a != null ? new d91(a) : (pv0Var.b() || (this.e.a() instanceof f11)) ? g91.a : i91.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005b, code lost:
    
        if (r9 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(pv0 pv0Var, ContinuationImpl continuationImpl) {
        AddressMapPickerDomainActionsInteractor$getFavoriteButtonState$1 addressMapPickerDomainActionsInteractor$getFavoriteButtonState$1;
        int i;
        tdp tdpVar;
        tdp tdpVar2;
        if (continuationImpl instanceof AddressMapPickerDomainActionsInteractor$getFavoriteButtonState$1) {
            addressMapPickerDomainActionsInteractor$getFavoriteButtonState$1 = (AddressMapPickerDomainActionsInteractor$getFavoriteButtonState$1) continuationImpl;
            int i2 = addressMapPickerDomainActionsInteractor$getFavoriteButtonState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addressMapPickerDomainActionsInteractor$getFavoriteButtonState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = addressMapPickerDomainActionsInteractor$getFavoriteButtonState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addressMapPickerDomainActionsInteractor$getFavoriteButtonState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!(this.e.a() instanceof f11)) {
                        addressMapPickerDomainActionsInteractor$getFavoriteButtonState$1.L$0 = pv0Var;
                        addressMapPickerDomainActionsInteractor$getFavoriteButtonState$1.label = 1;
                        obj = this.q.a.b(addressMapPickerDomainActionsInteractor$getFavoriteButtonState$1);
                    }
                    return gfp.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tdpVar2 = (tdp) addressMapPickerDomainActionsInteractor$getFavoriteButtonState$1.L$1;
                    kotlin.b.b(obj);
                    if (!((Address) obj).getIsFavorite()) {
                        return new hfp(d6z.Y(tdpVar2, tdpVar2.i.a));
                    }
                    return gfp.a;
                }
                pv0Var = (pv0) addressMapPickerDomainActionsInteractor$getFavoriteButtonState$1.L$0;
                kotlin.b.b(obj);
                tdpVar = (tdp) obj;
                if (tdpVar.b) {
                    Address address = pv0Var.a;
                    addressMapPickerDomainActionsInteractor$getFavoriteButtonState$1.L$0 = null;
                    addressMapPickerDomainActionsInteractor$getFavoriteButtonState$1.L$1 = tdpVar;
                    addressMapPickerDomainActionsInteractor$getFavoriteButtonState$1.label = 2;
                    Serializable c = this.p.c(address, addressMapPickerDomainActionsInteractor$getFavoriteButtonState$1);
                    if (c != coroutineSingletons) {
                        obj = c;
                        tdpVar2 = tdpVar;
                        if (!((Address) obj).getIsFavorite()) {
                        }
                    }
                    return coroutineSingletons;
                }
                return gfp.a;
            }
        }
        addressMapPickerDomainActionsInteractor$getFavoriteButtonState$1 = new AddressMapPickerDomainActionsInteractor$getFavoriteButtonState$1(this, continuationImpl);
        Object obj2 = addressMapPickerDomainActionsInteractor$getFavoriteButtonState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addressMapPickerDomainActionsInteractor$getFavoriteButtonState$1.label;
        if (i != 0) {
        }
        tdpVar = (tdp) obj2;
        if (tdpVar.b) {
        }
        return gfp.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(10:5|6|7|(1:(2:10|11)(2:23|24))(3:25|(5:29|(1:31)(1:36)|32|33|(1:35))|21)|12|13|(1:15)|16|(2:18|19)|21))|41|6|7|(0)(0)|12|13|(0)|16|(0)|21|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009e, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009f, code lost:
    
        throw r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0034, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0070, code lost:
    
        r10 = new kotlin.Result.Failure(r10);
        r9 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(f21 f21Var, ContinuationImpl continuationImpl) {
        AddressMapPickerDomainActionsInteractor$goToUserLocation$1 addressMapPickerDomainActionsInteractor$goToUserLocation$1;
        int i;
        mo21 mo21Var;
        AddressMapPickerPointType addressMapPickerPointType;
        if (continuationImpl instanceof AddressMapPickerDomainActionsInteractor$goToUserLocation$1) {
            addressMapPickerDomainActionsInteractor$goToUserLocation$1 = (AddressMapPickerDomainActionsInteractor$goToUserLocation$1) continuationImpl;
            int i2 = addressMapPickerDomainActionsInteractor$goToUserLocation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addressMapPickerDomainActionsInteractor$goToUserLocation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = addressMapPickerDomainActionsInteractor$goToUserLocation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addressMapPickerDomainActionsInteractor$goToUserLocation$1.label;
                AddressMapPickerAddressStateRepository addressMapPickerAddressStateRepository = this.c;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (f21Var != 0 && (addressMapPickerPointType = f21Var.a) != null) {
                        ?? r10 = addressMapPickerAddressStateRepository.c.getValue() == AddressMapPickerAddressStateRepository.State.Loaded ? 1 : 0;
                        ru.yandex.taxi.location.autolocation.a aVar = this.k;
                        aVar.c.f(r10);
                        addressMapPickerDomainActionsInteractor$goToUserLocation$1.L$0 = null;
                        addressMapPickerDomainActionsInteractor$goToUserLocation$1.L$1 = addressMapPickerPointType;
                        addressMapPickerDomainActionsInteractor$goToUserLocation$1.I$0 = r10;
                        addressMapPickerDomainActionsInteractor$goToUserLocation$1.label = 1;
                        obj = ((ru.yandex.taxi.preorder.source.userposition.e) aVar.a).o(addressMapPickerDomainActionsInteractor$goToUserLocation$1);
                        f21Var = addressMapPickerPointType;
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AddressMapPickerPointType addressMapPickerPointType2 = (AddressMapPickerPointType) addressMapPickerDomainActionsInteractor$goToUserLocation$1.L$1;
                kotlin.b.b(obj);
                f21Var = addressMapPickerPointType2;
                Object failure = (mo21) obj;
                AddressMapPickerPointType addressMapPickerPointType3 = f21Var;
                mo21Var = (mo21) (failure instanceof Result.Failure ? null : failure);
                if (mo21Var != null) {
                    zzs a = mo21Var.a();
                    addressMapPickerAddressStateRepository.b.g(new yve(a, new Float(17.0f)));
                    g(a, addressMapPickerPointType3, "auto", PositionInitAction.GEO);
                    return zy11Var;
                }
                return zy11Var;
            }
        }
        addressMapPickerDomainActionsInteractor$goToUserLocation$1 = new AddressMapPickerDomainActionsInteractor$goToUserLocation$1(this, continuationImpl);
        Object obj2 = addressMapPickerDomainActionsInteractor$goToUserLocation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addressMapPickerDomainActionsInteractor$goToUserLocation$1.label;
        AddressMapPickerAddressStateRepository addressMapPickerAddressStateRepository2 = this.c;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        Object failure2 = (mo21) obj2;
        AddressMapPickerPointType addressMapPickerPointType32 = f21Var;
        mo21Var = (mo21) (failure2 instanceof Result.Failure ? null : failure2);
        if (mo21Var != null) {
        }
        return zy11Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x014e, code lost:
    
        if (r2 == r4) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(kz0 kz0Var, Continuation continuation) {
        AddressMapPickerDomainActionsInteractor$handleAction$1 addressMapPickerDomainActionsInteractor$handleAction$1;
        int i;
        Object obj;
        String str;
        ac1 b;
        pv0 pv0Var;
        f21 a;
        kz0 kz0Var2 = kz0Var;
        if (continuation instanceof AddressMapPickerDomainActionsInteractor$handleAction$1) {
            addressMapPickerDomainActionsInteractor$handleAction$1 = (AddressMapPickerDomainActionsInteractor$handleAction$1) continuation;
            int i2 = addressMapPickerDomainActionsInteractor$handleAction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addressMapPickerDomainActionsInteractor$handleAction$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = addressMapPickerDomainActionsInteractor$handleAction$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addressMapPickerDomainActionsInteractor$handleAction$1.label;
                h91 h91Var = h91.a;
                j91 j91Var = j91.a;
                AddressMapPickerAddressStateRepository addressMapPickerAddressStateRepository = this.c;
                Object obj4 = zy11.a;
                g21 g21Var = this.b;
                ac1 ac1Var = null;
                ac1Var = null;
                ac1Var = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    f21 a2 = g21Var.a();
                    if (kz0Var2 instanceof az0) {
                        az0 az0Var = (az0) kz0Var2;
                        zzs zzsVar = az0Var.a;
                        AddressMapPickerPointType addressMapPickerPointType = az0Var.b;
                        i11 i11Var = az0Var.c;
                        addressMapPickerDomainActionsInteractor$handleAction$1.L$0 = null;
                        addressMapPickerDomainActionsInteractor$handleAction$1.L$1 = null;
                        addressMapPickerDomainActionsInteractor$handleAction$1.label = 1;
                        Object f = f(zzsVar, addressMapPickerPointType, i11Var, addressMapPickerDomainActionsInteractor$handleAction$1);
                        if (f != obj3) {
                            return f;
                        }
                    } else {
                        boolean z = kz0Var2 instanceof yy0;
                        k91 k91Var = f91.a;
                        if (!z) {
                            boolean l = jl40.l(kz0Var2, bz0.a);
                            nz0 nz0Var = this.d;
                            if (!l) {
                                boolean l2 = jl40.l(kz0Var2, wy0.a);
                                jy0 jy0Var = this.i;
                                if (l2) {
                                    PlainAddress plainAddress = nz0Var.a;
                                    if (plainAddress != null) {
                                        mq40 mq40Var = mq40.f;
                                        jy0Var.getClass();
                                        jy0Var.b.m(new ZoneAddress(plainAddress, jy0Var.a.f(plainAddress.getZoneName())), null);
                                        n11 n11Var = jy0Var.c;
                                        n11Var.a = null;
                                        n11Var.b = null;
                                    } else if (a2 != null && (pv0Var = a2.c) != null) {
                                        jy0Var.a(pv0Var);
                                    }
                                    ((com.yandex.go.clarify_address.a) this.j).c(true, AddressClarificationReason.Map);
                                    return obj4;
                                }
                                if (jl40.l(kz0Var2, hz0.a)) {
                                    nz0Var.a = null;
                                    jy0Var.b();
                                    return obj4;
                                }
                                if (jl40.l(kz0Var2, zy0.a)) {
                                    addressMapPickerDomainActionsInteractor$handleAction$1.L$0 = null;
                                    addressMapPickerDomainActionsInteractor$handleAction$1.L$1 = null;
                                    addressMapPickerDomainActionsInteractor$handleAction$1.label = 3;
                                    Object d = d(a2, addressMapPickerDomainActionsInteractor$handleAction$1);
                                    if (d != obj3) {
                                        return d;
                                    }
                                } else if (kz0Var2 instanceof cz0) {
                                    pv0 pv0Var2 = ((cz0) kz0Var2).a;
                                    addressMapPickerDomainActionsInteractor$handleAction$1.L$0 = kz0Var2;
                                    addressMapPickerDomainActionsInteractor$handleAction$1.L$1 = null;
                                    addressMapPickerDomainActionsInteractor$handleAction$1.label = 4;
                                    obj2 = c(pv0Var2, addressMapPickerDomainActionsInteractor$handleAction$1);
                                } else {
                                    boolean l3 = jl40.l(kz0Var2, uy0.a);
                                    g91 g91Var = g91.a;
                                    if (l3) {
                                        if (a2 != null) {
                                            addressMapPickerAddressStateRepository.b(AddressMapPickerAddressStateRepository.State.Loaded);
                                            g21Var.b(f21.a(a2, g91Var, null, null, null, null, 61));
                                            return obj4;
                                        }
                                    } else if (kz0Var2 instanceof vy0) {
                                        if (a2 != null) {
                                            pv0 pv0Var3 = a2.c;
                                            pv0 c = pv0Var3 != null ? pv0Var3.c(((vy0) kz0Var2).a) : new pv0(((vy0) kz0Var2).a, null, null, null, null, null, null, null, 1022);
                                            addressMapPickerAddressStateRepository.b(AddressMapPickerAddressStateRepository.State.Loaded);
                                            g21Var.b(f21.a(a2, g91Var, c, null, null, null, 57));
                                            return obj4;
                                        }
                                    } else if (kz0Var2 instanceof jz0) {
                                        if (a2 != null) {
                                            g21Var.b(f21.a(a2, new e91(((jz0) kz0Var2).a), null, null, null, null, 61));
                                            return obj4;
                                        }
                                    } else if (jl40.l(kz0Var2, xy0.a)) {
                                        if (a2 != null) {
                                            pv0 pv0Var4 = a2.c;
                                            if (pv0Var4 != null) {
                                                k91Var = b(pv0Var4);
                                            }
                                            g21Var.b(f21.a(a2, k91Var, null, null, null, null, 61));
                                            return obj4;
                                        }
                                    } else if (kz0Var2 instanceof iz0) {
                                        String str2 = ((iz0) kz0Var2).a;
                                        wb1 wb1Var = this.m;
                                        ru.yandex.taxi.address.clarification.impl.repo.a aVar = wb1Var.a;
                                        List list = ((bc1) kotlinx.coroutines.flow.e.d(aVar.h).a.getValue()).a.d.b;
                                        ArrayList arrayList = new ArrayList();
                                        for (Object obj5 : list) {
                                            if (obj5 instanceof xtd0) {
                                                arrayList.add(obj5);
                                            }
                                        }
                                        Iterator it = arrayList.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                obj = null;
                                                break;
                                            }
                                            obj = it.next();
                                            if (jl40.l(((xtd0) obj).e, str2)) {
                                                break;
                                            }
                                        }
                                        xtd0 xtd0Var = (xtd0) obj;
                                        if (xtd0Var != null) {
                                            wb1Var.a(xtd0Var);
                                            List list2 = xtd0Var.d;
                                            ArrayList arrayList2 = new ArrayList();
                                            for (Object obj6 : list2) {
                                                if (obj6 instanceof ptd0) {
                                                    arrayList2.add(obj6);
                                                }
                                            }
                                            ptd0 ptd0Var = (ptd0) kotlin.collections.a.R(arrayList2);
                                            if (ptd0Var != null && (b = wb1Var.b((str = ptd0Var.a))) != null) {
                                                aVar.d(b.c, b.d);
                                                aVar.c(new ep0(b, true));
                                                wb1Var.f(str, UpdateReason.UPDATE_PICKUP_POINT_BY_CLICK_IN_LIST);
                                                ac1Var = b;
                                            }
                                        }
                                        if (ac1Var != null) {
                                            nz0Var.a = ac1Var.a;
                                            AddressMapPickerAddressStateRepository.a(addressMapPickerAddressStateRepository, ac1Var.b);
                                            return obj4;
                                        }
                                    } else if (kz0Var2 instanceof dz0) {
                                        zzs zzsVar2 = ((dz0) kz0Var2).a;
                                        if (a2 != null) {
                                            nz0Var.a = null;
                                            g21Var.b(f21.a(a2, k91Var, null, null, null, null, 61));
                                            AddressMapPickerAddressStateRepository.a(addressMapPickerAddressStateRepository, zzsVar2);
                                            g(zzsVar2, a2.a, "manual.panorama_pickup_point", PositionInitAction.MAP);
                                            return obj4;
                                        }
                                    } else {
                                        k91 k91Var2 = k91Var;
                                        if (jl40.l(kz0Var2, gz0.a)) {
                                            if (a2 != null) {
                                                g21Var.b(f21.a(a2, j91Var, null, null, null, null, 61));
                                                return obj4;
                                            }
                                        } else if (!jl40.l(kz0Var2, fz0.a)) {
                                            if (!jl40.l(kz0Var2, ez0.a)) {
                                                w511.b();
                                                return null;
                                            }
                                            if (a2 != null) {
                                                pv0 pv0Var5 = (pv0) this.f.i().orElse(null);
                                                if (pv0Var5 != null) {
                                                    k91Var2 = b(pv0Var5);
                                                }
                                                g21Var.b(f21.a(a2, k91Var2, null, null, null, null, 61));
                                                return obj4;
                                            }
                                        } else if (a2 != null) {
                                            g21Var.b(f21.a(a2, h91Var, null, null, null, null, 61));
                                            return obj4;
                                        }
                                    }
                                }
                            } else if (a2 != null) {
                                pzt0 pzt0Var = this.r;
                                if (pzt0Var != null) {
                                    pzt0Var.a(null);
                                }
                                nz0Var.a = null;
                                addressMapPickerAddressStateRepository.b(AddressMapPickerAddressStateRepository.State.Default);
                                g21Var.b(f21.a(a2, k91Var, null, null, null, null, 61));
                                return obj4;
                            }
                            return obj4;
                        }
                        yy0 yy0Var = (yy0) kz0Var2;
                        addressMapPickerDomainActionsInteractor$handleAction$1.L$0 = null;
                        addressMapPickerDomainActionsInteractor$handleAction$1.L$1 = null;
                        addressMapPickerDomainActionsInteractor$handleAction$1.label = 2;
                        if (jl40.l(a2 != null ? a2.b : null, k91Var)) {
                            g(yy0Var.a, a2.a, "manual", PositionInitAction.MAP);
                        }
                        if (obj4 != obj3) {
                            return obj4;
                        }
                    }
                    return obj3;
                }
                if (i == 1 || i == 2 || i == 3) {
                    kotlin.b.b(obj2);
                    return obj2;
                }
                if (i != 4) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kz0Var2 = (kz0) addressMapPickerDomainActionsInteractor$handleAction$1.L$0;
                kotlin.b.b(obj2);
                ifp ifpVar = (ifp) obj2;
                a = g21Var.a();
                if (a != null) {
                    k91 k91Var3 = a.b;
                    if (!jl40.l(k91Var3, j91Var) && !jl40.l(k91Var3, h91Var)) {
                        k91Var3 = b(((cz0) kz0Var2).a);
                    }
                    k91 k91Var4 = k91Var3;
                    cz0 cz0Var = (cz0) kz0Var2;
                    g21Var.b(f21.a(a, k91Var4, cz0Var.a, ifpVar, null, null, 49));
                    if (!(k91Var4 instanceof d91)) {
                        AddressMapPickerAddressStateRepository.a(addressMapPickerAddressStateRepository, cz0Var.a.a.B());
                        return obj4;
                    }
                }
                return obj4;
            }
        }
        addressMapPickerDomainActionsInteractor$handleAction$1 = new AddressMapPickerDomainActionsInteractor$handleAction$1(this, continuation);
        Object obj22 = addressMapPickerDomainActionsInteractor$handleAction$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addressMapPickerDomainActionsInteractor$handleAction$1.label;
        h91 h91Var2 = h91.a;
        j91 j91Var2 = j91.a;
        AddressMapPickerAddressStateRepository addressMapPickerAddressStateRepository2 = this.c;
        Object obj42 = zy11.a;
        g21 g21Var2 = this.b;
        ac1 ac1Var2 = null;
        ac1Var2 = null;
        ac1Var2 = null;
        if (i != 0) {
        }
        ifp ifpVar2 = (ifp) obj22;
        a = g21Var2.a();
        if (a != null) {
        }
        return obj42;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(zzs zzsVar, AddressMapPickerPointType addressMapPickerPointType, i11 i11Var, ContinuationImpl continuationImpl) {
        AddressMapPickerDomainActionsInteractor$initAddressMapPicker$1 addressMapPickerDomainActionsInteractor$initAddressMapPicker$1;
        int i;
        pv0 pv0Var;
        AddressMapPickerPointType addressMapPickerPointType2;
        pv0 pv0Var2;
        g21 g21Var;
        String str;
        String str2;
        k91 k91Var;
        pv0 pv0Var3;
        AddressMapPickerPointType addressMapPickerPointType3;
        zzs zzsVar2;
        zzs zzsVar3 = zzsVar;
        AddressMapPickerPointType addressMapPickerPointType4 = addressMapPickerPointType;
        if (continuationImpl instanceof AddressMapPickerDomainActionsInteractor$initAddressMapPicker$1) {
            addressMapPickerDomainActionsInteractor$initAddressMapPicker$1 = (AddressMapPickerDomainActionsInteractor$initAddressMapPicker$1) continuationImpl;
            int i2 = addressMapPickerDomainActionsInteractor$initAddressMapPicker$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addressMapPickerDomainActionsInteractor$initAddressMapPicker$1.label = i2 - Integer.MIN_VALUE;
                Object obj = addressMapPickerDomainActionsInteractor$initAddressMapPicker$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addressMapPickerDomainActionsInteractor$initAddressMapPicker$1.label;
                zy11 zy11Var = zy11.a;
                AddressMapPickerAddressStateRepository addressMapPickerAddressStateRepository = this.c;
                boolean z = true;
                String str3 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.d.a = null;
                    ru.yandex.taxi.address.clarification.impl.repo.a aVar = this.m.a;
                    zb1 zb1Var = zb1.c;
                    UpdateReason updateReason = UpdateReason.UNKNOWN;
                    if (!jl40.l(aVar.l, zb1Var)) {
                        aVar.l = zb1Var;
                        aVar.a(aVar.k, zb1Var, updateReason);
                    }
                    boolean z2 = i11Var instanceof f11;
                    g21 g21Var2 = this.b;
                    if (z2) {
                        g21Var2.b(new f21(addressMapPickerPointType4, str3, str3, 52));
                        g(zzsVar3, addressMapPickerPointType4, "auto", PositionInitAction.MAP);
                        return zy11Var;
                    }
                    pv0Var = (pv0) this.f.i().orElse(null);
                    jy0 jy0Var = this.i;
                    n11 n11Var = jy0Var.c;
                    g2t a = ((f2t) jy0Var.d).a();
                    n11Var.a = pv0Var;
                    n11Var.b = a;
                    mob0 mob0Var = this.o;
                    boolean b = mob0Var.b();
                    p pVar = mob0Var.a;
                    String d = pVar.d();
                    if (!b) {
                        d = null;
                    }
                    String e = pVar.e();
                    if (!b) {
                        e = null;
                    }
                    if (pv0Var == null) {
                        g21Var2.b(new f21(addressMapPickerPointType4, d, e, 12));
                        addressMapPickerPointType3 = addressMapPickerPointType4;
                        if (addressMapPickerPointType3 == AddressMapPickerPointType.Source || !((Boolean) this.n.a.b()).booleanValue()) {
                            if (pv0Var == null) {
                                g(zzsVar3, addressMapPickerPointType3, "auto", PositionInitAction.MAP);
                            }
                            return zy11Var;
                        }
                        if (pv0Var == null || (zzsVar2 = pv0Var.a.B()) == null) {
                            zzsVar2 = zzsVar3;
                        }
                        PositionInitAction positionInitAction = pv0Var != null ? PositionInitAction.CACHE : PositionInitAction.MAP;
                        if (pv0Var != null) {
                            z = false;
                        }
                        pzt0 pzt0Var = this.r;
                        if (pzt0Var != null) {
                            pzt0Var.a(null);
                        }
                        if (z) {
                            addressMapPickerAddressStateRepository.b(AddressMapPickerAddressStateRepository.State.Loading);
                        }
                        this.r = tje.N(this.a, null, null, new AddressMapPickerDomainActionsInteractor$requestFinalizeAddress$1(this, zzsVar2, addressMapPickerPointType3, positionInitAction, null), 3);
                        return zy11Var;
                    }
                    if (!(i11Var instanceof h11)) {
                        k91 b2 = b(pv0Var);
                        addressMapPickerAddressStateRepository.b(AddressMapPickerAddressStateRepository.State.Loaded);
                        if (!(b2 instanceof d91)) {
                            AddressMapPickerAddressStateRepository.a(addressMapPickerAddressStateRepository, pv0Var.a.B());
                        }
                    }
                    k91 b3 = b(pv0Var);
                    addressMapPickerDomainActionsInteractor$initAddressMapPicker$1.L$0 = zzsVar3;
                    addressMapPickerDomainActionsInteractor$initAddressMapPicker$1.L$1 = addressMapPickerPointType4;
                    addressMapPickerDomainActionsInteractor$initAddressMapPicker$1.L$2 = null;
                    addressMapPickerDomainActionsInteractor$initAddressMapPicker$1.L$3 = pv0Var;
                    addressMapPickerDomainActionsInteractor$initAddressMapPicker$1.L$4 = d;
                    addressMapPickerDomainActionsInteractor$initAddressMapPicker$1.L$5 = e;
                    addressMapPickerDomainActionsInteractor$initAddressMapPicker$1.L$6 = null;
                    addressMapPickerDomainActionsInteractor$initAddressMapPicker$1.L$7 = g21Var2;
                    addressMapPickerDomainActionsInteractor$initAddressMapPicker$1.L$8 = addressMapPickerPointType4;
                    addressMapPickerDomainActionsInteractor$initAddressMapPicker$1.L$9 = b3;
                    addressMapPickerDomainActionsInteractor$initAddressMapPicker$1.L$10 = pv0Var;
                    addressMapPickerDomainActionsInteractor$initAddressMapPicker$1.Z$0 = b;
                    z = true;
                    addressMapPickerDomainActionsInteractor$initAddressMapPicker$1.label = 1;
                    Object c = c(pv0Var, addressMapPickerDomainActionsInteractor$initAddressMapPicker$1);
                    if (c == obj2) {
                        return obj2;
                    }
                    addressMapPickerPointType2 = addressMapPickerPointType4;
                    pv0Var2 = pv0Var;
                    g21Var = g21Var2;
                    str = e;
                    str2 = d;
                    k91Var = b3;
                    pv0Var3 = pv0Var2;
                    obj = c;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pv0 pv0Var4 = (pv0) addressMapPickerDomainActionsInteractor$initAddressMapPicker$1.L$10;
                    k91 k91Var2 = (k91) addressMapPickerDomainActionsInteractor$initAddressMapPicker$1.L$9;
                    AddressMapPickerPointType addressMapPickerPointType5 = (AddressMapPickerPointType) addressMapPickerDomainActionsInteractor$initAddressMapPicker$1.L$8;
                    g21Var = (g21) addressMapPickerDomainActionsInteractor$initAddressMapPicker$1.L$7;
                    String str4 = (String) addressMapPickerDomainActionsInteractor$initAddressMapPicker$1.L$5;
                    String str5 = (String) addressMapPickerDomainActionsInteractor$initAddressMapPicker$1.L$4;
                    pv0 pv0Var5 = (pv0) addressMapPickerDomainActionsInteractor$initAddressMapPicker$1.L$3;
                    AddressMapPickerPointType addressMapPickerPointType6 = (AddressMapPickerPointType) addressMapPickerDomainActionsInteractor$initAddressMapPicker$1.L$1;
                    zzs zzsVar4 = (zzs) addressMapPickerDomainActionsInteractor$initAddressMapPicker$1.L$0;
                    kotlin.b.b(obj);
                    k91Var = k91Var2;
                    addressMapPickerPointType4 = addressMapPickerPointType6;
                    addressMapPickerPointType2 = addressMapPickerPointType5;
                    pv0Var3 = pv0Var5;
                    pv0Var2 = pv0Var4;
                    zzsVar3 = zzsVar4;
                    str = str4;
                    str2 = str5;
                }
                g21Var.b(new f21(addressMapPickerPointType2, k91Var, pv0Var2, (ifp) obj, str2, str));
                pv0Var = pv0Var3;
                addressMapPickerPointType3 = addressMapPickerPointType4;
                if (addressMapPickerPointType3 == AddressMapPickerPointType.Source) {
                }
                if (pv0Var == null) {
                }
                return zy11Var;
            }
        }
        addressMapPickerDomainActionsInteractor$initAddressMapPicker$1 = new AddressMapPickerDomainActionsInteractor$initAddressMapPicker$1(this, continuationImpl);
        Object obj3 = addressMapPickerDomainActionsInteractor$initAddressMapPicker$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addressMapPickerDomainActionsInteractor$initAddressMapPicker$1.label;
        zy11 zy11Var2 = zy11.a;
        AddressMapPickerAddressStateRepository addressMapPickerAddressStateRepository2 = this.c;
        boolean z3 = true;
        String str32 = null;
        if (i != 0) {
        }
        g21Var.b(new f21(addressMapPickerPointType2, k91Var, pv0Var2, (ifp) obj3, str2, str));
        pv0Var = pv0Var3;
        addressMapPickerPointType3 = addressMapPickerPointType4;
        if (addressMapPickerPointType3 == AddressMapPickerPointType.Source) {
        }
        if (pv0Var == null) {
        }
        return zy11Var2;
    }

    public final void g(zzs zzsVar, AddressMapPickerPointType addressMapPickerPointType, String str, PositionInitAction positionInitAction) {
        pzt0 pzt0Var = this.r;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.c.b(AddressMapPickerAddressStateRepository.State.Loading);
        this.r = tje.N(this.a, null, null, new AddressMapPickerDomainActionsInteractor$requestAddress$1(this, zzsVar, str, addressMapPickerPointType, positionInitAction, null), 3);
    }
}
