package com.yandex.go.places.impl.ui.main.map.overlay;

import com.yandex.mapkit.layers.GeoObjectTapEvent;
import com.yandex.mapkit.layers.GeoObjectTapListener;
import com.yandex.mapkit.map.GeoObjectSelectionMetadata;
import defpackage.ah00;
import defpackage.evu0;
import defpackage.gh00;
import defpackage.h3y;
import defpackage.hl00;
import defpackage.il00;
import defpackage.jst;
import defpackage.mth;
import defpackage.pac0;
import defpackage.qac0;
import defpackage.qi80;
import defpackage.tje;
import defpackage.uac0;
import defpackage.uyj;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes13.dex */
public final class c extends com.yandex.go.places.map.ui.overlay.b {
    public final b A;
    public final a B;
    public final uac0 y;
    public final boolean z;

    /* JADX WARN: Type inference failed for: r1v3, types: [com.yandex.go.places.impl.ui.main.map.overlay.a] */
    public c(uac0 uac0Var, h3y h3yVar, com.yandex.go.places.map.ui.overlay.a aVar, ah00 ah00Var) {
        super(ah00Var, h3yVar, aVar);
        this.y = uac0Var;
        this.z = true;
        this.A = new b(this);
        this.B = new GeoObjectTapListener() { // from class: com.yandex.go.places.impl.ui.main.map.overlay.a
            @Override // com.yandex.mapkit.layers.GeoObjectTapListener
            public final boolean onObjectTap(GeoObjectTapEvent geoObjectTapEvent) {
                GeoObjectSelectionMetadata geoObjectSelectionMetadata;
                uac0 uac0Var2 = c.this.y;
                uac0Var2.Kg();
                uac0Var2.I.getClass();
                hl00 hl00Var = (hl00) il00.b(geoObjectTapEvent).orElse(null);
                if (hl00Var == null) {
                    return false;
                }
                try {
                    geoObjectSelectionMetadata = (GeoObjectSelectionMetadata) geoObjectTapEvent.getGeoObject().getMetadataContainer().getItem(GeoObjectSelectionMetadata.class);
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    jst.e.k(th, "Error during attempt to get metadata item for event");
                    geoObjectSelectionMetadata = null;
                }
                if (geoObjectSelectionMetadata == null) {
                    return false;
                }
                String str = hl00Var.a;
                qi80 qi80Var = (str == null || evu0.J(str)) ? null : new qi80(str, null);
                if (qi80Var == null) {
                    return false;
                }
                tje.N(uac0Var2.Jg(), null, null, new PlacesMainMapPresenter$openOrganizationCard$1(uac0Var2, qi80Var, null), 3);
                tje.N(uac0Var2.Jg(), null, null, new PlacesMainMapPresenter$onObjectTapped$1$1(uac0Var2, geoObjectSelectionMetadata, null), 3);
                return false;
            }
        };
    }

    @Override // com.yandex.go.places.map.ui.overlay.b
    public final boolean Hg() {
        return this.z;
    }

    @Override // com.yandex.go.places.map.ui.overlay.b
    public final void Ig() {
        pac0 pac0Var = new pac0(this);
        uac0 uac0Var = this.y;
        uac0Var.Bg(pac0Var);
        tje.N(uac0Var.Jg(), null, null, new PlacesMainMapPresenter$attachView$1(uac0Var, null), 3);
        uac0Var.J = tje.N(uac0Var.Jg(), null, null, new PlacesMainMapPresenter$attachView$$inlined$safeCollectIn$1(new g(kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.p(new mth(uac0Var.z.d, 6), 400L))), null, pac0Var, uac0Var), 3);
        ((gh00) uac0Var.C).I(true);
        qac0 qac0Var = uac0Var.F;
        e eVar = new e(kotlinx.coroutines.flow.e.I(qac0Var.a.b, new PlacesMainMapOverlayInteractor$getSelectedMapObjectItemFlow$1(2, null)), qac0Var);
        qac0Var.d.getClass();
        tje.N(uac0Var.Jg(), null, null, new PlacesMainMapPresenter$attachView$$inlined$safeCollectIn$2(new m0(kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.F(eVar, uyj.a)), qac0Var.b.b, new PlacesMainMapOverlayInteractor$getSelectedGeoObjectItemFlow$1(3, null)), null, uac0Var), 3);
    }
}
