package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.address.address_map_picker.data.AddressMapPickerAddressStateRepository;
import com.yandex.go.address.address_map_picker.domain.c;
import com.yandex.go.flex.common.api.ui.recycler.ViewScrollOffsetLinearLayoutManager;
import com.yandex.go.payments.shared.v;
import com.yandex.go.payments.shared.x;
import com.yandex.go.suggest.impl.data.experiments.SuperappSuggestExperiment;
import com.yandex.go.superapp.order.multi.old.provider.g;
import com.ybsdk.common.DeviceIdProvider;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.network.Api;
import com.ybsdk.rconfig.b;
import core.flex.ui.OrientationAwareRecyclerView;
import defpackage.ggw0;
import defpackage.pgw0;
import defpackage.x4e;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import ru.yandex.taxi.am.m;
import ru.yandex.taxi.delivery.experiments.e;
import ru.yandex.taxi.location.autolocation.a;
import ru.yandex.taxi.main.map.f;
import ru.yandex.taxi.search.suggest.i;
import ru.yandex.taxi.systemrequeirements.location.l;
import ru.yandex.taxi.systemrequeirements.location.n;
import ru.yandex.taxi.ui.MainUiAvailabilityMonitor;

/* loaded from: classes.dex */
public final class mz0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;
    public final xvf0 h;
    public final xvf0 i;
    public final xvf0 j;
    public final xvf0 k;
    public final xvf0 l;
    public final xvf0 m;
    public final xvf0 n;
    public final xvf0 o;
    public final xvf0 p;
    public final xvf0 q;
    public final xvf0 r;

    public /* synthetic */ mz0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, xvf0 xvf0Var10, xvf0 xvf0Var11, xvf0 xvf0Var12, xvf0 xvf0Var13, xvf0 xvf0Var14, xvf0 xvf0Var15, xvf0 xvf0Var16, xvf0 xvf0Var17, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.h = xvf0Var7;
        this.i = xvf0Var8;
        this.j = xvf0Var9;
        this.k = xvf0Var10;
        this.l = xvf0Var11;
        this.m = xvf0Var12;
        this.n = xvf0Var13;
        this.o = xvf0Var14;
        this.p = xvf0Var15;
        this.q = xvf0Var16;
        this.r = xvf0Var17;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.m;
        xvf0 xvf0Var2 = this.h;
        xvf0 xvf0Var3 = this.r;
        xvf0 xvf0Var4 = this.q;
        xvf0 xvf0Var5 = this.p;
        xvf0 xvf0Var6 = this.o;
        xvf0 xvf0Var7 = this.n;
        xvf0 xvf0Var8 = this.l;
        xvf0 xvf0Var9 = this.k;
        xvf0 xvf0Var10 = this.j;
        xvf0 xvf0Var11 = this.i;
        xvf0 xvf0Var12 = this.g;
        xvf0 xvf0Var13 = this.f;
        xvf0 xvf0Var14 = this.e;
        xvf0 xvf0Var15 = this.d;
        xvf0 xvf0Var16 = this.c;
        xvf0 xvf0Var17 = this.b;
        switch (i) {
            case 0:
                return new c((tse) xvf0Var17.get(), (g21) xvf0Var16.get(), (AddressMapPickerAddressStateRepository) xvf0Var15.get(), (nz0) xvf0Var14.get(), (j11) xvf0Var13.get(), (i) xvf0Var12.get(), (atd0) xvf0Var2.get(), (po21) xvf0Var11.get(), (jy0) xvf0Var10.get(), (kr0) xvf0Var9.get(), (a) ((fr3) xvf0Var).get(), (pce0) ((xyd0) xvf0Var7).get(), (wb1) xvf0Var8.get(), (kip) ((p9p) xvf0Var6).get(), (mob0) ((yly) xvf0Var5).get(), (ru.yandex.taxi.favorites.address.impl.data.a) ((g3p) xvf0Var4).get(), (ru.yandex.taxi.favorites.address.api.experiment.a) ((p9p) xvf0Var3).get());
            case 1:
                return new ru.yandex.taxi.logistics.deliveries.a((tse) xvf0Var17.get(), (g) xvf0Var16.get(), (jjv0) xvf0Var15.get(), (arv0) xvf0Var14.get(), (y5i) xvf0Var13.get(), (wt90) xvf0Var12.get(), this.h, (jc00) xvf0Var11.get(), (jaq0) xvf0Var10.get(), (abf0) xvf0Var9.get(), (c4r0) xvf0Var8.get(), this.m, (e) ((xcz) xvf0Var7).get(), (com.yandex.go.mainscreen.superapp.impl.foundation.domain.g) xvf0Var6.get(), (t8i) xvf0Var5.get(), (l8i) xvf0Var4.get(), (oep0) xvf0Var3.get());
            case 2:
                return new l((Activity) xvf0Var17.get(), (tse) xvf0Var16.get(), (Lifecycle) xvf0Var15.get(), (zuj0) xvf0Var14.get(), (ncz) xvf0Var13.get(), i5m.a(xvf0Var12), (MainUiAvailabilityMonitor) xvf0Var2.get(), (n) xvf0Var11.get(), (ru.yandex.taxi.systemrequeirements.location.c) xvf0Var10.get(), (x8z) xvf0Var9.get(), (oc60) ((ea0) xvf0Var).get(), (w7j0) xvf0Var8.get(), (com.yandex.go.permission.location_with_agreement.interactor.e) xvf0Var7.get(), (ic60) xvf0Var6.get(), (k0b0) xvf0Var5.get(), (f) xvf0Var4.get(), (oep0) xvf0Var3.get());
            case 3:
                zmp0 zmp0Var = (zmp0) xvf0Var17.get();
                Api api = (Api) xvf0Var16.get();
                nbp0 nbp0Var = (nbp0) xvf0Var15.get();
                return new com.ybsdk.common.repositiories.auth.a(zmp0Var, api, (DeviceIdProvider) xvf0Var14.get(), (rpp0) xvf0Var12.get(), (AppAnalyticsReporter) xvf0Var13.get(), (com.ybsdk.common.repositiories.auth.g) xvf0Var2.get(), (wt51) xvf0Var11.get(), (kg51) xvf0Var10.get(), (com.ybsdk.common.repositiories.user.a) xvf0Var9.get(), (b) xvf0Var8.get(), (gff) xvf0Var.get(), nbp0Var.b, (com.ybsdk.common.repositiories.auth.b) xvf0Var7.get(), (k1x0) xvf0Var5.get(), (com.ybsdk.common.repositiories.auth.f) xvf0Var6.get(), (Context) xvf0Var4.get(), (lnm0) ((swo0) xvf0Var3).get());
            case 4:
                return new com.yandex.go.yb.data.e((u02) xvf0Var17.get(), (zuj0) xvf0Var16.get(), (pwy0) xvf0Var15.get(), (rqo) xvf0Var14.get(), (Context) xvf0Var13.get(), (Lifecycle) xvf0Var12.get(), (j5z) xvf0Var2.get(), (tt2) xvf0Var11.get(), (ru.yandex.taxi.am.g) xvf0Var10.get(), (pw2) xvf0Var9.get(), (g5g0) xvf0Var8.get(), (tj21) xvf0Var.get(), (ww51) xvf0Var7.get(), (mu51) xvf0Var6.get(), (fva0) xvf0Var5.get(), i5m.a((kxl0) xvf0Var4), (m) xvf0Var3.get());
            case 5:
                return new vnr0((lx4) xvf0Var17.get(), (fga0) xvf0Var16.get(), (ma1) xvf0Var15.get(), (r5f) xvf0Var14.get(), (t61) ((y1u) xvf0Var12).get(), (rx2) ((y1u) xvf0Var2).get(), (cug) ((y1u) xvf0Var11).get(), (jc4) ((y1u) xvf0Var10).get(), (rx2) ((gk10) xvf0Var9).get(), (jc4) ((gk10) xvf0Var8).get(), (cug) ((gk10) xvf0Var).get(), (y9p) xvf0Var13.get(), (rx2) ((e4f) xvf0Var7).get(), (rx2) ((xv2) xvf0Var6).get(), (jc4) ((xv2) xvf0Var5).get(), (cug) ((nup0) xvf0Var4).get(), (rx2) ((p7r0) xvf0Var3).get());
            case 6:
                return new v((ru.yandex.taxi.am.g) xvf0Var17.get(), (fga0) xvf0Var16.get(), (cda0) xvf0Var15.get(), (x) ((rsn0) xvf0Var).get(), (lh10) xvf0Var14.get(), (vnr0) xvf0Var13.get(), (n20) xvf0Var12.get(), (ods0) xvf0Var2.get(), (com.yandex.go.payments.shared.b) xvf0Var11.get(), (im51) xvf0Var10.get(), (ru.yandex.taxi.settings.email.a) xvf0Var9.get(), (wnr0) xvf0Var8.get(), (com.yandex.go.payments.shared.business.c) xvf0Var7.get(), (znr0) ((p7r0) xvf0Var6).get(), (cpr0) xvf0Var5.get(), (tt2) xvf0Var4.get(), (lz90) xvf0Var3.get());
            case 7:
                i6r i6rVar = (i6r) ((n3w) xvf0Var2).a;
                final pgw0 pgw0Var = (pgw0) xvf0Var17.get();
                final ggw0 ggw0Var = (ggw0) xvf0Var16.get();
                com.yandex.go.suggest.impl.data.flex.variables.a aVar = (com.yandex.go.suggest.impl.data.flex.variables.a) ((p7w0) xvf0Var11).get();
                Set set = (Set) ((y2r0) xvf0Var10).get();
                Set set2 = (Set) ((y2r0) xvf0Var9).get();
                Set set3 = (Set) ((y2r0) xvf0Var8).get();
                com.yandex.go.suggest.impl.data.flex.document.c cVar = (com.yandex.go.suggest.impl.data.flex.document.c) ((cfw0) xvf0Var).get();
                x4v0 x4v0Var = (x4v0) ((kpp0) xvf0Var7).get();
                g6x g6xVar = (g6x) ((h90) xvf0Var6).get();
                final com.yandex.go.suggest.impl.view.error.a aVar2 = (com.yandex.go.suggest.impl.view.error.a) ((ji3) xvf0Var5).get();
                tse tseVar = (tse) ((n3w) xvf0Var4).a;
                final f8v0 f8v0Var = (f8v0) ((n3w) xvf0Var3).a;
                k6x k6xVar = (k6x) xvf0Var15.get();
                f9w0 f9w0Var = (f9w0) xvf0Var14.get();
                com.yandex.div.core.expression.variables.a aVar3 = (com.yandex.div.core.expression.variables.a) xvf0Var13.get();
                rmr rmrVar = (rmr) xvf0Var12.get();
                wgw0 wgw0Var = new wgw0(pgw0Var);
                s800 s800Var = new s800(aVar3, i6rVar, 1);
                bki0 bki0Var = new bki0() { // from class: sgw0
                    @Override // defpackage.bki0
                    public final void a(final OrientationAwareRecyclerView orientationAwareRecyclerView) {
                        int i2;
                        orientationAwareRecyclerView.setItemAnimator(null);
                        orientationAwareRecyclerView.setClipToPadding(false);
                        Context context = orientationAwareRecyclerView.getContext();
                        final pgw0 pgw0Var2 = pgw0Var;
                        orientationAwareRecyclerView.setLayoutManager(new ViewScrollOffsetLinearLayoutManager(context) { // from class: com.yandex.go.suggest.impl.di.SuperappSuggestViewModule$Companion$provideFlexConfig$3$1
                            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
                            public final void V0(RecyclerView.k kVar) {
                                super.V0(kVar);
                                x4e.z(orientationAwareRecyclerView.computeVerticalScrollOffset(), pgw0.this.a, null);
                            }
                        });
                        final ggw0 ggw0Var2 = ggw0.this;
                        ggw0Var2.getClass();
                        orientationAwareRecyclerView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.go.suggest.impl.data.SuperappSuggestRecyclerStateKeeper$attach$1
                            @Override // android.view.View.OnAttachStateChangeListener
                            public void onViewAttachedToWindow(View v) {
                            }

                            @Override // android.view.View.OnAttachStateChangeListener
                            public void onViewDetachedFromWindow(View v) {
                                ggw0 ggw0Var3 = ggw0.this;
                                RecyclerView.e layoutManager = orientationAwareRecyclerView.getLayoutManager();
                                ggw0Var3.a = layoutManager != null ? layoutManager.X0() : null;
                            }
                        });
                        RecyclerView.e layoutManager = orientationAwareRecyclerView.getLayoutManager();
                        if (ggw0Var2.b) {
                            ggw0Var2.b = false;
                            Parcelable parcelable = ggw0Var2.a;
                            if (parcelable != null) {
                                if (layoutManager != null) {
                                    layoutManager.W0(parcelable);
                                }
                                ggw0Var2.a = null;
                            }
                        }
                        int i3 = vgw0.a[f8v0Var.e.ordinal()];
                        if (i3 == 1) {
                            i2 = 0;
                        } else {
                            if (i3 != 2) {
                                w511.b();
                                return;
                            }
                            orientationAwareRecyclerView.getContext();
                            i2 = tje.r(oug0.floating_input_height, orientationAwareRecyclerView.getContext()) + tje.r(mrg0.go_design_s_space, orientationAwareRecyclerView.getContext()) + tje.r(oug0.cart_button_height, orientationAwareRecyclerView.getContext());
                        }
                        orientationAwareRecyclerView.setPadding(orientationAwareRecyclerView.getPaddingLeft(), tje.r(mrg0.go_design_l_space, orientationAwareRecyclerView.getContext()), orientationAwareRecyclerView.getPaddingRight(), orientationAwareRecyclerView.getPaddingBottom());
                        tje.i(orientationAwareRecyclerView, 119, new ugw0(orientationAwareRecyclerView, i2, 0));
                    }
                };
                return new nhr(new vlr("SuperappSuggest", s800Var, new nao() { // from class: tgw0
                    @Override // defpackage.nao
                    public final mao a(l1o l1oVar) {
                        com.yandex.go.suggest.impl.view.error.a aVar4 = com.yandex.go.suggest.impl.view.error.a.this;
                        aVar4.getClass();
                        return new jfw0(aVar4);
                    }
                }, new g0p(kotlin.collections.a.J0(set), null, kotlin.collections.a.J0(set2), null, kotlin.collections.a.J0(set3), Collections.singletonList(g6xVar), null, null, 918), null, bki0Var, null, x4v0Var, null, Collections.singletonList(aVar), k6xVar, null, null, f8v0Var.c == SuperappSuggestExperiment.LoadingStrategy.ASYNC_RELOADING ? new xa3(tseVar) : x4c.M, null, null, null, null, null, 1028770), wgw0Var, kotlinx.coroutines.flow.e.K((tpr[]) Arrays.copyOf(new tpr[]{cVar.d(), new com.yandex.go.suggest.impl.data.flex.document.b(cVar.b.b, cVar), new com.yandex.go.suggest.impl.data.flex.cart.b(f9w0Var.b)}, 3)), null, null, null, null, null, null, rmrVar, 6136);
            default:
                return new com.yandex.go.superapp.tracking.data.e((tt2) xvf0Var17.get(), (o601) xvf0Var16.get(), (r701) xvf0Var15.get(), (q701) xvf0Var14.get(), (r701) xvf0Var13.get(), (q701) xvf0Var12.get(), (r701) xvf0Var2.get(), (q701) xvf0Var11.get(), (r701) xvf0Var10.get(), (q701) xvf0Var9.get(), (r701) xvf0Var8.get(), (q701) xvf0Var.get(), (r701) xvf0Var7.get(), (q701) xvf0Var6.get(), (r701) xvf0Var5.get(), (q701) ((ci3) xvf0Var4).get(), (r701) xvf0Var3.get());
        }
    }

    public mz0(eqh eqhVar, xvf0 xvf0Var, eqh eqhVar2, rsn0 rsn0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, eqh eqhVar3, xvf0 xvf0Var4, zth zthVar, xvf0 xvf0Var5, xvf0 xvf0Var6, kpp0 kpp0Var, xvf0 xvf0Var7, p7r0 p7r0Var, xvf0 xvf0Var8, xvf0 xvf0Var9, zw30 zw30Var) {
        this.a = 6;
        this.b = eqhVar;
        this.c = xvf0Var;
        this.d = eqhVar2;
        this.m = rsn0Var;
        this.e = xvf0Var2;
        this.f = xvf0Var3;
        this.g = eqhVar3;
        this.h = xvf0Var4;
        this.i = zthVar;
        this.j = xvf0Var5;
        this.k = xvf0Var6;
        this.l = kpp0Var;
        this.n = xvf0Var7;
        this.o = p7r0Var;
        this.p = xvf0Var8;
        this.q = xvf0Var9;
        this.r = zw30Var;
    }

    public mz0(eqh eqhVar, xvf0 xvf0Var, m7q0 m7q0Var, e4f e4fVar, y1u y1uVar, y1u y1uVar2, y1u y1uVar3, y1u y1uVar4, gk10 gk10Var, gk10 gk10Var2, gk10 gk10Var3, p9p p9pVar, e4f e4fVar2, xv2 xv2Var, xv2 xv2Var2, nup0 nup0Var, p7r0 p7r0Var) {
        this.a = 5;
        this.b = eqhVar;
        this.c = xvf0Var;
        this.d = m7q0Var;
        this.e = e4fVar;
        this.g = y1uVar;
        this.h = y1uVar2;
        this.i = y1uVar3;
        this.j = y1uVar4;
        this.k = gk10Var;
        this.l = gk10Var2;
        this.m = gk10Var3;
        this.f = p9pVar;
        this.n = e4fVar2;
        this.o = xv2Var;
        this.p = xv2Var2;
        this.q = nup0Var;
        this.r = p7r0Var;
    }

    public mz0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, eqh eqhVar, r10 r10Var, xvf0 xvf0Var8, fr3 fr3Var, xyd0 xyd0Var, eqh eqhVar2, p9p p9pVar, yly ylyVar, g3p g3pVar, p9p p9pVar2) {
        this.a = 0;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.h = xvf0Var7;
        this.i = eqhVar;
        this.j = r10Var;
        this.k = xvf0Var8;
        this.m = fr3Var;
        this.n = xyd0Var;
        this.l = eqhVar2;
        this.o = p9pVar;
        this.p = ylyVar;
        this.q = g3pVar;
        this.r = p9pVar2;
    }

    public mz0(n3w n3wVar, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, bwy bwyVar, eqh eqhVar, xvf0 xvf0Var4, xvf0 xvf0Var5, bwy bwyVar2, xvf0 xvf0Var6, ea0 ea0Var, xvf0 xvf0Var7, zth zthVar, jc60 jc60Var, i0b0 i0b0Var, xvf0 xvf0Var8, eqh eqhVar2) {
        this.a = 2;
        this.b = n3wVar;
        this.c = xvf0Var;
        this.d = xvf0Var2;
        this.e = xvf0Var3;
        this.f = bwyVar;
        this.g = eqhVar;
        this.h = xvf0Var4;
        this.i = xvf0Var5;
        this.j = bwyVar2;
        this.k = xvf0Var6;
        this.m = ea0Var;
        this.l = xvf0Var7;
        this.n = zthVar;
        this.o = jc60Var;
        this.p = i0b0Var;
        this.q = xvf0Var8;
        this.r = eqhVar2;
    }

    public mz0(n3w n3wVar, xvf0 xvf0Var, xvf0 xvf0Var2, p7w0 p7w0Var, y2r0 y2r0Var, y2r0 y2r0Var2, y2r0 y2r0Var3, cfw0 cfw0Var, kpp0 kpp0Var, h90 h90Var, ji3 ji3Var, n3w n3wVar2, n3w n3wVar3, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6) {
        this.a = 7;
        this.h = n3wVar;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.i = p7w0Var;
        this.j = y2r0Var;
        this.k = y2r0Var2;
        this.l = y2r0Var3;
        this.m = cfw0Var;
        this.n = kpp0Var;
        this.o = h90Var;
        this.p = ji3Var;
        this.q = n3wVar2;
        this.r = n3wVar3;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
    }
}
