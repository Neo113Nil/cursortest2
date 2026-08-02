package defpackage;

import com.yandex.mapkit.GeoObject;
import com.yandex.mapkit.geometry.Geometry;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.layers.GeoObjectTapEvent;
import com.yandex.mapkit.uri.Uri;
import com.yandex.mapkit.uri.UriObjectMetadata;
import java.util.List;
import java.util.Optional;
import kotlin.collections.a;

/* loaded from: classes.dex */
public final class il00 implements qv00 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [hl00] */
    public static Optional b(GeoObjectTapEvent geoObjectTapEvent) {
        Optional of;
        List<Geometry> geometry;
        Geometry geometry2;
        List<Uri> uris;
        UriObjectMetadata uriObjectMetadata = (UriObjectMetadata) geoObjectTapEvent.getGeoObject().getMetadataContainer().getItem(UriObjectMetadata.class);
        Point point = null;
        Uri uri = (uriObjectMetadata == null || (uris = uriObjectMetadata.getUris()) == null) ? null : (Uri) a.R(uris);
        if (uri != null) {
            GeoObject geoObject = geoObjectTapEvent.getGeoObject();
            if (geoObject != null && (geometry = geoObject.getGeometry()) != null && (geometry2 = (Geometry) a.R(geometry)) != null) {
                point = geometry2.getPoint();
            }
            android.net.Uri parse = android.net.Uri.parse(uri.getValue());
            String queryParameter = parse.getQueryParameter("id");
            if ((queryParameter == null || evu0.J(queryParameter)) && (queryParameter = parse.getQueryParameter("oid")) == null) {
                queryParameter = "";
            }
            point = new hl00(queryParameter, parse.getAuthority(), point, geoObjectTapEvent.getGeoObject().getName());
        }
        return (point == null || (of = Optional.of(point)) == null) ? Optional.empty() : of;
    }

    @Override // defpackage.qv00
    public final /* bridge */ /* synthetic */ Optional a(Object obj) {
        return b((GeoObjectTapEvent) obj);
    }
}
