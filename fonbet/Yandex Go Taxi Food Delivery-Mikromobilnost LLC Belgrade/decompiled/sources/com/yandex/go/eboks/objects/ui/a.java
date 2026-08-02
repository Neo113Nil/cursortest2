package com.yandex.go.eboks.objects.ui;

import com.yandex.go.eboks.objects.domain.c;
import defpackage.ad5;
import defpackage.ah00;
import defpackage.jhn;
import defpackage.lhn;
import defpackage.mhn;
import defpackage.ohn;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.vin;
import defpackage.vj00;
import defpackage.w511;
import java.util.LinkedHashMap;
import kotlinx.coroutines.flow.o;

/* loaded from: classes12.dex */
public final class a extends ad5 {
    public pzt0 A;
    public final ah00 x;
    public final vin y;
    public final c z;

    public a(ah00 ah00Var, vin vinVar, c cVar) {
        super(jhn.class);
        this.x = ah00Var;
        this.y = vinVar;
        this.z = cVar;
    }

    public final void Kg(vj00 vj00Var) {
        if (!(vj00Var instanceof mhn)) {
            if (vj00Var instanceof ohn) {
                tje.N(Jg(), null, null, new EboksObjectsOverlayPresenter$handleRowanObjectTap$1(this, (ohn) vj00Var, null), 3);
                return;
            } else {
                w511.b();
                return;
            }
        }
        mhn mhnVar = (mhn) vj00Var;
        lhn lhnVar = mhnVar.f;
        LinkedHashMap linkedHashMap = lhnVar != null ? lhnVar.a : null;
        if (linkedHashMap == null || linkedHashMap.isEmpty()) {
            return;
        }
        pzt0 pzt0Var = this.A;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.A = tje.N(Jg(), null, null, new EboksObjectsOverlayPresenter$handleMapObjectTap$$inlined$collectIn$1(new o(this.z.a(mhnVar), new EboksObjectsOverlayPresenter$handleMapObjectTap$1(3, null)), null, (jhn) Dg()), 3);
    }
}
