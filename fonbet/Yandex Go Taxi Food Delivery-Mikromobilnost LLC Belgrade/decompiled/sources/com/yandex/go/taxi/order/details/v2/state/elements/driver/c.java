package com.yandex.go.taxi.order.details.v2.state.elements.driver;

import android.content.Context;
import com.yandex.go.taxi.order.details.v2.state.elements.driver.caricon.RideCardDriverCarIconRepository$DriverCarType;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$DriverInfo;
import com.yandex.go.taxi.order.models.api.response.driver.CarNumberDto;
import com.yandex.go.taxi.order.models.api.response.driver.DriverInfoBadgesBlock;
import com.yandex.go.taxi.order.models.api.response.driver.RideCardDriverState;
import defpackage.cdc;
import defpackage.evu0;
import defpackage.g92;
import defpackage.h3y;
import defpackage.hgk0;
import defpackage.ijk0;
import defpackage.kdc;
import defpackage.lgk0;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.ogk0;
import defpackage.pdc;
import defpackage.pgk0;
import defpackage.rol0;
import defpackage.s8o;
import defpackage.s9k0;
import defpackage.t48;
import defpackage.t7s;
import defpackage.tgk0;
import defpackage.ufu;
import defpackage.vgk0;
import defpackage.vng;
import defpackage.wgk0;
import defpackage.xgk0;
import defpackage.ygk0;
import defpackage.yjk0;
import defpackage.yuc0;
import defpackage.zuc0;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes14.dex */
public final class c {
    public final o2y0 a;
    public final t48 b;
    public final h3y c;
    public final ru.yandex.taxi.widget.c d;
    public final com.yandex.go.taxi.order.details.v2.state.elements.driver.avatar.a e;
    public final com.yandex.go.taxi.order.details.v2.state.elements.driver.caricon.a f;
    public final pgk0 g;

