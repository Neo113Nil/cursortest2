package defpackage;

import com.yandex.mapkit.GeoObject;
import com.yandex.mapkit.search.advert_layer.AdvertLayerListener;
import ru.yandextaxi.flutter_yandex_mapkit.ReferenceType;

/* loaded from: classes7.dex */
public final class pd1 implements AdvertLayerListener {
    public final /* synthetic */ omj a;

    public pd1(omj omjVar) {
        this.a = omjVar;
    }

    @Override // com.yandex.mapkit.search.advert_layer.AdvertLayerListener
    public final void onAdvertPinHidden(GeoObject geoObject) {
        omj omjVar = this.a;
        omjVar.c(new od1(omjVar.d.a(ReferenceType.GEO_OBJECT, geoObject), geoObject, 0));
    }

    @Override // com.yandex.mapkit.search.advert_layer.AdvertLayerListener
    public final void onAdvertPinShown(GeoObject geoObject) {
        omj omjVar = this.a;
        omjVar.c(new od1(omjVar.d.a(ReferenceType.GEO_OBJECT, geoObject), geoObject, 2));
    }

    @Override // com.yandex.mapkit.search.advert_layer.AdvertLayerListener
    public final void onAdvertPinTapped(GeoObject geoObject) {
        omj omjVar = this.a;
        omjVar.c(new od1(omjVar.d.a(ReferenceType.GEO_OBJECT, geoObject), geoObject, 1));
    }
}
