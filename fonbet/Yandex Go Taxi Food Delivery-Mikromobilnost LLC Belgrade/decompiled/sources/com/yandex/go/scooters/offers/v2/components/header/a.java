package com.yandex.go.scooters.offers.v2.components.header;

import androidx.transition.Fade;
import androidx.transition.TransitionManager;
import com.yandex.go.design.divider.CardDivider;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.scooters.api.domain.model.ScootersVehicleType;
import defpackage.a5n0;
import defpackage.b5n0;
import defpackage.cpm0;
import defpackage.d5n0;
import defpackage.i5p0;
import defpackage.m4b1;
import defpackage.n3o0;
import defpackage.q7p0;
import defpackage.r7p0;
import defpackage.rbn0;
import defpackage.s0h0;
import defpackage.sbn0;
import defpackage.scc;
import defpackage.tcc;
import defpackage.ubn0;
import defpackage.vbn0;
import defpackage.w511;
import defpackage.w5n0;
import defpackage.x4n0;
import defpackage.x5n0;
import defpackage.y5n0;
import defpackage.z5n0;
import defpackage.zgz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.scooters.domain.model.ScootersInsuranceVersion;
import ru.yandex.taxi.scooters.presentation.common.ui.header.ScootersCardHeaderComponent;

/* loaded from: classes13.dex */
public final class a implements a5n0 {
    public boolean a;
    public final /* synthetic */ b b;

    public a(b bVar) {
        this.b = bVar;
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        Iterable singletonList;
        ScootersCardHeaderComponentDelegate$successState$1$1 scootersCardHeaderComponentDelegate$successState$1$1;
        int i;
        z5n0 z5n0Var = (z5n0) obj;
        b bVar = this.b;
        GoLinearLayout goLinearLayout = bVar.j;
        goLinearLayout.removeAllViews();
        boolean z = z5n0Var instanceof y5n0;
        if (this.a != z) {
            TransitionManager.a(new Fade(), goLinearLayout);
        }
        this.a = z;
        if (z5n0Var instanceof w5n0) {
            ScootersCardHeaderComponent a = bVar.a();
            a.error();
            goLinearLayout.addView(a);
            return;
        }
        if (z5n0Var instanceof x5n0) {
            GoLinearLayout goLinearLayout2 = bVar.j;
            ScootersCardHeaderComponent a2 = bVar.a();
            a2.loading();
            goLinearLayout2.addView(a2);
            return;
        }
        if (!z) {
            w511.b();
            return;
        }
        y5n0 y5n0Var = (y5n0) z5n0Var;
        List list = y5n0Var.h;
        vbn0 vbn0Var = y5n0Var.j;
        i5p0 b = m4b1.b(list);
        int i2 = 0;
        if (b == null) {
            zgz.a("No selected tariff in ScootersCardState.Offer", new IllegalStateException());
            singletonList = EmptyList.a;
        } else {
            n3o0 n3o0Var = b.f.l;
            d5n0 d5n0Var = n3o0Var.b == ScootersInsuranceVersion.V2 ? new d5n0(n3o0Var.a) : null;
            boolean z2 = vbn0Var instanceof sbn0;
            ScootersCardHeaderComponent.AppearanceMode appearanceMode = z2 ? ScootersCardHeaderComponent.AppearanceMode.AS_ONE_OF_MULTIPLE : ScootersCardHeaderComponent.AppearanceMode.AS_SINGLE;
            boolean booleanValue = ((Boolean) bVar.h.invoke()).booleanValue();
            if (vbn0Var instanceof rbn0) {
                singletonList = Collections.singletonList(new x4n0(((rbn0) vbn0Var).e, appearanceMode, booleanValue, d5n0Var, y5n0Var.c));
            } else if (z2) {
                List list2 = ((sbn0) vbn0Var).e;
                ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new x4n0((cpm0) it.next(), appearanceMode, booleanValue, d5n0Var, y5n0Var.c));
                    booleanValue = false;
                }
                singletonList = arrayList;
            } else {
                if (!(vbn0Var instanceof ubn0)) {
                    w511.b();
                    return;
                }
                singletonList = Collections.singletonList(new x4n0(((ubn0) vbn0Var).e, appearanceMode, booleanValue, d5n0Var, y5n0Var.c));
            }
        }
        Iterable<x4n0> iterable = singletonList;
        ArrayList arrayList2 = new ArrayList(tcc.n(iterable, 10));
        for (x4n0 x4n0Var : iterable) {
            ScootersCardHeaderComponent a3 = bVar.a();
            if (x4n0Var.c) {
                a3.setDefaultAccessibilityFocus();
            }
            cpm0 cpm0Var = x4n0Var.a;
            r7p0 r7p0Var = cpm0Var.a;
            ScootersCardHeaderComponent.AppearanceMode appearanceMode2 = x4n0Var.b;
            q7p0 q7p0Var = cpm0Var.d;
            String str = cpm0Var.f;
            d5n0 d5n0Var2 = x4n0Var.d;
            ScootersCardHeaderComponentDelegate$successState$1$1 scootersCardHeaderComponentDelegate$successState$1$12 = new ScootersCardHeaderComponentDelegate$successState$1$1(1, bVar.f, b5n0.class, "removeVehicle", "removeVehicle$preorder(Lcom/yandex/go/scooters/api/domain/model/ScootersVehicleNumber;)V", 0);
            if (x4n0Var.e) {
                scootersCardHeaderComponentDelegate$successState$1$1 = scootersCardHeaderComponentDelegate$successState$1$12;
                i = cpm0Var.c == ScootersVehicleType.BIKE ? s0h0.ic_scooters_simple_bike : s0h0.ic_scooters_simple_scooter;
            } else {
                scootersCardHeaderComponentDelegate$successState$1$1 = scootersCardHeaderComponentDelegate$successState$1$12;
                i = 0;
            }
            a3.success(r7p0Var, appearanceMode2, q7p0Var, str, scootersCardHeaderComponentDelegate$successState$1$1, d5n0Var2, i);
            arrayList2.add(a3);
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                scc.m();
                throw null;
            }
            goLinearLayout.addView((ScootersCardHeaderComponent) next);
            if (arrayList2.size() > 1 && i2 < scc.f(arrayList2)) {
                goLinearLayout.addView(new CardDivider(bVar.a, null, 0, 6, null));
            }
            i2 = i3;
        }
    }
}
