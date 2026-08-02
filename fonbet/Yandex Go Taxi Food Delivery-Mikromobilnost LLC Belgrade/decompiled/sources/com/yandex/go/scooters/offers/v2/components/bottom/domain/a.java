package com.yandex.go.scooters.offers.v2.components.bottom.domain;

import android.content.Context;
import com.yandex.go.scooters.domain.model.ScootersComeFrom;
import com.yandex.go.sharing_personal_goals.api.domain.model.SharingPersonalGoalsDisplayContext;
import com.yandex.go.sharing_personal_goals.api.domain.model.SharingPersonalGoalsServiceName;
import defpackage.aho0;
import defpackage.awn0;
import defpackage.b3n0;
import defpackage.b4p0;
import defpackage.dho0;
import defpackage.dxo0;
import defpackage.e8p0;
import defpackage.eho0;
import defpackage.exo0;
import defpackage.f3n0;
import defpackage.fxo0;
import defpackage.g3n0;
import defpackage.gxo0;
import defpackage.ha2;
import defpackage.hfa0;
import defpackage.hxo0;
import defpackage.i4b1;
import defpackage.k1b1;
import defpackage.kyh0;
import defpackage.ny61;
import defpackage.oqr0;
import defpackage.p3n0;
import defpackage.prr0;
import defpackage.q1b1;
import defpackage.q3n0;
import defpackage.qrr0;
import defpackage.rrr0;
import defpackage.sco0;
import defpackage.srr0;
import defpackage.two0;
import defpackage.vbn0;
import defpackage.w511;
import defpackage.wrr0;
import defpackage.xwo0;
import defpackage.y5n0;
import defpackage.y5p0;
import defpackage.ygo0;
import defpackage.z2o0;
import defpackage.zgo0;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes13.dex */
public final class a {
    public final Context a;
    public final e b;
    public final y5p0 c;
    public final b3n0 d;
    public final z2o0 e;
    public final wrr0 f;
    public final zgo0 g;
    public final hxo0 h;

