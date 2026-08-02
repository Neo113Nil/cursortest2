package com.yandex.go.scooters;

import com.yandex.go.scooters.data.model.ScootersOffersPresentationState$LaunchContext;
import com.yandex.go.scooters.discovery.m;
import com.yandex.go.scooters.parking.api.ParkingButtonAction;
import com.yandex.go.scooters.parking.api.ParkingCardOpenReason;
import defpackage.a8p0;
import defpackage.b8p0;
import defpackage.clo0;
import defpackage.cwa1;
import defpackage.epb;
import defpackage.gh00;
import defpackage.ilo0;
import defpackage.jlo0;
import defpackage.m950;
import defpackage.mxn0;
import defpackage.nao0;
import defpackage.o4o0;
import defpackage.p1j0;
import defpackage.p4o0;
import defpackage.qxn0;
import defpackage.r7p0;
import defpackage.r850;
import defpackage.scc;
import defpackage.tbo0;
import defpackage.u2b1;
import defpackage.ulo0;
import defpackage.vlo0;
import defpackage.w511;
import defpackage.wlo0;
import defpackage.wxn0;
import defpackage.xxn0;
import defpackage.yxn0;
import defpackage.z7p0;
import defpackage.zy11;
import java.util.Arrays;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a implements qxn0 {
    public final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qxn0
    public final Object a(yxn0 yxn0Var, ContinuationImpl continuationImpl) {
        b8p0 z7p0Var;
        zy11 zy11Var = zy11.a;
        r7p0 r7p0Var = this.a.V.a;
        if (r7p0Var != null) {
            if (yxn0Var instanceof xxn0) {
                xxn0 xxn0Var = (xxn0) yxn0Var;
                if (xxn0Var.c.equals(r7p0Var)) {
                    ((gh00) this.a.E).C(cwa1.d(xxn0Var.b));
                }
            }
            this.a.V.a = null;
        }
        boolean z = yxn0Var instanceof wxn0;
        if (z) {
            wxn0 wxn0Var = (wxn0) yxn0Var;
            if (wxn0Var.d == 0) {
                Object b = b(new mxn0(wxn0Var.b, true), continuationImpl);
                return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : zy11Var;
            }
        }
        b bVar = this.a;
        jlo0 jlo0Var = bVar.a0;
        wlo0 wlo0Var = jlo0Var.a;
        jlo0Var.a = null;
        p4o0 p4o0Var = bVar.Q;
        if (yxn0Var instanceof xxn0) {
            xxn0 xxn0Var2 = (xxn0) yxn0Var;
            z7p0Var = new a8p0(xxn0Var2.b, xxn0Var2.c);
        } else {
            if (!z) {
                w511.b();
                return null;
            }
            wxn0 wxn0Var2 = (wxn0) yxn0Var;
            z7p0Var = new z7p0(wxn0Var2.b, wxn0Var2.d, wxn0Var2.e, wxn0Var2.c);
        }
        o4o0 a = p4o0.a(p4o0Var, ((wlo0Var instanceof ulo0) || (wlo0Var instanceof vlo0)) ? ScootersOffersPresentationState$LaunchContext.ON_MAP_AFTER_QR_SCAN : ScootersOffersPresentationState$LaunchContext.ON_MAP, z7p0Var, u2b1.c(wlo0Var), wlo0Var, 8);
        clo0 clo0Var = this.a.j0;
        if (clo0Var != 0) {
            r850 r850Var = clo0Var instanceof r850 ? (r850) clo0Var : null;
            if (r850Var == null || !r850Var.a()) {
                b bVar2 = this.a;
                return b.P(bVar2, clo0Var, a, new nao0(3, bVar2, clo0Var), continuationImpl);
            }
            b bVar3 = this.a;
            return b.P(bVar3, clo0Var, a, new ScootersPreorderRouter$ScootersPreorderMapActionListener$handleSelectionAction$2(0, bVar3, b.class, "goBack", "goBack(Lkotlin/jvm/functions/Function1;)V", 0), continuationImpl);
        }
    }

    @Override // defpackage.qxn0
    public final Object b(mxn0 mxn0Var, Continuation continuation) {
        b bVar = this.a;
        m[] mVarArr = (m[]) scc.h(bVar.d0).toArray(new m[0]);
        bVar.j(new epb((m950[]) Arrays.copyOf(mVarArr, mVarArr.length)));
        bVar.d0 = null;
        com.yandex.go.scooters.parking.b bVar2 = bVar.c0;
        if (bVar2 == null) {
            bVar2 = (com.yandex.go.scooters.parking.b) bVar.I.get();
            bVar.c0 = bVar2;
        }
        return com.yandex.go.navigation.base.a.a(bVar, bVar2, new tbo0(mxn0Var.a, mxn0Var.b, ParkingCardOpenReason.MAP_ON_PREORDER, ParkingButtonAction.DONE, null), new ilo0(bVar), p1j0.a, (ContinuationImpl) continuation);
    }
}
