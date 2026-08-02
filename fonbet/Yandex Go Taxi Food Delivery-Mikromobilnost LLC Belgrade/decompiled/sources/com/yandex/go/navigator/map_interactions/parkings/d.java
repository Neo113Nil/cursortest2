package com.yandex.go.navigator.map_interactions.parkings;

import com.yandex.mapkit.GeoObject;
import com.yandex.mapkit.uri.Uri;
import com.yandex.mapkit.uri.UriObjectMetadata;
import defpackage.agd;
import defpackage.b68;
import defpackage.bwa1;
import defpackage.f4d;
import defpackage.g92;
import defpackage.k68;
import defpackage.l68;
import defpackage.o400;
import defpackage.rol0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tls;
import defpackage.tpr;
import defpackage.uyj;
import defpackage.w04;
import defpackage.y58;
import defpackage.yfd;
import defpackage.z58;
import defpackage.zy11;
import defpackage.zzs;
import java.util.List;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final /* synthetic */ class d implements tls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ e b;
    public final /* synthetic */ l68 c;
    public final /* synthetic */ Object w;

    public /* synthetic */ d(e eVar, l68 l68Var, b68 b68Var) {
        this.b = eVar;
        this.c = l68Var;
        this.w = b68Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        tpr d;
        List<Uri> uris;
        Uri uri;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.w;
        l68 l68Var = this.c;
        e eVar = this.b;
        switch (i) {
            case 0:
                h hVar = (h) obj2;
                yfd yfdVar = (yfd) obj;
                b68 b68Var = new b68(eVar, (GeoObject) ((agd) yfdVar).a);
                agd agdVar = (agd) yfdVar;
                GeoObject geoObject = (GeoObject) agdVar.a;
                r0 r0Var = hVar.f.c;
                n0 n0Var = hVar.i;
                zzs b = bwa1.b(geoObject);
                if (b == null) {
                    d = new g92(2, z58.a);
                } else {
                    UriObjectMetadata uriObjectMetadata = (UriObjectMetadata) geoObject.getMetadataContainer().getItem(UriObjectMetadata.class);
                    String value = (uriObjectMetadata == null || (uris = uriObjectMetadata.getUris()) == null || (uri = (Uri) kotlin.collections.a.R(uris)) == null) ? null : uri.getValue();
                    if (value != null) {
                        hVar.e.b(new w04(26, hVar, value), true);
                    } else {
                        n0Var.g(null);
                    }
                    tpr t = kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.I(new g(kotlinx.coroutines.flow.e.t(new rol0(new CarParksUiStateInteractor$contentFlow$1(hVar, b, null))), hVar.c), new CarParksUiStateInteractor$contentFlow$3(hVar, b, null)));
                    hVar.a.getClass();
                    sjh sjhVar = uyj.a;
                    d = com.yandex.go.coroutines.b.d(new m0(kotlinx.coroutines.flow.e.F(t, o400.a), kotlinx.coroutines.flow.e.t(n0Var), new CarParksUiStateInteractor$contentFlow$4(3, null)), new CarParksUiStateInteractor$contentFlow$$inlined$start$1(y58.a, null));
                }
                agdVar.c = kotlinx.coroutines.flow.e.m(r0Var, d, hVar.g.d, hVar.k, new CarParksUiStateInteractor$uiStateFlow$1(5, null));
                agdVar.e = new d(eVar, l68Var, b68Var);
                f4d.a.getClass();
                agdVar.g = f4d.b;
                break;
            default:
                tje.N(eVar.o(), null, null, new CarParksRouter$content$1$1$1(l68Var, (k68) obj, (b68) obj2, null), 3);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ d(e eVar, h hVar, l68 l68Var) {
        this.b = eVar;
        this.w = hVar;
        this.c = l68Var;
    }
}