    public a(Context context, e eVar, y5p0 y5p0Var, b3n0 b3n0Var, z2o0 z2o0Var, wrr0 wrr0Var, zgo0 zgo0Var, hxo0 hxo0Var) {
        this.a = context;
        this.b = eVar;
        this.c = y5p0Var;
        this.d = b3n0Var;
        this.e = z2o0Var;
        this.f = wrr0Var;
        this.g = zgo0Var;
        this.h = hxo0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0123 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(y5n0 y5n0Var, hxo0.a aVar, ContinuationImpl continuationImpl) {
        ScootersBottomComponentStateInteractor$configureBottomStateByOffer$1 scootersBottomComponentStateInteractor$configureBottomStateByOffer$1;
        int i;
        b4p0 a;
        int i2;
        exo0 exo0Var;
        CharSequence charSequence;
        Object d;
        sco0 sco0Var;
        two0 two0Var;
        awn0 awn0Var;
        int i3;
        boolean z;
        ScootersComeFrom scootersComeFrom;
        hfa0 hfa0Var;
        fxo0 fxo0Var;
        if (continuationImpl instanceof ScootersBottomComponentStateInteractor$configureBottomStateByOffer$1) {
            scootersBottomComponentStateInteractor$configureBottomStateByOffer$1 = (ScootersBottomComponentStateInteractor$configureBottomStateByOffer$1) continuationImpl;
            int i4 = scootersBottomComponentStateInteractor$configureBottomStateByOffer$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                scootersBottomComponentStateInteractor$configureBottomStateByOffer$1.label = i4 - Integer.MIN_VALUE;
                Object obj = scootersBottomComponentStateInteractor$configureBottomStateByOffer$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersBottomComponentStateInteractor$configureBottomStateByOffer$1.label;
                boolean z2 = true;
                if (i != 0) {
                    b.b(obj);
                    a = this.c.a();
                    if (a == null) {
                        return new q3n0(this.b.a.getString(kyh0.scooters_card_button_on_loading), 2);
                    }
                    vbn0 vbn0Var = y5n0Var.j;
                    awn0 awn0Var2 = y5n0Var.f;
                    two0 two0Var2 = vbn0Var.d;
                    xwo0 xwo0Var = two0Var2 instanceof xwo0 ? (xwo0) two0Var2 : null;
                    gxo0 gxo0Var = xwo0Var != null ? xwo0Var.a : null;
                    if (aVar.b) {
                        if ((gxo0Var != null ? gxo0Var.f : null) != null) {
                            i2 = 1;
                            boolean z3 = y5n0Var.b;
                            ScootersComeFrom scootersComeFrom2 = vbn0Var.b;
                            hfa0 hfa0Var2 = y5n0Var.d;
                            exo0Var = (gxo0Var != null || (fxo0Var = gxo0Var.f) == null) ? null : fxo0Var.b;
                            if (i2 != 0 && exo0Var != null) {
                                String obj3 = exo0Var.a.toString();
                                String str = exo0Var.b;
                                if (awn0Var2 != null || (r5 = awn0Var2.c) == null) {
                                    e8p0 e8p0Var = q1b1.d(vbn0Var).a.b;
                                }
                                awn0Var2 = new awn0(obj3, str, e8p0Var);
                            }
                            fxo0 fxo0Var2 = gxo0Var == null ? gxo0Var.f : null;
                            if (i2 != 0 || fxo0Var2 == null) {
                                charSequence = null;
                            } else {
                                dxo0 dxo0Var = fxo0Var2.a;
                                charSequence = k1b1.a(this.a, dxo0Var.a, dxo0Var.b, false);
                            }
                            two0 two0Var3 = vbn0Var.d;
                            sco0 sco0Var2 = y5n0Var.a;
                            scootersBottomComponentStateInteractor$configureBottomStateByOffer$1.L$0 = null;
                            scootersBottomComponentStateInteractor$configureBottomStateByOffer$1.L$1 = null;
                            scootersBottomComponentStateInteractor$configureBottomStateByOffer$1.L$2 = a;
                            scootersBottomComponentStateInteractor$configureBottomStateByOffer$1.L$3 = null;
                            scootersBottomComponentStateInteractor$configureBottomStateByOffer$1.L$4 = scootersComeFrom2;
                            scootersBottomComponentStateInteractor$configureBottomStateByOffer$1.L$5 = hfa0Var2;
                            scootersBottomComponentStateInteractor$configureBottomStateByOffer$1.L$6 = awn0Var2;
                            scootersBottomComponentStateInteractor$configureBottomStateByOffer$1.L$7 = charSequence;
                            scootersBottomComponentStateInteractor$configureBottomStateByOffer$1.L$8 = two0Var3;
                            scootersBottomComponentStateInteractor$configureBottomStateByOffer$1.L$9 = sco0Var2;
                            scootersBottomComponentStateInteractor$configureBottomStateByOffer$1.I$0 = i2;
                            scootersBottomComponentStateInteractor$configureBottomStateByOffer$1.Z$0 = z3;
                            z2 = true;
                            scootersBottomComponentStateInteractor$configureBottomStateByOffer$1.label = 1;
                            d = d(scootersBottomComponentStateInteractor$configureBottomStateByOffer$1);
                            if (d != obj2) {
                                return obj2;
                            }
                            sco0Var = sco0Var2;
                            two0Var = two0Var3;
                            awn0Var = awn0Var2;
                            i3 = i2;
                            z = z3;
                            scootersComeFrom = scootersComeFrom2;
                            hfa0Var = hfa0Var2;
                            obj = d;
                        }
                    }
                    i2 = 0;
                    boolean z32 = y5n0Var.b;
                    ScootersComeFrom scootersComeFrom22 = vbn0Var.b;
                    hfa0 hfa0Var22 = y5n0Var.d;
                    if (gxo0Var != null) {
                    }
                    if (i2 != 0) {
                        String obj32 = exo0Var.a.toString();
                        String str2 = exo0Var.b;
                        if (awn0Var2 != null) {
                        }
                        e8p0 e8p0Var2 = q1b1.d(vbn0Var).a.b;
                        awn0Var2 = new awn0(obj32, str2, e8p0Var2);
                    }
                    if (gxo0Var == null) {
                    }
                    if (i2 != 0) {
                    }
                    charSequence = null;
                    two0 two0Var32 = vbn0Var.d;
                    sco0 sco0Var22 = y5n0Var.a;
                    scootersBottomComponentStateInteractor$configureBottomStateByOffer$1.L$0 = null;
                    scootersBottomComponentStateInteractor$configureBottomStateByOffer$1.L$1 = null;
                    scootersBottomComponentStateInteractor$configureBottomStateByOffer$1.L$2 = a;
                    scootersBottomComponentStateInteractor$configureBottomStateByOffer$1.L$3 = null;
                    scootersBottomComponentStateInteractor$configureBottomStateByOffer$1.L$4 = scootersComeFrom22;
                    scootersBottomComponentStateInteractor$configureBottomStateByOffer$1.L$5 = hfa0Var22;
                    scootersBottomComponentStateInteractor$configureBottomStateByOffer$1.L$6 = awn0Var2;
                    scootersBottomComponentStateInteractor$configureBottomStateByOffer$1.L$7 = charSequence;
                    scootersBottomComponentStateInteractor$configureBottomStateByOffer$1.L$8 = two0Var32;
                    scootersBottomComponentStateInteractor$configureBottomStateByOffer$1.L$9 = sco0Var22;
                    scootersBottomComponentStateInteractor$configureBottomStateByOffer$1.I$0 = i2;
                    scootersBottomComponentStateInteractor$configureBottomStateByOffer$1.Z$0 = z32;
                    z2 = true;
                    scootersBottomComponentStateInteractor$configureBottomStateByOffer$1.label = 1;
                    d = d(scootersBottomComponentStateInteractor$configureBottomStateByOffer$1);
                    if (d != obj2) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z4 = scootersBottomComponentStateInteractor$configureBottomStateByOffer$1.Z$0;
                    i3 = scootersBottomComponentStateInteractor$configureBottomStateByOffer$1.I$0;
                    sco0 sco0Var3 = (sco0) scootersBottomComponentStateInteractor$configureBottomStateByOffer$1.L$9;
                    two0 two0Var4 = (two0) scootersBottomComponentStateInteractor$configureBottomStateByOffer$1.L$8;
                    charSequence = (CharSequence) scootersBottomComponentStateInteractor$configureBottomStateByOffer$1.L$7;
                    awn0 awn0Var3 = (awn0) scootersBottomComponentStateInteractor$configureBottomStateByOffer$1.L$6;
                    hfa0 hfa0Var3 = (hfa0) scootersBottomComponentStateInteractor$configureBottomStateByOffer$1.L$5;
                    ScootersComeFrom scootersComeFrom3 = (ScootersComeFrom) scootersBottomComponentStateInteractor$configureBottomStateByOffer$1.L$4;
                    a = (b4p0) scootersBottomComponentStateInteractor$configureBottomStateByOffer$1.L$2;
                    b.b(obj);
                    z = z4;
                    sco0Var = sco0Var3;
                    two0Var = two0Var4;
                    awn0Var = awn0Var3;
                    hfa0Var = hfa0Var3;
                    scootersComeFrom = scootersComeFrom3;
                }
                return new p3n0(a, z, scootersComeFrom, hfa0Var, awn0Var, charSequence, two0Var, i3 == 0 ? z2 : false, sco0Var, (eho0) obj, (i3 != 0 || z) ? f3n0.a : g3n0.a);
            }
        }
        scootersBottomComponentStateInteractor$configureBottomStateByOffer$1 = new ScootersBottomComponentStateInteractor$configureBottomStateByOffer$1(this, continuationImpl);
        Object obj4 = scootersBottomComponentStateInteractor$configureBottomStateByOffer$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersBottomComponentStateInteractor$configureBottomStateByOffer$1.label;
        boolean z22 = true;
        if (i != 0) {
        }
        return new p3n0(a, z, scootersComeFrom, hfa0Var, awn0Var, charSequence, two0Var, i3 == 0 ? z22 : false, sco0Var, (eho0) obj4, (i3 != 0 || z) ? f3n0.a : g3n0.a);
    }