    public c(o2y0 o2y0Var, t48 t48Var, h3y h3yVar, ru.yandex.taxi.widget.c cVar, com.yandex.go.taxi.order.details.v2.state.elements.driver.avatar.a aVar, com.yandex.go.taxi.order.details.v2.state.elements.driver.caricon.a aVar2, pgk0 pgk0Var) {
        this.a = o2y0Var;
        this.b = t48Var;
        this.c = h3yVar;
        this.d = cVar;
        this.e = aVar;
        this.f = aVar2;
        this.g = pgk0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x00a6, code lost:
    
        if (r2 == r4) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00c1, code lost:
    
        if (r2 == r4) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(RideCardItemDto$DriverInfo rideCardItemDto$DriverInfo, ContinuationImpl continuationImpl) {
        RideCardDriverItemDataSource$createBaseUiState$1 rideCardDriverItemDataSource$createBaseUiState$1;
        int i;
        CharSequence charSequence;
        RideCardItemDto$DriverInfo rideCardItemDto$DriverInfo2;
        xgk0 vgk0Var;
        CharSequence charSequence2;
        RideCardItemDto$DriverInfo rideCardItemDto$DriverInfo3;
        CharSequence charSequence3;
        RideCardItemDto$DriverInfo rideCardItemDto$DriverInfo4;
        CharSequence charSequence4;
        DriverInfoBadgesBlock driverInfoBadgesBlock;
        lgk0 lgk0Var;
        FormattedText formattedText;
        CharSequence charSequence5;
        RideCardItemDto$DriverInfo rideCardItemDto$DriverInfo5;
        CarNumberDto carNumberDto;
        RideCardDriverState rideCardDriverState;
        RideCardItemDto$DriverInfo rideCardItemDto$DriverInfo6 = rideCardItemDto$DriverInfo;
        if (continuationImpl instanceof RideCardDriverItemDataSource$createBaseUiState$1) {
            rideCardDriverItemDataSource$createBaseUiState$1 = (RideCardDriverItemDataSource$createBaseUiState$1) continuationImpl;
            int i2 = rideCardDriverItemDataSource$createBaseUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardDriverItemDataSource$createBaseUiState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = rideCardDriverItemDataSource$createBaseUiState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardDriverItemDataSource$createBaseUiState$1.label;
                ru.yandex.taxi.widget.c cVar = this.d;
                if (i != 0) {
                    kotlin.b.b(obj);
                    FormattedText formattedText2 = rideCardItemDto$DriverInfo6.j;
                    if (formattedText2 == null) {
                        FormattedText formattedText3 = rideCardItemDto$DriverInfo6.i;
                        if (formattedText3 != null) {
                            rideCardDriverItemDataSource$createBaseUiState$1.L$0 = rideCardItemDto$DriverInfo6;
                            rideCardDriverItemDataSource$createBaseUiState$1.L$1 = null;
                            rideCardDriverItemDataSource$createBaseUiState$1.label = 1;
                            obj = ru.yandex.taxi.widget.c.i(cVar, formattedText3, null, rideCardDriverItemDataSource$createBaseUiState$1, 30);
                        } else {
                            charSequence = null;
                            rideCardItemDto$DriverInfo2 = rideCardItemDto$DriverInfo6;
                            vgk0Var = new vgk0(charSequence);
                            formattedText = rideCardItemDto$DriverInfo2.l;
                            if (formattedText == null) {
                            }
                        }
                    } else {
                        rideCardDriverItemDataSource$createBaseUiState$1.L$0 = rideCardItemDto$DriverInfo6;
                        rideCardDriverItemDataSource$createBaseUiState$1.L$1 = null;
                        rideCardDriverItemDataSource$createBaseUiState$1.label = 2;
                        obj = ru.yandex.taxi.widget.c.i(cVar, formattedText2, null, rideCardDriverItemDataSource$createBaseUiState$1, 30);
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    rideCardItemDto$DriverInfo6 = (RideCardItemDto$DriverInfo) rideCardDriverItemDataSource$createBaseUiState$1.L$0;
                    kotlin.b.b(obj);
                    charSequence = (CharSequence) obj;
                    rideCardItemDto$DriverInfo2 = rideCardItemDto$DriverInfo6;
                    vgk0Var = new vgk0(charSequence);
                    formattedText = rideCardItemDto$DriverInfo2.l;
                    if (formattedText == null) {
                    }
                } else if (i == 2) {
                    rideCardItemDto$DriverInfo6 = (RideCardItemDto$DriverInfo) rideCardDriverItemDataSource$createBaseUiState$1.L$0;
                    kotlin.b.b(obj);
                    CharSequence charSequence6 = (CharSequence) obj;
                    if (charSequence6 == null) {
                        charSequence6 = "";
                    }
                    FormattedText formattedText4 = rideCardItemDto$DriverInfo6.k;
                    if (formattedText4 != null) {
                        rideCardDriverItemDataSource$createBaseUiState$1.L$0 = rideCardItemDto$DriverInfo6;
                        rideCardDriverItemDataSource$createBaseUiState$1.L$1 = charSequence6;
                        rideCardDriverItemDataSource$createBaseUiState$1.L$2 = null;
                        rideCardDriverItemDataSource$createBaseUiState$1.label = 3;
                        Object i3 = ru.yandex.taxi.widget.c.i(cVar, formattedText4, null, rideCardDriverItemDataSource$createBaseUiState$1, 30);
                        if (i3 != coroutineSingletons) {
                            rideCardItemDto$DriverInfo4 = rideCardItemDto$DriverInfo6;
                            charSequence4 = charSequence6;
                            obj = i3;
                            RideCardItemDto$DriverInfo rideCardItemDto$DriverInfo7 = rideCardItemDto$DriverInfo4;
                            charSequence2 = charSequence4;
                            charSequence3 = (CharSequence) obj;
                            rideCardItemDto$DriverInfo3 = rideCardItemDto$DriverInfo7;
                            driverInfoBadgesBlock = rideCardItemDto$DriverInfo3.m;
                            if (driverInfoBadgesBlock != null) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    charSequence2 = charSequence6;
                    rideCardItemDto$DriverInfo3 = rideCardItemDto$DriverInfo6;
                    charSequence3 = null;
                    driverInfoBadgesBlock = rideCardItemDto$DriverInfo3.m;
                    if (driverInfoBadgesBlock != null) {
                    }
                } else {
                    if (i != 3) {
                        if (i == 4) {
                            charSequence3 = (CharSequence) rideCardDriverItemDataSource$createBaseUiState$1.L$2;
                            charSequence2 = (CharSequence) rideCardDriverItemDataSource$createBaseUiState$1.L$1;
                            rideCardItemDto$DriverInfo2 = (RideCardItemDto$DriverInfo) rideCardDriverItemDataSource$createBaseUiState$1.L$0;
                            kotlin.b.b(obj);
                            lgk0Var = (lgk0) obj;
                            vgk0Var = new wgk0(charSequence2, charSequence3, lgk0Var);
                            formattedText = rideCardItemDto$DriverInfo2.l;
                            if (formattedText == null) {
                                charSequence5 = null;
                                xgk0 xgk0Var = vgk0Var;
                                carNumberDto = rideCardItemDto$DriverInfo2.f;
                                zuc0 zuc0Var = zuc0.f;
                                if (carNumberDto != null) {
                                }
                                zuc0 zuc0Var2 = zuc0Var;
                                String str = rideCardItemDto$DriverInfo2.a;
                                String str2 = rideCardItemDto$DriverInfo2.b;
                                String str3 = rideCardItemDto$DriverInfo2.e;
                                if (str3 == null) {
                                }
                                ogk0 ogk0Var = ogk0.b;
                                hgk0 hgk0Var = hgk0.c;
                                s9k0 s9k0Var = s9k0.a;
                                rideCardDriverState = rideCardItemDto$DriverInfo2.c;
                                if (rideCardDriverState == null) {
                                }
                                return new ygk0(str, str2, xgk0Var, charSequence5, r20, ogk0Var, hgk0Var, zuc0Var2, s9k0Var, s9k0Var, new tgk0(rideCardDriverState, rideCardItemDto$DriverInfo2.d));
                            }
                            rideCardDriverItemDataSource$createBaseUiState$1.L$0 = rideCardItemDto$DriverInfo2;
                            rideCardDriverItemDataSource$createBaseUiState$1.L$1 = vgk0Var;
                            rideCardDriverItemDataSource$createBaseUiState$1.L$2 = null;
                            rideCardDriverItemDataSource$createBaseUiState$1.L$3 = null;
                            rideCardDriverItemDataSource$createBaseUiState$1.label = 5;
                            obj = ru.yandex.taxi.widget.c.i(cVar, formattedText, null, rideCardDriverItemDataSource$createBaseUiState$1, 30);
                            if (obj != coroutineSingletons) {
                                rideCardItemDto$DriverInfo5 = rideCardItemDto$DriverInfo2;
                                charSequence5 = (CharSequence) obj;
                                rideCardItemDto$DriverInfo2 = rideCardItemDto$DriverInfo5;
                                xgk0 xgk0Var2 = vgk0Var;
                                carNumberDto = rideCardItemDto$DriverInfo2.f;
                                zuc0 zuc0Var3 = zuc0.f;
                                if (carNumberDto != null) {
                                }
                                zuc0 zuc0Var22 = zuc0Var3;
                                String str4 = rideCardItemDto$DriverInfo2.a;
                                String str22 = rideCardItemDto$DriverInfo2.b;
                                String str32 = rideCardItemDto$DriverInfo2.e;
                                if (str32 == null) {
                                }
                                ogk0 ogk0Var2 = ogk0.b;
                                hgk0 hgk0Var2 = hgk0.c;
                                s9k0 s9k0Var2 = s9k0.a;
                                rideCardDriverState = rideCardItemDto$DriverInfo2.c;
                                if (rideCardDriverState == null) {
                                }
                                return new ygk0(str4, str22, xgk0Var2, charSequence5, r20, ogk0Var2, hgk0Var2, zuc0Var22, s9k0Var2, s9k0Var2, new tgk0(rideCardDriverState, rideCardItemDto$DriverInfo2.d));
                            }
                            return coroutineSingletons;
                        }
                        if (i != 5) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        vgk0Var = (xgk0) rideCardDriverItemDataSource$createBaseUiState$1.L$1;
                        rideCardItemDto$DriverInfo5 = (RideCardItemDto$DriverInfo) rideCardDriverItemDataSource$createBaseUiState$1.L$0;
                        kotlin.b.b(obj);
                        charSequence5 = (CharSequence) obj;
                        rideCardItemDto$DriverInfo2 = rideCardItemDto$DriverInfo5;
                        xgk0 xgk0Var22 = vgk0Var;
                        carNumberDto = rideCardItemDto$DriverInfo2.f;
                        zuc0 zuc0Var32 = zuc0.f;
                        if (carNumberDto != null) {
                            e eVar = (e) this.g.b;
                            String str5 = carNumberDto.a;
                            if (str5 != null) {
                                String a = t7s.a(str5);
                                if (a == null) {
                                    a = "";
                                }
                                List Y = evu0.Y(a, new char[]{160}, 0, 6);
                                String X = kotlin.collections.a.X(kotlin.collections.a.A0(Y, 3), " ", null, null, null, 62);
                                String str6 = (String) kotlin.collections.a.S(3, Y);
                                if (str6 == null) {
                                    str6 = "";
                                }
                                Pair pair = new Pair(X, str6);
                                String str7 = (String) pair.getFirst();
                                String str8 = (String) pair.getSecond();
                                if (str7.length() != 0) {
                                    String str9 = carNumberDto.c;
                                    pdc pdcVar = eVar.c;
                                    Context context = eVar.a;
                                    kdc i4 = ((ufu) pdcVar).i(str9);
                                    Integer valueOf = i4 != null ? Integer.valueOf(s8o.m(i4, context)) : null;
                                    cdc cdcVar = valueOf != null ? new cdc(valueOf.intValue()) : null;
                                    yuc0 yuc0Var = new yuc0(cdcVar, str7);
                                    yuc0 yuc0Var2 = new yuc0(cdcVar, str8);
                                    Integer c = eVar.c(carNumberDto.b);
                                    cdc cdcVar2 = c != null ? new cdc(c.intValue()) : null;
                                    kdc i5 = ((ufu) eVar.c).i(carNumberDto.d);
                                    Integer valueOf2 = i5 != null ? Integer.valueOf(s8o.m(i5, context)) : null;
                                    zuc0Var32 = new zuc0(yuc0Var, yuc0Var2, cdcVar, valueOf2 != null ? new cdc(valueOf2.intValue()) : null, cdcVar2);
                                }
                            }
                        }
                        zuc0 zuc0Var222 = zuc0Var32;
                        String str42 = rideCardItemDto$DriverInfo2.a;
                        String str222 = rideCardItemDto$DriverInfo2.b;
                        String str322 = rideCardItemDto$DriverInfo2.e;
                        String str10 = str322 == null ? "" : str322;
                        ogk0 ogk0Var22 = ogk0.b;
                        hgk0 hgk0Var22 = hgk0.c;
                        s9k0 s9k0Var22 = s9k0.a;
                        rideCardDriverState = rideCardItemDto$DriverInfo2.c;
                        if (rideCardDriverState == null) {
                            rideCardDriverState = RideCardDriverState.SEARCHING;
                        }
                        return new ygk0(str42, str222, xgk0Var22, charSequence5, str10, ogk0Var22, hgk0Var22, zuc0Var222, s9k0Var22, s9k0Var22, new tgk0(rideCardDriverState, rideCardItemDto$DriverInfo2.d));
                    }
                    charSequence4 = (CharSequence) rideCardDriverItemDataSource$createBaseUiState$1.L$1;
                    rideCardItemDto$DriverInfo4 = (RideCardItemDto$DriverInfo) rideCardDriverItemDataSource$createBaseUiState$1.L$0;
                    kotlin.b.b(obj);
                    RideCardItemDto$DriverInfo rideCardItemDto$DriverInfo72 = rideCardItemDto$DriverInfo4;
                    charSequence2 = charSequence4;
                    charSequence3 = (CharSequence) obj;
                    rideCardItemDto$DriverInfo3 = rideCardItemDto$DriverInfo72;
                    driverInfoBadgesBlock = rideCardItemDto$DriverInfo3.m;
                    if (driverInfoBadgesBlock != null) {
                        com.yandex.go.taxi.order.details.v2.state.elements.driver.badges.a aVar = (com.yandex.go.taxi.order.details.v2.state.elements.driver.badges.a) this.c.get();
                        rideCardDriverItemDataSource$createBaseUiState$1.L$0 = rideCardItemDto$DriverInfo3;
                        rideCardDriverItemDataSource$createBaseUiState$1.L$1 = charSequence2;
                        rideCardDriverItemDataSource$createBaseUiState$1.L$2 = charSequence3;
                        rideCardDriverItemDataSource$createBaseUiState$1.L$3 = null;
                        rideCardDriverItemDataSource$createBaseUiState$1.label = 4;
                        Object a2 = aVar.a(driverInfoBadgesBlock, rideCardDriverItemDataSource$createBaseUiState$1);
                        if (a2 != coroutineSingletons) {
                            rideCardItemDto$DriverInfo2 = rideCardItemDto$DriverInfo3;
                            obj = a2;
                            lgk0Var = (lgk0) obj;
                            vgk0Var = new wgk0(charSequence2, charSequence3, lgk0Var);
                            formattedText = rideCardItemDto$DriverInfo2.l;
                            if (formattedText == null) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    rideCardItemDto$DriverInfo2 = rideCardItemDto$DriverInfo3;
                    lgk0Var = null;
                    vgk0Var = new wgk0(charSequence2, charSequence3, lgk0Var);
                    formattedText = rideCardItemDto$DriverInfo2.l;
                    if (formattedText == null) {
                    }
                }
            }
        }
        rideCardDriverItemDataSource$createBaseUiState$1 = new RideCardDriverItemDataSource$createBaseUiState$1(this, continuationImpl);
        Object obj2 = rideCardDriverItemDataSource$createBaseUiState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardDriverItemDataSource$createBaseUiState$1.label;
        ru.yandex.taxi.widget.c cVar2 = this.d;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(RideCardItemDto$DriverInfo rideCardItemDto$DriverInfo, ContinuationImpl continuationImpl) {
        RideCardDriverItemDataSource$stateFlow$1 rideCardDriverItemDataSource$stateFlow$1;
        int i;
        if (continuationImpl instanceof RideCardDriverItemDataSource$stateFlow$1) {
            rideCardDriverItemDataSource$stateFlow$1 = (RideCardDriverItemDataSource$stateFlow$1) continuationImpl;
            int i2 = rideCardDriverItemDataSource$stateFlow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardDriverItemDataSource$stateFlow$1.label = i2 - Integer.MIN_VALUE;
                Object obj = rideCardDriverItemDataSource$stateFlow$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardDriverItemDataSource$stateFlow$1.label;
                int i3 = 2;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!ijk0.b(rideCardItemDto$DriverInfo) || rideCardItemDto$DriverInfo.c == null) {
                        return new g92(i3, new yjk0(rideCardItemDto$DriverInfo.a));
                    }
                    rideCardDriverItemDataSource$stateFlow$1.L$0 = rideCardItemDto$DriverInfo;
                    rideCardDriverItemDataSource$stateFlow$1.label = 1;
                    obj = a(rideCardItemDto$DriverInfo, rideCardDriverItemDataSource$stateFlow$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rideCardItemDto$DriverInfo = (RideCardItemDto$DriverInfo) rideCardDriverItemDataSource$stateFlow$1.L$0;
                    kotlin.b.b(obj);
                }
                rol0 b = this.e.b(rideCardItemDto$DriverInfo.h);
                rol0 a = this.f.a(rideCardItemDto$DriverInfo.g, RideCardDriverCarIconRepository$DriverCarType.FULL);
                boolean z = rideCardItemDto$DriverInfo.n;
                o2y0 o2y0Var = this.a;
                return kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.m(b, a, kotlinx.coroutines.flow.e.I(vng.l(o2y0Var.a(), RideCardDriverItemDataSource$collectDriverClickAction$1.b, vng.c), new RideCardDriverItemDataSource$collectDriverClickAction$2(z, null)), kotlinx.coroutines.flow.e.I(kotlinx.coroutines.flow.e.t(new b(o2y0Var.a(), this)), new RideCardDriverItemDataSource$collectCarPlateClickAction$2(2, null)), new RideCardDriverItemDataSource$stateFlow$2((ygk0) obj, null)));
            }
        }
        rideCardDriverItemDataSource$stateFlow$1 = new RideCardDriverItemDataSource$stateFlow$1(this, continuationImpl);
        Object obj3 = rideCardDriverItemDataSource$stateFlow$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardDriverItemDataSource$stateFlow$1.label;
        int i32 = 2;
        if (i != 0) {
        }
        rol0 b2 = this.e.b(rideCardItemDto$DriverInfo.h);
        rol0 a2 = this.f.a(rideCardItemDto$DriverInfo.g, RideCardDriverCarIconRepository$DriverCarType.FULL);
        boolean z2 = rideCardItemDto$DriverInfo.n;
        o2y0 o2y0Var2 = this.a;
        return kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.m(b2, a2, kotlinx.coroutines.flow.e.I(vng.l(o2y0Var2.a(), RideCardDriverItemDataSource$collectDriverClickAction$1.b, vng.c), new RideCardDriverItemDataSource$collectDriverClickAction$2(z2, null)), kotlinx.coroutines.flow.e.I(kotlinx.coroutines.flow.e.t(new b(o2y0Var2.a(), this)), new RideCardDriverItemDataSource$collectCarPlateClickAction$2(2, null)), new RideCardDriverItemDataSource$stateFlow$2((ygk0) obj3, null)));
    }
}
