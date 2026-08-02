package com.yandex.go.summary.interactor.anchored.state.content;

import defpackage.avj0;
import defpackage.be3;
import defpackage.bmb1;
import defpackage.ce3;
import defpackage.de3;
import defpackage.ee3;
import defpackage.he3;
import defpackage.hq91;
import defpackage.ie3;
import defpackage.jl40;
import defpackage.kyh0;
import defpackage.me3;
import defpackage.ny61;
import defpackage.qd3;
import defpackage.rd3;
import defpackage.sd3;
import defpackage.sls;
import defpackage.td3;
import defpackage.ud3;
import defpackage.vd3;
import defpackage.vpr;
import defpackage.w511;
import defpackage.wd3;
import defpackage.xd3;
import defpackage.ymu;
import defpackage.zuj0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ ymu b;

    public d(vpr vprVar, ymu ymuVar) {
        this.a = vprVar;
        this.b = ymuVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AuctionUiStateInteractor$special$$inlined$map$2$2$1 auctionUiStateInteractor$special$$inlined$map$2$2$1;
        int i;
        me3 me3Var;
        ie3 ie3Var;
        td3 td3Var;
        if (continuation instanceof AuctionUiStateInteractor$special$$inlined$map$2$2$1) {
            auctionUiStateInteractor$special$$inlined$map$2$2$1 = (AuctionUiStateInteractor$special$$inlined$map$2$2$1) continuation;
            int i2 = auctionUiStateInteractor$special$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                auctionUiStateInteractor$special$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = auctionUiStateInteractor$special$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = auctionUiStateInteractor$special$$inlined$map$2$2$1.label;
                final int i3 = 1;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    de3 de3Var = (de3) obj;
                    if (de3Var instanceof be3) {
                        final be3 be3Var = (be3) de3Var;
                        boolean z = be3Var.g;
                        avj0 avj0Var = (avj0) ((zuj0) this.b.b);
                        ee3 ee3Var = new ee3(new xd3(bmb1.b(), (z || !be3Var.b.a) ? null : new ie3(new sls() { // from class: ne3
                            @Override // defpackage.sls
                            public final Object invoke() {
                                int i4 = i3;
                                zy11 zy11Var = zy11.a;
                                be3 be3Var2 = be3Var;
                                switch (i4) {
                                    case 0:
                                        zd3 zd3Var = be3Var2.f;
                                        if (zd3Var != null) {
                                            h0w h0wVar = (h0w) zd3Var;
                                            ge3.a((ge3) h0wVar.b, (mi31) h0wVar.c, false);
                                            break;
                                        }
                                        break;
                                    default:
                                        zd3 zd3Var2 = be3Var2.f;
                                        if (zd3Var2 != null) {
                                            h0w h0wVar2 = (h0w) zd3Var2;
                                            ge3.a((ge3) h0wVar2.b, (mi31) h0wVar2.c, true);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }), avj0Var.h(kyh0.auction_accessibility_decrease_price)));
                        wd3 ud3Var = z ? vd3.a : new ud3(be3Var.d, be3Var.e);
                        if (z || !be3Var.c.a) {
                            ie3Var = null;
                        } else {
                            final int i4 = 0;
                            ie3Var = new ie3(new sls() { // from class: ne3
                                @Override // defpackage.sls
                                public final Object invoke() {
                                    int i42 = i4;
                                    zy11 zy11Var = zy11.a;
                                    be3 be3Var2 = be3Var;
                                    switch (i42) {
                                        case 0:
                                            zd3 zd3Var = be3Var2.f;
                                            if (zd3Var != null) {
                                                h0w h0wVar = (h0w) zd3Var;
                                                ge3.a((ge3) h0wVar.b, (mi31) h0wVar.c, false);
                                                break;
                                            }
                                            break;
                                        default:
                                            zd3 zd3Var2 = be3Var2.f;
                                            if (zd3Var2 != null) {
                                                h0w h0wVar2 = (h0w) zd3Var2;
                                                ge3.a((ge3) h0wVar2.b, (mi31) h0wVar2.c, true);
                                                break;
                                            }
                                            break;
                                    }
                                    return zy11Var;
                                }
                            });
                        }
                        he3 he3Var = new he3(new xd3(hq91.c(), ie3Var, avj0Var.h(kyh0.auction_accessibility_increase_price)));
                        sd3 sd3Var = be3Var.a;
                        if (sd3Var instanceof qd3) {
                            td3Var = new td3(((qd3) sd3Var).b, Float.valueOf(0.5f));
                        } else {
                            if (!(sd3Var instanceof rd3)) {
                                w511.b();
                                return null;
                            }
                            td3Var = new td3(((rd3) sd3Var).b, null);
                        }
                        me3Var = new me3(td3Var, ee3Var, ud3Var, he3Var);
                    } else {
                        if (!jl40.l(de3Var, ce3.a)) {
                            w511.b();
                            return null;
                        }
                        me3Var = null;
                    }
                    auctionUiStateInteractor$special$$inlined$map$2$2$1.L$0 = null;
                    auctionUiStateInteractor$special$$inlined$map$2$2$1.L$1 = null;
                    auctionUiStateInteractor$special$$inlined$map$2$2$1.L$2 = null;
                    auctionUiStateInteractor$special$$inlined$map$2$2$1.L$3 = null;
                    auctionUiStateInteractor$special$$inlined$map$2$2$1.label = 1;
                    if (this.a.emit(me3Var, auctionUiStateInteractor$special$$inlined$map$2$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        auctionUiStateInteractor$special$$inlined$map$2$2$1 = new AuctionUiStateInteractor$special$$inlined$map$2$2$1(this, continuation);
        Object obj22 = auctionUiStateInteractor$special$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = auctionUiStateInteractor$special$$inlined$map$2$2$1.label;
        final int i32 = 1;
        if (i != 0) {
        }
        return zy11.a;
    }
}