    public final q3n0 b() {
        return new q3n0(this.b.a.getString(kyh0.scooters_passes_purchasing), 2);
    }

    public final ha2 c() {
        return kotlinx.coroutines.flow.e.n(kotlinx.coroutines.flow.e.d(this.e.a), kotlinx.coroutines.flow.e.d(this.d.a), kotlinx.coroutines.flow.e.d(this.h.c), new ScootersBottomComponentStateInteractor$listenToBottomState$1(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0058, code lost:
    
        if (r13 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x005a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0042, code lost:
    
        if (r13 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        ScootersBottomComponentStateInteractor$loadPersonalGoalsState$1 scootersBottomComponentStateInteractor$loadPersonalGoalsState$1;
        Object obj;
        int i;
        if (continuationImpl instanceof ScootersBottomComponentStateInteractor$loadPersonalGoalsState$1) {
            scootersBottomComponentStateInteractor$loadPersonalGoalsState$1 = (ScootersBottomComponentStateInteractor$loadPersonalGoalsState$1) continuationImpl;
            int i2 = scootersBottomComponentStateInteractor$loadPersonalGoalsState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersBottomComponentStateInteractor$loadPersonalGoalsState$1.label = i2 - Integer.MIN_VALUE;
                obj = scootersBottomComponentStateInteractor$loadPersonalGoalsState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersBottomComponentStateInteractor$loadPersonalGoalsState$1.label;
                if (i != 0) {
                    b.b(obj);
                    scootersBottomComponentStateInteractor$loadPersonalGoalsState$1.label = 1;
                    obj = this.g.a.b(scootersBottomComponentStateInteractor$loadPersonalGoalsState$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        srr0 srr0Var = (srr0) obj;
                        if (srr0Var != null) {
                            if (srr0Var instanceof prr0) {
                                prr0 prr0Var = (prr0) srr0Var;
                                CharSequence charSequence = prr0Var.a;
                                if (charSequence != null) {
                                    CharSequence charSequence2 = prr0Var.b;
                                    String str = prr0Var.c;
                                    oqr0 oqr0Var = prr0Var.d;
                                    return new aho0(charSequence, charSequence2, oqr0Var != null ? oqr0Var.a : null, str);
                                }
                            } else {
                                if (!(srr0Var instanceof rrr0)) {
                                    if (srr0Var instanceof qrr0) {
                                        qrr0 qrr0Var = (qrr0) srr0Var;
                                        return i4b1.b(qrr0Var.a, qrr0Var.b);
                                    }
                                    w511.b();
                                    return null;
                                }
                                rrr0 rrr0Var = (rrr0) srr0Var;
                                CharSequence charSequence3 = rrr0Var.a;
                                if (charSequence3 != null) {
                                    return new dho0(charSequence3, rrr0Var.b, rrr0Var.c, rrr0Var.e, rrr0Var.d);
                                }
                            }
                        }
                        return null;
                    }
                    b.b(obj);
                }
                if (((ygo0) obj).b) {
                    SharingPersonalGoalsServiceName sharingPersonalGoalsServiceName = SharingPersonalGoalsServiceName.SCOOTERS;
                    SharingPersonalGoalsDisplayContext sharingPersonalGoalsDisplayContext = SharingPersonalGoalsDisplayContext.OFFER_CARD;
                    scootersBottomComponentStateInteractor$loadPersonalGoalsState$1.label = 2;
                    obj = this.f.a(sharingPersonalGoalsServiceName, sharingPersonalGoalsDisplayContext, scootersBottomComponentStateInteractor$loadPersonalGoalsState$1);
                }
                return null;
            }
        }
        scootersBottomComponentStateInteractor$loadPersonalGoalsState$1 = new ScootersBottomComponentStateInteractor$loadPersonalGoalsState$1(this, continuationImpl);
        obj = scootersBottomComponentStateInteractor$loadPersonalGoalsState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersBottomComponentStateInteractor$loadPersonalGoalsState$1.label;
        if (i != 0) {
        }
        if (((ygo0) obj).b) {
        }
        return null;
    }
}
