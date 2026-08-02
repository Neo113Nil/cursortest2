package com.yandex.go.navigator.gas_stations.overview;

import com.yandex.mapkit.GeoObject;
import com.yandex.mapkit.search.BusinessObjectMetadata;
import defpackage.jcb1;
import defpackage.tls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* synthetic */ class GasStationsOverviewView$snapListener$1 extends FunctionReferenceImpl implements tls {
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
    
        if (defpackage.jl40.l(r0, r2 != null ? r2.getOid() : null) != false) goto L17;
     */
    @Override // defpackage.tls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        com.yandex.go.navigator.gas_stations.repositories.c cVar = ((h) this.receiver).B;
        GeoObject geoObject = (GeoObject) cVar.h.getValue();
        GeoObject geoObject2 = (GeoObject) kotlin.collections.a.S(intValue, (List) cVar.c.getValue());
        if (geoObject2 != null) {
            if (geoObject != null) {
                BusinessObjectMetadata b = jcb1.b(geoObject);
                String oid = b != null ? b.getOid() : null;
                BusinessObjectMetadata b2 = jcb1.b(geoObject2);
            }
            cVar.g.l(geoObject2);
        }
        return zy11.a;
    }
}
