package defpackage;

import android.graphics.Shader;
import android.os.Build;
import com.yandex.mapkit.GeoObject;
import com.yandex.mapkit.geometry.Geometry;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.GeoObjectSelectionMetadata;
import com.yandex.mapkit.search.BusinessObjectMetadata;
import kotlin.collections.a;

/* loaded from: classes12.dex */
public abstract class bwa1 {
    public static final vll0 a(boolean z) {
        return z ? new zf11() : new dd60();
    }

    public static final zzs b(GeoObject geoObject) {
        Point e = e(geoObject);
        if (e != null) {
            return new zzs(e.getLatitude(), e.getLongitude(), 0, null, null, 28);
        }
        return null;
    }

    public static final String c(GeoObject geoObject) {
        String objectId;
        GeoObjectSelectionMetadata geoObjectSelectionMetadata = (GeoObjectSelectionMetadata) geoObject.getMetadataContainer().getItem(GeoObjectSelectionMetadata.class);
        return (geoObjectSelectionMetadata == null || (objectId = geoObjectSelectionMetadata.getObjectId()) == null) ? "" : objectId;
    }

    public static final String d(GeoObject geoObject) {
        BusinessObjectMetadata b = jcb1.b(geoObject);
        if (b != null) {
            return b.getOid();
        }
        return null;
    }

    public static final Point e(GeoObject geoObject) {
        Geometry geometry = (Geometry) a.R(geoObject.getGeometry());
        if (geometry != null) {
            return geometry.getPoint();
        }
        return null;
    }

    public static final Shader.TileMode f(int i) {
        Shader.TileMode tileMode;
        if (i == 0) {
            return Shader.TileMode.CLAMP;
        }
        if (i == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i == 2) {
            return Shader.TileMode.MIRROR;
        }
        if (i == 3 && Build.VERSION.SDK_INT >= 31) {
            tileMode = Shader.TileMode.DECAL;
            return tileMode;
        }
        return Shader.TileMode.CLAMP;
    }

    public static byte[] g(byte[]... bArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= bArr.length) {
                break;
            }
            i2 += bArr[i].length;
            i++;
        }
        byte[] bArr2 = new byte[i2];
        int i3 = 0;
        for (byte[] bArr3 : bArr) {
            int length = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i3, length);
            i3 += length;
        }
        return bArr2;
    }
}
