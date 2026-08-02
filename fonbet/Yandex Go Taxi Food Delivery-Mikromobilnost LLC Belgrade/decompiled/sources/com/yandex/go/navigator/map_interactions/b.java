package com.yandex.go.navigator.map_interactions;

import com.yandex.mapkit.GeoObject;
import com.yandex.mapkit.map.GeoObjectSelectionMetadata;
import com.yandex.mapkit.map.GeoObjectTags;
import com.yandex.mapkit.map.Map;
import com.yandex.mapkit.search.BusinessObjectMetadata;
import com.yandex.mapkit.uri.Uri;
import com.yandex.mapkit.uri.UriObjectMetadata;
import defpackage.bwa1;
import defpackage.eg80;
import defpackage.evu0;
import defpackage.gg80;
import defpackage.jcb1;
import defpackage.jl40;
import defpackage.l9e;
import defpackage.lg80;
import defpackage.m950;
import defpackage.n1j0;
import defpackage.oj00;
import defpackage.qi80;
import defpackage.qj00;
import defpackage.ri80;
import defpackage.si80;
import defpackage.tfx;
import defpackage.ti80;
import defpackage.tje;
import defpackage.uj00;
import defpackage.vpr;
import defpackage.zy11;
import defpackage.zzs;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;

/* loaded from: classes12.dex */
public final class b implements vpr {
    public final /* synthetic */ uj00 a;

    public b(uj00 uj00Var) {
        this.a = uj00Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0079, code lost:
    
        if (r4 != null) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0164  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ti80 ti80Var;
        ti80 qi80Var;
        zzs b;
        GeoObjectSelectionMetadata geoObjectSelectionMetadata;
        uj00 uj00Var;
        Pair pair;
        List<Uri> uris;
        Uri uri;
        String str;
        List<String> tags;
        Object obj2;
        GeoObject geoObject = (GeoObject) obj;
        uj00 uj00Var2 = this.a;
        Map map = uj00Var2.U;
        uj00Var2.Q.l(null);
        GeoObjectSelectionMetadata geoObjectSelectionMetadata2 = (GeoObjectSelectionMetadata) geoObject.getMetadataContainer().getItem(GeoObjectSelectionMetadata.class);
        GeoObjectTags geoObjectTags = (GeoObjectTags) geoObject.getMetadataContainer().getItem(GeoObjectTags.class);
        List<String> tags2 = geoObjectTags != null ? geoObjectTags.getTags() : null;
        if (jl40.l(geoObjectSelectionMetadata2 != null ? geoObjectSelectionMetadata2.getDataSourceName() : null, "carparks")) {
            GeoObjectTags geoObjectTags2 = (GeoObjectTags) geoObject.getMetadataContainer().getItem(GeoObjectTags.class);
            if (geoObjectTags2 == null || (tags = geoObjectTags2.getTags()) == null) {
                str = null;
            } else {
                Iterator<T> it = tags.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    String str2 = (String) obj2;
                    if (jl40.l(str2, "toll") || jl40.l(str2, "free")) {
                        break;
                    }
                }
                str = (String) obj2;
            }
        }
        if ((tags2 == null || !tags2.contains("parking")) && (tags2 == null || !tags2.contains("parking_zone"))) {
            UriObjectMetadata uriObjectMetadata = (UriObjectMetadata) geoObject.getMetadataContainer().getItem(UriObjectMetadata.class);
            String value = (uriObjectMetadata == null || (uris = uriObjectMetadata.getUris()) == null || (uri = (Uri) kotlin.collections.a.R(uris)) == null) ? null : uri.getValue();
            BusinessObjectMetadata b2 = jcb1.b(geoObject);
            String oid = b2 != null ? b2.getOid() : null;
            if (value != null && l9e.f(value) && oid != null && !evu0.J(oid)) {
                qi80Var = new si80(value, oid, null);
            } else if (value != null && l9e.f(value)) {
                qi80Var = new ri80(value, null);
            } else {
                if (oid == null || evu0.J(oid)) {
                    ti80Var = null;
                    if (ti80Var != null && (b = bwa1.b(geoObject)) != null) {
                        geoObjectSelectionMetadata = (GeoObjectSelectionMetadata) geoObject.getMetadataContainer().getItem(GeoObjectSelectionMetadata.class);
                        if (geoObjectSelectionMetadata != null && map != null) {
                            map.selectGeoObject(geoObjectSelectionMetadata);
                        }
                        if (uj00Var2.T.a()) {
                            uj00Var = uj00Var2;
                            pair = new Pair(eg80.b, new MapInteractionsRouter$handleOrganization$1(0, uj00Var, uj00.class, "refreshFavoriteOrganizations", "refreshFavoriteOrganizations()V", 0));
                        } else {
                            pair = new Pair(gg80.b, null);
                            uj00Var = uj00Var2;
                        }
                        tje.N(uj00Var.o(), null, null, new MapInteractionsRouter$handleOrganization$2(geoObject, uj00Var, b, ti80Var, (lg80) pair.getFirst(), (tfx) pair.getSecond(), null), 3);
                    }
                    return zy11.a;
                }
                qi80Var = new qi80(oid, null);
            }
            ti80Var = qi80Var;
            if (ti80Var != null) {
                geoObjectSelectionMetadata = (GeoObjectSelectionMetadata) geoObject.getMetadataContainer().getItem(GeoObjectSelectionMetadata.class);
                if (geoObjectSelectionMetadata != null) {
                    map.selectGeoObject(geoObjectSelectionMetadata);
                }
                if (uj00Var2.T.a()) {
                }
                tje.N(uj00Var.o(), null, null, new MapInteractionsRouter$handleOrganization$2(geoObject, uj00Var, b, ti80Var, (lg80) pair.getFirst(), (tfx) pair.getSecond(), null), 3);
            }
            return zy11.a;
        }
        ((oj00) uj00Var2.n()).a.invoke();
        ((com.yandex.go.navigator.map_interactions.parkings.analytics.a) uj00Var2.K.get()).g(geoObject);
        GeoObjectSelectionMetadata geoObjectSelectionMetadata3 = (GeoObjectSelectionMetadata) geoObject.getMetadataContainer().getItem(GeoObjectSelectionMetadata.class);
        if (geoObjectSelectionMetadata3 != null && map != null) {
            map.selectGeoObject(geoObjectSelectionMetadata3);
        }
        uj00Var2.B((m950) uj00Var2.J.get(), geoObject, new qj00(uj00Var2, null), new n1j0(uj00Var2));
        return zy11.a;
    }
}
